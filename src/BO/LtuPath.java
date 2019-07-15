package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class LtuPath implements java.io.Serializable {
   
    public String transplantNo = "";
    public String supportPerson = "";
    public String height = "";
    public String weight = "";
    public String bmi = "";
    public String bsa = "";
    public String slv = "";
    public String ctp = "";
    public String ctpDate = "";
    public String meld = "";
    public String meldDate = "";
    public String cnic = "";
    public String bloodGroup = "";
    public String dateOfWorkshop = "";
    public String diagnosis = "";
    public String history = "";
    public String comments = "";
    public String guardianContactNo = "";

    public String getGuardianContactNo() {
        return guardianContactNo;
    }

    public void setGuardianContactNo(String guardianContactNo) {
        this.guardianContactNo = guardianContactNo;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getTransplantNo() {
        return transplantNo;
    }

    public void setTransplantNo(String transplantNo) {
        this.transplantNo = transplantNo;
    }

    public String getSupportPerson() {
        return supportPerson;
    }

    public void setSupportPerson(String supportPerson) {
        this.supportPerson = supportPerson;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getBsa() {
        return bsa;
    }

    public void setBsa(String bsa) {
        this.bsa = bsa;
    }

    public String getSlv() {
        return slv;
    }

    public void setSlv(String slv) {
        this.slv = slv;
    }

    public String getCtp() {
        return ctp;
    }

    public void setCtp(String ctp) {
        this.ctp = ctp;
    }

    public String getCtpDate() {
        return ctpDate;
    }

    public void setCtpDate(String ctpDate) {
        this.ctpDate = ctpDate;
    }

    public String getMeld() {
        return meld;
    }

    public void setMeld(String meld) {
        this.meld = meld;
    }

    public String getMeldDate() {
        return meldDate;
    }

    public void setMeldDate(String meldDate) {
        this.meldDate = meldDate;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDateOfWorkshop() {
        return dateOfWorkshop;
    }

    public void setDateOfWorkshop(String dateOfWorkshop) {
        this.dateOfWorkshop = dateOfWorkshop;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

}
