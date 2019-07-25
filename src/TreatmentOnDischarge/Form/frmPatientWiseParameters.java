package TreatmentOnDischarge.Form;

import BO.Hospital.ParameterSelectionBO;
import BO.OPD.PatientHospitalVisit;
import TreatmentOnDischarge.Controller.PatientWiseParameterController;
import TreatmentOnDischarge.TableModel.ParameterListTableModel;
import TreatmentOnDischarge.TableModel.SelectedParameterListTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;

public class frmPatientWiseParameters extends javax.swing.JInternalFrame {

    private String patientId = "001001898573";
    private String admissionNumber = "1772227";
    private String parameterId = "";
    private String parameterDescription = "";

    List<PatientHospitalVisit> listParameters = new ArrayList();
    List<PatientHospitalVisit> listSelectedParameters = new ArrayList();
    List<PatientHospitalVisit> listpahtUrineDR = new ArrayList();

    public frmPatientWiseParameters() {
        PatientHospitalVisit objIpdtVisit = new PatientHospitalVisit();
        initComponents();
        this.setSize(Constants.xSize - 80, Constants.ySize - Constants.yExtension + 8);

        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
        btnSave.setMnemonic(KeyEvent.VK_S);
        btnViewReport.setMnemonic(KeyEvent.VK_V);

        setPatientInfo(objIpdtVisit);
        listOfParameters();
        listSelectedParameters = ctlParameter.patientWiseSelectedParameter(patientId,
                admissionNumber);
        setInParameterSelectedTable();
        pathUrineResult();
    }

    PatientHospitalVisit objPatVisit = new PatientHospitalVisit();
    ParameterSelectionBO parameterObj = new ParameterSelectionBO();
    PatientWiseParameterController ctlParameter = new PatientWiseParameterController();
    private DisplayLOV lov = new DisplayLOV();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblParameterList = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        txtParameter = new javax.swing.JTextField();
        chkSelectAll = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAgeGender = new javax.swing.JTextField();
        txtWard = new javax.swing.JTextField();
        txtAdmissionNumber = new javax.swing.JTextField();
        txtBed = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPrimaryPhy = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblSelectedParameter = new javax.swing.JTable();
        chkDeleteAll = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnViewReport = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtUreanDR = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Patient Wise Parameters");
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

