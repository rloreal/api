package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData;
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
  * General cryptographic message syntax (CMS) containing encrypted data.<br/>
 **/
@Schema(description="General cryptographic message syntax (CMS) containing encrypted data.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData   {
  
  @Schema(example = "DATA", required = true, description = "Identification of the type of a Cryptographic Message Syntax (CMS) data structure.<br/>- **DATA: PlainData**  : *Generic, non cryptographic, or unqualified data content - (ASN.1 Object Identifier: id-data).*<br/>- **SIGN: SignedData**  : *Digital signature - (ASN.1 Object Identifier: id-signedData).*<br/>- **EVLP: EnvelopedData**  : *Encrypted data, with encryption key - (ASN.1 Object Identifier: id-envelopedData).*<br/>- **DGST: DigestedData**  : *Message digest - (ASN.1 Object Identifier: id-digestedData).*<br/>- **AUTH: AuthenticatedData**  : *MAC (Message Authentication Code), with encryption key - (ASN.1 Object Identifier: id-ct-authData).*<br/>")
 /**
   * Identification of the type of a Cryptographic Message Syntax (CMS) data structure.<br/>- **DATA: PlainData**  : *Generic, non cryptographic, or unqualified data content - (ASN.1 Object Identifier: id-data).*<br/>- **SIGN: SignedData**  : *Digital signature - (ASN.1 Object Identifier: id-signedData).*<br/>- **EVLP: EnvelopedData**  : *Encrypted data, with encryption key - (ASN.1 Object Identifier: id-envelopedData).*<br/>- **DGST: DigestedData**  : *Message digest - (ASN.1 Object Identifier: id-digestedData).*<br/>- **AUTH: AuthenticatedData**  : *MAC (Message Authentication Code), with encryption key - (ASN.1 Object Identifier: id-ct-authData).*<br/>  
  **/
  private Object contentType = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData envelopedData = null;
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData contentType(Object contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
   * Get envelopedData
   * @return envelopedData
  **/
  @JsonProperty("EnvelopedData")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData getEnvelopedData() {
    return envelopedData;
  }

  public void setEnvelopedData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData envelopedData) {
    this.envelopedData = envelopedData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData envelopedData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData envelopedData) {
    this.envelopedData = envelopedData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    envelopedData: ").append(toIndentedString(envelopedData)).append("\n");
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
