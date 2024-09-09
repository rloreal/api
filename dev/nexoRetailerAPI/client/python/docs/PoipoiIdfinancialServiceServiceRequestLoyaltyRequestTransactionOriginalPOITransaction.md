# PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_service** | **object** | Service in addition to the main service. | [optional] 
**additional_transaction_data** | **object** | Additional information related to the transaction. | [optional] 
**authorisation_result** | [**PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult**](PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult.md) |  | [optional] 
**card_programme_applied** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 
**card_programme_proposed** | **object** | Specifies the card program proposed by a retailer to a cardholder among a series of payment programmes offered by the retailer. | [optional] 
**customer_consent** | **object** | A flag indicating a True or False value.&lt;br/&gt; | [optional] 
**customer_order** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder.md) |  | [optional] 
**customer_token** | [**PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken**](PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken.md) |  | [optional] 
**issuer_cit_identification** | **object** | Specifies a character string with a maximum length of 140 characters.&lt;br/&gt; | [optional] 
**issuer_reference_data** | **object** | Specifies a character string with a maximum length of 140 characters.&lt;br/&gt; | [optional] 
**last_transaction_flag** | **object** | A flag indicating a True or False value.&lt;br/&gt; | [optional] 
**merchant_cit_identification** | **object** | Specifies a character string with a maximum length of 140 characters.&lt;br/&gt; | [optional] 
**merchant_category_code** | **object** | Specifies a character string with a minimum length of 3 characters, and a maximum length of 4 characters.&lt;br/&gt; | [optional] 
**merchant_reference_data** | **object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; | [optional] 
**original_transaction** | [**PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction**](PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction.md) |  | [optional] 
**reconciliation_identification** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 
**sale_reference_identification** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 
**sale_to_acquirer_data** | **object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; | [optional] 
**sale_to_issuer_data** | **object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; | [optional] 
**sale_to_poi_data** | **object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; | [optional] 
**service_attribute** | **object** | Additional attributes of the service provided by the card payment transaction.&lt;br/&gt;- **IRES: InitialReservation**  : *Initial reservation.*&lt;br/&gt;- **URES: UpdateReservation**  : *Update reservation.*&lt;br/&gt;- **PRES: PaymentReservation**  : *Payment after reservation.*&lt;br/&gt;- **ARES: AdditionalPayment**  : *Additional payment after reservation.*&lt;br/&gt;- **FREC: FirstRecurring**  : *Initial recurring payment.*&lt;br/&gt;- **RREC: FollowingRecurring**  : *Repeat recurring payment.*&lt;br/&gt;- **GOPT: GuaranteeOfPayment**  : *Acceptor claims for guarantee of payment.*&lt;br/&gt; | [optional] 
**transaction_capture** | **object** | A flag indicating a True or False value.&lt;br/&gt; | [optional] 
**transaction_details** | [**PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails**](PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.md) |  | 
**transaction_identification** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification.md) |  | 
**transaction_type** | **object** | Main service provided during the card payment transaction.&lt;br/&gt;- **BALC: Balance**  : *Balance enquiry.*&lt;br/&gt;- **CACT: CardActivation**  : *Card activation.*&lt;br/&gt;- **CRDP: CardPayment**  : *Card payment.*&lt;br/&gt;- **CAFH: CardsFundTransferPush**  : *Transfer of funds to a card or an account.*&lt;br/&gt;- **CAVR: CardVerification**  : *Card verification.*&lt;br/&gt;- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*&lt;br/&gt;- **CSHD: CashDeposit**  : *Cash deposit.*&lt;br/&gt;- **DEFR: DeferredPayment**  : *Deferred payment.*&lt;br/&gt;- **LOAD: Loading**  : *Loading or reloading non-financial account.*&lt;br/&gt;- **ORCR: OriginalCredit**  : *Original credit.*&lt;br/&gt;- **PINC: PINChange**  : *PIN (Personal Identification Number) change.*&lt;br/&gt;- **QUCH: QuasiCash**  : *Quasi-cash.*&lt;br/&gt;- **RFND: Refund**  : *Refund transaction.*&lt;br/&gt;- **RESA: Reservation**  : *Reservation (pre-authorisation).*&lt;br/&gt;- **VALC: ValidityCheck**  : *Card validity check.*&lt;br/&gt;- **UNLD: Unloading**  : *Unloading non-financial account.*&lt;br/&gt;- **CAFT: CardsFundTransfer**  : *Transfer of funds to and/or from a card account.*&lt;br/&gt;- **CAFL: CardsFundTransferPull**  : *Transfer of funds from a card or an account.*&lt;br/&gt; | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

