package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceHeaderInitiatingParty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Acquirer involved in the card payment.&lt;br/&gt;
 */
@Schema(description = "Acquirer involved in the card payment.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer   {
  @JsonProperty("Identification")
  private PoipoiIdfinancialServiceHeaderInitiatingParty identification = null;

  @JsonProperty("ParametersVersion")
  private Object parametersVersion = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer identification(PoipoiIdfinancialServiceHeaderInitiatingParty identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceHeaderInitiatingParty getIdentification() {
    return identification;
  }

  public void setIdentification(PoipoiIdfinancialServiceHeaderInitiatingParty identification) {
    this.identification = identification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer parametersVersion(Object parametersVersion) {
    this.parametersVersion = parametersVersion;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 256 characters.<br/>
   * @return parametersVersion
   **/
  @Schema(description = "Specifies a character string with a maximum length of 256 characters.<br/>")
      @NotNull

    public Object getParametersVersion() {
    return parametersVersion;
  }

  public void setParametersVersion(Object parametersVersion) {
    this.parametersVersion = parametersVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer poipoiIdfinancialServiceServiceRequestEnvironmentAcquirer = (PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer) o;
    return Objects.equals(this.identification, poipoiIdfinancialServiceServiceRequestEnvironmentAcquirer.identification) &&
        Objects.equals(this.parametersVersion, poipoiIdfinancialServiceServiceRequestEnvironmentAcquirer.parametersVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, parametersVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    parametersVersion: ").append(toIndentedString(parametersVersion)).append("\n");
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
