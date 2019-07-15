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


public class PatientExam implements Serializable {
    
    private String examId = "";
    private String examDescription = "";
    private String specialityExamId = "";
    private String specialityWiseExamId = "";
    private String specialityId = "";
    
    
    private String specialityDescription = "";
    private String opdExamDescription = "";
    private String examLeftRight = "";
    private String saveType = "";
    
    private String active = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
    public String getExamLeftRight() {
        return examLeftRight;
    }

    public void setExamLeftRight(String examLeftRight) {
        this.examLeftRight = examLeftRight;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String patientExamId) {
        this.examId = patientExamId;
    }

    public String getExamDescription() {
        return examDescription;
    }

    public void setExamDescription(String patientExamDescription) {
        this.examDescription = patientExamDescription;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getSaveType() {
        return saveType;
    }

    public void setSaveType(String saveType) {
        this.saveType = saveType;
    }

    public String getSpecialityWiseExamId() {
        return specialityWiseExamId;
    }

    public void setSpecialityWiseExamId(String specialityWiseExamId) {
        this.specialityWiseExamId = specialityWiseExamId;
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.examId);
        return hash;
    }

    public String getSpecialityExamId() {
        return specialityExamId;
    }

    public void setSpecialityExamId(String specialityExamId) {
        this.specialityExamId = specialityExamId;
    }

    public String getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(String specialityId) {
        this.specialityId = specialityId;
    }

    public String getOpdExamDescription() {
        return opdExamDescription;
    }

    public void setOpdExamDescription(String opdExamDescription) {
        this.opdExamDescription = opdExamDescription;
    }

    public String getSpecialityDescription() {
        return specialityDescription;
    }

    public void setSpecialityDescription(String specialityDescription) {
        this.specialityDescription = specialityDescription;
    }

  
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PatientExam other = (PatientExam) obj;
        if (!Objects.equals(this.examId, other.examId)) {
            return false;
        }
        return true;
    }

    
    
}
