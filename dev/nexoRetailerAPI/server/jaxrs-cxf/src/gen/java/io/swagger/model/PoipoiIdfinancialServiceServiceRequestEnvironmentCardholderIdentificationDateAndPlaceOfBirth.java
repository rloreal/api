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
  * Date and place of birth of a person.<br/>
 **/
@Schema(description="Date and place of birth of a person.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth   {
  
  @Schema(required = true, description = "A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.<br/>")
 /**
   * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.<br/>  
  **/
  private Object birthDate = null;
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object cityOfBirth = null;
  
  @Schema(example = "BE", required = true, description = "Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).<br/>")
 /**
   * Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).<br/>  
  **/
  private Object countryOfBirth = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object provinceOfBirth = null;
 /**
   * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \&quot;XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\&quot; which is aligned with ISO 8601.&lt;br/&gt;
   * @return birthDate
  **/
  @JsonProperty("BirthDate")
  @NotNull
  public Object getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Object birthDate) {
    this.birthDate = birthDate;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth birthDate(Object birthDate) {
    this.birthDate = birthDate;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return cityOfBirth
  **/
  @JsonProperty("CityOfBirth")
  @NotNull
  public Object getCityOfBirth() {
    return cityOfBirth;
  }

  public void setCityOfBirth(Object cityOfBirth) {
    this.cityOfBirth = cityOfBirth;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth cityOfBirth(Object cityOfBirth) {
    this.cityOfBirth = cityOfBirth;
    return this;
  }

 /**
   * Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).&lt;br/&gt;
   * @return countryOfBirth
  **/
  @JsonProperty("CountryOfBirth")
  @NotNull
  public Object getCountryOfBirth() {
    return countryOfBirth;
  }

  public void setCountryOfBirth(Object countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth countryOfBirth(Object countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return provinceOfBirth
  **/
  @JsonProperty("ProvinceOfBirth")
  @NotNull
  public Object getProvinceOfBirth() {
    return provinceOfBirth;
  }

  public void setProvinceOfBirth(Object provinceOfBirth) {
    this.provinceOfBirth = provinceOfBirth;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth provinceOfBirth(Object provinceOfBirth) {
    this.provinceOfBirth = provinceOfBirth;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth {\n");
    
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    cityOfBirth: ").append(toIndentedString(cityOfBirth)).append("\n");
    sb.append("    countryOfBirth: ").append(toIndentedString(countryOfBirth)).append("\n");
    sb.append("    provinceOfBirth: ").append(toIndentedString(provinceOfBirth)).append("\n");
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
