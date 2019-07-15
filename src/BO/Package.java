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


public class Package implements java.io.Serializable{
    
    
    
    public String id = "";
    public String description = "";
    public String active = "";
    public String defTypeId = "";
    public String clientWisePackageId = "";
    
    public String cptCost = "";
    public String cptDescription = "";
    public String cptId = "";
    public String pacakgeId = "";
    public String packageName = "";
    public String clientId = "";
    public String clientDescription = "";
    public String locationId = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
