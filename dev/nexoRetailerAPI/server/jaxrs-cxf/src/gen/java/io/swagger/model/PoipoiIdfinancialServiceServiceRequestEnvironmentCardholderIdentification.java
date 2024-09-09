package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth;
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
  * Set of unique and unambiguous ways to identify a person.<br/>
 **/
@Schema(description="Set of unique and unambiguous ways to identify a person.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification   {
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object alienRegistrationNumber = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object customerNumber = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object department = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object driverIdentification = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object driverLicenseLocation = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object driverLicenseNumber = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object driverLicenseName = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth dateAndPlaceOfBirth = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 256 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 256 characters.<br/>  
  **/
  private Object emailAddress = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object identityCardNumber = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object jobNumber = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object employeeIdentificationNumber = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object employerIdentificationNumber = null;
  
  @Schema(description = "Unique identification of a person, as assigned by an institution, using an identification scheme.")
 /**
   * Unique identification of a person, as assigned by an institution, using an identification scheme.  
  **/
  private Object other = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object passportNumber = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object socialSecurityNumber = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object taxIdentificationNumber = null;
 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return alienRegistrationNumber
  **/
  @JsonProperty("AlienRegistrationNumber")
  @NotNull
  public Object getAlienRegistrationNumber() {
    return alienRegistrationNumber;
  }

  public void setAlienRegistrationNumber(Object alienRegistrationNumber) {
    this.alienRegistrationNumber = alienRegistrationNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification alienRegistrationNumber(Object alienRegistrationNumber) {
    this.alienRegistrationNumber = alienRegistrationNumber;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return customerNumber
  **/
  @JsonProperty("CustomerNumber")
  @NotNull
  public Object getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(Object customerNumber) {
    this.customerNumber = customerNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification customerNumber(Object customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification department(Object department) {
    this.department = department;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return driverIdentification
  **/
  @JsonProperty("DriverIdentification")
  @NotNull
  public Object getDriverIdentification() {
    return driverIdentification;
  }

  public void setDriverIdentification(Object driverIdentification) {
    this.driverIdentification = driverIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification driverIdentification(Object driverIdentification) {
    this.driverIdentification = driverIdentification;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return driverLicenseLocation
  **/
  @JsonProperty("DriverLicenseLocation")
  @NotNull
  public Object getDriverLicenseLocation() {
    return driverLicenseLocation;
  }

  public void setDriverLicenseLocation(Object driverLicenseLocation) {
    this.driverLicenseLocation = driverLicenseLocation;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification driverLicenseLocation(Object driverLicenseLocation) {
    this.driverLicenseLocation = driverLicenseLocation;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return driverLicenseNumber
  **/
  @JsonProperty("DriverLicenseNumber")
  @NotNull
  public Object getDriverLicenseNumber() {
    return driverLicenseNumber;
  }

  public void setDriverLicenseNumber(Object driverLicenseNumber) {
    this.driverLicenseNumber = driverLicenseNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification driverLicenseNumber(Object driverLicenseNumber) {
    this.driverLicenseNumber = driverLicenseNumber;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return driverLicenseName
  **/
  @JsonProperty("DriverLicenseName")
  @NotNull
  public Object getDriverLicenseName() {
    return driverLicenseName;
  }

  public void setDriverLicenseName(Object driverLicenseName) {
    this.driverLicenseName = driverLicenseName;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification driverLicenseName(Object driverLicenseName) {
    this.driverLicenseName = driverLicenseName;
    return this;
  }

 /**
   * Get dateAndPlaceOfBirth
   * @return dateAndPlaceOfBirth
  **/
  @JsonProperty("DateAndPlaceOfBirth")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth getDateAndPlaceOfBirth() {
    return dateAndPlaceOfBirth;
  }

  public void setDateAndPlaceOfBirth(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth dateAndPlaceOfBirth) {
    this.dateAndPlaceOfBirth = dateAndPlaceOfBirth;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification dateAndPlaceOfBirth(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth dateAndPlaceOfBirth) {
    this.dateAndPlaceOfBirth = dateAndPlaceOfBirth;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 256 characters.&lt;br/&gt;
   * @return emailAddress
  **/
  @JsonProperty("EmailAddress")
  @NotNull
  public Object getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(Object emailAddress) {
    this.emailAddress = emailAddress;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification emailAddress(Object emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return identityCardNumber
  **/
  @JsonProperty("IdentityCardNumber")
  @NotNull
  public Object getIdentityCardNumber() {
    return identityCardNumber;
  }

  public void setIdentityCardNumber(Object identityCardNumber) {
    this.identityCardNumber = identityCardNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification identityCardNumber(Object identityCardNumber) {
    this.identityCardNumber = identityCardNumber;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return jobNumber
  **/
  @JsonProperty("JobNumber")
  @NotNull
  public Object getJobNumber() {
    return jobNumber;
  }

  public void setJobNumber(Object jobNumber) {
    this.jobNumber = jobNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification jobNumber(Object jobNumber) {
    this.jobNumber = jobNumber;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return employeeIdentificationNumber
  **/
  @JsonProperty("EmployeeIdentificationNumber")
  @NotNull
  public Object getEmployeeIdentificationNumber() {
    return employeeIdentificationNumber;
  }

  public void setEmployeeIdentificationNumber(Object employeeIdentificationNumber) {
    this.employeeIdentificationNumber = employeeIdentificationNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification employeeIdentificationNumber(Object employeeIdentificationNumber) {
    this.employeeIdentificationNumber = employeeIdentificationNumber;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return employerIdentificationNumber
  **/
  @JsonProperty("EmployerIdentificationNumber")
  @NotNull
  public Object getEmployerIdentificationNumber() {
    return employerIdentificationNumber;
  }

  public void setEmployerIdentificationNumber(Object employerIdentificationNumber) {
    this.employerIdentificationNumber = employerIdentificationNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification employerIdentificationNumber(Object employerIdentificationNumber) {
    this.employerIdentificationNumber = employerIdentificationNumber;
    return this;
  }

 /**
   * Unique identification of a person, as assigned by an institution, using an identification scheme.
   * @return other
  **/
  @JsonProperty("Other")
  @NotNull
  public Object getOther() {
    return other;
  }

  public void setOther(Object other) {
    this.other = other;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification other(Object other) {
    this.other = other;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return passportNumber
  **/
  @JsonProperty("PassportNumber")
  @NotNull
  public Object getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(Object passportNumber) {
    this.passportNumber = passportNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification passportNumber(Object passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return socialSecurityNumber
  **/
  @JsonProperty("SocialSecurityNumber")
  @NotNull
  public Object getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(Object socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification socialSecurityNumber(Object socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return taxIdentificationNumber
  **/
  @JsonProperty("TaxIdentificationNumber")
  @NotNull
  public Object getTaxIdentificationNumber() {
    return taxIdentificationNumber;
  }

  public void setTaxIdentificationNumber(Object taxIdentificationNumber) {
    this.taxIdentificationNumber = taxIdentificationNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification taxIdentificationNumber(Object taxIdentificationNumber) {
    this.taxIdentificationNumber = taxIdentificationNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification {\n");
    
    sb.append("    alienRegistrationNumber: ").append(toIndentedString(alienRegistrationNumber)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    driverIdentification: ").append(toIndentedString(driverIdentification)).append("\n");
    sb.append("    driverLicenseLocation: ").append(toIndentedString(driverLicenseLocation)).append("\n");
    sb.append("    driverLicenseNumber: ").append(toIndentedString(driverLicenseNumber)).append("\n");
    sb.append("    driverLicenseName: ").append(toIndentedString(driverLicenseName)).append("\n");
    sb.append("    dateAndPlaceOfBirth: ").append(toIndentedString(dateAndPlaceOfBirth)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    identityCardNumber: ").append(toIndentedString(identityCardNumber)).append("\n");
    sb.append("    jobNumber: ").append(toIndentedString(jobNumber)).append("\n");
    sb.append("    employeeIdentificationNumber: ").append(toIndentedString(employeeIdentificationNumber)).append("\n");
    sb.append("    employerIdentificationNumber: ").append(toIndentedString(employerIdentificationNumber)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    taxIdentificationNumber: ").append(toIndentedString(taxIdentificationNumber)).append("\n");
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
