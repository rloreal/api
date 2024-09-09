package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates;
import io.swagger.model.PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates;
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
  * Geographic location specified by geographic or UTM coordinates.<br/>
 **/
@Schema(description="Geographic location specified by geographic or UTM coordinates.<br/>")
public class PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocation   {
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates geographicCoordinates = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates utMCoordinates = null;
 /**
   * Get geographicCoordinates
   * @return geographicCoordinates
  **/
  @JsonProperty("GeographicCoordinates")
  @NotNull
  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates getGeographicCoordinates() {
    return geographicCoordinates;
  }

  public void setGeographicCoordinates(PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates geographicCoordinates) {
    this.geographicCoordinates = geographicCoordinates;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocation geographicCoordinates(PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates geographicCoordinates) {
    this.geographicCoordinates = geographicCoordinates;
    return this;
  }

 /**
   * Get utMCoordinates
   * @return utMCoordinates
  **/
  @JsonProperty("UTMCoordinates")
  @NotNull
  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates getUtMCoordinates() {
    return utMCoordinates;
  }

  public void setUtMCoordinates(PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates utMCoordinates) {
    this.utMCoordinates = utMCoordinates;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocation utMCoordinates(PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates utMCoordinates) {
    this.utMCoordinates = utMCoordinates;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
