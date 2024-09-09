package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payment transaction with an aggregated amount.&lt;br/&gt;
 */
@Schema(description = "Payment transaction with an aggregated amount.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction   {
  @JsonProperty("FirstPaymentDateTime")
  private Object firstPaymentDateTime = null;

  @JsonProperty("IndividualPayment")
  private Object individualPayment = null;

  @JsonProperty("LastPaymentDateTime")
  private Object lastPaymentDateTime = null;

  @JsonProperty("NumberOfPayments")
  private Object numberOfPayments = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction firstPaymentDateTime(Object firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
    return this;
  }

  /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>
   * @return firstPaymentDateTime
   **/
  @Schema(description = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>")
      @NotNull

    public Object getFirstPaymentDateTime() {
    return firstPaymentDateTime;
  }

  public void setFirstPaymentDateTime(Object firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction individualPayment(Object individualPayment) {
    this.individualPayment = individualPayment;
    return this;
  }

  /**
   * Individual payment that has been aggregated.
   * @return individualPayment
   **/
  @Schema(description = "Individual payment that has been aggregated.")
      @NotNull

    public Object getIndividualPayment() {
    return individualPayment;
  }

  public void setIndividualPayment(Object individualPayment) {
    this.individualPayment = individualPayment;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction lastPaymentDateTime(Object lastPaymentDateTime) {
    this.lastPaymentDateTime = lastPaymentDateTime;
    return this;
  }

  /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>
   * @return lastPaymentDateTime
   **/
  @Schema(description = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>")
      @NotNull

    public Object getLastPaymentDateTime() {
    return lastPaymentDateTime;
  }

  public void setLastPaymentDateTime(Object lastPaymentDateTime) {
    this.lastPaymentDateTime = lastPaymentDateTime;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction numberOfPayments(Object numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

  /**
   * Number of objects represented as an integer.<br/>
   * @return numberOfPayments
   **/
  @Schema(example = "123456789012345678", description = "Number of objects represented as an integer.<br/>")
      @NotNull

    public Object getNumberOfPayments() {
    return numberOfPayments;
  }

  public void setNumberOfPayments(Object numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction = (PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction) o;
    return Objects.equals(this.firstPaymentDateTime, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction.firstPaymentDateTime) &&
        Objects.equals(this.individualPayment, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction.individualPayment) &&
        Objects.equals(this.lastPaymentDateTime, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction.lastPaymentDateTime) &&
        Objects.equals(this.numberOfPayments, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction.numberOfPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstPaymentDateTime, individualPayment, lastPaymentDateTime, numberOfPayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsAggregationTransaction {\n");
    
    sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
    sb.append("    individualPayment: ").append(toIndentedString(individualPayment)).append("\n");
    sb.append("    lastPaymentDateTime: ").append(toIndentedString(lastPaymentDateTime)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
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
