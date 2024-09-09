package io.swagger.model;

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
  * Capabilities of the POI (Point Of Interaction) performing the transaction.<br/>
 **/
@Schema(description="Capabilities of the POI (Point Of Interaction) performing the transaction.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities   {
  
  @Schema(example = "123456789012345678", description = "Number of objects represented as a positive integer.<br/>")
 /**
   * Number of objects represented as a positive integer.<br/>  
  **/
  private Object approvalCodeLength = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object cardCaptureCapable = null;
  
  @Schema(description = "Card reading capabilities of the POI (Point Of Interaction) performing the transaction.")
 /**
   * Card reading capabilities of the POI (Point Of Interaction) performing the transaction.  
  **/
  private Object cardReadingCapabilities = null;
  
  @Schema(description = "Cardholder verification capabilities of the POI (Point Of Interaction) performing the transaction.")
 /**
   * Cardholder verification capabilities of the POI (Point Of Interaction) performing the transaction.  
  **/
  private Object cardholderVerificationCapabilities = null;
  
  @Schema(description = "Capabilities of the terminal to display or print message to the cardholder and the merchant.")
 /**
   * Capabilities of the terminal to display or print message to the cardholder and the merchant.  
  **/
  private Object messageCapabilities = null;
  
  @Schema(example = "123456789012345678", description = "Number of objects represented as a positive integer.<br/>")
 /**
   * Number of objects represented as a positive integer.<br/>  
  **/
  private Object maxScriptLength = null;
  
  @Schema(example = "OFLN", description = "On-line and off-line capabilities of the POI (Point Of Interaction).<br/>- **OFLN: OffLine**  : *Off-line only capable.*<br/>- **ONLN: OnLine**  : *On-line only capable.*<br/>- **SMON: SemiOffLine**  : *Off-line capable with possible on-line requests to the acquirer.*<br/>")
 /**
   * On-line and off-line capabilities of the POI (Point Of Interaction).<br/>- **OFLN: OffLine**  : *Off-line only capable.*<br/>- **ONLN: OnLine**  : *On-line only capable.*<br/>- **SMON: SemiOffLine**  : *Off-line capable with possible on-line requests to the acquirer.*<br/>  
  **/
  private Object onLineCapabilities = null;
  
  @Schema(example = "123456789012345678", description = "Number of objects represented as a positive integer.<br/>")
 /**
   * Number of objects represented as a positive integer.<br/>  
  **/
  private Object piNLengthCapabilities = null;
 /**
   * Number of objects represented as a positive integer.&lt;br/&gt;
   * @return approvalCodeLength
  **/
  @JsonProperty("ApprovalCodeLength")
  @NotNull
  public Object getApprovalCodeLength() {
    return approvalCodeLength;
  }

  public void setApprovalCodeLength(Object approvalCodeLength) {
    this.approvalCodeLength = approvalCodeLength;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities approvalCodeLength(Object approvalCodeLength) {
    this.approvalCodeLength = approvalCodeLength;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return cardCaptureCapable
  **/
  @JsonProperty("CardCaptureCapable")
  @NotNull
  public Object getCardCaptureCapable() {
    return cardCaptureCapable;
  }

  public void setCardCaptureCapable(Object cardCaptureCapable) {
    this.cardCaptureCapable = cardCaptureCapable;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities cardCaptureCapable(Object cardCaptureCapable) {
    this.cardCaptureCapable = cardCaptureCapable;
    return this;
  }

 /**
   * Card reading capabilities of the POI (Point Of Interaction) performing the transaction.
   * @return cardReadingCapabilities
  **/
  @JsonProperty("CardReadingCapabilities")
  @NotNull
  public Object getCardReadingCapabilities() {
    return cardReadingCapabilities;
  }

  public void setCardReadingCapabilities(Object cardReadingCapabilities) {
    this.cardReadingCapabilities = cardReadingCapabilities;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities cardReadingCapabilities(Object cardReadingCapabilities) {
    this.cardReadingCapabilities = cardReadingCapabilities;
    return this;
  }

 /**
   * Cardholder verification capabilities of the POI (Point Of Interaction) performing the transaction.
   * @return cardholderVerificationCapabilities
  **/
  @JsonProperty("CardholderVerificationCapabilities")
  @NotNull
  public Object getCardholderVerificationCapabilities() {
    return cardholderVerificationCapabilities;
  }

  public void setCardholderVerificationCapabilities(Object cardholderVerificationCapabilities) {
    this.cardholderVerificationCapabilities = cardholderVerificationCapabilities;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities cardholderVerificationCapabilities(Object cardholderVerificationCapabilities) {
    this.cardholderVerificationCapabilities = cardholderVerificationCapabilities;
    return this;
  }

 /**
   * Capabilities of the terminal to display or print message to the cardholder and the merchant.
   * @return messageCapabilities
  **/
  @JsonProperty("MessageCapabilities")
  @NotNull
  public Object getMessageCapabilities() {
    return messageCapabilities;
  }

  public void setMessageCapabilities(Object messageCapabilities) {
    this.messageCapabilities = messageCapabilities;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities messageCapabilities(Object messageCapabilities) {
    this.messageCapabilities = messageCapabilities;
    return this;
  }

 /**
   * Number of objects represented as a positive integer.&lt;br/&gt;
   * @return maxScriptLength
  **/
  @JsonProperty("MaxScriptLength")
  @NotNull
  public Object getMaxScriptLength() {
    return maxScriptLength;
  }

  public void setMaxScriptLength(Object maxScriptLength) {
    this.maxScriptLength = maxScriptLength;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities maxScriptLength(Object maxScriptLength) {
    this.maxScriptLength = maxScriptLength;
    return this;
  }

 /**
   * On-line and off-line capabilities of the POI (Point Of Interaction).&lt;br/&gt;- **OFLN: OffLine**  : *Off-line only capable.*&lt;br/&gt;- **ONLN: OnLine**  : *On-line only capable.*&lt;br/&gt;- **SMON: SemiOffLine**  : *Off-line capable with possible on-line requests to the acquirer.*&lt;br/&gt;
   * @return onLineCapabilities
  **/
  @JsonProperty("OnLineCapabilities")
  @NotNull
  public Object getOnLineCapabilities() {
    return onLineCapabilities;
  }

  public void setOnLineCapabilities(Object onLineCapabilities) {
    this.onLineCapabilities = onLineCapabilities;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities onLineCapabilities(Object onLineCapabilities) {
    this.onLineCapabilities = onLineCapabilities;
    return this;
  }

 /**
   * Number of objects represented as a positive integer.&lt;br/&gt;
   * @return piNLengthCapabilities
  **/
  @JsonProperty("PINLengthCapabilities")
  @NotNull
  public Object getPiNLengthCapabilities() {
    return piNLengthCapabilities;
  }

  public void setPiNLengthCapabilities(Object piNLengthCapabilities) {
    this.piNLengthCapabilities = piNLengthCapabilities;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities piNLengthCapabilities(Object piNLengthCapabilities) {
    this.piNLengthCapabilities = piNLengthCapabilities;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities {\n");
    
    sb.append("    approvalCodeLength: ").append(toIndentedString(approvalCodeLength)).append("\n");
    sb.append("    cardCaptureCapable: ").append(toIndentedString(cardCaptureCapable)).append("\n");
    sb.append("    cardReadingCapabilities: ").append(toIndentedString(cardReadingCapabilities)).append("\n");
    sb.append("    cardholderVerificationCapabilities: ").append(toIndentedString(cardholderVerificationCapabilities)).append("\n");
    sb.append("    messageCapabilities: ").append(toIndentedString(messageCapabilities)).append("\n");
    sb.append("    maxScriptLength: ").append(toIndentedString(maxScriptLength)).append("\n");
    sb.append("    onLineCapabilities: ").append(toIndentedString(onLineCapabilities)).append("\n");
    sb.append("    piNLengthCapabilities: ").append(toIndentedString(piNLengthCapabilities)).append("\n");
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
