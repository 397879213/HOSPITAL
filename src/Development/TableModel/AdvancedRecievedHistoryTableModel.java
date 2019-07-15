
package Development.TableModel;
import Development.BO.DailyCashSummary;
import java.awt.Color;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class AdvancedRecievedHistoryTableModel extends AbstractTableModel {

     private final String[] columnNames = 
                {"Sr","Patient Id", "Full Name", "Account","Trans.No",
            "Total Amount", "Recv.Date","Comments","Recv.By"};
      private static int totalAmount = 0;
      private static int discAmount = 0;
      private static int finAmount = 0;
    
   private final Object[][] data;

    public AdvancedRecievedHistoryTableModel(List<DailyCashSummary> orders) {
          data = new Object[orders.size()][columnNames.length];
        int row = 0;
            totalAmount = 0;
             discAmount = 0;
             finAmount = 0;
        for (int i = 0; i<orders.size(); i++) {
           DailyCashSummary order = orders.get(i);
            data[row][0] = "" + (i+1);
            data[row][1] = order.getPatientId();
            data[row][2] = order.getPatFullName();
            data[row][3] = order.getAccount();
            data[row][4] = order.getTransactionNo();
            data[row][5] = order.getAmount();
            data[row][6] = order.getRecieveDate();
            data[row][7] = order.getComments();
            data[row][8] = order.getUserId();
            row++;
             
             totalAmount = totalAmount + Integer.parseInt(order.getAmount());
//             discAmount = discAmount + Integer.parseInt(order.getNetDiscount());
//             finAmount = finAmount + Integer.parseInt(order.getSupport());
        }
  }

   public void setRowColour(int row, Color c) {
        //rowColours.set(row, c);
        fireTableRowsUpdated(row, row);
        
    }

    public static int getTotalAmount() {
        return totalAmount;
    }

    public static int getDiscAmount() {
        return discAmount;
    }

    public static int getFinAmount() {
        return finAmount;
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
        
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }

//    private void printDebugData() {
//        int numRows = getRowCount();
//        int numCols = getColumnCount();
//
//        for (int i = 0; i < numRows; i++) {
//            System.out.print("    row " + i + ":");
//            for (int j = 0; j < numCols; j++) {
//                System.out.print("  " + data[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println("--------------------------");
//    }
}
