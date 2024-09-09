package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information related to an identification, for example, party identification or account identification.&lt;br/&gt;
 */
@Schema(description = "Information related to an identification, for example, party identification or account identification.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount   {
  @JsonProperty("Identification")
  private Object identification = null;

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount identification(Object identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return identification
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getIdentification() {
    return identification;
  }

  public void setIdentification(Object identification) {
    this.identification = identification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount poipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount = (PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount) o;
    return Objects.equals(this.identification, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount.identification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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
