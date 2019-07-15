package TableModel.Client;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import utilities.Constants;



public class ClientInvoicesTableLookAndFeel {
    
    
    int invoiceCheck = 5;
     public void setJTableEnvironment(JTable table) {
     
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        table.getTableHeader().setBackground(Color.lightGray);
        table.getTableHeader().setPreferredSize(new Dimension(table.getTableHeader().getWidth(), Constants.generalTableHeaderWidth));
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
                //currColor = new Color(Constants.red , Constants.green , Constants.black);
                currColor  = Color.lightGray;
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
