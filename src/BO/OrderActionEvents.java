/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BO;


import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */

@ManagedBean


public class OrderActionEvents implements java.io.Serializable{
    
    
    private String completeOrderNo = "";
    private String orderDetailId = "";
    private String actionId = "";
    private String actionDescription = "";
    private String actionDate = "";
    private String actionById = "";
    private String actionBy = "";
    private String actionTerminalId = "";
    private String actionTerminal = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
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

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public String getActionDescription() {
        return actionDescription;
    }

    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    public String getActionDate() {
        return actionDate;
    }

    public void setActionDate(String actionDate) {
        this.actionDate = actionDate;
    }

    public String getActionById() {
        return actionById;
    }

    public void setActionById(String actionById) {
        this.actionById = actionById;
    }

    public String getActionBy() {
        return actionBy;
    }

    public void setActionBy(String actionBy) {
        this.actionBy = actionBy;
    }

    public String getActionTerminalId() {
        return actionTerminalId;
    }

    public void setActionTerminalId(String actionTerminalId) {
        this.actionTerminalId = actionTerminalId;
    }

    public String getActionTerminal() {
        return actionTerminal;
    }

    public void setActionTerminal(String actionTerminal) {
        this.actionTerminal = actionTerminal;
    }
    
    
    
                    
}
