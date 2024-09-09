# PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**barcode_type** | **object** | Type of BarCode coding.&lt;br/&gt;- **COQR: BarcodeEncodedAs2DQRCode**  : *Barcode encoded according to the 2Dimensions Quick Response Code Standard.*&lt;br/&gt;- **C128: BarcodeEncodedAsCode128**  : *Barcode encoded according to the Code 128 standard.*&lt;br/&gt;- **C025: BarcodeEncodedAsCode25**  : *Barcode encoded according to the Code 25 standard.*&lt;br/&gt;- **C039: BarcodeEncodedAsCode39**  : *Barcode encoded according to the Code 39 standard.*&lt;br/&gt;- **EA13: BarcodeEncodedAsEA13**  : *Barcode encoded according to the EAN13 standard.*&lt;br/&gt;- **EAN8: BarcodeEncodedAsEAN8**  : *Barcode encoded according to the EAN8 standard.*&lt;br/&gt;- **P417: BarcodeEncodedAsPDF417**  : *Barcode encoded according to the PDF417 standard.*&lt;br/&gt;- **UPCA: BarcodeEncodedAsUPCA**  : *Barcode encoded according to the UPCA standard.*&lt;br/&gt; | 
**barcode_value** | **object** | Specifies a character string with a maximum length of 8000 characters.&lt;br/&gt; | [optional] 
**qr_code_binary_value** | **object** | Specifies a binary string with a maximum length of 3000 binary bytes.&lt;br/&gt; | [optional] 
**qr_code_error_correction** | **object** | Error Correction mode of Quick Response Code.&lt;br/&gt;- **M015: ErrorCorrection15Percent**  : *Reed-Solomon error correction 15%*&lt;br/&gt;- **Q025: ErrorCorrection25Percent**  : *Reed-Solomon error correction 25%*&lt;br/&gt;- **H030: ErrorCorrection30Percent**  : *Reed-Solomon error correction 30%*&lt;br/&gt;- **L007: ErrorCorrection7Percent**  : *Reed-Solomon error correction  7%*&lt;br/&gt; | [optional] 
**qr_code_encoding_mode** | **object** | Encoding Mode of Quick Response Code.&lt;br/&gt;- **ALFA: Alphanumeric**  : *Alphanumeric value provided in Barcode field.*&lt;br/&gt;- **BINA: Binary**  : *Binary value provided in Quick Response Code Binary Value.*&lt;br/&gt;- **KANJ: Kanji**  : *Kanji value provided in Quick Response Code Binary Value.*&lt;br/&gt;- **NUME: Numeric**  : *Numeric value provided in Barcode field.*&lt;br/&gt; | [optional] 
**qr_code_version** | **object** | Specifies a character string with a maximum length of 16 characters.&lt;br/&gt; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

