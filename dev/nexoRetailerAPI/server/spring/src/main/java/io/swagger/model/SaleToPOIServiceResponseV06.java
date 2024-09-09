package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature;
import io.swagger.model.SaleToPOIServiceRequestV06Header;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The SaleToPOIServiceResponse message is sent by a POI to provide the outcome of a financial service.
 */
@Schema(description = "The SaleToPOIServiceResponse message is sent by a POI to provide the outcome of a financial service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceResponseV06   {
  @JsonProperty("Header")
  private SaleToPOIServiceRequestV06Header header = null;

  @JsonProperty("SecurityTrailer")
  private PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature securityTrailer = null;

  @JsonProperty("ServiceResponse")
  private SaleToPOIServiceResponseV06ServiceResponse serviceResponse = null;

  public SaleToPOIServiceResponseV06 header(SaleToPOIServiceRequestV06Header header) {
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

  public SaleToPOIServiceResponseV06 securityTrailer(PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature securityTrailer) {
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

  public SaleToPOIServiceResponseV06 serviceResponse(SaleToPOIServiceResponseV06ServiceResponse serviceResponse) {
    this.serviceResponse = serviceResponse;
    return this;
  }

  /**
   * Get serviceResponse
   * @return serviceResponse
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SaleToPOIServiceResponseV06ServiceResponse getServiceResponse() {
    return serviceResponse;
  }

  public void setServiceResponse(SaleToPOIServiceResponseV06ServiceResponse serviceResponse) {
    this.serviceResponse = serviceResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleToPOIServiceResponseV06 saleToPOIServiceResponseV06 = (SaleToPOIServiceResponseV06) o;
    return Objects.equals(this.header, saleToPOIServiceResponseV06.header) &&
        Objects.equals(this.securityTrailer, saleToPOIServiceResponseV06.securityTrailer) &&
        Objects.equals(this.serviceResponse, saleToPOIServiceResponseV06.serviceResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, securityTrailer, serviceResponse);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
