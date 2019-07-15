package utilities;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class GUIUtils {

    public static void moveToFront(final JInternalFrame fr) {
        if (fr != null) {
            processOnSwingEventThread(new Runnable() {

                public void run() {
                    fr.moveToFront();
                    fr.setVisible(true);
                    try {
                        fr.setSelected(true);
                        if (fr.isIcon()) {
                            fr.setIcon(false);
                        }
                        fr.setSelected(true);
                    } catch (PropertyVetoException ex) {
                    }
                    fr.requestFocus();
                }
            });
        }
    }

    public static void addEscapeListener(final JDialog dialog) {
        ActionListener escListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
                dialog.dispose();
            }
        };

        dialog.getRootPane().registerKeyboardAction(escListener,
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);

    }

    public static void processOnSwingEventThread(Runnable todo) {
        processOnSwingEventThread(todo, false);
    }

    public static void processOnSwingEventThread(Runnable todo, boolean wait) {
        if (todo == null) {
            throw new IllegalArgumentException("Runnable == null");
        }
        if (wait) {
            if (SwingUtilities.isEventDispatchThread()) {
                todo.run();
            } else {
                try {
                    SwingUtilities.invokeAndWait(todo);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        } else {
            if (SwingUtilities.isEventDispatchThread()) {
                todo.run();
            } else {
                SwingUtilities.invokeLater(todo);
            }
        }
    }

    public static void setLocation(JDesktopPane desktopPaneMain, JInternalFrame fm) {
        Dimension dim = desktopPaneMain.getSize();
        // Determine the new location of the window
        int w = fm.getSize().width;
        int h = fm.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        fm.setLocation(x, y);
    }

    public static void setEnabled(JComponent[] c, boolean bool) {
        for (int i = 0; i <= c.length - 1; i++) {
            c[i].setEnabled(bool);
        }
    }

    public static void setClear(Vector vec) {

        for (int i = 0; i < vec.size(); i++) {
            JComponent component = (JComponent) vec.get(i);
            if (component.getClass().toString().equalsIgnoreCase("class javax.swing.JTextField")) {
                JTextField jt = (JTextField) component;
                jt.setText("");
                jt.setBackground(Color.white);
            }
            if (component.getClass().toString().equalsIgnoreCase("class javax.swing.JPasswordField")) {
                JPasswordField jp = (JPasswordField) component;
                jp.setText("");
                jp.setBackground(Color.white);
            }
            if (component.getClass().toString().equalsIgnoreCase("class javax.swing.JCheckBox")) {
                JCheckBox jc = (JCheckBox) component;
                jc.setSelected(false);
                jc.setBackground(Color.white);
            }
            if (component.getClass().toString().equalsIgnoreCase("class javax.swing.JTextArea")) {
                JTextArea jta = (JTextArea) component;
                jta.setText("");
                jta.setBackground(Color.white);
            }
        }
    }

    public static void setClear(List vec) {

        for (int i = 0; i < vec.size(); i++) {
            JComponent component = (JComponent) vec.get(i);
            if (component.getClass().toString().equalsIgnoreCase("class javax.swing.JTextField")) {
                JTextField jt = (JTextField) component;
                jt.setText("");
                jt.setBackground(Color.white);
            }
            if (component.getClass().toString().equalsIgnoreCase("class javax.swing.JPasswordField")) {
                JPasswordField jp = (JPasswordField) component;
                jp.setText("");
                jp.setBackground(Color.white);
            }
            if (component.getClass().toString().equalsIgnoreCase("class javax.swing.JCheckBox")) {
                JCheckBox jc = (JCheckBox) component;
                jc.setSelected(false);
                jc.setBackground(Color.white);
            }
            if (component.getClass().toString().equalsIgnoreCase("class javax.swing.JTextArea")) {
                JTextArea jta = (JTextArea) component;
                jta.setText("");
                jta.setBackground(Color.white);
            }
        }
    }

    public static boolean checkNull(Vector vec) {
        boolean ret = true;

        for (int i = 0; i < vec.size(); i++) {

            JComponent component = (JComponent) vec.get(i);

            if (component.getClass().toString().equalsIgnoreCase("class javax.swing.JTextField")) {
                JTextField jt = (JTextField) component;
                if (jt.getText().trim().equalsIgnoreCase("")) {
                    ret = false;
                    jt.setBackground(Color.red);
                }
            }
        }
        return ret;
    }

    public static boolean completePatientId(String patientId) {

        boolean ret = true;
        String patientType = Constants.patientType;
        if (Constants.onlineStatus.equalsIgnoreCase("N")) {
            patientType = Constants.locationId;
        }

        try {
            Constants.completePatientId = patientType
                    + GenerateKeys.keyString[Integer.parseInt(Constants.mrnoLength) - patientId.trim().length()]
                    + patientId.trim();

        } catch (Exception ex) {
            ret = false;
        }
        return ret;
    }

    public static void alertMessage() {

        for (int i = 0; i < Constants.displayCount; i++) {
            JOptionPane.showMessageDialog(null, Constants.displayMessage);
        }
    }

    public static void displayReportMessage() {

        JOptionPane.showMessageDialog(null, "System maintenance is required please wait "
                + Constants.displayCount * 3 + " seconds to generate Report ");
        for (int i = 0; i < Constants.displayCount; i++) {

            try {
                Thread.sleep(3000);
            } catch (Exception ex) {

            }
        }

    }

    public static void PACSAlertMessage() {

        JOptionPane.showMessageDialog(null, Constants.PACSAlertMessage);
        for (int i = 0; i < Constants.PACSAlertCount; i++) {

            try {
                Thread.sleep(3000);
            } catch (Exception ex) {

            }
        }

    }

    public static String AdjustCapitalLetters(String text) {

        String ret = "";
        if (true) {
            text = text.replaceAll("      ", "     ");
            text = text.replaceAll("     ", "    ");
            text = text.replaceAll("    ", "   ");
            text = text.replaceAll("   ", "  ");
            text = text.replaceAll("  ", " ");

            if (text == null || text.length() < 2) {
                return text;
            }
            //if(true){     return text;} 

            text = text.replace('\n', '$');
            text = text.replace(' ', '@');
            StringTokenizer tkn = new StringTokenizer(text, ".");
            boolean first = true;
            while (tkn.hasMoreTokens()) {
                String token = tkn.nextToken();
                if (token == null || token.length() < 2) {
                    continue;
                }

                String temp = "";

                if (token.substring(0, 1).toUpperCase().equalsIgnoreCase("$")
                        || token.substring(0, 1).toUpperCase().equalsIgnoreCase("@")) {
                    temp = token.substring(0, 2).toUpperCase() + token.substring(2);
                } else {

                    temp = token.substring(0, 1).toUpperCase() + token.substring(1);
                }

                if (!first) {
                    temp = "." + temp;
                }
                first = false;
                ret += temp;
            }
            if (tkn.countTokens() > 1) {
                ret = ret + ".";
            }
            //ret = ret.trim();
            //System.out.println("ret.substring(0,1) = "+ ret.substring(0,1));
            //    public static String password = "DKV7R2TFRGSM";
//    public static String sid = "HMSDB";
//    public static String ip = "10.10.14.200";

            ret = ret.replace('$', '\n');
            ret = ret.replace('@', ' ');
            return ret;
        }
        if (text.length() == 0) {
            return text;
        }

        StringTokenizer tkn = new StringTokenizer(text, " ");
        String prev = tkn.nextToken();
        ret = Character.toUpperCase(prev.charAt(0)) + prev.substring(1);

        while (tkn.hasMoreTokens()) {
            String current = tkn.nextToken();

            if (prev.charAt((prev.length() - 1)) == '.') {
                ret += " " + Character.toUpperCase(current.charAt(0)) + current.substring(1);
            } else {
                if (current.length() > 2 && Character.isUpperCase(current.charAt(0)) && Character.isLowerCase(current.charAt(1))) {
                    ret += " " + Character.toLowerCase(current.charAt(0)) + current.substring(1);
                } else {
                    ret += " " + current;
                }
            }

            prev = current;
        }

        return ret;
    }

    public static void main(String[] args) {

        Random generator = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        int Length = 12;
        char tempChar;
        for (int i = 0; i < Length; i++) {
            tempChar = (char) (generator.nextInt(96) + 32);
            stringBuilder.append(tempChar);

        }
        System.out.println("Random Number = " + stringBuilder.toString());

    }

    public static String readTextFile(File file) {
        String content = null;
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
