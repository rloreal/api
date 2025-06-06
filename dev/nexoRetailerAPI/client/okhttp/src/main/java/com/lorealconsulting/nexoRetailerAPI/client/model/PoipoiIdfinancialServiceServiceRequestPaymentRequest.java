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
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Data required to request a Payment.&lt;br/&gt;
 */
@Schema(description = "Data required to request a Payment.<br/>")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-09T14:21:17.741236018+02:00[Europe/Paris]")

public class PoipoiIdfinancialServiceServiceRequestPaymentRequest {
  @SerializedName("LoyaltyData")
  private Object loyaltyData = null;

  @SerializedName("PaymentTransaction")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction paymentTransaction = null;

  public PoipoiIdfinancialServiceServiceRequestPaymentRequest loyaltyData(Object loyaltyData) {
    this.loyaltyData = loyaltyData;
    return this;
  }

   /**
   * Data linked to card loyalty during payment.
   * @return loyaltyData
  **/
  @Schema(description = "Data linked to card loyalty during payment.")
  public Object getLoyaltyData() {
    return loyaltyData;
  }

  public void setLoyaltyData(Object loyaltyData) {
    this.loyaltyData = loyaltyData;
  }

  public PoipoiIdfinancialServiceServiceRequestPaymentRequest paymentTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
    return this;
  }

   /**
   * Get paymentTransaction
   * @return paymentTransaction
  **/
  @Schema(description = "")
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestPaymentRequest poipoiIdfinancialServiceServiceRequestPaymentRequest = (PoipoiIdfinancialServiceServiceRequestPaymentRequest) o;
    return Objects.equals(this.loyaltyData, poipoiIdfinancialServiceServiceRequestPaymentRequest.loyaltyData) &&
        Objects.equals(this.paymentTransaction, poipoiIdfinancialServiceServiceRequestPaymentRequest.paymentTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loyaltyData, paymentTransaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestPaymentRequest {\n");
    
    sb.append("    loyaltyData: ").append(toIndentedString(loyaltyData)).append("\n");
    sb.append("    paymentTransaction: ").append(toIndentedString(paymentTransaction)).append("\n");
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
