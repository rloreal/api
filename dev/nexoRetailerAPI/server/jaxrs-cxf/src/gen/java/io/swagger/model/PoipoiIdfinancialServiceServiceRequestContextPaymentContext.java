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
  * Payment context in which the transaction is performed.<br/>
 **/
@Schema(description="Payment context in which the transaction is performed.<br/>")
public class PoipoiIdfinancialServiceServiceRequestContextPaymentContext   {
  
  @Schema(example = "ATTD", description = "Human attendance at the POI location during the transaction.<br/>- **ATTD: Attended**  : *Attended payment, with an attendant.*<br/>- **SATT: SemiAttended**  : *Semi-attended, including self checkout. An attendant supervises several payment, and could be called to help the cardholder.*<br/>- **UATT: Unattended**  : *Unattended payment, no attendant present.*<br/>")
 /**
   * Human attendance at the POI location during the transaction.<br/>- **ATTD: Attended**  : *Attended payment, with an attendant.*<br/>- **SATT: SemiAttended**  : *Semi-attended, including self checkout. An attendant supervises several payment, and could be called to help the cardholder.*<br/>- **UATT: Unattended**  : *Unattended payment, no attendant present.*<br/>  
  **/
  private Object attendanceContext = null;
  
  @Schema(example = "ENG", description = "Specifies a language.<br/>")
 /**
   * Specifies a language.<br/>  
  **/
  private Object attendantLanguage = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object attendantMessageCapable = null;
  
  @Schema(description = "Specifies the business context of the transaction<br/>- **AIBD: ArtificialIntelligenceBasedDecision**  : *The payment is initiated by an artificial intelligence based decision.*<br/>- **PPAY: PlainPayment**  : *The card is used to perform a plain payment.*<br/>- **TKNF: TransitKnownFare**  : *The card is used in a Transit business case where the fare amount is known when the transaction is initiated.*<br/>- **EOPT: EnergyOpenPayment**  : *Indicates when the card is used in an energy business case where the amount could not be assessed when the transaction is initiated.*<br/>- **TOPT: TransitOpenPayment**  : *Indicates when the card is used in a transit business case where the fare amount is not known when the transaction is initiated.*<br/>")
 /**
   * Specifies the business context of the transaction<br/>- **AIBD: ArtificialIntelligenceBasedDecision**  : *The payment is initiated by an artificial intelligence based decision.*<br/>- **PPAY: PlainPayment**  : *The card is used to perform a plain payment.*<br/>- **TKNF: TransitKnownFare**  : *The card is used in a Transit business case where the fare amount is known when the transaction is initiated.*<br/>- **EOPT: EnergyOpenPayment**  : *Indicates when the card is used in an energy business case where the amount could not be assessed when the transaction is initiated.*<br/>- **TOPT: TransitOpenPayment**  : *Indicates when the card is used in a transit business case where the fare amount is not known when the transaction is initiated.*<br/>  
  **/
  private Object businessArea = null;
  
  @Schema(example = "TAGC", description = "Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>- **SICC: SynchronousIntegratedCircuitCard**  : *Synchronous ICC - (Integrated Circuit Card) with contact.*<br/>- **UNKW: Unknown**  : *Unknown card reading capability.*<br/>- **QRCD: QRCode**  : *Quick response code.*<br/>- **OPTC: OpticalCode**  : *Optical coded reading capabilities (e.g. barcode, QR code, etc.)*<br/>")
 /**
   * Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>- **SICC: SynchronousIntegratedCircuitCard**  : *Synchronous ICC - (Integrated Circuit Card) with contact.*<br/>- **UNKW: Unknown**  : *Unknown card reading capability.*<br/>- **QRCD: QRCode**  : *Quick response code.*<br/>- **OPTC: OpticalCode**  : *Optical coded reading capabilities (e.g. barcode, QR code, etc.)*<br/>  
  **/
  private Object cardDataEntryMode = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object cardPresent = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object cardholderPresent = null;
  
