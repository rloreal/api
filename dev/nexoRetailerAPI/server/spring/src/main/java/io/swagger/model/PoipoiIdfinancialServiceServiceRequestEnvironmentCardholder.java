package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data related to the cardholder.&lt;br/&gt;
 */
@Schema(description = "Data related to the cardholder.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder   {
  @JsonProperty("Authentication")
  private Object authentication = null;

  @JsonProperty("BillingAddress")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress billingAddress = null;

  @JsonProperty("Identification")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification identification = null;

  @JsonProperty("Language")
  private Object language = null;

  @JsonProperty("MobileData")
  private Object mobileData = null;

  @JsonProperty("Name")
  private Object name = null;

  @JsonProperty("PersonalData")
  private Object personalData = null;

  @JsonProperty("ShippingAddress")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress shippingAddress = null;

  @JsonProperty("TripNumber")
  private Object tripNumber = null;

  @JsonProperty("TransactionVerificationResult")
  private Object transactionVerificationResult = null;

  @JsonProperty("Vehicle")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle vehicle = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder authentication(Object authentication) {
    this.authentication = authentication;
    return this;
  }

  /**
   * Method and data intended to be used for this transaction to authenticate the cardholder and its card.
   * @return authentication
   **/
  @Schema(description = "Method and data intended to be used for this transaction to authenticate the cardholder and its card.")
      @NotNull

    public Object getAuthentication() {
    return authentication;
  }

  public void setAuthentication(Object authentication) {
    this.authentication = authentication;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder billingAddress(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * Get billingAddress
   * @return billingAddress
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder identification(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification getIdentification() {
    return identification;
  }

  public void setIdentification(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification identification) {
    this.identification = identification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder language(Object language) {
    this.language = language;
    return this;
  }

  /**
   * Specifies a language.<br/>
   * @return language
   **/
  @Schema(example = "ENG", description = "Specifies a language.<br/>")
      @NotNull

    public Object getLanguage() {
    return language;
  }

  public void setLanguage(Object language) {
    this.language = language;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder mobileData(Object mobileData) {
    this.mobileData = mobileData;
    return this;
  }

  /**
   * Data related to the mobile of stakeholder.
   * @return mobileData
   **/
  @Schema(description = "Data related to the mobile of stakeholder.")
      @NotNull

    public Object getMobileData() {
    return mobileData;
  }

  public void setMobileData(Object mobileData) {
    this.mobileData = mobileData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder name(Object name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 45 characters.<br/>
   * @return name
   **/
  @Schema(description = "Specifies a character string with a maximum length of 45 characters.<br/>")
      @NotNull

    public Object getName() {
    return name;
  }

  public void setName(Object name) {
    this.name = name;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder personalData(Object personalData) {
    this.personalData = personalData;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return personalData
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getPersonalData() {
    return personalData;
  }

  public void setPersonalData(Object personalData) {
    this.personalData = personalData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder shippingAddress(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

  /**
   * Get shippingAddress
   * @return shippingAddress
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder tripNumber(Object tripNumber) {
    this.tripNumber = tripNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return tripNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getTripNumber() {
    return tripNumber;
  }

  public void setTripNumber(Object tripNumber) {
    this.tripNumber = tripNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder transactionVerificationResult(Object transactionVerificationResult) {
    this.transactionVerificationResult = transactionVerificationResult;
    return this;
  }

  /**
   * Result of performed verifications for the transaction.
   * @return transactionVerificationResult
   **/
  @Schema(description = "Result of performed verifications for the transaction.")
      @NotNull

    public Object getTransactionVerificationResult() {
    return transactionVerificationResult;
  }

  public void setTransactionVerificationResult(Object transactionVerificationResult) {
    this.transactionVerificationResult = transactionVerificationResult;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder vehicle(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

  /**
   * Get vehicle
   * @return vehicle
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderVehicle vehicle) {
    this.vehicle = vehicle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder poipoiIdfinancialServiceServiceRequestEnvironmentCardholder = (PoipoiIdfinancialServiceServiceRequestEnvironmentCardholder) o;
    return Objects.equals(this.authentication, poipoiIdfinancialServiceServiceRequestEnvironmentCardholder.authentication) &&
        Objects.equals(this.billingAddress, poipoiIdfinancialServiceServiceRequestEnvironmentCardholder.billingAddress) &&
        Objects.equals(this.identification, poipoiIdfinancialServiceServiceRequestEnvironmentCardholder.identification) &&
        Objects.equals(this.language, poipoiIdfinancialServiceServiceRequestEnvironmentCardholder.language) &&
        Objects.equals(this.mobileData, poipoiIdfinancialServiceServiceRequestEnvironmentCardholder.mobileData) &&
        Objects.equals(this.name, poipoiIdfinancialServiceServiceRequestEnvironmentCardholder.name) &&
        Objects.equals(this.personalData, poipoiIdfinancialServiceServiceRequestEnvironmentCardholder.personalData) &&
        Objects.equals(this.shippingAddress, poipoiIdfinancialServiceServiceRequestEnvironmentCardholder.shippingAddress) &&
        Objects.equals(this.tripNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardholder.tripNumber) &&
        Objects.equals(this.transactionVerificationResult, poipoiIdfinancialServiceServiceRequestEnvironmentCardholder.transactionVerificationResult) &&
        Objects.equals(this.vehicle, poipoiIdfinancialServiceServiceRequestEnvironmentCardholder.vehicle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, billingAddress, identification, language, mobileData, name, personalData, shippingAddress, tripNumber, transactionVerificationResult, vehicle);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
