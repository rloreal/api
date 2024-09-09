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
  * Element related to recurring transaction.<br/>
 **/
@Schema(description="Element related to recurring transaction.<br/>")
public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring   {
  
  @Schema(description = "Contains grace period details.")
 /**
   * Contains grace period details.  
  **/
  private Object gracePeriod = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object planIdentification = null;
  
  @Schema(description = "Notice related to the RecurringPlan.")
 /**
   * Notice related to the RecurringPlan.  
  **/
  private Object planNotice = null;
  
  @Schema(example = "YEAR", description = "Specifies the regularity of an event.<br/>- **YEAR: Annual**  : *Event takes place every year or once a year.*<br/>- **MNTH: Monthly**  : *Event takes place every month or once a month.*<br/>- **QURT: Quarterly**  : *Event takes place every three months or four times a year.*<br/>- **MIAN: SemiAnnual**  : *Event takes place every six months or two times a year.*<br/>- **WEEK: Weekly**  : *Event takes place once a week.*<br/>- **DAIL: Daily**  : *Event takes place every day.*<br/>- **TEND: TenDays**  : *Event takes place every ten business days.*<br/>")
 /**
   * Specifies the regularity of an event.<br/>- **YEAR: Annual**  : *Event takes place every year or once a year.*<br/>- **MNTH: Monthly**  : *Event takes place every month or once a month.*<br/>- **QURT: Quarterly**  : *Event takes place every three months or four times a year.*<br/>- **MIAN: SemiAnnual**  : *Event takes place every six months or two times a year.*<br/>- **WEEK: Weekly**  : *Event takes place once a week.*<br/>- **DAIL: Daily**  : *Event takes place every day.*<br/>- **TEND: TenDays**  : *Event takes place every ten business days.*<br/>  
  **/
  private Object periodUnit = null;
  
  @Schema(example = "123456789012345678", description = "Number of objects represented as an integer.<br/>")
 /**
   * Number of objects represented as an integer.<br/>  
  **/
  private Object sequenceNumber = null;
 /**
   * Contains grace period details.
   * @return gracePeriod
  **/
  @JsonProperty("GracePeriod")
  @NotNull
  public Object getGracePeriod() {
    return gracePeriod;
  }

  public void setGracePeriod(Object gracePeriod) {
    this.gracePeriod = gracePeriod;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring gracePeriod(Object gracePeriod) {
    this.gracePeriod = gracePeriod;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return planIdentification
  **/
  @JsonProperty("PlanIdentification")
  @NotNull
  public Object getPlanIdentification() {
    return planIdentification;
  }

  public void setPlanIdentification(Object planIdentification) {
    this.planIdentification = planIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring planIdentification(Object planIdentification) {
    this.planIdentification = planIdentification;
    return this;
  }

 /**
   * Notice related to the RecurringPlan.
   * @return planNotice
  **/
  @JsonProperty("PlanNotice")
  @NotNull
  public Object getPlanNotice() {
    return planNotice;
  }

  public void setPlanNotice(Object planNotice) {
    this.planNotice = planNotice;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring planNotice(Object planNotice) {
    this.planNotice = planNotice;
    return this;
  }

 /**
   * Specifies the regularity of an event.&lt;br/&gt;- **YEAR: Annual**  : *Event takes place every year or once a year.*&lt;br/&gt;- **MNTH: Monthly**  : *Event takes place every month or once a month.*&lt;br/&gt;- **QURT: Quarterly**  : *Event takes place every three months or four times a year.*&lt;br/&gt;- **MIAN: SemiAnnual**  : *Event takes place every six months or two times a year.*&lt;br/&gt;- **WEEK: Weekly**  : *Event takes place once a week.*&lt;br/&gt;- **DAIL: Daily**  : *Event takes place every day.*&lt;br/&gt;- **TEND: TenDays**  : *Event takes place every ten business days.*&lt;br/&gt;
   * @return periodUnit
  **/
  @JsonProperty("PeriodUnit")
  @NotNull
  public Object getPeriodUnit() {
    return periodUnit;
  }

  public void setPeriodUnit(Object periodUnit) {
    this.periodUnit = periodUnit;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring periodUnit(Object periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

 /**
   * Number of objects represented as an integer.&lt;br/&gt;
   * @return sequenceNumber
  **/
  @JsonProperty("SequenceNumber")
  @NotNull
  public Object getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Object sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsRecurring sequenceNumber(Object sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
