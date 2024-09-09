package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2;
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
  * Identification of check as payment instrument.<br/>
 **/
@Schema(description="Identification of check as payment instrument.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCheck   {
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object accountNumber = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object bankIdentification = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object checkCardNumber = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object checkNumber = null;
  
  @Schema(description = "Type of bank check.<br/>- **BANK: BankCheck**  : *The check is guaranteed by a bank.*<br/>- **BUSI: BusinessCheck**  : *The check belongs to a Company or a professional entity.*<br/>- **GOVC: GovernmentCheck**  : *Check issued by Government.*<br/>- **PAYR: PayrollCheck**  : *Check issued by a company for the employees.*<br/>- **PERS: PersonalCheck**  : *The check belongs to an individual.*<br/>")
 /**
   * Type of bank check.<br/>- **BANK: BankCheck**  : *The check is guaranteed by a bank.*<br/>- **BUSI: BusinessCheck**  : *The check belongs to a Company or a professional entity.*<br/>- **GOVC: GovernmentCheck**  : *Check issued by Government.*<br/>- **PAYR: PayrollCheck**  : *Check issued by a company for the employees.*<br/>- **PERS: PersonalCheck**  : *The check belongs to an individual.*<br/>  
  **/
  private Object checkType = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 checkTrackData2 = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 3 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 3 characters.<br/>  
  **/
  private Object country = null;
 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return accountNumber
  **/
  @JsonProperty("AccountNumber")
  @NotNull
  public Object getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(Object accountNumber) {
    this.accountNumber = accountNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck accountNumber(Object accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return bankIdentification
  **/
  @JsonProperty("BankIdentification")
  @NotNull
  public Object getBankIdentification() {
    return bankIdentification;
  }

  public void setBankIdentification(Object bankIdentification) {
    this.bankIdentification = bankIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck bankIdentification(Object bankIdentification) {
    this.bankIdentification = bankIdentification;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return checkCardNumber
  **/
  @JsonProperty("CheckCardNumber")
  @NotNull
  public Object getCheckCardNumber() {
    return checkCardNumber;
  }

  public void setCheckCardNumber(Object checkCardNumber) {
    this.checkCardNumber = checkCardNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck checkCardNumber(Object checkCardNumber) {
    this.checkCardNumber = checkCardNumber;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return checkNumber
  **/
  @JsonProperty("CheckNumber")
  @NotNull
  public Object getCheckNumber() {
    return checkNumber;
  }

  public void setCheckNumber(Object checkNumber) {
    this.checkNumber = checkNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck checkNumber(Object checkNumber) {
    this.checkNumber = checkNumber;
    return this;
  }

 /**
   * Type of bank check.&lt;br/&gt;- **BANK: BankCheck**  : *The check is guaranteed by a bank.*&lt;br/&gt;- **BUSI: BusinessCheck**  : *The check belongs to a Company or a professional entity.*&lt;br/&gt;- **GOVC: GovernmentCheck**  : *Check issued by Government.*&lt;br/&gt;- **PAYR: PayrollCheck**  : *Check issued by a company for the employees.*&lt;br/&gt;- **PERS: PersonalCheck**  : *The check belongs to an individual.*&lt;br/&gt;
   * @return checkType
  **/
  @JsonProperty("CheckType")
  @NotNull
  public Object getCheckType() {
    return checkType;
  }

  public void setCheckType(Object checkType) {
    this.checkType = checkType;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck checkType(Object checkType) {
    this.checkType = checkType;
    return this;
  }

 /**
   * Get checkTrackData2
   * @return checkTrackData2
  **/
  @JsonProperty("CheckTrackData2")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 getCheckTrackData2() {
    return checkTrackData2;
  }

  public void setCheckTrackData2(PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 checkTrackData2) {
    this.checkTrackData2 = checkTrackData2;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck checkTrackData2(PoipoiIdfinancialServiceServiceRequestEnvironmentCheckCheckTrackData2 checkTrackData2) {
    this.checkTrackData2 = checkTrackData2;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 3 characters.&lt;br/&gt;
   * @return country
  **/
  @JsonProperty("Country")
  @NotNull
  public Object getCountry() {
    return country;
  }

  public void setCountry(Object country) {
    this.country = country;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCheck country(Object country) {
    this.country = country;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
