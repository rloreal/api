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
 * Information related to an identification, for example, party identification or account identification.&lt;br/&gt;
 */
@Schema(description = "Information related to an identification, for example, party identification or account identification.<br/>")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-09T14:21:17.741236018+02:00[Europe/Paris]")

public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount {
  @SerializedName("Identification")
  private Object identification = null;

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount identification(Object identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return identification
  **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
  public Object getIdentification() {
    return identification;
  }

  public void setIdentification(Object identification) {
    this.identification = identification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount poipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount = (PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount) o;
    return Objects.equals(this.identification, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount.identification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentificationDomesticAccount {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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
