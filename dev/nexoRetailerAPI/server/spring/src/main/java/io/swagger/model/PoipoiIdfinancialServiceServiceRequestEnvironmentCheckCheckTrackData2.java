package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Magnetic track or equivalent payment card data.&lt;br/&gt;
 */
@Schema(description = "Magnetic track or equivalent payment card data.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2   {
  @JsonProperty("TrackFormat")
  private Object trackFormat = null;

  @JsonProperty("TrackNumber")
  private Object trackNumber = null;

  @JsonProperty("TrackValue")
  private Object trackValue = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 trackFormat(Object trackFormat) {
    this.trackFormat = trackFormat;
    return this;
  }

  /**
   * Use to identify format of a track on a card or other documents like checks.<br/>- **AAMV: AAMVAFormat**  : *American driver license.*<br/>- **CMC7: CMC7CheckFormat**  : *Magnetic Ink Character Recognition, using the CMC-7 font - ISO 1004 Line at the bottom of a check containing the bank account and the check number.*<br/>- **E13B: E13BCheckFormat**  : *Magnetic Ink Character Recognition, using the E-13B font) Line at the bottom of a check containing the bank account and the check number.*<br/>- **ISOF: ISOFormat**  : *ISO card track format - ISO 7813 - ISO 4909.*<br/>- **JIS1: JISIFormat**  : *Japanese track format I.*<br/>- **JIS2: JISIIFormat**  : *Japanese track format II.*<br/>
   * @return trackFormat
   **/
  @Schema(description = "Use to identify format of a track on a card or other documents like checks.<br/>- **AAMV: AAMVAFormat**  : *American driver license.*<br/>- **CMC7: CMC7CheckFormat**  : *Magnetic Ink Character Recognition, using the CMC-7 font - ISO 1004 Line at the bottom of a check containing the bank account and the check number.*<br/>- **E13B: E13BCheckFormat**  : *Magnetic Ink Character Recognition, using the E-13B font) Line at the bottom of a check containing the bank account and the check number.*<br/>- **ISOF: ISOFormat**  : *ISO card track format - ISO 7813 - ISO 4909.*<br/>- **JIS1: JISIFormat**  : *Japanese track format I.*<br/>- **JIS2: JISIIFormat**  : *Japanese track format II.*<br/>")
      @NotNull

    public Object getTrackFormat() {
    return trackFormat;
  }

  public void setTrackFormat(Object trackFormat) {
    this.trackFormat = trackFormat;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 trackNumber(Object trackNumber) {
    this.trackNumber = trackNumber;
    return this;
  }

  /**
   * Number of objects represented as an integer.<br/>
   * @return trackNumber
   **/
  @Schema(example = "123456789012345678", description = "Number of objects represented as an integer.<br/>")
      @NotNull

    public Object getTrackNumber() {
    return trackNumber;
  }

  public void setTrackNumber(Object trackNumber) {
    this.trackNumber = trackNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 trackValue(Object trackValue) {
    this.trackValue = trackValue;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 140 characters.<br/>
   * @return trackValue
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 140 characters.<br/>")
      @NotNull

    public Object getTrackValue() {
    return trackValue;
  }

  public void setTrackValue(Object trackValue) {
    this.trackValue = trackValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 poipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 = (PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2) o;
    return Objects.equals(this.trackFormat, poipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2.trackFormat) &&
        Objects.equals(this.trackNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2.trackNumber) &&
        Objects.equals(this.trackValue, poipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2.trackValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackFormat, trackNumber, trackValue);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
