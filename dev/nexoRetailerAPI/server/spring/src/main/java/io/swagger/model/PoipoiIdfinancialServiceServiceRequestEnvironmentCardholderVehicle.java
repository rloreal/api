package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information related to a vehicle used during a transaction.&lt;br/&gt;
 */
@Schema(description = "Information related to a vehicle used during a transaction.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle   {
  @JsonProperty("AdditionalVehicleData")
  private Object additionalVehicleData = null;

  @JsonProperty("DriverOrVehicleCard")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard driverOrVehicleCard = null;

  @JsonProperty("Hubometer")
  private Object hubometer = null;

  @JsonProperty("MaintenanceIdentification")
  private Object maintenanceIdentification = null;

  @JsonProperty("Odometer")
  private Object odometer = null;

  @JsonProperty("ReferHours")
  private Object referHours = null;

  @JsonProperty("ReplacementCar")
  private Object replacementCar = null;

  @JsonProperty("TrailerHours")
  private Object trailerHours = null;

  @JsonProperty("TrailerNumber")
  private Object trailerNumber = null;

  @JsonProperty("UnitNumber")
  private Object unitNumber = null;

  @JsonProperty("VehicleNumber")
  private Object vehicleNumber = null;

  @JsonProperty("VehicleTag")
  private Object vehicleTag = null;

  @JsonProperty("VehicleTagEntryMode")
  private Object vehicleTagEntryMode = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle additionalVehicleData(Object additionalVehicleData) {
    this.additionalVehicleData = additionalVehicleData;
    return this;
  }

  /**
   * Additional information related to the vehicle.
   * @return additionalVehicleData
   **/
  @Schema(description = "Additional information related to the vehicle.")
      @NotNull

    public Object getAdditionalVehicleData() {
    return additionalVehicleData;
  }

  public void setAdditionalVehicleData(Object additionalVehicleData) {
    this.additionalVehicleData = additionalVehicleData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle driverOrVehicleCard(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard driverOrVehicleCard) {
    this.driverOrVehicleCard = driverOrVehicleCard;
    return this;
  }

  /**
   * Get driverOrVehicleCard
   * @return driverOrVehicleCard
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard getDriverOrVehicleCard() {
    return driverOrVehicleCard;
  }

  public void setDriverOrVehicleCard(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard driverOrVehicleCard) {
    this.driverOrVehicleCard = driverOrVehicleCard;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle hubometer(Object hubometer) {
    this.hubometer = hubometer;
    return this;
  }

  /**
   * Number of objects represented as a decimal number, for example 0.75 or 45.6.<br/>
   * @return hubometer
   **/
  @Schema(example = "123456789.123456789", description = "Number of objects represented as a decimal number, for example 0.75 or 45.6.<br/>")
      @NotNull

    public Object getHubometer() {
    return hubometer;
  }

  public void setHubometer(Object hubometer) {
    this.hubometer = hubometer;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle maintenanceIdentification(Object maintenanceIdentification) {
    this.maintenanceIdentification = maintenanceIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return maintenanceIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getMaintenanceIdentification() {
    return maintenanceIdentification;
  }

  public void setMaintenanceIdentification(Object maintenanceIdentification) {
    this.maintenanceIdentification = maintenanceIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle odometer(Object odometer) {
    this.odometer = odometer;
    return this;
  }

  /**
   * Number of objects represented as a decimal number, for example 0.75 or 45.6.<br/>
   * @return odometer
   **/
  @Schema(example = "123456789.123456789", description = "Number of objects represented as a decimal number, for example 0.75 or 45.6.<br/>")
      @NotNull

    public Object getOdometer() {
    return odometer;
  }

  public void setOdometer(Object odometer) {
    this.odometer = odometer;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle referHours(Object referHours) {
    this.referHours = referHours;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return referHours
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getReferHours() {
    return referHours;
  }

  public void setReferHours(Object referHours) {
    this.referHours = referHours;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle replacementCar(Object replacementCar) {
    this.replacementCar = replacementCar;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return replacementCar
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getReplacementCar() {
    return replacementCar;
  }

  public void setReplacementCar(Object replacementCar) {
    this.replacementCar = replacementCar;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle trailerHours(Object trailerHours) {
    this.trailerHours = trailerHours;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return trailerHours
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getTrailerHours() {
    return trailerHours;
  }

  public void setTrailerHours(Object trailerHours) {
    this.trailerHours = trailerHours;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle trailerNumber(Object trailerNumber) {
    this.trailerNumber = trailerNumber;
    return this;
  }

  /**
   * Specifies a numeric string with a maximum length of 35 digits.<br/>
   * @return trailerNumber
   **/
  @Schema(description = "Specifies a numeric string with a maximum length of 35 digits.<br/>")
      @NotNull

    public Object getTrailerNumber() {
    return trailerNumber;
  }

  public void setTrailerNumber(Object trailerNumber) {
    this.trailerNumber = trailerNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle unitNumber(Object unitNumber) {
    this.unitNumber = unitNumber;
    return this;
  }

  /**
   * Specifies a numeric string with a maximum length of 35 digits.<br/>
   * @return unitNumber
   **/
  @Schema(description = "Specifies a numeric string with a maximum length of 35 digits.<br/>")
      @NotNull

    public Object getUnitNumber() {
    return unitNumber;
  }

  public void setUnitNumber(Object unitNumber) {
    this.unitNumber = unitNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle vehicleNumber(Object vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
    return this;
  }

  /**
   * Specifies a numeric string with a maximum length of 35 digits.<br/>
   * @return vehicleNumber
   **/
  @Schema(description = "Specifies a numeric string with a maximum length of 35 digits.<br/>")
      @NotNull

    public Object getVehicleNumber() {
    return vehicleNumber;
  }

  public void setVehicleNumber(Object vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle vehicleTag(Object vehicleTag) {
    this.vehicleTag = vehicleTag;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return vehicleTag
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getVehicleTag() {
    return vehicleTag;
  }

  public void setVehicleTag(Object vehicleTag) {
    this.vehicleTag = vehicleTag;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle vehicleTagEntryMode(Object vehicleTagEntryMode) {
    this.vehicleTagEntryMode = vehicleTagEntryMode;
    return this;
  }

  /**
   * Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>
   * @return vehicleTagEntryMode
   **/
  @Schema(example = "TAGC", description = "Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>")
      @NotNull

    public Object getVehicleTagEntryMode() {
    return vehicleTagEntryMode;
  }

  public void setVehicleTagEntryMode(Object vehicleTagEntryMode) {
    this.vehicleTagEntryMode = vehicleTagEntryMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle = (PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle) o;
    return Objects.equals(this.additionalVehicleData, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.additionalVehicleData) &&
        Objects.equals(this.driverOrVehicleCard, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.driverOrVehicleCard) &&
        Objects.equals(this.hubometer, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.hubometer) &&
        Objects.equals(this.maintenanceIdentification, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.maintenanceIdentification) &&
        Objects.equals(this.odometer, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.odometer) &&
        Objects.equals(this.referHours, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.referHours) &&
        Objects.equals(this.replacementCar, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.replacementCar) &&
        Objects.equals(this.trailerHours, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.trailerHours) &&
        Objects.equals(this.trailerNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.trailerNumber) &&
        Objects.equals(this.unitNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.unitNumber) &&
        Objects.equals(this.vehicleNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.vehicleNumber) &&
        Objects.equals(this.vehicleTag, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.vehicleTag) &&
        Objects.equals(this.vehicleTagEntryMode, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle.vehicleTagEntryMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalVehicleData, driverOrVehicleCard, hubometer, maintenanceIdentification, odometer, referHours, replacementCar, trailerHours, trailerNumber, unitNumber, vehicleNumber, vehicleTag, vehicleTagEntryMode);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
