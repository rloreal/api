# PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **object** | A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;.&lt;br/&gt; | [optional] 
**loyalty_transaction_type** | **object** | Type of loyalty transaction.&lt;br/&gt;- **AWRD: Award**  : *Direct or payment related award on a loyalty account. Award alone, award associated to a payment (may be with an additional award alone), award because of  a payment resulting on rebates.*&lt;br/&gt;- **AWRR: AwardRefund**  : *Refund of a loyalty award transaction.*&lt;br/&gt;- **REBR: RebateRefund**  : *Refund of a loyalty rebate transaction.*&lt;br/&gt;- **REBA: Rebate**  : *Rebate on a total amount, sale item amount, or sale items.*&lt;br/&gt;- **REDE: Redemption**  : *Redemption on a loyalty account.*&lt;br/&gt;- **REDR: RedemptionRefund**  : *Refund of a loyalty redemption transaction.*&lt;br/&gt; | 
**original_poi_transaction** | [**PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction**](PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.md) |  | [optional] 
**sale_item** | **object** | Item purchased with the transaction. | [optional] 
**sale_transaction_identification** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification.md) |  | [optional] 
**total_amount** | **object** | Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

