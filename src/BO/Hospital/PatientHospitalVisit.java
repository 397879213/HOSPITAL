package BO.Hospital;

public class PatientHospitalVisit implements java.io.Serializable {

    private String teethRemarks = "";
    private String patientId = "";
    private String orderNo = "";
    private String patientName = "";
    private String contactNo = "";
    private String tokenNo = "";
    private String cnicNo = "";
    private String patientStatusId = "";
    private String genderId = "";
    private String gender = "";
    private String city = "";
    private String PLNO = "";
    private String age = "";
    private String dob = "";
    private String admissionNo = "";
    private String storeId = "";
    private String clinicalHistory = "";
    private String modality = "";
    private String appointmentStatus = "";
    private String physicianNotes = "";
    private String clinicId = "";
    private String clinicDescription = "";
    private String clinicExamination = " ";
    private String specialityId = "";
    private String specialityDecription = "";
    private String isEncounter = "N";
    private String isAdmissionRequest = "N";
    private String packageCptId = "";
    private String packageCptDescription = "";
    private String nextVisitDate = "";

    private String dischargeCertificate = "";
    private String admissionDiagnosis = "";
    private String diagnosisRemarks = "";
    private String diagnosisDescription = "";
    private String dischargeTypeDescription = "";
    private String displayDischargeDate = "";
    private String orderBy = "";
    private String orderDate = "";
    private String pharmacyCredit = "Y";
    private String diagnosticCredit = "N";
    private String pharmacyService = "";
    private String GARequired = "N";
    private String wardNo = "0";
    private String bedNo = "0";
    private String patientTypeId = "";
    private String patientType = "";
    private String currentWardNo = "0";
    private String currentBedNo = "0";
    private String vsil = "0";
    private String bedCharges = "";

    private String genderDescription = "";
    private String hbsag = "";
    private String antiHcv = "";
    private String visitCPTId = "";
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
    private String clientTransactionType = "";
    private String wardDescription = "";
    private String wardClientId = "";
    private String bedDescription = "";
    private String patientContactNo = "";
    private String patientCNIC = "";
    private String orderStatusDescription = "";
    private String requestedName = "";
    private String transferDate = "";
    private String totalDays = "";
    private String admissionTypeId = "";
    private String admissionTypeDescription = "";
    private String admissionRemarks = "";

    //attribute of previous Bo
    private String referringPhysicianId = "";
    private String roomTypeId = "";
    private String roomTypeDescription = "";
    private String statusDetailId = "";
    private String statusDetailDescription = "";
    private String requestedBy = "";
    private String requestedDate = "";
    private String requestedTerminalId = "";
    private String admittedTerminalId = "";
    private String dischargeBy = "";
    private String dischargeId = "";
    private String dischargeDate = "";
    private String dischargeRemarks = "";
    private String originalDischargeTime = "";

    private String otherInfo = "";

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
    private String advised = " ";
    private String orderLocation = "";
    private String ODI = "1";
    private String urgent = "N";
    private String consultancyId = "";
    private String referredBy = "";
    private String reportName = "";
    private String referredID = "";
    private String instructions = "";
    private String invoiceNo = "";

    private String traumaVisitId = "";
    private String pendingCallId = "";
    private String bloodGroupId = "";
    private String bloodGroup = "";
    private String location = "";
    private String dischargeTypeId = "";
    private String dischargeType = "";
    private String CON = "";
    private String mlcStatus = "";
    private String ERCategoryId = "";
    private String ERCategoryDescription = "";
    private String presentingComplaints = "";
    private String presentingComplaintId = "0";
    private String transferRemarks = " ";
    private String transferRemarksId = "";
    private String customerId = "";
    private String fromUnitId = "";
    private String fromUnit = "";
    private String toUnitId = "";
    private String toUnit = "";
    private String callRequest = "";
    private String callStatus = "";

    private String complaints = "";
    private String treatment = "";
    private String transferredBy = "";
    private String transferredDate = "";
    private String transferredTerminalId = "";

    private String requestRemarks = "";
    private String callActionRemarks = "";

