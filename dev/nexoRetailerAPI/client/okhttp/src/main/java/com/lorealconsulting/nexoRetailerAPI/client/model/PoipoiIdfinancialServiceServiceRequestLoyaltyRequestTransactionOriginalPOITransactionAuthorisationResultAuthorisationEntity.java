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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Identification of an entity.&lt;br/&gt;
 */
@Schema(description = "Identification of an entity.<br/>")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-09T14:21:17.741236018+02:00[Europe/Paris]")

public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity {
  @SerializedName("Country")
  private Object country = null;

  @SerializedName("Identification")
  private Object identification = null;

  @SerializedName("Issuer")
  private Object issuer = null;

  @SerializedName("ShortName")
  private Object shortName = null;

  @SerializedName("Type")
  private Object type = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity country(Object country) {
    this.country = country;
    return this;
  }

   /**
   * Specifies an alpha string with a minimum length of 2 characters and a maximum length of 3 characters.&lt;br/&gt;
   * @return country
  **/
  @Schema(description = "Specifies an alpha string with a minimum length of 2 characters and a maximum length of 3 characters.<br/>")
  public Object getCountry() {
    return country;
  }

  public void setCountry(Object country) {
    this.country = country;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity identification(Object identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return identification
  **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
  public Object getIdentification() {
    return identification;
  }

  public void setIdentification(Object identification) {
    this.identification = identification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity issuer(Object issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Entity assigning an identification (for example merchant, acceptor, acquirer, tax authority, etc.).&lt;br/&gt;- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*&lt;br/&gt;- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*&lt;br/&gt;- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*&lt;br/&gt;- **ACQR: Acquirer**  : *Entity acquiring card transactions.*&lt;br/&gt;- **CISS: CardIssuer**  : *Party that issues cards.*&lt;br/&gt;- **TAXH: TaxAuthority**  : *Tax authority.*&lt;br/&gt;
   * @return issuer
  **/
  @Schema(example = "MERC", description = "Entity assigning an identification (for example merchant, acceptor, acquirer, tax authority, etc.).<br/>- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*<br/>- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*<br/>- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*<br/>- **ACQR: Acquirer**  : *Entity acquiring card transactions.*<br/>- **CISS: CardIssuer**  : *Party that issues cards.*<br/>- **TAXH: TaxAuthority**  : *Tax authority.*<br/>")
  public Object getIssuer() {
    return issuer;
  }

  public void setIssuer(Object issuer) {
    this.issuer = issuer;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity shortName(Object shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return shortName
  **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
  public Object getShortName() {
    return shortName;
  }

  public void setShortName(Object shortName) {
    this.shortName = shortName;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity type(Object type) {
    this.type = type;
    return this;
  }

   /**
   * Identification of the type of entity involved in a transaction.&lt;br/&gt;- **OPOI: OriginatingPOI**  : *Point Of Interaction initiating the card payment transaction.*&lt;br/&gt;- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*&lt;br/&gt;- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*&lt;br/&gt;- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*&lt;br/&gt;- **ACQR: Acquirer**  : *Entity acquiring card transactions.*&lt;br/&gt;- **CISS: CardIssuer**  : *Party that issues cards.*&lt;br/&gt;- **DLIS: DelegateIssuer**  : *Party to whom the card issuer delegates to authorise card payment transactions.*&lt;br/&gt;- **ICCA: CardApplication**  : *Application in the smart card.*&lt;br/&gt;
   * @return type
  **/
  @Schema(example = "OPOI", required = true, description = "Identification of the type of entity involved in a transaction.<br/>- **OPOI: OriginatingPOI**  : *Point Of Interaction initiating the card payment transaction.*<br/>- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*<br/>- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*<br/>- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*<br/>- **ACQR: Acquirer**  : *Entity acquiring card transactions.*<br/>- **CISS: CardIssuer**  : *Party that issues cards.*<br/>- **DLIS: DelegateIssuer**  : *Party to whom the card issuer delegates to authorise card payment transactions.*<br/>- **ICCA: CardApplication**  : *Application in the smart card.*<br/>")
  public Object getType() {
    return type;
  }

  public void setType(Object type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity = (PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity) o;
    return Objects.equals(this.country, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity.country) &&
        Objects.equals(this.identification, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity.identification) &&
        Objects.equals(this.issuer, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity.issuer) &&
        Objects.equals(this.shortName, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity.shortName) &&
        Objects.equals(this.type, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, identification, issuer, shortName, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
