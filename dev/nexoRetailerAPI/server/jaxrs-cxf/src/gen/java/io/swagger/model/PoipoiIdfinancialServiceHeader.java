package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceHeaderInitiatingParty;
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
  * Set of characteristics related to the protocol.<br/>
 **/
@Schema(description="Set of characteristics related to the protocol.<br/>")
public class PoipoiIdfinancialServiceHeader   {
  
  @Schema(required = true, description = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>")
 /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>  
  **/
  private Object creationDateTime = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceHeaderInitiatingParty initiatingParty = null;
  
  @Schema(required = true, description = "Identifies the type of process related to the message.<br/>- **SSAB: Abort**  : *Abort the current process or the last request.*<br/>- **SAAQ: AdminRequest**  : *To select and start customised administrative services provided by the POI, using a \"menu\" for an interactive or software interface, initiated by the Sale system.*<br/>- **SAAP: AdminResponse**  : *Response to the Admin request.*<br/>- **SDDR: DeviceRequest**  : *Request one or several functions of the device, from user Interface or payment peripherals on the POI system or on the Sale system. Functions can be Display, Input, Print, play sound, Card reader capabilities or Transmit a message.*<br/>- **SDDP: DeviceResponse**  : *Response to a Device request.*<br/>- **SSEN: EventNotification**  : *Notify the other party of an event that occurs on its side.*<br/>- **SSMQ: MessageStatusRequest**  : *Request the status of a previous message for which the Sale system has no response.*<br/>- **SSMR: MessageStatusResponse**  : *Response to a Message Status request.*<br/>- **SSRJ: Rejection**  : *Reject a previous received message, for technical or functional reasons.*<br/>- **SARQ: ReportRequest**  : *To request, by the Sale System, a report on a list of transactions on the POI system, or the status of a transaction.*<br/>- **SARP: ReportResponse**  : *Response to a Report request.*<br/>- **SFRP: SaleFinancialReconciliationResponse**  : *Response to a Reconciliation Request.*<br/>- **SFRQ: SaleFinancialReconciliationRequest**  : *Request a reconciliation (different types) between Sale System and POI System.*<br/>- **SFSQ: SaleFinancialServiceRequest**  : *Request a financial service like payment, reversal, loyalty, Balance Inquiry, etc.*<br/>- **SFSP: SaleFinancialServiceResponse**  : *Response to a financial service request.*<br/>- **SASQ: SessionManagementRequest**  : *Request the management of a session: login, logout and diagnosis services. Initiated by the Sale system.*<br/>- **SASP: SessionManagementResponse**  : *Response to a session management request to initiate/terminate a session.*<br/>")
 /**
   * Identifies the type of process related to the message.<br/>- **SSAB: Abort**  : *Abort the current process or the last request.*<br/>- **SAAQ: AdminRequest**  : *To select and start customised administrative services provided by the POI, using a \"menu\" for an interactive or software interface, initiated by the Sale system.*<br/>- **SAAP: AdminResponse**  : *Response to the Admin request.*<br/>- **SDDR: DeviceRequest**  : *Request one or several functions of the device, from user Interface or payment peripherals on the POI system or on the Sale system. Functions can be Display, Input, Print, play sound, Card reader capabilities or Transmit a message.*<br/>- **SDDP: DeviceResponse**  : *Response to a Device request.*<br/>- **SSEN: EventNotification**  : *Notify the other party of an event that occurs on its side.*<br/>- **SSMQ: MessageStatusRequest**  : *Request the status of a previous message for which the Sale system has no response.*<br/>- **SSMR: MessageStatusResponse**  : *Response to a Message Status request.*<br/>- **SSRJ: Rejection**  : *Reject a previous received message, for technical or functional reasons.*<br/>- **SARQ: ReportRequest**  : *To request, by the Sale System, a report on a list of transactions on the POI system, or the status of a transaction.*<br/>- **SARP: ReportResponse**  : *Response to a Report request.*<br/>- **SFRP: SaleFinancialReconciliationResponse**  : *Response to a Reconciliation Request.*<br/>- **SFRQ: SaleFinancialReconciliationRequest**  : *Request a reconciliation (different types) between Sale System and POI System.*<br/>- **SFSQ: SaleFinancialServiceRequest**  : *Request a financial service like payment, reversal, loyalty, Balance Inquiry, etc.*<br/>- **SFSP: SaleFinancialServiceResponse**  : *Response to a financial service request.*<br/>- **SASQ: SessionManagementRequest**  : *Request the management of a session: login, logout and diagnosis services. Initiated by the Sale system.*<br/>- **SASP: SessionManagementResponse**  : *Response to a session management request to initiate/terminate a session.*<br/>  
  **/
  private Object messageFunction = null;
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 6 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 6 characters.<br/>  
  **/
  private Object protocolVersion = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceHeaderInitiatingParty recipientParty = null;
  
  @Schema(description = "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.")
 /**
   * Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.  
  **/
  private Object traceability = null;
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object exchangeIdentification = null;
 /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \&quot;XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\&quot; which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 &#x3D; the beginning of a calendar day 24:00:00 &#x3D; the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.&lt;br/&gt;
   * @return creationDateTime
  **/
  @JsonProperty("CreationDateTime")
  @NotNull
  public Object getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(Object creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public PoipoiIdfinancialServiceHeader creationDateTime(Object creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

 /**
   * Get initiatingParty
   * @return initiatingParty
  **/
  @JsonProperty("InitiatingParty")
  @NotNull
  public PoipoiIdfinancialServiceHeaderInitiatingParty getInitiatingParty() {
    return initiatingParty;
  }

  public void setInitiatingParty(PoipoiIdfinancialServiceHeaderInitiatingParty initiatingParty) {
    this.initiatingParty = initiatingParty;
  }

  public PoipoiIdfinancialServiceHeader initiatingParty(PoipoiIdfinancialServiceHeaderInitiatingParty initiatingParty) {
    this.initiatingParty = initiatingParty;
    return this;
  }

 /**
   * Identifies the type of process related to the message.&lt;br/&gt;- **SSAB: Abort**  : *Abort the current process or the last request.*&lt;br/&gt;- **SAAQ: AdminRequest**  : *To select and start customised administrative services provided by the POI, using a \&quot;menu\&quot; for an interactive or software interface, initiated by the Sale system.*&lt;br/&gt;- **SAAP: AdminResponse**  : *Response to the Admin request.*&lt;br/&gt;- **SDDR: DeviceRequest**  : *Request one or several functions of the device, from user Interface or payment peripherals on the POI system or on the Sale system. Functions can be Display, Input, Print, play sound, Card reader capabilities or Transmit a message.*&lt;br/&gt;- **SDDP: DeviceResponse**  : *Response to a Device request.*&lt;br/&gt;- **SSEN: EventNotification**  : *Notify the other party of an event that occurs on its side.*&lt;br/&gt;- **SSMQ: MessageStatusRequest**  : *Request the status of a previous message for which the Sale system has no response.*&lt;br/&gt;- **SSMR: MessageStatusResponse**  : *Response to a Message Status request.*&lt;br/&gt;- **SSRJ: Rejection**  : *Reject a previous received message, for technical or functional reasons.*&lt;br/&gt;- **SARQ: ReportRequest**  : *To request, by the Sale System, a report on a list of transactions on the POI system, or the status of a transaction.*&lt;br/&gt;- **SARP: ReportResponse**  : *Response to a Report request.*&lt;br/&gt;- **SFRP: SaleFinancialReconciliationResponse**  : *Response to a Reconciliation Request.*&lt;br/&gt;- **SFRQ: SaleFinancialReconciliationRequest**  : *Request a reconciliation (different types) between Sale System and POI System.*&lt;br/&gt;- **SFSQ: SaleFinancialServiceRequest**  : *Request a financial service like payment, reversal, loyalty, Balance Inquiry, etc.*&lt;br/&gt;- **SFSP: SaleFinancialServiceResponse**  : *Response to a financial service request.*&lt;br/&gt;- **SASQ: SessionManagementRequest**  : *Request the management of a session: login, logout and diagnosis services. Initiated by the Sale system.*&lt;br/&gt;- **SASP: SessionManagementResponse**  : *Response to a session management request to initiate/terminate a session.*&lt;br/&gt;
   * @return messageFunction
  **/
  @JsonProperty("MessageFunction")
  @NotNull
  public Object getMessageFunction() {
    return messageFunction;
  }

  public void setMessageFunction(Object messageFunction) {
    this.messageFunction = messageFunction;
  }

  public PoipoiIdfinancialServiceHeader messageFunction(Object messageFunction) {
    this.messageFunction = messageFunction;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 6 characters.&lt;br/&gt;
   * @return protocolVersion
  **/
  @JsonProperty("ProtocolVersion")
  @NotNull
  public Object getProtocolVersion() {
    return protocolVersion;
  }

  public void setProtocolVersion(Object protocolVersion) {
    this.protocolVersion = protocolVersion;
  }

  public PoipoiIdfinancialServiceHeader protocolVersion(Object protocolVersion) {
    this.protocolVersion = protocolVersion;
    return this;
  }

 /**
   * Get recipientParty
   * @return recipientParty
  **/
  @JsonProperty("RecipientParty")
  @NotNull
  public PoipoiIdfinancialServiceHeaderInitiatingParty getRecipientParty() {
    return recipientParty;
  }

  public void setRecipientParty(PoipoiIdfinancialServiceHeaderInitiatingParty recipientParty) {
    this.recipientParty = recipientParty;
  }

  public PoipoiIdfinancialServiceHeader recipientParty(PoipoiIdfinancialServiceHeaderInitiatingParty recipientParty) {
    this.recipientParty = recipientParty;
    return this;
  }

 /**
   * Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.
   * @return traceability
  **/
  @JsonProperty("Traceability")
  @NotNull
  public Object getTraceability() {
    return traceability;
  }

  public void setTraceability(Object traceability) {
    this.traceability = traceability;
  }

  public PoipoiIdfinancialServiceHeader traceability(Object traceability) {
    this.traceability = traceability;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return exchangeIdentification
  **/
  @JsonProperty("ExchangeIdentification")
  @NotNull
  public Object getExchangeIdentification() {
    return exchangeIdentification;
  }

  public void setExchangeIdentification(Object exchangeIdentification) {
    this.exchangeIdentification = exchangeIdentification;
  }

  public PoipoiIdfinancialServiceHeader exchangeIdentification(Object exchangeIdentification) {
    this.exchangeIdentification = exchangeIdentification;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceHeader {\n");
    
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    initiatingParty: ").append(toIndentedString(initiatingParty)).append("\n");
    sb.append("    messageFunction: ").append(toIndentedString(messageFunction)).append("\n");
    sb.append("    protocolVersion: ").append(toIndentedString(protocolVersion)).append("\n");
    sb.append("    recipientParty: ").append(toIndentedString(recipientParty)).append("\n");
    sb.append("    traceability: ").append(toIndentedString(traceability)).append("\n");
    sb.append("    exchangeIdentification: ").append(toIndentedString(exchangeIdentification)).append("\n");
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
