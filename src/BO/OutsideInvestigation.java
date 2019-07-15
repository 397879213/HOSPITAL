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


public class OutsideInvestigation implements java.io.Serializable{
    private String patientId = "";
    private String completeOrderNo = "";
    private String orderDetailId = "";
    private String cptId = "";
    private String cptDescription = "";
    private String healthCareFacility = "";
    private String testName = "";
    private String report = "";
    private String reportDate = "";
    private String rowId = "";
    private int rowIndex;

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

    public String getHealthCareFacility() {
        return healthCareFacility;
    }

    public void setHealthCareFacility(String healthCareFacility) {
        this.healthCareFacility = healthCareFacility;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
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
        hash = 79 * hash + Objects.hashCode(this.healthCareFacility);
        hash = 79 * hash + Objects.hashCode(this.testName);
        hash = 79 * hash + Objects.hashCode(this.report);
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
        if (!Objects.equals(this.healthCareFacility, other.healthCareFacility)) {
            return false;
        }
        if (!Objects.equals(this.testName, other.testName)) {
            return false;
        }
        if (!Objects.equals(this.report, other.report)) {
            return false;
        }
        return true;
    }
    
    
    
}
