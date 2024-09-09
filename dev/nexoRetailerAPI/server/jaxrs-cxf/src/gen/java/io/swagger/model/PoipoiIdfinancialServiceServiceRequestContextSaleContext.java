package io.swagger.model;

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
  * Sale context in which the transaction is performed.<br/>
 **/
@Schema(description="Sale context in which the transaction is performed.<br/>")
public class PoipoiIdfinancialServiceServiceRequestContextSaleContext   {
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object additionalSaleData = null;
  
  @Schema(description = "Type of card data reading.")
 /**
   * Type of card data reading.  
  **/
  private Object allowedEntryMode = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object cashierIdentification = null;
  
  @Schema(description = "Languages used by the cashier.")
 /**
   * Languages used by the cashier.  
  **/
  private Object cashierLanguage = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object customerOrderRequestFlag = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object deliveryNoteNumber = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object forceOnlineFlag = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object invoiceNumber = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object purchaseOrderNumber = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object reuseCardDataFlag = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object remainingAmount = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object saleIdentification = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object saleReconciliationIdentification = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object saleReferenceNumber = null;
  
  @Schema(description = "Scope of the token that identifies the payment mean of the customer.<br/>- **MULT: MultipleUse**  : *The token is generated to recognise a customer for a longer period.*<br/>- **SNGL: SingleUse**  : *The token is generated to recognise  a customer during the lifetime of a transaction.*<br/>")
 /**
   * Scope of the token that identifies the payment mean of the customer.<br/>- **MULT: MultipleUse**  : *The token is generated to recognise a customer for a longer period.*<br/>- **SNGL: SingleUse**  : *The token is generated to recognise  a customer during the lifetime of a transaction.*<br/>  
  **/
  private Object saleTokenScope = null;
  
  @Schema(description = "Specifies a numeric string with a maximum length of 2 digits.<br/>")
 /**
   * Specifies a numeric string with a maximum length of 2 digits.<br/>  
  **/
  private Object shiftNumber = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object splitPayment = null;
  
  @Schema(description = "Merchant using the payment services of a payment facilitator, acting as a card acceptor.")
 /**
   * Merchant using the payment services of a payment facilitator, acting as a card acceptor.  
  **/
  private Object sponsoredMerchant = null;
 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return additionalSaleData
  **/
  @JsonProperty("AdditionalSaleData")
  @NotNull
  public Object getAdditionalSaleData() {
    return additionalSaleData;
  }

