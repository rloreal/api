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
  * Response of a requested service.<br/>
 **/
@Schema(description="Response of a requested service.<br/>")
public class SaleToPOIServiceResponseV06ServiceResponseResponse   {
  
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 140 characters.<br/>  
  **/
  private Object additionalResponseInformation = null;
  
  @Schema(required = true, description = "Result of the processing of the message<br/>- **WARN: Warning**  : *An additional Response Code, mainly a functional one, should be considered to identify the outcome of the request.*<br/>- **FAIL: Failure**  : *Processing of the request fails for various reasons. Some further processing according to the type of requested service, the context of the process, and some additional precision about the failure notified in the ErrorCondition data element.*<br/>- **SUCC: Success**  : *Processing OK. Information related to the result of the processing is contained in other parts of the response message.*<br/>")
 /**
   * Result of the processing of the message<br/>- **WARN: Warning**  : *An additional Response Code, mainly a functional one, should be considered to identify the outcome of the request.*<br/>- **FAIL: Failure**  : *Processing of the request fails for various reasons. Some further processing according to the type of requested service, the context of the process, and some additional precision about the failure notified in the ErrorCondition data element.*<br/>- **SUCC: Success**  : *Processing OK. Information related to the result of the processing is contained in other parts of the response message.*<br/>  
  **/
  private Object response = null;
  
  @Schema(description = "Result of the processing of the message<br/>- **ABRT: Aborted**  : *The Initiator of the request has sent an Abort message request, which was accepted and processed.*<br/>- **BUSY: Busy**  : *The system is busy, try later.*<br/>- **CANC: Cancel**  : *The user has aborted the transaction on the PED keyboard, for instance during PIN entering.*<br/>- **DEVO: DeviceOut**  : *Device out of order.*<br/>- **WPIN: WrongPIN**  : *The user has entered the PIN on the PED keyboard and the verification fails.*<br/>- **NHOS: UnreachableHost**  : *Acquirer or any host is unreachable or has not answered to an online request, so is considered as temporary unavailable. Depending on the Sale context, the request could be repeated (to be compared with \"Refusal\").*<br/>- **UNVS: UnavailableService**  : *The service is not available (not implemented, not configured, protocol version too old...).*<br/>- **UNVD: UnavailableDevice**  : *The hardware is not available (absent, not configured...).*<br/>- **REFU: Refusal**  : *The transaction is refused by the host or by the local rules associated to the card or the POI.*<br/>- **PAYR: PaymentRestriction**  : *Some sale items are not payable by the card proposed by the Customer.*<br/>- **TNFD: NotFound**  : *The transaction is not found (e.g. for a reversal or a repeat).*<br/>- **NALW: NotAllowed**  : *A service request is sent during a Service dialogue. A combination of services not possible to provide. During the DeviceInitialisationCardReader message processing, the user has entered a card which has to be protected by the POI, and cannot be processed with this device request from the external, and then the Sale System.*<br/>- **LOUT: LoggedOut**  : *Not logged in.*<br/>- **IVCA: InvalidCard**  : *The card entered by the Customer cannot be processed by the POI because this card is not configured in the system.*<br/>- **ICAR: InsertedCard**  : *If the Input Device request a NotifyCardInputFlag and the Customer enters a card in the card reader without answers to the Input command, the POI abort the Input command processing, and answer a dedicated ErrorCondition value in the Input response message.*<br/>- **WIPG: InProgress**  : *The transaction is still in progress and then the command cannot be processed.*<br/>")
 /**
   * Result of the processing of the message<br/>- **ABRT: Aborted**  : *The Initiator of the request has sent an Abort message request, which was accepted and processed.*<br/>- **BUSY: Busy**  : *The system is busy, try later.*<br/>- **CANC: Cancel**  : *The user has aborted the transaction on the PED keyboard, for instance during PIN entering.*<br/>- **DEVO: DeviceOut**  : *Device out of order.*<br/>- **WPIN: WrongPIN**  : *The user has entered the PIN on the PED keyboard and the verification fails.*<br/>- **NHOS: UnreachableHost**  : *Acquirer or any host is unreachable or has not answered to an online request, so is considered as temporary unavailable. Depending on the Sale context, the request could be repeated (to be compared with \"Refusal\").*<br/>- **UNVS: UnavailableService**  : *The service is not available (not implemented, not configured, protocol version too old...).*<br/>- **UNVD: UnavailableDevice**  : *The hardware is not available (absent, not configured...).*<br/>- **REFU: Refusal**  : *The transaction is refused by the host or by the local rules associated to the card or the POI.*<br/>- **PAYR: PaymentRestriction**  : *Some sale items are not payable by the card proposed by the Customer.*<br/>- **TNFD: NotFound**  : *The transaction is not found (e.g. for a reversal or a repeat).*<br/>- **NALW: NotAllowed**  : *A service request is sent during a Service dialogue. A combination of services not possible to provide. During the DeviceInitialisationCardReader message processing, the user has entered a card which has to be protected by the POI, and cannot be processed with this device request from the external, and then the Sale System.*<br/>- **LOUT: LoggedOut**  : *Not logged in.*<br/>- **IVCA: InvalidCard**  : *The card entered by the Customer cannot be processed by the POI because this card is not configured in the system.*<br/>- **ICAR: InsertedCard**  : *If the Input Device request a NotifyCardInputFlag and the Customer enters a card in the card reader without answers to the Input command, the POI abort the Input command processing, and answer a dedicated ErrorCondition value in the Input response message.*<br/>- **WIPG: InProgress**  : *The transaction is still in progress and then the command cannot be processed.*<br/>  
  **/
  private Object responseReason = null;
 /**
   * Specifies a character string with a maximum length of 140 characters.&lt;br/&gt;
   * @return additionalResponseInformation
  **/
  @JsonProperty("AdditionalResponseInformation")
  @NotNull
  public Object getAdditionalResponseInformation() {
    return additionalResponseInformation;
  }

