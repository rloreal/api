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
  * Loyalty Account description.<br/>
 **/
@Schema(description="Loyalty Account description.<br/>")
public class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount   {
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object balance = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object brand = null;
  
  @Schema(example = "EUR", description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>")
 /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>  
  **/
  private Object currency = null;
  
  @Schema(description = "Type of account identification.<br/>- **ACCT: AccountNumber**  : *Account identification.*<br/>- **BARC: BarCode**  : *Bar-code with a specific form of identification.*<br/>- **ISO2: ISOTrack2**  : *ISO Track 2 including identification.*<br/>- **PHON: PhoneNumber**  : *A phone number identifies the account on which the phone card is assigned.*<br/>- **CPAN: PrimaryAccountNumber**  : *Standard card identification (card number).*<br/>- **PRIV: PrivativeNumbering**  : *An identification set by a privative application.*<br/>- **UUID: UniversalUniqueIdentification**  : *A Universal Unique Identification code is set for identification.*<br/>")
 /**
   * Type of account identification.<br/>- **ACCT: AccountNumber**  : *Account identification.*<br/>- **BARC: BarCode**  : *Bar-code with a specific form of identification.*<br/>- **ISO2: ISOTrack2**  : *ISO Track 2 including identification.*<br/>- **PHON: PhoneNumber**  : *A phone number identifies the account on which the phone card is assigned.*<br/>- **CPAN: PrimaryAccountNumber**  : *Standard card identification (card number).*<br/>- **PRIV: PrivativeNumbering**  : *An identification set by a privative application.*<br/>- **UUID: UniversalUniqueIdentification**  : *A Universal Unique Identification code is set for identification.*<br/>  
  **/
  private Object identificationType = null;
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object loyaltyIdentification = null;
  
  @Schema(example = "TAGC", description = "Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>- **SICC: SynchronousIntegratedCircuitCard**  : *Synchronous ICC - (Integrated Circuit Card) with contact.*<br/>- **UNKW: Unknown**  : *Unknown card reading capability.*<br/>- **QRCD: QRCode**  : *Quick response code.*<br/>- **OPTC: OpticalCode**  : *Optical coded reading capabilities (e.g. barcode, QR code, etc.)*<br/>")
 /**
   * Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>- **SICC: SynchronousIntegratedCircuitCard**  : *Synchronous ICC - (Integrated Circuit Card) with contact.*<br/>- **UNKW: Unknown**  : *Unknown card reading capability.*<br/>- **QRCD: QRCode**  : *Quick response code.*<br/>- **OPTC: OpticalCode**  : *Optical coded reading capabilities (e.g. barcode, QR code, etc.)*<br/>  
  **/
  private Object entryMode = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 45 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 45 characters.<br/>  
  **/
  private Object ownerName = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object provider = null;
  
  @Schema(description = "Unit of a amount (for loyalty or account).<br/>- **MONE: Monetary**  : *The amount is expressed in a monetary value in a currency.*<br/>- **POIN: Point**  : *The amount is expressed in point.*<br/>")
 /**
   * Unit of a amount (for loyalty or account).<br/>- **MONE: Monetary**  : *The amount is expressed in a monetary value in a currency.*<br/>- **POIN: Point**  : *The amount is expressed in point.*<br/>  
  **/
  private Object unit = null;
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return balance
  **/
  @JsonProperty("Balance")
  @NotNull
  public Object getBalance() {
    return balance;
  }

  public void setBalance(Object balance) {
    this.balance = balance;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount balance(Object balance) {
    this.balance = balance;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return brand
  **/
  @JsonProperty("Brand")
  @NotNull
  public Object getBrand() {
    return brand;
  }

  public void setBrand(Object brand) {
    this.brand = brand;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount brand(Object brand) {
    this.brand = brand;
    return this;
  }

 /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;.&lt;br/&gt;
   * @return currency
  **/
  @JsonProperty("Currency")
  @NotNull
  public Object getCurrency() {
    return currency;
  }

  public void setCurrency(Object currency) {
    this.currency = currency;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount currency(Object currency) {
    this.currency = currency;
    return this;
  }

 /**
   * Type of account identification.&lt;br/&gt;- **ACCT: AccountNumber**  : *Account identification.*&lt;br/&gt;- **BARC: BarCode**  : *Bar-code with a specific form of identification.*&lt;br/&gt;- **ISO2: ISOTrack2**  : *ISO Track 2 including identification.*&lt;br/&gt;- **PHON: PhoneNumber**  : *A phone number identifies the account on which the phone card is assigned.*&lt;br/&gt;- **CPAN: PrimaryAccountNumber**  : *Standard card identification (card number).*&lt;br/&gt;- **PRIV: PrivativeNumbering**  : *An identification set by a privative application.*&lt;br/&gt;- **UUID: UniversalUniqueIdentification**  : *A Universal Unique Identification code is set for identification.*&lt;br/&gt;
   * @return identificationType
  **/
  @JsonProperty("IdentificationType")
  @NotNull
  public Object getIdentificationType() {
    return identificationType;
  }

  public void setIdentificationType(Object identificationType) {
    this.identificationType = identificationType;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount identificationType(Object identificationType) {
    this.identificationType = identificationType;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return loyaltyIdentification
  **/
  @JsonProperty("LoyaltyIdentification")
  @NotNull
  public Object getLoyaltyIdentification() {
    return loyaltyIdentification;
  }

  public void setLoyaltyIdentification(Object loyaltyIdentification) {
    this.loyaltyIdentification = loyaltyIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount loyaltyIdentification(Object loyaltyIdentification) {
    this.loyaltyIdentification = loyaltyIdentification;
    return this;
  }

 /**
   * Type of reading of the card data.&lt;br/&gt;- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*&lt;br/&gt;- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*&lt;br/&gt;- **BRCD: BarCode**  : *Bar code.*&lt;br/&gt;- **MGST: MagneticStripe**  : *Magnetic stripe.*&lt;br/&gt;- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*&lt;br/&gt;- **DFLE: AccountData**  : *Account data on file.*&lt;br/&gt;- **CTLS: ProximityReader**  : *Contactless proximity reader.*&lt;br/&gt;- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*&lt;br/&gt;- **CDFL: CardOnFile**  : *Card information are stored on a file.*&lt;br/&gt;- **SICC: SynchronousIntegratedCircuitCard**  : *Synchronous ICC - (Integrated Circuit Card) with contact.*&lt;br/&gt;- **UNKW: Unknown**  : *Unknown card reading capability.*&lt;br/&gt;- **QRCD: QRCode**  : *Quick response code.*&lt;br/&gt;- **OPTC: OpticalCode**  : *Optical coded reading capabilities (e.g. barcode, QR code, etc.)*&lt;br/&gt;
   * @return entryMode
  **/
  @JsonProperty("EntryMode")
  @NotNull
  public Object getEntryMode() {
    return entryMode;
  }

  public void setEntryMode(Object entryMode) {
    this.entryMode = entryMode;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount entryMode(Object entryMode) {
    this.entryMode = entryMode;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 45 characters.&lt;br/&gt;
   * @return ownerName
  **/
  @JsonProperty("OwnerName")
  @NotNull
  public Object getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(Object ownerName) {
    this.ownerName = ownerName;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount ownerName(Object ownerName) {
    this.ownerName = ownerName;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return provider
  **/
  @JsonProperty("Provider")
  @NotNull
  public Object getProvider() {
    return provider;
  }

  public void setProvider(Object provider) {
    this.provider = provider;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount provider(Object provider) {
    this.provider = provider;
    return this;
  }

 /**
   * Unit of a amount (for loyalty or account).&lt;br/&gt;- **MONE: Monetary**  : *The amount is expressed in a monetary value in a currency.*&lt;br/&gt;- **POIN: Point**  : *The amount is expressed in point.*&lt;br/&gt;
   * @return unit
  **/
  @JsonProperty("Unit")
  @NotNull
  public Object getUnit() {
    return unit;
  }

  public void setUnit(Object unit) {
    this.unit = unit;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestAccount unit(Object unit) {
    this.unit = unit;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
