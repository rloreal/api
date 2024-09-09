package io.swagger.model;

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
  * Unencrypted sensitive data of a token.<br/>
 **/
@Schema(description="Unencrypted sensitive data of a token.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken   {
  
  @Schema(description = "Specifies a numeric string with a maximum length of 19 digits.<br/>")
 /**
   * Specifies a numeric string with a maximum length of 19 digits.<br/>  
  **/
  private Object paymentToken = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 140 characters.<br/>  
  **/
  private Object tokenAssuranceData = null;
  
  @Schema(description = "Specifies a numeric string with a maximum length of 2 digits.<br/>")
 /**
   * Specifies a numeric string with a maximum length of 2 digits.<br/>  
  **/
  private Object tokenAssuranceMethod = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object tokenInitiatedIndicator = null;
  
  @Schema(description = "Specifies a numeric string with a maximum length of 11 digits.<br/>")
 /**
   * Specifies a numeric string with a maximum length of 11 digits.<br/>  
  **/
  private Object tokenRequestorIdentification = null;
  
  @Schema(description = "Specifies a numeric string with an exact length of 4 digits.<br/>")
 /**
   * Specifies a numeric string with an exact length of 4 digits.<br/>  
  **/
  private Object tokenExpiryDate = null;
 /**
   * Specifies a numeric string with a maximum length of 19 digits.&lt;br/&gt;
   * @return paymentToken
  **/
  @JsonProperty("PaymentToken")
  @NotNull
  public Object getPaymentToken() {
    return paymentToken;
  }

  public void setPaymentToken(Object paymentToken) {
    this.paymentToken = paymentToken;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken paymentToken(Object paymentToken) {
    this.paymentToken = paymentToken;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 140 characters.&lt;br/&gt;
   * @return tokenAssuranceData
  **/
  @JsonProperty("TokenAssuranceData")
  @NotNull
  public Object getTokenAssuranceData() {
    return tokenAssuranceData;
  }

  public void setTokenAssuranceData(Object tokenAssuranceData) {
    this.tokenAssuranceData = tokenAssuranceData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken tokenAssuranceData(Object tokenAssuranceData) {
    this.tokenAssuranceData = tokenAssuranceData;
    return this;
  }

 /**
   * Specifies a numeric string with a maximum length of 2 digits.&lt;br/&gt;
   * @return tokenAssuranceMethod
  **/
  @JsonProperty("TokenAssuranceMethod")
  @NotNull
  public Object getTokenAssuranceMethod() {
    return tokenAssuranceMethod;
  }

  public void setTokenAssuranceMethod(Object tokenAssuranceMethod) {
    this.tokenAssuranceMethod = tokenAssuranceMethod;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken tokenAssuranceMethod(Object tokenAssuranceMethod) {
    this.tokenAssuranceMethod = tokenAssuranceMethod;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return tokenInitiatedIndicator
  **/
  @JsonProperty("TokenInitiatedIndicator")
  @NotNull
  public Object getTokenInitiatedIndicator() {
    return tokenInitiatedIndicator;
  }

  public void setTokenInitiatedIndicator(Object tokenInitiatedIndicator) {
    this.tokenInitiatedIndicator = tokenInitiatedIndicator;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken tokenInitiatedIndicator(Object tokenInitiatedIndicator) {
    this.tokenInitiatedIndicator = tokenInitiatedIndicator;
    return this;
  }

 /**
   * Specifies a numeric string with a maximum length of 11 digits.&lt;br/&gt;
   * @return tokenRequestorIdentification
  **/
  @JsonProperty("TokenRequestorIdentification")
  @NotNull
  public Object getTokenRequestorIdentification() {
    return tokenRequestorIdentification;
  }

  public void setTokenRequestorIdentification(Object tokenRequestorIdentification) {
    this.tokenRequestorIdentification = tokenRequestorIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken tokenRequestorIdentification(Object tokenRequestorIdentification) {
    this.tokenRequestorIdentification = tokenRequestorIdentification;
    return this;
  }

 /**
   * Specifies a numeric string with an exact length of 4 digits.&lt;br/&gt;
   * @return tokenExpiryDate
  **/
  @JsonProperty("TokenExpiryDate")
  @NotNull
  public Object getTokenExpiryDate() {
    return tokenExpiryDate;
  }

  public void setTokenExpiryDate(Object tokenExpiryDate) {
    this.tokenExpiryDate = tokenExpiryDate;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPaymentToken tokenExpiryDate(Object tokenExpiryDate) {
    this.tokenExpiryDate = tokenExpiryDate;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
