package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring;
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
  * Details of the transaction in the authorisation request in a batch.<br/>
 **/
@Schema(description="Details of the transaction in the authorisation request in a batch.<br/>")
public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails   {
  
  @Schema(description = "Type of cardholder account used for the transaction.<br/>- **CTDP: CertificateOfDeposit**  : *Certificate of deposit saving account.*<br/>- **CHCK: Checking**  : *Checking account.*<br/>- **CRDT: CreditCard**  : *Credit card account.*<br/>- **CURR: Current**  : *Current account.*<br/>- **CDBT: DebitCard**  : *Debit card account.*<br/>- **DFLT: Default**  : *Default account.*<br/>- **EPRS: EpurseCard**  : *Electronic purse card account.*<br/>- **HEQL: HomeEquityLoan**  : *Home equity loan credit account.*<br/>- **ISTL: InstalmentLoan**  : *Instalment loan credit account.*<br/>- **INVS: Investment**  : *Investment account.*<br/>- **LCDT: LineOfCredit**  : *Line of credit account.*<br/>- **MBNW: MobilePhoneAccount**  : *Mobile Station Integrated Services Digital Network Number (MSISDN).*<br/>- **MNMK: MoneyMarket**  : *Money market saving account.*<br/>- **MNMC: MoneyMarketChecking**  : *Money market checking account.*<br/>- **MTGL: MortgageLoan**  : *Mortgage loan credit account.*<br/>- **RTRM: RetirementAccount**  : *Retirement account.*<br/>- **RVLV: RevolvingLoanAccount**  : *Revolving loan account.*<br/>- **SVNG: Savings**  : *Savings account.*<br/>- **STBD: StockOrBond**  : *Stock or bond investment account.*<br/>- **UVRL: Universal**  : *Universal account.*<br/>- **PRPD: PrePaid**  : *Pre-paid account.*<br/>- **FLTC: FleetCard**  : *Fleet card account.*<br/>")
 /**
   * Type of cardholder account used for the transaction.<br/>- **CTDP: CertificateOfDeposit**  : *Certificate of deposit saving account.*<br/>- **CHCK: Checking**  : *Checking account.*<br/>- **CRDT: CreditCard**  : *Credit card account.*<br/>- **CURR: Current**  : *Current account.*<br/>- **CDBT: DebitCard**  : *Debit card account.*<br/>- **DFLT: Default**  : *Default account.*<br/>- **EPRS: EpurseCard**  : *Electronic purse card account.*<br/>- **HEQL: HomeEquityLoan**  : *Home equity loan credit account.*<br/>- **ISTL: InstalmentLoan**  : *Instalment loan credit account.*<br/>- **INVS: Investment**  : *Investment account.*<br/>- **LCDT: LineOfCredit**  : *Line of credit account.*<br/>- **MBNW: MobilePhoneAccount**  : *Mobile Station Integrated Services Digital Network Number (MSISDN).*<br/>- **MNMK: MoneyMarket**  : *Money market saving account.*<br/>- **MNMC: MoneyMarketChecking**  : *Money market checking account.*<br/>- **MTGL: MortgageLoan**  : *Mortgage loan credit account.*<br/>- **RTRM: RetirementAccount**  : *Retirement account.*<br/>- **RVLV: RevolvingLoanAccount**  : *Revolving loan account.*<br/>- **SVNG: Savings**  : *Savings account.*<br/>- **STBD: StockOrBond**  : *Stock or bond investment account.*<br/>- **UVRL: Universal**  : *Universal account.*<br/>- **PRPD: PrePaid**  : *Pre-paid account.*<br/>- **FLTC: FleetCard**  : *Fleet card account.*<br/>  
  **/
  private Object accountType = null;
  
  @Schema(description = "Additional information related to the transaction like an Invoice or IndustryData (for example  hospitality, lodging, transportation).")
 /**
   * Additional information related to the transaction like an Invoice or IndustryData (for example  hospitality, lodging, transportation).  
  **/
  private Object additionalInformation = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction aggregationTransaction = null;
  
  @Schema(example = "ACTL", description = "Qualifies the amount associated with the transaction.<br/>- **ACTL: Actual**  : *Actual amount.*<br/>- **ESTM: Estimated**  : *Estimated amount (the final amount could be above or below).*<br/>- **MAXI: Maximum**  : *Maximum amount (the final amount must be less or equal).*<br/>- **DFLT: Default**  : *Default amount.*<br/>- **RPLT: Replacement**  : *Replacement amount.*<br/>- **INCR: Incremental**  : *Incremental amount for reservation.*<br/>- **DECR: Decremental**  : *Decremental amount for reservation.*<br/>- **RESD: Reserved**  : *Reserved or updated reserved amount for reservation.*<br/>")
 /**
   * Qualifies the amount associated with the transaction.<br/>- **ACTL: Actual**  : *Actual amount.*<br/>- **ESTM: Estimated**  : *Estimated amount (the final amount could be above or below).*<br/>- **MAXI: Maximum**  : *Maximum amount (the final amount must be less or equal).*<br/>- **DFLT: Default**  : *Default amount.*<br/>- **RPLT: Replacement**  : *Replacement amount.*<br/>- **INCR: Incremental**  : *Incremental amount for reservation.*<br/>- **DECR: Decremental**  : *Decremental amount for reservation.*<br/>- **RESD: Reserved**  : *Reserved or updated reserved amount for reservation.*<br/>  
  **/
  private Object amountQualifier = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object authorisedAmount = null;
  
  @Schema(example = "EUR", description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>")
 /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>  
  **/
  private Object currency = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult currencyConversionResult = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object cumulativeAmount = null;
  
  @Schema(example = "123456789012345678", description = "Number of objects represented as a positive integer.<br/>")
 /**
   * Number of objects represented as a positive integer.<br/>  
  **/
  private Object completionSequenceCounter = null;
  
  @Schema(example = "123456789012345678", description = "Number of objects represented as a positive integer.<br/>")
 /**
   * Number of objects represented as a positive integer.<br/>  
  **/
  private Object completionSequenceNumber = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object deliveryLocation = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount detailedAmount = null;
  
  @Schema(description = "Specifies a binary string with a maximum length of 10000 binary bytes.<br/>")
 /**
   * Specifies a binary string with a maximum length of 10000 binary bytes.<br/>  
  **/
  private Object icCRelatedData = null;
  
  @Schema(description = "Data related to a financial loan (instalment).")
 /**
   * Data related to a financial loan (instalment).  
  **/
  private Object instalment = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object invoiceAmount = null;
  
  @Schema(description = "Reason to process an online authorisation.")
 /**
   * Reason to process an online authorisation.  
  **/
  private Object onLineReason = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 10 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 10 characters.<br/>  
  **/
  private Object productCodeSetIdentification = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring recurring = null;
  
  @Schema(example = "123456789012345678", description = "Number of objects represented as a positive integer.<br/>")
 /**
   * Number of objects represented as a positive integer.<br/>  
  **/
  private Object reSubmissionCounter = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object requestedAmount = null;
  
  @Schema(description = "Item purchased with the transaction.")
 /**
   * Item purchased with the transaction.  
  **/
  private Object saleItem = null;
  
  @Schema(example = "500000", required = true, description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object totalAmount = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object totalAuthorisedAmount = null;
  
  @Schema(description = "Specifies a numeric string with a maximum length of 35 digits.<br/>")
 /**
   * Specifies a numeric string with a maximum length of 35 digits.<br/>  
  **/
  private Object unattendedLevelCategory = null;
  
  @Schema(description = "A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.<br/>")
 /**
   * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.<br/>  
  **/
  private Object validityDate = null;
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

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails accountType(Object accountType) {
    this.accountType = accountType;
    return this;
  }

 /**
   * Additional information related to the transaction like an Invoice or IndustryData (for example  hospitality, lodging, transportation).
   * @return additionalInformation
  **/
  @JsonProperty("AdditionalInformation")
  @NotNull
  public Object getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(Object additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails additionalInformation(Object additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

 /**
   * Get aggregationTransaction
   * @return aggregationTransaction
  **/
  @JsonProperty("AggregationTransaction")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction getAggregationTransaction() {
    return aggregationTransaction;
  }

  public void setAggregationTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction aggregationTransaction) {
    this.aggregationTransaction = aggregationTransaction;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails aggregationTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction aggregationTransaction) {
    this.aggregationTransaction = aggregationTransaction;
    return this;
  }

 /**
   * Qualifies the amount associated with the transaction.&lt;br/&gt;- **ACTL: Actual**  : *Actual amount.*&lt;br/&gt;- **ESTM: Estimated**  : *Estimated amount (the final amount could be above or below).*&lt;br/&gt;- **MAXI: Maximum**  : *Maximum amount (the final amount must be less or equal).*&lt;br/&gt;- **DFLT: Default**  : *Default amount.*&lt;br/&gt;- **RPLT: Replacement**  : *Replacement amount.*&lt;br/&gt;- **INCR: Incremental**  : *Incremental amount for reservation.*&lt;br/&gt;- **DECR: Decremental**  : *Decremental amount for reservation.*&lt;br/&gt;- **RESD: Reserved**  : *Reserved or updated reserved amount for reservation.*&lt;br/&gt;
   * @return amountQualifier
  **/
  @JsonProperty("AmountQualifier")
  @NotNull
  public Object getAmountQualifier() {
    return amountQualifier;
  }

  public void setAmountQualifier(Object amountQualifier) {
    this.amountQualifier = amountQualifier;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails amountQualifier(Object amountQualifier) {
    this.amountQualifier = amountQualifier;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return authorisedAmount
  **/
  @JsonProperty("AuthorisedAmount")
  @NotNull
  public Object getAuthorisedAmount() {
    return authorisedAmount;
  }

  public void setAuthorisedAmount(Object authorisedAmount) {
    this.authorisedAmount = authorisedAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails authorisedAmount(Object authorisedAmount) {
    this.authorisedAmount = authorisedAmount;
    return this;
  }

 /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;.&lt;br/&gt;
   * @return currency
  **/
  @JsonProperty("Currency")
  @NotNull
  public Object getCurrency() {
    return currency;
  }

  public void setCurrency(Object currency) {
    this.currency = currency;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails currency(Object currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Get currencyConversionResult
   * @return currencyConversionResult
  **/
  @JsonProperty("CurrencyConversionResult")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult getCurrencyConversionResult() {
    return currencyConversionResult;
  }

  public void setCurrencyConversionResult(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult currencyConversionResult) {
    this.currencyConversionResult = currencyConversionResult;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails currencyConversionResult(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult currencyConversionResult) {
    this.currencyConversionResult = currencyConversionResult;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return cumulativeAmount
  **/
  @JsonProperty("CumulativeAmount")
  @NotNull
  public Object getCumulativeAmount() {
    return cumulativeAmount;
  }

  public void setCumulativeAmount(Object cumulativeAmount) {
    this.cumulativeAmount = cumulativeAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails cumulativeAmount(Object cumulativeAmount) {
    this.cumulativeAmount = cumulativeAmount;
    return this;
  }

 /**
   * Number of objects represented as a positive integer.&lt;br/&gt;
   * @return completionSequenceCounter
  **/
  @JsonProperty("CompletionSequenceCounter")
  @NotNull
  public Object getCompletionSequenceCounter() {
    return completionSequenceCounter;
  }

  public void setCompletionSequenceCounter(Object completionSequenceCounter) {
    this.completionSequenceCounter = completionSequenceCounter;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails completionSequenceCounter(Object completionSequenceCounter) {
    this.completionSequenceCounter = completionSequenceCounter;
    return this;
  }

 /**
   * Number of objects represented as a positive integer.&lt;br/&gt;
   * @return completionSequenceNumber
  **/
  @JsonProperty("CompletionSequenceNumber")
  @NotNull
  public Object getCompletionSequenceNumber() {
    return completionSequenceNumber;
  }

  public void setCompletionSequenceNumber(Object completionSequenceNumber) {
    this.completionSequenceNumber = completionSequenceNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails completionSequenceNumber(Object completionSequenceNumber) {
    this.completionSequenceNumber = completionSequenceNumber;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return deliveryLocation
  **/
  @JsonProperty("DeliveryLocation")
  @NotNull
  public Object getDeliveryLocation() {
    return deliveryLocation;
  }

  public void setDeliveryLocation(Object deliveryLocation) {
    this.deliveryLocation = deliveryLocation;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails deliveryLocation(Object deliveryLocation) {
    this.deliveryLocation = deliveryLocation;
    return this;
  }

 /**
   * Get detailedAmount
   * @return detailedAmount
  **/
  @JsonProperty("DetailedAmount")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount getDetailedAmount() {
    return detailedAmount;
  }

  public void setDetailedAmount(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount detailedAmount) {
    this.detailedAmount = detailedAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails detailedAmount(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount detailedAmount) {
    this.detailedAmount = detailedAmount;
    return this;
  }

 /**
   * Specifies a binary string with a maximum length of 10000 binary bytes.&lt;br/&gt;
   * @return icCRelatedData
  **/
  @JsonProperty("ICCRelatedData")
  @NotNull
  public Object getIcCRelatedData() {
    return icCRelatedData;
  }

  public void setIcCRelatedData(Object icCRelatedData) {
    this.icCRelatedData = icCRelatedData;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails icCRelatedData(Object icCRelatedData) {
    this.icCRelatedData = icCRelatedData;
    return this;
  }

 /**
   * Data related to a financial loan (instalment).
   * @return instalment
  **/
  @JsonProperty("Instalment")
  @NotNull
  public Object getInstalment() {
    return instalment;
  }

  public void setInstalment(Object instalment) {
    this.instalment = instalment;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails instalment(Object instalment) {
    this.instalment = instalment;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return invoiceAmount
  **/
  @JsonProperty("InvoiceAmount")
  @NotNull
  public Object getInvoiceAmount() {
    return invoiceAmount;
  }

  public void setInvoiceAmount(Object invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails invoiceAmount(Object invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
    return this;
  }

 /**
   * Reason to process an online authorisation.
   * @return onLineReason
  **/
  @JsonProperty("OnLineReason")
  @NotNull
  public Object getOnLineReason() {
    return onLineReason;
  }

  public void setOnLineReason(Object onLineReason) {
    this.onLineReason = onLineReason;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails onLineReason(Object onLineReason) {
    this.onLineReason = onLineReason;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 10 characters.&lt;br/&gt;
   * @return productCodeSetIdentification
  **/
  @JsonProperty("ProductCodeSetIdentification")
  @NotNull
  public Object getProductCodeSetIdentification() {
    return productCodeSetIdentification;
  }

  public void setProductCodeSetIdentification(Object productCodeSetIdentification) {
    this.productCodeSetIdentification = productCodeSetIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails productCodeSetIdentification(Object productCodeSetIdentification) {
    this.productCodeSetIdentification = productCodeSetIdentification;
    return this;
  }

 /**
   * Get recurring
   * @return recurring
  **/
  @JsonProperty("Recurring")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring getRecurring() {
    return recurring;
  }

  public void setRecurring(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring recurring) {
    this.recurring = recurring;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails recurring(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring recurring) {
    this.recurring = recurring;
    return this;
  }

 /**
   * Number of objects represented as a positive integer.&lt;br/&gt;
   * @return reSubmissionCounter
  **/
  @JsonProperty("ReSubmissionCounter")
  @NotNull
  public Object getReSubmissionCounter() {
    return reSubmissionCounter;
  }

  public void setReSubmissionCounter(Object reSubmissionCounter) {
    this.reSubmissionCounter = reSubmissionCounter;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails reSubmissionCounter(Object reSubmissionCounter) {
    this.reSubmissionCounter = reSubmissionCounter;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return requestedAmount
  **/
  @JsonProperty("RequestedAmount")
  @NotNull
  public Object getRequestedAmount() {
    return requestedAmount;
  }

  public void setRequestedAmount(Object requestedAmount) {
    this.requestedAmount = requestedAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails requestedAmount(Object requestedAmount) {
    this.requestedAmount = requestedAmount;
    return this;
  }

 /**
   * Item purchased with the transaction.
   * @return saleItem
  **/
  @JsonProperty("SaleItem")
  @NotNull
  public Object getSaleItem() {
    return saleItem;
  }

  public void setSaleItem(Object saleItem) {
    this.saleItem = saleItem;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails saleItem(Object saleItem) {
    this.saleItem = saleItem;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return totalAmount
  **/
  @JsonProperty("TotalAmount")
  @NotNull
  public Object getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Object totalAmount) {
    this.totalAmount = totalAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails totalAmount(Object totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return totalAuthorisedAmount
  **/
  @JsonProperty("TotalAuthorisedAmount")
  @NotNull
  public Object getTotalAuthorisedAmount() {
    return totalAuthorisedAmount;
  }

  public void setTotalAuthorisedAmount(Object totalAuthorisedAmount) {
    this.totalAuthorisedAmount = totalAuthorisedAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails totalAuthorisedAmount(Object totalAuthorisedAmount) {
    this.totalAuthorisedAmount = totalAuthorisedAmount;
    return this;
  }

 /**
   * Specifies a numeric string with a maximum length of 35 digits.&lt;br/&gt;
   * @return unattendedLevelCategory
  **/
  @JsonProperty("UnattendedLevelCategory")
  @NotNull
  public Object getUnattendedLevelCategory() {
    return unattendedLevelCategory;
  }

  public void setUnattendedLevelCategory(Object unattendedLevelCategory) {
    this.unattendedLevelCategory = unattendedLevelCategory;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails unattendedLevelCategory(Object unattendedLevelCategory) {
    this.unattendedLevelCategory = unattendedLevelCategory;
    return this;
  }

 /**
   * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \&quot;XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\&quot; which is aligned with ISO 8601.&lt;br/&gt;
   * @return validityDate
  **/
  @JsonProperty("ValidityDate")
  @NotNull
  public Object getValidityDate() {
    return validityDate;
  }

  public void setValidityDate(Object validityDate) {
    this.validityDate = validityDate;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails validityDate(Object validityDate) {
    this.validityDate = validityDate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails {\n");
    
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    aggregationTransaction: ").append(toIndentedString(aggregationTransaction)).append("\n");
    sb.append("    amountQualifier: ").append(toIndentedString(amountQualifier)).append("\n");
    sb.append("    authorisedAmount: ").append(toIndentedString(authorisedAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currencyConversionResult: ").append(toIndentedString(currencyConversionResult)).append("\n");
    sb.append("    cumulativeAmount: ").append(toIndentedString(cumulativeAmount)).append("\n");
    sb.append("    completionSequenceCounter: ").append(toIndentedString(completionSequenceCounter)).append("\n");
    sb.append("    completionSequenceNumber: ").append(toIndentedString(completionSequenceNumber)).append("\n");
    sb.append("    deliveryLocation: ").append(toIndentedString(deliveryLocation)).append("\n");
    sb.append("    detailedAmount: ").append(toIndentedString(detailedAmount)).append("\n");
    sb.append("    icCRelatedData: ").append(toIndentedString(icCRelatedData)).append("\n");
    sb.append("    instalment: ").append(toIndentedString(instalment)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
    sb.append("    onLineReason: ").append(toIndentedString(onLineReason)).append("\n");
    sb.append("    productCodeSetIdentification: ").append(toIndentedString(productCodeSetIdentification)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    reSubmissionCounter: ").append(toIndentedString(reSubmissionCounter)).append("\n");
    sb.append("    requestedAmount: ").append(toIndentedString(requestedAmount)).append("\n");
    sb.append("    saleItem: ").append(toIndentedString(saleItem)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalAuthorisedAmount: ").append(toIndentedString(totalAuthorisedAmount)).append("\n");
    sb.append("    unattendedLevelCategory: ").append(toIndentedString(unattendedLevelCategory)).append("\n");
    sb.append("    validityDate: ").append(toIndentedString(validityDate)).append("\n");
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
