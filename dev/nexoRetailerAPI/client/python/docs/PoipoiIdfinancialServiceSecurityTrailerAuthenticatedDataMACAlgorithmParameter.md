# PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithmParameter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**byte_padding** | **object** | Byte padding for a cypher block chaining mode encryption, if the padding is not implicit.&lt;br/&gt;- **LNGT: LengthPadding**  : *Message to encrypt is completed by a byte value containing the total number of added bytes.*&lt;br/&gt;- **NUL8: Null80Padding**  : *Message to encrypt is completed by one bit of value 1, followed by null bits until the encryption block length is reached.*&lt;br/&gt;- **NULG: NullLengthPadding**  : *Message to encrypt is completed by null byte values, the last byte containing the total number of added bytes.*&lt;br/&gt;- **NULL: NullPadding**  : *Message to encrypt is completed by null bytes.*&lt;br/&gt;- **RAND: RandomPadding**  : *Message to encrypt is completed by random value, the last byte containing the total number of added bytes.*&lt;br/&gt; | [optional] 
**initialisation_vector** | **object** | Specifies a binary string with a maximum length of 500 binary bytes.&lt;br/&gt; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

