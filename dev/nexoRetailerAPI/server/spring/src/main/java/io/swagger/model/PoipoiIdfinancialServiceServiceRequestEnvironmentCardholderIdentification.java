package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Set of unique and unambiguous ways to identify a person.&lt;br/&gt;
 */
@Schema(description = "Set of unique and unambiguous ways to identify a person.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification   {
  @JsonProperty("AlienRegistrationNumber")
  private Object alienRegistrationNumber = null;

  @JsonProperty("CustomerNumber")
  private Object customerNumber = null;

  @JsonProperty("Department")
  private Object department = null;

  @JsonProperty("DriverIdentification")
  private Object driverIdentification = null;

  @JsonProperty("DriverLicenseLocation")
  private Object driverLicenseLocation = null;

  @JsonProperty("DriverLicenseNumber")
  private Object driverLicenseNumber = null;

  @JsonProperty("DriverLicenseName")
  private Object driverLicenseName = null;

  @JsonProperty("DateAndPlaceOfBirth")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth dateAndPlaceOfBirth = null;

  @JsonProperty("EmailAddress")
  private Object emailAddress = null;

  @JsonProperty("IdentityCardNumber")
  private Object identityCardNumber = null;

  @JsonProperty("JobNumber")
  private Object jobNumber = null;

  @JsonProperty("EmployeeIdentificationNumber")
  private Object employeeIdentificationNumber = null;

  @JsonProperty("EmployerIdentificationNumber")
  private Object employerIdentificationNumber = null;

  @JsonProperty("Other")
  private Object other = null;

  @JsonProperty("PassportNumber")
  private Object passportNumber = null;

  @JsonProperty("SocialSecurityNumber")
  private Object socialSecurityNumber = null;

  @JsonProperty("TaxIdentificationNumber")
  private Object taxIdentificationNumber = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification alienRegistrationNumber(Object alienRegistrationNumber) {
    this.alienRegistrationNumber = alienRegistrationNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return alienRegistrationNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getAlienRegistrationNumber() {
    return alienRegistrationNumber;
  }

  public void setAlienRegistrationNumber(Object alienRegistrationNumber) {
    this.alienRegistrationNumber = alienRegistrationNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification customerNumber(Object customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return customerNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(Object customerNumber) {
    this.customerNumber = customerNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification department(Object department) {
    this.department = department;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return department
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getDepartment() {
    return department;
  }

  public void setDepartment(Object department) {
    this.department = department;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification driverIdentification(Object driverIdentification) {
    this.driverIdentification = driverIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return driverIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getDriverIdentification() {
    return driverIdentification;
  }

  public void setDriverIdentification(Object driverIdentification) {
    this.driverIdentification = driverIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification driverLicenseLocation(Object driverLicenseLocation) {
    this.driverLicenseLocation = driverLicenseLocation;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return driverLicenseLocation
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getDriverLicenseLocation() {
    return driverLicenseLocation;
  }

  public void setDriverLicenseLocation(Object driverLicenseLocation) {
    this.driverLicenseLocation = driverLicenseLocation;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification driverLicenseNumber(Object driverLicenseNumber) {
    this.driverLicenseNumber = driverLicenseNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return driverLicenseNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getDriverLicenseNumber() {
    return driverLicenseNumber;
  }

  public void setDriverLicenseNumber(Object driverLicenseNumber) {
    this.driverLicenseNumber = driverLicenseNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification driverLicenseName(Object driverLicenseName) {
    this.driverLicenseName = driverLicenseName;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return driverLicenseName
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getDriverLicenseName() {
    return driverLicenseName;
  }

  public void setDriverLicenseName(Object driverLicenseName) {
    this.driverLicenseName = driverLicenseName;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification dateAndPlaceOfBirth(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth dateAndPlaceOfBirth) {
    this.dateAndPlaceOfBirth = dateAndPlaceOfBirth;
    return this;
  }

  /**
   * Get dateAndPlaceOfBirth
   * @return dateAndPlaceOfBirth
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth getDateAndPlaceOfBirth() {
    return dateAndPlaceOfBirth;
  }

  public void setDateAndPlaceOfBirth(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentificationDateAndPlaceOfBirth dateAndPlaceOfBirth) {
    this.dateAndPlaceOfBirth = dateAndPlaceOfBirth;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification emailAddress(Object emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 256 characters.<br/>
   * @return emailAddress
   **/
  @Schema(description = "Specifies a character string with a maximum length of 256 characters.<br/>")
      @NotNull

    public Object getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(Object emailAddress) {
    this.emailAddress = emailAddress;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification identityCardNumber(Object identityCardNumber) {
    this.identityCardNumber = identityCardNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return identityCardNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getIdentityCardNumber() {
    return identityCardNumber;
  }

  public void setIdentityCardNumber(Object identityCardNumber) {
    this.identityCardNumber = identityCardNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification jobNumber(Object jobNumber) {
    this.jobNumber = jobNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return jobNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getJobNumber() {
    return jobNumber;
  }

  public void setJobNumber(Object jobNumber) {
    this.jobNumber = jobNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification employeeIdentificationNumber(Object employeeIdentificationNumber) {
    this.employeeIdentificationNumber = employeeIdentificationNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return employeeIdentificationNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getEmployeeIdentificationNumber() {
    return employeeIdentificationNumber;
  }

  public void setEmployeeIdentificationNumber(Object employeeIdentificationNumber) {
    this.employeeIdentificationNumber = employeeIdentificationNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification employerIdentificationNumber(Object employerIdentificationNumber) {
    this.employerIdentificationNumber = employerIdentificationNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return employerIdentificationNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getEmployerIdentificationNumber() {
    return employerIdentificationNumber;
  }

  public void setEmployerIdentificationNumber(Object employerIdentificationNumber) {
    this.employerIdentificationNumber = employerIdentificationNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification other(Object other) {
    this.other = other;
    return this;
  }

  /**
   * Unique identification of a person, as assigned by an institution, using an identification scheme.
   * @return other
   **/
  @Schema(description = "Unique identification of a person, as assigned by an institution, using an identification scheme.")
      @NotNull

    public Object getOther() {
    return other;
  }

  public void setOther(Object other) {
    this.other = other;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification passportNumber(Object passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return passportNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(Object passportNumber) {
    this.passportNumber = passportNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification socialSecurityNumber(Object socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return socialSecurityNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(Object socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification taxIdentificationNumber(Object taxIdentificationNumber) {
    this.taxIdentificationNumber = taxIdentificationNumber;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return taxIdentificationNumber
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getTaxIdentificationNumber() {
    return taxIdentificationNumber;
  }

  public void setTaxIdentificationNumber(Object taxIdentificationNumber) {
    this.taxIdentificationNumber = taxIdentificationNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification = (PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification) o;
    return Objects.equals(this.alienRegistrationNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.alienRegistrationNumber) &&
        Objects.equals(this.customerNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.customerNumber) &&
        Objects.equals(this.department, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.department) &&
        Objects.equals(this.driverIdentification, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.driverIdentification) &&
        Objects.equals(this.driverLicenseLocation, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.driverLicenseLocation) &&
        Objects.equals(this.driverLicenseNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.driverLicenseNumber) &&
        Objects.equals(this.driverLicenseName, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.driverLicenseName) &&
        Objects.equals(this.dateAndPlaceOfBirth, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.dateAndPlaceOfBirth) &&
        Objects.equals(this.emailAddress, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.emailAddress) &&
        Objects.equals(this.identityCardNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.identityCardNumber) &&
        Objects.equals(this.jobNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.jobNumber) &&
        Objects.equals(this.employeeIdentificationNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.employeeIdentificationNumber) &&
        Objects.equals(this.employerIdentificationNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.employerIdentificationNumber) &&
        Objects.equals(this.other, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.other) &&
        Objects.equals(this.passportNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.passportNumber) &&
        Objects.equals(this.socialSecurityNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.socialSecurityNumber) &&
        Objects.equals(this.taxIdentificationNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardholderIdentification.taxIdentificationNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alienRegistrationNumber, customerNumber, department, driverIdentification, driverLicenseLocation, driverLicenseNumber, driverLicenseName, dateAndPlaceOfBirth, emailAddress, identityCardNumber, jobNumber, employeeIdentificationNumber, employerIdentificationNumber, other, passportNumber, socialSecurityNumber, taxIdentificationNumber);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