    private String comments = "";
    private String mlcBy = "";
    private String mlcDate = "";
    private String mlcTerminalId = "";
    private String patMedCategoryId = "";
    private String newCategoryId = "";
    private String patMedCategory = "";
    private String referUserId = "";
    private String visitRowColor = "";

    public String getAdmissionRemarks() {
        return admissionRemarks;
    }

    public void setAdmissionRemarks(String admissionRemarks) {
        this.admissionRemarks = admissionRemarks;
    }

    public String getDischargeCertificate() {
        return dischargeCertificate;
    }

    public void setDischargeCertificate(String dischargeCertificate) {
        this.dischargeCertificate = dischargeCertificate;
    }

    public String getAdmissionDiagnosis() {
        return admissionDiagnosis;
    }

    public void setAdmissionDiagnosis(String admissionDiagnosis) {
        this.admissionDiagnosis = admissionDiagnosis;
    }

    public String getDiagnosisRemarks() {
        return diagnosisRemarks;
    }

    public void setDiagnosisRemarks(String diagnosisRemarks) {
        this.diagnosisRemarks = diagnosisRemarks;
    }

    public String getDiagnosisDescription() {
        return diagnosisDescription;
    }

    public void setDiagnosisDescription(String diagnosisDescription) {
        this.diagnosisDescription = diagnosisDescription;
    }

    public String getDischargeTypeDescription() {
        return dischargeTypeDescription;
    }

    public void setDischargeTypeDescription(String dischargeTypeDescription) {
        this.dischargeTypeDescription = dischargeTypeDescription;
    }

    public String getDisplayDischargeDate() {
        return displayDischargeDate;
    }

