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

public class CPTReportingTemplate implements java.io.Serializable {

    public String cptId = "";
    public String cptDescription = "";
    public String performingPhysician = "";
    public String templateName = "";
    public String templateType = "CPT";
    public String report = "";
    public String comments = "";
    public String message = "";
    public String definedBy = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
