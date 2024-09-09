package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails;
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
  * Data associated with the transaction for a potential currency conversion.<br/>
 **/
@Schema(description="Data associated with the transaction for a potential currency conversion.<br/>")
public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction   {
  
  @Schema(description = "Service in addition to the main service.")
 /**
   * Service in addition to the main service.  
  **/
  private Object additionalService = null;
  
  @Schema(description = "Additional information related to the transaction.")
 /**
   * Additional information related to the transaction.  
  **/
  private Object additionalTransactionData = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult authorisationResult = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object cardProgrammeApplied = null;
  
  @Schema(description = "Specifies the card program proposed by a retailer to a cardholder among a series of payment programmes offered by the retailer.")
 /**
   * Specifies the card program proposed by a retailer to a cardholder among a series of payment programmes offered by the retailer.  
  **/
  private Object cardProgrammeProposed = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object customerConsent = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken customerToken = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 140 characters.<br/>  
  **/
  private Object issuerCITIdentification = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 140 characters.<br/>  
  **/
  private Object issuerReferenceData = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object lastTransactionFlag = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 140 characters.<br/>  
  **/
  private Object merchantCITIdentification = null;
  
  @Schema(description = "Specifies a character string with a minimum length of 3 characters, and a maximum length of 4 characters.<br/>")
 /**
   * Specifies a character string with a minimum length of 3 characters, and a maximum length of 4 characters.<br/>  
  **/
  private Object merchantCategoryCode = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object merchantReferenceData = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction originalTransaction = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object reconciliationIdentification = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object saleReferenceIdentification = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object saleToAcquirerData = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object saleToIssuerData = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object saleToPOIData = null;
  
  @Schema(example = "IRES", description = "Additional attributes of the service provided by the card payment transaction.<br/>- **IRES: InitialReservation**  : *Initial reservation.*<br/>- **URES: UpdateReservation**  : *Update reservation.*<br/>- **PRES: PaymentReservation**  : *Payment after reservation.*<br/>- **ARES: AdditionalPayment**  : *Additional payment after reservation.*<br/>- **FREC: FirstRecurring**  : *Initial recurring payment.*<br/>- **RREC: FollowingRecurring**  : *Repeat recurring payment.*<br/>- **GOPT: GuaranteeOfPayment**  : *Acceptor claims for guarantee of payment.*<br/>")
 /**
   * Additional attributes of the service provided by the card payment transaction.<br/>- **IRES: InitialReservation**  : *Initial reservation.*<br/>- **URES: UpdateReservation**  : *Update reservation.*<br/>- **PRES: PaymentReservation**  : *Payment after reservation.*<br/>- **ARES: AdditionalPayment**  : *Additional payment after reservation.*<br/>- **FREC: FirstRecurring**  : *Initial recurring payment.*<br/>- **RREC: FollowingRecurring**  : *Repeat recurring payment.*<br/>- **GOPT: GuaranteeOfPayment**  : *Acceptor claims for guarantee of payment.*<br/>  
  **/
  private Object serviceAttribute = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object transactionCapture = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails transactionDetails = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification transactionIdentification = null;
  
  @Schema(example = "CRDP", required = true, description = "Main service provided during the card payment transaction.<br/>- **BALC: Balance**  : *Balance enquiry.*<br/>- **CACT: CardActivation**  : *Card activation.*<br/>- **CRDP: CardPayment**  : *Card payment.*<br/>- **CAFH: CardsFundTransferPush**  : *Transfer of funds to a card or an account.*<br/>- **CAVR: CardVerification**  : *Card verification.*<br/>- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*<br/>- **CSHD: CashDeposit**  : *Cash deposit.*<br/>- **DEFR: DeferredPayment**  : *Deferred payment.*<br/>- **LOAD: Loading**  : *Loading or reloading non-financial account.*<br/>- **ORCR: OriginalCredit**  : *Original credit.*<br/>- **PINC: PINChange**  : *PIN (Personal Identification Number) change.*<br/>- **QUCH: QuasiCash**  : *Quasi-cash.*<br/>- **RFND: Refund**  : *Refund transaction.*<br/>- **RESA: Reservation**  : *Reservation (pre-authorisation).*<br/>- **VALC: ValidityCheck**  : *Card validity check.*<br/>- **UNLD: Unloading**  : *Unloading non-financial account.*<br/>- **CAFT: CardsFundTransfer**  : *Transfer of funds to and/or from a card account.*<br/>- **CAFL: CardsFundTransferPull**  : *Transfer of funds from a card or an account.*<br/>")
 /**
   * Main service provided during the card payment transaction.<br/>- **BALC: Balance**  : *Balance enquiry.*<br/>- **CACT: CardActivation**  : *Card activation.*<br/>- **CRDP: CardPayment**  : *Card payment.*<br/>- **CAFH: CardsFundTransferPush**  : *Transfer of funds to a card or an account.*<br/>- **CAVR: CardVerification**  : *Card verification.*<br/>- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*<br/>- **CSHD: CashDeposit**  : *Cash deposit.*<br/>- **DEFR: DeferredPayment**  : *Deferred payment.*<br/>- **LOAD: Loading**  : *Loading or reloading non-financial account.*<br/>- **ORCR: OriginalCredit**  : *Original credit.*<br/>- **PINC: PINChange**  : *PIN (Personal Identification Number) change.*<br/>- **QUCH: QuasiCash**  : *Quasi-cash.*<br/>- **RFND: Refund**  : *Refund transaction.*<br/>- **RESA: Reservation**  : *Reservation (pre-authorisation).*<br/>- **VALC: ValidityCheck**  : *Card validity check.*<br/>- **UNLD: Unloading**  : *Unloading non-financial account.*<br/>- **CAFT: CardsFundTransfer**  : *Transfer of funds to and/or from a card account.*<br/>- **CAFL: CardsFundTransferPull**  : *Transfer of funds from a card or an account.*<br/>  
  **/
  private Object transactionType = null;
 /**
   * Service in addition to the main service.
   * @return additionalService
  **/
  @JsonProperty("AdditionalService")
  @NotNull
  public Object getAdditionalService() {
    return additionalService;
  }

  public void setAdditionalService(Object additionalService) {
    this.additionalService = additionalService;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction additionalService(Object additionalService) {
    this.additionalService = additionalService;
    return this;
  }

 /**
   * Additional information related to the transaction.
   * @return additionalTransactionData
  **/
  @JsonProperty("AdditionalTransactionData")
  @NotNull
  public Object getAdditionalTransactionData() {
    return additionalTransactionData;
  }

  public void setAdditionalTransactionData(Object additionalTransactionData) {
    this.additionalTransactionData = additionalTransactionData;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction additionalTransactionData(Object additionalTransactionData) {
    this.additionalTransactionData = additionalTransactionData;
    return this;
  }

 /**
   * Get authorisationResult
   * @return authorisationResult
  **/
  @JsonProperty("AuthorisationResult")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult getAuthorisationResult() {
    return authorisationResult;
  }

  public void setAuthorisationResult(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult authorisationResult) {
    this.authorisationResult = authorisationResult;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction authorisationResult(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult authorisationResult) {
    this.authorisationResult = authorisationResult;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return cardProgrammeApplied
  **/
  @JsonProperty("CardProgrammeApplied")
  @NotNull
  public Object getCardProgrammeApplied() {
    return cardProgrammeApplied;
  }

  public void setCardProgrammeApplied(Object cardProgrammeApplied) {
    this.cardProgrammeApplied = cardProgrammeApplied;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction cardProgrammeApplied(Object cardProgrammeApplied) {
    this.cardProgrammeApplied = cardProgrammeApplied;
    return this;
  }

 /**
   * Specifies the card program proposed by a retailer to a cardholder among a series of payment programmes offered by the retailer.
   * @return cardProgrammeProposed
  **/
  @JsonProperty("CardProgrammeProposed")
  @NotNull
  public Object getCardProgrammeProposed() {
    return cardProgrammeProposed;
  }

  public void setCardProgrammeProposed(Object cardProgrammeProposed) {
    this.cardProgrammeProposed = cardProgrammeProposed;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction cardProgrammeProposed(Object cardProgrammeProposed) {
    this.cardProgrammeProposed = cardProgrammeProposed;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return customerConsent
  **/
  @JsonProperty("CustomerConsent")
  @NotNull
  public Object getCustomerConsent() {
    return customerConsent;
  }

  public void setCustomerConsent(Object customerConsent) {
    this.customerConsent = customerConsent;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction customerConsent(Object customerConsent) {
    this.customerConsent = customerConsent;
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

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction customerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

 /**
   * Get customerToken
   * @return customerToken
  **/
  @JsonProperty("CustomerToken")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken getCustomerToken() {
    return customerToken;
  }

  public void setCustomerToken(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken customerToken) {
    this.customerToken = customerToken;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction customerToken(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionCustomerToken customerToken) {
    this.customerToken = customerToken;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 140 characters.&lt;br/&gt;
   * @return issuerCITIdentification
  **/
  @JsonProperty("IssuerCITIdentification")
  @NotNull
  public Object getIssuerCITIdentification() {
    return issuerCITIdentification;
  }

  public void setIssuerCITIdentification(Object issuerCITIdentification) {
    this.issuerCITIdentification = issuerCITIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction issuerCITIdentification(Object issuerCITIdentification) {
    this.issuerCITIdentification = issuerCITIdentification;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 140 characters.&lt;br/&gt;
   * @return issuerReferenceData
  **/
  @JsonProperty("IssuerReferenceData")
  @NotNull
  public Object getIssuerReferenceData() {
    return issuerReferenceData;
  }

  public void setIssuerReferenceData(Object issuerReferenceData) {
    this.issuerReferenceData = issuerReferenceData;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction issuerReferenceData(Object issuerReferenceData) {
    this.issuerReferenceData = issuerReferenceData;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return lastTransactionFlag
  **/
  @JsonProperty("LastTransactionFlag")
  @NotNull
  public Object getLastTransactionFlag() {
    return lastTransactionFlag;
  }

  public void setLastTransactionFlag(Object lastTransactionFlag) {
    this.lastTransactionFlag = lastTransactionFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction lastTransactionFlag(Object lastTransactionFlag) {
    this.lastTransactionFlag = lastTransactionFlag;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 140 characters.&lt;br/&gt;
   * @return merchantCITIdentification
  **/
  @JsonProperty("MerchantCITIdentification")
  @NotNull
  public Object getMerchantCITIdentification() {
    return merchantCITIdentification;
  }

  public void setMerchantCITIdentification(Object merchantCITIdentification) {
    this.merchantCITIdentification = merchantCITIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction merchantCITIdentification(Object merchantCITIdentification) {
    this.merchantCITIdentification = merchantCITIdentification;
    return this;
  }

 /**
   * Specifies a character string with a minimum length of 3 characters, and a maximum length of 4 characters.&lt;br/&gt;
   * @return merchantCategoryCode
  **/
  @JsonProperty("MerchantCategoryCode")
  @NotNull
  public Object getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(Object merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction merchantCategoryCode(Object merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return merchantReferenceData
  **/
  @JsonProperty("MerchantReferenceData")
  @NotNull
  public Object getMerchantReferenceData() {
    return merchantReferenceData;
  }

  public void setMerchantReferenceData(Object merchantReferenceData) {
    this.merchantReferenceData = merchantReferenceData;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction merchantReferenceData(Object merchantReferenceData) {
    this.merchantReferenceData = merchantReferenceData;
    return this;
  }

 /**
   * Get originalTransaction
   * @return originalTransaction
  **/
  @JsonProperty("OriginalTransaction")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction getOriginalTransaction() {
    return originalTransaction;
  }

  public void setOriginalTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction originalTransaction) {
    this.originalTransaction = originalTransaction;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction originalTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction originalTransaction) {
    this.originalTransaction = originalTransaction;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return reconciliationIdentification
  **/
  @JsonProperty("ReconciliationIdentification")
  @NotNull
  public Object getReconciliationIdentification() {
    return reconciliationIdentification;
  }

  public void setReconciliationIdentification(Object reconciliationIdentification) {
    this.reconciliationIdentification = reconciliationIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction reconciliationIdentification(Object reconciliationIdentification) {
    this.reconciliationIdentification = reconciliationIdentification;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return saleReferenceIdentification
  **/
  @JsonProperty("SaleReferenceIdentification")
  @NotNull
  public Object getSaleReferenceIdentification() {
    return saleReferenceIdentification;
  }

  public void setSaleReferenceIdentification(Object saleReferenceIdentification) {
    this.saleReferenceIdentification = saleReferenceIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction saleReferenceIdentification(Object saleReferenceIdentification) {
    this.saleReferenceIdentification = saleReferenceIdentification;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return saleToAcquirerData
  **/
  @JsonProperty("SaleToAcquirerData")
  @NotNull
  public Object getSaleToAcquirerData() {
    return saleToAcquirerData;
  }

  public void setSaleToAcquirerData(Object saleToAcquirerData) {
    this.saleToAcquirerData = saleToAcquirerData;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction saleToAcquirerData(Object saleToAcquirerData) {
    this.saleToAcquirerData = saleToAcquirerData;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return saleToIssuerData
  **/
  @JsonProperty("SaleToIssuerData")
  @NotNull
  public Object getSaleToIssuerData() {
    return saleToIssuerData;
  }

  public void setSaleToIssuerData(Object saleToIssuerData) {
    this.saleToIssuerData = saleToIssuerData;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction saleToIssuerData(Object saleToIssuerData) {
    this.saleToIssuerData = saleToIssuerData;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return saleToPOIData
  **/
  @JsonProperty("SaleToPOIData")
  @NotNull
  public Object getSaleToPOIData() {
    return saleToPOIData;
  }

  public void setSaleToPOIData(Object saleToPOIData) {
    this.saleToPOIData = saleToPOIData;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction saleToPOIData(Object saleToPOIData) {
    this.saleToPOIData = saleToPOIData;
    return this;
  }

 /**
   * Additional attributes of the service provided by the card payment transaction.&lt;br/&gt;- **IRES: InitialReservation**  : *Initial reservation.*&lt;br/&gt;- **URES: UpdateReservation**  : *Update reservation.*&lt;br/&gt;- **PRES: PaymentReservation**  : *Payment after reservation.*&lt;br/&gt;- **ARES: AdditionalPayment**  : *Additional payment after reservation.*&lt;br/&gt;- **FREC: FirstRecurring**  : *Initial recurring payment.*&lt;br/&gt;- **RREC: FollowingRecurring**  : *Repeat recurring payment.*&lt;br/&gt;- **GOPT: GuaranteeOfPayment**  : *Acceptor claims for guarantee of payment.*&lt;br/&gt;
   * @return serviceAttribute
  **/
  @JsonProperty("ServiceAttribute")
  @NotNull
  public Object getServiceAttribute() {
    return serviceAttribute;
  }

  public void setServiceAttribute(Object serviceAttribute) {
    this.serviceAttribute = serviceAttribute;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction serviceAttribute(Object serviceAttribute) {
    this.serviceAttribute = serviceAttribute;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return transactionCapture
  **/
  @JsonProperty("TransactionCapture")
  @NotNull
  public Object getTransactionCapture() {
    return transactionCapture;
  }

  public void setTransactionCapture(Object transactionCapture) {
    this.transactionCapture = transactionCapture;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction transactionCapture(Object transactionCapture) {
    this.transactionCapture = transactionCapture;
    return this;
  }

 /**
   * Get transactionDetails
   * @return transactionDetails
  **/
  @JsonProperty("TransactionDetails")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails getTransactionDetails() {
    return transactionDetails;
  }

  public void setTransactionDetails(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails transactionDetails) {
    this.transactionDetails = transactionDetails;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction transactionDetails(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetails transactionDetails) {
    this.transactionDetails = transactionDetails;
    return this;
  }

 /**
   * Get transactionIdentification
   * @return transactionIdentification
  **/
  @JsonProperty("TransactionIdentification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getTransactionIdentification() {
    return transactionIdentification;
  }

  public void setTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction transactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
    return this;
  }

 /**
   * Main service provided during the card payment transaction.&lt;br/&gt;- **BALC: Balance**  : *Balance enquiry.*&lt;br/&gt;- **CACT: CardActivation**  : *Card activation.*&lt;br/&gt;- **CRDP: CardPayment**  : *Card payment.*&lt;br/&gt;- **CAFH: CardsFundTransferPush**  : *Transfer of funds to a card or an account.*&lt;br/&gt;- **CAVR: CardVerification**  : *Card verification.*&lt;br/&gt;- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*&lt;br/&gt;- **CSHD: CashDeposit**  : *Cash deposit.*&lt;br/&gt;- **DEFR: DeferredPayment**  : *Deferred payment.*&lt;br/&gt;- **LOAD: Loading**  : *Loading or reloading non-financial account.*&lt;br/&gt;- **ORCR: OriginalCredit**  : *Original credit.*&lt;br/&gt;- **PINC: PINChange**  : *PIN (Personal Identification Number) change.*&lt;br/&gt;- **QUCH: QuasiCash**  : *Quasi-cash.*&lt;br/&gt;- **RFND: Refund**  : *Refund transaction.*&lt;br/&gt;- **RESA: Reservation**  : *Reservation (pre-authorisation).*&lt;br/&gt;- **VALC: ValidityCheck**  : *Card validity check.*&lt;br/&gt;- **UNLD: Unloading**  : *Unloading non-financial account.*&lt;br/&gt;- **CAFT: CardsFundTransfer**  : *Transfer of funds to and/or from a card account.*&lt;br/&gt;- **CAFL: CardsFundTransferPull**  : *Transfer of funds from a card or an account.*&lt;br/&gt;
   * @return transactionType
  **/
  @JsonProperty("TransactionType")
  @NotNull
  public Object getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(Object transactionType) {
    this.transactionType = transactionType;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction transactionType(Object transactionType) {
    this.transactionType = transactionType;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
