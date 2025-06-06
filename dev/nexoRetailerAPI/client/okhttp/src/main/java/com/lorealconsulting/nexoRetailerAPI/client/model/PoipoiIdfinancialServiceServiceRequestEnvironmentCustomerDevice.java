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
 * Device used by the customer to perform the payment.&lt;br/&gt;
 */
@Schema(description = "Device used by the customer to perform the payment.<br/>")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-09T14:21:17.741236018+02:00[Europe/Paris]")

public class PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice {
  @SerializedName("Identification")
  private Object identification = null;

  @SerializedName("Provider")
  private Object provider = null;

  @SerializedName("Type")
  private Object type = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice identification(Object identification) {
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice provider(Object provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return provider
  **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
  public Object getProvider() {
    return provider;
  }

  public void setProvider(Object provider) {
    this.provider = provider;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice type(Object type) {
    this.type = type;
    return this;
  }

   /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return type
  **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
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
    PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice poipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice = (PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice) o;
    return Objects.equals(this.identification, poipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice.identification) &&
        Objects.equals(this.provider, poipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice.provider) &&
        Objects.equals(this.type, poipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, provider, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCustomerDevice {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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
