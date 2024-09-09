package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payment context in which the transaction is performed.&lt;br/&gt;
 */
@Schema(description = "Payment context in which the transaction is performed.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestContextPaymentContext   {
  @JsonProperty("AttendanceContext")
  private Object attendanceContext = null;

  @JsonProperty("AttendantLanguage")
  private Object attendantLanguage = null;

  @JsonProperty("AttendantMessageCapable")
  private Object attendantMessageCapable = null;

  @JsonProperty("BusinessArea")
  private Object businessArea = null;

  @JsonProperty("CardDataEntryMode")
  private Object cardDataEntryMode = null;

  @JsonProperty("CardPresent")
  private Object cardPresent = null;

  @JsonProperty("CardholderPresent")
  private Object cardholderPresent = null;

  @JsonProperty("FallbackIndicator")
  private Object fallbackIndicator = null;

  @JsonProperty("OnLineContext")
  private Object onLineContext = null;

  @JsonProperty("SupportedOption")
  private Object supportedOption = null;

  @JsonProperty("TransactionChannel")
  private Object transactionChannel = null;

  @JsonProperty("TransactionEnvironment")
  private Object transactionEnvironment = null;

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext attendanceContext(Object attendanceContext) {
    this.attendanceContext = attendanceContext;
    return this;
  }

  /**
   * Human attendance at the POI location during the transaction.<br/>- **ATTD: Attended**  : *Attended payment, with an attendant.*<br/>- **SATT: SemiAttended**  : *Semi-attended, including self checkout. An attendant supervises several payment, and could be called to help the cardholder.*<br/>- **UATT: Unattended**  : *Unattended payment, no attendant present.*<br/>
   * @return attendanceContext
   **/
  @Schema(example = "ATTD", description = "Human attendance at the POI location during the transaction.<br/>- **ATTD: Attended**  : *Attended payment, with an attendant.*<br/>- **SATT: SemiAttended**  : *Semi-attended, including self checkout. An attendant supervises several payment, and could be called to help the cardholder.*<br/>- **UATT: Unattended**  : *Unattended payment, no attendant present.*<br/>")
      @NotNull

    public Object getAttendanceContext() {
    return attendanceContext;
  }

  public void setAttendanceContext(Object attendanceContext) {
    this.attendanceContext = attendanceContext;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext attendantLanguage(Object attendantLanguage) {
    this.attendantLanguage = attendantLanguage;
    return this;
  }

  /**
   * Specifies a language.<br/>
   * @return attendantLanguage
   **/
  @Schema(example = "ENG", description = "Specifies a language.<br/>")
      @NotNull

    public Object getAttendantLanguage() {
    return attendantLanguage;
  }

  public void setAttendantLanguage(Object attendantLanguage) {
    this.attendantLanguage = attendantLanguage;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext attendantMessageCapable(Object attendantMessageCapable) {
    this.attendantMessageCapable = attendantMessageCapable;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return attendantMessageCapable
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getAttendantMessageCapable() {
    return attendantMessageCapable;
  }

  public void setAttendantMessageCapable(Object attendantMessageCapable) {
    this.attendantMessageCapable = attendantMessageCapable;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext businessArea(Object businessArea) {
    this.businessArea = businessArea;
    return this;
  }

  /**
   * Specifies the business context of the transaction<br/>- **AIBD: ArtificialIntelligenceBasedDecision**  : *The payment is initiated by an artificial intelligence based decision.*<br/>- **PPAY: PlainPayment**  : *The card is used to perform a plain payment.*<br/>- **TKNF: TransitKnownFare**  : *The card is used in a Transit business case where the fare amount is known when the transaction is initiated.*<br/>- **EOPT: EnergyOpenPayment**  : *Indicates when the card is used in an energy business case where the amount could not be assessed when the transaction is initiated.*<br/>- **TOPT: TransitOpenPayment**  : *Indicates when the card is used in a transit business case where the fare amount is not known when the transaction is initiated.*<br/>
   * @return businessArea
   **/
  @Schema(description = "Specifies the business context of the transaction<br/>- **AIBD: ArtificialIntelligenceBasedDecision**  : *The payment is initiated by an artificial intelligence based decision.*<br/>- **PPAY: PlainPayment**  : *The card is used to perform a plain payment.*<br/>- **TKNF: TransitKnownFare**  : *The card is used in a Transit business case where the fare amount is known when the transaction is initiated.*<br/>- **EOPT: EnergyOpenPayment**  : *Indicates when the card is used in an energy business case where the amount could not be assessed when the transaction is initiated.*<br/>- **TOPT: TransitOpenPayment**  : *Indicates when the card is used in a transit business case where the fare amount is not known when the transaction is initiated.*<br/>")
      @NotNull

    public Object getBusinessArea() {
    return businessArea;
  }

  public void setBusinessArea(Object businessArea) {
    this.businessArea = businessArea;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext cardDataEntryMode(Object cardDataEntryMode) {
    this.cardDataEntryMode = cardDataEntryMode;
    return this;
  }

  /**
   * Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>- **SICC: SynchronousIntegratedCircuitCard**  : *Synchronous ICC - (Integrated Circuit Card) with contact.*<br/>- **UNKW: Unknown**  : *Unknown card reading capability.*<br/>- **QRCD: QRCode**  : *Quick response code.*<br/>- **OPTC: OpticalCode**  : *Optical coded reading capabilities (e.g. barcode, QR code, etc.)*<br/>
   * @return cardDataEntryMode
   **/
  @Schema(example = "TAGC", description = "Type of reading of the card data.<br/>- **TAGC: Tag**  : *Tag reading capabilities (RFID, etc.).*<br/>- **PHYS: Physical**  : *Keyboard entry or OCR reading of embossing or printed data, either at time of transaction or after the event.*<br/>- **BRCD: BarCode**  : *Bar code.*<br/>- **MGST: MagneticStripe**  : *Magnetic stripe.*<br/>- **CICC: ICC**  : *ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.*<br/>- **DFLE: AccountData**  : *Account data on file.*<br/>- **CTLS: ProximityReader**  : *Contactless proximity reader.*<br/>- **ECTL: EMVProximityReader**  : *Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).*<br/>- **CDFL: CardOnFile**  : *Card information are stored on a file.*<br/>- **SICC: SynchronousIntegratedCircuitCard**  : *Synchronous ICC - (Integrated Circuit Card) with contact.*<br/>- **UNKW: Unknown**  : *Unknown card reading capability.*<br/>- **QRCD: QRCode**  : *Quick response code.*<br/>- **OPTC: OpticalCode**  : *Optical coded reading capabilities (e.g. barcode, QR code, etc.)*<br/>")
      @NotNull

    public Object getCardDataEntryMode() {
    return cardDataEntryMode;
  }

  public void setCardDataEntryMode(Object cardDataEntryMode) {
    this.cardDataEntryMode = cardDataEntryMode;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext cardPresent(Object cardPresent) {
    this.cardPresent = cardPresent;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return cardPresent
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getCardPresent() {
    return cardPresent;
  }

  public void setCardPresent(Object cardPresent) {
    this.cardPresent = cardPresent;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext cardholderPresent(Object cardholderPresent) {
    this.cardholderPresent = cardholderPresent;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return cardholderPresent
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getCardholderPresent() {
    return cardholderPresent;
  }

  public void setCardholderPresent(Object cardholderPresent) {
    this.cardholderPresent = cardholderPresent;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext fallbackIndicator(Object fallbackIndicator) {
    this.fallbackIndicator = fallbackIndicator;
    return this;
  }

  /**
   * Information about card entry mode fallback.<br/>- **FFLB: FallbackAfterFailure**  : *Card fall-back occurred during the transaction in progress. The previous transaction on the terminal failed.*<br/>- **SFLB: FallbackAfterSuccess**  : *Card fall-back occurred during the transaction in progress. The previous transaction on the terminal was successful.*<br/>- **NFLB: NoFallback**  : *No card fall-back during the transaction in progress.*<br/>
   * @return fallbackIndicator
   **/
  @Schema(description = "Information about card entry mode fallback.<br/>- **FFLB: FallbackAfterFailure**  : *Card fall-back occurred during the transaction in progress. The previous transaction on the terminal failed.*<br/>- **SFLB: FallbackAfterSuccess**  : *Card fall-back occurred during the transaction in progress. The previous transaction on the terminal was successful.*<br/>- **NFLB: NoFallback**  : *No card fall-back during the transaction in progress.*<br/>")
      @NotNull

    public Object getFallbackIndicator() {
    return fallbackIndicator;
  }

  public void setFallbackIndicator(Object fallbackIndicator) {
    this.fallbackIndicator = fallbackIndicator;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext onLineContext(Object onLineContext) {
    this.onLineContext = onLineContext;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return onLineContext
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getOnLineContext() {
    return onLineContext;
  }

  public void setOnLineContext(Object onLineContext) {
    this.onLineContext = onLineContext;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext supportedOption(Object supportedOption) {
    this.supportedOption = supportedOption;
    return this;
  }

  /**
   * Payment options the card acceptor can support.
   * @return supportedOption
   **/
  @Schema(description = "Payment options the card acceptor can support.")
      @NotNull

    public Object getSupportedOption() {
    return supportedOption;
  }

  public void setSupportedOption(Object supportedOption) {
    this.supportedOption = supportedOption;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext transactionChannel(Object transactionChannel) {
    this.transactionChannel = transactionChannel;
    return this;
  }

  /**
   * Identifies the type of the communication channels used by the cardholder to the acceptor system.<br/>- **MAIL: MailOrder**  : *Mail order.*<br/>- **TLPH: TelephoneOrder**  : *Telephone order.*<br/>- **ECOM: ElectronicCommerce**  : *Electronic commerce.*<br/>- **TVPY: TelevisionPayment**  : *Payment on television.*<br/>- **SECM: SecuredElectronicCommerce**  : *Electronic commerce with cardholder authentication.*<br/>- **MOBL: MobilePayment**  : *Payment performed through a cardholder mobile device.*<br/>- **MPOS: MobilePOS**  : *Payment performed through a merchant mobile device.*<br/>
   * @return transactionChannel
   **/
  @Schema(example = "MAIL", description = "Identifies the type of the communication channels used by the cardholder to the acceptor system.<br/>- **MAIL: MailOrder**  : *Mail order.*<br/>- **TLPH: TelephoneOrder**  : *Telephone order.*<br/>- **ECOM: ElectronicCommerce**  : *Electronic commerce.*<br/>- **TVPY: TelevisionPayment**  : *Payment on television.*<br/>- **SECM: SecuredElectronicCommerce**  : *Electronic commerce with cardholder authentication.*<br/>- **MOBL: MobilePayment**  : *Payment performed through a cardholder mobile device.*<br/>- **MPOS: MobilePOS**  : *Payment performed through a merchant mobile device.*<br/>")
      @NotNull

    public Object getTransactionChannel() {
    return transactionChannel;
  }

  public void setTransactionChannel(Object transactionChannel) {
    this.transactionChannel = transactionChannel;
  }

  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext transactionEnvironment(Object transactionEnvironment) {
    this.transactionEnvironment = transactionEnvironment;
    return this;
  }

  /**
   * Indicates the environment of the transaction.<br/>- **MERC: Merchant**  : *Merchant environment.*<br/>- **PRIV: Private**  : *Private environment.*<br/>- **PUBL: Public**  : *Public environment.*<br/>
   * @return transactionEnvironment
   **/
  @Schema(example = "MERC", description = "Indicates the environment of the transaction.<br/>- **MERC: Merchant**  : *Merchant environment.*<br/>- **PRIV: Private**  : *Private environment.*<br/>- **PUBL: Public**  : *Public environment.*<br/>")
      @NotNull

    public Object getTransactionEnvironment() {
    return transactionEnvironment;
  }

  public void setTransactionEnvironment(Object transactionEnvironment) {
    this.transactionEnvironment = transactionEnvironment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestContextPaymentContext poipoiIdfinancialServiceServiceRequestContextPaymentContext = (PoipoiIdfinancialServiceServiceRequestContextPaymentContext) o;
    return Objects.equals(this.attendanceContext, poipoiIdfinancialServiceServiceRequestContextPaymentContext.attendanceContext) &&
        Objects.equals(this.attendantLanguage, poipoiIdfinancialServiceServiceRequestContextPaymentContext.attendantLanguage) &&
        Objects.equals(this.attendantMessageCapable, poipoiIdfinancialServiceServiceRequestContextPaymentContext.attendantMessageCapable) &&
        Objects.equals(this.businessArea, poipoiIdfinancialServiceServiceRequestContextPaymentContext.businessArea) &&
        Objects.equals(this.cardDataEntryMode, poipoiIdfinancialServiceServiceRequestContextPaymentContext.cardDataEntryMode) &&
        Objects.equals(this.cardPresent, poipoiIdfinancialServiceServiceRequestContextPaymentContext.cardPresent) &&
        Objects.equals(this.cardholderPresent, poipoiIdfinancialServiceServiceRequestContextPaymentContext.cardholderPresent) &&
        Objects.equals(this.fallbackIndicator, poipoiIdfinancialServiceServiceRequestContextPaymentContext.fallbackIndicator) &&
        Objects.equals(this.onLineContext, poipoiIdfinancialServiceServiceRequestContextPaymentContext.onLineContext) &&
        Objects.equals(this.supportedOption, poipoiIdfinancialServiceServiceRequestContextPaymentContext.supportedOption) &&
        Objects.equals(this.transactionChannel, poipoiIdfinancialServiceServiceRequestContextPaymentContext.transactionChannel) &&
        Objects.equals(this.transactionEnvironment, poipoiIdfinancialServiceServiceRequestContextPaymentContext.transactionEnvironment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attendanceContext, attendantLanguage, attendantMessageCapable, businessArea, cardDataEntryMode, cardPresent, cardholderPresent, fallbackIndicator, onLineContext, supportedOption, transactionChannel, transactionEnvironment);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
