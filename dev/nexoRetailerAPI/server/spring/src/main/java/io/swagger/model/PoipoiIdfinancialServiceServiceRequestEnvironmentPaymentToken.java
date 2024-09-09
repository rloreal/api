package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Unencrypted sensitive data of a token.&lt;br/&gt;
 */
@Schema(description = "Unencrypted sensitive data of a token.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken   {
  @JsonProperty("PaymentToken")
  private Object paymentToken = null;

  @JsonProperty("TokenAssuranceData")
  private Object tokenAssuranceData = null;

  @JsonProperty("TokenAssuranceMethod")
  private Object tokenAssuranceMethod = null;

  @JsonProperty("TokenInitiatedIndicator")
  private Object tokenInitiatedIndicator = null;

  @JsonProperty("TokenRequestorIdentification")
  private Object tokenRequestorIdentification = null;

  @JsonProperty("TokenExpiryDate")
  private Object tokenExpiryDate = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken paymentToken(Object paymentToken) {
    this.paymentToken = paymentToken;
    return this;
  }

  /**
   * Specifies a numeric string with a maximum length of 19 digits.<br/>
   * @return paymentToken
   **/
  @Schema(description = "Specifies a numeric string with a maximum length of 19 digits.<br/>")
      @NotNull

    public Object getPaymentToken() {
    return paymentToken;
  }

  public void setPaymentToken(Object paymentToken) {
    this.paymentToken = paymentToken;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken tokenAssuranceData(Object tokenAssuranceData) {
    this.tokenAssuranceData = tokenAssuranceData;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 140 characters.<br/>
   * @return tokenAssuranceData
   **/
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
      @NotNull

    public Object getTokenAssuranceData() {
    return tokenAssuranceData;
  }

  public void setTokenAssuranceData(Object tokenAssuranceData) {
    this.tokenAssuranceData = tokenAssuranceData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken tokenAssuranceMethod(Object tokenAssuranceMethod) {
    this.tokenAssuranceMethod = tokenAssuranceMethod;
    return this;
  }

  /**
   * Specifies a numeric string with a maximum length of 2 digits.<br/>
   * @return tokenAssuranceMethod
   **/
  @Schema(description = "Specifies a numeric string with a maximum length of 2 digits.<br/>")
      @NotNull

    public Object getTokenAssuranceMethod() {
    return tokenAssuranceMethod;
  }

  public void setTokenAssuranceMethod(Object tokenAssuranceMethod) {
    this.tokenAssuranceMethod = tokenAssuranceMethod;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken tokenInitiatedIndicator(Object tokenInitiatedIndicator) {
    this.tokenInitiatedIndicator = tokenInitiatedIndicator;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return tokenInitiatedIndicator
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getTokenInitiatedIndicator() {
    return tokenInitiatedIndicator;
  }

  public void setTokenInitiatedIndicator(Object tokenInitiatedIndicator) {
    this.tokenInitiatedIndicator = tokenInitiatedIndicator;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken tokenRequestorIdentification(Object tokenRequestorIdentification) {
    this.tokenRequestorIdentification = tokenRequestorIdentification;
    return this;
  }

  /**
   * Specifies a numeric string with a maximum length of 11 digits.<br/>
   * @return tokenRequestorIdentification
   **/
  @Schema(description = "Specifies a numeric string with a maximum length of 11 digits.<br/>")
      @NotNull

    public Object getTokenRequestorIdentification() {
    return tokenRequestorIdentification;
  }

  public void setTokenRequestorIdentification(Object tokenRequestorIdentification) {
    this.tokenRequestorIdentification = tokenRequestorIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken tokenExpiryDate(Object tokenExpiryDate) {
    this.tokenExpiryDate = tokenExpiryDate;
    return this;
  }

  /**
   * Specifies a numeric string with an exact length of 4 digits.<br/>
   * @return tokenExpiryDate
   **/
  @Schema(description = "Specifies a numeric string with an exact length of 4 digits.<br/>")
      @NotNull

    public Object getTokenExpiryDate() {
    return tokenExpiryDate;
  }

  public void setTokenExpiryDate(Object tokenExpiryDate) {
    this.tokenExpiryDate = tokenExpiryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken poipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken = (PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken) o;
    return Objects.equals(this.paymentToken, poipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken.paymentToken) &&
        Objects.equals(this.tokenAssuranceData, poipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken.tokenAssuranceData) &&
        Objects.equals(this.tokenAssuranceMethod, poipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken.tokenAssuranceMethod) &&
        Objects.equals(this.tokenInitiatedIndicator, poipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken.tokenInitiatedIndicator) &&
        Objects.equals(this.tokenRequestorIdentification, poipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken.tokenRequestorIdentification) &&
        Objects.equals(this.tokenExpiryDate, poipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken.tokenExpiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentToken, tokenAssuranceData, tokenAssuranceMethod, tokenInitiatedIndicator, tokenRequestorIdentification, tokenExpiryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken {\n");
    
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    tokenAssuranceData: ").append(toIndentedString(tokenAssuranceData)).append("\n");
    sb.append("    tokenAssuranceMethod: ").append(toIndentedString(tokenAssuranceMethod)).append("\n");
    sb.append("    tokenInitiatedIndicator: ").append(toIndentedString(tokenInitiatedIndicator)).append("\n");
    sb.append("    tokenRequestorIdentification: ").append(toIndentedString(tokenRequestorIdentification)).append("\n");
    sb.append("    tokenExpiryDate: ").append(toIndentedString(tokenExpiryDate)).append("\n");
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
