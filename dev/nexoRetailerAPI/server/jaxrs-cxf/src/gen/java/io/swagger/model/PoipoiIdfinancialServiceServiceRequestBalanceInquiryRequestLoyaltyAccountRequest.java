package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder;
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
  * Data related to a requested Loyalty program or account.<br/>
 **/
@Schema(description="Data related to a requested Loyalty program or account.<br/>")
public class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest   {
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount account = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder = null;
 /**
   * Get account
   * @return account
  **/
  @JsonProperty("Account")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount getAccount() {
    return account;
  }

  public void setAccount(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount account) {
    this.account = account;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest account(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount account) {
    this.account = account;
    return this;
  }

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

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest customerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customerOrder: ").append(toIndentedString(customerOrder)).append("\n");
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
