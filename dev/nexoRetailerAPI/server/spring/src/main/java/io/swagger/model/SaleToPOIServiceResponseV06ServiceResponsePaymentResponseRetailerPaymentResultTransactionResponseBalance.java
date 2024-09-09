package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Signed amount.&lt;br/&gt;
 */
@Schema(description = "Signed amount.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance   {
  @JsonProperty("Amount")
  private Object amount = null;

  @JsonProperty("Currency")
  private Object currency = null;

  @JsonProperty("Sign")
  private Object sign = null;

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance amount(Object amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return amount
   **/
  @Schema(example = "500000", required = true, description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getAmount() {
    return amount;
  }

  public void setAmount(Object amount) {
    this.amount = amount;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance currency(Object currency) {
    this.currency = currency;
    return this;
  }

  /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>
   * @return currency
   **/
  @Schema(example = "EUR", required = true, description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>")
      @NotNull

    public Object getCurrency() {
    return currency;
  }

  public void setCurrency(Object currency) {
    this.currency = currency;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance sign(Object sign) {
    this.sign = sign;
    return this;
  }

  /**
   * Indicates a positive or negative value.<br/>
   * @return sign
   **/
  @Schema(description = "Indicates a positive or negative value.<br/>")
      @NotNull

    public Object getSign() {
    return sign;
  }

  public void setSign(Object sign) {
    this.sign = sign;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance = (SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance) o;
    return Objects.equals(this.amount, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance.amount) &&
        Objects.equals(this.currency, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance.currency) &&
        Objects.equals(this.sign, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance.sign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, sign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseBalance {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
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
