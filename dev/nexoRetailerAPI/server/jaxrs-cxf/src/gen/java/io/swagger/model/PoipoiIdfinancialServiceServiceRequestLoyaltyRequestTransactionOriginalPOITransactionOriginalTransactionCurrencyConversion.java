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
  * Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider.<br/>
 **/
@Schema(description="Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider.<br/>")
public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion   {
  
  @Schema(description = "Information about the conversion of currency.")
 /**
   * Information about the conversion of currency.  
  **/
  private Object conversionDetails = null;
  
  @Schema(required = true, description = "Result of a requested currency conversion.<br/>- **ODCC: Allowed**  : *Dynamic currency conversion may be offered to the cardholder.*<br/>- **DCCA: Assumed**  : *Transaction authorised with dynamic currency conversion.*<br/>- **ICRD: InvalidCard**  : *The card is not valid for dynamic currency conversion.*<br/>- **IMER: InvalidMerchant**  : *The card acceptor has not been recognised.*<br/>- **IPRD: InvalidProduct**  : *Dynamic currency conversion service cannot be offered for this card product.*<br/>- **IRAT: NoRate**  : *Exchange rates are not available.*<br/>- **NDCC: NotAvailable**  : *Dynamic currency conversion is not available for other reason.*<br/>- **REST: Restriction**  : *Conversion accepted for the requested amount exclusively.*<br/>- **CATG: Catalogue**  : *Conversion accepted for a range of amounts.*<br/>")
 /**
   * Result of a requested currency conversion.<br/>- **ODCC: Allowed**  : *Dynamic currency conversion may be offered to the cardholder.*<br/>- **DCCA: Assumed**  : *Transaction authorised with dynamic currency conversion.*<br/>- **ICRD: InvalidCard**  : *The card is not valid for dynamic currency conversion.*<br/>- **IMER: InvalidMerchant**  : *The card acceptor has not been recognised.*<br/>- **IPRD: InvalidProduct**  : *Dynamic currency conversion service cannot be offered for this card product.*<br/>- **IRAT: NoRate**  : *Exchange rates are not available.*<br/>- **NDCC: NotAvailable**  : *Dynamic currency conversion is not available for other reason.*<br/>- **REST: Restriction**  : *Conversion accepted for the requested amount exclusively.*<br/>- **CATG: Catalogue**  : *Conversion accepted for a range of amounts.*<br/>  
  **/
  private Object result = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object resultReason = null;
 /**
   * Information about the conversion of currency.
   * @return conversionDetails
  **/
  @JsonProperty("ConversionDetails")
  @NotNull
  public Object getConversionDetails() {
    return conversionDetails;
  }

  public void setConversionDetails(Object conversionDetails) {
    this.conversionDetails = conversionDetails;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion conversionDetails(Object conversionDetails) {
    this.conversionDetails = conversionDetails;
    return this;
  }

 /**
   * Result of a requested currency conversion.&lt;br/&gt;- **ODCC: Allowed**  : *Dynamic currency conversion may be offered to the cardholder.*&lt;br/&gt;- **DCCA: Assumed**  : *Transaction authorised with dynamic currency conversion.*&lt;br/&gt;- **ICRD: InvalidCard**  : *The card is not valid for dynamic currency conversion.*&lt;br/&gt;- **IMER: InvalidMerchant**  : *The card acceptor has not been recognised.*&lt;br/&gt;- **IPRD: InvalidProduct**  : *Dynamic currency conversion service cannot be offered for this card product.*&lt;br/&gt;- **IRAT: NoRate**  : *Exchange rates are not available.*&lt;br/&gt;- **NDCC: NotAvailable**  : *Dynamic currency conversion is not available for other reason.*&lt;br/&gt;- **REST: Restriction**  : *Conversion accepted for the requested amount exclusively.*&lt;br/&gt;- **CATG: Catalogue**  : *Conversion accepted for a range of amounts.*&lt;br/&gt;
   * @return result
  **/
  @JsonProperty("Result")
  @NotNull
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion result(Object result) {
    this.result = result;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return resultReason
  **/
  @JsonProperty("ResultReason")
  @NotNull
  public Object getResultReason() {
    return resultReason;
  }

  public void setResultReason(Object resultReason) {
    this.resultReason = resultReason;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion resultReason(Object resultReason) {
    this.resultReason = resultReason;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion {\n");
    
    sb.append("    conversionDetails: ").append(toIndentedString(conversionDetails)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultReason: ").append(toIndentedString(resultReason)).append("\n");
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
