# PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_card_data** | **object** | Additional card issuer specific data. | [optional] 
**entry_mode** | **object** | Type of reading of the card data.&lt;br/&gt;- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*&lt;br/&gt;- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*&lt;br/&gt;- **BRCD: BarCode**  : *Bar code.*&lt;br/&gt;- **MGST: MagneticStripe**  : *Magnetic stripe.*&lt;br/&gt;- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*&lt;br/&gt;- **DFLE: AccountData**  : *Account data on file.*&lt;br/&gt;- **CTLS: ProximityReader**  : *Contactless proximity reader.*&lt;br/&gt;- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*&lt;br/&gt;- **CDFL: CardOnFile**  : *Card information are stored on a file.*&lt;br/&gt; | [optional] 
**pan** | **object** | Specifies a numeric string with a minimum length of 8 digits, and a maximum length of 28 digits.&lt;br/&gt; | [optional] 
**track1** | **object** | Specifies a character string with a maximum length of 76 characters.&lt;br/&gt; | [optional] 
**track2** | **object** | Specifies a character string with a maximum length of 37 characters.&lt;br/&gt; | [optional] 
**track3** | **object** | Specifies a character string with a maximum length of 104 characters.&lt;br/&gt; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

