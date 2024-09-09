package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider.&lt;br/&gt;
 */
@Schema(description = "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult   {
  @JsonProperty("AcceptedByCardholder")
  private Object acceptedByCardholder = null;

  @JsonProperty("Conversion")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion conversion = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult acceptedByCardholder(Object acceptedByCardholder) {
    this.acceptedByCardholder = acceptedByCardholder;
    return this;
  }

  /**
   * A flag indicating a True or False value.<br/>
   * @return acceptedByCardholder
   **/
  @Schema(description = "A flag indicating a True or False value.<br/>")
      @NotNull

    public Object getAcceptedByCardholder() {
    return acceptedByCardholder;
  }

  public void setAcceptedByCardholder(Object acceptedByCardholder) {
    this.acceptedByCardholder = acceptedByCardholder;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult conversion(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion conversion) {
    this.conversion = conversion;
    return this;
  }

  /**
   * Get conversion
   * @return conversion
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion getConversion() {
    return conversion;
  }

  public void setConversion(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResultConversion conversion) {
    this.conversion = conversion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult = (PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult) o;
    return Objects.equals(this.acceptedByCardholder, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult.acceptedByCardholder) &&
        Objects.equals(this.conversion, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult.conversion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedByCardholder, conversion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionTransactionDetailsCurrencyConversionResult {\n");
    
    sb.append("    acceptedByCardholder: ").append(toIndentedString(acceptedByCardholder)).append("\n");
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
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
