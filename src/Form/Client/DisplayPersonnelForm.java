package Form.Client;

import BO.AuditLog;
import BO.Patient;
import Controller.Client.AuditLogController;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import java.util.ArrayList;
import java.util.List;
import utilities.Constants;
import utilities.DisplayLOV;

public class DisplayPersonnelForm extends javax.swing.JInternalFrame {

    public DisplayPersonnelForm() {

        initComponents();
        this.setSize(Constants.xSize - 30, 780);
        selectAuditLogTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel()
        ;
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblClientWiseEmployee = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtSearchClient = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtSearchEmpId = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel()
        ;
        jLabel21 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        txtCnic = new javax.swing.JTextField();
        txtRelation = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtDOB = new javax.swing.JTextField();
        txtMaritalStatus = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        cboActive = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        lblAttachedPicture = new javax.swing.JLabel();
        btnShowCam = new javax.swing.JButton();
        btnInactiveEmployee2 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        txtEmergencyContactNo = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        ChkNotCnic = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        btnExitAssign = new javax.swing.JButton();
        btnUpdateEmployee = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle(Constants.title+"Display Personnel Information");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1050, 750));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Display Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Employee Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        tblClientWiseEmployee.setBackground(java.awt.SystemColor.activeCaption);
        tblClientWiseEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null,null}
            },
            new String [] {"Name","Relation","CNIC"}));
    tblClientWiseEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblClientWiseEmployeeMouseClicked(evt);
        }
        public void mousePressed(java.awt.event.MouseEvent evt) {
            tblClientWiseEmployeeMousePressed(evt);
        }
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            tblClientWiseEmployeeMouseReleased(evt);
        }
    });
    tblClientWiseEmployee.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            tblClientWiseEmployeePropertyChange(evt);
        }
    });
    tblClientWiseEmployee.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            tblClientWiseEmployeeKeyPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            tblClientWiseEmployeeKeyReleased(evt);
        }
    });
    jScrollPane6.setViewportView(tblClientWiseEmployee);

    javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
    jPanel10.setLayout(jPanel10Layout);
    jPanel10Layout.setHorizontalGroup(
        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
    );
    jPanel10Layout.setVerticalGroup(
        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
    );

    jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Employee Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

    jLabel14.setBackground(new java.awt.Color(255, 255, 255));
    jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel14.setForeground(new java.awt.Color(102, 0, 0));
    jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel14.setText("PL Number : ");

    txtSearchClient.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtSearchClient.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtSearchClientActionPerformed(evt);
        }
    });
    txtSearchClient.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtSearchClientKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtSearchClientKeyTyped(evt);
        }
    });

    btnSearch.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    btnSearch.setText("Search");
    btnSearch.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSearchActionPerformed(evt);
        }
    });

    jLabel20.setBackground(new java.awt.Color(255, 255, 255));
    jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel20.setForeground(new java.awt.Color(102, 0, 0));
    jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel20.setText(" Organization : ");

    txtSearchEmpId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtSearchEmpId.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtSearchEmpIdActionPerformed(evt);
        }
    });
    txtSearchEmpId.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtSearchEmpIdKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtSearchEmpIdKeyTyped(evt);
        }
    });

    javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
    jPanel11.setLayout(jPanel11Layout);
    jPanel11Layout.setHorizontalGroup(
        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel11Layout.createSequentialGroup()
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addComponent(txtSearchEmpId, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(txtSearchClient))
            .addContainerGap())
    );
    jPanel11Layout.setVerticalGroup(
        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel11Layout.createSequentialGroup()
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtSearchEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnSearch))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtSearchClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel20))
            .addGap(6, 6, 6))
    );

    jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(102, 0, 0))); // NOI18N

    jLabel21.setBackground(new java.awt.Color(255, 255, 255));
    jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel21.setForeground(new java.awt.Color(102, 0, 0));
    jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel21.setText("Patient Id :");

    txtPatientId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    txtPatientId.setForeground(new java.awt.Color(102, 0, 0));
    txtPatientId.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtPatientIdActionPerformed(evt);
        }
    });
    txtPatientId.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtPatientIdKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtPatientIdKeyTyped(evt);
        }
    });

    txtAge.setEditable(false);
    txtAge.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtAge.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtAgeActionPerformed(evt);
        }
    });
    txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtAgeKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtAgeKeyTyped(evt);
        }
    });

    txtPatientName.setEditable(false);
    txtPatientName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtPatientName.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtPatientNameActionPerformed(evt);
        }
    });
    txtPatientName.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtPatientNameKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtPatientNameKeyTyped(evt);
        }
    });

    jLabel30.setBackground(new java.awt.Color(255, 255, 255));
    jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel30.setForeground(new java.awt.Color(102, 0, 0));
    jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel30.setText("Age/Gender :");

    jLabel33.setBackground(new java.awt.Color(255, 255, 255));
    jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel33.setForeground(new java.awt.Color(102, 0, 0));
    jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel33.setText("Address :");

    jLabel34.setBackground(new java.awt.Color(255, 255, 255));
    jLabel34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel34.setForeground(new java.awt.Color(102, 0, 0));
    jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel34.setText("Contact No :");

    jLabel35.setBackground(new java.awt.Color(255, 255, 255));
    jLabel35.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel35.setForeground(new java.awt.Color(102, 0, 0));
    jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel35.setText("Relation :");

    jLabel36.setBackground(new java.awt.Color(255, 255, 255));
    jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel36.setForeground(new java.awt.Color(102, 0, 0));
    jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel36.setText("CNIC No :");

    txtContactNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtContactNo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtContactNoActionPerformed(evt);
        }
    });
    txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtContactNoKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtContactNoKeyTyped(evt);
        }
    });

    txtCnic.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtCnic.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtCnicActionPerformed(evt);
        }
    });
    txtCnic.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtCnicKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtCnicKeyTyped(evt);
        }
    });

    txtRelation.setEditable(false);
    txtRelation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtRelation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtRelationActionPerformed(evt);
        }
    });
    txtRelation.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtRelationKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtRelationKeyTyped(evt);
        }
    });

    jLabel38.setBackground(new java.awt.Color(255, 255, 255));
    jLabel38.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel38.setForeground(new java.awt.Color(102, 0, 0));
    jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel38.setText("DOB :");

    txtAddress.setColumns(20);
    txtAddress.setLineWrap(true);
    txtAddress.setRows(5);
    txtAddress.setWrapStyleWord(true);
    jScrollPane1.setViewportView(txtAddress);

    txtDOB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtDOB.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtDOBActionPerformed(evt);
        }
    });
    txtDOB.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtDOBKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtDOBKeyTyped(evt);
        }
    });

    txtMaritalStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtMaritalStatus.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtMaritalStatusActionPerformed(evt);
        }
    });
    txtMaritalStatus.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtMaritalStatusKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtMaritalStatusKeyTyped(evt);
        }
    });

    jLabel37.setBackground(new java.awt.Color(255, 255, 255));
    jLabel37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel37.setForeground(new java.awt.Color(102, 0, 0));
    jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel37.setText("Martial Status:");

    cboActive.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Y", "N" }));
    cboActive.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cboActiveActionPerformed(evt);
        }
    });

    jLabel40.setBackground(new java.awt.Color(255, 255, 255));
    jLabel40.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel40.setForeground(new java.awt.Color(102, 0, 0));
    jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel40.setText("Active :");

    jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Picture", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

    jPanel14.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

    lblAttachedPicture.setBackground(new java.awt.Color(255, 255, 255));
    lblAttachedPicture.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    lblAttachedPicture.setForeground(new java.awt.Color(102, 0, 0));
    lblAttachedPicture.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    lblAttachedPicture.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            lblAttachedPictureMouseClicked(evt);
        }
    });

    javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
    jPanel14.setLayout(jPanel14Layout);
    jPanel14Layout.setHorizontalGroup(
        jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(lblAttachedPicture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
    );
    jPanel14Layout.setVerticalGroup(
        jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(lblAttachedPicture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    btnShowCam.setText("Show");
    btnShowCam.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnShowCamActionPerformed(evt);
        }
    });

    btnInactiveEmployee2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
    btnInactiveEmployee2.setText("Attach");
    btnInactiveEmployee2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnInactiveEmployee2ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnShowCam, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnInactiveEmployee2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(btnShowCam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInactiveEmployee2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    jLabel39.setBackground(new java.awt.Color(255, 255, 255));
    jLabel39.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel39.setForeground(new java.awt.Color(102, 0, 0));
    jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel39.setText("Emerg.No :");

    txtEmergencyContactNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtEmergencyContactNo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtEmergencyContactNoActionPerformed(evt);
        }
    });
    txtEmergencyContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtEmergencyContactNoKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtEmergencyContactNoKeyTyped(evt);
        }
    });

    txtGender.setEditable(false);
    txtGender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtGender.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtGenderActionPerformed(evt);
        }
    });
    txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtGenderKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtGenderKeyTyped(evt);
        }
    });

    jLabel41.setBackground(new java.awt.Color(255, 255, 255));
    jLabel41.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel41.setForeground(new java.awt.Color(102, 0, 0));
    jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel41.setText("Cnic Confirm :");

    ChkNotCnic.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    ChkNotCnic.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    ChkNotCnic.setForeground(new java.awt.Color(102, 0, 0));
    ChkNotCnic.setText("Not have Cnic");
    ChkNotCnic.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            ChkNotCnicActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(4, 4, 4)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(txtPatientId)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addComponent(txtDOB)
                        .addComponent(txtContactNo)
                        .addComponent(txtMaritalStatus)
                        .addComponent(txtRelation)
                        .addComponent(txtCnic)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtGender))
                        .addComponent(txtEmergencyContactNo, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ChkNotCnic, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                    .addGap(5, 5, 5)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboActive, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGap(5, 5, 5))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel21)
                .addComponent(txtPatientId)
                .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cboActive, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel40)
                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39)
                        .addComponent(txtEmergencyContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(7, 7, 7)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRelation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ChkNotCnic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5))
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGap(0, 0, 0))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
    );

    jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    jPanel12.setForeground(new java.awt.Color(255, 255, 255));

    btnExitAssign.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    btnExitAssign.setForeground(new java.awt.Color(102, 0, 0));
    btnExitAssign.setText("Exit");
    btnExitAssign.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnExitAssignActionPerformed(evt);
        }
    });

    btnUpdateEmployee.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    btnUpdateEmployee.setText("Update Employee Info");
    btnUpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUpdateEmployeeActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
    jPanel12.setLayout(jPanel12Layout);
    jPanel12Layout.setHorizontalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel12Layout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addComponent(btnUpdateEmployee)
            .addGap(66, 66, 66)
            .addComponent(btnExitAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel12Layout.setVerticalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnExitAssign)
            .addComponent(btnUpdateEmployee))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblClientWiseEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientWiseEmployeeMouseClicked


    }//GEN-LAST:event_tblClientWiseEmployeeMouseClicked

    private void tblClientWiseEmployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientWiseEmployeeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClientWiseEmployeeMousePressed

    private void tblClientWiseEmployeeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientWiseEmployeeMouseReleased

