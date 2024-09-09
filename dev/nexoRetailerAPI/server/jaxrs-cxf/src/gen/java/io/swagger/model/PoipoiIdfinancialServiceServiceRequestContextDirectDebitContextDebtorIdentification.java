package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification;
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
  * Information about the debtor.<br/>
 **/
@Schema(description="Information about the debtor.<br/>")
public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification   {
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification accountIdentification = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor debtor = null;
 /**
   * Get accountIdentification
   * @return accountIdentification
  **/
  @JsonProperty("AccountIdentification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification getAccountIdentification() {
    return accountIdentification;
  }

  public void setAccountIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification accountIdentification) {
    this.accountIdentification = accountIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification accountIdentification(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentificationAccountIdentification accountIdentification) {
    this.accountIdentification = accountIdentification;
    return this;
  }

 /**
   * Get debtor
   * @return debtor
  **/
  @JsonProperty("Debtor")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor getDebtor() {
    return debtor;
  }

  public void setDebtor(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor debtor) {
    this.debtor = debtor;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification debtor(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextCreditorIdentificationCreditor debtor) {
    this.debtor = debtor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextDebtorIdentification {\n");
    
    sb.append("    accountIdentification: ").append(toIndentedString(accountIdentification)).append("\n");
    sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
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
