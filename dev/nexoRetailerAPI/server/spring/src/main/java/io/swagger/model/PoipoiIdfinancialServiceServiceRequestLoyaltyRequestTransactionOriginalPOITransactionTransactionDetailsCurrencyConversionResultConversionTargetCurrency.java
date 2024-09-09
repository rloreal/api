package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details of a currency.&lt;br/&gt;
 */
@Schema(description = "Details of a currency.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency   {
  @JsonProperty("AlphaCode")
  private Object alphaCode = null;

  @JsonProperty("Decimal")
  private Object decimal = null;

  @JsonProperty("Name")
  private Object name = null;

  @JsonProperty("NumericCode")
  private Object numericCode = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency alphaCode(Object alphaCode) {
    this.alphaCode = alphaCode;
    return this;
  }

  /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>
   * @return alphaCode
   **/
  @Schema(example = "EUR", required = true, description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".<br/>")
      @NotNull

    public Object getAlphaCode() {
    return alphaCode;
  }

  public void setAlphaCode(Object alphaCode) {
    this.alphaCode = alphaCode;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency decimal(Object decimal) {
    this.decimal = decimal;
    return this;
  }

  /**
   * Number of objects represented as an integer.<br/>
   * @return decimal
   **/
  @Schema(example = "123456789012345678", required = true, description = "Number of objects represented as an integer.<br/>")
      @NotNull

    public Object getDecimal() {
    return decimal;
  }

  public void setDecimal(Object decimal) {
    this.decimal = decimal;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency name(Object name) {
    this.name = name;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return name
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getName() {
    return name;
  }

  public void setName(Object name) {
    this.name = name;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency numericCode(Object numericCode) {
    this.numericCode = numericCode;
    return this;
  }

  /**
   * Specifies a numeric string with an exact length of 3 digits.<br/>
   * @return numericCode
   **/
  @Schema(required = true, description = "Specifies a numeric string with an exact length of 3 digits.<br/>")
      @NotNull

    public Object getNumericCode() {
    return numericCode;
  }

  public void setNumericCode(Object numericCode) {
    this.numericCode = numericCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency = (PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency) o;
    return Objects.equals(this.alphaCode, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency.alphaCode) &&
        Objects.equals(this.decimal, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency.decimal) &&
        Objects.equals(this.name, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency.name) &&
        Objects.equals(this.numericCode, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency.numericCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alphaCode, decimal, name, numericCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversionTargetCurrency {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
