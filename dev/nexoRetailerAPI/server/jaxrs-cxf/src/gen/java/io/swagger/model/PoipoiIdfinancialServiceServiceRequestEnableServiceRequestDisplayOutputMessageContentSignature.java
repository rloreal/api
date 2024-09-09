package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData;
import io.swagger.model.PoipoiIdfinancialServiceSecurityTrailerSignedData;
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
  * General cryptographic message syntax (CMS) containing data. protected by a MAC or a digital signature.<br/>
 **/
@Schema(description="General cryptographic message syntax (CMS) containing data. protected by a MAC or a digital signature.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature   {
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData authenticatedData = null;
  
  @Schema(example = "DATA", required = true, description = "Identification of the type of a Cryptographic Message Syntax (CMS) data structure.<br/>- **DATA: PlainData**  : *Generic, non cryptographic, or unqualified data content - (ASN.1 Object Identifier: id-data).*<br/>- **SIGN: SignedData**  : *Digital signature - (ASN.1 Object Identifier: id-signedData).*<br/>- **EVLP: EnvelopedData**  : *Encrypted data, with encryption key - (ASN.1 Object Identifier: id-envelopedData).*<br/>- **DGST: DigestedData**  : *Message digest - (ASN.1 Object Identifier: id-digestedData).*<br/>- **AUTH: AuthenticatedData**  : *MAC (Message Authentication Code), with encryption key - (ASN.1 Object Identifier: id-ct-authData).*<br/>")
 /**
   * Identification of the type of a Cryptographic Message Syntax (CMS) data structure.<br/>- **DATA: PlainData**  : *Generic, non cryptographic, or unqualified data content - (ASN.1 Object Identifier: id-data).*<br/>- **SIGN: SignedData**  : *Digital signature - (ASN.1 Object Identifier: id-signedData).*<br/>- **EVLP: EnvelopedData**  : *Encrypted data, with encryption key - (ASN.1 Object Identifier: id-envelopedData).*<br/>- **DGST: DigestedData**  : *Message digest - (ASN.1 Object Identifier: id-digestedData).*<br/>- **AUTH: AuthenticatedData**  : *MAC (Message Authentication Code), with encryption key - (ASN.1 Object Identifier: id-ct-authData).*<br/>  
  **/
  private Object contentType = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceSecurityTrailerSignedData signedData = null;
 /**
   * Get authenticatedData
   * @return authenticatedData
  **/
  @JsonProperty("AuthenticatedData")
  @NotNull
  public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData getAuthenticatedData() {
    return authenticatedData;
  }

  public void setAuthenticatedData(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData authenticatedData) {
    this.authenticatedData = authenticatedData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature authenticatedData(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData authenticatedData) {
    this.authenticatedData = authenticatedData;
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

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature contentType(Object contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
   * Get signedData
   * @return signedData
  **/
  @JsonProperty("SignedData")
  @NotNull
  public PoipoiIdfinancialServiceSecurityTrailerSignedData getSignedData() {
    return signedData;
  }

  public void setSignedData(PoipoiIdfinancialServiceSecurityTrailerSignedData signedData) {
    this.signedData = signedData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature signedData(PoipoiIdfinancialServiceSecurityTrailerSignedData signedData) {
    this.signedData = signedData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputMessageContentSignature {\n");
    
    sb.append("    authenticatedData: ").append(toIndentedString(authenticatedData)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    signedData: ").append(toIndentedString(signedData)).append("\n");
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
