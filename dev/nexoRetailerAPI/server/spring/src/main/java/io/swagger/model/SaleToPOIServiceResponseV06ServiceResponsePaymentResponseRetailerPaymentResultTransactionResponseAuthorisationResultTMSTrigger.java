package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Instructs the POI (Point Of Interaction) how to contact the host of the terminal management system (TMS), to initiate the maintenance of the terminal.&lt;br/&gt;
 */
@Schema(description = "Instructs the POI (Point Of Interaction) how to contact the host of the terminal management system (TMS), to initiate the maintenance of the terminal.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger   {
  @JsonProperty("TMSContactDateTime")
  private Object tmSContactDateTime = null;

  @JsonProperty("TMSContactLevel")
  private Object tmSContactLevel = null;

  @JsonProperty("TMSIdentification")
  private Object tmSIdentification = null;

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger tmSContactDateTime(Object tmSContactDateTime) {
    this.tmSContactDateTime = tmSContactDateTime;
    return this;
  }

  /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>
   * @return tmSContactDateTime
   **/
  @Schema(description = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>")
      @NotNull

    public Object getTmSContactDateTime() {
    return tmSContactDateTime;
  }

  public void setTmSContactDateTime(Object tmSContactDateTime) {
    this.tmSContactDateTime = tmSContactDateTime;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger tmSContactLevel(Object tmSContactLevel) {
    this.tmSContactLevel = tmSContactLevel;
    return this;
  }

  /**
   * Level of urgency in contacting the terminal management system.<br/>- **CRIT: Critical**  : *Terminal management system has to be contacted before the next transaction.*<br/>- **ASAP: AsSoonAsPossible**  : *Terminal management system has to be contacted as soon as possible (for example after reconciliation).*<br/>- **DTIM: DateTime**  : *Terminal management system has to be contacted at the date and time provided.*<br/>
   * @return tmSContactLevel
   **/
  @Schema(example = "CRIT", required = true, description = "Level of urgency in contacting the terminal management system.<br/>- **CRIT: Critical**  : *Terminal management system has to be contacted before the next transaction.*<br/>- **ASAP: AsSoonAsPossible**  : *Terminal management system has to be contacted as soon as possible (for example after reconciliation).*<br/>- **DTIM: DateTime**  : *Terminal management system has to be contacted at the date and time provided.*<br/>")
      @NotNull

    public Object getTmSContactLevel() {
    return tmSContactLevel;
  }

  public void setTmSContactLevel(Object tmSContactLevel) {
    this.tmSContactLevel = tmSContactLevel;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger tmSIdentification(Object tmSIdentification) {
    this.tmSIdentification = tmSIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return tmSIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getTmSIdentification() {
    return tmSIdentification;
  }

  public void setTmSIdentification(Object tmSIdentification) {
    this.tmSIdentification = tmSIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger = (SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger) o;
    return Objects.equals(this.tmSContactDateTime, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger.tmSContactDateTime) &&
        Objects.equals(this.tmSContactLevel, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger.tmSContactLevel) &&
        Objects.equals(this.tmSIdentification, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger.tmSIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tmSContactDateTime, tmSContactLevel, tmSIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger {\n");
    
    sb.append("    tmSContactDateTime: ").append(toIndentedString(tmSContactDateTime)).append("\n");
    sb.append("    tmSContactLevel: ").append(toIndentedString(tmSContactLevel)).append("\n");
    sb.append("    tmSIdentification: ").append(toIndentedString(tmSIdentification)).append("\n");
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
