/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class FileRecordRequest implements java.io.Serializable {

    private String fileRecordId = "";

    private String patientId = "";
    private String patientName = "";
    private String oldMRNO = "";
    private String patientDOB = "";
    private String patientGender = "";
    private String contactNo = "";

    private String locationId = "";
    private String departmentId = "";

    private String roomId = "";
    private String rackId = "";
    private String shelfId = "";

    private String roomDescription = "";
    private String rackDescription = "";
    private String shelfDescription = "";

    private String status = "";
    private String statusId = "";

    private String consultantId = "";
    private String consultantName = "";
    private String visitDate = "";
    private String visitStatus = "";

    
    private String crtdBy = "";
    private String crtdDate = "";
    private String crtdTerminal = "";

    private String uptdBy = "";
    private String uptdDate = "";
    private String uptdTerminal = "";

    private String requestedBy = "";
    private String requestedDate = "";
    private String requestedLocationId = "";

    private String locationType = "";

    private String CPTDescription = "";
    private int rowIndex;

    public String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }

    
    
    public String getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(String consultantId) {
        this.consultantId = consultantId;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getVisitStatus() {
        return visitStatus;
    }

    public void setVisitStatus(String visitStatus) {
        this.visitStatus = visitStatus;
    }

    
    
    
    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getOldMRNO() {
        return oldMRNO;
    }

    public void setOldMRNO(String oldMRNO) {
        this.oldMRNO = oldMRNO;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getLocationId() {
        return locationId;
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

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRackId() {
        return rackId;
    }

    public void setRackId(String rackId) {
        this.rackId = rackId;
    }

    public String getShelfId() {
        return shelfId;
    }

    public void setShelfId(String shelfId) {
        this.shelfId = shelfId;
    }

    public String getCrtdBy() {
        return crtdBy;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }

    public String getCrtdDate() {
        return crtdDate;
    }

    public void setCrtdDate(String crtdDate) {
        this.crtdDate = crtdDate;
    }

    public String getCrtdTerminal() {
        return crtdTerminal;
    }

    public void setCrtdTerminal(String crtdTerminal) {
        this.crtdTerminal = crtdTerminal;
    }

    public String getUptdBy() {
        return uptdBy;
    }

    public void setUptdBy(String uptdBy) {
        this.uptdBy = uptdBy;
    }

    public String getUptdDate() {
        return uptdDate;
    }

    public void setUptdDate(String uptdDate) {
        this.uptdDate = uptdDate;
    }

    public String getUptdTerminal() {
        return uptdTerminal;
    }

    public void setUptdTerminal(String uptdTerminal) {
        this.uptdTerminal = uptdTerminal;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFileRecordId() {
        return fileRecordId;
    }

    public void setFileRecordId(String fileRecordId) {
        this.fileRecordId = fileRecordId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientDOB() {
        return patientDOB;
    }

    public void setPatientDOB(String patientDOB) {
        this.patientDOB = patientDOB;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getRequestedLocationId() {
        return requestedLocationId;
    }

    public void setRequestedLocationId(String requestedLocationId) {
        this.requestedLocationId = requestedLocationId;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getCPTDescription() {
        return CPTDescription;
    }

    public void setCPTDescription(String CPTDescription) {
        this.CPTDescription = CPTDescription;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public String getRackDescription() {
        return rackDescription;
    }

    public void setRackDescription(String rackDescription) {
        this.rackDescription = rackDescription;
    }

    public String getShelfDescription() {
        return shelfDescription;
    }

    public void setShelfDescription(String shelfDescription) {
        this.shelfDescription = shelfDescription;
    }

}
