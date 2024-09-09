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
  * Details of a currency.<br/>
 **/
@Schema(description="Details of a currency.<br/>")
public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency   {
  
  @Schema(example = "EUR", description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>")
 /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>  
  **/
  private Object alphaCode = null;
  
  @Schema(example = "123456789012345678", description = "Number of objects represented as an integer.<br/>")
 /**
   * Number of objects represented as an integer.<br/>  
  **/
  private Object decimal = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object name = null;
  
  @Schema(description = "Specifies a numeric string with an exact length of 3 digits.<br/>")
 /**
   * Specifies a numeric string with an exact length of 3 digits.<br/>  
  **/
  private Object numericCode = null;
 /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \&quot;Codes for the representation of currencies and funds\&quot;.&lt;br/&gt;
   * @return alphaCode
  **/
  @JsonProperty("AlphaCode")
  @NotNull
  public Object getAlphaCode() {
    return alphaCode;
  }

  public void setAlphaCode(Object alphaCode) {
    this.alphaCode = alphaCode;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency alphaCode(Object alphaCode) {
    this.alphaCode = alphaCode;
    return this;
  }

 /**
   * Number of objects represented as an integer.&lt;br/&gt;
   * @return decimal
  **/
  @JsonProperty("Decimal")
  @NotNull
  public Object getDecimal() {
    return decimal;
  }

  public void setDecimal(Object decimal) {
    this.decimal = decimal;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency decimal(Object decimal) {
    this.decimal = decimal;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return name
  **/
  @JsonProperty("Name")
  @NotNull
  public Object getName() {
    return name;
  }

  public void setName(Object name) {
    this.name = name;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency name(Object name) {
    this.name = name;
    return this;
  }

 /**
   * Specifies a numeric string with an exact length of 3 digits.&lt;br/&gt;
   * @return numericCode
  **/
  @JsonProperty("NumericCode")
  @NotNull
  public Object getNumericCode() {
    return numericCode;
  }

  public void setNumericCode(Object numericCode) {
    this.numericCode = numericCode;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency numericCode(Object numericCode) {
    this.numericCode = numericCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionSourceCurrency {\n");
    
    sb.append("    alphaCode: ").append(toIndentedString(alphaCode)).append("\n");
    sb.append("    decimal: ").append(toIndentedString(decimal)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numericCode: ").append(toIndentedString(numericCode)).append("\n");
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
