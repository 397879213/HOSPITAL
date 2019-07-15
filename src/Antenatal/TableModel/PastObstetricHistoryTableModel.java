/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Antenatal.TableModel;
import Antenatal.BO.BOBirthCertificate;


import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PastObstetricHistoryTableModel extends AbstractTableModel {

    private final String[] columnNames
            = {"Crtd Date","Crtd By","Name","AGE","Gender"};
    private final Object[][] data;

    public PastObstetricHistoryTableModel(List<BOBirthCertificate> listPastObstetricHistory) {
        data = new Object[listPastObstetricHistory.size()][columnNames.length];
        int row = 0;

        for (int i = 0; i < listPastObstetricHistory.size(); i++) {
           
            BOBirthCertificate pastObstetric = listPastObstetricHistory.get(i);
            
            data[row][0] = pastObstetric.getCrtdDate();
            data[row][1] = pastObstetric.getCrtdBy();
            data[row][2] = pastObstetric.getBabyName();
            data[row][3] = pastObstetric.getAge();
            data[row][4] = pastObstetric.getGender();
            row++;
        }
//            if(currentInfo.getQuestionResult().equalsIgnoreCase("Y")){
//                data[row][2] = true;
//            }
//            else if(currentInfo.getQuestionResult().equalsIgnoreCase("N")){
//                data[row][3] = true;
//            }
    
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
     * Don't need to implement this method unless your table's
     * editable.
     */
    @Override
    public boolean isCellEditable(int row, int col) {
        if (col == 2 || col == 3) {
            return true;
        }
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
