package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput;
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
  * Data to request to enable a service.<br/>
 **/
@Schema(description="Data to request to enable a service.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnableServiceRequest   {
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput displayOutput = null;
  
  @Schema(description = "List of specific services for ServiceRequest<br/>- **FSPQ: FinancialPaymentRequest**  : *The Sale System requests to the POI System to perform a payment(Purchase/Refund/PWCB/MOTO Payment/...).*<br/>- **FSRQ: FinancialReversalRequest**  : *The Sale System requests to the POI System to perform a reversal partial or complete to cancel a former payment service.*<br/>- **FSIQ: FinancialBalanceInquiryRequest**  : *The Sale System requests to the POI System to perform balance inquiry on the main account.*<br/>- **FSBQ: FinancialBatchRequest**  : *The Batch message pair is used to request or get the result of transactions (payment, loyalty and reversal) performed without connection to the Sale system (Payment delivery).*<br/>- **FSLQ: FinancialLoyaltyRequest**  : *The Sale System requests to the POI System a loyalty service like loading or redeem.*<br/>- **FSVQ: FinancialStoredValueRequest**  : *The Sale System requests to the POI System to manage a stored value card or account (eg. Load, Payment, Reimbursement).*<br/>- **FSEQ: FinancialEnableServiceRequest**  : *The Sale System requests to the POI System to enable a service on its side.*<br/>- **FSAQ: FinancialCardAcquisitionRequest**  : *The Sale System requests to the POI System to handle a card data acquisition on the card reader.*<br/>- **FSCQ: FinancialReconciliationRequest**  : *The Sale System request to the POI System different kinds of transaction reconciliation.*<br/>")
 /**
   * List of specific services for ServiceRequest<br/>- **FSPQ: FinancialPaymentRequest**  : *The Sale System requests to the POI System to perform a payment(Purchase/Refund/PWCB/MOTO Payment/...).*<br/>- **FSRQ: FinancialReversalRequest**  : *The Sale System requests to the POI System to perform a reversal partial or complete to cancel a former payment service.*<br/>- **FSIQ: FinancialBalanceInquiryRequest**  : *The Sale System requests to the POI System to perform balance inquiry on the main account.*<br/>- **FSBQ: FinancialBatchRequest**  : *The Batch message pair is used to request or get the result of transactions (payment, loyalty and reversal) performed without connection to the Sale system (Payment delivery).*<br/>- **FSLQ: FinancialLoyaltyRequest**  : *The Sale System requests to the POI System a loyalty service like loading or redeem.*<br/>- **FSVQ: FinancialStoredValueRequest**  : *The Sale System requests to the POI System to manage a stored value card or account (eg. Load, Payment, Reimbursement).*<br/>- **FSEQ: FinancialEnableServiceRequest**  : *The Sale System requests to the POI System to enable a service on its side.*<br/>- **FSAQ: FinancialCardAcquisitionRequest**  : *The Sale System requests to the POI System to handle a card data acquisition on the card reader.*<br/>- **FSCQ: FinancialReconciliationRequest**  : *The Sale System request to the POI System different kinds of transaction reconciliation.*<br/>  
  **/
  private Object servicesEnabled = null;
  
  @Schema(required = true, description = "Action to realise on a transaction.<br/>- **STAR: StartTransaction**  : *Start a transaction by a swipe ahead mechanism, with the services which are enabled.*<br/>- **STOP: Stop**  : *Keep quite after a swipe ahead mechanism.*<br/>")
 /**
   * Action to realise on a transaction.<br/>- **STAR: StartTransaction**  : *Start a transaction by a swipe ahead mechanism, with the services which are enabled.*<br/>- **STOP: Stop**  : *Keep quite after a swipe ahead mechanism.*<br/>  
  **/
  private Object transactionAction = null;
 /**
   * Get displayOutput
   * @return displayOutput
  **/
  @JsonProperty("DisplayOutput")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput getDisplayOutput() {
    return displayOutput;
  }

  public void setDisplayOutput(PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput displayOutput) {
    this.displayOutput = displayOutput;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequest displayOutput(PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutput displayOutput) {
    this.displayOutput = displayOutput;
    return this;
  }

 /**
   * List of specific services for ServiceRequest&lt;br/&gt;- **FSPQ: FinancialPaymentRequest**  : *The Sale System requests to the POI System to perform a payment(Purchase/Refund/PWCB/MOTO Payment/...).*&lt;br/&gt;- **FSRQ: FinancialReversalRequest**  : *The Sale System requests to the POI System to perform a reversal partial or complete to cancel a former payment service.*&lt;br/&gt;- **FSIQ: FinancialBalanceInquiryRequest**  : *The Sale System requests to the POI System to perform balance inquiry on the main account.*&lt;br/&gt;- **FSBQ: FinancialBatchRequest**  : *The Batch message pair is used to request or get the result of transactions (payment, loyalty and reversal) performed without connection to the Sale system (Payment delivery).*&lt;br/&gt;- **FSLQ: FinancialLoyaltyRequest**  : *The Sale System requests to the POI System a loyalty service like loading or redeem.*&lt;br/&gt;- **FSVQ: FinancialStoredValueRequest**  : *The Sale System requests to the POI System to manage a stored value card or account (eg. Load, Payment, Reimbursement).*&lt;br/&gt;- **FSEQ: FinancialEnableServiceRequest**  : *The Sale System requests to the POI System to enable a service on its side.*&lt;br/&gt;- **FSAQ: FinancialCardAcquisitionRequest**  : *The Sale System requests to the POI System to handle a card data acquisition on the card reader.*&lt;br/&gt;- **FSCQ: FinancialReconciliationRequest**  : *The Sale System request to the POI System different kinds of transaction reconciliation.*&lt;br/&gt;
   * @return servicesEnabled
  **/
  @JsonProperty("ServicesEnabled")
  @NotNull
  public Object getServicesEnabled() {
    return servicesEnabled;
  }

  public void setServicesEnabled(Object servicesEnabled) {
    this.servicesEnabled = servicesEnabled;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequest servicesEnabled(Object servicesEnabled) {
    this.servicesEnabled = servicesEnabled;
    return this;
  }

 /**
   * Action to realise on a transaction.&lt;br/&gt;- **STAR: StartTransaction**  : *Start a transaction by a swipe ahead mechanism, with the services which are enabled.*&lt;br/&gt;- **STOP: Stop**  : *Keep quite after a swipe ahead mechanism.*&lt;br/&gt;
   * @return transactionAction
  **/
  @JsonProperty("TransactionAction")
  @NotNull
  public Object getTransactionAction() {
    return transactionAction;
  }

  public void setTransactionAction(Object transactionAction) {
    this.transactionAction = transactionAction;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequest transactionAction(Object transactionAction) {
    this.transactionAction = transactionAction;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
