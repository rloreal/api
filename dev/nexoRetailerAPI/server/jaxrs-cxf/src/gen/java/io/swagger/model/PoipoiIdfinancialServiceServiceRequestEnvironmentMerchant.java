package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact;
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
  * Merchant performing the transaction.<br/>
 **/
@Schema(description="Merchant performing the transaction.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant   {
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object commonName = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification identification = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact locationAndContact = null;
  
  @Schema(description = "Indicates the type of integration of the POI terminal in the sale environment.<br/>- **ABRD: Aboard**  : *Aboard is used when the sale is done in a vehicle (e.g a bus, train, ship, airplane,  taxi, etc).*<br/>- **NMDC: Nomadic**  : *Nomadic is used when the merchant is traveling to different locations (e.g fair or  sport events, home delivery, food truck).*<br/>- **FIXD: PhysicalShop**  : *Fixed location, for example in a shop.*<br/>- **VIRT: VirtualShop**  : *Virtual Shop is used for any ecommerce solution.*<br/>")
 /**
   * Indicates the type of integration of the POI terminal in the sale environment.<br/>- **ABRD: Aboard**  : *Aboard is used when the sale is done in a vehicle (e.g a bus, train, ship, airplane,  taxi, etc).*<br/>- **NMDC: Nomadic**  : *Nomadic is used when the merchant is traveling to different locations (e.g fair or  sport events, home delivery, food truck).*<br/>- **FIXD: PhysicalShop**  : *Fixed location, for example in a shop.*<br/>- **VIRT: VirtualShop**  : *Virtual Shop is used for any ecommerce solution.*<br/>  
  **/
  private Object locationCategory = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 140 characters.<br/>  
  **/
  private Object schemeData = null;
 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return commonName
  **/
  @JsonProperty("CommonName")
  @NotNull
  public Object getCommonName() {
    return commonName;
  }

  public void setCommonName(Object commonName) {
    this.commonName = commonName;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant commonName(Object commonName) {
    this.commonName = commonName;
    return this;
  }

 /**
   * Get identification
   * @return identification
  **/
  @JsonProperty("Identification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification getIdentification() {
    return identification;
  }

  public void setIdentification(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification identification) {
    this.identification = identification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant identification(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Get locationAndContact
   * @return locationAndContact
  **/
  @JsonProperty("LocationAndContact")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact getLocationAndContact() {
    return locationAndContact;
  }

  public void setLocationAndContact(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact locationAndContact) {
    this.locationAndContact = locationAndContact;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant locationAndContact(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact locationAndContact) {
    this.locationAndContact = locationAndContact;
    return this;
  }

 /**
   * Indicates the type of integration of the POI terminal in the sale environment.&lt;br/&gt;- **ABRD: Aboard**  : *Aboard is used when the sale is done in a vehicle (e.g a bus, train, ship, airplane,  taxi, etc).*&lt;br/&gt;- **NMDC: Nomadic**  : *Nomadic is used when the merchant is traveling to different locations (e.g fair or  sport events, home delivery, food truck).*&lt;br/&gt;- **FIXD: PhysicalShop**  : *Fixed location, for example in a shop.*&lt;br/&gt;- **VIRT: VirtualShop**  : *Virtual Shop is used for any ecommerce solution.*&lt;br/&gt;
   * @return locationCategory
  **/
  @JsonProperty("LocationCategory")
  @NotNull
  public Object getLocationCategory() {
    return locationCategory;
  }

  public void setLocationCategory(Object locationCategory) {
    this.locationCategory = locationCategory;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant locationCategory(Object locationCategory) {
    this.locationCategory = locationCategory;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 140 characters.&lt;br/&gt;
   * @return schemeData
  **/
  @JsonProperty("SchemeData")
  @NotNull
  public Object getSchemeData() {
    return schemeData;
  }

  public void setSchemeData(Object schemeData) {
    this.schemeData = schemeData;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant schemeData(Object schemeData) {
    this.schemeData = schemeData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant {\n");
    
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    locationAndContact: ").append(toIndentedString(locationAndContact)).append("\n");
    sb.append("    locationCategory: ").append(toIndentedString(locationCategory)).append("\n");
    sb.append("    schemeData: ").append(toIndentedString(schemeData)).append("\n");
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
