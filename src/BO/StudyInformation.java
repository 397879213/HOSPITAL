package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class StudyInformation implements java.io.Serializable {

    private String patientId = "";
    private String RISPatientId = "";
    private String savePatientId = "";
    private String PACSStudyId = "";
    private String patientName = "";
    private String age = "";
    private String gender = "";
    private String modality = "All";
    private String locationId = "";
    private String toDate = "";
    private String fromDate = "";
    private String locationName = "";
    private String studyDate = "";
    private String sqlDate = "";
    private String studyTime = "";
    private String studyKey = "";
    private String accessionNo = "";
    private String RISAccessionNo = "";
    private String RISCompleteOrderNo = "123";
    private String RISOrderDetailId = "123";
    private String frontServer = "";
    private String storageServer = "";
    private String isEncrypted = "";
    private String backupServer = "";
    private String filePath = "";
    private String studyFilePath = "";
    private String CTRequiredServer = "";
    private String fileName = "";
    private long totalImages = 0;
    private long totalRequiredImages = 0;
    private long studySize = 0;
    private long compressStudySize = 0;
    private long requiredStudySize = 0;
    private String compressStudy = "N";
    private String uniqueStudyId = "";
    private String viewPosition = "";
    private boolean verifiedRecord = false;
    private String studyDescription = "";
    private String procedureInformation = "";
    private String referringPhysician = "";
    private String performingPhysician = "All";
    private String performingPhysicianId = "";
    private String techName = "";
    private String receiveDateTime = "";
    private String machineName = "";
    private String stationName = "";
    private String status = "";
    private String active = "";
    private String clinicalInformation = "";
    private String result = "";
    private String technique = "";
    private String conclusion = "";
    //Extra Field other than DB Table
    private String studyId = "";
    private String seriesNumber = "";
    private String imageNumber = "";
    private boolean isRequired = false;
    private String emailAddresses = "";
    private String reportDate = "";
    private String dictatedBy = "";
    private String transcribedBy = "";
    private String reportedBy = "";

    private String allStudies = " IN('"
            + PACSStudyStatus.archived + "','"
            + PACSStudyStatus.dictated + "','"
            + PACSStudyStatus.assigned + "','"
            + PACSStudyStatus.requested + "','"
            + PACSStudyStatus.transferred + "','"
            + PACSStudyStatus.reported + "')";

    private String reported = " = '" + PACSStudyStatus.reported + "'";
    private String assigned = " = '" + PACSStudyStatus.assigned + "'";
    private String archived = " = '" + PACSStudyStatus.archived + "'";
    private String requested = " = '" + PACSStudyStatus.requested + "'";
    private String uploaded = " = '" + PACSStudyStatus.uploaded + "'";

    //FOR STUDY UPLOAD
    private String requestedTime = "";
    private String uploadStatus = "N";
    private String uploadRequest = "";
    //private String uploadStatus = "";
    private String requestedBy = "";
    //CONFERENCE 
    private String confId = "";
    private String discussedBy = "";
    private String initialNotes = "";
    private String conferenceNotes = "";
    private String requestedDate = "";
    private int rowIndex;

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    
    
    
    private int getRowIndex() {
        return rowIndex;
    }

    private void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getRISPatientId() {
        return RISPatientId;
    }

    public void setRISPatientId(String RISPatientId) {
        this.RISPatientId = RISPatientId;
    }

    public String getSavePatientId() {
        return savePatientId;
    }

    public void setSavePatientId(String savePatientId) {
        this.savePatientId = savePatientId;
    }

    public String getPatientName() {
        return patientName;
    }
    
    

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPACSStudyId() {
        return PACSStudyId;
    }

    public void setPACSStudyId(String PACSStudyId) {
        this.PACSStudyId = PACSStudyId;
    }
    

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
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

    public String getStudyDate() {
        return studyDate;
    }

    public void setStudyDate(String studyDate) {
        this.studyDate = studyDate;
    }

    public String getSqlDate() {
        return sqlDate;
    }

    public void setSqlDate(String sqlDate) {
        this.sqlDate = sqlDate;
    }

    public String getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(String studyTime) {
        this.studyTime = studyTime;
    }

    public String getStudyKey() {
        return studyKey;
    }

    public void setStudyKey(String studyKey) {
        this.studyKey = studyKey;
    }

    public String getAccessionNo() {
        return accessionNo;
    }

    public void setAccessionNo(String accessionNo) {
        this.accessionNo = accessionNo;
    }

    public String getRISAccessionNo() {
        return RISAccessionNo;
    }

    public void setRISAccessionNo(String RISAccessionNo) {
        this.RISAccessionNo = RISAccessionNo;
    }

    public String getRISCompleteOrderNo() {
        return RISCompleteOrderNo;
    }

    public void setRISCompleteOrderNo(String RISCompleteOrderNo) {
        this.RISCompleteOrderNo = RISCompleteOrderNo;
    }

    public String getRISOrderDetailId() {
        return RISOrderDetailId;
    }

    public void setRISOrderDetailId(String RISOrderDetailId) {
        this.RISOrderDetailId = RISOrderDetailId;
    }

    public String getIsEncrypted() {
        return isEncrypted;
    }

    public void setIsEncrypted(String isEncrypted) {
        this.isEncrypted = isEncrypted;
    }

    
    
    public String getFrontServer() {
        return frontServer;
    }

    
    public void setFrontServer(String frontServer) {
        this.frontServer = frontServer;
    }

    public String getStorageServer() {
        return storageServer;
    }

    public void setStorageServer(String storageServer) {
        this.storageServer = storageServer;
    }

    public String getBackupServer() {
        return backupServer;
    }

    public void setBackupServer(String backupServer) {
        this.backupServer = backupServer;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getStudyFilePath() {
        return studyFilePath;
    }

    public void setStudyFilePath(String studyFilePath) {
        this.studyFilePath = studyFilePath;
    }

    public String getCTRequiredServer() {
        return CTRequiredServer;
    }

    public void setCTRequiredServer(String CTRequiredServer) {
        this.CTRequiredServer = CTRequiredServer;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getTotalImages() {
        return totalImages;
    }

    public void setTotalImages(long totalImages) {
        this.totalImages = totalImages;
    }

    public long getTotalRequiredImages() {
        return totalRequiredImages;
    }

    public void setTotalRequiredImages(long totalRequiredImages) {
        this.totalRequiredImages = totalRequiredImages;
    }

    public long getStudySize() {
        return studySize;
    }

    public void setStudySize(long studySize) {
        this.studySize = studySize;
    }

    public long getCompressStudySize() {
        return compressStudySize;
    }

    public void setCompressStudySize(long compressStudySize) {
        this.compressStudySize = compressStudySize;
    }

    public long getRequiredStudySize() {
        return requiredStudySize;
    }

    public void setRequiredStudySize(long requiredStudySize) {
        this.requiredStudySize = requiredStudySize;
    }

    public String getCompressStudy() {
        return compressStudy;
    }

    public void setCompressStudy(String compressStudy) {
        this.compressStudy = compressStudy;
    }

    public String getUniqueStudyId() {
        return uniqueStudyId;
    }

    public void setUniqueStudyId(String uniqueStudyId) {
        this.uniqueStudyId = uniqueStudyId;
    }

    public String getViewPosition() {
        return viewPosition;
    }

    public void setViewPosition(String viewPosition) {
        this.viewPosition = viewPosition;
    }

    public boolean isVerifiedRecord() {
        return verifiedRecord;
    }

    public void setVerifiedRecord(boolean verifiedRecord) {
        this.verifiedRecord = verifiedRecord;
    }

    public String getStudyDescription() {
        return studyDescription;
    }

    public void setStudyDescription(String studyDescription) {
        this.studyDescription = studyDescription;
    }

    public String getProcedureInformation() {
        return procedureInformation;
    }

    public void setProcedureInformation(String procedureInformation) {
        this.procedureInformation = procedureInformation;
    }

    public String getReferringPhysician() {
        return referringPhysician;
    }

    public void setReferringPhysician(String referringPhysician) {
        this.referringPhysician = referringPhysician;
    }

    public String getPerformingPhysician() {
        return performingPhysician;
    }

    public void setPerformingPhysician(String performingPhysician) {
        this.performingPhysician = performingPhysician;
    }

    public String getPerformingPhysicianId() {
        return performingPhysicianId;
    }

    public void setPerformingPhysicianId(String performingPhysicianId) {
        this.performingPhysicianId = performingPhysicianId;
    }
    
    

    
    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public String getReceiveDateTime() {
        return receiveDateTime;
    }

    public void setReceiveDateTime(String receiveDateTime) {
        this.receiveDateTime = receiveDateTime;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getClinicalInformation() {
        return clinicalInformation;
    }

    public void setClinicalInformation(String clinicalInformation) {
        this.clinicalInformation = clinicalInformation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getStudyId() {
        return studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId;
    }

    public String getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(String seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public String getImageNumber() {
        return imageNumber;
    }

    public void setImageNumber(String imageNumber) {
        this.imageNumber = imageNumber;
    }

    public boolean isIsRequired() {
        return isRequired;
    }

    public void setIsRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }

    public String getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(String emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getDictatedBy() {
        return dictatedBy;
    }

    public void setDictatedBy(String dictatedBy) {
        this.dictatedBy = dictatedBy;
    }

    public String getTranscribedBy() {
        return transcribedBy;
    }

    public void setTranscribedBy(String transcribedBy) {
        this.transcribedBy = transcribedBy;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }

    public String getAllStudies() {
        return allStudies;
    }

    public void setAllStudies(String allStudies) {
        this.allStudies = allStudies;
    }

    public String getReported() {
        return reported;
    }

    public void setReported(String reported) {
        this.reported = reported;
    }

    public String getAssigned() {
        return assigned;
    }

    public void setAssigned(String assigned) {
        this.assigned = assigned;
    }

    public String getArchived() {
        return archived;
    }

    public void setArchived(String archived) {
        this.archived = archived;
    }

    public String getRequested() {
        return requested;
    }

    public void setRequested(String requested) {
        this.requested = requested;
    }

    public String getUploaded() {
        return uploaded;
    }

    public void setUploaded(String uploaded) {
        this.uploaded = uploaded;
    }

    public String getRequestedTime() {
        return requestedTime;
    }

    public void setRequestedTime(String requestedTime) {
        this.requestedTime = requestedTime;
    }

    public String getUploadStatus() {
        return uploadStatus;
    }

    public void setUploadStatus(String uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    public String getUploadRequest() {
        return uploadRequest;
    }

    public void setUploadRequest(String uploadRequest) {
        this.uploadRequest = uploadRequest;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getConfId() {
        return confId;
    }

    public void setConfId(String confId) {
        this.confId = confId;
    }

    public String getDiscussedBy() {
        return discussedBy;
    }

    public void setDiscussedBy(String discussedBy) {
        this.discussedBy = discussedBy;
    }

    public String getInitialNotes() {
        return initialNotes;
    }

    public void setInitialNotes(String initialNotes) {
        this.initialNotes = initialNotes;
    }

    public String getConferenceNotes() {
        return conferenceNotes;
    }

    public void setConferenceNotes(String conferenceNotes) {
        this.conferenceNotes = conferenceNotes;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }
    
    
    
    
}
