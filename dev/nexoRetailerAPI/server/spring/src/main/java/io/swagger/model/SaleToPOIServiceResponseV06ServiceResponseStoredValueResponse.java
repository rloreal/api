package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response data to a stored value request.&lt;br/&gt;
 */
@Schema(description = "Response data to a stored value request.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse   {
  @JsonProperty("POITransactionIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification = null;

  @JsonProperty("ReceiptV07")
  private Object receiptV07 = null;

  @JsonProperty("Result")
  private Object result = null;

  @JsonProperty("SaleTransactionIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification = null;

  public SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse poITransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification) {
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

  public SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse receiptV07(Object receiptV07) {
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

  public SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse result(Object result) {
    this.result = result;
    return this;
  }

  /**
   * Result of loading/reloading a stored value card.
   * @return result
   **/
  @Schema(description = "Result of loading/reloading a stored value card.")
      @NotNull

    public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse saleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
    return this;
  }

  /**
   * Get saleTransactionIdentification
   * @return saleTransactionIdentification
   **/
  @Schema(description = "")
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
    SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse saleToPOIServiceResponseV06ServiceResponseStoredValueResponse = (SaleToPOIServiceResponseV06ServiceResponseStoredValueResponse) o;
    return Objects.equals(this.poITransactionIdentification, saleToPOIServiceResponseV06ServiceResponseStoredValueResponse.poITransactionIdentification) &&
        Objects.equals(this.receiptV07, saleToPOIServiceResponseV06ServiceResponseStoredValueResponse.receiptV07) &&
        Objects.equals(this.result, saleToPOIServiceResponseV06ServiceResponseStoredValueResponse.result) &&
        Objects.equals(this.saleTransactionIdentification, saleToPOIServiceResponseV06ServiceResponseStoredValueResponse.saleTransactionIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poITransactionIdentification, receiptV07, result, saleTransactionIdentification);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
