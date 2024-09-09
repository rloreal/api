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
  * Instructs the POI (Point Of Interaction) how to contact the host of the terminal management system (TMS), to initiate the maintenance of the terminal.<br/>
 **/
@Schema(description="Instructs the POI (Point Of Interaction) how to contact the host of the terminal management system (TMS), to initiate the maintenance of the terminal.<br/>")
public class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger   {
  
  @Schema(description = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>")
 /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>  
  **/
  private Object tmSContactDateTime = null;
  
  @Schema(example = "CRIT", required = true, description = "Level of urgency in contacting the terminal management system.<br/>- **CRIT: Critical**  : *Terminal management system has to be contacted before the next transaction.*<br/>- **ASAP: AsSoonAsPossible**  : *Terminal management system has to be contacted as soon as possible (for example after reconciliation).*<br/>- **DTIM: DateTime**  : *Terminal management system has to be contacted at the date and time provided.*<br/>")
 /**
   * Level of urgency in contacting the terminal management system.<br/>- **CRIT: Critical**  : *Terminal management system has to be contacted before the next transaction.*<br/>- **ASAP: AsSoonAsPossible**  : *Terminal management system has to be contacted as soon as possible (for example after reconciliation).*<br/>- **DTIM: DateTime**  : *Terminal management system has to be contacted at the date and time provided.*<br/>  
  **/
  private Object tmSContactLevel = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object tmSIdentification = null;
 /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \&quot;XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\&quot; which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 &#x3D; the beginning of a calendar day 24:00:00 &#x3D; the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.&lt;br/&gt;
   * @return tmSContactDateTime
  **/
  @JsonProperty("TMSContactDateTime")
  @NotNull
  public Object getTmSContactDateTime() {
    return tmSContactDateTime;
  }

  public void setTmSContactDateTime(Object tmSContactDateTime) {
    this.tmSContactDateTime = tmSContactDateTime;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger tmSContactDateTime(Object tmSContactDateTime) {
    this.tmSContactDateTime = tmSContactDateTime;
    return this;
  }

 /**
   * Level of urgency in contacting the terminal management system.&lt;br/&gt;- **CRIT: Critical**  : *Terminal management system has to be contacted before the next transaction.*&lt;br/&gt;- **ASAP: AsSoonAsPossible**  : *Terminal management system has to be contacted as soon as possible (for example after reconciliation).*&lt;br/&gt;- **DTIM: DateTime**  : *Terminal management system has to be contacted at the date and time provided.*&lt;br/&gt;
   * @return tmSContactLevel
  **/
  @JsonProperty("TMSContactLevel")
  @NotNull
  public Object getTmSContactLevel() {
    return tmSContactLevel;
  }

  public void setTmSContactLevel(Object tmSContactLevel) {
    this.tmSContactLevel = tmSContactLevel;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger tmSContactLevel(Object tmSContactLevel) {
    this.tmSContactLevel = tmSContactLevel;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return tmSIdentification
  **/
  @JsonProperty("TMSIdentification")
  @NotNull
  public Object getTmSIdentification() {
    return tmSIdentification;
  }

  public void setTmSIdentification(Object tmSIdentification) {
    this.tmSIdentification = tmSIdentification;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger tmSIdentification(Object tmSIdentification) {
    this.tmSIdentification = tmSIdentification;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
