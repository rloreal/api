package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Defines the service to be called.&lt;br/&gt;
 */
@Schema(description = "Defines the service to be called.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceRequestV06ServiceRequest   {
  @JsonProperty("BalanceInquiryRequest")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest balanceInquiryRequest = null;

  @JsonProperty("BatchRequest")
  private PoipoiIdfinancialServiceServiceRequestBatchRequest batchRequest = null;

  @JsonProperty("CardAcquisitionRequest")
  private PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest cardAcquisitionRequest = null;

  @JsonProperty("Context")
  private PoipoiIdfinancialServiceServiceRequestContext context = null;

  @JsonProperty("Environment")
  private PoipoiIdfinancialServiceServiceRequestEnvironment environment = null;

  @JsonProperty("LoyaltyRequest")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequest loyaltyRequest = null;

  @JsonProperty("EnableServiceRequest")
  private PoipoiIdfinancialServiceServiceRequestEnableServiceRequest enableServiceRequest = null;

  @JsonProperty("PaymentRequest")
  private PoipoiIdfinancialServiceServiceRequestPaymentRequest paymentRequest = null;

  @JsonProperty("ReversalRequest")
  private PoipoiIdfinancialServiceServiceRequestReversalRequest reversalRequest = null;

  @JsonProperty("SupplementaryData")
  private Object supplementaryData = null;

  @JsonProperty("StoredValueRequest")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest storedValueRequest = null;

  @JsonProperty("ServiceContent")
  private Object serviceContent = null;

  public SaleToPOIServiceRequestV06ServiceRequest balanceInquiryRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest balanceInquiryRequest) {
    this.balanceInquiryRequest = balanceInquiryRequest;
    return this;
  }

  /**
   * Get balanceInquiryRequest
   * @return balanceInquiryRequest
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest getBalanceInquiryRequest() {
    return balanceInquiryRequest;
  }

  public void setBalanceInquiryRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest balanceInquiryRequest) {
    this.balanceInquiryRequest = balanceInquiryRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest batchRequest(PoipoiIdfinancialServiceServiceRequestBatchRequest batchRequest) {
    this.batchRequest = batchRequest;
    return this;
  }

  /**
   * Get batchRequest
   * @return batchRequest
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBatchRequest getBatchRequest() {
    return batchRequest;
  }

  public void setBatchRequest(PoipoiIdfinancialServiceServiceRequestBatchRequest batchRequest) {
    this.batchRequest = batchRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest cardAcquisitionRequest(PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest cardAcquisitionRequest) {
    this.cardAcquisitionRequest = cardAcquisitionRequest;
    return this;
  }

  /**
   * Get cardAcquisitionRequest
   * @return cardAcquisitionRequest
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest getCardAcquisitionRequest() {
    return cardAcquisitionRequest;
  }

  public void setCardAcquisitionRequest(PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest cardAcquisitionRequest) {
    this.cardAcquisitionRequest = cardAcquisitionRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest context(PoipoiIdfinancialServiceServiceRequestContext context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestContext getContext() {
    return context;
  }

  public void setContext(PoipoiIdfinancialServiceServiceRequestContext context) {
    this.context = context;
  }

  public SaleToPOIServiceRequestV06ServiceRequest environment(PoipoiIdfinancialServiceServiceRequestEnvironment environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironment getEnvironment() {
    return environment;
  }

  public void setEnvironment(PoipoiIdfinancialServiceServiceRequestEnvironment environment) {
    this.environment = environment;
  }

  public SaleToPOIServiceRequestV06ServiceRequest loyaltyRequest(PoipoiIdfinancialServiceServiceRequestLoyaltyRequest loyaltyRequest) {
    this.loyaltyRequest = loyaltyRequest;
    return this;
  }

  /**
   * Get loyaltyRequest
   * @return loyaltyRequest
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequest getLoyaltyRequest() {
    return loyaltyRequest;
  }

  public void setLoyaltyRequest(PoipoiIdfinancialServiceServiceRequestLoyaltyRequest loyaltyRequest) {
    this.loyaltyRequest = loyaltyRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest enableServiceRequest(PoipoiIdfinancialServiceServiceRequestEnableServiceRequest enableServiceRequest) {
    this.enableServiceRequest = enableServiceRequest;
    return this;
  }

  /**
   * Get enableServiceRequest
   * @return enableServiceRequest
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnableServiceRequest getEnableServiceRequest() {
    return enableServiceRequest;
  }

  public void setEnableServiceRequest(PoipoiIdfinancialServiceServiceRequestEnableServiceRequest enableServiceRequest) {
    this.enableServiceRequest = enableServiceRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest paymentRequest(PoipoiIdfinancialServiceServiceRequestPaymentRequest paymentRequest) {
    this.paymentRequest = paymentRequest;
    return this;
  }

  /**
   * Get paymentRequest
   * @return paymentRequest
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestPaymentRequest getPaymentRequest() {
    return paymentRequest;
  }

  public void setPaymentRequest(PoipoiIdfinancialServiceServiceRequestPaymentRequest paymentRequest) {
    this.paymentRequest = paymentRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest reversalRequest(PoipoiIdfinancialServiceServiceRequestReversalRequest reversalRequest) {
    this.reversalRequest = reversalRequest;
    return this;
  }

  /**
   * Get reversalRequest
   * @return reversalRequest
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestReversalRequest getReversalRequest() {
    return reversalRequest;
  }

  public void setReversalRequest(PoipoiIdfinancialServiceServiceRequestReversalRequest reversalRequest) {
    this.reversalRequest = reversalRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest supplementaryData(Object supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  /**
   * Additional information incorporated as an extension to the message.
   * @return supplementaryData
   **/
  @Schema(description = "Additional information incorporated as an extension to the message.")
      @NotNull

    public Object getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(Object supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  public SaleToPOIServiceRequestV06ServiceRequest storedValueRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest storedValueRequest) {
    this.storedValueRequest = storedValueRequest;
    return this;
  }

  /**
   * Get storedValueRequest
   * @return storedValueRequest
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest getStoredValueRequest() {
    return storedValueRequest;
  }

  public void setStoredValueRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest storedValueRequest) {
    this.storedValueRequest = storedValueRequest;
  }

  public SaleToPOIServiceRequestV06ServiceRequest serviceContent(Object serviceContent) {
    this.serviceContent = serviceContent;
    return this;
  }

  /**
   * List of specific services for ServiceRequest<br/>- **FSPQ: FinancialPaymentRequest**  : *The Sale System requests to the POI System to perform a payment(Purchase/Refund/PWCB/MOTO Payment/...).*<br/>- **FSRQ: FinancialReversalRequest**  : *The Sale System requests to the POI System to perform a reversal partial or complete to cancel a former payment service.*<br/>- **FSIQ: FinancialBalanceInquiryRequest**  : *The Sale System requests to the POI System to perform balance inquiry on the main account.*<br/>- **FSBQ: FinancialBatchRequest**  : *The Batch message pair is used to request or get the result of transactions (payment, loyalty and reversal) performed without connection to the Sale system (Payment delivery).*<br/>- **FSLQ: FinancialLoyaltyRequest**  : *The Sale System requests to the POI System a loyalty service like loading or redeem.*<br/>- **FSVQ: FinancialStoredValueRequest**  : *The Sale System requests to the POI System to manage a stored value card or account (eg. Load, Payment, Reimbursement).*<br/>- **FSEQ: FinancialEnableServiceRequest**  : *The Sale System requests to the POI System to enable a service on its side.*<br/>- **FSAQ: FinancialCardAcquisitionRequest**  : *The Sale System requests to the POI System to handle a card data acquisition on the card reader.*<br/>- **FSCQ: FinancialReconciliationRequest**  : *The Sale System request to the POI System different kinds of transaction reconciliation. *<br/>
   * @return serviceContent
   **/
  @Schema(required = true, description = "List of specific services for ServiceRequest<br/>- **FSPQ: FinancialPaymentRequest**  : *The Sale System requests to the POI System to perform a payment(Purchase/Refund/PWCB/MOTO Payment/...).*<br/>- **FSRQ: FinancialReversalRequest**  : *The Sale System requests to the POI System to perform a reversal partial or complete to cancel a former payment service.*<br/>- **FSIQ: FinancialBalanceInquiryRequest**  : *The Sale System requests to the POI System to perform balance inquiry on the main account.*<br/>- **FSBQ: FinancialBatchRequest**  : *The Batch message pair is used to request or get the result of transactions (payment, loyalty and reversal) performed without connection to the Sale system (Payment delivery).*<br/>- **FSLQ: FinancialLoyaltyRequest**  : *The Sale System requests to the POI System a loyalty service like loading or redeem.*<br/>- **FSVQ: FinancialStoredValueRequest**  : *The Sale System requests to the POI System to manage a stored value card or account (eg. Load, Payment, Reimbursement).*<br/>- **FSEQ: FinancialEnableServiceRequest**  : *The Sale System requests to the POI System to enable a service on its side.*<br/>- **FSAQ: FinancialCardAcquisitionRequest**  : *The Sale System requests to the POI System to handle a card data acquisition on the card reader.*<br/>- **FSCQ: FinancialReconciliationRequest**  : *The Sale System request to the POI System different kinds of transaction reconciliation. *<br/>")
      @NotNull

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
    SaleToPOIServiceRequestV06ServiceRequest saleToPOIServiceRequestV06ServiceRequest = (SaleToPOIServiceRequestV06ServiceRequest) o;
    return Objects.equals(this.balanceInquiryRequest, saleToPOIServiceRequestV06ServiceRequest.balanceInquiryRequest) &&
        Objects.equals(this.batchRequest, saleToPOIServiceRequestV06ServiceRequest.batchRequest) &&
        Objects.equals(this.cardAcquisitionRequest, saleToPOIServiceRequestV06ServiceRequest.cardAcquisitionRequest) &&
        Objects.equals(this.context, saleToPOIServiceRequestV06ServiceRequest.context) &&
        Objects.equals(this.environment, saleToPOIServiceRequestV06ServiceRequest.environment) &&
        Objects.equals(this.loyaltyRequest, saleToPOIServiceRequestV06ServiceRequest.loyaltyRequest) &&
        Objects.equals(this.enableServiceRequest, saleToPOIServiceRequestV06ServiceRequest.enableServiceRequest) &&
        Objects.equals(this.paymentRequest, saleToPOIServiceRequestV06ServiceRequest.paymentRequest) &&
        Objects.equals(this.reversalRequest, saleToPOIServiceRequestV06ServiceRequest.reversalRequest) &&
        Objects.equals(this.supplementaryData, saleToPOIServiceRequestV06ServiceRequest.supplementaryData) &&
        Objects.equals(this.storedValueRequest, saleToPOIServiceRequestV06ServiceRequest.storedValueRequest) &&
        Objects.equals(this.serviceContent, saleToPOIServiceRequestV06ServiceRequest.serviceContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceInquiryRequest, batchRequest, cardAcquisitionRequest, context, environment, loyaltyRequest, enableServiceRequest, paymentRequest, reversalRequest, supplementaryData, storedValueRequest, serviceContent);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
