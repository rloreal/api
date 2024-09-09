package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger;
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
  * Outcome of the authorisation, and actions to perform.<br/>
 **/
@Schema(description="Outcome of the authorisation, and actions to perform.<br/>")
public class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult   {
  
  @Schema(description = "Specifies a character string with a maximum length of 8 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 8 characters.<br/>  
  **/
  private Object authorisationCode = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity authorisationEntity = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object completionRequired = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation responseToAuthorisation = null;
  
  @Schema(description = "")
  private SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger tmSTrigger = null;
 /**
   * Specifies a character string with a maximum length of 8 characters.&lt;br/&gt;
   * @return authorisationCode
  **/
  @JsonProperty("AuthorisationCode")
  @NotNull
  public Object getAuthorisationCode() {
    return authorisationCode;
  }

  public void setAuthorisationCode(Object authorisationCode) {
    this.authorisationCode = authorisationCode;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult authorisationCode(Object authorisationCode) {
    this.authorisationCode = authorisationCode;
    return this;
  }

 /**
   * Get authorisationEntity
   * @return authorisationEntity
  **/
  @JsonProperty("AuthorisationEntity")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity getAuthorisationEntity() {
    return authorisationEntity;
  }

  public void setAuthorisationEntity(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity authorisationEntity) {
    this.authorisationEntity = authorisationEntity;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult authorisationEntity(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity authorisationEntity) {
    this.authorisationEntity = authorisationEntity;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return completionRequired
  **/
  @JsonProperty("CompletionRequired")
  @NotNull
  public Object getCompletionRequired() {
    return completionRequired;
  }

  public void setCompletionRequired(Object completionRequired) {
    this.completionRequired = completionRequired;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult completionRequired(Object completionRequired) {
    this.completionRequired = completionRequired;
    return this;
  }

 /**
   * Get responseToAuthorisation
   * @return responseToAuthorisation
  **/
  @JsonProperty("ResponseToAuthorisation")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation getResponseToAuthorisation() {
    return responseToAuthorisation;
  }

  public void setResponseToAuthorisation(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation responseToAuthorisation) {
    this.responseToAuthorisation = responseToAuthorisation;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult responseToAuthorisation(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation responseToAuthorisation) {
    this.responseToAuthorisation = responseToAuthorisation;
    return this;
  }

 /**
   * Get tmSTrigger
   * @return tmSTrigger
  **/
  @JsonProperty("TMSTrigger")
  @NotNull
  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger getTmSTrigger() {
    return tmSTrigger;
  }

  public void setTmSTrigger(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger tmSTrigger) {
    this.tmSTrigger = tmSTrigger;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult tmSTrigger(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger tmSTrigger) {
    this.tmSTrigger = tmSTrigger;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult {\n");
    
    sb.append("    authorisationCode: ").append(toIndentedString(authorisationCode)).append("\n");
    sb.append("    authorisationEntity: ").append(toIndentedString(authorisationEntity)).append("\n");
    sb.append("    completionRequired: ").append(toIndentedString(completionRequired)).append("\n");
    sb.append("    responseToAuthorisation: ").append(toIndentedString(responseToAuthorisation)).append("\n");
    sb.append("    tmSTrigger: ").append(toIndentedString(tmSTrigger)).append("\n");
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
