package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance;
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
  * Authorisation response from the acquirer.<br/>
 **/
@Schema(description="Authorisation response from the acquirer.<br/>")
public class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse   {
  
  @Schema(description = "Set of actions to be performed by the POI (Point Of Interaction) system.")
 /**
   * Set of actions to be performed by the POI (Point Of Interaction) system.  
  **/
  private Object action = null;
  
  @Schema(description = "Products that may be added to the purchase after the authorisation.")
 /**
   * Products that may be added to the purchase after the authorisation.  
  **/
  private Object additionalAvailableProduct = null;
  
  @Schema(description = "Product code which are allowed by the payment card.")
 /**
   * Product code which are allowed by the payment card.  
  **/
  private Object allowedProductCode = null;
  
  @Schema(required = true, description = "")
  private SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult authorisationResult = null;
  
  @Schema(description = "")
  private SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance balance = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion currencyConversionEligibility = null;
  
  @Schema(description = "Product code not allowed by the payment card.")
 /**
   * Product code not allowed by the payment card.  
  **/
  private Object notAllowedProductCode = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedBalance = null;
 /**
   * Set of actions to be performed by the POI (Point Of Interaction) system.
   * @return action
  **/
  @JsonProperty("Action")
  @NotNull
  public Object getAction() {
    return action;
  }

  public void setAction(Object action) {
    this.action = action;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse action(Object action) {
    this.action = action;
    return this;
  }

 /**
   * Products that may be added to the purchase after the authorisation.
   * @return additionalAvailableProduct
  **/
  @JsonProperty("AdditionalAvailableProduct")
  @NotNull
  public Object getAdditionalAvailableProduct() {
    return additionalAvailableProduct;
  }

  public void setAdditionalAvailableProduct(Object additionalAvailableProduct) {
    this.additionalAvailableProduct = additionalAvailableProduct;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse additionalAvailableProduct(Object additionalAvailableProduct) {
    this.additionalAvailableProduct = additionalAvailableProduct;
    return this;
  }

 /**
   * Product code which are allowed by the payment card.
   * @return allowedProductCode
  **/
  @JsonProperty("AllowedProductCode")
  @NotNull
  public Object getAllowedProductCode() {
    return allowedProductCode;
  }

  public void setAllowedProductCode(Object allowedProductCode) {
    this.allowedProductCode = allowedProductCode;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse allowedProductCode(Object allowedProductCode) {
    this.allowedProductCode = allowedProductCode;
    return this;
  }

 /**
   * Get authorisationResult
   * @return authorisationResult
  **/
  @JsonProperty("AuthorisationResult")
  @NotNull
  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult getAuthorisationResult() {
    return authorisationResult;
  }

  public void setAuthorisationResult(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult authorisationResult) {
    this.authorisationResult = authorisationResult;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse authorisationResult(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult authorisationResult) {
    this.authorisationResult = authorisationResult;
    return this;
  }

 /**
   * Get balance
   * @return balance
  **/
  @JsonProperty("Balance")
  @NotNull
  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance getBalance() {
    return balance;
  }

  public void setBalance(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance balance) {
    this.balance = balance;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse balance(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance balance) {
    this.balance = balance;
    return this;
  }

 /**
   * Get currencyConversionEligibility
   * @return currencyConversionEligibility
  **/
  @JsonProperty("CurrencyConversionEligibility")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion getCurrencyConversionEligibility() {
    return currencyConversionEligibility;
  }

  public void setCurrencyConversionEligibility(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion currencyConversionEligibility) {
    this.currencyConversionEligibility = currencyConversionEligibility;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse currencyConversionEligibility(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion currencyConversionEligibility) {
    this.currencyConversionEligibility = currencyConversionEligibility;
    return this;
  }

 /**
   * Product code not allowed by the payment card.
   * @return notAllowedProductCode
  **/
  @JsonProperty("NotAllowedProductCode")
  @NotNull
  public Object getNotAllowedProductCode() {
    return notAllowedProductCode;
  }

  public void setNotAllowedProductCode(Object notAllowedProductCode) {
    this.notAllowedProductCode = notAllowedProductCode;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse notAllowedProductCode(Object notAllowedProductCode) {
    this.notAllowedProductCode = notAllowedProductCode;
    return this;
  }

 /**
   * Get protectedBalance
   * @return protectedBalance
  **/
  @JsonProperty("ProtectedBalance")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData getProtectedBalance() {
    return protectedBalance;
  }

  public void setProtectedBalance(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedBalance) {
    this.protectedBalance = protectedBalance;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse protectedBalance(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedBalance) {
    this.protectedBalance = protectedBalance;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    additionalAvailableProduct: ").append(toIndentedString(additionalAvailableProduct)).append("\n");
    sb.append("    allowedProductCode: ").append(toIndentedString(allowedProductCode)).append("\n");
    sb.append("    authorisationResult: ").append(toIndentedString(authorisationResult)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currencyConversionEligibility: ").append(toIndentedString(currencyConversionEligibility)).append("\n");
    sb.append("    notAllowedProductCode: ").append(toIndentedString(notAllowedProductCode)).append("\n");
    sb.append("    protectedBalance: ").append(toIndentedString(protectedBalance)).append("\n");
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
