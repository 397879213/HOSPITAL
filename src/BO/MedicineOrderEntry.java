/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BO;

import java.io.Serializable;
import java.util.Objects;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */

@ManagedBean


public class MedicineOrderEntry implements Serializable {

    private String completeOrderNo = "";
    private String orderDetailId = "";
    private String itemId = "";
    private String patientId = "";
    private String itemDescription = "";
    private String customerId = "";
    private String customerName = "";
    private String admissionNumber= "";
    private String storeId = "";
    private String itemType = "";
    private String itemOrderType = "";
    private String doseTimeId = "";
    private String doseTimeDescription = "";
    private String doseQtyId = "";
    private String doseQtyDescription = "";
    private String duration = "";
    private String quantity = "0";
    private String departmentId = "";
    private String sectionId = "";
    private String salePrice = "0";
    private String genericId = "";
    private String orderSatusId = "";
    private String orderStatusDescription = "";
    private String unitPrice = "";
    private String crtdBy = "";
    private String crtdDate = "";
    private String crtdTerminal = "";
    private String cancelBy = "";
    private String cancelDate = "";
    private String cancelTerminal = "";
    private String cancelRemarks = "";
    private String consultancyId = "";
    private String orderDate = "";
    private String stockQuantity = "";
    private String performingContractId = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
    
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getItemOrderType() {
        return itemOrderType;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public void setItemOrderType(String itemOrderType) {
        this.itemOrderType = itemOrderType;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(String stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    
    public String getPerformingContractId() {
        return performingContractId;
    }

    public void setPerformingContractId(String performingContractId) {
        this.performingContractId = performingContractId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    

    
    
    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    } 
    
    public MedicineOrderEntry() {
    }

    public String getConsultancyId() {
        return consultancyId;
    }

    public void setConsultancyId(String consultancyId) {
        this.consultancyId = consultancyId;
    }

    public String getGenericId() {
        return genericId;
    }

    public void setGenericId(String genericId) {
        this.genericId = genericId;
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

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    
    
    
    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
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

    public String getDoseTimeId() {
        return doseTimeId;
    }

    public void setDoseTimeId(String doseTimeId) {
        this.doseTimeId = doseTimeId;
    }

    public String getDoseTimeDescription() {
        return doseTimeDescription;
    }

    public void setDoseTimeDescription(String doseTimeDescription) {
        this.doseTimeDescription = doseTimeDescription;
    }

    public String getDoseQtyId() {
        return doseQtyId;
    }

    public void setDoseQtyId(String doseQtyId) {
        this.doseQtyId = doseQtyId;
    }

    public String getDoseQtyDescription() {
        return doseQtyDescription;
    }

    public void setDoseQtyDescription(String doseQtyDescription) {
        this.doseQtyDescription = doseQtyDescription;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    
    
    
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCrtdBy() {
        return crtdBy;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }

    public String getCrtdDate() {
        return crtdDate;
    }

    public void setCrtdDate(String crtdDate) {
        this.crtdDate = crtdDate;
    }

    public String getCrtdTerminal() {
        return crtdTerminal;
    }

    public void setCrtdTerminal(String crtdTerminal) {
        this.crtdTerminal = crtdTerminal;
    }

    public String getCancelBy() {
        return cancelBy;
    }

    public void setCancelBy(String cancelBy) {
        this.cancelBy = cancelBy;
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getCancelTerminal() {
        return cancelTerminal;
    }

    public void setCancelTerminal(String cancelTerminal) {
        this.cancelTerminal = cancelTerminal;
    }

    public String getCancelRemarks() {
        return cancelRemarks;
    }

    public void setCancelRemarks(String cancelRemarks) {
        this.cancelRemarks = cancelRemarks;
    }

    public String getOrderSatusId() {
        return orderSatusId;
    }

    public void setOrderSatusId(String orderSatusId) {
        this.orderSatusId = orderSatusId;
    }

    public String getOrderStatusDescription() {
        return orderStatusDescription;
    }

    public void setOrderStatusDescription(String orderSatusDescription) {
        this.orderStatusDescription = orderSatusDescription;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.completeOrderNo);
        hash = 29 * hash + Objects.hashCode(this.orderDetailId);
        hash = 29 * hash + Objects.hashCode(this.itemId);
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
        final MedicineOrderEntry other = (MedicineOrderEntry) obj;
        if (!Objects.equals(this.completeOrderNo, other.completeOrderNo)) {
            return false;
        }
        if (!Objects.equals(this.orderDetailId, other.orderDetailId)) {
            return false;
        }
        if (!Objects.equals(this.itemId, other.itemId)) {
            return false;
        }
        return true;
    }
        
    
    
}
