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

public class CPTReportTiming implements java.io.Serializable {

    public String locationId = "";
    public String locationName = "";
    public String cptId = "";
    public String id = "";
    public String cptDescription = "";
    public String duration = "";
    public String sundayReport = "";
    public String deliveryTime = "";
    public String sectionId = "";
    public String departmentId = "";
    public String departmentName = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
