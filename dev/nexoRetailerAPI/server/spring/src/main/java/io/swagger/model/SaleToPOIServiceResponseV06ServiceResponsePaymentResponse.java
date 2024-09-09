package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data to respond to a payment request.&lt;br/&gt;
 */
@Schema(description = "Data to respond to a payment request.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceResponseV06ServiceResponsePaymentResponse   {
  @JsonProperty("CustomerOrder")
  private Object customerOrder = null;

  @JsonProperty("IssuerReferenceData")
  private Object issuerReferenceData = null;

  @JsonProperty("LoyaltyResult")
  private Object loyaltyResult = null;

  @JsonProperty("POIReconciliationIdentification")
  private Object poIReconciliationIdentification = null;

  @JsonProperty("POITransactionIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification = null;

  @JsonProperty("PaymentReceipt")
  private Object paymentReceipt = null;

  @JsonProperty("RetailerPaymentResult")
  private SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult retailerPaymentResult = null;

  @JsonProperty("SaleReferenceIdentification")
  private Object saleReferenceIdentification = null;

  @JsonProperty("SaleTransactionIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification = null;

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse customerOrder(Object customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

  /**
   * Customer order attached to a customer, recorded in the POI system.
   * @return customerOrder
   **/
  @Schema(description = "Customer order attached to a customer, recorded in the POI system.")
      @NotNull

    public Object getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(Object customerOrder) {
    this.customerOrder = customerOrder;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse issuerReferenceData(Object issuerReferenceData) {
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

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse loyaltyResult(Object loyaltyResult) {
    this.loyaltyResult = loyaltyResult;
    return this;
  }

  /**
   * Data related to the result of a processed loyalty transaction.
   * @return loyaltyResult
   **/
  @Schema(description = "Data related to the result of a processed loyalty transaction.")
      @NotNull

    public Object getLoyaltyResult() {
    return loyaltyResult;
  }

  public void setLoyaltyResult(Object loyaltyResult) {
    this.loyaltyResult = loyaltyResult;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse poIReconciliationIdentification(Object poIReconciliationIdentification) {
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

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse poITransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification) {
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

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse paymentReceipt(Object paymentReceipt) {
    this.paymentReceipt = paymentReceipt;
    return this;
  }

  /**
   * Customer or Merchant payment receipt.
   * @return paymentReceipt
   **/
  @Schema(description = "Customer or Merchant payment receipt.")
      @NotNull

    public Object getPaymentReceipt() {
    return paymentReceipt;
  }

  public void setPaymentReceipt(Object paymentReceipt) {
    this.paymentReceipt = paymentReceipt;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse retailerPaymentResult(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult retailerPaymentResult) {
    this.retailerPaymentResult = retailerPaymentResult;
    return this;
  }

  /**
   * Get retailerPaymentResult
   * @return retailerPaymentResult
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult getRetailerPaymentResult() {
    return retailerPaymentResult;
  }

  public void setRetailerPaymentResult(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult retailerPaymentResult) {
    this.retailerPaymentResult = retailerPaymentResult;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse saleReferenceIdentification(Object saleReferenceIdentification) {
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

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponse saleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
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
    SaleToPOIServiceResponseV06ServiceResponsePaymentResponse saleToPOIServiceResponseV06ServiceResponsePaymentResponse = (SaleToPOIServiceResponseV06ServiceResponsePaymentResponse) o;
    return Objects.equals(this.customerOrder, saleToPOIServiceResponseV06ServiceResponsePaymentResponse.customerOrder) &&
        Objects.equals(this.issuerReferenceData, saleToPOIServiceResponseV06ServiceResponsePaymentResponse.issuerReferenceData) &&
        Objects.equals(this.loyaltyResult, saleToPOIServiceResponseV06ServiceResponsePaymentResponse.loyaltyResult) &&
        Objects.equals(this.poIReconciliationIdentification, saleToPOIServiceResponseV06ServiceResponsePaymentResponse.poIReconciliationIdentification) &&
        Objects.equals(this.poITransactionIdentification, saleToPOIServiceResponseV06ServiceResponsePaymentResponse.poITransactionIdentification) &&
        Objects.equals(this.paymentReceipt, saleToPOIServiceResponseV06ServiceResponsePaymentResponse.paymentReceipt) &&
        Objects.equals(this.retailerPaymentResult, saleToPOIServiceResponseV06ServiceResponsePaymentResponse.retailerPaymentResult) &&
        Objects.equals(this.saleReferenceIdentification, saleToPOIServiceResponseV06ServiceResponsePaymentResponse.saleReferenceIdentification) &&
        Objects.equals(this.saleTransactionIdentification, saleToPOIServiceResponseV06ServiceResponsePaymentResponse.saleTransactionIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOrder, issuerReferenceData, loyaltyResult, poIReconciliationIdentification, poITransactionIdentification, paymentReceipt, retailerPaymentResult, saleReferenceIdentification, saleTransactionIdentification);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
