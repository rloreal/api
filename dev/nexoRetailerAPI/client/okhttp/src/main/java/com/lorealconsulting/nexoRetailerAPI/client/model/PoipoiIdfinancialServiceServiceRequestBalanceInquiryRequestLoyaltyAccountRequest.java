/*
 * nexo retailer API
 * API defining resources for interactions between POI and POS, using underlying nexo messages  ### Check out its awesome features:  * simply declare POS and POI * send requests to POI * monitor activity 😎 * Receive real-time information about transaction executions📈 
 *
 * OpenAPI spec version: 0.1.0
 * Contact: romain.loreal@lorealconsulting.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.lorealconsulting.nexoRetailerAPI.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Data related to a requested Loyalty program or account.&lt;br/&gt;
 */
@Schema(description = "Data related to a requested Loyalty program or account.<br/>")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-09T14:21:17.741236018+02:00[Europe/Paris]")

public class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest {
  @SerializedName("Account")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount account = null;

  @SerializedName("CustomerOrder")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder = null;

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest account(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @Schema(description = "")
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount getAccount() {
    return account;
  }

  public void setAccount(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount account) {
    this.account = account;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest customerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

   /**
   * Get customerOrder
   * @return customerOrder
  **/
  @Schema(description = "")
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest = (PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest) o;
    return Objects.equals(this.account, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest.account) &&
        Objects.equals(this.customerOrder, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest.customerOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customerOrder);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
