# PoipoiIdfinancialServiceServiceRequestEnvironmentPOI

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **Object** | Data related to a component of the POI (Point Of Interaction) performing the transaction. |  [optional]
**capabilities** | [**PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities**](PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities.md) |  |  [optional]
**groupIdentification** | **Object** | Specifies a character string with a maximum length of 35 characters.&lt;br/&gt; |  [optional]
**identification** | [**PoipoiIdfinancialServiceHeaderInitiatingParty**](PoipoiIdfinancialServiceHeaderInitiatingParty.md) |  | 
**systemName** | **Object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; |  [optional]
**terminalIntegration** | **Object** | Indicates the type of integration of the POI terminal in the sale environment.&lt;br/&gt;- **INDR: Indoor**  : *Indoor terminal.*&lt;br/&gt;- **IPMP: InsidePump**  : *Terminal incorporated in the pump dispensing petrol.*&lt;br/&gt;- **MPOI: MultiplePOITerminal**  : *Multiple terminals linked to a unique sale terminal.*&lt;br/&gt;- **MPMP: MultiplePump**  : *Outdoor terminal serving several petrol pumps.*&lt;br/&gt;- **MSLE: MultipleSaleTerminal**  : *Terminal serving multiple sale terminals.*&lt;br/&gt;- **SSLE: SingleSaleTerminal**  : *Terminal linked to a unique sale terminal.*&lt;br/&gt;- **VNDG: VendingMachine**  : *Terminal integrated in a vending machine.*&lt;br/&gt; |  [optional]
**timeZone** | **Object** | Specifies a character string with a maximum length of 70characters.&lt;br/&gt; |  [optional]