  public void setAdditionalResponseInformation(Object additionalResponseInformation) {
    this.additionalResponseInformation = additionalResponseInformation;
  }

  public SaleToPOIServiceResponseV06ServiceResponseResponse additionalResponseInformation(Object additionalResponseInformation) {
    this.additionalResponseInformation = additionalResponseInformation;
    return this;
  }

 /**
   * Result of the processing of the message&lt;br/&gt;- **WARN: Warning**  : *An additional Response Code, mainly a functional one, should be considered to identify the outcome of the request.*&lt;br/&gt;- **FAIL: Failure**  : *Processing of the request fails for various reasons. Some further processing according to the type of requested service, the context of the process, and some additional precision about the failure notified in the ErrorCondition data element.*&lt;br/&gt;- **SUCC: Success**  : *Processing OK. Information related to the result of the processing is contained in other parts of the response message.*&lt;br/&gt;
   * @return response
  **/
  @JsonProperty("Response")
  @NotNull
  public Object getResponse() {
    return response;
  }

  public void setResponse(Object response) {
    this.response = response;
  }

  public SaleToPOIServiceResponseV06ServiceResponseResponse response(Object response) {
    this.response = response;
    return this;
  }

 /**
   * Result of the processing of the message&lt;br/&gt;- **ABRT: Aborted**  : *The Initiator of the request has sent an Abort message request, which was accepted and processed.*&lt;br/&gt;- **BUSY: Busy**  : *The system is busy, try later.*&lt;br/&gt;- **CANC: Cancel**  : *The user has aborted the transaction on the PED keyboard, for instance during PIN entering.*&lt;br/&gt;- **DEVO: DeviceOut**  : *Device out of order.*&lt;br/&gt;- **WPIN: WrongPIN**  : *The user has entered the PIN on the PED keyboard and the verification fails.*&lt;br/&gt;- **NHOS: UnreachableHost**  : *Acquirer or any host is unreachable or has not answered to an online request, so is considered as temporary unavailable. Depending on the Sale context, the request could be repeated (to be compared with \&quot;Refusal\&quot;).*&lt;br/&gt;- **UNVS: UnavailableService**  : *The service is not available (not implemented, not configured, protocol version too old...).*&lt;br/&gt;- **UNVD: UnavailableDevice**  : *The hardware is not available (absent, not configured...).*&lt;br/&gt;- **REFU: Refusal**  : *The transaction is refused by the host or by the local rules associated to the card or the POI.*&lt;br/&gt;- **PAYR: PaymentRestriction**  : *Some sale items are not payable by the card proposed by the Customer.*&lt;br/&gt;- **TNFD: NotFound**  : *The transaction is not found (e.g. for a reversal or a repeat).*&lt;br/&gt;- **NALW: NotAllowed**  : *A service request is sent during a Service dialogue. A combination of services not possible to provide. During the DeviceInitialisationCardReader message processing, the user has entered a card which has to be protected by the POI, and cannot be processed with this device request from the external, and then the Sale System.*&lt;br/&gt;- **LOUT: LoggedOut**  : *Not logged in.*&lt;br/&gt;- **IVCA: InvalidCard**  : *The card entered by the Customer cannot be processed by the POI because this card is not configured in the system.*&lt;br/&gt;- **ICAR: InsertedCard**  : *If the Input Device request a NotifyCardInputFlag and the Customer enters a card in the card reader without answers to the Input command, the POI abort the Input command processing, and answer a dedicated ErrorCondition value in the Input response message.*&lt;br/&gt;- **WIPG: InProgress**  : *The transaction is still in progress and then the command cannot be processed.*&lt;br/&gt;
   * @return responseReason
  **/
  @JsonProperty("ResponseReason")
  @NotNull
  public Object getResponseReason() {
    return responseReason;
  }

  public void setResponseReason(Object responseReason) {
    this.responseReason = responseReason;
  }

  public SaleToPOIServiceResponseV06ServiceResponseResponse responseReason(Object responseReason) {
    this.responseReason = responseReason;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponseResponse {\n");
    
    sb.append("    additionalResponseInformation: ").append(toIndentedString(additionalResponseInformation)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    responseReason: ").append(toIndentedString(responseReason)).append("\n");
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
