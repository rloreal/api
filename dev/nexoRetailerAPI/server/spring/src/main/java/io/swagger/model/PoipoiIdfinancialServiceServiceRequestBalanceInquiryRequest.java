package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Specifies data element nexessary to request balance information.&lt;br/&gt;
 */
@Schema(description = "Specifies data element nexessary to request balance information.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest   {
  @JsonProperty("LoyaltyAccountRequest")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest loyaltyAccountRequest = null;

  @JsonProperty("PaymentAccountRequest")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest paymentAccountRequest = null;

  @JsonProperty("SaleTransactionIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification = null;

  @JsonProperty("StoredValueAccountRequest")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest storedValueAccountRequest = null;

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest loyaltyAccountRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest loyaltyAccountRequest) {
    this.loyaltyAccountRequest = loyaltyAccountRequest;
    return this;
  }

  /**
   * Get loyaltyAccountRequest
   * @return loyaltyAccountRequest
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest getLoyaltyAccountRequest() {
    return loyaltyAccountRequest;
  }

  public void setLoyaltyAccountRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequest loyaltyAccountRequest) {
    this.loyaltyAccountRequest = loyaltyAccountRequest;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest paymentAccountRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest paymentAccountRequest) {
    this.paymentAccountRequest = paymentAccountRequest;
    return this;
  }

  /**
   * Get paymentAccountRequest
   * @return paymentAccountRequest
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest getPaymentAccountRequest() {
    return paymentAccountRequest;
  }

  public void setPaymentAccountRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestPaymentAccountRequest paymentAccountRequest) {
    this.paymentAccountRequest = paymentAccountRequest;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest saleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
    return this;
  }

  /**
   * Get saleTransactionIdentification
   * @return saleTransactionIdentification
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getSaleTransactionIdentification() {
    return saleTransactionIdentification;
  }

  public void setSaleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest storedValueAccountRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest storedValueAccountRequest) {
    this.storedValueAccountRequest = storedValueAccountRequest;
    return this;
  }

  /**
   * Get storedValueAccountRequest
   * @return storedValueAccountRequest
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest getStoredValueAccountRequest() {
    return storedValueAccountRequest;
  }

  public void setStoredValueAccountRequest(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest storedValueAccountRequest) {
    this.storedValueAccountRequest = storedValueAccountRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest poipoiIdfinancialServiceServiceRequestBalanceInquiryRequest = (PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest) o;
    return Objects.equals(this.loyaltyAccountRequest, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequest.loyaltyAccountRequest) &&
        Objects.equals(this.paymentAccountRequest, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequest.paymentAccountRequest) &&
        Objects.equals(this.saleTransactionIdentification, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequest.saleTransactionIdentification) &&
        Objects.equals(this.storedValueAccountRequest, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequest.storedValueAccountRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loyaltyAccountRequest, paymentAccountRequest, saleTransactionIdentification, storedValueAccountRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequest {\n");
    
    sb.append("    loyaltyAccountRequest: ").append(toIndentedString(loyaltyAccountRequest)).append("\n");
    sb.append("    paymentAccountRequest: ").append(toIndentedString(paymentAccountRequest)).append("\n");
    sb.append("    saleTransactionIdentification: ").append(toIndentedString(saleTransactionIdentification)).append("\n");
    sb.append("    storedValueAccountRequest: ").append(toIndentedString(storedValueAccountRequest)).append("\n");
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
