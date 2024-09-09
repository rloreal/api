package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response of a requested service.&lt;br/&gt;
 */
@Schema(description = "Response of a requested service.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation   {
  @JsonProperty("AdditionalResponseInformation")
  private Object additionalResponseInformation = null;

  @JsonProperty("Response")
  private Object response = null;

  @JsonProperty("ResponseReason")
  private Object responseReason = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation additionalResponseInformation(Object additionalResponseInformation) {
    this.additionalResponseInformation = additionalResponseInformation;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 140 characters.<br/>
   * @return additionalResponseInformation
   **/
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
      @NotNull

    public Object getAdditionalResponseInformation() {
    return additionalResponseInformation;
  }

  public void setAdditionalResponseInformation(Object additionalResponseInformation) {
    this.additionalResponseInformation = additionalResponseInformation;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation response(Object response) {
    this.response = response;
    return this;
  }

  /**
   * Result of the performed service.<br/>- **APPR: Approved**  : *Service has been successfuly provided.*<br/>- **DECL: Declined**  : *Service is declined.*<br/>- **PART: PartialApproved**  : *Service has been partialy provided.*<br/>- **SUSP: Suspended**  : *Transaction has been received but hasn't been processed.*<br/>- **TECH: TechnicalError**  : *Service cannot be provided for technical reason (eg timeout contacting the Issuer, security problem).*<br/>
   * @return response
   **/
  @Schema(required = true, description = "Result of the performed service.<br/>- **APPR: Approved**  : *Service has been successfuly provided.*<br/>- **DECL: Declined**  : *Service is declined.*<br/>- **PART: PartialApproved**  : *Service has been partialy provided.*<br/>- **SUSP: Suspended**  : *Transaction has been received but hasn't been processed.*<br/>- **TECH: TechnicalError**  : *Service cannot be provided for technical reason (eg timeout contacting the Issuer, security problem).*<br/>")
      @NotNull

    public Object getResponse() {
    return response;
  }

  public void setResponse(Object response) {
    this.response = response;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation responseReason(Object responseReason) {
    this.responseReason = responseReason;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return responseReason
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getResponseReason() {
    return responseReason;
  }

  public void setResponseReason(Object responseReason) {
    this.responseReason = responseReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation = (PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation) o;
    return Objects.equals(this.additionalResponseInformation, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation.additionalResponseInformation) &&
        Objects.equals(this.response, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation.response) &&
        Objects.equals(this.responseReason, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation.responseReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalResponseInformation, response, responseReason);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
