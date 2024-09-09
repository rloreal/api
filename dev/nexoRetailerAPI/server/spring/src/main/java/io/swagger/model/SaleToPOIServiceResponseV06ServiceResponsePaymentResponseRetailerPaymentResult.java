package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payment Data Results.&lt;br/&gt;
 */
@Schema(description = "Payment Data Results.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult   {
  @JsonProperty("AdditionalService")
  private Object additionalService = null;

  @JsonProperty("CustomerLanguage")
  private Object customerLanguage = null;

  @JsonProperty("CustomerOrder")
  private Object customerOrder = null;

  @JsonProperty("ImageCapturedSignature")
  private SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature imageCapturedSignature = null;

  @JsonProperty("MerchantOverrideFlag")
  private Object merchantOverrideFlag = null;

  @JsonProperty("OnlineFlag")
  private Object onlineFlag = null;

  @JsonProperty("ProtectedCapturedSignature")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCapturedSignature = null;

  @JsonProperty("RequestedTransaction")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction requestedTransaction = null;

  @JsonProperty("ServiceAttribute")
  private Object serviceAttribute = null;

  @JsonProperty("TransactionResponse")
  private SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse transactionResponse = null;

  @JsonProperty("TransactionType")
  private Object transactionType = null;

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult additionalService(Object additionalService) {
    this.additionalService = additionalService;
    return this;
  }

  /**
   * Service provided by the card payment transaction, in addition to the main service.
   * @return additionalService
   **/
  @Schema(description = "Service provided by the card payment transaction, in addition to the main service.")
      @NotNull

    public Object getAdditionalService() {
    return additionalService;
  }

  public void setAdditionalService(Object additionalService) {
    this.additionalService = additionalService;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult customerLanguage(Object customerLanguage) {
    this.customerLanguage = customerLanguage;
    return this;
  }

  /**
   * Specifies a language.<br/>
   * @return customerLanguage
   **/
  @Schema(example = "ENG", description = "Specifies a language.<br/>")
      @NotNull

    public Object getCustomerLanguage() {
    return customerLanguage;
  }

  public void setCustomerLanguage(Object customerLanguage) {
    this.customerLanguage = customerLanguage;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult customerOrder(Object customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

  /**
   * Customer order attached to a customer, recorded in the POI system.
   * @return customerOrder
   **/
  @Schema(description = "Customer order attached to a customer, recorded in the POI system.")
      @NotNull

    public Object getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(Object customerOrder) {
    this.customerOrder = customerOrder;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult imageCapturedSignature(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature imageCapturedSignature) {
    this.imageCapturedSignature = imageCapturedSignature;
    return this;
  }

  /**
   * Get imageCapturedSignature
   * @return imageCapturedSignature
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature getImageCapturedSignature() {
    return imageCapturedSignature;
  }

  public void setImageCapturedSignature(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature imageCapturedSignature) {
    this.imageCapturedSignature = imageCapturedSignature;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult merchantOverrideFlag(Object merchantOverrideFlag) {
    this.merchantOverrideFlag = merchantOverrideFlag;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return merchantOverrideFlag
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getMerchantOverrideFlag() {
    return merchantOverrideFlag;
  }

  public void setMerchantOverrideFlag(Object merchantOverrideFlag) {
    this.merchantOverrideFlag = merchantOverrideFlag;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult onlineFlag(Object onlineFlag) {
    this.onlineFlag = onlineFlag;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return onlineFlag
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getOnlineFlag() {
    return onlineFlag;
  }

  public void setOnlineFlag(Object onlineFlag) {
    this.onlineFlag = onlineFlag;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult protectedCapturedSignature(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCapturedSignature) {
    this.protectedCapturedSignature = protectedCapturedSignature;
    return this;
  }

  /**
   * Get protectedCapturedSignature
   * @return protectedCapturedSignature
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData getProtectedCapturedSignature() {
    return protectedCapturedSignature;
  }

  public void setProtectedCapturedSignature(PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardData protectedCapturedSignature) {
    this.protectedCapturedSignature = protectedCapturedSignature;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult requestedTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction requestedTransaction) {
    this.requestedTransaction = requestedTransaction;
    return this;
  }

  /**
   * Get requestedTransaction
   * @return requestedTransaction
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction getRequestedTransaction() {
    return requestedTransaction;
  }

  public void setRequestedTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction requestedTransaction) {
    this.requestedTransaction = requestedTransaction;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult serviceAttribute(Object serviceAttribute) {
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

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult transactionResponse(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse transactionResponse) {
    this.transactionResponse = transactionResponse;
    return this;
  }

  /**
   * Get transactionResponse
   * @return transactionResponse
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse getTransactionResponse() {
    return transactionResponse;
  }

  public void setTransactionResponse(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponse transactionResponse) {
    this.transactionResponse = transactionResponse;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult transactionType(Object transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Main service provided during the card payment transaction.<br/>- **BALC: Balance**  : *Balance enquiry.*<br/>- **CACT: CardActivation**  : *Card activation.*<br/>- **CRDP: CardPayment**  : *Card payment.*<br/>- **CAFH: CardsFundTransferPush**  : *Transfer of funds to a card or an account.*<br/>- **CAVR: CardVerification**  : *Card verification.*<br/>- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*<br/>- **CSHD: CashDeposit**  : *Cash deposit.*<br/>- **DEFR: DeferredPayment**  : *Deferred payment.*<br/>- **LOAD: Loading**  : *Loading or reloading non-financial account.*<br/>- **ORCR: OriginalCredit**  : *Original credit.*<br/>- **PINC: PINChange**  : *PIN (Personal Identification Number) change.*<br/>- **QUCH: QuasiCash**  : *Quasi-cash.*<br/>- **RFND: Refund**  : *Refund transaction.*<br/>- **RESA: Reservation**  : *Reservation (pre-authorisation).*<br/>- **VALC: ValidityCheck**  : *Card validity check.*<br/>- **UNLD: Unloading**  : *Unloading non-financial account.*<br/>- **CAFT: CardsFundTransfer**  : *Transfer of funds to and/or from a card account.*<br/>- **CAFL: CardsFundTransferPull**  : *Transfer of funds from a card or an account.*<br/>- **CIDD: CardInitiatingDirectDebit**  : *Direct Debit initiated by Card.*<br/>
   * @return transactionType
   **/
  @Schema(example = "CRDP", required = true, description = "Main service provided during the card payment transaction.<br/>- **BALC: Balance**  : *Balance enquiry.*<br/>- **CACT: CardActivation**  : *Card activation.*<br/>- **CRDP: CardPayment**  : *Card payment.*<br/>- **CAFH: CardsFundTransferPush**  : *Transfer of funds to a card or an account.*<br/>- **CAVR: CardVerification**  : *Card verification.*<br/>- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*<br/>- **CSHD: CashDeposit**  : *Cash deposit.*<br/>- **DEFR: DeferredPayment**  : *Deferred payment.*<br/>- **LOAD: Loading**  : *Loading or reloading non-financial account.*<br/>- **ORCR: OriginalCredit**  : *Original credit.*<br/>- **PINC: PINChange**  : *PIN (Personal Identification Number) change.*<br/>- **QUCH: QuasiCash**  : *Quasi-cash.*<br/>- **RFND: Refund**  : *Refund transaction.*<br/>- **RESA: Reservation**  : *Reservation (pre-authorisation).*<br/>- **VALC: ValidityCheck**  : *Card validity check.*<br/>- **UNLD: Unloading**  : *Unloading non-financial account.*<br/>- **CAFT: CardsFundTransfer**  : *Transfer of funds to and/or from a card account.*<br/>- **CAFL: CardsFundTransferPull**  : *Transfer of funds from a card or an account.*<br/>- **CIDD: CardInitiatingDirectDebit**  : *Direct Debit initiated by Card.*<br/>")
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
    SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult = (SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult) o;
    return Objects.equals(this.additionalService, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult.additionalService) &&
        Objects.equals(this.customerLanguage, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult.customerLanguage) &&
        Objects.equals(this.customerOrder, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult.customerOrder) &&
        Objects.equals(this.imageCapturedSignature, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult.imageCapturedSignature) &&
        Objects.equals(this.merchantOverrideFlag, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult.merchantOverrideFlag) &&
        Objects.equals(this.onlineFlag, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult.onlineFlag) &&
        Objects.equals(this.protectedCapturedSignature, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult.protectedCapturedSignature) &&
        Objects.equals(this.requestedTransaction, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult.requestedTransaction) &&
        Objects.equals(this.serviceAttribute, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult.serviceAttribute) &&
        Objects.equals(this.transactionResponse, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult.transactionResponse) &&
        Objects.equals(this.transactionType, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResult.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalService, customerLanguage, customerOrder, imageCapturedSignature, merchantOverrideFlag, onlineFlag, protectedCapturedSignature, requestedTransaction, serviceAttribute, transactionResponse, transactionType);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
