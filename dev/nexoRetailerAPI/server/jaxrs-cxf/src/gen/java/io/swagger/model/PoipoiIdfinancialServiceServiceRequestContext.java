package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextPaymentContext;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestContextSaleContext;
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
  * Context in which the transaction is performed (payment and sale).<br/>
 **/
@Schema(description="Context in which the transaction is performed (payment and sale).<br/>")
public class PoipoiIdfinancialServiceServiceRequestContext   {
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext directDebitContext = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestContextPaymentContext paymentContext = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestContextSaleContext saleContext = null;
 /**
   * Get directDebitContext
   * @return directDebitContext
  **/
  @JsonProperty("DirectDebitContext")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext getDirectDebitContext() {
    return directDebitContext;
  }

  public void setDirectDebitContext(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext directDebitContext) {
    this.directDebitContext = directDebitContext;
  }

  public PoipoiIdfinancialServiceServiceRequestContext directDebitContext(PoipoiIdfinancialServiceServiceRequestContextDirectDebitContext directDebitContext) {
    this.directDebitContext = directDebitContext;
    return this;
  }

 /**
   * Get paymentContext
   * @return paymentContext
  **/
  @JsonProperty("PaymentContext")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestContextPaymentContext getPaymentContext() {
    return paymentContext;
  }

  public void setPaymentContext(PoipoiIdfinancialServiceServiceRequestContextPaymentContext paymentContext) {
    this.paymentContext = paymentContext;
  }

  public PoipoiIdfinancialServiceServiceRequestContext paymentContext(PoipoiIdfinancialServiceServiceRequestContextPaymentContext paymentContext) {
    this.paymentContext = paymentContext;
    return this;
  }

 /**
   * Get saleContext
   * @return saleContext
  **/
  @JsonProperty("SaleContext")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestContextSaleContext getSaleContext() {
    return saleContext;
  }

  public void setSaleContext(PoipoiIdfinancialServiceServiceRequestContextSaleContext saleContext) {
    this.saleContext = saleContext;
  }

  public PoipoiIdfinancialServiceServiceRequestContext saleContext(PoipoiIdfinancialServiceServiceRequestContextSaleContext saleContext) {
    this.saleContext = saleContext;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
