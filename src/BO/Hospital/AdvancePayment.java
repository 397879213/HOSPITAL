/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.Hospital;

/**
 *
 * @author Bilal
 */
public class AdvancePayment {

    private String admissionNo = "";
    private int blockedItemsPayable = 0;
    private String patientId = "";
    private String fullName = "";
    private String age = "";
    private String genderDescription = "";
    private String clientId = "";
    private String clientName = "";
    private String clientTransactionType = "";
    private String transactionTypeId = "";
    private String transactionTypeName = "";
    private String completeOrderNo = "";
    private String orderDetailId = "";
    private String orderStatusId = "";
    private String orderStatusDescription = "";
    private String admissionTypeDescription = "";
    private String admissionTypeId = "";
    private String roomTypeDescription = "";
    private String roomTypeId = "";
    private String attendingPhysicianId = "";
    private String attendingPhysicianName = "";
    private String referringPhysicianId = "";
    private String referringPhysicianName = "";
    private String proposedDate = "";
    private String requestedBy = "";
    private String requestedTerminalId = "";
    private String requestedDate = "";
    private String admittedBy = "";
    private String admittedTerminalId = "";
    private String admittedDate = "";
    private String admissionRemarks = "";
    private String wardNo = "";
    private String wardDescription = "";
    private String bedNo = "";
    private String bedDescription = "";
    private String isSaved = "";
    private String recievedBy = "";
    private String recievedDate = "";
    private String recievedAmount = "";
    private String voucherNo = "";
    private String approveComments = "";
    private String totalAmount = "";
    private String totalAdvanceRecieved = "";
    private String totalBill = "";
    private String totalPayable = "";
    private String departmentBill = "";
    private String departmentRefund = "";
    private String departmentId = "";
    private String departmentDescription = "";
    private String invoiceNo = "";
    private String totalReceived = "";
    private String totalBalanceAmount = "";
    private String cptId = "";
    private String accountDescription = "";
    private String accountId = "";
    private String fromTransactionType = "";
    private String toTransactionType = "";

    public String getFromTransactionType() {
        return fromTransactionType;
    }

    public void setFromTransactionType(String fromTransactionType) {
        this.fromTransactionType = fromTransactionType;
    }

    public String getToTransactionType() {
        return toTransactionType;
    }

