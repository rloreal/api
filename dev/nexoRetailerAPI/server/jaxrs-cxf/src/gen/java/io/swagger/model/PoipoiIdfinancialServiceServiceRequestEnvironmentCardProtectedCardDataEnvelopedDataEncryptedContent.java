package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm;
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
  * Encrypted data with an encryption key.<br/>
 **/
@Schema(description="Encrypted data with an encryption key.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent   {
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm contentEncryptionAlgorithm = null;
  
  @Schema(example = "DATA", required = true, description = "Identification of the type of a Cryptographic Message Syntax (CMS) data structure.<br/>- **DATA: PlainData**  : *Generic, non cryptographic, or unqualified data content - (ASN.1 Object Identifier: id-data).*<br/>- **SIGN: SignedData**  : *Digital signature - (ASN.1 Object Identifier: id-signedData).*<br/>- **EVLP: EnvelopedData**  : *Encrypted data, with encryption key - (ASN.1 Object Identifier: id-envelopedData).*<br/>- **DGST: DigestedData**  : *Message digest - (ASN.1 Object Identifier: id-digestedData).*<br/>- **AUTH: AuthenticatedData**  : *MAC (Message Authentication Code), with encryption key - (ASN.1 Object Identifier: id-ct-authData).*<br/>")
 /**
   * Identification of the type of a Cryptographic Message Syntax (CMS) data structure.<br/>- **DATA: PlainData**  : *Generic, non cryptographic, or unqualified data content - (ASN.1 Object Identifier: id-data).*<br/>- **SIGN: SignedData**  : *Digital signature - (ASN.1 Object Identifier: id-signedData).*<br/>- **EVLP: EnvelopedData**  : *Encrypted data, with encryption key - (ASN.1 Object Identifier: id-envelopedData).*<br/>- **DGST: DigestedData**  : *Message digest - (ASN.1 Object Identifier: id-digestedData).*<br/>- **AUTH: AuthenticatedData**  : *MAC (Message Authentication Code), with encryption key - (ASN.1 Object Identifier: id-ct-authData).*<br/>  
  **/
  private Object contentType = null;
  
  @Schema(required = true, description = "Binary data of 100K maximum.<br/>")
 /**
   * Binary data of 100K maximum.<br/>  
  **/
  private Object encryptedData = null;
 /**
   * Get contentEncryptionAlgorithm
   * @return contentEncryptionAlgorithm
  **/
  @JsonProperty("ContentEncryptionAlgorithm")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm getContentEncryptionAlgorithm() {
    return contentEncryptionAlgorithm;
  }

  public void setContentEncryptionAlgorithm(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm contentEncryptionAlgorithm) {
    this.contentEncryptionAlgorithm = contentEncryptionAlgorithm;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent contentEncryptionAlgorithm(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithm contentEncryptionAlgorithm) {
    this.contentEncryptionAlgorithm = contentEncryptionAlgorithm;
    return this;
  }

 /**
   * Identification of the type of a Cryptographic Message Syntax (CMS) data structure.&lt;br/&gt;- **DATA: PlainData**  : *Generic, non cryptographic, or unqualified data content - (ASN.1 Object Identifier: id-data).*&lt;br/&gt;- **SIGN: SignedData**  : *Digital signature - (ASN.1 Object Identifier: id-signedData).*&lt;br/&gt;- **EVLP: EnvelopedData**  : *Encrypted data, with encryption key - (ASN.1 Object Identifier: id-envelopedData).*&lt;br/&gt;- **DGST: DigestedData**  : *Message digest - (ASN.1 Object Identifier: id-digestedData).*&lt;br/&gt;- **AUTH: AuthenticatedData**  : *MAC (Message Authentication Code), with encryption key - (ASN.1 Object Identifier: id-ct-authData).*&lt;br/&gt;
   * @return contentType
  **/
  @JsonProperty("ContentType")
  @NotNull
  public Object getContentType() {
    return contentType;
  }

  public void setContentType(Object contentType) {
    this.contentType = contentType;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent contentType(Object contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
   * Binary data of 100K maximum.&lt;br/&gt;
   * @return encryptedData
  **/
  @JsonProperty("EncryptedData")
  @NotNull
  public Object getEncryptedData() {
    return encryptedData;
  }

  public void setEncryptedData(Object encryptedData) {
    this.encryptedData = encryptedData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent encryptedData(Object encryptedData) {
    this.encryptedData = encryptedData;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
