package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer;
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
  * Data related to an account.<br/>
 **/
@Schema(description="Data related to an account.<br/>")
public class SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount   {
  
  @Schema(example = "EUR", description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>")
 /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>  
  **/
  private Object currency = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object currentBalance = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer paymentAcquirerData = null;
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

  public SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount currency(Object currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return currentBalance
  **/
  @JsonProperty("CurrentBalance")
  @NotNull
  public Object getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(Object currentBalance) {
    this.currentBalance = currentBalance;
  }

  public SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount currentBalance(Object currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }

 /**
   * Get paymentAcquirerData
   * @return paymentAcquirerData
  **/
  @JsonProperty("PaymentAcquirerData")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer getPaymentAcquirerData() {
    return paymentAcquirerData;
  }

  public void setPaymentAcquirerData(PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer paymentAcquirerData) {
    this.paymentAcquirerData = paymentAcquirerData;
  }

  public SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount paymentAcquirerData(PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer paymentAcquirerData) {
    this.paymentAcquirerData = paymentAcquirerData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    paymentAcquirerData: ").append(toIndentedString(paymentAcquirerData)).append("\n");
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
