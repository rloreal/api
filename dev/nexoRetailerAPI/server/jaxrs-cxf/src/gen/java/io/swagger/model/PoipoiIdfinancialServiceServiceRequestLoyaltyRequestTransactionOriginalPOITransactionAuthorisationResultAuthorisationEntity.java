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
  * Identification of an entity.<br/>
 **/
@Schema(description="Identification of an entity.<br/>")
public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity   {
  
  @Schema(description = "Specifies an alpha string with a minimum length of 2 characters and a maximum length of 3 characters.<br/>")
 /**
   * Specifies an alpha string with a minimum length of 2 characters and a maximum length of 3 characters.<br/>  
  **/
  private Object country = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object identification = null;
  
  @Schema(example = "MERC", description = "Entity assigning an identification (for example merchant, acceptor, acquirer, tax authority, etc.).<br/>- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*<br/>- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*<br/>- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*<br/>- **ACQR: Acquirer**  : *Entity acquiring card transactions.*<br/>- **CISS: CardIssuer**  : *Party that issues cards.*<br/>- **TAXH: TaxAuthority**  : *Tax authority.*<br/>")
 /**
   * Entity assigning an identification (for example merchant, acceptor, acquirer, tax authority, etc.).<br/>- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*<br/>- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*<br/>- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*<br/>- **ACQR: Acquirer**  : *Entity acquiring card transactions.*<br/>- **CISS: CardIssuer**  : *Party that issues cards.*<br/>- **TAXH: TaxAuthority**  : *Tax authority.*<br/>  
  **/
  private Object issuer = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object shortName = null;
  
  @Schema(example = "OPOI", required = true, description = "Identification of the type of entity involved in a transaction.<br/>- **OPOI: OriginatingPOI**  : *Point Of Interaction initiating the card payment transaction.*<br/>- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*<br/>- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*<br/>- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*<br/>- **ACQR: Acquirer**  : *Entity acquiring card transactions.*<br/>- **CISS: CardIssuer**  : *Party that issues cards.*<br/>- **DLIS: DelegateIssuer**  : *Party to whom the card issuer delegates to authorise card payment transactions.*<br/>- **ICCA: CardApplication**  : *Application in the smart card.*<br/>")
 /**
   * Identification of the type of entity involved in a transaction.<br/>- **OPOI: OriginatingPOI**  : *Point Of Interaction initiating the card payment transaction.*<br/>- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*<br/>- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*<br/>- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*<br/>- **ACQR: Acquirer**  : *Entity acquiring card transactions.*<br/>- **CISS: CardIssuer**  : *Party that issues cards.*<br/>- **DLIS: DelegateIssuer**  : *Party to whom the card issuer delegates to authorise card payment transactions.*<br/>- **ICCA: CardApplication**  : *Application in the smart card.*<br/>  
  **/
  private Object type = null;
 /**
   * Specifies an alpha string with a minimum length of 2 characters and a maximum length of 3 characters.&lt;br/&gt;
   * @return country
  **/
  @JsonProperty("Country")
  @NotNull
  public Object getCountry() {
    return country;
  }

  public void setCountry(Object country) {
    this.country = country;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity country(Object country) {
    this.country = country;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return identification
  **/
  @JsonProperty("Identification")
  @NotNull
  public Object getIdentification() {
    return identification;
  }

  public void setIdentification(Object identification) {
    this.identification = identification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity identification(Object identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Entity assigning an identification (for example merchant, acceptor, acquirer, tax authority, etc.).&lt;br/&gt;- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*&lt;br/&gt;- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*&lt;br/&gt;- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*&lt;br/&gt;- **ACQR: Acquirer**  : *Entity acquiring card transactions.*&lt;br/&gt;- **CISS: CardIssuer**  : *Party that issues cards.*&lt;br/&gt;- **TAXH: TaxAuthority**  : *Tax authority.*&lt;br/&gt;
   * @return issuer
  **/
  @JsonProperty("Issuer")
  @NotNull
  public Object getIssuer() {
    return issuer;
  }

  public void setIssuer(Object issuer) {
    this.issuer = issuer;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity issuer(Object issuer) {
    this.issuer = issuer;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return shortName
  **/
  @JsonProperty("ShortName")
  @NotNull
  public Object getShortName() {
    return shortName;
  }

  public void setShortName(Object shortName) {
    this.shortName = shortName;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity shortName(Object shortName) {
    this.shortName = shortName;
    return this;
  }

 /**
   * Identification of the type of entity involved in a transaction.&lt;br/&gt;- **OPOI: OriginatingPOI**  : *Point Of Interaction initiating the card payment transaction.*&lt;br/&gt;- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*&lt;br/&gt;- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*&lt;br/&gt;- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*&lt;br/&gt;- **ACQR: Acquirer**  : *Entity acquiring card transactions.*&lt;br/&gt;- **CISS: CardIssuer**  : *Party that issues cards.*&lt;br/&gt;- **DLIS: DelegateIssuer**  : *Party to whom the card issuer delegates to authorise card payment transactions.*&lt;br/&gt;- **ICCA: CardApplication**  : *Application in the smart card.*&lt;br/&gt;
   * @return type
  **/
  @JsonProperty("Type")
  @NotNull
  public Object getType() {
    return type;
  }

  public void setType(Object type) {
    this.type = type;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity type(Object type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionAuthorisationResultAuthorisationEntity {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
