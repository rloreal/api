package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse;
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
  * Payment Data Results.<br/>
 **/
@Schema(description="Payment Data Results.<br/>")
public class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult   {
  
  @Schema(description = "Service provided by the card payment transaction, in addition to the main service.")
 /**
   * Service provided by the card payment transaction, in addition to the main service.  
  **/
  private Object additionalService = null;
  
  @Schema(example = "ENG", description = "Specifies a language.<br/>")
 /**
   * Specifies a language.<br/>  
  **/
  private Object customerLanguage = null;
  
  @Schema(description = "Customer order attached to a customer, recorded in the POI system.")
 /**
   * Customer order attached to a customer, recorded in the POI system.  
  **/
  private Object customerOrder = null;
  
  @Schema(description = "")
  private SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature imageCapturedSignature = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object merchantOverrideFlag = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object onlineFlag = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCapturedSignature = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction requestedTransaction = null;
  
  @Schema(example = "IRES", description = "Additional attributes of the service provided by the card payment transaction.<br/>- **IRES: InitialReservation**  : *Initial reservation.*<br/>- **URES: UpdateReservation**  : *Update reservation.*<br/>- **PRES: PaymentReservation**  : *Payment after reservation.*<br/>- **ARES: AdditionalPayment**  : *Additional payment after reservation.*<br/>- **FREC: FirstRecurring**  : *Initial recurring payment.*<br/>- **RREC: FollowingRecurring**  : *Repeat recurring payment.*<br/>- **GOPT: GuaranteeOfPayment**  : *Acceptor claims for guarantee of payment.*<br/>")
 /**
   * Additional attributes of the service provided by the card payment transaction.<br/>- **IRES: InitialReservation**  : *Initial reservation.*<br/>- **URES: UpdateReservation**  : *Update reservation.*<br/>- **PRES: PaymentReservation**  : *Payment after reservation.*<br/>- **ARES: AdditionalPayment**  : *Additional payment after reservation.*<br/>- **FREC: FirstRecurring**  : *Initial recurring payment.*<br/>- **RREC: FollowingRecurring**  : *Repeat recurring payment.*<br/>- **GOPT: GuaranteeOfPayment**  : *Acceptor claims for guarantee of payment.*<br/>  
  **/
  private Object serviceAttribute = null;
  
  @Schema(description = "")
  private SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse transactionResponse = null;
  
