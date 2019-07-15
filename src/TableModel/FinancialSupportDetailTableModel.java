/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import javax.swing.table.AbstractTableModel;
import BO.PatientFinancialSupport;
import java.util.List;

public class FinancialSupportDetailTableModel extends AbstractTableModel {

    private String[] columnNames = {"Sr.No", "Support Type", "Support By",
        "Support Date", "Support Amount", "Select"};
    private Object[][] data;

    public FinancialSupportDetailTableModel(List orders) {

        data = new Object[orders.size()][columnNames.length];
        int row = 0;
        for (int i = 0; i < orders.size(); i++) {
            PatientFinancialSupport supportDetails = (PatientFinancialSupport) orders.get(i);
            data[row][0] = row + 1;
            data[row][1] = supportDetails.getSupportType();
            data[row][2] = supportDetails.getSupportGivenBy();
            data[row][3] = supportDetails.getSupportGivenDate();
            data[row][4] = supportDetails.getFinancialSupportAmount();
            data[row][5] = false;
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
        
        if (col == 5) {
            return true;
        } else {
            return false;
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
