package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about the debtor.&lt;br/&gt;
 */
@Schema(description = "Information about the debtor.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification   {
  @JsonProperty("AccountIdentification")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification accountIdentification = null;

  @JsonProperty("Debtor")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor debtor = null;

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification accountIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification accountIdentification) {
    this.accountIdentification = accountIdentification;
    return this;
  }

  /**
   * Get accountIdentification
   * @return accountIdentification
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification getAccountIdentification() {
    return accountIdentification;
  }

  public void setAccountIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification accountIdentification) {
    this.accountIdentification = accountIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification debtor(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor debtor) {
    this.debtor = debtor;
    return this;
  }

  /**
   * Get debtor
   * @return debtor
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor getDebtor() {
    return debtor;
  }

  public void setDebtor(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor debtor) {
    this.debtor = debtor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification poipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification = (PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification) o;
    return Objects.equals(this.accountIdentification, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification.accountIdentification) &&
        Objects.equals(this.debtor, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification.debtor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIdentification, debtor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification {\n");
    
    sb.append("    accountIdentification: ").append(toIndentedString(accountIdentification)).append("\n");
    sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
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
