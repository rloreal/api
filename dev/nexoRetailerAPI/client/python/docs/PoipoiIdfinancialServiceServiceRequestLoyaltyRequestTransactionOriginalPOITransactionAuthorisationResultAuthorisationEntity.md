# PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **object** | Specifies an alpha string with a minimum length of 2 characters and a maximum length of 3 characters.&lt;br/&gt; | [optional] 
**identification** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 
**issuer** | **object** | Entity assigning an identification (for example merchant, acceptor, acquirer, tax authority, etc.).&lt;br/&gt;- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*&lt;br/&gt;- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*&lt;br/&gt;- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*&lt;br/&gt;- **ACQR: Acquirer**  : *Entity acquiring card transactions.*&lt;br/&gt;- **CISS: CardIssuer**  : *Party that issues cards.*&lt;br/&gt;- **TAXH: TaxAuthority**  : *Tax authority.*&lt;br/&gt; | [optional] 
**short_name** | **object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; | [optional] 
**type** | **object** | Identification of the type of entity involved in a transaction.&lt;br/&gt;- **OPOI: OriginatingPOI**  : *Point Of Interaction initiating the card payment transaction.*&lt;br/&gt;- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*&lt;br/&gt;- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*&lt;br/&gt;- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*&lt;br/&gt;- **ACQR: Acquirer**  : *Entity acquiring card transactions.*&lt;br/&gt;- **CISS: CardIssuer**  : *Party that issues cards.*&lt;br/&gt;- **DLIS: DelegateIssuer**  : *Party to whom the card issuer delegates to authorise card payment transactions.*&lt;br/&gt;- **ICCA: CardApplication**  : *Application in the smart card.*&lt;br/&gt; | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

