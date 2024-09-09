package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sensible data associated with the payment card performing the transaction.&lt;br/&gt;
 */
@Schema(description = "Sensible data associated with the payment card performing the transaction.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData   {
  @JsonProperty("CardSequenceNumber")
  private Object cardSequenceNumber = null;

  @JsonProperty("CardholderName")
  private Object cardholderName = null;

  @JsonProperty("EffectiveDate")
  private Object effectiveDate = null;

  @JsonProperty("PAN")
  private Object PAN = null;

  @JsonProperty("ServiceCode")
  private Object serviceCode = null;

  @JsonProperty("Track1")
  private Object track1 = null;

  @JsonProperty("Track2")
  private Object track2 = null;

  @JsonProperty("Track3")
  private Object track3 = null;

  @JsonProperty("ExpiryDate")
  private Object expiryDate = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData cardSequenceNumber(Object cardSequenceNumber) {
    this.cardSequenceNumber = cardSequenceNumber;
    return this;
  }

  /**
   * Specifies a numeric string with a minimum length of 2 digits, and a maximum length of 3 digits.<br/>
   * @return cardSequenceNumber
   **/
  @Schema(description = "Specifies a numeric string with a minimum length of 2 digits, and a maximum length of 3 digits.<br/>")
      @NotNull

    public Object getCardSequenceNumber() {
    return cardSequenceNumber;
  }

  public void setCardSequenceNumber(Object cardSequenceNumber) {
    this.cardSequenceNumber = cardSequenceNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData cardholderName(Object cardholderName) {
    this.cardholderName = cardholderName;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 45 characters.<br/>
   * @return cardholderName
   **/
  @Schema(description = "Specifies a character string with a maximum length of 45 characters.<br/>")
      @NotNull

    public Object getCardholderName() {
    return cardholderName;
  }

  public void setCardholderName(Object cardholderName) {
    this.cardholderName = cardholderName;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData effectiveDate(Object effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 10 characters.<br/>
   * @return effectiveDate
   **/
  @Schema(description = "Specifies a character string with a maximum length of 10 characters.<br/>")
      @NotNull

    public Object getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(Object effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData PAN(Object PAN) {
    this.PAN = PAN;
    return this;
  }

  /**
   * Specifies a numeric string with a minimum length of 8 digits, and a maximum length of 28 digits.<br/>
   * @return PAN
   **/
  @Schema(required = true, description = "Specifies a numeric string with a minimum length of 8 digits, and a maximum length of 28 digits.<br/>")
      @NotNull

    public Object getPAN() {
    return PAN;
  }

  public void setPAN(Object PAN) {
    this.PAN = PAN;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData serviceCode(Object serviceCode) {
    this.serviceCode = serviceCode;
    return this;
  }

  /**
   * Specifies a numeric string with an exact length of 3 digits.<br/>
   * @return serviceCode
   **/
  @Schema(description = "Specifies a numeric string with an exact length of 3 digits.<br/>")
      @NotNull

    public Object getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(Object serviceCode) {
    this.serviceCode = serviceCode;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData track1(Object track1) {
    this.track1 = track1;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 76 characters.<br/>
   * @return track1
   **/
  @Schema(description = "Specifies a character string with a maximum length of 76 characters.<br/>")
      @NotNull

    public Object getTrack1() {
    return track1;
  }

  public void setTrack1(Object track1) {
    this.track1 = track1;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData track2(Object track2) {
    this.track2 = track2;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 37 characters.<br/>
   * @return track2
   **/
  @Schema(description = "Specifies a character string with a maximum length of 37 characters.<br/>")
      @NotNull

    public Object getTrack2() {
    return track2;
  }

  public void setTrack2(Object track2) {
    this.track2 = track2;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData track3(Object track3) {
    this.track3 = track3;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 104 characters.<br/>
   * @return track3
   **/
  @Schema(description = "Specifies a character string with a maximum length of 104 characters.<br/>")
      @NotNull

    public Object getTrack3() {
    return track3;
  }

  public void setTrack3(Object track3) {
    this.track3 = track3;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData expiryDate(Object expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 10 characters.<br/>
   * @return expiryDate
   **/
  @Schema(description = "Specifies a character string with a maximum length of 10 characters.<br/>")
      @NotNull

    public Object getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(Object expiryDate) {
    this.expiryDate = expiryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData poipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData = (PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData) o;
    return Objects.equals(this.cardSequenceNumber, poipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData.cardSequenceNumber) &&
        Objects.equals(this.cardholderName, poipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData.cardholderName) &&
        Objects.equals(this.effectiveDate, poipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData.effectiveDate) &&
        Objects.equals(this.PAN, poipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData.PAN) &&
        Objects.equals(this.serviceCode, poipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData.serviceCode) &&
        Objects.equals(this.track1, poipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData.track1) &&
        Objects.equals(this.track2, poipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData.track2) &&
        Objects.equals(this.track3, poipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData.track3) &&
        Objects.equals(this.expiryDate, poipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardSequenceNumber, cardholderName, effectiveDate, PAN, serviceCode, track1, track2, track3, expiryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData {\n");
    
    sb.append("    cardSequenceNumber: ").append(toIndentedString(cardSequenceNumber)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    PAN: ").append(toIndentedString(PAN)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    track1: ").append(toIndentedString(track1)).append("\n");
    sb.append("    track2: ").append(toIndentedString(track2)).append("\n");
    sb.append("    track3: ").append(toIndentedString(track3)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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
