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
public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation   {
  
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 140 characters.<br/>  
  **/
  private Object additionalResponseInformation = null;
  
  @Schema(required = true, description = "Result of the performed service.<br/>- **APPR: Approved**  : *Service has been successfuly provided.*<br/>- **DECL: Declined**  : *Service is declined.*<br/>- **PART: PartialApproved**  : *Service has been partialy provided.*<br/>- **SUSP: Suspended**  : *Transaction has been received but hasn't been processed.*<br/>- **TECH: TechnicalError**  : *Service cannot be provided for technical reason (eg timeout contacting the Issuer, security problem).*<br/>")
 /**
   * Result of the performed service.<br/>- **APPR: Approved**  : *Service has been successfuly provided.*<br/>- **DECL: Declined**  : *Service is declined.*<br/>- **PART: PartialApproved**  : *Service has been partialy provided.*<br/>- **SUSP: Suspended**  : *Transaction has been received but hasn't been processed.*<br/>- **TECH: TechnicalError**  : *Service cannot be provided for technical reason (eg timeout contacting the Issuer, security problem).*<br/>  
  **/
  private Object response = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
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

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation additionalResponseInformation(Object additionalResponseInformation) {
    this.additionalResponseInformation = additionalResponseInformation;
    return this;
  }

 /**
   * Result of the performed service.&lt;br/&gt;- **APPR: Approved**  : *Service has been successfuly provided.*&lt;br/&gt;- **DECL: Declined**  : *Service is declined.*&lt;br/&gt;- **PART: PartialApproved**  : *Service has been partialy provided.*&lt;br/&gt;- **SUSP: Suspended**  : *Transaction has been received but hasn&#x27;t been processed.*&lt;br/&gt;- **TECH: TechnicalError**  : *Service cannot be provided for technical reason (eg timeout contacting the Issuer, security problem).*&lt;br/&gt;
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

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation response(Object response) {
    this.response = response;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
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

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation responseReason(Object responseReason) {
    this.responseReason = responseReason;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation {\n");
    
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
