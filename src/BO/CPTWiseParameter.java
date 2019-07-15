/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.util.Objects;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class CPTWiseParameter implements java.io.Serializable {

    private String displayName = "";
    private String selection1 = "N";
    private String caseStudyId = "";
    private String selectionActive1 = "";
    private String selection2 = "";
    private String selectionActive2 = "";
    private String id = "";
    private String cptDescription = "";
    private String isRequired = "";
    private String cptId = "";
    private String sectionId = "-";
    private String sectionDescription = "";

    private String isUpdated = "N";
    private String unit = "";
    private String parameterDescription = "";
    private String parameterId = "";
    private String parameterName = "";
    private String position = "";
    private String status = "";
    private String defaultValue = "";
    private String reportGroup = "";
    private String comments = "";
    private String userId = "";
    private String selection1Desc = "";
    private String selection2Desc = "";
    private String type = "";
    private String analyzerId = "";
    private String name = "";
    private String analyzerDesc = "";
    private String analyzerIdInsert = "";
    private String parameterDesc = "";
    private String minAge = "";
    private String maxAge = "";
    private String general = "";
    private String maxRange = "";
    private String minRange = "";
    private String gender = "";
    private String symbol = "";
    private String rangesId = "";
    private String actionDesc = "";
    private String emptyValue = "";
    
    private String actionId = "1200";
    private String paramTypeId = "";
    private String orderDetailId = "";
    private String completeOrderNo = "";
    private String result = "";
    //added attribute
    private String lisValue = "";
    private String lasValue = "";
    private String age = "";
    private String displayFront = "";
    private String rangesWithSymbol = "";
    private String reportPosition = "";

    private String paramaterType = "";//used to indentify wheather it is Image or Text or Numerical
    private String resultLov1 = "";
    private String resultLov2 = "";
    private String singlePath = "";
    private String actionPerformedId = "";
    private String actionDescription = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public CPTWiseParameter() {
    }

    public String getSelection1() {
        return selection1;
    }

    public void setSelection1(String selection1) {
        this.selection1 = selection1;
    }

    public String getSelectionActive1() {
        return selectionActive1;
    }

    public void setSelectionActive1(String selectionActive1) {
        this.selectionActive1 = selectionActive1;
    }

    public String getSelection2() {
        return selection2;
    }

    public void setSelection2(String selection2) {
        this.selection2 = selection2;
    }

    public String getIsUpdated() {
        return isUpdated;
    }

    public void setIsUpdated(String isUpdated) {
        this.isUpdated = isUpdated;
    }

    public String getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(String isRequired) {
        this.isRequired = isRequired;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getSelectionActive2() {
        return selectionActive2;
    }

    public void setSelectionActive2(String selectionActive2) {
        this.selectionActive2 = selectionActive2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getParameterDescription() {
        return parameterDescription;
    }

    public void setParameterDescription(String parameterDescription) {
        this.parameterDescription = parameterDescription;
    }

    public String getParameterId() {
        return parameterId;
    }

    public void setParameterId(String parameterId) {
        this.parameterId = parameterId;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionDescription() {
        return sectionDescription;
    }

    public void setSectionDescription(String sectionDescription) {
        this.sectionDescription = sectionDescription;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getPosition() {
        return position;
    }

    public String getCaseStudyId() {
        return caseStudyId;
    }

    public void setCaseStudyId(String caseStudyId) {
        this.caseStudyId = caseStudyId;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getReportGroup() {
        return reportGroup;
    }

    public void setReportGroup(String reportGroup) {
        this.reportGroup = reportGroup;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSelection1Desc() {
        return selection1Desc;
    }

    public void setSelection1Desc(String selection1Desc) {
        this.selection1Desc = selection1Desc;
    }

    public String getSelection2Desc() {
        return selection2Desc;
    }

    public void setSelection2Desc(String selection2Desc) {
        this.selection2Desc = selection2Desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnalyzerId() {
        return analyzerId;
    }

    public void setAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnalyzerDesc() {
        return analyzerDesc;
    }

    public void setAnalyzerDesc(String analyzerDesc) {
        this.analyzerDesc = analyzerDesc;
    }

    public String getAnalyzerIdInsert() {
        return analyzerIdInsert;
    }

    public void setAnalyzerIdInsert(String analyzerIdInsert) {
        this.analyzerIdInsert = analyzerIdInsert;
    }

    public String getParameterDesc() {
        return parameterDesc;
    }

    public void setParameterDesc(String parameterDesc) {
        this.parameterDesc = parameterDesc;
    }

    public String getMinAge() {
        return minAge;
    }

    public void setMinAge(String minAge) {
        this.minAge = minAge;
    }

    public String getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(String maxAge) {
        this.maxAge = maxAge;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public String getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(String maxRange) {
        this.maxRange = maxRange;
    }

    public String getMinRange() {
        return minRange;
    }

    public void setMinRange(String minRange) {
        this.minRange = minRange;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getRangesId() {
        return rangesId;
    }

    public void setRangesId(String rangesId) {
        this.rangesId = rangesId;
    }

    public String getActionDesc() {
        return actionDesc;
    }

    public void setActionDesc(String actionDesc) {
        this.actionDesc = actionDesc;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public String getParamTypeId() {
        return paramTypeId;
    }

    public void setParamTypeId(String paramTypeId) {
        this.paramTypeId = paramTypeId;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getCompleteOrderNo() {
        return completeOrderNo;
    }

    public void setCompleteOrderNo(String completeOrderNo) {
        this.completeOrderNo = completeOrderNo;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDisplayFront() {
        return displayFront;
    }

    public void setDisplayFront(String displayFront) {
        this.displayFront = displayFront;
    }

    public String getRangesWithSymbol() {
        return rangesWithSymbol;
    }

    public void setRangesWithSymbol(String rangesWithSymbol) {
        this.rangesWithSymbol = rangesWithSymbol;
    }

    public String getReportPosition() {
        return reportPosition;
    }

    public void setReportPosition(String reportPosition) {
        this.reportPosition = reportPosition;
    }

    public String getParamaterType() {
        return paramaterType;
    }

    public void setParameterType(String paramaterType) {
        this.paramaterType = paramaterType;
    }

    public String getResultLov1() {
        return resultLov1;
    }

    public void setResultLov1(String resultLov1) {
        this.resultLov1 = resultLov1;
    }

    public String getResultLov2() {
        return resultLov2;
    }

    public void setResultLov2(String resultLov2) {
        this.resultLov2 = resultLov2;
    }

    public String getSinglePath() {
        return singlePath;
    }

    public void setSinglePath(String singlePath) {
        this.singlePath = singlePath;
    }

    public String getActionPerformedId() {
        return actionPerformedId;
    }

    public void setActionPerformedId(String actionPerformedId) {
        this.actionPerformedId = actionPerformedId;
    }

    public String getActionDescription() {
        return actionDescription;
    }

    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    public String getEmptyValue() {
        return emptyValue;
    }

    public void setEmptyValue(String emptyValue) {
        this.emptyValue = emptyValue;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CPTWiseParameter other = (CPTWiseParameter) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
