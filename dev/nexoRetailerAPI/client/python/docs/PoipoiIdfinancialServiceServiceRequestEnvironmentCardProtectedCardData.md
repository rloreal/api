# PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | **object** | Identification of the type of a Cryptographic Message Syntax (CMS) data structure.&lt;br/&gt;- **DATA: PlainData**  : *Generic, non cryptographic, or unqualified data content - (ASN.1 Object Identifier: id-data).*&lt;br/&gt;- **SIGN: SignedData**  : *Digital signature - (ASN.1 Object Identifier: id-signedData).*&lt;br/&gt;- **EVLP: EnvelopedData**  : *Encrypted data, with encryption key - (ASN.1 Object Identifier: id-envelopedData).*&lt;br/&gt;- **DGST: DigestedData**  : *Message digest - (ASN.1 Object Identifier: id-digestedData).*&lt;br/&gt;- **AUTH: AuthenticatedData**  : *MAC (Message Authentication Code), with encryption key - (ASN.1 Object Identifier: id-ct-authData).*&lt;br/&gt; | 
**enveloped_data** | [**PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData**](PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

