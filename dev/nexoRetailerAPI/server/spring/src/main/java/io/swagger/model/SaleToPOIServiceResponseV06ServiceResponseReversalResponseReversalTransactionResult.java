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
 * Reversal transaction results after a reversal request.&lt;br/&gt;
 */
@Schema(description = "Reversal transaction results after a reversal request.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult   {
  @JsonProperty("CustomerOrder")
  private Object customerOrder = null;

  @JsonProperty("OriginalPaymentTransaction")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction originalPaymentTransaction = null;

  @JsonProperty("POIReconciliationIdentification")
  private Object poIReconciliationIdentification = null;

  public SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult customerOrder(Object customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

  /**
   * Updated Customer order list after reversal.
   * @return customerOrder
   **/
  @Schema(description = "Updated Customer order list after reversal.")
      @NotNull

    public Object getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(Object customerOrder) {
    this.customerOrder = customerOrder;
  }

  public SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult originalPaymentTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction originalPaymentTransaction) {
    this.originalPaymentTransaction = originalPaymentTransaction;
    return this;
  }

  /**
   * Get originalPaymentTransaction
   * @return originalPaymentTransaction
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction getOriginalPaymentTransaction() {
    return originalPaymentTransaction;
  }

  public void setOriginalPaymentTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransaction originalPaymentTransaction) {
    this.originalPaymentTransaction = originalPaymentTransaction;
  }

  public SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult poIReconciliationIdentification(Object poIReconciliationIdentification) {
    this.poIReconciliationIdentification = poIReconciliationIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return poIReconciliationIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getPoIReconciliationIdentification() {
    return poIReconciliationIdentification;
  }

  public void setPoIReconciliationIdentification(Object poIReconciliationIdentification) {
    this.poIReconciliationIdentification = poIReconciliationIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult saleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult = (SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult) o;
    return Objects.equals(this.customerOrder, saleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult.customerOrder) &&
        Objects.equals(this.originalPaymentTransaction, saleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult.originalPaymentTransaction) &&
        Objects.equals(this.poIReconciliationIdentification, saleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult.poIReconciliationIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOrder, originalPaymentTransaction, poIReconciliationIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponseReversalResponseReversalTransactionResult {\n");
    
    sb.append("    customerOrder: ").append(toIndentedString(customerOrder)).append("\n");
    sb.append("    originalPaymentTransaction: ").append(toIndentedString(originalPaymentTransaction)).append("\n");
    sb.append("    poIReconciliationIdentification: ").append(toIndentedString(poIReconciliationIdentification)).append("\n");
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