        jPanel2.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Performed Parameters", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblParameterList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Sr.", "Parameter Id","Parameter Name", "Unit"
            }
        ));
        tblParameterList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblParameterListMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblParameterListMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblParameterListMouseReleased(evt);
            }
        });
        tblParameterList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblParameterListKeyReleased(evt);
            }
        });
        jScrollPane7.setViewportView(tblParameterList);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Search Parameter : ");

        txtParameter.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtParameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParameterActionPerformed(evt);
            }
        });

        chkSelectAll.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkSelectAll.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkSelectAll.setForeground(new java.awt.Color(102, 0, 0));
        chkSelectAll.setText("Select all");
        chkSelectAll.setBorder(null);
        chkSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSelectAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane7)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtParameter, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkSelectAll, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSelectAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Patient Id : ");

        txtPatientId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPatientIdMouseClicked(evt);
            }
        });
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Admission No : ");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Patient Name : ");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Ward Name : ");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Age Gender : ");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Bed : ");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Primary Phy. : ");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Client name : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtAdmissionNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientName)
                            .addComponent(txtWard))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBed, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(txtAgeGender)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClient)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmissionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        jPanel4.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selected Parameters", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblSelectedParameter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Sr.", "Parameter Id","Parameter Name", "Unit", "Result", "Verified Date"
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
        jScrollPane8.setViewportView(tblSelectedParameter);

        chkDeleteAll.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkDeleteAll.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkDeleteAll.setForeground(new java.awt.Color(102, 0, 0));
        chkDeleteAll.setText("Delete all Parameters");
        chkDeleteAll.setBorder(null);
        chkDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDeleteAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(chkDeleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(chkDeleteAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(51, 102, 0));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(153, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnViewReport.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnViewReport.setText("View Report");
        btnViewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnViewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnClear)
                    .addComponent(btnExit)
                    .addComponent(btnViewReport))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Urine Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtUreanDR.setColumns(20);
        txtUreanDR.setLineWrap(true);
        txtUreanDR.setRows(5);
        jScrollPane1.setViewportView(txtUreanDR);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblParameterListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblParameterListMouseClicked

    }//GEN-LAST:event_tblParameterListMouseClicked

    private void tblParameterListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblParameterListMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblParameterListMousePressed

    private void tblParameterListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblParameterListMouseReleased
        setSeletedParameters();
    }//GEN-LAST:event_tblParameterListMouseReleased

    private void tblParameterListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblParameterListKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblParameterListKeyReleased

    private void tblSelectedParameterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSelectedParameterMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            listSelectedParameters.remove(tblSelectedParameter.getSelectedRow());
            setInParameterSelectedTable();
        }
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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (ctlParameter.insertSelectedParameters(listSelectedParameters, patientId,
                admissionNumber)) {
            JOptionPane.showMessageDialog(null, "Parameter Added Successfully!");

        } else {
            JOptionPane.showMessageDialog(null, "UnAble to save!\n Kindly Contact Administrator.");
        }
        listOfParameters();
        listSelectedParameters = ctlParameter.patientWiseSelectedParameter(
                patientId, admissionNumber);
        setInParameterSelectedTable();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        listParameters.clear();
        listSelectedParameters.clear();
        tblParameterList.setModel(new ParameterListTableModel(listParameters));
        tblSelectedParameter.setModel(new SelectedParameterListTableModel(listSelectedParameters));
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtParameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParameterActionPerformed
        // TODO add your handling code here:

        String query = "SELECT ID,DESCRIPTION FROM "
                + Database.DCMS.CPTParameter
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtParameter.getText().toUpperCase() + "%' AND ACTIVE = 'Y'";

        lov.LOVSelection(query, this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtParameter.setText("");
            return;
        } else {
            txtParameter.setText(Constants.lovDescription.toUpperCase());
            parameterId = Constants.lovID;
            parameterDescription = Constants.lovDescription.toUpperCase();
        }
        txtParameter.requestFocusInWindow();
        txtParameter.moveCaretPosition(0);
        listParameters.clear();
        listOfParameters();
        parameterId = "";
        txtParameter.setText("");
    }//GEN-LAST:event_txtParameterActionPerformed

    private void btnViewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewReportActionPerformed

    private void txtPatientIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPatientIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdMouseClicked

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void chkSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSelectAllActionPerformed
        // TODO add your handling code here:
        if (chkSelectAll.isSelected()) {
            for (int i = 0; i < listParameters.size(); i++) {
                tblParameterList.setValueAt(true, i, 4);
                objPatVisit = listParameters.get(i);
                listSelectedParameters.add(new PatientHospitalVisit(objPatVisit.getCON(),
                        objPatVisit.getODI(), objPatVisit.getPatientId(),
                        objPatVisit.getAdmissionNumber(), objPatVisit.getResultValue(),
                        objPatVisit.getParameterDescription(), objPatVisit.getParameterId(),
                        objPatVisit.getVerifiedtDate()));
            }
            setInParameterSelectedTable();
        }
        if (!chkSelectAll.isSelected()) {
            listOfParameters();
            listSelectedParameters = ctlParameter.patientWiseSelectedParameter(
                    patientId, admissionNumber);
            setInParameterSelectedTable();
        }
    }//GEN-LAST:event_chkSelectAllActionPerformed

    private void chkDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDeleteAllActionPerformed
        // TODO add your handling code here:
        if (chkDeleteAll.isSelected() && !listSelectedParameters.isEmpty()) {
            int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                    + "To Delete all the Parameters.\n Do you want to Delete all the "
                    + "Parameters?");
            if (confirmation != 0) {
                return;
            }
            if (ctlParameter.deleteAllParameters(patientId, admissionNumber)) {
                JOptionPane.showMessageDialog(null, "Parameter Deleted Successfully.");
                listOfParameters();
                listSelectedParameters = ctlParameter.patientWiseSelectedParameter(
                        patientId, admissionNumber);
                setInParameterSelectedTable();
                chkDeleteAll.setSelected(false);
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Deleted. Kindly contact "
                        + "Administrator.");
            }
        }
    }//GEN-LAST:event_chkDeleteAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnViewReport;
    private javax.swing.JCheckBox chkDeleteAll;
    private javax.swing.JCheckBox chkSelectAll;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblParameterList;
    private javax.swing.JTable tblSelectedParameter;
    private javax.swing.JTextField txtAdmissionNumber;
    private javax.swing.JTextField txtAgeGender;
    private javax.swing.JTextField txtBed;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtParameter;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPrimaryPhy;
    private javax.swing.JTextArea txtUreanDR;
    private javax.swing.JTextField txtWard;
    // End of variables declaration//GEN-END:variables

    private void listOfParameters() {
        System.err.println("\n bfore clr : " + listParameters.size());
        listParameters.clear();
        System.err.println("\n afterv clr: " + listParameters.size());
        listParameters = ctlParameter.selectPatientPerformedParameters(patientId,
                admissionNumber, parameterId);
        
        if (chkSelectAll.isSelected()) {

        }
        tblParameterList.setModel(new ParameterListTableModel(listParameters));
        ListSelectionModel selectionModel = tblParameterList.getSelectionModel();
        tblParameterList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setParameterListColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblParameterList);
    }

    private void setParameterListColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblParameterList.getColumnCount(); i++) {
            column = tblParameterList.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(90);
            } else if (i == 3) {
                column.setPreferredWidth(30);
            } else if (i == 4) {
                column.setPreferredWidth(20);
            }
        }
    }

    private void setInParameterSelectedTable() {
        tblSelectedParameter.setModel(new SelectedParameterListTableModel(listSelectedParameters));
        ListSelectionModel selectionModel = tblSelectedParameter.getSelectionModel();
        tblSelectedParameter.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setSelectedParameterColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblSelectedParameter);
    }

    private void setSelectedParameterColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblSelectedParameter.getColumnCount(); i++) {
            column = tblSelectedParameter.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(90);
            } else if (i == 3) {
                column.setPreferredWidth(20);
            }
        }
    }

    private void setSeletedParameters() {
        objPatVisit = listParameters.get(tblParameterList.getSelectedRow());
        tblParameterList.getValueAt(tblParameterList.getSelectedRow(), 4).equals(true);
        if (tblParameterList.getValueAt(tblParameterList.getSelectedRow(), 4).equals(true)) {
            for (int i = 0; i < listSelectedParameters.size(); i++) {
                PatientHospitalVisit chkParameter = new PatientHospitalVisit();
                chkParameter = listSelectedParameters.get(i);
                if (objPatVisit.getParameterId() == chkParameter.getParameterId()) {
                    JOptionPane.showMessageDialog(null, "This PArameter has added!");
                    return;
                }
            }
            listSelectedParameters.add(new PatientHospitalVisit(objPatVisit.getCON(),
                    objPatVisit.getODI(), objPatVisit.getPatientId(),
                    objPatVisit.getAdmissionNumber(), objPatVisit.getResultValue(),
                    objPatVisit.getParameterDescription(), objPatVisit.getParameterId(),
                    objPatVisit.getVerifiedtDate()));
            setInParameterSelectedTable();
        }
        if (tblParameterList.getValueAt(tblParameterList.getSelectedRow(), 4).equals(false)) {
            objPatVisit.getParameterId();
            for (int i = 0; i < listSelectedParameters.size(); i++) {
                PatientHospitalVisit chkParameter = new PatientHospitalVisit();
                chkParameter = listSelectedParameters.get(i);
                if (objPatVisit.getParameterId() == chkParameter.getParameterId()) {
                    listSelectedParameters.remove(i);
                    setInParameterSelectedTable();
                }
            }
        }

    }

    private void setPatientInfo(PatientHospitalVisit objIpdtVisit) {
        txtPatientId.setText(objIpdtVisit.getPatientId());
        txtPatientName.setText(objIpdtVisit.getPatientName());
        txtAgeGender.setText(objIpdtVisit.getAge() + "/ " + objIpdtVisit.getGender());
        txtWard.setText(objIpdtVisit.getWardDescription());
        txtBed.setText(objIpdtVisit.getBedDescription());
        txtAdmissionNumber.setText(objIpdtVisit.getAdmissionNumber());
        txtClient.setText(objIpdtVisit.getClientName());
        txtPrimaryPhy.setText(objIpdtVisit.getPrimaryPhysicianName());
    }

    private void pathUrineResult() {
        listpahtUrineDR = ctlParameter.pathUrineDR(patientId, admissionNumber);
        objPatVisit = new PatientHospitalVisit();
        objPatVisit = listpahtUrineDR.get(0);
        String result = " COLOR:  " + objPatVisit.getColor() + "                   "
                + " APPEARANCE:  " + objPatVisit.getAppearance() + "                   "
                + " PH: " + objPatVisit.getpH() + "                                   "
                + " SPECIFIC GRAVITY:  " + objPatVisit.getSpecificGravity() + "            "
                + " PROTEIN:  " + objPatVisit.getProtein() + "            \n"
                + " GLUCOSE:  " + objPatVisit.getGlucose() + "         "
                + " ACETONE:  " + objPatVisit.getAcetone() + "                    "
                + " BILE PIGMENT:  " + objPatVisit.getBilePigment() + "      "
                + " BLOOD:  " + objPatVisit.getBlood() + "                         "
                + " UROBILINOGEN:  " + objPatVisit.getUrobilinogen() + "           \n"
                + " NITRITE:  " + objPatVisit.getNitrite() + "             "
                + " PUS CELL:  " + objPatVisit.getPusCell() + "                             "
                + " RED CELL:  " + objPatVisit.getRedCell() + "                         "
                + " CAST DR:  " + objPatVisit.getCastDr() + "                                 "
                + " BACTERIA:  " + objPatVisit.getBacteria() + "          \n"
                + " EPITHELIEL CELL:  " + objPatVisit.getEpithelielCell() + "    "
                + " CRYSTAL:  " + objPatVisit.getCrystal() + "                                            "
                + " YEAST:  " + objPatVisit.getYeast() + "                                     "
                + " MUCUS:  " + objPatVisit.getMucus();
        txtUreanDR.setEditable(false);
        txtUreanDR.setText(result);
    }

}
