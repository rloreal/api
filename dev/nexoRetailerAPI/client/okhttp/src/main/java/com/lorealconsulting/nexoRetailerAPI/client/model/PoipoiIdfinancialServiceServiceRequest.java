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
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestBatchRequest;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestContext;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestEnableServiceRequest;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestEnvironment;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequest;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestPaymentRequest;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestReversalRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Defines the service to be called.&lt;br/&gt;
 */
@Schema(description = "Defines the service to be called.<br/>")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-09T14:21:17.741236018+02:00[Europe/Paris]")

public class PoipoiIdfinancialServiceServiceRequest {
  @SerializedName("BalanceInquiryRequest")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest balanceInquiryRequest = null;

  @SerializedName("BatchRequest")
  private PoipoiIdfinancialServiceServiceRequestBatchRequest batchRequest = null;

  @SerializedName("CardAcquisitionRequest")
  private PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest cardAcquisitionRequest = null;

  @SerializedName("Context")
  private PoipoiIdfinancialServiceServiceRequestContext context = null;

  @SerializedName("Environment")
  private PoipoiIdfinancialServiceServiceRequestEnvironment environment = null;

  @SerializedName("LoyaltyRequest")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequest loyaltyRequest = null;

  @SerializedName("EnableServiceRequest")
  private PoipoiIdfinancialServiceServiceRequestEnableServiceRequest enableServiceRequest = null;

  @SerializedName("PaymentRequest")
  private PoipoiIdfinancialServiceServiceRequestPaymentRequest paymentRequest = null;

  @SerializedName("ReversalRequest")
  private PoipoiIdfinancialServiceServiceRequestReversalRequest reversalRequest = null;

  @SerializedName("SupplementaryData")
  private Object supplementaryData = null;

  @SerializedName("StoredValueRequest")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest storedValueRequest = null;

  @SerializedName("ServiceContent")
  private Object serviceContent = null;

