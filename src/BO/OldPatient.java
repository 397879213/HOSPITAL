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


public class OldPatient implements java.io.Serializable{

    public String patientId = "";

    public String patientName = "";
    public String age = "";
    public String gender = "";
    public String testDescription = "";
    public String clinicHistory = "";
    public String protocol = "";
    public String result = "";
    public String resultPart1 = "";
    public String resultPart2 = "";
    public String conclusion = "";
    public String verfiedBy = "";
    public String reportDate = "";
    public String residentName = "";
    public String reportingConsultant = "";

    public String mrNo = "";
    public String modality = "";
    public String studyDescription = "";
    public String serverPath = "";
    public String filePath = "";
    public String fileName = "";

    public String section = "";

    public String completeDescription = "";
    public String restDescription = "";
    public String DescriptionNoHeader = "";

    public String toDate = "";
    public String frmDate = "";

    public String keyWord = "";
    private int rowIndex = 0;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
