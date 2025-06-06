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
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestContext;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestEnvironment;
import com.lorealconsulting.nexoRetailerAPI.client.model.SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponse;
import com.lorealconsulting.nexoRetailerAPI.client.model.SaleToPOIServiceResponseV06ServiceResponseBatchResponse;
import com.lorealconsulting.nexoRetailerAPI.client.model.SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse;
import com.lorealconsulting.nexoRetailerAPI.client.model.SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse;
import com.lorealconsulting.nexoRetailerAPI.client.model.SaleToPOIServiceResponseV06ServiceResponsePaymentResponse;
import com.lorealconsulting.nexoRetailerAPI.client.model.SaleToPOIServiceResponseV06ServiceResponseResponse;
import com.lorealconsulting.nexoRetailerAPI.client.model.SaleToPOIServiceResponseV06ServiceResponseReversalResponse;
import com.lorealconsulting.nexoRetailerAPI.client.model.SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Specifies the response of the corresponding service request.&lt;br/&gt;
 */
@Schema(description = "Specifies the response of the corresponding service request.<br/>")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-09T14:21:17.741236018+02:00[Europe/Paris]")

public class SaleToPOIServiceResponseV06ServiceResponse {
  @SerializedName("BalanceInquiryResponse")
  private SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponse balanceInquiryResponse = null;

  @SerializedName("BatchResponse")
  private SaleToPOIServiceResponseV06ServiceResponseBatchResponse batchResponse = null;

  @SerializedName("CardAcquisitionResponse")
  private SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse cardAcquisitionResponse = null;

  @SerializedName("Context")
  private PoipoiIdfinancialServiceServiceRequestContext context = null;

  @SerializedName("Environment")
  private PoipoiIdfinancialServiceServiceRequestEnvironment environment = null;

  @SerializedName("LoyaltyResponse")
  private SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse loyaltyResponse = null;

  @SerializedName("PaymentResponse")
  private SaleToPOIServiceResponseV06ServiceResponsePaymentResponse paymentResponse = null;

  @SerializedName("Response")
  private SaleToPOIServiceResponseV06ServiceResponseResponse response = null;

  @SerializedName("ReversalResponse")
  private SaleToPOIServiceResponseV06ServiceResponseReversalResponse reversalResponse = null;

  @SerializedName("SupplementaryData")
  private Object supplementaryData = null;

  @SerializedName("StoredValueResponse")
  private SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse storedValueResponse = null;

  @SerializedName("ServiceContent")
  private Object serviceContent = null;

  public SaleToPOIServiceResponseV06ServiceResponse balanceInquiryResponse(SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponse balanceInquiryResponse) {
    this.balanceInquiryResponse = balanceInquiryResponse;
    return this;
  }

   /**
   * Get balanceInquiryResponse
   * @return balanceInquiryResponse
  **/
  @Schema(description = "")
  public SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponse getBalanceInquiryResponse() {
    return balanceInquiryResponse;
  }