//        if (selectClientWiseEmp.getInfoUpdated().equalsIgnoreCase("N")) {
//            disableFields();
//        } 
    }//GEN-LAST:event_tblClientWiseEmployeeMouseReleased

    private void tblClientWiseEmployeePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblClientWiseEmployeePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClientWiseEmployeePropertyChange

    private void tblClientWiseEmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClientWiseEmployeeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClientWiseEmployeeKeyPressed

    private void tblClientWiseEmployeeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClientWiseEmployeeKeyReleased

    }//GEN-LAST:event_tblClientWiseEmployeeKeyReleased

    private void btnUpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmployeeActionPerformed

    }//GEN-LAST:event_btnUpdateEmployeeActionPerformed

    private void txtSearchClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchClientActionPerformed

    }//GEN-LAST:event_txtSearchClientActionPerformed

    private void txtSearchClientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchClientKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchClientKeyPressed

    private void txtSearchClientKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchClientKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchClientKeyTyped

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchEmpIdActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchEmpIdActionPerformed

    private void txtSearchEmpIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchEmpIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchEmpIdKeyPressed

    private void txtSearchEmpIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchEmpIdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchEmpIdKeyTyped

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed

    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtPatientIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdKeyPressed

    private void txtPatientIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientIdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdKeyTyped

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed

        txtAge.requestFocus();
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed

        txtGender.requestFocus();
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtPatientNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameKeyPressed

    private void txtPatientNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameKeyTyped

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        txtCnic.requestFocus();
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void txtContactNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoKeyPressed

    private void txtContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoKeyTyped

    private void txtCnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnicActionPerformed

    }//GEN-LAST:event_txtCnicActionPerformed

    private void txtCnicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCnicKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnicKeyPressed

    private void txtCnicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCnicKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnicKeyTyped

    private void txtRelationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRelationActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtRelationActionPerformed

    private void txtRelationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRelationKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRelationKeyPressed

    private void txtRelationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRelationKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRelationKeyTyped

    private void lblAttachedPictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAttachedPictureMouseClicked

    }//GEN-LAST:event_lblAttachedPictureMouseClicked

    private void btnExitAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitAssignActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnExitAssignActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtDOBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDOBKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBKeyPressed

    private void txtDOBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDOBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBKeyTyped

    private void txtMaritalStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaritalStatusActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaritalStatusActionPerformed

    private void txtMaritalStatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaritalStatusKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaritalStatusKeyPressed

    private void txtMaritalStatusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaritalStatusKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaritalStatusKeyTyped

    private void cboActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboActiveActionPerformed

    private void btnShowCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowCamActionPerformed


    }//GEN-LAST:event_btnShowCamActionPerformed

    private void btnInactiveEmployee2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactiveEmployee2ActionPerformed
        //   TODO add your handling code here:
        //  webcam or document
