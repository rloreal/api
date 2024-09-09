# PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowed_loyalty_brand** | **object** | Loyalty brands or programs allowed by the Sale System for the loyalty transaction. | [optional] 
**allowed_payment_brand** | **object** | Card payment brands allowed by the Sale System for the payment transaction. | [optional] 
**cash_back_flag** | **object** | A flag indicating a True or False value.&lt;br/&gt; | [optional] 
**force_customer_selection_flag** | **object** | A flag indicating a True or False value.&lt;br/&gt; | [optional] 
**payment_type** | **object** | Additional attribute of the service type.&lt;br/&gt;- **CRDP: CardPayment**  : *Card payment.*&lt;br/&gt;- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*&lt;br/&gt;- **CSHD: CashDeposit**  : *Cash deposit.*&lt;br/&gt;- **IRES: InitialReservation**  : *Initial reservation.*&lt;br/&gt;- **DEFR: DeferredPayment**  : *Deferred payment.*&lt;br/&gt;- **URES: UpdateReservation**  : *Update reservation.*&lt;br/&gt;- **PRES: PaymentReservation**  : *Payment after reservation.*&lt;br/&gt;- **RECP: RecurringPayment**  : *Recurring payment.*&lt;br/&gt;- **INSP: Instalment**  : *Instalment payment.*&lt;br/&gt;- **INSI: IssuerInstalment**  : *Instalment payment transaction performed by the card issuer.*&lt;br/&gt;- **RFND: Refund**  : *Refund transaction.*&lt;br/&gt;- **VCAU: VoiceAuthorisation**  : *Voice authorisation.*&lt;br/&gt; | [optional] 
**sale_to_acquirer_data** | **object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; | [optional] 
**sale_to_issuer_data** | **object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; | [optional] 
**sale_to_poi_data** | **object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; | [optional] 
**sale_transaction_identification** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification.md) |  | [optional] 
**total_amount** | **object** | Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

