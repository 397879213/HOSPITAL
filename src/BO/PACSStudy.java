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


public class PACSStudy implements java.io.Serializable{
    
    public String frontServer = "";
    public String backupServer = "";
    public String accessionNO = "";
    public String studyPath = "";
    public String CTRequiredServer = "";
    public String totalImages = "";
    public boolean isEncrypted = false;
    
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
    
    
}
