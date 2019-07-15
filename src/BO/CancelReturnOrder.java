/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.util.Objects;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */

@ManagedBean


public class CancelReturnOrder implements java.io.Serializable{

    private String patientId = "";
    private String completeOrderNo = "";
    private String orderDetailId = "";
    private String actionRemarks = "";
    private String cancelRequestRemarks = "";
    private String cancelRequestTypeId = "";
    private String cancelRequestType = "";
    private String requestedBy = "";
    private String requestedDate = "";
    private String requestedTerminalId = "";
    private String cancelActionBy = "";
    private String cancelActionTerminalId = "";
    private String cancelActionDate = "";
    private String itemId = "";
    private String itemDescription = "";
    private String cancelReturnId = "";
    private String quantity = "1";
    private String orderStatusId = "";
    private String orderStatus = "";
    private String locationId = "";
    private String locationName = "";
    private String departmentId = "";
    private String departmentName = "";
    
    private String itemTypeId = "5001";
    private String itemTypeDescription = "PROCEDURE";
    private String dispenseQuantity;
    private String orderQuantity;

    //For Medicine
    private String returnQuantity = "0";
    private String cancelQuantity = "0";
    private String refundQuantity = "0";
    private String patientName = "";
    private String invoiceDate = "";
    private String invoiceNo = "";
    private String invoiceBy = "";
    private String balanceAmount = "";
    private String receivedAmount = "";
    private String totalAmount = "";
    private String payableAmount = "";
    private String customerId = "";
    private String price = "";
    private String cancelRequestBy = "";
    private String cancelRequestDate = "";
    private String cancelRequestTerminal = "";
    private String  storeId="0";
    private String sectionId;
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
    public String getCancelRequestTerminal() {
        return cancelRequestTerminal;
    }

    public void setCancelRequestTerminal(String cancelRequestTerminal) {
        this.cancelRequestTerminal = cancelRequestTerminal;
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

   
    

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getInvoiceBy() {
        return invoiceBy;
    }

    public void setInvoiceBy(String invoiceBy) {
        this.invoiceBy = invoiceBy;
    }

    public String getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public String getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(String receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(String payableAmount) {
        this.payableAmount = payableAmount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getReturnQuantity() {
        return returnQuantity;
    }

    public void setReturnQuantity(String returnQuantity) {
        this.returnQuantity = returnQuantity;

    }

    public CancelReturnOrder() {

    }

    public String getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(String itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public String getItemTypeDescription() {
        return itemTypeDescription;
    }

    public void setItemTypeDescription(String itemTypeDescription) {
        this.itemTypeDescription = itemTypeDescription;
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

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getActionRemarks() {
        return actionRemarks;
    }

    public void setActionRemarks(String actionRemarks) {
        this.actionRemarks = actionRemarks;
    }

    public String getCancelRequestRemarks() {
        return cancelRequestRemarks;
    }

    public void setCancelRequestRemarks(String cancelRequestRemarks) {
        this.cancelRequestRemarks = cancelRequestRemarks;
    }

    public String getCancelRequestTypeId() {
        return cancelRequestTypeId;
    }

    public void setCancelRequestTypeId(String cancelRequestTypeId) {
        this.cancelRequestTypeId = cancelRequestTypeId;
    }

    public String getCancelRequestType() {
        return cancelRequestType;
    }

    public void setCancelRequestType(String cancelRequestType) {
        this.cancelRequestType = cancelRequestType;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    public String getRequestedTerminalId() {
        return requestedTerminalId;
    }

    public void setRequestedTerminalId(String requestedTerminalId) {
        this.requestedTerminalId = requestedTerminalId;
    }

    public String getCancelActionBy() {
        return cancelActionBy;
    }

    public void setCancelActionBy(String cancelActionBy) {
        this.cancelActionBy = cancelActionBy;
    }

    public String getCancelActionTerminalId() {
        return cancelActionTerminalId;
    }

    public void setCancelActionTerminalId(String cancelActionTerminalId) {
        this.cancelActionTerminalId = cancelActionTerminalId;
    }

    public String getCancelActionDate() {
        return cancelActionDate;
    }

    public void setCancelActionDate(String cancelActionDate) {
        this.cancelActionDate = cancelActionDate;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getCancelReturnId() {
        return cancelReturnId;
    }

    public void setCancelReturnId(String cancelReturnId) {
        this.cancelReturnId = cancelReturnId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getCancelQuantity() {
        return cancelQuantity;
    }

    public void setCancelQuantity(String cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }

    public String getRefundQuantity() {
        return refundQuantity;
    }

    public void setRefundQuantity(String refundQuantity) {
        this.refundQuantity = refundQuantity;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getDispenseQuantity() {
        return dispenseQuantity;
    }

    public void setDispenseQuantity(String dispenseQuantity) {
        this.dispenseQuantity = dispenseQuantity;
    }

    public String getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(String orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.itemDescription);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CancelReturnOrder other = (CancelReturnOrder) obj;
        if (!Objects.equals(this.itemDescription, other.itemDescription)) {
            return false;
        }
        return true;
    }

 
}
