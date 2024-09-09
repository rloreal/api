package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceHeader;
import io.swagger.model.PoipoiIdfinancialServiceSecurityTrailer;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequest;
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
  * This SaleToPOIServiceRequest message is sent by a sale system to trig a financial service on POI system.
 **/
@Schema(description="This SaleToPOIServiceRequest message is sent by a sale system to trig a financial service on POI system.")
public class PoiIdFinancialServiceBody   {
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceHeader header = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceSecurityTrailer securityTrailer = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequest serviceRequest = null;
 /**
   * Get header
   * @return header
  **/
  @JsonProperty("Header")
  @NotNull
  public PoipoiIdfinancialServiceHeader getHeader() {
    return header;
  }

  public void setHeader(PoipoiIdfinancialServiceHeader header) {
    this.header = header;
  }

  public PoiIdFinancialServiceBody header(PoipoiIdfinancialServiceHeader header) {
    this.header = header;
    return this;
  }

 /**
   * Get securityTrailer
   * @return securityTrailer
  **/
  @JsonProperty("SecurityTrailer")
  @NotNull
  public PoipoiIdfinancialServiceSecurityTrailer getSecurityTrailer() {
    return securityTrailer;
  }

  public void setSecurityTrailer(PoipoiIdfinancialServiceSecurityTrailer securityTrailer) {
    this.securityTrailer = securityTrailer;
  }

  public PoiIdFinancialServiceBody securityTrailer(PoipoiIdfinancialServiceSecurityTrailer securityTrailer) {
    this.securityTrailer = securityTrailer;
    return this;
  }

 /**
   * Get serviceRequest
   * @return serviceRequest
  **/
  @JsonProperty("ServiceRequest")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequest getServiceRequest() {
    return serviceRequest;
  }

  public void setServiceRequest(PoipoiIdfinancialServiceServiceRequest serviceRequest) {
    this.serviceRequest = serviceRequest;
  }

  public PoiIdFinancialServiceBody serviceRequest(PoipoiIdfinancialServiceServiceRequest serviceRequest) {
    this.serviceRequest = serviceRequest;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiIdFinancialServiceBody {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    securityTrailer: ").append(toIndentedString(securityTrailer)).append("\n");
    sb.append("    serviceRequest: ").append(toIndentedString(serviceRequest)).append("\n");
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
