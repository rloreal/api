package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data related to the account pointed by the payment card.&lt;br/&gt;
 */
@Schema(description = "Data related to the account pointed by the payment card.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest   {
  @JsonProperty("AccountReference")
  private Object accountReference = null;

  @JsonProperty("AccountType")
  private Object accountType = null;

  @JsonProperty("CustomerOrder")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder = null;

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest accountReference(Object accountReference) {
    this.accountReference = accountReference;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return accountReference
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getAccountReference() {
    return accountReference;
  }

  public void setAccountReference(Object accountReference) {
    this.accountReference = accountReference;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest accountType(Object accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Type of cardholder account used for the transaction.<br/>- **CTDP: CertificateOfDeposit**  : *Certificate of deposit saving account.*<br/>- **CHCK: Checking**  : *Checking account.*<br/>- **CRDT: CreditCard**  : *Credit card account.*<br/>- **CURR: Current**  : *Current account.*<br/>- **CDBT: DebitCard**  : *Debit card account.*<br/>- **DFLT: Default**  : *Default account.*<br/>- **EPRS: EpurseCard**  : *Electronic purse card account.*<br/>- **HEQL: HomeEquityLoan**  : *Home equity loan credit account.*<br/>- **ISTL: InstalmentLoan**  : *Instalment loan credit account.*<br/>- **INVS: Investment**  : *Investment account.*<br/>- **LCDT: LineOfCredit**  : *Line of credit account.*<br/>- **MBNW: MobilePhoneAccount**  : *Mobile Station Integrated Services Digital Network Number (MSISDN).*<br/>- **MNMK: MoneyMarket**  : *Money market saving account.*<br/>- **MNMC: MoneyMarketChecking**  : *Money market checking account.*<br/>- **MTGL: MortgageLoan**  : *Mortgage loan credit account.*<br/>- **RTRM: RetirementAccount**  : *Retirement account.*<br/>- **RVLV: RevolvingLoanAccount**  : *Revolving loan account.*<br/>- **SVNG: Savings**  : *Savings account.*<br/>- **STBD: StockOrBond**  : *Stock or bond investment account.*<br/>- **UVRL: Universal**  : *Universal account.*<br/>- **PRPD: PrePaid**  : *Pre-paid account.*<br/>- **FLTC: FleetCard**  : *Fleet card account.*<br/>
   * @return accountType
   **/
  @Schema(description = "Type of cardholder account used for the transaction.<br/>- **CTDP: CertificateOfDeposit**  : *Certificate of deposit saving account.*<br/>- **CHCK: Checking**  : *Checking account.*<br/>- **CRDT: CreditCard**  : *Credit card account.*<br/>- **CURR: Current**  : *Current account.*<br/>- **CDBT: DebitCard**  : *Debit card account.*<br/>- **DFLT: Default**  : *Default account.*<br/>- **EPRS: EpurseCard**  : *Electronic purse card account.*<br/>- **HEQL: HomeEquityLoan**  : *Home equity loan credit account.*<br/>- **ISTL: InstalmentLoan**  : *Instalment loan credit account.*<br/>- **INVS: Investment**  : *Investment account.*<br/>- **LCDT: LineOfCredit**  : *Line of credit account.*<br/>- **MBNW: MobilePhoneAccount**  : *Mobile Station Integrated Services Digital Network Number (MSISDN).*<br/>- **MNMK: MoneyMarket**  : *Money market saving account.*<br/>- **MNMC: MoneyMarketChecking**  : *Money market checking account.*<br/>- **MTGL: MortgageLoan**  : *Mortgage loan credit account.*<br/>- **RTRM: RetirementAccount**  : *Retirement account.*<br/>- **RVLV: RevolvingLoanAccount**  : *Revolving loan account.*<br/>- **SVNG: Savings**  : *Savings account.*<br/>- **STBD: StockOrBond**  : *Stock or bond investment account.*<br/>- **UVRL: Universal**  : *Universal account.*<br/>- **PRPD: PrePaid**  : *Pre-paid account.*<br/>- **FLTC: FleetCard**  : *Fleet card account.*<br/>")
      @NotNull

    public Object getAccountType() {
    return accountType;
  }

  public void setAccountType(Object accountType) {
    this.accountType = accountType;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest customerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

  /**
   * Get customerOrder
   * @return customerOrder
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest = (PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest) o;
    return Objects.equals(this.accountReference, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest.accountReference) &&
        Objects.equals(this.accountType, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest.accountType) &&
        Objects.equals(this.customerOrder, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest.customerOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountReference, accountType, customerOrder);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
