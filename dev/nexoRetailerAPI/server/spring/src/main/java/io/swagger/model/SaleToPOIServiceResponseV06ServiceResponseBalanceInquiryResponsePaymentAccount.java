package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data related to an account.&lt;br/&gt;
 */
@Schema(description = "Data related to an account.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount   {
  @JsonProperty("Currency")
  private Object currency = null;

  @JsonProperty("CurrentBalance")
  private Object currentBalance = null;

  @JsonProperty("PaymentAcquirerData")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer paymentAcquirerData = null;

  public SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount currency(Object currency) {
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

  public SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount currentBalance(Object currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return currentBalance
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(Object currentBalance) {
    this.currentBalance = currentBalance;
  }

  public SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount paymentAcquirerData(PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer paymentAcquirerData) {
    this.paymentAcquirerData = paymentAcquirerData;
    return this;
  }

  /**
   * Get paymentAcquirerData
   * @return paymentAcquirerData
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer getPaymentAcquirerData() {
    return paymentAcquirerData;
  }

  public void setPaymentAcquirerData(PoipoiIdfinancialServiceServiceRequestEnvironmentAcquirer paymentAcquirerData) {
    this.paymentAcquirerData = paymentAcquirerData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount saleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount = (SaleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount) o;
    return Objects.equals(this.currency, saleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount.currency) &&
        Objects.equals(this.currentBalance, saleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount.currentBalance) &&
        Objects.equals(this.paymentAcquirerData, saleToPOIServiceResponseV06ServiceResponseBalanceInquiryResponsePaymentAccount.paymentAcquirerData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, currentBalance, paymentAcquirerData);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
