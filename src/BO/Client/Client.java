package BO.Client;

public class Client implements java.io.Serializable {

    private String clientId = "";//need to display data in table 
    private String id = "";//need to display data in table 
    private String clientName = "";
    private String address = "";
    private String mobileNo = "";
    private String creditLimit = "";
    private String landLineNo = "";

    private String contactPerson = "";
    private String email = "";
    private String accountId = "";
    private float discount = 0;
    private String startDate = "";
    private String endDate = "";
    private String active = "";
    private String registeredBy = "";
    private String terminalId = "";
    private String locationId = "LOV";
    private String locationDescription = "LOV";
    private String clientType = "";
    private String transactionType = "";
    private String testLimit = "";
    private String checkCreditLimit = "";
    private String selectIt = "";
    private String selectionAllow = "";
    private String patientUpdate = "";
    private String sendSms = "";
    private String displayReport = "";
    private String patientContact = "";
    private String patientReportEmail = "";
    private boolean selectAll = false;
    private boolean DeleteAll = false;

    //SETUP TABLES
    private String cptDescForCptWiseClient = "";
    private String cptIdForCptWiseClient = "";

    private String contactPrice = "";
    private String contactStatus = "";

    private String cptId = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getClientId() {
        return clientId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getLandLineNo() {
        return landLineNo;
    }

    public void setLandLineNo(String landLineNo) {
        this.landLineNo = landLineNo;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
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

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTestLimit() {
        return testLimit;
    }

    public void setTestLimit(String testLimit) {
        this.testLimit = testLimit;
    }

    public String getCheckCreditLimit() {
        return checkCreditLimit;
    }

    public void setCheckCreditLimit(String checkCreditLimit) {
        this.checkCreditLimit = checkCreditLimit;
    }

    public String getCptDescForCptWiseClient() {
        return cptDescForCptWiseClient;
    }

    public void setCptDescForCptWiseClient(String cptDescForCptWiseClient) {
        this.cptDescForCptWiseClient = cptDescForCptWiseClient;
    }

    public String getCptIdForCptWiseClient() {
        return cptIdForCptWiseClient;
    }

    public void setCptIdForCptWiseClient(String cptIdForCptWiseClient) {
        this.cptIdForCptWiseClient = cptIdForCptWiseClient;
    }

    public String getContactPrice() {
        return contactPrice;
    }

    public void setContactPrice(String contactPrice) {
        this.contactPrice = contactPrice;
    }

    public String getContactStatus() {
        return contactStatus;
    }

    public void setContactStatus(String contactStatus) {
        this.contactStatus = contactStatus;
    }

    public String getCptId() {
        return cptId;
    }

    public void setCptId(String cptId) {
        this.cptId = cptId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getSelectIt() {
        return selectIt;
    }

    public void setSelectIt(String selectIt) {
        this.selectIt = selectIt;
    }

    public String getSelectionAllow() {
        return selectionAllow;
    }

    public void setSelectionAllow(String selectionAllow) {
        this.selectionAllow = selectionAllow;
    }

    public String getPatientUpdate() {
        return patientUpdate;
    }

    public void setPatientUpdate(String patientUpdate) {
        this.patientUpdate = patientUpdate;
    }

    public String getSendSms() {
        return sendSms;
    }

    public void setSendSms(String sendSms) {
        this.sendSms = sendSms;
    }

    public String getDisplayReport() {
        return displayReport;
    }

    public void setDisplayReport(String displayReport) {
        this.displayReport = displayReport;
    }

    public String getPatientContact() {
        return patientContact;
    }

    public void setPatientContact(String patientContact) {
        this.patientContact = patientContact;
    }

    public String getPatientReportEmail() {
        return patientReportEmail;
    }

    public void setPatientReportEmail(String patientReportEmail) {
        this.patientReportEmail = patientReportEmail;
    }

    public boolean isSelectAll() {
        return selectAll;
    }

    public void setSelectAll(boolean selectAll) {
        this.selectAll = selectAll;
    }

    public boolean isDeleteAll() {
        return DeleteAll;
    }

    public void setDeleteAll(boolean DeleteAll) {
        this.DeleteAll = DeleteAll;
    }
}
