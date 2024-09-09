package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature;
import io.swagger.model.SaleToPOIServiceRequestV06Header;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponse;
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
  * The SaleToPOIServiceResponse message is sent by a POI to provide the outcome of a financial service.
 **/
@Schema(description="The SaleToPOIServiceResponse message is sent by a POI to provide the outcome of a financial service.")
public class SaleToPOIServiceResponseV06   {
  
  @Schema(required = true, description = "")
  private SaleToPOIServiceRequestV06Header header = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature securityTrailer = null;
  
  @Schema(required = true, description = "")
  private SaleToPOIServiceResponseV06ServiceResponse serviceResponse = null;
 /**
   * Get header
   * @return header
  **/
  @JsonProperty("Header")
  @NotNull
  public SaleToPOIServiceRequestV06Header getHeader() {
    return header;
  }

  public void setHeader(SaleToPOIServiceRequestV06Header header) {
    this.header = header;
  }

  public SaleToPOIServiceResponseV06 header(SaleToPOIServiceRequestV06Header header) {
    this.header = header;
    return this;
  }

 /**
   * Get securityTrailer
   * @return securityTrailer
  **/
  @JsonProperty("SecurityTrailer")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature getSecurityTrailer() {
    return securityTrailer;
  }

  public void setSecurityTrailer(PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature securityTrailer) {
    this.securityTrailer = securityTrailer;
  }

  public SaleToPOIServiceResponseV06 securityTrailer(PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature securityTrailer) {
    this.securityTrailer = securityTrailer;
    return this;
  }

 /**
   * Get serviceResponse
   * @return serviceResponse
  **/
  @JsonProperty("ServiceResponse")
  @NotNull
  public SaleToPOIServiceResponseV06ServiceResponse getServiceResponse() {
    return serviceResponse;
  }

  public void setServiceResponse(SaleToPOIServiceResponseV06ServiceResponse serviceResponse) {
    this.serviceResponse = serviceResponse;
  }

  public SaleToPOIServiceResponseV06 serviceResponse(SaleToPOIServiceResponseV06ServiceResponse serviceResponse) {
    this.serviceResponse = serviceResponse;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06 {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    securityTrailer: ").append(toIndentedString(securityTrailer)).append("\n");
    sb.append("    serviceResponse: ").append(toIndentedString(serviceResponse)).append("\n");
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
