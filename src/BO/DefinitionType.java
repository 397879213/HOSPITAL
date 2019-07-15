/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;


public class DefinitionType implements java.io.Serializable {

    public String defTypeId = "";
    public String description = "";
    public String activeTypeDetail = "";
    public String activeType = "";
    public String comments = "";
    public String crtdBy = "";
    public String crtdDate = "";
    public String uptdBy = "";
    public String uptdDate = "";
    public String defTypeDetailId = "";
    public String defTypeDetailDescription = "";
    public String additionalInfo = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
