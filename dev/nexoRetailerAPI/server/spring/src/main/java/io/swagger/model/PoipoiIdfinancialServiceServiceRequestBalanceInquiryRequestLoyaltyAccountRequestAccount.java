package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Loyalty Account description.&lt;br/&gt;
 */
@Schema(description = "Loyalty Account description.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount   {
  @JsonProperty("Balance")
  private Object balance = null;

  @JsonProperty("Brand")
  private Object brand = null;

  @JsonProperty("Currency")
  private Object currency = null;

  @JsonProperty("IdentificationType")
  private Object identificationType = null;

  @JsonProperty("LoyaltyIdentification")
  private Object loyaltyIdentification = null;

  @JsonProperty("EntryMode")
  private Object entryMode = null;

  @JsonProperty("OwnerName")
  private Object ownerName = null;

  @JsonProperty("Provider")
  private Object provider = null;

  @JsonProperty("Unit")
  private Object unit = null;

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount balance(Object balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return balance
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getBalance() {
    return balance;
  }

  public void setBalance(Object balance) {
    this.balance = balance;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount brand(Object brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return brand
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getBrand() {
    return brand;
  }

  public void setBrand(Object brand) {
    this.brand = brand;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount currency(Object currency) {
    this.currency = currency;
    return this;
  }

  /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>
   * @return currency
   **/
  @Schema(example = "EUR", description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>")
      @NotNull

    public Object getCurrency() {
    return currency;
  }

  public void setCurrency(Object currency) {
    this.currency = currency;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount identificationType(Object identificationType) {
    this.identificationType = identificationType;
    return this;
  }

  /**
   * Type of account identification.<br/>- **ACCT: AccountNumber**  : *Account identification.*<br/>- **BARC: BarCode**  : *Bar-code with a specific form of identification.*<br/>- **ISO2: ISOTrack2**  : *ISO Track 2 including identification.*<br/>- **PHON: PhoneNumber**  : *A phone number identifies the account on which the phone card is assigned.*<br/>- **CPAN: PrimaryAccountNumber**  : *Standard card identification (card number).*<br/>- **PRIV: PrivativeNumbering**  : *An identification set by a privative application.*<br/>- **UUID: UniversalUniqueIdentification**  : *A Universal Unique Identification code is set for identification.*<br/>
   * @return identificationType
   **/
  @Schema(description = "Type of account identification.<br/>- **ACCT: AccountNumber**  : *Account identification.*<br/>- **BARC: BarCode**  : *Bar-code with a specific form of identification.*<br/>- **ISO2: ISOTrack2**  : *ISO Track 2 including identification.*<br/>- **PHON: PhoneNumber**  : *A phone number identifies the account on which the phone card is assigned.*<br/>- **CPAN: PrimaryAccountNumber**  : *Standard card identification (card number).*<br/>- **PRIV: PrivativeNumbering**  : *An identification set by a privative application.*<br/>- **UUID: UniversalUniqueIdentification**  : *A Universal Unique Identification code is set for identification.*<br/>")
      @NotNull

    public Object getIdentificationType() {
    return identificationType;
  }

  public void setIdentificationType(Object identificationType) {
    this.identificationType = identificationType;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount loyaltyIdentification(Object loyaltyIdentification) {
    this.loyaltyIdentification = loyaltyIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return loyaltyIdentification
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getLoyaltyIdentification() {
    return loyaltyIdentification;
  }

  public void setLoyaltyIdentification(Object loyaltyIdentification) {
    this.loyaltyIdentification = loyaltyIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount entryMode(Object entryMode) {
    this.entryMode = entryMode;
    return this;
  }

  /**
   * Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>- **SICC: SynchronousIntegratedCircuitCard**  : *Synchronous ICC - (Integrated Circuit Card) with contact.*<br/>- **UNKW: Unknown**  : *Unknown card reading capability.*<br/>- **QRCD: QRCode**  : *Quick response code.*<br/>- **OPTC: OpticalCode**  : *Optical coded reading capabilities (e.g. barcode, QR code, etc.)*<br/>
   * @return entryMode
   **/
  @Schema(example = "TAGC", description = "Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>- **SICC: SynchronousIntegratedCircuitCard**  : *Synchronous ICC - (Integrated Circuit Card) with contact.*<br/>- **UNKW: Unknown**  : *Unknown card reading capability.*<br/>- **QRCD: QRCode**  : *Quick response code.*<br/>- **OPTC: OpticalCode**  : *Optical coded reading capabilities (e.g. barcode, QR code, etc.)*<br/>")
      @NotNull

    public Object getEntryMode() {
    return entryMode;
  }

  public void setEntryMode(Object entryMode) {
    this.entryMode = entryMode;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount ownerName(Object ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 45 characters.<br/>
   * @return ownerName
   **/
  @Schema(description = "Specifies a character string with a maximum length of 45 characters.<br/>")
      @NotNull

    public Object getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(Object ownerName) {
    this.ownerName = ownerName;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount provider(Object provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return provider
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getProvider() {
    return provider;
  }

  public void setProvider(Object provider) {
    this.provider = provider;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount unit(Object unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Unit of a amount (for loyalty or account).<br/>- **MONE: Monetary**  : *The amount is expressed in a monetary value in a currency.*<br/>- **POIN: Point**  : *The amount is expressed in point.*<br/>
   * @return unit
   **/
  @Schema(description = "Unit of a amount (for loyalty or account).<br/>- **MONE: Monetary**  : *The amount is expressed in a monetary value in a currency.*<br/>- **POIN: Point**  : *The amount is expressed in point.*<br/>")
      @NotNull

    public Object getUnit() {
    return unit;
  }

  public void setUnit(Object unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount = (PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount) o;
    return Objects.equals(this.balance, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.balance) &&
        Objects.equals(this.brand, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.brand) &&
        Objects.equals(this.currency, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.currency) &&
        Objects.equals(this.identificationType, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.identificationType) &&
        Objects.equals(this.loyaltyIdentification, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.loyaltyIdentification) &&
        Objects.equals(this.entryMode, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.entryMode) &&
        Objects.equals(this.ownerName, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.ownerName) &&
        Objects.equals(this.provider, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.provider) &&
        Objects.equals(this.unit, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, brand, currency, identificationType, loyaltyIdentification, entryMode, ownerName, provider, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    identificationType: ").append(toIndentedString(identificationType)).append("\n");
    sb.append("    loyaltyIdentification: ").append(toIndentedString(loyaltyIdentification)).append("\n");
    sb.append("    entryMode: ").append(toIndentedString(entryMode)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
