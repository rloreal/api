package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Communication information.&lt;br/&gt;
 */
@Schema(description = "Communication information.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact   {
  @JsonProperty("AdditionalContactInformation")
  private Object additionalContactInformation = null;

  @JsonProperty("CustomerService")
  private Object customerService = null;

  @JsonProperty("Email")
  private Object email = null;

  @JsonProperty("Phone")
  private Object phone = null;

  @JsonProperty("PostalAddress")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress postalAddress = null;

  @JsonProperty("URLAddress")
  private Object urLAddress = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact additionalContactInformation(Object additionalContactInformation) {
    this.additionalContactInformation = additionalContactInformation;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 256 characters.<br/>
   * @return additionalContactInformation
   **/
  @Schema(description = "Specifies a character string with a maximum length of 256 characters.<br/>")
      @NotNull

    public Object getAdditionalContactInformation() {
    return additionalContactInformation;
  }

  public void setAdditionalContactInformation(Object additionalContactInformation) {
    this.additionalContactInformation = additionalContactInformation;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact customerService(Object customerService) {
    this.customerService = customerService;
    return this;
  }

  /**
   * The collection of information which identifies a specific phone or FAX number as defined by telecom services. It consists of a \"+\" followed by the country code (from 1 to 3 characters) then a \"-\" and finally, any combination of numbers, \"(\", \")\", \"+\" and \"-\" (up to 30 characters).<br/>
   * @return customerService
   **/
  @Schema(description = "The collection of information which identifies a specific phone or FAX number as defined by telecom services. It consists of a \"+\" followed by the country code (from 1 to 3 characters) then a \"-\" and finally, any combination of numbers, \"(\", \")\", \"+\" and \"-\" (up to 30 characters).<br/>")
      @NotNull

    public Object getCustomerService() {
    return customerService;
  }

  public void setCustomerService(Object customerService) {
    this.customerService = customerService;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact email(Object email) {
    this.email = email;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 256 characters.<br/>
   * @return email
   **/
  @Schema(description = "Specifies a character string with a maximum length of 256 characters.<br/>")
      @NotNull

    public Object getEmail() {
    return email;
  }

  public void setEmail(Object email) {
    this.email = email;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact phone(Object phone) {
    this.phone = phone;
    return this;
  }

  /**
   * The collection of information which identifies a specific phone or FAX number as defined by telecom services. It consists of a \"+\" followed by the country code (from 1 to 3 characters) then a \"-\" and finally, any combination of numbers, \"(\", \")\", \"+\" and \"-\" (up to 30 characters).<br/>
   * @return phone
   **/
  @Schema(description = "The collection of information which identifies a specific phone or FAX number as defined by telecom services. It consists of a \"+\" followed by the country code (from 1 to 3 characters) then a \"-\" and finally, any combination of numbers, \"(\", \")\", \"+\" and \"-\" (up to 30 characters).<br/>")
      @NotNull

    public Object getPhone() {
    return phone;
  }

  public void setPhone(Object phone) {
    this.phone = phone;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact postalAddress(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Get postalAddress
   * @return postalAddress
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress postalAddress) {
    this.postalAddress = postalAddress;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact urLAddress(Object urLAddress) {
    this.urLAddress = urLAddress;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 256 characters.<br/>
   * @return urLAddress
   **/
  @Schema(description = "Specifies a character string with a maximum length of 256 characters.<br/>")
      @NotNull

    public Object getUrLAddress() {
    return urLAddress;
  }

  public void setUrLAddress(Object urLAddress) {
    this.urLAddress = urLAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact poipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact = (PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact) o;
    return Objects.equals(this.additionalContactInformation, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact.additionalContactInformation) &&
        Objects.equals(this.customerService, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact.customerService) &&
        Objects.equals(this.email, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact.email) &&
        Objects.equals(this.phone, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact.phone) &&
        Objects.equals(this.postalAddress, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact.postalAddress) &&
        Objects.equals(this.urLAddress, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact.urLAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalContactInformation, customerService, email, phone, postalAddress, urLAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact {\n");
    
    sb.append("    additionalContactInformation: ").append(toIndentedString(additionalContactInformation)).append("\n");
    sb.append("    customerService: ").append(toIndentedString(customerService)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    urLAddress: ").append(toIndentedString(urLAddress)).append("\n");
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
