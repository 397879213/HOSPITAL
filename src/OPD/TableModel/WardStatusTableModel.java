/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OPD.TableModel;

import OPD.BO.WardStatusBO;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sibtain
 */
public class WardStatusTableModel extends AbstractTableModel {

    private final String[] columnNames = 
                {"Sr.", "C1", "C2", "C3",
                "C4", "C5", "C6", "C7",
                "C8", "C9", "C10", "C11", "C12",
                "C13", "C14", "C15", "C16", "C17", "C18",
                "C19", "C20", "C21", "C22", "C23", "C24"};
    
    
    
    

    private Object[][] data;

    public WardStatusTableModel(List<WardStatusBO> li) {
        data = new Object[li.size()][columnNames.length];
        for (int i = 0; i < li.size(); i++) {
            WardStatusBO dS = li.get(i);
            data[i][0] = (i+1);
            data[i][1] = dS.getWardDescription();
            data[i][2] = dS.getTotalBeds();
            data[i][3] = dS.getPreviousAdmitted();
            data[i][4] = dS.getNewAdmitted();
            data[i][5] = dS.getTotalDischarge();
            data[i][6] = dS.getTransferIn();
            data[i][7] = dS.getTransferOut();
            data[i][8] = dS.getDeath();
            data[i][9] = dS.getTotal();
            data[i][10] = dS.getOfficers();
            data[i][11] = dS.getOfficersFamily();
            data[i][12] = dS.getC1Self();
            data[i][13] = dS.getC1Ex();
            data[i][14] = dS.getC1Family();
            data[i][15] = dS.getC2Self();
            data[i][16] = dS.getC2Ex();
            data[i][17] = dS.getC2Family();
            data[i][18] = dS.getC3Self();
            data[i][19] = dS.getC3Ex();
            data[i][20] = dS.getC3Family();
            data[i][21] = dS.getArmy();
            data[i][22] = dS.getCne();
            data[i][23] = dS.getPnl();
            data[i][24] = dS.getVsil();
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
