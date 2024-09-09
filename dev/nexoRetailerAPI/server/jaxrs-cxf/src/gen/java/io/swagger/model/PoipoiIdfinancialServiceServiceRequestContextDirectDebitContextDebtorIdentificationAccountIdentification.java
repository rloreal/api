package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount;
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
  * Choice between formats for the identification of a cash account.<br/>
 **/
@Schema(description="Choice between formats for the identification of a cash account.<br/>")
public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification   {
  
  @Schema(example = "BARC12345612345678", description = "Basic Bank Account Number (BBAN). Identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), which uniquely identifies the account of a customer.<br/>")
 /**
   * Basic Bank Account Number (BBAN). Identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), which uniquely identifies the account of a customer.<br/>  
  **/
  private Object BBAN = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount domesticAccount = null;
  
  @Schema(example = "AT611904300234573201", description = "The International Bank Account Number is a code used internationally by financial institutions to uniquely identify the account of a customer at a financial institution as described in the 2007 edition of the ISO 13616 standard \"Banking and related financial services - International Bank Account Number (IBAN)\" and replaced by the more recent edition of the standard.<br/>")
 /**
   * The International Bank Account Number is a code used internationally by financial institutions to uniquely identify the account of a customer at a financial institution as described in the 2007 edition of the ISO 13616 standard \"Banking and related financial services - International Bank Account Number (IBAN)\" and replaced by the more recent edition of the standard.<br/>  
  **/
  private Object IBAN = null;
  
  @Schema(example = "12345678", description = "Universal Payment Identification Code (UPIC). Identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.<br/>")
 /**
   * Universal Payment Identification Code (UPIC). Identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.<br/>  
  **/
  private Object UPIC = null;
 /**
   * Basic Bank Account Number (BBAN). Identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), which uniquely identifies the account of a customer.&lt;br/&gt;
   * @return BBAN
  **/
  @JsonProperty("BBAN")
  @NotNull
  public Object getBBAN() {
    return BBAN;
  }

  public void setBBAN(Object BBAN) {
    this.BBAN = BBAN;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification BBAN(Object BBAN) {
    this.BBAN = BBAN;
    return this;
  }

 /**
   * Get domesticAccount
   * @return domesticAccount
  **/
  @JsonProperty("DomesticAccount")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount getDomesticAccount() {
    return domesticAccount;
  }

  public void setDomesticAccount(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount domesticAccount) {
    this.domesticAccount = domesticAccount;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification domesticAccount(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount domesticAccount) {
    this.domesticAccount = domesticAccount;
    return this;
  }

 /**
   * The International Bank Account Number is a code used internationally by financial institutions to uniquely identify the account of a customer at a financial institution as described in the 2007 edition of the ISO 13616 standard \&quot;Banking and related financial services - International Bank Account Number (IBAN)\&quot; and replaced by the more recent edition of the standard.&lt;br/&gt;
   * @return IBAN
  **/
  @JsonProperty("IBAN")
  @NotNull
  public Object getIBAN() {
    return IBAN;
  }

  public void setIBAN(Object IBAN) {
    this.IBAN = IBAN;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification IBAN(Object IBAN) {
    this.IBAN = IBAN;
    return this;
  }

 /**
   * Universal Payment Identification Code (UPIC). Identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.&lt;br/&gt;
   * @return UPIC
  **/
  @JsonProperty("UPIC")
  @NotNull
  public Object getUPIC() {
    return UPIC;
  }

  public void setUPIC(Object UPIC) {
    this.UPIC = UPIC;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification UPIC(Object UPIC) {
    this.UPIC = UPIC;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification {\n");
    
    sb.append("    BBAN: ").append(toIndentedString(BBAN)).append("\n");
    sb.append("    domesticAccount: ").append(toIndentedString(domesticAccount)).append("\n");
    sb.append("    IBAN: ").append(toIndentedString(IBAN)).append("\n");
    sb.append("    UPIC: ").append(toIndentedString(UPIC)).append("\n");
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
