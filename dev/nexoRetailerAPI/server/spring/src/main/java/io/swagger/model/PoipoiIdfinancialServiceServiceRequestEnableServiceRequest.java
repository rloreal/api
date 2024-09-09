package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data to request to enable a service.&lt;br/&gt;
 */
@Schema(description = "Data to request to enable a service.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnableServiceRequest   {
  @JsonProperty("DisplayOutput")
  private PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput displayOutput = null;

  @JsonProperty("ServicesEnabled")
  private Object servicesEnabled = null;

  @JsonProperty("TransactionAction")
  private Object transactionAction = null;

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequest displayOutput(PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput displayOutput) {
    this.displayOutput = displayOutput;
    return this;
  }

  /**
   * Get displayOutput
   * @return displayOutput
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput getDisplayOutput() {
    return displayOutput;
  }

  public void setDisplayOutput(PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput displayOutput) {
    this.displayOutput = displayOutput;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequest servicesEnabled(Object servicesEnabled) {
    this.servicesEnabled = servicesEnabled;
    return this;
  }

  /**
   * List of specific services for ServiceRequest<br/>- **FSPQ: FinancialPaymentRequest**  : *The Sale System requests to the POI System to perform a payment(Purchase/Refund/PWCB/MOTO Payment/...).*<br/>- **FSRQ: FinancialReversalRequest**  : *The Sale System requests to the POI System to perform a reversal partial or complete to cancel a former payment service.*<br/>- **FSIQ: FinancialBalanceInquiryRequest**  : *The Sale System requests to the POI System to perform balance inquiry on the main account.*<br/>- **FSBQ: FinancialBatchRequest**  : *The Batch message pair is used to request or get the result of transactions (payment, loyalty and reversal) performed without connection to the Sale system (Payment delivery).*<br/>- **FSLQ: FinancialLoyaltyRequest**  : *The Sale System requests to the POI System a loyalty service like loading or redeem.*<br/>- **FSVQ: FinancialStoredValueRequest**  : *The Sale System requests to the POI System to manage a stored value card or account (eg. Load, Payment, Reimbursement).*<br/>- **FSEQ: FinancialEnableServiceRequest**  : *The Sale System requests to the POI System to enable a service on its side.*<br/>- **FSAQ: FinancialCardAcquisitionRequest**  : *The Sale System requests to the POI System to handle a card data acquisition on the card reader.*<br/>- **FSCQ: FinancialReconciliationRequest**  : *The Sale System request to the POI System different kinds of transaction reconciliation.*<br/>
   * @return servicesEnabled
   **/
  @Schema(description = "List of specific services for ServiceRequest<br/>- **FSPQ: FinancialPaymentRequest**  : *The Sale System requests to the POI System to perform a payment(Purchase/Refund/PWCB/MOTO Payment/...).*<br/>- **FSRQ: FinancialReversalRequest**  : *The Sale System requests to the POI System to perform a reversal partial or complete to cancel a former payment service.*<br/>- **FSIQ: FinancialBalanceInquiryRequest**  : *The Sale System requests to the POI System to perform balance inquiry on the main account.*<br/>- **FSBQ: FinancialBatchRequest**  : *The Batch message pair is used to request or get the result of transactions (payment, loyalty and reversal) performed without connection to the Sale system (Payment delivery).*<br/>- **FSLQ: FinancialLoyaltyRequest**  : *The Sale System requests to the POI System a loyalty service like loading or redeem.*<br/>- **FSVQ: FinancialStoredValueRequest**  : *The Sale System requests to the POI System to manage a stored value card or account (eg. Load, Payment, Reimbursement).*<br/>- **FSEQ: FinancialEnableServiceRequest**  : *The Sale System requests to the POI System to enable a service on its side.*<br/>- **FSAQ: FinancialCardAcquisitionRequest**  : *The Sale System requests to the POI System to handle a card data acquisition on the card reader.*<br/>- **FSCQ: FinancialReconciliationRequest**  : *The Sale System request to the POI System different kinds of transaction reconciliation.*<br/>")
      @NotNull

    public Object getServicesEnabled() {
    return servicesEnabled;
  }

  public void setServicesEnabled(Object servicesEnabled) {
    this.servicesEnabled = servicesEnabled;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequest transactionAction(Object transactionAction) {
    this.transactionAction = transactionAction;
    return this;
  }

  /**
   * Action to realise on a transaction.<br/>- **STAR: StartTransaction**  : *Start a transaction by a swipe ahead mechanism, with the services which are enabled.*<br/>- **STOP: Stop**  : *Keep quite after a swipe ahead mechanism.*<br/>
   * @return transactionAction
   **/
  @Schema(required = true, description = "Action to realise on a transaction.<br/>- **STAR: StartTransaction**  : *Start a transaction by a swipe ahead mechanism, with the services which are enabled.*<br/>- **STOP: Stop**  : *Keep quite after a swipe ahead mechanism.*<br/>")
      @NotNull

    public Object getTransactionAction() {
    return transactionAction;
  }

  public void setTransactionAction(Object transactionAction) {
    this.transactionAction = transactionAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnableServiceRequest poipoiIdfinancialServiceServiceRequestEnableServiceRequest = (PoipoiIdfinancialServiceServiceRequestEnableServiceRequest) o;
    return Objects.equals(this.displayOutput, poipoiIdfinancialServiceServiceRequestEnableServiceRequest.displayOutput) &&
        Objects.equals(this.servicesEnabled, poipoiIdfinancialServiceServiceRequestEnableServiceRequest.servicesEnabled) &&
        Objects.equals(this.transactionAction, poipoiIdfinancialServiceServiceRequestEnableServiceRequest.transactionAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayOutput, servicesEnabled, transactionAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnableServiceRequest {\n");
    
    sb.append("    displayOutput: ").append(toIndentedString(displayOutput)).append("\n");
    sb.append("    servicesEnabled: ").append(toIndentedString(servicesEnabled)).append("\n");
    sb.append("    transactionAction: ").append(toIndentedString(transactionAction)).append("\n");
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