  @Schema(description = "Information about card entry mode fallback.<br/>- **FFLB: FallbackAfterFailure**  : *Card fall-back occurred during the transaction in progress. The previous transaction on the terminal failed.*<br/>- **SFLB: FallbackAfterSuccess**  : *Card fall-back occurred during the transaction in progress. The previous transaction on the terminal was successful.*<br/>- **NFLB: NoFallback**  : *No card fall-back during the transaction in progress.*<br/>")
 /**
   * Information about card entry mode fallback.<br/>- **FFLB: FallbackAfterFailure**  : *Card fall-back occurred during the transaction in progress. The previous transaction on the terminal failed.*<br/>- **SFLB: FallbackAfterSuccess**  : *Card fall-back occurred during the transaction in progress. The previous transaction on the terminal was successful.*<br/>- **NFLB: NoFallback**  : *No card fall-back during the transaction in progress.*<br/>  
  **/
  private Object fallbackIndicator = null;
  
  @Schema(description = "A flag indicating a True or False value.<br/>")
 /**
   * A flag indicating a True or False value.<br/>  
  **/
  private Object onLineContext = null;
  
  @Schema(description = "Payment options the card acceptor can support.")
 /**
   * Payment options the card acceptor can support.  
  **/
  private Object supportedOption = null;
  
  @Schema(example = "MAIL", description = "Identifies the type of the communication channels used by the cardholder to the acceptor system.<br/>- **MAIL: MailOrder**  : *Mail order.*<br/>- **TLPH: TelephoneOrder**  : *Telephone order.*<br/>- **ECOM: ElectronicCommerce**  : *Electronic commerce.*<br/>- **TVPY: TelevisionPayment**  : *Payment on television.*<br/>- **SECM: SecuredElectronicCommerce**  : *Electronic commerce with cardholder authentication.*<br/>- **MOBL: MobilePayment**  : *Payment performed through a cardholder mobile device.*<br/>- **MPOS: MobilePOS**  : *Payment performed through a merchant mobile device.*<br/>")
 /**
   * Identifies the type of the communication channels used by the cardholder to the acceptor system.<br/>- **MAIL: MailOrder**  : *Mail order.*<br/>- **TLPH: TelephoneOrder**  : *Telephone order.*<br/>- **ECOM: ElectronicCommerce**  : *Electronic commerce.*<br/>- **TVPY: TelevisionPayment**  : *Payment on television.*<br/>- **SECM: SecuredElectronicCommerce**  : *Electronic commerce with cardholder authentication.*<br/>- **MOBL: MobilePayment**  : *Payment performed through a cardholder mobile device.*<br/>- **MPOS: MobilePOS**  : *Payment performed through a merchant mobile device.*<br/>  
  **/
  private Object transactionChannel = null;
  
  @Schema(example = "MERC", description = "Indicates the environment of the transaction.<br/>- **MERC: Merchant**  : *Merchant environment.*<br/>- **PRIV: Private**  : *Private environment.*<br/>- **PUBL: Public**  : *Public environment.*<br/>")
 /**
   * Indicates the environment of the transaction.<br/>- **MERC: Merchant**  : *Merchant environment.*<br/>- **PRIV: Private**  : *Private environment.*<br/>- **PUBL: Public**  : *Public environment.*<br/>  
  **/
  private Object transactionEnvironment = null;
 /**
   * Human attendance at the POI location during the transaction.&lt;br/&gt;- **ATTD: Attended**  : *Attended payment, with an attendant.*&lt;br/&gt;- **SATT: SemiAttended**  : *Semi-attended, including self checkout. An attendant supervises several payment, and could be called to help the cardholder.*&lt;br/&gt;- **UATT: Unattended**  : *Unattended payment, no attendant present.*&lt;br/&gt;
   * @return attendanceContext
  **/
  @JsonProperty("AttendanceContext")
  @NotNull
  public Object getAttendanceContext() {
    return attendanceContext;
  }

