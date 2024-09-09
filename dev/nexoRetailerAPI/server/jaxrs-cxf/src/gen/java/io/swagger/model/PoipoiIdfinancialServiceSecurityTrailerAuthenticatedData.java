package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent;
import io.swagger.model.PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm;
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
  * Message authentication code (MAC), computed on the data to protect with an encryption key.<br/>
 **/
@Schema(description="Message authentication code (MAC), computed on the data to protect with an encryption key.<br/>")
public class PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData   {
  
  @Schema(required = true, description = "Specifies a binary string with a maximum length of 140 binary bytes.<br/>")
 /**
   * Specifies a binary string with a maximum length of 140 binary bytes.<br/>  
  **/
  private Object MAC = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm maCAlgorithm = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent encapsulatedContent = null;
  
  @Schema(required = true, description = "Session key or protection key identification used by the recipient.")
 /**
   * Session key or protection key identification used by the recipient.  
  **/
  private Object recipient = null;
  
  @Schema(example = "123456789012345678", description = "Number of objects represented as an integer.<br/>")
 /**
   * Number of objects represented as an integer.<br/>  
  **/
  private Object version = null;
 /**
   * Specifies a binary string with a maximum length of 140 binary bytes.&lt;br/&gt;
   * @return MAC
  **/
  @JsonProperty("MAC")
  @NotNull
  public Object getMAC() {
    return MAC;
  }

  public void setMAC(Object MAC) {
    this.MAC = MAC;
  }

  public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData MAC(Object MAC) {
    this.MAC = MAC;
    return this;
  }

 /**
   * Get maCAlgorithm
   * @return maCAlgorithm
  **/
  @JsonProperty("MACAlgorithm")
  @NotNull
  public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm getMaCAlgorithm() {
    return maCAlgorithm;
  }

  public void setMaCAlgorithm(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm maCAlgorithm) {
    this.maCAlgorithm = maCAlgorithm;
  }

  public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData maCAlgorithm(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataMACAlgorithm maCAlgorithm) {
    this.maCAlgorithm = maCAlgorithm;
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

  public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData encapsulatedContent(PoipoiIdfinancialServiceSecurityTrailerAuthenticatedDataEncapsulatedContent encapsulatedContent) {
    this.encapsulatedContent = encapsulatedContent;
    return this;
  }

 /**
   * Session key or protection key identification used by the recipient.
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

  public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData recipient(Object recipient) {
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

  public PoipoiIdfinancialServiceSecurityTrailerAuthenticatedData version(Object version) {
    this.version = version;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
