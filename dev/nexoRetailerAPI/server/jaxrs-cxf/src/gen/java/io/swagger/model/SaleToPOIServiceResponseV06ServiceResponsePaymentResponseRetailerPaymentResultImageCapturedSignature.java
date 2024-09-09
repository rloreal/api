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
  * Provides all information related to a handwritten signature capture.<br/>
 **/
@Schema(description="Provides all information related to a handwritten signature capture.<br/>")
public class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature   {
  
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 140 characters.<br/>  
  **/
  private Object additionalInformation = null;
  
  @Schema(description = "Binary data of 2MB maximum.<br/>")
 /**
   * Binary data of 2MB maximum.<br/>  
  **/
  private Object imageData = null;
  
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object imageFormat = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 500 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 500 characters.<br/>  
  **/
  private Object imageReference = null;
 /**
   * Specifies a character string with a maximum length of 140 characters.&lt;br/&gt;
   * @return additionalInformation
  **/
  @JsonProperty("AdditionalInformation")
  @NotNull
  public Object getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(Object additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature additionalInformation(Object additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

 /**
   * Binary data of 2MB maximum.&lt;br/&gt;
   * @return imageData
  **/
  @JsonProperty("ImageData")
  @NotNull
  public Object getImageData() {
    return imageData;
  }

  public void setImageData(Object imageData) {
    this.imageData = imageData;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature imageData(Object imageData) {
    this.imageData = imageData;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return imageFormat
  **/
  @JsonProperty("ImageFormat")
  @NotNull
  public Object getImageFormat() {
    return imageFormat;
  }

  public void setImageFormat(Object imageFormat) {
    this.imageFormat = imageFormat;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature imageFormat(Object imageFormat) {
    this.imageFormat = imageFormat;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 500 characters.&lt;br/&gt;
   * @return imageReference
  **/
  @JsonProperty("ImageReference")
  @NotNull
  public Object getImageReference() {
    return imageReference;
  }

  public void setImageReference(Object imageReference) {
    this.imageReference = imageReference;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature imageReference(Object imageReference) {
    this.imageReference = imageReference;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature {\n");
    
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    imageFormat: ").append(toIndentedString(imageFormat)).append("\n");
    sb.append("    imageReference: ").append(toIndentedString(imageReference)).append("\n");
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
