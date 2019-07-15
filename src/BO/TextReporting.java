package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class TextReporting implements java.io.Serializable {

    public String orderDetailId = "";
    public String sectionNo = "";
    public String completeOrderNo = "";
    public String parameter = "";
    public String description = "";
    public String position = "";
    public String active = "Y";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}//
