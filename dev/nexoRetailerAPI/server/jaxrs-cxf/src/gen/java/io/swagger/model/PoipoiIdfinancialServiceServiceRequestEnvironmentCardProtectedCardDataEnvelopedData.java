package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation;
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
  * Encrypted data with encryption key.<br/>
 **/
@Schema(description="Encrypted data with encryption key.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData   {
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent encryptedContent = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation originatorInformation = null;
  
  @Schema(required = true, description = "Session key or identification of the protection key used by the recipient.")
 /**
   * Session key or identification of the protection key used by the recipient.  
  **/
  private Object recipient = null;
  
  @Schema(example = "123456789012345678", description = "Number of objects represented as an integer.<br/>")
 /**
   * Number of objects represented as an integer.<br/>  
  **/
  private Object version = null;
 /**
   * Get encryptedContent
   * @return encryptedContent
  **/
  @JsonProperty("EncryptedContent")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent getEncryptedContent() {
    return encryptedContent;
  }

  public void setEncryptedContent(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent encryptedContent) {
    this.encryptedContent = encryptedContent;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData encryptedContent(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContent encryptedContent) {
    this.encryptedContent = encryptedContent;
    return this;
  }

 /**
   * Get originatorInformation
   * @return originatorInformation
  **/
  @JsonProperty("OriginatorInformation")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation getOriginatorInformation() {
    return originatorInformation;
  }

  public void setOriginatorInformation(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation originatorInformation) {
    this.originatorInformation = originatorInformation;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData originatorInformation(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation originatorInformation) {
    this.originatorInformation = originatorInformation;
    return this;
  }

 /**
   * Session key or identification of the protection key used by the recipient.
   * @return recipient
  **/
  @JsonProperty("Recipient")
  @NotNull
  public Object getRecipient() {
    return recipient;
  }

  public void setRecipient(Object recipient) {
    this.recipient = recipient;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData recipient(Object recipient) {
    this.recipient = recipient;
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedData version(Object version) {
    this.version = version;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
