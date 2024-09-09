package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification;
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
  * Response data to a loyalty service request.<br/>
 **/
@Schema(description="Response data to a loyalty service request.<br/>")
public class SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse   {
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object poIReconciliationIdentification = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification = null;
  
  @Schema(description = "Data related to the result of a processed loyalty transaction.")
 /**
   * Data related to the result of a processed loyalty transaction.  
  **/
  private Object result = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification = null;
 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return poIReconciliationIdentification
  **/
  @JsonProperty("POIReconciliationIdentification")
  @NotNull
  public Object getPoIReconciliationIdentification() {
    return poIReconciliationIdentification;
  }

  public void setPoIReconciliationIdentification(Object poIReconciliationIdentification) {
    this.poIReconciliationIdentification = poIReconciliationIdentification;
  }

  public SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse poIReconciliationIdentification(Object poIReconciliationIdentification) {
    this.poIReconciliationIdentification = poIReconciliationIdentification;
    return this;
  }

 /**
   * Get poITransactionIdentification
   * @return poITransactionIdentification
  **/
  @JsonProperty("POITransactionIdentification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getPoITransactionIdentification() {
    return poITransactionIdentification;
  }

  public void setPoITransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification) {
    this.poITransactionIdentification = poITransactionIdentification;
  }

  public SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse poITransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification poITransactionIdentification) {
    this.poITransactionIdentification = poITransactionIdentification;
    return this;
  }

 /**
   * Data related to the result of a processed loyalty transaction.
   * @return result
  **/
  @JsonProperty("Result")
  @NotNull
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse result(Object result) {
    this.result = result;
    return this;
  }

 /**
   * Get saleTransactionIdentification
   * @return saleTransactionIdentification
  **/
  @JsonProperty("SaleTransactionIdentification")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification getSaleTransactionIdentification() {
    return saleTransactionIdentification;
  }

  public void setSaleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
  }

  public SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse saleTransactionIdentification(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestSaleTransactionIdentification saleTransactionIdentification) {
    this.saleTransactionIdentification = saleTransactionIdentification;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponseLoyaltyResponse {\n");
    
    sb.append("    poIReconciliationIdentification: ").append(toIndentedString(poIReconciliationIdentification)).append("\n");
    sb.append("    poITransactionIdentification: ").append(toIndentedString(poITransactionIdentification)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    saleTransactionIdentification: ").append(toIndentedString(saleTransactionIdentification)).append("\n");
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
