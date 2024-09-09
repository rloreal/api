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
  * Location on the Earth specified by two numbers representing vertical and horizontal position.<br/>
 **/
@Schema(description="Location on the Earth specified by two numbers representing vertical and horizontal position.<br/>")
public class PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates   {
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object latitude = null;
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object longitude = null;
 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return latitude
  **/
  @JsonProperty("Latitude")
  @NotNull
  public Object getLatitude() {
    return latitude;
  }

  public void setLatitude(Object latitude) {
    this.latitude = latitude;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates latitude(Object latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return longitude
  **/
  @JsonProperty("Longitude")
  @NotNull
  public Object getLongitude() {
    return longitude;
  }

  public void setLongitude(Object longitude) {
    this.longitude = longitude;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationGeographicCoordinates longitude(Object longitude) {
    this.longitude = longitude;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
