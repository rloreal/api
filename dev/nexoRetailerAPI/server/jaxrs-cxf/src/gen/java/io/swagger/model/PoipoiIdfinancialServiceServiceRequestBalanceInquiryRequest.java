package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest;
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
  * Specifies data element nexessary to request balance information.<br/>
 **/
@Schema(description="Specifies data element nexessary to request balance information.<br/>")
public class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest   {
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest loyaltyAccountRequest = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest paymentAccountRequest = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest storedValueAccountRequest = null;
 /**
   * Get loyaltyAccountRequest
   * @return loyaltyAccountRequest
  **/
  @JsonProperty("LoyaltyAccountRequest")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest getLoyaltyAccountRequest() {
    return loyaltyAccountRequest;
  }

  public void setLoyaltyAccountRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest loyaltyAccountRequest) {
    this.loyaltyAccountRequest = loyaltyAccountRequest;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest loyaltyAccountRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest loyaltyAccountRequest) {
    this.loyaltyAccountRequest = loyaltyAccountRequest;
    return this;
  }

 /**
   * Get paymentAccountRequest
   * @return paymentAccountRequest
  **/
  @JsonProperty("PaymentAccountRequest")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest getPaymentAccountRequest() {
    return paymentAccountRequest;
  }

  public void setPaymentAccountRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest paymentAccountRequest) {
    this.paymentAccountRequest = paymentAccountRequest;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest paymentAccountRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest paymentAccountRequest) {
    this.paymentAccountRequest = paymentAccountRequest;
    return this;
  }

 /**
   * Get saleTransactionIdentification
   * @return saleTransactionIdentification
  **/
  @JsonProperty("SaleTransactionIdentification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getSaleTransactionIdentification() {
    return saleTransactionIdentification;
  }

  public void setSaleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest saleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
    return this;
  }

 /**
   * Get storedValueAccountRequest
   * @return storedValueAccountRequest
  **/
  @JsonProperty("StoredValueAccountRequest")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest getStoredValueAccountRequest() {
    return storedValueAccountRequest;
  }

  public void setStoredValueAccountRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest storedValueAccountRequest) {
    this.storedValueAccountRequest = storedValueAccountRequest;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest storedValueAccountRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest storedValueAccountRequest) {
    this.storedValueAccountRequest = storedValueAccountRequest;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest {\n");
    
    sb.append("    loyaltyAccountRequest: ").append(toIndentedString(loyaltyAccountRequest)).append("\n");
    sb.append("    paymentAccountRequest: ").append(toIndentedString(paymentAccountRequest)).append("\n");
    sb.append("    saleTransactionIdentification: ").append(toIndentedString(saleTransactionIdentification)).append("\n");
    sb.append("    storedValueAccountRequest: ").append(toIndentedString(storedValueAccountRequest)).append("\n");
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
