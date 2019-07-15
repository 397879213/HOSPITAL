/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class ImagingRota implements java.io.Serializable {

    public String sectionId = "";
    public String sectionLeadId = "";
    public String sectionLead = "";
    public String sectionConsultantId = "";
    public String sectionConsultant = "";
    public String reportingPhysician = "";
    public String reportingPhysicianId = "";
    public String fromDate = "";
    public String toDate = "";
    public String designation = "";
    public String message = "ok";
    public String assignBy = "";
    public String assignDate = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
