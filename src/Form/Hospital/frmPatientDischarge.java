package Form.Hospital;

import BO.Hospital.DischargePatient;
import BO.Hospital.DischargePatientDetail;
import BO.Hospital.PatientAdmission;
import Controller.Hospital.PatientDischargeController;
import TableModel.Hospital.cptDischargeTableModel;
import TableModel.Hospital.itemDischargeTableModel;
import java.awt.event.KeyEvent;
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
import utilities.TypeDetailId;

public class frmPatientDischarge extends javax.swing.JInternalFrame {

    private DisplayLOV lov = new DisplayLOV();
        DischargePatient patientDischarge = new DischargePatient();
    DischargePatientDetail patientDischargeDetail = new DischargePatientDetail();
    PatientAdmission admission = new PatientAdmission();
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

//Managed Beans<BO>
    //List of BO
    //Controller
    public frmPatientDischarge(PatientAdmission admission, InPatientWardServices inpatient) {
        this.admission = admission;
        this.inpatient = inpatient;
        initComponents();
        this.setSize(1130, 730);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnDischarge.setMnemonic(KeyEvent.VK_S);
//        btnPrint.setMnemonic(KeyEvent.VK_P);
        btnClear.setMnemonic(KeyEvent.VK_C);
        btnAddCpt.setMnemonic(KeyEvent.VK_A);
        btnAddItem.setMnemonic(KeyEvent.VK_D);
        btnDelCpt.setMnemonic(KeyEvent.VK_E);
        btnDelItem.setMnemonic(KeyEvent.VK_T);
        btnSaveComments.setMnemonic(KeyEvent.VK_V);
        txtPatientId.setText(admission.getPatientId().substring(3));
        selectDischargeInformation(admission.getAdmissionNo());
        //un comment it
        btnSaveComments.setEnabled(true);
        btnDischarge.setEnabled(true);
 
        txtPatientId.requestFocusInWindow();
        txtPatientId.moveCaretPosition(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCPTTable = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        txtDischargeType = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAreaAdvice = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtAreaNextVisit = new javax.swing.JTextArea();
        jLabel46 = new javax.swing.JLabel();
        txtFinalDiagnosis = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaDiagnosis = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaSummary = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAreaInvestigations = new javax.swing.JTextArea();
        pnlAdd = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDischarge = new javax.swing.JButton();
        btnSearchIcdCode = new javax.swing.JButton();
        btnSaveComments = new javax.swing.JButton();
        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        txtBedNo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtPrimaryPhysician = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtWard = new javax.swing.JTextField();
        pnlCPTTable3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAddCpt = new javax.swing.JTable();
        jLabel49 = new javax.swing.JLabel();
        txtCpt = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtClinicalQuery = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtRemarks = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAddItems = new javax.swing.JTable();
        btnDelCpt = new javax.swing.JButton();
        btnDelItem = new javax.swing.JButton();
        btnAddCpt = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Discharge Patient");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1150, 750));

        pnlCPTTable.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlCPTTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Discharge Detail ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlCPTTable.setAutoscrolls(true);

        jLabel45.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 0, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Discharge Type:");

        txtDischargeType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDischargeType.setToolTipText("DD-MON-YY");
        txtDischargeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDischargeTypeActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Advice & Treatment On Discharge", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtAreaAdvice.setColumns(20);
        txtAreaAdvice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAreaAdvice.setLineWrap(true);
        txtAreaAdvice.setRows(5);
        txtAreaAdvice.setWrapStyleWord(true);
        txtAreaAdvice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAreaAdviceKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(txtAreaAdvice);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Next Visit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtAreaNextVisit.setColumns(20);
        txtAreaNextVisit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAreaNextVisit.setLineWrap(true);
        txtAreaNextVisit.setRows(5);
        txtAreaNextVisit.setWrapStyleWord(true);
        txtAreaNextVisit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAreaNextVisitKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(txtAreaNextVisit);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        );

        jLabel46.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 0, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText(" Diagnosis:");

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

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diagnosis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtAreaDiagnosis.setColumns(20);
        txtAreaDiagnosis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAreaDiagnosis.setLineWrap(true);
        txtAreaDiagnosis.setRows(5);
        txtAreaDiagnosis.setWrapStyleWord(true);
        txtAreaDiagnosis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAreaDiagnosisKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(txtAreaDiagnosis);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Summary Of The Case", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtAreaSummary.setColumns(20);
        txtAreaSummary.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAreaSummary.setLineWrap(true);
        txtAreaSummary.setRows(5);
        txtAreaSummary.setWrapStyleWord(true);
        txtAreaSummary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAreaSummaryKeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(txtAreaSummary);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Investigations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtAreaInvestigations.setColumns(20);
        txtAreaInvestigations.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAreaInvestigations.setLineWrap(true);
        txtAreaInvestigations.setRows(5);
        txtAreaInvestigations.setWrapStyleWord(true);
        txtAreaInvestigations.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAreaInvestigationsKeyReleased(evt);
            }
        });
        jScrollPane7.setViewportView(txtAreaInvestigations);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlCPTTableLayout = new javax.swing.GroupLayout(pnlCPTTable);
        pnlCPTTable.setLayout(pnlCPTTableLayout);
        pnlCPTTableLayout.setHorizontalGroup(
            pnlCPTTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlCPTTableLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pnlCPTTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCPTTableLayout.createSequentialGroup()
                        .addGroup(pnlCPTTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCPTTableLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDischargeType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFinalDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCPTTableLayout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        pnlCPTTableLayout.setVerticalGroup(
            pnlCPTTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCPTTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCPTTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCPTTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFinalDiagnosis)
                        .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtDischargeType, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCPTTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
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

        btnSaveComments.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSaveComments.setText("Save");
        btnSaveComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCommentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddLayout = new javax.swing.GroupLayout(pnlAdd);
        pnlAdd.setLayout(pnlAddLayout);
        pnlAddLayout.setHorizontalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(btnSearchIcdCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveComments, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDischarge, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addGap(349, 349, 349))
        );
        pnlAddLayout.setVerticalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDischarge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnSearchIcdCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSaveComments, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel43.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 0, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Patient Id:");

        txtBedNo.setEditable(false);
        txtBedNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtBedNo.setForeground(new java.awt.Color(102, 0, 0));
        txtBedNo.setToolTipText("DD-MON-YY");
        txtBedNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBedNoActionPerformed(evt);
            }
        });

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

        txtPrimaryPhysician.setEditable(false);
        txtPrimaryPhysician.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtPrimaryPhysician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimaryPhysicianActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 0, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Name:");

        txtWard.setEditable(false);
        txtWard.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtWard.setForeground(new java.awt.Color(102, 0, 0));
        txtWard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtWard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBedNo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrimaryPhysician, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBedNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrimaryPhysician, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnlCPTTable3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlCPTTable3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient CPT & MED", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlCPTTable3.setAutoscrolls(true);

        tblAddCpt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblAddCpt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null,null}
            },
            new String [] {"CptID", "CptDescription", "ClinicalQuery", "Select"}
        ));
        tblAddCpt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAddCptMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAddCptMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblAddCpt);

        jLabel49.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 0, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("CPT Desc:");

        txtCpt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCpt.setToolTipText("DD-MON-YY");
        txtCpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCptActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 0, 0));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setText("Clinical Query:");

        txtClinicalQuery.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtClinicalQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClinicalQueryActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 0, 0));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("Item:");

        txtItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtItem.setToolTipText("DD-MON-YY");
        txtItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 0, 0));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("Remarks:");

        txtRemarks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRemarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemarksActionPerformed(evt);
            }
        });

        tblAddItems.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblAddItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null,null}
            },
            new String [] {"ItemID", "ItemName", "Remarks", "Select"}
        ));
        tblAddItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAddItemsMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAddItemsMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tblAddItems);

        btnDelCpt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelCpt.setText("Delete");
        btnDelCpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelCptActionPerformed(evt);
            }
        });

        btnDelItem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelItem.setText("Delete");
        btnDelItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelItemActionPerformed(evt);
            }
        });

        btnAddCpt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddCpt.setText("Add");
        btnAddCpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCptActionPerformed(evt);
            }
        });

        btnAddItem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddItem.setText("Add");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCPTTable3Layout = new javax.swing.GroupLayout(pnlCPTTable3);
        pnlCPTTable3.setLayout(pnlCPTTable3Layout);
        pnlCPTTable3Layout.setHorizontalGroup(
            pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(pnlCPTTable3Layout.createSequentialGroup()
                .addGroup(pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClinicalQuery)
                    .addComponent(txtCpt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelCpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddCpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(pnlCPTTable3Layout.createSequentialGroup()
                .addGroup(pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRemarks)
                    .addComponent(txtItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jScrollPane4)
        );
        pnlCPTTable3Layout.setVerticalGroup(
            pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCPTTable3Layout.createSequentialGroup()
                .addGroup(pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCPTTable3Layout.createSequentialGroup()
                        .addGroup(pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpt)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(pnlCPTTable3Layout.createSequentialGroup()
                        .addComponent(btnAddCpt)
                        .addGap(2, 2, 2)
                        .addGroup(pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCPTTable3Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtClinicalQuery))
                            .addComponent(btnDelCpt))
                        .addGap(10, 10, 10)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCPTTable3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtItem))
                    .addComponent(btnAddItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCPTTable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRemarks)
                        .addComponent(jLabel52))
                    .addComponent(btnDelItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlCPTTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlCPTTable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCPTTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCPTTable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        //this.inpatient.searchAdmittedPatient();
        dispose();
}//GEN-LAST:event_btnExitActionPerformed

    /**
     * Used when user clicks on tblIndentRequestHistoryMouse
     *
     * @param evt
     */
    private void tblAddCptMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddCptMouseReleased

        if (tblAddCpt.getSelectedRow() < 0) {
            return;
        }
        currentCpt = tblAddCpt.getSelectedRow();


    }//GEN-LAST:event_tblAddCptMouseReleased

    /**
     * Select the Items from Items Table and Display on the LOV<Items>
     *
     * @param evt
     */
    private void txtBedNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBedNoActionPerformed

        //select the item based on user assigned store.

    }//GEN-LAST:event_txtBedNoActionPerformed

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

        selectDischargeInformation(txtPatientId.getText().trim());

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

        if (txtDischargeType.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter discharge Type", "Patient Discharge",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtAreaSummary.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter Case Summary", "Patient Discharge",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (txtAreaDiagnosis.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter Diagnosis", "Patient Discharge",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
         
        patientDischarge.setDiagnosisId(DiagnosisId);
        patientDischarge.setDiagnosisName(DiagnosisName);
        patientDischarge.setDischargeType(DischargeType);
        patientDischarge.setSummary(txtAreaSummary.getText());
        patientDischarge.setDiagnosisName(txtAreaDiagnosis.getText());
        patientDischarge.setInvestigation(txtAreaInvestigations.getText());
        patientDischarge.setAdvice(txtAreaAdvice.getText());
        patientDischarge.setNextVisit(txtAreaNextVisit.getText());
        updatePatientDischarge(patientDischarge);

    }//GEN-LAST:event_btnDischargeActionPerformed


    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblAddCptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddCptMouseClicked


    }//GEN-LAST:event_tblAddCptMouseClicked

    private void txtDischargeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDischargeTypeActionPerformed
        // TODO add your handling code here:

        lov.LOVDefinitionSelection(DefinitionTypes.dischargeStatus, txtDischargeType.getText(), this);
        txtDischargeType.setText("");
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            
            txtDischargeType.setText(Constants.lovDescription.toUpperCase());
            patientDischarge.setDischargeTypeId(Constants.lovID);
            DischargeType = Constants.lovDescription.toUpperCase();
        }
        //System.out.println(quoReceiveMaster.getValidity());
        txtFinalDiagnosis.requestFocusInWindow();
        txtFinalDiagnosis.moveCaretPosition(0);


    }//GEN-LAST:event_txtDischargeTypeActionPerformed

    private void txtPrimaryPhysicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimaryPhysicianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimaryPhysicianActionPerformed

    private void txtFinalDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalDiagnosisActionPerformed
        // TODO add your handling code here:

//        lov.LOVDefinitionSelection(DefinitionTypes.diagnosis,
//                txtFinalDiagnosis.getText(), this);
//        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
//            txtFinalDiagnosis.setText(Constants.lovDescription.toUpperCase());
//            txtAreaDiagnosis.setText(txtAreaDiagnosis.getText() + "\n"
//                    + Constants.lovDescription);
//        }
//        txtFinalDiagnosis.setText("");

    }//GEN-LAST:event_txtFinalDiagnosisActionPerformed

    private void btnSearchIcdCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIcdCodeActionPerformed

//        frmICD10Codes fm = new frmICD10Codes();
//        DCMS_MDI.desktopPane.add(fm);
//        Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
//        Dimension fmSize = fm.getSize();
//        fm.setLocation((desktopSize.width - fmSize.width) / 2,
//                (desktopSize.height - fmSize.height) / 2);
//        fm.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchIcdCodeActionPerformed

    private void txtCptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCptActionPerformed
        // TODO add your handling code here:

        String query = "SELECT CPT_ID ID,DESCRIPTION FROM "
                + Database.DCMS.CPT
                + " WHERE UPPER(DESCRIPTION) LIKE '%" + txtCpt.getText() + "%' AND ACTIVE = 'Y'";

        lov.LOVSelection(query, this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtCpt.setText("");
        } else {
            txtCpt.setText(Constants.lovDescription.toUpperCase());
            cptItemId = Constants.lovID;
            cptItemDescription = Constants.lovDescription.toUpperCase();

        }

        txtClinicalQuery.requestFocusInWindow();
        txtClinicalQuery.moveCaretPosition(0);


    }//GEN-LAST:event_txtCptActionPerformed

    private void txtClinicalQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClinicalQueryActionPerformed

        saveCPTOrder();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClinicalQueryActionPerformed

    private void txtItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemActionPerformed
        // TODO add your handling code here:

        String query = " SELECT  IT.ID  ID,  IT.DESCRIPTION    DESCRIPTION \n"
                + " FROM  " + Database.DCMS.item + "  IT                   \n"
                + " WHERE  IT.CATEGORY_ID = " + TypeDetailId.medicineCategoryItem + " \n"
                + " AND IT.ACTIVE = 'Y'";

        lov.LOVSelection(query, this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtItem.setText("");
            return;
        } else {
            txtItem.setText(Constants.lovDescription.toUpperCase());
            cptItemId = Constants.lovID;
            cptItemDescription = Constants.lovDescription.toUpperCase();

        }
        txtRemarks.requestFocusInWindow();
        txtRemarks.moveCaretPosition(0);


    }//GEN-LAST:event_txtItemActionPerformed

    private void txtRemarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemarksActionPerformed

        saveItemOrder();

        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemarksActionPerformed

    private void tblAddItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddItemsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAddItemsMouseClicked

    private void tblAddItemsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddItemsMouseReleased
        // TODO add your handling code here:

        if (tblAddItems.getSelectedRow() < 0) {
            return;
        }
        currentItem = tblAddItems.getSelectedRow();

    }//GEN-LAST:event_tblAddItemsMouseReleased

    private void btnDelCptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelCptActionPerformed
        // TODO add your handling code here:

        if (listAddCptDetail.isEmpty() || tblAddCpt.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Row", "Patient Discharge",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        /**
         * details working
         */
        // searchRequistionDetailRecord();
        patientDischargeDetail = listAddCptDetail.get(currentCpt);

        patientDischargeDetail.setType("CPT");
        patientDischargeDetail.setAdmissionNo(patientDischarge.getAdmissionNo());
        ctlPatDischarge.deleteCptItemPatientDischarge(patientDischargeDetail);

        listAddCptDetail.clear();

        listAddCptDetail = ctlPatDischarge.searchDetailDischargeCpt(patientDischargeDetail.getAdmissionNo());

        if (listAddCptDetail.isEmpty()) {
            List<DischargePatientDetail> vec = new ArrayList<>(0);
            DischargePatientDetail emptyUser = new DischargePatientDetail();
            vec.add(emptyUser);
            tblAddCpt.setModel(new cptDischargeTableModel(vec));
        } else {
            tblAddCpt.setModel(new cptDischargeTableModel(listAddCptDetail));
        }
        tblAddCpt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Constants.tablelook.setJTableEnvironment(tblAddCpt);
        setTablesColumnsWidths();

    }//GEN-LAST:event_btnDelCptActionPerformed

    private void btnDelItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelItemActionPerformed
        // TODO add your handling code here:

        if (listAddItemDetail.isEmpty() || tblAddItems.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Row", "Patient Discharge",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        patientDischargeDetail = listAddItemDetail.get(currentItem);
        patientDischargeDetail.setType("MED");
        patientDischargeDetail.setAdmissionNo(patientDischarge.getAdmissionNo());
        ctlPatDischarge.deleteCptItemPatientDischarge(patientDischargeDetail);
        listAddItemDetail.clear();
        listAddItemDetail = ctlPatDischarge.searchDetailDischargeItem(patientDischargeDetail.getAdmissionNo());

        if (listAddItemDetail.isEmpty()) {
            List<DischargePatientDetail> vec = new ArrayList<>(0);
            DischargePatientDetail emptyUser = new DischargePatientDetail();
            vec.add(emptyUser);
            tblAddItems.setModel(new itemDischargeTableModel(vec));
        } else {

            tblAddItems.setModel(new itemDischargeTableModel(listAddItemDetail));
        }
        tblAddItems.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Constants.tablelook.setJTableEnvironment(tblAddItems);
        setTablesColumnsWidths();
    }//GEN-LAST:event_btnDelItemActionPerformed

    private void txtFinalDiagnosisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFinalDiagnosisKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFinalDiagnosisKeyPressed

    private void txtFinalDiagnosisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFinalDiagnosisKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ALT) {

            txtAreaSummary.requestFocusInWindow();
            txtAreaSummary.setCaretPosition(0);
        }

    }//GEN-LAST:event_txtFinalDiagnosisKeyReleased

    private void txtAreaSummaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaSummaryKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ALT) {
            txtAreaDiagnosis.requestFocusInWindow();
            txtAreaDiagnosis.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtAreaSummaryKeyReleased

    private void txtAreaDiagnosisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaDiagnosisKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ALT) {

            txtAreaInvestigations.requestFocusInWindow();
            txtAreaInvestigations.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtAreaDiagnosisKeyReleased

    private void txtAreaInvestigationsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaInvestigationsKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ALT) {

            txtAreaAdvice.requestFocusInWindow();
            txtAreaAdvice.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtAreaInvestigationsKeyReleased

    private void txtAreaAdviceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaAdviceKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ALT) {

            txtAreaNextVisit.requestFocusInWindow();
            txtAreaNextVisit.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtAreaAdviceKeyReleased

    private void txtAreaNextVisitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaNextVisitKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaNextVisitKeyReleased

    private void btnAddCptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCptActionPerformed
        // TODO add your handling code here:
        saveCPTOrder();

    }//GEN-LAST:event_btnAddCptActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
        /**
         * details working
         */

        saveItemOrder();


    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnSaveCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCommentsActionPerformed

        patientDischarge.setDiagnosisId(DiagnosisId);
        patientDischarge.setDiagnosisName(DiagnosisName);
        patientDischarge.setDischargeType(DischargeType);
        patientDischarge.setSummary(txtAreaSummary.getText());
        patientDischarge.setDiagnosisName(txtAreaDiagnosis.getText());
        patientDischarge.setInvestigation(txtAreaInvestigations.getText());
        patientDischarge.setAdvice(txtAreaAdvice.getText());
        patientDischarge.setNextVisit(txtAreaNextVisit.getText());

        if (!ctlPatDischarge.saveDischargeComments(patientDischarge, "N",admission)) {
            JOptionPane.showMessageDialog(null, "unable to Save Data Kindly Contact Administrator");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveCommentsActionPerformed

    private void txtWardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWardActionPerformed

    /**
     * *
     * Search Records According the Given Credentials
     */
    public void clearForm() {

        List<JComponent> compLi = new ArrayList<>();

        compLi.add(txtPatientId);
        compLi.add(txtBedNo);
        compLi.add(txtPatientName);
        compLi.add(txtPrimaryPhysician);
        compLi.add(txtDischargeType);
        compLi.add(txtFinalDiagnosis);
        compLi.add(txtCpt);
        compLi.add(txtClinicalQuery);
        compLi.add(txtItem);
        compLi.add(txtRemarks);

        GUIUtils.setClear(compLi);
        txtAreaDiagnosis.setText("");
        txtAreaAdvice.setText("");
        txtAreaInvestigations.setText("");
        txtAreaNextVisit.setText("");
        txtAreaSummary.setText("");
        patientDischarge = new DischargePatient();

        patientDischargeDetail = new DischargePatientDetail();

        listAddCptDetail.clear();
        tblAddCpt.setModel(new cptDischargeTableModel(listAddCptDetail));

        listAddItemDetail.clear();
        tblAddItems.setModel(new itemDischargeTableModel(listAddItemDetail));

    }

    public void setTablesColumnsWidths() {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCpt;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelCpt;
    private javax.swing.JButton btnDelItem;
    private javax.swing.JButton btnDischarge;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSaveComments;
    private javax.swing.JButton btnSearchIcdCode;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JPanel pnlCPTTable;
    private javax.swing.JPanel pnlCPTTable3;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblAddCpt;
    private javax.swing.JTable tblAddItems;
    private javax.swing.JTextArea txtAreaAdvice;
    private javax.swing.JTextArea txtAreaDiagnosis;
    private javax.swing.JTextArea txtAreaInvestigations;
    private javax.swing.JTextArea txtAreaNextVisit;
    private javax.swing.JTextArea txtAreaSummary;
    private javax.swing.JTextField txtBedNo;
    private javax.swing.JTextField txtClinicalQuery;
    private javax.swing.JTextField txtCpt;
    private javax.swing.JTextField txtDischargeType;
    private javax.swing.JTextField txtFinalDiagnosis;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPrimaryPhysician;
    private javax.swing.JTextField txtRemarks;
    private javax.swing.JTextField txtWard;
    // End of variables declaration//GEN-END:variables

    /**
     * Print the Discharge
     *
     * @param admissionNo
     */
    public void printDischargeNote(String admissionNo) {
        PrintJasperReport print = new PrintJasperReport();
        BO.Reports report = print.getReportPath(Reports.Hospital.dischargePatient);
        if (report.getReportPath() == null || report.getReportPath().length() == 0) {
            return;
        }
        HashMap hm = new HashMap();
        hm.put("admissionNo", patientDischarge.getAdmissionNo());
        hm.put("user", Constants.userId);
        hm.put("reportTitle", "Admitted Patient List");
        hm.put("userLocationId", Constants.userLocationId);
        hm.put("SUBREPORT_DIR", report.getReportPath());
        print.printReport(report.getReportPath() + report.getReportName(),
                Constants.outReportPath + "", "VIEW", hm);
    }

    public void updatePatientDischarge(DischargePatient patientDischarge) {

        if (ctlPatDischarge.saveDischargeComments(patientDischarge, "Y",admission)) {
            JOptionPane.showMessageDialog(null, "Patient Discharge Certificate Saved SuccessFully ");
            printDischargeNote(admission.getAdmissionNo());
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
        if (patientDischarge.getOrderStatusId().equalsIgnoreCase(Status.medicalDischarge)) {
            btnDischarge.setEnabled(false);
            btnAddCpt.setEnabled(false);
            btnAddItem.setEnabled(false);
            btnDelCpt.setEnabled(false);
            btnDelItem.setEnabled(false);
          //  btnPrint.setEnabled(true);
        } else {
            btnDischarge.setEnabled(true);
            btnAddCpt.setEnabled(true);
            btnAddItem.setEnabled(true);
            btnDelCpt.setEnabled(true);
            btnDelItem.setEnabled(true);
        }

        txtPatientName.setText(patientDischarge.getFullName());
        txtBedNo.setText(patientDischarge.getBedDescription());
        txtWard.setText(admission.getWardDescription());
        txtPrimaryPhysician.setText(admission.getPrimaryPhysicianName());
        txtDischargeType.setText(patientDischarge.getDischargeType());
        txtAreaSummary.setText(patientDischarge.getSummary());
        txtAreaDiagnosis.setText(patientDischarge.getDiagnosisName());
        txtAreaInvestigations.setText(patientDischarge.getInvestigation());
        txtAreaAdvice.setText(patientDischarge.getAdvice());
        txtAreaNextVisit.setText(patientDischarge.getNextVisit());

        listAddCptDetail = ctlPatDischarge.searchDetailDischargeCpt(patientDischarge.getAdmissionNo());

        if (listAddCptDetail.isEmpty()) {
            List<DischargePatientDetail> vec = new ArrayList();
            DischargePatientDetail dpd = new DischargePatientDetail();
            vec.add(dpd);
            tblAddCpt.setModel(new cptDischargeTableModel(vec));
        } else {
            tblAddCpt.setModel(new cptDischargeTableModel(listAddCptDetail));
        }
        tblAddCpt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Constants.tablelook.setJTableEnvironment(tblAddCpt);

        listAddItemDetail = ctlPatDischarge.searchDetailDischargeItem(patientDischarge.getAdmissionNo());

        if (listAddItemDetail.isEmpty()) {
            List<DischargePatientDetail> vec = new ArrayList();
            DischargePatientDetail dpd = new DischargePatientDetail();
            vec.add(dpd);
            tblAddItems.setModel(new itemDischargeTableModel(vec));
        } else {
            tblAddItems.setModel(new itemDischargeTableModel(listAddItemDetail));
        }
        tblAddItems.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Constants.tablelook.setJTableEnvironment(tblAddItems);

        txtDischargeType.requestFocusInWindow();
        txtDischargeType.moveCaretPosition(0);
    }

    private void saveCPTOrder() {

        if (txtCpt.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter CPT", "Patient Discharge",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        patientDischargeDetail.setCptItemId(cptItemId);
        patientDischargeDetail.setCptItemDescription(cptItemDescription);
        patientDischargeDetail.setType("CPT");
        patientDischargeDetail.setAdmissionNo(patientDischarge.getAdmissionNo());
        patientDischargeDetail.setRemarks(txtClinicalQuery.getText());
        if (!ctlPatDischarge.insertCptItemPatientDischarge(patientDischargeDetail)) {
            JOptionPane.showMessageDialog(null, "Unable to Save Data,  Kindly Cntact Administrator");
            return;
        }
        listAddCptDetail = ctlPatDischarge.searchDetailDischargeCpt(patientDischargeDetail.getAdmissionNo());
        if (listAddCptDetail.isEmpty()) {
            List<DischargePatientDetail> vec = new ArrayList<>(0);
            DischargePatientDetail emptyUser = new DischargePatientDetail();
            vec.add(emptyUser);
            tblAddCpt.setModel(new cptDischargeTableModel(vec));
        } else {
            tblAddCpt.setModel(new cptDischargeTableModel(listAddCptDetail));
        }
        tblAddCpt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Constants.tablelook.setJTableEnvironment(tblAddCpt);
        setTablesColumnsWidths();

        txtCpt.setText("");
        cptItemId = "";
        cptItemDescription = "";
        txtClinicalQuery.setText("");
        txtCpt.requestFocusInWindow();
        txtCpt.setCaretPosition(0);
    }

    private void saveItemOrder() {

        if (txtItem.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Item", "Patient Discharge",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        patientDischargeDetail.setCptItemId(cptItemId);
        patientDischargeDetail.setCptItemDescription(cptItemDescription);

        patientDischargeDetail.setType("MED");
        patientDischargeDetail.setAdmissionNo(patientDischarge.getAdmissionNo());
        patientDischargeDetail.setRemarks(txtRemarks.getText());

        if (!ctlPatDischarge.insertCptItemPatientDischarge(patientDischargeDetail)) {
            JOptionPane.showMessageDialog(null, "Unable to Save Data,  Kindly Cntact Administrator");
            return;
        }

        listAddItemDetail = ctlPatDischarge.searchDetailDischargeItem(patientDischargeDetail.getAdmissionNo());

        if (listAddItemDetail.isEmpty()) {
            List<DischargePatientDetail> vec = new ArrayList<>(0);
            DischargePatientDetail emptyUser = new DischargePatientDetail();
            vec.add(emptyUser);
            tblAddItems.setModel(new itemDischargeTableModel(vec));
        } else {

            tblAddItems.setModel(new itemDischargeTableModel(listAddItemDetail));
        }
        tblAddItems.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Constants.tablelook.setJTableEnvironment(tblAddItems);
        setTablesColumnsWidths();

        txtItem.setText("");
        cptItemId = "";
        cptItemDescription = "";
        txtRemarks.setText("");
        txtItem.requestFocusInWindow();
        txtItem.setCaretPosition(0);
    }
}
