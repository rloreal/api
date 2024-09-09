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
  * Data to request a batch service.<br/>
 **/
@Schema(description="Data to request a batch service.<br/>")
public class PoipoiIdfinancialServiceServiceRequestBatchRequest   {
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object removeAllFlag = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleBatchIdentification = null;
  
  @Schema(description = "Content of the Batch Request message.")
 /**
   * Content of the Batch Request message.  
  **/
  private Object transactionToPerform = null;
 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return removeAllFlag
  **/
  @JsonProperty("RemoveAllFlag")
  @NotNull
  public Object getRemoveAllFlag() {
    return removeAllFlag;
  }

  public void setRemoveAllFlag(Object removeAllFlag) {
    this.removeAllFlag = removeAllFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestBatchRequest removeAllFlag(Object removeAllFlag) {
    this.removeAllFlag = removeAllFlag;
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

  public PoipoiIdfinancialServiceServiceRequestBatchRequest saleBatchIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleBatchIdentification) {
    this.saleBatchIdentification = saleBatchIdentification;
    return this;
  }

 /**
   * Content of the Batch Request message.
   * @return transactionToPerform
  **/
  @JsonProperty("TransactionToPerform")
  @NotNull
  public Object getTransactionToPerform() {
    return transactionToPerform;
  }

  public void setTransactionToPerform(Object transactionToPerform) {
    this.transactionToPerform = transactionToPerform;
  }

  public PoipoiIdfinancialServiceServiceRequestBatchRequest transactionToPerform(Object transactionToPerform) {
    this.transactionToPerform = transactionToPerform;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
