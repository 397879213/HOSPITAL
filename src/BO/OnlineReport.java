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


public class OnlineReport implements java.io.Serializable{
    
    public String patientId = "";
    public String patientName = "";
    public String gender = "";
    public String age = "";
    public String dob = "";
    public String completeOrderNo = "";
    public String orderDetailId = "";
    public String orderStatusId = "";
    public String invoiceNo = "";
    public String invoiceDate = "";
    public String accessCode = "";
    public String cptId = "";
    public String cptDescription = "";
    public String department = "";
    public String pdfServer = "";
    public String pdfFilePath = "";
    public String pdfFileName = "";
    public String pdfGenerated = "";
    public String reportName = "";
    public String reportGenerationTime = "";
    public String expectedReportTime = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
