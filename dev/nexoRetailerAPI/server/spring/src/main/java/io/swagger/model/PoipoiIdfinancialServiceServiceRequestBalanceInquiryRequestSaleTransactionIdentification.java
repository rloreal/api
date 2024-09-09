package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identification of the transaction in an unambiguous way.&lt;br/&gt;
 */
@Schema(description = "Identification of the transaction in an unambiguous way.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification   {
  @JsonProperty("TransactionDateTime")
  private Object transactionDateTime = null;

  @JsonProperty("TransactionReference")
  private Object transactionReference = null;

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification transactionDateTime(Object transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
    return this;
  }

  /**
   * A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>
   * @return transactionDateTime
   **/
  @Schema(required = true, description = "A particular point in the progression of time defined by a mandatory date and a mandatory time component, expressed in either UTC time format (YYYY-MM-DDThh:mm:ss.sssZ), local time with UTC offset format (YYYY-MM-DDThh:mm:ss.sss+/-hh:mm), or local time format (YYYY-MM-DDThh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601. Note on the time format: 1) beginning / end of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end of a calendar day 2) fractions of second in time format Decimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.<br/>")
      @NotNull

    public Object getTransactionDateTime() {
    return transactionDateTime;
  }

  public void setTransactionDateTime(Object transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification transactionReference(Object transactionReference) {
    this.transactionReference = transactionReference;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return transactionReference
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getTransactionReference() {
    return transactionReference;
  }

  public void setTransactionReference(Object transactionReference) {
    this.transactionReference = transactionReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification = (PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification) o;
    return Objects.equals(this.transactionDateTime, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification.transactionDateTime) &&
        Objects.equals(this.transactionReference, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification.transactionReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionDateTime, transactionReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification {\n");
    
    sb.append("    transactionDateTime: ").append(toIndentedString(transactionDateTime)).append("\n");
    sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
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
