/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class Picker {

    
    
    
    public static void main(String[] args) {
        JLabel label = new JLabel("Selected Date:");
        final JTextField text = new JTextField(20);
        JButton b = new JButton("popup");
        JPanel p = new JPanel();
        p.add(label);
        p.add(text);
        p.add(b);
        final JInternalFrame f = new JInternalFrame();
        f.getContentPane().add(p);
        f.pack();
        f.setVisible(true);
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                text.setText(new DatePicker(f).setPickedDate());
            }
        });
    }
}