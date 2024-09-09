package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data associated with the transaction for a potential currency conversion.&lt;br/&gt;
 */
@Schema(description = "Data associated with the transaction for a potential currency conversion.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction   {
  @JsonProperty("AdditionalService")
  private Object additionalService = null;

  @JsonProperty("AdditionalTransactionData")
  private Object additionalTransactionData = null;

  @JsonProperty("AuthorisationResult")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult authorisationResult = null;

  @JsonProperty("CardProgrammeApplied")
  private Object cardProgrammeApplied = null;

  @JsonProperty("CardProgrammeProposed")
  private Object cardProgrammeProposed = null;

  @JsonProperty("CustomerConsent")
  private Object customerConsent = null;

  @JsonProperty("CustomerOrder")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder = null;

  @JsonProperty("CustomerToken")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken customerToken = null;

  @JsonProperty("IssuerCITIdentification")
  private Object issuerCITIdentification = null;

  @JsonProperty("IssuerReferenceData")
  private Object issuerReferenceData = null;

  @JsonProperty("LastTransactionFlag")
  private Object lastTransactionFlag = null;

  @JsonProperty("MerchantCITIdentification")
  private Object merchantCITIdentification = null;

  @JsonProperty("MerchantCategoryCode")
  private Object merchantCategoryCode = null;

  @JsonProperty("MerchantReferenceData")
  private Object merchantReferenceData = null;

  @JsonProperty("OriginalTransaction")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction originalTransaction = null;

  @JsonProperty("ReconciliationIdentification")
  private Object reconciliationIdentification = null;

  @JsonProperty("SaleReferenceIdentification")
  private Object saleReferenceIdentification = null;

  @JsonProperty("SaleToAcquirerData")
  private Object saleToAcquirerData = null;

  @JsonProperty("SaleToIssuerData")
  private Object saleToIssuerData = null;

  @JsonProperty("SaleToPOIData")
  private Object saleToPOIData = null;

  @JsonProperty("ServiceAttribute")
  private Object serviceAttribute = null;

  @JsonProperty("TransactionCapture")
  private Object transactionCapture = null;

  @JsonProperty("TransactionDetails")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails transactionDetails = null;

  @JsonProperty("TransactionIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification transactionIdentification = null;

  @JsonProperty("TransactionType")
  private Object transactionType = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction additionalService(Object additionalService) {
    this.additionalService = additionalService;
    return this;
  }

  /**
   * Service in addition to the main service.
   * @return additionalService
   **/
  @Schema(description = "Service in addition to the main service.")
      @NotNull

    public Object getAdditionalService() {
    return additionalService;
  }

  public void setAdditionalService(Object additionalService) {
    this.additionalService = additionalService;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction additionalTransactionData(Object additionalTransactionData) {
    this.additionalTransactionData = additionalTransactionData;
    return this;
  }

  /**
   * Additional information related to the transaction.
   * @return additionalTransactionData
   **/
  @Schema(description = "Additional information related to the transaction.")
      @NotNull

    public Object getAdditionalTransactionData() {
    return additionalTransactionData;
  }

  public void setAdditionalTransactionData(Object additionalTransactionData) {
    this.additionalTransactionData = additionalTransactionData;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction authorisationResult(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult authorisationResult) {
    this.authorisationResult = authorisationResult;
    return this;
  }

  /**
   * Get authorisationResult
   * @return authorisationResult
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult getAuthorisationResult() {
    return authorisationResult;
  }

  public void setAuthorisationResult(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult authorisationResult) {
    this.authorisationResult = authorisationResult;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction cardProgrammeApplied(Object cardProgrammeApplied) {
    this.cardProgrammeApplied = cardProgrammeApplied;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return cardProgrammeApplied
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getCardProgrammeApplied() {
    return cardProgrammeApplied;
  }

  public void setCardProgrammeApplied(Object cardProgrammeApplied) {
    this.cardProgrammeApplied = cardProgrammeApplied;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction cardProgrammeProposed(Object cardProgrammeProposed) {
    this.cardProgrammeProposed = cardProgrammeProposed;
    return this;
  }

  /**
   * Specifies the card program proposed by a retailer to a cardholder among a series of payment programmes offered by the retailer.
   * @return cardProgrammeProposed
   **/
  @Schema(description = "Specifies the card program proposed by a retailer to a cardholder among a series of payment programmes offered by the retailer.")
      @NotNull

    public Object getCardProgrammeProposed() {
    return cardProgrammeProposed;
  }

  public void setCardProgrammeProposed(Object cardProgrammeProposed) {
    this.cardProgrammeProposed = cardProgrammeProposed;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction customerConsent(Object customerConsent) {
    this.customerConsent = customerConsent;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return customerConsent
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getCustomerConsent() {
    return customerConsent;
  }

  public void setCustomerConsent(Object customerConsent) {
    this.customerConsent = customerConsent;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction customerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
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

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction customerToken(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken customerToken) {
    this.customerToken = customerToken;
    return this;
  }

  /**
   * Get customerToken
   * @return customerToken
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken getCustomerToken() {
    return customerToken;
  }

  public void setCustomerToken(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken customerToken) {
    this.customerToken = customerToken;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction issuerCITIdentification(Object issuerCITIdentification) {
    this.issuerCITIdentification = issuerCITIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 140 characters.<br/>
   * @return issuerCITIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
      @NotNull

    public Object getIssuerCITIdentification() {
    return issuerCITIdentification;
  }

  public void setIssuerCITIdentification(Object issuerCITIdentification) {
    this.issuerCITIdentification = issuerCITIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction issuerReferenceData(Object issuerReferenceData) {
    this.issuerReferenceData = issuerReferenceData;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 140 characters.<br/>
   * @return issuerReferenceData
   **/
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
      @NotNull

    public Object getIssuerReferenceData() {
    return issuerReferenceData;
  }

  public void setIssuerReferenceData(Object issuerReferenceData) {
    this.issuerReferenceData = issuerReferenceData;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction lastTransactionFlag(Object lastTransactionFlag) {
    this.lastTransactionFlag = lastTransactionFlag;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return lastTransactionFlag
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getLastTransactionFlag() {
    return lastTransactionFlag;
  }

  public void setLastTransactionFlag(Object lastTransactionFlag) {
    this.lastTransactionFlag = lastTransactionFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction merchantCITIdentification(Object merchantCITIdentification) {
    this.merchantCITIdentification = merchantCITIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 140 characters.<br/>
   * @return merchantCITIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
      @NotNull

    public Object getMerchantCITIdentification() {
    return merchantCITIdentification;
  }

  public void setMerchantCITIdentification(Object merchantCITIdentification) {
    this.merchantCITIdentification = merchantCITIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction merchantCategoryCode(Object merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  /**
   * Specifies a character string with a minimum length of 3 characters, and a maximum length of 4 characters.<br/>
   * @return merchantCategoryCode
   **/
  @Schema(description = "Specifies a character string with a minimum length of 3 characters, and a maximum length of 4 characters.<br/>")
      @NotNull

    public Object getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(Object merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction merchantReferenceData(Object merchantReferenceData) {
    this.merchantReferenceData = merchantReferenceData;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return merchantReferenceData
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getMerchantReferenceData() {
    return merchantReferenceData;
  }

  public void setMerchantReferenceData(Object merchantReferenceData) {
    this.merchantReferenceData = merchantReferenceData;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction originalTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction originalTransaction) {
    this.originalTransaction = originalTransaction;
    return this;
  }

  /**
   * Get originalTransaction
   * @return originalTransaction
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction getOriginalTransaction() {
    return originalTransaction;
  }

  public void setOriginalTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction originalTransaction) {
    this.originalTransaction = originalTransaction;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction reconciliationIdentification(Object reconciliationIdentification) {
    this.reconciliationIdentification = reconciliationIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return reconciliationIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getReconciliationIdentification() {
    return reconciliationIdentification;
  }

  public void setReconciliationIdentification(Object reconciliationIdentification) {
    this.reconciliationIdentification = reconciliationIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction saleReferenceIdentification(Object saleReferenceIdentification) {
    this.saleReferenceIdentification = saleReferenceIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return saleReferenceIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getSaleReferenceIdentification() {
    return saleReferenceIdentification;
  }

  public void setSaleReferenceIdentification(Object saleReferenceIdentification) {
    this.saleReferenceIdentification = saleReferenceIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction saleToAcquirerData(Object saleToAcquirerData) {
    this.saleToAcquirerData = saleToAcquirerData;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return saleToAcquirerData
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getSaleToAcquirerData() {
    return saleToAcquirerData;
  }

  public void setSaleToAcquirerData(Object saleToAcquirerData) {
    this.saleToAcquirerData = saleToAcquirerData;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction saleToIssuerData(Object saleToIssuerData) {
    this.saleToIssuerData = saleToIssuerData;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return saleToIssuerData
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getSaleToIssuerData() {
    return saleToIssuerData;
  }

  public void setSaleToIssuerData(Object saleToIssuerData) {
    this.saleToIssuerData = saleToIssuerData;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction saleToPOIData(Object saleToPOIData) {
    this.saleToPOIData = saleToPOIData;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return saleToPOIData
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getSaleToPOIData() {
    return saleToPOIData;
  }

  public void setSaleToPOIData(Object saleToPOIData) {
    this.saleToPOIData = saleToPOIData;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction serviceAttribute(Object serviceAttribute) {
    this.serviceAttribute = serviceAttribute;
    return this;
  }

  /**
   * Additional attributes of the service provided by the card payment transaction.<br/>- **IRES: InitialReservation**  : *Initial reservation.*<br/>- **URES: UpdateReservation**  : *Update reservation.*<br/>- **PRES: PaymentReservation**  : *Payment after reservation.*<br/>- **ARES: AdditionalPayment**  : *Additional payment after reservation.*<br/>- **FREC: FirstRecurring**  : *Initial recurring payment.*<br/>- **RREC: FollowingRecurring**  : *Repeat recurring payment.*<br/>- **GOPT: GuaranteeOfPayment**  : *Acceptor claims for guarantee of payment.*<br/>
   * @return serviceAttribute
   **/
  @Schema(example = "IRES", description = "Additional attributes of the service provided by the card payment transaction.<br/>- **IRES: InitialReservation**  : *Initial reservation.*<br/>- **URES: UpdateReservation**  : *Update reservation.*<br/>- **PRES: PaymentReservation**  : *Payment after reservation.*<br/>- **ARES: AdditionalPayment**  : *Additional payment after reservation.*<br/>- **FREC: FirstRecurring**  : *Initial recurring payment.*<br/>- **RREC: FollowingRecurring**  : *Repeat recurring payment.*<br/>- **GOPT: GuaranteeOfPayment**  : *Acceptor claims for guarantee of payment.*<br/>")
      @NotNull

    public Object getServiceAttribute() {
    return serviceAttribute;
  }

  public void setServiceAttribute(Object serviceAttribute) {
    this.serviceAttribute = serviceAttribute;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction transactionCapture(Object transactionCapture) {
    this.transactionCapture = transactionCapture;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return transactionCapture
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getTransactionCapture() {
    return transactionCapture;
  }

  public void setTransactionCapture(Object transactionCapture) {
    this.transactionCapture = transactionCapture;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction transactionDetails(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails transactionDetails) {
    this.transactionDetails = transactionDetails;
    return this;
  }

  /**
   * Get transactionDetails
   * @return transactionDetails
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails getTransactionDetails() {
    return transactionDetails;
  }

  public void setTransactionDetails(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails transactionDetails) {
    this.transactionDetails = transactionDetails;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction transactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
    return this;
  }

  /**
   * Get transactionIdentification
   * @return transactionIdentification
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getTransactionIdentification() {
    return transactionIdentification;
  }

  public void setTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction transactionType(Object transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Main service provided during the card payment transaction.<br/>- **BALC: Balance**  : *Balance enquiry.*<br/>- **CACT: CardActivation**  : *Card activation.*<br/>- **CRDP: CardPayment**  : *Card payment.*<br/>- **CAFH: CardsFundTransferPush**  : *Transfer of funds to a card or an account.*<br/>- **CAVR: CardVerification**  : *Card verification.*<br/>- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*<br/>- **CSHD: CashDeposit**  : *Cash deposit.*<br/>- **DEFR: DeferredPayment**  : *Deferred payment.*<br/>- **LOAD: Loading**  : *Loading or reloading non-financial account.*<br/>- **ORCR: OriginalCredit**  : *Original credit.*<br/>- **PINC: PINChange**  : *PIN (Personal Identification Number) change.*<br/>- **QUCH: QuasiCash**  : *Quasi-cash.*<br/>- **RFND: Refund**  : *Refund transaction.*<br/>- **RESA: Reservation**  : *Reservation (pre-authorisation).*<br/>- **VALC: ValidityCheck**  : *Card validity check.*<br/>- **UNLD: Unloading**  : *Unloading non-financial account.*<br/>- **CAFT: CardsFundTransfer**  : *Transfer of funds to and/or from a card account.*<br/>- **CAFL: CardsFundTransferPull**  : *Transfer of funds from a card or an account.*<br/>
   * @return transactionType
   **/
  @Schema(example = "CRDP", required = true, description = "Main service provided during the card payment transaction.<br/>- **BALC: Balance**  : *Balance enquiry.*<br/>- **CACT: CardActivation**  : *Card activation.*<br/>- **CRDP: CardPayment**  : *Card payment.*<br/>- **CAFH: CardsFundTransferPush**  : *Transfer of funds to a card or an account.*<br/>- **CAVR: CardVerification**  : *Card verification.*<br/>- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*<br/>- **CSHD: CashDeposit**  : *Cash deposit.*<br/>- **DEFR: DeferredPayment**  : *Deferred payment.*<br/>- **LOAD: Loading**  : *Loading or reloading non-financial account.*<br/>- **ORCR: OriginalCredit**  : *Original credit.*<br/>- **PINC: PINChange**  : *PIN (Personal Identification Number) change.*<br/>- **QUCH: QuasiCash**  : *Quasi-cash.*<br/>- **RFND: Refund**  : *Refund transaction.*<br/>- **RESA: Reservation**  : *Reservation (pre-authorisation).*<br/>- **VALC: ValidityCheck**  : *Card validity check.*<br/>- **UNLD: Unloading**  : *Unloading non-financial account.*<br/>- **CAFT: CardsFundTransfer**  : *Transfer of funds to and/or from a card account.*<br/>- **CAFL: CardsFundTransferPull**  : *Transfer of funds from a card or an account.*<br/>")
      @NotNull

    public Object getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(Object transactionType) {
    this.transactionType = transactionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction = (PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction) o;
    return Objects.equals(this.additionalService, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.additionalService) &&
        Objects.equals(this.additionalTransactionData, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.additionalTransactionData) &&
        Objects.equals(this.authorisationResult, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.authorisationResult) &&
        Objects.equals(this.cardProgrammeApplied, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.cardProgrammeApplied) &&
        Objects.equals(this.cardProgrammeProposed, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.cardProgrammeProposed) &&
        Objects.equals(this.customerConsent, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.customerConsent) &&
        Objects.equals(this.customerOrder, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.customerOrder) &&
        Objects.equals(this.customerToken, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.customerToken) &&
        Objects.equals(this.issuerCITIdentification, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.issuerCITIdentification) &&
        Objects.equals(this.issuerReferenceData, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.issuerReferenceData) &&
        Objects.equals(this.lastTransactionFlag, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.lastTransactionFlag) &&
        Objects.equals(this.merchantCITIdentification, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.merchantCITIdentification) &&
        Objects.equals(this.merchantCategoryCode, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.merchantCategoryCode) &&
        Objects.equals(this.merchantReferenceData, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.merchantReferenceData) &&
        Objects.equals(this.originalTransaction, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.originalTransaction) &&
        Objects.equals(this.reconciliationIdentification, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.reconciliationIdentification) &&
        Objects.equals(this.saleReferenceIdentification, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.saleReferenceIdentification) &&
        Objects.equals(this.saleToAcquirerData, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.saleToAcquirerData) &&
        Objects.equals(this.saleToIssuerData, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.saleToIssuerData) &&
        Objects.equals(this.saleToPOIData, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.saleToPOIData) &&
        Objects.equals(this.serviceAttribute, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.serviceAttribute) &&
        Objects.equals(this.transactionCapture, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.transactionCapture) &&
        Objects.equals(this.transactionDetails, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.transactionDetails) &&
        Objects.equals(this.transactionIdentification, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.transactionIdentification) &&
        Objects.equals(this.transactionType, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalService, additionalTransactionData, authorisationResult, cardProgrammeApplied, cardProgrammeProposed, customerConsent, customerOrder, customerToken, issuerCITIdentification, issuerReferenceData, lastTransactionFlag, merchantCITIdentification, merchantCategoryCode, merchantReferenceData, originalTransaction, reconciliationIdentification, saleReferenceIdentification, saleToAcquirerData, saleToIssuerData, saleToPOIData, serviceAttribute, transactionCapture, transactionDetails, transactionIdentification, transactionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction {\n");
    
    sb.append("    additionalService: ").append(toIndentedString(additionalService)).append("\n");
    sb.append("    additionalTransactionData: ").append(toIndentedString(additionalTransactionData)).append("\n");
    sb.append("    authorisationResult: ").append(toIndentedString(authorisationResult)).append("\n");
    sb.append("    cardProgrammeApplied: ").append(toIndentedString(cardProgrammeApplied)).append("\n");
    sb.append("    cardProgrammeProposed: ").append(toIndentedString(cardProgrammeProposed)).append("\n");
    sb.append("    customerConsent: ").append(toIndentedString(customerConsent)).append("\n");
    sb.append("    customerOrder: ").append(toIndentedString(customerOrder)).append("\n");
    sb.append("    customerToken: ").append(toIndentedString(customerToken)).append("\n");
    sb.append("    issuerCITIdentification: ").append(toIndentedString(issuerCITIdentification)).append("\n");
    sb.append("    issuerReferenceData: ").append(toIndentedString(issuerReferenceData)).append("\n");
    sb.append("    lastTransactionFlag: ").append(toIndentedString(lastTransactionFlag)).append("\n");
    sb.append("    merchantCITIdentification: ").append(toIndentedString(merchantCITIdentification)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    merchantReferenceData: ").append(toIndentedString(merchantReferenceData)).append("\n");
    sb.append("    originalTransaction: ").append(toIndentedString(originalTransaction)).append("\n");
    sb.append("    reconciliationIdentification: ").append(toIndentedString(reconciliationIdentification)).append("\n");
    sb.append("    saleReferenceIdentification: ").append(toIndentedString(saleReferenceIdentification)).append("\n");
    sb.append("    saleToAcquirerData: ").append(toIndentedString(saleToAcquirerData)).append("\n");
    sb.append("    saleToIssuerData: ").append(toIndentedString(saleToIssuerData)).append("\n");
    sb.append("    saleToPOIData: ").append(toIndentedString(saleToPOIData)).append("\n");
    sb.append("    serviceAttribute: ").append(toIndentedString(serviceAttribute)).append("\n");
    sb.append("    transactionCapture: ").append(toIndentedString(transactionCapture)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
    sb.append("    transactionIdentification: ").append(toIndentedString(transactionIdentification)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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
