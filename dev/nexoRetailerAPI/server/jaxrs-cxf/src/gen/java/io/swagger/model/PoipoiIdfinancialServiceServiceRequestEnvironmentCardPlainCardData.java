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
  * Sensible data associated with the payment card performing the transaction.<br/>
 **/
@Schema(description="Sensible data associated with the payment card performing the transaction.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData   {
  
  @Schema(description = "Specifies a numeric string with a minimum length of 2 digits, and a maximum length of 3 digits.<br/>")
 /**
   * Specifies a numeric string with a minimum length of 2 digits, and a maximum length of 3 digits.<br/>  
  **/
  private Object cardSequenceNumber = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 45 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 45 characters.<br/>  
  **/
  private Object cardholderName = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 10 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 10 characters.<br/>  
  **/
  private Object effectiveDate = null;
  
  @Schema(required = true, description = "Specifies a numeric string with a minimum length of 8 digits, and a maximum length of 28 digits.<br/>")
 /**
   * Specifies a numeric string with a minimum length of 8 digits, and a maximum length of 28 digits.<br/>  
  **/
  private Object PAN = null;
  
  @Schema(description = "Specifies a numeric string with an exact length of 3 digits.<br/>")
 /**
   * Specifies a numeric string with an exact length of 3 digits.<br/>  
  **/
  private Object serviceCode = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 76 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 76 characters.<br/>  
  **/
  private Object track1 = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 37 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 37 characters.<br/>  
  **/
  private Object track2 = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 104 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 104 characters.<br/>  
  **/
  private Object track3 = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 10 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 10 characters.<br/>  
  **/
  private Object expiryDate = null;
 /**
   * Specifies a numeric string with a minimum length of 2 digits, and a maximum length of 3 digits.&lt;br/&gt;
   * @return cardSequenceNumber
  **/
  @JsonProperty("CardSequenceNumber")
  @NotNull
  public Object getCardSequenceNumber() {
    return cardSequenceNumber;
  }

  public void setCardSequenceNumber(Object cardSequenceNumber) {
    this.cardSequenceNumber = cardSequenceNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData cardSequenceNumber(Object cardSequenceNumber) {
    this.cardSequenceNumber = cardSequenceNumber;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 45 characters.&lt;br/&gt;
   * @return cardholderName
  **/
  @JsonProperty("CardholderName")
  @NotNull
  public Object getCardholderName() {
    return cardholderName;
  }

  public void setCardholderName(Object cardholderName) {
    this.cardholderName = cardholderName;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData cardholderName(Object cardholderName) {
    this.cardholderName = cardholderName;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 10 characters.&lt;br/&gt;
   * @return effectiveDate
  **/
  @JsonProperty("EffectiveDate")
  @NotNull
  public Object getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(Object effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData effectiveDate(Object effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

 /**
   * Specifies a numeric string with a minimum length of 8 digits, and a maximum length of 28 digits.&lt;br/&gt;
   * @return PAN
  **/
  @JsonProperty("PAN")
  @NotNull
  public Object getPAN() {
    return PAN;
  }

  public void setPAN(Object PAN) {
    this.PAN = PAN;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData PAN(Object PAN) {
    this.PAN = PAN;
    return this;
  }

 /**
   * Specifies a numeric string with an exact length of 3 digits.&lt;br/&gt;
   * @return serviceCode
  **/
  @JsonProperty("ServiceCode")
  @NotNull
  public Object getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(Object serviceCode) {
    this.serviceCode = serviceCode;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData serviceCode(Object serviceCode) {
    this.serviceCode = serviceCode;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 76 characters.&lt;br/&gt;
   * @return track1
  **/
  @JsonProperty("Track1")
  @NotNull
  public Object getTrack1() {
    return track1;
  }

  public void setTrack1(Object track1) {
    this.track1 = track1;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData track1(Object track1) {
    this.track1 = track1;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 37 characters.&lt;br/&gt;
   * @return track2
  **/
  @JsonProperty("Track2")
  @NotNull
  public Object getTrack2() {
    return track2;
  }

  public void setTrack2(Object track2) {
    this.track2 = track2;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData track2(Object track2) {
    this.track2 = track2;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 104 characters.&lt;br/&gt;
   * @return track3
  **/
  @JsonProperty("Track3")
  @NotNull
  public Object getTrack3() {
    return track3;
  }

  public void setTrack3(Object track3) {
    this.track3 = track3;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData track3(Object track3) {
    this.track3 = track3;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 10 characters.&lt;br/&gt;
   * @return expiryDate
  **/
  @JsonProperty("ExpiryDate")
  @NotNull
  public Object getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(Object expiryDate) {
    this.expiryDate = expiryDate;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardPlainCardData expiryDate(Object expiryDate) {
    this.expiryDate = expiryDate;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
