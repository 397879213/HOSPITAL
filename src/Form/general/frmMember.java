package Form.general;

import BO.Hr.FinancialSupport;
import BO.Patient;
import Controller.Hr.FinancialController;
import Controller.PatientController;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import utilities.Constants;
import utilities.GUIUtils;
import utilities.PrintJasperReport;
import utilities.Reports;

public class frmMember extends javax.swing.JInternalFrame {

    

    public frmMember() {

        initComponents();

        btnExit.setMnemonic(KeyEvent.VK_X);
        btnSave.setMnemonic(KeyEvent.VK_S);
//        btnClear.setMnemonic(KeyEvent.VK_C);

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        btnClear2 = new javax.swing.JButton();
        pnlSearchUser7 = new javax.swing.JPanel();
        pnlUserDetail2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtJob = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCnic = new javax.swing.JTextField();
        txtChildrens = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtJob1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtCnic2 = new javax.swing.JTextField();
        txtCnic3 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtCnic4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtChildrens1 = new javax.swing.JTextField();
        txtChildrens2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtJob2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        pnlUserDetail1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        txtClient1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblAdmittedPatient = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblAdmittedPatient1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Member Registration");
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

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(Constants.footerAllScreens);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 102, 0));
        btnSave.setText("Register");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear1.setText("Update");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        btnClear2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear2.setText("Clear");
        btnClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSearchUser7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Member Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser7.setForeground(java.awt.SystemColor.activeCaption);

        pnlUserDetail2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail2.setForeground(java.awt.SystemColor.activeCaption);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Ref.ID :");

        txtJob.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJobActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Program :");

        txtCnic.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCnic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtCnicMouseReleased(evt);
            }
        });
        txtCnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnicActionPerformed(evt);
            }
        });

        txtChildrens.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtChildrens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtChildrensMouseReleased(evt);
            }
        });
        txtChildrens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChildrensActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Age :");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Contact No :");

        txtJob1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtJob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJob1ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Cnic :");

        txtCnic2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCnic2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtCnic2MouseReleased(evt);
            }
        });
        txtCnic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnic2ActionPerformed(evt);
            }
        });

        txtCnic3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCnic3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtCnic3MouseReleased(evt);
            }
        });
        txtCnic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnic3ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Item Limit :");

        txtCnic4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCnic4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtCnic4MouseReleased(evt);
            }
        });
        txtCnic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnic4ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Type :");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Institute :");

        txtChildrens1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtChildrens1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtChildrens1MouseReleased(evt);
            }
        });
        txtChildrens1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChildrens1ActionPerformed(evt);
            }
        });

        txtChildrens2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtChildrens2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtChildrens2MouseReleased(evt);
            }
        });
        txtChildrens2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChildrens2ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Gender :");

        txtJob2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtJob2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJob2ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Name :");

        javax.swing.GroupLayout pnlUserDetail2Layout = new javax.swing.GroupLayout(pnlUserDetail2);
        pnlUserDetail2.setLayout(pnlUserDetail2Layout);
        pnlUserDetail2Layout.setHorizontalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCnic, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtJob, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCnic3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCnic2)
                    .addComponent(txtCnic4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtJob2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(txtJob1)
                    .addComponent(txtChildrens2)
                    .addComponent(txtChildrens)
                    .addComponent(txtChildrens1))
                .addContainerGap())
        );
        pnlUserDetail2Layout.setVerticalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtJob)
                    .addComponent(txtJob2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtCnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJob1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtCnic3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(txtChildrens2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCnic2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtChildrens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtChildrens1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCnic4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlSearchUser7Layout = new javax.swing.GroupLayout(pnlSearchUser7);
        pnlSearchUser7.setLayout(pnlSearchUser7Layout);
        pnlSearchUser7Layout.setHorizontalGroup(
            pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUserDetail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlSearchUser7Layout.setVerticalGroup(
            pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUser7Layout.createSequentialGroup()
                .addComponent(pnlUserDetail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pnlUserDetail1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Member", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail1.setForeground(java.awt.SystemColor.activeCaption);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Member Id :");

        txtPatientId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        txtContactNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtContactNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtContactNoMouseReleased(evt);
            }
        });
        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Contact No :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Ref.ID :");

        txtClient.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtClientMouseReleased(evt);
            }
        });
        txtClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientActionPerformed(evt);
            }
        });

        txtClient1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtClient1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtClient1MouseReleased(evt);
            }
        });
        txtClient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClient1ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Cnic :");

        javax.swing.GroupLayout pnlUserDetail1Layout = new javax.swing.GroupLayout(pnlUserDetail1);
        pnlUserDetail1.setLayout(pnlUserDetail1Layout);
        pnlUserDetail1Layout.setHorizontalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(txtContactNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClient, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(txtClient1))
                .addContainerGap())
        );
        pnlUserDetail1Layout.setVerticalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel12))
                    .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPatientId)
                        .addComponent(txtClient)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtClient1)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Member Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblAdmittedPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Member ID", "Name", "Contact No","Cnic","Reg.Date"
            }
        ));
        tblAdmittedPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdmittedPatientMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAdmittedPatientMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAdmittedPatientMouseReleased(evt);
            }
        });
        tblAdmittedPatient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAdmittedPatientKeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tblAdmittedPatient);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tblAdmittedPatient1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Sr.","Member ID", "Name", "Contact No","Type"
            }
        ));
        tblAdmittedPatient1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdmittedPatient1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAdmittedPatient1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAdmittedPatient1MouseReleased(evt);
            }
        });
        tblAdmittedPatient1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAdmittedPatient1KeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(tblAdmittedPatient1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlSearchUser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlUserDetail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlSearchUser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlUserDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        
       patientData();
       selectPatientInfo();
        
       
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtContactNoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContactNoMouseReleased


    }//GEN-LAST:event_txtContactNoMouseReleased

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        //selectSupportEmail(txtSubject.getText().trim(), "", "", "", "", "");
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
//        if (txtPatientId.getText().equalsIgnoreCase("")) {
//            JOptionPane.showMessageDialog(null, "Kindly Enter Patient Id!");
//            txtPatientId.requestFocus();
//            return;
//        }
//
//
//        current.setPatientId(patientId);
//        current.setJob(txtJob.getText().replaceAll("'", "''"));
//        current.setSalary(txtSalary.getText().replaceAll("'", "''"));
//        current.setChildrens(txtChildrens.getText().replaceAll("'", "''"));
//        current.setCnic(txtCnic.getText().replaceAll("'", "''"));
//        current.setContactNo(txtContactNo.getText().replaceAll("'", "''"));
//        current.setCrtdBy(Constants.userId);
//        current.setCrtdTerminalId(Constants.terminalId);
//        
//        if (ctlFinan.insertFinance(current)) {
//            txtPatientId.setBackground(new Color(225, 225, 225));
//        } else {
//            JOptionPane.showMessageDialog(null, "Unable To Save Record ! Kindly Contact Administrator");
//        }
     

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtClientMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClientMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientMouseReleased

    private void txtClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientActionPerformed

    private void txtJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJobActionPerformed

    private void txtCnicMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCnicMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnicMouseReleased

    private void txtCnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnicActionPerformed

    private void txtChildrensMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtChildrensMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChildrensMouseReleased

    private void txtChildrensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChildrensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChildrensActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void txtClient1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClient1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClient1MouseReleased

    private void txtClient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClient1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClient1ActionPerformed

    private void txtJob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJob1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJob1ActionPerformed

    private void txtCnic2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCnic2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnic2MouseReleased

    private void txtCnic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnic2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnic2ActionPerformed

    private void txtCnic3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCnic3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnic3MouseReleased

    private void txtCnic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnic3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnic3ActionPerformed

    private void txtCnic4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCnic4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnic4MouseReleased

    private void txtCnic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnic4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnic4ActionPerformed

    private void txtChildrens1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtChildrens1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChildrens1MouseReleased

    private void txtChildrens1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChildrens1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChildrens1ActionPerformed

    private void txtChildrens2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtChildrens2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChildrens2MouseReleased

    private void txtChildrens2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChildrens2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChildrens2ActionPerformed

    private void btnClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClear2ActionPerformed

    private void txtJob2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJob2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJob2ActionPerformed

    private void tblAdmittedPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdmittedPatientMouseClicked
