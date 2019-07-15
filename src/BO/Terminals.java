package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class Terminals implements java.io.Serializable {

    private String terminalId = "";
    private String locationId = "";
    private String locationName = "";
    private String description = "";
    private String active = "";
    private String terminalType = "";
    private String comments = "";
    private String ramId = "";
    private String cpu = "";
    private String hdCapacityId = "";
    private String operatingSystem = "";
    private String lcdSize = "";
    private String manufacturerId = "";
    private String status = "";
    private String name = "";
    private String reportPath = "";
    private String computerType = "";
    private String departmentId = "";
    private String placementOrderId = "";
    private String hardDiskId = "";
    private String processorId = "";
    private String modelId = "";
    private String numberOfDisk = "";
    private String macAddress = "";

    private String ramDesc = "";
    private String departmentDesc = "";
    private String manufacturerDesc = "";
    private String processorDesc = "";
    private String hardDiskDesc = "";
    private String placementOrderDesc = "";
    private String modelDesc = "";
    private int rowIndex=0;

    private int getRowIndex() {
        return rowIndex;
    }

    private void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getRamId() {
        return ramId;
    }

    public void setRamId(String ramId) {
        this.ramId = ramId;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHdCapacityId() {
        return hdCapacityId;
    }

    public void setHdCapacityId(String hdCapacityId) {
        this.hdCapacityId = hdCapacityId;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getLcdSize() {
        return lcdSize;
    }

    public void setLcdSize(String lcdSize) {
        this.lcdSize = lcdSize;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReportPath() {
        return reportPath;
    }

    public void setReportPath(String reportPath) {
        this.reportPath = reportPath;
    }

    public String getComputerType() {
        return computerType;
    }

    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getPlacementOrderId() {
        return placementOrderId;
    }

    public void setPlacementOrderId(String placementOrderId) {
        this.placementOrderId = placementOrderId;
    }

    public String getHardDiskId() {
        return hardDiskId;
    }

    public void setHardDiskId(String hardDiskId) {
        this.hardDiskId = hardDiskId;
    }

    public String getProcessorId() {
        return processorId;
    }

    public void setProcessorId(String processorId) {
        this.processorId = processorId;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getNumberOfDisk() {
        return numberOfDisk;
    }

    public void setNumberOfDisk(String numberOfDisk) {
        this.numberOfDisk = numberOfDisk;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getRamDesc() {
        return ramDesc;
    }

    public void setRamDesc(String ramDesc) {
        this.ramDesc = ramDesc;
    }

    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public void setDepartmentDesc(String departmentDesc) {
        this.departmentDesc = departmentDesc;
    }

    public String getManufacturerDesc() {
        return manufacturerDesc;
    }

    public void setManufacturerDesc(String manufacturerDesc) {
        this.manufacturerDesc = manufacturerDesc;
    }

    public String getProcessorDesc() {
        return processorDesc;
    }

    public void setProcessorDesc(String processorDesc) {
        this.processorDesc = processorDesc;
    }

    public String getHardDiskDesc() {
        return hardDiskDesc;
    }

    public void setHardDiskDesc(String hardDiskDesc) {
        this.hardDiskDesc = hardDiskDesc;
    }

    public String getPlacementOrderDesc() {
        return placementOrderDesc;
    }

    public void setPlacementOrderDesc(String placementOrderDesc) {
        this.placementOrderDesc = placementOrderDesc;
    }

    public String getModelDesc() {
        return modelDesc;
    }

    public void setModelDesc(String modelDesc) {
        this.modelDesc = modelDesc;
    }
    
    
    
}
