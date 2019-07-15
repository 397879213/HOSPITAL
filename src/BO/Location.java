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


public class Location implements java.io.Serializable{

    public String id = "";      //Generate Increment (1)
    public String description = "";
    public String address = "";

    // location setup form
    public String title = "";
    public String email = "";
    public String website = "";
    public String active = "";                  //combo box (y , n)
    public String slogan = "";
    public String logo = "";
    public String mrnoLength = "";             //not need to display
    public String clientId = "";               //lov on client id
    public String locationTypeId = "";               //lov on client id
    public String locationTypeDescription = "";               //lov on client id
    public String organizationId = "";         //not need to display
    public String locationCashInvoice = "";	//lov on appReports
    public String locationCreditInvoice = ""; //lov on appReports
    public String appReportsPath = "";
    public String setupColumnDetailId = "";
    public String setupTableColumnId = "";
    public String tableRowId = "";
    public String tableColumnId = "";
    public String setupId = "";
    public String property = "";
    public String clientName = "";
    public String propertyDescription = "";
    public String activeProperty = "";
    public String propertyValue = "";

    public String cptIdForCptWiseLoc = "";
    public String cptDescForCptWiseLoc = "";

    public String cptWiselocTime = "";

    public String time = "";
    public String deliveryTime = "";

    //location wise department
    public String departmentId = "";
    public String departmentDesc = "";

    //location wise Setup
    public String locWiseSetupId = "";

    public String attachedId = "";
    public String attachedDesc = "";

    public String idToAttach = "";
    public String idToUttach = "";

    public String descriptionAttached = "";
    public String descriptionUnAttached = "";

    public String unAttachedId = "";
    public String unAttachedDesc = "";

    public String tableDescription = "";
    public String insertTable = "";
    public String selectTable = "";
    public String insertColumn = "";
    public String selectColumnId = "";
    public String selectColumnDescription = "";
    
    public String insertColumn1 = "";
    public String insertField1 = "";
    public String fieldValue1 = "";

    public String insertColumn2 = "";
    public String insertField2 = "";
    public String fieldValue2 = "";

    public String insertColumn3 = "";
    public String insertField3 = "";
    public String fieldValue3 = "";

    public String insertColumn4 = "";
    public String insertField4 = "";
    public String fieldValue4 = "";

    public String defTypeId = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
