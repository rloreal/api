package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress;
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
  * Name and address of an institution.<br/>
 **/
@Schema(description="Name and address of an institution.<br/>")
public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress   {
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress address = null;
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object name = null;
 /**
   * Get address
   * @return address
  **/
  @JsonProperty("Address")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress getAddress() {
    return address;
  }

  public void setAddress(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress address) {
    this.address = address;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress address(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress address) {
    this.address = address;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return name
  **/
  @JsonProperty("Name")
  @NotNull
  public Object getName() {
    return name;
  }

  public void setName(Object name) {
    this.name = name;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress name(Object name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
