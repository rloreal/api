package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation;
import io.swagger.model.SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Outcome of the authorisation, and actions to perform.&lt;br/&gt;
 */
@Schema(description = "Outcome of the authorisation, and actions to perform.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult   {
  @JsonProperty("AuthorisationCode")
  private Object authorisationCode = null;

  @JsonProperty("AuthorisationEntity")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity authorisationEntity = null;

  @JsonProperty("CompletionRequired")
  private Object completionRequired = null;

  @JsonProperty("ResponseToAuthorisation")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation responseToAuthorisation = null;

  @JsonProperty("TMSTrigger")
  private SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger tmSTrigger = null;

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult authorisationCode(Object authorisationCode) {
    this.authorisationCode = authorisationCode;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 8 characters.<br/>
   * @return authorisationCode
   **/
  @Schema(description = "Specifies a character string with a maximum length of 8 characters.<br/>")
      @NotNull

    public Object getAuthorisationCode() {
    return authorisationCode;
  }

  public void setAuthorisationCode(Object authorisationCode) {
    this.authorisationCode = authorisationCode;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult authorisationEntity(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity authorisationEntity) {
    this.authorisationEntity = authorisationEntity;
    return this;
  }

  /**
   * Get authorisationEntity
   * @return authorisationEntity
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity getAuthorisationEntity() {
    return authorisationEntity;
  }

  public void setAuthorisationEntity(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity authorisationEntity) {
    this.authorisationEntity = authorisationEntity;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult completionRequired(Object completionRequired) {
    this.completionRequired = completionRequired;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return completionRequired
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getCompletionRequired() {
    return completionRequired;
  }

  public void setCompletionRequired(Object completionRequired) {
    this.completionRequired = completionRequired;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult responseToAuthorisation(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation responseToAuthorisation) {
    this.responseToAuthorisation = responseToAuthorisation;
    return this;
  }

  /**
   * Get responseToAuthorisation
   * @return responseToAuthorisation
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation getResponseToAuthorisation() {
    return responseToAuthorisation;
  }

  public void setResponseToAuthorisation(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation responseToAuthorisation) {
    this.responseToAuthorisation = responseToAuthorisation;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult tmSTrigger(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger tmSTrigger) {
    this.tmSTrigger = tmSTrigger;
    return this;
  }

  /**
   * Get tmSTrigger
   * @return tmSTrigger
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger getTmSTrigger() {
    return tmSTrigger;
  }

  public void setTmSTrigger(SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResultTMSTrigger tmSTrigger) {
    this.tmSTrigger = tmSTrigger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult = (SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult) o;
    return Objects.equals(this.authorisationCode, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult.authorisationCode) &&
        Objects.equals(this.authorisationEntity, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult.authorisationEntity) &&
        Objects.equals(this.completionRequired, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult.completionRequired) &&
        Objects.equals(this.responseToAuthorisation, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult.responseToAuthorisation) &&
        Objects.equals(this.tmSTrigger, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultTransactionResponseAuthorisationResult.tmSTrigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorisationCode, authorisationEntity, completionRequired, responseToAuthorisation, tmSTrigger);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
