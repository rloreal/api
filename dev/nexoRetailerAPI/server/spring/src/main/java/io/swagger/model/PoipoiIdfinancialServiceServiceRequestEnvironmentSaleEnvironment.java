package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Environment of Retailer for this message.&lt;br/&gt;
 */
@Schema(description = "Environment of Retailer for this message.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment   {
  @JsonProperty("Currency")
  private Object currency = null;

  @JsonProperty("DebitPreferredFlag")
  private Object debitPreferredFlag = null;

  @JsonProperty("LoyaltyHandling")
  private Object loyaltyHandling = null;

  @JsonProperty("MaximumCashBackAmount")
  private Object maximumCashBackAmount = null;

  @JsonProperty("MinimumAmountToDeliver")
  private Object minimumAmountToDeliver = null;

  @JsonProperty("MinimumSplitAmount")
  private Object minimumSplitAmount = null;

  @JsonProperty("SaleCapabilities")
  private Object saleCapabilities = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment currency(Object currency) {
    this.currency = currency;
    return this;
  }

  /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>
   * @return currency
   **/
  @Schema(example = "EUR", description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>")
      @NotNull

    public Object getCurrency() {
    return currency;
  }

  public void setCurrency(Object currency) {
    this.currency = currency;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment debitPreferredFlag(Object debitPreferredFlag) {
    this.debitPreferredFlag = debitPreferredFlag;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return debitPreferredFlag
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getDebitPreferredFlag() {
    return debitPreferredFlag;
  }

  public void setDebitPreferredFlag(Object debitPreferredFlag) {
    this.debitPreferredFlag = debitPreferredFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment loyaltyHandling(Object loyaltyHandling) {
    this.loyaltyHandling = loyaltyHandling;
    return this;
  }

  /**
   * Possible types of Loyalty processing.<br/>- **ALLO: Allowed**  : *The loyalty is accepted, but the POI has not to require or ask a loyalty card. The loyalty is involved by the payment card (e.g. an hybrid or linked card). *<br/>- **DENY: Forbidden**  : *No loyalty card to read and loyalty transaction to process.  Any attempt to enter a pure loyalty card is rejected.*<br/>- **PRCS: Processed**  : *The loyalty transaction is already processed, no loyalty card or loyalty transaction to process.*<br/>- **PROP: Proposed**  : *The loyalty is accepted, and the POI has to ask a loyalty card. If the Customer does not enter a loyalty card, no loyalty transaction is realised.*<br/>- **REQU: Required**  : *The loyalty is required, and the POI refuses the processing  of the message request if the cardholder does not enter a loyalty card.*<br/>
   * @return loyaltyHandling
   **/
  @Schema(description = "Possible types of Loyalty processing.<br/>- **ALLO: Allowed**  : *The loyalty is accepted, but the POI has not to require or ask a loyalty card. The loyalty is involved by the payment card (e.g. an hybrid or linked card). *<br/>- **DENY: Forbidden**  : *No loyalty card to read and loyalty transaction to process.  Any attempt to enter a pure loyalty card is rejected.*<br/>- **PRCS: Processed**  : *The loyalty transaction is already processed, no loyalty card or loyalty transaction to process.*<br/>- **PROP: Proposed**  : *The loyalty is accepted, and the POI has to ask a loyalty card. If the Customer does not enter a loyalty card, no loyalty transaction is realised.*<br/>- **REQU: Required**  : *The loyalty is required, and the POI refuses the processing  of the message request if the cardholder does not enter a loyalty card.*<br/>")
      @NotNull

    public Object getLoyaltyHandling() {
    return loyaltyHandling;
  }

  public void setLoyaltyHandling(Object loyaltyHandling) {
    this.loyaltyHandling = loyaltyHandling;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment maximumCashBackAmount(Object maximumCashBackAmount) {
    this.maximumCashBackAmount = maximumCashBackAmount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return maximumCashBackAmount
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getMaximumCashBackAmount() {
    return maximumCashBackAmount;
  }

  public void setMaximumCashBackAmount(Object maximumCashBackAmount) {
    this.maximumCashBackAmount = maximumCashBackAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment minimumAmountToDeliver(Object minimumAmountToDeliver) {
    this.minimumAmountToDeliver = minimumAmountToDeliver;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return minimumAmountToDeliver
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getMinimumAmountToDeliver() {
    return minimumAmountToDeliver;
  }

  public void setMinimumAmountToDeliver(Object minimumAmountToDeliver) {
    this.minimumAmountToDeliver = minimumAmountToDeliver;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment minimumSplitAmount(Object minimumSplitAmount) {
    this.minimumSplitAmount = minimumSplitAmount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return minimumSplitAmount
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getMinimumSplitAmount() {
    return minimumSplitAmount;
  }

  public void setMinimumSplitAmount(Object minimumSplitAmount) {
    this.minimumSplitAmount = minimumSplitAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment saleCapabilities(Object saleCapabilities) {
    this.saleCapabilities = saleCapabilities;
    return this;
  }

  /**
   * Capabilities of the Sale system.
   * @return saleCapabilities
   **/
  @Schema(description = "Capabilities of the Sale system.")
      @NotNull

    public Object getSaleCapabilities() {
    return saleCapabilities;
  }

  public void setSaleCapabilities(Object saleCapabilities) {
    this.saleCapabilities = saleCapabilities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment poipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment = (PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment) o;
    return Objects.equals(this.currency, poipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment.currency) &&
        Objects.equals(this.debitPreferredFlag, poipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment.debitPreferredFlag) &&
        Objects.equals(this.loyaltyHandling, poipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment.loyaltyHandling) &&
        Objects.equals(this.maximumCashBackAmount, poipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment.maximumCashBackAmount) &&
        Objects.equals(this.minimumAmountToDeliver, poipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment.minimumAmountToDeliver) &&
        Objects.equals(this.minimumSplitAmount, poipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment.minimumSplitAmount) &&
        Objects.equals(this.saleCapabilities, poipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment.saleCapabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, debitPreferredFlag, loyaltyHandling, maximumCashBackAmount, minimumAmountToDeliver, minimumSplitAmount, saleCapabilities);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
