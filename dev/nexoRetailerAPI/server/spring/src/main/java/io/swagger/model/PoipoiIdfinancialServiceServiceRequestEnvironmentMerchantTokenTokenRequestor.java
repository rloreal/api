package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identifier of a token provider requestor.&lt;br/&gt;
 */
@Schema(description = "Identifier of a token provider requestor.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor   {
  @JsonProperty("ProviderIdentification")
  private Object providerIdentification = null;

  @JsonProperty("RequestorIdentification")
  private Object requestorIdentification = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor providerIdentification(Object providerIdentification) {
    this.providerIdentification = providerIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return providerIdentification
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getProviderIdentification() {
    return providerIdentification;
  }

  public void setProviderIdentification(Object providerIdentification) {
    this.providerIdentification = providerIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor requestorIdentification(Object requestorIdentification) {
    this.requestorIdentification = requestorIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return requestorIdentification
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getRequestorIdentification() {
    return requestorIdentification;
  }

  public void setRequestorIdentification(Object requestorIdentification) {
    this.requestorIdentification = requestorIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor poipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor = (PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor) o;
    return Objects.equals(this.providerIdentification, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor.providerIdentification) &&
        Objects.equals(this.requestorIdentification, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor.requestorIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerIdentification, requestorIdentification);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
