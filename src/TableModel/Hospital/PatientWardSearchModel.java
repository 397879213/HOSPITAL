/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel.Hospital;

import TableModel.*;
import BO.WardBed;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pacslink
 */
public class PatientWardSearchModel extends AbstractTableModel {

    private String[] columnNames = {"ID", "WARD","Total Beds", "Allocated","Available"};

    private Object[][] data;

    public PatientWardSearchModel(List orders, int [] totalStatus) {
        data = new Object[orders.size()][columnNames.length];
        
        for (int i = 0; i < orders.size(); i++) {
            WardBed ward = (WardBed) orders.get(i);

            data[i][0] = ward.getWardId();
            data[i][1] = ward.getWardDescription();
            data[i][2] = ward.getTotalBeds();
            data[i][3] = ward.getAllocatedBeds();
            data[i][4] = ward.getAvailableBeds();
            totalStatus[0] += Integer.parseInt(ward.getTotalBeds());
            totalStatus[1] += Integer.parseInt(ward.getAllocatedBeds());
            totalStatus[2] += Integer.parseInt(ward.getAvailableBeds());
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

     //   if (col == 3) {
        //       return true;
        //  }
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
