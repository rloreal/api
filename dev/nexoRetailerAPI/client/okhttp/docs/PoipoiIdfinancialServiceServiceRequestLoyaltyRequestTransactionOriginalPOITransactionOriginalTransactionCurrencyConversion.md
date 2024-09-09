# PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversionDetails** | **Object** | Information about the conversion of currency. |  [optional]
**result** | **Object** | Result of a requested currency conversion.&lt;br/&gt;- **ODCC: Allowed**  : *Dynamic currency conversion may be offered to the cardholder.*&lt;br/&gt;- **DCCA: Assumed**  : *Transaction authorised with dynamic currency conversion.*&lt;br/&gt;- **ICRD: InvalidCard**  : *The card is not valid for dynamic currency conversion.*&lt;br/&gt;- **IMER: InvalidMerchant**  : *The card acceptor has not been recognised.*&lt;br/&gt;- **IPRD: InvalidProduct**  : *Dynamic currency conversion service cannot be offered for this card product.*&lt;br/&gt;- **IRAT: NoRate**  : *Exchange rates are not available.*&lt;br/&gt;- **NDCC: NotAvailable**  : *Dynamic currency conversion is not available for other reason.*&lt;br/&gt;- **REST: Restriction**  : *Conversion accepted for the requested amount exclusively.*&lt;br/&gt;- **CATG: Catalogue**  : *Conversion accepted for a range of amounts.*&lt;br/&gt; | 
**resultReason** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
