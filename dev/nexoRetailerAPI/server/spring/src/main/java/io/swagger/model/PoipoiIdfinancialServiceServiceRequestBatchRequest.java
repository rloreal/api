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
 * Data to request a batch service.&lt;br/&gt;
 */
@Schema(description = "Data to request a batch service.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestBatchRequest   {
  @JsonProperty("RemoveAllFlag")
  private Object removeAllFlag = null;

  @JsonProperty("SaleBatchIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleBatchIdentification = null;

  @JsonProperty("TransactionToPerform")
  private Object transactionToPerform = null;

  public PoipoiIdfinancialServiceServiceRequestBatchRequest removeAllFlag(Object removeAllFlag) {
    this.removeAllFlag = removeAllFlag;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return removeAllFlag
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getRemoveAllFlag() {
    return removeAllFlag;
  }

  public void setRemoveAllFlag(Object removeAllFlag) {
    this.removeAllFlag = removeAllFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestBatchRequest saleBatchIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleBatchIdentification) {
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

  public PoipoiIdfinancialServiceServiceRequestBatchRequest transactionToPerform(Object transactionToPerform) {
    this.transactionToPerform = transactionToPerform;
    return this;
  }

  /**
   * Content of the Batch Request message.
   * @return transactionToPerform
   **/
  @Schema(description = "Content of the Batch Request message.")
      @NotNull

    public Object getTransactionToPerform() {
    return transactionToPerform;
  }

  public void setTransactionToPerform(Object transactionToPerform) {
    this.transactionToPerform = transactionToPerform;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestBatchRequest poipoiIdfinancialServiceServiceRequestBatchRequest = (PoipoiIdfinancialServiceServiceRequestBatchRequest) o;
    return Objects.equals(this.removeAllFlag, poipoiIdfinancialServiceServiceRequestBatchRequest.removeAllFlag) &&
        Objects.equals(this.saleBatchIdentification, poipoiIdfinancialServiceServiceRequestBatchRequest.saleBatchIdentification) &&
        Objects.equals(this.transactionToPerform, poipoiIdfinancialServiceServiceRequestBatchRequest.transactionToPerform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removeAllFlag, saleBatchIdentification, transactionToPerform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestBatchRequest {\n");
    
    sb.append("    removeAllFlag: ").append(toIndentedString(removeAllFlag)).append("\n");
    sb.append("    saleBatchIdentification: ").append(toIndentedString(saleBatchIdentification)).append("\n");
    sb.append("    transactionToPerform: ").append(toIndentedString(transactionToPerform)).append("\n");
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
