/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BO.Hr;

/**
 *
 * @author Pacslink
 */
public class HrLetter {
    
    private String EmpId;
    private String fulName;
    private String Department;
    private String Gender;
    private String Age;
    private String Location;
    private String leaveType;
    private String HrTemplates;
    private String LetterStatus;
    private String Active;
    
    

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String EmpId) {
        this.EmpId = EmpId;
    }

    public String getFulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }
    
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getHrTemplates() {
        return HrTemplates;
    }

    public void setHrTemplates(String HrTemplates) {
        this.HrTemplates = HrTemplates;
    }

    public String getLetterStatus() {
        return LetterStatus;
    }

    public void setLetterStatus(String LetterStatus) {
        this.LetterStatus = LetterStatus;
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String Active) {
        this.Active = Active;
    }
}
