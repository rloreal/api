package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification;
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
  * Identification of a party.<br/>
 **/
@Schema(description="Identification of a party.<br/>")
public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor   {
  
  @Schema(example = "CHASUS33", description = "Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362: 2014 - \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".<br/>")
 /**
   * Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362: 2014 - \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".<br/>  
  **/
  private Object anyBIC = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress nameAndAddress = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification proprietaryIdentification = null;
 /**
   * Code allocated to a financial or non-financial institution by the ISO 9362 Registration Authority, as described in ISO 9362: 2014 - \&quot;Banking - Banking telecommunication messages - Business identifier code (BIC)\&quot;.&lt;br/&gt;
   * @return anyBIC
  **/
  @JsonProperty("AnyBIC")
  @NotNull
  public Object getAnyBIC() {
    return anyBIC;
  }

  public void setAnyBIC(Object anyBIC) {
    this.anyBIC = anyBIC;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor anyBIC(Object anyBIC) {
    this.anyBIC = anyBIC;
    return this;
  }

 /**
   * Get nameAndAddress
   * @return nameAndAddress
  **/
  @JsonProperty("NameAndAddress")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress getNameAndAddress() {
    return nameAndAddress;
  }

  public void setNameAndAddress(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress nameAndAddress) {
    this.nameAndAddress = nameAndAddress;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor nameAndAddress(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddress nameAndAddress) {
    this.nameAndAddress = nameAndAddress;
    return this;
  }

 /**
   * Get proprietaryIdentification
   * @return proprietaryIdentification
  **/
  @JsonProperty("ProprietaryIdentification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification getProprietaryIdentification() {
    return proprietaryIdentification;
  }

  public void setProprietaryIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification proprietaryIdentification) {
    this.proprietaryIdentification = proprietaryIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor proprietaryIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorProprietaryIdentification proprietaryIdentification) {
    this.proprietaryIdentification = proprietaryIdentification;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor {\n");
    
    sb.append("    anyBIC: ").append(toIndentedString(anyBIC)).append("\n");
    sb.append("    nameAndAddress: ").append(toIndentedString(nameAndAddress)).append("\n");
    sb.append("    proprietaryIdentification: ").append(toIndentedString(proprietaryIdentification)).append("\n");
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
