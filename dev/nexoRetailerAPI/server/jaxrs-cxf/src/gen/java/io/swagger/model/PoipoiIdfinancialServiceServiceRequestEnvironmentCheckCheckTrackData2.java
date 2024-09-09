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
  * Magnetic track or equivalent payment card data.<br/>
 **/
@Schema(description="Magnetic track or equivalent payment card data.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2   {
  
  @Schema(description = "Use to identify format of a track on a card or other documents like checks.<br/>- **AAMV: AAMVAFormat**  : *American driver license.*<br/>- **CMC7: CMC7CheckFormat**  : *Magnetic Ink Character Recognition, using the CMC-7 font - ISO 1004 Line at the bottom of a check containing the bank account and the check number.*<br/>- **E13B: E13BCheckFormat**  : *Magnetic Ink Character Recognition, using the E-13B font) Line at the bottom of a check containing the bank account and the check number.*<br/>- **ISOF: ISOFormat**  : *ISO card track format - ISO 7813 - ISO 4909.*<br/>- **JIS1: JISIFormat**  : *Japanese track format I.*<br/>- **JIS2: JISIIFormat**  : *Japanese track format II.*<br/>")
 /**
   * Use to identify format of a track on a card or other documents like checks.<br/>- **AAMV: AAMVAFormat**  : *American driver license.*<br/>- **CMC7: CMC7CheckFormat**  : *Magnetic Ink Character Recognition, using the CMC-7 font - ISO 1004 Line at the bottom of a check containing the bank account and the check number.*<br/>- **E13B: E13BCheckFormat**  : *Magnetic Ink Character Recognition, using the E-13B font) Line at the bottom of a check containing the bank account and the check number.*<br/>- **ISOF: ISOFormat**  : *ISO card track format - ISO 7813 - ISO 4909.*<br/>- **JIS1: JISIFormat**  : *Japanese track format I.*<br/>- **JIS2: JISIIFormat**  : *Japanese track format II.*<br/>  
  **/
  private Object trackFormat = null;
  
  @Schema(example = "123456789012345678", description = "Number of objects represented as an integer.<br/>")
 /**
   * Number of objects represented as an integer.<br/>  
  **/
  private Object trackNumber = null;
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 140 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 140 characters.<br/>  
  **/
  private Object trackValue = null;
 /**
   * Use to identify format of a track on a card or other documents like checks.&lt;br/&gt;- **AAMV: AAMVAFormat**  : *American driver license.*&lt;br/&gt;- **CMC7: CMC7CheckFormat**  : *Magnetic Ink Character Recognition, using the CMC-7 font - ISO 1004 Line at the bottom of a check containing the bank account and the check number.*&lt;br/&gt;- **E13B: E13BCheckFormat**  : *Magnetic Ink Character Recognition, using the E-13B font) Line at the bottom of a check containing the bank account and the check number.*&lt;br/&gt;- **ISOF: ISOFormat**  : *ISO card track format - ISO 7813 - ISO 4909.*&lt;br/&gt;- **JIS1: JISIFormat**  : *Japanese track format I.*&lt;br/&gt;- **JIS2: JISIIFormat**  : *Japanese track format II.*&lt;br/&gt;
   * @return trackFormat
  **/
  @JsonProperty("TrackFormat")
  @NotNull
  public Object getTrackFormat() {
    return trackFormat;
  }

  public void setTrackFormat(Object trackFormat) {
    this.trackFormat = trackFormat;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 trackFormat(Object trackFormat) {
    this.trackFormat = trackFormat;
    return this;
  }

 /**
   * Number of objects represented as an integer.&lt;br/&gt;
   * @return trackNumber
  **/
  @JsonProperty("TrackNumber")
  @NotNull
  public Object getTrackNumber() {
    return trackNumber;
  }

  public void setTrackNumber(Object trackNumber) {
    this.trackNumber = trackNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 trackNumber(Object trackNumber) {
    this.trackNumber = trackNumber;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 140 characters.&lt;br/&gt;
   * @return trackValue
  **/
  @JsonProperty("TrackValue")
  @NotNull
  public Object getTrackValue() {
    return trackValue;
  }

  public void setTrackValue(Object trackValue) {
    this.trackValue = trackValue;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 trackValue(Object trackValue) {
    this.trackValue = trackValue;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 {\n");
    
    sb.append("    trackFormat: ").append(toIndentedString(trackFormat)).append("\n");
    sb.append("    trackNumber: ").append(toIndentedString(trackNumber)).append("\n");
    sb.append("    trackValue: ").append(toIndentedString(trackValue)).append("\n");
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
