package Form.Setup;

import BO.Setup.ConsultationRoom;
import Controller.Setup.ConsultationRoomController;
import TableModel.ConsultationRoomTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;

public class UserConsultationRoom extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();
    ConsultationRoom roomObj = new ConsultationRoom();
    String RoomName, userName, roomId;
    String userId = "";
    ConsultationRoomController ctlRoom = new ConsultationRoomController();
    List<ConsultationRoom> listRoomDetails = new ArrayList();

    public UserConsultationRoom() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Consultant = new javax.swing.JPanel();
        pnlUserDetail3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtUserNameDispay = new javax.swing.JTextField();
        txtCurrentRoom = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtAssignRoom = new javax.swing.JTextField();
        btnAssignRoom = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        pnlSearchUser6 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblConsultantRoom = new javax.swing.JTable();
        pnlUserDetail1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtSpeciality = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Consultation Room");
        setFrameIcon(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        Consultant.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        Consultant.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultant Room", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        Consultant.setForeground(java.awt.SystemColor.activeCaption);

        pnlUserDetail3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultant Room Assignment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail3.setForeground(java.awt.SystemColor.activeCaption);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("User Name : ");

        txtUserNameDispay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtUserNameDispay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameDispayActionPerformed(evt);
            }
        });

        txtCurrentRoom.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCurrentRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrentRoomActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Current:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("New Room :  ");

        txtAssignRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAssignRoomActionPerformed(evt);
            }
        });

        btnAssignRoom.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAssignRoom.setText("Assign Room");
        btnAssignRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignRoomActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail3Layout = new javax.swing.GroupLayout(pnlUserDetail3);
        pnlUserDetail3.setLayout(pnlUserDetail3Layout);
        pnlUserDetail3Layout.setHorizontalGroup(
            pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail3Layout.createSequentialGroup()
                .addGroup(pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserNameDispay, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(txtAssignRoom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetail3Layout.createSequentialGroup()
                        .addComponent(btnAssignRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserDetail3Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCurrentRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlUserDetail3Layout.setVerticalGroup(
            pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUserNameDispay, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCurrentRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail3Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExit)
                            .addGroup(pnlUserDetail3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAssignRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAssignRoom)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlSearchUser6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser6.setForeground(java.awt.SystemColor.activeCaption);

        tblConsultantRoom.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblConsultantRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Sr.No", "User Name", "Speciality","Current Room"}
        ));
        tblConsultantRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultantRoomMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblConsultantRoomMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblConsultantRoomMouseReleased(evt);
            }
        });
        tblConsultantRoom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblConsultantRoomKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(tblConsultantRoom);

        javax.swing.GroupLayout pnlSearchUser6Layout = new javax.swing.GroupLayout(pnlSearchUser6);
        pnlSearchUser6.setLayout(pnlSearchUser6Layout);
        pnlSearchUser6Layout.setHorizontalGroup(
            pnlSearchUser6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlSearchUser6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
        );
        pnlSearchUser6Layout.setVerticalGroup(
            pnlSearchUser6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
            .addGroup(pnlSearchUser6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
        );

        pnlUserDetail1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail1.setForeground(java.awt.SystemColor.activeCaption);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Speciality :");

        txtSpeciality.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSpeciality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialityActionPerformed(evt);
            }
        });

        txtUserName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtUserNameMouseReleased(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("User name :");

        btnSearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClear.setText("Clear ");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail1Layout = new javax.swing.GroupLayout(pnlUserDetail1);
        pnlUserDetail1.setLayout(pnlUserDetail1Layout);
        pnlUserDetail1Layout.setHorizontalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetail1Layout.createSequentialGroup()
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(txtUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSpeciality))
                .addContainerGap())
        );
        pnlUserDetail1Layout.setVerticalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSpeciality))
                .addGap(8, 8, 8)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUserName))
                    .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout ConsultantLayout = new javax.swing.GroupLayout(Consultant);
        Consultant.setLayout(ConsultantLayout);
        ConsultantLayout.setHorizontalGroup(
            ConsultantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultantLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSearchUser6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUserDetail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUserDetail3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ConsultantLayout.setVerticalGroup(
            ConsultantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultantLayout.createSequentialGroup()
                .addComponent(pnlUserDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSearchUser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUserDetail3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Consultant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Consultant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Consultant.getAccessibleContext().setAccessibleName("Consultant");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void txtSpecialityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialityActionPerformed
        lov.LOVDefinitionSelection(DefinitionTypes.speciality, txtSpeciality.getText(), this);
        txtSpeciality.setText("");
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {

            txtSpeciality.setText(Constants.lovDescription.toUpperCase());
            roomObj.setSpecialityId(Constants.lovID);
            RoomName = Constants.lovDescription.toUpperCase();
        }
        selectRoomInfo("", roomObj.getSpecialityId());
    }//GEN-LAST:event_txtSpecialityActionPerformed

    private void txtUserNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMouseReleased


    }//GEN-LAST:event_txtUserNameMouseReleased

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        String query = " SELECT USER_ID ID, NAME DESCRIPTION  FROM    \n"
                + Database.DCMS.users + "                                  \n"
                + " WHERE USER_NAME LIKE '%"
                + txtUserName.getText().toUpperCase().trim() + "%'"
                + " AND ACTIVE = 'Y'"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        userId = Constants.lovID;
        userName = Constants.lovDescription;
        txtUserName.setText(Constants.lovDescription);
        selectRoomInfo(userId, "");
        txtAssignRoom.requestFocus();
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnAssignRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignRoomActionPerformed

        if (ctlRoom.updateAllDb(roomObj)) {
            JOptionPane.showMessageDialog(null, "Room Updated Successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Update Room. "
                    + " Kindly Contact Administrator!");
        }
        clearAllFields();
    }//GEN-LAST:event_btnAssignRoomActionPerformed

    private void txtUserNameDispayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameDispayActionPerformed

    }//GEN-LAST:event_txtUserNameDispayActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        selectRoomInfo(userName, userId);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtCurrentRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrentRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurrentRoomActionPerformed

    private void txtAssignRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAssignRoomActionPerformed
//        lov.LOVDefinitionSelection(DefinitionTypes.consultationRooms, txtAssignRoom.getText(), this);
//        txtAssignRoom.setText("");
//        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
//
//            txtAssignRoom.setText(Constants.lovDescription.toUpperCase());
//            roomObj.setConsultationRoomId(Constants.lovID);
//            RoomName = Constants.lovDescription.toUpperCase();
//        }
        String query = " SELECT ID, ROM.DESCRIPTION "
                + "|| ' '|| ROM.ADDITIONAL_INFO DESCRIPTION  FROM    \n"
                + Database.DCMS.definitionTypeDetail + " ROM          \n"
                + " WHERE DESCRIPTION LIKE '%"
                + txtAssignRoom.getText().toUpperCase().trim() + "%'"
                + " AND DEF_TYPE_ID = 374"
                + " AND ACTIVE = 'Y'"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        roomId = Constants.lovID;
        roomObj.setConsultationRoomId(roomId);
        RoomName = Constants.lovDescription;
        txtAssignRoom.setText(Constants.lovDescription);
        txtAssignRoom.requestFocus();
    }//GEN-LAST:event_txtAssignRoomActionPerformed

    private void tblConsultantRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultantRoomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblConsultantRoomMouseClicked

    private void tblConsultantRoomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultantRoomMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblConsultantRoomMousePressed

    private void tblConsultantRoomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultantRoomMouseReleased
        if (tblConsultantRoom.getSelectedRow() < 0 || listRoomDetails.isEmpty()) {
            return;
        }
        roomObj = listRoomDetails.get(tblConsultantRoom.getSelectedRow());
        setData();
    }//GEN-LAST:event_tblConsultantRoomMouseReleased

    private void tblConsultantRoomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblConsultantRoomKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblConsultantRoomKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Consultant;
    private javax.swing.JButton btnAssignRoom;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPanel pnlSearchUser6;
    private javax.swing.JPanel pnlUserDetail1;
    private javax.swing.JPanel pnlUserDetail3;
    private javax.swing.JTable tblConsultantRoom;
    private javax.swing.JTextField txtAssignRoom;
    private javax.swing.JTextField txtCurrentRoom;
    private javax.swing.JTextField txtSpeciality;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserNameDispay;
    // End of variables declaration//GEN-END:variables

    //new declarations
    private void selectRoomInfo(String userName,
            String specialtyId) {
        listRoomDetails = ctlRoom.selectRoomDetails(userName, specialtyId);
        
        if (listRoomDetails.isEmpty()) {
     //       List list.add(listRoomDetails);
            tblConsultantRoom.setModel(new ConsultationRoomTableModel(listRoomDetails));
        } else {
            tblConsultantRoom.setModel(new ConsultationRoomTableModel(listRoomDetails));
        }
        ListSelectionModel selectionModel = tblConsultantRoom.getSelectionModel();
        tblConsultantRoom.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsInvoiceMaster();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblConsultantRoom);

    }

    public void setColumnsWidthsInvoiceMaster() {

        TableColumn column = null;
        for (int i = 0; i < tblConsultantRoom.getColumnCount(); i++) {
            column = tblConsultantRoom.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            } else if (i == 3) {
                column.setPreferredWidth(110);
            } else if (i == 4) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void setData() {
        txtUserNameDispay.setText(roomObj.getName().trim());
        txtCurrentRoom.setText(roomObj.getRoomName().trim());
    }

    private void clearForm() {
        txtSpeciality.setText("");
        txtUserName.setText("");
    }

    private void clearAllFields() {
        txtSpeciality.setText("");
        txtUserName.setText("");
        txtCurrentRoom.setText("");
        txtUserNameDispay.setText("");
        txtAssignRoom.setText("");
    }
}
