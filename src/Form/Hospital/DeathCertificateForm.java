package Form.Hospital;

import BO.Hospital.DeathCertificate;
import BO.Hospital.DischargePatientDetail;
import BO.Hospital.PatientAdmission;
import BO.Hospital.DischargePatient;
import Controller.Hospital.DeathCertificateController;
import Controller.Hospital.PatientDischargeController;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.*;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.GUIUtils;
import utilities.PrintJasperReport;
import utilities.Reports;
import utilities.Status;

public class DeathCertificateForm extends javax.swing.JInternalFrame {

    private DisplayLOV lov = new DisplayLOV();

    DischargePatient patientDischarge = new DischargePatient();
    DischargePatientDetail patientDischargeDetail = new DischargePatientDetail();
    PatientAdmission admission = new PatientAdmission();
    DeathCertificateController ctlDc = new DeathCertificateController();

    PatientDischargeController ctlPatDischarge = new PatientDischargeController();

    private List<DischargePatientDetail> listAddCptDetail = new ArrayList<>(0);
    private List<DischargePatientDetail> listAddItemDetail = new ArrayList<>(0);
    InPatientWardServices inpatient = new InPatientWardServices();
    private int currentCpt = -1;
    private int currentItem = -1;
    private String cptItemId = "";
    private String cptItemDescription = "";
    //private String DischargeTypeId;
    private String DischargeType;
    private String DiagnosisId;
    private String DiagnosisName;
    private String religionId;
    private String nationalityId;
    private String physicianId;
    private String admisNo;
    private String relationId;

    public DeathCertificateForm(PatientAdmission admission, InPatientWardServices inpatient) {

        this.inpatient = inpatient;
        this.admission = admission;
        inititalizeForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCPTTable = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        txtDischargeType = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDeathCause = new javax.swing.JTextArea();
        jLabel46 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtDiagnosis = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtSummary = new javax.swing.JTextArea();
        txtFinalDiagnosis = new javax.swing.JTextField();
        pnlAdd = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnDischarge = new javax.swing.JButton();
        btnSearchIcdCode = new javax.swing.JButton();
        btnSaveCertificate = new javax.swing.JButton();
        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        pnlCPTTable3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtSearchPatientId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtReligion = new javax.swing.JTextField();
        txtFatherName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtOccupation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHusbandName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtNationality = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCNIC = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAddress = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtRelation = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtAgeAtDeath = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtIssueDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel13 = new javax.swing.JLabel();
        txtReceivedBy = new javax.swing.JTextField();
        chkAutopsy = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        txtReceiverContactNo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Discharge Patient");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1200, 750));

        pnlCPTTable.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlCPTTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Discharge Detail ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlCPTTable.setAutoscrolls(true);

        jLabel45.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 0, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Discharge Type:");

        txtDischargeType.setEditable(false);
        txtDischargeType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDischargeType.setToolTipText("DD-MON-YY");
        txtDischargeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDischargeTypeActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Death Reason", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtDeathCause.setColumns(20);
        txtDeathCause.setRows(5);
        jScrollPane2.setViewportView(txtDeathCause);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
        );

