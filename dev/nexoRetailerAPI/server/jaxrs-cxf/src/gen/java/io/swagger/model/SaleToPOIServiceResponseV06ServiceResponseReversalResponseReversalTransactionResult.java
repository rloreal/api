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
  * Reversal transaction results after a reversal request.<br/>
 **/
@Schema(description="Reversal transaction results after a reversal request.<br/>")
public class SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult   {
  
  @Schema(description = "Updated Customer order list after reversal.")
 /**
   * Updated Customer order list after reversal.  
  **/
  private Object customerOrder = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction originalPaymentTransaction = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object poIReconciliationIdentification = null;
 /**
   * Updated Customer order list after reversal.
   * @return customerOrder
  **/
  @JsonProperty("CustomerOrder")
  @NotNull
  public Object getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(Object customerOrder) {
    this.customerOrder = customerOrder;
  }

  public SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult customerOrder(Object customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

 /**
   * Get originalPaymentTransaction
   * @return originalPaymentTransaction
  **/
  @JsonProperty("OriginalPaymentTransaction")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction getOriginalPaymentTransaction() {
    return originalPaymentTransaction;
  }

  public void setOriginalPaymentTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction originalPaymentTransaction) {
    this.originalPaymentTransaction = originalPaymentTransaction;
  }

  public SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult originalPaymentTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction originalPaymentTransaction) {
    this.originalPaymentTransaction = originalPaymentTransaction;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return poIReconciliationIdentification
  **/
  @JsonProperty("POIReconciliationIdentification")
  @NotNull
  public Object getPoIReconciliationIdentification() {
    return poIReconciliationIdentification;
  }

  public void setPoIReconciliationIdentification(Object poIReconciliationIdentification) {
    this.poIReconciliationIdentification = poIReconciliationIdentification;
  }

  public SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult poIReconciliationIdentification(Object poIReconciliationIdentification) {
    this.poIReconciliationIdentification = poIReconciliationIdentification;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult {\n");
    
    sb.append("    customerOrder: ").append(toIndentedString(customerOrder)).append("\n");
    sb.append("    originalPaymentTransaction: ").append(toIndentedString(originalPaymentTransaction)).append("\n");
    sb.append("    poIReconciliationIdentification: ").append(toIndentedString(poIReconciliationIdentification)).append("\n");
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
