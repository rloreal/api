package io.swagger.model;

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
  * Sensitive data associated with a payment card.<br/>
 **/
@Schema(description="Sensitive data associated with a payment card.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard   {
  
  @Schema(description = "Additional card issuer specific data.")
 /**
   * Additional card issuer specific data.  
  **/
  private Object additionalCardData = null;
  
  @Schema(example = "TAGC", description = "Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>")
 /**
   * Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>  
  **/
  private Object entryMode = null;
  
  @Schema(description = "Specifies a numeric string with a minimum length of 8 digits, and a maximum length of 28 digits.<br/>")
 /**
   * Specifies a numeric string with a minimum length of 8 digits, and a maximum length of 28 digits.<br/>  
  **/
  private Object PAN = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 76 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 76 characters.<br/>  
  **/
  private Object track1 = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 37 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 37 characters.<br/>  
  **/
  private Object track2 = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 104 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 104 characters.<br/>  
  **/
  private Object track3 = null;
 /**
   * Additional card issuer specific data.
   * @return additionalCardData
  **/
  @JsonProperty("AdditionalCardData")
  @NotNull
  public Object getAdditionalCardData() {
    return additionalCardData;
  }

  public void setAdditionalCardData(Object additionalCardData) {
    this.additionalCardData = additionalCardData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard additionalCardData(Object additionalCardData) {
    this.additionalCardData = additionalCardData;
    return this;
  }

 /**
   * Type of reading of the card data.&lt;br/&gt;- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*&lt;br/&gt;- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*&lt;br/&gt;- **BRCD: BarCode**  : *Bar code.*&lt;br/&gt;- **MGST: MagneticStripe**  : *Magnetic stripe.*&lt;br/&gt;- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*&lt;br/&gt;- **DFLE: AccountData**  : *Account data on file.*&lt;br/&gt;- **CTLS: ProximityReader**  : *Contactless proximity reader.*&lt;br/&gt;- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*&lt;br/&gt;- **CDFL: CardOnFile**  : *Card information are stored on a file.*&lt;br/&gt;
   * @return entryMode
  **/
  @JsonProperty("EntryMode")
  @NotNull
  public Object getEntryMode() {
    return entryMode;
  }

  public void setEntryMode(Object entryMode) {
    this.entryMode = entryMode;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard entryMode(Object entryMode) {
    this.entryMode = entryMode;
    return this;
  }

 /**
   * Specifies a numeric string with a minimum length of 8 digits, and a maximum length of 28 digits.&lt;br/&gt;
   * @return PAN
  **/
  @JsonProperty("PAN")
  @NotNull
  public Object getPAN() {
    return PAN;
  }

  public void setPAN(Object PAN) {
    this.PAN = PAN;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard PAN(Object PAN) {
    this.PAN = PAN;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 76 characters.&lt;br/&gt;
   * @return track1
  **/
  @JsonProperty("Track1")
  @NotNull
  public Object getTrack1() {
    return track1;
  }

  public void setTrack1(Object track1) {
    this.track1 = track1;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard track1(Object track1) {
    this.track1 = track1;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 37 characters.&lt;br/&gt;
   * @return track2
  **/
  @JsonProperty("Track2")
  @NotNull
  public Object getTrack2() {
    return track2;
  }

  public void setTrack2(Object track2) {
    this.track2 = track2;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard track2(Object track2) {
    this.track2 = track2;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 104 characters.&lt;br/&gt;
   * @return track3
  **/
  @JsonProperty("Track3")
  @NotNull
  public Object getTrack3() {
    return track3;
  }

  public void setTrack3(Object track3) {
    this.track3 = track3;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicleDriverOrVehicleCard track3(Object track3) {
    this.track3 = track3;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
