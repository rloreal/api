package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Environment of the transaction.&lt;br/&gt;
 */
@Schema(description = "Environment of the transaction.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironment   {
  @JsonProperty("Acquirer")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer acquirer = null;

  @JsonProperty("Card")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCard card = null;

  @JsonProperty("Check")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCheck check = null;

  @JsonProperty("Cardholder")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder cardholder = null;

  @JsonProperty("CustomerDevice")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice customerDevice = null;

  @JsonProperty("LoyaltyAccount")
  private Object loyaltyAccount = null;

  @JsonProperty("Merchant")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant merchant = null;

  @JsonProperty("MerchantToken")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken merchantToken = null;

  @JsonProperty("POI")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentPOI POI = null;

  @JsonProperty("PaymentToken")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken paymentToken = null;

  @JsonProperty("ProtectedCardholderData")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCardholderData = null;

  @JsonProperty("SaleEnvironment")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment saleEnvironment = null;

  @JsonProperty("StoredValueAccount")
  private Object storedValueAccount = null;

  @JsonProperty("ServiceProvider")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer serviceProvider = null;

  @JsonProperty("Wallet")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice wallet = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironment acquirer(PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer acquirer) {
    this.acquirer = acquirer;
    return this;
  }

  /**
   * Get acquirer
   * @return acquirer
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer getAcquirer() {
    return acquirer;
  }

  public void setAcquirer(PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer acquirer) {
    this.acquirer = acquirer;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment card(PoipoiIdfinancialServiceServiceRequestEnvironmentCard card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCard getCard() {
    return card;
  }

  public void setCard(PoipoiIdfinancialServiceServiceRequestEnvironmentCard card) {
    this.card = card;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment check(PoipoiIdfinancialServiceServiceRequestEnvironmentCheck check) {
    this.check = check;
    return this;
  }

  /**
   * Get check
   * @return check
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck getCheck() {
    return check;
  }

  public void setCheck(PoipoiIdfinancialServiceServiceRequestEnvironmentCheck check) {
    this.check = check;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment cardholder(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder cardholder) {
    this.cardholder = cardholder;
    return this;
  }

  /**
   * Get cardholder
   * @return cardholder
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder getCardholder() {
    return cardholder;
  }

  public void setCardholder(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder cardholder) {
    this.cardholder = cardholder;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment customerDevice(PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice customerDevice) {
    this.customerDevice = customerDevice;
    return this;
  }

  /**
   * Get customerDevice
   * @return customerDevice
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice getCustomerDevice() {
    return customerDevice;
  }

  public void setCustomerDevice(PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice customerDevice) {
    this.customerDevice = customerDevice;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment loyaltyAccount(Object loyaltyAccount) {
    this.loyaltyAccount = loyaltyAccount;
    return this;
  }

  /**
   * Store value account associated to the payment.
   * @return loyaltyAccount
   **/
  @Schema(description = "Store value account associated to the payment.")
      @NotNull

    public Object getLoyaltyAccount() {
    return loyaltyAccount;
  }

  public void setLoyaltyAccount(Object loyaltyAccount) {
    this.loyaltyAccount = loyaltyAccount;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment merchant(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant merchant) {
    this.merchant = merchant;
    return this;
  }

  /**
   * Get merchant
   * @return merchant
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant getMerchant() {
    return merchant;
  }

  public void setMerchant(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant merchant) {
    this.merchant = merchant;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment merchantToken(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken merchantToken) {
    this.merchantToken = merchantToken;
    return this;
  }

  /**
   * Get merchantToken
   * @return merchantToken
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken getMerchantToken() {
    return merchantToken;
  }

  public void setMerchantToken(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken merchantToken) {
    this.merchantToken = merchantToken;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment POI(PoipoiIdfinancialServiceServiceRequestEnvironmentPOI POI) {
    this.POI = POI;
    return this;
  }

  /**
   * Get POI
   * @return POI
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI getPOI() {
    return POI;
  }

  public void setPOI(PoipoiIdfinancialServiceServiceRequestEnvironmentPOI POI) {
    this.POI = POI;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment paymentToken(PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken paymentToken) {
    this.paymentToken = paymentToken;
    return this;
  }

  /**
   * Get paymentToken
   * @return paymentToken
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken getPaymentToken() {
    return paymentToken;
  }

  public void setPaymentToken(PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken paymentToken) {
    this.paymentToken = paymentToken;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment protectedCardholderData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCardholderData) {
    this.protectedCardholderData = protectedCardholderData;
    return this;
  }

  /**
   * Get protectedCardholderData
   * @return protectedCardholderData
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData getProtectedCardholderData() {
    return protectedCardholderData;
  }

  public void setProtectedCardholderData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCardholderData) {
    this.protectedCardholderData = protectedCardholderData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment saleEnvironment(PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment saleEnvironment) {
    this.saleEnvironment = saleEnvironment;
    return this;
  }

  /**
   * Get saleEnvironment
   * @return saleEnvironment
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment getSaleEnvironment() {
    return saleEnvironment;
  }

  public void setSaleEnvironment(PoipoiIdfinancialServiceServiceRequestEnvironmentSaleEnvironment saleEnvironment) {
    this.saleEnvironment = saleEnvironment;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment storedValueAccount(Object storedValueAccount) {
    this.storedValueAccount = storedValueAccount;
    return this;
  }

  /**
   * Store value account payment instrument.
   * @return storedValueAccount
   **/
  @Schema(description = "Store value account payment instrument.")
      @NotNull

    public Object getStoredValueAccount() {
    return storedValueAccount;
  }

  public void setStoredValueAccount(Object storedValueAccount) {
    this.storedValueAccount = storedValueAccount;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment serviceProvider(PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer serviceProvider) {
    this.serviceProvider = serviceProvider;
    return this;
  }

  /**
   * Get serviceProvider
   * @return serviceProvider
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer getServiceProvider() {
    return serviceProvider;
  }

  public void setServiceProvider(PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironment wallet(PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice wallet) {
    this.wallet = wallet;
    return this;
  }

  /**
   * Get wallet
   * @return wallet
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice getWallet() {
    return wallet;
  }

  public void setWallet(PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice wallet) {
    this.wallet = wallet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironment poipoiIdfinancialServiceServiceRequestEnvironment = (PoipoiIdfinancialServiceServiceRequestEnvironment) o;
    return Objects.equals(this.acquirer, poipoiIdfinancialServiceServiceRequestEnvironment.acquirer) &&
        Objects.equals(this.card, poipoiIdfinancialServiceServiceRequestEnvironment.card) &&
        Objects.equals(this.check, poipoiIdfinancialServiceServiceRequestEnvironment.check) &&
        Objects.equals(this.cardholder, poipoiIdfinancialServiceServiceRequestEnvironment.cardholder) &&
        Objects.equals(this.customerDevice, poipoiIdfinancialServiceServiceRequestEnvironment.customerDevice) &&
        Objects.equals(this.loyaltyAccount, poipoiIdfinancialServiceServiceRequestEnvironment.loyaltyAccount) &&
        Objects.equals(this.merchant, poipoiIdfinancialServiceServiceRequestEnvironment.merchant) &&
        Objects.equals(this.merchantToken, poipoiIdfinancialServiceServiceRequestEnvironment.merchantToken) &&
        Objects.equals(this.POI, poipoiIdfinancialServiceServiceRequestEnvironment.POI) &&
        Objects.equals(this.paymentToken, poipoiIdfinancialServiceServiceRequestEnvironment.paymentToken) &&
        Objects.equals(this.protectedCardholderData, poipoiIdfinancialServiceServiceRequestEnvironment.protectedCardholderData) &&
        Objects.equals(this.saleEnvironment, poipoiIdfinancialServiceServiceRequestEnvironment.saleEnvironment) &&
        Objects.equals(this.storedValueAccount, poipoiIdfinancialServiceServiceRequestEnvironment.storedValueAccount) &&
        Objects.equals(this.serviceProvider, poipoiIdfinancialServiceServiceRequestEnvironment.serviceProvider) &&
        Objects.equals(this.wallet, poipoiIdfinancialServiceServiceRequestEnvironment.wallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquirer, card, check, cardholder, customerDevice, loyaltyAccount, merchant, merchantToken, POI, paymentToken, protectedCardholderData, saleEnvironment, storedValueAccount, serviceProvider, wallet);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
