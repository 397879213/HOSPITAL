/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TableModel.Hospital;

import BO.Hospital.DischargePatientDetail;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author adnan
 */
public class itemDischargeTableModel extends AbstractTableModel{
    
      private final String[] columnNames = {"AD.NO","DESCRIPTION","TYPE","REMARKS"};

    private final Object[][] data;

    public itemDischargeTableModel(List<DischargePatientDetail> cps) {
        boolean check = false;
        
        data = new Object[cps.size()][columnNames.length];
        int row = 0;

        for (int i = 0; i < cps.size(); i++) {
            DischargePatientDetail cp = cps.get(i);
            data[row][0] = cp.getAdmissionNo();
            data[row][1] = cp.getCptItemDescription();
            data[row][2] = cp.getType();
            data[row][3] = cp.getRemarks();
           
            row++;
        }
    }

      @Override
    public int getColumnCount() {
        return columnNames.length;
    }

      @Override
    public int getRowCount() {
        return data.length;
    }

      @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

      @Override
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    /*
     * JTable uses this method to determine the default renderer/
     * editor for each cell.  If we didn't implement this method,
     * then the last column would contain text ("true"/"false"),
     * rather than a check box.
     */
      @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
      @Override
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen
        return false;
    }

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */
    private final boolean DEBUG = false;

      @Override
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
