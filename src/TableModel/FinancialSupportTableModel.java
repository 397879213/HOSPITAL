/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import BO.PatientFinancialSupport;

public class FinancialSupportTableModel extends AbstractTableModel {

    private String[] columnNames = {"TRANS_DATE", "TRANS_BY", "TYPE",
        "TOTAL AMOUNT", "SUPPORT AMOUNT", "FORM NO"};
    private Object[][] data;

    public FinancialSupportTableModel(Vector orders) {

        data = new Object[orders.size()][columnNames.length];
        int row = 0;
        for (int i = 0; i < orders.size(); i++) {
            PatientFinancialSupport fin = (PatientFinancialSupport) orders.get(i);
            data[row][0] = fin.getTransactionDate();
            data[row][1] = fin.getTransactionBy();
            data[row][2] = fin.getSupportType();
            data[row][3] = fin.getTotalAmount();
            data[row][4] = "" + (int) fin.getSupportAmount();
            data[row][5] = fin.getZakatFormNo();
            row++;
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
        if (col < 2) {
            return false;
        } else {
            return true;
        }
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
