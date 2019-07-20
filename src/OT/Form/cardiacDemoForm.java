package OT.Form;

import OT.BO.CardiacSurgery;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;

public class cardiacDemoForm extends javax.swing.JInternalFrame {

    public cardiacDemoForm() {

        initComponents();
        this.setSize(Constants.xSize -80, Constants.ySize -  120);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSelectedPatientId = new javax.swing.JTextField();
        txtSelectedPatientName = new javax.swing.JTextField();
        txtPerformingPhysician = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtAdmissionNo = new javax.swing.JTextField();
        txtWard = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cboPriorityStatus = new javax.swing.JComboBox();
        cbofirstRedo = new javax.swing.JComboBox();
        txtReasonForRedo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblReasonForRedo = new javax.swing.JTable();
        btnAddDateOperation = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cboAccess = new javax.swing.JComboBox();
        cboElective = new javax.swing.JComboBox();
        txtIfnotElective = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblAccess = new javax.swing.JTable();
        btnAddAccess = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        cboCabgProc = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtCronArt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtConduit = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtDV = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cboEndart = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        txtPl = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtFlow = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblSelectedParameter = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        txtFlow1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtFlow2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtFlow3 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtFlow4 = new javax.swing.JTextField();

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

        pnlPL.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlPL.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblPacsLink.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        lblPacsLink.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPacsLink.setForeground(new java.awt.Color(0, 102, 102));
        lblPacsLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPacsLink.setText(Constants.footerAllScreens);

        javax.swing.GroupLayout pnlPLLayout = new javax.swing.GroupLayout(pnlPL);
        pnlPL.setLayout(pnlPLLayout);
        pnlPLLayout.setHorizontalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPLLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("Patient ID :");

        txtSelectedPatientId.setEditable(false);
        txtSelectedPatientId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSelectedPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectedPatientIdActionPerformed(evt);
            }
        });

        txtSelectedPatientName.setEditable(false);
        txtSelectedPatientName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSelectedPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectedPatientNameActionPerformed(evt);
            }
        });

        txtPerformingPhysician.setEditable(false);

        txtStatus.setEditable(false);
        txtStatus.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        txtAdmissionNo.setEditable(false);
        txtAdmissionNo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtAdmissionNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmissionNoActionPerformed(evt);
            }
        });

        txtWard.setEditable(false);
        txtWard.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtWard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWardActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Ward :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSelectedPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(txtAdmissionNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSelectedPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(txtWard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(txtPerformingPhysician))
                .addGap(10, 10, 10))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSelectedPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSelectedPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerformingPhysician))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWard)
                    .addComponent(txtStatus)
                    .addComponent(txtAdmissionNo))
                .addGap(5, 5, 5))
        );

        jTabbedPane1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date of Operation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        cboPriorityStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboPriorityStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select","Routine","Urgent","Emergency","Salvage"}));
        cboPriorityStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPriorityStatusActionPerformed(evt);
            }
        });

        cbofirstRedo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbofirstRedo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select","1st Operation","2nd Operation","3rd Operation","4th Operation"}));
        cbofirstRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbofirstRedoActionPerformed(evt);
            }
        });

        txtReasonForRedo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtReasonForRedo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtReasonForRedoMouseReleased(evt);
            }
        });
        txtReasonForRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReasonForRedoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Reason for Redo :");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText(" Priority Status :");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("First/Redo Surg :");

        tblReasonForRedo.setBackground(java.awt.SystemColor.activeCaption);
        tblReasonForRedo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblReasonForRedo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "" },
            },
            new String [] {
                "ID","DESCRIPTION"
            }
        ));
        tblReasonForRedo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReasonForRedoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblReasonForRedoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblReasonForRedoMouseReleased(evt);
            }
        });
        tblReasonForRedo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblReasonForRedoKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(tblReasonForRedo);

        btnAddDateOperation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddDateOperation.setText("Add");
        btnAddDateOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDateOperationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtReasonForRedo, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddDateOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboPriorityStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbofirstRedo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbofirstRedo)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboPriorityStatus)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtReasonForRedo)
                        .addComponent(btnAddDateOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Access", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        cboAccess.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboAccess.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select", "Median  Sternotomy","Right Thoracotomy","Left Thoracotomy","Mini Thoracotomy","Mini sternotomy Others"}));
        cboAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAccessActionPerformed(evt);
            }
        });

        cboElective.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboElective.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Elective", "Not Elective"}));
        cboElective.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboElectiveActionPerformed(evt);
            }
        });

        txtIfnotElective.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtIfnotElective.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtIfnotElectiveMouseReleased(evt);
            }
        });
        txtIfnotElective.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIfnotElectiveActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Reason if Not Elective :");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setText("Access :");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setText("Elective/Not Elective :");

        tblAccess.setBackground(java.awt.SystemColor.activeCaption);
        tblAccess.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblAccess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "" },
            },
            new String [] {
                "ID","DESCRIPTION"
            }
        ));
        tblAccess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccessMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAccessMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAccessMouseReleased(evt);
            }
        });
        tblAccess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAccessKeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(tblAccess);

        btnAddAccess.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddAccess.setText("Add");
        btnAddAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAccessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane12)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboElective, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIfnotElective)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboAccess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboElective, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIfnotElective, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", jPanel4);

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setText("CABG.Proc :");

        cboCabgProc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboCabgProc.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select","N.A","CABF(conventional)","OPCAB","CABG(on pump beating)","MIDCAB","MIDCAB (robotic)","Hybrid (Revascularization)"}));
        cboCabgProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCabgProcActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setText("Artery:");

        txtCronArt.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtCronArt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtCronArtMouseReleased(evt);
            }
        });
        txtCronArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCronArtActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setText("Conduit :");

        txtConduit.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtConduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtConduitMouseReleased(evt);
            }
        });
        txtConduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConduitActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setText("DV :");

        txtDV.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtDVMouseReleased(evt);
            }
        });
        txtDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDVActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setText("Endart:");

        cboEndart.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboEndart.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Y", "N"}));
        cboEndart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEndartActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setText("Pl:");

        txtPl.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPlMouseReleased(evt);
            }
        });
        txtPl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setText("Flow:");

        txtFlow.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtFlow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtFlowMouseReleased(evt);
            }
        });
        txtFlow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlowActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblSelectedParameter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Sr.", "cabg proc","Artery", "Coundit"
            }
        ));
        tblSelectedParameter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSelectedParameterMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSelectedParameterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblSelectedParameterMouseReleased(evt);
            }
        });
        tblSelectedParameter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblSelectedParameterKeyReleased(evt);
            }
        });
        jScrollPane16.setViewportView(tblSelectedParameter);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("DV:");
        jLabel19.setToolTipText("");

        txtFlow1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtFlow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtFlow1MouseReleased(evt);
            }
        });
        txtFlow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlow1ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Endart:");

        txtFlow2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtFlow2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtFlow2MouseReleased(evt);
            }
        });
        txtFlow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlow2ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Pl:");
        jLabel21.setToolTipText("");

        txtFlow3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtFlow3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtFlow3MouseReleased(evt);
            }
        });
        txtFlow3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlow3ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Flow:");
        jLabel22.setToolTipText("");

        txtFlow4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtFlow4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtFlow4MouseReleased(evt);
            }
        });
        txtFlow4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlow4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboCabgProc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCronArt)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtConduit)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDV)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboEndart, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPl)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFlow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFlow3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFlow4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFlow1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFlow2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(cboCabgProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCronArt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboEndart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFlow2)
                    .addComponent(txtFlow1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFlow)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFlow3)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFlow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSelectedPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectedPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectedPatientIdActionPerformed

    private void txtSelectedPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectedPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectedPatientNameActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void txtAdmissionNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmissionNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmissionNoActionPerformed

    private void txtWardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWardActionPerformed

    private void cboPriorityStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPriorityStatusActionPerformed

    }//GEN-LAST:event_cboPriorityStatusActionPerformed

    private void cbofirstRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbofirstRedoActionPerformed
        if (cbofirstRedo.getSelectedIndex() <= 1) {
            txtReasonForRedo.setEditable(false);
        } else {
            txtReasonForRedo.setEditable(true);
        }
    }//GEN-LAST:event_cbofirstRedoActionPerformed

    private void txtReasonForRedoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReasonForRedoMouseReleased

    }//GEN-LAST:event_txtReasonForRedoMouseReleased

    private void txtReasonForRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReasonForRedoActionPerformed
//        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
//        + Database.DCMS.definitionTypeDetail + " DT      \n"
//        + " WHERE DT.DESCRIPTION LIKE '%"
//        + txtReasonForRedo.getText().toUpperCase().trim() + "%'"
//        + " AND DT.DEF_TYPE_ID = '" + DefinitionTypes.reasonForRedo + "'"
//        + " ORDER BY ID";
//        lov.LOVSelection(query, this);
//
//        if (Constants.lovID.equalsIgnoreCase("ID")) {
//            return;
//        }
//
//        typeDetailId = Constants.lovID;
//        redoName = Constants.lovDescription;
//        txtReasonForRedo.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtReasonForRedoActionPerformed

    private void tblReasonForRedoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReasonForRedoMouseClicked

//        if (evt.getClickCount() % 2 == 0) {
//            if (tblReasonForRedo.getSelectedRow() < 0 || listOtOperation.isEmpty()) {
//
//                return;
//            }
//            currentId = curentSelectedOperationObj.getId();
//            ctlOtCardiac.deleteOperationDetail(currentId);
//            selectOperationDetail(con, odi, typeDetailId, title);
//        }
    }//GEN-LAST:event_tblReasonForRedoMouseClicked

    private void tblReasonForRedoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReasonForRedoMousePressed

    }//GEN-LAST:event_tblReasonForRedoMousePressed

    private void tblReasonForRedoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReasonForRedoMouseReleased

    }//GEN-LAST:event_tblReasonForRedoMouseReleased

    private void tblReasonForRedoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblReasonForRedoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblReasonForRedoKeyReleased

    private void btnAddDateOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDateOperationActionPerformed
//        if (cboPriorityStatus.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Select Priority Status");
//            return;
//        }
//        if (cbofirstRedo.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Select First Redo");
//            return;
//        }
//
//        if (cbofirstRedo.getSelectedIndex() > 1) {
//            if (typeDetailId.equalsIgnoreCase("") || typeDetailId == null) {
//                JOptionPane.showMessageDialog(null, "Kinly Select Reason");
//                return;
//            }
//        }
//
//        List<CardiacSurgery> lis = new ArrayList<>();
//        String cboindex = "";
//        cboindex = cboStatus[cboPriorityStatus.getSelectedIndex()];
//        CardiacSurgery obj1 = new CardiacSurgery();
//        obj1.setTypeDetailId(cboindex);
//        obj1.setCompleteOrderNo(con);
//        obj1.setOrderDetailId(odi);
//        obj1.setDefTypeId(DefinitionTypes.priorityStatus);
//        obj1.setType("cbo");
//        lis.add(obj1);
//
//        cboindex = cboRedo[cbofirstRedo.getSelectedIndex()];
//        CardiacSurgery obj2 = new CardiacSurgery();
//        obj2.setCompleteOrderNo(con);
//        obj2.setOrderDetailId(odi);
//        obj2.setTypeDetailId(cboindex);
//        obj2.setDefTypeId(DefinitionTypes.firstRedo);
//        obj2.setType("cbo");
//        lis.add(obj2);
//
//        CardiacSurgery obj3 = new CardiacSurgery();
//        obj3.setCompleteOrderNo(con);
//        obj3.setOrderDetailId(odi);
//        obj3.setTypeDetailId(typeDetailId);
//        obj3.setDefTypeId(DefinitionTypes.reasonForRedo);
//        obj3.setType("LOV");
//        lis.add(obj3);
//
//        if (ctlOtCardiac.insertOperDetail(lis)) {
//            selectOperationDetail(con, odi, typeDetailId, typeDetailId);
//        } else {
//            JOptionPane.showMessageDialog(null, "Unable to Add, Kindly Contact Administrator");
//        }
    }//GEN-LAST:event_btnAddDateOperationActionPerformed

    private void cboAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAccessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAccessActionPerformed

    private void cboElectiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboElectiveActionPerformed
        if (cboElective.getSelectedIndex() == 0) {
            txtIfnotElective.setEditable(false);
        } else {
            txtIfnotElective.setEditable(true);
        }
    }//GEN-LAST:event_cboElectiveActionPerformed

    private void txtIfnotElectiveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIfnotElectiveMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIfnotElectiveMouseReleased

    private void txtIfnotElectiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIfnotElectiveActionPerformed
//        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
//        + Database.DCMS.definitionTypeDetail + " DT      \n"
//        + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otreasonIfnotElective + "'"
//        + " ORDER BY ID";
//        lov.LOVSelection(query, this);
//
//        if (Constants.lovID.equalsIgnoreCase("ID")) {
//            return;
//        }
//
//        IfnotElectiveId = Constants.lovID;
//        IfnotElectiveLov = Constants.lovDescription;
//        txtIfnotElective.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtIfnotElectiveActionPerformed

    private void tblAccessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccessMouseClicked
//        if (evt.getClickCount() % 2 == 0) {
//            if (tblAccess.getSelectedRow() < 0 || listAccessSelect.isEmpty()) {
//
//                return;
//            }
//            curentSelectedOperationObj = new CardiacSurgery();
//            curentSelectedOperationObj = listAccessSelect.get(tblAccess.getSelectedRow());
//            currentCabgId = curentSelectedOperationObj.getId();
//            ctlOtCardiac.deleteOperationDetail(currentCabgId);
//            selectAccessDetail(con, odi, typeDetailId, deftypeid);
//        }
    }//GEN-LAST:event_tblAccessMouseClicked

    private void tblAccessMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccessMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAccessMousePressed

    private void tblAccessMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccessMouseReleased

    }//GEN-LAST:event_tblAccessMouseReleased

    private void tblAccessKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAccessKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAccessKeyReleased

    private void btnAddAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccessActionPerformed
//        if (cboAccess.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Select Access");
//            return;
//        }
//
//        if (cboElective.getSelectedIndex() > 0) {
//            if (IfnotElectiveId.equalsIgnoreCase("") || IfnotElectiveId == null) {
//                JOptionPane.showMessageDialog(null, "Kinly Select If Not Elective");
//                return;
//            }
//        }
//        List<CardiacSurgery> lis = new ArrayList<>();
//        String cboindex = "";
//        cboindex = cboAcs[cboAccess.getSelectedIndex()];
//        CardiacSurgery obj1 = new CardiacSurgery();
//        obj1.setTypeDetailId(cboindex);
//        obj1.setCompleteOrderNo(con);
//        obj1.setOrderDetailId(odi);
//        obj1.setType("cbo");
//        obj1.setDefTypeId(DefinitionTypes.otAccess);
//        lis.add(obj1);
//
//        cboindex = cboEle[cboElective.getSelectedIndex()];
//        CardiacSurgery obj2 = new CardiacSurgery();
//        obj2.setCompleteOrderNo(con);
//        obj2.setOrderDetailId(odi);
//        obj2.setTypeDetailId(cboindex);
//        obj2.setType("cbo");
//        obj2.setDefTypeId(DefinitionTypes.otValveSurg);
//        lis.add(obj2);
//
//        CardiacSurgery obj3 = new CardiacSurgery();
//        obj3.setCompleteOrderNo(con);
//        obj3.setOrderDetailId(odi);
//        obj3.setTypeDetailId(IfnotElectiveId);
//        obj3.setType("LOV");
//        obj3.setDefTypeId(DefinitionTypes.otreasonIfnotElective);
//        lis.add(obj3);
//
//        if (ctlOtCardiac.insertOperDetail(lis)) {
//            selectAccessDetail(con, odi, typeDetailId, deftypeid);
//        } else {
//            JOptionPane.showMessageDialog(null, "Unable to Add, Kindly Contact Administrator");
//        }
    }//GEN-LAST:event_btnAddAccessActionPerformed

    private void cboCabgProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCabgProcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCabgProcActionPerformed

    private void txtCronArtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCronArtMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCronArtMouseReleased

    private void txtCronArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCronArtActionPerformed

//        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
//        + Database.DCMS.definitionTypeDetail + " DT      \n"
//        + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otCronaryArtery + "'"
//        + " ORDER BY ID";
//        lov.LOVSelection(query, this);
//
//        if (Constants.lovID.equalsIgnoreCase("ID")) {
//            return;
//        }
//
//        txtConduit.requestFocus();
//        coronaryId = Constants.lovID;
//        txtCronArt.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtCronArtActionPerformed

    private void txtConduitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConduitMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConduitMouseReleased

    private void txtConduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConduitActionPerformed
//
//        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
//        + Database.DCMS.definitionTypeDetail + " DT      \n"
//        + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otConduit + "'"
//        + " ORDER BY ID";
//
//        lov.LOVSelection(query, this);
//
//        if (Constants.lovID.equalsIgnoreCase("ID")) {
//            return;
//        }
//
//        txtDV.requestFocus();
//        conduitId = Constants.lovID;
//        txtConduit.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtConduitActionPerformed

    private void txtDVMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDVMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDVMouseReleased

    private void txtDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDVActionPerformed

//        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
//        + Database.DCMS.definitionTypeDetail + " DT      \n"
//        + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otDistalVessel + "'"
//        + " ORDER BY ID";
//        lov.LOVSelection(query, this);
//
//        if (Constants.lovID.equalsIgnoreCase("ID")) {
//            return;
//        }
//
//        cboEndart.requestFocus();
//        distalVesselId = Constants.lovID;
//        txtDV.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtDVActionPerformed

    private void cboEndartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEndartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEndartActionPerformed

    private void txtPlMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlMouseReleased

    private void txtPlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlActionPerformed
        txtFlow.requestFocus();
    }//GEN-LAST:event_txtPlActionPerformed

    private void txtFlowMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFlowMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlowMouseReleased

    private void txtFlowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlowActionPerformed

    private void tblSelectedParameterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSelectedParameterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSelectedParameterMouseClicked

    private void tblSelectedParameterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSelectedParameterMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSelectedParameterMousePressed

    private void tblSelectedParameterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSelectedParameterMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSelectedParameterMouseReleased

    private void tblSelectedParameterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSelectedParameterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSelectedParameterKeyReleased

    private void txtFlow1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFlow1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlow1MouseReleased

    private void txtFlow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlow1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlow1ActionPerformed

    private void txtFlow2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFlow2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlow2MouseReleased

    private void txtFlow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlow2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlow2ActionPerformed

    private void txtFlow3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFlow3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlow3MouseReleased

    private void txtFlow3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlow3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlow3ActionPerformed

    private void txtFlow4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFlow4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlow4MouseReleased

    private void txtFlow4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlow4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlow4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAccess;
    private javax.swing.JButton btnAddDateOperation;
    private javax.swing.JComboBox cboAccess;
    private javax.swing.JComboBox cboCabgProc;
    private javax.swing.JComboBox cboElective;
    private javax.swing.JComboBox cboEndart;
    private javax.swing.JComboBox cboPriorityStatus;
    private javax.swing.JComboBox cbofirstRedo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblAccess;
    private javax.swing.JTable tblReasonForRedo;
    private javax.swing.JTable tblSelectedParameter;
    private javax.swing.JTextField txtAdmissionNo;
    private javax.swing.JTextField txtConduit;
    private javax.swing.JTextField txtCronArt;
    private javax.swing.JTextField txtDV;
    private javax.swing.JTextField txtFlow;
    private javax.swing.JTextField txtFlow1;
    private javax.swing.JTextField txtFlow2;
    private javax.swing.JTextField txtFlow3;
    private javax.swing.JTextField txtFlow4;
    private javax.swing.JTextField txtIfnotElective;
    private javax.swing.JTextField txtPerformingPhysician;
    private javax.swing.JTextField txtPl;
    private javax.swing.JTextField txtReasonForRedo;
    private javax.swing.JTextField txtSelectedPatientId;
    private javax.swing.JTextField txtSelectedPatientName;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtWard;
    // End of variables declaration//GEN-END:variables

}
