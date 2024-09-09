package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocation;
import io.swagger.model.PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identification of an entity.&lt;br/&gt;
 */
@Schema(description = "Identification of an entity.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceHeaderInitiatingParty   {
  @JsonProperty("Country")
  private Object country = null;

  @JsonProperty("Geolocation")
  private PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocation geolocation = null;

  @JsonProperty("Identification")
  private Object identification = null;

  @JsonProperty("Issuer")
  private Object issuer = null;

  @JsonProperty("RemoteAccess")
  private PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess remoteAccess = null;

  @JsonProperty("ShortName")
  private Object shortName = null;

  @JsonProperty("Type")
  private Object type = null;

  public PoipoiIdfinancialServiceHeaderInitiatingParty country(Object country) {
    this.country = country;
    return this;
  }

  /**
   * Specifies an alpha string with a minimum length of 2 characters and a maximum length of 3 characters.<br/>
   * @return country
   **/
  @Schema(description = "Specifies an alpha string with a minimum length of 2 characters and a maximum length of 3 characters.<br/>")
      @NotNull

    public Object getCountry() {
    return country;
  }

  public void setCountry(Object country) {
    this.country = country;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingParty geolocation(PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocation geolocation) {
    this.geolocation = geolocation;
    return this;
  }

  /**
   * Get geolocation
   * @return geolocation
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocation getGeolocation() {
    return geolocation;
  }

  public void setGeolocation(PoipoiIdfinancialServiceHeaderInitiatingPartyGeolocation geolocation) {
    this.geolocation = geolocation;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingParty identification(Object identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return identification
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getIdentification() {
    return identification;
  }

  public void setIdentification(Object identification) {
    this.identification = identification;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingParty issuer(Object issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Identification of the type of entity involved in a transaction.<br/>- **OPOI: OriginatingPOI**  : *Point Of Interaction initiating the card payment transaction.*<br/>- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*<br/>- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*<br/>- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*<br/>- **ACQR: Acquirer**  : *Entity acquiring card transactions.*<br/>- **CISS: CardIssuer**  : *Party that issues cards.*<br/>- **DLIS: DelegateIssuer**  : *Party to whom the card issuer delegates to authorise card payment transactions.*<br/>- **MTMG: MasterTerminalManager**  : *Responsible for the maintenance of a card payment acceptance terminal.*<br/>- **TAXH: TaxAuthority**  : *Tax authority.*<br/>- **TMGT: TerminalManager**  : *Responsible for one or several maintenance functions of a card payment acceptance terminal.*<br/>
   * @return issuer
   **/
  @Schema(example = "OPOI", description = "Identification of the type of entity involved in a transaction.<br/>- **OPOI: OriginatingPOI**  : *Point Of Interaction initiating the card payment transaction.*<br/>- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*<br/>- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*<br/>- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*<br/>- **ACQR: Acquirer**  : *Entity acquiring card transactions.*<br/>- **CISS: CardIssuer**  : *Party that issues cards.*<br/>- **DLIS: DelegateIssuer**  : *Party to whom the card issuer delegates to authorise card payment transactions.*<br/>- **MTMG: MasterTerminalManager**  : *Responsible for the maintenance of a card payment acceptance terminal.*<br/>- **TAXH: TaxAuthority**  : *Tax authority.*<br/>- **TMGT: TerminalManager**  : *Responsible for one or several maintenance functions of a card payment acceptance terminal.*<br/>")
      @NotNull

    public Object getIssuer() {
    return issuer;
  }

  public void setIssuer(Object issuer) {
    this.issuer = issuer;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingParty remoteAccess(PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess remoteAccess) {
    this.remoteAccess = remoteAccess;
    return this;
  }

  /**
   * Get remoteAccess
   * @return remoteAccess
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess getRemoteAccess() {
    return remoteAccess;
  }

  public void setRemoteAccess(PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess remoteAccess) {
    this.remoteAccess = remoteAccess;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingParty shortName(Object shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return shortName
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getShortName() {
    return shortName;
  }

  public void setShortName(Object shortName) {
    this.shortName = shortName;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingParty type(Object type) {
    this.type = type;
    return this;
  }

  /**
   * Identification of the type of entity involved in a transaction.<br/>- **OPOI: OriginatingPOI**  : *Point Of Interaction initiating the card payment transaction.*<br/>- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*<br/>- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*<br/>- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*<br/>- **ACQR: Acquirer**  : *Entity acquiring card transactions.*<br/>- **CISS: CardIssuer**  : *Party that issues cards.*<br/>- **DLIS: DelegateIssuer**  : *Party to whom the card issuer delegates to authorise card payment transactions.*<br/>- **MTMG: MasterTerminalManager**  : *Responsible for the maintenance of a card payment acceptance terminal.*<br/>- **TAXH: TaxAuthority**  : *Tax authority.*<br/>- **TMGT: TerminalManager**  : *Responsible for one or several maintenance functions of a card payment acceptance terminal.*<br/>
   * @return type
   **/
  @Schema(example = "OPOI", description = "Identification of the type of entity involved in a transaction.<br/>- **OPOI: OriginatingPOI**  : *Point Of Interaction initiating the card payment transaction.*<br/>- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*<br/>- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*<br/>- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*<br/>- **ACQR: Acquirer**  : *Entity acquiring card transactions.*<br/>- **CISS: CardIssuer**  : *Party that issues cards.*<br/>- **DLIS: DelegateIssuer**  : *Party to whom the card issuer delegates to authorise card payment transactions.*<br/>- **MTMG: MasterTerminalManager**  : *Responsible for the maintenance of a card payment acceptance terminal.*<br/>- **TAXH: TaxAuthority**  : *Tax authority.*<br/>- **TMGT: TerminalManager**  : *Responsible for one or several maintenance functions of a card payment acceptance terminal.*<br/>")
      @NotNull

    public Object getType() {
    return type;
  }

  public void setType(Object type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceHeaderInitiatingParty poipoiIdfinancialServiceHeaderInitiatingParty = (PoipoiIdfinancialServiceHeaderInitiatingParty) o;
    return Objects.equals(this.country, poipoiIdfinancialServiceHeaderInitiatingParty.country) &&
        Objects.equals(this.geolocation, poipoiIdfinancialServiceHeaderInitiatingParty.geolocation) &&
        Objects.equals(this.identification, poipoiIdfinancialServiceHeaderInitiatingParty.identification) &&
        Objects.equals(this.issuer, poipoiIdfinancialServiceHeaderInitiatingParty.issuer) &&
        Objects.equals(this.remoteAccess, poipoiIdfinancialServiceHeaderInitiatingParty.remoteAccess) &&
        Objects.equals(this.shortName, poipoiIdfinancialServiceHeaderInitiatingParty.shortName) &&
        Objects.equals(this.type, poipoiIdfinancialServiceHeaderInitiatingParty.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, geolocation, identification, issuer, remoteAccess, shortName, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceHeaderInitiatingParty {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    remoteAccess: ").append(toIndentedString(remoteAccess)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
