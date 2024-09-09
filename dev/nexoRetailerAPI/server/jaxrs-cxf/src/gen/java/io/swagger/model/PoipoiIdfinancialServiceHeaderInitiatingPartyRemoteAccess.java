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
  * Parameters to communicate with a host.<br/>
 **/
@Schema(description="Parameters to communicate with a host.<br/>")
public class PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess   {
  
  @Schema(description = "Specifies a binary string with a maximum length of 35 binary bytes.<br/>")
 /**
   * Specifies a binary string with a maximum length of 35 binary bytes.<br/>  
  **/
  private Object accessCode = null;
  
  @Schema(required = true, description = "Network addresses of the host.")
 /**
   * Network addresses of the host.  
  **/
  private Object address = null;
  
  @Schema(description = "X.509 Certificate required to authenticate the client.")
 /**
   * X.509 Certificate required to authenticate the client.  
  **/
  private Object clientCertificate = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object securityProfile = null;
  
  @Schema(description = "X.509 Certificate required to authenticate the server.")
 /**
   * X.509 Certificate required to authenticate the server.  
  **/
  private Object serverCertificate = null;
  
  @Schema(description = "Identification of the X.509 Certificates required to authenticate the server, for instance a digest of the certificate.")
 /**
   * Identification of the X.509 Certificates required to authenticate the server, for instance a digest of the certificate.  
  **/
  private Object serverCertificateIdentifier = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object userName = null;
 /**
   * Specifies a binary string with a maximum length of 35 binary bytes.&lt;br/&gt;
   * @return accessCode
  **/
  @JsonProperty("AccessCode")
  @NotNull
  public Object getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(Object accessCode) {
    this.accessCode = accessCode;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess accessCode(Object accessCode) {
    this.accessCode = accessCode;
    return this;
  }

 /**
   * Network addresses of the host.
   * @return address
  **/
  @JsonProperty("Address")
  @NotNull
  public Object getAddress() {
    return address;
  }

  public void setAddress(Object address) {
    this.address = address;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess address(Object address) {
    this.address = address;
    return this;
  }

 /**
   * X.509 Certificate required to authenticate the client.
   * @return clientCertificate
  **/
  @JsonProperty("ClientCertificate")
  @NotNull
  public Object getClientCertificate() {
    return clientCertificate;
  }

  public void setClientCertificate(Object clientCertificate) {
    this.clientCertificate = clientCertificate;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess clientCertificate(Object clientCertificate) {
    this.clientCertificate = clientCertificate;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return securityProfile
  **/
  @JsonProperty("SecurityProfile")
  @NotNull
  public Object getSecurityProfile() {
    return securityProfile;
  }

  public void setSecurityProfile(Object securityProfile) {
    this.securityProfile = securityProfile;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess securityProfile(Object securityProfile) {
    this.securityProfile = securityProfile;
    return this;
  }

 /**
   * X.509 Certificate required to authenticate the server.
   * @return serverCertificate
  **/
  @JsonProperty("ServerCertificate")
  @NotNull
  public Object getServerCertificate() {
    return serverCertificate;
  }

  public void setServerCertificate(Object serverCertificate) {
    this.serverCertificate = serverCertificate;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess serverCertificate(Object serverCertificate) {
    this.serverCertificate = serverCertificate;
    return this;
  }

 /**
   * Identification of the X.509 Certificates required to authenticate the server, for instance a digest of the certificate.
   * @return serverCertificateIdentifier
  **/
  @JsonProperty("ServerCertificateIdentifier")
  @NotNull
  public Object getServerCertificateIdentifier() {
    return serverCertificateIdentifier;
  }

  public void setServerCertificateIdentifier(Object serverCertificateIdentifier) {
    this.serverCertificateIdentifier = serverCertificateIdentifier;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess serverCertificateIdentifier(Object serverCertificateIdentifier) {
    this.serverCertificateIdentifier = serverCertificateIdentifier;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return userName
  **/
  @JsonProperty("UserName")
  @NotNull
  public Object getUserName() {
    return userName;
  }

  public void setUserName(Object userName) {
    this.userName = userName;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess userName(Object userName) {
    this.userName = userName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess {\n");
    
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    clientCertificate: ").append(toIndentedString(clientCertificate)).append("\n");
    sb.append("    securityProfile: ").append(toIndentedString(securityProfile)).append("\n");
    sb.append("    serverCertificate: ").append(toIndentedString(serverCertificate)).append("\n");
    sb.append("    serverCertificateIdentifier: ").append(toIndentedString(serverCertificateIdentifier)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
