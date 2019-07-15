package Form.general;

import BO.User; 
import Handler.ApplicationSetupHandler; 
import Handler.UserHandler;
import com.lowagie.text.Image;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import utilities.*;

public class DCMS_MDI extends javax.swing.JFrame {

    public static User currentUser = new User();
    JMenuBar menuBar = new JMenuBar();
    UserHandler user = new UserHandler();

    ApplicationSetupHandler setup = new ApplicationSetupHandler();

    Image image = null;

    public DCMS_MDI() {

        initComponents();
        lblMessage.setForeground(new Color(102,0,0));

        if (Constants.messageAlert) {
            lblMessage.setText("System response may slow due to system pending maintenance");
        }
        else if (Constants.onlineStatus.equalsIgnoreCase("N")) {
            lblMessage.setText("Offline System for Contingency");
        }
        else{
                lblMessage.setText(Constants.displayMDIMessage);
        }
        generateMenuItems();
        setExtendedState(MAXIMIZED_BOTH);
        menuBar.setBorder(new BevelBorder(BevelBorder.RAISED));
        Constants.mainTitle = Constants.dcms + "  " + Constants.userId + " @ " + Constants.userLocationName;
        this.setTitle(Constants.mainTitle);
    }

    public DCMS_MDI(String s) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane()
        ;
        lblBackImage = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Diagnostic Centre Management System");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                WindowClosing(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        desktopPane.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        desktopPane.setAutoscrolls(true);
        desktopPane.setName("frmMDIJDesktop"); // NOI18N

        lblBackImage.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        lblBackImage.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblBackImage.setForeground(new java.awt.Color(0, 102, 0));
        lblBackImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBackImage.setLabelFor(lblBackImage);
        lblBackImage.setToolTipText("");
        lblBackImage.setAutoscrolls(true);
        lblBackImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBackImage.setName(""); // NOI18N
        lblBackImage.setPreferredSize(null);
        desktopPane.add(lblBackImage);
        lblBackImage.setBounds(210, 80, 1120, 670);