    public void setDisplayDischargeDate(String displayDischargeDate) {
        this.displayDischargeDate = displayDischargeDate;
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

    public String getGARequired() {
        return GARequired;
    }

    public void setGARequired(String GARequired) {
        this.GARequired = GARequired;
    }

    public String getWardNo() {
        return wardNo;
    }

    public void setWardNo(String wardNo) {
        this.wardNo = wardNo;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getPatientTypeId() {
        return patientTypeId;
    }

    public void setPatientTypeId(String patientTypeId) {
        this.patientTypeId = patientTypeId;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getCurrentWardNo() {
        return currentWardNo;
    }

    public void setCurrentWardNo(String currentWardNo) {
        this.currentWardNo = currentWardNo;
    }

    public String getCurrentBedNo() {
        return currentBedNo;
    }

    public void setCurrentBedNo(String currentBedNo) {
        this.currentBedNo = currentBedNo;
    }

    public String getVsil() {
        return vsil;
    }

    public void setVsil(String vsil) {
        this.vsil = vsil;
    }

    public String getBedCharges() {
        return bedCharges;
    }

    public void setBedCharges(String bedCharges) {
        this.bedCharges = bedCharges;
    }

    public String getGenderDescription() {
        return genderDescription;
    }

    public void setGenderDescription(String genderDescription) {
        this.genderDescription = genderDescription;
    }

    public String getHbsag() {
        return hbsag;
    }

    public void setHbsag(String hbsag) {
        this.hbsag = hbsag;
    }

    public String getAntiHcv() {
        return antiHcv;
    }

    public void setAntiHcv(String antiHcv) {
        this.antiHcv = antiHcv;
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

    public String getIsSaved() {
        return isSaved;
    }

    public void setIsSaved(String isSaved) {
        this.isSaved = isSaved;
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

    public String getIsDischarge() {
        return isDischarge;
    }

    public void setIsDischarge(String isDischarge) {
        this.isDischarge = isDischarge;
    }

    public String getMinimumAdvance() {
        return minimumAdvance;
    }

    public void setMinimumAdvance(String minimumAdvance) {
        this.minimumAdvance = minimumAdvance;
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

    public String getWardClientId() {
        return wardClientId;
    }

    public void setWardClientId(String wardClientId) {
        this.wardClientId = wardClientId;
    }

    public String getBedDescription() {
        return bedDescription;
    }

    public void setBedDescription(String bedDescription) {
        this.bedDescription = bedDescription;
    }

    public String getPatientContactNo() {
        return patientContactNo;
    }

    public void setPatientContactNo(String patientContactNo) {
        this.patientContactNo = patientContactNo;
    }

    public String getPatientCNIC() {
        return patientCNIC;
    }

    public void setPatientCNIC(String patientCNIC) {
        this.patientCNIC = patientCNIC;
    }

    public String getOrderStatusDescription() {
        return orderStatusDescription;
    }

    public void setOrderStatusDescription(String orderStatusDescription) {
        this.orderStatusDescription = orderStatusDescription;
    }

    public String getRequestedName() {
        return requestedName;
    }

    public void setRequestedName(String requestedName) {
        this.requestedName = requestedName;
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

    public String getReferringPhysicianId() {
        return referringPhysicianId;
    }

    public void setReferringPhysicianId(String referringPhysicianId) {
        this.referringPhysicianId = referringPhysicianId;
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

    public String getDischargeId() {
        return dischargeId;
    }

    public void setDischargeId(String dischargeId) {
        this.dischargeId = dischargeId;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getPLNO() {
        return PLNO;
    }

    public void setPLNO(String PLNO) {
        this.PLNO = PLNO;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getNextVisitDate() {
        return nextVisitDate;
    }

    public void setNextVisitDate(String nextVisitDate) {
        this.nextVisitDate = nextVisitDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getReferUserId() {
        return referUserId;
    }

    public void setReferUserId(String referUserId) {
        this.referUserId = referUserId;
    }

    public String getNewCategoryId() {
        return newCategoryId;
    }

    public void setNewCategoryId(String newCategoryId) {
        this.newCategoryId = newCategoryId;
    }

    public String getPatMedCategoryId() {
        return patMedCategoryId;
    }

    public void setPatMedCategoryId(String patMedCategoryId) {
        this.patMedCategoryId = patMedCategoryId;
    }

    public String getPatMedCategory() {
        return patMedCategory;
    }

    public void setPatMedCategory(String patMedCategory) {
        this.patMedCategory = patMedCategory;
    }

    public String getVisitRowColor() {
        return visitRowColor;
    }

    public void setVisitRowColor(String visitRowColor) {
        this.visitRowColor = visitRowColor;
    }

    private int rowIndex;

    public String getTeethRemarks() {
        return teethRemarks;
    }

    public void setTeethRemarks(String teethRemarks) {
        this.teethRemarks = teethRemarks;
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getTokenNo() {
        return tokenNo;
    }

    public void setTokenNo(String tokenNo) {
        this.tokenNo = tokenNo;
    }

    public String getCnicNo() {
        return cnicNo;
    }

    public void setCnicNo(String cnicNo) {
        this.cnicNo = cnicNo;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getClinicalHistory() {
        return clinicalHistory;
    }

    public void setClinicalHistory(String clinicalHistory) {
        this.clinicalHistory = clinicalHistory;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public String getPhysicianNotes() {
        return physicianNotes;
    }

    public void setPhysicianNotes(String physicianNotes) {
        this.physicianNotes = physicianNotes;
    }

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }

    public String getClinicExamination() {
        return clinicExamination;
    }

    public void setClinicExamination(String clinicExamination) {
        this.clinicExamination = clinicExamination;
    }

    public String getClinicDescription() {
        return clinicDescription;
    }

    public void setClinicDescription(String clinicDescription) {
        this.clinicDescription = clinicDescription;
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

    public String getIsEncounter() {
        return isEncounter;
    }

    public void setIsEncounter(String isEncounter) {
        this.isEncounter = isEncounter;
    }

    public String getIsAdmissionRequest() {
        return isAdmissionRequest;
    }

    public void setIsAdmissionRequest(String isAdmissionRequest) {
        this.isAdmissionRequest = isAdmissionRequest;
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

    public String getMedicineCompleteOrderNo() {
        return medicineCompleteOrderNo;
    }

    public void setMedicineCompleteOrderNo(String medicineCompleteOrderNo) {
        this.medicineCompleteOrderNo = medicineCompleteOrderNo;
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

    public String getODI() {
        return ODI;
    }

    public void setODI(String ODI) {
        this.ODI = ODI;
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

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
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

    public String getTraumaVisitId() {
        return traumaVisitId;
    }

    public void setTraumaVisitId(String traumaVisitId) {
        this.traumaVisitId = traumaVisitId;
    }

    public String getPendingCallId() {
        return pendingCallId;
    }

    public void setPendingCallId(String pendingCallId) {
        this.pendingCallId = pendingCallId;
    }

    public String getBloodGroupId() {
        return bloodGroupId;
    }

    public void setBloodGroupId(String bloodGroupId) {
        this.bloodGroupId = bloodGroupId;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDischargeRemarks() {
        return dischargeRemarks;
    }

    public void setDischargeRemarks(String dischargeRemarks) {
        this.dischargeRemarks = dischargeRemarks;
    }

    public String getOriginalDischargeTime() {
        return originalDischargeTime;
    }

    public void setOriginalDischargeTime(String originalDischargeTime) {
        this.originalDischargeTime = originalDischargeTime;
    }

    public String getDischargeTypeId() {
        return dischargeTypeId;
    }

    public void setDischargeTypeId(String dischargeTypeId) {
        this.dischargeTypeId = dischargeTypeId;
    }

    public String getDischargeType() {
        return dischargeType;
    }

    public void setDischargeType(String dischargeType) {
        this.dischargeType = dischargeType;
    }

    public String getDischargeBy() {
        return dischargeBy;
    }

    public void setDischargeBy(String dischargeBy) {
        this.dischargeBy = dischargeBy;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getCON() {
        return CON;
    }

    public void setCON(String CON) {
        this.CON = CON;
    }

    public String getMlcStatus() {
        return mlcStatus;
    }

    public void setMlcStatus(String mlcStatus) {
        this.mlcStatus = mlcStatus;
    }

    public String getERCategoryId() {
        return ERCategoryId;
    }

    public void setERCategoryId(String ERCategoryId) {
        this.ERCategoryId = ERCategoryId;
    }

    public String getERCategoryDescription() {
        return ERCategoryDescription;
    }

    public void setERCategoryDescription(String ERCategoryDescription) {
        this.ERCategoryDescription = ERCategoryDescription;
    }

    public String getPresentingComplaints() {
        return presentingComplaints;
    }

    public void setPresentingComplaints(String presentingComplaints) {
        this.presentingComplaints = presentingComplaints;
    }

    public String getPresentingComplaintId() {
        return presentingComplaintId;
    }

    public void setPresentingComplaintId(String presentingComplaintId) {
        this.presentingComplaintId = presentingComplaintId;
    }

    public String getTransferRemarks() {
        return transferRemarks;
    }

    public void setTransferRemarks(String transferRemarks) {
        this.transferRemarks = transferRemarks;
    }

    public String getTransferRemarksId() {
        return transferRemarksId;
    }

    public void setTransferRemarksId(String transferRemarksId) {
        this.transferRemarksId = transferRemarksId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFromUnitId() {
        return fromUnitId;
    }

    public void setFromUnitId(String fromUnitId) {
        this.fromUnitId = fromUnitId;
    }

    public String getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(String fromUnit) {
        this.fromUnit = fromUnit;
    }

    public String getToUnitId() {
        return toUnitId;
    }

    public void setToUnitId(String toUnitId) {
        this.toUnitId = toUnitId;
    }

    public String getToUnit() {
        return toUnit;
    }

    public void setToUnit(String toUnit) {
        this.toUnit = toUnit;
    }

    public String getCallRequest() {
        return callRequest;
    }

    public void setCallRequest(String callRequest) {
        this.callRequest = callRequest;
    }

    public String getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(String callStatus) {
        this.callStatus = callStatus;
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

    public String getRequestRemarks() {
        return requestRemarks;
    }

    public void setRequestRemarks(String requestRemarks) {
        this.requestRemarks = requestRemarks;
    }

    public String getCallActionRemarks() {
        return callActionRemarks;
    }

    public void setCallActionRemarks(String callActionRemarks) {
        this.callActionRemarks = callActionRemarks;
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

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

}
