package io.swagger.model;

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
  * Data required to request a Payment.<br/>
 **/
@Schema(description="Data required to request a Payment.<br/>")
public class PoipoiIdfinancialServiceServiceRequestPaymentRequest   {
  
  @Schema(description = "Data linked to card loyalty during payment.")
 /**
   * Data linked to card loyalty during payment.  
  **/
  private Object loyaltyData = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction paymentTransaction = null;
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

  public PoipoiIdfinancialServiceServiceRequestPaymentRequest loyaltyData(Object loyaltyData) {
    this.loyaltyData = loyaltyData;
    return this;
  }

 /**
   * Get paymentTransaction
   * @return paymentTransaction
  **/
  @JsonProperty("PaymentTransaction")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }

  public PoipoiIdfinancialServiceServiceRequestPaymentRequest paymentTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestPaymentRequest {\n");
    
    sb.append("    loyaltyData: ").append(toIndentedString(loyaltyData)).append("\n");
    sb.append("    paymentTransaction: ").append(toIndentedString(paymentTransaction)).append("\n");
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
