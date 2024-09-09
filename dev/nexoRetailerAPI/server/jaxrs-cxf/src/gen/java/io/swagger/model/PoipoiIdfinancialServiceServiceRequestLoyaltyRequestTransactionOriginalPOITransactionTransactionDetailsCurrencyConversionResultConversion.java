package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionOriginalAmount;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency;
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
  * Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be accepted by the cardholder.<br/>
 **/
@Schema(description="Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider. The currency conversion has to be accepted by the cardholder.<br/>")
public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion   {
  
  @Schema(description = "Range of Bin for which the conversion is possible.")
 /**
   * Range of Bin for which the conversion is possible.  
  **/
  private Object applicableBinRange = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object currencyConversionIdentification = null;
  
  @Schema(description = "Commission or additional charges made as part of a currency conversion.")
 /**
   * Commission or additional charges made as part of a currency conversion.  
  **/
  private Object commissionDetails = null;
  
  @Schema(description = "Card scheme declaration (disclaimer) to present to the cardholder.")
 /**
   * Card scheme declaration (disclaimer) to present to the cardholder.  
  **/
  private Object declarationDetails = null;
  
  @Schema(description = "Markup made as part of a currency conversion.")
 /**
   * Markup made as part of a currency conversion.  
  **/
  private Object markUpDetails = null;
  
  @Schema(example = "35", description = "Rate expressed as a percentage, that is, in hundredths, for example, 0.7 is 7/10 of a percent, and 7.0 is 7%.<br/>")
 /**
   * Rate expressed as a percentage, that is, in hundredths, for example, 0.7 is 7/10 of a percent, and 7.0 is 7%.<br/>  
  **/
  private Object invertedExchangeRate = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionOriginalAmount originalAmount = null;
  
  @Schema(description = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>")
 /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>  
  **/
  private Object quotationDate = null;
  
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>  
  **/
  private Object resultingAmount = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency sourceCurrency = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency targetCurrency = null;
  
  @Schema(description = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>")
 /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>  
  **/
  private Object validFrom = null;
  
  @Schema(description = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>")
 /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>  
  **/
  private Object validUntil = null;
  
  @Schema(example = "35", required = true, description = "Rate expressed as a percentage, that is, in hundredths, for example, 0.7 is 7/10 of a percent, and 7.0 is 7%.<br/>")
 /**
   * Rate expressed as a percentage, that is, in hundredths, for example, 0.7 is 7/10 of a percent, and 7.0 is 7%.<br/>  
  **/
  private Object exchangeRate = null;
 /**
   * Range of Bin for which the conversion is possible.
   * @return applicableBinRange
  **/
  @JsonProperty("ApplicableBinRange")
  @NotNull
  public Object getApplicableBinRange() {
    return applicableBinRange;
  }

  public void setApplicableBinRange(Object applicableBinRange) {
    this.applicableBinRange = applicableBinRange;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion applicableBinRange(Object applicableBinRange) {
    this.applicableBinRange = applicableBinRange;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return currencyConversionIdentification
  **/
  @JsonProperty("CurrencyConversionIdentification")
  @NotNull
  public Object getCurrencyConversionIdentification() {
    return currencyConversionIdentification;
  }

  public void setCurrencyConversionIdentification(Object currencyConversionIdentification) {
    this.currencyConversionIdentification = currencyConversionIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion currencyConversionIdentification(Object currencyConversionIdentification) {
    this.currencyConversionIdentification = currencyConversionIdentification;
    return this;
  }

 /**
   * Commission or additional charges made as part of a currency conversion.
   * @return commissionDetails
  **/
  @JsonProperty("CommissionDetails")
  @NotNull
  public Object getCommissionDetails() {
    return commissionDetails;
  }

  public void setCommissionDetails(Object commissionDetails) {
    this.commissionDetails = commissionDetails;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion commissionDetails(Object commissionDetails) {
    this.commissionDetails = commissionDetails;
    return this;
  }

 /**
   * Card scheme declaration (disclaimer) to present to the cardholder.
   * @return declarationDetails
  **/
  @JsonProperty("DeclarationDetails")
  @NotNull
  public Object getDeclarationDetails() {
    return declarationDetails;
  }

  public void setDeclarationDetails(Object declarationDetails) {
    this.declarationDetails = declarationDetails;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion declarationDetails(Object declarationDetails) {
    this.declarationDetails = declarationDetails;
    return this;
  }

 /**
   * Markup made as part of a currency conversion.
   * @return markUpDetails
  **/
  @JsonProperty("MarkUpDetails")
  @NotNull
  public Object getMarkUpDetails() {
    return markUpDetails;
  }

  public void setMarkUpDetails(Object markUpDetails) {
    this.markUpDetails = markUpDetails;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion markUpDetails(Object markUpDetails) {
    this.markUpDetails = markUpDetails;
    return this;
  }

 /**
   * Rate expressed as a percentage, that is, in hundredths, for example, 0.7 is 7/10 of a percent, and 7.0 is 7%.&lt;br/&gt;
   * @return invertedExchangeRate
  **/
  @JsonProperty("InvertedExchangeRate")
  @NotNull
  public Object getInvertedExchangeRate() {
    return invertedExchangeRate;
  }

  public void setInvertedExchangeRate(Object invertedExchangeRate) {
    this.invertedExchangeRate = invertedExchangeRate;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion invertedExchangeRate(Object invertedExchangeRate) {
    this.invertedExchangeRate = invertedExchangeRate;
    return this;
  }

 /**
   * Get originalAmount
   * @return originalAmount
  **/
  @JsonProperty("OriginalAmount")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionOriginalAmount getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionOriginalAmount originalAmount) {
    this.originalAmount = originalAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion originalAmount(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionOriginalAmount originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

 /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \&quot;XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\&quot; which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 &#x3D; the beginning of a calendar day 24:00:00 &#x3D; the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.&lt;br/&gt;
   * @return quotationDate
  **/
  @JsonProperty("QuotationDate")
  @NotNull
  public Object getQuotationDate() {
    return quotationDate;
  }

  public void setQuotationDate(Object quotationDate) {
    this.quotationDate = quotationDate;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion quotationDate(Object quotationDate) {
    this.quotationDate = quotationDate;
    return this;
  }

 /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.&lt;br/&gt;
   * @return resultingAmount
  **/
  @JsonProperty("ResultingAmount")
  @NotNull
  public Object getResultingAmount() {
    return resultingAmount;
  }

  public void setResultingAmount(Object resultingAmount) {
    this.resultingAmount = resultingAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion resultingAmount(Object resultingAmount) {
    this.resultingAmount = resultingAmount;
    return this;
  }

 /**
   * Get sourceCurrency
   * @return sourceCurrency
  **/
  @JsonProperty("SourceCurrency")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion sourceCurrency(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

 /**
   * Get targetCurrency
   * @return targetCurrency
  **/
  @JsonProperty("TargetCurrency")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency getTargetCurrency() {
    return targetCurrency;
  }

  public void setTargetCurrency(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency targetCurrency) {
    this.targetCurrency = targetCurrency;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion targetCurrency(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency targetCurrency) {
    this.targetCurrency = targetCurrency;
    return this;
  }

 /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \&quot;XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\&quot; which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 &#x3D; the beginning of a calendar day 24:00:00 &#x3D; the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.&lt;br/&gt;
   * @return validFrom
  **/
  @JsonProperty("ValidFrom")
  @NotNull
  public Object getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(Object validFrom) {
    this.validFrom = validFrom;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion validFrom(Object validFrom) {
    this.validFrom = validFrom;
    return this;
  }

 /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \&quot;XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\&quot; which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 &#x3D; the beginning of a calendar day 24:00:00 &#x3D; the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.&lt;br/&gt;
   * @return validUntil
  **/
  @JsonProperty("ValidUntil")
  @NotNull
  public Object getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(Object validUntil) {
    this.validUntil = validUntil;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion validUntil(Object validUntil) {
    this.validUntil = validUntil;
    return this;
  }

 /**
   * Rate expressed as a percentage, that is, in hundredths, for example, 0.7 is 7/10 of a percent, and 7.0 is 7%.&lt;br/&gt;
   * @return exchangeRate
  **/
  @JsonProperty("ExchangeRate")
  @NotNull
  public Object getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(Object exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion exchangeRate(Object exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
