package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceHeaderInitiatingParty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Set of characteristics related to the protocol.&lt;br/&gt;
 */
@Schema(description = "Set of characteristics related to the protocol.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceRequestV06Header   {
  @JsonProperty("CreationDateTime")
  private Object creationDateTime = null;

  @JsonProperty("InitiatingParty")
  private PoipoiIdfinancialServiceHeaderInitiatingParty initiatingParty = null;

  @JsonProperty("MessageFunction")
  private Object messageFunction = null;

  @JsonProperty("ProtocolVersion")
  private Object protocolVersion = null;

  @JsonProperty("RecipientParty")
  private PoipoiIdfinancialServiceHeaderInitiatingParty recipientParty = null;

  @JsonProperty("Traceability")
  private Object traceability = null;

  @JsonProperty("ExchangeIdentification")
  private Object exchangeIdentification = null;

  public SaleToPOIServiceRequestV06Header creationDateTime(Object creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>
   * @return creationDateTime
   **/
  @Schema(required = true, description = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>")
      @NotNull

    public Object getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(Object creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public SaleToPOIServiceRequestV06Header initiatingParty(PoipoiIdfinancialServiceHeaderInitiatingParty initiatingParty) {
    this.initiatingParty = initiatingParty;
    return this;
  }

  /**
   * Get initiatingParty
   * @return initiatingParty
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceHeaderInitiatingParty getInitiatingParty() {
    return initiatingParty;
  }

  public void setInitiatingParty(PoipoiIdfinancialServiceHeaderInitiatingParty initiatingParty) {
    this.initiatingParty = initiatingParty;
  }

  public SaleToPOIServiceRequestV06Header messageFunction(Object messageFunction) {
    this.messageFunction = messageFunction;
    return this;
  }

  /**
   * Identifies the type of process related to the message.<br/>- **SSAB: Abort**  : *Abort the current process or the last request.*<br/>- **SAAQ: AdminRequest**  : *To select and start customised administrative services provided by the POI, using a \"menu\" for an interactive or software interface, initiated by the Sale system.*<br/>- **SAAP: AdminResponse**  : *Response to the Admin request.*<br/>- **SDDR: DeviceRequest**  : *Request one or several functions of the device, from user Interface or payment peripherals on the POI system or on the Sale system. Functions can be Display, Input, Print, play sound, Card reader capabilities or Transmit a message.*<br/>- **SDDP: DeviceResponse**  : *Response to a Device request.*<br/>- **SSEN: EventNotification**  : *Notify the other party of an event that occurs on its side.*<br/>- **SSMQ: MessageStatusRequest**  : *Request the status of a previous message for which the Sale system has no response.*<br/>- **SSMR: MessageStatusResponse**  : *Response to a Message Status request.*<br/>- **SSRJ: Rejection**  : *Reject a previous received message, for technical or functional reasons.*<br/>- **SARQ: ReportRequest**  : *To request, by the Sale System, a report on a list of transactions on the POI system, or the status of a transaction.*<br/>- **SARP: ReportResponse**  : *Response to a Report request.*<br/>- **SFRP: SaleFinancialReconciliationResponse**  : *Response to a Reconciliation Request.*<br/>- **SFRQ: SaleFinancialReconciliationRequest**  : *Request a reconciliation (different types) between Sale System and POI System.*<br/>- **SFSQ: SaleFinancialServiceRequest**  : *Request a financial service like payment, reversal, loyalty, Balance Inquiry, etc.*<br/>- **SFSP: SaleFinancialServiceResponse**  : *Response to a financial service request.*<br/>- **SASQ: SessionManagementRequest**  : *Request the management of a session: login, logout and diagnosis services. Initiated by the Sale system.*<br/>- **SASP: SessionManagementResponse**  : *Response to a session management request to initiate/terminate a session.*<br/>
   * @return messageFunction
   **/
  @Schema(required = true, description = "Identifies the type of process related to the message.<br/>- **SSAB: Abort**  : *Abort the current process or the last request.*<br/>- **SAAQ: AdminRequest**  : *To select and start customised administrative services provided by the POI, using a \"menu\" for an interactive or software interface, initiated by the Sale system.*<br/>- **SAAP: AdminResponse**  : *Response to the Admin request.*<br/>- **SDDR: DeviceRequest**  : *Request one or several functions of the device, from user Interface or payment peripherals on the POI system or on the Sale system. Functions can be Display, Input, Print, play sound, Card reader capabilities or Transmit a message.*<br/>- **SDDP: DeviceResponse**  : *Response to a Device request.*<br/>- **SSEN: EventNotification**  : *Notify the other party of an event that occurs on its side.*<br/>- **SSMQ: MessageStatusRequest**  : *Request the status of a previous message for which the Sale system has no response.*<br/>- **SSMR: MessageStatusResponse**  : *Response to a Message Status request.*<br/>- **SSRJ: Rejection**  : *Reject a previous received message, for technical or functional reasons.*<br/>- **SARQ: ReportRequest**  : *To request, by the Sale System, a report on a list of transactions on the POI system, or the status of a transaction.*<br/>- **SARP: ReportResponse**  : *Response to a Report request.*<br/>- **SFRP: SaleFinancialReconciliationResponse**  : *Response to a Reconciliation Request.*<br/>- **SFRQ: SaleFinancialReconciliationRequest**  : *Request a reconciliation (different types) between Sale System and POI System.*<br/>- **SFSQ: SaleFinancialServiceRequest**  : *Request a financial service like payment, reversal, loyalty, Balance Inquiry, etc.*<br/>- **SFSP: SaleFinancialServiceResponse**  : *Response to a financial service request.*<br/>- **SASQ: SessionManagementRequest**  : *Request the management of a session: login, logout and diagnosis services. Initiated by the Sale system.*<br/>- **SASP: SessionManagementResponse**  : *Response to a session management request to initiate/terminate a session.*<br/>")
      @NotNull

    public Object getMessageFunction() {
    return messageFunction;
  }

  public void setMessageFunction(Object messageFunction) {
    this.messageFunction = messageFunction;
  }

  public SaleToPOIServiceRequestV06Header protocolVersion(Object protocolVersion) {
    this.protocolVersion = protocolVersion;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 6 characters.<br/>
   * @return protocolVersion
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 6 characters.<br/>")
      @NotNull

    public Object getProtocolVersion() {
    return protocolVersion;
  }

  public void setProtocolVersion(Object protocolVersion) {
    this.protocolVersion = protocolVersion;
  }

  public SaleToPOIServiceRequestV06Header recipientParty(PoipoiIdfinancialServiceHeaderInitiatingParty recipientParty) {
    this.recipientParty = recipientParty;
    return this;
  }

  /**
   * Get recipientParty
   * @return recipientParty
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceHeaderInitiatingParty getRecipientParty() {
    return recipientParty;
  }

  public void setRecipientParty(PoipoiIdfinancialServiceHeaderInitiatingParty recipientParty) {
    this.recipientParty = recipientParty;
  }

  public SaleToPOIServiceRequestV06Header traceability(Object traceability) {
    this.traceability = traceability;
    return this;
  }

  /**
   * Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.
   * @return traceability
   **/
  @Schema(description = "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.")
      @NotNull

    public Object getTraceability() {
    return traceability;
  }

  public void setTraceability(Object traceability) {
    this.traceability = traceability;
  }

  public SaleToPOIServiceRequestV06Header exchangeIdentification(Object exchangeIdentification) {
    this.exchangeIdentification = exchangeIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return exchangeIdentification
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getExchangeIdentification() {
    return exchangeIdentification;
  }

  public void setExchangeIdentification(Object exchangeIdentification) {
    this.exchangeIdentification = exchangeIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleToPOIServiceRequestV06Header saleToPOIServiceRequestV06Header = (SaleToPOIServiceRequestV06Header) o;
    return Objects.equals(this.creationDateTime, saleToPOIServiceRequestV06Header.creationDateTime) &&
        Objects.equals(this.initiatingParty, saleToPOIServiceRequestV06Header.initiatingParty) &&
        Objects.equals(this.messageFunction, saleToPOIServiceRequestV06Header.messageFunction) &&
        Objects.equals(this.protocolVersion, saleToPOIServiceRequestV06Header.protocolVersion) &&
        Objects.equals(this.recipientParty, saleToPOIServiceRequestV06Header.recipientParty) &&
        Objects.equals(this.traceability, saleToPOIServiceRequestV06Header.traceability) &&
        Objects.equals(this.exchangeIdentification, saleToPOIServiceRequestV06Header.exchangeIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDateTime, initiatingParty, messageFunction, protocolVersion, recipientParty, traceability, exchangeIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceRequestV06Header {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
