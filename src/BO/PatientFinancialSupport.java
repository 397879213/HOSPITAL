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

public class PatientFinancialSupport implements java.io.Serializable {

    private String patientId = "";
    private String completeOrderNo = "";
    private String supportType = "";
    private float supportAmount = 0F;
    private float percentageSupport = 0.0F;
    private String comments = "";
    private String zakatFormNo = "";

    private String terminalId = "";
    private String transactionBy = "";

    private String totalAmount = "";
    private String transactionDate = "";
    private int rowIndex;

    private String supportGivenBy = "";
    private String supportGivenDate = "";
    private String financialSupportAmount = "";
    private String supportComments = "";

    public String getSupportComments() {
        return supportComments;
    }

    public void setSupportComments(String supportComments) {
        this.supportComments = supportComments;
    }

    public String getFinancialSupportAmount() {
        return financialSupportAmount;
    }

    public void setFinancialSupportAmount(String financialSupportAmount) {
        this.financialSupportAmount = financialSupportAmount;
    }

    public String getSupportGivenBy() {
        return supportGivenBy;
    }

    public void setSupportGivenBy(String supportGivenBy) {
        this.supportGivenBy = supportGivenBy;
    }

    public String getSupportGivenDate() {
        return supportGivenDate;
    }

    public void setSupportGivenDate(String supportGivenDate) {
        this.supportGivenDate = supportGivenDate;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
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

    public String getSupportType() {
        return supportType;
    }

    public void setSupportType(String supportType) {
        this.supportType = supportType;
    }

    public float getSupportAmount() {
        return supportAmount;
    }

    public void setSupportAmount(float supportAmount) {
        this.supportAmount = supportAmount;
    }

    public float getPercentageSupport() {
        return percentageSupport;
    }

    public void setPercentageSupport(float percentageSupport) {
        this.percentageSupport = percentageSupport;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getZakatFormNo() {
        return zakatFormNo;
    }

    public void setZakatFormNo(String zakatFormNo) {
        this.zakatFormNo = zakatFormNo;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTransactionBy() {
        return transactionBy;
    }

    public void setTransactionBy(String transactionBy) {
        this.transactionBy = transactionBy;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

}
