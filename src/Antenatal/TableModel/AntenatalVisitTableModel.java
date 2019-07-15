/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Antenatal.TableModel;

import Antenatal.BO.AntenatalVisitsBo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AntenatalVisitTableModel extends AbstractTableModel {

    private final String[] columnNames
            = {"Sr.", "Consultancy Id", "Final Date", "Final By"};
    private final Object[][] data;

    public AntenatalVisitTableModel(List<AntenatalVisitsBo> listVisit) {
        data = new Object[listVisit.size()][columnNames.length];
        int row = 0;

        for (int i = 0; i < listVisit.size(); i++) {
           
            AntenatalVisitsBo objParameter = listVisit.get(i);
            
            data[row][0] = i+1;
            data[row][1] = objParameter.getReferenceId();
            data[row][2] = objParameter.getFinalDate();
            data[row][3] = objParameter.getFinalName();
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
     * Don't need to implement this method unless your table's
     * editable.
     */
    @Override
    public boolean isCellEditable(int row, int col) {
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
