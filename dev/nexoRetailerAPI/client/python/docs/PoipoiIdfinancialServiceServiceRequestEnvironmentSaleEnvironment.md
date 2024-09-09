# PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **object** | A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;.&lt;br/&gt; | [optional] 
**debit_preferred_flag** | **object** | A flag indicating a True or False value.&lt;br/&gt; | [optional] 
**loyalty_handling** | **object** | Possible types of Loyalty processing.&lt;br/&gt;- **ALLO: Allowed**  : *The loyalty is accepted, but the POI has not to require or ask a loyalty card. The loyalty is involved by the payment card (e.g. an hybrid or linked card). *&lt;br/&gt;- **DENY: Forbidden**  : *No loyalty card to read and loyalty transaction to process.  Any attempt to enter a pure loyalty card is rejected.*&lt;br/&gt;- **PRCS: Processed**  : *The loyalty transaction is already processed, no loyalty card or loyalty transaction to process.*&lt;br/&gt;- **PROP: Proposed**  : *The loyalty is accepted, and the POI has to ask a loyalty card. If the Customer does not enter a loyalty card, no loyalty transaction is realised.*&lt;br/&gt;- **REQU: Required**  : *The loyalty is required, and the POI refuses the processing  of the message request if the cardholder does not enter a loyalty card.*&lt;br/&gt; | [optional] 
**maximum_cash_back_amount** | **object** | Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt; | [optional] 
**minimum_amount_to_deliver** | **object** | Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt; | [optional] 
**minimum_split_amount** | **object** | Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt; | [optional] 
**sale_capabilities** | **object** | Capabilities of the Sale system. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

