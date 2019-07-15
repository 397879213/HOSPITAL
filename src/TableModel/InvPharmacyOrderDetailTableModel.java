package TableModel;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import BO.OrderData;
import java.util.Date;
import java.util.HashMap;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class InvPharmacyOrderDetailTableModel extends AbstractTableModel {
    
    private String[] columnNames = {"Item Id", "Description", "Price",
        "ORD. QTY.", "Stock.QTY.", "Inv.QTY", "Amount", "Select"};
    private Object[][] data;
    private HashMap invoice = new HashMap();
    public boolean check = true;
    public InvPharmacyOrderDetailTableModel(Vector orders) {
        data = new Object[orders.size()][columnNames.length];
        int row = 0;
        
        for (int i = 0; i < orders.size(); i++) {
            OrderData order = (OrderData) orders.get(i);
            data[row][0] = order.getCptId();
            data[row][1] = order.getCptDescription();
            data[row][2] = ""+order.getOriginalPrice();
            data[row][3] = ""+order.getDispenseQuantity();
            data[row][4] = ""+order.getStockQuantity();
            data[row][5] = ""+order.getDispenseQuantity();
            String totalPrice = "";
            try {
                totalPrice = "" + (Float.parseFloat(order.getOriginalPrice()) *
                        order.getDispenseQuantity());
            } catch(Exception e){
                totalPrice = "";
            }
            if(order.getDispenseQuantity() > order.getStockQuantity()) {
                data[row][5] = order.getStockQuantity();
                totalPrice = "" + (Integer.parseInt(order.getOriginalPrice()) *
                        order.getStockQuantity());
            }
            data[row][6] = ""+totalPrice;
            data[row][7] = new Boolean(check);
            row++;
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
        boolean ret = false;
        if (col == 5 && invoice.get(row) == null) {
            return true;
        }
        if (col == 7 && invoice.get(row) == null) {
            return true;
        }
        return ret;
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
    
    public static void main(String args[]) {
        
        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd-MM-yyyy HH");
        Date dt = new Date();
        DateTime dtOrg = new DateTime(dt);
        DateTime reportTime = dtOrg.plusHours(25);
        System.out.println(reportTime.toString(fmt) + ":00");
        DateTime.Property pDoW = reportTime.dayOfWeek();
        System.out.println(pDoW.getAsText());
        
    }
}
