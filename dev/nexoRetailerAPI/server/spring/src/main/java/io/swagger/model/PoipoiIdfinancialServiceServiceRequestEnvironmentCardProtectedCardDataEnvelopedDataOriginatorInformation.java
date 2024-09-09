package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides information about the originator. It is present only if required by the key management algorithm.&lt;br/&gt;
 */
@Schema(description = "Provides information about the originator. It is present only if required by the key management algorithm.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation   {
  @JsonProperty("Certificate")
  private Object certificate = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation certificate(Object certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * It may contain originator certificates associated with several different key management algorithms.
   * @return certificate
   **/
  @Schema(description = "It may contain originator certificates associated with several different key management algorithms.")
      @NotNull

    public Object getCertificate() {
    return certificate;
  }

  public void setCertificate(Object certificate) {
    this.certificate = certificate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation = (PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation) o;
    return Objects.equals(this.certificate, poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation.certificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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