//////
//////        if (tblAdmittedPatient.getSelectedRow() < 0 || listPatientAdmission.isEmpty()) {
//////            return;
//////        }
//////        if (evt.getClickCount() == 2) {
//////            PrintJasperReport print = new PrintJasperReport();
//////            BO.Reports report = print.getReportPath(Reports.Hospital.inpatientBill);
//////            if (report.getReportPath() == null || report.getReportPath().length() == 0) {
//////                return;
//////            }
//////            HashMap hm = new HashMap();
//////            hm.put("admissionNo", selectedPatient.getAdmissionNo());
//////            hm.put("patientId", selectedPatient.getPatientId());
//////            hm.put("user", Constants.userId);
//////            hm.put("reportTitle", "Admitted Patient Bill");
//////            hm.put("userLocationId", Constants.userLocationId);
//////            hm.put("SUBREPORT_DIR", report.getReportPath());
//////            print.printReport(report.getReportPath() + report.getReportName(),
//////                Constants.outReportPath + "54.pdf", Constants.viewPrint, hm);
//////        }
    }//GEN-LAST:event_tblAdmittedPatientMouseClicked

    private void tblAdmittedPatientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdmittedPatientMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAdmittedPatientMousePressed

    private void tblAdmittedPatientMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdmittedPatientMouseReleased

