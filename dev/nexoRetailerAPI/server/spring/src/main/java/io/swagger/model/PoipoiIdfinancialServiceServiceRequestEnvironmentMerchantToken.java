package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Merchant token information.&lt;br/&gt;
 */
@Schema(description = "Merchant token information.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken   {
  @JsonProperty("Token")
  private Object token = null;

  @JsonProperty("TokenAssuranceData")
  private Object tokenAssuranceData = null;

  @JsonProperty("TokenAssuranceLevel")
  private Object tokenAssuranceLevel = null;

  @JsonProperty("TokenAssuranceMethod")
  private Object tokenAssuranceMethod = null;

  @JsonProperty("TokenCharacteristic")
  private Object tokenCharacteristic = null;

  @JsonProperty("TokenInitiatedIndicator")
  private Object tokenInitiatedIndicator = null;

  @JsonProperty("TokenRequestor")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor tokenRequestor = null;

  @JsonProperty("TokenExpiryDate")
  private Object tokenExpiryDate = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken token(Object token) {
    this.token = token;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return token
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getToken() {
    return token;
  }

  public void setToken(Object token) {
    this.token = token;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken tokenAssuranceData(Object tokenAssuranceData) {
    this.tokenAssuranceData = tokenAssuranceData;
    return this;
  }

  /**
   * Specifies a binary string with a maximum length of 500 binary bytes.<br/>
   * @return tokenAssuranceData
   **/
  @Schema(description = "Specifies a binary string with a maximum length of 500 binary bytes.<br/>")
      @NotNull

    public Object getTokenAssuranceData() {
    return tokenAssuranceData;
  }

  public void setTokenAssuranceData(Object tokenAssuranceData) {
    this.tokenAssuranceData = tokenAssuranceData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken tokenAssuranceLevel(Object tokenAssuranceLevel) {
    this.tokenAssuranceLevel = tokenAssuranceLevel;
    return this;
  }

  /**
   * Number of objects represented as an integer.<br/>
   * @return tokenAssuranceLevel
   **/
  @Schema(example = "123456789012345678", description = "Number of objects represented as an integer.<br/>")
      @NotNull

    public Object getTokenAssuranceLevel() {
    return tokenAssuranceLevel;
  }

  public void setTokenAssuranceLevel(Object tokenAssuranceLevel) {
    this.tokenAssuranceLevel = tokenAssuranceLevel;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken tokenAssuranceMethod(Object tokenAssuranceMethod) {
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken tokenCharacteristic(Object tokenCharacteristic) {
    this.tokenCharacteristic = tokenCharacteristic;
    return this;
  }

  /**
   * Additional payment token information.
   * @return tokenCharacteristic
   **/
  @Schema(description = "Additional payment token information.")
      @NotNull

    public Object getTokenCharacteristic() {
    return tokenCharacteristic;
  }

  public void setTokenCharacteristic(Object tokenCharacteristic) {
    this.tokenCharacteristic = tokenCharacteristic;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken tokenInitiatedIndicator(Object tokenInitiatedIndicator) {
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken tokenRequestor(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor tokenRequestor) {
    this.tokenRequestor = tokenRequestor;
    return this;
  }

  /**
   * Get tokenRequestor
   * @return tokenRequestor
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor getTokenRequestor() {
    return tokenRequestor;
  }

  public void setTokenRequestor(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantTokenTokenRequestor tokenRequestor) {
    this.tokenRequestor = tokenRequestor;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken tokenExpiryDate(Object tokenExpiryDate) {
    this.tokenExpiryDate = tokenExpiryDate;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 10 characters.<br/>
   * @return tokenExpiryDate
   **/
  @Schema(description = "Specifies a character string with a maximum length of 10 characters.<br/>")
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
    PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken poipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken = (PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken) o;
    return Objects.equals(this.token, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken.token) &&
        Objects.equals(this.tokenAssuranceData, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken.tokenAssuranceData) &&
        Objects.equals(this.tokenAssuranceLevel, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken.tokenAssuranceLevel) &&
        Objects.equals(this.tokenAssuranceMethod, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken.tokenAssuranceMethod) &&
        Objects.equals(this.tokenCharacteristic, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken.tokenCharacteristic) &&
        Objects.equals(this.tokenInitiatedIndicator, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken.tokenInitiatedIndicator) &&
        Objects.equals(this.tokenRequestor, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken.tokenRequestor) &&
        Objects.equals(this.tokenExpiryDate, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantToken.tokenExpiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, tokenAssuranceData, tokenAssuranceLevel, tokenAssuranceMethod, tokenCharacteristic, tokenInitiatedIndicator, tokenRequestor, tokenExpiryDate);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
