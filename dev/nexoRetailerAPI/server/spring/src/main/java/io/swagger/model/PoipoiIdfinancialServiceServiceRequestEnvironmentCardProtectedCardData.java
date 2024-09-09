package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * General cryptographic message syntax (CMS) containing encrypted data.&lt;br/&gt;
 */
@Schema(description = "General cryptographic message syntax (CMS) containing encrypted data.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData   {
  @JsonProperty("ContentType")
  private Object contentType = null;

  @JsonProperty("EnvelopedData")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData envelopedData = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData contentType(Object contentType) {
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData envelopedData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData envelopedData) {
    this.envelopedData = envelopedData;
    return this;
  }

  /**
   * Get envelopedData
   * @return envelopedData
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData getEnvelopedData() {
    return envelopedData;
  }

  public void setEnvelopedData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData envelopedData) {
    this.envelopedData = envelopedData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData = (PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData) o;
    return Objects.equals(this.contentType, poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData.contentType) &&
        Objects.equals(this.envelopedData, poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData.envelopedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, envelopedData);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
