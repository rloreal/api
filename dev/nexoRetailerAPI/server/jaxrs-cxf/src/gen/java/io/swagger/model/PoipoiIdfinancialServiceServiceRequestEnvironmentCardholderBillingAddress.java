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
  * Information that locates and identifies a specific address, as defined by postal services.<br/>
 **/
@Schema(description="Information that locates and identifies a specific address, as defined by postal services.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress   {
  
  @Schema(description = "Information that locates and identifies a specific address, as defined by postal services, presented in free format text.")
 /**
   * Information that locates and identifies a specific address, as defined by postal services, presented in free format text.  
  **/
  private Object addressLine = null;
  
  @Schema(example = "ADDR", description = "Specifies the type of address.<br/>- **ADDR: Postal**  : *Address is the complete postal address.*<br/>- **PBOX: POBox**  : *Address is a postal office (PO) box.*<br/>- **HOME: Residential**  : *Address is the home address.*<br/>- **BIZZ: Business**  : *Address is the business address.*<br/>- **MLTO: MailTo**  : *Address is the address to which mail is sent.*<br/>- **DLVY: DeliveryTo**  : *Address is the address to which delivery is to take place.*<br/>")
 /**
   * Specifies the type of address.<br/>- **ADDR: Postal**  : *Address is the complete postal address.*<br/>- **PBOX: POBox**  : *Address is a postal office (PO) box.*<br/>- **HOME: Residential**  : *Address is the home address.*<br/>- **BIZZ: Business**  : *Address is the business address.*<br/>- **MLTO: MailTo**  : *Address is the address to which mail is sent.*<br/>- **DLVY: DeliveryTo**  : *Address is the address to which delivery is to take place.*<br/>  
  **/
  private Object addressType = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 16 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 16 characters.<br/>  
  **/
  private Object buildingNumber = null;
  
  @Schema(description = "Specifies an alpha string with a minimum length of 2 characters and a maximum length of 3 characters.<br/>")
 /**
   * Specifies an alpha string with a minimum length of 2 characters and a maximum length of 3 characters.<br/>  
  **/
  private Object countryCode = null;
  
  @Schema(description = "Identifies a subdivision of a country such as state, region, county.")
 /**
   * Identifies a subdivision of a country such as state, region, county.  
  **/
  private Object countrySubDivision = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object department = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 16 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 16 characters.<br/>  
  **/
  private Object postCode = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object streetName = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object subDepartment = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object townName = null;
 /**
   * Information that locates and identifies a specific address, as defined by postal services, presented in free format text.
   * @return addressLine
  **/
  @JsonProperty("AddressLine")
  @NotNull
  public Object getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(Object addressLine) {
    this.addressLine = addressLine;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress addressLine(Object addressLine) {
    this.addressLine = addressLine;
    return this;
  }

 /**
   * Specifies the type of address.&lt;br/&gt;- **ADDR: Postal**  : *Address is the complete postal address.*&lt;br/&gt;- **PBOX: POBox**  : *Address is a postal office (PO) box.*&lt;br/&gt;- **HOME: Residential**  : *Address is the home address.*&lt;br/&gt;- **BIZZ: Business**  : *Address is the business address.*&lt;br/&gt;- **MLTO: MailTo**  : *Address is the address to which mail is sent.*&lt;br/&gt;- **DLVY: DeliveryTo**  : *Address is the address to which delivery is to take place.*&lt;br/&gt;
   * @return addressType
  **/
  @JsonProperty("AddressType")
  @NotNull
  public Object getAddressType() {
    return addressType;
  }

  public void setAddressType(Object addressType) {
    this.addressType = addressType;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress addressType(Object addressType) {
    this.addressType = addressType;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 16 characters.&lt;br/&gt;
   * @return buildingNumber
  **/
  @JsonProperty("BuildingNumber")
  @NotNull
  public Object getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(Object buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress buildingNumber(Object buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

 /**
   * Specifies an alpha string with a minimum length of 2 characters and a maximum length of 3 characters.&lt;br/&gt;
   * @return countryCode
  **/
  @JsonProperty("CountryCode")
  @NotNull
  public Object getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(Object countryCode) {
    this.countryCode = countryCode;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress countryCode(Object countryCode) {
    this.countryCode = countryCode;
    return this;
  }

 /**
   * Identifies a subdivision of a country such as state, region, county.
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress countrySubDivision(Object countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return department
  **/
  @JsonProperty("Department")
  @NotNull
  public Object getDepartment() {
    return department;
  }

  public void setDepartment(Object department) {
    this.department = department;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress department(Object department) {
    this.department = department;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 16 characters.&lt;br/&gt;
   * @return postCode
  **/
  @JsonProperty("PostCode")
  @NotNull
  public Object getPostCode() {
    return postCode;
  }

  public void setPostCode(Object postCode) {
    this.postCode = postCode;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress postCode(Object postCode) {
    this.postCode = postCode;
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress streetName(Object streetName) {
    this.streetName = streetName;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return subDepartment
  **/
  @JsonProperty("SubDepartment")
  @NotNull
  public Object getSubDepartment() {
    return subDepartment;
  }

  public void setSubDepartment(Object subDepartment) {
    this.subDepartment = subDepartment;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress subDepartment(Object subDepartment) {
    this.subDepartment = subDepartment;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress townName(Object townName) {
    this.townName = townName;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
