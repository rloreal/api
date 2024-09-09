package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData;
import io.swagger.model.PoipoiIdfinancialServiceSecurityTrailerSignedData;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * General cryptographic message syntax (CMS) containing data. protected by a MAC or a digital signature.&lt;br/&gt;
 */
@Schema(description = "General cryptographic message syntax (CMS) containing data. protected by a MAC or a digital signature.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceSecurityTrailer   {
  @JsonProperty("AuthenticatedData")
  private PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData authenticatedData = null;

  @JsonProperty("ContentType")
  private Object contentType = null;

  @JsonProperty("SignedData")
  private PoipoiIdfinancialServiceSecurityTrailerSignedData signedData = null;

  public PoipoiIdfinancialServiceSecurityTrailer authenticatedData(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData authenticatedData) {
    this.authenticatedData = authenticatedData;
    return this;
  }

  /**
   * Get authenticatedData
   * @return authenticatedData
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData getAuthenticatedData() {
    return authenticatedData;
  }

  public void setAuthenticatedData(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData authenticatedData) {
    this.authenticatedData = authenticatedData;
  }

  public PoipoiIdfinancialServiceSecurityTrailer contentType(Object contentType) {
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

  public PoipoiIdfinancialServiceSecurityTrailer signedData(PoipoiIdfinancialServiceSecurityTrailerSignedData signedData) {
    this.signedData = signedData;
    return this;
  }

  /**
   * Get signedData
   * @return signedData
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceSecurityTrailerSignedData getSignedData() {
    return signedData;
  }

  public void setSignedData(PoipoiIdfinancialServiceSecurityTrailerSignedData signedData) {
    this.signedData = signedData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceSecurityTrailer poipoiIdfinancialServiceSecurityTrailer = (PoipoiIdfinancialServiceSecurityTrailer) o;
    return Objects.equals(this.authenticatedData, poipoiIdfinancialServiceSecurityTrailer.authenticatedData) &&
        Objects.equals(this.contentType, poipoiIdfinancialServiceSecurityTrailer.contentType) &&
        Objects.equals(this.signedData, poipoiIdfinancialServiceSecurityTrailer.signedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticatedData, contentType, signedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceSecurityTrailer {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
