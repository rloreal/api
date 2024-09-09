package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextPaymentContext;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextSaleContext;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Context in which the transaction is performed (payment and sale).&lt;br/&gt;
 */
@Schema(description = "Context in which the transaction is performed (payment and sale).<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestContext   {
  @JsonProperty("DirectDebitContext")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext directDebitContext = null;

  @JsonProperty("PaymentContext")
  private PoipoiIdfinancialServiceServiceRequestContextPaymentContext paymentContext = null;

  @JsonProperty("SaleContext")
  private PoipoiIdfinancialServiceServiceRequestContextSaleContext saleContext = null;

  public PoipoiIdfinancialServiceServiceRequestContext directDebitContext(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext directDebitContext) {
    this.directDebitContext = directDebitContext;
    return this;
  }

  /**
   * Get directDebitContext
   * @return directDebitContext
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext getDirectDebitContext() {
    return directDebitContext;
  }

  public void setDirectDebitContext(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext directDebitContext) {
    this.directDebitContext = directDebitContext;
  }

  public PoipoiIdfinancialServiceServiceRequestContext paymentContext(PoipoiIdfinancialServiceServiceRequestContextPaymentContext paymentContext) {
    this.paymentContext = paymentContext;
    return this;
  }

  /**
   * Get paymentContext
   * @return paymentContext
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestContextPaymentContext getPaymentContext() {
    return paymentContext;
  }

  public void setPaymentContext(PoipoiIdfinancialServiceServiceRequestContextPaymentContext paymentContext) {
    this.paymentContext = paymentContext;
  }

  public PoipoiIdfinancialServiceServiceRequestContext saleContext(PoipoiIdfinancialServiceServiceRequestContextSaleContext saleContext) {
    this.saleContext = saleContext;
    return this;
  }

  /**
   * Get saleContext
   * @return saleContext
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestContextSaleContext getSaleContext() {
    return saleContext;
  }

  public void setSaleContext(PoipoiIdfinancialServiceServiceRequestContextSaleContext saleContext) {
    this.saleContext = saleContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestContext poipoiIdfinancialServiceServiceRequestContext = (PoipoiIdfinancialServiceServiceRequestContext) o;
    return Objects.equals(this.directDebitContext, poipoiIdfinancialServiceServiceRequestContext.directDebitContext) &&
        Objects.equals(this.paymentContext, poipoiIdfinancialServiceServiceRequestContext.paymentContext) &&
        Objects.equals(this.saleContext, poipoiIdfinancialServiceServiceRequestContext.saleContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebitContext, paymentContext, saleContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContext {\n");
    
    sb.append("    directDebitContext: ").append(toIndentedString(directDebitContext)).append("\n");
    sb.append("    paymentContext: ").append(toIndentedString(paymentContext)).append("\n");
    sb.append("    saleContext: ").append(toIndentedString(saleContext)).append("\n");
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
