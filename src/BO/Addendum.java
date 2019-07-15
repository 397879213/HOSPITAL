

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


public class Addendum implements java.io.Serializable {

    private String completeOrderNo = "";
    private String orderDetailId = "";
    private String addendum = "";
    private String addendumDate = "";
    private String eneteredBy = "";
    private String addendumBy = "";
    private String orderStatusId = "";
    private String patientId = "";
    private String patientName = "";
    private String studyDescription = "";
    private String rowId = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
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

    public String getAddendum() {
        return addendum;
    }

    public void setAddendum(String addendum) {
        this.addendum = addendum;
    }

    public String getAddendumDate() {
        return addendumDate;
    }

    public void setAddendumDate(String addendumDate) {
        this.addendumDate = addendumDate;
    }

    public String getAddendumBy() {
        return addendumBy;
    }

    public void setAddendumBy(String addendumBy) {
        this.addendumBy = addendumBy;
    }

    public String getEneteredBy() {
        return eneteredBy;
    }

    public void setEneteredBy(String eneteredBy) {
        this.eneteredBy = eneteredBy;
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
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

    public String getStudyDescription() {
        return studyDescription;
    }

    public void setStudyDescription(String studyDescription) {
        this.studyDescription = studyDescription;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

}
