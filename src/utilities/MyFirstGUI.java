/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.UIManager;

class MyFirstGUI {
    public static void main(String[] args) {

        JDialog.setDefaultLookAndFeelDecorated(true);
        System.out.println(UIManager.getLookAndFeel().getName());
        String first = JOptionPane.showInputDialog("Enter the first number");
        String second = JOptionPane.showInputDialog("Enter the second number");

        int n = Integer.parseInt(first);
        int m = Integer.parseInt(second);
        int sum = n + m;

        JOptionPane.showMessageDialog(null, "sum = "+sum, "Sum of 2 numbers", JOptionPane.PLAIN_MESSAGE);

    }  
}
