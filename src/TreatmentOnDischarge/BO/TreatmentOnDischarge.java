/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreatmentOnDischarge.BO;

/**
 *
 * @author raheelansari
 */
public class TreatmentOnDischarge {
    
    private String patientId = "";
    private String admissionNo = "";
    private String history = "";
    private String pastHistory = "";
    private String drudHx = "";
    private String allergies = "";
    private String additives = "";
    private String actionId = "";
    private String eventId = "";
    private String detailId = "";
    private String detailDescription = "";
    private String procedureId = "";
    private String procedureDescription = "";
    private String dateOfSurgery = "";
    private String primaryPhysicianId = "";
    private String primaryPhysicianName = "";
    private String anesthesia = "";
    private String findings = "";
    private String postOfComplication = "";
    private String HistoPathology = "";
    private String Drains = "";
    private String bloodLoss = "";
    private String suturs = "";
    private String ivdFluids = "";
    private String antibiotics = "";
    private String analegeics = "";
    private String nceFoleys = "";
    private String remarks = "";
    private String analgestics = "";
    private String astureRevenal = "";
    private String totalLeaves = "";
    private String fromDate = "";
    private String toDate = "";
    private String dayToDate = "";
    private String dayFromDate = "";
    private String dayDateOfSurgery = "";
    private String diagnosisId = "";
    private String diagnosisDescription = "";
    private String HP = "";
    private String crtdBy = "";
    private String crtdByName = "";
    private String crtdDate = "";
    private String crtdTerminalId = "";
    
    public TreatmentOnDischarge(String patientId, String admissionNo, String value,
            String actionId, String eventId, String valueDesc){
        this.patientId = patientId;
        this.admissionNo = admissionNo;
        this.detailId = value;
        this.actionId = actionId;
        this.eventId = eventId;
        this.detailDescription = valueDesc;
    }

    public TreatmentOnDischarge(){
        
    }

    public String getDayToDate() {
        return dayToDate;
    }

    public void setDayToDate(String dayToDate) {
        this.dayToDate = dayToDate;
    }

    public String getDayFromDate() {
        return dayFromDate;
    }

    public void setDayFromDate(String dayFromDate) {
        this.dayFromDate = dayFromDate;
    }

    public String getDayDateOfSurgery() {
        return dayDateOfSurgery;
    }

    public void setDayDateOfSurgery(String dayDateOfSurgery) {
        this.dayDateOfSurgery = dayDateOfSurgery;
    }

    
    
    public String getAnalgestics() {
        return analgestics;
    }

    public void setAnalgestics(String analgestics) {
        this.analgestics = analgestics;
    }

    public String getAstureRevenal() {
        return astureRevenal;
    }

    public void setAstureRevenal(String astureRevenal) {
        this.astureRevenal = astureRevenal;
    }

    public String getTotalLeaves() {
        return totalLeaves;
    }

    public void setTotalLeaves(String totalLeaves) {
        this.totalLeaves = totalLeaves;
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

    public String getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(String diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public String getDiagnosisDescription() {
        return diagnosisDescription;
    }

    public void setDiagnosisDescription(String diagnosisDescription) {
        this.diagnosisDescription = diagnosisDescription;
    }

    public String getHP() {
        return HP;
    }

    public void setHP(String HP) {
        this.HP = HP;
    }
    
    

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getPastHistory() {
        return pastHistory;
    }

    public void setPastHistory(String pastHistory) {
        this.pastHistory = pastHistory;
    }

    public String getDrudHx() {
        return drudHx;
    }

    public void setDrudHx(String drudHx) {
        this.drudHx = drudHx;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getAdditives() {
        return additives;
    }

    public void setAdditives(String additives) {
        this.additives = additives;
    }

    
    
    public String getDetailDescription() {
        return detailDescription;
    }

    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }
    
    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }
    
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    
    

    public String getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(String procedureId) {
        this.procedureId = procedureId;
    }

    public String getProcedureDescription() {
        return procedureDescription;
    }

    public void setProcedureDescription(String procedureDescription) {
        this.procedureDescription = procedureDescription;
    }

    public String getDateOfSurgery() {
        return dateOfSurgery;
    }

    public void setDateOfSurgery(String dateOfSurgery) {
        this.dateOfSurgery = dateOfSurgery;
    }

    public String getPrimaryPhysicianId() {
        return primaryPhysicianId;
    }

    public void setPrimaryPhysicianId(String primaryPhysicianId) {
        this.primaryPhysicianId = primaryPhysicianId;
    }

    public String getPrimaryPhysicianName() {
        return primaryPhysicianName;
    }

    public void setPrimaryPhysicianName(String primaryPhysicianName) {
        this.primaryPhysicianName = primaryPhysicianName;
    }

    public String getAnesthesia() {
        return anesthesia;
    }

    public void setAnesthesia(String anesthesia) {
        this.anesthesia = anesthesia;
    }

    public String getFindings() {
        return findings;
    }

    public void setFindings(String findings) {
        this.findings = findings;
    }

    public String getPostOfComplication() {
        return postOfComplication;
    }

    public void setPostOfComplication(String postOfComplication) {
        this.postOfComplication = postOfComplication;
    }

    public String getHistoPathology() {
        return HistoPathology;
    }

    public void setHistoPathology(String HistoPathology) {
        this.HistoPathology = HistoPathology;
    }

    public String getDrains() {
        return Drains;
    }

    public void setDrains(String Drains) {
        this.Drains = Drains;
    }

    public String getBloodLoss() {
        return bloodLoss;
    }

    public void setBloodLoss(String bloodLoss) {
        this.bloodLoss = bloodLoss;
    }

    public String getSuturs() {
        return suturs;
    }

    public void setSuturs(String suturs) {
        this.suturs = suturs;
    }

    public String getIvdFluids() {
        return ivdFluids;
    }

    public void setIvdFluids(String ivdFluids) {
        this.ivdFluids = ivdFluids;
    }

    public String getAntibiotics() {
        return antibiotics;
    }

    public void setAntibiotics(String antibiotics) {
        this.antibiotics = antibiotics;
    }

    public String getAnalegeics() {
        return analegeics;
    }

    public void setAnalegeics(String analegeics) {
        this.analegeics = analegeics;
    }

    public String getNceFoleys() {
        return nceFoleys;
    }

    public void setNceFoleys(String nceFoleys) {
        this.nceFoleys = nceFoleys;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCrtdBy() {
        return crtdBy;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }

    public String getCrtdByName() {
        return crtdByName;
    }

    public void setCrtdByName(String crtdByName) {
        this.crtdByName = crtdByName;
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
