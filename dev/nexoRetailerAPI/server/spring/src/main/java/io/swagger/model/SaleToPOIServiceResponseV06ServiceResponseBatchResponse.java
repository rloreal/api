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
 * Content of the batch response message.&lt;br/&gt;
 */
@Schema(description = "Content of the batch response message.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceResponseV06ServiceResponseBatchResponse   {
  @JsonProperty("POIBatchIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poIBatchIdentification = null;

  @JsonProperty("PerformedTransaction")
  private Object performedTransaction = null;

  @JsonProperty("SaleBatchIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleBatchIdentification = null;

  public SaleToPOIServiceResponseV06ServiceResponseBatchResponse poIBatchIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poIBatchIdentification) {
    this.poIBatchIdentification = poIBatchIdentification;
    return this;
  }

  /**
   * Get poIBatchIdentification
   * @return poIBatchIdentification
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getPoIBatchIdentification() {
    return poIBatchIdentification;
  }

  public void setPoIBatchIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poIBatchIdentification) {
    this.poIBatchIdentification = poIBatchIdentification;
  }

  public SaleToPOIServiceResponseV06ServiceResponseBatchResponse performedTransaction(Object performedTransaction) {
    this.performedTransaction = performedTransaction;
    return this;
  }

  /**
   * Performed transaction content.
   * @return performedTransaction
   **/
  @Schema(description = "Performed transaction content.")
      @NotNull

    public Object getPerformedTransaction() {
    return performedTransaction;
  }

  public void setPerformedTransaction(Object performedTransaction) {
    this.performedTransaction = performedTransaction;
  }

  public SaleToPOIServiceResponseV06ServiceResponseBatchResponse saleBatchIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleBatchIdentification) {
    this.saleBatchIdentification = saleBatchIdentification;
    return this;
  }

  /**
   * Get saleBatchIdentification
   * @return saleBatchIdentification
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getSaleBatchIdentification() {
    return saleBatchIdentification;
  }

  public void setSaleBatchIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleBatchIdentification) {
    this.saleBatchIdentification = saleBatchIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleToPOIServiceResponseV06ServiceResponseBatchResponse saleToPOIServiceResponseV06ServiceResponseBatchResponse = (SaleToPOIServiceResponseV06ServiceResponseBatchResponse) o;
    return Objects.equals(this.poIBatchIdentification, saleToPOIServiceResponseV06ServiceResponseBatchResponse.poIBatchIdentification) &&
        Objects.equals(this.performedTransaction, saleToPOIServiceResponseV06ServiceResponseBatchResponse.performedTransaction) &&
        Objects.equals(this.saleBatchIdentification, saleToPOIServiceResponseV06ServiceResponseBatchResponse.saleBatchIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poIBatchIdentification, performedTransaction, saleBatchIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponseBatchResponse {\n");
    
    sb.append("    poIBatchIdentification: ").append(toIndentedString(poIBatchIdentification)).append("\n");
    sb.append("    performedTransaction: ").append(toIndentedString(performedTransaction)).append("\n");
    sb.append("    saleBatchIdentification: ").append(toIndentedString(saleBatchIdentification)).append("\n");
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
