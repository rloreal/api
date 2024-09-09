package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor;
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
  * Merchant token information.<br/>
 **/
@Schema(description="Merchant token information.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken   {
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object token = null;
  
  @Schema(description = "Specifies a binary string with a maximum length of 500 binary bytes.<br/>")
 /**
   * Specifies a binary string with a maximum length of 500 binary bytes.<br/>  
  **/
  private Object tokenAssuranceData = null;
  
  @Schema(example = "123456789012345678", description = "Number of objects represented as an integer.<br/>")
 /**
   * Number of objects represented as an integer.<br/>  
  **/
  private Object tokenAssuranceLevel = null;
  
  @Schema(description = "Specifies a numeric string with a maximum length of 2 digits.<br/>")
 /**
   * Specifies a numeric string with a maximum length of 2 digits.<br/>  
  **/
  private Object tokenAssuranceMethod = null;
  
  @Schema(description = "Additional payment token information.")
 /**
   * Additional payment token information.  
  **/
  private Object tokenCharacteristic = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object tokenInitiatedIndicator = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor tokenRequestor = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 10 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 10 characters.<br/>  
  **/
  private Object tokenExpiryDate = null;
 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return token
  **/
  @JsonProperty("Token")
  @NotNull
  public Object getToken() {
    return token;
  }

  public void setToken(Object token) {
    this.token = token;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken token(Object token) {
    this.token = token;
    return this;
  }

 /**
   * Specifies a binary string with a maximum length of 500 binary bytes.&lt;br/&gt;
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken tokenAssuranceData(Object tokenAssuranceData) {
    this.tokenAssuranceData = tokenAssuranceData;
    return this;
  }

 /**
   * Number of objects represented as an integer.&lt;br/&gt;
   * @return tokenAssuranceLevel
  **/
  @JsonProperty("TokenAssuranceLevel")
  @NotNull
  public Object getTokenAssuranceLevel() {
    return tokenAssuranceLevel;
  }

  public void setTokenAssuranceLevel(Object tokenAssuranceLevel) {
    this.tokenAssuranceLevel = tokenAssuranceLevel;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken tokenAssuranceLevel(Object tokenAssuranceLevel) {
    this.tokenAssuranceLevel = tokenAssuranceLevel;
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken tokenAssuranceMethod(Object tokenAssuranceMethod) {
    this.tokenAssuranceMethod = tokenAssuranceMethod;
    return this;
  }

 /**
   * Additional payment token information.
   * @return tokenCharacteristic
  **/
  @JsonProperty("TokenCharacteristic")
  @NotNull
  public Object getTokenCharacteristic() {
    return tokenCharacteristic;
  }

  public void setTokenCharacteristic(Object tokenCharacteristic) {
    this.tokenCharacteristic = tokenCharacteristic;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken tokenCharacteristic(Object tokenCharacteristic) {
    this.tokenCharacteristic = tokenCharacteristic;
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken tokenInitiatedIndicator(Object tokenInitiatedIndicator) {
    this.tokenInitiatedIndicator = tokenInitiatedIndicator;
    return this;
  }

 /**
   * Get tokenRequestor
   * @return tokenRequestor
  **/
  @JsonProperty("TokenRequestor")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor getTokenRequestor() {
    return tokenRequestor;
  }

  public void setTokenRequestor(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor tokenRequestor) {
    this.tokenRequestor = tokenRequestor;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken tokenRequestor(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor tokenRequestor) {
    this.tokenRequestor = tokenRequestor;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 10 characters.&lt;br/&gt;
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken tokenExpiryDate(Object tokenExpiryDate) {
    this.tokenExpiryDate = tokenExpiryDate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenAssuranceData: ").append(toIndentedString(tokenAssuranceData)).append("\n");
    sb.append("    tokenAssuranceLevel: ").append(toIndentedString(tokenAssuranceLevel)).append("\n");
    sb.append("    tokenAssuranceMethod: ").append(toIndentedString(tokenAssuranceMethod)).append("\n");
    sb.append("    tokenCharacteristic: ").append(toIndentedString(tokenCharacteristic)).append("\n");
    sb.append("    tokenInitiatedIndicator: ").append(toIndentedString(tokenInitiatedIndicator)).append("\n");
    sb.append("    tokenRequestor: ").append(toIndentedString(tokenRequestor)).append("\n");
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
