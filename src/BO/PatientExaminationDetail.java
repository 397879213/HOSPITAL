/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.io.Serializable;
import java.util.Objects;
import utilities.Constants;


import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */

@ManagedBean


public class PatientExaminationDetail implements Serializable {

    private String patientExaminationDetailId = "";
    private String consultancyId = "";
    
    private String completeOrderNo = "";
    private String orderDetailId = "";
    private String examDetailId = "";
    
    private String examDetailDescription = "";
    private String examId = "";
    private String specialityExamId = "";
    private String specialityExamDetailId = "";
    private String specialityExamDetailItemId = "";
    
    private String specialityId = "";
    private String specialityDescription = "";
    
    private String examDescription = "";
    private String remarks = "";
    private String value = Constants.no;
    private String type = "";
    private String examDetailItemId = "";
    private String examDetailItemDescription = "";
    
    private String detailOptionId = "";
    private String optionRemarks = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCompleteOrderNo() {
        return completeOrderNo;
    }

    public void setCompleteOrderNo(String completeOrderNo) {
        this.completeOrderNo = completeOrderNo;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    

    public String getDetailOptionId() {
        return detailOptionId;
    }

    public void setDetailOptionId(String detailOptionId) {
        this.detailOptionId = detailOptionId;
    }

    public String getOptionRemarks() {
        return optionRemarks;
    }

    public void setOptionRemarks(String optionRemarks) {
        this.optionRemarks = optionRemarks;
    }

    public String getSpecialityExamId() {
        return specialityExamId;
    }

    public void setSpecialityExamId(String specialityExamId) {
        this.specialityExamId = specialityExamId;
    }

    public String getSpecialityExamDetailId() {
        return specialityExamDetailId;
    }

    public String getExamDetailItemDescription() {
        return examDetailItemDescription;
    }

    public void setExamDetailItemDescription(String examDetailItemDescription) {
        this.examDetailItemDescription = examDetailItemDescription;
    }

    public void setSpecialityExamDetailId(String specialityExamDetailId) {
        this.specialityExamDetailId = specialityExamDetailId;
    }

    public String getSpecialityExamDetailItemId() {
        return specialityExamDetailItemId;
    }

    public void setSpecialityExamDetailItemId(String specialityExamDetailItemId) {
        this.specialityExamDetailItemId = specialityExamDetailItemId;
    }
    
    public String getExamDetailItemId() {
        return examDetailItemId;
    }

    public void setExamDetailItemId(String examDetailItemId) {
        this.examDetailItemId = examDetailItemId;
    }

    public String getPatientExaminationDetailId() {
        return patientExaminationDetailId;
    }

    public void setPatientExaminationDetailId(String patientExaminationDetailId) {
        this.patientExaminationDetailId = patientExaminationDetailId;
    }

    public String getConsultancyId() {
        return consultancyId;
    }

    public void setConsultancyId(String consultancyId) {
        this.consultancyId = consultancyId;
    }

    public String getExamDetailId() {
        return examDetailId;
    }

    public void setExamDetailId(String examDetailId) {
        this.examDetailId = examDetailId;
    }

    public String getExamDetailDescription() {
        return examDetailDescription;
    }

    public void setExamDetailDescription(String examDetailDescription) {
        this.examDetailDescription = examDetailDescription;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getExamDescription() {
        return examDescription;
    }

    public void setExamDescription(String examDescription) {
        this.examDescription = examDescription;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(String specialityId) {
        this.specialityId = specialityId;
    }

    public String getSpecialityDescription() {
        return specialityDescription;
    }

    public void setSpecialityDescription(String specialityDescription) {
        this.specialityDescription = specialityDescription;
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.patientExaminationDetailId);
        hash = 23 * hash + Objects.hashCode(this.consultancyId);
        hash = 23 * hash + Objects.hashCode(this.examDetailId);
        hash = 23 * hash + Objects.hashCode(this.examId);
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
        final PatientExaminationDetail other = (PatientExaminationDetail) obj;
        if (!Objects.equals(this.patientExaminationDetailId, other.patientExaminationDetailId)) {
            return false;
        }
        if (!Objects.equals(this.consultancyId, other.consultancyId)) {
            return false;
        }
        if (!Objects.equals(this.examDetailId, other.examDetailId)) {
            return false;
        }
        if (!Objects.equals(this.examId, other.examId)) {
            return false;
        }
        return true;
    }

}
