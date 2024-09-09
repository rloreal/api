package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
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
  * Content of the batch response message.<br/>
 **/
@Schema(description="Content of the batch response message.<br/>")
public class SaleToPOIServiceResponseV06ServiceResponseBatchResponse   {
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poIBatchIdentification = null;
  
  @Schema(description = "Performed transaction content.")
 /**
   * Performed transaction content.  
  **/
  private Object performedTransaction = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleBatchIdentification = null;
 /**
   * Get poIBatchIdentification
   * @return poIBatchIdentification
  **/
  @JsonProperty("POIBatchIdentification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getPoIBatchIdentification() {
    return poIBatchIdentification;
  }

  public void setPoIBatchIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poIBatchIdentification) {
    this.poIBatchIdentification = poIBatchIdentification;
  }

  public SaleToPOIServiceResponseV06ServiceResponseBatchResponse poIBatchIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poIBatchIdentification) {
    this.poIBatchIdentification = poIBatchIdentification;
    return this;
  }

 /**
   * Performed transaction content.
   * @return performedTransaction
  **/
  @JsonProperty("PerformedTransaction")
  @NotNull
  public Object getPerformedTransaction() {
    return performedTransaction;
  }

  public void setPerformedTransaction(Object performedTransaction) {
    this.performedTransaction = performedTransaction;
  }

  public SaleToPOIServiceResponseV06ServiceResponseBatchResponse performedTransaction(Object performedTransaction) {
    this.performedTransaction = performedTransaction;
    return this;
  }

 /**
   * Get saleBatchIdentification
   * @return saleBatchIdentification
  **/
  @JsonProperty("SaleBatchIdentification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getSaleBatchIdentification() {
    return saleBatchIdentification;
  }

  public void setSaleBatchIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleBatchIdentification) {
    this.saleBatchIdentification = saleBatchIdentification;
  }

  public SaleToPOIServiceResponseV06ServiceResponseBatchResponse saleBatchIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleBatchIdentification) {
    this.saleBatchIdentification = saleBatchIdentification;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
