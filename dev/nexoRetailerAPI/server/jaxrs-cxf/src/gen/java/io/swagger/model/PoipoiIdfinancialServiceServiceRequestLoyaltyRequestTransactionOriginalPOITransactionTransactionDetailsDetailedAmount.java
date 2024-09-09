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
  * Detailed amounts associated with the total amount of transaction.<br/>
 **/
@Schema(description="Detailed amounts associated with the total amount of transaction.<br/>")
public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount   {
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object amountGoodsAndServices = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object cashBack = null;
  
  @Schema(description = "Fees amount.")
 /**
   * Fees amount.  
  **/
  private Object fees = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object gratuity = null;
  
  @Schema(description = "Global rebate of the transaction. This amount is counted as a negative amount.")
 /**
   * Global rebate of the transaction. This amount is counted as a negative amount.  
  **/
  private Object rebate = null;
  
  @Schema(description = "Additional charge paid by the cardholder. For example airline credit card surcharge.")
 /**
   * Additional charge paid by the cardholder. For example airline credit card surcharge.  
  **/
  private Object surcharge = null;
  
  @Schema(description = "Value added tax amount.")
 /**
   * Value added tax amount.  
  **/
  private Object valueAddedTax = null;
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return amountGoodsAndServices
  **/
  @JsonProperty("AmountGoodsAndServices")
  @NotNull
  public Object getAmountGoodsAndServices() {
    return amountGoodsAndServices;
  }

  public void setAmountGoodsAndServices(Object amountGoodsAndServices) {
    this.amountGoodsAndServices = amountGoodsAndServices;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount amountGoodsAndServices(Object amountGoodsAndServices) {
    this.amountGoodsAndServices = amountGoodsAndServices;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return cashBack
  **/
  @JsonProperty("CashBack")
  @NotNull
  public Object getCashBack() {
    return cashBack;
  }

  public void setCashBack(Object cashBack) {
    this.cashBack = cashBack;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount cashBack(Object cashBack) {
    this.cashBack = cashBack;
    return this;
  }

 /**
   * Fees amount.
   * @return fees
  **/
  @JsonProperty("Fees")
  @NotNull
  public Object getFees() {
    return fees;
  }

  public void setFees(Object fees) {
    this.fees = fees;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount fees(Object fees) {
    this.fees = fees;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return gratuity
  **/
  @JsonProperty("Gratuity")
  @NotNull
  public Object getGratuity() {
    return gratuity;
  }

  public void setGratuity(Object gratuity) {
    this.gratuity = gratuity;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount gratuity(Object gratuity) {
    this.gratuity = gratuity;
    return this;
  }

 /**
   * Global rebate of the transaction. This amount is counted as a negative amount.
   * @return rebate
  **/
  @JsonProperty("Rebate")
  @NotNull
  public Object getRebate() {
    return rebate;
  }

  public void setRebate(Object rebate) {
    this.rebate = rebate;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount rebate(Object rebate) {
    this.rebate = rebate;
    return this;
  }

 /**
   * Additional charge paid by the cardholder. For example airline credit card surcharge.
   * @return surcharge
  **/
  @JsonProperty("Surcharge")
  @NotNull
  public Object getSurcharge() {
    return surcharge;
  }

  public void setSurcharge(Object surcharge) {
    this.surcharge = surcharge;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount surcharge(Object surcharge) {
    this.surcharge = surcharge;
    return this;
  }

 /**
   * Value added tax amount.
   * @return valueAddedTax
  **/
  @JsonProperty("ValueAddedTax")
  @NotNull
  public Object getValueAddedTax() {
    return valueAddedTax;
  }

  public void setValueAddedTax(Object valueAddedTax) {
    this.valueAddedTax = valueAddedTax;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount valueAddedTax(Object valueAddedTax) {
    this.valueAddedTax = valueAddedTax;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
