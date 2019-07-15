package TableModel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class InvDetailTableLookAndFeel {

    public static int invoiceCheck = 5;
    public static int invoicePharmacyCheck = 6;
    public static int priceColumn = 3;
    public static int pricePharmacyColumn = 5;
    public static int totalAmount = 0;
    public static int netPayableAmount = 0;
    public static int payableAmount = 0;
    public static int financialSupport = 0;
    public static float financialSupportPercentage = 0;
    public static int paidAmount = 0;
    public static int returnAmount = 0;
    public static int balanceAmount = 0;
    public static float discountPercentage = 0;
    public static int discountAmount = 0;
    public static boolean isPercentageDiscount =true;
    
    public void setJTableEnvironment(JTable table) {

        table.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 10));
        table.getTableHeader().setBackground(Color.lightGray);
        table.getTableHeader().setPreferredSize(new Dimension(table.getTableHeader().getWidth(), 15));
        table.getTableHeader().setReorderingAllowed(false);
        table.setDefaultRenderer(Object.class, new AlternateTableRowColorRenderer());
    }

    class AlternateTableRowColorRenderer extends DefaultTableCellRenderer {

        Color currColor = Color.white;

        public AlternateTableRowColorRenderer() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (row % 2 == 0) {
                currColor = Color.white;
            } else {
                currColor = Color.white;
                //currColor = Color.lightGray;
            }
            if (isSelected) {
                super.setForeground(table.getSelectionForeground());
                super.setBackground(table.getSelectionBackground());
            } else {
                super.setForeground(Color.black);
                super.setBackground(currColor);
            }
            setFont(table.getFont());
            setValue(value);
            try {
                if ((Boolean)table.getValueAt(row,invoiceCheck)) {
                    //totalAmount += price;
                    //setForeground(Color.blue);
                    setForeground(new Color(34, 53, 95, 255));
                    //setBackground(Color.darkGray);
                    setFont(new java.awt.Font("Arial", Font.BOLD, 12));
                    table.getCellRenderer(0, 0);
                    table.repaint();
                }
                else{
                    //totalAmount -=price;
                }
            } catch (Exception ex) {
            }
            return this;
        }
    }
    
    
    
}