        jLabel46.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 0, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText(" Diagnosis:");

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diagnosis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtDiagnosis.setColumns(20);
        txtDiagnosis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDiagnosis.setLineWrap(true);
        txtDiagnosis.setRows(5);
        txtDiagnosis.setWrapStyleWord(true);
        txtDiagnosis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiagnosisKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(txtDiagnosis);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Summary Of The Case", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtSummary.setColumns(20);
        txtSummary.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSummary.setLineWrap(true);
        txtSummary.setRows(5);
        txtSummary.setWrapStyleWord(true);
        txtSummary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSummaryKeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(txtSummary);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );

        txtFinalDiagnosis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFinalDiagnosis.setToolTipText("DD-MON-YY");
        txtFinalDiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalDiagnosisActionPerformed(evt);
            }
        });
        txtFinalDiagnosis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFinalDiagnosisKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFinalDiagnosisKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlCPTTableLayout = new javax.swing.GroupLayout(pnlCPTTable);
        pnlCPTTable.setLayout(pnlCPTTableLayout);
        pnlCPTTableLayout.setHorizontalGroup(
            pnlCPTTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCPTTableLayout.createSequentialGroup()
                .addGroup(pnlCPTTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCPTTableLayout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFinalDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDischargeType, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        pnlCPTTableLayout.setVerticalGroup(
            pnlCPTTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCPTTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCPTTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDischargeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46)
                    .addComponent(txtFinalDiagnosis))
                .addGap(8, 8, 8)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlAdd.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlAdd.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(102, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDischarge.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDischarge.setText("Discharge");
        btnDischarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDischargeActionPerformed(evt);
            }
        });

        btnSearchIcdCode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSearchIcdCode.setText("Search ICD");
        btnSearchIcdCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIcdCodeActionPerformed(evt);
            }
        });

        btnSaveCertificate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSaveCertificate.setText("Save");
        btnSaveCertificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCertificateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddLayout = new javax.swing.GroupLayout(pnlAdd);
        pnlAdd.setLayout(pnlAddLayout);
        pnlAddLayout.setHorizontalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnSearchIcdCode, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnSaveCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDischarge, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAddLayout.setVerticalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExit)
                .addComponent(btnDischarge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnSearchIcdCode)
                .addComponent(btnSaveCertificate))
        );

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
                .addContainerGap()
                .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPLLayout.createSequentialGroup()
                .addComponent(lblPacsLink)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel43.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 0, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Patient Id:");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel44.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Ward:");

        txtPatientId.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtPatientId.setToolTipText("DD-MON-YY");
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 0, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Name:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pnlCPTTable3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlCPTTable3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Certificate Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlCPTTable3.setAutoscrolls(true);

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        jLabel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Contact No:");

        txtContactNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Patient Id:");

        txtSearchPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPatientIdActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");

        txtFullName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Religion:");

        txtReligion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReligionActionPerformed(evt);
            }
        });

        txtFatherName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFatherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFatherNameActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("  Occupation:");

        txtOccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOccupationActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Gender:");

        jLabel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Age:");

        jLabel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Father Name:");

        txtHusbandName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHusbandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHusbandNameActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Spouse Name:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHusbandName))
                    .addComponent(txtFullName)
                    .addComponent(txtOccupation)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtReligion, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContactNo))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSearchPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReligion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHusbandName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel15.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Nationality :");

        txtNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNationalityActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("C.N.I.C:");

        txtCNIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNICActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Present Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtAreaAddress.setColumns(20);
        txtAreaAddress.setRows(5);
        jScrollPane1.setViewportView(txtAreaAddress);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCNIC))
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel22.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Location:");

        txtLocation.setEditable(false);
        txtLocation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Relation:");

        txtRelation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRelationActionPerformed(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Age At Death:");

        txtAgeAtDeath.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAgeAtDeath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeAtDeathActionPerformed(evt);
            }
        });
        txtAgeAtDeath.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeAtDeathKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeAtDeathKeyTyped(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Issue Date:");

        txtIssueDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIssueDateActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Contact No:");

        txtReceivedBy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtReceivedBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReceivedByActionPerformed(evt);
            }
        });

        chkAutopsy.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkAutopsy.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkAutopsy.setText("Autopsy");
        chkAutopsy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAutopsyActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Received By:");

        txtReceiverContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReceiverContactNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIssueDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAgeAtDeath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReceiverContactNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkAutopsy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtRelation)
                            .addComponent(txtReceivedBy))
                        .addGap(21, 21, 21))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgeAtDeath, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAutopsy, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(txtIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRelation)))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtReceivedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtReceiverContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout pnlCPTTable3Layout = new javax.swing.GroupLayout(pnlCPTTable3);
        pnlCPTTable3.setLayout(pnlCPTTable3Layout);
        pnlCPTTable3Layout.setHorizontalGroup(
            pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCPTTable3Layout.createSequentialGroup()
                .addGroup(pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        pnlCPTTable3Layout.setVerticalGroup(
            pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCPTTable3Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCPTTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlCPTTable3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCPTTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCPTTable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(pnlAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        objSave.setPatientId(admission.getPatientId());
        objSave.setOccupation(txtOccupation.getText());
        objSave.setAgeAtDeath(txtAgeAtDeath.getText());
        if (chkAutopsy.isSelected() == true) {
            objSave.setAutopsy("Y");
        } else {
            objSave.setAutopsy("N");
        }
        objSave.setCnic(txtCNIC.getText().trim());
        objSave.setOrderStatusId(Status.ordered);
        objSave.setDeathCause(txtDeathCause.getText().trim());
        objSave.setReceivedBy(txtReceivedBy.getText().trim());
        objSave.setRelation(txtRelation.getText().trim());
        objSave.setPhysician(admission.getPrimaryPhysicianName());
        objSave.setNationalityId(nationalityId.trim());
        objSave.setIssueDate(date);
        objSave.setFatherName(txtFatherName.getText().trim());
        objSave.setCnic(txtCNIC.getText().trim());
        objSave.setPresentAddress(txtAreaAddress.getText().trim());
        objSave.setDiagnosis(txtDiagnosis.getText().trim());
        objSave.setCaseSummary(txtSummary.getText().trim());
        objSave.setSpouseName(txtHusbandName.getText().trim());
        admisNo = admission.getAdmissionNo();
        ctlDc.updateSaveDeathCertificate(admisNo, objSave);
        this.dispose();


}//GEN-LAST:event_btnExitActionPerformed

    /**
     * Select the Stores from @Table(StoreWiseUsers) Against the User Login ID
     *
     * @param evt
     */
    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed

        if (txtPatientId.getText().length() == 0) {
            txtPatientId.requestFocusInWindow();
            txtPatientId.setCaretPosition(0);
            JOptionPane.showMessageDialog(null, "Enter correct PatientId", "Patient Discharge",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        //select the item based on user search.

    }//GEN-LAST:event_txtPatientNameActionPerformed

    /**
     * Save the IssueRequest Master and Detail to the
     *
     * @Table(issue_request_master),@Table(issue_request_detail)
     *
     * @param evt
     */
    private void btnDischargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDischargeActionPerformed

        objSave.setPatientId(admission.getPatientId());
        objSave.setOccupation(txtOccupation.getText());
        objSave.setAgeAtDeath(txtAgeAtDeath.getText());
        objSave.setAutopsy(chkAutopsy.getText());
        objSave.setCnic(txtCNIC.getText());
        objSave.setDeathCause(txtDeathCause.getText());
        objSave.setReceivedBy(txtReceivedBy.getText());
        objSave.setRelation(txtRelation.getText());
        objSave.setPhysicianId(admission.getPrimaryPhysicianId());
        objSave.setPhysician(admission.getPrimaryPhysicianName());
        objSave.setNationalityId(nationalityId);
        objSave.setIssueDate(date);
        objSave.setFatherName(txtFatherName.getText());
        objSave.setCnic(txtCNIC.getText());
        objSave.setPresentAddress(txtAreaAddress.getText());
        objSave.setOrderStatusId(Status.Approved);
        objSave.setDiagnosis(txtDiagnosis.getText());
        objSave.setCaseSummary(txtSummary.getText());
        objSave.setSpouseName(txtHusbandName.getText());

        if (physicianId.length() == 0 || physicianId.equalsIgnoreCase("GENERAL")) {
            JOptionPane.showMessageDialog(null, "Kindly Select Physician In Order To Proceed");
            return;
        }

        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Dischage Patient with Death Certificate.");
        if (confirmation != 0) {
            return;
        }
        patientDischarge = ctlPatDischarge.searchPatientAdmitted(admission.getAdmissionNo());
        patientDischarge.setDiagnosisName(txtDiagnosis.getText().trim());
        patientDischarge.setSummary(txtSummary.getText().trim());
        if (ctlDc.updateApproveDeathCertificate(objSave, patientDischarge, admission)) {

            JOptionPane.showMessageDialog(null, "Death Certificate Final Signed Successfully");
            printDeathCertificateNote();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Final Sign ! Kindly contact administrator");
        }


    }//GEN-LAST:event_btnDischargeActionPerformed


    private void txtDischargeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDischargeTypeActionPerformed
        // TODO add your handling code here:

        lov.LOVDefinitionSelection(DefinitionTypes.dischargeStatus, txtDischargeType.getText(), this);
        txtDischargeType.setText("");
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtDischargeType.setText(Constants.lovDescription.toUpperCase());
            patientDischarge.setDischargeTypeId(Constants.lovID);
            DischargeType = Constants.lovDescription.toUpperCase();
        }
        txtFinalDiagnosis.requestFocusInWindow();
        txtFinalDiagnosis.moveCaretPosition(0);


    }//GEN-LAST:event_txtDischargeTypeActionPerformed

    private void txtFinalDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalDiagnosisActionPerformed
        // TODO add your handling code here:

//        lov.LOVDefinitionSelection(DefinitionTypes.diagnosis,
//                txtFinalDiagnosis.getText(), this);
//        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
//            txtFinalDiagnosis.setText(Constants.lovDescription.toUpperCase());
//            txtDiagnosis.setText(txtDiagnosis.getText() + "\n"
//                    + Constants.lovDescription);
//        }
//        txtFinalDiagnosis.setText("");

    }//GEN-LAST:event_txtFinalDiagnosisActionPerformed

    private void btnSearchIcdCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIcdCodeActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchIcdCodeActionPerformed

    private void txtFinalDiagnosisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFinalDiagnosisKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFinalDiagnosisKeyPressed

    private void txtFinalDiagnosisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFinalDiagnosisKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ALT) {

            txtSummary.requestFocusInWindow();
            txtSummary.setCaretPosition(0);
        }

    }//GEN-LAST:event_txtFinalDiagnosisKeyReleased

    private void txtSummaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSummaryKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ALT) {
            txtDiagnosis.requestFocusInWindow();
            txtDiagnosis.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtSummaryKeyReleased

    private void txtDiagnosisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiagnosisKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDiagnosisKeyReleased

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        txtGender.requestFocusInWindow();
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed

        txtFullName.requestFocusInWindow();
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtGenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderKeyPressed

    private void txtGenderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderKeyTyped

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed

        txtOccupation.requestFocusInWindow();

    }//GEN-LAST:event_txtContactNoActionPerformed

    private void txtSearchPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPatientIdActionPerformed

        txtAge.requestFocusInWindow();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPatientIdActionPerformed

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        txtReligion.requestFocusInWindow();
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void txtReligionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReligionActionPerformed

        Constants.lovID = "ID";
        Constants.lovDescription = "DESCRIPTION";
        lov.LOVDefinitionSelection(DefinitionTypes.religion, txtReligion.getText(), this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtAgeAtDeath.setText("");
        } else {
            txtReligion.setText(Constants.lovDescription.toUpperCase());
            religionId = Constants.lovID;
        }
        txtContactNo.requestFocusInWindow();

        // TODO add your handling code here:
    }//GEN-LAST:event_txtReligionActionPerformed

    private void txtFatherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFatherNameActionPerformed

        txtFatherName.setCaretPosition(0);
        txtHusbandName.requestFocusInWindow();
    }//GEN-LAST:event_txtFatherNameActionPerformed

    private void txtOccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOccupationActionPerformed

        txtOccupation.setCaretPosition(0);
        txtFatherName.setText(txtOccupation.getText().trim());

        // TODO add your handling code here:
    }//GEN-LAST:event_txtOccupationActionPerformed

    private void txtNationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNationalityActionPerformed

        String query
                = "  SELECT COUNTRY_ID ID, COUNTRY_NAME DESCRIPTION FROM   \n"
                + Database.DCMS.country + "                                \n"
                + " WHERE UPPER(COUNTRY_NAME)                              \n"
                + " LIKE ('%"
                + txtNationality.getText().toUpperCase().trim() + "%')     \n";
        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        nationalityId = Constants.lovID;
        txtNationality.setText(Constants.lovDescription);
        txtCNIC.requestFocusInWindow();

    }//GEN-LAST:event_txtNationalityActionPerformed

    private void txtCNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNICActionPerformed

        txtAreaAddress.requestFocusInWindow();

        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNICActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed

        Constants.lovID = "ID";
        Constants.lovDescription = "DESCRIPTION";
        lov.LOVGeneralSelection(Database.DCMS.location, txtLocation.getText(), this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            JOptionPane.showMessageDialog(null, "No Data Found");
            txtLocation.setText("");
        } else {
            txtLocation.setText(Constants.lovDescription.toUpperCase());
        }
        txtIssueDate.requestFocusInWindow();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtRelationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRelationActionPerformed

        txtRelation.setCaretPosition(0);
        String query = "SELECT ID , DESCRIPTION  FROM  \n"
                + Database.DCMS.definitionTypeDetail
                + " WHERE UPPER(DESCRIPTION) LIKE '%" + txtRelation.getText().toUpperCase() + "%'"
                + " AND DEF_TYPE_ID = " + DefinitionTypes.relation + "     \n";
        lov.LOVSelection(query, this);
        relationId = "";
        if (!Constants.lovID.equalsIgnoreCase("ID")) {

            relationId = Constants.lovID;
            txtRelation.setText(Constants.lovDescription.toUpperCase());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtRelationActionPerformed

    private void txtAgeAtDeathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeAtDeathActionPerformed

        
        
        txtLocation.requestFocusInWindow();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeAtDeathActionPerformed

    private void txtAgeAtDeathKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeAtDeathKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeAtDeathKeyPressed

    private void txtAgeAtDeathKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeAtDeathKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeAtDeathKeyTyped

    String date = "";
    private void txtIssueDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIssueDateActionPerformed

        if (txtIssueDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the From Date 22-DEC-1990",
                    "Set Death Certificate Issue Date", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        date = dateFormat.format(txtIssueDate.getDate());
        txtReceivedBy.requestFocusInWindow();
    }//GEN-LAST:event_txtIssueDateActionPerformed

    private void txtReceivedByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReceivedByActionPerformed

        txtReceivedBy.setCaretPosition(0);

        Constants.lovID = "ID";
        Constants.lovDescription = "DESCRIPTION";
        lov.LOVGeneralSelection(Database.DCMS.city, txtReceivedBy.getText(), this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            JOptionPane.showMessageDialog(null, "No Data Found");
            txtReceivedBy.setText("");
        } else {
            txtReceivedBy.setText(Constants.lovDescription.toUpperCase());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtReceivedByActionPerformed

    private void chkAutopsyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAutopsyActionPerformed

    }//GEN-LAST:event_chkAutopsyActionPerformed

    private void btnSaveCertificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCertificateActionPerformed

        objSave.setPatientId(admission.getPatientId());
        objSave.setOccupation(txtOccupation.getText());
        objSave.setAgeAtDeath(txtAgeAtDeath.getText());
        if (chkAutopsy.isSelected() == true) {
            objSave.setAutopsy("Y");
        } else {
            objSave.setAutopsy("N");
        }
        objSave.setCnic(txtCNIC.getText());
        objSave.setOrderStatusId(Status.ordered);
        objSave.setDeathCause(txtDeathCause.getText());
        objSave.setReceivedBy(txtReceivedBy.getText());
        objSave.setRelation(txtRelation.getText());
        objSave.setPhysician(admission.getPrimaryPhysicianName());
        objSave.setNationalityId(nationalityId);
        objSave.setIssueDate(date);
        objSave.setFatherName(txtFatherName.getText());
        objSave.setCnic(txtCNIC.getText());
        objSave.setPresentAddress(txtAreaAddress.getText());
        objSave.setDiagnosis(txtDiagnosis.getText());
        objSave.setCaseSummary(txtSummary.getText());
        objSave.setSpouseName(txtHusbandName.getText());
        admisNo = admission.getAdmissionNo();
        if (ctlDc.updateSaveDeathCertificate(admisNo, objSave)) {
            JOptionPane.showMessageDialog(null, "Record Saved Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save ! Kindly contact administrator");
        }

    }//GEN-LAST:event_btnSaveCertificateActionPerformed

    private void txtHusbandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHusbandNameActionPerformed
        txtHusbandName.setCaretPosition(0);
        txtNationality.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_txtHusbandNameActionPerformed

    private void txtReceiverContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReceiverContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReceiverContactNoActionPerformed

    /**
     * *
     * Search Records According the Given Credentials
     */
    public void clearForm() {

        List<JComponent> compLi = new ArrayList<>();

        compLi.add(txtPatientId);
//        compLi.add(txtBedNo);
//        compLi.add(txtPatientName);
//        compLi.add(txtPrimaryPhysician);
        compLi.add(txtDischargeType);
        compLi.add(txtFinalDiagnosis);
        compLi.add(txtSearchPatientId);
        compLi.add(txtAge);
        compLi.add(txtGender);
        compLi.add(txtDiagnosis);
        compLi.add(txtSummary);
        compLi.add(txtCNIC);
        compLi.add(txtContactNo);
        compLi.add(txtHusbandName);
        compLi.add(txtIssueDate);
        compLi.add(txtNationality);
        compLi.add(txtLocation);
        compLi.add(txtAgeAtDeath);
        compLi.add(txtReceivedBy);
        compLi.add(txtRelation);
        compLi.add(txtAreaAddress);

        GUIUtils.setClear(compLi);
        txtDiagnosis.setText("");
        txtSummary.setText("");

    }

    public void setTablesColumnsWidths() {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDischarge;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSaveCertificate;
    private javax.swing.JButton btnSearchIcdCode;
    private javax.swing.JCheckBox chkAutopsy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JPanel pnlCPTTable;
    private javax.swing.JPanel pnlCPTTable3;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAgeAtDeath;
    private javax.swing.JTextArea txtAreaAddress;
    private javax.swing.JTextField txtCNIC;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextArea txtDeathCause;
    private javax.swing.JTextArea txtDiagnosis;
    private javax.swing.JTextField txtDischargeType;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtFinalDiagnosis;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHusbandName;
    private org.jdesktop.swingx.JXDatePicker txtIssueDate;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtReceivedBy;
    private javax.swing.JTextField txtReceiverContactNo;
    private javax.swing.JTextField txtRelation;
    private javax.swing.JTextField txtReligion;
    private javax.swing.JTextField txtSearchPatientId;
    private javax.swing.JTextArea txtSummary;
    // End of variables declaration//GEN-END:variables

    /**
     * Print the Discharge
     *
     * @param admissionNo
     */
    DeathCertificate objSave = new DeathCertificate();
    PatientAdmission obj = new PatientAdmission();
    List<DeathCertificate> listDC = new ArrayList<>();
    List<DischargePatient> listPA = new ArrayList<>();

    public void printDischargeNote(String admissionNo) {
        PrintJasperReport print = new PrintJasperReport();
        BO.Reports report = print.getReportPath(Reports.Hospital.dischargePatient);
        if (report.getReportPath() == null || report.getReportPath().length() == 0) {
            return;
        }
        HashMap hm = new HashMap();
//        hm.put("admissionNo", patientDischarge.getAdmissionNo());
        hm.put("user", Constants.userId);
        hm.put("reportTitle", "Admitted Patient List");
        hm.put("userLocationId", Constants.userLocationId);
        hm.put("SUBREPORT_DIR", report.getReportPath());
        print.printReport(report.getReportPath() + report.getReportName(),
                Constants.outReportPath + "", "VIEW", hm);
    }

    private void selectDeathPatientInfo(String patId) {

        listDC = ctlDc.selectDeathPatientInfo(patId);
        if (listDC.isEmpty()) {
            DeathCertificate dc
                    = new DeathCertificate();

            List list = new ArrayList();
            listDC.add(dc);
        }
        DeathCertificate obj = new DeathCertificate();
        obj = listDC.get(0);

        txtSearchPatientId.setText(admission.getPatientId().substring(3));
        txtReligion.setText(obj.getReligion());
        txtFullName.setText(obj.getPatientName());
        txtAgeAtDeath.setText(obj.getAgeAtDeath());
        txtDeathCause.setText(obj.getDeathCause());
        txtGender.setText(obj.getGender());
        txtAge.setText(obj.getAge());
        txtReceivedBy.setText(obj.getReceivedBy());
        txtRelation.setText(obj.getRelation());
        txtReligion.setText(obj.getReligion());
        txtOccupation.setText(obj.getOccupation());
        txtFatherName.setText(obj.getFatherName());
        txtAreaAddress.setText(obj.getPresentAddress());
        txtContactNo.setText(obj.getContactNo());
        txtCNIC.setText(obj.getCnic());
        txtHusbandName.setText(obj.getSpouseName());
        txtLocation.setText(obj.getLocation());
        txtSummary.setText(obj.getCaseSummary());

        txtNationality.setText(obj.getNationality());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        try {
            txtIssueDate.setDate(dateFormat.parse(obj.getIssueDate()));
        } catch (ParseException ex) {

        }
        date = obj.getIssueDate();
        physicianId = obj.getPhysicianId();
        nationalityId = obj.getNationalityId();
        chkAutopsy.setSelected(false);
        if (obj.getAutopsy().equalsIgnoreCase("Y")) {
            chkAutopsy.setSelected(true);
        }

    }

    public void updatePatientDischarge(DischargePatient patientDischarge) {

        if (ctlPatDischarge.saveDischargeComments(patientDischarge, "Y", admission)) {
            JOptionPane.showMessageDialog(null, "Patient Discharge Certification Saved SuccessFully ");
            clearForm();
        } else {
            JOptionPane.showMessageDialog(null, "Unable To Discharge Patient ,Kindly Contact Administrator");
        }
    }

    private void selectDischargeInformation(String admissionNo) {

        patientDischarge = ctlPatDischarge.searchPatientAdmitted(admissionNo);

        if (patientDischarge == null) {
            JOptionPane.showMessageDialog(null, "Enter correct Patient Id", "Patient Discharge",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        txtPatientName.setText(patientDischarge.getFullName());
//        txtBedNo.setText(patientDischarge.getBedDescription());
//        txtWard.setText(admission.getWardDescription());
//        txtPrimaryPhysician.setText(admission.getPrimaryPhysicianName());
        txtDischargeType.setText(patientDischarge.getDischargeType());
        txtSummary.setText(patientDischarge.getSummary());
        txtDiagnosis.setText(patientDischarge.getDiagnosisName());

        listAddCptDetail = ctlPatDischarge.searchDetailDischargeCpt(patientDischarge.getAdmissionNo());

        txtDischargeType.requestFocusInWindow();
        txtDischargeType.moveCaretPosition(0);
    }

    private void inititalizeForm() {
        initComponents();
        this.setSize(1290, 770);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnDischarge.setMnemonic(KeyEvent.VK_S);

        txtPatientId.setText(admission.getPatientId().substring(3));
        btnDischarge.setEnabled(true);
        txtPatientId.requestFocusInWindow();
        txtPatientId.moveCaretPosition(0);
        txtSearchPatientId.setText(admission.getPatientId());
        txtAge.setText(admission.getAge());
        txtGender.setText(admission.getGenderDescription());
        txtPatientId.setText(admission.getPatientId());
        txtPatientName.setText(admission.getFullName());
//        txtWard.setText(admission.getWardDescription());
//        txtBedNo.setText(admission.getBedDescription());
//        txtPrimaryPhysician.setText(admission.getPrimaryPhysicianName());
        selectDeathPatientInfo(admission.getPatientId());
        selectPatientDiagnosis(admission.getAdmissionNo());

    }

    private void selectPatientDiagnosis(String admissionNo) {

        listPA = ctlDc.selectPatientDiagnosis(admissionNo);
        if (listPA.isEmpty()) {
            DischargePatient dc
                    = new DischargePatient();
            listPA.add(dc);

        }
        DischargePatient obj = listPA.get(0);
        txtDiagnosis.setText(obj.getDiagnosisDescription());
        txtSummary.setText(obj.getSummary());

    }

    public void printDeathCertificateNote() {
        PrintJasperReport print = new PrintJasperReport();
        BO.Reports report = print.getReportPath(Reports.Hospital.deathCertificate);
        if (report.getReportPath() == null || report.getReportPath().length() == 0) {
            return;
        }
        HashMap hm = new HashMap();
        hm.put("compelteOrderNo", admission.getCompleteOrderNo());
        hm.put("orderDetailId", admission.getOrderDetailId());
        hm.put("user", Constants.userId);

        hm.put("userLocationId", Constants.userLocationId);
        hm.put("SUBREPORT_DIR", report.getReportPath());
        print.printReport(report.getReportPath() + report.getReportName(),
                Constants.outReportPath + "", "VIEW", hm);
    }
}
