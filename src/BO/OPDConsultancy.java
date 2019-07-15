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

public class OPDConsultancy implements java.io.Serializable {

    private String teethRemarks = "";
    private String patientId = "";
    private String orderNo = "";
    private String patientName = "";
    private String contactNo = "";
    private String cnicNo = "";
    private String patientStatusId = "";
    private String genderId = "";
    private String gender = "";
    private String age = "";
    private String dob = "";
    private String clinicalHistory = "";
    private String modality = "";
    private String appointmentStatus = "";
    private String physicianNotes = "";
    private String clinicId = "";
    private String clinicDescription = "";
    private String specialityId = "";
    private String specialityDecription = "";
    private String isEncounter = "N";
    private String isAdmissionRequest = "N";
    private String packageCptId = "";
    private String packageCptDescription = "";
    
    //Nutritionist Consultancy
    private String performedBy = "";
    private String performedDate = "";
    private String performedTerminalId = "";
    private String nutritionistNotes = "";
    private String fromDate = "";
    private String toDate = "";
    private String nutritionConsultancyId = "";
    private String statusDescription = "";
    private String crtdBy = "";
    private String crtdDate = "";
    private String crtdTerminalId = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    public String getPerformedDate() {
        return performedDate;
    }

    public void setPerformedDate(String performedDate) {
        this.performedDate = performedDate;
    }

    public String getPerformedTerminalId() {
        return performedTerminalId;
    }

    public void setPerformedTerminalId(String performedTerminalId) {
        this.performedTerminalId = performedTerminalId;
    }

    public String getNutritionistNotes() {
        return nutritionistNotes;
    }