//        //     jTabOrderEntry.setSelectedIndex(0);
//        if (tblAdmittedPatient.getSelectedRow() < 0 || listPatientAdmission.isEmpty()) {
//            return;
//        }
//        currentSelectedPatient = tblAdmittedPatient.getSelectedRow();
//        setAdmittedPatientData();
//        searchMedication();
//        clearPharmacy();
//        txtPreviousNotes.setText("");
//        currentNote = new PatientNotes();
//        currentNote.setPatientId(patientId);
//        currentNote.setNotesBy(Constants.userId);
//        currentNote.setOrderLocationId(Constants.orderLocationId);
//        listPatientNotesStatus = ctlInPatientDiagnosis.selectPatientNotesStatus(currentNote, "N");
//        if (!listPatientNotesStatus.isEmpty()) {
//            currentNote = listPatientNotesStatus.get(0);
//            txtNotes.setText(currentNote.getNotes());
//        } else {
//            txtNotes.setText("");
//        }
//
//        selectPatientNotes();
        //    jTabOrderEntry.setSelectedIndex(0);
    }//GEN-LAST:event_tblAdmittedPatientMouseReleased

    private void tblAdmittedPatientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAdmittedPatientKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAdmittedPatientKeyReleased

    private void tblAdmittedPatient1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdmittedPatient1MouseClicked
//
//        if (tblAdmittedPatient.getSelectedRow() < 0 || listPatientAdmission.isEmpty()) {
//            return;
//        }
//        if (evt.getClickCount() == 2) {
//            PrintJasperReport print = new PrintJasperReport();
//            BO.Reports report = print.getReportPath(Reports.Hospital.inpatientBill);
//            if (report.getReportPath() == null || report.getReportPath().length() == 0) {
//                return;
//            }
//            HashMap hm = new HashMap();
//            hm.put("admissionNo", selectedPatient.getAdmissionNo());
//            hm.put("patientId", selectedPatient.getPatientId());
//            hm.put("user", Constants.userId);
//            hm.put("reportTitle", "Admitted Patient Bill");
//            hm.put("userLocationId", Constants.userLocationId);
//            hm.put("SUBREPORT_DIR", report.getReportPath());
//            print.printReport(report.getReportPath() + report.getReportName(),
//                Constants.outReportPath + "54.pdf", Constants.viewPrint, hm);
//        }
    }//GEN-LAST:event_tblAdmittedPatient1MouseClicked

    private void tblAdmittedPatient1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdmittedPatient1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAdmittedPatient1MousePressed

    private void tblAdmittedPatient1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdmittedPatient1MouseReleased

