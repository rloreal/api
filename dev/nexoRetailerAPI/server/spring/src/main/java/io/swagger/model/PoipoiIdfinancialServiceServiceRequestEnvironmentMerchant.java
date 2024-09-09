package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Merchant performing the transaction.&lt;br/&gt;
 */
@Schema(description = "Merchant performing the transaction.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant   {
  @JsonProperty("CommonName")
  private Object commonName = null;

  @JsonProperty("Identification")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification identification = null;

  @JsonProperty("LocationAndContact")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact locationAndContact = null;

  @JsonProperty("LocationCategory")
  private Object locationCategory = null;

  @JsonProperty("SchemeData")
  private Object schemeData = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant commonName(Object commonName) {
    this.commonName = commonName;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return commonName
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getCommonName() {
    return commonName;
  }

  public void setCommonName(Object commonName) {
    this.commonName = commonName;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant identification(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification getIdentification() {
    return identification;
  }

  public void setIdentification(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification identification) {
    this.identification = identification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant locationAndContact(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact locationAndContact) {
    this.locationAndContact = locationAndContact;
    return this;
  }

  /**
   * Get locationAndContact
   * @return locationAndContact
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact getLocationAndContact() {
    return locationAndContact;
  }

  public void setLocationAndContact(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantLocationAndContact locationAndContact) {
    this.locationAndContact = locationAndContact;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant locationCategory(Object locationCategory) {
    this.locationCategory = locationCategory;
    return this;
  }

  /**
   * Indicates the type of integration of the POI terminal in the sale environment.<br/>- **ABRD: Aboard**  : *Aboard is used when the sale is done in a vehicle (e.g a bus, train, ship, airplane,  taxi, etc).*<br/>- **NMDC: Nomadic**  : *Nomadic is used when the merchant is traveling to different locations (e.g fair or  sport events, home delivery, food truck).*<br/>- **FIXD: PhysicalShop**  : *Fixed location, for example in a shop.*<br/>- **VIRT: VirtualShop**  : *Virtual Shop is used for any ecommerce solution.*<br/>
   * @return locationCategory
   **/
  @Schema(description = "Indicates the type of integration of the POI terminal in the sale environment.<br/>- **ABRD: Aboard**  : *Aboard is used when the sale is done in a vehicle (e.g a bus, train, ship, airplane,  taxi, etc).*<br/>- **NMDC: Nomadic**  : *Nomadic is used when the merchant is traveling to different locations (e.g fair or  sport events, home delivery, food truck).*<br/>- **FIXD: PhysicalShop**  : *Fixed location, for example in a shop.*<br/>- **VIRT: VirtualShop**  : *Virtual Shop is used for any ecommerce solution.*<br/>")
      @NotNull

    public Object getLocationCategory() {
    return locationCategory;
  }

  public void setLocationCategory(Object locationCategory) {
    this.locationCategory = locationCategory;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant schemeData(Object schemeData) {
    this.schemeData = schemeData;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 140 characters.<br/>
   * @return schemeData
   **/
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
      @NotNull

    public Object getSchemeData() {
    return schemeData;
  }

  public void setSchemeData(Object schemeData) {
    this.schemeData = schemeData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant poipoiIdfinancialServiceServiceRequestEnvironmentMerchant = (PoipoiIdfinancialServiceServiceRequestEnvironmentMerchant) o;
    return Objects.equals(this.commonName, poipoiIdfinancialServiceServiceRequestEnvironmentMerchant.commonName) &&
        Objects.equals(this.identification, poipoiIdfinancialServiceServiceRequestEnvironmentMerchant.identification) &&
        Objects.equals(this.locationAndContact, poipoiIdfinancialServiceServiceRequestEnvironmentMerchant.locationAndContact) &&
        Objects.equals(this.locationCategory, poipoiIdfinancialServiceServiceRequestEnvironmentMerchant.locationCategory) &&
        Objects.equals(this.schemeData, poipoiIdfinancialServiceServiceRequestEnvironmentMerchant.schemeData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonName, identification, locationAndContact, locationCategory, schemeData);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
