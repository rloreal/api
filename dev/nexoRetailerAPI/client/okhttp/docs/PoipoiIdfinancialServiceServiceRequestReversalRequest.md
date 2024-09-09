# PoipoiIdfinancialServiceServiceRequestReversalRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerOrder** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder.md) |  |  [optional]
**loyaltyData** | **Object** | Data linked to card loyalty during payment. |  [optional]
**reversedAmount** | **Object** | Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt; |  [optional]
**reversalReason** | **Object** | Reason of the payment or loyalty reversal.&lt;br/&gt;- **CUSC: CustomerCancellation**  : *Customer cancels the transaction.*&lt;br/&gt;- **MALF: Malfuntion**  : *Reversal after a suspection of malfunction of the POI system.*&lt;br/&gt;- **MERC: MerchantCancellation**  : *Merchant or Cashier cancels the transaction.*&lt;br/&gt;- **UNAB: UnableToComplete**  : *POI System unable to complete transaction.*&lt;br/&gt; | 
**reversalTransaction** | [**PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction**](PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.md) |  |  [optional]
