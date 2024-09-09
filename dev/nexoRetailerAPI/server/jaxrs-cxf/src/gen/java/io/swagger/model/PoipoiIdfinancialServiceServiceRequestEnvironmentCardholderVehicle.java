package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
  * Information related to a vehicle used during a transaction.<br/>
 **/
@Schema(description="Information related to a vehicle used during a transaction.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle   {
  
  @Schema(description = "Additional information related to the vehicle.")
 /**
   * Additional information related to the vehicle.  
  **/
  private Object additionalVehicleData = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard driverOrVehicleCard = null;
  
  @Schema(example = "123456789.123456789", description = "Number of objects represented as a decimal number, for example 0.75 or 45.6.<br/>")
 /**
   * Number of objects represented as a decimal number, for example 0.75 or 45.6.<br/>  
  **/
  private Object hubometer = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object maintenanceIdentification = null;
  
  @Schema(example = "123456789.123456789", description = "Number of objects represented as a decimal number, for example 0.75 or 45.6.<br/>")
 /**
   * Number of objects represented as a decimal number, for example 0.75 or 45.6.<br/>  
  **/
  private Object odometer = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object referHours = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object replacementCar = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object trailerHours = null;
  
  @Schema(description = "Specifies a numeric string with a maximum length of 35 digits.<br/>")
 /**
   * Specifies a numeric string with a maximum length of 35 digits.<br/>  
  **/
  private Object trailerNumber = null;
  
  @Schema(description = "Specifies a numeric string with a maximum length of 35 digits.<br/>")
 /**
   * Specifies a numeric string with a maximum length of 35 digits.<br/>  
  **/
  private Object unitNumber = null;
  
  @Schema(description = "Specifies a numeric string with a maximum length of 35 digits.<br/>")
 /**
   * Specifies a numeric string with a maximum length of 35 digits.<br/>  
  **/
  private Object vehicleNumber = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object vehicleTag = null;
  
  @Schema(example = "TAGC", description = "Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>")
 /**
   * Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>  
  **/
  private Object vehicleTagEntryMode = null;
 /**
   * Additional information related to the vehicle.
   * @return additionalVehicleData
  **/
  @JsonProperty("AdditionalVehicleData")
  @NotNull
  public Object getAdditionalVehicleData() {
    return additionalVehicleData;
  }

  public void setAdditionalVehicleData(Object additionalVehicleData) {
    this.additionalVehicleData = additionalVehicleData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle additionalVehicleData(Object additionalVehicleData) {
    this.additionalVehicleData = additionalVehicleData;
    return this;
  }

 /**
   * Get driverOrVehicleCard
   * @return driverOrVehicleCard
  **/
  @JsonProperty("DriverOrVehicleCard")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard getDriverOrVehicleCard() {
    return driverOrVehicleCard;
  }

  public void setDriverOrVehicleCard(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard driverOrVehicleCard) {
    this.driverOrVehicleCard = driverOrVehicleCard;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle driverOrVehicleCard(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard driverOrVehicleCard) {
    this.driverOrVehicleCard = driverOrVehicleCard;
    return this;
  }

 /**
   * Number of objects represented as a decimal number, for example 0.75 or 45.6.&lt;br/&gt;
   * @return hubometer
  **/
  @JsonProperty("Hubometer")
  @NotNull
  public Object getHubometer() {
    return hubometer;
  }

  public void setHubometer(Object hubometer) {
    this.hubometer = hubometer;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle hubometer(Object hubometer) {
    this.hubometer = hubometer;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return maintenanceIdentification
  **/
  @JsonProperty("MaintenanceIdentification")
  @NotNull
  public Object getMaintenanceIdentification() {
    return maintenanceIdentification;
  }

  public void setMaintenanceIdentification(Object maintenanceIdentification) {
    this.maintenanceIdentification = maintenanceIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle maintenanceIdentification(Object maintenanceIdentification) {
    this.maintenanceIdentification = maintenanceIdentification;
    return this;
  }

 /**
   * Number of objects represented as a decimal number, for example 0.75 or 45.6.&lt;br/&gt;
   * @return odometer
  **/
  @JsonProperty("Odometer")
  @NotNull
  public Object getOdometer() {
    return odometer;
  }

  public void setOdometer(Object odometer) {
    this.odometer = odometer;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle odometer(Object odometer) {
    this.odometer = odometer;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return referHours
  **/
  @JsonProperty("ReferHours")
  @NotNull
  public Object getReferHours() {
    return referHours;
  }

  public void setReferHours(Object referHours) {
    this.referHours = referHours;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle referHours(Object referHours) {
    this.referHours = referHours;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return replacementCar
  **/
  @JsonProperty("ReplacementCar")
  @NotNull
  public Object getReplacementCar() {
    return replacementCar;
  }

  public void setReplacementCar(Object replacementCar) {
    this.replacementCar = replacementCar;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle replacementCar(Object replacementCar) {
    this.replacementCar = replacementCar;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return trailerHours
  **/
  @JsonProperty("TrailerHours")
  @NotNull
  public Object getTrailerHours() {
    return trailerHours;
  }

  public void setTrailerHours(Object trailerHours) {
    this.trailerHours = trailerHours;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle trailerHours(Object trailerHours) {
    this.trailerHours = trailerHours;
    return this;
  }

 /**
   * Specifies a numeric string with a maximum length of 35 digits.&lt;br/&gt;
   * @return trailerNumber
  **/
  @JsonProperty("TrailerNumber")
  @NotNull
  public Object getTrailerNumber() {
    return trailerNumber;
  }

  public void setTrailerNumber(Object trailerNumber) {
    this.trailerNumber = trailerNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle trailerNumber(Object trailerNumber) {
    this.trailerNumber = trailerNumber;
    return this;
  }

 /**
   * Specifies a numeric string with a maximum length of 35 digits.&lt;br/&gt;
   * @return unitNumber
  **/
  @JsonProperty("UnitNumber")
  @NotNull
  public Object getUnitNumber() {
    return unitNumber;
  }

  public void setUnitNumber(Object unitNumber) {
    this.unitNumber = unitNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle unitNumber(Object unitNumber) {
    this.unitNumber = unitNumber;
    return this;
  }

 /**
   * Specifies a numeric string with a maximum length of 35 digits.&lt;br/&gt;
   * @return vehicleNumber
  **/
  @JsonProperty("VehicleNumber")
  @NotNull
  public Object getVehicleNumber() {
    return vehicleNumber;
  }

  public void setVehicleNumber(Object vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle vehicleNumber(Object vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return vehicleTag
  **/
  @JsonProperty("VehicleTag")
  @NotNull
  public Object getVehicleTag() {
    return vehicleTag;
  }

  public void setVehicleTag(Object vehicleTag) {
    this.vehicleTag = vehicleTag;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle vehicleTag(Object vehicleTag) {
    this.vehicleTag = vehicleTag;
    return this;
  }

 /**
   * Type of reading of the card data.&lt;br/&gt;- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*&lt;br/&gt;- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*&lt;br/&gt;- **BRCD: BarCode**  : *Bar code.*&lt;br/&gt;- **MGST: MagneticStripe**  : *Magnetic stripe.*&lt;br/&gt;- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*&lt;br/&gt;- **DFLE: AccountData**  : *Account data on file.*&lt;br/&gt;- **CTLS: ProximityReader**  : *Contactless proximity reader.*&lt;br/&gt;- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*&lt;br/&gt;- **CDFL: CardOnFile**  : *Card information are stored on a file.*&lt;br/&gt;
   * @return vehicleTagEntryMode
  **/
  @JsonProperty("VehicleTagEntryMode")
  @NotNull
  public Object getVehicleTagEntryMode() {
    return vehicleTagEntryMode;
  }

  public void setVehicleTagEntryMode(Object vehicleTagEntryMode) {
    this.vehicleTagEntryMode = vehicleTagEntryMode;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle vehicleTagEntryMode(Object vehicleTagEntryMode) {
    this.vehicleTagEntryMode = vehicleTagEntryMode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle {\n");
    
    sb.append("    additionalVehicleData: ").append(toIndentedString(additionalVehicleData)).append("\n");
    sb.append("    driverOrVehicleCard: ").append(toIndentedString(driverOrVehicleCard)).append("\n");
    sb.append("    hubometer: ").append(toIndentedString(hubometer)).append("\n");
    sb.append("    maintenanceIdentification: ").append(toIndentedString(maintenanceIdentification)).append("\n");
    sb.append("    odometer: ").append(toIndentedString(odometer)).append("\n");
    sb.append("    referHours: ").append(toIndentedString(referHours)).append("\n");
    sb.append("    replacementCar: ").append(toIndentedString(replacementCar)).append("\n");
    sb.append("    trailerHours: ").append(toIndentedString(trailerHours)).append("\n");
    sb.append("    trailerNumber: ").append(toIndentedString(trailerNumber)).append("\n");
    sb.append("    unitNumber: ").append(toIndentedString(unitNumber)).append("\n");
    sb.append("    vehicleNumber: ").append(toIndentedString(vehicleNumber)).append("\n");
    sb.append("    vehicleTag: ").append(toIndentedString(vehicleTag)).append("\n");
    sb.append("    vehicleTagEntryMode: ").append(toIndentedString(vehicleTagEntryMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
