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
  * Content of the Card Acquisition Response message.<br/>
 **/
@Schema(description="Content of the Card Acquisition Response message.<br/>")
public class SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse   {
  
  @Schema(example = "ENG", description = "Specifies a language.<br/>")
 /**
   * Specifies a language.<br/>  
  **/
  private Object customerLanguage = null;
  
  @Schema(description = "Customer order attached to a customer, recorded in the POI system.")
 /**
   * Customer order attached to a customer, recorded in the POI system.  
  **/
  private Object customerOrder = null;
  
  @Schema(description = "Loyalty account information.")
 /**
   * Loyalty account information.  
  **/
  private Object loyaltyAccount = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification = null;
  
  @Schema(description = "Type of payment card.")
 /**
   * Type of payment card.  
  **/
  private Object paymentBrand = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification = null;
 /**
   * Specifies a language.&lt;br/&gt;
   * @return customerLanguage
  **/
  @JsonProperty("CustomerLanguage")
  @NotNull
  public Object getCustomerLanguage() {
    return customerLanguage;
  }

  public void setCustomerLanguage(Object customerLanguage) {
    this.customerLanguage = customerLanguage;
  }

  public SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse customerLanguage(Object customerLanguage) {
    this.customerLanguage = customerLanguage;
    return this;
  }

 /**
   * Customer order attached to a customer, recorded in the POI system.
   * @return customerOrder
  **/
  @JsonProperty("CustomerOrder")
  @NotNull
  public Object getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(Object customerOrder) {
    this.customerOrder = customerOrder;
  }

  public SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse customerOrder(Object customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

 /**
   * Loyalty account information.
   * @return loyaltyAccount
  **/
  @JsonProperty("LoyaltyAccount")
  @NotNull
  public Object getLoyaltyAccount() {
    return loyaltyAccount;
  }

  public void setLoyaltyAccount(Object loyaltyAccount) {
    this.loyaltyAccount = loyaltyAccount;
  }

  public SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse loyaltyAccount(Object loyaltyAccount) {
    this.loyaltyAccount = loyaltyAccount;
    return this;
  }

 /**
   * Get poITransactionIdentification
   * @return poITransactionIdentification
  **/
  @JsonProperty("POITransactionIdentification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getPoITransactionIdentification() {
    return poITransactionIdentification;
  }

  public void setPoITransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification) {
    this.poITransactionIdentification = poITransactionIdentification;
  }

  public SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse poITransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification) {
    this.poITransactionIdentification = poITransactionIdentification;
    return this;
  }

 /**
   * Type of payment card.
   * @return paymentBrand
  **/
  @JsonProperty("PaymentBrand")
  @NotNull
  public Object getPaymentBrand() {
    return paymentBrand;
  }

  public void setPaymentBrand(Object paymentBrand) {
    this.paymentBrand = paymentBrand;
  }

  public SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse paymentBrand(Object paymentBrand) {
    this.paymentBrand = paymentBrand;
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

  public SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse saleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponseCardAcquisitionResponse {\n");
    
    sb.append("    customerLanguage: ").append(toIndentedString(customerLanguage)).append("\n");
    sb.append("    customerOrder: ").append(toIndentedString(customerOrder)).append("\n");
    sb.append("    loyaltyAccount: ").append(toIndentedString(loyaltyAccount)).append("\n");
    sb.append("    poITransactionIdentification: ").append(toIndentedString(poITransactionIdentification)).append("\n");
    sb.append("    paymentBrand: ").append(toIndentedString(paymentBrand)).append("\n");
    sb.append("    saleTransactionIdentification: ").append(toIndentedString(saleTransactionIdentification)).append("\n");
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
