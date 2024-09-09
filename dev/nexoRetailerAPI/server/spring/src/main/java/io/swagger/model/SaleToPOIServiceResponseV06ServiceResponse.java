package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Specifies the response of the corresponding service request.&lt;br/&gt;
 */
@Schema(description = "Specifies the response of the corresponding service request.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceResponseV06ServiceResponse   {
  @JsonProperty("BalanceInquiryResponse")
  private SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponse balanceInquiryResponse = null;

  @JsonProperty("BatchResponse")
  private SaleToPOIServiceResponseV06ServiceResponseBatchResponse batchResponse = null;

  @JsonProperty("CardAcquisitionResponse")
  private SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse cardAcquisitionResponse = null;

  @JsonProperty("Context")
  private PoipoiIdfinancialServiceServiceRequestContext context = null;

  @JsonProperty("Environment")
  private PoipoiIdfinancialServiceServiceRequestEnvironment environment = null;

  @JsonProperty("LoyaltyResponse")
  private SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse loyaltyResponse = null;

  @JsonProperty("PaymentResponse")
  private SaleToPOIServiceResponseV06ServiceResponsePaymentResponse paymentResponse = null;

  @JsonProperty("Response")
  private SaleToPOIServiceResponseV06ServiceResponseResponse response = null;

  @JsonProperty("ReversalResponse")
  private SaleToPOIServiceResponseV06ServiceResponseReversalResponse reversalResponse = null;

  @JsonProperty("SupplementaryData")
  private Object supplementaryData = null;

  @JsonProperty("StoredValueResponse")
  private SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse storedValueResponse = null;

  @JsonProperty("ServiceContent")
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
      @NotNull

    @Valid
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
      @NotNull

    @Valid
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
      @NotNull

    @Valid
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
      @NotNull

    @Valid
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
      @NotNull

    @Valid
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
      @NotNull

    @Valid
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
      @NotNull

    @Valid
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
      @NotNull

    @Valid
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
      @NotNull

    @Valid
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
      @NotNull

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
      @NotNull

    @Valid
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
   * List of specific services for ServiceResponse.<br/>- **FSPP: FinancialPaymentResponse**  : *The POI System sends a response to a payment request (Purchase/refund/PWCB/MOTO Payment/...).*<br/>- **FSRP: FinancialReversalResponse**  : *The POI System sends a response to a reversal request.*<br/>- **FSIP: FinancialBalanceInquiryResponse**  : *The POI System sends a response to a Balance Inquiry request.*<br/>- **FSBP: FinancialBatchResponse**  : *The POI System sends a response to a batch processing request.*<br/>- **FSLP: FinancialLoyaltyResponse**  : *The POI System sends a response to a loyalty processing request.*<br/>- **FSVP: FinancialStoredValueResponse**  : *The POI System sends a response to a stored value card or account request.*<br/>- **FSEP: FinancialEnableServiceResponse**  : *The POI System sends a response after enabling or not some service.*<br/>- **FSAP: FinancialCardAcquisitionResponse**  : *The POI System sends a response to a card data acquisition request.*<br/>- **FSCP: FinancialReconciliationResponse**  : *The POI System sends a response to a reconciliation request.*<br/>
   * @return serviceContent
   **/
  @Schema(required = true, description = "List of specific services for ServiceResponse.<br/>- **FSPP: FinancialPaymentResponse**  : *The POI System sends a response to a payment request (Purchase/refund/PWCB/MOTO Payment/...).*<br/>- **FSRP: FinancialReversalResponse**  : *The POI System sends a response to a reversal request.*<br/>- **FSIP: FinancialBalanceInquiryResponse**  : *The POI System sends a response to a Balance Inquiry request.*<br/>- **FSBP: FinancialBatchResponse**  : *The POI System sends a response to a batch processing request.*<br/>- **FSLP: FinancialLoyaltyResponse**  : *The POI System sends a response to a loyalty processing request.*<br/>- **FSVP: FinancialStoredValueResponse**  : *The POI System sends a response to a stored value card or account request.*<br/>- **FSEP: FinancialEnableServiceResponse**  : *The POI System sends a response after enabling or not some service.*<br/>- **FSAP: FinancialCardAcquisitionResponse**  : *The POI System sends a response to a card data acquisition request.*<br/>- **FSCP: FinancialReconciliationResponse**  : *The POI System sends a response to a reconciliation request.*<br/>")
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
