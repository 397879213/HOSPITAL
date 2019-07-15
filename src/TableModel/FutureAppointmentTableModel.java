package TableModel;

import BO.Appointment;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class FutureAppointmentTableModel extends AbstractTableModel {

    private String[] columnNames = { "Clinic", "Date", "Start Time", "End Time","Slot Type","Visit Type", "Procedure"};
      
    private Object[][] data;

    public FutureAppointmentTableModel(Vector orders) {
        data = new Object[orders.size()][columnNames.length];
        
       for (int i = 0; i<orders.size(); i++) {
            Appointment app = (Appointment) orders.get(i);
            data[i][0] = app.clinicDescription;
            data[i][1] = app.appointmentDate;
            data[i][2] = app.startTime;
            data[i][3] = app.endTime;
            data[i][4] = app.slotType;
            data[i][5] = app.visitType;
            data[i][6] = app.CPTDescription;
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

    public boolean isCellEditable(int row, int col) {
        
        return false;
    }

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

    public void setRowColour(int row, Color c) {
        //rowColours.set(row, c);
        fireTableRowsUpdated(row, row);
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

static class MyTableCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        //ReportingTableModel model = (ReportingTableModel) table.getModel();
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        c.setBackground(Color.GREEN);
        return c;
    }
}
}


