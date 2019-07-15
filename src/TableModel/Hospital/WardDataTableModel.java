/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel.Hospital;

import BO.Hospital.BOFavBeds;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class WardDataTableModel extends AbstractTableModel {

    private final String[] columnNames
            = {"Sr.", "Ward Id","Ward Name", "Department"};
    private final Object[][] data;

    public WardDataTableModel(List<BOFavBeds> lis) {
        data = new Object[lis.size()][columnNames.length];
        for (int i = 0; i < lis.size(); i++) {
            BOFavBeds fb = lis.get(i);
            data[i][0] = (i+1);
            data[i][1] = fb.getWardId();
            data[i][2] = fb.getWardName();
            data[i][3] = fb.getDepartment();
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
//    @Override
//    public Class getColumnClass(int c) {
//        return getValueAt(0, c).getClass();
//    }

    /*
   
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
