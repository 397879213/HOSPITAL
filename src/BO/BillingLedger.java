package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class BillingLedger implements java.io.Serializable {

    private String voucherNo = "";
    private String account = "";
    private String cpt = "";
    private String patientId = "";
    private String patientName = "";
    private String transactionTypeId = "";
    private String contactNo = "";
    private String balanceAmount = "";
    private String age = "";
    private String gender = "";
    private String terminalId = "";
    private String transactionBy = "";
    private String transNo = "";
    private String transType = "";
    private String transDate = "";
    private float drAmount = 0;
    private float crAmount = 0;
    private float amount = 0;
    private int admissioNo = 0;
    private String approveComments = "";

    private String id = "";
    private String refundApproveBy = "";
    private String refundApproveDate = "";
    private String refundApproveTerminalId = "";
    private String approveLocationId = "";

    private String refundBy = "";
    private String refundDate = "";
    private String orderStatusId = "";
    private String refundTerminalId = "";
    private String refundLocationId = "";
    private String refundComments = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getVoucherNo() {
        return voucherNo;
    }

    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCpt() {
        return cpt;
    }

    public void setCpt(String cpt) {
        this.cpt = cpt;
    }

    public String getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(String transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
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

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTransactionBy() {
        return transactionBy;
    }

    public void setTransactionBy(String transactionBy) {
        this.transactionBy = transactionBy;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public float getDrAmount() {
        return drAmount;
    }

    public void setDrAmount(float drAmount) {
        this.drAmount = drAmount;
    }

    public float getCrAmount() {
        return crAmount;
    }

    public void setCrAmount(float crAmount) {
        this.crAmount = crAmount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getApproveComments() {
        return approveComments;
    }

    public void setApproveComments(String approveComments) {
        this.approveComments = approveComments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRefundApproveBy() {
        return refundApproveBy;
    }

    public void setRefundApproveBy(String refundApproveBy) {
        this.refundApproveBy = refundApproveBy;
    }

    public String getRefundApproveDate() {
        return refundApproveDate;
    }

    public void setRefundApproveDate(String refundApproveDate) {
        this.refundApproveDate = refundApproveDate;
    }

    public String getRefundApproveTerminalId() {
        return refundApproveTerminalId;
    }

    public void setRefundApproveTerminalId(String refundApproveTerminalId) {
        this.refundApproveTerminalId = refundApproveTerminalId;
    }

    public String getApproveLocationId() {
        return approveLocationId;
    }

    public void setApproveLocationId(String approveLocationId) {
        this.approveLocationId = approveLocationId;
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

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getRefundTerminalId() {
        return refundTerminalId;
    }

    public void setRefundTerminalId(String refundTerminalId) {
        this.refundTerminalId = refundTerminalId;
    }

    public String getRefundLocationId() {
        return refundLocationId;
    }

    public void setRefundLocationId(String refundLocationId) {
        this.refundLocationId = refundLocationId;
    }

    public String getRefundComments() {
        return refundComments;
    }

    public void setRefundComments(String refundComments) {
        this.refundComments = refundComments;
    }

    public int getAdmissioNo() {
        return admissioNo;
    }

    public void setAdmissioNo(int admissioNo) {
        this.admissioNo = admissioNo;
    }
    
    

}
