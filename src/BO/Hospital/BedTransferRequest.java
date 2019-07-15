package BO.Hospital;

public class BedTransferRequest {

    private String patientId = "";
    private String admissionNo = "";
    private String fromWardId = "";
    private String ToWardId = "";
    private String fromBedId = "";
    private String toBedId = "";
    private String actionRemarks = "";
    private String requestRemarks = "";
    private String bedDescription = "";
    private String wardDescription = "";
    private String crtdDate = "";
    private String crtdBy = "";
    private String crtdTerminalId = "";
    private String primaryId = "";
    private String attendingId = "";
    private String primaryDoctor = "";
    private String attendingDoctor = "";
    private String toBedDescription = "";
    private String toWardDescription = "";
    private String orderStatusId = "";
    private String orderStatusDescription = "";

    public String getOrderStatusDescription() {
        return orderStatusDescription;
    }

    public void setOrderStatusDescription(String orderStatusDescription) {
        this.orderStatusDescription = orderStatusDescription;
    }
    private String searchFromDate = "";
    private String searchToDate = "";

    public String getSearchFromDate() {
        return searchFromDate;
    }

    public void setSearchFromDate(String searchFromDate) {
        this.searchFromDate = searchFromDate;
    }

    public String getSearchToDate() {
        return searchToDate;
    }

    public void setSearchToDate(String searchToDate) {
        this.searchToDate = searchToDate;
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getToBedDescription() {
        return toBedDescription;
    }

    public void setToBedDescription(String toBedDescription) {
        this.toBedDescription = toBedDescription;
    }

    public String getToWardDescription() {
        return toWardDescription;
    }

    public void setToWardDescription(String toWardDescription) {
        this.toWardDescription = toWardDescription;
    }

    public String getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(String primaryId) {
        this.primaryId = primaryId;
    }

    public String getAttendingId() {
        return attendingId;
    }

    public void setAttendingId(String attendingId) {
        this.attendingId = attendingId;
    }

    public String getPrimaryDoctor() {
        return primaryDoctor;
    }

    public void setPrimaryDoctor(String primaryDoctor) {
        this.primaryDoctor = primaryDoctor;
    }

    public String getAttendingDoctor() {
        return attendingDoctor;
    }

    public void setAttendingDoctor(String attendingDoctor) {
        this.attendingDoctor = attendingDoctor;
    }

    public String getCrtdDate() {
        return crtdDate;
    }

    public void setCrtdDate(String crtdDate) {
        this.crtdDate = crtdDate;
    }

    public String getCrtdBy() {
        return crtdBy;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }

    public String getCrtdTerminalId() {
        return crtdTerminalId;
    }

    public void setCrtdTerminalId(String crtdTerminalId) {
        this.crtdTerminalId = crtdTerminalId;
    }

    public String getBedDescription() {
        return bedDescription;
    }

    public void setBedDescription(String bedDescription) {
        this.bedDescription = bedDescription;
    }

    public String getWardDescription() {
        return wardDescription;
    }

    public void setWardDescription(String wardDescription) {
        this.wardDescription = wardDescription;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getFromWardId() {
        return fromWardId;
    }

    public void setFromWardId(String fromWardId) {
        this.fromWardId = fromWardId;
    }

    public String getToWardId() {
        return ToWardId;
    }

    public void setToWardId(String ToWardId) {
        this.ToWardId = ToWardId;
    }

    public String getFromBedId() {
        return fromBedId;
    }

    public void setFromBedId(String fromBedId) {
        this.fromBedId = fromBedId;
    }

    public String getToBedId() {
        return toBedId;
    }

    public void setToBedId(String toBedId) {
        this.toBedId = toBedId;
    }

    public String getActionRemarks() {
        return actionRemarks;
    }

    public void setActionRemarks(String actionRemarks) {
        this.actionRemarks = actionRemarks;
    }

    public String getRequestRemarks() {
        return requestRemarks;
    }

    public void setRequestRemarks(String requestRemarks) {
        this.requestRemarks = requestRemarks;
    }

}
