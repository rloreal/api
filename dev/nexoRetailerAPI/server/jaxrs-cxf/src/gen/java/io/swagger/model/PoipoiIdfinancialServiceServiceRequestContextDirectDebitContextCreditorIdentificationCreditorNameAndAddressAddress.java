package io.swagger.model;

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
  * Address of a party expressed in a formal structure, usually according to the country's postal services specifications.<br/>
 **/
@Schema(description="Address of a party expressed in a formal structure, usually according to the country's postal services specifications.<br/>")
public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress   {
  
  @Schema(example = "BE", required = true, description = "Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).<br/>")
 /**
   * Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).<br/>  
  **/
  private Object country = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object countrySubDivision = null;
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 16 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 16 characters.<br/>  
  **/
  private Object postCodeIdentification = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object streetName = null;
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object townName = null;
 /**
   * Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).&lt;br/&gt;
   * @return country
  **/
  @JsonProperty("Country")
  @NotNull
  public Object getCountry() {
    return country;
  }

  public void setCountry(Object country) {
    this.country = country;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress country(Object country) {
    this.country = country;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return countrySubDivision
  **/
  @JsonProperty("CountrySubDivision")
  @NotNull
  public Object getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(Object countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress countrySubDivision(Object countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 16 characters.&lt;br/&gt;
   * @return postCodeIdentification
  **/
  @JsonProperty("PostCodeIdentification")
  @NotNull
  public Object getPostCodeIdentification() {
    return postCodeIdentification;
  }

  public void setPostCodeIdentification(Object postCodeIdentification) {
    this.postCodeIdentification = postCodeIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress postCodeIdentification(Object postCodeIdentification) {
    this.postCodeIdentification = postCodeIdentification;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return streetName
  **/
  @JsonProperty("StreetName")
  @NotNull
  public Object getStreetName() {
    return streetName;
  }

  public void setStreetName(Object streetName) {
    this.streetName = streetName;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress streetName(Object streetName) {
    this.streetName = streetName;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return townName
  **/
  @JsonProperty("TownName")
  @NotNull
  public Object getTownName() {
    return townName;
  }

  public void setTownName(Object townName) {
    this.townName = townName;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress townName(Object townName) {
    this.townName = townName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    postCodeIdentification: ").append(toIndentedString(postCodeIdentification)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
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