        lblMessage.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 0, 51));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desktopPane.add(lblMessage);
        lblMessage.setBounds(40, 530, 1030, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        try {
            if (DAO.conn != null) {
                DAO.conn.close();
            }
        } catch (Exception sqlEx) {
            System.out.println("Unable to Close the Connection or the connection already Closed");
        }
    }//GEN-LAST:event_formWindowClosing

    private void WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_WindowClosing

    public int closeApplication() {
        JOptionPane.showMessageDialog(null, "Going to close Application");
        return 1;
    }

    public void initializeApplication() {

        applicationSetup(); 
        Constants.userId = currentUser.getUserName();
        Constants.userDesignationId = currentUser.getDesignationId();
        Constants.userDesignation = currentUser.getDesignation();
        Constants.userDepartment = currentUser.getDepartment();
        Constants.userDepartmentId = currentUser.getDepartmentId();

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    if (currentUser.getTheme().equalsIgnoreCase("Windows Look")) {
                        Constants.red = currentUser.getColorRed();
                        Constants.green = currentUser.getColorGreen();
                        Constants.black = currentUser.getColorBlue();
                        com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme(currentUser.getThemeColor(), "INSERT YOUR LICENSE KEY HERE", "PACSLINK");
                        UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");

                    } else if (currentUser.getTheme().equalsIgnoreCase("MAC Look")) {
                        Constants.red = currentUser.getColorRed();
                        Constants.green = currentUser.getColorGreen();
                        Constants.black = currentUser.getColorBlue();
                        com.jtattoo.plaf.mcwin.McWinLookAndFeel.setTheme("Default", "INSERT YOUR LICENSE KEY HERE", "AZNOSTIC");
                        UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
                    } else {
                        Constants.red = currentUser.getColorRed();
                        Constants.green = currentUser.getColorGreen();
                        Constants.black = currentUser.getColorBlue();
                        com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("Green", "INSERT YOUR LICENSE KEY HERE", "PACSLINK");
                        UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                    }

                    //     com.jtattoo.plaf.mcwin.McWinLookAndFeel.setTheme("Default", "INSERT YOUR LICENSE KEY HERE", "AZNOSTIC");
                    //     UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
                    //     com.jtattoo.plaf.smart.SmartLookAndFeel.setTheme("Gold", "INSERT YOUR LICENSE KEY HERE", "AZNOSTIC");
                    //     UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
                } catch (UnsupportedLookAndFeelException e) {
                } catch (ClassNotFoundException e) {
                } catch (InstantiationException e) {
                } catch (IllegalAccessException e) {
                }
                new DCMS_MDI().setVisible(true);
            }
        });
    }

 

    private void generateMenuItems() {

        user.selectUserGroupRights();
        generateMenu(user.selectMenu(Constants.userId));
        this.setJMenuBar(menuBar);
        user.selectFormWiseComponent(Constants.userId);
         
        user.getRadiologists();
        user.getSuperAdminRights();
    }

    public void generateMenu(Vector menus) {

        for (int i = 0; i < menus.size(); i++) {
            JMenu menu = new JMenu();
            String menuName = (String) menus.get(i);
            String menuId = (String) Constants.menuIds.get(i);

            String mnemonic = Constants.hashUserMenuMnemonic.get(menuId);
            menu.setText(menuName);
            menu.setName(menuName);
            menu.setMnemonic(mnemonic.charAt(0));
            Vector items = user.selectMenuItem(menuId, Constants.userId);
            for (int j = 0; j < items.size(); j++) {
                JMenuItem item = new JMenuItem();
                menuName = (String) items.get(j);
                item.setText(menuName);
                menuName = Constants.hashUserMenuItem.get(menuName);
                item.setName(menuName);

                if (menu.getText().equalsIgnoreCase("File")
                        && item.getText().equalsIgnoreCase("Exit")) {
                }
                item.addActionListener(new DetectComp(item.getName(), menuName));
                menu.add(item);
            }
            menuBar.add(menu);
        }
    }

    class DetectComp implements ActionListener {

        String compName;
        String link;

        DetectComp(String temp, String link) {
            compName = temp;
            this.link = link;
        }

        public void actionPerformed(ActionEvent e) {

            try {
                if (this.link.equalsIgnoreCase("Form.general.frmLogin")) {
                    Class c = Class.forName(this.link);
                    JFrame jf = (JFrame) c.newInstance();
                    Dimension desktopSize = desktopPane.getSize();
                    Dimension fmSize = jf.getSize();
                    jf.setLocation((desktopSize.width - fmSize.width) / 2,
                            (desktopSize.height - fmSize.height) / 2);
                    jf.setVisible(true);
                } else if (this.link.equalsIgnoreCase("Form.frmExit")) {
                    System.out.println("Going to Close Connection "); 
                    System.exit(0);
                } else {
                    Class c = Class.forName(this.link);
                    JInternalFrame jf = (JInternalFrame) c.newInstance();
                    Constants.currentFrame = jf;
                    desktopPane.add(jf);
                    jf.moveToFront();
                    Dimension desktopSize = desktopPane.getSize();
                    Dimension fmSize = jf.getSize();
                    jf.setLocation((desktopSize.width - fmSize.width) / 2,
                            (desktopSize.height - fmSize.height) / 2);
                    jf.setVisible(true);
                }

            } catch (Exception ex) {
                System.out.println("Error ");
                ex.printStackTrace();
            }
        }
    }

    //public HashMap<String>  hashOpenForm = new HashMap<>();
    public void applicationSetup() {

        //Static Setup 
        setup.setReportingPhysicianTypes();
        //Dynamic Setup 
        setup.setLocationsArray();
        setup.setDepartmentHash();
        Constants.adjustValues();               //Select Modality Wise Servers

     
    }

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel lblBackImage;
    private javax.swing.JLabel lblMessage;
    // End of variables declaration//GEN-END:variables
}
