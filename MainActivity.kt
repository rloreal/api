import android.app.Activity
import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    private var transactionIdReceiver: BroadcastReceiver? = null
    private var transactionStatusReceiver: BroadcastReceiver? = null
    private var sdkTransactionId: String? = null
    private val handler = Handler(Looper.getMainLooper())

    private val transactionResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        handleTransactionResult(result)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(color = MaterialTheme.colors.background) {
                    POSApp(::performPayment)
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        registerForBroadcast()
    }

    override fun onStop() {
        super.onStop()
        unregisterTransactionIdReceiver()
    }

    private fun checkPOSStatus(onSuccess: () -> Unit) {
        // Implement POS status check logic here
        // For this example, we'll assume it's always successful
        onSuccess()
    }

    private fun performPayment(amount: Long, reference: String) {
        checkPOSStatus {
            val intent = Intent().apply {
                setClassName("com.dejamobile.cbp.sps.app", "com.dejamobile.cbp.sps.app.POSActivity")
                putExtra("merchantId", "YOUR_MERCHANT_ID")
                putExtra("cashierId", "YOUR_CASHIER_ID")
                putExtra("saleTransactionID", reference)
                putExtra("userToken", "YOUR_USER_TOKEN")
                putExtra("amount", amount)
                putExtra("currency", "EUR")
                putExtra("transactionType", "PURCHASE")
                putExtra("paymentMode", "Card")
                putExtra("externalTransactionReference", reference)
                putExtra("locale", "fr_FR")
            }
            transactionResult.launch(intent)
        }
    }

    private fun registerForBroadcast() {
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(ctx: Context?, intent: Intent?) {
                sdkTransactionId = intent?.getStringExtra("sdkTransactionId")
            }
        }
        ContextCompat.registerReceiver(
            this,
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
            Activity.RESULT_OK -> {
                if (data != null) {
                    handleSuccessfulTransaction(data)
                } else {
                    handleMissingResponse()
                }
            }
            Activity.RESULT_CANCELED -> handleCanceledTransaction(data)
            else -> handleUnknownResult()
        }
    }

    private fun handleSuccessfulTransaction(data: Intent) {
        val status = data.getStringExtra("status") ?: "None"
        val receipt = data.getStringExtra("formatedString")
        when {
            status == "APPROVED" && receipt != null -> showTransactionReceipt(status, receipt)
            status == "DECLINED" && receipt != null -> showTransactionReceipt(status, receipt)
            receipt == null -> handleNullReceipt()
            else -> handleUnknownStatus(status)
        }
    }

    private fun handleCanceledTransaction(data: Intent?) {
        if (data != null && data.extras != null) {
            val errorCode = data.getStringExtra("errorCode") ?: "None"
            val errorName = data.getStringExtra("errorName") ?: "None"
            val errorMessage = data.getStringExtra("errorMessage") ?: "None"
            showTransactionReceipt("CANCELED", "Abnormal Cancel: $errorName ($errorCode) - $errorMessage")
        } else {
            showTransactionReceipt("CANCELED", "Transaction was canceled")
        }
    }

    private fun handleMissingResponse() {
        handler.postDelayed({
            checkTransactionStatus()
        }, 10000) // Wait 10 seconds before checking transaction status
    }

    private fun checkTransactionStatus() {
        val intent = Intent().apply {
            action = "com.dejamobile.cbp.sps.TRANSACTION_STATUS_BROADCAST"
            component = ComponentName(
                "com.dejamobile.cbp.sps.app",
                "com.dejamobile.cbp.sps.app.broadcast.TransactionStatusBroadcastReceiver"
            )
            addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
            putExtra("userId", "YOUR_USER_ID")
            putExtra("userToken", "YOUR_USER_TOKEN")
            putExtra("TransactionId", sdkTransactionId)
            putExtra("ResponseAction", "com.smarteo.TRANSACTION_STATUS_RESPONSE")
        }
        sendBroadcast(intent)
        registerTransactionStatusReceiver()
        handler.postDelayed({
            handleTransactionStatusTimeout()
        }, 20000) // Additional 20 seconds timeout (30 seconds total)
    }

    private fun registerTransactionStatusReceiver() {
        val filter = IntentFilter("com.smarteo.TRANSACTION_STATUS_RESPONSE")
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                handler.removeCallbacksAndMessages(null) // Remove timeout handler
                handleTransactionStatusResponse(intent)
            }
        }
        ContextCompat.registerReceiver(
            this,
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
            receipt != null -> showTransactionReceipt("STATUS_CHECK", receipt)
            failure != null -> handleTransactionStatusFailure(failure)
            else -> handleUnknownTransactionStatus()
        }
    }

    private fun handleTransactionStatusTimeout() {
        unregisterTransactionStatusReceiver()
        showTransactionReceipt("TIMEOUT", "Transaction status timeout reached. No response from SoftPOS.")
    }

    private fun handleTransactionStatusFailure(failure: String) {
        if (failure == "SDK_TRANSACTION_UUID_UNKNOWN") {
            showTransactionReceipt("ERROR", "Transaction has NOT been performed")
            // Implement retry logic here
        } else {
            showTransactionReceipt("ERROR", "Error fetching transaction status: $failure")
        }
    }

    private fun unregisterTransactionIdReceiver() {
        transactionIdReceiver?.let {
            unregisterReceiver(it)
            transactionIdReceiver = null
        }
    }

    private fun unregisterTransactionStatusReceiver() {
        transactionStatusReceiver?.let {
            unregisterReceiver(it)
            transactionStatusReceiver = null
        }
    }

    private fun handleNullReceipt() {
        showTransactionReceipt("ERROR", "Transaction receipt is null. This is a blocking error.")
    }

    private fun handleUnknownStatus(status: String) {
        showTransactionReceipt("UNKNOWN", "Unknown transaction status: $status")
    }

    private fun handleUnknownResult() {
        showTransactionReceipt("UNKNOWN", "Unknown result from SoftPOS app")
    }

    private fun handleUnknownTransactionStatus() {
        showTransactionReceipt("UNKNOWN", "Unknown transaction status response")
    }

    private fun showTransactionReceipt(status: String, receipt: String) {
        runOnUiThread {
            setContent {
                MaterialTheme {
                    Surface(color = MaterialTheme.colors.background) {
                        POSApp(::performPayment, status, receipt)
                    }
                }
            }
        }
    }
}