  public PoipoiIdfinancialServiceServiceRequest balanceInquiryRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest balanceInquiryRequest) {
    this.balanceInquiryRequest = balanceInquiryRequest;
    return this;
  }

   /**
   * Get balanceInquiryRequest
   * @return balanceInquiryRequest
  **/
  @Schema(description = "")
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest getBalanceInquiryRequest() {
    return balanceInquiryRequest;
  }

  public void setBalanceInquiryRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest balanceInquiryRequest) {
    this.balanceInquiryRequest = balanceInquiryRequest;
  }

  public PoipoiIdfinancialServiceServiceRequest batchRequest(PoipoiIdfinancialServiceServiceRequestBatchRequest batchRequest) {
    this.batchRequest = batchRequest;
    return this;
  }

   /**
   * Get batchRequest
   * @return batchRequest
  **/
  @Schema(description = "")
  public PoipoiIdfinancialServiceServiceRequestBatchRequest getBatchRequest() {
    return batchRequest;
  }

  public void setBatchRequest(PoipoiIdfinancialServiceServiceRequestBatchRequest batchRequest) {
    this.batchRequest = batchRequest;
  }

  public PoipoiIdfinancialServiceServiceRequest cardAcquisitionRequest(PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest cardAcquisitionRequest) {
    this.cardAcquisitionRequest = cardAcquisitionRequest;
    return this;
  }

   /**
   * Get cardAcquisitionRequest
   * @return cardAcquisitionRequest
  **/
  @Schema(description = "")
  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest getCardAcquisitionRequest() {
    return cardAcquisitionRequest;
  }

  public void setCardAcquisitionRequest(PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest cardAcquisitionRequest) {
    this.cardAcquisitionRequest = cardAcquisitionRequest;
  }

  public PoipoiIdfinancialServiceServiceRequest context(PoipoiIdfinancialServiceServiceRequestContext context) {
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

  public PoipoiIdfinancialServiceServiceRequest environment(PoipoiIdfinancialServiceServiceRequestEnvironment environment) {
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

  public PoipoiIdfinancialServiceServiceRequest loyaltyRequest(PoipoiIdfinancialServiceServiceRequestLoyaltyRequest loyaltyRequest) {
    this.loyaltyRequest = loyaltyRequest;
    return this;
  }

   /**
   * Get loyaltyRequest
   * @return loyaltyRequest
  **/
  @Schema(description = "")
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequest getLoyaltyRequest() {
    return loyaltyRequest;
  }

  public void setLoyaltyRequest(PoipoiIdfinancialServiceServiceRequestLoyaltyRequest loyaltyRequest) {
    this.loyaltyRequest = loyaltyRequest;
  }

  public PoipoiIdfinancialServiceServiceRequest enableServiceRequest(PoipoiIdfinancialServiceServiceRequestEnableServiceRequest enableServiceRequest) {
    this.enableServiceRequest = enableServiceRequest;
    return this;
  }

   /**
   * Get enableServiceRequest
   * @return enableServiceRequest
  **/
  @Schema(description = "")
  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequest getEnableServiceRequest() {
    return enableServiceRequest;
  }

  public void setEnableServiceRequest(PoipoiIdfinancialServiceServiceRequestEnableServiceRequest enableServiceRequest) {
    this.enableServiceRequest = enableServiceRequest;
  }

  public PoipoiIdfinancialServiceServiceRequest paymentRequest(PoipoiIdfinancialServiceServiceRequestPaymentRequest paymentRequest) {
    this.paymentRequest = paymentRequest;
    return this;
  }

   /**
   * Get paymentRequest
   * @return paymentRequest
  **/
  @Schema(description = "")
  public PoipoiIdfinancialServiceServiceRequestPaymentRequest getPaymentRequest() {
    return paymentRequest;
  }

  public void setPaymentRequest(PoipoiIdfinancialServiceServiceRequestPaymentRequest paymentRequest) {
    this.paymentRequest = paymentRequest;
  }

  public PoipoiIdfinancialServiceServiceRequest reversalRequest(PoipoiIdfinancialServiceServiceRequestReversalRequest reversalRequest) {
    this.reversalRequest = reversalRequest;
    return this;
  }

   /**
   * Get reversalRequest
   * @return reversalRequest
  **/
  @Schema(description = "")
  public PoipoiIdfinancialServiceServiceRequestReversalRequest getReversalRequest() {
    return reversalRequest;
  }

  public void setReversalRequest(PoipoiIdfinancialServiceServiceRequestReversalRequest reversalRequest) {
    this.reversalRequest = reversalRequest;
  }

  public PoipoiIdfinancialServiceServiceRequest supplementaryData(Object supplementaryData) {
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

  public PoipoiIdfinancialServiceServiceRequest storedValueRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest storedValueRequest) {
    this.storedValueRequest = storedValueRequest;
    return this;
  }

   /**
   * Get storedValueRequest
   * @return storedValueRequest
  **/
  @Schema(description = "")
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest getStoredValueRequest() {
    return storedValueRequest;
  }

  public void setStoredValueRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest storedValueRequest) {
    this.storedValueRequest = storedValueRequest;
  }

  public PoipoiIdfinancialServiceServiceRequest serviceContent(Object serviceContent) {
    this.serviceContent = serviceContent;
    return this;
  }

   /**
   * List of specific services for ServiceRequest&lt;br/&gt;- **FSPQ: FinancialPaymentRequest**  : *The Sale System requests to the POI System to perform a payment(Purchase/Refund/PWCB/MOTO Payment/...).*&lt;br/&gt;- **FSRQ: FinancialReversalRequest**  : *The Sale System requests to the POI System to perform a reversal partial or complete to cancel a former payment service.*&lt;br/&gt;- **FSIQ: FinancialBalanceInquiryRequest**  : *The Sale System requests to the POI System to perform balance inquiry on the main account.*&lt;br/&gt;- **FSBQ: FinancialBatchRequest**  : *The Batch message pair is used to request or get the result of transactions (payment, loyalty and reversal) performed without connection to the Sale system (Payment delivery).*&lt;br/&gt;- **FSLQ: FinancialLoyaltyRequest**  : *The Sale System requests to the POI System a loyalty service like loading or redeem.*&lt;br/&gt;- **FSVQ: FinancialStoredValueRequest**  : *The Sale System requests to the POI System to manage a stored value card or account (eg. Load, Payment, Reimbursement).*&lt;br/&gt;- **FSEQ: FinancialEnableServiceRequest**  : *The Sale System requests to the POI System to enable a service on its side.*&lt;br/&gt;- **FSAQ: FinancialCardAcquisitionRequest**  : *The Sale System requests to the POI System to handle a card data acquisition on the card reader.*&lt;br/&gt;- **FSCQ: FinancialReconciliationRequest**  : *The Sale System request to the POI System different kinds of transaction reconciliation. *&lt;br/&gt;
   * @return serviceContent
  **/
  @Schema(required = true, description = "List of specific services for ServiceRequest<br/>- **FSPQ: FinancialPaymentRequest**  : *The Sale System requests to the POI System to perform a payment(Purchase/Refund/PWCB/MOTO Payment/...).*<br/>- **FSRQ: FinancialReversalRequest**  : *The Sale System requests to the POI System to perform a reversal partial or complete to cancel a former payment service.*<br/>- **FSIQ: FinancialBalanceInquiryRequest**  : *The Sale System requests to the POI System to perform balance inquiry on the main account.*<br/>- **FSBQ: FinancialBatchRequest**  : *The Batch message pair is used to request or get the result of transactions (payment, loyalty and reversal) performed without connection to the Sale system (Payment delivery).*<br/>- **FSLQ: FinancialLoyaltyRequest**  : *The Sale System requests to the POI System a loyalty service like loading or redeem.*<br/>- **FSVQ: FinancialStoredValueRequest**  : *The Sale System requests to the POI System to manage a stored value card or account (eg. Load, Payment, Reimbursement).*<br/>- **FSEQ: FinancialEnableServiceRequest**  : *The Sale System requests to the POI System to enable a service on its side.*<br/>- **FSAQ: FinancialCardAcquisitionRequest**  : *The Sale System requests to the POI System to handle a card data acquisition on the card reader.*<br/>- **FSCQ: FinancialReconciliationRequest**  : *The Sale System request to the POI System different kinds of transaction reconciliation. *<br/>")
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
    PoipoiIdfinancialServiceServiceRequest poipoiIdfinancialServiceServiceRequest = (PoipoiIdfinancialServiceServiceRequest) o;
    return Objects.equals(this.balanceInquiryRequest, poipoiIdfinancialServiceServiceRequest.balanceInquiryRequest) &&
        Objects.equals(this.batchRequest, poipoiIdfinancialServiceServiceRequest.batchRequest) &&
        Objects.equals(this.cardAcquisitionRequest, poipoiIdfinancialServiceServiceRequest.cardAcquisitionRequest) &&
        Objects.equals(this.context, poipoiIdfinancialServiceServiceRequest.context) &&
        Objects.equals(this.environment, poipoiIdfinancialServiceServiceRequest.environment) &&
        Objects.equals(this.loyaltyRequest, poipoiIdfinancialServiceServiceRequest.loyaltyRequest) &&
        Objects.equals(this.enableServiceRequest, poipoiIdfinancialServiceServiceRequest.enableServiceRequest) &&
        Objects.equals(this.paymentRequest, poipoiIdfinancialServiceServiceRequest.paymentRequest) &&
        Objects.equals(this.reversalRequest, poipoiIdfinancialServiceServiceRequest.reversalRequest) &&
        Objects.equals(this.supplementaryData, poipoiIdfinancialServiceServiceRequest.supplementaryData) &&
        Objects.equals(this.storedValueRequest, poipoiIdfinancialServiceServiceRequest.storedValueRequest) &&
        Objects.equals(this.serviceContent, poipoiIdfinancialServiceServiceRequest.serviceContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceInquiryRequest, batchRequest, cardAcquisitionRequest, context, environment, loyaltyRequest, enableServiceRequest, paymentRequest, reversalRequest, supplementaryData, storedValueRequest, serviceContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequest {\n");
    
    sb.append("    balanceInquiryRequest: ").append(toIndentedString(balanceInquiryRequest)).append("\n");
    sb.append("    batchRequest: ").append(toIndentedString(batchRequest)).append("\n");
    sb.append("    cardAcquisitionRequest: ").append(toIndentedString(cardAcquisitionRequest)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    loyaltyRequest: ").append(toIndentedString(loyaltyRequest)).append("\n");
    sb.append("    enableServiceRequest: ").append(toIndentedString(enableServiceRequest)).append("\n");
    sb.append("    paymentRequest: ").append(toIndentedString(paymentRequest)).append("\n");
    sb.append("    reversalRequest: ").append(toIndentedString(reversalRequest)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    storedValueRequest: ").append(toIndentedString(storedValueRequest)).append("\n");
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
