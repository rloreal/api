package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceHeader;
import io.swagger.model.PoipoiIdfinancialServiceSecurityTrailer;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequest;
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


public class PoiIdFinancialServiceBody   {
  @JsonProperty("Header")
  private PoipoiIdfinancialServiceHeader header = null;

  @JsonProperty("SecurityTrailer")
  private PoipoiIdfinancialServiceSecurityTrailer securityTrailer = null;

  @JsonProperty("ServiceRequest")
  private PoipoiIdfinancialServiceServiceRequest serviceRequest = null;

  public PoiIdFinancialServiceBody header(PoipoiIdfinancialServiceHeader header) {
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
    public PoipoiIdfinancialServiceHeader getHeader() {
    return header;
  }

  public void setHeader(PoipoiIdfinancialServiceHeader header) {
    this.header = header;
  }

  public PoiIdFinancialServiceBody securityTrailer(PoipoiIdfinancialServiceSecurityTrailer securityTrailer) {
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
    public PoipoiIdfinancialServiceSecurityTrailer getSecurityTrailer() {
    return securityTrailer;
  }

  public void setSecurityTrailer(PoipoiIdfinancialServiceSecurityTrailer securityTrailer) {
    this.securityTrailer = securityTrailer;
  }

  public PoiIdFinancialServiceBody serviceRequest(PoipoiIdfinancialServiceServiceRequest serviceRequest) {
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
    public PoipoiIdfinancialServiceServiceRequest getServiceRequest() {
    return serviceRequest;
  }

  public void setServiceRequest(PoipoiIdfinancialServiceServiceRequest serviceRequest) {
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
    PoiIdFinancialServiceBody poiIdFinancialServiceBody = (PoiIdFinancialServiceBody) o;
    return Objects.equals(this.header, poiIdFinancialServiceBody.header) &&
        Objects.equals(this.securityTrailer, poiIdFinancialServiceBody.securityTrailer) &&
        Objects.equals(this.serviceRequest, poiIdFinancialServiceBody.serviceRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, securityTrailer, serviceRequest);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
