/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Pacslink
 */
public class ClinicDetail implements Serializable {

    private String clinicDetailId = "";
    private String clinicId = "";
    private String day = "";
    private String startTime = "";
    private String endTime = "";
    private String maxLimit = "";
    private String overLimitStatus = "";
    private String overLimit = "";
    private String active = "";
    private String clinicDescription = "";
    private String appointmentDate = "";
    private String reserveSlots = "";
    private String availableSlots = "";
    private String contactNo = "";
    private String userName = "";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    private int rowIndex;

    public String getReserveSlots() {
        return reserveSlots;
    }

    public void setReserveSlots(String reserveSlots) {
        this.reserveSlots = reserveSlots;
    }

    public String getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(String availableSlots) {
        this.availableSlots = availableSlots;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getClinicDescription() {
        return clinicDescription;
    }

    public void setClinicDescription(String clinicDescription) {
        this.clinicDescription = clinicDescription;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getClinicDetailId() {
        return clinicDetailId;
    }

    public void setClinicDetailId(String clinicDetailId) {
        this.clinicDetailId = clinicDetailId;
    }

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(String maxLimit) {
        this.maxLimit = maxLimit;
    }

    public String getOverLimitStatus() {
        return overLimitStatus;
    }

    public void setOverLimitStatus(String overLimitStatus) {
        this.overLimitStatus = overLimitStatus;
    }

    public String getOverLimit() {
        return overLimit;
    }

    public void setOverLimit(String overLimit) {
        this.overLimit = overLimit;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.clinicDetailId);
        hash = 29 * hash + Objects.hashCode(this.clinicId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClinicDetail other = (ClinicDetail) obj;
        if (!Objects.equals(this.clinicDetailId, other.clinicDetailId)) {
            return false;
        }
        if (!Objects.equals(this.clinicId, other.clinicId)) {
            return false;
        }
        return true;
    }

}
