/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.io.Serializable;
import java.util.Objects;


import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */

@ManagedBean


public class PatientExamination implements Serializable {

    private String patientExaminationId = "";
    private String patientId = "";
    private String consultancyId = "";
    private String crtdBy = "";
    private String crtdDate = "";
    private String crtdTerminal = "";
    private String uptdBy = "";
    private String uptdDate = "";
    private String uptdTerminal = "";
    private String clinicId = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }

    public String getPatientExaminationId() {
        return patientExaminationId;
    }

    public void setPatientExaminationId(String patientExaminationId) {
        this.patientExaminationId = patientExaminationId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getConsultancyId() {
        return consultancyId;
    }

    public void setConsultancyId(String consultancyId) {
        this.consultancyId = consultancyId;
    }

    public String getCrtdBy() {
        return crtdBy;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }

    public String getCrtdDate() {
        return crtdDate;
    }

    public void setCrtdDate(String crtdDate) {
        this.crtdDate = crtdDate;
    }

    public String getCrtdTerminal() {
        return crtdTerminal;
    }

    public void setCrtdTerminal(String crtdTerminal) {
        this.crtdTerminal = crtdTerminal;
    }

    public String getUptdBy() {
        return uptdBy;
    }

    public void setUptdBy(String uptdBy) {
        this.uptdBy = uptdBy;
    }

    public String getUptdDate() {
        return uptdDate;
    }

    public void setUptdDate(String uptdDate) {
        this.uptdDate = uptdDate;
    }

    public String getUptdTerminal() {
        return uptdTerminal;
    }

    public void setUptdTerminal(String uptdTerminal) {
        this.uptdTerminal = uptdTerminal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.patientExaminationId);
        hash = 29 * hash + Objects.hashCode(this.patientId);
        hash = 29 * hash + Objects.hashCode(this.consultancyId);
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
        final PatientExamination other = (PatientExamination) obj;
        if (!Objects.equals(this.patientExaminationId, other.patientExaminationId)) {
            return false;
        }
        if (!Objects.equals(this.patientId, other.patientId)) {
            return false;
        }
        if (!Objects.equals(this.consultancyId, other.consultancyId)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
