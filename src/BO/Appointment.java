/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

/**
 *
 * @author Pacslink
 */
public class Appointment implements java.io.Serializable {

    public String id = "";
    public String clinicId = "";
    public String clinicDescription = "";
    public String CPTId = "";
    public String CPTDescription = "";
    public String slotType = "";
    public String slotTypeId = "";
    public String visitType = "";
    public String day = "";
    public String visitTypeId = "306";
    public String startTime = "";
    public String endTime = "";
    public String appointmentDate = "";
    public String location = "";
    public String locationId = "";
    public String appointmentToDate = "";
    public String appointmentFromDate = "";
    public String appointmentEndDate = "";
    public String patientId = "";
    public String registeredPatient = "";
    public String patientName = "";
    public String contactNumber = "";
    public String gender = "";
    public String age = "";
    public String completeOrderNo = "";
    public String orderDetailId = "";
    public String appointmentStatus = "";
    public String clinicStatus = "";
    public String clinicTypeId = "";
    public String appointmentGivenBy = "";
    public String appointmentGivenTerminal = "";
    public String appointmentGivenDate = "";
    public String notesRequired = "";

    public String appointmentConfirmedBy = "";
    public String appointmentConfirmedTerminal = "";
    public String appointmentConfirmedDate = "";

    public String appointmentRemarks = "";
    public String createdRemarks = "SCHEDULE APPOINTMENT CREATED";
    public String confirmationRemarks = "";
    public String appointmentCancelledBy = "";
    public String appointmentCancelledTerminal = "";
    public String appointmentNotes = "";
    private int rowIndex;
    public String sendSMS = "";
    public String referringPhysicianId;
    public String cancelRemarks;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
