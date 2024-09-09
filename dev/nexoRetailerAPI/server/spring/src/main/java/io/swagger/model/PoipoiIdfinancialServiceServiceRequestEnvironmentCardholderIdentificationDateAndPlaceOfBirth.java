package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Date and place of birth of a person.&lt;br/&gt;
 */
@Schema(description = "Date and place of birth of a person.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth   {
  @JsonProperty("BirthDate")
  private Object birthDate = null;

  @JsonProperty("CityOfBirth")
  private Object cityOfBirth = null;

  @JsonProperty("CountryOfBirth")
  private Object countryOfBirth = null;

  @JsonProperty("ProvinceOfBirth")
  private Object provinceOfBirth = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth birthDate(Object birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.<br/>
   * @return birthDate
   **/
  @Schema(required = true, description = "A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.<br/>")
      @NotNull

    public Object getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Object birthDate) {
    this.birthDate = birthDate;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth cityOfBirth(Object cityOfBirth) {
    this.cityOfBirth = cityOfBirth;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return cityOfBirth
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getCityOfBirth() {
    return cityOfBirth;
  }

  public void setCityOfBirth(Object cityOfBirth) {
    this.cityOfBirth = cityOfBirth;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth countryOfBirth(Object countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
    return this;
  }

  /**
   * Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).<br/>
   * @return countryOfBirth
   **/
  @Schema(example = "BE", required = true, description = "Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).<br/>")
      @NotNull

    public Object getCountryOfBirth() {
    return countryOfBirth;
  }

  public void setCountryOfBirth(Object countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth provinceOfBirth(Object provinceOfBirth) {
    this.provinceOfBirth = provinceOfBirth;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return provinceOfBirth
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getProvinceOfBirth() {
    return provinceOfBirth;
  }

  public void setProvinceOfBirth(Object provinceOfBirth) {
    this.provinceOfBirth = provinceOfBirth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth = (PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth) o;
    return Objects.equals(this.birthDate, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.birthDate) &&
        Objects.equals(this.cityOfBirth, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.cityOfBirth) &&
        Objects.equals(this.countryOfBirth, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.countryOfBirth) &&
        Objects.equals(this.provinceOfBirth, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth.provinceOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthDate, cityOfBirth, countryOfBirth, provinceOfBirth);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
