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

public class FileRecord implements java.io.Serializable {

    private String roomId = "";
    private String rackId = "";
    private String shelfId = "";
    private String fileId = "";

    private String roomDescription = "";
    private String rackDescription = "";
    private String shelfDescription = "";

    private String patientId = "";
    private String patientName = "";
    private String patientActive = "";

    private String status = "";

    private String roomActive = "";
    private String rackActive = "";
    private String shelfActive = "";
    private String fileActive = "";

    private String crtdBy = "";
    private String crtdDate = "";
    private String crtdTerminal = "";

    private String uptdBy = "";
    private String uptdDate = "";
    private String uptdTerminal = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
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

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
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

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRoomActive() {
        return roomActive;
    }

    public void setRoomActive(String roomActive) {
        this.roomActive = roomActive;
    }

    public String getRackActive() {
        return rackActive;
    }

    public void setRackActive(String rackActive) {
        this.rackActive = rackActive;
    }

    public String getShelfActive() {
        return shelfActive;
    }

    public void setShelfActive(String shelfActive) {
        this.shelfActive = shelfActive;
    }

    public String getFileActive() {
        return fileActive;
    }

    public void setFileActive(String fileActive) {
        this.fileActive = fileActive;
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientActive() {
        return patientActive;
    }

    public void setPatientActive(String patientActive) {
        this.patientActive = patientActive;
    }

}
