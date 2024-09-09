package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data to request a loyalty service. A loyalty request contents : the loyalty transaction request and the loyalty data if any.&lt;br/&gt;
 */
@Schema(description = "Data to request a loyalty service. A loyalty request contents : the loyalty transaction request and the loyalty data if any.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestLoyaltyRequest   {
  @JsonProperty("CustomerOrder")
  private PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder = null;

  @JsonProperty("Data")
  private Object data = null;

  @JsonProperty("Transaction")
  private PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction transaction = null;

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequest customerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
    return this;
  }

  /**
   * Get customerOrder
   * @return customerOrder
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder getCustomerOrder() {
    return customerOrder;
  }

  public void setCustomerOrder(PoipoiIdfinancialServiceServiceRequestBalanceInquiryRequestLoyaltyAccountRequestCustomerOrder customerOrder) {
    this.customerOrder = customerOrder;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequest data(Object data) {
    this.data = data;
    return this;
  }

  /**
   * Data related to a Loyalty program or account.
   * @return data
   **/
  @Schema(description = "Data related to a Loyalty program or account.")
      @NotNull

    public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public PoipoiIdfinancialServiceServiceRequestLoyaltyRequest transaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction getTransaction() {
    return transaction;
  }

  public void setTransaction(PoipoiIdfinancialServiceServiceRequestLoyaltyRequestTransaction transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestLoyaltyRequest poipoiIdfinancialServiceServiceRequestLoyaltyRequest = (PoipoiIdfinancialServiceServiceRequestLoyaltyRequest) o;
    return Objects.equals(this.customerOrder, poipoiIdfinancialServiceServiceRequestLoyaltyRequest.customerOrder) &&
        Objects.equals(this.data, poipoiIdfinancialServiceServiceRequestLoyaltyRequest.data) &&
        Objects.equals(this.transaction, poipoiIdfinancialServiceServiceRequestLoyaltyRequest.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOrder, data, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestLoyaltyRequest {\n");
    
    sb.append("    customerOrder: ").append(toIndentedString(customerOrder)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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
