package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identification of the original transaction.&lt;br/&gt;
 */
@Schema(description = "Identification of the original transaction.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction   {
  @JsonProperty("CurrencyConversion")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion currencyConversion = null;

  @JsonProperty("POIIdentification")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification poIIdentification = null;

  @JsonProperty("SaleReferenceIdentification")
  private Object saleReferenceIdentification = null;

  @JsonProperty("TransactionIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification transactionIdentification = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction currencyConversion(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion currencyConversion) {
    this.currencyConversion = currencyConversion;
    return this;
  }

  /**
   * Get currencyConversion
   * @return currencyConversion
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion getCurrencyConversion() {
    return currencyConversion;
  }

  public void setCurrencyConversion(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransactionCurrencyConversion currencyConversion) {
    this.currencyConversion = currencyConversion;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction poIIdentification(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification poIIdentification) {
    this.poIIdentification = poIIdentification;
    return this;
  }

  /**
   * Get poIIdentification
   * @return poIIdentification
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification getPoIIdentification() {
    return poIIdentification;
  }

  public void setPoIIdentification(PoipoiIdfinancialServiceServiceRequestEnvironmentMerchantIdentification poIIdentification) {
    this.poIIdentification = poIIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction saleReferenceIdentification(Object saleReferenceIdentification) {
    this.saleReferenceIdentification = saleReferenceIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return saleReferenceIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getSaleReferenceIdentification() {
    return saleReferenceIdentification;
  }

  public void setSaleReferenceIdentification(Object saleReferenceIdentification) {
    this.saleReferenceIdentification = saleReferenceIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction transactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
    return this;
  }

  /**
   * Get transactionIdentification
   * @return transactionIdentification
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getTransactionIdentification() {
    return transactionIdentification;
  }

  public void setTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification transactionIdentification) {
    this.transactionIdentification = transactionIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction = (PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction) o;
    return Objects.equals(this.currencyConversion, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction.currencyConversion) &&
        Objects.equals(this.poIIdentification, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction.poIIdentification) &&
        Objects.equals(this.saleReferenceIdentification, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction.saleReferenceIdentification) &&
        Objects.equals(this.transactionIdentification, poipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction.transactionIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyConversion, poIIdentification, saleReferenceIdentification, transactionIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransactionOriginalPOITransactionOriginalTransaction {\n");
    
    sb.append("    currencyConversion: ").append(toIndentedString(currencyConversion)).append("\n");
    sb.append("    poIIdentification: ").append(toIndentedString(poIIdentification)).append("\n");
    sb.append("    saleReferenceIdentification: ").append(toIndentedString(saleReferenceIdentification)).append("\n");
    sb.append("    transactionIdentification: ").append(toIndentedString(transactionIdentification)).append("\n");
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
