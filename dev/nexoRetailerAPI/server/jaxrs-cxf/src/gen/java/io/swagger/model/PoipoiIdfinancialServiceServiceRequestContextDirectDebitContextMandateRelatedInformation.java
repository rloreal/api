package io.swagger.model;

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
  * Provides further details related to a direct debit mandate signed between the creditor and the debtor.<br/>
 **/
@Schema(description="Provides further details related to a direct debit mandate signed between the creditor and the debtor.<br/>")
public class PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation   {
  
  @Schema(description = "A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.<br/>")
 /**
   * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.<br/>  
  **/
  private Object dateOfSignature = null;
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object mandateIdentification = null;
  
  @Schema(description = "Binary data of 2MB maximum.<br/>")
 /**
   * Binary data of 2MB maximum.<br/>  
  **/
  private Object mandateImage = null;
 /**
   * A particular point in the progression of time in a calendar year expressed in the YYYY-MM-DD format. This representation is defined in \&quot;XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\&quot; which is aligned with ISO 8601.&lt;br/&gt;
   * @return dateOfSignature
  **/
  @JsonProperty("DateOfSignature")
  @NotNull
  public Object getDateOfSignature() {
    return dateOfSignature;
  }

  public void setDateOfSignature(Object dateOfSignature) {
    this.dateOfSignature = dateOfSignature;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation dateOfSignature(Object dateOfSignature) {
    this.dateOfSignature = dateOfSignature;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return mandateIdentification
  **/
  @JsonProperty("MandateIdentification")
  @NotNull
  public Object getMandateIdentification() {
    return mandateIdentification;
  }

  public void setMandateIdentification(Object mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation mandateIdentification(Object mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
    return this;
  }

 /**
   * Binary data of 2MB maximum.&lt;br/&gt;
   * @return mandateImage
  **/
  @JsonProperty("MandateImage")
  @NotNull
  public Object getMandateImage() {
    return mandateImage;
  }

  public void setMandateImage(Object mandateImage) {
    this.mandateImage = mandateImage;
  }

  public PoipoiIdfinancialServiceServiceRequestContextDirectDebitContextMandateRelatedInformation mandateImage(Object mandateImage) {
    this.mandateImage = mandateImage;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
