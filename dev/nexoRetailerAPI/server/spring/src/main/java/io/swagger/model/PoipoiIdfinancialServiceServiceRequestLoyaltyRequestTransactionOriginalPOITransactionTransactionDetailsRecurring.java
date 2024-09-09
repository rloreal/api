package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Element related to recurring transaction.&lt;br/&gt;
 */
@Schema(description = "Element related to recurring transaction.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring   {
  @JsonProperty("GracePeriod")
  private Object gracePeriod = null;

  @JsonProperty("PlanIdentification")
  private Object planIdentification = null;

  @JsonProperty("PlanNotice")
  private Object planNotice = null;

  @JsonProperty("PeriodUnit")
  private Object periodUnit = null;

  @JsonProperty("SequenceNumber")
  private Object sequenceNumber = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring gracePeriod(Object gracePeriod) {
    this.gracePeriod = gracePeriod;
    return this;
  }

  /**
   * Contains grace period details.
   * @return gracePeriod
   **/
  @Schema(description = "Contains grace period details.")
      @NotNull

    public Object getGracePeriod() {
    return gracePeriod;
  }

  public void setGracePeriod(Object gracePeriod) {
    this.gracePeriod = gracePeriod;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring planIdentification(Object planIdentification) {
    this.planIdentification = planIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return planIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getPlanIdentification() {
    return planIdentification;
  }

  public void setPlanIdentification(Object planIdentification) {
    this.planIdentification = planIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring planNotice(Object planNotice) {
    this.planNotice = planNotice;
    return this;
  }

  /**
   * Notice related to the RecurringPlan.
   * @return planNotice
   **/
  @Schema(description = "Notice related to the RecurringPlan.")
      @NotNull

    public Object getPlanNotice() {
    return planNotice;
  }

  public void setPlanNotice(Object planNotice) {
    this.planNotice = planNotice;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring periodUnit(Object periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

  /**
   * Specifies the regularity of an event.<br/>- **YEAR: Annual**  : *Event takes place every year or once a year.*<br/>- **MNTH: Monthly**  : *Event takes place every month or once a month.*<br/>- **QURT: Quarterly**  : *Event takes place every three months or four times a year.*<br/>- **MIAN: SemiAnnual**  : *Event takes place every six months or two times a year.*<br/>- **WEEK: Weekly**  : *Event takes place once a week.*<br/>- **DAIL: Daily**  : *Event takes place every day.*<br/>- **TEND: TenDays**  : *Event takes place every ten business days.*<br/>
   * @return periodUnit
   **/
  @Schema(example = "YEAR", description = "Specifies the regularity of an event.<br/>- **YEAR: Annual**  : *Event takes place every year or once a year.*<br/>- **MNTH: Monthly**  : *Event takes place every month or once a month.*<br/>- **QURT: Quarterly**  : *Event takes place every three months or four times a year.*<br/>- **MIAN: SemiAnnual**  : *Event takes place every six months or two times a year.*<br/>- **WEEK: Weekly**  : *Event takes place once a week.*<br/>- **DAIL: Daily**  : *Event takes place every day.*<br/>- **TEND: TenDays**  : *Event takes place every ten business days.*<br/>")
      @NotNull

    public Object getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(Object periodUnit) {
    this.periodUnit = periodUnit;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring sequenceNumber(Object sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  /**
   * Number of objects represented as an integer.<br/>
   * @return sequenceNumber
   **/
  @Schema(example = "123456789012345678", description = "Number of objects represented as an integer.<br/>")
      @NotNull

    public Object getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Object sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring = (PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring) o;
    return Objects.equals(this.gracePeriod, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring.gracePeriod) &&
        Objects.equals(this.planIdentification, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring.planIdentification) &&
        Objects.equals(this.planNotice, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring.planNotice) &&
        Objects.equals(this.periodUnit, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring.periodUnit) &&
        Objects.equals(this.sequenceNumber, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring.sequenceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gracePeriod, planIdentification, planNotice, periodUnit, sequenceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring {\n");
    
    sb.append("    gracePeriod: ").append(toIndentedString(gracePeriod)).append("\n");
    sb.append("    planIdentification: ").append(toIndentedString(planIdentification)).append("\n");
    sb.append("    planNotice: ").append(toIndentedString(planNotice)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
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
