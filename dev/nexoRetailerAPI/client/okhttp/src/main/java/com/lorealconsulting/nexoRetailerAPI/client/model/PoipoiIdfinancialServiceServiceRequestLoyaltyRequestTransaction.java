/*
 * nexo retailer API
 * API defining resources for interactions between POI and POS, using underlying nexo messages  ### Check out its awesome features:  * simply declare POS and POI * send requests to POI * monitor activity 😎 * Receive real-time information about transaction executions📈 
 *
 * OpenAPI spec version: 0.1.0
 * Contact: romain.loreal@lorealconsulting.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.lorealconsulting.nexoRetailerAPI.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Data related to the loyalty transaction.&lt;br/&gt;
 */
@Schema(description = "Data related to the loyalty transaction.<br/>")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-09T14:21:17.741236018+02:00[Europe/Paris]")

public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction {
  @SerializedName("Currency")
  private Object currency = null;

  @SerializedName("LoyaltyTransactionType")
  private Object loyaltyTransactionType = null;

  @SerializedName("OriginalPOITransaction")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction originalPOITransaction = null;

  @SerializedName("SaleItem")
  private Object saleItem = null;

  @SerializedName("SaleTransactionIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification = null;

  @SerializedName("TotalAmount")
  private Object totalAmount = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction currency(Object currency) {
    this.currency = currency;
    return this;
  }

   /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;.&lt;br/&gt;
   * @return currency
  **/
  @Schema(example = "EUR", description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>")
  public Object getCurrency() {
    return currency;
  }

  public void setCurrency(Object currency) {
    this.currency = currency;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction loyaltyTransactionType(Object loyaltyTransactionType) {
    this.loyaltyTransactionType = loyaltyTransactionType;
    return this;
  }

   /**
   * Type of loyalty transaction.&lt;br/&gt;- **AWRD: Award**  : *Direct or payment related award on a loyalty account. Award alone, award associated to a payment (may be with an additional award alone), award because of  a payment resulting on rebates.*&lt;br/&gt;- **AWRR: AwardRefund**  : *Refund of a loyalty award transaction.*&lt;br/&gt;- **REBR: RebateRefund**  : *Refund of a loyalty rebate transaction.*&lt;br/&gt;- **REBA: Rebate**  : *Rebate on a total amount, sale item amount, or sale items.*&lt;br/&gt;- **REDE: Redemption**  : *Redemption on a loyalty account.*&lt;br/&gt;- **REDR: RedemptionRefund**  : *Refund of a loyalty redemption transaction.*&lt;br/&gt;
   * @return loyaltyTransactionType
  **/
  @Schema(required = true, description = "Type of loyalty transaction.<br/>- **AWRD: Award**  : *Direct or payment related award on a loyalty account. Award alone, award associated to a payment (may be with an additional award alone), award because of  a payment resulting on rebates.*<br/>- **AWRR: AwardRefund**  : *Refund of a loyalty award transaction.*<br/>- **REBR: RebateRefund**  : *Refund of a loyalty rebate transaction.*<br/>- **REBA: Rebate**  : *Rebate on a total amount, sale item amount, or sale items.*<br/>- **REDE: Redemption**  : *Redemption on a loyalty account.*<br/>- **REDR: RedemptionRefund**  : *Refund of a loyalty redemption transaction.*<br/>")
  public Object getLoyaltyTransactionType() {
    return loyaltyTransactionType;
  }

  public void setLoyaltyTransactionType(Object loyaltyTransactionType) {
    this.loyaltyTransactionType = loyaltyTransactionType;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction originalPOITransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction originalPOITransaction) {
    this.originalPOITransaction = originalPOITransaction;
    return this;
  }

   /**
   * Get originalPOITransaction
   * @return originalPOITransaction
  **/
  @Schema(description = "")
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction getOriginalPOITransaction() {
    return originalPOITransaction;
  }

  public void setOriginalPOITransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction originalPOITransaction) {
    this.originalPOITransaction = originalPOITransaction;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction saleItem(Object saleItem) {
    this.saleItem = saleItem;
    return this;
  }

   /**
   * Item purchased with the transaction.
   * @return saleItem
  **/
  @Schema(description = "Item purchased with the transaction.")
  public Object getSaleItem() {
    return saleItem;
  }

  public void setSaleItem(Object saleItem) {
    this.saleItem = saleItem;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction saleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
    return this;
  }

   /**
   * Get saleTransactionIdentification
   * @return saleTransactionIdentification
  **/
  @Schema(description = "")
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getSaleTransactionIdentification() {
    return saleTransactionIdentification;
  }

  public void setSaleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction totalAmount(Object totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return totalAmount
  **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
  public Object getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Object totalAmount) {
    this.totalAmount = totalAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction = (PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction) o;
    return Objects.equals(this.currency, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction.currency) &&
        Objects.equals(this.loyaltyTransactionType, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction.loyaltyTransactionType) &&
        Objects.equals(this.originalPOITransaction, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction.originalPOITransaction) &&
        Objects.equals(this.saleItem, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction.saleItem) &&
        Objects.equals(this.saleTransactionIdentification, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction.saleTransactionIdentification) &&
        Objects.equals(this.totalAmount, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, loyaltyTransactionType, originalPOITransaction, saleItem, saleTransactionIdentification, totalAmount);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
