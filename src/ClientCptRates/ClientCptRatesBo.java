

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClientCptRates;
 
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */

@ManagedBean


public class ClientCptRatesBo implements java.io.Serializable {

    private String completeOrderNo = "";
    private String orderDetailId = "";
    private String SumPayablelAmount = "";
    private String SumRefundAmount = "";
    private String refundNo = "";
    private String SumBlanceAmount = "";
    private String invoiceNo = "";
    private String statusId = "";
    private String cptId = "";
    private String cptName = "";
    private String price = "";
    private String UpdatePrice = "";
    private String payablelAmount = "";
    private String refundAmount = "";
    private String balanceAmount = "";
    private String totalAmount = "";
    private String invoiceBalanceAdjsted = "";
    private String unitPrice = "";
    private String reportPendingAmount = "";

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

    public String getSumPayablelAmount() {
        return SumPayablelAmount;
    }

    public void setSumPayablelAmount(String SumPayablelAmount) {
        this.SumPayablelAmount = SumPayablelAmount;
    }

    public String getSumRefundAmount() {
        return SumRefundAmount;
    }

    public void setSumRefundAmount(String SumRefundAmount) {
        this.SumRefundAmount = SumRefundAmount;
    }

    public String getSumBlanceAmount() {
        return SumBlanceAmount;
    }

    public void setSumBlanceAmount(String SumBlanceAmount) {
        this.SumBlanceAmount = SumBlanceAmount;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getCptId() {
        return cptId;
    }

    public void setCptId(String cptId) {
        this.cptId = cptId;
    }

    public String getCptName() {
        return cptName;
    }

    public void setCptName(String cptName) {
        this.cptName = cptName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUpdatePrice() {
        return UpdatePrice;
    }

    public void setUpdatePrice(String UpdatePrice) {
        this.UpdatePrice = UpdatePrice;
    }

    public String getPayablelAmount() {
        return payablelAmount;
    }

    public void setPayablelAmount(String payablelAmount) {
        this.payablelAmount = payablelAmount;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getInvoiceBalanceAdjsted() {
        return invoiceBalanceAdjsted;
    }

    public void setInvoiceBalanceAdjsted(String invoiceBalanceAdjsted) {
        this.invoiceBalanceAdjsted = invoiceBalanceAdjsted;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getReportPendingAmount() {
        return reportPendingAmount;
    }

    public void setReportPendingAmount(String reportPendingAmount) {
        this.reportPendingAmount = reportPendingAmount;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }
}
