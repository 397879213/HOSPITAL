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
public class PatientNotes {

    private String patientNoteId = "";
    private String addendum = "";
    private String id = "";
    private String patientId = "";
    private String notes = "";
    private String noteReferenceId = "0";
    private String orderLocationId = "";
    private String orderLocationDescription = "";
    private String orderStatusId = "";
    private String statusDescription = "";
    private String notesBy = "";
    private String notesDate = "";
    private String isFinal = "";
    private String crtdBy = "";
    private String crtdDate = "";
    private String crtdTerminalId = "";
    private String finalBy = "";
    private String finalDate = "";
    private String finalTerminalId = "";
    
    
    private String noteType = "";
    private String noteTypeId = "";
    private String noteFinalBy = "";

    public String getPatientNoteId() {
        return patientNoteId;
    
    }

    public String getFinalBy() {
        return finalBy;
    }

    public void setFinalBy(String finalBy) {
        this.finalBy = finalBy;
    }

    public String getNoteTypeId() {
        return noteTypeId;
    }

    public void setNoteTypeId(String noteTypeId) {
        this.noteTypeId = noteTypeId;
    }
    

    public void setPatientNoteId(String patientNoteId) {
        this.patientNoteId = patientNoteId;
    }

    public String getAddendum() {
        return addendum;
    }

    public void setAddendum(String addendum) {
        this.addendum = addendum;
    }
    
    public String getNoteReferenceId() {
        return noteReferenceId;
    }

    public void setNoteReferenceId(String noteReferenceId) {
        this.noteReferenceId = noteReferenceId;
    }

    private int rowIndex;

    private String fromDate = "";
    private String toDate = "";

    public String getNoteFinalBy() {
        return noteFinalBy;
    }

    public void setNoteFinalBy(String noteFinalBy) {
        this.noteFinalBy = noteFinalBy;
    }

    public String getCrtdDate() {
        return crtdDate;
    }

    public void setCrtdDate(String crtdDate) {
        this.crtdDate = crtdDate;
    }

    public String getCrtdTerminalId() {
        return crtdTerminalId;
    }

    public void setCrtdTerminalId(String crtdTerminalId) {
        this.crtdTerminalId = crtdTerminalId;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }

    public String getFinalTerminalId() {
        return finalTerminalId;
    }

    public void setFinalTerminalId(String finalTerminalId) {
        this.finalTerminalId = finalTerminalId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getNoteType() {
        return noteType;
    }

    public void setNoteType(String noteType) {
        this.noteType = noteType;
    }

    public String getCrtdBy() {
        return crtdBy;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }

    public String getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(String isFinal) {
        this.isFinal = isFinal;
    }

    public String getOrderLocationId() {
        return orderLocationId;
    }

    public void setOrderLocationId(String orderLocationId) {
        this.orderLocationId = orderLocationId;
    }

    public String getOrderLocationDescription() {
        return orderLocationDescription;
    }

    public void setOrderLocationDescription(String orderLocationDescription) {
        this.orderLocationDescription = orderLocationDescription;
    }

    public String getNotesBy() {
        return notesBy;
    }

    public void setNotesBy(String notesBy) {
        this.notesBy = notesBy;
    }

    public String getNotesDate() {
        return notesDate;
    }

    public void setNotesDate(String notesDate) {
        this.notesDate = notesDate;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

}
