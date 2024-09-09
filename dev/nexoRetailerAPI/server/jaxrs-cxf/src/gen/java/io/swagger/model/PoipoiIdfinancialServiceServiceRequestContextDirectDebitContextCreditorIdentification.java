package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor;
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
  * Information about the creditor.<br/>
 **/
@Schema(description="Information about the creditor.<br/>")
public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification   {
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor creditor = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object registrationIdentification = null;
 /**
   * Get creditor
   * @return creditor
  **/
  @JsonProperty("Creditor")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor getCreditor() {
    return creditor;
  }

  public void setCreditor(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor creditor) {
    this.creditor = creditor;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification creditor(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor creditor) {
    this.creditor = creditor;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return registrationIdentification
  **/
  @JsonProperty("RegistrationIdentification")
  @NotNull
  public Object getRegistrationIdentification() {
    return registrationIdentification;
  }

  public void setRegistrationIdentification(Object registrationIdentification) {
    this.registrationIdentification = registrationIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification registrationIdentification(Object registrationIdentification) {
    this.registrationIdentification = registrationIdentification;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification {\n");
    
    sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
    sb.append("    registrationIdentification: ").append(toIndentedString(registrationIdentification)).append("\n");
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
