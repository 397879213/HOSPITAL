/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

public class MDTReview implements java.io.Serializable {

    private String id = "";
    private String appointmentId = "";
    private String patientId = "";
    private String patientName = "";
    private String contactNo = "";
    private String age = "";
    private String gender = "";
    private String clinicId = "";
    private String clinicDescription = "";
    private String locationId = "";
    private String locationDescription = "";
    private String statusDescription = "";
    private String appointmentNotes = "";
    private String mdtPhysicians = "";
    private String orderStatusId = "";
    private String mdtReview = "";
    private String remarks = "";
    private String crtdDate = "";
    private String crtdBy = "";
    private String reviewDate = "";
    private String reviewBy = "";
    private String referringPhysician = "";
    private String referringPhysicianId = "";
    private String contactNumber = "";

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAppointmentNotes() {
        return appointmentNotes;
    }

    public void setAppointmentNotes(String appointmentNotes) {
        this.appointmentNotes = appointmentNotes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }

    public String getClinicDescription() {
        return clinicDescription;
    }

    public void setClinicDescription(String clinicDescription) {
        this.clinicDescription = clinicDescription;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getMdtPhysicians() {
        return mdtPhysicians;
    }

    public void setMdtPhysicians(String mdtPhysicians) {
        this.mdtPhysicians = mdtPhysicians;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getMdtReview() {
        return mdtReview;
    }

    public void setMdtReview(String mdtReview) {
        this.mdtReview = mdtReview;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCrtdDate() {
        return crtdDate;
    }

    public void setCrtdDate(String crtdDate) {
        this.crtdDate = crtdDate;
    }

    public String getCrtdBy() {
        return crtdBy;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }

    public String getReferringPhysician() {
        return referringPhysician;
    }

    public void setReferringPhysician(String referringPhysician) {
        this.referringPhysician = referringPhysician;
    }

    public String getReferringPhysicianId() {
        return referringPhysicianId;
    }

    public void setReferringPhysicianId(String referringPhysicianId) {
        this.referringPhysicianId = referringPhysicianId;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getReviewBy() {
        return reviewBy;
    }

    public void setReviewBy(String reviewBy) {
        this.reviewBy = reviewBy;
    }

}
