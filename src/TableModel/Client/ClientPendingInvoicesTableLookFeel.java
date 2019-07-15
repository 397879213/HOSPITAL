package TableModel.Client;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ClientPendingInvoicesTableLookFeel {

    public static int colInvoiceCheck = 6;
    public static int colInvoiceNo = 3;
    public static int colAmountReceived = 5;
    
    public static int priceColumn = 5;
    public static int receivedAmount = 0;
    public static int balanceAmount = 0;
    public static int totalSelectedAmount = 0;
    
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
                if ((Boolean)table.getValueAt(row,colInvoiceCheck)) {
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