//        //     jTabOrderEntry.setSelectedIndex(0);
//        if (tblAdmittedPatient.getSelectedRow() < 0 || listPatientAdmission.isEmpty()) {
//            return;
//        }
//        currentSelectedPatient = tblAdmittedPatient.getSelectedRow();
//        setAdmittedPatientData();
//        searchMedication();
//        clearPharmacy();
//        txtPreviousNotes.setText("");
//        currentNote = new PatientNotes();
//        currentNote.setPatientId(patientId);
//        currentNote.setNotesBy(Constants.userId);
//        currentNote.setOrderLocationId(Constants.orderLocationId);
//        listPatientNotesStatus = ctlInPatientDiagnosis.selectPatientNotesStatus(currentNote, "N");
//        if (!listPatientNotesStatus.isEmpty()) {
//            currentNote = listPatientNotesStatus.get(0);
//            txtNotes.setText(currentNote.getNotes());
//        } else {
//            txtNotes.setText("");
//        }
//
//        selectPatientNotes();
        //    jTabOrderEntry.setSelectedIndex(0);
    }//GEN-LAST:event_tblAdmittedPatient1MouseReleased

    private void tblAdmittedPatient1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAdmittedPatient1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAdmittedPatient1KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnClear2;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel pnlSearchUser7;
    private javax.swing.JPanel pnlUserDetail1;
    private javax.swing.JPanel pnlUserDetail2;
    private javax.swing.JTable tblAdmittedPatient;
    private javax.swing.JTable tblAdmittedPatient1;
    private javax.swing.JTextField txtChildrens;
    private javax.swing.JTextField txtChildrens1;
    private javax.swing.JTextField txtChildrens2;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtClient1;
    private javax.swing.JTextField txtCnic;
    private javax.swing.JTextField txtCnic2;
    private javax.swing.JTextField txtCnic3;
    private javax.swing.JTextField txtCnic4;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtJob;
    private javax.swing.JTextField txtJob1;
    private javax.swing.JTextField txtJob2;
    private javax.swing.JTextField txtPatientId;
    // End of variables declaration//GEN-END:variables

    //new declarations
    PatientController ctlPatient = new PatientController();
    FinancialController ctlFinan = new FinancialController();
    
    private List<FinancialSupport> listFS = new ArrayList<>();
    String patientId = "";
    
    private List<FinancialSupport> listAddCptDetail = new ArrayList<>(0);
    FinancialSupport current = new FinancialSupport();
    Patient currPatient = new Patient();
    FinancialSupport financialObj = new FinancialSupport();

    

  private void patientData() {
//        if (GUIUtils.completePatientId(txtPatientId.getText().trim())) {
//            patientId = (Constants.completePatientId);
//            Patient pat = ctlPatient.searchPatient(patientId);
//            txtPatientName.setText(pat.getFullName());
//            txtClient.setText(pat.getClientDescription());
//            txtContactNo.setText(pat.getContactNo());
//            txtCurrentStatus.setText(pat.getPatientStatus());
//            txtDate.setText(pat.getRegistrationDate());
//        }
    }
    
       private void selectPatientInfo() {
        
//      List lis = ctlFinan.SearchEmpById(patientId);
//      financialObj = (FinancialSupport) lis.get(0);
//      txtJob.setText(financialObj.getJob());
//      txtSalary.setText(financialObj.getSalary());
//      txtCnic.setText(financialObj.getCnic());
//      txtChildrens.setText(financialObj.getChildrens());
//      txtSalary.setText(financialObj.getSalary());
//      txtOccupation.setText(financialObj.getOccupation());
//      txtRemarks.setText(financialObj.getRemarks());
     
    }

    

    private void clearForm() {
        Vector<JComponent> comp = new Vector<JComponent>();
//        comp.add(txtPatientId);
//        comp.add(txtPatientName);
//        comp.add(txtContactNo);
//        comp.add(txtCurrentStatus);
//        comp.add(txtClient);
//        comp.add(txtDate);
//        comp.add(txtJob);
//        comp.add(txtSalary);
//        comp.add(txtCnic);
//        comp.add(txtChildrens);
//        comp.add(txtSalary);
//        comp.add(txtRemarks);
//      
//        GUIUtils.setClear(comp);

    }
}
