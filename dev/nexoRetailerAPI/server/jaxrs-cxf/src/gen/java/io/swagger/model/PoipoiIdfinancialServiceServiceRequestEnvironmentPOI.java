package io.swagger.model;

import io.swagger.model.PoipoiIdfinancialServiceHeaderInitiatingParty;
import io.swagger.model.PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities;
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
  * Point of interaction (POI) performing the transaction.<br/>
 **/
@Schema(description="Point of interaction (POI) performing the transaction.<br/>")
public class PoipoiIdfinancialServiceServiceRequestEnvironmentPOI   {
  
  @Schema(description = "Data related to a component of the POI (Point Of Interaction) performing the transaction.")
 /**
   * Data related to a component of the POI (Point Of Interaction) performing the transaction.  
  **/
  private Object component = null;
  
  @Schema(description = "")
  private PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities capabilities = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 35 characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 35 characters.<br/>  
  **/
  private Object groupIdentification = null;
  
  @Schema(required = true, description = "")
  private PoipoiIdfinancialServiceHeaderInitiatingParty identification = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object systemName = null;
  
  @Schema(description = "Indicates the type of integration of the POI terminal in the sale environment.<br/>- **INDR: Indoor**  : *Indoor terminal.*<br/>- **IPMP: InsidePump**  : *Terminal incorporated in the pump dispensing petrol.*<br/>- **MPOI: MultiplePOITerminal**  : *Multiple terminals linked to a unique sale terminal.*<br/>- **MPMP: MultiplePump**  : *Outdoor terminal serving several petrol pumps.*<br/>- **MSLE: MultipleSaleTerminal**  : *Terminal serving multiple sale terminals.*<br/>- **SSLE: SingleSaleTerminal**  : *Terminal linked to a unique sale terminal.*<br/>- **VNDG: VendingMachine**  : *Terminal integrated in a vending machine.*<br/>")
 /**
   * Indicates the type of integration of the POI terminal in the sale environment.<br/>- **INDR: Indoor**  : *Indoor terminal.*<br/>- **IPMP: InsidePump**  : *Terminal incorporated in the pump dispensing petrol.*<br/>- **MPOI: MultiplePOITerminal**  : *Multiple terminals linked to a unique sale terminal.*<br/>- **MPMP: MultiplePump**  : *Outdoor terminal serving several petrol pumps.*<br/>- **MSLE: MultipleSaleTerminal**  : *Terminal serving multiple sale terminals.*<br/>- **SSLE: SingleSaleTerminal**  : *Terminal linked to a unique sale terminal.*<br/>- **VNDG: VendingMachine**  : *Terminal integrated in a vending machine.*<br/>  
  **/
  private Object terminalIntegration = null;
  
  @Schema(description = "Specifies a character string with a maximum length of 70characters.<br/>")
 /**
   * Specifies a character string with a maximum length of 70characters.<br/>  
  **/
  private Object timeZone = null;
 /**
   * Data related to a component of the POI (Point Of Interaction) performing the transaction.
   * @return component
  **/
  @JsonProperty("Component")
  @NotNull
  public Object getComponent() {
    return component;
  }

  public void setComponent(Object component) {
    this.component = component;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI component(Object component) {
    this.component = component;
    return this;
  }

 /**
   * Get capabilities
   * @return capabilities
  **/
  @JsonProperty("Capabilities")
  @NotNull
  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities capabilities) {
    this.capabilities = capabilities;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI capabilities(PoipoiIdfinancialServiceServiceRequestEnvironmentPOICapabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 35 characters.&lt;br/&gt;
   * @return groupIdentification
  **/
  @JsonProperty("GroupIdentification")
  @NotNull
  public Object getGroupIdentification() {
    return groupIdentification;
  }

  public void setGroupIdentification(Object groupIdentification) {
    this.groupIdentification = groupIdentification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI groupIdentification(Object groupIdentification) {
    this.groupIdentification = groupIdentification;
    return this;
  }

 /**
   * Get identification
   * @return identification
  **/
  @JsonProperty("Identification")
  @NotNull
  public PoipoiIdfinancialServiceHeaderInitiatingParty getIdentification() {
    return identification;
  }

  public void setIdentification(PoipoiIdfinancialServiceHeaderInitiatingParty identification) {
    this.identification = identification;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI identification(PoipoiIdfinancialServiceHeaderInitiatingParty identification) {
    this.identification = identification;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return systemName
  **/
  @JsonProperty("SystemName")
  @NotNull
  public Object getSystemName() {
    return systemName;
  }

  public void setSystemName(Object systemName) {
    this.systemName = systemName;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI systemName(Object systemName) {
    this.systemName = systemName;
    return this;
  }

 /**
   * Indicates the type of integration of the POI terminal in the sale environment.&lt;br/&gt;- **INDR: Indoor**  : *Indoor terminal.*&lt;br/&gt;- **IPMP: InsidePump**  : *Terminal incorporated in the pump dispensing petrol.*&lt;br/&gt;- **MPOI: MultiplePOITerminal**  : *Multiple terminals linked to a unique sale terminal.*&lt;br/&gt;- **MPMP: MultiplePump**  : *Outdoor terminal serving several petrol pumps.*&lt;br/&gt;- **MSLE: MultipleSaleTerminal**  : *Terminal serving multiple sale terminals.*&lt;br/&gt;- **SSLE: SingleSaleTerminal**  : *Terminal linked to a unique sale terminal.*&lt;br/&gt;- **VNDG: VendingMachine**  : *Terminal integrated in a vending machine.*&lt;br/&gt;
   * @return terminalIntegration
  **/
  @JsonProperty("TerminalIntegration")
  @NotNull
  public Object getTerminalIntegration() {
    return terminalIntegration;
  }

  public void setTerminalIntegration(Object terminalIntegration) {
    this.terminalIntegration = terminalIntegration;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI terminalIntegration(Object terminalIntegration) {
    this.terminalIntegration = terminalIntegration;
    return this;
  }

 /**
   * Specifies a character string with a maximum length of 70characters.&lt;br/&gt;
   * @return timeZone
  **/
  @JsonProperty("TimeZone")
  @NotNull
  public Object getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(Object timeZone) {
    this.timeZone = timeZone;
  }

  public PoipoiIdfinancialServiceServiceRequestEnvironmentPOI timeZone(Object timeZone) {
    this.timeZone = timeZone;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
