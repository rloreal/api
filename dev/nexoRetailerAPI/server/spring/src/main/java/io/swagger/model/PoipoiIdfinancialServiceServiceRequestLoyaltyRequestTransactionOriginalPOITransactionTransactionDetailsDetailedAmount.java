package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Detailed amounts associated with the total amount of transaction.&lt;br/&gt;
 */
@Schema(description = "Detailed amounts associated with the total amount of transaction.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount   {
  @JsonProperty("AmountGoodsAndServices")
  private Object amountGoodsAndServices = null;

  @JsonProperty("CashBack")
  private Object cashBack = null;

  @JsonProperty("Fees")
  private Object fees = null;

  @JsonProperty("Gratuity")
  private Object gratuity = null;

  @JsonProperty("Rebate")
  private Object rebate = null;

  @JsonProperty("Surcharge")
  private Object surcharge = null;

  @JsonProperty("ValueAddedTax")
  private Object valueAddedTax = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount amountGoodsAndServices(Object amountGoodsAndServices) {
    this.amountGoodsAndServices = amountGoodsAndServices;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return amountGoodsAndServices
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getAmountGoodsAndServices() {
    return amountGoodsAndServices;
  }

  public void setAmountGoodsAndServices(Object amountGoodsAndServices) {
    this.amountGoodsAndServices = amountGoodsAndServices;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount cashBack(Object cashBack) {
    this.cashBack = cashBack;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return cashBack
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getCashBack() {
    return cashBack;
  }

  public void setCashBack(Object cashBack) {
    this.cashBack = cashBack;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount fees(Object fees) {
    this.fees = fees;
    return this;
  }

  /**
   * Fees amount.
   * @return fees
   **/
  @Schema(description = "Fees amount.")
      @NotNull

    public Object getFees() {
    return fees;
  }

  public void setFees(Object fees) {
    this.fees = fees;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount gratuity(Object gratuity) {
    this.gratuity = gratuity;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return gratuity
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getGratuity() {
    return gratuity;
  }

  public void setGratuity(Object gratuity) {
    this.gratuity = gratuity;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount rebate(Object rebate) {
    this.rebate = rebate;
    return this;
  }

  /**
   * Global rebate of the transaction. This amount is counted as a negative amount.
   * @return rebate
   **/
  @Schema(description = "Global rebate of the transaction. This amount is counted as a negative amount.")
      @NotNull

    public Object getRebate() {
    return rebate;
  }

  public void setRebate(Object rebate) {
    this.rebate = rebate;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount surcharge(Object surcharge) {
    this.surcharge = surcharge;
    return this;
  }

  /**
   * Additional charge paid by the cardholder. For example airline credit card surcharge.
   * @return surcharge
   **/
  @Schema(description = "Additional charge paid by the cardholder. For example airline credit card surcharge.")
      @NotNull

    public Object getSurcharge() {
    return surcharge;
  }

  public void setSurcharge(Object surcharge) {
    this.surcharge = surcharge;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount valueAddedTax(Object valueAddedTax) {
    this.valueAddedTax = valueAddedTax;
    return this;
  }

  /**
   * Value added tax amount.
   * @return valueAddedTax
   **/
  @Schema(description = "Value added tax amount.")
      @NotNull

    public Object getValueAddedTax() {
    return valueAddedTax;
  }

  public void setValueAddedTax(Object valueAddedTax) {
    this.valueAddedTax = valueAddedTax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount = (PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount) o;
    return Objects.equals(this.amountGoodsAndServices, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.amountGoodsAndServices) &&
        Objects.equals(this.cashBack, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.cashBack) &&
        Objects.equals(this.fees, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.fees) &&
        Objects.equals(this.gratuity, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.gratuity) &&
        Objects.equals(this.rebate, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.rebate) &&
        Objects.equals(this.surcharge, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.surcharge) &&
        Objects.equals(this.valueAddedTax, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount.valueAddedTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountGoodsAndServices, cashBack, fees, gratuity, rebate, surcharge, valueAddedTax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount {\n");
    
    sb.append("    amountGoodsAndServices: ").append(toIndentedString(amountGoodsAndServices)).append("\n");
    sb.append("    cashBack: ").append(toIndentedString(cashBack)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    gratuity: ").append(toIndentedString(gratuity)).append("\n");
    sb.append("    rebate: ").append(toIndentedString(rebate)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    valueAddedTax: ").append(toIndentedString(valueAddedTax)).append("\n");
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
