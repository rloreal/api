package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Capabilities of the POI (Point Of Interaction) performing the transaction.&lt;br/&gt;
 */
@Schema(description = "Capabilities of the POI (Point Of Interaction) performing the transaction.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities   {
  @JsonProperty("ApprovalCodeLength")
  private Object approvalCodeLength = null;

  @JsonProperty("CardCaptureCapable")
  private Object cardCaptureCapable = null;

  @JsonProperty("CardReadingCapabilities")
  private Object cardReadingCapabilities = null;

  @JsonProperty("CardholderVerificationCapabilities")
  private Object cardholderVerificationCapabilities = null;

  @JsonProperty("MessageCapabilities")
  private Object messageCapabilities = null;

  @JsonProperty("MaxScriptLength")
  private Object maxScriptLength = null;

  @JsonProperty("OnLineCapabilities")
  private Object onLineCapabilities = null;

  @JsonProperty("PINLengthCapabilities")
  private Object piNLengthCapabilities = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities approvalCodeLength(Object approvalCodeLength) {
    this.approvalCodeLength = approvalCodeLength;
    return this;
  }

  /**
   * Number of objects represented as a positive integer.<br/>
   * @return approvalCodeLength
   **/
  @Schema(example = "123456789012345678", description = "Number of objects represented as a positive integer.<br/>")
      @NotNull

    public Object getApprovalCodeLength() {
    return approvalCodeLength;
  }

  public void setApprovalCodeLength(Object approvalCodeLength) {
    this.approvalCodeLength = approvalCodeLength;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities cardCaptureCapable(Object cardCaptureCapable) {
    this.cardCaptureCapable = cardCaptureCapable;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return cardCaptureCapable
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getCardCaptureCapable() {
    return cardCaptureCapable;
  }

  public void setCardCaptureCapable(Object cardCaptureCapable) {
    this.cardCaptureCapable = cardCaptureCapable;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities cardReadingCapabilities(Object cardReadingCapabilities) {
    this.cardReadingCapabilities = cardReadingCapabilities;
    return this;
  }

  /**
   * Card reading capabilities of the POI (Point Of Interaction) performing the transaction.
   * @return cardReadingCapabilities
   **/
  @Schema(description = "Card reading capabilities of the POI (Point Of Interaction) performing the transaction.")
      @NotNull

    public Object getCardReadingCapabilities() {
    return cardReadingCapabilities;
  }

  public void setCardReadingCapabilities(Object cardReadingCapabilities) {
    this.cardReadingCapabilities = cardReadingCapabilities;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities cardholderVerificationCapabilities(Object cardholderVerificationCapabilities) {
    this.cardholderVerificationCapabilities = cardholderVerificationCapabilities;
    return this;
  }

  /**
   * Cardholder verification capabilities of the POI (Point Of Interaction) performing the transaction.
   * @return cardholderVerificationCapabilities
   **/
  @Schema(description = "Cardholder verification capabilities of the POI (Point Of Interaction) performing the transaction.")
      @NotNull

    public Object getCardholderVerificationCapabilities() {
    return cardholderVerificationCapabilities;
  }

  public void setCardholderVerificationCapabilities(Object cardholderVerificationCapabilities) {
    this.cardholderVerificationCapabilities = cardholderVerificationCapabilities;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities messageCapabilities(Object messageCapabilities) {
    this.messageCapabilities = messageCapabilities;
    return this;
  }

  /**
   * Capabilities of the terminal to display or print message to the cardholder and the merchant.
   * @return messageCapabilities
   **/
  @Schema(description = "Capabilities of the terminal to display or print message to the cardholder and the merchant.")
      @NotNull

    public Object getMessageCapabilities() {
    return messageCapabilities;
  }

  public void setMessageCapabilities(Object messageCapabilities) {
    this.messageCapabilities = messageCapabilities;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities maxScriptLength(Object maxScriptLength) {
    this.maxScriptLength = maxScriptLength;
    return this;
  }

  /**
   * Number of objects represented as a positive integer.<br/>
   * @return maxScriptLength
   **/
  @Schema(example = "123456789012345678", description = "Number of objects represented as a positive integer.<br/>")
      @NotNull

    public Object getMaxScriptLength() {
    return maxScriptLength;
  }

  public void setMaxScriptLength(Object maxScriptLength) {
    this.maxScriptLength = maxScriptLength;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities onLineCapabilities(Object onLineCapabilities) {
    this.onLineCapabilities = onLineCapabilities;
    return this;
  }

  /**
   * On-line and off-line capabilities of the POI (Point Of Interaction).<br/>- **OFLN: OffLine**  : *Off-line only capable.*<br/>- **ONLN: OnLine**  : *On-line only capable.*<br/>- **SMON: SemiOffLine**  : *Off-line capable with possible on-line requests to the acquirer.*<br/>
   * @return onLineCapabilities
   **/
  @Schema(example = "OFLN", description = "On-line and off-line capabilities of the POI (Point Of Interaction).<br/>- **OFLN: OffLine**  : *Off-line only capable.*<br/>- **ONLN: OnLine**  : *On-line only capable.*<br/>- **SMON: SemiOffLine**  : *Off-line capable with possible on-line requests to the acquirer.*<br/>")
      @NotNull

    public Object getOnLineCapabilities() {
    return onLineCapabilities;
  }

  public void setOnLineCapabilities(Object onLineCapabilities) {
    this.onLineCapabilities = onLineCapabilities;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities piNLengthCapabilities(Object piNLengthCapabilities) {
    this.piNLengthCapabilities = piNLengthCapabilities;
    return this;
  }

  /**
   * Number of objects represented as a positive integer.<br/>
   * @return piNLengthCapabilities
   **/
  @Schema(example = "123456789012345678", description = "Number of objects represented as a positive integer.<br/>")
      @NotNull

    public Object getPiNLengthCapabilities() {
    return piNLengthCapabilities;
  }

  public void setPiNLengthCapabilities(Object piNLengthCapabilities) {
    this.piNLengthCapabilities = piNLengthCapabilities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities poipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities = (PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities) o;
    return Objects.equals(this.approvalCodeLength, poipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities.approvalCodeLength) &&
        Objects.equals(this.cardCaptureCapable, poipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities.cardCaptureCapable) &&
        Objects.equals(this.cardReadingCapabilities, poipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities.cardReadingCapabilities) &&
        Objects.equals(this.cardholderVerificationCapabilities, poipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities.cardholderVerificationCapabilities) &&
        Objects.equals(this.messageCapabilities, poipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities.messageCapabilities) &&
        Objects.equals(this.maxScriptLength, poipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities.maxScriptLength) &&
        Objects.equals(this.onLineCapabilities, poipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities.onLineCapabilities) &&
        Objects.equals(this.piNLengthCapabilities, poipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities.piNLengthCapabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalCodeLength, cardCaptureCapable, cardReadingCapabilities, cardholderVerificationCapabilities, messageCapabilities, maxScriptLength, onLineCapabilities, piNLengthCapabilities);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
