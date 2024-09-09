package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Customer order attached to a customer, recorded in the POI system.&lt;br/&gt;
 */
@Schema(description = "Customer order attached to a customer, recorded in the POI system.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder   {
  @JsonProperty("AccessedBy")
  private Object accessedBy = null;

  @JsonProperty("AdditionalInformation")
  private Object additionalInformation = null;

  @JsonProperty("Currency")
  private Object currency = null;

  @JsonProperty("CustomerOrderIdentification")
  private Object customerOrderIdentification = null;

  @JsonProperty("CurrentAmount")
  private Object currentAmount = null;

  @JsonProperty("EndDate")
  private Object endDate = null;

  @JsonProperty("ForecastedAmount")
  private Object forecastedAmount = null;

  @JsonProperty("OpenOrderState")
  private Object openOrderState = null;

  @JsonProperty("SaleReferenceIdentification")
  private Object saleReferenceIdentification = null;

  @JsonProperty("StartDate")
  private Object startDate = null;

  @JsonProperty("Unit")
  private Object unit = null;

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder accessedBy(Object accessedBy) {
    this.accessedBy = accessedBy;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return accessedBy
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getAccessedBy() {
    return accessedBy;
  }

  public void setAccessedBy(Object accessedBy) {
    this.accessedBy = accessedBy;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder additionalInformation(Object additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 1025 characters.<br/>
   * @return additionalInformation
   **/
  @Schema(description = "Specifies a character string with a maximum length of 1025 characters.<br/>")
      @NotNull

    public Object getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(Object additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder currency(Object currency) {
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

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrderIdentification(Object customerOrderIdentification) {
    this.customerOrderIdentification = customerOrderIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return customerOrderIdentification
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getCustomerOrderIdentification() {
    return customerOrderIdentification;
  }

  public void setCustomerOrderIdentification(Object customerOrderIdentification) {
    this.customerOrderIdentification = customerOrderIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder currentAmount(Object currentAmount) {
    this.currentAmount = currentAmount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return currentAmount
   **/
  @Schema(example = "500000", description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getCurrentAmount() {
    return currentAmount;
  }

  public void setCurrentAmount(Object currentAmount) {
    this.currentAmount = currentAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder endDate(Object endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>
   * @return endDate
   **/
  @Schema(description = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>")
      @NotNull

    public Object getEndDate() {
    return endDate;
  }

  public void setEndDate(Object endDate) {
    this.endDate = endDate;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder forecastedAmount(Object forecastedAmount) {
    this.forecastedAmount = forecastedAmount;
    return this;
  }

  /**
   * Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>
   * @return forecastedAmount
   **/
  @Schema(example = "500000", required = true, description = "Number of monetary units specified in a currency where the unit of currency is implied by the context and compliant with ISO 4217. The decimal separator is a dot. Note: a zero amount is considered a positive amount.<br/>")
      @NotNull

    public Object getForecastedAmount() {
    return forecastedAmount;
  }

  public void setForecastedAmount(Object forecastedAmount) {
    this.forecastedAmount = forecastedAmount;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder openOrderState(Object openOrderState) {
    this.openOrderState = openOrderState;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return openOrderState
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getOpenOrderState() {
    return openOrderState;
  }

  public void setOpenOrderState(Object openOrderState) {
    this.openOrderState = openOrderState;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder saleReferenceIdentification(Object saleReferenceIdentification) {
    this.saleReferenceIdentification = saleReferenceIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return saleReferenceIdentification
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getSaleReferenceIdentification() {
    return saleReferenceIdentification;
  }

  public void setSaleReferenceIdentification(Object saleReferenceIdentification) {
    this.saleReferenceIdentification = saleReferenceIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder startDate(Object startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>
   * @return startDate
   **/
  @Schema(required = true, description = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>")
      @NotNull

    public Object getStartDate() {
    return startDate;
  }

  public void setStartDate(Object startDate) {
    this.startDate = startDate;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder unit(Object unit) {
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
    PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder = (PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder) o;
    return Objects.equals(this.accessedBy, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder.accessedBy) &&
        Objects.equals(this.additionalInformation, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder.additionalInformation) &&
        Objects.equals(this.currency, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder.currency) &&
        Objects.equals(this.customerOrderIdentification, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder.customerOrderIdentification) &&
        Objects.equals(this.currentAmount, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder.currentAmount) &&
        Objects.equals(this.endDate, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder.endDate) &&
        Objects.equals(this.forecastedAmount, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder.forecastedAmount) &&
        Objects.equals(this.openOrderState, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder.openOrderState) &&
        Objects.equals(this.saleReferenceIdentification, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder.saleReferenceIdentification) &&
        Objects.equals(this.startDate, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder.startDate) &&
        Objects.equals(this.unit, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessedBy, additionalInformation, currency, customerOrderIdentification, currentAmount, endDate, forecastedAmount, openOrderState, saleReferenceIdentification, startDate, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder {\n");
    
    sb.append("    accessedBy: ").append(toIndentedString(accessedBy)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customerOrderIdentification: ").append(toIndentedString(customerOrderIdentification)).append("\n");
    sb.append("    currentAmount: ").append(toIndentedString(currentAmount)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    forecastedAmount: ").append(toIndentedString(forecastedAmount)).append("\n");
    sb.append("    openOrderState: ").append(toIndentedString(openOrderState)).append("\n");
    sb.append("    saleReferenceIdentification: ").append(toIndentedString(saleReferenceIdentification)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
