package OT.TableModel;

import TableModel.*;
import OT.BO.CardiacSurgery;
import java.awt.Color;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class OtPaceWireTableModel extends AbstractTableModel {

    private String[] columnNames
            = {"ID","DESCRIPTION"};

    private Object[][] data;

    public OtPaceWireTableModel(List<CardiacSurgery> lstPacWire) {
        data = new Object[lstPacWire.size()][columnNames.length];
        int row = 0;
        for (int i = 0; i < lstPacWire.size(); i++) {
            CardiacSurgery paceWire = lstPacWire.get(i);
            data[row][0] = paceWire.getPaceWireId();
            data[row][1] = paceWire.getPaceWireDescription();
            row++;
        }
    }

    public void setRowColour(int row, Color c) {
        //  rowColours.set(row, c);
        fireTableRowsUpdated(row, row);

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
//    public Class getColumnClass(int c) {
//        return getValueAt(0, c).getClass();
//    }

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

        data[row][col] = value;
        fireTableCellUpdated(row, col);
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
