package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
  * Digital signatures of data from one or several signers.<br/>
 **/
@Schema(description="Digital signatures of data from one or several signers.<br/>")
public class PoipoiIdfinancialServiceSecurityTrailerSignedData   {
  
  @Schema(description = "Chain of X.509 certificates.")
 /**
   * Chain of X.509 certificates.  
  **/
  private Object certificate = null;
  
  @Schema(description = "Identification of digest algorithm applied before signature.")
 /**
   * Identification of digest algorithm applied before signature.  
  **/
  private Object digestAlgorithm = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent encapsulatedContent = null;
  
  @Schema(description = "Digital signature and identification of a signer.")
 /**
   * Digital signature and identification of a signer.  
  **/
  private Object signer = null;
  
  @Schema(example = "123456789012345678", description = "Number of objects represented as an integer.<br/>")
 /**
   * Number of objects represented as an integer.<br/>  
  **/
  private Object version = null;
 /**
   * Chain of X.509 certificates.
   * @return certificate
  **/
  @JsonProperty("Certificate")
  @NotNull
  public Object getCertificate() {
    return certificate;
  }

  public void setCertificate(Object certificate) {
    this.certificate = certificate;
  }

  public PoipoiIdfinancialServiceSecurityTrailerSignedData certificate(Object certificate) {
    this.certificate = certificate;
    return this;
  }

 /**
   * Identification of digest algorithm applied before signature.
   * @return digestAlgorithm
  **/
  @JsonProperty("DigestAlgorithm")
  @NotNull
  public Object getDigestAlgorithm() {
    return digestAlgorithm;
  }

  public void setDigestAlgorithm(Object digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
  }

  public PoipoiIdfinancialServiceSecurityTrailerSignedData digestAlgorithm(Object digestAlgorithm) {
    this.digestAlgorithm = digestAlgorithm;
    return this;
  }

 /**
   * Get encapsulatedContent
   * @return encapsulatedContent
  **/
  @JsonProperty("EncapsulatedContent")
  @NotNull
  public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent getEncapsulatedContent() {
    return encapsulatedContent;
  }

  public void setEncapsulatedContent(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent encapsulatedContent) {
    this.encapsulatedContent = encapsulatedContent;
  }

  public PoipoiIdfinancialServiceSecurityTrailerSignedData encapsulatedContent(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent encapsulatedContent) {
    this.encapsulatedContent = encapsulatedContent;
    return this;
  }

 /**
   * Digital signature and identification of a signer.
   * @return signer
  **/
  @JsonProperty("Signer")
  @NotNull
  public Object getSigner() {
    return signer;
  }

  public void setSigner(Object signer) {
    this.signer = signer;
  }

  public PoipoiIdfinancialServiceSecurityTrailerSignedData signer(Object signer) {
    this.signer = signer;
    return this;
  }

 /**
   * Number of objects represented as an integer.&lt;br/&gt;
   * @return version
  **/
  @JsonProperty("Version")
  @NotNull
  public Object getVersion() {
    return version;
  }

  public void setVersion(Object version) {
    this.version = version;
  }

  public PoipoiIdfinancialServiceSecurityTrailerSignedData version(Object version) {
    this.version = version;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