  public void setAdditionalSaleData(Object additionalSaleData) {
    this.additionalSaleData = additionalSaleData;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext additionalSaleData(Object additionalSaleData) {
    this.additionalSaleData = additionalSaleData;
    return this;
  }

 /**
   * Type of card data reading.
   * @return allowedEntryMode
  **/
  @JsonProperty("AllowedEntryMode")
  @NotNull
  public Object getAllowedEntryMode() {
    return allowedEntryMode;
  }

  public void setAllowedEntryMode(Object allowedEntryMode) {
    this.allowedEntryMode = allowedEntryMode;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext allowedEntryMode(Object allowedEntryMode) {
    this.allowedEntryMode = allowedEntryMode;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return cashierIdentification
  **/
  @JsonProperty("CashierIdentification")
  @NotNull
  public Object getCashierIdentification() {
    return cashierIdentification;
  }

  public void setCashierIdentification(Object cashierIdentification) {
    this.cashierIdentification = cashierIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext cashierIdentification(Object cashierIdentification) {
    this.cashierIdentification = cashierIdentification;
    return this;
  }

 /**
   * Languages used by the cashier.
   * @return cashierLanguage
  **/
  @JsonProperty("CashierLanguage")
  @NotNull
  public Object getCashierLanguage() {
    return cashierLanguage;
  }

  public void setCashierLanguage(Object cashierLanguage) {
    this.cashierLanguage = cashierLanguage;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext cashierLanguage(Object cashierLanguage) {
    this.cashierLanguage = cashierLanguage;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return customerOrderRequestFlag
  **/
  @JsonProperty("CustomerOrderRequestFlag")
  @NotNull
  public Object getCustomerOrderRequestFlag() {
    return customerOrderRequestFlag;
  }

  public void setCustomerOrderRequestFlag(Object customerOrderRequestFlag) {
    this.customerOrderRequestFlag = customerOrderRequestFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext customerOrderRequestFlag(Object customerOrderRequestFlag) {
    this.customerOrderRequestFlag = customerOrderRequestFlag;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return deliveryNoteNumber
  **/
  @JsonProperty("DeliveryNoteNumber")
  @NotNull
  public Object getDeliveryNoteNumber() {
    return deliveryNoteNumber;
  }

  public void setDeliveryNoteNumber(Object deliveryNoteNumber) {
    this.deliveryNoteNumber = deliveryNoteNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext deliveryNoteNumber(Object deliveryNoteNumber) {
    this.deliveryNoteNumber = deliveryNoteNumber;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return forceOnlineFlag
  **/
  @JsonProperty("ForceOnlineFlag")
  @NotNull
  public Object getForceOnlineFlag() {
    return forceOnlineFlag;
  }

  public void setForceOnlineFlag(Object forceOnlineFlag) {
    this.forceOnlineFlag = forceOnlineFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext forceOnlineFlag(Object forceOnlineFlag) {
    this.forceOnlineFlag = forceOnlineFlag;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return invoiceNumber
  **/
  @JsonProperty("InvoiceNumber")
  @NotNull
  public Object getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(Object invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext invoiceNumber(Object invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return purchaseOrderNumber
  **/
  @JsonProperty("PurchaseOrderNumber")
  @NotNull
  public Object getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(Object purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext purchaseOrderNumber(Object purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return reuseCardDataFlag
  **/
  @JsonProperty("ReuseCardDataFlag")
  @NotNull
  public Object getReuseCardDataFlag() {
    return reuseCardDataFlag;
  }

  public void setReuseCardDataFlag(Object reuseCardDataFlag) {
    this.reuseCardDataFlag = reuseCardDataFlag;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext reuseCardDataFlag(Object reuseCardDataFlag) {
    this.reuseCardDataFlag = reuseCardDataFlag;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return remainingAmount
  **/
  @JsonProperty("RemainingAmount")
  @NotNull
  public Object getRemainingAmount() {
    return remainingAmount;
  }

  public void setRemainingAmount(Object remainingAmount) {
    this.remainingAmount = remainingAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext remainingAmount(Object remainingAmount) {
    this.remainingAmount = remainingAmount;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return saleIdentification
  **/
  @JsonProperty("SaleIdentification")
  @NotNull
  public Object getSaleIdentification() {
    return saleIdentification;
  }

  public void setSaleIdentification(Object saleIdentification) {
    this.saleIdentification = saleIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext saleIdentification(Object saleIdentification) {
    this.saleIdentification = saleIdentification;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return saleReconciliationIdentification
  **/
  @JsonProperty("SaleReconciliationIdentification")
  @NotNull
  public Object getSaleReconciliationIdentification() {
    return saleReconciliationIdentification;
  }

  public void setSaleReconciliationIdentification(Object saleReconciliationIdentification) {
    this.saleReconciliationIdentification = saleReconciliationIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext saleReconciliationIdentification(Object saleReconciliationIdentification) {
    this.saleReconciliationIdentification = saleReconciliationIdentification;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return saleReferenceNumber
  **/
  @JsonProperty("SaleReferenceNumber")
  @NotNull
  public Object getSaleReferenceNumber() {
    return saleReferenceNumber;
  }

  public void setSaleReferenceNumber(Object saleReferenceNumber) {
    this.saleReferenceNumber = saleReferenceNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext saleReferenceNumber(Object saleReferenceNumber) {
    this.saleReferenceNumber = saleReferenceNumber;
    return this;
  }

 /**
   * Scope of the token that identifies the payment mean of the customer.&lt;br/&gt;- **MULT: MultipleUse**  : *The token is generated to recognise a customer for a longer period.*&lt;br/&gt;- **SNGL: SingleUse**  : *The token is generated to recognise  a customer during the lifetime of a transaction.*&lt;br/&gt;
   * @return saleTokenScope
  **/
  @JsonProperty("SaleTokenScope")
  @NotNull
  public Object getSaleTokenScope() {
    return saleTokenScope;
  }

  public void setSaleTokenScope(Object saleTokenScope) {
    this.saleTokenScope = saleTokenScope;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext saleTokenScope(Object saleTokenScope) {
    this.saleTokenScope = saleTokenScope;
    return this;
  }

 /**
   * Specifies a numeric string with a maximum length of 2 digits.&lt;br/&gt;
   * @return shiftNumber
  **/
  @JsonProperty("ShiftNumber")
  @NotNull
  public Object getShiftNumber() {
    return shiftNumber;
  }

  public void setShiftNumber(Object shiftNumber) {
    this.shiftNumber = shiftNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext shiftNumber(Object shiftNumber) {
    this.shiftNumber = shiftNumber;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return splitPayment
  **/
  @JsonProperty("SplitPayment")
  @NotNull
  public Object getSplitPayment() {
    return splitPayment;
  }

  public void setSplitPayment(Object splitPayment) {
    this.splitPayment = splitPayment;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext splitPayment(Object splitPayment) {
    this.splitPayment = splitPayment;
    return this;
  }

 /**
   * Merchant using the payment services of a payment facilitator, acting as a card acceptor.
   * @return sponsoredMerchant
  **/
  @JsonProperty("SponsoredMerchant")
  @NotNull
  public Object getSponsoredMerchant() {
    return sponsoredMerchant;
  }

  public void setSponsoredMerchant(Object sponsoredMerchant) {
    this.sponsoredMerchant = sponsoredMerchant;
  }

  public PoipoiIdfinancialServiceServiceRequestContextSaleContext sponsoredMerchant(Object sponsoredMerchant) {
    this.sponsoredMerchant = sponsoredMerchant;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
