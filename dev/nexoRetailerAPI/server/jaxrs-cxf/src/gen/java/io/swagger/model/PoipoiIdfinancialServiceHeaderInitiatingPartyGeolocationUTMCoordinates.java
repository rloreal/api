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
  * Location on the Earth specified by the Universal Transverse Mercator coordinate system.  Identifies the geographic location using the WGS84 ellipsoid spatial reference system.<br/>
 **/
@Schema(description="Location on the Earth specified by the Universal Transverse Mercator coordinate system.  Identifies the geographic location using the WGS84 ellipsoid spatial reference system.<br/>")
public class PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates   {
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object utMEastward = null;
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object utMNorthward = null;
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object utMZone = null;
 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return utMEastward
  **/
  @JsonProperty("UTMEastward")
  @NotNull
  public Object getUtMEastward() {
    return utMEastward;
  }

  public void setUtMEastward(Object utMEastward) {
    this.utMEastward = utMEastward;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates utMEastward(Object utMEastward) {
    this.utMEastward = utMEastward;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return utMNorthward
  **/
  @JsonProperty("UTMNorthward")
  @NotNull
  public Object getUtMNorthward() {
    return utMNorthward;
  }

  public void setUtMNorthward(Object utMNorthward) {
    this.utMNorthward = utMNorthward;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates utMNorthward(Object utMNorthward) {
    this.utMNorthward = utMNorthward;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return utMZone
  **/
  @JsonProperty("UTMZone")
  @NotNull
  public Object getUtMZone() {
    return utMZone;
  }

  public void setUtMZone(Object utMZone) {
    this.utMZone = utMZone;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocationUTMCoordinates utMZone(Object utMZone) {
    this.utMZone = utMZone;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
