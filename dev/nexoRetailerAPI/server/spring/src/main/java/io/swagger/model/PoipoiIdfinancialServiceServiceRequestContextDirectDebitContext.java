package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Element containing all information needed for a card initiating direct debit.&lt;br/&gt;
 */
@Schema(description = "Element containing all information needed for a card initiating direct debit.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext   {
  @JsonProperty("CreditorIdentification")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification creditorIdentification = null;

  @JsonProperty("DebtorIdentification")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification debtorIdentification = null;

  @JsonProperty("MandateRelatedInformation")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation mandateRelatedInformation = null;

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext creditorIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification creditorIdentification) {
    this.creditorIdentification = creditorIdentification;
    return this;
  }

  /**
   * Get creditorIdentification
   * @return creditorIdentification
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification getCreditorIdentification() {
    return creditorIdentification;
  }

  public void setCreditorIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification creditorIdentification) {
    this.creditorIdentification = creditorIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext debtorIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification debtorIdentification) {
    this.debtorIdentification = debtorIdentification;
    return this;
  }

  /**
   * Get debtorIdentification
   * @return debtorIdentification
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification getDebtorIdentification() {
    return debtorIdentification;
  }

  public void setDebtorIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification debtorIdentification) {
    this.debtorIdentification = debtorIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext mandateRelatedInformation(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation mandateRelatedInformation) {
    this.mandateRelatedInformation = mandateRelatedInformation;
    return this;
  }

  /**
   * Get mandateRelatedInformation
   * @return mandateRelatedInformation
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation getMandateRelatedInformation() {
    return mandateRelatedInformation;
  }

  public void setMandateRelatedInformation(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation mandateRelatedInformation) {
    this.mandateRelatedInformation = mandateRelatedInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext poipoiIdfinancialServiceServiceRequestContextDirectDebitContext = (PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext) o;
    return Objects.equals(this.creditorIdentification, poipoiIdfinancialServiceServiceRequestContextDirectDebitContext.creditorIdentification) &&
        Objects.equals(this.debtorIdentification, poipoiIdfinancialServiceServiceRequestContextDirectDebitContext.debtorIdentification) &&
        Objects.equals(this.mandateRelatedInformation, poipoiIdfinancialServiceServiceRequestContextDirectDebitContext.mandateRelatedInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditorIdentification, debtorIdentification, mandateRelatedInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext {\n");
    
    sb.append("    creditorIdentification: ").append(toIndentedString(creditorIdentification)).append("\n");
    sb.append("    debtorIdentification: ").append(toIndentedString(debtorIdentification)).append("\n");
    sb.append("    mandateRelatedInformation: ").append(toIndentedString(mandateRelatedInformation)).append("\n");
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
