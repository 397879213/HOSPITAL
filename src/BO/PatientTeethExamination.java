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


public class PatientTeethExamination implements java.io.Serializable{
        
    public String id = "";
    public String consultancyId = "";
    public String teethId = "";
    public String teethDescription = "";
    public String examDetailId = "";
    public String examDetailDescription = "";
    public String teethDiseaseTypeId = "";
    public String teethTypeDescription = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
