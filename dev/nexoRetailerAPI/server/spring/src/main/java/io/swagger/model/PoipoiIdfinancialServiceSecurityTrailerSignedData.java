package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Digital signatures of data from one or several signers.&lt;br/&gt;
 */
@Schema(description = "Digital signatures of data from one or several signers.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceSecurityTrailerSignedData   {
  @JsonProperty("Certificate")
  private Object certificate = null;

  @JsonProperty("DigestAlgorithm")
  private Object digestAlgorithm = null;

  @JsonProperty("EncapsulatedContent")
  private PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent encapsulatedContent = null;

  @JsonProperty("Signer")
  private Object signer = null;

  @JsonProperty("Version")
  private Object version = null;

  public PoipoiIdfinancialServiceSecurityTrailerSignedData certificate(Object certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * Chain of X.509 certificates.
   * @return certificate
   **/
  @Schema(description = "Chain of X.509 certificates.")
      @NotNull

    public Object getCertificate() {
    return certificate;
  }

  public void setCertificate(Object certificate) {
    this.certificate = certificate;
  }

  public PoipoiIdfinancialServiceSecurityTrailerSignedData digestAlgorithm(Object digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
    return this;
  }

  /**
   * Identification of digest algorithm applied before signature.
   * @return digestAlgorithm
   **/
  @Schema(description = "Identification of digest algorithm applied before signature.")
      @NotNull

    public Object getDigestAlgorithm() {
    return digestAlgorithm;
  }

  public void setDigestAlgorithm(Object digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
  }

  public PoipoiIdfinancialServiceSecurityTrailerSignedData encapsulatedContent(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent encapsulatedContent) {
    this.encapsulatedContent = encapsulatedContent;
    return this;
  }

  /**
   * Get encapsulatedContent
   * @return encapsulatedContent
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent getEncapsulatedContent() {
    return encapsulatedContent;
  }

  public void setEncapsulatedContent(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent encapsulatedContent) {
    this.encapsulatedContent = encapsulatedContent;
  }

  public PoipoiIdfinancialServiceSecurityTrailerSignedData signer(Object signer) {
    this.signer = signer;
    return this;
  }

  /**
   * Digital signature and identification of a signer.
   * @return signer
   **/
  @Schema(description = "Digital signature and identification of a signer.")
      @NotNull

    public Object getSigner() {
    return signer;
  }

  public void setSigner(Object signer) {
    this.signer = signer;
  }

  public PoipoiIdfinancialServiceSecurityTrailerSignedData version(Object version) {
    this.version = version;
    return this;
  }

  /**
   * Number of objects represented as an integer.<br/>
   * @return version
   **/
  @Schema(example = "123456789012345678", description = "Number of objects represented as an integer.<br/>")
      @NotNull

    public Object getVersion() {
    return version;
  }

  public void setVersion(Object version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceSecurityTrailerSignedData poipoiIdfinancialServiceSecurityTrailerSignedData = (PoipoiIdfinancialServiceSecurityTrailerSignedData) o;
    return Objects.equals(this.certificate, poipoiIdfinancialServiceSecurityTrailerSignedData.certificate) &&
        Objects.equals(this.digestAlgorithm, poipoiIdfinancialServiceSecurityTrailerSignedData.digestAlgorithm) &&
        Objects.equals(this.encapsulatedContent, poipoiIdfinancialServiceSecurityTrailerSignedData.encapsulatedContent) &&
        Objects.equals(this.signer, poipoiIdfinancialServiceSecurityTrailerSignedData.signer) &&
        Objects.equals(this.version, poipoiIdfinancialServiceSecurityTrailerSignedData.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, digestAlgorithm, encapsulatedContent, signer, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceSecurityTrailerSignedData {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    digestAlgorithm: ").append(toIndentedString(digestAlgorithm)).append("\n");
    sb.append("    encapsulatedContent: ").append(toIndentedString(encapsulatedContent)).append("\n");
    sb.append("    signer: ").append(toIndentedString(signer)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
