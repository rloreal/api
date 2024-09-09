# PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalCardData** | **Object** | Additional card issuer specific data. |  [optional]
**entryMode** | **Object** | Type of reading of the card data.&lt;br/&gt;- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*&lt;br/&gt;- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*&lt;br/&gt;- **BRCD: BarCode**  : *Bar code.*&lt;br/&gt;- **MGST: MagneticStripe**  : *Magnetic stripe.*&lt;br/&gt;- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*&lt;br/&gt;- **DFLE: AccountData**  : *Account data on file.*&lt;br/&gt;- **CTLS: ProximityReader**  : *Contactless proximity reader.*&lt;br/&gt;- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*&lt;br/&gt;- **CDFL: CardOnFile**  : *Card information are stored on a file.*&lt;br/&gt; |  [optional]
**PAN** | **Object** | Specifies a numeric string with a minimum length of 8 digits, and a maximum length of 28 digits.&lt;br/&gt; |  [optional]
**track1** | **Object** | Specifies a character string with a maximum length of 76 characters.&lt;br/&gt; |  [optional]
**track2** | **Object** | Specifies a character string with a maximum length of 37 characters.&lt;br/&gt; |  [optional]
**track3** | **Object** | Specifies a character string with a maximum length of 104 characters.&lt;br/&gt; |  [optional]
