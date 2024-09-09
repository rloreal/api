# PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalVehicleData** | **Object** | Additional information related to the vehicle. |  [optional]
**driverOrVehicleCard** | [**PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard**](PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard.md) |  |  [optional]
**hubometer** | **Object** | Number of objects represented as a decimal number, for example 0.75 or 45.6.&lt;br/&gt; |  [optional]
**maintenanceIdentification** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
**odometer** | **Object** | Number of objects represented as a decimal number, for example 0.75 or 45.6.&lt;br/&gt; |  [optional]
**referHours** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
**replacementCar** | **Object** | A flag indicating a True or False value.&lt;br/&gt; |  [optional]
**trailerHours** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
**trailerNumber** | **Object** | Specifies a numeric string with a maximum length of 35 digits.&lt;br/&gt; |  [optional]
**unitNumber** | **Object** | Specifies a numeric string with a maximum length of 35 digits.&lt;br/&gt; |  [optional]
**vehicleNumber** | **Object** | Specifies a numeric string with a maximum length of 35 digits.&lt;br/&gt; |  [optional]
**vehicleTag** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
**vehicleTagEntryMode** | **Object** | Type of reading of the card data.&lt;br/&gt;- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*&lt;br/&gt;- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*&lt;br/&gt;- **BRCD: BarCode**  : *Bar code.*&lt;br/&gt;- **MGST: MagneticStripe**  : *Magnetic stripe.*&lt;br/&gt;- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*&lt;br/&gt;- **DFLE: AccountData**  : *Account data on file.*&lt;br/&gt;- **CTLS: ProximityReader**  : *Contactless proximity reader.*&lt;br/&gt;- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*&lt;br/&gt;- **CDFL: CardOnFile**  : *Card information are stored on a file.*&lt;br/&gt; |  [optional]