    public void setToTransactionType(String toTransactionType) {
        this.toTransactionType = toTransactionType;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getTotalReceived() {
        return totalReceived;
    }

    public void setTotalReceived(String totalReceived) {
        this.totalReceived = totalReceived;
    }

    public String getTotalBalanceAmount() {
        return totalBalanceAmount;
    }

    public void setTotalBalanceAmount(String totalBalanceAmount) {
        this.totalBalanceAmount = totalBalanceAmount;
    }

    public String getCptId() {
        return cptId;
    }

    public void setCptId(String cptId) {
        this.cptId = cptId;
    }

    public String getAccountDescription() {
        return accountDescription;
    }

    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getDepartmentRefund() {
        return departmentRefund;
    }

    public void setDepartmentRefund(String departmentRefund) {
        this.departmentRefund = departmentRefund;
    }

    public String getDepartmentBill() {
        return departmentBill;
    }

    public void setDepartmentBill(String departmentBill) {
        this.departmentBill = departmentBill;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }

    public String getTotalAdvanceRecieved() {
        return totalAdvanceRecieved;
    }

    public void setTotalAdvanceRecieved(String totalAdvanceRecieved) {
        this.totalAdvanceRecieved = totalAdvanceRecieved;
    }

    public String getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(String totalBill) {
        this.totalBill = totalBill;
    }

    public String getTotalPayable() {
        return totalPayable;
    }

    public void setTotalPayable(String totalPayable) {
        this.totalPayable = totalPayable;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getApproveComments() {
        return approveComments;
    }

    public void setApproveComments(String approveComments) {
        this.approveComments = approveComments;
    }

    public String getVoucherNo() {
        return voucherNo;
    }

    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
    }

    public String getRecievedBy() {
        return recievedBy;
    }

    public void setRecievedBy(String recievedBy) {
        this.recievedBy = recievedBy;
    }

    public String getRecievedDate() {
        return recievedDate;
    }

    public void setRecievedDate(String recievedDate) {
        this.recievedDate = recievedDate;
    }

    public String getRecievedAmount() {
        return recievedAmount;
    }

    public void setRecievedAmount(String recievedAmount) {
        this.recievedAmount = recievedAmount;
    }

    public String getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGenderDescription() {
        return genderDescription;
    }

    public String getClientId() {
        return clientId;
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

    public String getClientTransactionType() {
        return clientTransactionType;
    }

    public void setClientTransactionType(String clientTransactionType) {
        this.clientTransactionType = clientTransactionType;
    }

    public void setGenderDescription(String genderDescription) {
        this.genderDescription = genderDescription;
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

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getOrderStatusDescription() {
        return orderStatusDescription;
    }

    public void setOrderStatusDescription(String orderStatusDescription) {
        this.orderStatusDescription = orderStatusDescription;
    }

    public String getAdmissionTypeDescription() {
        return admissionTypeDescription;
    }

    public void setAdmissionTypeDescription(String admissionTypeDescription) {
        this.admissionTypeDescription = admissionTypeDescription;
    }

    public String getAdmissionTypeId() {
        return admissionTypeId;
    }

    public void setAdmissionTypeId(String admissionTypeId) {
        this.admissionTypeId = admissionTypeId;
    }

    public String getRoomTypeDescription() {
        return roomTypeDescription;
    }

    public void setRoomTypeDescription(String roomTypeDescription) {
        this.roomTypeDescription = roomTypeDescription;
    }

    public String getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getAttendingPhysicianId() {
        return attendingPhysicianId;
    }

    public void setAttendingPhysicianId(String attendingPhysicianId) {
        this.attendingPhysicianId = attendingPhysicianId;
    }

    public String getAttendingPhysicianName() {
        return attendingPhysicianName;
    }

    public void setAttendingPhysicianName(String attendingPhysicianName) {
        this.attendingPhysicianName = attendingPhysicianName;
    }

    public String getReferringPhysicianId() {
        return referringPhysicianId;
    }

    public void setReferringPhysicianId(String referringPhysicianId) {
        this.referringPhysicianId = referringPhysicianId;
    }

    public String getReferringPhysicianName() {
        return referringPhysicianName;
    }

    public void setReferringPhysicianName(String referringPhysicianName) {
        this.referringPhysicianName = referringPhysicianName;
    }

    public String getProposedDate() {
        return proposedDate;
    }

    public void setProposedDate(String proposedDate) {
        this.proposedDate = proposedDate;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getRequestedTerminalId() {
        return requestedTerminalId;
    }

    public void setRequestedTerminalId(String requestedTerminalId) {
        this.requestedTerminalId = requestedTerminalId;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    public String getAdmittedBy() {
        return admittedBy;
    }

    public void setAdmittedBy(String admittedBy) {
        this.admittedBy = admittedBy;
    }

    public String getAdmittedTerminalId() {
        return admittedTerminalId;
    }

    public void setAdmittedTerminalId(String admittedTerminalId) {
        this.admittedTerminalId = admittedTerminalId;
    }

    public String getAdmittedDate() {
        return admittedDate;
    }

    public void setAdmittedDate(String admittedDate) {
        this.admittedDate = admittedDate;
    }

    public String getAdmissionRemarks() {
        return admissionRemarks;
    }

    public void setAdmissionRemarks(String admissionRemarks) {
        this.admissionRemarks = admissionRemarks;
    }

    public String getWardNo() {
        return wardNo;
    }

    public void setWardNo(String wardNo) {
        this.wardNo = wardNo;
    }

    public String getWardDescription() {
        return wardDescription;
    }

    public void setWardDescription(String wardDescription) {
        this.wardDescription = wardDescription;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getBedDescription() {
        return bedDescription;
    }

    public void setBedDescription(String bedDescription) {
        this.bedDescription = bedDescription;
    }

    public String getIsSaved() {
        return isSaved;
    }

    public void setIsSaved(String isSaved) {
        this.isSaved = isSaved;
    }

    public String getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(String transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public String getTransactionTypeName() {
        return transactionTypeName;
    }

    public void setTransactionTypeName(String transactionTypeName) {
        this.transactionTypeName = transactionTypeName;
    }

    public int getBlockedItemsPayable() {
        return blockedItemsPayable;
    }

    public void setBlockedItemsPayable(int blockedItemsPayable) {
        this.blockedItemsPayable = blockedItemsPayable;
    }

}
