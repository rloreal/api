/*
 * nexo retailer API
 * API defining resources for interactions between POI and POS, using underlying nexo messages  ### Check out its awesome features:  * simply declare POS and POI * send requests to POI * monitor activity 😎 * Receive real-time information about transaction executions📈 
 *
 * OpenAPI spec version: 0.1.0
 * Contact: romain.loreal@lorealconsulting.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.lorealconsulting.nexoRetailerAPI.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity;
import com.lorealconsulting.nexoRetailerAPI.client.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Outcome of the authorisation.&lt;br/&gt;
 */
@Schema(description = "Outcome of the authorisation.<br/>")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-09T14:21:17.741236018+02:00[Europe/Paris]")

public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult {
  @SerializedName("AuthorisationCode")
  private Object authorisationCode = null;

  @SerializedName("AuthorisationEntity")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity authorisationEntity = null;

  @SerializedName("ResponseToAuthorisation")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultResponseToAuthorisation responseToAuthorisation = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResult authorisationCode(Object authorisationCode) {
    this.authorisationCode = authorisationCode;
    return this;
  }

   /**
   * Specifies a character string with a maximum length of 8 characters.&lt;br/&gt;
   * @return authorisationCode
  **/
  @Schema(description = "Specifies a character string with a maximum length of 8 characters.<br/>")
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
