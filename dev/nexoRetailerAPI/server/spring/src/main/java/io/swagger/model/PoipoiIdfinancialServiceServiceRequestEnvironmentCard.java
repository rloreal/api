package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payment card performing the transaction.&lt;br/&gt;
 */
@Schema(description = "Payment card performing the transaction.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCard   {
  @JsonProperty("AdditionalCardData")
  private Object additionalCardData = null;

  @JsonProperty("AllowedProduct")
  private Object allowedProduct = null;

  @JsonProperty("CardBrand")
  private Object cardBrand = null;

  @JsonProperty("CardCurrencyCode")
  private Object cardCurrencyCode = null;

  @JsonProperty("CardCountryCode")
  private Object cardCountryCode = null;

  @JsonProperty("CardProductProfile")
  private Object cardProductProfile = null;

  @JsonProperty("CardProductSubType")
  private Object cardProductSubType = null;

  @JsonProperty("CardProductType")
  private Object cardProductType = null;

  @JsonProperty("InternationalCard")
  private Object internationalCard = null;

  @JsonProperty("IssuerBIN")
  private Object issuerBIN = null;

  @JsonProperty("MaskedPAN")
  private Object maskedPAN = null;

  @JsonProperty("PlainCardData")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData plainCardData = null;

  @JsonProperty("PaymentAccountReference")
  private Object paymentAccountReference = null;

  @JsonProperty("ProtectedCardData")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCardData = null;

  @JsonProperty("PrivateCardData")
  private Object privateCardData = null;

  @JsonProperty("ServiceOption")
  private Object serviceOption = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard additionalCardData(Object additionalCardData) {
    this.additionalCardData = additionalCardData;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return additionalCardData
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getAdditionalCardData() {
    return additionalCardData;
  }

  public void setAdditionalCardData(Object additionalCardData) {
    this.additionalCardData = additionalCardData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard allowedProduct(Object allowedProduct) {
    this.allowedProduct = allowedProduct;
    return this;
  }

  /**
   * Product that can be purchased with the card.
   * @return allowedProduct
   **/
  @Schema(description = "Product that can be purchased with the card.")
      @NotNull

    public Object getAllowedProduct() {
    return allowedProduct;
  }

  public void setAllowedProduct(Object allowedProduct) {
    this.allowedProduct = allowedProduct;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard cardBrand(Object cardBrand) {
    this.cardBrand = cardBrand;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return cardBrand
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getCardBrand() {
    return cardBrand;
  }

  public void setCardBrand(Object cardBrand) {
    this.cardBrand = cardBrand;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard cardCurrencyCode(Object cardCurrencyCode) {
    this.cardCurrencyCode = cardCurrencyCode;
    return this;
  }

  /**
   * Specifies an alphanumeric string with a length of exact 3 characters.<br/>
   * @return cardCurrencyCode
   **/
  @Schema(description = "Specifies an alphanumeric string with a length of exact 3 characters.<br/>")
      @NotNull

    public Object getCardCurrencyCode() {
    return cardCurrencyCode;
  }

  public void setCardCurrencyCode(Object cardCurrencyCode) {
    this.cardCurrencyCode = cardCurrencyCode;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard cardCountryCode(Object cardCountryCode) {
    this.cardCountryCode = cardCountryCode;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 3 characters.<br/>
   * @return cardCountryCode
   **/
  @Schema(description = "Specifies a character string with a maximum length of 3 characters.<br/>")
      @NotNull

    public Object getCardCountryCode() {
    return cardCountryCode;
  }

  public void setCardCountryCode(Object cardCountryCode) {
    this.cardCountryCode = cardCountryCode;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard cardProductProfile(Object cardProductProfile) {
    this.cardProductProfile = cardProductProfile;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return cardProductProfile
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getCardProductProfile() {
    return cardProductProfile;
  }

  public void setCardProductProfile(Object cardProductProfile) {
    this.cardProductProfile = cardProductProfile;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard cardProductSubType(Object cardProductSubType) {
    this.cardProductSubType = cardProductSubType;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return cardProductSubType
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getCardProductSubType() {
    return cardProductSubType;
  }

  public void setCardProductSubType(Object cardProductSubType) {
    this.cardProductSubType = cardProductSubType;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard cardProductType(Object cardProductType) {
    this.cardProductType = cardProductType;
    return this;
  }

  /**
   * Type of card product.<br/>- **COMM: CommercialCard**  : *Cards issued as a means of business expenditure, for instance business card or corporate card. The user could be a company, an individual for business expenses or a self employed for business purposes.*<br/>- **CONS: ConsumerCard**  : *Cards issued as a means of personal expenditure. The user is always an individual.*<br/>
   * @return cardProductType
   **/
  @Schema(description = "Type of card product.<br/>- **COMM: CommercialCard**  : *Cards issued as a means of business expenditure, for instance business card or corporate card. The user could be a company, an individual for business expenses or a self employed for business purposes.*<br/>- **CONS: ConsumerCard**  : *Cards issued as a means of personal expenditure. The user is always an individual.*<br/>")
      @NotNull

    public Object getCardProductType() {
    return cardProductType;
  }

  public void setCardProductType(Object cardProductType) {
    this.cardProductType = cardProductType;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard internationalCard(Object internationalCard) {
    this.internationalCard = internationalCard;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return internationalCard
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getInternationalCard() {
    return internationalCard;
  }

  public void setInternationalCard(Object internationalCard) {
    this.internationalCard = internationalCard;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard issuerBIN(Object issuerBIN) {
    this.issuerBIN = issuerBIN;
    return this;
  }

  /**
   * Specifies a numeric string with a maximum length of 15 digits.<br/>
   * @return issuerBIN
   **/
  @Schema(description = "Specifies a numeric string with a maximum length of 15 digits.<br/>")
      @NotNull

    public Object getIssuerBIN() {
    return issuerBIN;
  }

  public void setIssuerBIN(Object issuerBIN) {
    this.issuerBIN = issuerBIN;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard maskedPAN(Object maskedPAN) {
    this.maskedPAN = maskedPAN;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 30 characters.<br/>
   * @return maskedPAN
   **/
  @Schema(description = "Specifies a character string with a maximum length of 30 characters.<br/>")
      @NotNull

    public Object getMaskedPAN() {
    return maskedPAN;
  }

  public void setMaskedPAN(Object maskedPAN) {
    this.maskedPAN = maskedPAN;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard plainCardData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData plainCardData) {
    this.plainCardData = plainCardData;
    return this;
  }

  /**
   * Get plainCardData
   * @return plainCardData
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData getPlainCardData() {
    return plainCardData;
  }

  public void setPlainCardData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData plainCardData) {
    this.plainCardData = plainCardData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard paymentAccountReference(Object paymentAccountReference) {
    this.paymentAccountReference = paymentAccountReference;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return paymentAccountReference
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getPaymentAccountReference() {
    return paymentAccountReference;
  }

  public void setPaymentAccountReference(Object paymentAccountReference) {
    this.paymentAccountReference = paymentAccountReference;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard protectedCardData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCardData) {
    this.protectedCardData = protectedCardData;
    return this;
  }

  /**
   * Get protectedCardData
   * @return protectedCardData
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData getProtectedCardData() {
    return protectedCardData;
  }

  public void setProtectedCardData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCardData) {
    this.protectedCardData = protectedCardData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard privateCardData(Object privateCardData) {
    this.privateCardData = privateCardData;
    return this;
  }

  /**
   * Binary data of 100K maximum.<br/>
   * @return privateCardData
   **/
  @Schema(description = "Binary data of 100K maximum.<br/>")
      @NotNull

    public Object getPrivateCardData() {
    return privateCardData;
  }

  public void setPrivateCardData(Object privateCardData) {
    this.privateCardData = privateCardData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard serviceOption(Object serviceOption) {
    this.serviceOption = serviceOption;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return serviceOption
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getServiceOption() {
    return serviceOption;
  }

  public void setServiceOption(Object serviceOption) {
    this.serviceOption = serviceOption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentCard poipoiIdfinancialServiceServiceRequestEnvironmentCard = (PoipoiIdfinancialServiceServiceRequestEnvironmentCard) o;
    return Objects.equals(this.additionalCardData, poipoiIdfinancialServiceServiceRequestEnvironmentCard.additionalCardData) &&
        Objects.equals(this.allowedProduct, poipoiIdfinancialServiceServiceRequestEnvironmentCard.allowedProduct) &&
        Objects.equals(this.cardBrand, poipoiIdfinancialServiceServiceRequestEnvironmentCard.cardBrand) &&
        Objects.equals(this.cardCurrencyCode, poipoiIdfinancialServiceServiceRequestEnvironmentCard.cardCurrencyCode) &&
        Objects.equals(this.cardCountryCode, poipoiIdfinancialServiceServiceRequestEnvironmentCard.cardCountryCode) &&
        Objects.equals(this.cardProductProfile, poipoiIdfinancialServiceServiceRequestEnvironmentCard.cardProductProfile) &&
        Objects.equals(this.cardProductSubType, poipoiIdfinancialServiceServiceRequestEnvironmentCard.cardProductSubType) &&
        Objects.equals(this.cardProductType, poipoiIdfinancialServiceServiceRequestEnvironmentCard.cardProductType) &&
        Objects.equals(this.internationalCard, poipoiIdfinancialServiceServiceRequestEnvironmentCard.internationalCard) &&
        Objects.equals(this.issuerBIN, poipoiIdfinancialServiceServiceRequestEnvironmentCard.issuerBIN) &&
        Objects.equals(this.maskedPAN, poipoiIdfinancialServiceServiceRequestEnvironmentCard.maskedPAN) &&
        Objects.equals(this.plainCardData, poipoiIdfinancialServiceServiceRequestEnvironmentCard.plainCardData) &&
        Objects.equals(this.paymentAccountReference, poipoiIdfinancialServiceServiceRequestEnvironmentCard.paymentAccountReference) &&
        Objects.equals(this.protectedCardData, poipoiIdfinancialServiceServiceRequestEnvironmentCard.protectedCardData) &&
        Objects.equals(this.privateCardData, poipoiIdfinancialServiceServiceRequestEnvironmentCard.privateCardData) &&
        Objects.equals(this.serviceOption, poipoiIdfinancialServiceServiceRequestEnvironmentCard.serviceOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalCardData, allowedProduct, cardBrand, cardCurrencyCode, cardCountryCode, cardProductProfile, cardProductSubType, cardProductType, internationalCard, issuerBIN, maskedPAN, plainCardData, paymentAccountReference, protectedCardData, privateCardData, serviceOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCard {\n");
    
    sb.append("    additionalCardData: ").append(toIndentedString(additionalCardData)).append("\n");
    sb.append("    allowedProduct: ").append(toIndentedString(allowedProduct)).append("\n");
    sb.append("    cardBrand: ").append(toIndentedString(cardBrand)).append("\n");
    sb.append("    cardCurrencyCode: ").append(toIndentedString(cardCurrencyCode)).append("\n");
    sb.append("    cardCountryCode: ").append(toIndentedString(cardCountryCode)).append("\n");
    sb.append("    cardProductProfile: ").append(toIndentedString(cardProductProfile)).append("\n");
    sb.append("    cardProductSubType: ").append(toIndentedString(cardProductSubType)).append("\n");
    sb.append("    cardProductType: ").append(toIndentedString(cardProductType)).append("\n");
    sb.append("    internationalCard: ").append(toIndentedString(internationalCard)).append("\n");
    sb.append("    issuerBIN: ").append(toIndentedString(issuerBIN)).append("\n");
    sb.append("    maskedPAN: ").append(toIndentedString(maskedPAN)).append("\n");
    sb.append("    plainCardData: ").append(toIndentedString(plainCardData)).append("\n");
    sb.append("    paymentAccountReference: ").append(toIndentedString(paymentAccountReference)).append("\n");
    sb.append("    protectedCardData: ").append(toIndentedString(protectedCardData)).append("\n");
    sb.append("    privateCardData: ").append(toIndentedString(privateCardData)).append("\n");
    sb.append("    serviceOption: ").append(toIndentedString(serviceOption)).append("\n");
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
