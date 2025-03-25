class SmarteoPaymentFragment : Fragment() {
    private var transactionIdReceiver: BroadcastReceiver? = null
    private var transactionStatusReceiver: BroadcastReceiver? = null
    private var sdkTransactionId: String? = null
    private val handler = Handler(Looper.getMainLooper())

    private val transactionResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        handleTransactionResult(result)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        checkPOSStatus()
    }

    private fun checkPOSStatus() {
        val intent = Intent("com.dejamobile.cbp.sps.STATUS_BROADCAST")
        intent.component = ComponentName("com.dejamobile.cbp.sps.app", "com.dejamobile.cbp.sps.app.broadcast.StatusBroadcastReceiver")
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
        requireActivity().sendBroadcast(intent)

        val statusReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                val status = intent?.getStringExtra("status")
                when (status) {
                    "initiated" -> {
                        if (intent.getBooleanExtra("ready", false)) {
                            startPayment()
                        } else {
                            showError("POS is not ready")
                            handler.postDelayed({
                                checkTransactionStatus()
                            }, 1000)
                        }
                    }
                    "None", "Failed" -> showError("POS status error: $status")
                    else -> showError("Unknown POS status: $status")
                }
            }
        }
        ContextCompat.registerReceiver(
            requireActivity(),
            statusReceiver,
            IntentFilter("com.dejamobile.cbp.sps.STATUS_BROADCAST_RESPONSE"),
            ContextCompat.RECEIVER_EXPORTED
        )
    }

    private fun startPayment() {
        registerForBroadcast()
        val intent = Intent().apply {
            setClassName("com.dejamobile.cbp.sps.app", "com.dejamobile.cbp.sps.app.POSActivity")
            putExtra("userId", userId)
            putExtra("userToken", token)
            putExtra("merchantId", merchantId)
            putExtra("transactionType", "PURCHASE")
            putExtra("amount", amount)
            putExtra("paymentMode", "Card")
            putExtra("externalTransactionReference", reference)
            putExtra("locale", "fr_FR")
        }
        transactionResult.launch(intent)
    }

    private fun registerForBroadcast() {
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(ctx: Context?, intent: Intent?) {
                sdkTransactionId = intent?.getStringExtra("sdkTransactionId")
            }
        }
        ContextCompat.registerReceiver(
            requireActivity(),
            receiver,
            IntentFilter("com.dejamobile.cbp.sps.app.TRANSACTION_BROADCAST_RESPONSE"),
            ContextCompat.RECEIVER_EXPORTED
        )
        this.transactionIdReceiver = receiver
    }

    private fun handleTransactionResult(result: androidx.activity.result.ActivityResult) {
        unregisterTransactionIdReceiver()
        val data = result.data
        when (result.resultCode) {
            Activity.RESULT_OK -> processResultOk(data)
            Activity.RESULT_CANCELED -> processResultCanceled(data)
            else -> {
                waitAndCheckTransactionStatus()
            }
        }
    }

    private fun processResultOk(data: Intent?) {
        if (data != null) {
            val status = data.getStringExtra("status") ?: "None"
            val receipt = data.getStringExtra("formatedString")
            when {
                receipt == null -> {
                    waitAndCheckTransactionStatus()
                }
                status == "APPROVED" -> showTransactionReceipt(receipt)
                status == "DECLINED" -> showDeclinedTransaction(receipt)
                else -> showError("Unknown transaction status: $status")
            }
        } else {
            waitAndCheckTransactionStatus()
        }
    }

    private fun processResultCanceled(data: Intent?) {
        if (data != null && data.extras != null) {
            val errorCode = data.getStringExtra("errorCode") ?: "None"
            val errorName = data.getStringExtra("errorName") ?: "None"
            val errorMessage = data.getStringExtra("errorMessage") ?: "None"
            showError("Abnormal Cancel: $errorName ($errorCode) - $errorMessage")
            if (errorName == "TNA") {
                printCustomerReceipt()
                traceTNA()
            }
        } else {
            showCancelCause("Normal cancellation")
        }
        retryTransaction()
    }

    private fun waitAndCheckTransactionStatus() {
        handler.postDelayed({
            checkTransactionStatus()
        }, 5000) // Wait 5 seconds before checking transaction status
    }

    private fun checkTransactionStatus() {
        val intent = Intent().apply {
            action = "com.dejamobile.cbp.sps.TRANSACTION_STATUS_BROADCAST"
            component = ComponentName("com.dejamobile.cbp.sps.app", "com.dejamobile.cbp.sps.app.broadcast.TransactionStatusBroadcastReceiver")
            addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
            putExtra("userId", userId)
            putExtra("userToken", userToken)
            putExtra("TransactionId", sdkTransactionId)
            putExtra("ResponseAction", "com.smarteo.TRANSACTION_STATUS_RESPONSE")
        }
        requireActivity().sendBroadcast(intent)
        registerTransactionStatusReceiver()
    }

    private fun registerTransactionStatusReceiver() {
        val filter = IntentFilter("com.smarteo.TRANSACTION_STATUS_RESPONSE")
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                handleTransactionStatusResponse(intent)
            }
        }
        ContextCompat.registerReceiver(
            requireActivity(),
            receiver,
            filter,
            ContextCompat.RECEIVER_EXPORTED
        )
        this.transactionStatusReceiver = receiver
    }

    private fun handleTransactionStatusResponse(intent: Intent?) {
        unregisterTransactionStatusReceiver()
        val receipt = intent?.getStringExtra("Receipt")
        val failure = intent?.getStringExtra("Failure")
        when {
            failure != null -> handleTransactionStatusFailure(failure)
            receipt != null -> processReceipt(receipt)
            else -> {
                waitAndCheckTransactionStatus()
            }
        }
    }

    private fun handleTransactionStatusFailure(failure: String) {
        if (failure == "SDK_TRANSACTION_UUID_UNKNOWN") {
            showError("Transaction has NOT been performed")
            retryTransaction()
        } else {
            showError("Error fetching transaction status: $failure")
            handler.postDelayed({
                checkTransactionStatus() // Second call to check transaction status
            }, 5000)
        }
    }

    private fun processReceipt(receipt: String) {
        val status = extractStatusFromReceipt(receipt)
        when (status) {
            "APPROVED" -> showTransactionReceipt(receipt)
            "DECLINED" -> showDeclinedTransaction(receipt)
            else -> showError("Unknown transaction status: $status")
        }
    }

    private fun unregisterTransactionIdReceiver() {
        transactionIdReceiver?.let {
            requireActivity().unregisterReceiver(it)
            transactionIdReceiver = null
        }
    }

    private fun unregisterTransactionStatusReceiver() {
        transactionStatusReceiver?.let {
            requireActivity().unregisterReceiver(it)
            transactionStatusReceiver = null
        }
    }

    // Helper functions to implement
    private fun showTransactionReceipt(receipt: String) {
        // Implement showing transaction receipt
    }

    private fun showDeclinedTransaction(receipt: String) {
        // Implement handling declined transaction
        // Check if customer has received debit notification and explain situation if needed
    }

    private fun showError(message: String) {
        // Implement error display logic
    }

    private fun showCancelCause(cause: String) {
        // Implement cancel cause display logic
    }

    private fun retryTransaction() {
        startPayment();
    }

    private fun printCustomerReceipt() {
        // Implement customer receipt printing for TNA cases
    }

    private fun traceTNA() {
        // Implement TNA tracing
    }

    private fun extractStatusFromReceipt(receipt: String): String {
        // Implement logic to extract status from receipt
        return "UNKNOWN"
    }
}