@Composable
fun POSApp(onPaymentRequested: (Long, String) -> Unit, status: String? = null, receipt: String? = null) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "transactionEntry") {
        composable("transactionEntry") {
            TransactionEntryScreen(navController, onPaymentRequested)
        }
        composable("transactionResult") {
            TransactionResultScreen(status ?: "", receipt ?: "")
        }
    }

    LaunchedEffect(status, receipt) {
        if (status != null && receipt != null) {
            navController.navigate("transactionResult")
        }
    }
}

@Composable
fun TransactionEntryScreen(navController: NavController, onPaymentRequested: (Long, String) -> Unit) {
    var amount by remember { mutableStateOf("") }
    var reference by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = amount,
            onValueChange = { amount = it },
            label = { Text("Transaction Amount (in cents)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = reference,
            onValueChange = { reference = it },
            label = { Text("Transaction Reference (Optional)") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = {
                val amountLong = amount.toLongOrNull() ?: 0L
                onPaymentRequested(amountLong, reference)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Process Transaction")
        }
    }
}

@Composable
fun TransactionResultScreen(status: String, receiptData: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = status,
            style = MaterialTheme.typography.h4,
            color = when (status) {
                "APPROVED" -> MaterialTheme.colors.primary
                "DECLINED", "CANCELED", "ERROR", "TIMEOUT" -> MaterialTheme.colors.error
                else -> MaterialTheme.colors.onSurface
            }
        )
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = "Receipt Data:",
            style = MaterialTheme.typography.h6
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = receiptData,
            style = MaterialTheme.typography.body1
        )
    }
}