package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction;
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
  * Data to request a loyalty service. A loyalty request contents : the loyalty transaction request and the loyalty data if any.<br/>
 **/
@Schema(description="Data to request a loyalty service. A loyalty request contents : the loyalty transaction request and the loyalty data if any.<br/>")
public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequest   {
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder = null;
  
  @Schema(description = "Data related to a Loyalty program or account.")
 /**
   * Data related to a Loyalty program or account.  
  **/
  private Object data = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction transaction = null;
 /**
   * Get customerOrder
   * @return customerOrder
  **/
  @JsonProperty("CustomerOrder")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequest customerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

 /**
   * Data related to a Loyalty program or account.
   * @return data
  **/
  @JsonProperty("Data")
  @NotNull
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequest data(Object data) {
    this.data = data;
    return this;
  }

 /**
   * Get transaction
   * @return transaction
  **/
  @JsonProperty("Transaction")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction getTransaction() {
    return transaction;
  }

  public void setTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction transaction) {
    this.transaction = transaction;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequest transaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction transaction) {
    this.transaction = transaction;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequest {\n");
    
    sb.append("    customerOrder: ").append(toIndentedString(customerOrder)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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
