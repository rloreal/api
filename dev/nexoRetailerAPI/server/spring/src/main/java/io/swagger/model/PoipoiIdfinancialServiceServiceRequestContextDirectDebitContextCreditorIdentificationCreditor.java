package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identification of a party.&lt;br/&gt;
 */
@Schema(description = "Identification of a party.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor   {
  @JsonProperty("AnyBIC")
  private Object anyBIC = null;

  @JsonProperty("NameAndAddress")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress nameAndAddress = null;

  @JsonProperty("ProprietaryIdentification")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification proprietaryIdentification = null;

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor anyBIC(Object anyBIC) {
    this.anyBIC = anyBIC;
    return this;
  }

  /**
   * Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362: 2014 - \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".<br/>
   * @return anyBIC
   **/
  @Schema(example = "CHASUS33", description = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362: 2014 - \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".<br/>")
      @NotNull

    public Object getAnyBIC() {
    return anyBIC;
  }

  public void setAnyBIC(Object anyBIC) {
    this.anyBIC = anyBIC;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor nameAndAddress(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress nameAndAddress) {
    this.nameAndAddress = nameAndAddress;
    return this;
  }

  /**
   * Get nameAndAddress
   * @return nameAndAddress
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress getNameAndAddress() {
    return nameAndAddress;
  }

  public void setNameAndAddress(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress nameAndAddress) {
    this.nameAndAddress = nameAndAddress;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor proprietaryIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification proprietaryIdentification) {
    this.proprietaryIdentification = proprietaryIdentification;
    return this;
  }

  /**
   * Get proprietaryIdentification
   * @return proprietaryIdentification
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification getProprietaryIdentification() {
    return proprietaryIdentification;
  }

  public void setProprietaryIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification proprietaryIdentification) {
    this.proprietaryIdentification = proprietaryIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor = (PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor) o;
    return Objects.equals(this.anyBIC, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor.anyBIC) &&
        Objects.equals(this.nameAndAddress, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor.nameAndAddress) &&
        Objects.equals(this.proprietaryIdentification, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor.proprietaryIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyBIC, nameAndAddress, proprietaryIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor {\n");
    
    sb.append("    anyBIC: ").append(toIndentedString(anyBIC)).append("\n");
    sb.append("    nameAndAddress: ").append(toIndentedString(nameAndAddress)).append("\n");
    sb.append("    proprietaryIdentification: ").append(toIndentedString(proprietaryIdentification)).append("\n");
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
