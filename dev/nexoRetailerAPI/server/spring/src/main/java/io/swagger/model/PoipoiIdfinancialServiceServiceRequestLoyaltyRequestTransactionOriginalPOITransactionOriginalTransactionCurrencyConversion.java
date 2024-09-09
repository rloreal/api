package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider.&lt;br/&gt;
 */
@Schema(description = "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion   {
  @JsonProperty("ConversionDetails")
  private Object conversionDetails = null;

  @JsonProperty("Result")
  private Object result = null;

  @JsonProperty("ResultReason")
  private Object resultReason = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion conversionDetails(Object conversionDetails) {
    this.conversionDetails = conversionDetails;
    return this;
  }

  /**
   * Information about the conversion of currency.
   * @return conversionDetails
   **/
  @Schema(description = "Information about the conversion of currency.")
      @NotNull

    public Object getConversionDetails() {
    return conversionDetails;
  }

  public void setConversionDetails(Object conversionDetails) {
    this.conversionDetails = conversionDetails;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion result(Object result) {
    this.result = result;
    return this;
  }

  /**
   * Result of a requested currency conversion.<br/>- **ODCC: Allowed**  : *Dynamic currency conversion may be offered to the cardholder.*<br/>- **DCCA: Assumed**  : *Transaction authorised with dynamic currency conversion.*<br/>- **ICRD: InvalidCard**  : *The card is not valid for dynamic currency conversion.*<br/>- **IMER: InvalidMerchant**  : *The card acceptor has not been recognised.*<br/>- **IPRD: InvalidProduct**  : *Dynamic currency conversion service cannot be offered for this card product.*<br/>- **IRAT: NoRate**  : *Exchange rates are not available.*<br/>- **NDCC: NotAvailable**  : *Dynamic currency conversion is not available for other reason.*<br/>- **REST: Restriction**  : *Conversion accepted for the requested amount exclusively.*<br/>- **CATG: Catalogue**  : *Conversion accepted for a range of amounts.*<br/>
   * @return result
   **/
  @Schema(required = true, description = "Result of a requested currency conversion.<br/>- **ODCC: Allowed**  : *Dynamic currency conversion may be offered to the cardholder.*<br/>- **DCCA: Assumed**  : *Transaction authorised with dynamic currency conversion.*<br/>- **ICRD: InvalidCard**  : *The card is not valid for dynamic currency conversion.*<br/>- **IMER: InvalidMerchant**  : *The card acceptor has not been recognised.*<br/>- **IPRD: InvalidProduct**  : *Dynamic currency conversion service cannot be offered for this card product.*<br/>- **IRAT: NoRate**  : *Exchange rates are not available.*<br/>- **NDCC: NotAvailable**  : *Dynamic currency conversion is not available for other reason.*<br/>- **REST: Restriction**  : *Conversion accepted for the requested amount exclusively.*<br/>- **CATG: Catalogue**  : *Conversion accepted for a range of amounts.*<br/>")
      @NotNull

    public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion resultReason(Object resultReason) {
    this.resultReason = resultReason;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return resultReason
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getResultReason() {
    return resultReason;
  }

  public void setResultReason(Object resultReason) {
    this.resultReason = resultReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion = (PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion) o;
    return Objects.equals(this.conversionDetails, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion.conversionDetails) &&
        Objects.equals(this.result, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion.result) &&
        Objects.equals(this.resultReason, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion.resultReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionDetails, result, resultReason);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
