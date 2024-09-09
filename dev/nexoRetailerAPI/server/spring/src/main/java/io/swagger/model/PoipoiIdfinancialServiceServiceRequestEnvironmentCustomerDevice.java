package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Device used by the customer to perform the payment.&lt;br/&gt;
 */
@Schema(description = "Device used by the customer to perform the payment.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice   {
  @JsonProperty("Identification")
  private Object identification = null;

  @JsonProperty("Provider")
  private Object provider = null;

  @JsonProperty("Type")
  private Object type = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice identification(Object identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return identification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getIdentification() {
    return identification;
  }

  public void setIdentification(Object identification) {
    this.identification = identification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice provider(Object provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return provider
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getProvider() {
    return provider;
  }

  public void setProvider(Object provider) {
    this.provider = provider;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice type(Object type) {
    this.type = type;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return type
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getType() {
    return type;
  }

  public void setType(Object type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice poipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice = (PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice) o;
    return Objects.equals(this.identification, poipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice.identification) &&
        Objects.equals(this.provider, poipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice.provider) &&
        Objects.equals(this.type, poipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, provider, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
