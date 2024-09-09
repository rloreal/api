package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Encrypted data with an encryption key.&lt;br/&gt;
 */
@Schema(description = "Encrypted data with an encryption key.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent   {
  @JsonProperty("ContentEncryptionAlgorithm")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm contentEncryptionAlgorithm = null;

  @JsonProperty("ContentType")
  private Object contentType = null;

  @JsonProperty("EncryptedData")
  private Object encryptedData = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent contentEncryptionAlgorithm(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm contentEncryptionAlgorithm) {
    this.contentEncryptionAlgorithm = contentEncryptionAlgorithm;
    return this;
  }

  /**
   * Get contentEncryptionAlgorithm
   * @return contentEncryptionAlgorithm
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm getContentEncryptionAlgorithm() {
    return contentEncryptionAlgorithm;
  }

  public void setContentEncryptionAlgorithm(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm contentEncryptionAlgorithm) {
    this.contentEncryptionAlgorithm = contentEncryptionAlgorithm;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent contentType(Object contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Identification of the type of a Cryptographic Message Syntax (CMS) data structure.<br/>- **DATA: PlainData**  : *Generic, non cryptographic, or unqualified data content - (ASN.1 Object Identifier: id-data).*<br/>- **SIGN: SignedData**  : *Digital signature - (ASN.1 Object Identifier: id-signedData).*<br/>- **EVLP: EnvelopedData**  : *Encrypted data, with encryption key - (ASN.1 Object Identifier: id-envelopedData).*<br/>- **DGST: DigestedData**  : *Message digest - (ASN.1 Object Identifier: id-digestedData).*<br/>- **AUTH: AuthenticatedData**  : *MAC (Message Authentication Code), with encryption key - (ASN.1 Object Identifier: id-ct-authData).*<br/>
   * @return contentType
   **/
  @Schema(example = "DATA", required = true, description = "Identification of the type of a Cryptographic Message Syntax (CMS) data structure.<br/>- **DATA: PlainData**  : *Generic, non cryptographic, or unqualified data content - (ASN.1 Object Identifier: id-data).*<br/>- **SIGN: SignedData**  : *Digital signature - (ASN.1 Object Identifier: id-signedData).*<br/>- **EVLP: EnvelopedData**  : *Encrypted data, with encryption key - (ASN.1 Object Identifier: id-envelopedData).*<br/>- **DGST: DigestedData**  : *Message digest - (ASN.1 Object Identifier: id-digestedData).*<br/>- **AUTH: AuthenticatedData**  : *MAC (Message Authentication Code), with encryption key - (ASN.1 Object Identifier: id-ct-authData).*<br/>")
      @NotNull

    public Object getContentType() {
    return contentType;
  }

  public void setContentType(Object contentType) {
    this.contentType = contentType;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent encryptedData(Object encryptedData) {
    this.encryptedData = encryptedData;
    return this;
  }

  /**
   * Binary data of 100K maximum.<br/>
   * @return encryptedData
   **/
  @Schema(required = true, description = "Binary data of 100K maximum.<br/>")
      @NotNull

    public Object getEncryptedData() {
    return encryptedData;
  }

  public void setEncryptedData(Object encryptedData) {
    this.encryptedData = encryptedData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent = (PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent) o;
    return Objects.equals(this.contentEncryptionAlgorithm, poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent.contentEncryptionAlgorithm) &&
        Objects.equals(this.contentType, poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent.contentType) &&
        Objects.equals(this.encryptedData, poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent.encryptedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentEncryptionAlgorithm, contentType, encryptedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent {\n");
    
    sb.append("    contentEncryptionAlgorithm: ").append(toIndentedString(contentEncryptionAlgorithm)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    encryptedData: ").append(toIndentedString(encryptedData)).append("\n");
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
