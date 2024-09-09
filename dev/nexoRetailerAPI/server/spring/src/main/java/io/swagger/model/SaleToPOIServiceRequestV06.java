package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature;
import io.swagger.model.SaleToPOIServiceRequestV06Header;
import io.swagger.model.SaleToPOIServiceRequestV06ServiceRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This SaleToPOIServiceRequest message is sent by a sale system to trig a financial service on POI system.
 */
@Schema(description = "This SaleToPOIServiceRequest message is sent by a sale system to trig a financial service on POI system.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceRequestV06   {
  @JsonProperty("Header")
  private SaleToPOIServiceRequestV06Header header = null;

  @JsonProperty("SecurityTrailer")
  private PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature securityTrailer = null;

  @JsonProperty("ServiceRequest")
  private SaleToPOIServiceRequestV06ServiceRequest serviceRequest = null;

  public SaleToPOIServiceRequestV06 header(SaleToPOIServiceRequestV06Header header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SaleToPOIServiceRequestV06Header getHeader() {
    return header;
  }

  public void setHeader(SaleToPOIServiceRequestV06Header header) {
    this.header = header;
  }

  public SaleToPOIServiceRequestV06 securityTrailer(PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature securityTrailer) {
    this.securityTrailer = securityTrailer;
    return this;
  }

  /**
   * Get securityTrailer
   * @return securityTrailer
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature getSecurityTrailer() {
    return securityTrailer;
  }

  public void setSecurityTrailer(PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature securityTrailer) {
    this.securityTrailer = securityTrailer;
  }

  public SaleToPOIServiceRequestV06 serviceRequest(SaleToPOIServiceRequestV06ServiceRequest serviceRequest) {
    this.serviceRequest = serviceRequest;
    return this;
  }

  /**
   * Get serviceRequest
   * @return serviceRequest
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SaleToPOIServiceRequestV06ServiceRequest getServiceRequest() {
    return serviceRequest;
  }

  public void setServiceRequest(SaleToPOIServiceRequestV06ServiceRequest serviceRequest) {
    this.serviceRequest = serviceRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleToPOIServiceRequestV06 saleToPOIServiceRequestV06 = (SaleToPOIServiceRequestV06) o;
    return Objects.equals(this.header, saleToPOIServiceRequestV06.header) &&
        Objects.equals(this.securityTrailer, saleToPOIServiceRequestV06.securityTrailer) &&
        Objects.equals(this.serviceRequest, saleToPOIServiceRequestV06.serviceRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, securityTrailer, serviceRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceRequestV06 {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
