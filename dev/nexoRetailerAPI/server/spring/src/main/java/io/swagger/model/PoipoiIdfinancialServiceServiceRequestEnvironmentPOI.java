package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PoipoiIdfinancialServiceHeaderInitiatingParty;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Point of interaction (POI) performing the transaction.&lt;br/&gt;
 */
@Schema(description = "Point of interaction (POI) performing the transaction.<br/>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-09T13:39:46.374215189+02:00[Europe/Paris]")


public class PoipoiIdfinancialServiceServiceRequestEnvironmentPOI   {
  @JsonProperty("Component")
  private Object component = null;

  @JsonProperty("Capabilities")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities capabilities = null;

  @JsonProperty("GroupIdentification")
  private Object groupIdentification = null;

  @JsonProperty("Identification")
  private PoipoiIdfinancialServiceHeaderInitiatingParty identification = null;

  @JsonProperty("SystemName")
  private Object systemName = null;

  @JsonProperty("TerminalIntegration")
  private Object terminalIntegration = null;

  @JsonProperty("TimeZone")
  private Object timeZone = null;

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI component(Object component) {
    this.component = component;
    return this;
  }

  /**
   * Data related to a component of the POI (Point Of Interaction) performing the transaction.
   * @return component
   **/
  @Schema(description = "Data related to a component of the POI (Point Of Interaction) performing the transaction.")
      @NotNull

    public Object getComponent() {
    return component;
  }

  public void setComponent(Object component) {
    this.component = component;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI capabilities(PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  /**
   * Get capabilities
   * @return capabilities
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities capabilities) {
    this.capabilities = capabilities;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI groupIdentification(Object groupIdentification) {
    this.groupIdentification = groupIdentification;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 35 characters.<br/>
   * @return groupIdentification
   **/
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
      @NotNull

    public Object getGroupIdentification() {
    return groupIdentification;
  }

  public void setGroupIdentification(Object groupIdentification) {
    this.groupIdentification = groupIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI identification(PoipoiIdfinancialServiceHeaderInitiatingParty identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PoipoiIdfinancialServiceHeaderInitiatingParty getIdentification() {
    return identification;
  }

  public void setIdentification(PoipoiIdfinancialServiceHeaderInitiatingParty identification) {
    this.identification = identification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI systemName(Object systemName) {
    this.systemName = systemName;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return systemName
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getSystemName() {
    return systemName;
  }

  public void setSystemName(Object systemName) {
    this.systemName = systemName;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI terminalIntegration(Object terminalIntegration) {
    this.terminalIntegration = terminalIntegration;
    return this;
  }

  /**
   * Indicates the type of integration of the POI terminal in the sale environment.<br/>- **INDR: Indoor**  : *Indoor terminal.*<br/>- **IPMP: InsidePump**  : *Terminal incorporated in the pump dispensing petrol.*<br/>- **MPOI: MultiplePOITerminal**  : *Multiple terminals linked to a unique sale terminal.*<br/>- **MPMP: MultiplePump**  : *Outdoor terminal serving several petrol pumps.*<br/>- **MSLE: MultipleSaleTerminal**  : *Terminal serving multiple sale terminals.*<br/>- **SSLE: SingleSaleTerminal**  : *Terminal linked to a unique sale terminal.*<br/>- **VNDG: VendingMachine**  : *Terminal integrated in a vending machine.*<br/>
   * @return terminalIntegration
   **/
  @Schema(description = "Indicates the type of integration of the POI terminal in the sale environment.<br/>- **INDR: Indoor**  : *Indoor terminal.*<br/>- **IPMP: InsidePump**  : *Terminal incorporated in the pump dispensing petrol.*<br/>- **MPOI: MultiplePOITerminal**  : *Multiple terminals linked to a unique sale terminal.*<br/>- **MPMP: MultiplePump**  : *Outdoor terminal serving several petrol pumps.*<br/>- **MSLE: MultipleSaleTerminal**  : *Terminal serving multiple sale terminals.*<br/>- **SSLE: SingleSaleTerminal**  : *Terminal linked to a unique sale terminal.*<br/>- **VNDG: VendingMachine**  : *Terminal integrated in a vending machine.*<br/>")
      @NotNull

    public Object getTerminalIntegration() {
    return terminalIntegration;
  }

  public void setTerminalIntegration(Object terminalIntegration) {
    this.terminalIntegration = terminalIntegration;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI timeZone(Object timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 70characters.<br/>
   * @return timeZone
   **/
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
      @NotNull

    public Object getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(Object timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoipoiIdfinancialServiceServiceRequestEnvironmentPOI poipoiIdfinancialServiceServiceRequestEnvironmentPOI = (PoipoiIdfinancialServiceServiceRequestEnvironmentPOI) o;
    return Objects.equals(this.component, poipoiIdfinancialServiceServiceRequestEnvironmentPOI.component) &&
        Objects.equals(this.capabilities, poipoiIdfinancialServiceServiceRequestEnvironmentPOI.capabilities) &&
        Objects.equals(this.groupIdentification, poipoiIdfinancialServiceServiceRequestEnvironmentPOI.groupIdentification) &&
        Objects.equals(this.identification, poipoiIdfinancialServiceServiceRequestEnvironmentPOI.identification) &&
        Objects.equals(this.systemName, poipoiIdfinancialServiceServiceRequestEnvironmentPOI.systemName) &&
        Objects.equals(this.terminalIntegration, poipoiIdfinancialServiceServiceRequestEnvironmentPOI.terminalIntegration) &&
        Objects.equals(this.timeZone, poipoiIdfinancialServiceServiceRequestEnvironmentPOI.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, capabilities, groupIdentification, identification, systemName, terminalIntegration, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoipoiIdfinancialServiceServiceRequestEnvironmentPOI {\n");
    
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    groupIdentification: ").append(toIndentedString(groupIdentification)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
    sb.append("    terminalIntegration: ").append(toIndentedString(terminalIntegration)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
