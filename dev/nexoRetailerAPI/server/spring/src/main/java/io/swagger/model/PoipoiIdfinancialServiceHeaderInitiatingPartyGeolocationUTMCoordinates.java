package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Location on the Earth specified by the Universal Transverse Mercator coordinate system.  Identifies the geographic location using the WGS84 ellipsoid spatial reference system.&lt;br/&gt;
 */
@Schema(description = "Location on the Earth specified by the Universal Transverse Mercator coordinate system.  Identifies the geographic location using the WGS84 ellipsoid spatial reference system.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates   {
  @JsonProperty("UTMEastward")
  private Object utMEastward = null;

  @JsonProperty("UTMNorthward")
  private Object utMNorthward = null;

  @JsonProperty("UTMZone")
  private Object utMZone = null;

  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates utMEastward(Object utMEastward) {
    this.utMEastward = utMEastward;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return utMEastward
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getUtMEastward() {
    return utMEastward;
  }

  public void setUtMEastward(Object utMEastward) {
    this.utMEastward = utMEastward;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates utMNorthward(Object utMNorthward) {
    this.utMNorthward = utMNorthward;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return utMNorthward
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getUtMNorthward() {
    return utMNorthward;
  }

  public void setUtMNorthward(Object utMNorthward) {
    this.utMNorthward = utMNorthward;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates utMZone(Object utMZone) {
    this.utMZone = utMZone;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return utMZone
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getUtMZone() {
    return utMZone;
  }

  public void setUtMZone(Object utMZone) {
    this.utMZone = utMZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates poipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates = (PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates) o;
    return Objects.equals(this.utMEastward, poipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates.utMEastward) &&
        Objects.equals(this.utMNorthward, poipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates.utMNorthward) &&
        Objects.equals(this.utMZone, poipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates.utMZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utMEastward, utMNorthward, utMZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates {\n");
    
    sb.append("    utMEastward: ").append(toIndentedString(utMEastward)).append("\n");
    sb.append("    utMNorthward: ").append(toIndentedString(utMNorthward)).append("\n");
    sb.append("    utMZone: ").append(toIndentedString(utMZone)).append("\n");
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
