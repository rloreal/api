package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction;
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
  * Data related to the loyalty transaction.<br/>
 **/
@Schema(description="Data related to the loyalty transaction.<br/>")
public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction   {
  
  @Schema(example = "EUR", description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>")
 /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>  
  **/
  private Object currency = null;
  
  @Schema(required = true, description = "Type of loyalty transaction.<br/>- **AWRD: Award**  : *Direct or payment related award on a loyalty account. Award alone, award associated to a payment (may be with an additional award alone), award because of  a payment resulting on rebates.*<br/>- **AWRR: AwardRefund**  : *Refund of a loyalty award transaction.*<br/>- **REBR: RebateRefund**  : *Refund of a loyalty rebate transaction.*<br/>- **REBA: Rebate**  : *Rebate on a total amount, sale item amount, or sale items.*<br/>- **REDE: Redemption**  : *Redemption on a loyalty account.*<br/>- **REDR: RedemptionRefund**  : *Refund of a loyalty redemption transaction.*<br/>")
 /**
   * Type of loyalty transaction.<br/>- **AWRD: Award**  : *Direct or payment related award on a loyalty account. Award alone, award associated to a payment (may be with an additional award alone), award because of  a payment resulting on rebates.*<br/>- **AWRR: AwardRefund**  : *Refund of a loyalty award transaction.*<br/>- **REBR: RebateRefund**  : *Refund of a loyalty rebate transaction.*<br/>- **REBA: Rebate**  : *Rebate on a total amount, sale item amount, or sale items.*<br/>- **REDE: Redemption**  : *Redemption on a loyalty account.*<br/>- **REDR: RedemptionRefund**  : *Refund of a loyalty redemption transaction.*<br/>  
  **/
  private Object loyaltyTransactionType = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction originalPOITransaction = null;
  
  @Schema(description = "Item purchased with the transaction.")
 /**
   * Item purchased with the transaction.  
  **/
  private Object saleItem = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object totalAmount = null;
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

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction currency(Object currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Type of loyalty transaction.&lt;br/&gt;- **AWRD: Award**  : *Direct or payment related award on a loyalty account. Award alone, award associated to a payment (may be with an additional award alone), award because of  a payment resulting on rebates.*&lt;br/&gt;- **AWRR: AwardRefund**  : *Refund of a loyalty award transaction.*&lt;br/&gt;- **REBR: RebateRefund**  : *Refund of a loyalty rebate transaction.*&lt;br/&gt;- **REBA: Rebate**  : *Rebate on a total amount, sale item amount, or sale items.*&lt;br/&gt;- **REDE: Redemption**  : *Redemption on a loyalty account.*&lt;br/&gt;- **REDR: RedemptionRefund**  : *Refund of a loyalty redemption transaction.*&lt;br/&gt;
   * @return loyaltyTransactionType
  **/
  @JsonProperty("LoyaltyTransactionType")
  @NotNull
  public Object getLoyaltyTransactionType() {
    return loyaltyTransactionType;
  }

  public void setLoyaltyTransactionType(Object loyaltyTransactionType) {
    this.loyaltyTransactionType = loyaltyTransactionType;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction loyaltyTransactionType(Object loyaltyTransactionType) {
    this.loyaltyTransactionType = loyaltyTransactionType;
    return this;
  }

 /**
   * Get originalPOITransaction
   * @return originalPOITransaction
  **/
  @JsonProperty("OriginalPOITransaction")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction getOriginalPOITransaction() {
    return originalPOITransaction;
  }

  public void setOriginalPOITransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction originalPOITransaction) {
    this.originalPOITransaction = originalPOITransaction;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction originalPOITransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction originalPOITransaction) {
    this.originalPOITransaction = originalPOITransaction;
    return this;
  }

 /**
   * Item purchased with the transaction.
   * @return saleItem
  **/
  @JsonProperty("SaleItem")
  @NotNull
  public Object getSaleItem() {
    return saleItem;
  }

  public void setSaleItem(Object saleItem) {
    this.saleItem = saleItem;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction saleItem(Object saleItem) {
    this.saleItem = saleItem;
    return this;
  }

 /**
   * Get saleTransactionIdentification
   * @return saleTransactionIdentification
  **/
  @JsonProperty("SaleTransactionIdentification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getSaleTransactionIdentification() {
    return saleTransactionIdentification;
  }

  public void setSaleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction saleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return totalAmount
  **/
  @JsonProperty("TotalAmount")
  @NotNull
  public Object getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Object totalAmount) {
    this.totalAmount = totalAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction totalAmount(Object totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    loyaltyTransactionType: ").append(toIndentedString(loyaltyTransactionType)).append("\n");
    sb.append("    originalPOITransaction: ").append(toIndentedString(originalPOITransaction)).append("\n");
    sb.append("    saleItem: ").append(toIndentedString(saleItem)).append("\n");
    sb.append("    saleTransactionIdentification: ").append(toIndentedString(saleTransactionIdentification)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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
