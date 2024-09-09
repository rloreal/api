package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionOriginalAmount;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be accepted by the cardholder.&lt;br/&gt;
 */
@Schema(description = "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be accepted by the cardholder.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion   {
  @JsonProperty("ApplicableBinRange")
  private Object applicableBinRange = null;

  @JsonProperty("CurrencyConversionIdentification")
  private Object currencyConversionIdentification = null;

  @JsonProperty("CommissionDetails")
  private Object commissionDetails = null;

  @JsonProperty("DeclarationDetails")
  private Object declarationDetails = null;

  @JsonProperty("MarkUpDetails")
  private Object markUpDetails = null;

  @JsonProperty("InvertedExchangeRate")
  private Object invertedExchangeRate = null;

  @JsonProperty("OriginalAmount")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionOriginalAmount originalAmount = null;

  @JsonProperty("QuotationDate")
  private Object quotationDate = null;

  @JsonProperty("ResultingAmount")
  private Object resultingAmount = null;

  @JsonProperty("SourceCurrency")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency sourceCurrency = null;

  @JsonProperty("TargetCurrency")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency targetCurrency = null;

  @JsonProperty("ValidFrom")
  private Object validFrom = null;

  @JsonProperty("ValidUntil")
  private Object validUntil = null;

  @JsonProperty("ExchangeRate")
  private Object exchangeRate = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion applicableBinRange(Object applicableBinRange) {
    this.applicableBinRange = applicableBinRange;
    return this;
  }

  /**
   * Range of Bin for which the conversion is possible.
   * @return applicableBinRange
   **/
  @Schema(description = "Range of Bin for which the conversion is possible.")
      @NotNull

    public Object getApplicableBinRange() {
    return applicableBinRange;
  }

  public void setApplicableBinRange(Object applicableBinRange) {
    this.applicableBinRange = applicableBinRange;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion currencyConversionIdentification(Object currencyConversionIdentification) {
    this.currencyConversionIdentification = currencyConversionIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return currencyConversionIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getCurrencyConversionIdentification() {
    return currencyConversionIdentification;
  }

  public void setCurrencyConversionIdentification(Object currencyConversionIdentification) {
    this.currencyConversionIdentification = currencyConversionIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion commissionDetails(Object commissionDetails) {
    this.commissionDetails = commissionDetails;
    return this;
  }

  /**
   * Commission or additional charges made as part of a currency conversion.
   * @return commissionDetails
   **/
  @Schema(description = "Commission or additional charges made as part of a currency conversion.")
      @NotNull

    public Object getCommissionDetails() {
    return commissionDetails;
  }

  public void setCommissionDetails(Object commissionDetails) {
    this.commissionDetails = commissionDetails;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion declarationDetails(Object declarationDetails) {
    this.declarationDetails = declarationDetails;
    return this;
  }

  /**
   * Card scheme declaration (disclaimer) to present to the cardholder.
   * @return declarationDetails
   **/
  @Schema(description = "Card scheme declaration (disclaimer) to present to the cardholder.")
      @NotNull

    public Object getDeclarationDetails() {
    return declarationDetails;
  }

  public void setDeclarationDetails(Object declarationDetails) {
    this.declarationDetails = declarationDetails;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion markUpDetails(Object markUpDetails) {
    this.markUpDetails = markUpDetails;
    return this;
  }

  /**
   * Markup made as part of a currency conversion.
   * @return markUpDetails
   **/
  @Schema(description = "Markup made as part of a currency conversion.")
      @NotNull

    public Object getMarkUpDetails() {
    return markUpDetails;
  }

  public void setMarkUpDetails(Object markUpDetails) {
    this.markUpDetails = markUpDetails;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion invertedExchangeRate(Object invertedExchangeRate) {
    this.invertedExchangeRate = invertedExchangeRate;
    return this;
  }

  /**
   * Rate expressed as a percentage, that is, in hundredths, for example, 0.7 is 7/10 of a percent, and 7.0 is 7%.<br/>
   * @return invertedExchangeRate
   **/
  @Schema(example = "35", description = "Rate expressed as a percentage, that is, in hundredths, for example, 0.7 is 7/10 of a percent, and 7.0 is 7%.<br/>")
      @NotNull

    public Object getInvertedExchangeRate() {
    return invertedExchangeRate;
  }

  public void setInvertedExchangeRate(Object invertedExchangeRate) {
    this.invertedExchangeRate = invertedExchangeRate;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion originalAmount(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionOriginalAmount originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

  /**
   * Get originalAmount
   * @return originalAmount
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionOriginalAmount getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionOriginalAmount originalAmount) {
    this.originalAmount = originalAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion quotationDate(Object quotationDate) {
    this.quotationDate = quotationDate;
    return this;
  }

  /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>
   * @return quotationDate
   **/
  @Schema(description = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>")
      @NotNull

    public Object getQuotationDate() {
    return quotationDate;
  }

  public void setQuotationDate(Object quotationDate) {
    this.quotationDate = quotationDate;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion resultingAmount(Object resultingAmount) {
    this.resultingAmount = resultingAmount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return resultingAmount
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getResultingAmount() {
    return resultingAmount;
  }

  public void setResultingAmount(Object resultingAmount) {
    this.resultingAmount = resultingAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion sourceCurrency(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

  /**
   * Get sourceCurrency
   * @return sourceCurrency
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion targetCurrency(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency targetCurrency) {
    this.targetCurrency = targetCurrency;
    return this;
  }

  /**
   * Get targetCurrency
   * @return targetCurrency
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency getTargetCurrency() {
    return targetCurrency;
  }

  public void setTargetCurrency(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency targetCurrency) {
    this.targetCurrency = targetCurrency;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion validFrom(Object validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>
   * @return validFrom
   **/
  @Schema(description = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>")
      @NotNull

    public Object getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(Object validFrom) {
    this.validFrom = validFrom;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion validUntil(Object validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>
   * @return validUntil
   **/
  @Schema(description = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>")
      @NotNull

    public Object getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(Object validUntil) {
    this.validUntil = validUntil;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion exchangeRate(Object exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * Rate expressed as a percentage, that is, in hundredths, for example, 0.7 is 7/10 of a percent, and 7.0 is 7%.<br/>
   * @return exchangeRate
   **/
  @Schema(example = "35", required = true, description = "Rate expressed as a percentage, that is, in hundredths, for example, 0.7 is 7/10 of a percent, and 7.0 is 7%.<br/>")
      @NotNull

    public Object getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(Object exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion = (PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion) o;
    return Objects.equals(this.applicableBinRange, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion.applicableBinRange) &&
        Objects.equals(this.currencyConversionIdentification, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion.currencyConversionIdentification) &&
        Objects.equals(this.commissionDetails, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion.commissionDetails) &&
        Objects.equals(this.declarationDetails, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion.declarationDetails) &&
        Objects.equals(this.markUpDetails, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion.markUpDetails) &&
        Objects.equals(this.invertedExchangeRate, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion.invertedExchangeRate) &&
        Objects.equals(this.originalAmount, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion.originalAmount) &&
        Objects.equals(this.quotationDate, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion.quotationDate) &&
        Objects.equals(this.resultingAmount, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion.resultingAmount) &&
        Objects.equals(this.sourceCurrency, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion.sourceCurrency) &&
        Objects.equals(this.targetCurrency, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion.targetCurrency) &&
        Objects.equals(this.validFrom, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion.validFrom) &&
        Objects.equals(this.validUntil, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion.validUntil) &&
        Objects.equals(this.exchangeRate, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion.exchangeRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicableBinRange, currencyConversionIdentification, commissionDetails, declarationDetails, markUpDetails, invertedExchangeRate, originalAmount, quotationDate, resultingAmount, sourceCurrency, targetCurrency, validFrom, validUntil, exchangeRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion {\n");
    
    sb.append("    applicableBinRange: ").append(toIndentedString(applicableBinRange)).append("\n");
    sb.append("    currencyConversionIdentification: ").append(toIndentedString(currencyConversionIdentification)).append("\n");
    sb.append("    commissionDetails: ").append(toIndentedString(commissionDetails)).append("\n");
    sb.append("    declarationDetails: ").append(toIndentedString(declarationDetails)).append("\n");
    sb.append("    markUpDetails: ").append(toIndentedString(markUpDetails)).append("\n");
    sb.append("    invertedExchangeRate: ").append(toIndentedString(invertedExchangeRate)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    quotationDate: ").append(toIndentedString(quotationDate)).append("\n");
    sb.append("    resultingAmount: ").append(toIndentedString(resultingAmount)).append("\n");
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    targetCurrency: ").append(toIndentedString(targetCurrency)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
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
