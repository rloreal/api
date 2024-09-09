package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identification using a proprietary scheme.&lt;br/&gt;
 */
@Schema(description = "Identification using a proprietary scheme.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification   {
  @JsonProperty("Identification")
  private Object identification = null;

  @JsonProperty("Issuer")
  private Object issuer = null;

  @JsonProperty("SchemeName")
  private Object schemeName = null;

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification identification(Object identification) {
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

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification issuer(Object issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return issuer
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getIssuer() {
    return issuer;
  }

  public void setIssuer(Object issuer) {
    this.issuer = issuer;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification schemeName(Object schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return schemeName
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(Object schemeName) {
    this.schemeName = schemeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification = (PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification) o;
    return Objects.equals(this.identification, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification.identification) &&
        Objects.equals(this.issuer, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification.issuer) &&
        Objects.equals(this.schemeName, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification.schemeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, issuer, schemeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
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