//        final frmAttachEmployeePicture patOrder = new frmAttachEmployeePicture(selectClientWiseEmp);
//        Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
//        Dimension fmSize = patOrder.getSize();
//        patOrder.setLocation((desktopSize.width - fmSize.width) / 2,
//                (desktopSize.height - fmSize.height) / 2);
//        this.getDesktopPane().add(patOrder);
//
//        patOrder.setVisible(true);
    }//GEN-LAST:event_btnInactiveEmployee2ActionPerformed

    private void txtEmergencyContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmergencyContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmergencyContactNoActionPerformed

    private void txtEmergencyContactNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmergencyContactNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmergencyContactNoKeyPressed

    private void txtEmergencyContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmergencyContactNoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmergencyContactNoKeyTyped

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtGenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderKeyPressed

    private void txtGenderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderKeyTyped

    private void ChkNotCnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkNotCnicActionPerformed
        if (ChkNotCnic.isSelected()) {

        }
    }//GEN-LAST:event_ChkNotCnicActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkNotCnic;
    private javax.swing.JButton btnExitAssign;
    private javax.swing.JButton btnInactiveEmployee2;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowCam;
    private javax.swing.JButton btnUpdateEmployee;
    private javax.swing.JComboBox cboActive;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblAttachedPicture;
    private javax.swing.JTable tblClientWiseEmployee;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCnic;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmergencyContactNo;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtMaritalStatus;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtRelation;
    private javax.swing.JTextField txtSearchClient;
    private javax.swing.JTextField txtSearchEmpId;
    // End of variables declaration//GEN-END:variables

    List<AuditLog> listSelectLogTable = new ArrayList<>();
    AuditLogController ctlAudit = new AuditLogController();
    AuditLog obj = new AuditLog();
    String factoryId = "";

    DisplayLOV lov = new DisplayLOV();
    Webcam webcam = null;
    WebcamPanel panel;

    Patient selectDocumentInfo = new Patient();
    Patient selectEmployeeInfo = new Patient();

    private void selectAuditLogTable() {

        List listSelectLogTable = ctlAudit.selectEmployeeByFactory(factoryId);
        obj = (AuditLog) listSelectLogTable.get(0);
        System.out.println(listSelectLogTable);


    }
}


