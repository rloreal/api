# PoipoiIdfinancialServiceServiceRequestContextSaleContext

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalSaleData** | **Object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; |  [optional]
**allowedEntryMode** | **Object** | Type of card data reading. |  [optional]
**cashierIdentification** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
**cashierLanguage** | **Object** | Languages used by the cashier. |  [optional]
**customerOrderRequestFlag** | **Object** | A flag indicating a True or False value.&lt;br/&gt; |  [optional]
**deliveryNoteNumber** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
**forceOnlineFlag** | **Object** | A flag indicating a True or False value.&lt;br/&gt; |  [optional]
**invoiceNumber** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
**purchaseOrderNumber** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
**reuseCardDataFlag** | **Object** | A flag indicating a True or False value.&lt;br/&gt; |  [optional]
**remainingAmount** | **Object** | Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt; |  [optional]
**saleIdentification** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
**saleReconciliationIdentification** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
**saleReferenceNumber** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
**saleTokenScope** | **Object** | Scope of the token that identifies the payment mean of the customer.&lt;br/&gt;- **MULT: MultipleUse**  : *The token is generated to recognise a customer for a longer period.*&lt;br/&gt;- **SNGL: SingleUse**  : *The token is generated to recognise  a customer during the lifetime of a transaction.*&lt;br/&gt; |  [optional]
**shiftNumber** | **Object** | Specifies a numeric string with a maximum length of 2 digits.&lt;br/&gt; |  [optional]
**splitPayment** | **Object** | A flag indicating a True or False value.&lt;br/&gt; |  [optional]
**sponsoredMerchant** | **Object** | Merchant using the payment services of a payment facilitator, acting as a card acceptor. |  [optional]
