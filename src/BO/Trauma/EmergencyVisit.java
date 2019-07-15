/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.Trauma;

public class EmergencyVisit {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private String patientId;
    private String fullName;
    private String age;
    private String genderId;
    private String gender;
    private String contactNo;
    public  String dischargeTypeId = "";
    private String orderStatusId;
    private String mlcStatus;
    private String emergencyUnit;
    private String temperature;
    private String pulse;
    private String patientVisitId;
    private String fbs;
    private String rbs;
    private String systolic;
    private String diastolic;
    private String complaints;
    private String treatment;
    private String transferredBy;
    private String transferredDate;
    private String transferredTerminalId;
    private String isVitalFinal;
    private String vitalFinalBy;
    private String vitalFinalDate;
    private String vitalFinalTerminalId;
    private String comments;
    private String mlcBy;
    private String mlcDate;
    private String mlcTerminalId;
    private String crtdBy;
    private String crtdDate;
    private String crtdTerminalId;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

  public String getDischargeTypeId() {
        return dischargeTypeId;
    }

    public void setDischargeTypeId(String dischargeTypeId) {
        this.dischargeTypeId = dischargeTypeId;
    }
    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getMlcStatus() {
        return mlcStatus;
    }

    public void setMlcStatus(String mlcStatus) {
        this.mlcStatus = mlcStatus;
    }

    public String getEmergencyUnit() {
        return emergencyUnit;
    }

    public void setEmergencyUnit(String emergencyUnit) {
        this.emergencyUnit = emergencyUnit;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getPatientVisitId() {
        return patientVisitId;
    }

    public void setPatientVisitId(String patientVisitId) {
        this.patientVisitId = patientVisitId;
    }

    public String getFbs() {
        return fbs;
    }

    public void setFbs(String fbs) {
        this.fbs = fbs;
    }

    public String getRbs() {
        return rbs;
    }

    public void setRbs(String rbs) {
        this.rbs = rbs;
    }

    public String getSystolic() {
        return systolic;
    }

    public void setSystolic(String systolic) {
        this.systolic = systolic;
    }

    public String getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(String diastolic) {
        this.diastolic = diastolic;
    }

    public String getComplaints() {
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getTransferredBy() {
        return transferredBy;
    }

    public void setTransferredBy(String transferredBy) {
        this.transferredBy = transferredBy;
    }

    public String getTransferredDate() {
        return transferredDate;
    }

    public void setTransferredDate(String transferredDate) {
        this.transferredDate = transferredDate;
    }

    public String getTransferredTerminalId() {
        return transferredTerminalId;
    }

    public void setTransferredTerminalId(String transferredTerminalId) {
        this.transferredTerminalId = transferredTerminalId;
    }

    public String getIsVitalFinal() {
        return isVitalFinal;
    }

    public void setIsVitalFinal(String isVitalFinal) {
        this.isVitalFinal = isVitalFinal;
    }

    public String getVitalFinalBy() {
        return vitalFinalBy;
    }

    public void setVitalFinalBy(String vitalFinalBy) {
        this.vitalFinalBy = vitalFinalBy;
    }

    public String getVitalFinalDate() {
        return vitalFinalDate;
    }

    public void setVitalFinalDate(String vitalFinalDate) {
        this.vitalFinalDate = vitalFinalDate;
    }

    public String getVitalFinalTerminalId() {
        return vitalFinalTerminalId;
    }

    public void setVitalFinalTerminalId(String vitalFinalTerminalId) {
        this.vitalFinalTerminalId = vitalFinalTerminalId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getMlcBy() {
        return mlcBy;
    }

    public void setMlcBy(String mlcBy) {
        this.mlcBy = mlcBy;
    }

    public String getMlcDate() {
        return mlcDate;
    }

    public void setMlcDate(String mlcDate) {
        this.mlcDate = mlcDate;
    }

    public String getMlcTerminalId() {
        return mlcTerminalId;
    }

    public void setMlcTerminalId(String mlcTerminalId) {
        this.mlcTerminalId = mlcTerminalId;
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

    public String getCrtdTerminalId() {
        return crtdTerminalId;
    }

    public void setCrtdTerminalId(String crtdTerminalId) {
        this.crtdTerminalId = crtdTerminalId;
    }

    
}
