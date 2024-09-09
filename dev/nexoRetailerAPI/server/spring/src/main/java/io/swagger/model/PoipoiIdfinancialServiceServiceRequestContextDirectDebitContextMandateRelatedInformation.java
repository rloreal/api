package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides further details related to a direct debit mandate signed between the creditor and the debtor.&lt;br/&gt;
 */
@Schema(description = "Provides further details related to a direct debit mandate signed between the creditor and the debtor.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation   {
  @JsonProperty("DateOfSignature")
  private Object dateOfSignature = null;

  @JsonProperty("MandateIdentification")
  private Object mandateIdentification = null;

  @JsonProperty("MandateImage")
  private Object mandateImage = null;

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation dateOfSignature(Object dateOfSignature) {
    this.dateOfSignature = dateOfSignature;
    return this;
  }

  /**
   * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.<br/>
   * @return dateOfSignature
   **/
  @Schema(description = "A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.<br/>")
      @NotNull

    public Object getDateOfSignature() {
    return dateOfSignature;
  }

  public void setDateOfSignature(Object dateOfSignature) {
    this.dateOfSignature = dateOfSignature;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation mandateIdentification(Object mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return mandateIdentification
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getMandateIdentification() {
    return mandateIdentification;
  }

  public void setMandateIdentification(Object mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation mandateImage(Object mandateImage) {
    this.mandateImage = mandateImage;
    return this;
  }

  /**
   * Binary data of 2MB maximum.<br/>
   * @return mandateImage
   **/
  @Schema(description = "Binary data of 2MB maximum.<br/>")
      @NotNull

    public Object getMandateImage() {
    return mandateImage;
  }

  public void setMandateImage(Object mandateImage) {
    this.mandateImage = mandateImage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation poipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation = (PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation) o;
    return Objects.equals(this.dateOfSignature, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation.dateOfSignature) &&
        Objects.equals(this.mandateIdentification, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation.mandateIdentification) &&
        Objects.equals(this.mandateImage, poipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation.mandateImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfSignature, mandateIdentification, mandateImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation {\n");
    
    sb.append("    dateOfSignature: ").append(toIndentedString(dateOfSignature)).append("\n");
    sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
    sb.append("    mandateImage: ").append(toIndentedString(mandateImage)).append("\n");
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
