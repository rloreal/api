package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle;
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
  * Data related to the cardholder.<br/>
 **/
@Schema(description="Data related to the cardholder.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder   {
  
  @Schema(description = "Method and data intended to be used for this transaction to authenticate the cardholder and its card.")
 /**
   * Method and data intended to be used for this transaction to authenticate the cardholder and its card.  
  **/
  private Object authentication = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress billingAddress = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification identification = null;
  
  @Schema(example = "ENG", description = "Specifies a language.<br/>")
 /**
   * Specifies a language.<br/>  
  **/
  private Object language = null;
  
  @Schema(description = "Data related to the mobile of stakeholder.")
 /**
   * Data related to the mobile of stakeholder.  
  **/
  private Object mobileData = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 45 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 45 characters.<br/>  
  **/
  private Object name = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object personalData = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress shippingAddress = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object tripNumber = null;
  
  @Schema(description = "Result of performed verifications for the transaction.")
 /**
   * Result of performed verifications for the transaction.  
  **/
  private Object transactionVerificationResult = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle vehicle = null;
 /**
   * Method and data intended to be used for this transaction to authenticate the cardholder and its card.
   * @return authentication
  **/
  @JsonProperty("Authentication")
  @NotNull
  public Object getAuthentication() {
    return authentication;
  }

  public void setAuthentication(Object authentication) {
    this.authentication = authentication;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder authentication(Object authentication) {
    this.authentication = authentication;
    return this;
  }

 /**
   * Get billingAddress
   * @return billingAddress
  **/
  @JsonProperty("BillingAddress")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder billingAddress(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

 /**
   * Get identification
   * @return identification
  **/
  @JsonProperty("Identification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification getIdentification() {
    return identification;
  }

  public void setIdentification(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification identification) {
    this.identification = identification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder identification(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Specifies a language.&lt;br/&gt;
   * @return language
  **/
  @JsonProperty("Language")
  @NotNull
  public Object getLanguage() {
    return language;
  }

  public void setLanguage(Object language) {
    this.language = language;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder language(Object language) {
    this.language = language;
    return this;
  }

 /**
   * Data related to the mobile of stakeholder.
   * @return mobileData
  **/
  @JsonProperty("MobileData")
  @NotNull
  public Object getMobileData() {
    return mobileData;
  }

  public void setMobileData(Object mobileData) {
    this.mobileData = mobileData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder mobileData(Object mobileData) {
    this.mobileData = mobileData;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 45 characters.&lt;br/&gt;
   * @return name
  **/
  @JsonProperty("Name")
  @NotNull
  public Object getName() {
    return name;
  }

  public void setName(Object name) {
    this.name = name;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder name(Object name) {
    this.name = name;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return personalData
  **/
  @JsonProperty("PersonalData")
  @NotNull
  public Object getPersonalData() {
    return personalData;
  }

  public void setPersonalData(Object personalData) {
    this.personalData = personalData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder personalData(Object personalData) {
    this.personalData = personalData;
    return this;
  }

 /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @JsonProperty("ShippingAddress")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder shippingAddress(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return tripNumber
  **/
  @JsonProperty("TripNumber")
  @NotNull
  public Object getTripNumber() {
    return tripNumber;
  }

  public void setTripNumber(Object tripNumber) {
    this.tripNumber = tripNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder tripNumber(Object tripNumber) {
    this.tripNumber = tripNumber;
    return this;
  }

 /**
   * Result of performed verifications for the transaction.
   * @return transactionVerificationResult
  **/
  @JsonProperty("TransactionVerificationResult")
  @NotNull
  public Object getTransactionVerificationResult() {
    return transactionVerificationResult;
  }

  public void setTransactionVerificationResult(Object transactionVerificationResult) {
    this.transactionVerificationResult = transactionVerificationResult;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder transactionVerificationResult(Object transactionVerificationResult) {
    this.transactionVerificationResult = transactionVerificationResult;
    return this;
  }

 /**
   * Get vehicle
   * @return vehicle
  **/
  @JsonProperty("Vehicle")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle vehicle) {
    this.vehicle = vehicle;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder vehicle(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder {\n");
    
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    mobileData: ").append(toIndentedString(mobileData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    personalData: ").append(toIndentedString(personalData)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    tripNumber: ").append(toIndentedString(tripNumber)).append("\n");
    sb.append("    transactionVerificationResult: ").append(toIndentedString(transactionVerificationResult)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
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
