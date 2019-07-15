/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class Patient implements java.io.Serializable {

    private String id = "";
    private String patientId = "     ";//need to display data in table 
    private String firstName = " ";
    private String middleName = " ";
    private String lastName = " ";
    private String fullName = " ";
    private String fatherName = "";
    private String husbandName = "";
    private String passportNo = "";
    private String age = "";
    private String weight = "";
    private String height = "";
    private String address = "";
    private String contactNo = "";
    private String PersonalNumber = "";
    private String emergencyContactNo = "";
    private String email = "";
    private String cnic = "";
    private String departmentId = "";
    private String dob = "";
    private String oldMRNO = "";
    private String isAdmitted = "";
    private String attachedMRNOs = "";
    private String manualPatientId = "";
    private String selectIt = "";
    private String registeredBy = "";
    private String registrationDate = "";
    private String attachedBy = "";
    private String attachedDate = "";
    private String mergedBy = "";
    private String mergedDate = "";
    private String patientTypeId = "";
    private String registrationFrom = "";
    private String registrationTo = "";
    private String ageFrom = "";
    private String ageTo = "";
    private String employeeId = "";
    private String empDesignation = "";
    private String department = "";
    private String grade = "";
    private String relation = "";
    private String relationId = "";
    private String patientUpdateAllow = "";
    private String totalDependents = "";
    private String pictureUploaded = "";
    private String active = "";
    private String otherInformation = "";
    private String primaryPhysicianId = "LOV";
    private String primaryPhysician = "";
    private String verificationStatus = "";
    private String opdVisitAllow = "";
    private String cnicRequired = "";

    private String docTypeId = "";
    private String docDescription = "";
    private String crtdBy = "";
    private String crtdDate = "";
    private String crtdTerminalId = "";
    private String action = "";
    private String remarks = "";
    private String actionDate = "";
    private String actionBy = "";
    private String actionTerminalId = "";
    private String approvalTypeId = "";
    private String approvalDescription = "";
    private String rowId = "";
    private String tableName = "";
    private String infoUpdated = "";

    public String getDocTypeId() {
        return docTypeId;
    }

    public String getDocDescription() {
        return docDescription;
    }

    public String getCrtdBy() {
        return crtdBy;
    }

    public String getCrtdDate() {
        return crtdDate;
    }

    public String getCrtdTerminalId() {
        return crtdTerminalId;
    }

    public String getAction() {
        return action;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getActionDate() {
        return actionDate;
    }

    public String getActionBy() {
        return actionBy;
    }

    public String getActionTerminalId() {
        return actionTerminalId;
    }

    public String getApprovalTypeId() {
        return approvalTypeId;
    }

    public String getApprovalDescription() {
        return approvalDescription;
    }

    public String getRowId() {
        return rowId;
    }

    public String getTableName() {
        return tableName;
    }

    public String getInfoUpdated() {
        return infoUpdated;
    }

    public void setDocTypeId(String docTypeId) {
        this.docTypeId = docTypeId;
    }

    public void setDocDescription(String docDescription) {
        this.docDescription = docDescription;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }

    public void setCrtdDate(String crtdDate) {
        this.crtdDate = crtdDate;
    }

    public void setCrtdTerminalId(String crtdTerminalId) {
        this.crtdTerminalId = crtdTerminalId;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setActionDate(String actionDate) {
        this.actionDate = actionDate;
    }

    public void setActionBy(String actionBy) {
        this.actionBy = actionBy;
    }

    public void setActionTerminalId(String actionTerminalId) {
        this.actionTerminalId = actionTerminalId;
    }

    public void setApprovalTypeId(String approvalTypeId) {
        this.approvalTypeId = approvalTypeId;
    }

    public void setApprovalDescription(String approvalDescription) {
        this.approvalDescription = approvalDescription;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setInfoUpdated(String infoUpdated) {
        this.infoUpdated = infoUpdated;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getCnicRequired() {
        return cnicRequired;
    }

    public void setCnicRequired(String cnicRequired) {
        this.cnicRequired = cnicRequired;
    }

    public String getOpdVisitAllow() {
        return opdVisitAllow;
    }

    public void setOpdVisitAllow(String opdVisitAllow) {
        this.opdVisitAllow = opdVisitAllow;
    }

    public String getPrimaryPhysicianId() {
        return primaryPhysicianId;
    }

    public void setPrimaryPhysicianId(String primaryPhysicianId) {
        this.primaryPhysicianId = primaryPhysicianId;
    }

    public String getPrimaryPhysician() {
        return primaryPhysician;
    }

    public void setPrimaryPhysician(String primaryPhysician) {
        this.primaryPhysician = primaryPhysician;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
    }

    public String getPictureUploaded() {
        return pictureUploaded;
    }

    public void setPictureUploaded(String pictureUploaded) {
        this.pictureUploaded = pictureUploaded;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getTotalDependents() {
        return totalDependents;
    }

    public void setTotalDependents(String totalDependents) {
        this.totalDependents = totalDependents;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPatientTypeId() {
        return patientTypeId;
    }

    public void setPatientTypeId(String patientTypeId) {
        this.patientTypeId = patientTypeId;
    }

    public String getManualPatientId() {
        return manualPatientId;
    }

    public void setManualPatientId(String manualPatientId) {
        this.manualPatientId = manualPatientId;
    }

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public String getPatientUpdateAllow() {
        return patientUpdateAllow;
    }

    public void setPatientUpdateAllow(String patientUpdateAllow) {
        this.patientUpdateAllow = patientUpdateAllow;
    }

//Department
    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    private String cityId = "LOV";
    private String religionId = "LOV";
    private String companyId = "001";
    private String clientId = "LOV";
    private String typeId = "LOV";
    private String bloodGroupId = "LOV";
    private String titleId = "LOV";
    private String locationId = "LOV";
    private String genderId = "LOV";
    private String searchGenderId = "LOV";
    private String maritalStatusId = "LOV";
    private String patientStatusId = "LOV";
    private String cityDescription = "LOV";
    private String religionDescription = "LOV";
    private String companyDescription = "LOV";
    private String clientDescription = "LOV";
    private String clientTransactionType = "";
    private String patientInfoUpdated = "LOV";
    private String typeDescription = "LOV";
    private String bloodGroupDescription = "LOV";
    private String titleDescription = "LOV";
    private String locationDescription = "LOV";
    private String genderDescription = "LOV";
    private String patientStatus = "LOV";
    private String maritalStatusDescription = "LOV";
    private String clientOpdVisitStatus = "";
    private String guardianName = "";

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getClientOpdVisitStatus() {
        return clientOpdVisitStatus;
    }

    public void setClientOpdVisitStatus(String clientOpdVisitStatus) {
        this.clientOpdVisitStatus = clientOpdVisitStatus;
    }

    //NEW 
    private int rowIndex = 0;

    public String getPatientInfoUpdated() {
        return patientInfoUpdated;
    }

    public void setPatientInfoUpdated(String patientInfoUpdated) {
        this.patientInfoUpdated = patientInfoUpdated;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSelectIt() {
        return selectIt;
    }

    public void setSelectIt(String selectIt) {
        this.selectIt = selectIt;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getHusbandName() {
        return husbandName;
    }

    public void setHusbandName(String husbandName) {
        this.husbandName = husbandName;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIsAdmitted() {
        return isAdmitted;
    }

    public void setIsAdmitted(String isAdmitted) {
        this.isAdmitted = isAdmitted;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getPersonalNumber() {
        return PersonalNumber;
    }

    public void setPersonalNumber(String PersonalNumber) {
        this.PersonalNumber = PersonalNumber;
    }

    public String getEmergencyContactNo() {
        return emergencyContactNo;
    }

    public void setEmergencyContactNo(String emergencyContactNo) {
        this.emergencyContactNo = emergencyContactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getOldMRNO() {
        return oldMRNO;
    }

    public void setOldMRNO(String oldMRNO) {
        this.oldMRNO = oldMRNO;
    }

    public String getAttachedMRNOs() {
        return attachedMRNOs;
    }

    public void setAttachedMRNOs(String attachedMRNOs) {
        this.attachedMRNOs = attachedMRNOs;
    }

    public String getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getAttachedBy() {
        return attachedBy;
    }

    public void setAttachedBy(String attachedBy) {
        this.attachedBy = attachedBy;
    }

    public String getAttachedDate() {
        return attachedDate;
    }

    public void setAttachedDate(String attachedDate) {
        this.attachedDate = attachedDate;
    }

    public String getMergedBy() {
        return mergedBy;
    }

    public void setMergedBy(String mergedBy) {
        this.mergedBy = mergedBy;
    }

    public String getMergedDate() {
        return mergedDate;
    }

    public void setMergedDate(String mergedDate) {
        this.mergedDate = mergedDate;
    }

    public String getRegistrationFrom() {
        return registrationFrom;
    }

    public void setRegistrationFrom(String registrationFrom) {
        this.registrationFrom = registrationFrom;
    }

    public String getRegistrationTo() {
        return registrationTo;
    }

    public void setRegistrationTo(String registrationTo) {
        this.registrationTo = registrationTo;
    }

    public String getAgeFrom() {
        return ageFrom;
    }

    public void setAgeFrom(String ageFrom) {
        this.ageFrom = ageFrom;
    }

    public String getAgeTo() {
        return ageTo;
    }

    public void setAgeTo(String ageTo) {
        this.ageTo = ageTo;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getReligionId() {
        return religionId;
    }

    public void setReligionId(String religionId) {
        this.religionId = religionId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getBloodGroupId() {
        return bloodGroupId;
    }

    public void setBloodGroupId(String bloodGroupId) {
        this.bloodGroupId = bloodGroupId;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    public String getSearchGenderId() {
        return searchGenderId;
    }

    public void setSearchGenderId(String searchGenderId) {
        this.searchGenderId = searchGenderId;
    }

    public String getMaritalStatusId() {
        return maritalStatusId;
    }

    public void setMaritalStatusId(String maritalStatusId) {
        this.maritalStatusId = maritalStatusId;
    }

    public String getPatientStatusId() {
        return patientStatusId;
    }

    public void setPatientStatusId(String patientStatusId) {
        this.patientStatusId = patientStatusId;
    }

    public String getCityDescription() {
        return cityDescription;
    }

    public void setCityDescription(String cityDescription) {
        this.cityDescription = cityDescription;
    }

    public String getReligionDescription() {
        return religionDescription;
    }

    public void setReligionDescription(String religionDescription) {
        this.religionDescription = religionDescription;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public String getClientDescription() {
        return clientDescription;
    }

    public void setClientDescription(String clientDescription) {
        this.clientDescription = clientDescription;
    }

    public String getClientTransactionType() {
        return clientTransactionType;
    }

    public void setClientTransactionType(String clientTransactionType) {
        this.clientTransactionType = clientTransactionType;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public String getBloodGroupDescription() {
        return bloodGroupDescription;
    }

    public void setBloodGroupDescription(String bloodGroupDescription) {
        this.bloodGroupDescription = bloodGroupDescription;
    }

    public String getTitleDescription() {
        return titleDescription;
    }

    public void setTitleDescription(String titleDescription) {
        this.titleDescription = titleDescription;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getGenderDescription() {
        return genderDescription;
    }

    public void setGenderDescription(String genderDescription) {
        this.genderDescription = genderDescription;
    }

    public String getPatientStatus() {
        return patientStatus;
    }

    public void setPatientStatus(String patientStatus) {
        this.patientStatus = patientStatus;
    }

    public String getMaritalStatusDescription() {
        return maritalStatusDescription;
    }

    public void setMaritalStatusDescription(String maritalStatusDescription) {
        this.maritalStatusDescription = maritalStatusDescription;
    }

}
