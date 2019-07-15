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

public class AnalyzerOrderData implements java.io.Serializable {

    public String cptId = "";
    public String clientId = "";
    public String description = "";
    public String reportDisplayName = "";
    public String sectionId = "";
    public String departmentId = "";
    public String testLimit = "";
    public String previousTestLimit = "";

    public String transactionType = "";
    public String consultantId = "";
    public String consultantName = "";

    public String clinicId = "";
    public String clinicDescription = "";
    public String referringPhysicianShare = "";
    public String performingPhysicianShare = "";
    public String performingReqDescription = "";

    public String specimenId = "";
    public String specimenDescription = "";
    public String clientName = "";

    public String price = "";
    public String clientPrice = "";
    public String orderTypeId = "";
    public String discount = "0";
    public String percentageDiscount = "0";
    public String invoiced = "";
    public String totalAmount = "";
    public String stat = "N";
    public String statPrice = "";
    public String status = "";
    public String reportDay = "";
    public String reportDayDescription = "";

    public String reportTimingId = "";
    public String reportTimingDescription = "";

    public String reportingFormatId = "";
    public String reportingFormatDescription = "";

    public String clientStatus = "";
    public String contractStatus = "";
    public String clientCPTStatus = "";

    public String contrastReq = "";
    public String contrastReqDescription = "";
    public String techReq = "";
    public String performingReq = "N";
    public String techReqDescription = "";
    public String historyReq = "";
    public String historyReqDescription = "";
    public String imageReq = "";
    public String imageReqDescription = "";

    public String isPackage = "";
    public String isPackageDescription = "";

    public String load = "";

    public String locationId = "";
    public String performingLocationId = "";
    
    public String locationDescrption = "";
    public String defaultCPTId = "";
    public String lastCPTId = "";
    public String defaultCPTDescription = "";
    
    public String departmentDescription = "";
    public String sectionDescription = "";
    public String performingLocationDescription = "";
    
    public String parameter = "";
    public String position = "";
    public String unit = "";
    public String reportName = "";
    public String reportDescription = "";
    public String comments = "";
    public String locationWiseTime = "";

    //SETUP TABLES
     
    public String tableColumnId = "";
    public String tableRowId = "";
    public String property = "";
    public String setupTableColumnId = "";
    public String setupId = "";
    public String activeProperty = "";

    public String cptBreakupDesc = "";
    public String cptBreakupCost = "";
    public String cptItemId = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getCptId() {
        return cptId;
    }

