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
  * Barcode content to display or print.<br/>
 **/
@Schema(description="Barcode content to display or print.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode   {
  
  @Schema(required = true, description = "Type of BarCode coding.<br/>- **COQR: BarcodeEncodedAs2DQRCode**  : *Barcode encoded according to the 2Dimensions Quick Response Code Standard.*<br/>- **C128: BarcodeEncodedAsCode128**  : *Barcode encoded according to the Code 128 standard.*<br/>- **C025: BarcodeEncodedAsCode25**  : *Barcode encoded according to the Code 25 standard.*<br/>- **C039: BarcodeEncodedAsCode39**  : *Barcode encoded according to the Code 39 standard.*<br/>- **EA13: BarcodeEncodedAsEA13**  : *Barcode encoded according to the EAN13 standard.*<br/>- **EAN8: BarcodeEncodedAsEAN8**  : *Barcode encoded according to the EAN8 standard.*<br/>- **P417: BarcodeEncodedAsPDF417**  : *Barcode encoded according to the PDF417 standard.*<br/>- **UPCA: BarcodeEncodedAsUPCA**  : *Barcode encoded according to the UPCA standard.*<br/>")
 /**
   * Type of BarCode coding.<br/>- **COQR: BarcodeEncodedAs2DQRCode**  : *Barcode encoded according to the 2Dimensions Quick Response Code Standard.*<br/>- **C128: BarcodeEncodedAsCode128**  : *Barcode encoded according to the Code 128 standard.*<br/>- **C025: BarcodeEncodedAsCode25**  : *Barcode encoded according to the Code 25 standard.*<br/>- **C039: BarcodeEncodedAsCode39**  : *Barcode encoded according to the Code 39 standard.*<br/>- **EA13: BarcodeEncodedAsEA13**  : *Barcode encoded according to the EAN13 standard.*<br/>- **EAN8: BarcodeEncodedAsEAN8**  : *Barcode encoded according to the EAN8 standard.*<br/>- **P417: BarcodeEncodedAsPDF417**  : *Barcode encoded according to the PDF417 standard.*<br/>- **UPCA: BarcodeEncodedAsUPCA**  : *Barcode encoded according to the UPCA standard.*<br/>  
  **/
  private Object barcodeType = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 8000 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 8000 characters.<br/>  
  **/
  private Object barcodeValue = null;
  
  @Schema(description = "Specifies a binary string with a maximum length of 3000 binary bytes.<br/>")
 /**
   * Specifies a binary string with a maximum length of 3000 binary bytes.<br/>  
  **/
  private Object qrCodeBinaryValue = null;
  
  @Schema(description = "Error Correction mode of Quick Response Code.<br/>- **M015: ErrorCorrection15Percent**  : *Reed-Solomon error correction 15%*<br/>- **Q025: ErrorCorrection25Percent**  : *Reed-Solomon error correction 25%*<br/>- **H030: ErrorCorrection30Percent**  : *Reed-Solomon error correction 30%*<br/>- **L007: ErrorCorrection7Percent**  : *Reed-Solomon error correction  7%*<br/>")
 /**
   * Error Correction mode of Quick Response Code.<br/>- **M015: ErrorCorrection15Percent**  : *Reed-Solomon error correction 15%*<br/>- **Q025: ErrorCorrection25Percent**  : *Reed-Solomon error correction 25%*<br/>- **H030: ErrorCorrection30Percent**  : *Reed-Solomon error correction 30%*<br/>- **L007: ErrorCorrection7Percent**  : *Reed-Solomon error correction  7%*<br/>  
  **/
  private Object qrCodeErrorCorrection = null;
  
  @Schema(description = "Encoding Mode of Quick Response Code.<br/>- **ALFA: Alphanumeric**  : *Alphanumeric value provided in Barcode field.*<br/>- **BINA: Binary**  : *Binary value provided in Quick Response Code Binary Value.*<br/>- **KANJ: Kanji**  : *Kanji value provided in Quick Response Code Binary Value.*<br/>- **NUME: Numeric**  : *Numeric value provided in Barcode field.*<br/>")
 /**
   * Encoding Mode of Quick Response Code.<br/>- **ALFA: Alphanumeric**  : *Alphanumeric value provided in Barcode field.*<br/>- **BINA: Binary**  : *Binary value provided in Quick Response Code Binary Value.*<br/>- **KANJ: Kanji**  : *Kanji value provided in Quick Response Code Binary Value.*<br/>- **NUME: Numeric**  : *Numeric value provided in Barcode field.*<br/>  
  **/
  private Object qrCodeEncodingMode = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 16 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 16 characters.<br/>  
  **/
  private Object qrCodeVersion = null;
 /**
   * Type of BarCode coding.&lt;br/&gt;- **COQR: BarcodeEncodedAs2DQRCode**  : *Barcode encoded according to the 2Dimensions Quick Response Code Standard.*&lt;br/&gt;- **C128: BarcodeEncodedAsCode128**  : *Barcode encoded according to the Code 128 standard.*&lt;br/&gt;- **C025: BarcodeEncodedAsCode25**  : *Barcode encoded according to the Code 25 standard.*&lt;br/&gt;- **C039: BarcodeEncodedAsCode39**  : *Barcode encoded according to the Code 39 standard.*&lt;br/&gt;- **EA13: BarcodeEncodedAsEA13**  : *Barcode encoded according to the EAN13 standard.*&lt;br/&gt;- **EAN8: BarcodeEncodedAsEAN8**  : *Barcode encoded according to the EAN8 standard.*&lt;br/&gt;- **P417: BarcodeEncodedAsPDF417**  : *Barcode encoded according to the PDF417 standard.*&lt;br/&gt;- **UPCA: BarcodeEncodedAsUPCA**  : *Barcode encoded according to the UPCA standard.*&lt;br/&gt;
   * @return barcodeType
  **/
  @JsonProperty("BarcodeType")
  @NotNull
  public Object getBarcodeType() {
    return barcodeType;
  }

  public void setBarcodeType(Object barcodeType) {
    this.barcodeType = barcodeType;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode barcodeType(Object barcodeType) {
    this.barcodeType = barcodeType;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 8000 characters.&lt;br/&gt;
   * @return barcodeValue
  **/
  @JsonProperty("BarcodeValue")
  @NotNull
  public Object getBarcodeValue() {
    return barcodeValue;
  }

  public void setBarcodeValue(Object barcodeValue) {
    this.barcodeValue = barcodeValue;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode barcodeValue(Object barcodeValue) {
    this.barcodeValue = barcodeValue;
    return this;
  }

 /**
   * Specifies a binary string with a maximum length of 3000 binary bytes.&lt;br/&gt;
   * @return qrCodeBinaryValue
  **/
  @JsonProperty("QRCodeBinaryValue")
  @NotNull
  public Object getQrCodeBinaryValue() {
    return qrCodeBinaryValue;
  }

  public void setQrCodeBinaryValue(Object qrCodeBinaryValue) {
    this.qrCodeBinaryValue = qrCodeBinaryValue;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode qrCodeBinaryValue(Object qrCodeBinaryValue) {
    this.qrCodeBinaryValue = qrCodeBinaryValue;
    return this;
  }

 /**
   * Error Correction mode of Quick Response Code.&lt;br/&gt;- **M015: ErrorCorrection15Percent**  : *Reed-Solomon error correction 15%*&lt;br/&gt;- **Q025: ErrorCorrection25Percent**  : *Reed-Solomon error correction 25%*&lt;br/&gt;- **H030: ErrorCorrection30Percent**  : *Reed-Solomon error correction 30%*&lt;br/&gt;- **L007: ErrorCorrection7Percent**  : *Reed-Solomon error correction  7%*&lt;br/&gt;
   * @return qrCodeErrorCorrection
  **/
  @JsonProperty("QRCodeErrorCorrection")
  @NotNull
  public Object getQrCodeErrorCorrection() {
    return qrCodeErrorCorrection;
  }

  public void setQrCodeErrorCorrection(Object qrCodeErrorCorrection) {
    this.qrCodeErrorCorrection = qrCodeErrorCorrection;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode qrCodeErrorCorrection(Object qrCodeErrorCorrection) {
    this.qrCodeErrorCorrection = qrCodeErrorCorrection;
    return this;
  }

 /**
   * Encoding Mode of Quick Response Code.&lt;br/&gt;- **ALFA: Alphanumeric**  : *Alphanumeric value provided in Barcode field.*&lt;br/&gt;- **BINA: Binary**  : *Binary value provided in Quick Response Code Binary Value.*&lt;br/&gt;- **KANJ: Kanji**  : *Kanji value provided in Quick Response Code Binary Value.*&lt;br/&gt;- **NUME: Numeric**  : *Numeric value provided in Barcode field.*&lt;br/&gt;
   * @return qrCodeEncodingMode
  **/
  @JsonProperty("QRCodeEncodingMode")
  @NotNull
  public Object getQrCodeEncodingMode() {
    return qrCodeEncodingMode;
  }

  public void setQrCodeEncodingMode(Object qrCodeEncodingMode) {
    this.qrCodeEncodingMode = qrCodeEncodingMode;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode qrCodeEncodingMode(Object qrCodeEncodingMode) {
    this.qrCodeEncodingMode = qrCodeEncodingMode;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 16 characters.&lt;br/&gt;
   * @return qrCodeVersion
  **/
  @JsonProperty("QRCodeVersion")
  @NotNull
  public Object getQrCodeVersion() {
    return qrCodeVersion;
  }

  public void setQrCodeVersion(Object qrCodeVersion) {
    this.qrCodeVersion = qrCodeVersion;
  }

  public PoipoiIdfinancialServiceServiceRequestEnableServiceRequestDisplayOutputOutputBarcode qrCodeVersion(Object qrCodeVersion) {
    this.qrCodeVersion = qrCodeVersion;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
