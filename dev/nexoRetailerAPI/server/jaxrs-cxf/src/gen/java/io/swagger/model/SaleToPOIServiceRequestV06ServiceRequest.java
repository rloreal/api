package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBatchRequest;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContext;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnableServiceRequest;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironment;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequest;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestPaymentRequest;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestReversalRequest;
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
  * Defines the service to be called.<br/>
 **/
@Schema(description="Defines the service to be called.<br/>")
public class SaleToPOIServiceRequestV06ServiceRequest   {
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest balanceInquiryRequest = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBatchRequest batchRequest = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest cardAcquisitionRequest = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestContext context = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironment environment = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequest loyaltyRequest = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnableServiceRequest enableServiceRequest = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestPaymentRequest paymentRequest = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestReversalRequest reversalRequest = null;
  
  @Schema(description = "Additional information incorporated as an extension to the message.")
 /**
   * Additional information incorporated as an extension to the message.  
  **/
  private Object supplementaryData = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest storedValueRequest = null;
  
  @Schema(required = true, description = "List of specific services for ServiceRequest<br/>- **FSPQ: FinancialPaymentRequest**  : *The Sale System requests to the POI System to perform a payment(Purchase/Refund/PWCB/MOTO Payment/...).*<br/>- **FSRQ: FinancialReversalRequest**  : *The Sale System requests to the POI System to perform a reversal partial or complete to cancel a former payment service.*<br/>- **FSIQ: FinancialBalanceInquiryRequest**  : *The Sale System requests to the POI System to perform balance inquiry on the main account.*<br/>- **FSBQ: FinancialBatchRequest**  : *The Batch message pair is used to request or get the result of transactions (payment, loyalty and reversal) performed without connection to the Sale system (Payment delivery).*<br/>- **FSLQ: FinancialLoyaltyRequest**  : *The Sale System requests to the POI System a loyalty service like loading or redeem.*<br/>- **FSVQ: FinancialStoredValueRequest**  : *The Sale System requests to the POI System to manage a stored value card or account (eg. Load, Payment, Reimbursement).*<br/>- **FSEQ: FinancialEnableServiceRequest**  : *The Sale System requests to the POI System to enable a service on its side.*<br/>- **FSAQ: FinancialCardAcquisitionRequest**  : *The Sale System requests to the POI System to handle a card data acquisition on the card reader.*<br/>- **FSCQ: FinancialReconciliationRequest**  : *The Sale System request to the POI System different kinds of transaction reconciliation. *<br/>")
 /**
   * List of specific services for ServiceRequest<br/>- **FSPQ: FinancialPaymentRequest**  : *The Sale System requests to the POI System to perform a payment(Purchase/Refund/PWCB/MOTO Payment/...).*<br/>- **FSRQ: FinancialReversalRequest**  : *The Sale System requests to the POI System to perform a reversal partial or complete to cancel a former payment service.*<br/>- **FSIQ: FinancialBalanceInquiryRequest**  : *The Sale System requests to the POI System to perform balance inquiry on the main account.*<br/>- **FSBQ: FinancialBatchRequest**  : *The Batch message pair is used to request or get the result of transactions (payment, loyalty and reversal) performed without connection to the Sale system (Payment delivery).*<br/>- **FSLQ: FinancialLoyaltyRequest**  : *The Sale System requests to the POI System a loyalty service like loading or redeem.*<br/>- **FSVQ: FinancialStoredValueRequest**  : *The Sale System requests to the POI System to manage a stored value card or account (eg. Load, Payment, Reimbursement).*<br/>- **FSEQ: FinancialEnableServiceRequest**  : *The Sale System requests to the POI System to enable a service on its side.*<br/>- **FSAQ: FinancialCardAcquisitionRequest**  : *The Sale System requests to the POI System to handle a card data acquisition on the card reader.*<br/>- **FSCQ: FinancialReconciliationRequest**  : *The Sale System request to the POI System different kinds of transaction reconciliation. *<br/>  
  **/
  private Object serviceContent = null;
 /**
   * Get balanceInquiryRequest
   * @return balanceInquiryRequest
  **/
  @JsonProperty("BalanceInquiryRequest")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest getBalanceInquiryRequest() {
    return balanceInquiryRequest;
  }