    public void setCptId(String cptId) {
        this.cptId = cptId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReportDisplayName() {
        return reportDisplayName;
    }

    public void setReportDisplayName(String reportDisplayName) {
        this.reportDisplayName = reportDisplayName;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getTestLimit() {
        return testLimit;
    }

    public void setTestLimit(String testLimit) {
        this.testLimit = testLimit;
    }

    public String getPreviousTestLimit() {
        return previousTestLimit;
    }

    public void setPreviousTestLimit(String previousTestLimit) {
        this.previousTestLimit = previousTestLimit;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(String consultantId) {
        this.consultantId = consultantId;
    }

    public String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
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

    public String getReferringPhysicianShare() {
        return referringPhysicianShare;
    }

    public void setReferringPhysicianShare(String referringPhysicianShare) {
        this.referringPhysicianShare = referringPhysicianShare;
    }

    public String getPerformingPhysicianShare() {
        return performingPhysicianShare;
    }

    public void setPerformingPhysicianShare(String performingPhysicianShare) {
        this.performingPhysicianShare = performingPhysicianShare;
    }

    public String getPerformingReqDescription() {
        return performingReqDescription;
    }

    public void setPerformingReqDescription(String performingReqDescription) {
        this.performingReqDescription = performingReqDescription;
    }

    public String getSpecimenId() {
        return specimenId;
    }

    public void setSpecimenId(String specimenId) {
        this.specimenId = specimenId;
    }

    public String getSpecimenDescription() {
        return specimenDescription;
    }

    public void setSpecimenDescription(String specimenDescription) {
        this.specimenDescription = specimenDescription;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getClientPrice() {
        return clientPrice;
    }

    public void setClientPrice(String clientPrice) {
        this.clientPrice = clientPrice;
    }

    public String getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(String percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public String getInvoiced() {
        return invoiced;
    }

    public void setInvoiced(String invoiced) {
        this.invoiced = invoiced;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getStatPrice() {
        return statPrice;
    }

    public void setStatPrice(String statPrice) {
        this.statPrice = statPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReportDay() {
        return reportDay;
    }

    public void setReportDay(String reportDay) {
        this.reportDay = reportDay;
    }

    public String getReportDayDescription() {
        return reportDayDescription;
    }

    public void setReportDayDescription(String reportDayDescription) {
        this.reportDayDescription = reportDayDescription;
    }

    public String getReportTiming() {
        return reportTimingId;
    }

    public void setReportTiming(String reportTiming) {
        this.reportTimingId = reportTiming;
    }

    public String getReportTimingDescription() {
        return reportTimingDescription;
    }

    public void setReportTimingDescription(String reportTimingDescription) {
        this.reportTimingDescription = reportTimingDescription;
    }

    public String getReportingFormatId() {
        return reportingFormatId;
    }

    public void setReportingFormatId(String reportingFormatId) {
        this.reportingFormatId = reportingFormatId;
    }

    public String getReportingFormatDescription() {
        return reportingFormatDescription;
    }

    public void setReportingFormatDescription(String reportingFormatDescription) {
        this.reportingFormatDescription = reportingFormatDescription;
    }

    public String getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    public String getClientCPTStatus() {
        return clientCPTStatus;
    }

    public void setClientCPTStatus(String clientCPTStatus) {
        this.clientCPTStatus = clientCPTStatus;
    }

    public String getContrastReq() {
        return contrastReq;
    }

    public void setContrastReq(String contrastReq) {
        this.contrastReq = contrastReq;
    }

    public String getContrastReqDescription() {
        return contrastReqDescription;
    }

    public void setContrastReqDescription(String contrastReqDescription) {
        this.contrastReqDescription = contrastReqDescription;
    }

    public String getTechReq() {
        return techReq;
    }

    public void setTechReq(String techReq) {
        this.techReq = techReq;
    }

    public String getPerformingReq() {
        return performingReq;
    }

    public void setPerformingReq(String performingReq) {
        this.performingReq = performingReq;
    }

    public String getTechReqDescription() {
        return techReqDescription;
    }

    public void setTechReqDescription(String techReqDescription) {
        this.techReqDescription = techReqDescription;
    }

    public String getHistoryReq() {
        return historyReq;
    }

    public void setHistoryReq(String historyReq) {
        this.historyReq = historyReq;
    }

    public String getHistoryReqDescription() {
        return historyReqDescription;
    }

    public void setHistoryReqDescription(String historyReqDescription) {
        this.historyReqDescription = historyReqDescription;
    }

    public String getImageReq() {
        return imageReq;
    }

    public void setImageReq(String imageReq) {
        this.imageReq = imageReq;
    }

    public String getImageReqDescription() {
        return imageReqDescription;
    }

    public void setImageReqDescription(String imageReqDescription) {
        this.imageReqDescription = imageReqDescription;
    }

    public String getIsPackage() {
        return isPackage;
    }

    public void setIsPackage(String isPackage) {
        this.isPackage = isPackage;
    }

    public String getIsPackageDescription() {
        return isPackageDescription;
    }

    public void setIsPackageDescription(String isPackageDescription) {
        this.isPackageDescription = isPackageDescription;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationDescrption() {
        return locationDescrption;
    }

    public void setLocationDescrption(String locationDescrption) {
        this.locationDescrption = locationDescrption;
    }

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }

    public String getSectionDescription() {
        return sectionDescription;
    }

    public void setSectionDescription(String sectionDescription) {
        this.sectionDescription = sectionDescription;
    }

    public String getPerformingLocationDescription() {
        return performingLocationDescription;
    }

    public void setPerformingLocationDescription(String performingLocationDescription) {
        this.performingLocationDescription = performingLocationDescription;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getLocationWiseTime() {
        return locationWiseTime;
    }

    public void setLocationWiseTime(String locationWiseTime) {
        this.locationWiseTime = locationWiseTime;
    }

    public String getTableColumnId() {
        return tableColumnId;
    }

    public void setTableColumnId(String tableColumnId) {
        this.tableColumnId = tableColumnId;
    }

    public String getTableRowId() {
        return tableRowId;
    }

    public void setTableRowId(String tableRowId) {
        this.tableRowId = tableRowId;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getSetupTableColumnId() {
        return setupTableColumnId;
    }

    public void setSetupTableColumnId(String setupTableColumnId) {
        this.setupTableColumnId = setupTableColumnId;
    }

    public String getSetupId() {
        return setupId;
    }

    public void setSetupId(String setupId) {
        this.setupId = setupId;
    }

    public String getActiveProperty() {
        return activeProperty;
    }

    public void setActiveProperty(String activeProperty) {
        this.activeProperty = activeProperty;
    }

    public String getCptBreakupDesc() {
        return cptBreakupDesc;
    }

    public void setCptBreakupDesc(String cptBreakupDesc) {
        this.cptBreakupDesc = cptBreakupDesc;
    }

    public String getCptBreakupCost() {
        return cptBreakupCost;
    }

    public void setCptBreakupCost(String cptBreakupCost) {
        this.cptBreakupCost = cptBreakupCost;
    }

    public String getCptItemId() {
        return cptItemId;
    }

    public void setCptItemId(String cptItemId) {
        this.cptItemId = cptItemId;
    }

    public String getPerformingLocationId() {
        return performingLocationId;
    }

    public void setPerformingLocationId(String performingLocationId) {
        this.performingLocationId = performingLocationId;
    }
    
    
}
