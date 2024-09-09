package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details of the transaction in the authorisation request in a batch.&lt;br/&gt;
 */
@Schema(description = "Details of the transaction in the authorisation request in a batch.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails   {
  @JsonProperty("AccountType")
  private Object accountType = null;

  @JsonProperty("AdditionalInformation")
  private Object additionalInformation = null;

  @JsonProperty("AggregationTransaction")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction aggregationTransaction = null;

  @JsonProperty("AmountQualifier")
  private Object amountQualifier = null;

  @JsonProperty("AuthorisedAmount")
  private Object authorisedAmount = null;

  @JsonProperty("Currency")
  private Object currency = null;

  @JsonProperty("CurrencyConversionResult")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult currencyConversionResult = null;

  @JsonProperty("CumulativeAmount")
  private Object cumulativeAmount = null;

  @JsonProperty("CompletionSequenceCounter")
  private Object completionSequenceCounter = null;

  @JsonProperty("CompletionSequenceNumber")
  private Object completionSequenceNumber = null;

  @JsonProperty("DeliveryLocation")
  private Object deliveryLocation = null;

  @JsonProperty("DetailedAmount")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount detailedAmount = null;

  @JsonProperty("ICCRelatedData")
  private Object icCRelatedData = null;

  @JsonProperty("Instalment")
  private Object instalment = null;

  @JsonProperty("InvoiceAmount")
  private Object invoiceAmount = null;

  @JsonProperty("OnLineReason")
  private Object onLineReason = null;

  @JsonProperty("ProductCodeSetIdentification")
  private Object productCodeSetIdentification = null;

  @JsonProperty("Recurring")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring recurring = null;

  @JsonProperty("ReSubmissionCounter")
  private Object reSubmissionCounter = null;

  @JsonProperty("RequestedAmount")
  private Object requestedAmount = null;

  @JsonProperty("SaleItem")
  private Object saleItem = null;

  @JsonProperty("TotalAmount")
  private Object totalAmount = null;

  @JsonProperty("TotalAuthorisedAmount")
  private Object totalAuthorisedAmount = null;

  @JsonProperty("UnattendedLevelCategory")
  private Object unattendedLevelCategory = null;

  @JsonProperty("ValidityDate")
  private Object validityDate = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails accountType(Object accountType) {
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

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails additionalInformation(Object additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  /**
   * Additional information related to the transaction like an Invoice or IndustryData (for example  hospitality, lodging, transportation).
   * @return additionalInformation
   **/
  @Schema(description = "Additional information related to the transaction like an Invoice or IndustryData (for example  hospitality, lodging, transportation).")
      @NotNull

    public Object getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(Object additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails aggregationTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction aggregationTransaction) {
    this.aggregationTransaction = aggregationTransaction;
    return this;
  }

  /**
   * Get aggregationTransaction
   * @return aggregationTransaction
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction getAggregationTransaction() {
    return aggregationTransaction;
  }

  public void setAggregationTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction aggregationTransaction) {
    this.aggregationTransaction = aggregationTransaction;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails amountQualifier(Object amountQualifier) {
    this.amountQualifier = amountQualifier;
    return this;
  }

  /**
   * Qualifies the amount associated with the transaction.<br/>- **ACTL: Actual**  : *Actual amount.*<br/>- **ESTM: Estimated**  : *Estimated amount (the final amount could be above or below).*<br/>- **MAXI: Maximum**  : *Maximum amount (the final amount must be less or equal).*<br/>- **DFLT: Default**  : *Default amount.*<br/>- **RPLT: Replacement**  : *Replacement amount.*<br/>- **INCR: Incremental**  : *Incremental amount for reservation.*<br/>- **DECR: Decremental**  : *Decremental amount for reservation.*<br/>- **RESD: Reserved**  : *Reserved or updated reserved amount for reservation.*<br/>
   * @return amountQualifier
   **/
  @Schema(example = "ACTL", description = "Qualifies the amount associated with the transaction.<br/>- **ACTL: Actual**  : *Actual amount.*<br/>- **ESTM: Estimated**  : *Estimated amount (the final amount could be above or below).*<br/>- **MAXI: Maximum**  : *Maximum amount (the final amount must be less or equal).*<br/>- **DFLT: Default**  : *Default amount.*<br/>- **RPLT: Replacement**  : *Replacement amount.*<br/>- **INCR: Incremental**  : *Incremental amount for reservation.*<br/>- **DECR: Decremental**  : *Decremental amount for reservation.*<br/>- **RESD: Reserved**  : *Reserved or updated reserved amount for reservation.*<br/>")
      @NotNull

    public Object getAmountQualifier() {
    return amountQualifier;
  }

  public void setAmountQualifier(Object amountQualifier) {
    this.amountQualifier = amountQualifier;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails authorisedAmount(Object authorisedAmount) {
    this.authorisedAmount = authorisedAmount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return authorisedAmount
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getAuthorisedAmount() {
    return authorisedAmount;
  }

  public void setAuthorisedAmount(Object authorisedAmount) {
    this.authorisedAmount = authorisedAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails currency(Object currency) {
    this.currency = currency;
    return this;
  }

  /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>
   * @return currency
   **/
  @Schema(example = "EUR", description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>")
      @NotNull

    public Object getCurrency() {
    return currency;
  }

  public void setCurrency(Object currency) {
    this.currency = currency;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails currencyConversionResult(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult currencyConversionResult) {
    this.currencyConversionResult = currencyConversionResult;
    return this;
  }

  /**
   * Get currencyConversionResult
   * @return currencyConversionResult
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult getCurrencyConversionResult() {
    return currencyConversionResult;
  }

  public void setCurrencyConversionResult(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult currencyConversionResult) {
    this.currencyConversionResult = currencyConversionResult;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails cumulativeAmount(Object cumulativeAmount) {
    this.cumulativeAmount = cumulativeAmount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return cumulativeAmount
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getCumulativeAmount() {
    return cumulativeAmount;
  }

  public void setCumulativeAmount(Object cumulativeAmount) {
    this.cumulativeAmount = cumulativeAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails completionSequenceCounter(Object completionSequenceCounter) {
    this.completionSequenceCounter = completionSequenceCounter;
    return this;
  }

  /**
   * Number of objects represented as a positive integer.<br/>
   * @return completionSequenceCounter
   **/
  @Schema(example = "123456789012345678", description = "Number of objects represented as a positive integer.<br/>")
      @NotNull

    public Object getCompletionSequenceCounter() {
    return completionSequenceCounter;
  }

  public void setCompletionSequenceCounter(Object completionSequenceCounter) {
    this.completionSequenceCounter = completionSequenceCounter;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails completionSequenceNumber(Object completionSequenceNumber) {
    this.completionSequenceNumber = completionSequenceNumber;
    return this;
  }

  /**
   * Number of objects represented as a positive integer.<br/>
   * @return completionSequenceNumber
   **/
  @Schema(example = "123456789012345678", description = "Number of objects represented as a positive integer.<br/>")
      @NotNull

    public Object getCompletionSequenceNumber() {
    return completionSequenceNumber;
  }

  public void setCompletionSequenceNumber(Object completionSequenceNumber) {
    this.completionSequenceNumber = completionSequenceNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails deliveryLocation(Object deliveryLocation) {
    this.deliveryLocation = deliveryLocation;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return deliveryLocation
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getDeliveryLocation() {
    return deliveryLocation;
  }

  public void setDeliveryLocation(Object deliveryLocation) {
    this.deliveryLocation = deliveryLocation;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails detailedAmount(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount detailedAmount) {
    this.detailedAmount = detailedAmount;
    return this;
  }

  /**
   * Get detailedAmount
   * @return detailedAmount
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount getDetailedAmount() {
    return detailedAmount;
  }

  public void setDetailedAmount(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsDetailedAmount detailedAmount) {
    this.detailedAmount = detailedAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails icCRelatedData(Object icCRelatedData) {
    this.icCRelatedData = icCRelatedData;
    return this;
  }

  /**
   * Specifies a binary string with a maximum length of 10000 binary bytes.<br/>
   * @return icCRelatedData
   **/
  @Schema(description = "Specifies a binary string with a maximum length of 10000 binary bytes.<br/>")
      @NotNull

    public Object getIcCRelatedData() {
    return icCRelatedData;
  }

  public void setIcCRelatedData(Object icCRelatedData) {
    this.icCRelatedData = icCRelatedData;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails instalment(Object instalment) {
    this.instalment = instalment;
    return this;
  }

  /**
   * Data related to a financial loan (instalment).
   * @return instalment
   **/
  @Schema(description = "Data related to a financial loan (instalment).")
      @NotNull

    public Object getInstalment() {
    return instalment;
  }

  public void setInstalment(Object instalment) {
    this.instalment = instalment;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails invoiceAmount(Object invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return invoiceAmount
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getInvoiceAmount() {
    return invoiceAmount;
  }

  public void setInvoiceAmount(Object invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails onLineReason(Object onLineReason) {
    this.onLineReason = onLineReason;
    return this;
  }

  /**
   * Reason to process an online authorisation.
   * @return onLineReason
   **/
  @Schema(description = "Reason to process an online authorisation.")
      @NotNull

    public Object getOnLineReason() {
    return onLineReason;
  }

  public void setOnLineReason(Object onLineReason) {
    this.onLineReason = onLineReason;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails productCodeSetIdentification(Object productCodeSetIdentification) {
    this.productCodeSetIdentification = productCodeSetIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 10 characters.<br/>
   * @return productCodeSetIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 10 characters.<br/>")
      @NotNull

    public Object getProductCodeSetIdentification() {
    return productCodeSetIdentification;
  }

  public void setProductCodeSetIdentification(Object productCodeSetIdentification) {
    this.productCodeSetIdentification = productCodeSetIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails recurring(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring recurring) {
    this.recurring = recurring;
    return this;
  }

  /**
   * Get recurring
   * @return recurring
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring getRecurring() {
    return recurring;
  }

  public void setRecurring(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring recurring) {
    this.recurring = recurring;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails reSubmissionCounter(Object reSubmissionCounter) {
    this.reSubmissionCounter = reSubmissionCounter;
    return this;
  }

  /**
   * Number of objects represented as a positive integer.<br/>
   * @return reSubmissionCounter
   **/
  @Schema(example = "123456789012345678", description = "Number of objects represented as a positive integer.<br/>")
      @NotNull

    public Object getReSubmissionCounter() {
    return reSubmissionCounter;
  }

  public void setReSubmissionCounter(Object reSubmissionCounter) {
    this.reSubmissionCounter = reSubmissionCounter;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails requestedAmount(Object requestedAmount) {
    this.requestedAmount = requestedAmount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return requestedAmount
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getRequestedAmount() {
    return requestedAmount;
  }

  public void setRequestedAmount(Object requestedAmount) {
    this.requestedAmount = requestedAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails saleItem(Object saleItem) {
    this.saleItem = saleItem;
    return this;
  }

  /**
   * Item purchased with the transaction.
   * @return saleItem
   **/
  @Schema(description = "Item purchased with the transaction.")
      @NotNull

    public Object getSaleItem() {
    return saleItem;
  }

  public void setSaleItem(Object saleItem) {
    this.saleItem = saleItem;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails totalAmount(Object totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return totalAmount
   **/
  @Schema(example = "500000", required = true, description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Object totalAmount) {
    this.totalAmount = totalAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails totalAuthorisedAmount(Object totalAuthorisedAmount) {
    this.totalAuthorisedAmount = totalAuthorisedAmount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return totalAuthorisedAmount
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getTotalAuthorisedAmount() {
    return totalAuthorisedAmount;
  }

  public void setTotalAuthorisedAmount(Object totalAuthorisedAmount) {
    this.totalAuthorisedAmount = totalAuthorisedAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails unattendedLevelCategory(Object unattendedLevelCategory) {
    this.unattendedLevelCategory = unattendedLevelCategory;
    return this;
  }

  /**
   * Specifies a numeric string with a maximum length of 35 digits.<br/>
   * @return unattendedLevelCategory
   **/
  @Schema(description = "Specifies a numeric string with a maximum length of 35 digits.<br/>")
      @NotNull

    public Object getUnattendedLevelCategory() {
    return unattendedLevelCategory;
  }

  public void setUnattendedLevelCategory(Object unattendedLevelCategory) {
    this.unattendedLevelCategory = unattendedLevelCategory;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails validityDate(Object validityDate) {
    this.validityDate = validityDate;
    return this;
  }

  /**
   * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.<br/>
   * @return validityDate
   **/
  @Schema(description = "A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.<br/>")
      @NotNull

    public Object getValidityDate() {
    return validityDate;
  }

  public void setValidityDate(Object validityDate) {
    this.validityDate = validityDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails = (PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails) o;
    return Objects.equals(this.accountType, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.accountType) &&
        Objects.equals(this.additionalInformation, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.additionalInformation) &&
        Objects.equals(this.aggregationTransaction, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.aggregationTransaction) &&
        Objects.equals(this.amountQualifier, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.amountQualifier) &&
        Objects.equals(this.authorisedAmount, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.authorisedAmount) &&
        Objects.equals(this.currency, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.currency) &&
        Objects.equals(this.currencyConversionResult, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.currencyConversionResult) &&
        Objects.equals(this.cumulativeAmount, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.cumulativeAmount) &&
        Objects.equals(this.completionSequenceCounter, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.completionSequenceCounter) &&
        Objects.equals(this.completionSequenceNumber, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.completionSequenceNumber) &&
        Objects.equals(this.deliveryLocation, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.deliveryLocation) &&
        Objects.equals(this.detailedAmount, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.detailedAmount) &&
        Objects.equals(this.icCRelatedData, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.icCRelatedData) &&
        Objects.equals(this.instalment, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.instalment) &&
        Objects.equals(this.invoiceAmount, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.invoiceAmount) &&
        Objects.equals(this.onLineReason, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.onLineReason) &&
        Objects.equals(this.productCodeSetIdentification, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.productCodeSetIdentification) &&
        Objects.equals(this.recurring, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.recurring) &&
        Objects.equals(this.reSubmissionCounter, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.reSubmissionCounter) &&
        Objects.equals(this.requestedAmount, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.requestedAmount) &&
        Objects.equals(this.saleItem, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.saleItem) &&
        Objects.equals(this.totalAmount, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.totalAmount) &&
        Objects.equals(this.totalAuthorisedAmount, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.totalAuthorisedAmount) &&
        Objects.equals(this.unattendedLevelCategory, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.unattendedLevelCategory) &&
        Objects.equals(this.validityDate, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails.validityDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, additionalInformation, aggregationTransaction, amountQualifier, authorisedAmount, currency, currencyConversionResult, cumulativeAmount, completionSequenceCounter, completionSequenceNumber, deliveryLocation, detailedAmount, icCRelatedData, instalment, invoiceAmount, onLineReason, productCodeSetIdentification, recurring, reSubmissionCounter, requestedAmount, saleItem, totalAmount, totalAuthorisedAmount, unattendedLevelCategory, validityDate);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
