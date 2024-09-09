# PoipoiIdfinancialServiceServiceRequestReversalRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_order** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder.md) |  | [optional] 
**loyalty_data** | **object** | Data linked to card loyalty during payment. | [optional] 
**reversed_amount** | **object** | Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt; | [optional] 
**reversal_reason** | **object** | Reason of the payment or loyalty reversal.&lt;br/&gt;- **CUSC: CustomerCancellation**  : *Customer cancels the transaction.*&lt;br/&gt;- **MALF: Malfuntion**  : *Reversal after a suspection of malfunction of the POI system.*&lt;br/&gt;- **MERC: MerchantCancellation**  : *Merchant or Cashier cancels the transaction.*&lt;br/&gt;- **UNAB: UnableToComplete**  : *POI System unable to complete transaction.*&lt;br/&gt; | 
**reversal_transaction** | [**PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction**](PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

