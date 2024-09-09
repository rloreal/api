package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sale context in which the transaction is performed.&lt;br/&gt;
 */
@Schema(description = "Sale context in which the transaction is performed.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestContextSaleContext   {
  @JsonProperty("AdditionalSaleData")
  private Object additionalSaleData = null;

  @JsonProperty("AllowedEntryMode")
  private Object allowedEntryMode = null;

  @JsonProperty("CashierIdentification")
  private Object cashierIdentification = null;

  @JsonProperty("CashierLanguage")
  private Object cashierLanguage = null;

  @JsonProperty("CustomerOrderRequestFlag")
  private Object customerOrderRequestFlag = null;

  @JsonProperty("DeliveryNoteNumber")
  private Object deliveryNoteNumber = null;

  @JsonProperty("ForceOnlineFlag")
  private Object forceOnlineFlag = null;

  @JsonProperty("InvoiceNumber")
  private Object invoiceNumber = null;

  @JsonProperty("PurchaseOrderNumber")
  private Object purchaseOrderNumber = null;

  @JsonProperty("ReuseCardDataFlag")
  private Object reuseCardDataFlag = null;

  @JsonProperty("RemainingAmount")
  private Object remainingAmount = null;

  @JsonProperty("SaleIdentification")
  private Object saleIdentification = null;

  @JsonProperty("SaleReconciliationIdentification")
  private Object saleReconciliationIdentification = null;

  @JsonProperty("SaleReferenceNumber")
  private Object saleReferenceNumber = null;

  @JsonProperty("SaleTokenScope")
  private Object saleTokenScope = null;

  @JsonProperty("ShiftNumber")
  private Object shiftNumber = null;

  @JsonProperty("SplitPayment")
  private Object splitPayment = null;

  @JsonProperty("SponsoredMerchant")
  private Object sponsoredMerchant = null;

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext additionalSaleData(Object additionalSaleData) {
    this.additionalSaleData = additionalSaleData;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return additionalSaleData
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getAdditionalSaleData() {
    return additionalSaleData;
  }

  public void setAdditionalSaleData(Object additionalSaleData) {
    this.additionalSaleData = additionalSaleData;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext allowedEntryMode(Object allowedEntryMode) {
    this.allowedEntryMode = allowedEntryMode;
    return this;
  }

  /**
   * Type of card data reading.
   * @return allowedEntryMode
   **/
  @Schema(description = "Type of card data reading.")
      @NotNull

    public Object getAllowedEntryMode() {
    return allowedEntryMode;
  }

  public void setAllowedEntryMode(Object allowedEntryMode) {
    this.allowedEntryMode = allowedEntryMode;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext cashierIdentification(Object cashierIdentification) {
    this.cashierIdentification = cashierIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return cashierIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getCashierIdentification() {
    return cashierIdentification;
  }

  public void setCashierIdentification(Object cashierIdentification) {
    this.cashierIdentification = cashierIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext cashierLanguage(Object cashierLanguage) {
    this.cashierLanguage = cashierLanguage;
    return this;
  }

  /**
   * Languages used by the cashier.
   * @return cashierLanguage
   **/
  @Schema(description = "Languages used by the cashier.")
      @NotNull

    public Object getCashierLanguage() {
    return cashierLanguage;
  }

  public void setCashierLanguage(Object cashierLanguage) {
    this.cashierLanguage = cashierLanguage;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext customerOrderRequestFlag(Object customerOrderRequestFlag) {
    this.customerOrderRequestFlag = customerOrderRequestFlag;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return customerOrderRequestFlag
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getCustomerOrderRequestFlag() {
    return customerOrderRequestFlag;
  }

  public void setCustomerOrderRequestFlag(Object customerOrderRequestFlag) {
    this.customerOrderRequestFlag = customerOrderRequestFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext deliveryNoteNumber(Object deliveryNoteNumber) {
    this.deliveryNoteNumber = deliveryNoteNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return deliveryNoteNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getDeliveryNoteNumber() {
    return deliveryNoteNumber;
  }

  public void setDeliveryNoteNumber(Object deliveryNoteNumber) {
    this.deliveryNoteNumber = deliveryNoteNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext forceOnlineFlag(Object forceOnlineFlag) {
    this.forceOnlineFlag = forceOnlineFlag;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return forceOnlineFlag
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getForceOnlineFlag() {
    return forceOnlineFlag;
  }

  public void setForceOnlineFlag(Object forceOnlineFlag) {
    this.forceOnlineFlag = forceOnlineFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext invoiceNumber(Object invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return invoiceNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(Object invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext purchaseOrderNumber(Object purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return purchaseOrderNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(Object purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext reuseCardDataFlag(Object reuseCardDataFlag) {
    this.reuseCardDataFlag = reuseCardDataFlag;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return reuseCardDataFlag
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getReuseCardDataFlag() {
    return reuseCardDataFlag;
  }

  public void setReuseCardDataFlag(Object reuseCardDataFlag) {
    this.reuseCardDataFlag = reuseCardDataFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext remainingAmount(Object remainingAmount) {
    this.remainingAmount = remainingAmount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return remainingAmount
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getRemainingAmount() {
    return remainingAmount;
  }

  public void setRemainingAmount(Object remainingAmount) {
    this.remainingAmount = remainingAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext saleIdentification(Object saleIdentification) {
    this.saleIdentification = saleIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return saleIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getSaleIdentification() {
    return saleIdentification;
  }

  public void setSaleIdentification(Object saleIdentification) {
    this.saleIdentification = saleIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext saleReconciliationIdentification(Object saleReconciliationIdentification) {
    this.saleReconciliationIdentification = saleReconciliationIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return saleReconciliationIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getSaleReconciliationIdentification() {
    return saleReconciliationIdentification;
  }

  public void setSaleReconciliationIdentification(Object saleReconciliationIdentification) {
    this.saleReconciliationIdentification = saleReconciliationIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext saleReferenceNumber(Object saleReferenceNumber) {
    this.saleReferenceNumber = saleReferenceNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return saleReferenceNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getSaleReferenceNumber() {
    return saleReferenceNumber;
  }

  public void setSaleReferenceNumber(Object saleReferenceNumber) {
    this.saleReferenceNumber = saleReferenceNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext saleTokenScope(Object saleTokenScope) {
    this.saleTokenScope = saleTokenScope;
    return this;
  }

  /**
   * Scope of the token that identifies the payment mean of the customer.<br/>- **MULT: MultipleUse**  : *The token is generated to recognise a customer for a longer period.*<br/>- **SNGL: SingleUse**  : *The token is generated to recognise  a customer during the lifetime of a transaction.*<br/>
   * @return saleTokenScope
   **/
  @Schema(description = "Scope of the token that identifies the payment mean of the customer.<br/>- **MULT: MultipleUse**  : *The token is generated to recognise a customer for a longer period.*<br/>- **SNGL: SingleUse**  : *The token is generated to recognise  a customer during the lifetime of a transaction.*<br/>")
      @NotNull

    public Object getSaleTokenScope() {
    return saleTokenScope;
  }

  public void setSaleTokenScope(Object saleTokenScope) {
    this.saleTokenScope = saleTokenScope;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext shiftNumber(Object shiftNumber) {
    this.shiftNumber = shiftNumber;
    return this;
  }

  /**
   * Specifies a numeric string with a maximum length of 2 digits.<br/>
   * @return shiftNumber
   **/
  @Schema(description = "Specifies a numeric string with a maximum length of 2 digits.<br/>")
      @NotNull

    public Object getShiftNumber() {
    return shiftNumber;
  }

  public void setShiftNumber(Object shiftNumber) {
    this.shiftNumber = shiftNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext splitPayment(Object splitPayment) {
    this.splitPayment = splitPayment;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return splitPayment
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getSplitPayment() {
    return splitPayment;
  }

  public void setSplitPayment(Object splitPayment) {
    this.splitPayment = splitPayment;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext sponsoredMerchant(Object sponsoredMerchant) {
    this.sponsoredMerchant = sponsoredMerchant;
    return this;
  }

  /**
   * Merchant using the payment services of a payment facilitator, acting as a card acceptor.
   * @return sponsoredMerchant
   **/
  @Schema(description = "Merchant using the payment services of a payment facilitator, acting as a card acceptor.")
      @NotNull

    public Object getSponsoredMerchant() {
    return sponsoredMerchant;
  }

  public void setSponsoredMerchant(Object sponsoredMerchant) {
    this.sponsoredMerchant = sponsoredMerchant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestContextSaleContext poipoiIdfinancialServiceServiceRequestContextSaleContext = (PoipoiIdfinancialServiceServiceRequestContextSaleContext) o;
    return Objects.equals(this.additionalSaleData, poipoiIdfinancialServiceServiceRequestContextSaleContext.additionalSaleData) &&
        Objects.equals(this.allowedEntryMode, poipoiIdfinancialServiceServiceRequestContextSaleContext.allowedEntryMode) &&
        Objects.equals(this.cashierIdentification, poipoiIdfinancialServiceServiceRequestContextSaleContext.cashierIdentification) &&
        Objects.equals(this.cashierLanguage, poipoiIdfinancialServiceServiceRequestContextSaleContext.cashierLanguage) &&
        Objects.equals(this.customerOrderRequestFlag, poipoiIdfinancialServiceServiceRequestContextSaleContext.customerOrderRequestFlag) &&
        Objects.equals(this.deliveryNoteNumber, poipoiIdfinancialServiceServiceRequestContextSaleContext.deliveryNoteNumber) &&
        Objects.equals(this.forceOnlineFlag, poipoiIdfinancialServiceServiceRequestContextSaleContext.forceOnlineFlag) &&
        Objects.equals(this.invoiceNumber, poipoiIdfinancialServiceServiceRequestContextSaleContext.invoiceNumber) &&
        Objects.equals(this.purchaseOrderNumber, poipoiIdfinancialServiceServiceRequestContextSaleContext.purchaseOrderNumber) &&
        Objects.equals(this.reuseCardDataFlag, poipoiIdfinancialServiceServiceRequestContextSaleContext.reuseCardDataFlag) &&
        Objects.equals(this.remainingAmount, poipoiIdfinancialServiceServiceRequestContextSaleContext.remainingAmount) &&
        Objects.equals(this.saleIdentification, poipoiIdfinancialServiceServiceRequestContextSaleContext.saleIdentification) &&
        Objects.equals(this.saleReconciliationIdentification, poipoiIdfinancialServiceServiceRequestContextSaleContext.saleReconciliationIdentification) &&
        Objects.equals(this.saleReferenceNumber, poipoiIdfinancialServiceServiceRequestContextSaleContext.saleReferenceNumber) &&
        Objects.equals(this.saleTokenScope, poipoiIdfinancialServiceServiceRequestContextSaleContext.saleTokenScope) &&
        Objects.equals(this.shiftNumber, poipoiIdfinancialServiceServiceRequestContextSaleContext.shiftNumber) &&
        Objects.equals(this.splitPayment, poipoiIdfinancialServiceServiceRequestContextSaleContext.splitPayment) &&
        Objects.equals(this.sponsoredMerchant, poipoiIdfinancialServiceServiceRequestContextSaleContext.sponsoredMerchant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalSaleData, allowedEntryMode, cashierIdentification, cashierLanguage, customerOrderRequestFlag, deliveryNoteNumber, forceOnlineFlag, invoiceNumber, purchaseOrderNumber, reuseCardDataFlag, remainingAmount, saleIdentification, saleReconciliationIdentification, saleReferenceNumber, saleTokenScope, shiftNumber, splitPayment, sponsoredMerchant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextSaleContext {\n");
    
    sb.append("    additionalSaleData: ").append(toIndentedString(additionalSaleData)).append("\n");
    sb.append("    allowedEntryMode: ").append(toIndentedString(allowedEntryMode)).append("\n");
    sb.append("    cashierIdentification: ").append(toIndentedString(cashierIdentification)).append("\n");
    sb.append("    cashierLanguage: ").append(toIndentedString(cashierLanguage)).append("\n");
    sb.append("    customerOrderRequestFlag: ").append(toIndentedString(customerOrderRequestFlag)).append("\n");
    sb.append("    deliveryNoteNumber: ").append(toIndentedString(deliveryNoteNumber)).append("\n");
    sb.append("    forceOnlineFlag: ").append(toIndentedString(forceOnlineFlag)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    reuseCardDataFlag: ").append(toIndentedString(reuseCardDataFlag)).append("\n");
    sb.append("    remainingAmount: ").append(toIndentedString(remainingAmount)).append("\n");
    sb.append("    saleIdentification: ").append(toIndentedString(saleIdentification)).append("\n");
    sb.append("    saleReconciliationIdentification: ").append(toIndentedString(saleReconciliationIdentification)).append("\n");
    sb.append("    saleReferenceNumber: ").append(toIndentedString(saleReferenceNumber)).append("\n");
    sb.append("    saleTokenScope: ").append(toIndentedString(saleTokenScope)).append("\n");
    sb.append("    shiftNumber: ").append(toIndentedString(shiftNumber)).append("\n");
    sb.append("    splitPayment: ").append(toIndentedString(splitPayment)).append("\n");
    sb.append("    sponsoredMerchant: ").append(toIndentedString(sponsoredMerchant)).append("\n");
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
