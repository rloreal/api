package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Encrypted data with encryption key.&lt;br/&gt;
 */
@Schema(description = "Encrypted data with encryption key.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData   {
  @JsonProperty("EncryptedContent")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent encryptedContent = null;

  @JsonProperty("OriginatorInformation")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation originatorInformation = null;

  @JsonProperty("Recipient")
  private Object recipient = null;

  @JsonProperty("Version")
  private Object version = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData encryptedContent(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent encryptedContent) {
    this.encryptedContent = encryptedContent;
    return this;
  }

  /**
   * Get encryptedContent
   * @return encryptedContent
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent getEncryptedContent() {
    return encryptedContent;
  }

  public void setEncryptedContent(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent encryptedContent) {
    this.encryptedContent = encryptedContent;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData originatorInformation(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation originatorInformation) {
    this.originatorInformation = originatorInformation;
    return this;
  }

  /**
   * Get originatorInformation
   * @return originatorInformation
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation getOriginatorInformation() {
    return originatorInformation;
  }

  public void setOriginatorInformation(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation originatorInformation) {
    this.originatorInformation = originatorInformation;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData recipient(Object recipient) {
    this.recipient = recipient;
    return this;
  }

  /**
   * Session key or identification of the protection key used by the recipient.
   * @return recipient
   **/
  @Schema(required = true, description = "Session key or identification of the protection key used by the recipient.")
      @NotNull

    public Object getRecipient() {
    return recipient;
  }

  public void setRecipient(Object recipient) {
    this.recipient = recipient;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData version(Object version) {
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
    PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData = (PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData) o;
    return Objects.equals(this.encryptedContent, poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData.encryptedContent) &&
        Objects.equals(this.originatorInformation, poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData.originatorInformation) &&
        Objects.equals(this.recipient, poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData.recipient) &&
        Objects.equals(this.version, poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedContent, originatorInformation, recipient, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData {\n");
    
    sb.append("    encryptedContent: ").append(toIndentedString(encryptedContent)).append("\n");
    sb.append("    originatorInformation: ").append(toIndentedString(originatorInformation)).append("\n");
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
