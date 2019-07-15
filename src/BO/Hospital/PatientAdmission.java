/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.Hospital;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class PatientAdmission implements java.io.Serializable {

    private String patientId = "    ";
    private String fullName = "";
    private String genderId = "";
    private String patientStatusId = "";
    private String genderDescription = "";
    private String age = "";
    private String completeOrderNo = "";
    private String orderDetailId = "";
    private String orderStatusId = "";
    private String admissionNo = " ";
    private String GARequired = "N";
    private String wardNo = "";
    private String bedNo = "";
    private String bedCharges = "";
    private String visitCPTId = "";
    private String cptId = "";
    private String cptDescription = "";
    private String primaryPhysicianName = "";
    private String referringPhysicianName = "";
    private String primaryPhysicianId = "";
    private String attendingPhysicianName = "";
    private String attendingPhysicianId = "";
    private String isSaved = "";
    private String admissionProposedDate = "";
    private String surgeryDate = "";
    private String isDischarge = "";
    private String minimumAdvance = "";
    private String admittedBy = "";
    private String admittedDate = "";
    private String locationId = "";
    private String crtdBy = "";
    private String crtdDate = "";
    private String crtdTerminalId = "";
    private String clientId = "";
    private String clientName = "";
    private String clientTransactionType = "";
    private String wardDescription = "";
    private String bedDescription = "";
    private String orderStatusDescription = "";
    private String requestedName = "";

    private String transferDate = "";
    private String totalDays = "";
    private String admissionTypeId = "";
    private String admissionTypeDescription = "";

    //attribute of previous Bo
    private String consultancyId = "";
    private String referringPhysicianId = "";

    private String roomTypeId = "";
    private String roomTypeDescription = "";

    private String statusId = "";
    private String statusDescription = "";
    private String statusDetailId = "";
    private String statusDetailDescription = "";

    private String requestedBy = "";
    private String requestedDate = "";
    private String requestedTerminalId = "";
    private String admittedTerminalId = "";
    private String dischargeBy = "";
    private String dischargeId = "";
    private String dischargeDate = "";
    private String dischargeTerminalId = "";
    private String cancelBy = "";
    private String cancelDate = "";
    private String cancelTerminalId = "";
    private String admissionRemarks = "";
    private String dischargeTypeId = "";
    private String dischargeRemarks = "";
    private String dischargeCertificate = "";
    private String admissionDiagnosis = "";
    private String diagnosisRemarks = "";
    private String diagnosisDescription = "";
    private String dischargeTypeDescription = "";
    private String displayDischargeDate = "";
    private String orderBy = "";
    private String orderDate = "";
    private String customerId = "";
    private String pharmacyCredit = "";
    private String diagnosticCredit = "";
    private String pharmacyService = "";
    private int rowIndex = 0;

    public String getPharmacyCredit() {
        return pharmacyCredit;
    }

    public void setPharmacyCredit(String pharmacyCredit) {
        this.pharmacyCredit = pharmacyCredit;
    }

    public String getDiagnosticCredit() {
        return diagnosticCredit;
    }

    public void setDiagnosticCredit(String diagnosticCredit) {
        this.diagnosticCredit = diagnosticCredit;
    }

    public String getPharmacyService() {
        return pharmacyService;
    }

    public void setPharmacyService(String pharmacyService) {
        this.pharmacyService = pharmacyService;
    }

    public String getDisplayDischargeDate() {
        return displayDischargeDate;
    }

    public void setDisplayDischargeDate(String displayDischargeDate) {
        this.displayDischargeDate = displayDischargeDate;
    }

    public String getDischargeTypeDescription() {
        return dischargeTypeDescription;
    }

    public void setDischargeTypeDescription(String dischargeTypeDescription) {
        this.dischargeTypeDescription = dischargeTypeDescription;
    }

    public String getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }

    public String getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(String totalDays) {
        this.totalDays = totalDays;
    }

    public String getDiagnosisDescription() {
        return diagnosisDescription;
    }

    public void setDiagnosisDescription(String diagnosisDescription) {
        this.diagnosisDescription = diagnosisDescription;
    }

    public String getGARequired() {
        return GARequired;
    }

    public void setGARequired(String GARequired) {
        this.GARequired = GARequired;
    }

    public String getDischargeTypeId() {
        return dischargeTypeId;
    }

    public void setDischargeTypeId(String dischargeTypeId) {
        this.dischargeTypeId = dischargeTypeId;
    }

    public String getAdmissionDiagnosis() {
        return admissionDiagnosis;
    }

    public void setAdmissionDiagnosis(String admissionDiagnosisId) {
        this.admissionDiagnosis = admissionDiagnosisId;
    }

    public String getDiagnosisRemarks() {
        return diagnosisRemarks;
    }

    public void setDiagnosisRemarks(String diagnosisRemarks) {
        this.diagnosisRemarks = diagnosisRemarks;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDischargeRemarks() {
        return dischargeRemarks;
    }

    public void setDischargeRemarks(String dischargeRemarks) {
        this.dischargeRemarks = dischargeRemarks;
    }

    public String getDischargeCertificate() {
        return dischargeCertificate;
    }

    public void setDischargeCertificate(String dischargeCertificate) {
        this.dischargeCertificate = dischargeCertificate;
    }

    public String getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomTypeDescription() {
        return roomTypeDescription;
    }

    public void setRoomTypeDescription(String roomTypeDescription) {
        this.roomTypeDescription = roomTypeDescription;
    }

    public String getBedCharges() {
        return bedCharges;
    }

    public void setBedCharges(String bedCharges) {
        this.bedCharges = bedCharges;
    }

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

    public String getPatientStatusId() {
        return patientStatusId;
    }

    public void setPatientStatusId(String patientStatusId) {
        this.patientStatusId = patientStatusId;
    }

    public String getGenderId() {
        return genderId;
    }

    public String getAdmissionTypeId() {
        return admissionTypeId;
    }

    public void setAdmissionTypeId(String admissionTypeId) {
        this.admissionTypeId = admissionTypeId;
    }

    public String getAdmissionTypeDescription() {
        return admissionTypeDescription;
    }

    public void setAdmissionTypeDescription(String admissionTypeDescription) {
        this.admissionTypeDescription = admissionTypeDescription;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    public String getGenderDescription() {
        return genderDescription;
    }

    public void setGenderDescription(String genderDescription) {
        this.genderDescription = genderDescription;
    }

    public String getAttendingPhysicianName() {
        return attendingPhysicianName;
    }

    public void setAttendingPhysicianName(String attendingPhysicianName) {
        this.attendingPhysicianName = attendingPhysicianName;

    }

    public String getAttendingPhysicianId() {
        return attendingPhysicianId;
    }

    public void setAttendingPhysicianId(String attendingPhysicianId) {
        this.attendingPhysicianId = attendingPhysicianId;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCompleteOrderNo() {
        return completeOrderNo;
    }

    public void setCompleteOrderNo(String completeOrderNo) {
        this.completeOrderNo = completeOrderNo;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getWardNo() {
        return wardNo;
    }

    public void setWardNo(String wardNo) {
        this.wardNo = wardNo;
    }

    public String getVisitCPTId() {
        return visitCPTId;
    }

    public void setVisitCPTId(String visitCPTId) {
        this.visitCPTId = visitCPTId;
    }

    public String getCptDescription() {
        return cptDescription;
    }

    public void setCptDescription(String cptDescription) {
        this.cptDescription = cptDescription;
    }

    
    
    public String getCptId() {
        return cptId;
    }

    public void setCptId(String cptId) {
        this.cptId = cptId;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getPrimaryPhysicianName() {
        return primaryPhysicianName;
    }

    public void setPrimaryPhysicianName(String primaryPhysicianName) {
        this.primaryPhysicianName = primaryPhysicianName;
    }

    public String getReferringPhysicianName() {
        return referringPhysicianName;
    }

    public void setReferringPhysicianName(String referringPhysicianName) {
        this.referringPhysicianName = referringPhysicianName;
    }

    public String getPrimaryPhysicianId() {
        return primaryPhysicianId;
    }

    public void setPrimaryPhysicianId(String primaryPhysicianId) {
        this.primaryPhysicianId = primaryPhysicianId;
    }

    public String getIsSaved() {
        return isSaved;
    }

    public void setIsSaved(String isSaved) {
        this.isSaved = isSaved;
    }

    public String getIsDischarge() {
        return isDischarge;
    }

    public void setIsDischarge(String isDischarge) {
        this.isDischarge = isDischarge;
    }

    public String getAdmissionProposedDate() {
        return admissionProposedDate;
    }

    public void setAdmissionProposedDate(String admissionProposedDate) {
        this.admissionProposedDate = admissionProposedDate;
    }

    public String getSurgeryDate() {
        return surgeryDate;
    }

    public void setSurgeryDate(String surgeryDate) {
        this.surgeryDate = surgeryDate;
    }

    public String getAdmittedBy() {
        return admittedBy;
    }

    public void setAdmittedBy(String admittedBy) {
        this.admittedBy = admittedBy;
    }

    public String getAdmittedDate() {
        return admittedDate;
    }

    public void setAdmittedDate(String admittedDate) {
        this.admittedDate = admittedDate;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
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

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientTransactionType() {
        return clientTransactionType;
    }

    public void setClientTransactionType(String clientTransactionType) {
        this.clientTransactionType = clientTransactionType;
    }

    public String getWardDescription() {
        return wardDescription;
    }

    public void setWardDescription(String wardDescription) {
        this.wardDescription = wardDescription;
    }

    public String getBedDescription() {
        return bedDescription;
    }

    public void setBedDescription(String bedDescription) {
        this.bedDescription = bedDescription;
    }

    public String getOrderStatusDescription() {
        return orderStatusDescription;
    }

    public void setOrderStatusDescription(String orderStatusDescription) {
        this.orderStatusDescription = orderStatusDescription;
    }

    public String getConsultancyId() {
        return consultancyId;
    }

    public void setConsultancyId(String consultancyId) {
        this.consultancyId = consultancyId;
    }

    public String getReferringPhysicianId() {
        return referringPhysicianId;
    }

    public void setReferringPhysicianId(String referringPhysicianId) {
        this.referringPhysicianId = referringPhysicianId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getStatusDetailId() {
        return statusDetailId;
    }

    public void setStatusDetailId(String statusDetailId) {
        this.statusDetailId = statusDetailId;
    }

    public String getStatusDetailDescription() {
        return statusDetailDescription;
    }

    public void setStatusDetailDescription(String statusDetailDescription) {
        this.statusDetailDescription = statusDetailDescription;
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

    public String getRequestedTerminalId() {
        return requestedTerminalId;
    }

    public void setRequestedTerminalId(String requestedTerminalId) {
        this.requestedTerminalId = requestedTerminalId;
    }

    public String getAdmittedTerminalId() {
        return admittedTerminalId;
    }

    public void setAdmittedTerminalId(String admittedTerminalId) {
        this.admittedTerminalId = admittedTerminalId;
    }

    public String getDischargeBy() {
        return dischargeBy;
    }

    public void setDischargeBy(String dischargeBy) {
        this.dischargeBy = dischargeBy;
    }

    public String getDischargeId() {
        return dischargeId;
    }

    public void setDischargeId(String dischargeId) {
        this.dischargeId = dischargeId;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getDischargeTerminalId() {
        return dischargeTerminalId;
    }

    public void setDischargeTerminalId(String dischargeTerminalId) {
        this.dischargeTerminalId = dischargeTerminalId;
    }

    public String getCancelBy() {
        return cancelBy;
    }

    public void setCancelBy(String cancelBy) {
        this.cancelBy = cancelBy;
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getCancelTerminalId() {
        return cancelTerminalId;
    }

    public void setCancelTerminalId(String cancelTerminalId) {
        this.cancelTerminalId = cancelTerminalId;
    }

    public String getAdmissionRemarks() {
        return admissionRemarks;
    }

    public void setAdmissionRemarks(String admissionRemarks) {
        this.admissionRemarks = admissionRemarks;
    }

    public String getRequestedName() {
        return requestedName;
    }

    public void setRequestedName(String requestedName) {
        this.requestedName = requestedName;
    }

    public String getMinimumAdvance() {
        return minimumAdvance;
    }

    public void setMinimumAdvance(String minimumAdvance) {
        this.minimumAdvance = minimumAdvance;
    }

    
}
