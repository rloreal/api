package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identification of check as payment instrument.&lt;br/&gt;
 */
@Schema(description = "Identification of check as payment instrument.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCheck   {
  @JsonProperty("AccountNumber")
  private Object accountNumber = null;

  @JsonProperty("BankIdentification")
  private Object bankIdentification = null;

  @JsonProperty("CheckCardNumber")
  private Object checkCardNumber = null;

  @JsonProperty("CheckNumber")
  private Object checkNumber = null;

  @JsonProperty("CheckType")
  private Object checkType = null;

  @JsonProperty("CheckTrackData2")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 checkTrackData2 = null;

  @JsonProperty("Country")
  private Object country = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck accountNumber(Object accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return accountNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(Object accountNumber) {
    this.accountNumber = accountNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck bankIdentification(Object bankIdentification) {
    this.bankIdentification = bankIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return bankIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getBankIdentification() {
    return bankIdentification;
  }

  public void setBankIdentification(Object bankIdentification) {
    this.bankIdentification = bankIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck checkCardNumber(Object checkCardNumber) {
    this.checkCardNumber = checkCardNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return checkCardNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getCheckCardNumber() {
    return checkCardNumber;
  }

  public void setCheckCardNumber(Object checkCardNumber) {
    this.checkCardNumber = checkCardNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck checkNumber(Object checkNumber) {
    this.checkNumber = checkNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return checkNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getCheckNumber() {
    return checkNumber;
  }

  public void setCheckNumber(Object checkNumber) {
    this.checkNumber = checkNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck checkType(Object checkType) {
    this.checkType = checkType;
    return this;
  }

  /**
   * Type of bank check.<br/>- **BANK: BankCheck**  : *The check is guaranteed by a bank.*<br/>- **BUSI: BusinessCheck**  : *The check belongs to a Company or a professional entity.*<br/>- **GOVC: GovernmentCheck**  : *Check issued by Government.*<br/>- **PAYR: PayrollCheck**  : *Check issued by a company for the employees.*<br/>- **PERS: PersonalCheck**  : *The check belongs to an individual.*<br/>
   * @return checkType
   **/
  @Schema(description = "Type of bank check.<br/>- **BANK: BankCheck**  : *The check is guaranteed by a bank.*<br/>- **BUSI: BusinessCheck**  : *The check belongs to a Company or a professional entity.*<br/>- **GOVC: GovernmentCheck**  : *Check issued by Government.*<br/>- **PAYR: PayrollCheck**  : *Check issued by a company for the employees.*<br/>- **PERS: PersonalCheck**  : *The check belongs to an individual.*<br/>")
      @NotNull

    public Object getCheckType() {
    return checkType;
  }

  public void setCheckType(Object checkType) {
    this.checkType = checkType;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck checkTrackData2(PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 checkTrackData2) {
    this.checkTrackData2 = checkTrackData2;
    return this;
  }

  /**
   * Get checkTrackData2
   * @return checkTrackData2
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 getCheckTrackData2() {
    return checkTrackData2;
  }

  public void setCheckTrackData2(PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 checkTrackData2) {
    this.checkTrackData2 = checkTrackData2;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck country(Object country) {
    this.country = country;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 3 characters.<br/>
   * @return country
   **/
  @Schema(description = "Specifies a character string with a maximum length of 3 characters.<br/>")
      @NotNull

    public Object getCountry() {
    return country;
  }

  public void setCountry(Object country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentCheck poipoiIdfinancialServiceServiceRequestEnvironmentCheck = (PoipoiIdfinancialServiceServiceRequestEnvironmentCheck) o;
    return Objects.equals(this.accountNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCheck.accountNumber) &&
        Objects.equals(this.bankIdentification, poipoiIdfinancialServiceServiceRequestEnvironmentCheck.bankIdentification) &&
        Objects.equals(this.checkCardNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCheck.checkCardNumber) &&
        Objects.equals(this.checkNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCheck.checkNumber) &&
        Objects.equals(this.checkType, poipoiIdfinancialServiceServiceRequestEnvironmentCheck.checkType) &&
        Objects.equals(this.checkTrackData2, poipoiIdfinancialServiceServiceRequestEnvironmentCheck.checkTrackData2) &&
        Objects.equals(this.country, poipoiIdfinancialServiceServiceRequestEnvironmentCheck.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, bankIdentification, checkCardNumber, checkNumber, checkType, checkTrackData2, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCheck {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bankIdentification: ").append(toIndentedString(bankIdentification)).append("\n");
    sb.append("    checkCardNumber: ").append(toIndentedString(checkCardNumber)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
    sb.append("    checkTrackData2: ").append(toIndentedString(checkTrackData2)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
