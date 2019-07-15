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

public class ReportingPhysicians implements java.io.Serializable {

    public String farwordBy = "";
    public String farwordDate = "";
    public String farwordTo = "";
    public String completeOrderNo = "";
    public String orderDetailId = "";
    public String active = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
