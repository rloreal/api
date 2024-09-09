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
  * Provides information about the originator. It is present only if required by the key management algorithm.<br/>
 **/
@Schema(description="Provides information about the originator. It is present only if required by the key management algorithm.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation   {
  
  @Schema(description = "It may contain originator certificates associated with several different key management algorithms.")
 /**
   * It may contain originator certificates associated with several different key management algorithms.  
  **/
  private Object certificate = null;
 /**
   * It may contain originator certificates associated with several different key management algorithms.
   * @return certificate
  **/
  @JsonProperty("Certificate")
  @NotNull
  public Object getCertificate() {
    return certificate;
  }

  public void setCertificate(Object certificate) {
    this.certificate = certificate;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation certificate(Object certificate) {
    this.certificate = certificate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentCardProtectedCardDataEnvelopedDataOriginatorInformation {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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
