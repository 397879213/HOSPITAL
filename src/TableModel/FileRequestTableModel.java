/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import BO.FileRecordRequest;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pacslink
 */
public class FileRequestTableModel extends AbstractTableModel {

    private String[] columnNames = {"Patient Id", "REQUESTED BY", 
        "REQUESTED DATE", "STATUS"};

    private Object[][] data;

    public FileRequestTableModel(List lovs) {
        data = new Object[lovs.size()][columnNames.length];

        for (int i = 0; i < lovs.size(); i++) {
            FileRecordRequest fr = (FileRecordRequest) lovs.get(i);
            if(fr.getPatientId().length()==0){
               fr.setPatientId("   "); 
            }
            data[i][0] = fr.getPatientId().substring(3);
            data[i][1] = fr.getRequestedBy();
            data[i][2] = fr.getRequestedDate();
            data[i][3] = fr.getStatus();
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
