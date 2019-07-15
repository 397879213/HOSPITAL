/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.util.Date;
import java.util.Objects;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class OfflineOrderData implements java.io.Serializable {

    private String cost = "";
    private String patientId = "    ";
    private String bloodGroupId = "15";
    private String customerId = "0";
    private String customerName = "";
    private int quantity = 0;
    private String cancelRequestBy = "";
    private String admissionNumber = "";
    private String cancelRequestDate = "";
    private String storeId = "";
    private String labCode = "";
    private String departmentOrderStatusId = "";
    private int stockQuantity = 0;
    private int dispenseQuantity = 0;
    private int returnQuantity = 1;
    private String completeOrderNo = "";
    private String invoiceNo = "";
    private String paymentModeId = "";
    private String clientId = "";
    private String clientName = "";
    private String clientTransactionType = "";
    private String clientaAccountId = "";
    private String patientStatusId = "";
    private String patientStatus = "";
    private String referralRequired = "";
    private String referralNo = "";
    private String appointmentStatus = "N";
    private String appointmentTime = "N";
    private String orderStatusId = "";
    private String recievedCPTPrice = "";
    private String invoiceDate = "";
    private String netDiscount = "";
    private float percentageDiscount = 0;
    private float percentageFinancialSupport = 0;
    private int financialSupport = 0;
    private int totalFinancialSupport = 0;
    private String returnAmount = "";
    private String balanceAmount = "0";
    private String blbId = "0";
    private String cptBalanceAmount = "0";
    private String reportPendingAmount = "";
    private int newBalanceAmount = 0;
    private int refundAmountAdjustment = 0;
    private int refundTotalDiscount = 0;
    private int ledgerBalanceAmount = 0;
    private int ledgerAdjustedAmount = 0;

    private String patientBalanceAdjusted = "";
    private String doctorShareDiscount = "0";
    private String totalAmount = "0";
    private String invoiceRefundAmount = "0";
    private String totalRefundAmount = "0";
    private String invoiceBalanceAmount = "0";
    private String price = "0"; //GENERAL CONTRACT WITH PERFORMING
    private String CptPrice = "0";
    private String tubeCode = "";
    private int cashRefund = 0;
    private int invoiceBalanceAdjusted = 0;
    private String netPayableAmount = "0";
    private String payableAmount = "0";
    private int refundCPTsBalanceAmount = 0;
    private String receivedAmount = "0";
    private String receiptMade = "N";
    private String remarks = "";
    private String manualInvoiceNo = "";
    private String invoiceBy = "";
    private String terminalId = "";
    private String cancelReturnId = "";
    private String trnDate = "";
    private boolean checkStatus = false;
    private boolean cptLevelDiscount = false;
    private boolean cancelOrder = false;
    //Order MASTER purpose
    private String orderBy = "";
    private String orderDate = "";
    private String orderNo = "      ";//do not delete these spaces oterwise system has bug
    private String referredBy = "";
    private String orderType = "";
    private String locationId = "";
    private String orderLocationId = "";
    private String orderLocation = "";
    private String location = "";
    private String orderDetailId = "";
    private String status = "";
    private String labNo = "N";
    private String urgent = "N";
    private String cancellingRemarks = "";
    private String refundNo = "";
    private String refundBy = "";
    private String refundDate = "";
    private String refundTerminal = "";
    private String refundDetailId = "";
    private String refundAmount = "";
    private String cashRefundAmount = "";

    private String refundRemarks = "";
    private String cash = "";

    // FOR IMAGING CPT
    private String technologistRequired = "";
    private String imagesRequired = "";
    private String historyRequired = "";
    private String orderHistoryRequired = "";
    private String historyQuestionaireTypeId = "";
    private String performingContractId = ""; //GENERAL CONTRACT WITH PERFORMING

    //
    private String cd = "";
    private String dvd = "N";
    private String films = "N";
    private String receivedDescription = "";

    private String invoiced = "N";
    private String acknowledged = "N";
    private String acknowledgedBy = "";
    private String acknowledgedDate = "";
    private String performed = "N";
    private String performedBy = "";
    private String performedDate = "";
    //Order Detail 
    private String cptload = "";
    private String cptId = "";
    private String cptDescription = "";
    private String cptRemarks = "";
    private String cptReportTime = "";
    private String performingLocationId = "";
    private String cptReportTimePath = "";
    private String reportTimeId = "";
    private String locationReportTime = "48";

    private String reportName = "";
    private String reportDeliveryTime = " 05:00 PM";
    private String sundayReport = "N";
    private String timeType = "";
    private String accessCode = "";

    private String accessionNo = "";
    private String imagingNo = "";

    // for pathology
    private String specimenId = "";
    private String sectionNo = "";
    private String cptCodeCounter = "";

    //invoiceDetail 
    private String departmentId = "";
    private String department = "";
    private String sectionId = "";
    private String statCost = "";
    private boolean stat = false;
    private String originalPrice = "";
    private String testLimit = "";
    private String remarksRequired = "";
    private String multipleCptOrders = "";
    private String contractPrice = "";
    private String orderPrice = "";
    private String donorRequired = "";
    private String donorPatientId = "";
    private String consultantId = "";
    private String consultancyId = "";
    private String specialityId = "";
    private String clinicId = "";
    private String totalBarcodeLabels = "0";

    private String contractStatus = "";
    private String discount = "";

    //private String historyStatus = "";
    private String advanceAdjusted = "0";

    private String invoiceDetailId = "";

    private String weight = "";
    private String height = "";
    private String mobilityStatusId = "";
    private String sampleStatusId = "";
    private String mobilityStatusDescription = "";
    private String referringDoctorId = "";
    private String referringDoctorDescription = "";
    private String reportingDoctorId = "";
    private String reportingDoctorDescription = "";

    private String clinicalHistory = " ";
    private String radiographerInstruction = "";
    private String pregnancyStatus = "N";
    private String pregnancyMonth = "";
    private String lmp = "";
    private String inhouseDoctorId = "";
    private String cancellingUser = "";
    private String cancellingDate = "";

    private String detailFsAmount = "";

    private String creatinine = "";
    private String egfr = "";
    private String asthmaStatus = "N";
    private String asthmaDescription = "";
    private String cardiacStatus = "N";
    private String cardiacDescription = "";
    private String dialysisStatus = "N";
    private String dialysisDescription = "";

    private String diabaticStatus = "N";
    private String diabaticDescription = "";
    private String renalDiseaseStatus = "N";
    private String renalDiseaseDescription = "";
    private String allergyStatus = "N";
    private String allergyDescription = "";

    private String feverStatus = "N";
    private String feverDescription = "";
    private String surgeryStatus = "N";
    private String surgeryDescription = "";
    private String ATTAStatus = "N";
    private String ATTADescription = "";
    private String traumaStatus = "N";
    private String traumaDescription = "";

    private String medication = "";
    private String prescriptionPath = "";
    private String pdfServer = "D:\\PACS_SERVER";

    //For Patient
    private String patientName = "";
    private String age = "";
    private String dob = "";
    private String gender = "M";

    //Package Name;
    private String cptPackage = "";

    //used as a managed bean for front end;
    private Date invoiceDateType = new Date();

    private String InvPatientId = "";
    private String InvPatientName = "";
    private String InvGender = "";
    private String InvClientName = "";
    private boolean chkCredit = false;
    private boolean chkRefferal = false;
    private String InvPayableAmount = "";
    private String performingPhysicianName = "";
    private String performingPhysicianId = "";
    private String performingPhysicianRequired = "";
    private String cptReportingFormat = "";
    private String performingPhysicianShare = "";
    private String patientFileRequired = "";
    private String sectionDescription = "";
    private int rowIndex;
    //new 
    private String updatedBy = "";
    private String updatedTerminal = "";
    private String invoiceCash = "";
    private String updatedDate = "";
    private String clientBillReceiveNo = "";
    private String clientBillNo = "";
    private String invoiceTimeCash = "";
    private String transactionType = "";
    private String transactionBy = "";
    private String transactionTime = "";
    private String Id = "";
    private String maritalStatusId = "";
    private String withoutReferral = "";
    private String withoutReferralApprovedBy = "";
    private String withoutReferralTerminalId = "";
    private String withoutReferralApprovalDate = "";
    private String refundStatus = "";

    
    public String getWithoutReferral() {
        return withoutReferral;
    }

    public void setWithoutReferral(String withoutReferral) {
        this.withoutReferral = withoutReferral;
    }

    public String getWithoutReferralApprovedBy() {
        return withoutReferralApprovedBy;
    }

    public void setWithoutReferralApprovedBy(String withoutReferralApprovedBy) {
        this.withoutReferralApprovedBy = withoutReferralApprovedBy;
    }

    public String getWithoutReferralTerminalId() {
        return withoutReferralTerminalId;
    }

    public void setWithoutReferralTerminalId(String withoutReferralTerminalId) {
        this.withoutReferralTerminalId = withoutReferralTerminalId;
    }

    public String getWithoutReferralApprovalDate() {
        return withoutReferralApprovalDate;
    }

    public void setWithoutReferralApprovalDate(String withoutReferralApprovalDate) {
        this.withoutReferralApprovalDate = withoutReferralApprovalDate;
    }

    public String getMaritalStatusId() {
        return maritalStatusId;
    }

    public void setMaritalStatusId(String maritalStatusId) {
        this.maritalStatusId = maritalStatusId;
    }

    public String getInvoiceCash() {
        return invoiceCash;
    }

    public void setInvoiceCash(String invoiceCash) {
        this.invoiceCash = invoiceCash;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }
 
    public String getUpdatedTerminal() {
        return updatedTerminal;
    }

    public void setUpdatedTerminal(String updatedTerminal) {
        this.updatedTerminal = updatedTerminal;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String terminalType) {
        this.transactionType = terminalType;
    }

    public String getTransactionBy() {
        return transactionBy;
    }

    public void setTransactionBy(String transactionBy) {
        this.transactionBy = transactionBy;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getClientBillReceiveNo() {
        return clientBillReceiveNo;
    }

    public void setClientBillReceiveNo(String clientBillReceiveNo) {
        this.clientBillReceiveNo = clientBillReceiveNo;
    }

    public String getClientBillNo() {
        return clientBillNo;
    }

    public void setClientBillNo(String clientBillNo) {
        this.clientBillNo = clientBillNo;
    }

    public String getInvoiceTimeCash() {
        return invoiceTimeCash;
    }

    public void setInvoiceTimeCash(String invoiceTimeCash) {
        this.invoiceTimeCash = invoiceTimeCash;
    }

    public String getupdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String UpdatedBy) {
        this.updatedBy = UpdatedBy;
    }

    public String getCptReportTimePath() {
        return cptReportTimePath;
    }

    public void setCptReportTimePath(String cptReportTimePath) {
        this.cptReportTimePath = cptReportTimePath;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getTubeCode() {
        return tubeCode;
    }

    public String getDonorPatientId() {
        return donorPatientId;
    }

    public void setDonorPatientId(String donorPatientId) {
        this.donorPatientId = donorPatientId;
    }

    public String getDonorRequired() {
        return donorRequired;
    }

    public void setDonorRequired(String donorRequired) {
        this.donorRequired = donorRequired;
    }

    public void setTubeCode(String tubeCode) {
        this.tubeCode = tubeCode;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getDispenseQuantity() {
        return dispenseQuantity;
    }

    public void setDispenseQuantity(int dispenseQuantity) {
        this.dispenseQuantity = dispenseQuantity;
    }

    public OfflineOrderData() {
    }

    public String getPatientFileRequired() {
        return patientFileRequired;
    }

    public void setPatientFileRequired(String patientFileRequired) {
        this.patientFileRequired = patientFileRequired;
    }

    public String getCancelReturnId() {
        return cancelReturnId;
    }

    public void setCancelReturnId(String cancelReturnId) {
        this.cancelReturnId = cancelReturnId;
    }

    public String getPerformingContractId() {
        return performingContractId;
    }

    public void setPerformingContractId(String performingContractId) {
        this.performingContractId = performingContractId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCptPrice() {
        return CptPrice;
    }

    public void setCptPrice(String CptPrice) {
        this.CptPrice = CptPrice;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getReturnQuantity() {
        return returnQuantity;
    }

    public void setReturnQuantity(int returnQuantity) {
        this.returnQuantity = returnQuantity;
    }

    //used as a managedbean in receptionorder form
    public String getReportTimeId() {
        return reportTimeId;
    }

    public void setReportTimeId(String reportTimeId) {
        this.reportTimeId = reportTimeId;
    }

    public String getLocationReportTime() {
        return locationReportTime;
    }

    public void setLocationReportTime(String locationReportTime) {
        this.locationReportTime = locationReportTime;
    }

    public String getPerformingPhysicianShare() {
        return performingPhysicianShare;
    }

    public void setPerformingPhysicianShare(String performingPhysicianShare) {
        this.performingPhysicianShare = performingPhysicianShare;
    }

    public String getPerformingPhysicianRequired() {
        return performingPhysicianRequired;
    }

    public void setPerformingPhysicianRequired(String performingPhysicianRequired) {
        this.performingPhysicianRequired = performingPhysicianRequired;
    }

    public boolean isStat() {
        return stat;
    }

    public void setStat(boolean stat) {
        this.stat = stat;
    }

    public String getPerformingPhysicianName() {
        return performingPhysicianName;
    }

    public void setPerformingPhysicianName(String performingPhysicianName) {
        this.performingPhysicianName = performingPhysicianName;
    }

    public String getPerformingPhysicianId() {
        return performingPhysicianId;
    }

    public void setPerformingPhysicianId(String performingPhysicianId) {
        this.performingPhysicianId = performingPhysicianId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getCompleteOrderNo() {
        return completeOrderNo;
    }

    public void setCompleteOrderNo(String completeOrderNo) {
        this.completeOrderNo = completeOrderNo;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getPaymentModeId() {
        return paymentModeId;
    }

    public void setPaymentModeId(String paymentModeId) {
        this.paymentModeId = paymentModeId;
    }

    public String getClientId() {
        return clientId;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
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

    public String getClientaAccountId() {
        return clientaAccountId;
    }

    public void setClientaAccountId(String clientaAccountId) {
        this.clientaAccountId = clientaAccountId;
    }

    public String getPatientStatusId() {
        return patientStatusId;
    }

    public void setPatientStatusId(String patientStatusId) {
        this.patientStatusId = patientStatusId;
    }

    public String getPatientStatus() {
        return patientStatus;
    }

    public void setPatientStatus(String patientStatus) {
        this.patientStatus = patientStatus;
    }

    public String getReferralRequired() {
        return referralRequired;
    }

    public void setReferralRequired(String referralRequired) {
        this.referralRequired = referralRequired;
    }

    public int getRefundCPTsBalanceAmount() {
        return refundCPTsBalanceAmount;
    }

    public void setRefundCPTsBalanceAmount(int refundCPTsBalanceAmount) {
        this.refundCPTsBalanceAmount = refundCPTsBalanceAmount;
    }

    public String getReferralNo() {
        return referralNo;
    }

    public void setReferralNo(String referralNo) {
        this.referralNo = referralNo;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setStatusId(String statusId) {
        this.orderStatusId = statusId;
    }

    public String getRecievedCPTPrice() {
        return recievedCPTPrice;
    }

    public void setRecievedCPTPrice(String recievedCPTPrice) {
        this.recievedCPTPrice = recievedCPTPrice;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getNetDiscount() {
        return netDiscount;
    }

    public void setNetDiscount(String netDiscount) {
        this.netDiscount = netDiscount;
    }

    public float getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(float percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public float getPercentageFinancialSupport() {
        return percentageFinancialSupport;
    }

    public void setPercentageFinancialSupport(float percentageFinancialSupport) {
        this.percentageFinancialSupport = percentageFinancialSupport;
    }

    public int getFinancialSupport() {
        return financialSupport;
    }

    public void setFinancialSupport(int financialSupport) {
        this.financialSupport = financialSupport;
    }

    public int getTotalFinancialSupport() {
        return totalFinancialSupport;
    }

    public void setTotalFinancialSupport(int totalFinancialSupport) {
        this.totalFinancialSupport = totalFinancialSupport;
    }

    public String getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(String returnAmount) {
        this.returnAmount = returnAmount;
    }

    public String getBlbId() {
        return blbId;
    }

    public void setBlbId(String blbId) {
        this.blbId = blbId;
    }

    public String getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public String getCptBalanceAmount() {
        return cptBalanceAmount;
    }

    public void setCptBalanceAmount(String cptBalanceAmount) {
        this.cptBalanceAmount = cptBalanceAmount;
    }

    public String getReportPendingAmount() {
        return reportPendingAmount;
    }

    public void setReportPendingAmount(String reportPendingAmount) {
        this.reportPendingAmount = reportPendingAmount;
    }

    public int getNewBalanceAmount() {
        return newBalanceAmount;
    }

    public void setNewBalanceAmount(int newBalanceAmount) {
        this.newBalanceAmount = newBalanceAmount;
    }

    public int getRefundAmountAdjustment() {
        return refundAmountAdjustment;
    }

    public void setRefundAmountAdjustment(int refundAmountAdjustment) {
        this.refundAmountAdjustment = refundAmountAdjustment;
    }

    public int getLedgerBalanceAmount() {
        return ledgerBalanceAmount;
    }

    public int getLedgerAdjustedAmount() {
        return ledgerAdjustedAmount;
    }

    public void setLedgerAdjustedAmount(int ledgerAdjustedAmount) {
        this.ledgerAdjustedAmount = ledgerAdjustedAmount;
    }

    public void setLedgerBalanceAmount(int ledgerBalanceAmount) {
        this.ledgerBalanceAmount = ledgerBalanceAmount;
    }

    public String getPatientBalanceAdjusted() {
        return patientBalanceAdjusted;
    }

    public void setPatientBalanceAdjusted(String patientBalanceAdjusted) {
        this.patientBalanceAdjusted = patientBalanceAdjusted;
    }

    public String getDoctorShareDiscount() {
        return doctorShareDiscount;
    }

    public void setDoctorShareDiscount(String doctorShareDiscount) {
        this.doctorShareDiscount = doctorShareDiscount;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getInvoiceRefundAmount() {
        return invoiceRefundAmount;
    }

    public void setInvoiceRefundAmount(String invoiceRefundAmount) {
        this.invoiceRefundAmount = invoiceRefundAmount;
    }

    public String getTotalRefundAmount() {
        return totalRefundAmount;
    }

    public void setTotalRefundAmount(String totalRefundAmount) {
        this.totalRefundAmount = totalRefundAmount;
    }

    public int getRefundTotalDiscount() {
        return refundTotalDiscount;
    }

    public void setRefundTotalDiscount(int refundTotalDiscount) {
        this.refundTotalDiscount = refundTotalDiscount;
    }

    public String getInvoiceBalanceAmount() {
        return invoiceBalanceAmount;
    }

    public void setInvoiceBalanceAmount(String invoiceBalanceAmount) {
        this.invoiceBalanceAmount = invoiceBalanceAmount;
    }

    public int getCashRefund() {
        return cashRefund;
    }

    public void setCashRefund(int cashRefund) {
        this.cashRefund = cashRefund;
    }

    public int getInvoiceBalanceAdjusted() {
        return invoiceBalanceAdjusted;
    }

    public void setInvoiceBalanceAdjusted(int invoiceBalanceAdjusted) {
        this.invoiceBalanceAdjusted = invoiceBalanceAdjusted;
    }

    public String getNetPayableAmount() {
        return netPayableAmount;
    }

    public void setNetPayableAmount(String netPayableAmount) {
        this.netPayableAmount = netPayableAmount;
    }

    public String getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(String payableAmount) {
        this.payableAmount = payableAmount;
    }

    public String getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(String receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public String getReceiptMade() {
        return receiptMade;
    }

    public void setReceiptMade(String receiptMade) {
        this.receiptMade = receiptMade;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getManualInvoiceNo() {
        return manualInvoiceNo;
    }

    public void setManualInvoiceNo(String manualInvoiceNo) {
        this.manualInvoiceNo = manualInvoiceNo;
    }

    public String getInvoiceBy() {
        return invoiceBy;
    }

    public void setInvoiceBy(String invoiceBy) {
        this.invoiceBy = invoiceBy;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTrnDate() {
        return trnDate;
    }

    public void setTrnDate(String trnDate) {
        this.trnDate = trnDate;
    }

    public boolean isCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(boolean checkStatus) {
        this.checkStatus = checkStatus;
    }

    public boolean isCptLevelDiscount() {
        return cptLevelDiscount;
    }

    public void setCptLevelDiscount(boolean cptLevelDiscount) {
        this.cptLevelDiscount = cptLevelDiscount;
    }

    public boolean isCancelOrder() {
        return cancelOrder;
    }

    public void setCancelOrder(boolean cancelOrder) {
        this.cancelOrder = cancelOrder;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(String referredBy) {
        this.referredBy = referredBy;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getOrderLocationId() {
        return orderLocationId;
    }

    public void setOrderLocationId(String orderLocationId) {
        this.orderLocationId = orderLocationId;
    }

    public String getOrderLocation() {
        return orderLocation;
    }

    public void setOrderLocation(String orderLocation) {
        this.orderLocation = orderLocation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLabNo() {
        return labNo;
    }

    public void setLabNo(String labNo) {
        this.labNo = labNo;
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent;
    }

    public String getCancellingRemarks() {
        return cancellingRemarks;
    }

    public void setCancellingRemarks(String cancellingRemarks) {
        this.cancellingRemarks = cancellingRemarks;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getRefundBy() {
        return refundBy;
    }

    public void setRefundBy(String refundBy) {
        this.refundBy = refundBy;
    }

    public String getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(String refundDate) {
        this.refundDate = refundDate;
    }

    public String getRefundTerminal() {
        return refundTerminal;
    }

    public void setRefundTerminal(String refundTerminal) {
        this.refundTerminal = refundTerminal;
    }

    public String getRefundDetailId() {
        return refundDetailId;
    }

    public void setRefundDetailId(String refundDetailId) {
        this.refundDetailId = refundDetailId;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getCashRefundAmount() {
        return cashRefundAmount;
    }

    public void setCashRefundAmount(String cashRefundAmount) {
        this.cashRefundAmount = cashRefundAmount;
    }

    public String getRefundRemarks() {
        return refundRemarks;
    }

    public void setRefundRemarks(String refundRemarks) {
        this.refundRemarks = refundRemarks;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }

    public String getTechnologistRequired() {
        return technologistRequired;
    }

    public void setTechnologistRequired(String technologistRequired) {
        this.technologistRequired = technologistRequired;
    }

    public String getImagesRequired() {
        return imagesRequired;
    }

    public void setImagesRequired(String imagesRequired) {
        this.imagesRequired = imagesRequired;
    }

    public String getHistoryRequired() {
        return historyRequired;
    }

    public void setHistoryRequired(String historyRequired) {
        this.historyRequired = historyRequired;
    }

    public String getOrderHistoryRequired() {
        return orderHistoryRequired;
    }

    public void setOrderHistoryRequired(String orderHistoryRequired) {
        this.orderHistoryRequired = orderHistoryRequired;
    }

    public String getHistoryQuestionaireTypeId() {
        return historyQuestionaireTypeId;
    }

    public void setHistoryQuestionaireTypeId(String historyQuestionaireTypeId) {
        this.historyQuestionaireTypeId = historyQuestionaireTypeId;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getDvd() {
        return dvd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public String getFilms() {
        return films;
    }

    public void setFilms(String films) {
        this.films = films;
    }

    public String getReceivedDescription() {
        return receivedDescription;
    }

    public void setReceivedDescription(String receivedDescription) {
        this.receivedDescription = receivedDescription;
    }

    public String getInvoiced() {
        return invoiced;
    }

    public void setInvoiced(String invoiced) {
        this.invoiced = invoiced;
    }

    public String getAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(String acknowledged) {
        this.acknowledged = acknowledged;
    }

    public String getAcknowledgedBy() {
        return acknowledgedBy;
    }

    public void setAcknowledgedBy(String acknowledgedBy) {
        this.acknowledgedBy = acknowledgedBy;
    }

    public String getAcknowledgedDate() {
        return acknowledgedDate;
    }

    public void setAcknowledgedDate(String acknowledgedDate) {
        this.acknowledgedDate = acknowledgedDate;
    }

    public String getPerformed() {
        return performed;
    }

    public void setPerformed(String performed) {
        this.performed = performed;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    public String getPerformedDate() {
        return performedDate;
    }

    public void setPerformedDate(String performedDate) {
        this.performedDate = performedDate;
    }

    public String getCptId() {
        return cptId;
    }

    public void setCptId(String cptId) {
        this.cptId = cptId;
    }

    public String getCptDescription() {
        return cptDescription;
    }

    public void setCptDescription(String cptDescription) {
        this.cptDescription = cptDescription;
    }

    public String getCptRemarks() {
        return cptRemarks;
    }

    public void setCptRemarks(String cptRemarks) {
        this.cptRemarks = cptRemarks;
    }

    public String getCptReportTime() {
        return cptReportTime;
    }

    public void setCptReportTime(String cptReportTime) {
        this.cptReportTime = cptReportTime;
    }

    public String getPerformingLocationId() {
        return performingLocationId;
    }

    public void setPerformingLocationId(String performingLocationId) {
        this.performingLocationId = performingLocationId;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportDeliveryTime() {
        return reportDeliveryTime;
    }

    public void setReportDeliveryTime(String reportDeliveryTime) {
        this.reportDeliveryTime = reportDeliveryTime;
    }

    public String getSundayReport() {
        return sundayReport;
    }

    public void setSundayReport(String sundayReport) {
        this.sundayReport = sundayReport;
    }

    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public String getAccessionNo() {
        return accessionNo;
    }

    public void setAccessionNo(String accessionNo) {
        this.accessionNo = accessionNo;
    }

    public String getImagingNo() {
        return imagingNo;
    }

    public void setImagingNo(String imagingNo) {
        this.imagingNo = imagingNo;
    }

    public String getSpecimenId() {
        return specimenId;
    }

    public void setSpecimenId(String specimenId) {
        this.specimenId = specimenId;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(String sectionNo) {
        this.sectionNo = sectionNo;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getStatCost() {
        return statCost;
    }

    public void setStatCost(String statCost) {
        this.statCost = statCost;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getCptCodeCounter() {
        return cptCodeCounter;
    }

    public void setCptCodeCounter(String cptCodeCounter) {
        this.cptCodeCounter = cptCodeCounter;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getTestLimit() {
        return testLimit;
    }

    public void setTestLimit(String testLimit) {
        this.testLimit = testLimit;
    }

    public String getRemarksRequired() {
        return remarksRequired;
    }

    public void setRemarksRequired(String remarksRequired) {
        this.remarksRequired = remarksRequired;
    }

    public String getMultipleCptOrders() {
        return multipleCptOrders;
    }

    public void setMultipleCptOrders(String multipleCptOrders) {
        this.multipleCptOrders = multipleCptOrders;
    }

    public String getContractPrice() {
        return contractPrice;
    }

    public void setContractPrice(String contractPrice) {
        this.contractPrice = contractPrice;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(String consultantId) {
        this.consultantId = consultantId;
    }

    public String getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(String specialityId) {
        this.specialityId = specialityId;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getAdvanceAdjusted() {
        return advanceAdjusted;
    }

    public void setAdvanceAdjusted(String advanceAdjusted) {
        this.advanceAdjusted = advanceAdjusted;
    }

    public String getInvoiceDetailId() {
        return invoiceDetailId;
    }

    public void setInvoiceDetailId(String invoiceDetailId) {
        this.invoiceDetailId = invoiceDetailId;
    }

    public String getConsultancyId() {
        return consultancyId;
    }

    public void setConsultancyId(String consultancyId) {
        this.consultancyId = consultancyId;
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

    public String getMobilityStatusId() {
        return mobilityStatusId;
    }

    public void setMobilityStatusId(String mobilityStatusId) {
        this.mobilityStatusId = mobilityStatusId;
    }

    public String getSampleStatusId() {
        return sampleStatusId;
    }

    public void setSampleStatusId(String sampleStatusId) {
        this.sampleStatusId = sampleStatusId;
    }

    public String getMobilityStatusDescription() {
        return mobilityStatusDescription;
    }

    public void setMobilityStatusDescription(String mobilityStatusDescription) {
        this.mobilityStatusDescription = mobilityStatusDescription;
    }

    public String getReferringDoctorId() {
        return referringDoctorId;
    }

    public void setReferringDoctorId(String referringDoctorId) {
        this.referringDoctorId = referringDoctorId;
    }

    public String getReferringDoctorDescription() {
        return referringDoctorDescription;
    }

    public void setReferringDoctorDescription(String referringDoctorDescription) {
        this.referringDoctorDescription = referringDoctorDescription;
    }

    public String getReportingDoctorId() {
        return reportingDoctorId;
    }

    public void setReportingDoctorId(String reportingDoctorId) {
        this.reportingDoctorId = reportingDoctorId;
    }

    public String getReportingDoctorDescription() {
        return reportingDoctorDescription;
    }

    public void setReportingDoctorDescription(String reportingDoctorDescription) {
        this.reportingDoctorDescription = reportingDoctorDescription;
    }

    public String getClinicalHistory() {
        return clinicalHistory;
    }

    public void setClinicalHistory(String clinicalHistory) {
        this.clinicalHistory = clinicalHistory;
    }

    public String getRadiographerInstruction() {
        return radiographerInstruction;
    }

    public void setRadiographerInstruction(String radiographerInstruction) {
        this.radiographerInstruction = radiographerInstruction;
    }

    public String getPregnancyStatus() {
        return pregnancyStatus;
    }

    public void setPregnancyStatus(String pregnancyStatus) {
        this.pregnancyStatus = pregnancyStatus;
    }

    public String getPregnancyMonth() {
        return pregnancyMonth;
    }

    public void setPregnancyMonth(String pregnancyMonth) {
        this.pregnancyMonth = pregnancyMonth;
    }

    public String getTotalBarcodeLabels() {
        return totalBarcodeLabels;
    }

    public void setTotalBarcodeLabels(String totalBarcodeLabels) {
        this.totalBarcodeLabels = totalBarcodeLabels;
    }

    public String getLmp() {
        return lmp;
    }

    public void setLmp(String lmp) {
        this.lmp = lmp;
    }

    public String getInhouseDoctorId() {
        return inhouseDoctorId;
    }

    public void setInhouseDoctorId(String inhouseDoctorId) {
        this.inhouseDoctorId = inhouseDoctorId;
    }

    public String getCancellingUser() {
        return cancellingUser;
    }

    public void setCancellingUser(String cancellingUser) {
        this.cancellingUser = cancellingUser;
    }

    public String getCancellingDate() {
        return cancellingDate;
    }

    public void setCancellingDate(String cancellingDate) {
        this.cancellingDate = cancellingDate;
    }

    public String getCreatinine() {
        return creatinine;
    }

    public void setCreatinine(String creatinine) {
        this.creatinine = creatinine;
    }

    public String getEgfr() {
        return egfr;
    }

    public void setEgfr(String egfr) {
        this.egfr = egfr;
    }

    public String getAsthmaStatus() {
        return asthmaStatus;
    }

    public void setAsthmaStatus(String asthmaStatus) {
        this.asthmaStatus = asthmaStatus;
    }

    public String getAsthmaDescription() {
        return asthmaDescription;
    }

    public void setAsthmaDescription(String asthmaDescription) {
        this.asthmaDescription = asthmaDescription;
    }

    public String getCardiacStatus() {
        return cardiacStatus;
    }

    public void setCardiacStatus(String cardiacStatus) {
        this.cardiacStatus = cardiacStatus;
    }

    public String getCardiacDescription() {
        return cardiacDescription;
    }

    public void setCardiacDescription(String cardiacDescription) {
        this.cardiacDescription = cardiacDescription;
    }

    public String getDialysisStatus() {
        return dialysisStatus;
    }

    public void setDialysisStatus(String dialysisStatus) {
        this.dialysisStatus = dialysisStatus;
    }

    public String getDialysisDescription() {
        return dialysisDescription;
    }

    public void setDialysisDescription(String dialysisDescription) {
        this.dialysisDescription = dialysisDescription;
    }

    public String getDiabaticStatus() {
        return diabaticStatus;
    }

    public void setDiabaticStatus(String diabaticStatus) {
        this.diabaticStatus = diabaticStatus;
    }

    public String getDiabaticDescription() {
        return diabaticDescription;
    }

    public void setDiabaticDescription(String diabaticDescription) {
        this.diabaticDescription = diabaticDescription;
    }

    public String getRenalDiseaseStatus() {
        return renalDiseaseStatus;
    }

    public void setRenalDiseaseStatus(String renalDiseaseStatus) {
        this.renalDiseaseStatus = renalDiseaseStatus;
    }

    public String getRenalDiseaseDescription() {
        return renalDiseaseDescription;
    }

    public void setRenalDiseaseDescription(String renalDiseaseDescription) {
        this.renalDiseaseDescription = renalDiseaseDescription;
    }

    public String getAllergyStatus() {
        return allergyStatus;
    }

    public void setAllergyStatus(String allergyStatus) {
        this.allergyStatus = allergyStatus;
    }

    public String getAllergyDescription() {
        return allergyDescription;
    }

    public void setAllergyDescription(String allergyDescription) {
        this.allergyDescription = allergyDescription;
    }

    public String getFeverStatus() {
        return feverStatus;
    }

    public void setFeverStatus(String feverStatus) {
        this.feverStatus = feverStatus;
    }

    public String getFeverDescription() {
        return feverDescription;
    }

    public void setFeverDescription(String feverDescription) {
        this.feverDescription = feverDescription;
    }

    public String getSurgeryStatus() {
        return surgeryStatus;
    }

    public void setSurgeryStatus(String surgeryStatus) {
        this.surgeryStatus = surgeryStatus;
    }

    public String getSurgeryDescription() {
        return surgeryDescription;
    }

    public void setSurgeryDescription(String surgeryDescription) {
        this.surgeryDescription = surgeryDescription;
    }

    public String getATTAStatus() {
        return ATTAStatus;
    }

    public void setATTAStatus(String ATTAStatus) {
        this.ATTAStatus = ATTAStatus;
    }

    public String getATTADescription() {
        return ATTADescription;
    }

    public void setATTADescription(String ATTADescription) {
        this.ATTADescription = ATTADescription;
    }

    public String getTraumaStatus() {
        return traumaStatus;
    }

    public void setTraumaStatus(String traumaStatus) {
        this.traumaStatus = traumaStatus;
    }

    public String getTraumaDescription() {
        return traumaDescription;
    }

    public void setTraumaDescription(String traumaDescription) {
        this.traumaDescription = traumaDescription;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getPrescriptionPath() {
        return prescriptionPath;
    }

    public void setPrescriptionPath(String prescriptionPath) {
        this.prescriptionPath = prescriptionPath;
    }

    public String getPdfServer() {
        return pdfServer;
    }

    public void setPdfServer(String pdfServer) {
        this.pdfServer = pdfServer;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getInvoiceDateType() {
        return invoiceDateType;
    }

    public void setInvoiceDateType(Date invoiceDateType) {
        this.invoiceDateType = invoiceDateType;
        this.invoiceDate = invoiceDateType.toString();
    }

    public String getCptPackage() {
        return cptPackage;
    }

    public void setCptPackage(String cptPackage) {
        this.cptPackage = cptPackage;
    }

    public String getInvPatientId() {
        return InvPatientId;
    }

    public void setInvPatientId(String InvPatientId) {
        this.InvPatientId = InvPatientId;
    }

    public String getInvPatientName() {
        return InvPatientName;
    }

    public void setInvPatientName(String InvPatientName) {
        this.InvPatientName = InvPatientName;
    }

    public String getInvGender() {
        return InvGender;
    }

    public void setInvGender(String InvGender) {
        this.InvGender = InvGender;
    }

    public String getInvClientName() {
        return InvClientName;
    }

    public void setInvClientName(String InvClientName) {
        this.InvClientName = InvClientName;
    }

    public boolean isChkCredit() {
        return chkCredit;
    }

    public void setChkCredit(boolean chkCredit) {
        this.chkCredit = chkCredit;
    }

    public boolean isChkRefferal() {
        return chkRefferal;
    }

    public void setChkRefferal(boolean chkRefferal) {
        this.chkRefferal = chkRefferal;
    }

    public String getInvPayableAmount() {
        return InvPayableAmount;
    }

    public void setInvPayableAmount(String InvPayableAmount) {
        this.InvPayableAmount = InvPayableAmount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OfflineOrderData other = (OfflineOrderData) obj;
        if (!Objects.equals(this.patientId, other.patientId)) {
            return false;
        }
        if (!Objects.equals(this.completeOrderNo, other.completeOrderNo)) {
            return false;
        }
        if (!Objects.equals(this.cptId, other.cptId)) {
            return false;
        }
        return true;
    }

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }

    public String getCptReportingFormat() {
        return cptReportingFormat;
    }

    public void setCptReportingFormat(String cptReportingFormat) {
        this.cptReportingFormat = cptReportingFormat;
    }

    public String getSectionDescription() {
        return sectionDescription;
    }

    public void setSectionDescription(String sectionDescription) {
        this.sectionDescription = sectionDescription;
    }

    public String getCancelRequestBy() {
        return cancelRequestBy;
    }

    public void setCancelRequestBy(String cancelRequestBy) {
        this.cancelRequestBy = cancelRequestBy;
    }

    public String getCancelRequestDate() {
        return cancelRequestDate;
    }

    public void setCancelRequestDate(String cancelRequestDate) {
        this.cancelRequestDate = cancelRequestDate;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public void setLabCode(String labCode) {
        this.labCode = labCode;
    }

    public String getLabCode() {
        return this.labCode;
    }

    public String getDepartmentOrderStatusId() {
        return departmentOrderStatusId;
    }

    public void setDepartmentOrderStatusId(String departmentOrderStatusId) {
        this.departmentOrderStatusId = departmentOrderStatusId;
    }

    public String getCptload() {
        return cptload;
    }

    public void setCptload(String cptload) {
        this.cptload = cptload;
    }

    public String getBloodGroupId() {
        return bloodGroupId;
    }

    public void setBloodGroupId(String bloodGroupId) {
        this.bloodGroupId = bloodGroupId;
    }

    public String getDetailFsAmount() {
        return detailFsAmount;
    }

    public void setDetailFsAmount(String detailFsAmount) {
        this.detailFsAmount = detailFsAmount;
    }

}