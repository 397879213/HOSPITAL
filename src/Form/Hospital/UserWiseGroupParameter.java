package Form.Hospital;

import BO.Hospital.UserWiseGroupParameterBO;
import Controller.Hospital.UserWiseGroupParameterController;
import TableModel.Hospital.UserWiseGroupParameterTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;

public class UserWiseGroupParameter extends javax.swing.JInternalFrame {

    public UserWiseGroupParameter() {

        initComponents();
        this.setSize(Constants.xSize - 580, Constants.ySize - 160);
        setGroupId();
        selectUserParameters();
    }
    DisplayLOV lov = new DisplayLOV();
    UserWiseGroupParameterController ctlUserParameters = new UserWiseGroupParameterController();

    String userId = Constants.userId;
    String groupId = "";
    String parameterId = "";
    List<UserWiseGroupParameterBO> listUserParameters = new ArrayList();
    UserWiseGroupParameterBO objUserWiseGroupParameter = new UserWiseGroupParameterBO();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLocationServices = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboGroupName = new javax.swing.JComboBox<String>();
        jPanel5 = new javax.swing.JPanel();
        txtParameter = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblGroupWiseParameter = new javax.swing.JTable();

        txtLocationServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationServicesActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Search Studies");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(880, 710));
        setRequestFocusEnabled(false);

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UserWiseGroup", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(120, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Group", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(120, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("User Name:");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Select Group:");

        cboGroupName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Group 1", "Group 2", "Group 3", "Group 4" }));
        cboGroupName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGroupNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername)
                    .addComponent(cboGroupName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parameter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(120, 0, 0))); // NOI18N

        txtParameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParameterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Select Parameter:");

        tblGroupWiseParameter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Parameter Name", "Display Name","Unit"
            }
        ));
        tblGroupWiseParameter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGroupWiseParameterMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblGroupWiseParameterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblGroupWiseParameterMouseReleased(evt);
            }
        });
        tblGroupWiseParameter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblGroupWiseParameterKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tblGroupWiseParameter);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParameter, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(3, 3, 3))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtParameter))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLocationServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationServicesActionPerformed
    }//GEN-LAST:event_txtLocationServicesActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        String query = "SELECT USER_NAME ID ,NAME DESCRIPTION FROM           \n"
                + Database.DCMS.users
                + " WHERE UPPER(NAME) LIKE '%"
                + txtUsername.getText().toUpperCase() + "%'                 \n"
                + "AND ACTIVE = 'Y'";

        lov.LOVSelection(query, this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtUsername.setText("");
            return;
        } else {
            txtUsername.setText(Constants.lovDescription.toUpperCase());
            userId = Constants.lovID;
            setGroupId();
            selectUserParameters();
        }

    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtParameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParameterActionPerformed
        // TODO add your handling code here:
        setGroupId();
        String query = "SELECT ID,DESCRIPTION FROM                          \n"
                + Database.DCMS.CPTParameter
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtParameter.getText().toUpperCase() + "%' AND ACTIVE = 'Y'"
                + "AND ID NOT IN ( SELECT PARAMETER_ID FROM " + Database.DCMS.userWiseGroupParameters + " "
                + "WHERE USER_ID = '" + userId + "'                             \n"
                + "AND GROUP_ID = " + groupId + " )                            \n";

        lov.LOVSelection(query, this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtParameter.setText("");
            return;
        } else {
            txtParameter.setText(Constants.lovDescription.toUpperCase());
            parameterId = Constants.lovID;
        }
        objUserWiseGroupParameter.setGroupId(groupId);
        objUserWiseGroupParameter.setParameterId(parameterId);
        objUserWiseGroupParameter.setUserId(userId);
        if (ctlUserParameters.insertUserParameters(objUserWiseGroupParameter)) {
            JOptionPane.showMessageDialog(null, "Save successfully.");
            selectUserParameters();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save.");
        }
        txtParameter.setText("");
        txtParameter.requestFocus();
    }//GEN-LAST:event_txtParameterActionPerformed

    private void tblGroupWiseParameterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGroupWiseParameterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGroupWiseParameterMouseClicked

    private void tblGroupWiseParameterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGroupWiseParameterMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGroupWiseParameterMousePressed

    private void tblGroupWiseParameterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGroupWiseParameterMouseReleased
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {

            UserWiseGroupParameterBO UserParameter = listUserParameters.get(
                    tblGroupWiseParameter.getSelectedRow());

            if (ctlUserParameters.deleteUsersParameter(userId, parameterId, groupId)) {
                JOptionPane.showMessageDialog(null, "Parameter Deleted successfully!");
                selectUserParameters();
            } else {
                JOptionPane.showMessageDialog(null, " Unable to Delete Parameter."
                        + "\n Kindly Contact Administrator!");
            }
        }
    }//GEN-LAST:event_tblGroupWiseParameterMouseReleased

    private void tblGroupWiseParameterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblGroupWiseParameterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGroupWiseParameterKeyReleased

    private void cboGroupNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGroupNameActionPerformed
        // TODO add your handling code here:
        setGroupId();
        selectUserParameters();
    }//GEN-LAST:event_cboGroupNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboGroupName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JTable tblGroupWiseParameter;
    private javax.swing.JTextField txtLocationServices;
    private javax.swing.JTextField txtParameter;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    public void selectUserParameters() {
        listUserParameters = ctlUserParameters.selectUserParameters(userId, groupId);
        tblGroupWiseParameter.setModel(new UserWiseGroupParameterTableModel(listUserParameters));
        ListSelectionModel selectionModel = tblGroupWiseParameter.getSelectionModel();
        tblGroupWiseParameter.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setParameterListColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblGroupWiseParameter);
    }

    private void setGroupId() {
        if (cboGroupName.getSelectedIndex() == 0) {
            groupId = "1";
        }
        if (cboGroupName.getSelectedIndex() == 1) {
            groupId = "2";
        }
        if (cboGroupName.getSelectedIndex() == 2) {
            groupId = "3";
        }
        if (cboGroupName.getSelectedIndex() == 3) {
            groupId = "4";
        }
    }

    private void setParameterListColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblGroupWiseParameter.getColumnCount(); i++) {
            column = tblGroupWiseParameter.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(180);
            } else if (i == 1) {
                column.setPreferredWidth(100);
            } else if (i == 2) {
                column.setPreferredWidth(30);
            }

        }
    }
}