  public void setBalanceInquiryRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest balanceInquiryRequest) {
    this.balanceInquiryRequest = balanceInquiryRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest balanceInquiryRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest balanceInquiryRequest) {
    this.balanceInquiryRequest = balanceInquiryRequest;
    return this;
  }

 /**
   * Get batchRequest
   * @return batchRequest
  **/
  @JsonProperty("BatchRequest")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBatchRequest getBatchRequest() {
    return batchRequest;
  }

  public void setBatchRequest(PoipoiIdfinancialServiceServiceRequestBatchRequest batchRequest) {
    this.batchRequest = batchRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest batchRequest(PoipoiIdfinancialServiceServiceRequestBatchRequest batchRequest) {
    this.batchRequest = batchRequest;
    return this;
  }

 /**
   * Get cardAcquisitionRequest
   * @return cardAcquisitionRequest
  **/
  @JsonProperty("CardAcquisitionRequest")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest getCardAcquisitionRequest() {
    return cardAcquisitionRequest;
  }

  public void setCardAcquisitionRequest(PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest cardAcquisitionRequest) {
    this.cardAcquisitionRequest = cardAcquisitionRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest cardAcquisitionRequest(PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest cardAcquisitionRequest) {
    this.cardAcquisitionRequest = cardAcquisitionRequest;
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

  public SaleToPOIServiceRequestV06ServiceRequest context(PoipoiIdfinancialServiceServiceRequestContext context) {
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

  public SaleToPOIServiceRequestV06ServiceRequest environment(PoipoiIdfinancialServiceServiceRequestEnvironment environment) {
    this.environment = environment;
    return this;
  }

 /**
   * Get loyaltyRequest
   * @return loyaltyRequest
  **/
  @JsonProperty("LoyaltyRequest")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequest getLoyaltyRequest() {
    return loyaltyRequest;
  }

  public void setLoyaltyRequest(PoipoiIdfinancialServiceServiceRequestLoyaltyRequest loyaltyRequest) {
    this.loyaltyRequest = loyaltyRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest loyaltyRequest(PoipoiIdfinancialServiceServiceRequestLoyaltyRequest loyaltyRequest) {
    this.loyaltyRequest = loyaltyRequest;
    return this;
  }

 /**
   * Get enableServiceRequest
   * @return enableServiceRequest
  **/
  @JsonProperty("EnableServiceRequest")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequest getEnableServiceRequest() {
    return enableServiceRequest;
  }

  public void setEnableServiceRequest(PoipoiIdfinancialServiceServiceRequestEnableServiceRequest enableServiceRequest) {
    this.enableServiceRequest = enableServiceRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest enableServiceRequest(PoipoiIdfinancialServiceServiceRequestEnableServiceRequest enableServiceRequest) {
    this.enableServiceRequest = enableServiceRequest;
    return this;
  }

 /**
   * Get paymentRequest
   * @return paymentRequest
  **/
  @JsonProperty("PaymentRequest")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestPaymentRequest getPaymentRequest() {
    return paymentRequest;
  }

  public void setPaymentRequest(PoipoiIdfinancialServiceServiceRequestPaymentRequest paymentRequest) {
    this.paymentRequest = paymentRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest paymentRequest(PoipoiIdfinancialServiceServiceRequestPaymentRequest paymentRequest) {
    this.paymentRequest = paymentRequest;
    return this;
  }

 /**
   * Get reversalRequest
   * @return reversalRequest
  **/
  @JsonProperty("ReversalRequest")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestReversalRequest getReversalRequest() {
    return reversalRequest;
  }

  public void setReversalRequest(PoipoiIdfinancialServiceServiceRequestReversalRequest reversalRequest) {
    this.reversalRequest = reversalRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest reversalRequest(PoipoiIdfinancialServiceServiceRequestReversalRequest reversalRequest) {
    this.reversalRequest = reversalRequest;
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

  public SaleToPOIServiceRequestV06ServiceRequest supplementaryData(Object supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

 /**
   * Get storedValueRequest
   * @return storedValueRequest
  **/
  @JsonProperty("StoredValueRequest")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest getStoredValueRequest() {
    return storedValueRequest;
  }

  public void setStoredValueRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest storedValueRequest) {
    this.storedValueRequest = storedValueRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest storedValueRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest storedValueRequest) {
    this.storedValueRequest = storedValueRequest;
    return this;
  }

 /**
   * List of specific services for ServiceRequest&lt;br/&gt;- **FSPQ: FinancialPaymentRequest**  : *The Sale System requests to the POI System to perform a payment(Purchase/Refund/PWCB/MOTO Payment/...).*&lt;br/&gt;- **FSRQ: FinancialReversalRequest**  : *The Sale System requests to the POI System to perform a reversal partial or complete to cancel a former payment service.*&lt;br/&gt;- **FSIQ: FinancialBalanceInquiryRequest**  : *The Sale System requests to the POI System to perform balance inquiry on the main account.*&lt;br/&gt;- **FSBQ: FinancialBatchRequest**  : *The Batch message pair is used to request or get the result of transactions (payment, loyalty and reversal) performed without connection to the Sale system (Payment delivery).*&lt;br/&gt;- **FSLQ: FinancialLoyaltyRequest**  : *The Sale System requests to the POI System a loyalty service like loading or redeem.*&lt;br/&gt;- **FSVQ: FinancialStoredValueRequest**  : *The Sale System requests to the POI System to manage a stored value card or account (eg. Load, Payment, Reimbursement).*&lt;br/&gt;- **FSEQ: FinancialEnableServiceRequest**  : *The Sale System requests to the POI System to enable a service on its side.*&lt;br/&gt;- **FSAQ: FinancialCardAcquisitionRequest**  : *The Sale System requests to the POI System to handle a card data acquisition on the card reader.*&lt;br/&gt;- **FSCQ: FinancialReconciliationRequest**  : *The Sale System request to the POI System different kinds of transaction reconciliation. *&lt;br/&gt;
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

  public SaleToPOIServiceRequestV06ServiceRequest serviceContent(Object serviceContent) {
    this.serviceContent = serviceContent;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceRequestV06ServiceRequest {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
