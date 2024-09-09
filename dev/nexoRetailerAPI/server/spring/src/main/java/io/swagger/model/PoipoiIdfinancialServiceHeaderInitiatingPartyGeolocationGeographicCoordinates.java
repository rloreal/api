package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Location on the Earth specified by two numbers representing vertical and horizontal position.&lt;br/&gt;
 */
@Schema(description = "Location on the Earth specified by two numbers representing vertical and horizontal position.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates   {
  @JsonProperty("Latitude")
  private Object latitude = null;

  @JsonProperty("Longitude")
  private Object longitude = null;

  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates latitude(Object latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return latitude
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getLatitude() {
    return latitude;
  }

  public void setLatitude(Object latitude) {
    this.latitude = latitude;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates longitude(Object longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return longitude
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getLongitude() {
    return longitude;
  }

  public void setLongitude(Object longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates poipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates = (PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates) o;
    return Objects.equals(this.latitude, poipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates.latitude) &&
        Objects.equals(this.longitude, poipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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
