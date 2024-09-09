package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data to request a stored value service (prepaid card or account).&lt;br/&gt;
 */
@Schema(description = "Data to request a stored value service (prepaid card or account).<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest   {
  @JsonProperty("Data")
  private Object data = null;

  @JsonProperty("SaleTransactionIdentification")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification = null;

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest data(Object data) {
    this.data = data;
    return this;
  }

  /**
   * Data related to the stored value card.
   * @return data
   **/
  @Schema(required = true, description = "Data related to the stored value card.")
      @NotNull

    public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest saleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest = (PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest) o;
    return Objects.equals(this.data, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest.data) &&
        Objects.equals(this.saleTransactionIdentification, poipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest.saleTransactionIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, saleTransactionIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestStoredValueAccountRequest {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    saleTransactionIdentification: ").append(toIndentedString(saleTransactionIdentification)).append("\n");
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
