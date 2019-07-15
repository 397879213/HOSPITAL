/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Danish
 */
@ManagedBean

public class DesignationSearch implements java.io.Serializable {

    private String pofDesgId = "";
    private String pofDesgDescription = "";
    private String pofGradeId = "";
    private String pofGradeDescription = "";
    private String childAbove12 = "";
    private String childUnder12 = "";
    private String spouse = "";
    private String parents = "";
    private String self = "";
    private String pofClass = "";
    private String verifiedStatus = "";
    private String verifiedDate = "";
    private String verifiedTerminalId = "";

    public String getVerifiedStatus() {
        return verifiedStatus;
    }

    public void setVerifiedStatus(String verifiedStatus) {
        this.verifiedStatus = verifiedStatus;
    }

    public String getVerifiedDate() {
        return verifiedDate;
    }

    public void setVerifiedDate(String verifiedDate) {
        this.verifiedDate = verifiedDate;
    }

    public String getVerifiedTerminalId() {
        return verifiedTerminalId;
    }

    public void setVerifiedTerminalId(String verifiedTerminalId) {
        this.verifiedTerminalId = verifiedTerminalId;
    }

    public String getPofDesgId() {
        return pofDesgId;
    }

    public void setPofDesgId(String pofDesgId) {
        this.pofDesgId = pofDesgId;
    }

    public String getPofDegDescription() {
        return pofDesgDescription;
    }

    public void setPofDegDescription(String pofDegDescription) {
        this.pofDesgDescription = pofDegDescription;
    }

    public String getPofGradeId() {
        return pofGradeId;
    }

    public void setPofGradeId(String pofGradeId) {
        this.pofGradeId = pofGradeId;
    }

    public String getPofGradeDescription() {
        return pofGradeDescription;
    }

    public void setPofGradeDescription(String pofGradeDescription) {
        this.pofGradeDescription = pofGradeDescription;
    }

    public String getChildAbove12() {
        return childAbove12;
    }

    public void setChildAbove12(String childAbove12) {
        this.childAbove12 = childAbove12;
    }

    public String getChildUnder12() {
        return childUnder12;
    }

    public void setChildUnder12(String childUnder12) {
        this.childUnder12 = childUnder12;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public String getParents() {
        return parents;
    }

    public void setParents(String parents) {
        this.parents = parents;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getPofClass() {
        return pofClass;
    }

    public void setPofClass(String pofClass) {
        this.pofClass = pofClass;
    }
   
}