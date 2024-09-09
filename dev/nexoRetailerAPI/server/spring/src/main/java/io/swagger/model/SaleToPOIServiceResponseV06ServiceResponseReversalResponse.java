package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response data to a reversal request.&lt;br/&gt;
 */
@Schema(description = "Response data to a reversal request.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceResponseV06ServiceResponseReversalResponse   {
  @JsonProperty("IssuerReferenceData")
  private Object issuerReferenceData = null;

  @JsonProperty("POIReconciliationIdentification")
  private Object poIReconciliationIdentification = null;

  @JsonProperty("POITransactionIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification = null;

  @JsonProperty("ReceiptV07")
  private Object receiptV07 = null;

  @JsonProperty("ReversedAmount")
  private Object reversedAmount = null;

  @JsonProperty("ReversalTransactionResult")
  private SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult reversalTransactionResult = null;

  @JsonProperty("SaleReferenceIdentification")
  private Object saleReferenceIdentification = null;

  @JsonProperty("SaleTransactionIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification = null;

  public SaleToPOIServiceResponseV06ServiceResponseReversalResponse issuerReferenceData(Object issuerReferenceData) {
    this.issuerReferenceData = issuerReferenceData;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 140 characters.<br/>
   * @return issuerReferenceData
   **/
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
      @NotNull

    public Object getIssuerReferenceData() {
    return issuerReferenceData;
  }

  public void setIssuerReferenceData(Object issuerReferenceData) {
    this.issuerReferenceData = issuerReferenceData;
  }

  public SaleToPOIServiceResponseV06ServiceResponseReversalResponse poIReconciliationIdentification(Object poIReconciliationIdentification) {
    this.poIReconciliationIdentification = poIReconciliationIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return poIReconciliationIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getPoIReconciliationIdentification() {
    return poIReconciliationIdentification;
  }

  public void setPoIReconciliationIdentification(Object poIReconciliationIdentification) {
    this.poIReconciliationIdentification = poIReconciliationIdentification;
  }

  public SaleToPOIServiceResponseV06ServiceResponseReversalResponse poITransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification) {
    this.poITransactionIdentification = poITransactionIdentification;
    return this;
  }

  /**
   * Get poITransactionIdentification
   * @return poITransactionIdentification
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getPoITransactionIdentification() {
    return poITransactionIdentification;
  }

  public void setPoITransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification) {
    this.poITransactionIdentification = poITransactionIdentification;
  }

  public SaleToPOIServiceResponseV06ServiceResponseReversalResponse receiptV07(Object receiptV07) {
    this.receiptV07 = receiptV07;
    return this;
  }

  /**
   * Scope  The Receipt message is sent by the transaction administrator to a member of the system. It is sent to acknowledge the receipt of one or multiple messages sent previously.  The Receipt message is an application receipt acknowledgement and conveys information about the processing of the original message(s).  Usage  The Receipt message is used when the exchange of messages takes place in an asynchronous manner.  This may happen, for instance, when an action is requested from the transaction administrator (a deletion, modification or cancellation). The transaction administrator will first acknowledge the request (with a Receipt message) and then execute it.  The message can contain information based on the following elements: reference of the message(s) it acknowledges, the status code (optional) and further explanation:  - reference of the message it acknowledges  - potentially, a status code and an explanation.
   * @return receiptV07
   **/
  @Schema(description = "Scope  The Receipt message is sent by the transaction administrator to a member of the system. It is sent to acknowledge the receipt of one or multiple messages sent previously.  The Receipt message is an application receipt acknowledgement and conveys information about the processing of the original message(s).  Usage  The Receipt message is used when the exchange of messages takes place in an asynchronous manner.  This may happen, for instance, when an action is requested from the transaction administrator (a deletion, modification or cancellation). The transaction administrator will first acknowledge the request (with a Receipt message) and then execute it.  The message can contain information based on the following elements: reference of the message(s) it acknowledges, the status code (optional) and further explanation:  - reference of the message it acknowledges  - potentially, a status code and an explanation.")
      @NotNull

    public Object getReceiptV07() {
    return receiptV07;
  }

  public void setReceiptV07(Object receiptV07) {
    this.receiptV07 = receiptV07;
  }

  public SaleToPOIServiceResponseV06ServiceResponseReversalResponse reversedAmount(Object reversedAmount) {
    this.reversedAmount = reversedAmount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return reversedAmount
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getReversedAmount() {
    return reversedAmount;
  }

  public void setReversedAmount(Object reversedAmount) {
    this.reversedAmount = reversedAmount;
  }

  public SaleToPOIServiceResponseV06ServiceResponseReversalResponse reversalTransactionResult(SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult reversalTransactionResult) {
    this.reversalTransactionResult = reversalTransactionResult;
    return this;
  }

  /**
   * Get reversalTransactionResult
   * @return reversalTransactionResult
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult getReversalTransactionResult() {
    return reversalTransactionResult;
  }

  public void setReversalTransactionResult(SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult reversalTransactionResult) {
    this.reversalTransactionResult = reversalTransactionResult;
  }

  public SaleToPOIServiceResponseV06ServiceResponseReversalResponse saleReferenceIdentification(Object saleReferenceIdentification) {
    this.saleReferenceIdentification = saleReferenceIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return saleReferenceIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getSaleReferenceIdentification() {
    return saleReferenceIdentification;
  }

  public void setSaleReferenceIdentification(Object saleReferenceIdentification) {
    this.saleReferenceIdentification = saleReferenceIdentification;
  }

  public SaleToPOIServiceResponseV06ServiceResponseReversalResponse saleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
    return this;
  }

  /**
   * Get saleTransactionIdentification
   * @return saleTransactionIdentification
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getSaleTransactionIdentification() {
    return saleTransactionIdentification;
  }

  public void setSaleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleToPOIServiceResponseV06ServiceResponseReversalResponse saleToPOIServiceResponseV06ServiceResponseReversalResponse = (SaleToPOIServiceResponseV06ServiceResponseReversalResponse) o;
    return Objects.equals(this.issuerReferenceData, saleToPOIServiceResponseV06ServiceResponseReversalResponse.issuerReferenceData) &&
        Objects.equals(this.poIReconciliationIdentification, saleToPOIServiceResponseV06ServiceResponseReversalResponse.poIReconciliationIdentification) &&
        Objects.equals(this.poITransactionIdentification, saleToPOIServiceResponseV06ServiceResponseReversalResponse.poITransactionIdentification) &&
        Objects.equals(this.receiptV07, saleToPOIServiceResponseV06ServiceResponseReversalResponse.receiptV07) &&
        Objects.equals(this.reversedAmount, saleToPOIServiceResponseV06ServiceResponseReversalResponse.reversedAmount) &&
        Objects.equals(this.reversalTransactionResult, saleToPOIServiceResponseV06ServiceResponseReversalResponse.reversalTransactionResult) &&
        Objects.equals(this.saleReferenceIdentification, saleToPOIServiceResponseV06ServiceResponseReversalResponse.saleReferenceIdentification) &&
        Objects.equals(this.saleTransactionIdentification, saleToPOIServiceResponseV06ServiceResponseReversalResponse.saleTransactionIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuerReferenceData, poIReconciliationIdentification, poITransactionIdentification, receiptV07, reversedAmount, reversalTransactionResult, saleReferenceIdentification, saleTransactionIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponseReversalResponse {\n");
    
    sb.append("    issuerReferenceData: ").append(toIndentedString(issuerReferenceData)).append("\n");
    sb.append("    poIReconciliationIdentification: ").append(toIndentedString(poIReconciliationIdentification)).append("\n");
    sb.append("    poITransactionIdentification: ").append(toIndentedString(poITransactionIdentification)).append("\n");
    sb.append("    receiptV07: ").append(toIndentedString(receiptV07)).append("\n");
    sb.append("    reversedAmount: ").append(toIndentedString(reversedAmount)).append("\n");
    sb.append("    reversalTransactionResult: ").append(toIndentedString(reversalTransactionResult)).append("\n");
    sb.append("    saleReferenceIdentification: ").append(toIndentedString(saleReferenceIdentification)).append("\n");
    sb.append("    saleTransactionIdentification: ").append(toIndentedString(saleTransactionIdentification)).append("\n");
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
