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
  * Parameters associated to a cryptographic encryption algorithm.<br/>
 **/
@Schema(description="Parameters associated to a cryptographic encryption algorithm.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter   {
  
  @Schema(description = "Byte padding for a cypher block chaining mode encryption, if the padding is not implicit.<br/>- **LNGT: LengthPadding**  : *Message to encrypt is completed by a byte value containing the total number of added bytes.*<br/>- **NUL8: Null80Padding**  : *Message to encrypt is completed by one bit of value 1, followed by null bits until the encryption block length is reached.*<br/>- **NULG: NullLengthPadding**  : *Message to encrypt is completed by null byte values, the last byte containing the total number of added bytes.*<br/>- **NULL: NullPadding**  : *Message to encrypt is completed by null bytes.*<br/>- **RAND: RandomPadding**  : *Message to encrypt is completed by random value, the last byte containing the total number of added bytes.*<br/>")
 /**
   * Byte padding for a cypher block chaining mode encryption, if the padding is not implicit.<br/>- **LNGT: LengthPadding**  : *Message to encrypt is completed by a byte value containing the total number of added bytes.*<br/>- **NUL8: Null80Padding**  : *Message to encrypt is completed by one bit of value 1, followed by null bits until the encryption block length is reached.*<br/>- **NULG: NullLengthPadding**  : *Message to encrypt is completed by null byte values, the last byte containing the total number of added bytes.*<br/>- **NULL: NullPadding**  : *Message to encrypt is completed by null bytes.*<br/>- **RAND: RandomPadding**  : *Message to encrypt is completed by random value, the last byte containing the total number of added bytes.*<br/>  
  **/
  private Object bytePadding = null;
  
  @Schema(description = "Specifies a binary string with a maximum length of 500 binary bytes.<br/>")
 /**
   * Specifies a binary string with a maximum length of 500 binary bytes.<br/>  
  **/
  private Object initialisationVector = null;
  
  @Schema(description = "Format of data before encryption, if the format is not plaintext or implicit.<br/>- **TR31: TR31**  : *Format of a cryptographic key specified by the ANSI X9 TR-31 standard.*<br/>- **TR34: TR34**  : *Format of a cryptographic key specified by the ANSI X9 TR-34 standard.*<br/>- **I238: ISO20038KeyWrap**  : *Format of a cryptographic key specified by the ISO20038 standard.*<br/>")
 /**
   * Format of data before encryption, if the format is not plaintext or implicit.<br/>- **TR31: TR31**  : *Format of a cryptographic key specified by the ANSI X9 TR-31 standard.*<br/>- **TR34: TR34**  : *Format of a cryptographic key specified by the ANSI X9 TR-34 standard.*<br/>- **I238: ISO20038KeyWrap**  : *Format of a cryptographic key specified by the ISO20038 standard.*<br/>  
  **/
  private Object encryptionFormat = null;
 /**
   * Byte padding for a cypher block chaining mode encryption, if the padding is not implicit.&lt;br/&gt;- **LNGT: LengthPadding**  : *Message to encrypt is completed by a byte value containing the total number of added bytes.*&lt;br/&gt;- **NUL8: Null80Padding**  : *Message to encrypt is completed by one bit of value 1, followed by null bits until the encryption block length is reached.*&lt;br/&gt;- **NULG: NullLengthPadding**  : *Message to encrypt is completed by null byte values, the last byte containing the total number of added bytes.*&lt;br/&gt;- **NULL: NullPadding**  : *Message to encrypt is completed by null bytes.*&lt;br/&gt;- **RAND: RandomPadding**  : *Message to encrypt is completed by random value, the last byte containing the total number of added bytes.*&lt;br/&gt;
   * @return bytePadding
  **/
  @JsonProperty("BytePadding")
  @NotNull
  public Object getBytePadding() {
    return bytePadding;
  }

  public void setBytePadding(Object bytePadding) {
    this.bytePadding = bytePadding;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter bytePadding(Object bytePadding) {
    this.bytePadding = bytePadding;
    return this;
  }

 /**
   * Specifies a binary string with a maximum length of 500 binary bytes.&lt;br/&gt;
   * @return initialisationVector
  **/
  @JsonProperty("InitialisationVector")
  @NotNull
  public Object getInitialisationVector() {
    return initialisationVector;
  }

  public void setInitialisationVector(Object initialisationVector) {
    this.initialisationVector = initialisationVector;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter initialisationVector(Object initialisationVector) {
    this.initialisationVector = initialisationVector;
    return this;
  }

 /**
   * Format of data before encryption, if the format is not plaintext or implicit.&lt;br/&gt;- **TR31: TR31**  : *Format of a cryptographic key specified by the ANSI X9 TR-31 standard.*&lt;br/&gt;- **TR34: TR34**  : *Format of a cryptographic key specified by the ANSI X9 TR-34 standard.*&lt;br/&gt;- **I238: ISO20038KeyWrap**  : *Format of a cryptographic key specified by the ISO20038 standard.*&lt;br/&gt;
   * @return encryptionFormat
  **/
  @JsonProperty("EncryptionFormat")
  @NotNull
  public Object getEncryptionFormat() {
    return encryptionFormat;
  }

  public void setEncryptionFormat(Object encryptionFormat) {
    this.encryptionFormat = encryptionFormat;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter encryptionFormat(Object encryptionFormat) {
    this.encryptionFormat = encryptionFormat;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter {\n");
    
    sb.append("    bytePadding: ").append(toIndentedString(bytePadding)).append("\n");
    sb.append("    initialisationVector: ").append(toIndentedString(initialisationVector)).append("\n");
    sb.append("    encryptionFormat: ").append(toIndentedString(encryptionFormat)).append("\n");
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
