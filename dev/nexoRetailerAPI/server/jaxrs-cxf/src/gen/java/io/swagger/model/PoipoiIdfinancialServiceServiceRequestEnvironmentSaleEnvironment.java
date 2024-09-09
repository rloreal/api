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
  * Environment of Retailer for this message.<br/>
 **/
@Schema(description="Environment of Retailer for this message.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment   {
  
  @Schema(example = "EUR", description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>")
 /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>  
  **/
  private Object currency = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object debitPreferredFlag = null;
  
  @Schema(description = "Possible types of Loyalty processing.<br/>- **ALLO: Allowed**  : *The loyalty is accepted, but the POI has not to require or ask a loyalty card. The loyalty is involved by the payment card (e.g. an hybrid or linked card). *<br/>- **DENY: Forbidden**  : *No loyalty card to read and loyalty transaction to process.  Any attempt to enter a pure loyalty card is rejected.*<br/>- **PRCS: Processed**  : *The loyalty transaction is already processed, no loyalty card or loyalty transaction to process.*<br/>- **PROP: Proposed**  : *The loyalty is accepted, and the POI has to ask a loyalty card. If the Customer does not enter a loyalty card, no loyalty transaction is realised.*<br/>- **REQU: Required**  : *The loyalty is required, and the POI refuses the processing  of the message request if the cardholder does not enter a loyalty card.*<br/>")
 /**
   * Possible types of Loyalty processing.<br/>- **ALLO: Allowed**  : *The loyalty is accepted, but the POI has not to require or ask a loyalty card. The loyalty is involved by the payment card (e.g. an hybrid or linked card). *<br/>- **DENY: Forbidden**  : *No loyalty card to read and loyalty transaction to process.  Any attempt to enter a pure loyalty card is rejected.*<br/>- **PRCS: Processed**  : *The loyalty transaction is already processed, no loyalty card or loyalty transaction to process.*<br/>- **PROP: Proposed**  : *The loyalty is accepted, and the POI has to ask a loyalty card. If the Customer does not enter a loyalty card, no loyalty transaction is realised.*<br/>- **REQU: Required**  : *The loyalty is required, and the POI refuses the processing  of the message request if the cardholder does not enter a loyalty card.*<br/>  
  **/
  private Object loyaltyHandling = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object maximumCashBackAmount = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object minimumAmountToDeliver = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object minimumSplitAmount = null;
  
  @Schema(description = "Capabilities of the Sale system.")
 /**
   * Capabilities of the Sale system.  
  **/
  private Object saleCapabilities = null;
 /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;.&lt;br/&gt;
   * @return currency
  **/
  @JsonProperty("Currency")
  @NotNull
  public Object getCurrency() {
    return currency;
  }

  public void setCurrency(Object currency) {
    this.currency = currency;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment currency(Object currency) {
    this.currency = currency;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return debitPreferredFlag
  **/
  @JsonProperty("DebitPreferredFlag")
  @NotNull
  public Object getDebitPreferredFlag() {
    return debitPreferredFlag;
  }

  public void setDebitPreferredFlag(Object debitPreferredFlag) {
    this.debitPreferredFlag = debitPreferredFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment debitPreferredFlag(Object debitPreferredFlag) {
    this.debitPreferredFlag = debitPreferredFlag;
    return this;
  }

 /**
   * Possible types of Loyalty processing.&lt;br/&gt;- **ALLO: Allowed**  : *The loyalty is accepted, but the POI has not to require or ask a loyalty card. The loyalty is involved by the payment card (e.g. an hybrid or linked card). *&lt;br/&gt;- **DENY: Forbidden**  : *No loyalty card to read and loyalty transaction to process.  Any attempt to enter a pure loyalty card is rejected.*&lt;br/&gt;- **PRCS: Processed**  : *The loyalty transaction is already processed, no loyalty card or loyalty transaction to process.*&lt;br/&gt;- **PROP: Proposed**  : *The loyalty is accepted, and the POI has to ask a loyalty card. If the Customer does not enter a loyalty card, no loyalty transaction is realised.*&lt;br/&gt;- **REQU: Required**  : *The loyalty is required, and the POI refuses the processing  of the message request if the cardholder does not enter a loyalty card.*&lt;br/&gt;
   * @return loyaltyHandling
  **/
  @JsonProperty("LoyaltyHandling")
  @NotNull
  public Object getLoyaltyHandling() {
    return loyaltyHandling;
  }

  public void setLoyaltyHandling(Object loyaltyHandling) {
    this.loyaltyHandling = loyaltyHandling;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment loyaltyHandling(Object loyaltyHandling) {
    this.loyaltyHandling = loyaltyHandling;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return maximumCashBackAmount
  **/
  @JsonProperty("MaximumCashBackAmount")
  @NotNull
  public Object getMaximumCashBackAmount() {
    return maximumCashBackAmount;
  }

  public void setMaximumCashBackAmount(Object maximumCashBackAmount) {
    this.maximumCashBackAmount = maximumCashBackAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment maximumCashBackAmount(Object maximumCashBackAmount) {
    this.maximumCashBackAmount = maximumCashBackAmount;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return minimumAmountToDeliver
  **/
  @JsonProperty("MinimumAmountToDeliver")
  @NotNull
  public Object getMinimumAmountToDeliver() {
    return minimumAmountToDeliver;
  }

  public void setMinimumAmountToDeliver(Object minimumAmountToDeliver) {
    this.minimumAmountToDeliver = minimumAmountToDeliver;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment minimumAmountToDeliver(Object minimumAmountToDeliver) {
    this.minimumAmountToDeliver = minimumAmountToDeliver;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return minimumSplitAmount
  **/
  @JsonProperty("MinimumSplitAmount")
  @NotNull
  public Object getMinimumSplitAmount() {
    return minimumSplitAmount;
  }

  public void setMinimumSplitAmount(Object minimumSplitAmount) {
    this.minimumSplitAmount = minimumSplitAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment minimumSplitAmount(Object minimumSplitAmount) {
    this.minimumSplitAmount = minimumSplitAmount;
    return this;
  }

 /**
   * Capabilities of the Sale system.
   * @return saleCapabilities
  **/
  @JsonProperty("SaleCapabilities")
  @NotNull
  public Object getSaleCapabilities() {
    return saleCapabilities;
  }

  public void setSaleCapabilities(Object saleCapabilities) {
    this.saleCapabilities = saleCapabilities;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment saleCapabilities(Object saleCapabilities) {
    this.saleCapabilities = saleCapabilities;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    debitPreferredFlag: ").append(toIndentedString(debitPreferredFlag)).append("\n");
    sb.append("    loyaltyHandling: ").append(toIndentedString(loyaltyHandling)).append("\n");
    sb.append("    maximumCashBackAmount: ").append(toIndentedString(maximumCashBackAmount)).append("\n");
    sb.append("    minimumAmountToDeliver: ").append(toIndentedString(minimumAmountToDeliver)).append("\n");
    sb.append("    minimumSplitAmount: ").append(toIndentedString(minimumSplitAmount)).append("\n");
    sb.append("    saleCapabilities: ").append(toIndentedString(saleCapabilities)).append("\n");
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
