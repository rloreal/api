package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation;
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
  * Element containing all information needed for a card initiating direct debit.<br/>
 **/
@Schema(description="Element containing all information needed for a card initiating direct debit.<br/>")
public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext   {
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification creditorIdentification = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification debtorIdentification = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation mandateRelatedInformation = null;
 /**
   * Get creditorIdentification
   * @return creditorIdentification
  **/
  @JsonProperty("CreditorIdentification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification getCreditorIdentification() {
    return creditorIdentification;
  }

  public void setCreditorIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification creditorIdentification) {
    this.creditorIdentification = creditorIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext creditorIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentification creditorIdentification) {
    this.creditorIdentification = creditorIdentification;
    return this;
  }

 /**
   * Get debtorIdentification
   * @return debtorIdentification
  **/
  @JsonProperty("DebtorIdentification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification getDebtorIdentification() {
    return debtorIdentification;
  }

  public void setDebtorIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification debtorIdentification) {
    this.debtorIdentification = debtorIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext debtorIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification debtorIdentification) {
    this.debtorIdentification = debtorIdentification;
    return this;
  }

 /**
   * Get mandateRelatedInformation
   * @return mandateRelatedInformation
  **/
  @JsonProperty("MandateRelatedInformation")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation getMandateRelatedInformation() {
    return mandateRelatedInformation;
  }

  public void setMandateRelatedInformation(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation mandateRelatedInformation) {
    this.mandateRelatedInformation = mandateRelatedInformation;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext mandateRelatedInformation(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation mandateRelatedInformation) {
    this.mandateRelatedInformation = mandateRelatedInformation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext {\n");
    
    sb.append("    creditorIdentification: ").append(toIndentedString(creditorIdentification)).append("\n");
    sb.append("    debtorIdentification: ").append(toIndentedString(debtorIdentification)).append("\n");
    sb.append("    mandateRelatedInformation: ").append(toIndentedString(mandateRelatedInformation)).append("\n");
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
