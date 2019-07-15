/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TreatmentOnDischarge.TableModel;
import BO.OPD.PatientHospitalVisit;
import java.util.HashMap;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utilities.Constants;
import utilities.Database;

public class ParameterListTableModel extends AbstractTableModel {

    private final String[] columnNames
            = {"Sr.","Parameter Name","Verified Date","Result","Select"};
    private final Object[][] data;

    public ParameterListTableModel(List<PatientHospitalVisit> listParameter) {
        data = new Object[listParameter.size()][columnNames.length];
        int row = 0;

        for (int i = 0; i < listParameter.size(); i++) {
           
            PatientHospitalVisit objParameter = listParameter.get(i);
            
//            objParameter.setResultValue(setParameterReult(objParameter.getCON(), 
//                    objParameter.getODI(), objParameter.getParameterId(), 
//                    objParameter.getTableName()));
            data[row][0] = i+1;
            data[row][1] = objParameter.getParameterDescription();
            data[row][2] = objParameter.getVerifiedtDate();
            data[row][3] = objParameter.getResultValue();
            data[row][4] = new Boolean(false);
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
        if (col == 4) {
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

//    private String setParameterReult(String con, String odi, String parameterId,
//            String tableName) {
//        String colums[] = {"-", "VERIFIED_VALUE"};
//        String query = "SELECT                 \n";
//        if (tableName.equalsIgnoreCase("PRD")) {
//            query += " VERIFIED_VALUE            FROM   "
//                    + Database.DCMS.pathologyResultDetail + "                   \n";
//        }
//        if (tableName.equalsIgnoreCase("SRD")) {
//            query += " RESULT_VALUE    VERIFIED_VALUE        FROM   "
//                    + Database.DCMS.pathSeriologyResultDetail + "               \n";
//        }
//        query  += " WHERE  COMPLETE_ORDER_NO = '" + con + "'                \n"
//                + "   AND ORDER_DETAIL_ID = '" + odi + "'                       \n"
//                + "   AND PARAMETER_ID = '" + parameterId + "'                  \n";
//
//        List<HashMap> lis = Constants.dao.selectDatainList(query, colums);
//        return lis.get(0).get("VERIFIED_VALUE").toString();
//    }

}
