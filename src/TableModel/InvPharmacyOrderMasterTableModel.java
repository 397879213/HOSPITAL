/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import javax.swing.table.AbstractTableModel;
import BO.OrderData;
import java.util.List;


public class InvPharmacyOrderMasterTableModel extends AbstractTableModel {

   private String[] columnNames = {"Order No", "Order By", "Order Date"}; 
   private Object[][] data;

    public InvPharmacyOrderMasterTableModel(List orders) {
        
        data = new Object[orders.size()][columnNames.length];
        int row = 0;
        for (int i = 0; i<orders.size(); i++) {
            OrderData order = (OrderData) orders.get(i);
            data[row][0] = order.getOrderNo().substring(3);
            data[row][1] = order.getOrderBy();
            data[row][2] = order.getOrderDate();
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
