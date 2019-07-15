/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.Hospital;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean
public class FluidBalanceRecord {

    private String fluidInputId = "";
    private String fluidOutputId = "";
    private String id = "";
    private String patientId = "";
    private String admissionNo = "";
    private String inputFluidTypeId = "";
    private String inputFluidDescription = "";
    private String inputQuantity = "";
    private String outputQuantity = "";
    private String totalInput = "";
    private String totalOutput = "";
    private String rate = "";
    private String seen = "";
    private String inputRemarks = "";
    private String outputRemarks = "";
    private String outputMasterId = "";
    private String outputDetailId = "";
    private String outputTypeId = "";
    private String outputTypeDescription = "";
    private String inputTakenTime = "";
    private String inputTakenDate = "";
    private String sourceId = "";
    private String sourceDescription = "";
    private String inputShiftId = "";
    private String inputShiftDescription = "";
    private String outputShiftId = "";
    private String outputShiftDescription = "";
    private String fullName = "";
    private String inputMasterId = "";
    private String inputDetailId = "";
    private String userName = "";
    private int rowIndex;
    private String outputTakenTime = "";
    private String outputTakenDate = "";

    public String getOutputRemarks() {
        return outputRemarks;
    }

    public void setOutputRemarks(String outputRemarks) {
        this.outputRemarks = outputRemarks;
    }

    public String getFluidInputId() {
        return fluidInputId;
    }

    public void setFluidInputId(String fluidInputId) {
        this.fluidInputId = fluidInputId;
    }

    public String getFluidOutputId() {
        return fluidOutputId;
    }

    public void setFluidOutputId(String fluidOutputId) {
        this.fluidOutputId = fluidOutputId;
    }

    public String getInputTakenTime() {
        return inputTakenTime;
    }

    public void setInputTakenTime(String inputTakenTime) {
        this.inputTakenTime = inputTakenTime;
    }

    public String getInputTakenDate() {
        return inputTakenDate;
    }

    public void setInputTakenDate(String inputTakenDate) {
        this.inputTakenDate = inputTakenDate;
    }

    public String getOutputTakenTime() {
        return outputTakenTime;
    }

    public void setOutputTakenTime(String outputTakenTime) {
        this.outputTakenTime = outputTakenTime;
    }

    public String getOutputTakenDate() {
        return outputTakenDate;
    }

    public void setOutputTakenDate(String outputTakenDate) {
        this.outputTakenDate = outputTakenDate;
    }

    public String getOutputShiftId() {
        return outputShiftId;
    }

    public void setOutputShiftId(String outputShiftId) {
        this.outputShiftId = outputShiftId;
    }

    public String getOutputShiftDescription() {
        return outputShiftDescription;
    }

    public void setOutputShiftDescription(String outputShiftDescription) {
        this.outputShiftDescription = outputShiftDescription;
    }

    public FluidBalanceRecord() {

    }

    public FluidBalanceRecord(String inputFluidDescription, String sourceDescription,
            String fluidQuantity, String fluidRate) {
        this.inputFluidDescription = inputFluidDescription;
        this.sourceDescription = sourceDescription;
        this.inputQuantity = fluidQuantity;
        this.rate = fluidRate;
    }

    public String getOutputQuantity() {
        return outputQuantity;
    }

    public void setOutputQuantity(String outputQuantity) {
        this.outputQuantity = outputQuantity;
    }

    public String getInputShiftId() {
        return inputShiftId;
    }

    public void setInputShiftId(String inputShiftId) {
        this.inputShiftId = inputShiftId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getOutputDetailId() {
        return outputDetailId;
    }

    public void setOutputDetailId(String outputDetailId) {
        this.outputDetailId = outputDetailId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInputMasterId() {
        return inputMasterId;
    }

    public void setInputMasterId(String inputMasterId) {
        this.inputMasterId = inputMasterId;
    }

    public String getInputDetailId() {
        return inputDetailId;
    }

    public void setInputDetailId(String inputDetailId) {
        this.inputDetailId = inputDetailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getInputShiftDescription() {
        return inputShiftDescription;
    }

    public void setInputShiftDescription(String inputShiftDescription) {
        this.inputShiftDescription = inputShiftDescription;
    }

    public String getSourceDescription() {
        return sourceDescription;
    }

    public void setSourceDescription(String sourceDescription) {
        this.sourceDescription = sourceDescription;
    }

    public String getTakenTime() {
        return inputTakenTime;
    }

    public void setTakenTime(String takenTime) {
        this.inputTakenTime = takenTime;
    }

    public String getTakenDate() {
        return inputTakenDate;
    }

    public void setTakenDate(String takenDate) {
        this.inputTakenDate = takenDate;
    }

    public String getInputFluidDescription() {
        return inputFluidDescription;
    }

    public void setInputFluidDescription(String inputFluidDescription) {
        this.inputFluidDescription = inputFluidDescription;
    }

    public String getOutputTypeId() {
        return outputTypeId;
    }

    public void setOutputTypeId(String outputTypeId) {
        this.outputTypeId = outputTypeId;
    }

    public String getInputFluidTypeId() {
        return inputFluidTypeId;
    }

    public void setInputFluidTypeId(String inputFluidTypeId) {
        this.inputFluidTypeId = inputFluidTypeId;
    }

    public String getInputRemarks() {
        return inputRemarks;
    }

    public void setInputRemarks(String inputRemarks) {
        this.inputRemarks = inputRemarks;
    }

    public String getOutputMasterId() {
        return outputMasterId;
    }

    public void setOutputMasterId(String outputMasterId) {
        this.outputMasterId = outputMasterId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getOutputTypeDescription() {
        return outputTypeDescription;
    }

    public void setOutputTypeDescription(String outputTypeDescription) {
        this.outputTypeDescription = outputTypeDescription;
    }

    public String getInputQuantity() {
        return inputQuantity;
    }

    public void setInputQuantity(String inputQuantity) {
        this.inputQuantity = inputQuantity;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getTotalInput() {
        return totalInput;
    }

    public void setTotalInput(String totalInput) {
        this.totalInput = totalInput;
    }

    public String getSeen() {
        return seen;
    }

    public void setSeen(String seen) {
        this.seen = seen;
    }

    public String getTotalOutput() {
        return totalOutput;
    }

    public void setTotalOutput(String totalOutput) {
        this.totalOutput = totalOutput;
    }

}
