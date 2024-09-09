package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides all information related to a handwritten signature capture.&lt;br/&gt;
 */
@Schema(description = "Provides all information related to a handwritten signature capture.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature   {
  @JsonProperty("AdditionalInformation")
  private Object additionalInformation = null;

  @JsonProperty("ImageData")
  private Object imageData = null;

  @JsonProperty("ImageFormat")
  private Object imageFormat = null;

  @JsonProperty("ImageReference")
  private Object imageReference = null;

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature additionalInformation(Object additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 140 characters.<br/>
   * @return additionalInformation
   **/
  @Schema(description = "Specifies a character string with a maximum length of 140 characters.<br/>")
      @NotNull

    public Object getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(Object additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature imageData(Object imageData) {
    this.imageData = imageData;
    return this;
  }

  /**
   * Binary data of 2MB maximum.<br/>
   * @return imageData
   **/
  @Schema(description = "Binary data of 2MB maximum.<br/>")
      @NotNull

    public Object getImageData() {
    return imageData;
  }

  public void setImageData(Object imageData) {
    this.imageData = imageData;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature imageFormat(Object imageFormat) {
    this.imageFormat = imageFormat;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return imageFormat
   **/
  @Schema(required = true, description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getImageFormat() {
    return imageFormat;
  }

  public void setImageFormat(Object imageFormat) {
    this.imageFormat = imageFormat;
  }

  public SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature imageReference(Object imageReference) {
    this.imageReference = imageReference;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 500 characters.<br/>
   * @return imageReference
   **/
  @Schema(description = "Specifies a character string with a maximum length of 500 characters.<br/>")
      @NotNull

    public Object getImageReference() {
    return imageReference;
  }

  public void setImageReference(Object imageReference) {
    this.imageReference = imageReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature = (SaleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature) o;
    return Objects.equals(this.additionalInformation, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature.additionalInformation) &&
        Objects.equals(this.imageData, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature.imageData) &&
        Objects.equals(this.imageFormat, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature.imageFormat) &&
        Objects.equals(this.imageReference, saleToPOIServiceResponseV06ServiceResponsePaymentResponseRetailerPaymentResultImageCapturedSignature.imageReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInformation, imageData, imageFormat, imageReference);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
