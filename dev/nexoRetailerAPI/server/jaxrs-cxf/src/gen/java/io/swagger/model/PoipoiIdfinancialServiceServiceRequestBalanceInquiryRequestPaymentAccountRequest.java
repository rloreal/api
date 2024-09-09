package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder;
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
  * Data related to the account pointed by the payment card.<br/>
 **/
@Schema(description="Data related to the account pointed by the payment card.<br/>")
public class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest   {
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object accountReference = null;
  
  @Schema(description = "Type of cardholder account used for the transaction.<br/>- **CTDP: CertificateOfDeposit**  : *Certificate of deposit saving account.*<br/>- **CHCK: Checking**  : *Checking account.*<br/>- **CRDT: CreditCard**  : *Credit card account.*<br/>- **CURR: Current**  : *Current account.*<br/>- **CDBT: DebitCard**  : *Debit card account.*<br/>- **DFLT: Default**  : *Default account.*<br/>- **EPRS: EpurseCard**  : *Electronic purse card account.*<br/>- **HEQL: HomeEquityLoan**  : *Home equity loan credit account.*<br/>- **ISTL: InstalmentLoan**  : *Instalment loan credit account.*<br/>- **INVS: Investment**  : *Investment account.*<br/>- **LCDT: LineOfCredit**  : *Line of credit account.*<br/>- **MBNW: MobilePhoneAccount**  : *Mobile Station Integrated Services Digital Network Number (MSISDN).*<br/>- **MNMK: MoneyMarket**  : *Money market saving account.*<br/>- **MNMC: MoneyMarketChecking**  : *Money market checking account.*<br/>- **MTGL: MortgageLoan**  : *Mortgage loan credit account.*<br/>- **RTRM: RetirementAccount**  : *Retirement account.*<br/>- **RVLV: RevolvingLoanAccount**  : *Revolving loan account.*<br/>- **SVNG: Savings**  : *Savings account.*<br/>- **STBD: StockOrBond**  : *Stock or bond investment account.*<br/>- **UVRL: Universal**  : *Universal account.*<br/>- **PRPD: PrePaid**  : *Pre-paid account.*<br/>- **FLTC: FleetCard**  : *Fleet card account.*<br/>")
 /**
   * Type of cardholder account used for the transaction.<br/>- **CTDP: CertificateOfDeposit**  : *Certificate of deposit saving account.*<br/>- **CHCK: Checking**  : *Checking account.*<br/>- **CRDT: CreditCard**  : *Credit card account.*<br/>- **CURR: Current**  : *Current account.*<br/>- **CDBT: DebitCard**  : *Debit card account.*<br/>- **DFLT: Default**  : *Default account.*<br/>- **EPRS: EpurseCard**  : *Electronic purse card account.*<br/>- **HEQL: HomeEquityLoan**  : *Home equity loan credit account.*<br/>- **ISTL: InstalmentLoan**  : *Instalment loan credit account.*<br/>- **INVS: Investment**  : *Investment account.*<br/>- **LCDT: LineOfCredit**  : *Line of credit account.*<br/>- **MBNW: MobilePhoneAccount**  : *Mobile Station Integrated Services Digital Network Number (MSISDN).*<br/>- **MNMK: MoneyMarket**  : *Money market saving account.*<br/>- **MNMC: MoneyMarketChecking**  : *Money market checking account.*<br/>- **MTGL: MortgageLoan**  : *Mortgage loan credit account.*<br/>- **RTRM: RetirementAccount**  : *Retirement account.*<br/>- **RVLV: RevolvingLoanAccount**  : *Revolving loan account.*<br/>- **SVNG: Savings**  : *Savings account.*<br/>- **STBD: StockOrBond**  : *Stock or bond investment account.*<br/>- **UVRL: Universal**  : *Universal account.*<br/>- **PRPD: PrePaid**  : *Pre-paid account.*<br/>- **FLTC: FleetCard**  : *Fleet card account.*<br/>  
  **/
  private Object accountType = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder = null;
 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return accountReference
  **/
  @JsonProperty("AccountReference")
  @NotNull
  public Object getAccountReference() {
    return accountReference;
  }

  public void setAccountReference(Object accountReference) {
    this.accountReference = accountReference;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest accountReference(Object accountReference) {
    this.accountReference = accountReference;
    return this;
  }

 /**
   * Type of cardholder account used for the transaction.&lt;br/&gt;- **CTDP: CertificateOfDeposit**  : *Certificate of deposit saving account.*&lt;br/&gt;- **CHCK: Checking**  : *Checking account.*&lt;br/&gt;- **CRDT: CreditCard**  : *Credit card account.*&lt;br/&gt;- **CURR: Current**  : *Current account.*&lt;br/&gt;- **CDBT: DebitCard**  : *Debit card account.*&lt;br/&gt;- **DFLT: Default**  : *Default account.*&lt;br/&gt;- **EPRS: EpurseCard**  : *Electronic purse card account.*&lt;br/&gt;- **HEQL: HomeEquityLoan**  : *Home equity loan credit account.*&lt;br/&gt;- **ISTL: InstalmentLoan**  : *Instalment loan credit account.*&lt;br/&gt;- **INVS: Investment**  : *Investment account.*&lt;br/&gt;- **LCDT: LineOfCredit**  : *Line of credit account.*&lt;br/&gt;- **MBNW: MobilePhoneAccount**  : *Mobile Station Integrated Services Digital Network Number (MSISDN).*&lt;br/&gt;- **MNMK: MoneyMarket**  : *Money market saving account.*&lt;br/&gt;- **MNMC: MoneyMarketChecking**  : *Money market checking account.*&lt;br/&gt;- **MTGL: MortgageLoan**  : *Mortgage loan credit account.*&lt;br/&gt;- **RTRM: RetirementAccount**  : *Retirement account.*&lt;br/&gt;- **RVLV: RevolvingLoanAccount**  : *Revolving loan account.*&lt;br/&gt;- **SVNG: Savings**  : *Savings account.*&lt;br/&gt;- **STBD: StockOrBond**  : *Stock or bond investment account.*&lt;br/&gt;- **UVRL: Universal**  : *Universal account.*&lt;br/&gt;- **PRPD: PrePaid**  : *Pre-paid account.*&lt;br/&gt;- **FLTC: FleetCard**  : *Fleet card account.*&lt;br/&gt;
   * @return accountType
  **/
  @JsonProperty("AccountType")
  @NotNull
  public Object getAccountType() {
    return accountType;
  }

  public void setAccountType(Object accountType) {
    this.accountType = accountType;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest accountType(Object accountType) {
    this.accountType = accountType;
    return this;
  }

 /**
   * Get customerOrder
   * @return customerOrder
  **/
  @JsonProperty("CustomerOrder")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest customerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest {\n");
    
    sb.append("    accountReference: ").append(toIndentedString(accountReference)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    customerOrder: ").append(toIndentedString(customerOrder)).append("\n");
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
