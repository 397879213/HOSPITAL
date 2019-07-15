/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import BO.OfflineOrderData;
import BO.OrderData;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class InvoiceMasterTableModel extends AbstractTableModel {

    private String[] columnNames = {"Sr.", "Patient Id", "Name", "Invoice Date", "Invoice By"};

    
    private Object[][] data;

        public InvoiceMasterTableModel(List<OfflineOrderData> listQuestions) {
        data = new Object[listQuestions.size()][columnNames.length];
        int row = 0;
        int i = 1;

        for (OfflineOrderData patientQuestions : listQuestions) {
            OfflineOrderData currentInfo
                    = (OfflineOrderData) patientQuestions;
            data[row][0] = i++;
            data[row][1] = currentInfo.getPatientId();
            data[row][2] = currentInfo.getPatientName();
            data[row][3] = currentInfo.getInvoiceDate();
            data[row][4] = currentInfo.getInvoiceBy();
        }
 }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    /*
     * JTable uses this method to determine the default renderer/
     * editor for each cell.  If we didn't implement this method,
     * then the last column would contain text ("true"/"false"),
     * rather than a check box.
     */
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        
            return false;
        
    }

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */
    private boolean DEBUG = false;

    public void setValueAt(Object value, int row, int col) {
        if (DEBUG) {
            System.out.println("Setting value at " + row + "," + col
                    + " to " + value
                    + " (an instance of "
                    + value.getClass() + ")");
        }

        data[row][col] = value;
        fireTableCellUpdated(row, col);

        if (DEBUG) {
            System.out.println("New value of data:");
            printDebugData();
        }
    }

    private void printDebugData() {
        int numRows = getRowCount();
        int numCols = getColumnCount();

        for (int i = 0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j = 0; j < numCols; j++) {
                System.out.print("  " + data[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
}
