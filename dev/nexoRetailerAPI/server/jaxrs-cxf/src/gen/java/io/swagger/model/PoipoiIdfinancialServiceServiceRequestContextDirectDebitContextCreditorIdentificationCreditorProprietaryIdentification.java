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
  * Identification using a proprietary scheme.<br/>
 **/
@Schema(description="Identification using a proprietary scheme.<br/>")
public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification   {
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object identification = null;
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object issuer = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object schemeName = null;
 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return identification
  **/
  @JsonProperty("Identification")
  @NotNull
  public Object getIdentification() {
    return identification;
  }

  public void setIdentification(Object identification) {
    this.identification = identification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification identification(Object identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return issuer
  **/
  @JsonProperty("Issuer")
  @NotNull
  public Object getIssuer() {
    return issuer;
  }

  public void setIssuer(Object issuer) {
    this.issuer = issuer;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification issuer(Object issuer) {
    this.issuer = issuer;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return schemeName
  **/
  @JsonProperty("SchemeName")
  @NotNull
  public Object getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(Object schemeName) {
    this.schemeName = schemeName;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification schemeName(Object schemeName) {
    this.schemeName = schemeName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
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
