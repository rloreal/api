package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Name and address of an institution.&lt;br/&gt;
 */
@Schema(description = "Name and address of an institution.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress   {
  @JsonProperty("Address")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress address = null;

  @JsonProperty("Name")
  private Object name = null;

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress address(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress getAddress() {
    return address;
  }

  public void setAddress(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress address) {
    this.address = address;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress name(Object name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return name
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getName() {
    return name;
  }

  public void setName(Object name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress = (PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress) o;
    return Objects.equals(this.address, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress.address) &&
        Objects.equals(this.name, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
