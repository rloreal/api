# PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedLoyaltyBrand** | **Object** | Loyalty brands or programs allowed by the Sale System for the loyalty transaction. |  [optional]
**allowedPaymentBrand** | **Object** | Card payment brands allowed by the Sale System for the payment transaction. |  [optional]
**cashBackFlag** | **Object** | A flag indicating a True or False value.&lt;br/&gt; |  [optional]
**forceCustomerSelectionFlag** | **Object** | A flag indicating a True or False value.&lt;br/&gt; |  [optional]
**paymentType** | **Object** | Additional attribute of the service type.&lt;br/&gt;- **CRDP: CardPayment**  : *Card payment.*&lt;br/&gt;- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*&lt;br/&gt;- **CSHD: CashDeposit**  : *Cash deposit.*&lt;br/&gt;- **IRES: InitialReservation**  : *Initial reservation.*&lt;br/&gt;- **DEFR: DeferredPayment**  : *Deferred payment.*&lt;br/&gt;- **URES: UpdateReservation**  : *Update reservation.*&lt;br/&gt;- **PRES: PaymentReservation**  : *Payment after reservation.*&lt;br/&gt;- **RECP: RecurringPayment**  : *Recurring payment.*&lt;br/&gt;- **INSP: Instalment**  : *Instalment payment.*&lt;br/&gt;- **INSI: IssuerInstalment**  : *Instalment payment transaction performed by the card issuer.*&lt;br/&gt;- **RFND: Refund**  : *Refund transaction.*&lt;br/&gt;- **VCAU: VoiceAuthorisation**  : *Voice authorisation.*&lt;br/&gt; |  [optional]
**saleToAcquirerData** | **Object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; |  [optional]
**saleToIssuerData** | **Object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; |  [optional]
**saleToPOIData** | **Object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; |  [optional]
**saleTransactionIdentification** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification.md) |  |  [optional]
**totalAmount** | **Object** | Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt; |  [optional]
