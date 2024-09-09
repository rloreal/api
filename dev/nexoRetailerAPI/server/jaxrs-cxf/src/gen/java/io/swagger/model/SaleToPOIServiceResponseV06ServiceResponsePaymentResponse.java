package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult;
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
  * Data to respond to a payment request.<br/>
 **/
@Schema(description="Data to respond to a payment request.<br/>")
public class SaleToPOIServiceResponseV06ServiceResponsePaymentResponse   {
  
  @Schema(description = "Customer order attached to a customer, recorded in the POI system.")
 /**
   * Customer order attached to a customer, recorded in the POI system.  
  **/
  private Object customerOrder = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 140 characters.<br/>  
  **/
  private Object issuerReferenceData = null;
  
  @Schema(description = "Data related to the result of a processed loyalty transaction.")
 /**
   * Data related to the result of a processed loyalty transaction.  
  **/
  private Object loyaltyResult = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object poIReconciliationIdentification = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification = null;
  
  @Schema(description = "Customer or Merchant payment receipt.")
 /**
   * Customer or Merchant payment receipt.  
  **/
  private Object paymentReceipt = null;
  
  @Schema(required = true, description = "")
  private SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult retailerPaymentResult = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object saleReferenceIdentification = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification = null;
 /**
   * Customer order attached to a customer, recorded in the POI system.
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

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse customerOrder(Object customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 140 characters.&lt;br/&gt;
   * @return issuerReferenceData
  **/
  @JsonProperty("IssuerReferenceData")
  @NotNull
  public Object getIssuerReferenceData() {
    return issuerReferenceData;
  }

  public void setIssuerReferenceData(Object issuerReferenceData) {
    this.issuerReferenceData = issuerReferenceData;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse issuerReferenceData(Object issuerReferenceData) {
    this.issuerReferenceData = issuerReferenceData;
    return this;
  }

 /**
   * Data related to the result of a processed loyalty transaction.
   * @return loyaltyResult
  **/
  @JsonProperty("LoyaltyResult")
  @NotNull
  public Object getLoyaltyResult() {
    return loyaltyResult;
  }

  public void setLoyaltyResult(Object loyaltyResult) {
    this.loyaltyResult = loyaltyResult;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse loyaltyResult(Object loyaltyResult) {
    this.loyaltyResult = loyaltyResult;
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

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse poIReconciliationIdentification(Object poIReconciliationIdentification) {
    this.poIReconciliationIdentification = poIReconciliationIdentification;
    return this;
  }

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

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse poITransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification) {
    this.poITransactionIdentification = poITransactionIdentification;
    return this;
  }

 /**
   * Customer or Merchant payment receipt.
   * @return paymentReceipt
  **/
  @JsonProperty("PaymentReceipt")
  @NotNull
  public Object getPaymentReceipt() {
    return paymentReceipt;
  }

  public void setPaymentReceipt(Object paymentReceipt) {
    this.paymentReceipt = paymentReceipt;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse paymentReceipt(Object paymentReceipt) {
    this.paymentReceipt = paymentReceipt;
    return this;
  }

 /**
   * Get retailerPaymentResult
   * @return retailerPaymentResult
  **/
  @JsonProperty("RetailerPaymentResult")
  @NotNull
  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult getRetailerPaymentResult() {
    return retailerPaymentResult;
  }

  public void setRetailerPaymentResult(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult retailerPaymentResult) {
    this.retailerPaymentResult = retailerPaymentResult;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse retailerPaymentResult(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult retailerPaymentResult) {
    this.retailerPaymentResult = retailerPaymentResult;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return saleReferenceIdentification
  **/
  @JsonProperty("SaleReferenceIdentification")
  @NotNull
  public Object getSaleReferenceIdentification() {
    return saleReferenceIdentification;
  }

  public void setSaleReferenceIdentification(Object saleReferenceIdentification) {
    this.saleReferenceIdentification = saleReferenceIdentification;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse saleReferenceIdentification(Object saleReferenceIdentification) {
    this.saleReferenceIdentification = saleReferenceIdentification;
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

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse saleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponsePaymentResponse {\n");
    
    sb.append("    customerOrder: ").append(toIndentedString(customerOrder)).append("\n");
    sb.append("    issuerReferenceData: ").append(toIndentedString(issuerReferenceData)).append("\n");
    sb.append("    loyaltyResult: ").append(toIndentedString(loyaltyResult)).append("\n");
    sb.append("    poIReconciliationIdentification: ").append(toIndentedString(poIReconciliationIdentification)).append("\n");
    sb.append("    poITransactionIdentification: ").append(toIndentedString(poITransactionIdentification)).append("\n");
    sb.append("    paymentReceipt: ").append(toIndentedString(paymentReceipt)).append("\n");
    sb.append("    retailerPaymentResult: ").append(toIndentedString(retailerPaymentResult)).append("\n");
    sb.append("    saleReferenceIdentification: ").append(toIndentedString(saleReferenceIdentification)).append("\n");
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
