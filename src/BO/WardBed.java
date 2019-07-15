/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;


/**
 *
 * @author Pacslink
 */

public class WardBed implements java.io.Serializable {

    private String wardId = "";
    private String wardDescription = "";
    private String bedId = "";
    private String bedDescription = "";
    private String bedCharges = "";
    private String locationId = "";
    private String locDescription = "";
    private String departmentId = "";
    private String deptDescription = "";

    private String availableBeds = "0";
    private String totalBeds = "0";
    private String allocatedBeds = "0";

    private String active = "";
    private String createdBy = "";
    private String createdDate = "";
    private String createdTerminalId = "";
    private String updatedBy = "";
    private String updatedDate = "";
    private String updatedTerminalId = "";
    private int rowIndex;
    private String cptId = "";
    private String cptDescription = "";

    public String getCptDescription() {
        return cptDescription;
    }

    public void setCptDescription(String cptDescription) {
        this.cptDescription = cptDescription;
    }
    private String minimumAdvance = "";

    public String getCptId() {
        return cptId;
    }

    public void setCptId(String cptId) {
        this.cptId = cptId;
    }

    public String getMinimumAdvance() {
        return minimumAdvance;
    }

    public void setMinimumAdvance(String minimumAdvance) {
        this.minimumAdvance = minimumAdvance;
    }
    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getWardId() {
        return wardId;
    }

    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    public String getLocationId() {
        return locationId;
    }

    public String getAvailableBeds() {
        return availableBeds;
    }

    public void setAvailableBeds(String availableBeds) {
        this.availableBeds = availableBeds;
    }

    public String getTotalBeds() {
        return totalBeds;
    }

    public void setTotalBeds(String totalBeds) {
        this.totalBeds = totalBeds;
    }

    public String getAllocatedBeds() {
        return allocatedBeds;
    }

    public void setAllocatedBeds(String allocatedBeds) {
        this.allocatedBeds = allocatedBeds;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getWardDescription() {
        return wardDescription;
    }

    public void setWardDescription(String wardDescription) {
        this.wardDescription = wardDescription;
    }

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId;
    }

    public String getBedDescription() {
        return bedDescription;
    }

    public void setBedDescription(String bedDescription) {
        this.bedDescription = bedDescription;
    }

    public String getBedCharges() {
        return bedCharges;
    }

    public void setBedCharges(String bedCharges) {
        this.bedCharges = bedCharges;
    }

    public String getLocDescription() {
        return locDescription;
    }

    public void setLocDescription(String locDescription) {
        this.locDescription = locDescription;
    }

    public String getDeptDescription() {
        return deptDescription;
    }

    public void setDeptDescription(String deptDescription) {
        this.deptDescription = deptDescription;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedTerminalId() {
        return createdTerminalId;
    }

    public void setCreatedTerminalId(String createdTerminalId) {
        this.createdTerminalId = createdTerminalId;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedTerminalId() {
        return updatedTerminalId;
    }

    public void setUpdatedTerminalId(String updatedTerminalId) {
        this.updatedTerminalId = updatedTerminalId;
    }
}
