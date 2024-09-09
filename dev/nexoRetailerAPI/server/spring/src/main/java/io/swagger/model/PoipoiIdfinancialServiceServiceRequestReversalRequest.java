package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data to request a reversal.&lt;br/&gt;
 */
@Schema(description = "Data to request a reversal.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestReversalRequest   {
  @JsonProperty("CustomerOrder")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder = null;

  @JsonProperty("LoyaltyData")
  private Object loyaltyData = null;

  @JsonProperty("ReversedAmount")
  private Object reversedAmount = null;

  @JsonProperty("ReversalReason")
  private Object reversalReason = null;

  @JsonProperty("ReversalTransaction")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction reversalTransaction = null;

  public PoipoiIdfinancialServiceServiceRequestReversalRequest customerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

  /**
   * Get customerOrder
   * @return customerOrder
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
  }

  public PoipoiIdfinancialServiceServiceRequestReversalRequest loyaltyData(Object loyaltyData) {
    this.loyaltyData = loyaltyData;
    return this;
  }

  /**
   * Data linked to card loyalty during payment.
   * @return loyaltyData
   **/
  @Schema(description = "Data linked to card loyalty during payment.")
      @NotNull

    public Object getLoyaltyData() {
    return loyaltyData;
  }

  public void setLoyaltyData(Object loyaltyData) {
    this.loyaltyData = loyaltyData;
  }

  public PoipoiIdfinancialServiceServiceRequestReversalRequest reversedAmount(Object reversedAmount) {
    this.reversedAmount = reversedAmount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return reversedAmount
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getReversedAmount() {
    return reversedAmount;
  }

  public void setReversedAmount(Object reversedAmount) {
    this.reversedAmount = reversedAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestReversalRequest reversalReason(Object reversalReason) {
    this.reversalReason = reversalReason;
    return this;
  }

  /**
   * Reason of the payment or loyalty reversal.<br/>- **CUSC: CustomerCancellation**  : *Customer cancels the transaction.*<br/>- **MALF: Malfuntion**  : *Reversal after a suspection of malfunction of the POI system.*<br/>- **MERC: MerchantCancellation**  : *Merchant or Cashier cancels the transaction.*<br/>- **UNAB: UnableToComplete**  : *POI System unable to complete transaction.*<br/>
   * @return reversalReason
   **/
  @Schema(required = true, description = "Reason of the payment or loyalty reversal.<br/>- **CUSC: CustomerCancellation**  : *Customer cancels the transaction.*<br/>- **MALF: Malfuntion**  : *Reversal after a suspection of malfunction of the POI system.*<br/>- **MERC: MerchantCancellation**  : *Merchant or Cashier cancels the transaction.*<br/>- **UNAB: UnableToComplete**  : *POI System unable to complete transaction.*<br/>")
      @NotNull

    public Object getReversalReason() {
    return reversalReason;
  }

  public void setReversalReason(Object reversalReason) {
    this.reversalReason = reversalReason;
  }

  public PoipoiIdfinancialServiceServiceRequestReversalRequest reversalTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction reversalTransaction) {
    this.reversalTransaction = reversalTransaction;
    return this;
  }

  /**
   * Get reversalTransaction
   * @return reversalTransaction
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction getReversalTransaction() {
    return reversalTransaction;
  }

  public void setReversalTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction reversalTransaction) {
    this.reversalTransaction = reversalTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestReversalRequest poipoiIdfinancialServiceServiceRequestReversalRequest = (PoipoiIdfinancialServiceServiceRequestReversalRequest) o;
    return Objects.equals(this.customerOrder, poipoiIdfinancialServiceServiceRequestReversalRequest.customerOrder) &&
        Objects.equals(this.loyaltyData, poipoiIdfinancialServiceServiceRequestReversalRequest.loyaltyData) &&
        Objects.equals(this.reversedAmount, poipoiIdfinancialServiceServiceRequestReversalRequest.reversedAmount) &&
        Objects.equals(this.reversalReason, poipoiIdfinancialServiceServiceRequestReversalRequest.reversalReason) &&
        Objects.equals(this.reversalTransaction, poipoiIdfinancialServiceServiceRequestReversalRequest.reversalTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOrder, loyaltyData, reversedAmount, reversalReason, reversalTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestReversalRequest {\n");
    
    sb.append("    customerOrder: ").append(toIndentedString(customerOrder)).append("\n");
    sb.append("    loyaltyData: ").append(toIndentedString(loyaltyData)).append("\n");
    sb.append("    reversedAmount: ").append(toIndentedString(reversedAmount)).append("\n");
    sb.append("    reversalReason: ").append(toIndentedString(reversalReason)).append("\n");
    sb.append("    reversalTransaction: ").append(toIndentedString(reversalTransaction)).append("\n");
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
