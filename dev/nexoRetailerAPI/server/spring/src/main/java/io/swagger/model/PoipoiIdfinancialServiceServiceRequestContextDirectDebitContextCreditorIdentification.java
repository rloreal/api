package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about the creditor.&lt;br/&gt;
 */
@Schema(description = "Information about the creditor.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification   {
  @JsonProperty("Creditor")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor creditor = null;

  @JsonProperty("RegistrationIdentification")
  private Object registrationIdentification = null;

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification creditor(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor creditor) {
    this.creditor = creditor;
    return this;
  }

  /**
   * Get creditor
   * @return creditor
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor getCreditor() {
    return creditor;
  }

  public void setCreditor(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor creditor) {
    this.creditor = creditor;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification registrationIdentification(Object registrationIdentification) {
    this.registrationIdentification = registrationIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return registrationIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getRegistrationIdentification() {
    return registrationIdentification;
  }

  public void setRegistrationIdentification(Object registrationIdentification) {
    this.registrationIdentification = registrationIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification = (PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification) o;
    return Objects.equals(this.creditor, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification.creditor) &&
        Objects.equals(this.registrationIdentification, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification.registrationIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditor, registrationIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification {\n");
    
    sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
    sb.append("    registrationIdentification: ").append(toIndentedString(registrationIdentification)).append("\n");
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
