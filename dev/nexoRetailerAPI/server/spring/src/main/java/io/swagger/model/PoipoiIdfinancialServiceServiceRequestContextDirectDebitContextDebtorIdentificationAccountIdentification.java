package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Choice between formats for the identification of a cash account.&lt;br/&gt;
 */
@Schema(description = "Choice between formats for the identification of a cash account.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification   {
  @JsonProperty("BBAN")
  private Object BBAN = null;

  @JsonProperty("DomesticAccount")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount domesticAccount = null;

  @JsonProperty("IBAN")
  private Object IBAN = null;

  @JsonProperty("UPIC")
  private Object UPIC = null;

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification BBAN(Object BBAN) {
    this.BBAN = BBAN;
    return this;
  }

  /**
   * Basic Bank Account Number (BBAN). Identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), which uniquely identifies the account of a customer.<br/>
   * @return BBAN
   **/
  @Schema(example = "BARC12345612345678", description = "Basic Bank Account Number (BBAN). Identifier used nationally by financial institutions, ie, in individual countries, generally as part of a National Account Numbering Scheme(s), which uniquely identifies the account of a customer.<br/>")
      @NotNull

    public Object getBBAN() {
    return BBAN;
  }

  public void setBBAN(Object BBAN) {
    this.BBAN = BBAN;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification domesticAccount(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount domesticAccount) {
    this.domesticAccount = domesticAccount;
    return this;
  }

  /**
   * Get domesticAccount
   * @return domesticAccount
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount getDomesticAccount() {
    return domesticAccount;
  }

  public void setDomesticAccount(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount domesticAccount) {
    this.domesticAccount = domesticAccount;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification IBAN(Object IBAN) {
    this.IBAN = IBAN;
    return this;
  }

  /**
   * The International Bank Account Number is a code used internationally by financial institutions to uniquely identify the account of a customer at a financial institution as described in the 2007 edition of the ISO 13616 standard \"Banking and related financial services - International Bank Account Number (IBAN)\" and replaced by the more recent edition of the standard.<br/>
   * @return IBAN
   **/
  @Schema(example = "AT611904300234573201", description = "The International Bank Account Number is a code used internationally by financial institutions to uniquely identify the account of a customer at a financial institution as described in the 2007 edition of the ISO 13616 standard \"Banking and related financial services - International Bank Account Number (IBAN)\" and replaced by the more recent edition of the standard.<br/>")
      @NotNull

    public Object getIBAN() {
    return IBAN;
  }

  public void setIBAN(Object IBAN) {
    this.IBAN = IBAN;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification UPIC(Object UPIC) {
    this.UPIC = UPIC;
    return this;
  }

  /**
   * Universal Payment Identification Code (UPIC). Identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.<br/>
   * @return UPIC
   **/
  @Schema(example = "12345678", description = "Universal Payment Identification Code (UPIC). Identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.<br/>")
      @NotNull

    public Object getUPIC() {
    return UPIC;
  }

  public void setUPIC(Object UPIC) {
    this.UPIC = UPIC;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification poipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification = (PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification) o;
    return Objects.equals(this.BBAN, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification.BBAN) &&
        Objects.equals(this.domesticAccount, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification.domesticAccount) &&
        Objects.equals(this.IBAN, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification.IBAN) &&
        Objects.equals(this.UPIC, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification.UPIC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(BBAN, domesticAccount, IBAN, UPIC);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
