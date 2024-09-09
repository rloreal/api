package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContext;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironment;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponse;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponseBatchResponse;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponsePaymentResponse;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponseResponse;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponseReversalResponse;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse;
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
  * Specifies the response of the corresponding service request.<br/>
 **/
@Schema(description="Specifies the response of the corresponding service request.<br/>")
public class SaleToPOIServiceResponseV06ServiceResponse   {
  
  @Schema(description = "")
  private SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponse balanceInquiryResponse = null;
  
  @Schema(description = "")
  private SaleToPOIServiceResponseV06ServiceResponseBatchResponse batchResponse = null;
  
  @Schema(description = "")
  private SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse cardAcquisitionResponse = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestContext context = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironment environment = null;
  
  @Schema(description = "")
  private SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse loyaltyResponse = null;
  
  @Schema(description = "")
  private SaleToPOIServiceResponseV06ServiceResponsePaymentResponse paymentResponse = null;
  
  @Schema(required = true, description = "")
  private SaleToPOIServiceResponseV06ServiceResponseResponse response = null;
  
  @Schema(description = "")
  private SaleToPOIServiceResponseV06ServiceResponseReversalResponse reversalResponse = null;
  
  @Schema(description = "Additional information incorporated as an extension to the message.")
 /**
   * Additional information incorporated as an extension to the message.  
  **/
  private Object supplementaryData = null;
  
  @Schema(description = "")
  private SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse storedValueResponse = null;
  
  @Schema(required = true, description = "List of specific services for ServiceResponse.<br/>- **FSPP: FinancialPaymentResponse**  : *The POI System sends a response to a payment request (Purchase/refund/PWCB/MOTO Payment/...).*<br/>- **FSRP: FinancialReversalResponse**  : *The POI System sends a response to a reversal request.*<br/>- **FSIP: FinancialBalanceInquiryResponse**  : *The POI System sends a response to a Balance Inquiry request.*<br/>- **FSBP: FinancialBatchResponse**  : *The POI System sends a response to a batch processing request.*<br/>- **FSLP: FinancialLoyaltyResponse**  : *The POI System sends a response to a loyalty processing request.*<br/>- **FSVP: FinancialStoredValueResponse**  : *The POI System sends a response to a stored value card or account request.*<br/>- **FSEP: FinancialEnableServiceResponse**  : *The POI System sends a response after enabling or not some service.*<br/>- **FSAP: FinancialCardAcquisitionResponse**  : *The POI System sends a response to a card data acquisition request.*<br/>- **FSCP: FinancialReconciliationResponse**  : *The POI System sends a response to a reconciliation request.*<br/>")
 /**
   * List of specific services for ServiceResponse.<br/>- **FSPP: FinancialPaymentResponse**  : *The POI System sends a response to a payment request (Purchase/refund/PWCB/MOTO Payment/...).*<br/>- **FSRP: FinancialReversalResponse**  : *The POI System sends a response to a reversal request.*<br/>- **FSIP: FinancialBalanceInquiryResponse**  : *The POI System sends a response to a Balance Inquiry request.*<br/>- **FSBP: FinancialBatchResponse**  : *The POI System sends a response to a batch processing request.*<br/>- **FSLP: FinancialLoyaltyResponse**  : *The POI System sends a response to a loyalty processing request.*<br/>- **FSVP: FinancialStoredValueResponse**  : *The POI System sends a response to a stored value card or account request.*<br/>- **FSEP: FinancialEnableServiceResponse**  : *The POI System sends a response after enabling or not some service.*<br/>- **FSAP: FinancialCardAcquisitionResponse**  : *The POI System sends a response to a card data acquisition request.*<br/>- **FSCP: FinancialReconciliationResponse**  : *The POI System sends a response to a reconciliation request.*<br/>  
  **/
  private Object serviceContent = null;
 /**
   * Get balanceInquiryResponse
   * @return balanceInquiryResponse
  **/
  @JsonProperty("BalanceInquiryResponse")
  @NotNull
  public SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponse getBalanceInquiryResponse() {
    return balanceInquiryResponse;
  }

