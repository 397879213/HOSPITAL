/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;


import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */

@ManagedBean


public class Parameter implements java.io.Serializable{
    

    public String parameterId = "";
    public String description = "";
    public String unit = "";
    public String active = "";
    public String displayName = "";
    public String comments = "";
    public String type = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
