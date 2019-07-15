package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class SetupColumnDetail implements java.io.Serializable {

    private String id = "";
    private String tableRowId = "";
    private String rowDescription = "";
    private String tableColumnId = "";
    private String columnDescription = "";
    private String description = "";
    private String active = "";

    private String property = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
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

    public String getTableRowId() {
        return tableRowId;
    }

    public void setTableRowId(String tableRowId) {
        this.tableRowId = tableRowId;
    }

    public String getRowDescription() {
        return rowDescription;
    }

    public void setRowDescription(String rowDescription) {
        this.rowDescription = rowDescription;
    }

    public String getTableColumnId() {
        return tableColumnId;
    }

    public void setTableColumnId(String tableColumnId) {
        this.tableColumnId = tableColumnId;
    }

    public String getColumnDescription() {
        return columnDescription;
    }

    public void setColumnDescription(String columnDescription) {
        this.columnDescription = columnDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