  public void setBalanceInquiryResponse(SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponse balanceInquiryResponse) {
    this.balanceInquiryResponse = balanceInquiryResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponse balanceInquiryResponse(SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponse balanceInquiryResponse) {
    this.balanceInquiryResponse = balanceInquiryResponse;
    return this;
  }

 /**
   * Get batchResponse
   * @return batchResponse
  **/
  @JsonProperty("BatchResponse")
  @NotNull
  public SaleToPOIServiceResponseV06ServiceResponseBatchResponse getBatchResponse() {
    return batchResponse;
  }

  public void setBatchResponse(SaleToPOIServiceResponseV06ServiceResponseBatchResponse batchResponse) {
    this.batchResponse = batchResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponse batchResponse(SaleToPOIServiceResponseV06ServiceResponseBatchResponse batchResponse) {
    this.batchResponse = batchResponse;
    return this;
  }

 /**
   * Get cardAcquisitionResponse
   * @return cardAcquisitionResponse
  **/
  @JsonProperty("CardAcquisitionResponse")
  @NotNull
  public SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse getCardAcquisitionResponse() {
    return cardAcquisitionResponse;
  }

  public void setCardAcquisitionResponse(SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse cardAcquisitionResponse) {
    this.cardAcquisitionResponse = cardAcquisitionResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponse cardAcquisitionResponse(SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse cardAcquisitionResponse) {
    this.cardAcquisitionResponse = cardAcquisitionResponse;
    return this;
  }

 /**
   * Get context
   * @return context
  **/
  @JsonProperty("Context")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestContext getContext() {
    return context;
  }

  public void setContext(PoipoiIdfinancialServiceServiceRequestContext context) {
    this.context = context;
  }

  public SaleToPOIServiceResponseV06ServiceResponse context(PoipoiIdfinancialServiceServiceRequestContext context) {
    this.context = context;
    return this;
  }

 /**
   * Get environment
   * @return environment
  **/
  @JsonProperty("Environment")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironment getEnvironment() {
    return environment;
  }

  public void setEnvironment(PoipoiIdfinancialServiceServiceRequestEnvironment environment) {
    this.environment = environment;
  }

  public SaleToPOIServiceResponseV06ServiceResponse environment(PoipoiIdfinancialServiceServiceRequestEnvironment environment) {
    this.environment = environment;
    return this;
  }

 /**
   * Get loyaltyResponse
   * @return loyaltyResponse
  **/
  @JsonProperty("LoyaltyResponse")
  @NotNull
  public SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse getLoyaltyResponse() {
    return loyaltyResponse;
  }

  public void setLoyaltyResponse(SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse loyaltyResponse) {
    this.loyaltyResponse = loyaltyResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponse loyaltyResponse(SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse loyaltyResponse) {
    this.loyaltyResponse = loyaltyResponse;
    return this;
  }

 /**
   * Get paymentResponse
   * @return paymentResponse
  **/
  @JsonProperty("PaymentResponse")
  @NotNull
  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse getPaymentResponse() {
    return paymentResponse;
  }

  public void setPaymentResponse(SaleToPOIServiceResponseV06ServiceResponsePaymentResponse paymentResponse) {
    this.paymentResponse = paymentResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponse paymentResponse(SaleToPOIServiceResponseV06ServiceResponsePaymentResponse paymentResponse) {
    this.paymentResponse = paymentResponse;
    return this;
  }

 /**
   * Get response
   * @return response
  **/
  @JsonProperty("Response")
  @NotNull
  public SaleToPOIServiceResponseV06ServiceResponseResponse getResponse() {
    return response;
  }

  public void setResponse(SaleToPOIServiceResponseV06ServiceResponseResponse response) {
    this.response = response;
  }

  public SaleToPOIServiceResponseV06ServiceResponse response(SaleToPOIServiceResponseV06ServiceResponseResponse response) {
    this.response = response;
    return this;
  }

 /**
   * Get reversalResponse
   * @return reversalResponse
  **/
  @JsonProperty("ReversalResponse")
  @NotNull
  public SaleToPOIServiceResponseV06ServiceResponseReversalResponse getReversalResponse() {
    return reversalResponse;
  }

  public void setReversalResponse(SaleToPOIServiceResponseV06ServiceResponseReversalResponse reversalResponse) {
    this.reversalResponse = reversalResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponse reversalResponse(SaleToPOIServiceResponseV06ServiceResponseReversalResponse reversalResponse) {
    this.reversalResponse = reversalResponse;
    return this;
  }

 /**
   * Additional information incorporated as an extension to the message.
   * @return supplementaryData
  **/
  @JsonProperty("SupplementaryData")
  @NotNull
  public Object getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(Object supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  public SaleToPOIServiceResponseV06ServiceResponse supplementaryData(Object supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

 /**
   * Get storedValueResponse
   * @return storedValueResponse
  **/
  @JsonProperty("StoredValueResponse")
  @NotNull
  public SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse getStoredValueResponse() {
    return storedValueResponse;
  }

  public void setStoredValueResponse(SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse storedValueResponse) {
    this.storedValueResponse = storedValueResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponse storedValueResponse(SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse storedValueResponse) {
    this.storedValueResponse = storedValueResponse;
    return this;
  }

 /**
   * List of specific services for ServiceResponse.&lt;br/&gt;- **FSPP: FinancialPaymentResponse**  : *The POI System sends a response to a payment request (Purchase/refund/PWCB/MOTO Payment/...).*&lt;br/&gt;- **FSRP: FinancialReversalResponse**  : *The POI System sends a response to a reversal request.*&lt;br/&gt;- **FSIP: FinancialBalanceInquiryResponse**  : *The POI System sends a response to a Balance Inquiry request.*&lt;br/&gt;- **FSBP: FinancialBatchResponse**  : *The POI System sends a response to a batch processing request.*&lt;br/&gt;- **FSLP: FinancialLoyaltyResponse**  : *The POI System sends a response to a loyalty processing request.*&lt;br/&gt;- **FSVP: FinancialStoredValueResponse**  : *The POI System sends a response to a stored value card or account request.*&lt;br/&gt;- **FSEP: FinancialEnableServiceResponse**  : *The POI System sends a response after enabling or not some service.*&lt;br/&gt;- **FSAP: FinancialCardAcquisitionResponse**  : *The POI System sends a response to a card data acquisition request.*&lt;br/&gt;- **FSCP: FinancialReconciliationResponse**  : *The POI System sends a response to a reconciliation request.*&lt;br/&gt;
   * @return serviceContent
  **/
  @JsonProperty("ServiceContent")
  @NotNull
  public Object getServiceContent() {
    return serviceContent;
  }

  public void setServiceContent(Object serviceContent) {
    this.serviceContent = serviceContent;
  }

  public SaleToPOIServiceResponseV06ServiceResponse serviceContent(Object serviceContent) {
    this.serviceContent = serviceContent;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponse {\n");
    
    sb.append("    balanceInquiryResponse: ").append(toIndentedString(balanceInquiryResponse)).append("\n");
    sb.append("    batchResponse: ").append(toIndentedString(batchResponse)).append("\n");
    sb.append("    cardAcquisitionResponse: ").append(toIndentedString(cardAcquisitionResponse)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    loyaltyResponse: ").append(toIndentedString(loyaltyResponse)).append("\n");
    sb.append("    paymentResponse: ").append(toIndentedString(paymentResponse)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    reversalResponse: ").append(toIndentedString(reversalResponse)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    storedValueResponse: ").append(toIndentedString(storedValueResponse)).append("\n");
    sb.append("    serviceContent: ").append(toIndentedString(serviceContent)).append("\n");
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
