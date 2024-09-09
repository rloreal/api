package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData;
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
  * Payment card performing the transaction.<br/>
 **/
@Schema(description="Payment card performing the transaction.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCard   {
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object additionalCardData = null;
  
  @Schema(description = "Product that can be purchased with the card.")
 /**
   * Product that can be purchased with the card.  
  **/
  private Object allowedProduct = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object cardBrand = null;
  
  @Schema(description = "Specifies an alphanumeric string with a length of exact 3 characters.<br/>")
 /**
   * Specifies an alphanumeric string with a length of exact 3 characters.<br/>  
  **/
  private Object cardCurrencyCode = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 3 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 3 characters.<br/>  
  **/
  private Object cardCountryCode = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object cardProductProfile = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object cardProductSubType = null;
  
  @Schema(description = "Type of card product.<br/>- **COMM: CommercialCard**  : *Cards issued as a means of business expenditure, for instance business card or corporate card. The user could be a company, an individual for business expenses or a self employed for business purposes.*<br/>- **CONS: ConsumerCard**  : *Cards issued as a means of personal expenditure. The user is always an individual.*<br/>")
 /**
   * Type of card product.<br/>- **COMM: CommercialCard**  : *Cards issued as a means of business expenditure, for instance business card or corporate card. The user could be a company, an individual for business expenses or a self employed for business purposes.*<br/>- **CONS: ConsumerCard**  : *Cards issued as a means of personal expenditure. The user is always an individual.*<br/>  
  **/
  private Object cardProductType = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object internationalCard = null;
  
  @Schema(description = "Specifies a numeric string with a maximum length of 15 digits.<br/>")
 /**
   * Specifies a numeric string with a maximum length of 15 digits.<br/>  
  **/
  private Object issuerBIN = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 30 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 30 characters.<br/>  
  **/
  private Object maskedPAN = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData plainCardData = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object paymentAccountReference = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCardData = null;
  
  @Schema(description = "Binary data of 100K maximum.<br/>")
 /**
   * Binary data of 100K maximum.<br/>  
  **/
  private Object privateCardData = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object serviceOption = null;
 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return additionalCardData
  **/
  @JsonProperty("AdditionalCardData")
  @NotNull
  public Object getAdditionalCardData() {
    return additionalCardData;
  }

  public void setAdditionalCardData(Object additionalCardData) {
    this.additionalCardData = additionalCardData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard additionalCardData(Object additionalCardData) {
    this.additionalCardData = additionalCardData;
    return this;
  }

 /**
   * Product that can be purchased with the card.
   * @return allowedProduct
  **/
  @JsonProperty("AllowedProduct")
  @NotNull
  public Object getAllowedProduct() {
    return allowedProduct;
  }

  public void setAllowedProduct(Object allowedProduct) {
    this.allowedProduct = allowedProduct;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard allowedProduct(Object allowedProduct) {
    this.allowedProduct = allowedProduct;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return cardBrand
  **/
  @JsonProperty("CardBrand")
  @NotNull
  public Object getCardBrand() {
    return cardBrand;
  }

  public void setCardBrand(Object cardBrand) {
    this.cardBrand = cardBrand;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard cardBrand(Object cardBrand) {
    this.cardBrand = cardBrand;
    return this;
  }

 /**
   * Specifies an alphanumeric string with a length of exact 3 characters.&lt;br/&gt;
   * @return cardCurrencyCode
  **/
  @JsonProperty("CardCurrencyCode")
  @NotNull
  public Object getCardCurrencyCode() {
    return cardCurrencyCode;
  }

  public void setCardCurrencyCode(Object cardCurrencyCode) {
    this.cardCurrencyCode = cardCurrencyCode;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard cardCurrencyCode(Object cardCurrencyCode) {
    this.cardCurrencyCode = cardCurrencyCode;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 3 characters.&lt;br/&gt;
   * @return cardCountryCode
  **/
  @JsonProperty("CardCountryCode")
  @NotNull
  public Object getCardCountryCode() {
    return cardCountryCode;
  }

  public void setCardCountryCode(Object cardCountryCode) {
    this.cardCountryCode = cardCountryCode;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard cardCountryCode(Object cardCountryCode) {
    this.cardCountryCode = cardCountryCode;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return cardProductProfile
  **/
  @JsonProperty("CardProductProfile")
  @NotNull
  public Object getCardProductProfile() {
    return cardProductProfile;
  }

  public void setCardProductProfile(Object cardProductProfile) {
    this.cardProductProfile = cardProductProfile;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard cardProductProfile(Object cardProductProfile) {
    this.cardProductProfile = cardProductProfile;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return cardProductSubType
  **/
  @JsonProperty("CardProductSubType")
  @NotNull
  public Object getCardProductSubType() {
    return cardProductSubType;
  }

  public void setCardProductSubType(Object cardProductSubType) {
    this.cardProductSubType = cardProductSubType;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard cardProductSubType(Object cardProductSubType) {
    this.cardProductSubType = cardProductSubType;
    return this;
  }

 /**
   * Type of card product.&lt;br/&gt;- **COMM: CommercialCard**  : *Cards issued as a means of business expenditure, for instance business card or corporate card. The user could be a company, an individual for business expenses or a self employed for business purposes.*&lt;br/&gt;- **CONS: ConsumerCard**  : *Cards issued as a means of personal expenditure. The user is always an individual.*&lt;br/&gt;
   * @return cardProductType
  **/
  @JsonProperty("CardProductType")
  @NotNull
  public Object getCardProductType() {
    return cardProductType;
  }

  public void setCardProductType(Object cardProductType) {
    this.cardProductType = cardProductType;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard cardProductType(Object cardProductType) {
    this.cardProductType = cardProductType;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return internationalCard
  **/
  @JsonProperty("InternationalCard")
  @NotNull
  public Object getInternationalCard() {
    return internationalCard;
  }

  public void setInternationalCard(Object internationalCard) {
    this.internationalCard = internationalCard;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard internationalCard(Object internationalCard) {
    this.internationalCard = internationalCard;
    return this;
  }

 /**
   * Specifies a numeric string with a maximum length of 15 digits.&lt;br/&gt;
   * @return issuerBIN
  **/
  @JsonProperty("IssuerBIN")
  @NotNull
  public Object getIssuerBIN() {
    return issuerBIN;
  }

  public void setIssuerBIN(Object issuerBIN) {
    this.issuerBIN = issuerBIN;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard issuerBIN(Object issuerBIN) {
    this.issuerBIN = issuerBIN;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 30 characters.&lt;br/&gt;
   * @return maskedPAN
  **/
  @JsonProperty("MaskedPAN")
  @NotNull
  public Object getMaskedPAN() {
    return maskedPAN;
  }

  public void setMaskedPAN(Object maskedPAN) {
    this.maskedPAN = maskedPAN;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard maskedPAN(Object maskedPAN) {
    this.maskedPAN = maskedPAN;
    return this;
  }

 /**
   * Get plainCardData
   * @return plainCardData
  **/
  @JsonProperty("PlainCardData")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData getPlainCardData() {
    return plainCardData;
  }

  public void setPlainCardData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData plainCardData) {
    this.plainCardData = plainCardData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard plainCardData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData plainCardData) {
    this.plainCardData = plainCardData;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return paymentAccountReference
  **/
  @JsonProperty("PaymentAccountReference")
  @NotNull
  public Object getPaymentAccountReference() {
    return paymentAccountReference;
  }

  public void setPaymentAccountReference(Object paymentAccountReference) {
    this.paymentAccountReference = paymentAccountReference;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard paymentAccountReference(Object paymentAccountReference) {
    this.paymentAccountReference = paymentAccountReference;
    return this;
  }

 /**
   * Get protectedCardData
   * @return protectedCardData
  **/
  @JsonProperty("ProtectedCardData")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData getProtectedCardData() {
    return protectedCardData;
  }

  public void setProtectedCardData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCardData) {
    this.protectedCardData = protectedCardData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard protectedCardData(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCardData) {
    this.protectedCardData = protectedCardData;
    return this;
  }

 /**
   * Binary data of 100K maximum.&lt;br/&gt;
   * @return privateCardData
  **/
  @JsonProperty("PrivateCardData")
  @NotNull
  public Object getPrivateCardData() {
    return privateCardData;
  }

  public void setPrivateCardData(Object privateCardData) {
    this.privateCardData = privateCardData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard privateCardData(Object privateCardData) {
    this.privateCardData = privateCardData;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return serviceOption
  **/
  @JsonProperty("ServiceOption")
  @NotNull
  public Object getServiceOption() {
    return serviceOption;
  }

  public void setServiceOption(Object serviceOption) {
    this.serviceOption = serviceOption;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCard serviceOption(Object serviceOption) {
    this.serviceOption = serviceOption;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
