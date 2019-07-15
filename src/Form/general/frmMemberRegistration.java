package Form.general;

//import BO.Administration.SupportEmail;
//import Controller.Administration.SupportEmailController;
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

public class frmMemberRegistration extends javax.swing.JInternalFrame {

    

    public frmMemberRegistration() {

        initComponents();

        btnExit.setMnemonic(KeyEvent.VK_X);
//        btnSave.setMnemonic(KeyEvent.VK_S);
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
        txtSalary = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCnic = new javax.swing.JTextField();
        txtChildrens = new javax.swing.JTextField();
        cboStatus = new javax.swing.JComboBox();
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
        jLabel21 = new javax.swing.JLabel();
        txtChildrens2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtCnic5 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtChildrens3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblOpenLetter = new javax.swing.JTable();
        pnlUserDetail1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        txtClient1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle(Constants.title+"Member Registration" );
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnSave))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExit)
                        .addComponent(btnClear2)
                        .addComponent(btnClear1))))
        );

        pnlSearchUser7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Member Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser7.setForeground(java.awt.SystemColor.activeCaption);

        pnlUserDetail2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail2.setForeground(java.awt.SystemColor.activeCaption);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Reference ID :");

        txtJob.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJobActionPerformed(evt);
            }
        });

        txtSalary.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSalaryMouseReleased(evt);
            }
        });
        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Name :");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Institute :");

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

        cboStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Student", "Employee"}));
        cboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboStatusActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("DOB :");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Gender :");

        txtJob1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtJob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJob1ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Contact No :");

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
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Max Book Limit :");

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
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Age :");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Cnic :");

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

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Email Address :");

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
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Department :");

        txtCnic5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCnic5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtCnic5MouseReleased(evt);
            }
        });
        txtCnic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnic5ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Address :");

        txtChildrens3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtChildrens3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtChildrens3MouseReleased(evt);
            }
        });
        txtChildrens3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChildrens3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail2Layout = new javax.swing.GroupLayout(pnlUserDetail2);
        pnlUserDetail2.setLayout(pnlUserDetail2Layout);
        pnlUserDetail2Layout.setHorizontalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtChildrens3)
                    .addComponent(txtChildrens2)
                    .addComponent(txtSalary)
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtChildrens1)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtChildrens)
                            .addComponent(txtJob1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtCnic, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCnic5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCnic2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCnic3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(txtCnic4)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addComponent(txtJob, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        pnlUserDetail2Layout.setVerticalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCnic3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtJob1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCnic2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addGap(6, 6, 6)
                                .addComponent(txtChildrens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(6, 6, 6)
                                .addComponent(txtCnic5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(txtChildrens1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel19))
                        .addGap(6, 6, 6)
                        .addComponent(txtCnic4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtChildrens2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtChildrens3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap()
                .addComponent(pnlUserDetail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblOpenLetter.setBackground(java.awt.SystemColor.activeCaption);
        tblOpenLetter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Sr.", "Member ID", "Name", "Contact No","Type"
            }
        ));
        tblOpenLetter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOpenLetterMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblOpenLetterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblOpenLetterMouseReleased(evt);
            }
        });
        tblOpenLetter.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblOpenLetterPropertyChange(evt);
            }
        });
        tblOpenLetter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblOpenLetterKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(tblOpenLetter);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
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
        jLabel8.setText("Type :");

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
        jLabel20.setText("Institute :");

        javax.swing.GroupLayout pnlUserDetail1Layout = new javax.swing.GroupLayout(pnlUserDetail1);
        pnlUserDetail1.setLayout(pnlUserDetail1Layout);
        pnlUserDetail1Layout.setHorizontalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txtContactNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtClient, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(txtClient1))
                .addGap(5, 5, 5))
        );
        pnlUserDetail1Layout.setVerticalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)
                        .addComponent(txtClient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pnlSearchUser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pnlUserDetail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlUserDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlSearchUser7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        if (txtPatientId.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Patient Id!");
            txtPatientId.requestFocus();
            return;
        }


        current.setPatientId(patientId);
        current.setJob(txtJob.getText().replaceAll("'", "''"));
        current.setSalary(txtSalary.getText().replaceAll("'", "''"));
        current.setChildrens(txtChildrens.getText().replaceAll("'", "''"));
        current.setCnic(txtCnic.getText().replaceAll("'", "''"));
        current.setContactNo(txtContactNo.getText().replaceAll("'", "''"));
        current.setCrtdBy(Constants.userId);
        current.setCrtdTerminalId(Constants.terminalId);
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

    private void txtSalaryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalaryMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryMouseReleased

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

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

    private void cboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboStatusActionPerformed

//        patientId = "";
//        if (cboStatus.getSelectedIndex() == 0) {
//            statusId = Status.admitted;
//            searchAdmittedPatient(statusId);
//
//        } else if (cboStatus.getSelectedIndex() == 1) {
//            statusId = Status.dischargeRequest;
//            searchAdmittedPatient(statusId);
//        }
//        else if (cboStatus.getSelectedIndex() == 2){
//            statusId = Status.financiallyDischarge;
//            searchAdmittedPatient(statusId);
//        }
//        else{
//            searchAdmittedPatient(Status.admitted);
//        }
    }//GEN-LAST:event_cboStatusActionPerformed

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

    private void tblOpenLetterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOpenLetterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOpenLetterMouseClicked

    private void tblOpenLetterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOpenLetterMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOpenLetterMousePressed

    private void tblOpenLetterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOpenLetterMouseReleased

    }//GEN-LAST:event_tblOpenLetterMouseReleased

    private void tblOpenLetterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblOpenLetterPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOpenLetterPropertyChange

    private void tblOpenLetterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOpenLetterKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOpenLetterKeyPressed

    private void txtChildrens2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtChildrens2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChildrens2MouseReleased

    private void txtChildrens2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChildrens2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChildrens2ActionPerformed

    private void btnClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClear2ActionPerformed

    private void txtCnic5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCnic5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnic5MouseReleased

    private void txtCnic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnic5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnic5ActionPerformed

    private void txtChildrens3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtChildrens3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChildrens3MouseReleased

    private void txtChildrens3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChildrens3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChildrens3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnClear2;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cboStatus;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel pnlSearchUser7;
    private javax.swing.JPanel pnlUserDetail1;
    private javax.swing.JPanel pnlUserDetail2;
    private javax.swing.JTable tblOpenLetter;
    private javax.swing.JTextField txtChildrens;
    private javax.swing.JTextField txtChildrens1;
    private javax.swing.JTextField txtChildrens2;
    private javax.swing.JTextField txtChildrens3;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtClient1;
    private javax.swing.JTextField txtCnic;
    private javax.swing.JTextField txtCnic2;
    private javax.swing.JTextField txtCnic3;
    private javax.swing.JTextField txtCnic4;
    private javax.swing.JTextField txtCnic5;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtJob;
    private javax.swing.JTextField txtJob1;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtSalary;
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
        
      List lis = ctlFinan.SearchEmpById(patientId);
      financialObj = (FinancialSupport) lis.get(0);
      txtJob.setText(financialObj.getJob());
      txtSalary.setText(financialObj.getSalary());
      txtCnic.setText(financialObj.getCnic());
      txtChildrens.setText(financialObj.getChildrens());
      txtSalary.setText(financialObj.getSalary());
//      txtOccupation.setText(financialObj.getOccupation());
//      txtRemarks.setText(financialObj.getRemarks());
     
    }

    

    private void clearForm() {
        Vector<JComponent> comp = new Vector<JComponent>();
        comp.add(txtPatientId);
//        comp.add(txtPatientName);
//        comp.add(txtContactNo);
//        comp.add(txtCurrentStatus);
//        comp.add(txtClient);
//        comp.add(txtDate);
        comp.add(txtJob);
        comp.add(txtSalary);
        comp.add(txtCnic);
        comp.add(txtChildrens);
        comp.add(txtSalary);
//        comp.add(txtRemarks);
      
        GUIUtils.setClear(comp);

    }
}
