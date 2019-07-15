package TreatmentOnDischarge.Form;

import BO.OPD.PatientHospitalVisit;
import TreatmentOnDischarge.Controller.PatientWiseParameterController;
import Form.general.DCMS_MDI;
import TreatmentOnDischarge.TableModel.SelectedParameterListTableModel;
import TreatmentOnDischarge.BO.TreatmentOnDischarge;
import TreatmentOnDischarge.Controller.TreatmentOnDischrageController;
import TreatmentOnDischarge.TableModel.AntibioticsTableModel;
import TreatmentOnDischarge.TableModel.IvdFluidsTableModel;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;

public class frmTreatmentOnDischarge extends javax.swing.JInternalFrame {

    private String fromDate = "";
    private String toDate = "";
    private String dateOfSurgery = "";
    private String patientId = "001001898573";
    private String admissionNo = "1772227";
    private String procedureId = "";
    private String diagnosisId = "";
    private String primaryPhysicianId = "";
    private String value = "";
    private String valueDesc = "";

    public frmTreatmentOnDischarge() {

        initComponents();
        this.setSize(Constants.xSize - 120, Constants.ySize - 30);
        setSelectInformation();
        setDate(0);
    }

    TreatmentOnDischrageController ctlTreatmentOnDischarge = new TreatmentOnDischrageController();
    PatientWiseParameterController ctlParameter = new PatientWiseParameterController();
    DisplayLOV lov = new DisplayLOV();
    List<PatientHospitalVisit> listSelectedParameters = new ArrayList();
    TreatmentOnDischarge objTreatmentOnDischarge = new TreatmentOnDischarge();
    List<TreatmentOnDischarge> listDischargeDetail = new ArrayList();
    List<TreatmentOnDischarge> listTreatmentOnDischarge = new ArrayList();
    List<TreatmentOnDischarge> listIvdFluids = new ArrayList();
    List<TreatmentOnDischarge> listAntiobiotics = new ArrayList();
    List<TreatmentOnDischarge> listAnalgesics = new ArrayList();
    List<TreatmentOnDischarge> listNgFoleys = new ArrayList();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAgeGender = new javax.swing.JTextField();
        txtWard = new javax.swing.JTextField();
        txtAdmissionNumber = new javax.swing.JTextField();
        txtBed = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPrimaryPhy = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistory = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPastHistory = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        txtDrugHx = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtAllergirs = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtAdditives = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        txtIvdFluids = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblIvdFluids = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblAntibiotics = new javax.swing.JTable();
        txtAntibiotics = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblAnalgesics = new javax.swing.JTable();
        txtAnalgesics = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        txtNgFoleys = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblNgFoleys = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAnalgestics = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAntibiotic = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAstureRevenal = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblSelectedParameter = new javax.swing.JTable();
        jPanel25 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txtFromDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel34 = new javax.swing.JLabel();
        txtToDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel33 = new javax.swing.JLabel();
        txtTotalLeave = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtProcedure = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtDiagnonis = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtBloodLoss = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDrains = new javax.swing.JTextArea();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtPostOfComplication = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        txtPrimaryPhysician = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtDateOfSurgery = new org.jdesktop.swingx.JXDatePicker();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtHP = new javax.swing.JTextArea();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        txtFindings = new javax.swing.JTextArea();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        txtSuture = new javax.swing.JTextArea();
        pnlAdd = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDiagnostic = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Treatment On Discharge");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(880, 710));
        setRequestFocusEnabled(false);

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Patient Id : ");

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

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Admission No : ");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Patient Name : ");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Ward Name : ");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Age Gender : ");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Bed : ");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Primary Phy. : ");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Client name : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtAdmissionNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientName)
                            .addComponent(txtWard))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBed, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(txtAgeGender)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClient)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmissionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        jTabbedPane1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jTabbedPane1.setForeground(new java.awt.Color(102, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtHistory.setColumns(20);
        txtHistory.setRows(5);
        jScrollPane1.setViewportView(txtHistory);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Past History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtPastHistory.setColumns(20);
        txtPastHistory.setRows(5);
        jScrollPane2.setViewportView(txtPastHistory);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Drug Hx : ");

        txtDrugHx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDrugHxMouseClicked(evt);
            }
        });
        txtDrugHx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrugHxActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Allergies : ");

        txtAllergirs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAllergirsMouseClicked(evt);
            }
        });
        txtAllergirs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAllergirsActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Additives : ");

        txtAdditives.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAdditivesMouseClicked(evt);
            }
        });
        txtAdditives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdditivesActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IPD Treatment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel9.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remarks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtRemarks.setColumns(20);
        txtRemarks.setRows(5);
        jScrollPane3.setViewportView(txtRemarks);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IVD Fluids", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(102, 0, 0));

        txtIvdFluids.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIvdFluidsMouseClicked(evt);
            }
        });
        txtIvdFluids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIvdFluidsActionPerformed(evt);
            }
        });

        tblIvdFluids.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblIvdFluids.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Sr No","Ivd Fluids"}
        ));
        tblIvdFluids.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIvdFluidsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblIvdFluidsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblIvdFluidsMouseReleased(evt);
            }
        });
        tblIvdFluids.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblIvdFluidsKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(tblIvdFluids);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtIvdFluids, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(txtIvdFluids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Antibiotics", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel19.setForeground(new java.awt.Color(102, 0, 0));

        tblAntibiotics.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblAntibiotics.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Sr No", "Antibiotics"}
        ));
        tblAntibiotics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAntibioticsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAntibioticsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAntibioticsMouseReleased(evt);
            }
        });
        tblAntibiotics.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAntibioticsKeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(tblAntibiotics);

        txtAntibiotics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAntibioticsMouseClicked(evt);
            }
        });
        txtAntibiotics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAntibioticsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(txtAntibiotics, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addComponent(txtAntibiotics, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Analgesics", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel22.setForeground(new java.awt.Color(102, 0, 0));

        tblAnalgesics.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblAnalgesics.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Sr No","Analgesics"}
        ));
        tblAnalgesics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAnalgesicsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAnalgesicsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAnalgesicsMouseReleased(evt);
            }
        });
        tblAnalgesics.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAnalgesicsKeyReleased(evt);
            }
        });
        jScrollPane13.setViewportView(tblAnalgesics);

        txtAnalgesics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAnalgesicsMouseClicked(evt);
            }
        });
        txtAnalgesics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnalgesicsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(txtAnalgesics, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addComponent(txtAnalgesics, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NG/ Foleys", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel24.setForeground(new java.awt.Color(102, 0, 0));

        txtNgFoleys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNgFoleysMouseClicked(evt);
            }
        });
        txtNgFoleys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgFoleysActionPerformed(evt);
            }
        });

        tblNgFoleys.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblNgFoleys.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null, null, null}
            },
            new String [] {
                "Sr No","NG/ Foleys"}
        ));
        tblNgFoleys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNgFoleysMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblNgFoleysMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblNgFoleysMouseReleased(evt);
            }
        });
        tblNgFoleys.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblNgFoleysKeyReleased(evt);
            }
        });
        jScrollPane14.setViewportView(tblNgFoleys);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNgFoleys, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(txtNgFoleys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtDrugHx, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAllergirs))
                            .addComponent(txtAdditives)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDrugHx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAllergirs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdditives, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jTabbedPane1.addTab("Patient History", jPanel4);

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel13.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Analgestics", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtAnalgestics.setColumns(20);
        txtAnalgestics.setRows(5);
        jScrollPane6.setViewportView(txtAnalgestics);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
        );

        jPanel14.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Antibiotic", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtAntibiotic.setColumns(20);
        txtAntibiotic.setRows(5);
        jScrollPane7.setViewportView(txtAntibiotic);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7)
        );

        jPanel15.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asture Revenal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtAstureRevenal.setColumns(20);
        txtAstureRevenal.setRows(5);
        jScrollPane8.setViewportView(txtAstureRevenal);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8)
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Report Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

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
        jScrollPane16.setViewportView(tblSelectedParameter);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16)
        );

        jPanel25.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Leaves", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel25.setForeground(new java.awt.Color(102, 0, 0));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("From Date : ");

        txtFromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromDateActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 0, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("TO Date : ");

        txtToDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToDateActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Total Leave : ");

        txtTotalLeave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTotalLeaveMouseClicked(evt);
            }
        });
        txtTotalLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalLeaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtToDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalLeave)))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalLeave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Treatment at Discharge", jPanel12);

        jPanel11.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OT Notes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Procedure : ");

        txtProcedure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProcedureMouseClicked(evt);
            }
        });
        txtProcedure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcedureActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Diagnonis : ");

        txtDiagnonis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDiagnonisMouseClicked(evt);
            }
        });
        txtDiagnonis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiagnonisActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Blood Loss : ");

        txtBloodLoss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBloodLossMouseClicked(evt);
            }
        });
        txtBloodLoss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodLossActionPerformed(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drains", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtDrains.setColumns(20);
        txtDrains.setRows(5);
        jScrollPane4.setViewportView(txtDrains);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Post of Complications", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtPostOfComplication.setColumns(20);
        txtPostOfComplication.setRows(5);
        jScrollPane5.setViewportView(txtPostOfComplication);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
        );

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Date of Surgery : ");

        txtPrimaryPhysician.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrimaryPhysicianMouseClicked(evt);
            }
        });
        txtPrimaryPhysician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimaryPhysicianActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 0, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Primary Physician : ");

        txtDateOfSurgery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfSurgeryActionPerformed(evt);
            }
        });

        jPanel18.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "H/P", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtHP.setColumns(20);
        txtHP.setRows(5);
        jScrollPane9.setViewportView(txtHP);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel21.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Findings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtFindings.setColumns(20);
        txtFindings.setRows(5);
        jScrollPane18.setViewportView(txtFindings);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18)
        );

        jPanel23.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Suture", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtSuture.setColumns(20);
        txtSuture.setRows(5);
        jScrollPane20.setViewportView(txtSuture);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane20)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDateOfSurgery, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrimaryPhysician))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(txtBloodLoss, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProcedure))
                            .addComponent(txtDiagnonis))))
                .addGap(5, 5, 5))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcedure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBloodLoss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiagnonis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateOfSurgery, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrimaryPhysician, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("OT Notes", jPanel11);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pnlAdd.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlAdd.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(102, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDiagnostic.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDiagnostic.setText("Diagnostic");
        btnDiagnostic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosticActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddLayout = new javax.swing.GroupLayout(pnlAdd);
        pnlAdd.setLayout(pnlAddLayout);
        pnlAddLayout.setHorizontalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDiagnostic, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        pnlAddLayout.setVerticalGroup(
            pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDiagnostic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPatientIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdMouseClicked

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtDrugHxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDrugHxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrugHxMouseClicked

    private void txtDrugHxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrugHxActionPerformed
        // TODO add your handling code here:
        txtAllergirs.requestFocus();
    }//GEN-LAST:event_txtDrugHxActionPerformed

    private void txtAllergirsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAllergirsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAllergirsMouseClicked

    private void txtAllergirsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAllergirsActionPerformed
        // TODO add your handling code here:
        txtAdditives.requestFocus();
    }//GEN-LAST:event_txtAllergirsActionPerformed

    private void txtAdditivesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAdditivesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdditivesMouseClicked

    private void txtAdditivesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdditivesActionPerformed
        // TODO add your handling code here:
        txtIvdFluids.requestFocus();
    }//GEN-LAST:event_txtAdditivesActionPerformed

    private void txtAntibioticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAntibioticsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAntibioticsMouseClicked

    private void txtAntibioticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAntibioticsActionPerformed
        // TODO add your handling code here:
        String query = "  SELECT ID, DESCRIPTION FROM                       \n"
                + Database.DCMS.definitionTypeDetail + "                    \n"
                + " WHERE DEF_TYPE_ID = " + DefinitionTypes.antibiotics + "   \n"
                + " AND UPPER(DESCRIPTION) LIKE UPPER('%"
                + txtAntibiotics.getText().trim() + "%')                      \n"
                + " AND ID NOT IN ( SELECT DETAIL_ID FROM "
                + Database.DCMS.treatmentOnDischargeDetail + "              \n"
                + " WHERE PATIENT_ID = " + patientId + "                    \n"
                + " AND ADMISSION_NO = " + admissionNo + ")                 \n"
                + "ORDER BY DESCRIPTION                                     \n";

        lov.LOVSelection(query, this);
        value = Constants.lovID;
        valueDesc = Constants.lovDescription;
        saveDetailData(value, DefinitionTypes.antibiotics, "IPD");
        setAntibiotics();
        txtAntibiotics.setText("");
        txtAntibiotics.requestFocus();
    }//GEN-LAST:event_txtAntibioticsActionPerformed

    private void txtAnalgesicsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAnalgesicsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnalgesicsMouseClicked

    private void txtAnalgesicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnalgesicsActionPerformed
        // TODO add your handling code here:
        String query = "  SELECT ID, DESCRIPTION FROM                       \n"
                + Database.DCMS.definitionTypeDetail + "                    \n"
                + " WHERE DEF_TYPE_ID = " + DefinitionTypes.analgesics + "  \n"
                + " AND UPPER(DESCRIPTION) LIKE UPPER('%"
                + txtAnalgesics.getText().trim() + "%')                     \n"
                + " AND ID NOT IN ( SELECT DETAIL_ID FROM "
                + Database.DCMS.treatmentOnDischargeDetail + "              \n"
                + " WHERE PATIENT_ID = " + patientId + "                    \n"
                + " AND ADMISSION_NO = " + admissionNo + ")                 \n"
                + "ORDER BY DESCRIPTION                                     \n";

        lov.LOVSelection(query, this);
        value = Constants.lovID;
        valueDesc = Constants.lovDescription;
        saveDetailData(value, DefinitionTypes.analgesics, "IPD");
        setAnalgesics();
        txtAnalgesics.setText("");
        txtAnalgesics.requestFocus();
    }//GEN-LAST:event_txtAnalgesicsActionPerformed

    private void txtNgFoleysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNgFoleysMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgFoleysMouseClicked

    private void txtNgFoleysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgFoleysActionPerformed
        // TODO add your handling code here:
        String query = "  SELECT ID, DESCRIPTION FROM                       \n"
                + Database.DCMS.definitionTypeDetail + "                    \n"
                + " WHERE DEF_TYPE_ID = " + DefinitionTypes.ngFoleys + "    \n"
                + " AND UPPER(DESCRIPTION) LIKE UPPER('%"
                + txtNgFoleys.getText().trim() + "%')                       \n"
                + " AND ID NOT IN ( SELECT DETAIL_ID FROM "
                + Database.DCMS.treatmentOnDischargeDetail + "              \n"
                + " WHERE PATIENT_ID = " + patientId + "                    \n"
                + " AND ADMISSION_NO = " + admissionNo + ")                 \n"
                + "ORDER BY DESCRIPTION                                     \n";

        lov.LOVSelection(query, this);
        value = Constants.lovID;
        valueDesc = Constants.lovDescription;
        saveDetailData(value, DefinitionTypes.ngFoleys, "IPD");
        setNgFoleys();
        txtNgFoleys.setText("");
        txtNgFoleys.requestFocus();
    }//GEN-LAST:event_txtNgFoleysActionPerformed

    private void txtIvdFluidsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIvdFluidsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIvdFluidsMouseClicked

    private void txtIvdFluidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIvdFluidsActionPerformed
        // TODO add your handling code here:
        String query = "  SELECT ID, DESCRIPTION FROM                       \n"
                + Database.DCMS.definitionTypeDetail + "                    \n"
                + " WHERE DEF_TYPE_ID = " + DefinitionTypes.ivdFluids + "   \n"
                + " AND UPPER(DESCRIPTION) LIKE UPPER('%"
                + txtIvdFluids.getText().trim() + "%')                      \n"
                + " AND ID NOT IN ( SELECT DETAIL_ID FROM "
                + Database.DCMS.treatmentOnDischargeDetail + "              \n"
                + " WHERE PATIENT_ID = " + patientId + "                    \n"
                + " AND ADMISSION_NO = " + admissionNo + ")                 \n"
                + "ORDER BY DESCRIPTION                                     \n";

        lov.LOVSelection(query, this);
        value = Constants.lovID;
        valueDesc = Constants.lovDescription;
        saveDetailData(value, DefinitionTypes.ivdFluids, "IPD");
        setIvdFluids();
        txtIvdFluids.setText("");
        txtIvdFluids.requestFocus();
    }//GEN-LAST:event_txtIvdFluidsActionPerformed

    private void tblIvdFluidsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIvdFluidsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIvdFluidsMouseClicked

    private void tblIvdFluidsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIvdFluidsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIvdFluidsMousePressed

    private void tblIvdFluidsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIvdFluidsMouseReleased
        if (evt.getClickCount() == 2) {
            TreatmentOnDischarge objTreatmentOnDischarge = listIvdFluids.get(
                    tblIvdFluids.getSelectedRow());
            deleteDetailData(DefinitionTypes.ivdFluids, objTreatmentOnDischarge.getDetailId());
//            setSelectInformation();
            setIvdFluids();
        }

    }//GEN-LAST:event_tblIvdFluidsMouseReleased

    private void tblIvdFluidsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblIvdFluidsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblIvdFluidsKeyReleased

    private void tblAntibioticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAntibioticsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAntibioticsMouseClicked

    private void tblAntibioticsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAntibioticsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAntibioticsMousePressed

    private void tblAntibioticsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAntibioticsMouseReleased
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            TreatmentOnDischarge objTreatmentOnDischarge = listAntiobiotics.get(
                    tblAntibiotics.getSelectedRow());
            deleteDetailData(DefinitionTypes.antibiotics, objTreatmentOnDischarge.getDetailId());
            setAntibiotics();
        }
    }//GEN-LAST:event_tblAntibioticsMouseReleased

    private void tblAntibioticsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAntibioticsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAntibioticsKeyReleased

    private void tblAnalgesicsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnalgesicsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAnalgesicsMouseClicked

    private void tblAnalgesicsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnalgesicsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAnalgesicsMousePressed

    private void tblAnalgesicsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnalgesicsMouseReleased
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            TreatmentOnDischarge objTreatmentOnDischarge = listAnalgesics.get(
                    tblAnalgesics.getSelectedRow());
            deleteDetailData(DefinitionTypes.analgesics, objTreatmentOnDischarge.getDetailId());
            setAnalgesics();
        }
    }//GEN-LAST:event_tblAnalgesicsMouseReleased

    private void tblAnalgesicsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAnalgesicsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAnalgesicsKeyReleased

    private void tblNgFoleysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNgFoleysMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            TreatmentOnDischarge objTreatmentOnDischarge = listNgFoleys.get(
                    tblNgFoleys.getSelectedRow());
            deleteDetailData(DefinitionTypes.ngFoleys, objTreatmentOnDischarge.getDetailId());
            setNgFoleys();
        }
    }//GEN-LAST:event_tblNgFoleysMouseClicked

    private void tblNgFoleysMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNgFoleysMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblNgFoleysMousePressed

    private void tblNgFoleysMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNgFoleysMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_tblNgFoleysMouseReleased

    private void tblNgFoleysKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblNgFoleysKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblNgFoleysKeyReleased

    private void txtFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromDateActionPerformed
        // TODO add your handling code here:
        if (txtFromDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the To corrct date",
                    "Set To Date", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        fromDate = dateFormat.format(txtFromDate.getDate());
    }//GEN-LAST:event_txtFromDateActionPerformed

    private void txtTotalLeaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalLeaveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalLeaveMouseClicked

    private void txtTotalLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalLeaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalLeaveActionPerformed

    private void txtToDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToDateActionPerformed
        // TODO add your handling code here:
        if (txtToDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the To corrct date",
                    "Set To Date", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        long diff = txtToDate.getDate().getTime() - txtFromDate.getDate().getTime();
         txtTotalLeave.setText(String.valueOf(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)));
        toDate = dateFormat.format(txtToDate.getDate());
        
    }//GEN-LAST:event_txtToDateActionPerformed

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

    private void txtProcedureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProcedureMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProcedureMouseClicked

    private void txtProcedureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcedureActionPerformed
        // TODO add your handling code here:
        String query = "  SELECT CPT_ID ID, DESCRIPTION FROM        \n"
                + Database.DCMS.CPT + "                             \n"
                + " WHERE  UPPER(DESCRIPTION) LIKE UPPER('%"
                + txtProcedure.getText().trim() + "%')              \n"
                + " AND SECTION_ID IN ( SELECT SECTION_ID FROM "
                + Database.DCMS.section + "                         \n"
                + " WHERE DESCRIPTION LIKE '%PROCEDURE%')           \n"
                + "ORDER BY DESCRIPTION                             \n";
        lov.LOVSelection(query, this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtProcedure.setText("");
        } else {
            txtProcedure.setText(Constants.lovDescription.toUpperCase());
            procedureId = Constants.lovID;
        }
        txtDiagnonis.requestFocus();
    }//GEN-LAST:event_txtProcedureActionPerformed

    private void txtDiagnonisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiagnonisMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnonisMouseClicked

    private void txtDiagnonisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiagnonisActionPerformed
        // TODO add your handling code here:
        String query = "  SELECT ID, DESCRIPTION FROM                       \n"
                + Database.DCMS.definitionTypeDetail + "                    \n"
                + " WHERE DEF_TYPE_ID = " + DefinitionTypes.diagnosisOPD + "   \n"
                + " AND UPPER(DESCRIPTION) LIKE UPPER('%"
                + txtDiagnonis.getText().trim() + "%')                      \n"
                + "ORDER BY DESCRIPTION                             \n";

        lov.LOVSelection(query, this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtDiagnonis.setText("");
        } else {
            diagnosisId = Constants.lovID;
            txtDiagnonis.setText(Constants.lovDescription);
        }
        txtDrains.requestFocus();
    }//GEN-LAST:event_txtDiagnonisActionPerformed

    private void txtBloodLossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBloodLossMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodLossMouseClicked

    private void txtBloodLossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodLossActionPerformed
        // TODO add your handling code here:
        txtProcedure.requestFocus();
    }//GEN-LAST:event_txtBloodLossActionPerformed

    private void txtPrimaryPhysicianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrimaryPhysicianMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimaryPhysicianMouseClicked

    private void txtPrimaryPhysicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimaryPhysicianActionPerformed
        // TODO add your handling code here:
        String query = "  SELECT USER_NAME ID, NAME DESCRIPTION FROM  \n"
                + Database.DCMS.users + "                             \n"
                + " WHERE  UPPER(NAME) LIKE UPPER('%"
                + txtPrimaryPhysician.getText().trim() + "%')         \n"
                + "ORDER BY NAME                                      \n";
        lov.LOVSelection(query, this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtPrimaryPhysician.setText("");
        } else {
            txtPrimaryPhysician.setText(Constants.lovDescription.toUpperCase());
            primaryPhysicianId = Constants.lovID;
        }
    }//GEN-LAST:event_txtPrimaryPhysicianActionPerformed

    private void txtDateOfSurgeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfSurgeryActionPerformed
        // TODO add your handling code here:
        if (txtDateOfSurgery.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the To corrct date",
                    "Set To Date", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        dateOfSurgery = dateFormat.format(txtDateOfSurgery.getDate());
    }//GEN-LAST:event_txtDateOfSurgeryActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        setData();
        listTreatmentOnDischarge = ctlTreatmentOnDischarge.selectTreatmentOnDischrage(
                patientId, admissionNo);
        if (listTreatmentOnDischarge.isEmpty()) {
            if (ctlTreatmentOnDischarge.insertTreatmentOnDischrage(objTreatmentOnDischarge)) {
                JOptionPane.showMessageDialog(null, "Record save successfully!");
                setSelectInformation();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Save. Kindly Contact "
                        + "Administrator.");
            }
        } else {
            if (ctlTreatmentOnDischarge.updateTreatmentOnDischrage(objTreatmentOnDischarge)) {
                JOptionPane.showMessageDialog(null, "Record save successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Save. Kindly Contact "
                        + "Administrator.");
            }
        }

        System.err.println("list final:" + listDischargeDetail.size());
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDiagnosticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosticActionPerformed
        // TODO add your handling code here:
        frmPatientWiseParameters fm = new frmPatientWiseParameters();
        DCMS_MDI.desktopPane.add(fm);
        Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
        Dimension fmSize = fm.getSize();
        fm.setLocation((desktopSize.width - fmSize.width) / 2,
                (desktopSize.height - fmSize.height) / 2);
        fm.setVisible(true);
    }//GEN-LAST:event_btnDiagnosticActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiagnostic;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JTable tblAnalgesics;
    private javax.swing.JTable tblAntibiotics;
    private javax.swing.JTable tblIvdFluids;
    private javax.swing.JTable tblNgFoleys;
    private javax.swing.JTable tblSelectedParameter;
    private javax.swing.JTextField txtAdditives;
    private javax.swing.JTextField txtAdmissionNumber;
    private javax.swing.JTextField txtAgeGender;
    private javax.swing.JTextField txtAllergirs;
    private javax.swing.JTextField txtAnalgesics;
    private javax.swing.JTextArea txtAnalgestics;
    private javax.swing.JTextArea txtAntibiotic;
    private javax.swing.JTextField txtAntibiotics;
    private javax.swing.JTextArea txtAstureRevenal;
    private javax.swing.JTextField txtBed;
    private javax.swing.JTextField txtBloodLoss;
    private javax.swing.JTextField txtClient;
    private org.jdesktop.swingx.JXDatePicker txtDateOfSurgery;
    private javax.swing.JTextField txtDiagnonis;
    private javax.swing.JTextArea txtDrains;
    private javax.swing.JTextField txtDrugHx;
    private javax.swing.JTextArea txtFindings;
    private org.jdesktop.swingx.JXDatePicker txtFromDate;
    private javax.swing.JTextArea txtHP;
    private javax.swing.JTextArea txtHistory;
    private javax.swing.JTextField txtIvdFluids;
    private javax.swing.JTextField txtNgFoleys;
    private javax.swing.JTextArea txtPastHistory;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextArea txtPostOfComplication;
    private javax.swing.JTextField txtPrimaryPhy;
    private javax.swing.JTextField txtPrimaryPhysician;
    private javax.swing.JTextField txtProcedure;
    private javax.swing.JTextArea txtRemarks;
    private javax.swing.JTextArea txtSuture;
    private org.jdesktop.swingx.JXDatePicker txtToDate;
    private javax.swing.JTextField txtTotalLeave;
    private javax.swing.JTextField txtWard;
    // End of variables declaration//GEN-END:variables

    private void setIvdFluidsTableColWidth() {
        TableColumn column;
        for (int i = 0; i < tblIvdFluids.getColumnCount(); i++) {
            column = tblIvdFluids.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(25);
            } else if (i == 1) {
                column.setPreferredWidth(100);
            }
        }
    }

    private void setAntiobioticsTableColWidth() {
        TableColumn column;
        for (int i = 0; i < tblAntibiotics.getColumnCount(); i++) {
            column = tblAntibiotics.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(25);
            } else if (i == 1) {
                column.setPreferredWidth(100);
            }
        }
    }

    private void setAnalgesicsTableColWidth() {
        TableColumn column;
        for (int i = 0; i < tblAnalgesics.getColumnCount(); i++) {
            column = tblAnalgesics.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(25);
            } else if (i == 1) {
                column.setPreferredWidth(100);
            }
        }
    }

    private void setNgFoleysTableColWidth() {
        TableColumn column;
        for (int i = 0; i < tblNgFoleys.getColumnCount(); i++) {
            column = tblNgFoleys.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(25);
            } else if (i == 1) {
                column.setPreferredWidth(100);
            }
        }
    }

    private void setData() {
        listDischargeDetail.clear();
        listDischargeDetail.addAll(listAnalgesics);
        listDischargeDetail.addAll(listAntiobiotics);
        listDischargeDetail.addAll(listIvdFluids);
        listDischargeDetail.addAll(listNgFoleys);

        objTreatmentOnDischarge.setPatientId(patientId);
        objTreatmentOnDischarge.setAdmissionNo(admissionNo);
        objTreatmentOnDischarge.setHistory(txtHistory.getText().trim());
        objTreatmentOnDischarge.setPastHistory(txtPastHistory.getText().trim());
        objTreatmentOnDischarge.setDrudHx(txtDrugHx.getText().trim());
        objTreatmentOnDischarge.setAllergies(txtAllergirs.getText().trim());
        objTreatmentOnDischarge.setAdditives(txtAdditives.getText().trim());
        objTreatmentOnDischarge.setRemarks(txtRemarks.getText().trim());
        objTreatmentOnDischarge.setAnalgestics(txtAnalgestics.getText().trim());
        objTreatmentOnDischarge.setAntibiotics(txtAntibiotic.getText().trim());
        objTreatmentOnDischarge.setAstureRevenal(txtAstureRevenal.getText().trim());
        objTreatmentOnDischarge.setFromDate(fromDate);
        objTreatmentOnDischarge.setToDate(toDate);
        objTreatmentOnDischarge.setTotalLeaves(txtTotalLeave.getText().trim());
        objTreatmentOnDischarge.setProcedureId(procedureId.trim());
        objTreatmentOnDischarge.setDiagnosisId(diagnosisId.trim());
        objTreatmentOnDischarge.setHP(txtHP.getText().trim());
        objTreatmentOnDischarge.setBloodLoss(txtBloodLoss.getText().trim());
        objTreatmentOnDischarge.setDrains(txtDrains.getText().trim());
        objTreatmentOnDischarge.setSuturs(txtSuture.getText().trim());
        objTreatmentOnDischarge.setFindings(txtFindings.getText().trim());
        objTreatmentOnDischarge.setPostOfComplication(txtPostOfComplication.getText().trim());
        objTreatmentOnDischarge.setDateOfSurgery(dateOfSurgery);
        objTreatmentOnDischarge.setPrimaryPhysicianId(primaryPhysicianId.trim());

    }

    private void setSelectInformation() {
        listTreatmentOnDischarge = ctlTreatmentOnDischarge.selectTreatmentOnDischrage(
                patientId, admissionNo);
        setDataInTextBoxes();
        setIvdFluids();
        setAntibiotics();
        setAnalgesics();
        setNgFoleys();
        selectedParmeters();
    }

    private void setIvdFluids() {
        listIvdFluids = ctlTreatmentOnDischarge.selectTreatmentOnDischrageDetail(
                patientId, admissionNo, DefinitionTypes.ivdFluids);
        System.err.println("ivd list" + listIvdFluids.size());
        tblIvdFluids.setModel(new IvdFluidsTableModel(listIvdFluids));
        ListSelectionModel selectionModel = tblIvdFluids.getSelectionModel();
        tblIvdFluids.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblIvdFluids);
        setIvdFluidsTableColWidth();
    }

    private void setAntibiotics() { // 
        listAntiobiotics = ctlTreatmentOnDischarge.selectTreatmentOnDischrageDetail(
                patientId, admissionNo, DefinitionTypes.antibiotics);
        tblAntibiotics.setModel(new AntibioticsTableModel(listAntiobiotics));
        ListSelectionModel selectionModel = tblAntibiotics.getSelectionModel();
        tblAntibiotics.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblAntibiotics);
        setAntiobioticsTableColWidth();
    }

    private void setAnalgesics() {
        listAnalgesics = ctlTreatmentOnDischarge.selectTreatmentOnDischrageDetail(
                patientId, admissionNo, DefinitionTypes.analgesics);
        tblAnalgesics.setModel(new AntibioticsTableModel(listAnalgesics));
        ListSelectionModel selectionModel = tblAnalgesics.getSelectionModel();
        tblAnalgesics.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblAnalgesics);
        setAnalgesicsTableColWidth();
    }

    private void setNgFoleys() {
        listNgFoleys = ctlTreatmentOnDischarge.selectTreatmentOnDischrageDetail(
                patientId, admissionNo, DefinitionTypes.ngFoleys);
        tblNgFoleys.setModel(new IvdFluidsTableModel(listNgFoleys));
        ListSelectionModel selectionModel = tblNgFoleys.getSelectionModel();
        tblNgFoleys.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblNgFoleys);
        setNgFoleysTableColWidth();
    }

    private void setDataInTextBoxes() {
        if(!listTreatmentOnDischarge.isEmpty()){
          TreatmentOnDischarge setData = listTreatmentOnDischarge.get(0);  
           procedureId = setData.getProcedureId().trim();
        diagnosisId = setData.getDiagnosisId().trim();
        primaryPhysicianId = setData.getPrimaryPhysicianId().trim();

        txtHistory.setText(setData.getHistory().trim());
        txtPastHistory.setText(setData.getPastHistory().trim());
        txtDrugHx.setText(setData.getDrudHx().trim());
        txtAllergirs.setText(setData.getAllergies().trim());
        txtAdditives.setText(setData.getAdditives().trim());
        txtRemarks.setText(setData.getRemarks().trim());
        txtAnalgestics.setText(setData.getAnalgestics().trim());
        txtAntibiotic.setText(setData.getAntibiotics().trim());
        txtAstureRevenal.setText(setData.getAstureRevenal().trim());
        txtTotalLeave.setText(setData.getTotalLeaves().trim());
        txtProcedure.setText(setData.getProcedureDescription().trim());
        txtDiagnonis.setText(setData.getDiagnosisDescription().trim());
        txtHP.setText(setData.getHP().trim());
        txtBloodLoss.setText(setData.getBloodLoss().trim());
        txtDrains.setText(setData.getDrains().trim());
        txtSuture.setText(setData.getSuturs().trim());
        txtFindings.setText(setData.getFindings().trim());
        txtPostOfComplication.setText(setData.getPostOfComplication().trim());
        txtPrimaryPhysician.setText(setData.getPrimaryPhysicianName().trim());
        
        setDateOfSurgery(Integer.parseInt(setData.getDayDateOfSurgery()));
        setFromDate(Integer.parseInt(setData.getDayFromDate()));
        setToDate(Integer.parseInt(setData.getDayToDate()));
        setToDate(Integer.parseInt(setData.getDayToDate()));
        }else{
            System.err.println("No record found.");
        }
        
       
    }

    private void saveDetailData(String value, String actionId, String eventId) {
        objTreatmentOnDischarge = new TreatmentOnDischarge();
        objTreatmentOnDischarge.setPatientId(patientId);
        objTreatmentOnDischarge.setAdmissionNo(admissionNo);
        objTreatmentOnDischarge.setDetailId(value);
        objTreatmentOnDischarge.setActionId(actionId);
        objTreatmentOnDischarge.setEventId(eventId);
        ctlTreatmentOnDischarge.insertTreatmentOnDischrageDetail(objTreatmentOnDischarge);
    }

    private void deleteDetailData(String actionId, String value) {
        objTreatmentOnDischarge.setPatientId(patientId);
        objTreatmentOnDischarge.setAdmissionNo(admissionNo);
        objTreatmentOnDischarge.setActionId(actionId);
        objTreatmentOnDischarge.setDetailId(value);
        ctlTreatmentOnDischarge.deleteTreatmentOnDischrageDetail(objTreatmentOnDischarge);
    }

    private void setDate(int day) {
        try {
            Date date = new Date();
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtFromDate.setDate(date2);
            toDate = dateFormat.format(date2);
            dateOfSurgery = dateFormat.format(date2);
            fromDate = dateFormat.format(date2);
            toDate = dateFormat.format(date2);
            dateOfSurgery = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setDateOfSurgery(int day) {
        try {
            Date date = new Date();
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtDateOfSurgery.setDate(date2);
            dateOfSurgery = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setFromDate(int day) {
        try {
            Date date = new Date();
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtFromDate.setDate(date2);
            fromDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setToDate(int day) {
        try {
            Date date = new Date();
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtToDate.setDate(date2);
            toDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void selectedParmeters() {
        listSelectedParameters = ctlParameter.patientWiseSelectedParameter(patientId,
                admissionNo);
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
}
