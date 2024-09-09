package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
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
  * Response data to a stored value request.<br/>
 **/
@Schema(description="Response data to a stored value request.<br/>")
public class SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse   {
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification = null;
  
  @Schema(description = "Scope  The Receipt message is sent by the transaction administrator to a member of the system. It is sent to acknowledge the receipt of one or multiple messages sent previously.  The Receipt message is an application receipt acknowledgement and conveys information about the processing of the original message(s).  Usage  The Receipt message is used when the exchange of messages takes place in an asynchronous manner.  This may happen, for instance, when an action is requested from the transaction administrator (a deletion, modification or cancellation). The transaction administrator will first acknowledge the request (with a Receipt message) and then execute it.  The message can contain information based on the following elements: reference of the message(s) it acknowledges, the status code (optional) and further explanation:  - reference of the message it acknowledges  - potentially, a status code and an explanation.")
 /**
   * Scope  The Receipt message is sent by the transaction administrator to a member of the system. It is sent to acknowledge the receipt of one or multiple messages sent previously.  The Receipt message is an application receipt acknowledgement and conveys information about the processing of the original message(s).  Usage  The Receipt message is used when the exchange of messages takes place in an asynchronous manner.  This may happen, for instance, when an action is requested from the transaction administrator (a deletion, modification or cancellation). The transaction administrator will first acknowledge the request (with a Receipt message) and then execute it.  The message can contain information based on the following elements: reference of the message(s) it acknowledges, the status code (optional) and further explanation:  - reference of the message it acknowledges  - potentially, a status code and an explanation.  
  **/
  private Object receiptV07 = null;
  
  @Schema(description = "Result of loading/reloading a stored value card.")
 /**
   * Result of loading/reloading a stored value card.  
  **/
  private Object result = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification = null;
 /**
   * Get poITransactionIdentification
   * @return poITransactionIdentification
  **/
  @JsonProperty("POITransactionIdentification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getPoITransactionIdentification() {
    return poITransactionIdentification;
  }

  public void setPoITransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification) {
    this.poITransactionIdentification = poITransactionIdentification;
  }

  public SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse poITransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification) {
    this.poITransactionIdentification = poITransactionIdentification;
    return this;
  }

 /**
   * Scope  The Receipt message is sent by the transaction administrator to a member of the system. It is sent to acknowledge the receipt of one or multiple messages sent previously.  The Receipt message is an application receipt acknowledgement and conveys information about the processing of the original message(s).  Usage  The Receipt message is used when the exchange of messages takes place in an asynchronous manner.  This may happen, for instance, when an action is requested from the transaction administrator (a deletion, modification or cancellation). The transaction administrator will first acknowledge the request (with a Receipt message) and then execute it.  The message can contain information based on the following elements: reference of the message(s) it acknowledges, the status code (optional) and further explanation:  - reference of the message it acknowledges  - potentially, a status code and an explanation.
   * @return receiptV07
  **/
  @JsonProperty("ReceiptV07")
  @NotNull
  public Object getReceiptV07() {
    return receiptV07;
  }

  public void setReceiptV07(Object receiptV07) {
    this.receiptV07 = receiptV07;
  }

  public SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse receiptV07(Object receiptV07) {
    this.receiptV07 = receiptV07;
    return this;
  }

 /**
   * Result of loading/reloading a stored value card.
   * @return result
  **/
  @JsonProperty("Result")
  @NotNull
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse result(Object result) {
    this.result = result;
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

  public SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse saleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse {\n");
    
    sb.append("    poITransactionIdentification: ").append(toIndentedString(poITransactionIdentification)).append("\n");
    sb.append("    receiptV07: ").append(toIndentedString(receiptV07)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    saleTransactionIdentification: ").append(toIndentedString(saleTransactionIdentification)).append("\n");
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
