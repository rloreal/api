package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Parameters associated to a cryptographic encryption algorithm.&lt;br/&gt;
 */
@Schema(description = "Parameters associated to a cryptographic encryption algorithm.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter   {
  @JsonProperty("BytePadding")
  private Object bytePadding = null;

  @JsonProperty("InitialisationVector")
  private Object initialisationVector = null;

  @JsonProperty("EncryptionFormat")
  private Object encryptionFormat = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter bytePadding(Object bytePadding) {
    this.bytePadding = bytePadding;
    return this;
  }

  /**
   * Byte padding for a cypher block chaining mode encryption, if the padding is not implicit.<br/>- **LNGT: LengthPadding**  : *Message to encrypt is completed by a byte value containing the total number of added bytes.*<br/>- **NUL8: Null80Padding**  : *Message to encrypt is completed by one bit of value 1, followed by null bits until the encryption block length is reached.*<br/>- **NULG: NullLengthPadding**  : *Message to encrypt is completed by null byte values, the last byte containing the total number of added bytes.*<br/>- **NULL: NullPadding**  : *Message to encrypt is completed by null bytes.*<br/>- **RAND: RandomPadding**  : *Message to encrypt is completed by random value, the last byte containing the total number of added bytes.*<br/>
   * @return bytePadding
   **/
  @Schema(description = "Byte padding for a cypher block chaining mode encryption, if the padding is not implicit.<br/>- **LNGT: LengthPadding**  : *Message to encrypt is completed by a byte value containing the total number of added bytes.*<br/>- **NUL8: Null80Padding**  : *Message to encrypt is completed by one bit of value 1, followed by null bits until the encryption block length is reached.*<br/>- **NULG: NullLengthPadding**  : *Message to encrypt is completed by null byte values, the last byte containing the total number of added bytes.*<br/>- **NULL: NullPadding**  : *Message to encrypt is completed by null bytes.*<br/>- **RAND: RandomPadding**  : *Message to encrypt is completed by random value, the last byte containing the total number of added bytes.*<br/>")
      @NotNull

    public Object getBytePadding() {
    return bytePadding;
  }

  public void setBytePadding(Object bytePadding) {
    this.bytePadding = bytePadding;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter initialisationVector(Object initialisationVector) {
    this.initialisationVector = initialisationVector;
    return this;
  }

  /**
   * Specifies a binary string with a maximum length of 500 binary bytes.<br/>
   * @return initialisationVector
   **/
  @Schema(description = "Specifies a binary string with a maximum length of 500 binary bytes.<br/>")
      @NotNull

    public Object getInitialisationVector() {
    return initialisationVector;
  }

  public void setInitialisationVector(Object initialisationVector) {
    this.initialisationVector = initialisationVector;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter encryptionFormat(Object encryptionFormat) {
    this.encryptionFormat = encryptionFormat;
    return this;
  }

  /**
   * Format of data before encryption, if the format is not plaintext or implicit.<br/>- **TR31: TR31**  : *Format of a cryptographic key specified by the ANSI X9 TR-31 standard.*<br/>- **TR34: TR34**  : *Format of a cryptographic key specified by the ANSI X9 TR-34 standard.*<br/>- **I238: ISO20038KeyWrap**  : *Format of a cryptographic key specified by the ISO20038 standard.*<br/>
   * @return encryptionFormat
   **/
  @Schema(description = "Format of data before encryption, if the format is not plaintext or implicit.<br/>- **TR31: TR31**  : *Format of a cryptographic key specified by the ANSI X9 TR-31 standard.*<br/>- **TR34: TR34**  : *Format of a cryptographic key specified by the ANSI X9 TR-34 standard.*<br/>- **I238: ISO20038KeyWrap**  : *Format of a cryptographic key specified by the ISO20038 standard.*<br/>")
      @NotNull

    public Object getEncryptionFormat() {
    return encryptionFormat;
  }

  public void setEncryptionFormat(Object encryptionFormat) {
    this.encryptionFormat = encryptionFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter = (PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter) o;
    return Objects.equals(this.bytePadding, poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter.bytePadding) &&
        Objects.equals(this.initialisationVector, poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter.initialisationVector) &&
        Objects.equals(this.encryptionFormat, poipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataEncryptedContentContentEncryptionAlgorithmParameter.encryptionFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytePadding, initialisationVector, encryptionFormat);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
