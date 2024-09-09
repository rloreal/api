package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data to request to card data acquisition.&lt;br/&gt;
 */
@Schema(description = "Data to request to card data acquisition.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest   {
  @JsonProperty("AllowedLoyaltyBrand")
  private Object allowedLoyaltyBrand = null;

  @JsonProperty("AllowedPaymentBrand")
  private Object allowedPaymentBrand = null;

  @JsonProperty("CashBackFlag")
  private Object cashBackFlag = null;

  @JsonProperty("ForceCustomerSelectionFlag")
  private Object forceCustomerSelectionFlag = null;

  @JsonProperty("PaymentType")
  private Object paymentType = null;

  @JsonProperty("SaleToAcquirerData")
  private Object saleToAcquirerData = null;

  @JsonProperty("SaleToIssuerData")
  private Object saleToIssuerData = null;

  @JsonProperty("SaleToPOIData")
  private Object saleToPOIData = null;

  @JsonProperty("SaleTransactionIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification = null;

  @JsonProperty("TotalAmount")
  private Object totalAmount = null;

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest allowedLoyaltyBrand(Object allowedLoyaltyBrand) {
    this.allowedLoyaltyBrand = allowedLoyaltyBrand;
    return this;
  }

  /**
   * Loyalty brands or programs allowed by the Sale System for the loyalty transaction.
   * @return allowedLoyaltyBrand
   **/
  @Schema(description = "Loyalty brands or programs allowed by the Sale System for the loyalty transaction.")
      @NotNull

    public Object getAllowedLoyaltyBrand() {
    return allowedLoyaltyBrand;
  }

  public void setAllowedLoyaltyBrand(Object allowedLoyaltyBrand) {
    this.allowedLoyaltyBrand = allowedLoyaltyBrand;
  }

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest allowedPaymentBrand(Object allowedPaymentBrand) {
    this.allowedPaymentBrand = allowedPaymentBrand;
    return this;
  }

  /**
   * Card payment brands allowed by the Sale System for the payment transaction.
   * @return allowedPaymentBrand
   **/
  @Schema(description = "Card payment brands allowed by the Sale System for the payment transaction.")
      @NotNull

    public Object getAllowedPaymentBrand() {
    return allowedPaymentBrand;
  }

  public void setAllowedPaymentBrand(Object allowedPaymentBrand) {
    this.allowedPaymentBrand = allowedPaymentBrand;
  }

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest cashBackFlag(Object cashBackFlag) {
    this.cashBackFlag = cashBackFlag;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return cashBackFlag
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getCashBackFlag() {
    return cashBackFlag;
  }

  public void setCashBackFlag(Object cashBackFlag) {
    this.cashBackFlag = cashBackFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest forceCustomerSelectionFlag(Object forceCustomerSelectionFlag) {
    this.forceCustomerSelectionFlag = forceCustomerSelectionFlag;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return forceCustomerSelectionFlag
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getForceCustomerSelectionFlag() {
    return forceCustomerSelectionFlag;
  }

  public void setForceCustomerSelectionFlag(Object forceCustomerSelectionFlag) {
    this.forceCustomerSelectionFlag = forceCustomerSelectionFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest paymentType(Object paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Additional attribute of the service type.<br/>- **CRDP: CardPayment**  : *Card payment.*<br/>- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*<br/>- **CSHD: CashDeposit**  : *Cash deposit.*<br/>- **IRES: InitialReservation**  : *Initial reservation.*<br/>- **DEFR: DeferredPayment**  : *Deferred payment.*<br/>- **URES: UpdateReservation**  : *Update reservation.*<br/>- **PRES: PaymentReservation**  : *Payment after reservation.*<br/>- **RECP: RecurringPayment**  : *Recurring payment.*<br/>- **INSP: Instalment**  : *Instalment payment.*<br/>- **INSI: IssuerInstalment**  : *Instalment payment transaction performed by the card issuer.*<br/>- **RFND: Refund**  : *Refund transaction.*<br/>- **VCAU: VoiceAuthorisation**  : *Voice authorisation.*<br/>
   * @return paymentType
   **/
  @Schema(description = "Additional attribute of the service type.<br/>- **CRDP: CardPayment**  : *Card payment.*<br/>- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*<br/>- **CSHD: CashDeposit**  : *Cash deposit.*<br/>- **IRES: InitialReservation**  : *Initial reservation.*<br/>- **DEFR: DeferredPayment**  : *Deferred payment.*<br/>- **URES: UpdateReservation**  : *Update reservation.*<br/>- **PRES: PaymentReservation**  : *Payment after reservation.*<br/>- **RECP: RecurringPayment**  : *Recurring payment.*<br/>- **INSP: Instalment**  : *Instalment payment.*<br/>- **INSI: IssuerInstalment**  : *Instalment payment transaction performed by the card issuer.*<br/>- **RFND: Refund**  : *Refund transaction.*<br/>- **VCAU: VoiceAuthorisation**  : *Voice authorisation.*<br/>")
      @NotNull

    public Object getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(Object paymentType) {
    this.paymentType = paymentType;
  }

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest saleToAcquirerData(Object saleToAcquirerData) {
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

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest saleToIssuerData(Object saleToIssuerData) {
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

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest saleToPOIData(Object saleToPOIData) {
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

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest saleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
    return this;
  }

  /**
   * Get saleTransactionIdentification
   * @return saleTransactionIdentification
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getSaleTransactionIdentification() {
    return saleTransactionIdentification;
  }

  public void setSaleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest totalAmount(Object totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return totalAmount
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Object totalAmount) {
    this.totalAmount = totalAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest poipoiIdfinancialServiceServiceRequestCardAcquisitionRequest = (PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest) o;
    return Objects.equals(this.allowedLoyaltyBrand, poipoiIdfinancialServiceServiceRequestCardAcquisitionRequest.allowedLoyaltyBrand) &&
        Objects.equals(this.allowedPaymentBrand, poipoiIdfinancialServiceServiceRequestCardAcquisitionRequest.allowedPaymentBrand) &&
        Objects.equals(this.cashBackFlag, poipoiIdfinancialServiceServiceRequestCardAcquisitionRequest.cashBackFlag) &&
        Objects.equals(this.forceCustomerSelectionFlag, poipoiIdfinancialServiceServiceRequestCardAcquisitionRequest.forceCustomerSelectionFlag) &&
        Objects.equals(this.paymentType, poipoiIdfinancialServiceServiceRequestCardAcquisitionRequest.paymentType) &&
        Objects.equals(this.saleToAcquirerData, poipoiIdfinancialServiceServiceRequestCardAcquisitionRequest.saleToAcquirerData) &&
        Objects.equals(this.saleToIssuerData, poipoiIdfinancialServiceServiceRequestCardAcquisitionRequest.saleToIssuerData) &&
        Objects.equals(this.saleToPOIData, poipoiIdfinancialServiceServiceRequestCardAcquisitionRequest.saleToPOIData) &&
        Objects.equals(this.saleTransactionIdentification, poipoiIdfinancialServiceServiceRequestCardAcquisitionRequest.saleTransactionIdentification) &&
        Objects.equals(this.totalAmount, poipoiIdfinancialServiceServiceRequestCardAcquisitionRequest.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedLoyaltyBrand, allowedPaymentBrand, cashBackFlag, forceCustomerSelectionFlag, paymentType, saleToAcquirerData, saleToIssuerData, saleToPOIData, saleTransactionIdentification, totalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest {\n");
    
    sb.append("    allowedLoyaltyBrand: ").append(toIndentedString(allowedLoyaltyBrand)).append("\n");
    sb.append("    allowedPaymentBrand: ").append(toIndentedString(allowedPaymentBrand)).append("\n");
    sb.append("    cashBackFlag: ").append(toIndentedString(cashBackFlag)).append("\n");
    sb.append("    forceCustomerSelectionFlag: ").append(toIndentedString(forceCustomerSelectionFlag)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    saleToAcquirerData: ").append(toIndentedString(saleToAcquirerData)).append("\n");
    sb.append("    saleToIssuerData: ").append(toIndentedString(saleToIssuerData)).append("\n");
    sb.append("    saleToPOIData: ").append(toIndentedString(saleToPOIData)).append("\n");
    sb.append("    saleTransactionIdentification: ").append(toIndentedString(saleTransactionIdentification)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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
