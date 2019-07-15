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

public class CPTWiseProcedure implements java.io.Serializable {

    public String id = "";
    public String cptMedDescription = "";
    public String userId = "";
    public String userDescription = "";
    public String userDepartment = "";
    public String cptMedId = "";
    public String unit = "";
    public String procedureDescription = "";
    public String procedureId = "";
    public String position = "";
    public String status = "";
    public String defaultValue = "";
    public String reportGroup = "";
    public String comments = "";
    public String type = "";
    public String assignBy = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