  @Schema(example = "CRDP", required = true, description = "Main service provided during the card payment transaction.<br/>- **BALC: Balance**  : *Balance enquiry.*<br/>- **CACT: CardActivation**  : *Card activation.*<br/>- **CRDP: CardPayment**  : *Card payment.*<br/>- **CAFH: CardsFundTransferPush**  : *Transfer of funds to a card or an account.*<br/>- **CAVR: CardVerification**  : *Card verification.*<br/>- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*<br/>- **CSHD: CashDeposit**  : *Cash deposit.*<br/>- **DEFR: DeferredPayment**  : *Deferred payment.*<br/>- **LOAD: Loading**  : *Loading or reloading non-financial account.*<br/>- **ORCR: OriginalCredit**  : *Original credit.*<br/>- **PINC: PINChange**  : *PIN (Personal Identification Number) change.*<br/>- **QUCH: QuasiCash**  : *Quasi-cash.*<br/>- **RFND: Refund**  : *Refund transaction.*<br/>- **RESA: Reservation**  : *Reservation (pre-authorisation).*<br/>- **VALC: ValidityCheck**  : *Card validity check.*<br/>- **UNLD: Unloading**  : *Unloading non-financial account.*<br/>- **CAFT: CardsFundTransfer**  : *Transfer of funds to and/or from a card account.*<br/>- **CAFL: CardsFundTransferPull**  : *Transfer of funds from a card or an account.*<br/>- **CIDD: CardInitiatingDirectDebit**  : *Direct Debit initiated by Card.*<br/>")
 /**
   * Main service provided during the card payment transaction.<br/>- **BALC: Balance**  : *Balance enquiry.*<br/>- **CACT: CardActivation**  : *Card activation.*<br/>- **CRDP: CardPayment**  : *Card payment.*<br/>- **CAFH: CardsFundTransferPush**  : *Transfer of funds to a card or an account.*<br/>- **CAVR: CardVerification**  : *Card verification.*<br/>- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*<br/>- **CSHD: CashDeposit**  : *Cash deposit.*<br/>- **DEFR: DeferredPayment**  : *Deferred payment.*<br/>- **LOAD: Loading**  : *Loading or reloading non-financial account.*<br/>- **ORCR: OriginalCredit**  : *Original credit.*<br/>- **PINC: PINChange**  : *PIN (Personal Identification Number) change.*<br/>- **QUCH: QuasiCash**  : *Quasi-cash.*<br/>- **RFND: Refund**  : *Refund transaction.*<br/>- **RESA: Reservation**  : *Reservation (pre-authorisation).*<br/>- **VALC: ValidityCheck**  : *Card validity check.*<br/>- **UNLD: Unloading**  : *Unloading non-financial account.*<br/>- **CAFT: CardsFundTransfer**  : *Transfer of funds to and/or from a card account.*<br/>- **CAFL: CardsFundTransferPull**  : *Transfer of funds from a card or an account.*<br/>- **CIDD: CardInitiatingDirectDebit**  : *Direct Debit initiated by Card.*<br/>  
  **/
  private Object transactionType = null;
 /**
   * Service provided by the card payment transaction, in addition to the main service.
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

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult additionalService(Object additionalService) {
    this.additionalService = additionalService;
    return this;
  }

 /**
   * Specifies a language.&lt;br/&gt;
   * @return customerLanguage
  **/
  @JsonProperty("CustomerLanguage")
  @NotNull
  public Object getCustomerLanguage() {
    return customerLanguage;
  }

