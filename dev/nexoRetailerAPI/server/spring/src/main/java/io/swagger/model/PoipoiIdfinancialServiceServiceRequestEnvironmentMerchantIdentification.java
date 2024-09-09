package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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


public class PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification   {
  @JsonProperty("Identification")
  private Object identification = null;

  @JsonProperty("Issuer")
  private Object issuer = null;

  @JsonProperty("ShortName")
  private Object shortName = null;

  @JsonProperty("Type")
  private Object type = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification identification(Object identification) {
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification issuer(Object issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Entity assigning an identification (for example merchant, acceptor, acquirer, tax authority, etc.).<br/>- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*<br/>- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*<br/>- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*<br/>- **ACQR: Acquirer**  : *Entity acquiring card transactions.*<br/>- **CISS: CardIssuer**  : *Party that issues cards.*<br/>- **TAXH: TaxAuthority**  : *Tax authority.*<br/>
   * @return issuer
   **/
  @Schema(example = "MERC", description = "Entity assigning an identification (for example merchant, acceptor, acquirer, tax authority, etc.).<br/>- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*<br/>- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*<br/>- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*<br/>- **ACQR: Acquirer**  : *Entity acquiring card transactions.*<br/>- **CISS: CardIssuer**  : *Party that issues cards.*<br/>- **TAXH: TaxAuthority**  : *Tax authority.*<br/>")
      @NotNull

    public Object getIssuer() {
    return issuer;
  }

  public void setIssuer(Object issuer) {
    this.issuer = issuer;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification shortName(Object shortName) {
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

  public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification type(Object type) {
    this.type = type;
    return this;
  }

  /**
   * Identification of the type of entity involved in a transaction.<br/>- **OPOI: OriginatingPOI**  : *Point Of Interaction initiating the card payment transaction.*<br/>- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*<br/>- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*<br/>- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*<br/>- **ACQR: Acquirer**  : *Entity acquiring card transactions.*<br/>- **CISS: CardIssuer**  : *Party that issues cards.*<br/>- **DLIS: DelegateIssuer**  : *Party to whom the card issuer delegates to authorise card payment transactions.*<br/>
   * @return type
   **/
  @Schema(example = "OPOI", description = "Identification of the type of entity involved in a transaction.<br/>- **OPOI: OriginatingPOI**  : *Point Of Interaction initiating the card payment transaction.*<br/>- **MERC: Merchant**  : *Merchant providing goods and service in the card payment transaction.*<br/>- **ACCP: Acceptor**  : *Card acceptor, party accepting the card and presenting transaction data to the acquirer.*<br/>- **ITAG: IntermediaryAgent**  : *Party acting on behalf of other parties to process or forward data to other parties.*<br/>- **ACQR: Acquirer**  : *Entity acquiring card transactions.*<br/>- **CISS: CardIssuer**  : *Party that issues cards.*<br/>- **DLIS: DelegateIssuer**  : *Party to whom the card issuer delegates to authorise card payment transactions.*<br/>")
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
    PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification poipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification = (PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification) o;
    return Objects.equals(this.identification, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification.identification) &&
        Objects.equals(this.issuer, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification.issuer) &&
        Objects.equals(this.shortName, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification.shortName) &&
        Objects.equals(this.type, poipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, issuer, shortName, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
