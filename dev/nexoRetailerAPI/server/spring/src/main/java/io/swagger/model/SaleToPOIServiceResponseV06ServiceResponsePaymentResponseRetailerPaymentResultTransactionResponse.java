package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Authorisation response from the acquirer.&lt;br/&gt;
 */
@Schema(description = "Authorisation response from the acquirer.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse   {
  @JsonProperty("Action")
  private Object action = null;

  @JsonProperty("AdditionalAvailableProduct")
  private Object additionalAvailableProduct = null;

  @JsonProperty("AllowedProductCode")
  private Object allowedProductCode = null;

  @JsonProperty("AuthorisationResult")
  private SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult authorisationResult = null;

  @JsonProperty("Balance")
  private SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance balance = null;

  @JsonProperty("CurrencyConversionEligibility")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion currencyConversionEligibility = null;

  @JsonProperty("NotAllowedProductCode")
  private Object notAllowedProductCode = null;

  @JsonProperty("ProtectedBalance")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedBalance = null;

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse action(Object action) {
    this.action = action;
    return this;
  }

  /**
   * Set of actions to be performed by the POI (Point Of Interaction) system.
   * @return action
   **/
  @Schema(description = "Set of actions to be performed by the POI (Point Of Interaction) system.")
      @NotNull

    public Object getAction() {
    return action;
  }

  public void setAction(Object action) {
    this.action = action;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse additionalAvailableProduct(Object additionalAvailableProduct) {
    this.additionalAvailableProduct = additionalAvailableProduct;
    return this;
  }

  /**
   * Products that may be added to the purchase after the authorisation.
   * @return additionalAvailableProduct
   **/
  @Schema(description = "Products that may be added to the purchase after the authorisation.")
      @NotNull

    public Object getAdditionalAvailableProduct() {
    return additionalAvailableProduct;
  }

  public void setAdditionalAvailableProduct(Object additionalAvailableProduct) {
    this.additionalAvailableProduct = additionalAvailableProduct;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse allowedProductCode(Object allowedProductCode) {
    this.allowedProductCode = allowedProductCode;
    return this;
  }

  /**
   * Product code which are allowed by the payment card.
   * @return allowedProductCode
   **/
  @Schema(description = "Product code which are allowed by the payment card.")
      @NotNull

    public Object getAllowedProductCode() {
    return allowedProductCode;
  }

  public void setAllowedProductCode(Object allowedProductCode) {
    this.allowedProductCode = allowedProductCode;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse authorisationResult(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult authorisationResult) {
    this.authorisationResult = authorisationResult;
    return this;
  }

  /**
   * Get authorisationResult
   * @return authorisationResult
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult getAuthorisationResult() {
    return authorisationResult;
  }

  public void setAuthorisationResult(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult authorisationResult) {
    this.authorisationResult = authorisationResult;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse balance(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance getBalance() {
    return balance;
  }

  public void setBalance(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance balance) {
    this.balance = balance;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse currencyConversionEligibility(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion currencyConversionEligibility) {
    this.currencyConversionEligibility = currencyConversionEligibility;
    return this;
  }

  /**
   * Get currencyConversionEligibility
   * @return currencyConversionEligibility
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion getCurrencyConversionEligibility() {
    return currencyConversionEligibility;
  }

  public void setCurrencyConversionEligibility(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion currencyConversionEligibility) {
    this.currencyConversionEligibility = currencyConversionEligibility;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse notAllowedProductCode(Object notAllowedProductCode) {
    this.notAllowedProductCode = notAllowedProductCode;
    return this;
  }

  /**
   * Product code not allowed by the payment card.
   * @return notAllowedProductCode
   **/
  @Schema(description = "Product code not allowed by the payment card.")
      @NotNull

    public Object getNotAllowedProductCode() {
    return notAllowedProductCode;
  }

  public void setNotAllowedProductCode(Object notAllowedProductCode) {
    this.notAllowedProductCode = notAllowedProductCode;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse protectedBalance(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedBalance) {
    this.protectedBalance = protectedBalance;
    return this;
  }

  /**
   * Get protectedBalance
   * @return protectedBalance
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData getProtectedBalance() {
    return protectedBalance;
  }

  public void setProtectedBalance(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedBalance) {
    this.protectedBalance = protectedBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse = (SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse) o;
    return Objects.equals(this.action, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse.action) &&
        Objects.equals(this.additionalAvailableProduct, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse.additionalAvailableProduct) &&
        Objects.equals(this.allowedProductCode, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse.allowedProductCode) &&
        Objects.equals(this.authorisationResult, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse.authorisationResult) &&
        Objects.equals(this.balance, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse.balance) &&
        Objects.equals(this.currencyConversionEligibility, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse.currencyConversionEligibility) &&
        Objects.equals(this.notAllowedProductCode, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse.notAllowedProductCode) &&
        Objects.equals(this.protectedBalance, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse.protectedBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, additionalAvailableProduct, allowedProductCode, authorisationResult, balance, currencyConversionEligibility, notAllowedProductCode, protectedBalance);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
