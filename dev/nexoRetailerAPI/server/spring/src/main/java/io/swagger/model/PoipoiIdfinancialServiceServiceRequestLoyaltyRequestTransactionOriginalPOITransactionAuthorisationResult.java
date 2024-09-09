package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Outcome of the authorisation.&lt;br/&gt;
 */
@Schema(description = "Outcome of the authorisation.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult   {
  @JsonProperty("AuthorisationCode")
  private Object authorisationCode = null;

  @JsonProperty("AuthorisationEntity")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity authorisationEntity = null;

  @JsonProperty("ResponseToAuthorisation")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation responseToAuthorisation = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult authorisationCode(Object authorisationCode) {
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

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult authorisationEntity(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity authorisationEntity) {
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

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult responseToAuthorisation(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation responseToAuthorisation) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult = (PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult) o;
    return Objects.equals(this.authorisationCode, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult.authorisationCode) &&
        Objects.equals(this.authorisationEntity, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult.authorisationEntity) &&
        Objects.equals(this.responseToAuthorisation, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult.responseToAuthorisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorisationCode, authorisationEntity, responseToAuthorisation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult {\n");
    
    sb.append("    authorisationCode: ").append(toIndentedString(authorisationCode)).append("\n");
    sb.append("    authorisationEntity: ").append(toIndentedString(authorisationEntity)).append("\n");
    sb.append("    responseToAuthorisation: ").append(toIndentedString(responseToAuthorisation)).append("\n");
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
