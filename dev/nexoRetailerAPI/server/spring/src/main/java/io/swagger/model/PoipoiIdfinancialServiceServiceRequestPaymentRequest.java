package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data required to request a Payment.&lt;br/&gt;
 */
@Schema(description = "Data required to request a Payment.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestPaymentRequest   {
  @JsonProperty("LoyaltyData")
  private Object loyaltyData = null;

  @JsonProperty("PaymentTransaction")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction paymentTransaction = null;

  public PoipoiIdfinancialServiceServiceRequestPaymentRequest loyaltyData(Object loyaltyData) {
    this.loyaltyData = loyaltyData;
    return this;
  }

  /**
   * Data linked to card loyalty during payment.
   * @return loyaltyData
   **/
  @Schema(description = "Data linked to card loyalty during payment.")
      @NotNull

    public Object getLoyaltyData() {
    return loyaltyData;
  }

  public void setLoyaltyData(Object loyaltyData) {
    this.loyaltyData = loyaltyData;
  }

  public PoipoiIdfinancialServiceServiceRequestPaymentRequest paymentTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
    return this;
  }

  /**
   * Get paymentTransaction
   * @return paymentTransaction
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestPaymentRequest poipoiIdfinancialServiceServiceRequestPaymentRequest = (PoipoiIdfinancialServiceServiceRequestPaymentRequest) o;
    return Objects.equals(this.loyaltyData, poipoiIdfinancialServiceServiceRequestPaymentRequest.loyaltyData) &&
        Objects.equals(this.paymentTransaction, poipoiIdfinancialServiceServiceRequestPaymentRequest.paymentTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loyaltyData, paymentTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestPaymentRequest {\n");
    
    sb.append("    loyaltyData: ").append(toIndentedString(loyaltyData)).append("\n");
    sb.append("    paymentTransaction: ").append(toIndentedString(paymentTransaction)).append("\n");
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
