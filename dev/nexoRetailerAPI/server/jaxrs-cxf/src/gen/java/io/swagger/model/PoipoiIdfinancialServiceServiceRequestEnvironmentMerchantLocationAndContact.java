package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress;
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
  * Communication information.<br/>
 **/
@Schema(description="Communication information.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact   {
  
  @Schema(description = "Specifies a character string with a maximum length of 256 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 256 characters.<br/>  
  **/
  private Object additionalContactInformation = null;
  
  @Schema(description = "The collection of information which identifies a specific phone or FAX number as defined by telecom services. It consists of a \"+\" followed by the country code (from 1 to 3 characters) then a \"-\" and finally, any combination of numbers, \"(\", \")\", \"+\" and \"-\" (up to 30 characters).<br/>")
 /**
   * The collection of information which identifies a specific phone or FAX number as defined by telecom services. It consists of a \"+\" followed by the country code (from 1 to 3 characters) then a \"-\" and finally, any combination of numbers, \"(\", \")\", \"+\" and \"-\" (up to 30 characters).<br/>  
  **/
  private Object customerService = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 256 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 256 characters.<br/>  
  **/
  private Object email = null;
  
  @Schema(description = "The collection of information which identifies a specific phone or FAX number as defined by telecom services. It consists of a \"+\" followed by the country code (from 1 to 3 characters) then a \"-\" and finally, any combination of numbers, \"(\", \")\", \"+\" and \"-\" (up to 30 characters).<br/>")
 /**
   * The collection of information which identifies a specific phone or FAX number as defined by telecom services. It consists of a \"+\" followed by the country code (from 1 to 3 characters) then a \"-\" and finally, any combination of numbers, \"(\", \")\", \"+\" and \"-\" (up to 30 characters).<br/>  
  **/
  private Object phone = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress postalAddress = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 256 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 256 characters.<br/>  
  **/
  private Object urLAddress = null;
 /**
   * Specifies a character string with a maximum length of 256 characters.&lt;br/&gt;
   * @return additionalContactInformation
  **/
  @JsonProperty("AdditionalContactInformation")
  @NotNull
  public Object getAdditionalContactInformation() {
    return additionalContactInformation;
  }

  public void setAdditionalContactInformation(Object additionalContactInformation) {
    this.additionalContactInformation = additionalContactInformation;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact additionalContactInformation(Object additionalContactInformation) {
    this.additionalContactInformation = additionalContactInformation;
    return this;
  }

 /**
   * The collection of information which identifies a specific phone or FAX number as defined by telecom services. It consists of a \&quot;+\&quot; followed by the country code (from 1 to 3 characters) then a \&quot;-\&quot; and finally, any combination of numbers, \&quot;(\&quot;, \&quot;)\&quot;, \&quot;+\&quot; and \&quot;-\&quot; (up to 30 characters).&lt;br/&gt;
   * @return customerService
  **/
  @JsonProperty("CustomerService")
  @NotNull
  public Object getCustomerService() {
    return customerService;
  }

  public void setCustomerService(Object customerService) {
    this.customerService = customerService;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact customerService(Object customerService) {
    this.customerService = customerService;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 256 characters.&lt;br/&gt;
   * @return email
  **/
  @JsonProperty("Email")
  @NotNull
  public Object getEmail() {
    return email;
  }

  public void setEmail(Object email) {
    this.email = email;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact email(Object email) {
    this.email = email;
    return this;
  }

 /**
   * The collection of information which identifies a specific phone or FAX number as defined by telecom services. It consists of a \&quot;+\&quot; followed by the country code (from 1 to 3 characters) then a \&quot;-\&quot; and finally, any combination of numbers, \&quot;(\&quot;, \&quot;)\&quot;, \&quot;+\&quot; and \&quot;-\&quot; (up to 30 characters).&lt;br/&gt;
   * @return phone
  **/
  @JsonProperty("Phone")
  @NotNull
  public Object getPhone() {
    return phone;
  }

  public void setPhone(Object phone) {
    this.phone = phone;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact phone(Object phone) {
    this.phone = phone;
    return this;
  }

 /**
   * Get postalAddress
   * @return postalAddress
  **/
  @JsonProperty("PostalAddress")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress postalAddress) {
    this.postalAddress = postalAddress;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact postalAddress(PoipoiIdfinancialServiceServiceRequestEnvironmentCardholderBillingAddress postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 256 characters.&lt;br/&gt;
   * @return urLAddress
  **/
  @JsonProperty("URLAddress")
  @NotNull
  public Object getUrLAddress() {
    return urLAddress;
  }

  public void setUrLAddress(Object urLAddress) {
    this.urLAddress = urLAddress;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact urLAddress(Object urLAddress) {
    this.urLAddress = urLAddress;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
