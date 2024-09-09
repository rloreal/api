package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder;
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
  * Data to request a reversal.<br/>
 **/
@Schema(description="Data to request a reversal.<br/>")
public class PoipoiIdfinancialServiceServiceRequestReversalRequest   {
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder = null;
  
  @Schema(description = "Data linked to card loyalty during payment.")
 /**
   * Data linked to card loyalty during payment.  
  **/
  private Object loyaltyData = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object reversedAmount = null;
  
  @Schema(required = true, description = "Reason of the payment or loyalty reversal.<br/>- **CUSC: CustomerCancellation**  : *Customer cancels the transaction.*<br/>- **MALF: Malfuntion**  : *Reversal after a suspection of malfunction of the POI system.*<br/>- **MERC: MerchantCancellation**  : *Merchant or Cashier cancels the transaction.*<br/>- **UNAB: UnableToComplete**  : *POI System unable to complete transaction.*<br/>")
 /**
   * Reason of the payment or loyalty reversal.<br/>- **CUSC: CustomerCancellation**  : *Customer cancels the transaction.*<br/>- **MALF: Malfuntion**  : *Reversal after a suspection of malfunction of the POI system.*<br/>- **MERC: MerchantCancellation**  : *Merchant or Cashier cancels the transaction.*<br/>- **UNAB: UnableToComplete**  : *POI System unable to complete transaction.*<br/>  
  **/
  private Object reversalReason = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction reversalTransaction = null;
 /**
   * Get customerOrder
   * @return customerOrder
  **/
  @JsonProperty("CustomerOrder")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
  }

  public PoipoiIdfinancialServiceServiceRequestReversalRequest customerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

 /**
   * Data linked to card loyalty during payment.
   * @return loyaltyData
  **/
  @JsonProperty("LoyaltyData")
  @NotNull
  public Object getLoyaltyData() {
    return loyaltyData;
  }

  public void setLoyaltyData(Object loyaltyData) {
    this.loyaltyData = loyaltyData;
  }

  public PoipoiIdfinancialServiceServiceRequestReversalRequest loyaltyData(Object loyaltyData) {
    this.loyaltyData = loyaltyData;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return reversedAmount
  **/
  @JsonProperty("ReversedAmount")
  @NotNull
  public Object getReversedAmount() {
    return reversedAmount;
  }

  public void setReversedAmount(Object reversedAmount) {
    this.reversedAmount = reversedAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestReversalRequest reversedAmount(Object reversedAmount) {
    this.reversedAmount = reversedAmount;
    return this;
  }

 /**
   * Reason of the payment or loyalty reversal.&lt;br/&gt;- **CUSC: CustomerCancellation**  : *Customer cancels the transaction.*&lt;br/&gt;- **MALF: Malfuntion**  : *Reversal after a suspection of malfunction of the POI system.*&lt;br/&gt;- **MERC: MerchantCancellation**  : *Merchant or Cashier cancels the transaction.*&lt;br/&gt;- **UNAB: UnableToComplete**  : *POI System unable to complete transaction.*&lt;br/&gt;
   * @return reversalReason
  **/
  @JsonProperty("ReversalReason")
  @NotNull
  public Object getReversalReason() {
    return reversalReason;
  }

  public void setReversalReason(Object reversalReason) {
    this.reversalReason = reversalReason;
  }

  public PoipoiIdfinancialServiceServiceRequestReversalRequest reversalReason(Object reversalReason) {
    this.reversalReason = reversalReason;
    return this;
  }

 /**
   * Get reversalTransaction
   * @return reversalTransaction
  **/
  @JsonProperty("ReversalTransaction")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction getReversalTransaction() {
    return reversalTransaction;
  }

  public void setReversalTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction reversalTransaction) {
    this.reversalTransaction = reversalTransaction;
  }

  public PoipoiIdfinancialServiceServiceRequestReversalRequest reversalTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction reversalTransaction) {
    this.reversalTransaction = reversalTransaction;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
