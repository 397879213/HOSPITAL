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


public class Machine implements java.io.Serializable{

    
    public String machineId = "";
    public String description = "";
    
    ///General Information
    public String model = "";
    public String vendor = "";
    public String departmentId = "";
    public String sectionId = "";
    public String locationid = "";
    public String type = "";
    public String active = "";
    
    //analzyers Information
    public String baudRate = "";
    public String stopBit = "";
    public String parity = "";
    public String dataBit = "";
    
    //modality information 
    public String ip = "";
    public String AETitle = "";
    public String port = "";
    public String worklistAETitle = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
    
    
}
