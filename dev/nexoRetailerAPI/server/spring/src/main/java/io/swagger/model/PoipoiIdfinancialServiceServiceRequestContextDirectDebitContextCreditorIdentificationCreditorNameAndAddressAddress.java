package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Address of a party expressed in a formal structure, usually according to the country&#x27;s postal services specifications.&lt;br/&gt;
 */
@Schema(description = "Address of a party expressed in a formal structure, usually according to the country's postal services specifications.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress   {
  @JsonProperty("Country")
  private Object country = null;

  @JsonProperty("CountrySubDivision")
  private Object countrySubDivision = null;

  @JsonProperty("PostCodeIdentification")
  private Object postCodeIdentification = null;

  @JsonProperty("StreetName")
  private Object streetName = null;

  @JsonProperty("TownName")
  private Object townName = null;

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress country(Object country) {
    this.country = country;
    return this;
  }

  /**
   * Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).<br/>
   * @return country
   **/
  @Schema(example = "BE", required = true, description = "Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).<br/>")
      @NotNull

    public Object getCountry() {
    return country;
  }

  public void setCountry(Object country) {
    this.country = country;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress countrySubDivision(Object countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return countrySubDivision
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(Object countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress postCodeIdentification(Object postCodeIdentification) {
    this.postCodeIdentification = postCodeIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 16 characters.<br/>
   * @return postCodeIdentification
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 16 characters.<br/>")
      @NotNull

    public Object getPostCodeIdentification() {
    return postCodeIdentification;
  }

  public void setPostCodeIdentification(Object postCodeIdentification) {
    this.postCodeIdentification = postCodeIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress streetName(Object streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return streetName
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getStreetName() {
    return streetName;
  }

  public void setStreetName(Object streetName) {
    this.streetName = streetName;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress townName(Object townName) {
    this.townName = townName;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return townName
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getTownName() {
    return townName;
  }

  public void setTownName(Object townName) {
    this.townName = townName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress = (PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress) o;
    return Objects.equals(this.country, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress.country) &&
        Objects.equals(this.countrySubDivision, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress.countrySubDivision) &&
        Objects.equals(this.postCodeIdentification, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress.postCodeIdentification) &&
        Objects.equals(this.streetName, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress.streetName) &&
        Objects.equals(this.townName, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditorNameAndAddressAddress.townName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, countrySubDivision, postCodeIdentification, streetName, townName);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