    public void setNutritionistNotes(String nutritionistNotes) {
        this.nutritionistNotes = nutritionistNotes;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getCnicNo() {
        return cnicNo;
    }

    public void setCnicNo(String cnicNo) {
        this.cnicNo = cnicNo;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getNutritionConsultancyId() {
        return nutritionConsultancyId;
    }

    public void setNutritionConsultancyId(String nutritionConsultancyId) {
        this.nutritionConsultancyId = nutritionConsultancyId;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
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

    public OPDConsultancy() {
    }

    public String getIsAdmissionRequest() {
        return isAdmissionRequest;
    }

    public void setIsAdmissionRequest(String isAdmissionRequest) {
        this.isAdmissionRequest = isAdmissionRequest;
    }

    public String getTeethRemarks() {
        return teethRemarks;
    }

    public void setTeethRemarks(String teethRemarks) {
        this.teethRemarks = teethRemarks;
    }

    public String getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(String specialityId) {
        this.specialityId = specialityId;
    }

    public String getSpecialityDecription() {
        return specialityDecription;
    }

    public void setSpecialityDecription(String specialityDecription) {
        this.specialityDecription = specialityDecription;
    }

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }

    public String getClinicDescription() {
        return clinicDescription;
    }

    public void setClinicDescription(String clinicDescription) {
        this.clinicDescription = clinicDescription;
    }

    public String getPhysicianNotes() {
        return physicianNotes;
    }

    public void setPhysicianNotes(String physicianNotes) {
        this.physicianNotes = physicianNotes;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public String getClinicalHistory() {
        return clinicalHistory;
    }

    public void setClinicalHistory(String clinicalHistory) {
        this.clinicalHistory = clinicalHistory;
    }
    private String departmentId = "";
    private String departmentDescription = "";
    private String sectionId = "";
    private String imagingNo = "";
    private String cptId = "";
    private String cpt = "";
    private String consultantName = "";
    private String sampleStatusDescription = "";
    private String consultancyDate = "";
    private String studyPath = "";
    private String completeOrderNo = "";
    private String medicineCompleteOrderNo = "";
    private String admissionNumber = "";
    private String admissionDate = "";

    private String scanDate = "";
    private String sampleStatusId = "";
    private String accessionNumber = "         ";
    private String orderStatusId = "";
    private String locationId = "";
    private String locationDescription = "";
    private String clientId = "";
    private String clientName = "";

    private String procedureNotes = "COMMENTS";
    private String consultantId = "CONCLUSION";
    private String searchFromDate = "";
    private String searchToDate = "";
    private String searchResult = "";
    private String searchConclusion = "";
    private String advised = "";
    private String orderLocation = "";
    private String orderDetailId = "";
    private String urgent = "N";
    private String consultancyId = "";
    private String referredBy = "";
    private String reportName = "";
    private String referredID = "";
    private String instructions = "";
    private String invoiceNo = "";

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getMedicineCompleteOrderNo() {
        return medicineCompleteOrderNo;
    }

    public void setMedicineCompleteOrderNo(String medicineCompleteOrderNo) {
        this.medicineCompleteOrderNo = medicineCompleteOrderNo;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getImagingNo() {
        return imagingNo;
    }

    public void setImagingNo(String imagingNo) {
        this.imagingNo = imagingNo;
    }

    public String getPackageCptId() {
        return packageCptId;
    }

    public void setPackageCptId(String packageCptId) {
        this.packageCptId = packageCptId;
    }

    public String getPackageCptDescription() {
        return packageCptDescription;
    }

    public void setPackageCptDescription(String packageCptDescription) {
        this.packageCptDescription = packageCptDescription;
    }

    
    
    
    
    public String getCptId() {
        return cptId;
    }

    public void setCptId(String cptId) {
        this.cptId = cptId;
    }

    public String getCpt() {
        return cpt;
    }

    public void setCpt(String cpt) {
        this.cpt = cpt;
    }

    public String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }

    public String getSampleStatusDescription() {
        return sampleStatusDescription;
    }

    public void setSampleStatusDescription(String sampleStatusDescription) {
        this.sampleStatusDescription = sampleStatusDescription;
    }

    public String getConsultancyDate() {
        return consultancyDate;
    }

    public void setConsultancyDate(String consultancyDate) {
        this.consultancyDate = consultancyDate;
    }

    public String getStudyPath() {
        return studyPath;
    }

    public void setStudyPath(String studyPath) {
        this.studyPath = studyPath;
    }

    public String getCompleteOrderNo() {
        return completeOrderNo;
    }

    public void setCompleteOrderNo(String completeOrderNo) {
        this.completeOrderNo = completeOrderNo;
    }

    public String getScanDate() {
        return scanDate;
    }

    public void setScanDate(String scanDate) {
        this.scanDate = scanDate;
    }

    public String getSampleStatusId() {
        return sampleStatusId;
    }

    public void setSampleStatusId(String sampleStatusId) {
        this.sampleStatusId = sampleStatusId;
    }

    public String getAccessionNumber() {
        return accessionNumber;
    }

    public void setAccessionNumber(String accessionNumber) {
        this.accessionNumber = accessionNumber;
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getProcedureNotes() {
        return procedureNotes;
    }

    public void setProcedureNotes(String procedureNotes) {
        this.procedureNotes = procedureNotes;
    }

    public String getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(String consultantId) {
        this.consultantId = consultantId;
    }

    public String getSearchFromDate() {
        return searchFromDate;
    }

    public void setSearchFromDate(String searchFromDate) {
        this.searchFromDate = searchFromDate;
    }

    public String getSearchToDate() {
        return searchToDate;
    }

    public void setSearchToDate(String searchToDate) {
        this.searchToDate = searchToDate;
    }

    public String getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(String searchResult) {
        this.searchResult = searchResult;
    }

    public String getSearchConclusion() {
        return searchConclusion;
    }

    public void setSearchConclusion(String searchConclusion) {
        this.searchConclusion = searchConclusion;
    }

    public String getAdvised() {
        return advised;
    }

    public void setAdvised(String advised) {
        this.advised = advised;
    }

    public String getOrderLocation() {
        return orderLocation;
    }

    public void setOrderLocation(String orderLocation) {
        this.orderLocation = orderLocation;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent;
    }

    public String getConsultancyId() {
        return consultancyId;
    }

    public void setConsultancyId(String consultancyId) {
        this.consultancyId = consultancyId;
    }

    public String getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(String referredBy) {
        this.referredBy = referredBy;
    }

    public String getReferredID() {
        return referredID;
    }

    public void setReferredID(String referredID) {
        this.referredID = referredID;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getIsEncounter() {
        return isEncounter;
    }

    public void setIsEncounter(String isEncounter) {
        this.isEncounter = isEncounter;
    }

    public String getPatientStatusId() {
        return patientStatusId;
    }

    public void setPatientStatusId(String patientStatusId) {
        this.patientStatusId = patientStatusId;
    }

}
