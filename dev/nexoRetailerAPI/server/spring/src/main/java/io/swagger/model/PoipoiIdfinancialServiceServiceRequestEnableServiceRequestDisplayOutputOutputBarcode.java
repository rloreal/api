package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Barcode content to display or print.&lt;br/&gt;
 */
@Schema(description = "Barcode content to display or print.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode   {
  @JsonProperty("BarcodeType")
  private Object barcodeType = null;

  @JsonProperty("BarcodeValue")
  private Object barcodeValue = null;

  @JsonProperty("QRCodeBinaryValue")
  private Object qrCodeBinaryValue = null;

  @JsonProperty("QRCodeErrorCorrection")
  private Object qrCodeErrorCorrection = null;

  @JsonProperty("QRCodeEncodingMode")
  private Object qrCodeEncodingMode = null;

  @JsonProperty("QRCodeVersion")
  private Object qrCodeVersion = null;

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode barcodeType(Object barcodeType) {
    this.barcodeType = barcodeType;
    return this;
  }

  /**
   * Type of BarCode coding.<br/>- **COQR: BarcodeEncodedAs2DQRCode**  : *Barcode encoded according to the 2Dimensions Quick Response Code Standard.*<br/>- **C128: BarcodeEncodedAsCode128**  : *Barcode encoded according to the Code 128 standard.*<br/>- **C025: BarcodeEncodedAsCode25**  : *Barcode encoded according to the Code 25 standard.*<br/>- **C039: BarcodeEncodedAsCode39**  : *Barcode encoded according to the Code 39 standard.*<br/>- **EA13: BarcodeEncodedAsEA13**  : *Barcode encoded according to the EAN13 standard.*<br/>- **EAN8: BarcodeEncodedAsEAN8**  : *Barcode encoded according to the EAN8 standard.*<br/>- **P417: BarcodeEncodedAsPDF417**  : *Barcode encoded according to the PDF417 standard.*<br/>- **UPCA: BarcodeEncodedAsUPCA**  : *Barcode encoded according to the UPCA standard.*<br/>
   * @return barcodeType
   **/
  @Schema(required = true, description = "Type of BarCode coding.<br/>- **COQR: BarcodeEncodedAs2DQRCode**  : *Barcode encoded according to the 2Dimensions Quick Response Code Standard.*<br/>- **C128: BarcodeEncodedAsCode128**  : *Barcode encoded according to the Code 128 standard.*<br/>- **C025: BarcodeEncodedAsCode25**  : *Barcode encoded according to the Code 25 standard.*<br/>- **C039: BarcodeEncodedAsCode39**  : *Barcode encoded according to the Code 39 standard.*<br/>- **EA13: BarcodeEncodedAsEA13**  : *Barcode encoded according to the EAN13 standard.*<br/>- **EAN8: BarcodeEncodedAsEAN8**  : *Barcode encoded according to the EAN8 standard.*<br/>- **P417: BarcodeEncodedAsPDF417**  : *Barcode encoded according to the PDF417 standard.*<br/>- **UPCA: BarcodeEncodedAsUPCA**  : *Barcode encoded according to the UPCA standard.*<br/>")
      @NotNull

    public Object getBarcodeType() {
    return barcodeType;
  }

  public void setBarcodeType(Object barcodeType) {
    this.barcodeType = barcodeType;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode barcodeValue(Object barcodeValue) {
    this.barcodeValue = barcodeValue;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 8000 characters.<br/>
   * @return barcodeValue
   **/
  @Schema(description = "Specifies a character string with a maximum length of 8000 characters.<br/>")
      @NotNull

    public Object getBarcodeValue() {
    return barcodeValue;
  }

  public void setBarcodeValue(Object barcodeValue) {
    this.barcodeValue = barcodeValue;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode qrCodeBinaryValue(Object qrCodeBinaryValue) {
    this.qrCodeBinaryValue = qrCodeBinaryValue;
    return this;
  }

  /**
   * Specifies a binary string with a maximum length of 3000 binary bytes.<br/>
   * @return qrCodeBinaryValue
   **/
  @Schema(description = "Specifies a binary string with a maximum length of 3000 binary bytes.<br/>")
      @NotNull

    public Object getQrCodeBinaryValue() {
    return qrCodeBinaryValue;
  }

  public void setQrCodeBinaryValue(Object qrCodeBinaryValue) {
    this.qrCodeBinaryValue = qrCodeBinaryValue;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode qrCodeErrorCorrection(Object qrCodeErrorCorrection) {
    this.qrCodeErrorCorrection = qrCodeErrorCorrection;
    return this;
  }

  /**
   * Error Correction mode of Quick Response Code.<br/>- **M015: ErrorCorrection15Percent**  : *Reed-Solomon error correction 15%*<br/>- **Q025: ErrorCorrection25Percent**  : *Reed-Solomon error correction 25%*<br/>- **H030: ErrorCorrection30Percent**  : *Reed-Solomon error correction 30%*<br/>- **L007: ErrorCorrection7Percent**  : *Reed-Solomon error correction  7%*<br/>
   * @return qrCodeErrorCorrection
   **/
  @Schema(description = "Error Correction mode of Quick Response Code.<br/>- **M015: ErrorCorrection15Percent**  : *Reed-Solomon error correction 15%*<br/>- **Q025: ErrorCorrection25Percent**  : *Reed-Solomon error correction 25%*<br/>- **H030: ErrorCorrection30Percent**  : *Reed-Solomon error correction 30%*<br/>- **L007: ErrorCorrection7Percent**  : *Reed-Solomon error correction  7%*<br/>")
      @NotNull

    public Object getQrCodeErrorCorrection() {
    return qrCodeErrorCorrection;
  }

  public void setQrCodeErrorCorrection(Object qrCodeErrorCorrection) {
    this.qrCodeErrorCorrection = qrCodeErrorCorrection;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode qrCodeEncodingMode(Object qrCodeEncodingMode) {
    this.qrCodeEncodingMode = qrCodeEncodingMode;
    return this;
  }

  /**
   * Encoding Mode of Quick Response Code.<br/>- **ALFA: Alphanumeric**  : *Alphanumeric value provided in Barcode field.*<br/>- **BINA: Binary**  : *Binary value provided in Quick Response Code Binary Value.*<br/>- **KANJ: Kanji**  : *Kanji value provided in Quick Response Code Binary Value.*<br/>- **NUME: Numeric**  : *Numeric value provided in Barcode field.*<br/>
   * @return qrCodeEncodingMode
   **/
  @Schema(description = "Encoding Mode of Quick Response Code.<br/>- **ALFA: Alphanumeric**  : *Alphanumeric value provided in Barcode field.*<br/>- **BINA: Binary**  : *Binary value provided in Quick Response Code Binary Value.*<br/>- **KANJ: Kanji**  : *Kanji value provided in Quick Response Code Binary Value.*<br/>- **NUME: Numeric**  : *Numeric value provided in Barcode field.*<br/>")
      @NotNull

    public Object getQrCodeEncodingMode() {
    return qrCodeEncodingMode;
  }

  public void setQrCodeEncodingMode(Object qrCodeEncodingMode) {
    this.qrCodeEncodingMode = qrCodeEncodingMode;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode qrCodeVersion(Object qrCodeVersion) {
    this.qrCodeVersion = qrCodeVersion;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 16 characters.<br/>
   * @return qrCodeVersion
   **/
  @Schema(description = "Specifies a character string with a maximum length of 16 characters.<br/>")
      @NotNull

    public Object getQrCodeVersion() {
    return qrCodeVersion;
  }

  public void setQrCodeVersion(Object qrCodeVersion) {
    this.qrCodeVersion = qrCodeVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode poipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode = (PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode) o;
    return Objects.equals(this.barcodeType, poipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode.barcodeType) &&
        Objects.equals(this.barcodeValue, poipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode.barcodeValue) &&
        Objects.equals(this.qrCodeBinaryValue, poipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode.qrCodeBinaryValue) &&
        Objects.equals(this.qrCodeErrorCorrection, poipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode.qrCodeErrorCorrection) &&
        Objects.equals(this.qrCodeEncodingMode, poipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode.qrCodeEncodingMode) &&
        Objects.equals(this.qrCodeVersion, poipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode.qrCodeVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodeType, barcodeValue, qrCodeBinaryValue, qrCodeErrorCorrection, qrCodeEncodingMode, qrCodeVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode {\n");
    
    sb.append("    barcodeType: ").append(toIndentedString(barcodeType)).append("\n");
    sb.append("    barcodeValue: ").append(toIndentedString(barcodeValue)).append("\n");
    sb.append("    qrCodeBinaryValue: ").append(toIndentedString(qrCodeBinaryValue)).append("\n");
    sb.append("    qrCodeErrorCorrection: ").append(toIndentedString(qrCodeErrorCorrection)).append("\n");
    sb.append("    qrCodeEncodingMode: ").append(toIndentedString(qrCodeEncodingMode)).append("\n");
    sb.append("    qrCodeVersion: ").append(toIndentedString(qrCodeVersion)).append("\n");
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
