 
package BO;

import java.util.Objects;
 

public class OutsideInvestigation implements java.io.Serializable{
    private String patientId = "";
    private String completeOrderNo = "";
    private String orderDetailId = "";
    private String cptId = "";
    private String cptDescription = "";
    private String healthCareFacilityId = "";
    private String healthCareFacilityDescription = "";
    private String testName = "";
    private String reportRermarks = "";
    private String reportDate = "";
    private String reportDay = "";
    private String isReportAttached = "";
    private String id = "";
    private String rowId = "";
    private int rowIndex;

    public String getReportDay() {
        return reportDay;
    }

    public void setReportDay(String reportDay) {
        this.reportDay = reportDay;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getIsReportAttached() {
        return isReportAttached;
    }

    public void setIsReportAttached(String isReportAttached) {
        this.isReportAttached = isReportAttached;
    }

    public String getHealthCareFacilityDescription() {
        return healthCareFacilityDescription;
    }

    public void setHealthCareFacilityDescription(String healthCareFacilityDescription) {
        this.healthCareFacilityDescription = healthCareFacilityDescription;
    }
    
    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
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

    public String getCptId() {
        return cptId;
    }

    public void setCptId(String cptId) {
        this.cptId = cptId;
    }

    public String getCptDescription() {
        return cptDescription;
    }

    public void setCptDescription(String cptDescription) {
        this.cptDescription = cptDescription;
    }

    public String getHealthCareFacilityId() {
        return healthCareFacilityId;
    }

    public void setHealthCareFacilityId(String healthCareFacilityId) {
        this.healthCareFacilityId = healthCareFacilityId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getReportRermarks() {
        return reportRermarks;
    }

    public void setReportRermarks(String reportRermarks) {
        this.reportRermarks = reportRermarks;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.patientId);
        hash = 79 * hash + Objects.hashCode(this.completeOrderNo);
        hash = 79 * hash + Objects.hashCode(this.orderDetailId);
        hash = 79 * hash + Objects.hashCode(this.cptId);
        hash = 79 * hash + Objects.hashCode(this.cptDescription);
        hash = 79 * hash + Objects.hashCode(this.healthCareFacilityId);
        hash = 79 * hash + Objects.hashCode(this.testName);
        hash = 79 * hash + Objects.hashCode(this.reportRermarks);
        hash = 79 * hash + Objects.hashCode(this.reportDate);
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
        final OutsideInvestigation other = (OutsideInvestigation) obj;
        if (!Objects.equals(this.patientId, other.patientId)) {
            return false;
        }
        if (!Objects.equals(this.completeOrderNo, other.completeOrderNo)) {
            return false;
        }
        if (!Objects.equals(this.orderDetailId, other.orderDetailId)) {
            return false;
        }
        if (!Objects.equals(this.cptId, other.cptId)) {
            return false;
        }
        if (!Objects.equals(this.cptDescription, other.cptDescription)) {
            return false;
        }
        if (!Objects.equals(this.healthCareFacilityId, other.healthCareFacilityId)) {
            return false;
        }
        if (!Objects.equals(this.testName, other.testName)) {
            return false;
        }
        if (!Objects.equals(this.reportRermarks, other.reportRermarks)) {
            return false;
        }
        return true;
    }
    
    
    
}
