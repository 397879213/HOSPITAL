/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class StudyData implements Serializable {

    private String patientId = "    ";
    private String orderNo = "";
    private String patientName = "";
    private String patientStatusId = "";
    private String refundStatus = "";
    private String medicineCompleteOrderNo = "";
    private String admissionNumber = "";
    private String genderId = "";
    private String gender = "";
    private String age = "";
    private String fromAge = "";
    private String toAge = "";
    private String modality = "";
    private String departmentId = "";
    private String isPerformed = "";
    private String departmentDescription = "";
    private String sectionId = "";
    private String imagingNo = "";
    private String RTF = "Y";
    private String cptId = "";
    private String cpt = "";
    private String accessCode = "";
    private String removeSpaces = "";
    private String cptPrice = "";
    private int dispenseQuantity = 0;
    private String CPTRemarks = "";
    private String reportFontSize = "";
    private String contrastRequired = "";
    private String technologistRequired = "";
    private String technologistVerifiedDate = "";
    private String pathologistVerifiedDate = "";
    private String addendum = "";
    private String unverfyComments = "";
    private String itemId = "";

//PATHOLOGY PARAMTERS 
    private String surgeryProcedure = "";
    private String remarks = "";
    private String paymentModeId = "";
    private String sampleStatusDescription = "";
    private boolean sendEmail = false;
    private boolean finalSignEnabled = false;
    private String paymentModeDescription = "";
    private String tubeCodeDescription = "";
    private String tubeColor = "";
    private String tubeCodeId = "";
    private String labNumber = "";
    private String cptCodesCounter = "";

    private String techAckDate = "";
    private String techAckId = "";

    private String outReachId = "";
    private String outReachDate = "";

    private String performBy = "";
    private String performDate = "";

    private String transcribedDate = "";
    private String transcribedTerminal = "";
    private String transcribedBy = "";
    private String holdBy = "";
    private String holdComments = "";
    private String holdDate = "";
    private String specimenId = "";
    private String specimenDescription = "";
    private int cash = 0;
    private String cancelReturnId = "";
    private String caseNotes = "";
    private String procedureInformation = "";
    private String studyPath = "";
    private String storeId = "";
    private String studyIntegrated = "N";
    private String completeOrderNo = "";
    private String completeOrderNumbers = "";
    private String scanDate = "";
    private String sampleStatusId = "";
    private String accessionNumber = "         ";
    private String additionalPhyiscianReportingId = "";
    private String locationId = "";
    private String locationDescription = "";

    private String cancelRequestBy = "";
    private String cancelRequestTerminal = "";
    private String cancelRequestDate = "";
    private String cancelRequestRemarks = "";

    private String isSaved = "";
    private String isNegative = "";
    private String performingPhysicianShare = "";
    private String percentageShare = "";
    
    private String result = "";

    private String simpleText = "";

    private String comments = "";
    private String conclusion = "";
    private String reportComments = "";
    private String studyProtocol = "";
    private String cptCommentProtocol = "";

    private String searchFromDate = "";
    private String searchToDate = "";
    private String searchResult = "";
    private String searchConclusion = "";
    private String CDTI = "";
    private String orderLocation = "";
    private String orderLocationId = "";
    private String urgent = "N";
    private String facility = "";
    private String facilityName = "";
    private String filmSizeId = "";
    private String filmSizeDescription = "";
    private String totalNoOfFilms = "";
    private String analyzerId = "";
    private String analyzerDescription = "";
    private String printed = "";
    private String contrastId = "";
    private String contrastdescription = "";
    private String contrastQuantity = "0";
    private String radiationDose = "";
    private String acknowledgementRemarks = "";
    private String clinicalHistory = "        ";
    private String procedureHistory = "";
    private String pregnancy = "";
    private String egfr = "";
    private String cd = "";
    private String dvd = "";
    private String films = "";
    private String receivedRemarks = "";
    private String prescriptionServer = "";
    private String prescriptionPath = "";
    private String reportingPhysicianId = "";
    private String pathologistId = "";
    private String donorRequired = "";
    private String pathologistName = "";
    private String reportingPhysicianName = "";
    private String reportDestination = "AZN-TDC";
    private String reportDestinationId = "001";
    private String mobilityStatusId = "";
    private String mobilityStatusDescription = "";
    //
    private String acknowledgedBy = "";
    private String acknowledgedDate = "";
    private String acknowledgedTerminal = "";
    //

    //
    private String phlebotomistsDate = "";
    private String PhlebotomistsId = "";
    private String phlebotomistsTerminalId = "";

    private String referredBy = "";
    private String referredID = "";
    private String instructions = "";
    private String emailAddresses = "";
    private String orderStatus = "";
    private String statusDescription = "";
    private String technologistRemarks = "";
    private String orderDetailId = "";
    private String sectionNo = "";
    private String orderStatusId = "";
    private String tubeStatusId = "";
    private String technologistId = "";
    private String technologistName = "";

    private int parameterLength = 0;
    private int resultLength = 0;
    private int cutOffLength = 0;
    private int unitLength = 0;

    private String residentId = "";
    private String residentDate = "";
    private String transcriptionistId = "";
    private String transcriptionistDate = "";
    private String forwardingReportingPhysicianId = "";
    private String dictatedDate = "";
    private String verifiedBy = "";
    private String verifiedDate = "";
    private String verifiedTerminal = "";
    private String imageRequired = "";
    private String historyRequired = "";
    private String historyStatus = "";

    private String reportName = "";
    private String reportingPanel = "";
    private String reportingFormat = "";
    private int totalImages = 0;
    private String totalAmount = "";
    private String payableAmount = "";
    private String receivedAmount = "";
    private String netDiscount = "";
    private String refundAmount = "";
    private String balanceAmount = "";
    private String clientType = "";
    private String clientName = "";
    private String clientId = "";
    
    private String reportBalanceAmount = "";
    private String invoiceDate = "";
    private String terminalId = "";
    private String orderDate = "";
    private String appointmentStatus = "";
    private String appointmentTime = "";
    private String orderBy = "";
    private String cancelRequestType = "";
    private String reportedBy = "";
    private String reportDate = "";
    private String reportingTime = "";
    private String lisUploaded = "";

    private int returnQuantity = 0;

    private String receiverName = "SELF";
    private String contactNo = "";
    private String relationship = "SELF";
    private String deliveringRemarks = "";
    private String invoiceNo = "";
    private String invoiceBy = "";
    //private String orderBy = "";

    private boolean fetchResult = false;
    //Email Data containers
    private String reportPath = "";
    private String emailFrom = "";
    private String emailTo = "";
    private String emailStatus = "";
    private String manualEmail = "";
    private String pdfServer = "";
    private String pdfFilePath = "";
    private String pdfFileName = "";
    private String pdfGenerated = "";
    private String emailHeader = "";
    private String emailBody = "";
    private String emailFooter = "";
    private String emailSubject = "";

//private String queueDate = "";
    private String emailDate = "";
    private String emailQueueId = "";

//private String emailRemarks = "";
    private String transfer = "N";
    private String radLexCode = "";
    private String reportTemplate = "";
    private String reportUnverifyTime = "";
    private String Days = "";
    private String templateStyle = "";

    /**
     * ***********New BO Added**********
     */
    private Date requestDate = new Date();
    private String performingUnverifyTime = "";
    private String performingPhysicianRequired = "";
    private String adminUnverifyTime = "";
    private String labelCounts = "";
    private String performingLocationId = "";
    /**
     * ***********For Unverify Process**********
     */
    private String unverifyReportHistoryId = "";
    private String unverifyBy = "";
    private String unverifyDate = "";
    private String unverifyTerminalId = "";
    private String textResult = "";
    private String crtdBy = "";
    private String crtdDate = "";
    private String crtdTerminalId = "";
    private String unverifyMinutes = "";
    private String unverifyRequestDate = "";
    private String requestBy = "";
    private String decisionRemarks = "";
    private String verifiedByName = "";
    private String requestComments = "";

    //new added 
    private int rowIndex;

    private String batchId = "";
    private String batchBy = "";
    private String actionBy = "";
    private String actionDate = "";
    private String actionTerminalId = "";

    public String getBatchBy() {
        return batchBy;
    }

    public void setBatchBy(String batchBy) {
        this.batchBy = batchBy;
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

    public String getActionBy() {
        return actionBy;
    }

    public void setActionBy(String actionBy) {
        this.actionBy = actionBy;
    }

    public String getActionDate() {
        return actionDate;
    }

    public void setActionDate(String actionDate) {
        this.actionDate = actionDate;
    }

    public String getActionTerminalId() {
        return actionTerminalId;
    }

    public void setActionTerminalId(String actionTerminalId) {
        this.actionTerminalId = actionTerminalId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getRequestComments() {
        return requestComments;
    }

    public void setRequestComments(String requestComments) {
        this.requestComments = requestComments;
    }

    public String getVerifiedByName() {
        return verifiedByName;
    }

    public void setVerifiedByName(String verifiedByName) {
        this.verifiedByName = verifiedByName;
    }

    public String getUnverifyRequestDate() {
        return unverifyRequestDate;
    }

    public void setUnverifyRequestDate(String unverifyRequestDate) {
        this.unverifyRequestDate = unverifyRequestDate;
    }

    public String getDecisionRemarks() {
        return decisionRemarks;
    }

    public void setDecisionRemarks(String decisionRemarks) {
        this.decisionRemarks = decisionRemarks;
    }

    public String getRequestBy() {
        return requestBy;
    }

    public void setRequestBy(String requestBy) {
        this.requestBy = requestBy;
    }

    public String getUnverifyMinutes() {
        return unverifyMinutes;
    }

    public void setUnverifyMinutes(String unverifyMinutes) {
        this.unverifyMinutes = unverifyMinutes;
    }

    public String getTextResult() {
        return textResult;
    }

    public void setTextResult(String textResult) {
        this.textResult = textResult;
    }

    public String getUnverifyBy() {
        return unverifyBy;
    }

    public void setUnverifyBy(String unverifyBy) {
        this.unverifyBy = unverifyBy;
    }

    public String getUnverifyDate() {
        return unverifyDate;
    }

    public void setUnverifyDate(String unverifyDate) {
        this.unverifyDate = unverifyDate;
    }

    public String getUnverifyTerminalId() {
        return unverifyTerminalId;
    }

    public void setUnverifyTerminalId(String unverifyTerminalId) {
        this.unverifyTerminalId = unverifyTerminalId;
    }

    public String getUnverifyReportHistoryId() {
        return unverifyReportHistoryId;
    }

    public void setUnverifyReportHistoryId(String unverifyReportHistoryId) {
        this.unverifyReportHistoryId = unverifyReportHistoryId;
    }

    public StudyData() {
    }

    public String getReportUnverifyTime() {
        return reportUnverifyTime;
    }

    public void setReportUnverifyTime(String reportUnverifyTime) {
        this.reportUnverifyTime = reportUnverifyTime;
    }

    public String getLabNumber() {
        return labNumber;
    }

    public void setLabNumber(String labNumber) {
        this.labNumber = labNumber;
    }

    public String getCptCodesCounter() {
        return cptCodesCounter;
    }

    public void setCptCodesCounter(String cptCodesCounter) {
        this.cptCodesCounter = cptCodesCounter;
    }
    
    

    public String getTubeCodeDescription() {
        return tubeCodeDescription;
    }

    public String getOutReachId() {
        return outReachId;
    }

    public void setOutReachId(String outReachId) {
        this.outReachId = outReachId;
    }

    public String getOutReachDate() {
        return outReachDate;
    }

    public void setOutReachDate(String outReachDate) {
        this.outReachDate = outReachDate;
    }

    public String getTechAckId() {
        return techAckId;
    }

    public void setTechAckId(String techAckId) {
        this.techAckId = techAckId;
    }

    public String getTranscribedDate() {
        return transcribedDate;
    }

    public void setTranscribedDate(String transcribedDate) {
        this.transcribedDate = transcribedDate;
    }

    public String getTranscribedTerminal() {
        return transcribedTerminal;
    }

    public void setTranscribedTerminal(String transcribedTerminal) {
        this.transcribedTerminal = transcribedTerminal;
    }

    public String getTranscribedBy() {
        return transcribedBy;
    }

    public void setTranscribedBy(String transcribedBy) {
        this.transcribedBy = transcribedBy;
    }

    public void setTubeCodeDescription(String tubeCodeDescription) {
        this.tubeCodeDescription = tubeCodeDescription;
    }

    public String getTubeColor() {
        return tubeColor;
    }

    public void setTubeColor(String tubeColor) {
        this.tubeColor = tubeColor;
    }

    public String getTubeCodeId() {
        return tubeCodeId;
    }

    public void setTubeCodeId(String tubeCodeId) {
        this.tubeCodeId = tubeCodeId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getCancelReturnId() {
        return cancelReturnId;
    }

    public void setCancelReturnId(String cancelReturnId) {
        this.cancelReturnId = cancelReturnId;
    }

    public int getDispenseQuantity() {
        return dispenseQuantity;
    }

    public void setDispenseQuantity(int dispenseQuantity) {
        this.dispenseQuantity = dispenseQuantity;
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

    public int getReturnQuantity() {
        return returnQuantity;
    }

    public void setReturnQuantity(int returnQuantity) {
        this.returnQuantity = returnQuantity;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getIsSaved() {
        return isSaved;
    }

    public void setIsSaved(String isSaved) {
        this.isSaved = isSaved;
    }

    public String getIsNegative() {
        return isNegative;
    }

    public void setIsNegative(String isNegative) {
        this.isNegative = isNegative;
    }

    
    
    public String getPerformingPhysicianShare() {
        return performingPhysicianShare;
    }

    public void setPerformingPhysicianShare(String performingPhysicianShare) {
        this.performingPhysicianShare = performingPhysicianShare;
    }

    public String getPercentageShare() {
        return percentageShare;
    }

    public void setPercentageShare(String percentageShare) {
        this.percentageShare = percentageShare;
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

    public String getCancelRequestType() {
        return cancelRequestType;
    }

    public void setCancelRequestType(String cancelRequestType) {
        this.cancelRequestType = cancelRequestType;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFromAge() {
        return fromAge;
    }

    public void setFromAge(String fromAge) {
        this.fromAge = fromAge;
    }

    public String getToAge() {
        return toAge;
    }

    public void setToAge(String toAge) {
        this.toAge = toAge;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
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

    public String getRTF() {
        return RTF;
    }

    public void setRTF(String RTF) {
        this.RTF = RTF;
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

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }
    
    

    public String getRemoveSpaces() {
        return removeSpaces;
    }

    public void setRemoveSpaces(String removeSpaces) {
        this.removeSpaces = removeSpaces;
    }

    public String getCptPrice() {
        return cptPrice;
    }

    public void setCptPrice(String cptPrice) {
        this.cptPrice = cptPrice;
    }

    public String getCPTRemarks() {
        return CPTRemarks;
    }

    public void setCPTRemarks(String CPTRemarks) {
        this.CPTRemarks = CPTRemarks;
    }

    public String getReportFontSize() {
        return reportFontSize;
    }

    public void setReportFontSize(String reportFontSize) {
        this.reportFontSize = reportFontSize;
    }

    
    
    public String getContrastRequired() {
        return contrastRequired;
    }

    public void setContrastRequired(String contrastRequired) {
        this.contrastRequired = contrastRequired;
    }

    public String getTechnologistRequired() {
        return technologistRequired;
    }

    public void setTechnologistRequired(String technologistRequired) {
        this.technologistRequired = technologistRequired;
    }

    public String getTechnologistVerifiedDate() {
        return technologistVerifiedDate;
    }

    public void setTechnologistVerifiedDate(String technologistVerifiedDate) {
        this.technologistVerifiedDate = technologistVerifiedDate;
    }

    public String getPathologistVerifiedDate() {
        return pathologistVerifiedDate;
    }

    public void setPathologistVerifiedDate(String pathologistVerifiedDate) {
        this.pathologistVerifiedDate = pathologistVerifiedDate;
    }

    public String getSurgeryProcedure() {
        return surgeryProcedure;
    }

    public void setSurgeryProcedure(String surgeryProcedure) {
        this.surgeryProcedure = surgeryProcedure;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPaymentModeId() {
        return paymentModeId;
    }

    public void setPaymentModeId(String paymentModeId) {
        this.paymentModeId = paymentModeId;
    }

    public String getSampleStatusDescription() {
        return sampleStatusDescription;
    }

    public void setSampleStatusDescription(String sampleStatusDescription) {
        this.sampleStatusDescription = sampleStatusDescription;
    }

    public boolean isFinalSignEnabled() {
        return finalSignEnabled;
    }

    public void setFinalSignEnabled(boolean finalSignEnabled) {
        this.finalSignEnabled = finalSignEnabled;
    }

    public boolean isSendEmail() {
        return sendEmail;
    }

    public String getPerformBy() {
        return performBy;
    }

    public void setPerformBy(String performBy) {
        this.performBy = performBy;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public String getSpecimenId() {
        return specimenId;
    }

    public void setSpecimenId(String specimenId) {
        this.specimenId = specimenId;
    }

    public String getHoldBy() {
        return holdBy;
    }

    public void setHoldBy(String holdBy) {
        this.holdBy = holdBy;
    }

    public String getHoldComments() {
        return holdComments;
    }

    public void setHoldComments(String holdComments) {
        this.holdComments = holdComments;
    }

    
    public String getHoldDate() {
        return holdDate;
    }

    public void setHoldDate(String holdDate) {
        this.holdDate = holdDate;
    }

    
    public String getSpecimenDescription() {
        return specimenDescription;
    }

    public void setSpecimenDescription(String specimenDescription) {
        this.specimenDescription = specimenDescription;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getCaseNotes() {
        return caseNotes;
    }

    public void setCaseNotes(String caseNotes) {
        this.caseNotes = caseNotes;
    }

    public String getProcedureInformation() {
        return procedureInformation;
    }

    public void setProcedureInformation(String procedureInformation) {
        this.procedureInformation = procedureInformation;
    }

    public String getStudyPath() {
        return studyPath;
    }

    public void setStudyPath(String studyPath) {
        this.studyPath = studyPath;
    }

    public String getStudyIntegrated() {
        return studyIntegrated;
    }

    public void setStudyIntegrated(String studyIntegrated) {
        this.studyIntegrated = studyIntegrated;
    }

    public String getCompleteOrderNo() {
        return completeOrderNo;
    }

    public void setCompleteOrderNo(String completeOrderNo) {
        this.completeOrderNo = completeOrderNo;
    }

    public String getCompleteOrderNumbers() {
        return completeOrderNumbers;
    }

    public void setCompleteOrderNumbers(String completeOrderNumbers) {
        this.completeOrderNumbers = completeOrderNumbers;
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

    public String getAdditionalPhyiscianReportingId() {
        return additionalPhyiscianReportingId;
    }

    public void setAdditionalPhyiscianReportingId(String additionalPhyiscianReportingId) {
        this.additionalPhyiscianReportingId = additionalPhyiscianReportingId;
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

    public String getCancelRequestBy() {
        return cancelRequestBy;
    }

    public void setCancelRequestBy(String cancelRequestBy) {
        this.cancelRequestBy = cancelRequestBy;
    }

    public String getCancelRequestTerminal() {
        return cancelRequestTerminal;
    }

    public void setCancelRequestTerminal(String cancelRequestTerminal) {
        this.cancelRequestTerminal = cancelRequestTerminal;
    }

    public String getCancelRequestDate() {
        return cancelRequestDate;
    }

    public void setCancelRequestDate(String cancelRequestDate) {
        this.cancelRequestDate = cancelRequestDate;
    }

    public String getCancelRequestRemarks() {
        return cancelRequestRemarks;
    }

    public void setCancelRequestRemarks(String cancelRequestRemarks) {
        this.cancelRequestRemarks = cancelRequestRemarks;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReportComments() {
        return reportComments;
    }

    public void setReportComments(String reportComments) {
        this.reportComments = reportComments;
    }

    public String getStudyProtocol() {
        return studyProtocol;
    }

    public void setStudyProtocol(String studyProtocol) {
        this.studyProtocol = studyProtocol;
    }

    public String getCptCommentProtocol() {
        return cptCommentProtocol;
    }

    public void setCptCommentProtocol(String cptCommentProtocol) {
        this.cptCommentProtocol = cptCommentProtocol;
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

    public String getCDTI() {
        return CDTI;
    }

    public void setCDTI(String CDTI) {
        this.CDTI = CDTI;
    }

    public String getOrderLocation() {
        return orderLocation;
    }

    public void setOrderLocation(String orderLocation) {
        this.orderLocation = orderLocation;
    }

    public String getOrderLocationId() {
        return orderLocationId;
    }

    public void setOrderLocationId(String orderLocationId) {
        this.orderLocationId = orderLocationId;
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getFilmSizeId() {
        return filmSizeId;
    }

    public void setFilmSizeId(String filmSizeId) {
        this.filmSizeId = filmSizeId;
    }

    public String getFilmSizeDescription() {
        return filmSizeDescription;
    }

    public void setFilmSizeDescription(String filmSizeDescription) {
        this.filmSizeDescription = filmSizeDescription;
    }

    public String getTotalNoOfFilms() {
        return totalNoOfFilms;
    }

    public void setTotalNoOfFilms(String totalNoOfFilms) {
        this.totalNoOfFilms = totalNoOfFilms;
    }

    public String getAnalyzerId() {
        return analyzerId;
    }

    public void setAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
    }

    public String getAnalyzerDescription() {
        return analyzerDescription;
    }

    public void setAnalyzerDescription(String analyzerDescription) {
        this.analyzerDescription = analyzerDescription;
    }

    public String getPrinted() {
        return printed;
    }

    public void setPrinted(String printed) {
        this.printed = printed;
    }

    public String getContrastId() {
        return contrastId;
    }

    public void setContrastId(String contrastId) {
        this.contrastId = contrastId;
    }

    public String getContrastdescription() {
        return contrastdescription;
    }

    public void setContrastdescription(String contrastdescription) {
        this.contrastdescription = contrastdescription;
    }

    public String getContrastQuantity() {
        return contrastQuantity;
    }

    public void setContrastQuantity(String contrastQuantity) {
        this.contrastQuantity = contrastQuantity;
    }

    public String getRadiationDose() {
        return radiationDose;
    }

    public void setRadiationDose(String radiationDose) {
        this.radiationDose = radiationDose;
    }

    public String getAcknowledgementRemarks() {
        return acknowledgementRemarks;
    }

    public void setAcknowledgementRemarks(String acknowledgementRemarks) {
        this.acknowledgementRemarks = acknowledgementRemarks;
    }

    public String getClinicalHistory() {
        return clinicalHistory;
    }

    public void setClinicalHistory(String clinicalHistory) {
        this.clinicalHistory = clinicalHistory;
    }

    public String getProcedureHistory() {
        return procedureHistory;
    }

    public void setProcedureHistory(String procedureHistory) {
        this.procedureHistory = procedureHistory;
    }

    public String getPregnancy() {
        return pregnancy;
    }

    public void setPregnancy(String pregnancy) {
        this.pregnancy = pregnancy;
    }

    public String getEgfr() {
        return egfr;
    }

    public void setEgfr(String egfr) {
        this.egfr = egfr;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getDvd() {
        return dvd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    
    public String getFilms() {
        return films;
    }

    public void setFilms(String films) {
        this.films = films;
    }

    public String getDonorRequired() {
        return donorRequired;
    }

    public void setDonorRequired(String donorRequired) {
        this.donorRequired = donorRequired;
    }

    
    
    
    public String getReceivedRemarks() {
        return receivedRemarks;
    }

    public void setReceivedRemarks(String receivedRemarks) {
        this.receivedRemarks = receivedRemarks;
    }

    public String getPrescriptionServer() {
        return prescriptionServer;
    }

    public void setPrescriptionServer(String prescriptionServer) {
        this.prescriptionServer = prescriptionServer;
    }

    public String getPrescriptionPath() {
        return prescriptionPath;
    }

    public void setPrescriptionPath(String prescriptionPath) {
        this.prescriptionPath = prescriptionPath;
    }

    public String getReportingPhysicianId() {
        return reportingPhysicianId;
    }

    public void setReportingPhysicianId(String reportingPhysicianId) {
        this.reportingPhysicianId = reportingPhysicianId;
    }

    public String getPathologistId() {
        return pathologistId;
    }

    public void setPathologistId(String pathologistId) {
        this.pathologistId = pathologistId;
    }

    public int getParameterLength() {
        return parameterLength;
    }

    public void setParameterLength(int parameterLength) {
        this.parameterLength = parameterLength;
    }

    public int getResultLength() {
        return resultLength;
    }

    public void setResultLength(int resultLength) {
        this.resultLength = resultLength;
    }

    public int getCutOffLength() {
        return cutOffLength;
    }

    public void setCutOffLength(int cutOffLength) {
        this.cutOffLength = cutOffLength;
    }

    public int getUnitLength() {
        return unitLength;
    }

    public void setUnitLength(int unitLength) {
        this.unitLength = unitLength;
    }

    public String getPathologistName() {
        return pathologistName;
    }

    public void setPathologistName(String pathologistName) {
        this.pathologistName = pathologistName;
    }

    public String getReportingPhysicianName() {
        return reportingPhysicianName;
    }

    public void setReportingPhysicianName(String reportingPhysicianName) {
        this.reportingPhysicianName = reportingPhysicianName;
    }

    public String getReportDestination() {
        return reportDestination;
    }

    public void setReportDestination(String reportDestination) {
        this.reportDestination = reportDestination;
    }

    public String getReportDestinationId() {
        return reportDestinationId;
    }

    public void setReportDestinationId(String reportDestinationId) {
        this.reportDestinationId = reportDestinationId;
    }

    public String getMobilityStatusId() {
        return mobilityStatusId;
    }

    public void setMobilityStatusId(String mobilityStatusId) {
        this.mobilityStatusId = mobilityStatusId;
    }

    public String getMobilityStatusDescription() {
        return mobilityStatusDescription;
    }

    public void setMobilityStatusDescription(String mobilityStatusDescription) {
        this.mobilityStatusDescription = mobilityStatusDescription;
    }

    public String getAcknowledgedBy() {
        return acknowledgedBy;
    }

    public void setAcknowledgedBy(String acknowledgedBy) {
        this.acknowledgedBy = acknowledgedBy;
    }

    public String getAcknowledgedDate() {
        return acknowledgedDate;
    }

    public void setAcknowledgedDate(String acknowledgedDate) {
        this.acknowledgedDate = acknowledgedDate;
    }

    public String getAcknowledgedTerminal() {
        return acknowledgedTerminal;
    }

    public void setAcknowledgedTerminal(String acknowledgedTerminal) {
        this.acknowledgedTerminal = acknowledgedTerminal;
    }

    public String getTechAckDate() {
        return techAckDate;
    }

    public void setTechAckDate(String techAckDate) {
        this.techAckDate = techAckDate;
    }

    public String getPhlebotomistsDate() {
        return phlebotomistsDate;
    }

    public void setPhlebotomistsDate(String phlebotomistsDate) {
        this.phlebotomistsDate = phlebotomistsDate;
    }

    public String getPhlebotomistsId() {
        return PhlebotomistsId;
    }

    public void setPhlebotomistsId(String PhlebotomistsId) {
        this.PhlebotomistsId = PhlebotomistsId;
    }

    public String getPhlebotomistsTerminalId() {
        return phlebotomistsTerminalId;
    }

    public void setPhlebotomistsTerminalId(String phlebotomistsTerminalId) {
        this.phlebotomistsTerminalId = phlebotomistsTerminalId;
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

    public String getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(String emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getTechnologistRemarks() {
        return technologistRemarks;
    }

    public void setTechnologistRemarks(String technologistRemarks) {
        this.technologistRemarks = technologistRemarks;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(String sectionNo) {
        this.sectionNo = sectionNo;
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getTubeStatusId() {
        return tubeStatusId;
    }

    public void setTubeStatusId(String tubeStatusId) {
        this.tubeStatusId = tubeStatusId;
    }
    
    

    public String getTechnologistId() {
        return technologistId;
    }

    public void setTechnologistId(String technologistId) {
        this.technologistId = technologistId;
    }

    public String getTechnologistName() {
        return technologistName;
    }

    public void setTechnologistName(String technologistName) {
        this.technologistName = technologistName;
    }

    public String getPerformDate() {
        return performDate;
    }

    public void setPerformDate(String performDate) {
        this.performDate = performDate;
    }

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    public String getResidentDate() {
        return residentDate;
    }

    public void setResidentDate(String residentDate) {
        this.residentDate = residentDate;
    }

    public String getTranscriptionistId() {
        return transcriptionistId;
    }

    public void setTranscriptionistId(String transcriptionistId) {
        this.transcriptionistId = transcriptionistId;
    }

    public String getTranscriptionistDate() {
        return transcriptionistDate;
    }

    public void setTranscriptionistDate(String transcriptionistDate) {
        this.transcriptionistDate = transcriptionistDate;
    }

    public String getForwardingReportingPhysicianId() {
        return forwardingReportingPhysicianId;
    }

    public void setForwardingReportingPhysicianId(String forwardingReportingPhysicianId) {
        this.forwardingReportingPhysicianId = forwardingReportingPhysicianId;
    }

    public String getDictatedDate() {
        return dictatedDate;
    }

    public void setDictatedDate(String dictatedDate) {
        this.dictatedDate = dictatedDate;
    }

    public String getVerifiedBy() {
        return verifiedBy;
    }

    public void setVerifiedBy(String verifiedBy) {
        this.verifiedBy = verifiedBy;
    }

    public String getVerifiedDate() {
        return verifiedDate;
    }

    public void setVerifiedDate(String verifiedDate) {
        this.verifiedDate = verifiedDate;
    }

    public String getVerifiedTerminal() {
        return verifiedTerminal;
    }

    public void setVerifiedTerminal(String verifiedTerminal) {
        this.verifiedTerminal = verifiedTerminal;
    }

    public String getImageRequired() {
        return imageRequired;
    }

    public void setImageRequired(String imageRequired) {
        this.imageRequired = imageRequired;
    }

    public String getHistoryRequired() {
        return historyRequired;
    }

    public void setHistoryRequired(String historyRequired) {
        this.historyRequired = historyRequired;
    }

    public String getHistoryStatus() {
        return historyStatus;
    }

    public void setHistoryStatus(String historyStatus) {
        this.historyStatus = historyStatus;
    }

    public String getIsPerformed() {
        return isPerformed;
    }

    public void setIsPerformed(String isPerformed) {
        this.isPerformed = isPerformed;
    }

    
    
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportingPanel() {
        return reportingPanel;
    }

    public void setReportingPanel(String reportingPanel) {
        this.reportingPanel = reportingPanel;
    }

    public String getReportingFormat() {
        return reportingFormat;
    }

    public void setReportingFormat(String reportingFormat) {
        this.reportingFormat = reportingFormat;
    }

    public int getTotalImages() {
        return totalImages;
    }

    public void setTotalImages(int totalImages) {
        this.totalImages = totalImages;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPayableAmount() {
        return payableAmount;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    
    public void setPayableAmount(String payableAmount) {
        this.payableAmount = payableAmount;
    }

    public String getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(String receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public String getNetDiscount() {
        return netDiscount;
    }

    public void setNetDiscount(String netDiscount) {
        this.netDiscount = netDiscount;
    }

    public String getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getReportBalanceAmount() {
        return reportBalanceAmount;
    }

    public String getUnverfyComments() {
        return unverfyComments;
    }

    public void setUnverfyComments(String unverfyComments) {
        this.unverfyComments = unverfyComments;
    }

    public void setReportBalanceAmount(String reportBalanceAmount) {
        this.reportBalanceAmount = reportBalanceAmount;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    
    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getLisUploaded() {
        return lisUploaded;
    }

    public void setLisUploaded(String lisUploaded) {
        this.lisUploaded = lisUploaded;
    }

    public String getReportingTime() {
        return reportingTime;
    }

    public void setReportingTime(String reportingTime) {
        this.reportingTime = reportingTime;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getDeliveringRemarks() {
        return deliveringRemarks;
    }

    public void setDeliveringRemarks(String deliveringRemarks) {
        this.deliveringRemarks = deliveringRemarks;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getInvoiceBy() {
        return invoiceBy;
    }

    public void setInvoiceBy(String invoiceBy) {
        this.invoiceBy = invoiceBy;
    }

    public boolean isFetchResult() {
        return fetchResult;
    }

    public void setFetchResult(boolean fetchResult) {
        this.fetchResult = fetchResult;
    }

    public String getReportPath() {
        return reportPath;
    }

    public void setReportPath(String reportPath) {
        this.reportPath = reportPath;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }

    public String getManualEmail() {
        return manualEmail;
    }

    public void setManualEmail(String manualEmail) {
        this.manualEmail = manualEmail;
    }

    public String getPdfServer() {
        return pdfServer;
    }

    public void setPdfServer(String pdfServer) {
        this.pdfServer = pdfServer;
    }

    public String getPdfFilePath() {
        return pdfFilePath;
    }

    public void setPdfFilePath(String pdfFilePath) {
        this.pdfFilePath = pdfFilePath;
    }

    public String getPdfFileName() {
        return pdfFileName;
    }

    public void setPdfFileName(String pdfFileName) {
        this.pdfFileName = pdfFileName;
    }

    public String getPdfGenerated() {
        return pdfGenerated;
    }

    public void setPdfGenerated(String pdfGenerated) {
        this.pdfGenerated = pdfGenerated;
    }

    public String getEmailHeader() {
        return emailHeader;
    }

    public void setEmailHeader(String emailHeader) {
        this.emailHeader = emailHeader;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }

    public String getEmailFooter() {
        return emailFooter;
    }

    public void setEmailFooter(String emailFooter) {
        this.emailFooter = emailFooter;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getEmailDate() {
        return emailDate;
    }

    public void setEmailDate(String emailDate) {
        this.emailDate = emailDate;
    }

    public String getEmailQueueId() {
        return emailQueueId;
    }

    public void setEmailQueueId(String emailQueueId) {
        this.emailQueueId = emailQueueId;
    }

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    public String getRadLexCode() {
        return radLexCode;
    }

    public void setRadLexCode(String radLexCode) {
        this.radLexCode = radLexCode;
    }

    public String getReportTemplate() {
        return reportTemplate;
    }

    public void setReportTemplate(String reportTemplate) {
        this.reportTemplate = reportTemplate;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
        this.cancelRequestDate = requestDate.toString();//convert the date to string
    }

    public String getDays() {
        return Days;
    }

    public void setDays(String Days) {
        this.Days = Days;
    }

    public String getTemplateStyle() {
        return templateStyle;
    }

    public void setTemplateStyle(String templateStyle) {
        this.templateStyle = templateStyle;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.completeOrderNo);
        hash = 89 * hash + Objects.hashCode(this.orderDetailId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StudyData other = (StudyData) obj;
        if (!Objects.equals(this.completeOrderNo, other.completeOrderNo)) {
            return false;
        }
        if (!Objects.equals(this.orderDetailId, other.orderDetailId)) {
            return false;
        }
        return true;
    }


    public String getSimpleText() {
        return simpleText;
    }

    public void setSimpleText(String simpleText) {
        this.simpleText = simpleText;
    }

    public String getAddendum() {
        return addendum;
    }

    public void setAddendum(String addendum) {
        this.addendum = addendum;
    }

    public void setPerformingUnverifyTime(String performingUnverifyTime) {
        this.performingUnverifyTime = performingUnverifyTime;
    }

    public void setAdminUnverifyTime(String adminUnverifyTime) {
        this.adminUnverifyTime = adminUnverifyTime;
    }

    public String getPerformingPhysicianRequired() {
        return performingPhysicianRequired;
    }

    public void setPerformingPhysicianRequired(String performingPhysicianRequired) {
        this.performingPhysicianRequired = performingPhysicianRequired;
    }

    public String getPerformingUnverifyTime() {
        return performingUnverifyTime;
    }

    public String getAdminUnverifyTime() {
        return adminUnverifyTime;
    }

    public String getLabelCounts() {
        return labelCounts;
    }

    public void setLabelCounts(String labelCounts) {
        this.labelCounts = labelCounts;
    }

    public String getPerformingLocationId() {
        return performingLocationId;
    }

    public void setPerformingLocationId(String performingLocationId) {
        this.performingLocationId = performingLocationId;
    }

    public String getPaymentModeDescription() {
        return paymentModeDescription;
    }

    public void setPaymentModeDescription(String paymentModeDescription) {
        this.paymentModeDescription = paymentModeDescription;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
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

    public String getPatientStatusId() {
        return patientStatusId;
    }

    public void setPatientStatusId(String patientStatusId) {
        this.patientStatusId = patientStatusId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }
 
 

}