  public void setCustomerLanguage(Object customerLanguage) {
    this.customerLanguage = customerLanguage;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult customerLanguage(Object customerLanguage) {
    this.customerLanguage = customerLanguage;
    return this;
  }

 /**
   * Customer order attached to a customer, recorded in the POI system.
   * @return customerOrder
  **/
  @JsonProperty("CustomerOrder")
  @NotNull
  public Object getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(Object customerOrder) {
    this.customerOrder = customerOrder;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult customerOrder(Object customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

 /**
   * Get imageCapturedSignature
   * @return imageCapturedSignature
  **/
  @JsonProperty("ImageCapturedSignature")
  @NotNull
  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature getImageCapturedSignature() {
    return imageCapturedSignature;
  }

  public void setImageCapturedSignature(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature imageCapturedSignature) {
    this.imageCapturedSignature = imageCapturedSignature;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult imageCapturedSignature(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature imageCapturedSignature) {
    this.imageCapturedSignature = imageCapturedSignature;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return merchantOverrideFlag
  **/
  @JsonProperty("MerchantOverrideFlag")
  @NotNull
  public Object getMerchantOverrideFlag() {
    return merchantOverrideFlag;
  }

  public void setMerchantOverrideFlag(Object merchantOverrideFlag) {
    this.merchantOverrideFlag = merchantOverrideFlag;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult merchantOverrideFlag(Object merchantOverrideFlag) {
    this.merchantOverrideFlag = merchantOverrideFlag;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return onlineFlag
  **/
  @JsonProperty("OnlineFlag")
  @NotNull
  public Object getOnlineFlag() {
    return onlineFlag;
  }

  public void setOnlineFlag(Object onlineFlag) {
    this.onlineFlag = onlineFlag;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult onlineFlag(Object onlineFlag) {
    this.onlineFlag = onlineFlag;
    return this;
  }

 /**
   * Get protectedCapturedSignature
   * @return protectedCapturedSignature
  **/
  @JsonProperty("ProtectedCapturedSignature")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData getProtectedCapturedSignature() {
    return protectedCapturedSignature;
  }

  public void setProtectedCapturedSignature(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCapturedSignature) {
    this.protectedCapturedSignature = protectedCapturedSignature;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult protectedCapturedSignature(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCapturedSignature) {
    this.protectedCapturedSignature = protectedCapturedSignature;
    return this;
  }

 /**
   * Get requestedTransaction
   * @return requestedTransaction
  **/
  @JsonProperty("RequestedTransaction")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction getRequestedTransaction() {
    return requestedTransaction;
  }

  public void setRequestedTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction requestedTransaction) {
    this.requestedTransaction = requestedTransaction;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult requestedTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction requestedTransaction) {
    this.requestedTransaction = requestedTransaction;
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

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult serviceAttribute(Object serviceAttribute) {
    this.serviceAttribute = serviceAttribute;
    return this;
  }

 /**
   * Get transactionResponse
   * @return transactionResponse
  **/
  @JsonProperty("TransactionResponse")
  @NotNull
  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse getTransactionResponse() {
    return transactionResponse;
  }

  public void setTransactionResponse(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse transactionResponse) {
    this.transactionResponse = transactionResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult transactionResponse(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse transactionResponse) {
    this.transactionResponse = transactionResponse;
    return this;
  }

 /**
   * Main service provided during the card payment transaction.&lt;br/&gt;- **BALC: Balance**  : *Balance enquiry.*&lt;br/&gt;- **CACT: CardActivation**  : *Card activation.*&lt;br/&gt;- **CRDP: CardPayment**  : *Card payment.*&lt;br/&gt;- **CAFH: CardsFundTransferPush**  : *Transfer of funds to a card or an account.*&lt;br/&gt;- **CAVR: CardVerification**  : *Card verification.*&lt;br/&gt;- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*&lt;br/&gt;- **CSHD: CashDeposit**  : *Cash deposit.*&lt;br/&gt;- **DEFR: DeferredPayment**  : *Deferred payment.*&lt;br/&gt;- **LOAD: Loading**  : *Loading or reloading non-financial account.*&lt;br/&gt;- **ORCR: OriginalCredit**  : *Original credit.*&lt;br/&gt;- **PINC: PINChange**  : *PIN (Personal Identification Number) change.*&lt;br/&gt;- **QUCH: QuasiCash**  : *Quasi-cash.*&lt;br/&gt;- **RFND: Refund**  : *Refund transaction.*&lt;br/&gt;- **RESA: Reservation**  : *Reservation (pre-authorisation).*&lt;br/&gt;- **VALC: ValidityCheck**  : *Card validity check.*&lt;br/&gt;- **UNLD: Unloading**  : *Unloading non-financial account.*&lt;br/&gt;- **CAFT: CardsFundTransfer**  : *Transfer of funds to and/or from a card account.*&lt;br/&gt;- **CAFL: CardsFundTransferPull**  : *Transfer of funds from a card or an account.*&lt;br/&gt;- **CIDD: CardInitiatingDirectDebit**  : *Direct Debit initiated by Card.*&lt;br/&gt;
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

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult transactionType(Object transactionType) {
    this.transactionType = transactionType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult {\n");
    
    sb.append("    additionalService: ").append(toIndentedString(additionalService)).append("\n");
    sb.append("    customerLanguage: ").append(toIndentedString(customerLanguage)).append("\n");
    sb.append("    customerOrder: ").append(toIndentedString(customerOrder)).append("\n");
    sb.append("    imageCapturedSignature: ").append(toIndentedString(imageCapturedSignature)).append("\n");
    sb.append("    merchantOverrideFlag: ").append(toIndentedString(merchantOverrideFlag)).append("\n");
    sb.append("    onlineFlag: ").append(toIndentedString(onlineFlag)).append("\n");
    sb.append("    protectedCapturedSignature: ").append(toIndentedString(protectedCapturedSignature)).append("\n");
    sb.append("    requestedTransaction: ").append(toIndentedString(requestedTransaction)).append("\n");
    sb.append("    serviceAttribute: ").append(toIndentedString(serviceAttribute)).append("\n");
    sb.append("    transactionResponse: ").append(toIndentedString(transactionResponse)).append("\n");
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
