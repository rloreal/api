# PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalService** | **Object** | Service in addition to the main service. |  [optional]
**additionalTransactionData** | **Object** | Additional information related to the transaction. |  [optional]
**authorisationResult** | [**PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult**](PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult.md) |  |  [optional]
**cardProgrammeApplied** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
**cardProgrammeProposed** | **Object** | Specifies the card program proposed by a retailer to a cardholder among a series of payment programmes offered by the retailer. |  [optional]
**customerConsent** | **Object** | A flag indicating a True or False value.&lt;br/&gt; |  [optional]
**customerOrder** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder.md) |  |  [optional]
**customerToken** | [**PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken**](PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.md) |  |  [optional]
**issuerCITIdentification** | **Object** | Specifies a character string with a maximum length of 140 characters.&lt;br/&gt; |  [optional]
**issuerReferenceData** | **Object** | Specifies a character string with a maximum length of 140 characters.&lt;br/&gt; |  [optional]
**lastTransactionFlag** | **Object** | A flag indicating a True or False value.&lt;br/&gt; |  [optional]
**merchantCITIdentification** | **Object** | Specifies a character string with a maximum length of 140 characters.&lt;br/&gt; |  [optional]
**merchantCategoryCode** | **Object** | Specifies a character string with a minimum length of 3 characters, and a maximum length of 4 characters.&lt;br/&gt; |  [optional]
**merchantReferenceData** | **Object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; |  [optional]
**originalTransaction** | [**PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction**](PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction.md) |  |  [optional]
**reconciliationIdentification** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
**saleReferenceIdentification** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
**saleToAcquirerData** | **Object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; |  [optional]
**saleToIssuerData** | **Object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; |  [optional]
**saleToPOIData** | **Object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; |  [optional]
**serviceAttribute** | **Object** | Additional attributes of the service provided by the card payment transaction.&lt;br/&gt;- **IRES: InitialReservation**  : *Initial reservation.*&lt;br/&gt;- **URES: UpdateReservation**  : *Update reservation.*&lt;br/&gt;- **PRES: PaymentReservation**  : *Payment after reservation.*&lt;br/&gt;- **ARES: AdditionalPayment**  : *Additional payment after reservation.*&lt;br/&gt;- **FREC: FirstRecurring**  : *Initial recurring payment.*&lt;br/&gt;- **RREC: FollowingRecurring**  : *Repeat recurring payment.*&lt;br/&gt;- **GOPT: GuaranteeOfPayment**  : *Acceptor claims for guarantee of payment.*&lt;br/&gt; |  [optional]
**transactionCapture** | **Object** | A flag indicating a True or False value.&lt;br/&gt; |  [optional]
**transactionDetails** | [**PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails**](PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.md) |  | 
**transactionIdentification** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification.md) |  | 
**transactionType** | **Object** | Main service provided during the card payment transaction.&lt;br/&gt;- **BALC: Balance**  : *Balance enquiry.*&lt;br/&gt;- **CACT: CardActivation**  : *Card activation.*&lt;br/&gt;- **CRDP: CardPayment**  : *Card payment.*&lt;br/&gt;- **CAFH: CardsFundTransferPush**  : *Transfer of funds to a card or an account.*&lt;br/&gt;- **CAVR: CardVerification**  : *Card verification.*&lt;br/&gt;- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*&lt;br/&gt;- **CSHD: CashDeposit**  : *Cash deposit.*&lt;br/&gt;- **DEFR: DeferredPayment**  : *Deferred payment.*&lt;br/&gt;- **LOAD: Loading**  : *Loading or reloading non-financial account.*&lt;br/&gt;- **ORCR: OriginalCredit**  : *Original credit.*&lt;br/&gt;- **PINC: PINChange**  : *PIN (Personal Identification Number) change.*&lt;br/&gt;- **QUCH: QuasiCash**  : *Quasi-cash.*&lt;br/&gt;- **RFND: Refund**  : *Refund transaction.*&lt;br/&gt;- **RESA: Reservation**  : *Reservation (pre-authorisation).*&lt;br/&gt;- **VALC: ValidityCheck**  : *Card validity check.*&lt;br/&gt;- **UNLD: Unloading**  : *Unloading non-financial account.*&lt;br/&gt;- **CAFT: CardsFundTransfer**  : *Transfer of funds to and/or from a card account.*&lt;br/&gt;- **CAFL: CardsFundTransferPull**  : *Transfer of funds from a card or an account.*&lt;br/&gt; | 
