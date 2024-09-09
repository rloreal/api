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
  * Identifier of a token provider requestor.<br/>
 **/
@Schema(description="Identifier of a token provider requestor.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor   {
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object providerIdentification = null;
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object requestorIdentification = null;
 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return providerIdentification
  **/
  @JsonProperty("ProviderIdentification")
  @NotNull
  public Object getProviderIdentification() {
    return providerIdentification;
  }

  public void setProviderIdentification(Object providerIdentification) {
    this.providerIdentification = providerIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor providerIdentification(Object providerIdentification) {
    this.providerIdentification = providerIdentification;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return requestorIdentification
  **/
  @JsonProperty("RequestorIdentification")
  @NotNull
  public Object getRequestorIdentification() {
    return requestorIdentification;
  }

  public void setRequestorIdentification(Object requestorIdentification) {
    this.requestorIdentification = requestorIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor requestorIdentification(Object requestorIdentification) {
    this.requestorIdentification = requestorIdentification;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor {\n");
    
    sb.append("    providerIdentification: ").append(toIndentedString(providerIdentification)).append("\n");
    sb.append("    requestorIdentification: ").append(toIndentedString(requestorIdentification)).append("\n");
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