  public void setAttendanceContext(Object attendanceContext) {
    this.attendanceContext = attendanceContext;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext attendanceContext(Object attendanceContext) {
    this.attendanceContext = attendanceContext;
    return this;
  }

 /**
   * Specifies a language.&lt;br/&gt;
   * @return attendantLanguage
  **/
  @JsonProperty("AttendantLanguage")
  @NotNull
  public Object getAttendantLanguage() {
    return attendantLanguage;
  }

  public void setAttendantLanguage(Object attendantLanguage) {
    this.attendantLanguage = attendantLanguage;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext attendantLanguage(Object attendantLanguage) {
    this.attendantLanguage = attendantLanguage;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return attendantMessageCapable
  **/
  @JsonProperty("AttendantMessageCapable")
  @NotNull
  public Object getAttendantMessageCapable() {
    return attendantMessageCapable;
  }

  public void setAttendantMessageCapable(Object attendantMessageCapable) {
    this.attendantMessageCapable = attendantMessageCapable;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext attendantMessageCapable(Object attendantMessageCapable) {
    this.attendantMessageCapable = attendantMessageCapable;
    return this;
  }

 /**
   * Specifies the business context of the transaction&lt;br/&gt;- **AIBD: ArtificialIntelligenceBasedDecision**  : *The payment is initiated by an artificial intelligence based decision.*&lt;br/&gt;- **PPAY: PlainPayment**  : *The card is used to perform a plain payment.*&lt;br/&gt;- **TKNF: TransitKnownFare**  : *The card is used in a Transit business case where the fare amount is known when the transaction is initiated.*&lt;br/&gt;- **EOPT: EnergyOpenPayment**  : *Indicates when the card is used in an energy business case where the amount could not be assessed when the transaction is initiated.*&lt;br/&gt;- **TOPT: TransitOpenPayment**  : *Indicates when the card is used in a transit business case where the fare amount is not known when the transaction is initiated.*&lt;br/&gt;
   * @return businessArea
  **/
  @JsonProperty("BusinessArea")
  @NotNull
  public Object getBusinessArea() {
    return businessArea;
  }

  public void setBusinessArea(Object businessArea) {
    this.businessArea = businessArea;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext businessArea(Object businessArea) {
    this.businessArea = businessArea;
    return this;
  }

 /**
   * Type of reading of the card data.&lt;br/&gt;- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*&lt;br/&gt;- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*&lt;br/&gt;- **BRCD: BarCode**  : *Bar code.*&lt;br/&gt;- **MGST: MagneticStripe**  : *Magnetic stripe.*&lt;br/&gt;- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*&lt;br/&gt;- **DFLE: AccountData**  : *Account data on file.*&lt;br/&gt;- **CTLS: ProximityReader**  : *Contactless proximity reader.*&lt;br/&gt;- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*&lt;br/&gt;- **CDFL: CardOnFile**  : *Card information are stored on a file.*&lt;br/&gt;- **SICC: SynchronousIntegratedCircuitCard**  : *Synchronous ICC - (Integrated Circuit Card) with contact.*&lt;br/&gt;- **UNKW: Unknown**  : *Unknown card reading capability.*&lt;br/&gt;- **QRCD: QRCode**  : *Quick response code.*&lt;br/&gt;- **OPTC: OpticalCode**  : *Optical coded reading capabilities (e.g. barcode, QR code, etc.)*&lt;br/&gt;
   * @return cardDataEntryMode
  **/
  @JsonProperty("CardDataEntryMode")
  @NotNull
  public Object getCardDataEntryMode() {
    return cardDataEntryMode;
  }

  public void setCardDataEntryMode(Object cardDataEntryMode) {
    this.cardDataEntryMode = cardDataEntryMode;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext cardDataEntryMode(Object cardDataEntryMode) {
    this.cardDataEntryMode = cardDataEntryMode;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return cardPresent
  **/
  @JsonProperty("CardPresent")
  @NotNull
  public Object getCardPresent() {
    return cardPresent;
  }

  public void setCardPresent(Object cardPresent) {
    this.cardPresent = cardPresent;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext cardPresent(Object cardPresent) {
    this.cardPresent = cardPresent;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return cardholderPresent
  **/
  @JsonProperty("CardholderPresent")
  @NotNull
  public Object getCardholderPresent() {
    return cardholderPresent;
  }

  public void setCardholderPresent(Object cardholderPresent) {
    this.cardholderPresent = cardholderPresent;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext cardholderPresent(Object cardholderPresent) {
    this.cardholderPresent = cardholderPresent;
    return this;
  }

 /**
   * Information about card entry mode fallback.&lt;br/&gt;- **FFLB: FallbackAfterFailure**  : *Card fall-back occurred during the transaction in progress. The previous transaction on the terminal failed.*&lt;br/&gt;- **SFLB: FallbackAfterSuccess**  : *Card fall-back occurred during the transaction in progress. The previous transaction on the terminal was successful.*&lt;br/&gt;- **NFLB: NoFallback**  : *No card fall-back during the transaction in progress.*&lt;br/&gt;
   * @return fallbackIndicator
  **/
  @JsonProperty("FallbackIndicator")
  @NotNull
  public Object getFallbackIndicator() {
    return fallbackIndicator;
  }

  public void setFallbackIndicator(Object fallbackIndicator) {
    this.fallbackIndicator = fallbackIndicator;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext fallbackIndicator(Object fallbackIndicator) {
    this.fallbackIndicator = fallbackIndicator;
    return this;
  }

 /**
   * A flag indicating a True or False value.&lt;br/&gt;
   * @return onLineContext
  **/
  @JsonProperty("OnLineContext")
  @NotNull
  public Object getOnLineContext() {
    return onLineContext;
  }

  public void setOnLineContext(Object onLineContext) {
    this.onLineContext = onLineContext;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext onLineContext(Object onLineContext) {
    this.onLineContext = onLineContext;
    return this;
  }

 /**
   * Payment options the card acceptor can support.
   * @return supportedOption
  **/
  @JsonProperty("SupportedOption")
  @NotNull
  public Object getSupportedOption() {
    return supportedOption;
  }

  public void setSupportedOption(Object supportedOption) {
    this.supportedOption = supportedOption;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext supportedOption(Object supportedOption) {
    this.supportedOption = supportedOption;
    return this;
  }

 /**
   * Identifies the type of the communication channels used by the cardholder to the acceptor system.&lt;br/&gt;- **MAIL: MailOrder**  : *Mail order.*&lt;br/&gt;- **TLPH: TelephoneOrder**  : *Telephone order.*&lt;br/&gt;- **ECOM: ElectronicCommerce**  : *Electronic commerce.*&lt;br/&gt;- **TVPY: TelevisionPayment**  : *Payment on television.*&lt;br/&gt;- **SECM: SecuredElectronicCommerce**  : *Electronic commerce with cardholder authentication.*&lt;br/&gt;- **MOBL: MobilePayment**  : *Payment performed through a cardholder mobile device.*&lt;br/&gt;- **MPOS: MobilePOS**  : *Payment performed through a merchant mobile device.*&lt;br/&gt;
   * @return transactionChannel
  **/
  @JsonProperty("TransactionChannel")
  @NotNull
  public Object getTransactionChannel() {
    return transactionChannel;
  }

  public void setTransactionChannel(Object transactionChannel) {
    this.transactionChannel = transactionChannel;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext transactionChannel(Object transactionChannel) {
    this.transactionChannel = transactionChannel;
    return this;
  }

 /**
   * Indicates the environment of the transaction.&lt;br/&gt;- **MERC: Merchant**  : *Merchant environment.*&lt;br/&gt;- **PRIV: Private**  : *Private environment.*&lt;br/&gt;- **PUBL: Public**  : *Public environment.*&lt;br/&gt;
   * @return transactionEnvironment
  **/
  @JsonProperty("TransactionEnvironment")
  @NotNull
  public Object getTransactionEnvironment() {
    return transactionEnvironment;
  }

  public void setTransactionEnvironment(Object transactionEnvironment) {
    this.transactionEnvironment = transactionEnvironment;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext transactionEnvironment(Object transactionEnvironment) {
    this.transactionEnvironment = transactionEnvironment;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextPaymentContext {\n");
    
    sb.append("    attendanceContext: ").append(toIndentedString(attendanceContext)).append("\n");
    sb.append("    attendantLanguage: ").append(toIndentedString(attendantLanguage)).append("\n");
    sb.append("    attendantMessageCapable: ").append(toIndentedString(attendantMessageCapable)).append("\n");
    sb.append("    businessArea: ").append(toIndentedString(businessArea)).append("\n");
    sb.append("    cardDataEntryMode: ").append(toIndentedString(cardDataEntryMode)).append("\n");
    sb.append("    cardPresent: ").append(toIndentedString(cardPresent)).append("\n");
    sb.append("    cardholderPresent: ").append(toIndentedString(cardholderPresent)).append("\n");
    sb.append("    fallbackIndicator: ").append(toIndentedString(fallbackIndicator)).append("\n");
    sb.append("    onLineContext: ").append(toIndentedString(onLineContext)).append("\n");
    sb.append("    supportedOption: ").append(toIndentedString(supportedOption)).append("\n");
    sb.append("    transactionChannel: ").append(toIndentedString(transactionChannel)).append("\n");
    sb.append("    transactionEnvironment: ").append(toIndentedString(transactionEnvironment)).append("\n");
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
