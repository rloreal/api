package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
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
  * Data to request to card data acquisition.<br/>
 **/
@Schema(description="Data to request to card data acquisition.<br/>")
public class PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest   {
  
  @Schema(description = "Loyalty brands or programs allowed by the Sale System for the loyalty transaction.")
 /**
   * Loyalty brands or programs allowed by the Sale System for the loyalty transaction.  
  **/
  private Object allowedLoyaltyBrand = null;
  
  @Schema(description = "Card payment brands allowed by the Sale System for the payment transaction.")
 /**
   * Card payment brands allowed by the Sale System for the payment transaction.  
  **/
  private Object allowedPaymentBrand = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object cashBackFlag = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object forceCustomerSelectionFlag = null;
  
  @Schema(description = "Additional attribute of the service type.<br/>- **CRDP: CardPayment**  : *Card payment.*<br/>- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*<br/>- **CSHD: CashDeposit**  : *Cash deposit.*<br/>- **IRES: InitialReservation**  : *Initial reservation.*<br/>- **DEFR: DeferredPayment**  : *Deferred payment.*<br/>- **URES: UpdateReservation**  : *Update reservation.*<br/>- **PRES: PaymentReservation**  : *Payment after reservation.*<br/>- **RECP: RecurringPayment**  : *Recurring payment.*<br/>- **INSP: Instalment**  : *Instalment payment.*<br/>- **INSI: IssuerInstalment**  : *Instalment payment transaction performed by the card issuer.*<br/>- **RFND: Refund**  : *Refund transaction.*<br/>- **VCAU: VoiceAuthorisation**  : *Voice authorisation.*<br/>")
 /**
   * Additional attribute of the service type.<br/>- **CRDP: CardPayment**  : *Card payment.*<br/>- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*<br/>- **CSHD: CashDeposit**  : *Cash deposit.*<br/>- **IRES: InitialReservation**  : *Initial reservation.*<br/>- **DEFR: DeferredPayment**  : *Deferred payment.*<br/>- **URES: UpdateReservation**  : *Update reservation.*<br/>- **PRES: PaymentReservation**  : *Payment after reservation.*<br/>- **RECP: RecurringPayment**  : *Recurring payment.*<br/>- **INSP: Instalment**  : *Instalment payment.*<br/>- **INSI: IssuerInstalment**  : *Instalment payment transaction performed by the card issuer.*<br/>- **RFND: Refund**  : *Refund transaction.*<br/>- **VCAU: VoiceAuthorisation**  : *Voice authorisation.*<br/>  
  **/
  private Object paymentType = null;
  
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
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object totalAmount = null;
 /**
   * Loyalty brands or programs allowed by the Sale System for the loyalty transaction.
   * @return allowedLoyaltyBrand
  **/
  @JsonProperty("AllowedLoyaltyBrand")
  @NotNull
  public Object getAllowedLoyaltyBrand() {
    return allowedLoyaltyBrand;
  }

  public void setAllowedLoyaltyBrand(Object allowedLoyaltyBrand) {
    this.allowedLoyaltyBrand = allowedLoyaltyBrand;
  }

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest allowedLoyaltyBrand(Object allowedLoyaltyBrand) {
    this.allowedLoyaltyBrand = allowedLoyaltyBrand;
    return this;
  }

 /**
   * Card payment brands allowed by the Sale System for the payment transaction.
   * @return allowedPaymentBrand
  **/
  @JsonProperty("AllowedPaymentBrand")
  @NotNull
  public Object getAllowedPaymentBrand() {
    return allowedPaymentBrand;
  }

  public void setAllowedPaymentBrand(Object allowedPaymentBrand) {
    this.allowedPaymentBrand = allowedPaymentBrand;
  }

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest allowedPaymentBrand(Object allowedPaymentBrand) {
    this.allowedPaymentBrand = allowedPaymentBrand;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return cashBackFlag
  **/
  @JsonProperty("CashBackFlag")
  @NotNull
  public Object getCashBackFlag() {
    return cashBackFlag;
  }

  public void setCashBackFlag(Object cashBackFlag) {
    this.cashBackFlag = cashBackFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest cashBackFlag(Object cashBackFlag) {
    this.cashBackFlag = cashBackFlag;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return forceCustomerSelectionFlag
  **/
  @JsonProperty("ForceCustomerSelectionFlag")
  @NotNull
  public Object getForceCustomerSelectionFlag() {
    return forceCustomerSelectionFlag;
  }

  public void setForceCustomerSelectionFlag(Object forceCustomerSelectionFlag) {
    this.forceCustomerSelectionFlag = forceCustomerSelectionFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest forceCustomerSelectionFlag(Object forceCustomerSelectionFlag) {
    this.forceCustomerSelectionFlag = forceCustomerSelectionFlag;
    return this;
  }

 /**
   * Additional attribute of the service type.&lt;br/&gt;- **CRDP: CardPayment**  : *Card payment.*&lt;br/&gt;- **CSHW: CashAdvance**  : *Cash advance or withdrawals on a POI (Point Of Interaction), or at a bank counter.*&lt;br/&gt;- **CSHD: CashDeposit**  : *Cash deposit.*&lt;br/&gt;- **IRES: InitialReservation**  : *Initial reservation.*&lt;br/&gt;- **DEFR: DeferredPayment**  : *Deferred payment.*&lt;br/&gt;- **URES: UpdateReservation**  : *Update reservation.*&lt;br/&gt;- **PRES: PaymentReservation**  : *Payment after reservation.*&lt;br/&gt;- **RECP: RecurringPayment**  : *Recurring payment.*&lt;br/&gt;- **INSP: Instalment**  : *Instalment payment.*&lt;br/&gt;- **INSI: IssuerInstalment**  : *Instalment payment transaction performed by the card issuer.*&lt;br/&gt;- **RFND: Refund**  : *Refund transaction.*&lt;br/&gt;- **VCAU: VoiceAuthorisation**  : *Voice authorisation.*&lt;br/&gt;
   * @return paymentType
  **/
  @JsonProperty("PaymentType")
  @NotNull
  public Object getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(Object paymentType) {
    this.paymentType = paymentType;
  }

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest paymentType(Object paymentType) {
    this.paymentType = paymentType;
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

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest saleToAcquirerData(Object saleToAcquirerData) {
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

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest saleToIssuerData(Object saleToIssuerData) {
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

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest saleToPOIData(Object saleToPOIData) {
    this.saleToPOIData = saleToPOIData;
    return this;
  }

 /**
   * Get saleTransactionIdentification
   * @return saleTransactionIdentification
  **/
  @JsonProperty("SaleTransactionIdentification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getSaleTransactionIdentification() {
    return saleTransactionIdentification;
  }

  public void setSaleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest saleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
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

  public PoipoiIdfinancialServiceServiceRequestCardAcquisitionRequest totalAmount(Object totalAmount) {
    this.totalAmount = totalAmount;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
