package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Parameters to communicate with a host.&lt;br/&gt;
 */
@Schema(description = "Parameters to communicate with a host.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess   {
  @JsonProperty("AccessCode")
  private Object accessCode = null;

  @JsonProperty("Address")
  private Object address = null;

  @JsonProperty("ClientCertificate")
  private Object clientCertificate = null;

  @JsonProperty("SecurityProfile")
  private Object securityProfile = null;

  @JsonProperty("ServerCertificate")
  private Object serverCertificate = null;

  @JsonProperty("ServerCertificateIdentifier")
  private Object serverCertificateIdentifier = null;

  @JsonProperty("UserName")
  private Object userName = null;

  public PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess accessCode(Object accessCode) {
    this.accessCode = accessCode;
    return this;
  }

  /**
   * Specifies a binary string with a maximum length of 35 binary bytes.<br/>
   * @return accessCode
   **/
  @Schema(description = "Specifies a binary string with a maximum length of 35 binary bytes.<br/>")
      @NotNull

    public Object getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(Object accessCode) {
    this.accessCode = accessCode;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess address(Object address) {
    this.address = address;
    return this;
  }

  /**
   * Network addresses of the host.
   * @return address
   **/
  @Schema(required = true, description = "Network addresses of the host.")
      @NotNull

    public Object getAddress() {
    return address;
  }

  public void setAddress(Object address) {
    this.address = address;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess clientCertificate(Object clientCertificate) {
    this.clientCertificate = clientCertificate;
    return this;
  }

  /**
   * X.509 Certificate required to authenticate the client.
   * @return clientCertificate
   **/
  @Schema(description = "X.509 Certificate required to authenticate the client.")
      @NotNull

    public Object getClientCertificate() {
    return clientCertificate;
  }

  public void setClientCertificate(Object clientCertificate) {
    this.clientCertificate = clientCertificate;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess securityProfile(Object securityProfile) {
    this.securityProfile = securityProfile;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return securityProfile
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getSecurityProfile() {
    return securityProfile;
  }

  public void setSecurityProfile(Object securityProfile) {
    this.securityProfile = securityProfile;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess serverCertificate(Object serverCertificate) {
    this.serverCertificate = serverCertificate;
    return this;
  }

  /**
   * X.509 Certificate required to authenticate the server.
   * @return serverCertificate
   **/
  @Schema(description = "X.509 Certificate required to authenticate the server.")
      @NotNull

    public Object getServerCertificate() {
    return serverCertificate;
  }

  public void setServerCertificate(Object serverCertificate) {
    this.serverCertificate = serverCertificate;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess serverCertificateIdentifier(Object serverCertificateIdentifier) {
    this.serverCertificateIdentifier = serverCertificateIdentifier;
    return this;
  }

  /**
   * Identification of the X.509 Certificates required to authenticate the server, for instance a digest of the certificate.
   * @return serverCertificateIdentifier
   **/
  @Schema(description = "Identification of the X.509 Certificates required to authenticate the server, for instance a digest of the certificate.")
      @NotNull

    public Object getServerCertificateIdentifier() {
    return serverCertificateIdentifier;
  }

  public void setServerCertificateIdentifier(Object serverCertificateIdentifier) {
    this.serverCertificateIdentifier = serverCertificateIdentifier;
  }

  public PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess userName(Object userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return userName
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getUserName() {
    return userName;
  }

  public void setUserName(Object userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess poipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess = (PoipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess) o;
    return Objects.equals(this.accessCode, poipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess.accessCode) &&
        Objects.equals(this.address, poipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess.address) &&
        Objects.equals(this.clientCertificate, poipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess.clientCertificate) &&
        Objects.equals(this.securityProfile, poipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess.securityProfile) &&
        Objects.equals(this.serverCertificate, poipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess.serverCertificate) &&
        Objects.equals(this.serverCertificateIdentifier, poipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess.serverCertificateIdentifier) &&
        Objects.equals(this.userName, poipoiIdfinancialServiceHeaderInitiatingPartyRemoteAccess.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCode, address, clientCertificate, securityProfile, serverCertificate, serverCertificateIdentifier, userName);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
