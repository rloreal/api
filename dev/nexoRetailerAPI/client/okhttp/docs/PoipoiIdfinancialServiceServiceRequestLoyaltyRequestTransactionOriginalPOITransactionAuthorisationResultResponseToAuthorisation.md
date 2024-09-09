# PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalResponseInformation** | **Object** | Specifies a character string with a maximum length of 140 characters.&lt;br/&gt; |  [optional]
**response** | **Object** | Result of the performed service.&lt;br/&gt;- **APPR: Approved**  : *Service has been successfuly provided.*&lt;br/&gt;- **DECL: Declined**  : *Service is declined.*&lt;br/&gt;- **PART: PartialApproved**  : *Service has been partialy provided.*&lt;br/&gt;- **SUSP: Suspended**  : *Transaction has been received but hasn&#x27;t been processed.*&lt;br/&gt;- **TECH: TechnicalError**  : *Service cannot be provided for technical reason (eg timeout contacting the Issuer, security problem).*&lt;br/&gt; | 
**responseReason** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
