package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates;
import io.swagger.model.PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Geographic location specified by geographic or UTM coordinates.&lt;br/&gt;
 */
@Schema(description = "Geographic location specified by geographic or UTM coordinates.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocation   {
  @JsonProperty("GeographicCoordinates")
  private PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates geographicCoordinates = null;

  @JsonProperty("UTMCoordinates")
  private PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates utMCoordinates = null;

  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocation geographicCoordinates(PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates geographicCoordinates) {
    this.geographicCoordinates = geographicCoordinates;
    return this;
  }

  /**
   * Get geographicCoordinates
   * @return geographicCoordinates
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates getGeographicCoordinates() {
    return geographicCoordinates;
  }

  public void setGeographicCoordinates(PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates geographicCoordinates) {
    this.geographicCoordinates = geographicCoordinates;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocation utMCoordinates(PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates utMCoordinates) {
    this.utMCoordinates = utMCoordinates;
    return this;
  }

  /**
   * Get utMCoordinates
   * @return utMCoordinates
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates getUtMCoordinates() {
    return utMCoordinates;
  }

  public void setUtMCoordinates(PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates utMCoordinates) {
    this.utMCoordinates = utMCoordinates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocation poipoiIdfinancialServiceHeaderInitiatingPartyGeolocation = (PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocation) o;
    return Objects.equals(this.geographicCoordinates, poipoiIdfinancialServiceHeaderInitiatingPartyGeolocation.geographicCoordinates) &&
        Objects.equals(this.utMCoordinates, poipoiIdfinancialServiceHeaderInitiatingPartyGeolocation.utMCoordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geographicCoordinates, utMCoordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocation {\n");
    
    sb.append("    geographicCoordinates: ").append(toIndentedString(geographicCoordinates)).append("\n");
    sb.append("    utMCoordinates: ").append(toIndentedString(utMCoordinates)).append("\n");
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
