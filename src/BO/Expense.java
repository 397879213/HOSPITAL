
package BO;


import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */

@ManagedBean



public class Expense implements java.io.Serializable{
        
    public String transactionNo = null; 
    public String expenseId = "";
    public String expenseDescription = "";
    public int amount =0;
    public String expenseDate = "";
    public String trnDate = ""; 
    public String comments = "";
    public String expenseBy = "";
    public String terminalId = "";
    public String locationId = "";
    public String locationDescription = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
