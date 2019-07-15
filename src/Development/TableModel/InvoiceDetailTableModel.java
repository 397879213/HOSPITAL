
package Development.TableModel;
import javax.swing.table.AbstractTableModel;
import Development.BO.DailyCashSummary;
import java.util.List;


public class InvoiceDetailTableModel extends AbstractTableModel {

     private String[] columnNames = 
                {"Sr","Invoice No","Invoice By","Invoice Date","MR.No","Name","Description", "Price","Discount",
                    "Payable","Fin.Support","Rec.Amount"};
      private static int totalAmount = 0;
      private static int discAmount = 0;
      private static int RecvAmount = 0;
      private static int finAmount = 0;
     
     private Object[][] data;

    public InvoiceDetailTableModel(List<DailyCashSummary> orders) {
          data = new Object[orders.size()][columnNames.length];
        int row = 0;
        totalAmount = 0;
        discAmount = 0;
        RecvAmount = 0;
        finAmount = 0;
        for (int i = 0; i<orders.size(); i++) {
           DailyCashSummary order = orders.get(i);
            data[row][0] = "" + (i+1);
            data[row][1] = order.getInvoiceNo();
            data[row][2] = order.getInvoiceBy();
            data[row][3] = order.getInvoiceDate();
            data[row][4] = order.getPatientId();
            data[row][5] = order.getPatFullName();
            data[row][6] = order.getDescription();
            data[row][7] = order.getPrice();
            data[row][8] = order.getNetDiscount();
            data[row][9] = order.getPayableAmount();
            data[row][10] = order.getSupport();
            data[row][11] = order.getReciveAmount();
            row++;
            totalAmount = totalAmount + Integer.parseInt(order.getPrice());
             discAmount = discAmount + Integer.parseInt(order.getNetDiscount());
             RecvAmount = RecvAmount + Integer.parseInt(order.getReciveAmount());
             finAmount = finAmount + Integer.parseInt(order.getSupport());
            
        }
  }

//
//   public void setRowColour(int row, Color c) {
//        //rowColours.set(row, c);
//        fireTableRowsUpdated(row, row);
//        
//    }
    public static int getTotalAmount() {
        return totalAmount;
    }

    public static int getDiscAmount() {
        return discAmount;
    }

    public static int getRecvAmount() {
        return RecvAmount;
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
