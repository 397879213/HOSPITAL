/*
 * To change this template=""; choose Tools | Templates
 * and open the template in the editor.
 */
package BO;


import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */

@ManagedBean


public class ReportWiseParameter implements java.io.Serializable{

    private String reportId = "";
    private String parameterId = "";
    private String parameterName = "";
    private String parameterValue = "";
    private String parameterValueDescription = "";
    
    private String definitionTypeId = "";
    private String tableName = "";
    private String active = "";
    private String id = "";
    private String description = "";
    private String tableDisplay = "";
    private String displayDescription = "";
    private String required = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getParameterId() {
        return parameterId;
    }

    public void setParameterId(String parameterId) {
        this.parameterId = parameterId;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    public String getParameterValueDescription() {
        return parameterValueDescription;
    }

    public void setParameterValueDescription(String parameterValueDescription) {
        this.parameterValueDescription = parameterValueDescription;
    }

    public String getDefinitionTypeId() {
        return definitionTypeId;
    }

    public void setDefinitionTypeId(String definitionTypeId) {
        this.definitionTypeId = definitionTypeId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTableDisplay() {
        return tableDisplay;
    }

    public void setTableDisplay(String tableDisplay) {
        this.tableDisplay = tableDisplay;
    }

    public String getDisplayDescription() {
        return displayDescription;
    }

    public void setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }
    
    
    
    
    
    
}
