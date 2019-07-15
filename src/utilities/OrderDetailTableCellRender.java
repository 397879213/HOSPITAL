/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author WBG
 */
public class OrderDetailTableCellRender extends DefaultTableCellRenderer {

    public OrderDetailTableCellRender() {
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        boolean invoice = (Boolean ) table.getModel().getValueAt(row, 5);
        if (invoice) {
                //super.setForeground(table.getSelectionForeground());
                //super.setBackground(table.getSelectionBackground());
               //super.setBackground(Color.CYAN);
            } 
//         else {
//             
//            }
            setFont(table.getFont());
            setValue(value);
        return this;

    }
}

