package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information that locates and identifies a specific address, as defined by postal services.&lt;br/&gt;
 */
@Schema(description = "Information that locates and identifies a specific address, as defined by postal services.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress   {
  @JsonProperty("AddressLine")
  private Object addressLine = null;

  @JsonProperty("AddressType")
  private Object addressType = null;

  @JsonProperty("BuildingNumber")
  private Object buildingNumber = null;

  @JsonProperty("CountryCode")
  private Object countryCode = null;

  @JsonProperty("CountrySubDivision")
  private Object countrySubDivision = null;

  @JsonProperty("Department")
  private Object department = null;

  @JsonProperty("PostCode")
  private Object postCode = null;

  @JsonProperty("StreetName")
  private Object streetName = null;

  @JsonProperty("SubDepartment")
  private Object subDepartment = null;

  @JsonProperty("TownName")
  private Object townName = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress addressLine(Object addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  /**
   * Information that locates and identifies a specific address, as defined by postal services, presented in free format text.
   * @return addressLine
   **/
  @Schema(description = "Information that locates and identifies a specific address, as defined by postal services, presented in free format text.")
      @NotNull

    public Object getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(Object addressLine) {
    this.addressLine = addressLine;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress addressType(Object addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Specifies the type of address.<br/>- **ADDR: Postal**  : *Address is the complete postal address.*<br/>- **PBOX: POBox**  : *Address is a postal office (PO) box.*<br/>- **HOME: Residential**  : *Address is the home address.*<br/>- **BIZZ: Business**  : *Address is the business address.*<br/>- **MLTO: MailTo**  : *Address is the address to which mail is sent.*<br/>- **DLVY: DeliveryTo**  : *Address is the address to which delivery is to take place.*<br/>
   * @return addressType
   **/
  @Schema(example = "ADDR", description = "Specifies the type of address.<br/>- **ADDR: Postal**  : *Address is the complete postal address.*<br/>- **PBOX: POBox**  : *Address is a postal office (PO) box.*<br/>- **HOME: Residential**  : *Address is the home address.*<br/>- **BIZZ: Business**  : *Address is the business address.*<br/>- **MLTO: MailTo**  : *Address is the address to which mail is sent.*<br/>- **DLVY: DeliveryTo**  : *Address is the address to which delivery is to take place.*<br/>")
      @NotNull

    public Object getAddressType() {
    return addressType;
  }

  public void setAddressType(Object addressType) {
    this.addressType = addressType;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress buildingNumber(Object buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 16 characters.<br/>
   * @return buildingNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 16 characters.<br/>")
      @NotNull

    public Object getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(Object buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress countryCode(Object countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Specifies an alpha string with a minimum length of 2 characters and a maximum length of 3 characters.<br/>
   * @return countryCode
   **/
  @Schema(description = "Specifies an alpha string with a minimum length of 2 characters and a maximum length of 3 characters.<br/>")
      @NotNull

    public Object getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(Object countryCode) {
    this.countryCode = countryCode;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress countrySubDivision(Object countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  /**
   * Identifies a subdivision of a country such as state, region, county.
   * @return countrySubDivision
   **/
  @Schema(description = "Identifies a subdivision of a country such as state, region, county.")
      @NotNull

    public Object getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(Object countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress department(Object department) {
    this.department = department;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return department
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getDepartment() {
    return department;
  }

  public void setDepartment(Object department) {
    this.department = department;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress postCode(Object postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 16 characters.<br/>
   * @return postCode
   **/
  @Schema(description = "Specifies a character string with a maximum length of 16 characters.<br/>")
      @NotNull

    public Object getPostCode() {
    return postCode;
  }

  public void setPostCode(Object postCode) {
    this.postCode = postCode;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress streetName(Object streetName) {
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress subDepartment(Object subDepartment) {
    this.subDepartment = subDepartment;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return subDepartment
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getSubDepartment() {
    return subDepartment;
  }

  public void setSubDepartment(Object subDepartment) {
    this.subDepartment = subDepartment;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress townName(Object townName) {
    this.townName = townName;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return townName
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
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
    PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress poipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress = (PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress) o;
    return Objects.equals(this.addressLine, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress.addressLine) &&
        Objects.equals(this.addressType, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress.addressType) &&
        Objects.equals(this.buildingNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress.buildingNumber) &&
        Objects.equals(this.countryCode, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress.countryCode) &&
        Objects.equals(this.countrySubDivision, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress.countrySubDivision) &&
        Objects.equals(this.department, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress.department) &&
        Objects.equals(this.postCode, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress.postCode) &&
        Objects.equals(this.streetName, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress.streetName) &&
        Objects.equals(this.subDepartment, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress.subDepartment) &&
        Objects.equals(this.townName, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress.townName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine, addressType, buildingNumber, countryCode, countrySubDivision, department, postCode, streetName, subDepartment, townName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress {\n");
    
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    subDepartment: ").append(toIndentedString(subDepartment)).append("\n");
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
