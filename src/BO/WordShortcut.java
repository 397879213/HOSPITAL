package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class WordShortcut implements java.io.Serializable {

    public String id = "";
    public String word = "";
    public String shortcut = "";
    public String description = "";
    public String definedBy = "";
    public String type = "";
    public String userType = "";
    public String active = "";
    public String departmentId = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