  public void setBalanceInquiryResponse(SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponse balanceInquiryResponse) {
    this.balanceInquiryResponse = balanceInquiryResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponse batchResponse(SaleToPOIServiceResponseV06ServiceResponseBatchResponse batchResponse) {
    this.batchResponse = batchResponse;
    return this;
  }

   /**
   * Get batchResponse
   * @return batchResponse
  **/
  @Schema(description = "")
  public SaleToPOIServiceResponseV06ServiceResponseBatchResponse getBatchResponse() {
    return batchResponse;
  }

  public void setBatchResponse(SaleToPOIServiceResponseV06ServiceResponseBatchResponse batchResponse) {
    this.batchResponse = batchResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponse cardAcquisitionResponse(SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse cardAcquisitionResponse) {
    this.cardAcquisitionResponse = cardAcquisitionResponse;
    return this;
  }

   /**
   * Get cardAcquisitionResponse
   * @return cardAcquisitionResponse
  **/
  @Schema(description = "")
  public SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse getCardAcquisitionResponse() {
    return cardAcquisitionResponse;
  }

  public void setCardAcquisitionResponse(SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse cardAcquisitionResponse) {
    this.cardAcquisitionResponse = cardAcquisitionResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponse context(PoipoiIdfinancialServiceServiceRequestContext context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @Schema(required = true, description = "")
  public PoipoiIdfinancialServiceServiceRequestContext getContext() {
    return context;
  }

  public void setContext(PoipoiIdfinancialServiceServiceRequestContext context) {
    this.context = context;
  }

  public SaleToPOIServiceResponseV06ServiceResponse environment(PoipoiIdfinancialServiceServiceRequestEnvironment environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @Schema(required = true, description = "")
  public PoipoiIdfinancialServiceServiceRequestEnvironment getEnvironment() {
    return environment;
  }

  public void setEnvironment(PoipoiIdfinancialServiceServiceRequestEnvironment environment) {
    this.environment = environment;
  }

  public SaleToPOIServiceResponseV06ServiceResponse loyaltyResponse(SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse loyaltyResponse) {
    this.loyaltyResponse = loyaltyResponse;
    return this;
  }

   /**
   * Get loyaltyResponse
   * @return loyaltyResponse
  **/
  @Schema(description = "")
  public SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse getLoyaltyResponse() {
    return loyaltyResponse;
  }

  public void setLoyaltyResponse(SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse loyaltyResponse) {
    this.loyaltyResponse = loyaltyResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponse paymentResponse(SaleToPOIServiceResponseV06ServiceResponsePaymentResponse paymentResponse) {
    this.paymentResponse = paymentResponse;
    return this;
  }

   /**
   * Get paymentResponse
   * @return paymentResponse
  **/
  @Schema(description = "")
  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse getPaymentResponse() {
    return paymentResponse;
  }

  public void setPaymentResponse(SaleToPOIServiceResponseV06ServiceResponsePaymentResponse paymentResponse) {
    this.paymentResponse = paymentResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponse response(SaleToPOIServiceResponseV06ServiceResponseResponse response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @Schema(required = true, description = "")
  public SaleToPOIServiceResponseV06ServiceResponseResponse getResponse() {
    return response;
  }

  public void setResponse(SaleToPOIServiceResponseV06ServiceResponseResponse response) {
    this.response = response;
  }

  public SaleToPOIServiceResponseV06ServiceResponse reversalResponse(SaleToPOIServiceResponseV06ServiceResponseReversalResponse reversalResponse) {
    this.reversalResponse = reversalResponse;
    return this;
  }

   /**
   * Get reversalResponse
   * @return reversalResponse
  **/
  @Schema(description = "")
  public SaleToPOIServiceResponseV06ServiceResponseReversalResponse getReversalResponse() {
    return reversalResponse;
  }

  public void setReversalResponse(SaleToPOIServiceResponseV06ServiceResponseReversalResponse reversalResponse) {
    this.reversalResponse = reversalResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponse supplementaryData(Object supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

   /**
   * Additional information incorporated as an extension to the message.
   * @return supplementaryData
  **/
  @Schema(description = "Additional information incorporated as an extension to the message.")
  public Object getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(Object supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  public SaleToPOIServiceResponseV06ServiceResponse storedValueResponse(SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse storedValueResponse) {
    this.storedValueResponse = storedValueResponse;
    return this;
  }

   /**
   * Get storedValueResponse
   * @return storedValueResponse
  **/
  @Schema(description = "")
  public SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse getStoredValueResponse() {
    return storedValueResponse;
  }

  public void setStoredValueResponse(SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse storedValueResponse) {
    this.storedValueResponse = storedValueResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponse serviceContent(Object serviceContent) {
    this.serviceContent = serviceContent;
    return this;
  }

   /**
   * List of specific services for ServiceResponse.&lt;br/&gt;- **FSPP: FinancialPaymentResponse**  : *The POI System sends a response to a payment request (Purchase/refund/PWCB/MOTO Payment/...).*&lt;br/&gt;- **FSRP: FinancialReversalResponse**  : *The POI System sends a response to a reversal request.*&lt;br/&gt;- **FSIP: FinancialBalanceInquiryResponse**  : *The POI System sends a response to a Balance Inquiry request.*&lt;br/&gt;- **FSBP: FinancialBatchResponse**  : *The POI System sends a response to a batch processing request.*&lt;br/&gt;- **FSLP: FinancialLoyaltyResponse**  : *The POI System sends a response to a loyalty processing request.*&lt;br/&gt;- **FSVP: FinancialStoredValueResponse**  : *The POI System sends a response to a stored value card or account request.*&lt;br/&gt;- **FSEP: FinancialEnableServiceResponse**  : *The POI System sends a response after enabling or not some service.*&lt;br/&gt;- **FSAP: FinancialCardAcquisitionResponse**  : *The POI System sends a response to a card data acquisition request.*&lt;br/&gt;- **FSCP: FinancialReconciliationResponse**  : *The POI System sends a response to a reconciliation request.*&lt;br/&gt;
   * @return serviceContent
  **/
  @Schema(required = true, description = "List of specific services for ServiceResponse.<br/>- **FSPP: FinancialPaymentResponse**  : *The POI System sends a response to a payment request (Purchase/refund/PWCB/MOTO Payment/...).*<br/>- **FSRP: FinancialReversalResponse**  : *The POI System sends a response to a reversal request.*<br/>- **FSIP: FinancialBalanceInquiryResponse**  : *The POI System sends a response to a Balance Inquiry request.*<br/>- **FSBP: FinancialBatchResponse**  : *The POI System sends a response to a batch processing request.*<br/>- **FSLP: FinancialLoyaltyResponse**  : *The POI System sends a response to a loyalty processing request.*<br/>- **FSVP: FinancialStoredValueResponse**  : *The POI System sends a response to a stored value card or account request.*<br/>- **FSEP: FinancialEnableServiceResponse**  : *The POI System sends a response after enabling or not some service.*<br/>- **FSAP: FinancialCardAcquisitionResponse**  : *The POI System sends a response to a card data acquisition request.*<br/>- **FSCP: FinancialReconciliationResponse**  : *The POI System sends a response to a reconciliation request.*<br/>")
  public Object getServiceContent() {
    return serviceContent;
  }

  public void setServiceContent(Object serviceContent) {
    this.serviceContent = serviceContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleToPOIServiceResponseV06ServiceResponse saleToPOIServiceResponseV06ServiceResponse = (SaleToPOIServiceResponseV06ServiceResponse) o;
    return Objects.equals(this.balanceInquiryResponse, saleToPOIServiceResponseV06ServiceResponse.balanceInquiryResponse) &&
        Objects.equals(this.batchResponse, saleToPOIServiceResponseV06ServiceResponse.batchResponse) &&
        Objects.equals(this.cardAcquisitionResponse, saleToPOIServiceResponseV06ServiceResponse.cardAcquisitionResponse) &&
        Objects.equals(this.context, saleToPOIServiceResponseV06ServiceResponse.context) &&
        Objects.equals(this.environment, saleToPOIServiceResponseV06ServiceResponse.environment) &&
        Objects.equals(this.loyaltyResponse, saleToPOIServiceResponseV06ServiceResponse.loyaltyResponse) &&
        Objects.equals(this.paymentResponse, saleToPOIServiceResponseV06ServiceResponse.paymentResponse) &&
        Objects.equals(this.response, saleToPOIServiceResponseV06ServiceResponse.response) &&
        Objects.equals(this.reversalResponse, saleToPOIServiceResponseV06ServiceResponse.reversalResponse) &&
        Objects.equals(this.supplementaryData, saleToPOIServiceResponseV06ServiceResponse.supplementaryData) &&
        Objects.equals(this.storedValueResponse, saleToPOIServiceResponseV06ServiceResponse.storedValueResponse) &&
        Objects.equals(this.serviceContent, saleToPOIServiceResponseV06ServiceResponse.serviceContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceInquiryResponse, batchResponse, cardAcquisitionResponse, context, environment, loyaltyResponse, paymentResponse, response, reversalResponse, supplementaryData, storedValueResponse, serviceContent);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
