# PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **Object** | A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;.&lt;br/&gt; |  [optional]
**loyaltyTransactionType** | **Object** | Type of loyalty transaction.&lt;br/&gt;- **AWRD: Award**  : *Direct or payment related award on a loyalty account. Award alone, award associated to a payment (may be with an additional award alone), award because of  a payment resulting on rebates.*&lt;br/&gt;- **AWRR: AwardRefund**  : *Refund of a loyalty award transaction.*&lt;br/&gt;- **REBR: RebateRefund**  : *Refund of a loyalty rebate transaction.*&lt;br/&gt;- **REBA: Rebate**  : *Rebate on a total amount, sale item amount, or sale items.*&lt;br/&gt;- **REDE: Redemption**  : *Redemption on a loyalty account.*&lt;br/&gt;- **REDR: RedemptionRefund**  : *Refund of a loyalty redemption transaction.*&lt;br/&gt; | 
**originalPOITransaction** | [**PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction**](PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.md) |  |  [optional]
**saleItem** | **Object** | Item purchased with the transaction. |  [optional]
**saleTransactionIdentification** | [**PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification**](PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification.md) |  |  [optional]
**totalAmount** | **Object** | Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt; |  [optional]
