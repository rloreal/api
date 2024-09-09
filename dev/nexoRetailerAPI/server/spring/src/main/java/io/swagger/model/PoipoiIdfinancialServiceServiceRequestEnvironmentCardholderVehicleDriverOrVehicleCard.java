package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sensitive data associated with a payment card.&lt;br/&gt;
 */
@Schema(description = "Sensitive data associated with a payment card.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard   {
  @JsonProperty("AdditionalCardData")
  private Object additionalCardData = null;

  @JsonProperty("EntryMode")
  private Object entryMode = null;

  @JsonProperty("PAN")
  private Object PAN = null;

  @JsonProperty("Track1")
  private Object track1 = null;

  @JsonProperty("Track2")
  private Object track2 = null;

  @JsonProperty("Track3")
  private Object track3 = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard additionalCardData(Object additionalCardData) {
    this.additionalCardData = additionalCardData;
    return this;
  }

  /**
   * Additional card issuer specific data.
   * @return additionalCardData
   **/
  @Schema(description = "Additional card issuer specific data.")
      @NotNull

    public Object getAdditionalCardData() {
    return additionalCardData;
  }

  public void setAdditionalCardData(Object additionalCardData) {
    this.additionalCardData = additionalCardData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard entryMode(Object entryMode) {
    this.entryMode = entryMode;
    return this;
  }

  /**
   * Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>
   * @return entryMode
   **/
  @Schema(example = "TAGC", description = "Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>")
      @NotNull

    public Object getEntryMode() {
    return entryMode;
  }

  public void setEntryMode(Object entryMode) {
    this.entryMode = entryMode;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard PAN(Object PAN) {
    this.PAN = PAN;
    return this;
  }

  /**
   * Specifies a numeric string with a minimum length of 8 digits, and a maximum length of 28 digits.<br/>
   * @return PAN
   **/
  @Schema(description = "Specifies a numeric string with a minimum length of 8 digits, and a maximum length of 28 digits.<br/>")
      @NotNull

    public Object getPAN() {
    return PAN;
  }

  public void setPAN(Object PAN) {
    this.PAN = PAN;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard track1(Object track1) {
    this.track1 = track1;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 76 characters.<br/>
   * @return track1
   **/
  @Schema(description = "Specifies a character string with a maximum length of 76 characters.<br/>")
      @NotNull

    public Object getTrack1() {
    return track1;
  }

  public void setTrack1(Object track1) {
    this.track1 = track1;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard track2(Object track2) {
    this.track2 = track2;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 37 characters.<br/>
   * @return track2
   **/
  @Schema(description = "Specifies a character string with a maximum length of 37 characters.<br/>")
      @NotNull

    public Object getTrack2() {
    return track2;
  }

  public void setTrack2(Object track2) {
    this.track2 = track2;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard track3(Object track3) {
    this.track3 = track3;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 104 characters.<br/>
   * @return track3
   **/
  @Schema(description = "Specifies a character string with a maximum length of 104 characters.<br/>")
      @NotNull

    public Object getTrack3() {
    return track3;
  }

  public void setTrack3(Object track3) {
    this.track3 = track3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard = (PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard) o;
    return Objects.equals(this.additionalCardData, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard.additionalCardData) &&
        Objects.equals(this.entryMode, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard.entryMode) &&
        Objects.equals(this.PAN, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard.PAN) &&
        Objects.equals(this.track1, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard.track1) &&
        Objects.equals(this.track2, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard.track2) &&
        Objects.equals(this.track3, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard.track3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalCardData, entryMode, PAN, track1, track2, track3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard {\n");
    
    sb.append("    additionalCardData: ").append(toIndentedString(additionalCardData)).append("\n");
    sb.append("    entryMode: ").append(toIndentedString(entryMode)).append("\n");
    sb.append("    PAN: ").append(toIndentedString(PAN)).append("\n");
    sb.append("    track1: ").append(toIndentedString(track1)).append("\n");
    sb.append("    track2: ").append(toIndentedString(track2)).append("\n");
    sb.append("    track3: ").append(toIndentedString(track3)).append("\n");
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
