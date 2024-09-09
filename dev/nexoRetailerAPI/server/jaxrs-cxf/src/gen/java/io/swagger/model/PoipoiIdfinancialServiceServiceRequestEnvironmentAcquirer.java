package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceHeaderInitiatingParty;
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
  * Acquirer involved in the card payment.<br/>
 **/
@Schema(description="Acquirer involved in the card payment.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer   {
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceHeaderInitiatingParty identification = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 256 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 256 characters.<br/>  
  **/
  private Object parametersVersion = null;
 /**
   * Get identification
   * @return identification
  **/
  @JsonProperty("Identification")
  @NotNull
  public PoipoiIdfinancialServiceHeaderInitiatingParty getIdentification() {
    return identification;
  }

  public void setIdentification(PoipoiIdfinancialServiceHeaderInitiatingParty identification) {
    this.identification = identification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer identification(PoipoiIdfinancialServiceHeaderInitiatingParty identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 256 characters.&lt;br/&gt;
   * @return parametersVersion
  **/
  @JsonProperty("ParametersVersion")
  @NotNull
  public Object getParametersVersion() {
    return parametersVersion;
  }

  public void setParametersVersion(Object parametersVersion) {
    this.parametersVersion = parametersVersion;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer parametersVersion(Object parametersVersion) {
    this.parametersVersion = parametersVersion;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    parametersVersion: ").append(toIndentedString(parametersVersion)).append("\n");
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
