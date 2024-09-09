# PoipoiIdfinancialServiceServiceRequestContextSaleContext

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_sale_data** | **object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; | [optional] 
**allowed_entry_mode** | **object** | Type of card data reading. | [optional] 
**cashier_identification** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 
**cashier_language** | **object** | Languages used by the cashier. | [optional] 
**customer_order_request_flag** | **object** | A flag indicating a True or False value.&lt;br/&gt; | [optional] 
**delivery_note_number** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 
**force_online_flag** | **object** | A flag indicating a True or False value.&lt;br/&gt; | [optional] 
**invoice_number** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 
**purchase_order_number** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 
**reuse_card_data_flag** | **object** | A flag indicating a True or False value.&lt;br/&gt; | [optional] 
**remaining_amount** | **object** | Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt; | [optional] 
**sale_identification** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 
**sale_reconciliation_identification** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 
**sale_reference_number** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 
**sale_token_scope** | **object** | Scope of the token that identifies the payment mean of the customer.&lt;br/&gt;- **MULT: MultipleUse**  : *The token is generated to recognise a customer for a longer period.*&lt;br/&gt;- **SNGL: SingleUse**  : *The token is generated to recognise  a customer during the lifetime of a transaction.*&lt;br/&gt; | [optional] 
**shift_number** | **object** | Specifies a numeric string with a maximum length of 2 digits.&lt;br/&gt; | [optional] 
**split_payment** | **object** | A flag indicating a True or False value.&lt;br/&gt; | [optional] 
**sponsored_merchant** | **object** | Merchant using the payment services of a payment facilitator, acting as a card acceptor. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

