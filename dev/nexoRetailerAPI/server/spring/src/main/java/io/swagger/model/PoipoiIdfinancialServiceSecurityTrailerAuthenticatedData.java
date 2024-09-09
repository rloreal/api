package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent;
import io.swagger.model.PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Message authentication code (MAC), computed on the data to protect with an encryption key.&lt;br/&gt;
 */
@Schema(description = "Message authentication code (MAC), computed on the data to protect with an encryption key.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData   {
  @JsonProperty("MAC")
  private Object MAC = null;

  @JsonProperty("MACAlgorithm")
  private PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm maCAlgorithm = null;

  @JsonProperty("EncapsulatedContent")
  private PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent encapsulatedContent = null;

  @JsonProperty("Recipient")
  private Object recipient = null;

  @JsonProperty("Version")
  private Object version = null;

  public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData MAC(Object MAC) {
    this.MAC = MAC;
    return this;
  }

  /**
   * Specifies a binary string with a maximum length of 140 binary bytes.<br/>
   * @return MAC
   **/
  @Schema(required = true, description = "Specifies a binary string with a maximum length of 140 binary bytes.<br/>")
      @NotNull

    public Object getMAC() {
    return MAC;
  }

  public void setMAC(Object MAC) {
    this.MAC = MAC;
  }

  public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData maCAlgorithm(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm maCAlgorithm) {
    this.maCAlgorithm = maCAlgorithm;
    return this;
  }

  /**
   * Get maCAlgorithm
   * @return maCAlgorithm
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm getMaCAlgorithm() {
    return maCAlgorithm;
  }

  public void setMaCAlgorithm(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm maCAlgorithm) {
    this.maCAlgorithm = maCAlgorithm;
  }

  public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData encapsulatedContent(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent encapsulatedContent) {
    this.encapsulatedContent = encapsulatedContent;
    return this;
  }

  /**
   * Get encapsulatedContent
   * @return encapsulatedContent
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent getEncapsulatedContent() {
    return encapsulatedContent;
  }

  public void setEncapsulatedContent(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent encapsulatedContent) {
    this.encapsulatedContent = encapsulatedContent;
  }

  public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData recipient(Object recipient) {
    this.recipient = recipient;
    return this;
  }

  /**
   * Session key or protection key identification used by the recipient.
   * @return recipient
   **/
  @Schema(required = true, description = "Session key or protection key identification used by the recipient.")
      @NotNull

    public Object getRecipient() {
    return recipient;
  }

  public void setRecipient(Object recipient) {
    this.recipient = recipient;
  }

  public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData version(Object version) {
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
    PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData poipoiIdfinancialServiceSecurityTrailerAuthenticatedData = (PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData) o;
    return Objects.equals(this.MAC, poipoiIdfinancialServiceSecurityTrailerAuthenticatedData.MAC) &&
        Objects.equals(this.maCAlgorithm, poipoiIdfinancialServiceSecurityTrailerAuthenticatedData.maCAlgorithm) &&
        Objects.equals(this.encapsulatedContent, poipoiIdfinancialServiceSecurityTrailerAuthenticatedData.encapsulatedContent) &&
        Objects.equals(this.recipient, poipoiIdfinancialServiceSecurityTrailerAuthenticatedData.recipient) &&
        Objects.equals(this.version, poipoiIdfinancialServiceSecurityTrailerAuthenticatedData.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MAC, maCAlgorithm, encapsulatedContent, recipient, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData {\n");
    
    sb.append("    MAC: ").append(toIndentedString(MAC)).append("\n");
    sb.append("    maCAlgorithm: ").append(toIndentedString(maCAlgorithm)).append("\n");
    sb.append("    encapsulatedContent: ").append(toIndentedString(encapsulatedContent)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
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
