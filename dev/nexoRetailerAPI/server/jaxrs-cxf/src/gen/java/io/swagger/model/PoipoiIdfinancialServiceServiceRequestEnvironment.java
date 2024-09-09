package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCard;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCheck;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentPOI;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment;
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
  * Environment of the transaction.<br/>
 **/
@Schema(description="Environment of the transaction.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironment   {
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer acquirer = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCard card = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCheck check = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder cardholder = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice customerDevice = null;
  
  @Schema(description = "Store value account associated to the payment.")
 /**
   * Store value account associated to the payment.  
  **/
  private Object loyaltyAccount = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant merchant = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken merchantToken = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentPOI POI = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken paymentToken = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCardholderData = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment saleEnvironment = null;
  
  @Schema(description = "Store value account payment instrument.")
 /**
   * Store value account payment instrument.  
  **/
  private Object storedValueAccount = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer serviceProvider = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice wallet = null;
 /**
   * Get acquirer
   * @return acquirer
  **/
  @JsonProperty("Acquirer")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer getAcquirer() {
    return acquirer;
  }

  public void setAcquirer(PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer acquirer) {
    this.acquirer = acquirer;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment acquirer(PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer acquirer) {
    this.acquirer = acquirer;
    return this;
  }

 /**
   * Get card
   * @return card
  **/
  @JsonProperty("Card")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard getCard() {
    return card;
  }

  public void setCard(PoipoiIdfinancialServiceServiceRequestEnvironmentCard card) {
    this.card = card;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment card(PoipoiIdfinancialServiceServiceRequestEnvironmentCard card) {
    this.card = card;
    return this;
  }

 /**
   * Get check
   * @return check
  **/
  @JsonProperty("Check")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck getCheck() {
    return check;
  }

  public void setCheck(PoipoiIdfinancialServiceServiceRequestEnvironmentCheck check) {
    this.check = check;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment check(PoipoiIdfinancialServiceServiceRequestEnvironmentCheck check) {
    this.check = check;
    return this;
  }

 /**
   * Get cardholder
   * @return cardholder
  **/
  @JsonProperty("Cardholder")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder getCardholder() {
    return cardholder;
  }

  public void setCardholder(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder cardholder) {
    this.cardholder = cardholder;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment cardholder(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder cardholder) {
    this.cardholder = cardholder;
    return this;
  }

 /**
   * Get customerDevice
   * @return customerDevice
  **/
  @JsonProperty("CustomerDevice")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice getCustomerDevice() {
    return customerDevice;
  }

  public void setCustomerDevice(PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice customerDevice) {
    this.customerDevice = customerDevice;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment customerDevice(PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice customerDevice) {
    this.customerDevice = customerDevice;
    return this;
  }

 /**
   * Store value account associated to the payment.
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

  public PoipoiIdfinancialServiceServiceRequestEnvironment loyaltyAccount(Object loyaltyAccount) {
    this.loyaltyAccount = loyaltyAccount;
    return this;
  }

 /**
   * Get merchant
   * @return merchant
  **/
  @JsonProperty("Merchant")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant getMerchant() {
    return merchant;
  }

  public void setMerchant(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant merchant) {
    this.merchant = merchant;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment merchant(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant merchant) {
    this.merchant = merchant;
    return this;
  }

 /**
   * Get merchantToken
   * @return merchantToken
  **/
  @JsonProperty("MerchantToken")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken getMerchantToken() {
    return merchantToken;
  }

  public void setMerchantToken(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken merchantToken) {
    this.merchantToken = merchantToken;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment merchantToken(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken merchantToken) {
    this.merchantToken = merchantToken;
    return this;
  }

 /**
   * Get POI
   * @return POI
  **/
  @JsonProperty("POI")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI getPOI() {
    return POI;
  }

  public void setPOI(PoipoiIdfinancialServiceServiceRequestEnvironmentPOI POI) {
    this.POI = POI;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment POI(PoipoiIdfinancialServiceServiceRequestEnvironmentPOI POI) {
    this.POI = POI;
    return this;
  }

 /**
   * Get paymentToken
   * @return paymentToken
  **/
  @JsonProperty("PaymentToken")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken getPaymentToken() {
    return paymentToken;
  }

  public void setPaymentToken(PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken paymentToken) {
    this.paymentToken = paymentToken;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment paymentToken(PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken paymentToken) {
    this.paymentToken = paymentToken;
    return this;
  }

 /**
   * Get protectedCardholderData
   * @return protectedCardholderData
  **/
  @JsonProperty("ProtectedCardholderData")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData getProtectedCardholderData() {
    return protectedCardholderData;
  }

  public void setProtectedCardholderData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCardholderData) {
    this.protectedCardholderData = protectedCardholderData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment protectedCardholderData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCardholderData) {
    this.protectedCardholderData = protectedCardholderData;
    return this;
  }

 /**
   * Get saleEnvironment
   * @return saleEnvironment
  **/
  @JsonProperty("SaleEnvironment")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment getSaleEnvironment() {
    return saleEnvironment;
  }

  public void setSaleEnvironment(PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment saleEnvironment) {
    this.saleEnvironment = saleEnvironment;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment saleEnvironment(PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment saleEnvironment) {
    this.saleEnvironment = saleEnvironment;
    return this;
  }

 /**
   * Store value account payment instrument.
   * @return storedValueAccount
  **/
  @JsonProperty("StoredValueAccount")
  @NotNull
  public Object getStoredValueAccount() {
    return storedValueAccount;
  }

  public void setStoredValueAccount(Object storedValueAccount) {
    this.storedValueAccount = storedValueAccount;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment storedValueAccount(Object storedValueAccount) {
    this.storedValueAccount = storedValueAccount;
    return this;
  }

 /**
   * Get serviceProvider
   * @return serviceProvider
  **/
  @JsonProperty("ServiceProvider")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer getServiceProvider() {
    return serviceProvider;
  }

  public void setServiceProvider(PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment serviceProvider(PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer serviceProvider) {
    this.serviceProvider = serviceProvider;
    return this;
  }

 /**
   * Get wallet
   * @return wallet
  **/
  @JsonProperty("Wallet")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice getWallet() {
    return wallet;
  }

  public void setWallet(PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice wallet) {
    this.wallet = wallet;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment wallet(PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice wallet) {
    this.wallet = wallet;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironment {\n");
    
    sb.append("    acquirer: ").append(toIndentedString(acquirer)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    check: ").append(toIndentedString(check)).append("\n");
    sb.append("    cardholder: ").append(toIndentedString(cardholder)).append("\n");
    sb.append("    customerDevice: ").append(toIndentedString(customerDevice)).append("\n");
    sb.append("    loyaltyAccount: ").append(toIndentedString(loyaltyAccount)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    merchantToken: ").append(toIndentedString(merchantToken)).append("\n");
    sb.append("    POI: ").append(toIndentedString(POI)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    protectedCardholderData: ").append(toIndentedString(protectedCardholderData)).append("\n");
    sb.append("    saleEnvironment: ").append(toIndentedString(saleEnvironment)).append("\n");
    sb.append("    storedValueAccount: ").append(toIndentedString(storedValueAccount)).append("\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
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
