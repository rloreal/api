package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data related to the loyalty transaction.&lt;br/&gt;
 */
@Schema(description = "Data related to the loyalty transaction.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction   {
  @JsonProperty("Currency")
  private Object currency = null;

  @JsonProperty("LoyaltyTransactionType")
  private Object loyaltyTransactionType = null;

  @JsonProperty("OriginalPOITransaction")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction originalPOITransaction = null;

  @JsonProperty("SaleItem")
  private Object saleItem = null;

  @JsonProperty("SaleTransactionIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification = null;

  @JsonProperty("TotalAmount")
  private Object totalAmount = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction currency(Object currency) {
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

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction loyaltyTransactionType(Object loyaltyTransactionType) {
    this.loyaltyTransactionType = loyaltyTransactionType;
    return this;
  }

  /**
   * Type of loyalty transaction.<br/>- **AWRD: Award**  : *Direct or payment related award on a loyalty account. Award alone, award associated to a payment (may be with an additional award alone), award because of  a payment resulting on rebates.*<br/>- **AWRR: AwardRefund**  : *Refund of a loyalty award transaction.*<br/>- **REBR: RebateRefund**  : *Refund of a loyalty rebate transaction.*<br/>- **REBA: Rebate**  : *Rebate on a total amount, sale item amount, or sale items.*<br/>- **REDE: Redemption**  : *Redemption on a loyalty account.*<br/>- **REDR: RedemptionRefund**  : *Refund of a loyalty redemption transaction.*<br/>
   * @return loyaltyTransactionType
   **/
  @Schema(required = true, description = "Type of loyalty transaction.<br/>- **AWRD: Award**  : *Direct or payment related award on a loyalty account. Award alone, award associated to a payment (may be with an additional award alone), award because of  a payment resulting on rebates.*<br/>- **AWRR: AwardRefund**  : *Refund of a loyalty award transaction.*<br/>- **REBR: RebateRefund**  : *Refund of a loyalty rebate transaction.*<br/>- **REBA: Rebate**  : *Rebate on a total amount, sale item amount, or sale items.*<br/>- **REDE: Redemption**  : *Redemption on a loyalty account.*<br/>- **REDR: RedemptionRefund**  : *Refund of a loyalty redemption transaction.*<br/>")
      @NotNull

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
      @NotNull

    @Valid
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
      @NotNull

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
      @NotNull

    @Valid
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
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return totalAmount
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

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
