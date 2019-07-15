package Form.Administration;

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

public class frmFinancialForm extends javax.swing.JInternalFrame {

    

    public frmFinancialForm() {

        initComponents();

        btnExit.setMnemonic(KeyEvent.VK_X);
        btnSave.setMnemonic(KeyEvent.VK_S);
        btnClear.setMnemonic(KeyEvent.VK_C);

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        pnlSearchUser7 = new javax.swing.JPanel();
        pnlUserDetail1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtCurrentStatus = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        pnlUserDetail2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtJob = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFinanClient = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCnic = new javax.swing.JTextField();
        txtChildrens = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtOccupation = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtRemarks = new javax.swing.JTextField();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Report Configuration");
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

        btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 102, 0));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear1.setText("Clear");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(btnSave)
                    .addComponent(btnClear1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
        );

        pnlSearchUser7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Zakat Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser7.setForeground(java.awt.SystemColor.activeCaption);

        pnlUserDetail1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail1.setForeground(java.awt.SystemColor.activeCaption);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Patient Id :");

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

        txtPatientName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        txtCurrentStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCurrentStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtCurrentStatusMouseReleased(evt);
            }
        });
        txtCurrentStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrentStatusActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Status :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Contact No :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Client :");

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

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Date :");

        txtDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtDateMouseReleased(evt);
            }
        });
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail1Layout = new javax.swing.GroupLayout(pnlUserDetail1);
        pnlUserDetail1.setLayout(pnlUserDetail1Layout);
        pnlUserDetail1Layout.setHorizontalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCurrentStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(txtDate)))
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPatientName)))
                .addContainerGap())
        );
        pnlUserDetail1Layout.setVerticalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCurrentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        pnlUserDetail2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail2.setForeground(java.awt.SystemColor.activeCaption);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Job :");

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
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Salary :");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Client :");

        txtFinanClient.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFinanClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtFinanClientMouseReleased(evt);
            }
        });
        txtFinanClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinanClientActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("CNIC :");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Childrens :");

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

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Occupation :");

        txtOccupation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtOccupation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtOccupationMouseReleased(evt);
            }
        });
        txtOccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOccupationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail2Layout = new javax.swing.GroupLayout(pnlUserDetail2);
        pnlUserDetail2.setLayout(pnlUserDetail2Layout);
        pnlUserDetail2Layout.setHorizontalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtChildrens, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(txtCnic, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFinanClient, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSalary, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtJob, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOccupation))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlUserDetail2Layout.setVerticalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFinanClient)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCnic)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtChildrens))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtOccupation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Remarks :");

        txtRemarks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRemarks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtRemarksMouseReleased(evt);
            }
        });
        txtRemarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemarksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchUser7Layout = new javax.swing.GroupLayout(pnlSearchUser7);
        pnlSearchUser7.setLayout(pnlSearchUser7Layout);
        pnlSearchUser7Layout.setHorizontalGroup(
            pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUser7Layout.createSequentialGroup()
                .addGroup(pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSearchUser7Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRemarks, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnlUserDetail1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlUserDetail2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        pnlSearchUser7Layout.setVerticalGroup(
            pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUser7Layout.createSequentialGroup()
                .addComponent(pnlUserDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUserDetail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemarks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSearchUser7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSearchUser7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

      clearForm();

    }//GEN-LAST:event_btnClearActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed

    }//GEN-LAST:event_txtPatientNameActionPerformed

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
        current.setOccupation(txtOccupation.getText().replaceAll("'", "''"));
        current.setCnic(txtCnic.getText().replaceAll("'", "''"));
        current.setContactNo(txtContactNo.getText().replaceAll("'", "''"));
        current.setCrtdBy(Constants.userId);
        current.setCrtdTerminalId(Constants.terminalId);
        
//        if (ctlFinan.insertFinance(current)) {
//            txtPatientId.setBackground(new Color(225, 225, 225));
//        } else {
//            JOptionPane.showMessageDialog(null, "Unable To Save Record ! Kindly Contact Administrator");
//        }
     

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtCurrentStatusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCurrentStatusMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurrentStatusMouseReleased

    private void txtCurrentStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrentStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurrentStatusActionPerformed

    private void txtClientMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClientMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientMouseReleased

    private void txtClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientActionPerformed

    private void txtDateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDateMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateMouseReleased

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJobActionPerformed

    private void txtSalaryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalaryMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryMouseReleased

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

    private void txtFinanClientMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFinanClientMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinanClientMouseReleased

    private void txtFinanClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinanClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinanClientActionPerformed

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

    private void txtRemarksMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRemarksMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemarksMouseReleased

    private void txtRemarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemarksActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void txtOccupationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOccupationMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOccupationMouseReleased

    private void txtOccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOccupationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pnlSearchUser7;
    private javax.swing.JPanel pnlUserDetail1;
    private javax.swing.JPanel pnlUserDetail2;
    private javax.swing.JTextField txtChildrens;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtCnic;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtCurrentStatus;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFinanClient;
    private javax.swing.JTextField txtJob;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtRemarks;
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
        if (GUIUtils.completePatientId(txtPatientId.getText().trim())) {
            patientId = (Constants.completePatientId);
            Patient pat = ctlPatient.searchPatient(patientId);
            txtPatientName.setText(pat.getFullName());
            txtClient.setText(pat.getClientDescription());
            txtContactNo.setText(pat.getContactNo());
            txtCurrentStatus.setText(pat.getPatientStatus());
            txtDate.setText(pat.getRegistrationDate());
        }
    }
    
       private void selectPatientInfo() {
        
      List lis = ctlFinan.SearchEmpById(patientId);
      financialObj = (FinancialSupport) lis.get(0);
      txtJob.setText(financialObj.getJob());
      txtSalary.setText(financialObj.getSalary());
      txtCnic.setText(financialObj.getCnic());
      txtChildrens.setText(financialObj.getChildrens());
      txtSalary.setText(financialObj.getSalary());
      txtOccupation.setText(financialObj.getOccupation());
      txtRemarks.setText(financialObj.getRemarks());
     
    }

    

    private void clearForm() {
        Vector<JComponent> comp = new Vector<JComponent>();
        comp.add(txtPatientId);
        comp.add(txtPatientName);
        comp.add(txtContactNo);
        comp.add(txtCurrentStatus);
        comp.add(txtClient);
        comp.add(txtDate);
        comp.add(txtJob);
        comp.add(txtSalary);
        comp.add(txtCnic);
        comp.add(txtChildrens);
        comp.add(txtSalary);
        comp.add(txtRemarks);
      
        GUIUtils.setClear(comp);

    }
}
