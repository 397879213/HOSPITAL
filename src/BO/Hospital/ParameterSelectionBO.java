/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.Hospital;

/**
 *
 * @author Pacslink
 */
public class ParameterSelectionBO {
    private String fetchId = "";
    private String patientId = "";
    private String con = "";
    private String odi = "";
    private String lisValue = "";
    private String lasValue = "";
    private String verifiedValue = "";
    private String verifiedDate = "";
    private String trnDate = "";
    private String labNo = "";
    private String result = "";
    private String parameterId = "";
    private String parameterDescription = "";
    private String parameterUnit = "";
    private String displayName = "";
    private String userId = "";
    private String reportingFormatId = "";
    private String reportingFormatName = "";
    private String tableName = "";

    public ParameterSelectionBO(String parameterId, String parameterDescription,
            String parameterUnit, String userId, String reportingFormatName){
        this.parameterId = parameterId;
        this.parameterDescription = parameterDescription;
        this.parameterUnit = parameterUnit;
        this.userId = userId;
        this.reportingFormatName = reportingFormatName;
    }
    
    public ParameterSelectionBO(String fetchId, String patientId, String con, String labNo, 
            String parameterId, String result){
        this.fetchId = fetchId;
        this.patientId = patientId;
        this.con = con;
        this.labNo = labNo;
        this.parameterId = parameterId;
        this.result = result;
    }

    public String getFetchId() {
        return fetchId;
    }

    public void setFetchId(String fetchId) {
        this.fetchId = fetchId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    public String getTrnDate() {
        return trnDate;
    }

    public void setTrnDate(String trnDate) {
        this.trnDate = trnDate;
    }
    
    public String getReportingFormatId() {
        return reportingFormatId;
    }

    public void setReportingFormatId(String reportingFormatId) {
        this.reportingFormatId = reportingFormatId;
    }

    public String getReportingFormatName() {
        return reportingFormatName;
    }

    public void setReportingFormatName(String reportingFormatName) {
        this.reportingFormatName = reportingFormatName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }

    public String getOdi() {
        return odi;
    }

    public void setOdi(String odi) {
        this.odi = odi;
    }

    public String getLisValue() {
        return lisValue;
    }

    public void setLisValue(String lisValue) {
        this.lisValue = lisValue;
    }

    public String getLasValue() {
        return lasValue;
    }

    public void setLasValue(String lasValue) {
        this.lasValue = lasValue;
    }

    public String getVerifiedValue() {
        return verifiedValue;
    }

    public void setVerifiedValue(String verifiedValue) {
        this.verifiedValue = verifiedValue;
    }

    public String getVerifiedDate() {
        return verifiedDate;
    }

    public void setVerifiedDate(String verifiedDate) {
        this.verifiedDate = verifiedDate;
    }

    public String getLabNo() {
        return labNo;
    }

    public void setLabNo(String labNo) {
        this.labNo = labNo;
    }
    
    
    
    public ParameterSelectionBO(){
        
    }

    public String getParameterId() {
        return parameterId;
    }

    public void setParameterId(String parameterId) {
        this.parameterId = parameterId;
    }

    public String getParameterDescription() {
        return parameterDescription;
    }

    public void setParameterDescription(String parameterDescription) {
        this.parameterDescription = parameterDescription;
    }

    public String getParameterUnit() {
        return parameterUnit;
    }

    public void setParameterUnit(String parameterUnit) {
        this.parameterUnit = parameterUnit;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    
}
