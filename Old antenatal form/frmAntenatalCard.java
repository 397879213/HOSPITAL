package Antenatal.Form;

import Antenatal.BO.AntenatalPatientInfo;
import Antenatal.Controller.AntenatalPatientInfoController;
import Antenatal.BO.AntenatalVisitsBo;
import Antenatal.BO.BOBirthCertificate;
import Antenatal.BO.GynaeParameter;
import BO.OPD.PatientHospitalVisit;
import Antenatal.Controller.AntenatalVisitController;
import Antenatal.Controller.BirthCertificateController;
import Antenatal.Controller.GynaeParameterController;
import Antenatal.TableModel.AntenatalVisitTableModel;
import Antenatal.TableModel.GynaeParameterListTableModel;
import Antenatal.TableModel.PastObstetricHistoryTableModel;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.DisplayLOV;

public class frmAntenatalCard extends javax.swing.JInternalFrame {

    public frmAntenatalCard() {// PatientHospitalVisit objDemography

        initComponents();
        this.setSize(Constants.xSize + 350, Constants.ySize + 130);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
        btnSave.setMnemonic(KeyEvent.VK_S);
        btnFinal.setMnemonic(KeyEvent.VK_F);
        btnRegisterPOH.setMnemonic(KeyEvent.VK_R);
        btnEditPOH.setMnemonic(KeyEvent.VK_U);
//        setPatientDemography(objDemography);
        setDate(0);
        selectAntenatalPatient();
        selectGayneeParameter(patientId, "");
        selectBirthCertificate();
        searchAntenatalVisit("", patientId, "", "", "Y");
        setDataInTextBoxes();
    }

    private String patientId = "001002258745";
    private String referenceId = "";
    private String yearsMarriedDate = "";
    private String nextVisitDate = "";
    private String fromDate = "";
    private String toDate = "";
    private String eddDate = "";
    String primaryPhyId = "";
    private String dob = "";

    AntenatalPatientInfo antenatalPatientObj = new AntenatalPatientInfo();
    AntenatalPatientInfoController ctlantenatalPatient = new AntenatalPatientInfoController();
    List<AntenatalPatientInfo> listAntenatalPatient = new ArrayList();

    List<AntenatalVisitsBo> listAntenatalVisit = new ArrayList();
    List<AntenatalVisitsBo> listAntenatalVisitNotFinal = new ArrayList();
    List<AntenatalVisitsBo> listChk = new ArrayList();

    DisplayLOV lov = new DisplayLOV();
    AntenatalVisitController ctlAntenatalVisit = new AntenatalVisitController();
    PatientHospitalVisit objSave = new PatientHospitalVisit();
    AntenatalVisitsBo antenatalVisitsObj = new AntenatalVisitsBo();

    // Gynae
    GynaeParameterController ctlGayneeParameter = new GynaeParameterController();
    GynaeParameter objSaveGynae = new GynaeParameter();
    GynaeParameter gayneeParameterObj = new GynaeParameter();

    List<GynaeParameter> listGayneeParam = new ArrayList();
    List<GynaeParameter> listFianlParameters = new ArrayList();

    //Previous Pregnancy History
    BirthCertificateController ctlPastObstetricHistory = new BirthCertificateController();
    BOBirthCertificate PastObstetricHistoryBO = new BOBirthCertificate();
    List<BOBirthCertificate> listPastObstetricHistory = new ArrayList();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAgeGender = new javax.swing.JTextField();
        txtWard = new javax.swing.JTextField();
        txtAdmissionNumber = new javax.swing.JTextField();
        txtBed = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPrimaryPhy = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPlNo = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        txtBloodGroup = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        txtHusbandName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDepartment = new javax.swing.JTextField();
        txtOccupation = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtEducation = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCongentalAnamoly = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtFamilyHistory = new javax.swing.JTextArea();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtMedSurgHis = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        txtDrugAllergy = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtGpePollar = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtThyroid = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtBreast = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtVaricoseVeins = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtG = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtMc = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtContraception = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtP = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        txtYearsMarried = new org.jdesktop.swingx.JXDatePicker();
        txtA = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        txtFundalHeight = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtFoetalHeart = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtSys = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txtWeeksByDates = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtOedema = new javax.swing.JTextField();
        cboLie = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        txtNextVisitDate = new org.jdesktop.swingx.JXDatePicker();
        cboPres = new javax.swing.JComboBox<>();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblAntenatalPatVisit = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        txtLMP = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtEdd = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtUsg = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        cboRiskFactor = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAdvised = new javax.swing.JTextArea();
        jPanel21 = new javax.swing.JPanel();
        btnSaveAntenatalVisit = new javax.swing.JButton();
        btnClearAntenatalVisit = new javax.swing.JButton();
        btnExit2 = new javax.swing.JButton();
        btnFianlSign = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtLmp = new javax.swing.JTextField();
        txtAc = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtEdd1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtGestationSac = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        cboCervix = new javax.swing.JComboBox<>();
        cboPlacenta = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        cboGrade = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        cboCord = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        cboAmnioticFluidVolume = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        txtNuchalTranslucency = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtHeadCircumference = new javax.swing.JTextField();
        txtUltrasoundEdd = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConclusion = new javax.swing.JTextArea();
        cboFetus = new javax.swing.JComboBox<>();
        cboFca = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        txtBiparietalDiameter = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtCrl = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        cboLie1 = new javax.swing.JComboBox<>();
        cboPresentation = new javax.swing.JComboBox<>();
        cboLiquor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtFemur = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblGyaneeParameter = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        btnSaveGynae = new javax.swing.JButton();
        btnClearGynae = new javax.swing.JButton();
        btnExitGynae = new javax.swing.JButton();
        btnFianlSignGynae = new javax.swing.JButton();
        btnCopyGynae = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        pnlUserDetail1 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        cboGender = new javax.swing.JComboBox<>();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        txtComplications = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPresentAddress = new javax.swing.JTextArea();
        txtDob = new org.jdesktop.swingx.JXDatePicker();
        jLabel71 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        txtMethodIndecation = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        txtLabour = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        txtBirthWeight = new javax.swing.JTextField();
        txtPregnancyWeeks = new javax.swing.JTextField();
        txtDelivery = new javax.swing.JTextField();
        cboPlace = new javax.swing.JComboBox<>();
        jLabel75 = new javax.swing.JLabel();
        txtBFVaccination = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        txtPresentStatus = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        txtBabyName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblPastObstetricHistory = new javax.swing.JTable();
        pnlUserDetail2 = new javax.swing.JPanel();
        btnRegisterPOH = new javax.swing.JButton();
        btnEditPOH = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();
        btnClearPOH = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        txtHusbandName1 = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        txtDepartment1 = new javax.swing.JTextField();
        txtOccupation1 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        txtEducation1 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        txtCongentalAnamoly1 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        txtDrugAllergy1 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        txtGpePollar1 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        txtThyroid1 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        txtBreast1 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        txtVaricoseVeins1 = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        txtG1 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        txtMc1 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        txtContraception1 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        txtP1 = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        txtYearsMarried1 = new org.jdesktop.swingx.JXDatePicker();
        txtA1 = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtFamilyHistory1 = new javax.swing.JTextArea();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtMedSurgHis1 = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnFinal = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

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

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Patient Id : ");

        txtPatientName.setEditable(false);

        txtPatientId.setEditable(false);
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
        jLabel10.setText("Admission Number : ");

        txtAgeGender.setEditable(false);

        txtWard.setEditable(false);

        txtAdmissionNumber.setEditable(false);

        txtBed.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Physician Name : ");

        txtPrimaryPhy.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Client name : ");

        txtClient.setEditable(false);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("PL Number : ");

        txtPlNo.setEditable(false);

        txtContactNo.setEditable(false);

        txtAddress.setEditable(false);
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(102, 0, 0));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel78.setText("Patient name : ");

        jLabel79.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(102, 0, 0));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel79.setText("Ward name : ");

        jLabel80.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(102, 0, 0));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel80.setText("Age / Gender : ");

        jLabel81.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(102, 0, 0));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel81.setText("Bed : ");

        jLabel82.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(102, 0, 0));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel82.setText("Address : ");

        jLabel83.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(102, 0, 0));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel83.setText("Contact Number : ");

        jLabel85.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(102, 0, 0));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel85.setText("Blood Group : ");

        txtBloodGroup.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdmissionNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(txtPatientId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(txtPrimaryPhy)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClient)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAgeGender, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(txtContactNo))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPlNo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBed))
                            .addComponent(txtBloodGroup))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAddress)
                        .addGap(8, 8, 8))))
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
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAdmissionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPlNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parameters List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtHusbandName.setEditable(false);
        txtHusbandName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHusbandNameMouseClicked(evt);
            }
        });
        txtHusbandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHusbandNameActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Department : ");

        txtDepartment.setEditable(false);
        txtDepartment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDepartmentMouseClicked(evt);
            }
        });
        txtDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentActionPerformed(evt);
            }
        });

        txtOccupation.setEditable(false);
        txtOccupation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOccupationMouseClicked(evt);
            }
        });
        txtOccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOccupationActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Education : ");

        txtEducation.setEditable(false);
        txtEducation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEducationMouseClicked(evt);
            }
        });
        txtEducation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEducationActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Cong. Anamoly : ");

        txtCongentalAnamoly.setEditable(false);
        txtCongentalAnamoly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCongentalAnamolyMouseClicked(evt);
            }
        });
        txtCongentalAnamoly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCongentalAnamolyActionPerformed(evt);
            }
        });

        jPanel18.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Family History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtFamilyHistory.setEditable(false);
        txtFamilyHistory.setColumns(20);
        txtFamilyHistory.setLineWrap(true);
        txtFamilyHistory.setRows(5);
        jScrollPane10.setViewportView(txtFamilyHistory);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medical/ Surgical History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtMedSurgHis.setEditable(false);
        txtMedSurgHis.setColumns(20);
        txtMedSurgHis.setLineWrap(true);
        txtMedSurgHis.setRows(5);
        jScrollPane11.setViewportView(txtMedSurgHis);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Drug/ Allergy : ");

        txtDrugAllergy.setEditable(false);
        txtDrugAllergy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDrugAllergyMouseClicked(evt);
            }
        });
        txtDrugAllergy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrugAllergyActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("GPE: Pollar : ");

        txtGpePollar.setEditable(false);
        txtGpePollar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGpePollarMouseClicked(evt);
            }
        });
        txtGpePollar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGpePollarActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Thyroid : ");

        txtThyroid.setEditable(false);
        txtThyroid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtThyroidMouseClicked(evt);
            }
        });
        txtThyroid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThyroidActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Breast : ");

        txtBreast.setEditable(false);
        txtBreast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBreastMouseClicked(evt);
            }
        });
        txtBreast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBreastActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Varicose Veins : ");

        txtVaricoseVeins.setEditable(false);
        txtVaricoseVeins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtVaricoseVeinsMouseClicked(evt);
            }
        });
        txtVaricoseVeins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVaricoseVeinsActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("G : ");

        txtG.setEditable(false);
        txtG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGMouseClicked(evt);
            }
        });
        txtG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("M / C : ");

        txtMc.setEditable(false);
        txtMc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMcMouseClicked(evt);
            }
        });
        txtMc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMcActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Contraception : ");

        txtContraception.setEditable(false);
        txtContraception.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraceptionMouseClicked(evt);
            }
        });
        txtContraception.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraceptionActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("P : ");

        txtP.setEditable(false);
        txtP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPMouseClicked(evt);
            }
        });
        txtP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("A : ");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Husband Name : ");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Years Married : ");

        jLabel84.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(102, 0, 0));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel84.setText("Occupation : ");

        txtYearsMarried.setEditable(false);
        txtYearsMarried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearsMarriedActionPerformed(evt);
            }
        });

        txtA.setEditable(false);
        txtA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAMouseClicked(evt);
            }
        });
        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtG, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtA))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtYearsMarried, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtVaricoseVeins, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                        .addComponent(txtGpePollar)
                                        .addComponent(txtHusbandName, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtOccupation, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtDrugAllergy, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtCongentalAnamoly, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtEducation, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtDepartment, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtThyroid, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtBreast, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtMc))
                                    .addComponent(txtContraception, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHusbandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYearsMarried, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEducation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCongentalAnamoly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDrugAllergy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThyroid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBreast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGpePollar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtVaricoseVeins)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraception, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel16.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel50.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 0, 0));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel50.setText("Fundal Height :  ");

        txtFundalHeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFundalHeightMouseClicked(evt);
            }
        });
        txtFundalHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFundalHeightActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 0, 0));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel51.setText("Foetal Heart : ");

        txtFoetalHeart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFoetalHeartMouseClicked(evt);
            }
        });
        txtFoetalHeart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoetalHeartActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 0, 0));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel52.setText("B.P (SYS) :  ");

        txtSys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSysMouseClicked(evt);
            }
        });
        txtSys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSysActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 0, 0));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel53.setText("Next Visit : ");

        jLabel54.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(102, 0, 0));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel54.setText("Weight : ");

        txtWeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWeightMouseClicked(evt);
            }
        });
        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 0, 0));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel55.setText("B.P (DIAS): ");

        txtDias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDiasMouseClicked(evt);
            }
        });
        txtDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 0, 0));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel56.setText("Weeks By Dates : ");

        txtWeeksByDates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWeeksByDatesMouseClicked(evt);
            }
        });
        txtWeeksByDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeeksByDatesActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 0, 0));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel57.setText("Lie : ");

        jLabel58.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 0, 0));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel58.setText("Oedema : ");

        txtOedema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOedemaMouseClicked(evt);
            }
        });
        txtOedema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOedemaActionPerformed(evt);
            }
        });

        cboLie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "L", "O", "T" }));
        cboLie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLieActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(102, 0, 0));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel59.setText("Presentation : ");

        txtNextVisitDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNextVisitDateActionPerformed(evt);
            }
        });

        cboPres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "B","C" }));
        cboPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFundalHeight)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboLie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOedema)
                    .addComponent(txtSys)
                    .addComponent(txtWeight)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFoetalHeart, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboPres, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtWeeksByDates, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDias, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNextVisitDate, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWeeksByDates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboLie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFoetalHeart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFundalHeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNextVisitDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOedema))
                .addGap(8, 8, 8))
        );

        jPanel17.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Antenatal Visit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblAntenatalPatVisit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Sr.No","Patient Id", "Patient Name", "Consultancy Id","Final By","Final Date"
            }
        ));
        tblAntenatalPatVisit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAntenatalPatVisitMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAntenatalPatVisitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAntenatalPatVisitMouseReleased(evt);
            }
        });
        tblAntenatalPatVisit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAntenatalPatVisitKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(tblAntenatalPatVisit);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel14.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel44.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("LMP :");

        txtLMP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLMPMouseClicked(evt);
            }
        });
        txtLMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLMPActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 0, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("EDD :");

        txtEdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEddMouseClicked(evt);
            }
        });
        txtEdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEddActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 0, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("USG ED :");

        txtUsg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsgMouseClicked(evt);
            }
        });
        txtUsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsgActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 0, 0));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("Risk Factors :");

        txtRemarks.setColumns(20);
        txtRemarks.setRows(5);
        jScrollPane3.setViewportView(txtRemarks);

        cboRiskFactor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", " 1 "," 2 ", " 3", " 4" }));
        cboRiskFactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRiskFactorActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 0, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("Remarks :");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsg, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(txtLMP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEdd)
                            .addComponent(cboRiskFactor, 0, 83, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboRiskFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel20.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Advised", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel20.setForeground(new java.awt.Color(102, 0, 0));

        txtAdvised.setColumns(20);
        txtAdvised.setRows(5);
        jScrollPane4.setViewportView(txtAdvised);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane4)
                .addGap(5, 5, 5))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jPanel21.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSaveAntenatalVisit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSaveAntenatalVisit.setForeground(new java.awt.Color(51, 102, 0));
        btnSaveAntenatalVisit.setText("Save");
        btnSaveAntenatalVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAntenatalVisitActionPerformed(evt);
            }
        });

        btnClearAntenatalVisit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClearAntenatalVisit.setText("Clear");
        btnClearAntenatalVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAntenatalVisitActionPerformed(evt);
            }
        });

        btnExit2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit2.setForeground(new java.awt.Color(153, 0, 0));
        btnExit2.setText("Exit");
        btnExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit2ActionPerformed(evt);
            }
        });

        btnFianlSign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFianlSign.setForeground(new java.awt.Color(0, 51, 153));
        btnFianlSign.setText("Final Sign");
        btnFianlSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFianlSignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btnClearAntenatalVisit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSaveAntenatalVisit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFianlSign, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveAntenatalVisit)
                    .addComponent(btnClearAntenatalVisit)
                    .addComponent(btnExit2)
                    .addComponent(btnFianlSign))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Antenatal Visit", jPanel4);

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parameters Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText(" Fetus : ");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText(" Liquor : ");

        jLabel32.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Lie : ");

        jLabel33.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText(" Placenta : ");

        jLabel34.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 0, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText(" LMP : ");

        txtLmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLmpMouseClicked(evt);
            }
        });
        txtLmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLmpActionPerformed(evt);
            }
        });

        txtAc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAcMouseClicked(evt);
            }
        });
        txtAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 0, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText(" EDD : ");

        txtEdd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEdd1MouseClicked(evt);
            }
        });
        txtEdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdd1ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel36.setText(" Ultrasound E.D.D : ");

        jLabel37.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 0, 0));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("FCA : ");

        txtGestationSac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGestationSacMouseClicked(evt);
            }
        });
        txtGestationSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGestationSacActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 0, 0));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText(" CERVIX : ");

        cboCervix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Closed","Open"}));
        cboCervix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCervixActionPerformed(evt);
            }
        });

        cboPlacenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Ant","Post","Fundal","Previa","Partial Previa","Low Lying"}));
        cboPlacenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPlacentaActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 0, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText(" Grade : ");

        cboGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","0","1","2","3"}));
        cboGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGradeActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 0, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("CORD : ");

        cboCord.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","3V","2V"}));
        cboCord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCordActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 0, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText(" Amniotic Fluid Volume :");

        cboAmnioticFluidVolume.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Normal","High Normal","Increased","Decreased"}));
        cboAmnioticFluidVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAmnioticFluidVolumeActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText(" Nuchal Translucency : ");

        txtNuchalTranslucency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNuchalTranslucencyMouseClicked(evt);
            }
        });
        txtNuchalTranslucency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuchalTranslucencyActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 0, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel43.setText(" AC : ");

        jLabel45.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 0, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel45.setText(" Head Circumference : ");

        txtHeadCircumference.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHeadCircumferenceMouseClicked(evt);
            }
        });
        txtHeadCircumference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeadCircumferenceActionPerformed(evt);
            }
        });

        txtUltrasoundEdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUltrasoundEddActionPerformed(evt);
            }
        });

        txtConclusion.setColumns(20);
        txtConclusion.setRows(5);
        txtConclusion.setText("Conclusion/ Remarks");
        txtConclusion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConclusionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtConclusion);

        cboFetus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select","1","2","3"}));
        cboFetus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFetusActionPerformed(evt);
            }
        });

        cboFca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select","Normal","Abnormal"}));
        cboFca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFcaActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(102, 0, 0));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel60.setText(" Biparietal diameter :");

        txtBiparietalDiameter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBiparietalDiameterMouseClicked(evt);
            }
        });
        txtBiparietalDiameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBiparietalDiameterActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(102, 0, 0));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel61.setText(" CRL : ");

        txtCrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCrlActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(102, 0, 0));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel62.setText("Presentation : ");

        cboLie1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select","L","O","T"}));
        cboLie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLie1ActionPerformed(evt);
            }
        });

        cboPresentation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select","B","C"}));
        cboPresentation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPresentationActionPerformed(evt);
            }
        });

        cboLiquor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Adequate", ">", "<" }));
        cboLiquor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLiquorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText(" Femur Length :");

        txtFemur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFemurActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 0, 0));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel63.setText(" Gestation Sac : ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboLiquor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboPlacenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBiparietalDiameter)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtGestationSac, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboFetus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboLie1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtLmp)
                                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboCord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAc))
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboPresentation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboFca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEdd1)
                                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                            .addComponent(cboAmnioticFluidVolume, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFemur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCrl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHeadCircumference, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNuchalTranslucency, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboCervix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUltrasoundEdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboFetus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboLie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboPresentation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboFca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboLiquor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAmnioticFluidVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBiparietalDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFemur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboPlacenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCrl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGestationSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeadCircumference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNuchalTranslucency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboCervix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboCord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUltrasoundEdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Previous Scans", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblGyaneeParameter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Sr.","LMP","EDD", "Fetus", "FCA","HC", "AC",
                "Lie Presentation", "AFI", "BPD"
            }
        ));
        tblGyaneeParameter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGyaneeParameterMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblGyaneeParameterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblGyaneeParameterMouseReleased(evt);
            }
        });
        tblGyaneeParameter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblGyaneeParameterKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblGyaneeParameter);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9)
        );

        jPanel15.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSaveGynae.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSaveGynae.setForeground(new java.awt.Color(51, 102, 0));
        btnSaveGynae.setText("Save");
        btnSaveGynae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveGynaeActionPerformed(evt);
            }
        });

        btnClearGynae.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClearGynae.setText("Clear");
        btnClearGynae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearGynaeActionPerformed(evt);
            }
        });

        btnExitGynae.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExitGynae.setForeground(new java.awt.Color(153, 0, 0));
        btnExitGynae.setText("Exit");
        btnExitGynae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitGynaeActionPerformed(evt);
            }
        });

        btnFianlSignGynae.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFianlSignGynae.setForeground(new java.awt.Color(0, 51, 153));
        btnFianlSignGynae.setText("Final Sign");
        btnFianlSignGynae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFianlSignGynaeActionPerformed(evt);
            }
        });

        btnCopyGynae.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCopyGynae.setForeground(new java.awt.Color(51, 102, 0));
        btnCopyGynae.setText("Copy");
        btnCopyGynae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyGynaeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClearGynae, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSaveGynae, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFianlSignGynae, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopyGynae, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExitGynae, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearGynae)
                    .addComponent(btnSaveGynae)
                    .addComponent(btnFianlSignGynae)
                    .addComponent(btnCopyGynae)
                    .addComponent(btnExitGynae))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gynae Parameter", jPanel5);

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pnlUserDetail1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail1.setForeground(java.awt.SystemColor.activeCaption);

        jLabel64.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 0, 0));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel64.setText("Gender : ");

        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Male","Female"}));
        cboGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGenderActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 0, 0));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel65.setText("DOB : ");

        jLabel66.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 0, 0));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel66.setText("Delivery : ");

        jLabel67.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(102, 0, 0));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel67.setText("Pregnancy Weeks : ");

        jLabel68.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(102, 0, 0));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel68.setText("Place : ");

        jLabel69.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(102, 0, 0));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel69.setText(" Present Address  : ");

        jLabel70.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(102, 0, 0));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel70.setText("Complications : ");

        txtComplications.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtComplications.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtComplicationsMouseReleased(evt);
            }
        });
        txtComplications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplicationsActionPerformed(evt);
            }
        });

        txtPresentAddress.setColumns(20);
        txtPresentAddress.setRows(5);
        jScrollPane2.setViewportView(txtPresentAddress);

        txtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDobActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(102, 0, 0));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel71.setText("Age : ");

        txtAge.setEditable(false);
        txtAge.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtAgeMouseReleased(evt);
            }
        });
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(102, 0, 0));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel72.setText("Method/Indication : ");

        txtMethodIndecation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMethodIndecation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtMethodIndecationMouseReleased(evt);
            }
        });
        txtMethodIndecation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMethodIndecationActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(102, 0, 0));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel73.setText("Labour : ");

        txtLabour.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtLabour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtLabourMouseReleased(evt);
            }
        });
        txtLabour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabourActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(102, 0, 0));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel74.setText("Birth Weight (pound): ");

        txtBirthWeight.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBirthWeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBirthWeightMouseReleased(evt);
            }
        });
        txtBirthWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthWeightActionPerformed(evt);
            }
        });

        txtPregnancyWeeks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPregnancyWeeks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPregnancyWeeksMouseReleased(evt);
            }
        });
        txtPregnancyWeeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPregnancyWeeksActionPerformed(evt);
            }
        });

        txtDelivery.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtDeliveryMouseReleased(evt);
            }
        });
        txtDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeliveryActionPerformed(evt);
            }
        });

        cboPlace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Hospital","Home"}));
        cboPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPlaceActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(102, 0, 0));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel75.setText("B/F Vaccination : ");

        txtBFVaccination.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBFVaccination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBFVaccinationMouseReleased(evt);
            }
        });
        txtBFVaccination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBFVaccinationActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(102, 0, 0));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel76.setText("Present Status : ");

        txtPresentStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPresentStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPresentStatusMouseReleased(evt);
            }
        });
        txtPresentStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPresentStatusActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(102, 0, 0));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel77.setText("Baby Name : ");

        txtBabyName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBabyName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBabyNameMouseReleased(evt);
            }
        });
        txtBabyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBabyNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail1Layout = new javax.swing.GroupLayout(pnlUserDetail1);
        pnlUserDetail1.setLayout(pnlUserDetail1Layout);
        pnlUserDetail1Layout.setHorizontalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetail1Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBabyName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlUserDetail1Layout.createSequentialGroup()
                                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAge)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlUserDetail1Layout.createSequentialGroup()
                                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPregnancyWeeks, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDelivery)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtMethodIndecation, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlUserDetail1Layout.createSequentialGroup()
                                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLabour)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBFVaccination, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtBirthWeight)
                                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtComplications)))
                            .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPresentStatus))
                        .addContainerGap())))
        );
        pnlUserDetail1Layout.setVerticalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txtBabyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDelivery)
                    .addComponent(txtPregnancyWeeks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMethodIndecation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComplications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLabour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBirthWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBFVaccination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPresentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblPastObstetricHistory.setBackground(java.awt.SystemColor.activeCaption);
        tblPastObstetricHistory.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblPastObstetricHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Crtd Date","Crtd By","Name","Method/Indication","Complications"}
        ));
        tblPastObstetricHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPastObstetricHistoryMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPastObstetricHistoryMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPastObstetricHistoryMouseReleased(evt);
            }
        });
        tblPastObstetricHistory.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblPastObstetricHistoryPropertyChange(evt);
            }
        });
        tblPastObstetricHistory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblPastObstetricHistoryKeyPressed(evt);
            }
        });
        jScrollPane17.setViewportView(tblPastObstetricHistory);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
        );

        pnlUserDetail2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail2.setForeground(java.awt.SystemColor.activeCaption);

        btnRegisterPOH.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegisterPOH.setText("Register");
        btnRegisterPOH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterPOHActionPerformed(evt);
            }
        });

        btnEditPOH.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditPOH.setText("Update");
        btnEditPOH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPOHActionPerformed(evt);
            }
        });

        btnExit1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit1.setForeground(new java.awt.Color(204, 51, 0));
        btnExit1.setText("Exit");
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        btnClearPOH.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClearPOH.setText("Clear");
        btnClearPOH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearPOHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail2Layout = new javax.swing.GroupLayout(pnlUserDetail2);
        pnlUserDetail2.setLayout(pnlUserDetail2Layout);
        pnlUserDetail2Layout.setHorizontalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetail2Layout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(btnClearPOH, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditPOH, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnRegisterPOH, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        pnlUserDetail2Layout.setVerticalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditPOH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClearPOH)
                    .addComponent(btnRegisterPOH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlUserDetail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(pnlUserDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlUserDetail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUserDetail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Previous Pregnancy History", jPanel7);

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel22.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parameters List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtHusbandName1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHusbandName1MouseClicked(evt);
            }
        });
        txtHusbandName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHusbandName1ActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(102, 0, 0));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel86.setText("Department : ");

        txtDepartment1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDepartment1MouseClicked(evt);
            }
        });
        txtDepartment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartment1ActionPerformed(evt);
            }
        });

        txtOccupation1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOccupation1MouseClicked(evt);
            }
        });
        txtOccupation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOccupation1ActionPerformed(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(102, 0, 0));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel87.setText("Education : ");

        txtEducation1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEducation1MouseClicked(evt);
            }
        });
        txtEducation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEducation1ActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(102, 0, 0));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel88.setText("Cong. Anamoly : ");

        txtCongentalAnamoly1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCongentalAnamoly1MouseClicked(evt);
            }
        });
        txtCongentalAnamoly1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCongentalAnamoly1ActionPerformed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(102, 0, 0));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel89.setText("Drug/ Allergy : ");

        txtDrugAllergy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDrugAllergy1MouseClicked(evt);
            }
        });
        txtDrugAllergy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrugAllergy1ActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(102, 0, 0));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel90.setText("GPE: Pollar : ");

        txtGpePollar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGpePollar1MouseClicked(evt);
            }
        });
        txtGpePollar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGpePollar1ActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(102, 0, 0));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel91.setText("Thyroid : ");

        txtThyroid1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtThyroid1MouseClicked(evt);
            }
        });
        txtThyroid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThyroid1ActionPerformed(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(102, 0, 0));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel92.setText("Breast : ");

        txtBreast1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBreast1MouseClicked(evt);
            }
        });
        txtBreast1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBreast1ActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(102, 0, 0));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel93.setText("Varicose Veins : ");

        txtVaricoseVeins1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtVaricoseVeins1MouseClicked(evt);
            }
        });
        txtVaricoseVeins1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVaricoseVeins1ActionPerformed(evt);
            }
        });

        jLabel94.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(102, 0, 0));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel94.setText("G : ");

        txtG1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtG1MouseClicked(evt);
            }
        });
        txtG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtG1ActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(102, 0, 0));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel95.setText("M / C : ");

        txtMc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMc1MouseClicked(evt);
            }
        });
        txtMc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMc1ActionPerformed(evt);
            }
        });

        jLabel96.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(102, 0, 0));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel96.setText("Contraception : ");

        txtContraception1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraception1MouseClicked(evt);
            }
        });
        txtContraception1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraception1ActionPerformed(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(102, 0, 0));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel97.setText("P : ");

        txtP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtP1MouseClicked(evt);
            }
        });
        txtP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtP1ActionPerformed(evt);
            }
        });

        jLabel98.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(102, 0, 0));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel98.setText("A : ");

        jLabel99.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(102, 0, 0));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel99.setText("Husband Name : ");

        jLabel100.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(102, 0, 0));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel100.setText("Years Married : ");

        jLabel101.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(102, 0, 0));
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel101.setText("Occupation : ");

        txtYearsMarried1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearsMarried1ActionPerformed(evt);
            }
        });

        txtA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtA1MouseClicked(evt);
            }
        });
        txtA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtA1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtG1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtP1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtA1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel88, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel100, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtYearsMarried1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtVaricoseVeins1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                        .addComponent(txtGpePollar1)
                                        .addComponent(txtHusbandName1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtOccupation1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtDrugAllergy1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtCongentalAnamoly1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtEducation1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtDepartment1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtThyroid1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtBreast1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtMc1))
                                    .addComponent(txtContraception1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHusbandName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYearsMarried1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOccupation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepartment1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEducation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCongentalAnamoly1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDrugAllergy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThyroid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBreast1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMc1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGpePollar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtVaricoseVeins1)
                    .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraception1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel23.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Family History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtFamilyHistory1.setColumns(20);
        txtFamilyHistory1.setLineWrap(true);
        txtFamilyHistory1.setRows(5);
        jScrollPane12.setViewportView(txtFamilyHistory1);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );

        jPanel24.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medical/ Surgical History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtMedSurgHis1.setColumns(20);
        txtMedSurgHis1.setLineWrap(true);
        txtMedSurgHis1.setRows(5);
        jScrollPane13.setViewportView(txtMedSurgHis1);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 102, 0));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnFinal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFinal.setForeground(new java.awt.Color(0, 153, 153));
        btnFinal.setText("Final");
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnSave)
                    .addComponent(btnFinal)
                    .addComponent(btnExit))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Current Pregnancy Information", jPanel13);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPatientIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdMouseClicked

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtHusbandNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHusbandNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHusbandNameMouseClicked

    private void txtHusbandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHusbandNameActionPerformed
        // TODO add your handling code here:
        txtYearsMarried.requestFocus();
    }//GEN-LAST:event_txtHusbandNameActionPerformed

    private void txtDepartmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDepartmentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartmentMouseClicked

    private void txtDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentActionPerformed
        // TODO add your handling code here:
        txtYearsMarried.requestFocus();
    }//GEN-LAST:event_txtDepartmentActionPerformed

    private void txtOccupationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOccupationMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOccupationMouseClicked

    private void txtOccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOccupationActionPerformed
        // TODO add your handling code here:
        txtEducation.requestFocus();
    }//GEN-LAST:event_txtOccupationActionPerformed

    private void txtEducationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEducationMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEducationMouseClicked

    private void txtEducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEducationActionPerformed
        // TODO add your handling code here:
        txtCongentalAnamoly.requestFocus();
    }//GEN-LAST:event_txtEducationActionPerformed

    private void txtCongentalAnamolyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCongentalAnamolyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCongentalAnamolyMouseClicked

    private void txtCongentalAnamolyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCongentalAnamolyActionPerformed
        // TODO add your handling code here:
        txtDrugAllergy.requestFocus();
    }//GEN-LAST:event_txtCongentalAnamolyActionPerformed

    private void txtDrugAllergyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDrugAllergyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrugAllergyMouseClicked

    private void txtDrugAllergyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrugAllergyActionPerformed
        // TODO add your handling code here:
        txtThyroid.requestFocus();
    }//GEN-LAST:event_txtDrugAllergyActionPerformed

    private void txtGpePollarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGpePollarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGpePollarMouseClicked

    private void txtGpePollarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGpePollarActionPerformed
        // TODO add your handling code here:
        txtVaricoseVeins.requestFocus();
    }//GEN-LAST:event_txtGpePollarActionPerformed

    private void txtThyroidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtThyroidMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThyroidMouseClicked

    private void txtThyroidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThyroidActionPerformed
        // TODO add your handling code here:
        txtBreast.requestFocus();
    }//GEN-LAST:event_txtThyroidActionPerformed

    private void txtBreastMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBreastMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBreastMouseClicked

    private void txtBreastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBreastActionPerformed
        // TODO add your handling code here:
        txtMc.requestFocus();
    }//GEN-LAST:event_txtBreastActionPerformed

    private void txtVaricoseVeinsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVaricoseVeinsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVaricoseVeinsMouseClicked

    private void txtVaricoseVeinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVaricoseVeinsActionPerformed
        // TODO add your handling code here:
        txtG.requestFocus();
    }//GEN-LAST:event_txtVaricoseVeinsActionPerformed

    private void txtGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGMouseClicked

    private void txtGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGActionPerformed
        // TODO add your handling code here:
        txtP.requestFocus();
    }//GEN-LAST:event_txtGActionPerformed

    private void txtMcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMcMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMcMouseClicked

    private void txtMcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMcActionPerformed
        // TODO add your handling code here:
        txtGpePollar.requestFocus();
    }//GEN-LAST:event_txtMcActionPerformed

    private void txtContraceptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraceptionMouseClicked
        // TODO add your handling code here:
        txtFamilyHistory.requestFocus();
    }//GEN-LAST:event_txtContraceptionMouseClicked

    private void txtContraceptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraceptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraceptionActionPerformed

    private void txtPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPMouseClicked

    private void txtPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPActionPerformed
        // TODO add your handling code here:
        txtA.requestFocus();
    }//GEN-LAST:event_txtPActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (!chkFields()) {
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Save. \nDo you want to Save?");
        if (confirmation != 0) {
            return;
        }
        setDataInObject();
        antenatalPatientObj.setIsFinal("N");
        antenatalPatientObj.setFinalBy("");
        antenatalPatientObj.setFinalDate("''");
        antenatalPatientObj.setFinalTerminalId("");
        saveAntenatalPatientInfo("Save");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
        // TODO add your handling code here:
        if (!chkFields()) {
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Final. \nDo you want to Final?");
        if (confirmation != 0) {
            return;
        }
        setDataInObject();
        antenatalPatientObj.setIsFinal("Y");
        antenatalPatientObj.setFinalBy(Constants.userId);
        antenatalPatientObj.setFinalDate(Constants.today);
        antenatalPatientObj.setFinalTerminalId(Constants.terminalId);
        saveAntenatalPatientInfo("Final");
    }//GEN-LAST:event_btnFinalActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtFundalHeightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFundalHeightMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundalHeightMouseClicked

    private void txtFundalHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFundalHeightActionPerformed
        // TODO add your handling code here:
        txtFoetalHeart.requestFocus();
    }//GEN-LAST:event_txtFundalHeightActionPerformed

    private void txtFoetalHeartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFoetalHeartMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoetalHeartMouseClicked

    private void txtFoetalHeartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoetalHeartActionPerformed
        // TODO add your handling code here:
        txtOedema.requestFocus();
    }//GEN-LAST:event_txtFoetalHeartActionPerformed

    private void txtSysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSysMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSysMouseClicked

    private void txtSysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSysActionPerformed
        // TODO add your handling code here:
        txtDias.requestFocus();
    }//GEN-LAST:event_txtSysActionPerformed

    private void txtWeightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWeightMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightMouseClicked

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
        txtWeeksByDates.requestFocus();
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtDiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasMouseClicked

    private void txtDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasActionPerformed
        // TODO add your handling code here:
        txtWeight.requestFocus();
    }//GEN-LAST:event_txtDiasActionPerformed

    private void txtWeeksByDatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWeeksByDatesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeeksByDatesMouseClicked

    private void txtWeeksByDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeeksByDatesActionPerformed
        // TODO add your handling code here:
        cboLie.requestFocus();
    }//GEN-LAST:event_txtWeeksByDatesActionPerformed

    private void txtOedemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOedemaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOedemaMouseClicked

    private void txtOedemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOedemaActionPerformed
        // TODO add your handling code here:
        txtNextVisitDate.requestFocus();
    }//GEN-LAST:event_txtOedemaActionPerformed

    private void cboLieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLieActionPerformed
        // TODO add your handling code here:
        cboPres.requestFocus();
    }//GEN-LAST:event_cboLieActionPerformed

    private void txtNextVisitDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNextVisitDateActionPerformed
        // TODO add your handling code here:
        if (txtNextVisitDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Ultrasound E.D.D DD-MON-YY",
                    "Gaynee Parameter", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        nextVisitDate = dateFormat.format(txtNextVisitDate.getDate());
        txtAdvised.requestFocus();
    }//GEN-LAST:event_txtNextVisitDateActionPerformed

    private void cboPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPresActionPerformed
        // TODO add your handling code here:
        txtFundalHeight.requestFocus();
    }//GEN-LAST:event_cboPresActionPerformed

    private void tblAntenatalPatVisitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAntenatalPatVisitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAntenatalPatVisitMouseClicked

    private void tblAntenatalPatVisitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAntenatalPatVisitMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAntenatalPatVisitMousePressed

    private void tblAntenatalPatVisitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAntenatalPatVisitMouseReleased
        // TODO add your handling code here:  
        AntenatalVisitsBo chkAntenatalVisits = listAntenatalVisit.get(
                tblAntenatalPatVisit.getSelectedRow());
        setTableDataInTextBoxes(chkAntenatalVisits);
        btnSave.setEnabled(false);
        btnFianlSign.setEnabled(false);
        disableAntenatalVisitFields();
    }//GEN-LAST:event_tblAntenatalPatVisitMouseReleased

    private void tblAntenatalPatVisitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAntenatalPatVisitKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAntenatalPatVisitKeyReleased

    private void txtLMPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLMPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLMPMouseClicked

    private void txtLMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLMPActionPerformed
        // TODO add your handling code here:
        txtEdd.requestFocus();
    }//GEN-LAST:event_txtLMPActionPerformed

    private void txtEddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEddMouseClicked

    private void txtEddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEddActionPerformed
        // TODO add your handling code here:
        txtUsg.requestFocus();
    }//GEN-LAST:event_txtEddActionPerformed

    private void txtUsgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsgMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsgMouseClicked

    private void txtUsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsgActionPerformed
        // TODO add your handling code here:
        cboRiskFactor.requestFocus();
    }//GEN-LAST:event_txtUsgActionPerformed

    private void cboRiskFactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboRiskFactorActionPerformed
        // TODO add your handling code here:
        txtRemarks.requestFocus();
    }//GEN-LAST:event_cboRiskFactorActionPerformed

    private void btnSaveAntenatalVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAntenatalVisitActionPerformed
        // TODO add your handling code here:
        if (!chkFieldsAntenatalVisit()) {
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Save. \nDo you want to Save?");
        if (confirmation != 0) {
            return;
        }
        setSaveRecord();
        antenatalVisitsObj.setIsFinal("N");
        antenatalVisitsObj.setFinalBy("");
        antenatalVisitsObj.setFinalDate("''");
        antenatalVisitsObj.setFinalTerminalId("");
        saveRecords();
    }//GEN-LAST:event_btnSaveAntenatalVisitActionPerformed

    private void btnClearAntenatalVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAntenatalVisitActionPerformed
        // TODO add your handling code here:
        clearAntenatalVisit();
    }//GEN-LAST:event_btnClearAntenatalVisitActionPerformed

    private void btnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit2ActionPerformed

    private void btnFianlSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFianlSignActionPerformed
        // TODO add your handling code here:
        
        if (!chkFieldsAntenatalVisit()) {
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Final. \nDo you want to Final?");
        if (confirmation != 0) {
            return;
        }
        setSaveRecord();
        antenatalVisitsObj.setIsFinal("Y");
        antenatalVisitsObj.setFinalBy(Constants.userId);
        antenatalVisitsObj.setFinalDate(Constants.today);
        antenatalVisitsObj.setFinalTerminalId(Constants.terminalId);
        saveRecords();
    }//GEN-LAST:event_btnFianlSignActionPerformed

    private void txtLmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLmpMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLmpMouseClicked

    private void txtLmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLmpActionPerformed
        // TODO add your handling code here:
        txtEdd.requestFocus();
    }//GEN-LAST:event_txtLmpActionPerformed

    private void txtAcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAcMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcMouseClicked

    private void txtAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcActionPerformed
        // TODO add your handling code here:
        txtNuchalTranslucency.requestFocus();
    }//GEN-LAST:event_txtAcActionPerformed

    private void txtEdd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEdd1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdd1MouseClicked

    private void txtEdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdd1ActionPerformed
        // TODO add your handling code here:
        cboFetus.requestFocus();
    }//GEN-LAST:event_txtEdd1ActionPerformed

    private void txtGestationSacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGestationSacMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGestationSacMouseClicked

    private void txtGestationSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGestationSacActionPerformed
        txtHeadCircumference.requestFocus();
    }//GEN-LAST:event_txtGestationSacActionPerformed

    private void cboCervixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCervixActionPerformed
        // TODO add your handling code here:
        txtUltrasoundEdd.requestFocus();
    }//GEN-LAST:event_cboCervixActionPerformed

    private void cboPlacentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPlacentaActionPerformed
        txtCrl.requestFocus();
    }//GEN-LAST:event_cboPlacentaActionPerformed

    private void cboGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGradeActionPerformed
        cboCord.requestFocus();
    }//GEN-LAST:event_cboGradeActionPerformed

    private void cboCordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCordActionPerformed
        cboCervix.requestFocus();
    }//GEN-LAST:event_cboCordActionPerformed

    private void cboAmnioticFluidVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAmnioticFluidVolumeActionPerformed
        txtBiparietalDiameter.requestFocus();
    }//GEN-LAST:event_cboAmnioticFluidVolumeActionPerformed

    private void txtNuchalTranslucencyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuchalTranslucencyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuchalTranslucencyMouseClicked

    private void txtNuchalTranslucencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuchalTranslucencyActionPerformed
        cboGrade.requestFocus();
    }//GEN-LAST:event_txtNuchalTranslucencyActionPerformed

    private void txtHeadCircumferenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHeadCircumferenceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeadCircumferenceMouseClicked

    private void txtHeadCircumferenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeadCircumferenceActionPerformed
        txtAc.requestFocus();
    }//GEN-LAST:event_txtHeadCircumferenceActionPerformed

    private void txtUltrasoundEddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUltrasoundEddActionPerformed

        if (txtUltrasoundEdd.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Ultrasound E.D.D DD-MON-YY",
                    "Gaynee Parameter", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        eddDate = dateFormat.format(txtUltrasoundEdd.getDate());
        txtConclusion.requestFocus();
    }//GEN-LAST:event_txtUltrasoundEddActionPerformed

    private void txtConclusionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConclusionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConclusionMouseClicked

    private void cboFetusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFetusActionPerformed
        cboLie.requestFocus();
    }//GEN-LAST:event_cboFetusActionPerformed

    private void cboFcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFcaActionPerformed
        // TODO add your handling code here:
        cboLiquor.requestFocus();
    }//GEN-LAST:event_cboFcaActionPerformed

    private void txtBiparietalDiameterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBiparietalDiameterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBiparietalDiameterMouseClicked

    private void txtBiparietalDiameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBiparietalDiameterActionPerformed
        txtFemur.requestFocus();
    }//GEN-LAST:event_txtBiparietalDiameterActionPerformed

    private void txtCrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrlActionPerformed
        // TODO add your handling code here:
        txtGestationSac.requestFocus();
    }//GEN-LAST:event_txtCrlActionPerformed

    private void cboLie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLie1ActionPerformed
        // TODO add your handling code here:
        cboPresentation.requestFocus();
    }//GEN-LAST:event_cboLie1ActionPerformed

    private void cboPresentationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPresentationActionPerformed
        // TODO add your handling code here:
        cboFca.requestFocus();
    }//GEN-LAST:event_cboPresentationActionPerformed

    private void cboLiquorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLiquorActionPerformed
        // TODO add your handling code here:
        cboAmnioticFluidVolume.requestFocus();
    }//GEN-LAST:event_cboLiquorActionPerformed

    private void txtFemurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFemurActionPerformed
        // TODO add your handling code here:
        cboPlacenta.requestFocus();
    }//GEN-LAST:event_txtFemurActionPerformed

    private void tblGyaneeParameterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGyaneeParameterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGyaneeParameterMouseClicked

    private void tblGyaneeParameterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGyaneeParameterMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGyaneeParameterMousePressed

    private void tblGyaneeParameterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGyaneeParameterMouseReleased

        setBodyData(tblGyaneeParameter.getSelectedRow());
        setEnableFalse();
    }//GEN-LAST:event_tblGyaneeParameterMouseReleased

    private void tblGyaneeParameterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblGyaneeParameterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGyaneeParameterKeyReleased

    private void btnSaveGynaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveGynaeActionPerformed
        // TODO add your handling code here:
        if (!chkFieldsGynae()) {
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Save the Patient Parameters.");
        if (confirmation != 0) {
            return;
        }
        objSaveGynae.setIsFinal("N");
        objSaveGynae.setFianlBy("");
        objSaveGynae.setFianlDate("''");
        objSaveGynae.setFianlTerminalId("");
        saveRecordGynae();
        selectGayneeParameter(patientId, "");
    }//GEN-LAST:event_btnSaveGynaeActionPerformed

    private void btnClearGynaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearGynaeActionPerformed
        // TODO add your handling code here:
        clearGynae();
        btnSave.setEnabled(true);
        btnFianlSign.setEnabled(true);
    }//GEN-LAST:event_btnClearGynaeActionPerformed

    private void btnExitGynaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitGynaeActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitGynaeActionPerformed

    private void btnFianlSignGynaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFianlSignGynaeActionPerformed

        if (!chkFieldsGynae()) {
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Final the Patient Parameters.");
        if (confirmation != 0) {
            return;
        }
        objSaveGynae.setIsFinal("Y");
        objSaveGynae.setFianlBy(Constants.userId);
        objSaveGynae.setFianlDate("SYSDATE");
        objSaveGynae.setFianlTerminalId(Constants.terminalId);
        saveRecordGynae();
        selectGayneeParameter(patientId, "");
    }//GEN-LAST:event_btnFianlSignGynaeActionPerformed

    private void btnCopyGynaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyGynaeActionPerformed
        // TODO add your handling code here:
        copyParameter();
        selectGayneeParameter(patientId, "");
    }//GEN-LAST:event_btnCopyGynaeActionPerformed

    private void cboGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGenderActionPerformed

        txtPregnancyWeeks.requestFocus();

    }//GEN-LAST:event_cboGenderActionPerformed

    private void txtComplicationsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtComplicationsMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplicationsMouseReleased

    private void txtComplicationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplicationsActionPerformed
        // TODO add your handling code here:
        txtBFVaccination.requestFocus();
    }//GEN-LAST:event_txtComplicationsActionPerformed

    private void txtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDobActionPerformed

        if (txtDob.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the DOB DD-MON-YY",
                    "Birth Certificate", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat
                = new SimpleDateFormat("dd-MMM-yy");
        dob = dateFormat.format(txtDob.getDate());
        cboGender.requestFocus();
    }//GEN-LAST:event_txtDobActionPerformed

    private void txtAgeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeMouseReleased

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtMethodIndecationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMethodIndecationMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMethodIndecationMouseReleased

    private void txtMethodIndecationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMethodIndecationActionPerformed

        txtLabour.requestFocus();
    }//GEN-LAST:event_txtMethodIndecationActionPerformed

    private void txtLabourMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLabourMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLabourMouseReleased

    private void txtLabourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabourActionPerformed
        // TODO add your handling code here:
        txtComplications.requestFocus();
    }//GEN-LAST:event_txtLabourActionPerformed

    private void txtBirthWeightMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBirthWeightMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthWeightMouseReleased

    private void txtBirthWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthWeightActionPerformed
        // TODO add your handling code here:
        txtPresentStatus.requestFocus();
    }//GEN-LAST:event_txtBirthWeightActionPerformed

    private void txtPregnancyWeeksMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPregnancyWeeksMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPregnancyWeeksMouseReleased

    private void txtPregnancyWeeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPregnancyWeeksActionPerformed
        txtDelivery.requestFocus();
    }//GEN-LAST:event_txtPregnancyWeeksActionPerformed

    private void txtDeliveryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDeliveryMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeliveryMouseReleased

    private void txtDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeliveryActionPerformed

        cboPlace.requestFocus();
    }//GEN-LAST:event_txtDeliveryActionPerformed

    private void cboPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPlaceActionPerformed
        // TODO add your handling code here:
        txtMethodIndecation.requestFocus();
    }//GEN-LAST:event_cboPlaceActionPerformed

    private void txtBFVaccinationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBFVaccinationMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBFVaccinationMouseReleased

    private void txtBFVaccinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBFVaccinationActionPerformed
        // TODO add your handling code here:
        txtBirthWeight.requestFocus();
    }//GEN-LAST:event_txtBFVaccinationActionPerformed

    private void txtPresentStatusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPresentStatusMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPresentStatusMouseReleased

    private void txtPresentStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPresentStatusActionPerformed
        // TODO add your handling code here:
        txtPresentAddress.requestFocus();
    }//GEN-LAST:event_txtPresentStatusActionPerformed

    private void txtBabyNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBabyNameMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBabyNameMouseReleased

    private void txtBabyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBabyNameActionPerformed
       txtDob.requestFocus();
       
    }//GEN-LAST:event_txtBabyNameActionPerformed

    private void tblPastObstetricHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPastObstetricHistoryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPastObstetricHistoryMouseClicked

    private void tblPastObstetricHistoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPastObstetricHistoryMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPastObstetricHistoryMousePressed

    private void tblPastObstetricHistoryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPastObstetricHistoryMouseReleased

        btnRegisterPOH.setEnabled(false);
        btnEditPOH.setEnabled(true);
        setBodyDataPastObsHis(tblPastObstetricHistory.getSelectedRow());
        txtBabyName.requestFocus();
    }//GEN-LAST:event_tblPastObstetricHistoryMouseReleased

    private void tblPastObstetricHistoryPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblPastObstetricHistoryPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPastObstetricHistoryPropertyChange

    private void tblPastObstetricHistoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPastObstetricHistoryKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPastObstetricHistoryKeyPressed

    private void btnRegisterPOHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterPOHActionPerformed

        if (!chkFieldsPastObsHis()) {
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Register . \nDo you want to Register?");
        if (confirmation != 0) {
            return;
        }
        setPastObsHisInsertData();
        if (ctlPastObstetricHistory.insertBirthCertificate(PastObstetricHistoryBO)) {
            selectBirthCertificate();

            JOptionPane.showMessageDialog(null, "Records save Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save. \n"
                + "Kindly contact Administrator.");
        }
        clearPastObsHis();
    }//GEN-LAST:event_btnRegisterPOHActionPerformed

    private void btnEditPOHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPOHActionPerformed
        // TODO add your handling code here:
        if (!chkFieldsPastObsHis()) {
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Update Info. \nDo you want to Update?");
        if (confirmation != 0) {
            return;
        }
        setPastObsHisInsertData();
        if (ctlPastObstetricHistory.updateBirthCertificate(PastObstetricHistoryBO)) {
            selectBirthCertificate();
            JOptionPane.showMessageDialog(null, "Records Updated Successfully");

        } else {
            JOptionPane.showMessageDialog(null, "Unable to save. \n"
                + "Kindly contact Administrator.");
        }

        clearPastObsHis();
    }//GEN-LAST:event_btnEditPOHActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnClearPOHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearPOHActionPerformed

        clearPastObsHis();
    }//GEN-LAST:event_btnClearPOHActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtYearsMarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearsMarriedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearsMarriedActionPerformed

    private void txtHusbandName1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHusbandName1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHusbandName1MouseClicked

    private void txtHusbandName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHusbandName1ActionPerformed
        // TODO add your handling code here:
        txtYearsMarried1.requestFocus();
    }//GEN-LAST:event_txtHusbandName1ActionPerformed

    private void txtDepartment1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDepartment1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartment1MouseClicked

    private void txtDepartment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartment1ActionPerformed
        // TODO add your handling code here:
        txtEducation1.requestFocus();
    }//GEN-LAST:event_txtDepartment1ActionPerformed

    private void txtOccupation1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOccupation1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOccupation1MouseClicked

    private void txtOccupation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOccupation1ActionPerformed
        // TODO add your handling code here:
        txtDepartment1.requestFocus();
    }//GEN-LAST:event_txtOccupation1ActionPerformed

    private void txtEducation1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEducation1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEducation1MouseClicked

    private void txtEducation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEducation1ActionPerformed
        // TODO add your handling code here:
        txtCongentalAnamoly1.requestFocus();
    }//GEN-LAST:event_txtEducation1ActionPerformed

    private void txtCongentalAnamoly1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCongentalAnamoly1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCongentalAnamoly1MouseClicked

    private void txtCongentalAnamoly1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCongentalAnamoly1ActionPerformed
        // TODO add your handling code here:
        txtDrugAllergy1.requestFocus();
    }//GEN-LAST:event_txtCongentalAnamoly1ActionPerformed

    private void txtDrugAllergy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDrugAllergy1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrugAllergy1MouseClicked

    private void txtDrugAllergy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrugAllergy1ActionPerformed
        // TODO add your handling code here:
        txtThyroid1.requestFocus();
    }//GEN-LAST:event_txtDrugAllergy1ActionPerformed

    private void txtGpePollar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGpePollar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGpePollar1MouseClicked

    private void txtGpePollar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGpePollar1ActionPerformed
        // TODO add your handling code here:
        txtVaricoseVeins1.requestFocus();
    }//GEN-LAST:event_txtGpePollar1ActionPerformed

    private void txtThyroid1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtThyroid1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThyroid1MouseClicked

    private void txtThyroid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThyroid1ActionPerformed
        // TODO add your handling code here:
        txtBreast1.requestFocus();
    }//GEN-LAST:event_txtThyroid1ActionPerformed

    private void txtBreast1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBreast1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBreast1MouseClicked

    private void txtBreast1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBreast1ActionPerformed
        // TODO add your handling code here:
        txtMc1.requestFocus();
    }//GEN-LAST:event_txtBreast1ActionPerformed

    private void txtVaricoseVeins1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVaricoseVeins1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVaricoseVeins1MouseClicked

    private void txtVaricoseVeins1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVaricoseVeins1ActionPerformed
        // TODO add your handling code here:
        txtContraception1.requestFocus();
    }//GEN-LAST:event_txtVaricoseVeins1ActionPerformed

    private void txtG1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtG1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtG1MouseClicked

    private void txtG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtG1ActionPerformed
        // TODO add your handling code here:
        txtP1.requestFocus();
    }//GEN-LAST:event_txtG1ActionPerformed

    private void txtMc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMc1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMc1MouseClicked

    private void txtMc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMc1ActionPerformed
        // TODO add your handling code here:
        txtGpePollar1.requestFocus();
    }//GEN-LAST:event_txtMc1ActionPerformed

    private void txtContraception1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraception1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraception1MouseClicked

    private void txtContraception1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraception1ActionPerformed
        // TODO add your handling code here:
        txtG1.requestFocus();
    }//GEN-LAST:event_txtContraception1ActionPerformed

    private void txtP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtP1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtP1MouseClicked

    private void txtP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtP1ActionPerformed
        // TODO add your handling code here:
        txtA1.requestFocus();
    }//GEN-LAST:event_txtP1ActionPerformed

    private void txtYearsMarried1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearsMarried1ActionPerformed
        // TODO add your handling code here:
        if (txtYearsMarried1.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Ultrasound E.D.D DD-MON-YY",
                    "Gaynee Parameter", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        yearsMarriedDate = dateFormat.format(txtYearsMarried1.getDate());
        txtOccupation1.requestFocus();
    }//GEN-LAST:event_txtYearsMarried1ActionPerformed

    private void txtA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtA1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtA1MouseClicked

    private void txtA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtA1ActionPerformed
        // TODO add your handling code here:
        txtFamilyHistory1.requestFocus();
    }//GEN-LAST:event_txtA1ActionPerformed

    private void txtAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAMouseClicked

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearAntenatalVisit;
    private javax.swing.JButton btnClearGynae;
    private javax.swing.JButton btnClearPOH;
    private javax.swing.JButton btnCopyGynae;
    private javax.swing.JButton btnEditPOH;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnExit2;
    private javax.swing.JButton btnExitGynae;
    private javax.swing.JButton btnFianlSign;
    private javax.swing.JButton btnFianlSignGynae;
    private javax.swing.JButton btnFinal;
    private javax.swing.JButton btnRegisterPOH;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveAntenatalVisit;
    private javax.swing.JButton btnSaveGynae;
    private javax.swing.JComboBox<String> cboAmnioticFluidVolume;
    private javax.swing.JComboBox<String> cboCervix;
    private javax.swing.JComboBox<String> cboCord;
    private javax.swing.JComboBox<String> cboFca;
    private javax.swing.JComboBox<String> cboFetus;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JComboBox<String> cboGrade;
    private javax.swing.JComboBox<String> cboLie;
    private javax.swing.JComboBox<String> cboLie1;
    private javax.swing.JComboBox<String> cboLiquor;
    private javax.swing.JComboBox<String> cboPlace;
    private javax.swing.JComboBox<String> cboPlacenta;
    private javax.swing.JComboBox<String> cboPres;
    private javax.swing.JComboBox<String> cboPresentation;
    private javax.swing.JComboBox<String> cboRiskFactor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JPanel pnlUserDetail1;
    private javax.swing.JPanel pnlUserDetail2;
    private javax.swing.JTable tblAntenatalPatVisit;
    private javax.swing.JTable tblGyaneeParameter;
    private javax.swing.JTable tblPastObstetricHistory;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtA1;
    private javax.swing.JTextField txtAc;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAdmissionNumber;
    private javax.swing.JTextArea txtAdvised;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAgeGender;
    private javax.swing.JTextField txtBFVaccination;
    private javax.swing.JTextField txtBabyName;
    private javax.swing.JTextField txtBed;
    private javax.swing.JTextField txtBiparietalDiameter;
    private javax.swing.JTextField txtBirthWeight;
    private javax.swing.JTextField txtBloodGroup;
    private javax.swing.JTextField txtBreast;
    private javax.swing.JTextField txtBreast1;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtComplications;
    private javax.swing.JTextArea txtConclusion;
    private javax.swing.JTextField txtCongentalAnamoly;
    private javax.swing.JTextField txtCongentalAnamoly1;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtContraception;
    private javax.swing.JTextField txtContraception1;
    private javax.swing.JTextField txtCrl;
    private javax.swing.JTextField txtDelivery;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtDepartment1;
    private javax.swing.JTextField txtDias;
    private org.jdesktop.swingx.JXDatePicker txtDob;
    private javax.swing.JTextField txtDrugAllergy;
    private javax.swing.JTextField txtDrugAllergy1;
    private javax.swing.JTextField txtEdd;
    private javax.swing.JTextField txtEdd1;
    private javax.swing.JTextField txtEducation;
    private javax.swing.JTextField txtEducation1;
    private javax.swing.JTextArea txtFamilyHistory;
    private javax.swing.JTextArea txtFamilyHistory1;
    private javax.swing.JTextField txtFemur;
    private javax.swing.JTextField txtFoetalHeart;
    private javax.swing.JTextField txtFundalHeight;
    private javax.swing.JTextField txtG;
    private javax.swing.JTextField txtG1;
    private javax.swing.JTextField txtGestationSac;
    private javax.swing.JTextField txtGpePollar;
    private javax.swing.JTextField txtGpePollar1;
    private javax.swing.JTextField txtHeadCircumference;
    private javax.swing.JTextField txtHusbandName;
    private javax.swing.JTextField txtHusbandName1;
    private javax.swing.JTextField txtLMP;
    private javax.swing.JTextField txtLabour;
    private javax.swing.JTextField txtLmp;
    private javax.swing.JTextField txtMc;
    private javax.swing.JTextField txtMc1;
    private javax.swing.JTextArea txtMedSurgHis;
    private javax.swing.JTextArea txtMedSurgHis1;
    private javax.swing.JTextField txtMethodIndecation;
    private org.jdesktop.swingx.JXDatePicker txtNextVisitDate;
    private javax.swing.JTextField txtNuchalTranslucency;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtOccupation1;
    private javax.swing.JTextField txtOedema;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextField txtP1;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPlNo;
    private javax.swing.JTextField txtPregnancyWeeks;
    private javax.swing.JTextArea txtPresentAddress;
    private javax.swing.JTextField txtPresentStatus;
    private javax.swing.JTextField txtPrimaryPhy;
    private javax.swing.JTextArea txtRemarks;
    private javax.swing.JTextField txtSys;
    private javax.swing.JTextField txtThyroid;
    private javax.swing.JTextField txtThyroid1;
    private org.jdesktop.swingx.JXDatePicker txtUltrasoundEdd;
    private javax.swing.JTextField txtUsg;
    private javax.swing.JTextField txtVaricoseVeins;
    private javax.swing.JTextField txtVaricoseVeins1;
    private javax.swing.JTextField txtWard;
    private javax.swing.JTextField txtWeeksByDates;
    private javax.swing.JTextField txtWeight;
    private org.jdesktop.swingx.JXDatePicker txtYearsMarried;
    private org.jdesktop.swingx.JXDatePicker txtYearsMarried1;
    // End of variables declaration//GEN-END:variables

    private void setDate(int day) {
        try {
            Date date = new Date();
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            yearsMarriedDate = dateFormat.format(date2);
            txtYearsMarried.setDate(date2);
            txtYearsMarried1.setDate(date2);
            txtNextVisitDate.setDate(date2);
            nextVisitDate = dateFormat.format(date2);
            txtUltrasoundEdd.setDate(date2);
            dob = dateFormat.format(date2);
            txtDob.setDate(date2);
            eddDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void selectAntenatalPatient() {
        listAntenatalPatient = ctlantenatalPatient.selectAntenatalPatientInfo(
                patientId, referenceId);
        System.err.println("sdfghnvgfcg" + listAntenatalPatient.size());
        if (listAntenatalPatient.isEmpty()) {
            return;
        } else {
            setDataInTextBox();
        }
    }

    private void setDataInTextBox() {
        System.err.println("list xizee:"+listAntenatalPatient.size());
        antenatalPatientObj = listAntenatalPatient.get(0);
        if (antenatalPatientObj.getIsFinal().equalsIgnoreCase("Y")) {
            btnFinal.setEnabled(false);
            btnSave.setEnabled(false);
            btnClear.setEnabled(false);
            txtA.setEditable(false);
            txtBreast.setEditable(false);
            txtCongentalAnamoly.setEditable(false);
            txtContraception.setEditable(false);
            txtThyroid.setEditable(false);
            txtDepartment.setEditable(false);
            txtDrugAllergy.setEditable(false);
            txtEducation.setEditable(false);
            txtFamilyHistory.setEditable(false);
            txtG.setEditable(false);
            txtGpePollar.setEditable(false);
            txtHusbandName.setEditable(false);
            txtMc.setEditable(false);
            txtMedSurgHis.setEditable(false);
            txtOccupation.setEditable(false);
            txtP.setEditable(false);
            txtVaricoseVeins.setEditable(false);
            txtYearsMarried.setEditable(false);
        }
        txtA.setText(antenatalPatientObj.getA().trim());
        txtBreast.setText(antenatalPatientObj.getBreast().trim());
        txtThyroid.setText(antenatalPatientObj.getThyroid().trim());
        txtCongentalAnamoly.setText(antenatalPatientObj.getCongentalAnamoly().trim());
        txtContraception.setText(antenatalPatientObj.getContraception().trim());
        txtDepartment.setText(antenatalPatientObj.getDepartment().trim());
        txtDrugAllergy.setText(antenatalPatientObj.getDrugAllergy().trim());
        txtEducation.setText(antenatalPatientObj.getEducation().trim());
        txtFamilyHistory.setText(antenatalPatientObj.getFamilyHistory().trim());
        txtG.setText(antenatalPatientObj.getG().trim());
        txtGpePollar.setText(antenatalPatientObj.getGprPollar().trim());
        txtHusbandName.setText(antenatalPatientObj.getHusbandName().trim());
        txtMc.setText(antenatalPatientObj.getMC().trim());
        txtMedSurgHis.setText(antenatalPatientObj.getMedicalSurgicalHistory().trim());
        txtOccupation.setText(antenatalPatientObj.getOccupation().trim());
        txtP.setText(antenatalPatientObj.getP().trim());
        txtVaricoseVeins.setText(antenatalPatientObj.getVaricoseVeins().trim());
        setInTabForm();
        setDate(Integer.parseInt(antenatalPatientObj.getYearsMarriedDay()));
    }

    private void saveAntenatalPatientInfo(String status) {

        if (listAntenatalPatient.isEmpty()) {
            if (ctlantenatalPatient.insertAntenatalPatientInfo(antenatalPatientObj)) {
                JOptionPane.showMessageDialog(null, "Record " + status + " Successfully.");
                clear();
                selectAntenatalPatient();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to " + status + ". "
                        + "\nKindly contact Administrator.");
            }
        } else {
            if (ctlantenatalPatient.updateAntenatalPatientInfo(antenatalPatientObj)) {
                JOptionPane.showMessageDialog(null, "Record " + status + " Successfully.");
                clear();
                selectAntenatalPatient();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to " + status + ". "
                        + "\nKindly contact Administrator.");
            }
        }
    }

    private void setDataInObject() {
        antenatalPatientObj.setPatientId(patientId);
        antenatalPatientObj.setReferenceId(referenceId);
        antenatalPatientObj.setA(txtA1.getText().trim());
        antenatalPatientObj.setBreast(txtBreast1.getText().trim());
        antenatalPatientObj.setCongentalAnamoly(txtCongentalAnamoly1.getText().trim());
        antenatalPatientObj.setContraception(txtContraception1.getText().trim());
        antenatalPatientObj.setDepartment(txtDepartment1.getText().trim());
        antenatalPatientObj.setDrugAllergy(txtDrugAllergy1.getText().trim());
        antenatalPatientObj.setEducation(txtEducation1.getText().trim());
        antenatalPatientObj.setFamilyHistory(txtFamilyHistory1.getText().trim()
                .replace(",", " "));
        antenatalPatientObj.setG(txtG1.getText().trim());
        antenatalPatientObj.setGprPollar(txtGpePollar1.getText().trim());
        antenatalPatientObj.setHusbandName(txtHusbandName1.getText().trim());
        antenatalPatientObj.setMC(txtMc1.getText().trim());
        antenatalPatientObj.setMedicalSurgicalHistory(txtMedSurgHis1.getText().trim()
                .replace(",", " "));
        antenatalPatientObj.setOccupation(txtOccupation1.getText().trim());
        antenatalPatientObj.setP(txtP1.getText().trim());
        antenatalPatientObj.setThyroid(txtThyroid1.getText().trim());
        antenatalPatientObj.setVaricoseVeins(txtVaricoseVeins1.getText().trim());
        antenatalPatientObj.setYearsMarried(yearsMarriedDate);
    }

    private void clear() {
        txtA.setText("");
        txtBreast.setText("");
        txtCongentalAnamoly.setText("");
        txtThyroid.setText("");
        txtContraception.setText("");
        txtDepartment.setText("");
        txtDrugAllergy.setText("");
        txtEducation.setText("");
        txtFamilyHistory.setText("");
        txtG.setText("");
        txtGpePollar.setText("");
        txtHusbandName.setText("");
        txtMc.setText("");
        txtMedSurgHis.setText("");
        txtOccupation.setText("");
        txtP.setText("");
        txtVaricoseVeins.setText("");
        setDate(0);

        btnFinal.setEnabled(true);
        btnSave.setEnabled(true);
        txtA.setEditable(true);
        txtBreast.setEditable(true);
        txtThyroid.setEditable(true);
        txtCongentalAnamoly.setEditable(true);
        txtContraception.setEditable(true);
        txtDepartment.setEditable(true);
        txtDrugAllergy.setEditable(true);
        txtEducation.setEditable(true);
        txtFamilyHistory.setEditable(true);
        txtG.setEditable(true);
        txtGpePollar.setEditable(true);
        txtHusbandName.setEditable(true);
        txtMc.setEditable(true);
        txtMedSurgHis.setEditable(true);
        txtOccupation.setEditable(true);
        txtP.setEditable(true);
        txtVaricoseVeins.setEditable(true);
        txtYearsMarried.setEditable(true);
    }

    private boolean chkFields() {
        boolean ret = true;
        if (txtA1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter A.");
            txtA1.requestFocus();
            return false;
        }
        if (txtBreast1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter Breast.");
            txtBreast1.requestFocus();
            return false;
        }
        if (txtCongentalAnamoly1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter Congental Anamoly.");
            txtCongentalAnamoly1.requestFocus();
            return false;
        }
        if (txtContraception1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter Contraception.");
            txtContraception1.requestFocus();
            return false;
        }
        if (txtDepartment1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter Department.");
            txtDepartment1.requestFocus();
            return false;
        }
        if (txtDrugAllergy1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter Drug Allergy.");
            txtDrugAllergy1.requestFocus();
            return false;
        }
        if (txtEducation1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter Education.");
            txtEducation1.requestFocus();
            return false;
        }
        if (txtFamilyHistory1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter Family History.");
            txtFamilyHistory1.requestFocus();
            return false;
        }
        if (txtG1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter G.");
            txtG1.requestFocus();
            return false;
        }
        if (txtP1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter P");
            txtP1.requestFocus();
            return false;
        }
        if (txtGpePollar1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter Gpe Pollar.");
            txtGpePollar1.requestFocus();
            return false;
        }
        if (txtHusbandName1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter Husband Name.");
            txtHusbandName1.requestFocus();
            return false;
        }
        if (txtMc1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter MC.");
            txtMc1.requestFocus();
            return false;
        }
        if (txtMedSurgHis1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter Medical Surgical History.");
            txtMedSurgHis1.requestFocus();
            return false;
        }
        if (txtOccupation1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter Occupation.");
            txtOccupation1.requestFocus();
            return false;
        }
        if (txtThyroid1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter Thyroid.");
            txtThyroid1.requestFocus();
            return false;
        }
        if (txtVaricoseVeins1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter Varicose Veins.");
            txtVaricoseVeins1.requestFocus();
            return false;
        }
        if (yearsMarriedDate.length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly select Years Married Date.");
            txtYearsMarried1.requestFocus();
            return false;
        }
        return ret;
    }

    private void setPatientDemography(PatientHospitalVisit objDemography) {
        patientId = objDemography.getPatientId();
        referenceId = objDemography.getConsultancyId();
        txtPatientId.setText(objDemography.getPatientId().substring(3));
        txtPlNo.setText(objDemography.getPLNO());
        txtPatientName.setText(objDemography.getPatientName());
        txtAgeGender.setText(objDemography.getAge() + "/ " + objDemography.getGenderDescription());
        txtContactNo.setText(objDemography.getContactNo());
        txtAdmissionNumber.setText(objDemography.getAdmissionNumber());
        txtBed.setText(objDemography.getBedDescription());
        txtWard.setText(objDemography.getWardDescription());
        txtPrimaryPhy.setText(objDemography.getPrimaryPhysicianName());
        txtClient.setText(objDemography.getClientName());
        txtAddress.setText(objDemography.getPatientResidenceArea());
        txtBloodGroup.setText(objDemography.getBloodGroup());
    }

    private void setAntenatalVisitColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblAntenatalPatVisit.getColumnCount(); i++) {
            column = tblAntenatalPatVisit.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(30);
            } else if (i == 2) {
                column.setPreferredWidth(90);
            } else if (i == 3) {
                column.setPreferredWidth(120);
            }
        }
    }

    private void setSaveRecord() {
        antenatalVisitsObj = new AntenatalVisitsBo();
        antenatalVisitsObj.setPatientId(patientId);
        antenatalVisitsObj.setReferenceId(referenceId);
        antenatalVisitsObj.setLmp(txtLMP.getText().trim());
        antenatalVisitsObj.setEdd(txtEdd.getText().trim());
        antenatalVisitsObj.setUsgEd(txtUsg.getText().trim());
        antenatalVisitsObj.setRiskFactor(cboRiskFactor.getSelectedItem().toString());
        antenatalVisitsObj.setRemarks(txtRemarks.getText().trim());

        antenatalVisitsObj.setBloodPressureSystolic(txtSys.getText().trim());
        antenatalVisitsObj.setBloodPressureDiastolic(txtDias.getText().trim());
        antenatalVisitsObj.setWeight(txtWeight.getText().trim());
        antenatalVisitsObj.setWeeksByDates(txtWeeksByDates.getText().trim());
        antenatalVisitsObj.setFundalHeight(txtFundalHeight.getText().trim());
        antenatalVisitsObj.setLie(cboLie.getSelectedItem().toString());
        antenatalVisitsObj.setPresentation(cboPres.getSelectedItem().toString());
        antenatalVisitsObj.setFoetalHeart(txtFoetalHeart.getText().trim());
        antenatalVisitsObj.setOedema(txtOedema.getText().trim());
        antenatalVisitsObj.setAdvised(txtAdvised.getText().trim().replaceAll(",", " "));
        antenatalVisitsObj.setNextVisitDate(nextVisitDate);
    }

    public void clearAntenatalVisit() {
        txtSys.setText("");
        txtDias.setText("");
        txtWeight.setText("");
        txtWeeksByDates.setText("");
        txtFundalHeight.setText("");
        txtFoetalHeart.setText("");
        txtOedema.setText("");
        cboLie.setSelectedIndex(0);
        cboPres.setSelectedIndex(0);
        txtAdvised.setText("");
        listAntenatalVisit.clear();
        tblAntenatalPatVisit.setModel(new AntenatalVisitTableModel(listAntenatalVisit));
    }

    private void saveRecords() {
        listChk = ctlAntenatalVisit.searchAntenatalVisits(referenceId, patientId,
                "", "", "");
        if (listChk.isEmpty()) {

            if (ctlAntenatalVisit.insertAntenatalVisits(antenatalVisitsObj)) {
                JOptionPane.showMessageDialog(null, "Record Save Sucesssfully");
                clear();
                searchAntenatalVisit("", patientId, "", "", "Y");
                setDataInTextBoxes();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save! Kindly contact "
                        + "Administrator.");
            }
        }
        System.err.println("inr updt chk list sixe:" + listChk.size());
        if (!listChk.isEmpty()) {
            if (ctlAntenatalVisit.updateAntenatalVisits(antenatalVisitsObj)) {
                JOptionPane.showMessageDialog(null, "Record Sucesssfully");
                clear();
                searchAntenatalVisit("", patientId, "", "", "Y");
                setDataInTextBoxes();

            } else {
                JOptionPane.showMessageDialog(null, "Unable to update! Kindly contact "
                        + "Administrator.");
            }
        }
        txtSys.requestFocus();
    }

    private void searchAntenatalVisit(String referenceId, String patientId,
            String fromDate, String toDate, String isFinal) {
        listAntenatalVisit.clear();
        listAntenatalVisit = ctlAntenatalVisit.searchAntenatalVisits(
                referenceId, patientId, fromDate, toDate, isFinal);
        if (listAntenatalVisit.isEmpty()) {
            return;
        }
        antenatalVisitsObj = listAntenatalVisit.get(0);
        txtLMP.setText(antenatalVisitsObj.getLmp().trim());
        txtEdd.setText(antenatalVisitsObj.getEdd().trim());
        txtUsg.setText(antenatalVisitsObj.getUsgEd().trim());
        txtRemarks.setText(antenatalVisitsObj.getRemarks().trim());
        cboRiskFactor.setSelectedItem(antenatalVisitsObj.getRiskFactor());
        txtLMP.setEditable(false);
        txtEdd.setEditable(false);
        txtUsg.setEditable(false);
        txtRemarks.setEditable(false);
        cboRiskFactor.setEnabled(false);

        tblAntenatalPatVisit.setModel(new AntenatalVisitTableModel(listAntenatalVisit));
        ListSelectionModel selectionModel = tblAntenatalPatVisit.getSelectionModel();
        tblAntenatalPatVisit.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setAntenatalVisitColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblAntenatalPatVisit);
    }

    private void setDataInTextBoxes() {

        listAntenatalVisitNotFinal = ctlAntenatalVisit.searchAntenatalVisits(referenceId, patientId,
                "", "", "");
        if (listAntenatalVisitNotFinal.isEmpty()) {
            return;
        }

        AntenatalVisitsBo chkAntenatalVisits = listAntenatalVisitNotFinal.get(0);
        if (chkAntenatalVisits.getIsFinal().equalsIgnoreCase("Y")) {
            btnSaveAntenatalVisit.setEnabled(false);
            btnFianlSign.setEnabled(false);
        }
        if (chkAntenatalVisits.getIsFinal().equalsIgnoreCase("N")) {
            btnSave.setEnabled(true);
            btnFianlSign.setEnabled(true);
            txtPatientName.setText(chkAntenatalVisits.getPatientName().trim());
            txtLMP.setText(chkAntenatalVisits.getLmp().trim());
            txtEdd.setText(chkAntenatalVisits.getEdd().trim());
            txtUsg.setText(chkAntenatalVisits.getUsgEd().trim());
            cboRiskFactor.setSelectedItem(chkAntenatalVisits.getRiskFactor().trim());
            txtRemarks.setText(chkAntenatalVisits.getRemarks().trim());
            txtSys.setText(chkAntenatalVisits.getBloodPressureSystolic().trim());
            txtDias.setText(chkAntenatalVisits.getBloodPressureDiastolic().trim());
            txtFoetalHeart.setText(chkAntenatalVisits.getFoetalHeart().trim());
            txtFundalHeight.setText(chkAntenatalVisits.getFundalHeight().trim());
            txtWeight.setText(chkAntenatalVisits.getWeight().trim());
            txtWeeksByDates.setText(chkAntenatalVisits.getWeeksByDates().trim());
            txtOedema.setText(chkAntenatalVisits.getOedema().trim());
            txtAdvised.setText(chkAntenatalVisits.getAdvised().trim());
            cboLie.setSelectedItem(chkAntenatalVisits.getLie().trim());
            cboPres.setSelectedItem(chkAntenatalVisits.getPresentation().trim());
            setVisitDate(Integer.parseInt(chkAntenatalVisits.getNextVisitDay()));
        }
    }

    private void setTableDataInTextBoxes(AntenatalVisitsBo chkAntenatalVisits) {
        btnSave.setEnabled(true);
        btnFianlSign.setEnabled(true);
        txtPatientName.setText(chkAntenatalVisits.getPatientName().trim());
        txtLMP.setText(chkAntenatalVisits.getLmp().trim());
        txtEdd.setText(chkAntenatalVisits.getEdd().trim());
        txtUsg.setText(chkAntenatalVisits.getUsgEd().trim());
        cboRiskFactor.setSelectedItem(chkAntenatalVisits.getRiskFactor().trim());
        txtRemarks.setText(chkAntenatalVisits.getRemarks().trim());
        txtSys.setText(chkAntenatalVisits.getBloodPressureSystolic().trim());
        txtDias.setText(chkAntenatalVisits.getBloodPressureDiastolic().trim());
        txtFoetalHeart.setText(chkAntenatalVisits.getFoetalHeart().trim());
        txtFundalHeight.setText(chkAntenatalVisits.getFundalHeight().trim());
        txtWeight.setText(chkAntenatalVisits.getWeight().trim());
        txtWeeksByDates.setText(chkAntenatalVisits.getWeeksByDates().trim());
        txtOedema.setText(chkAntenatalVisits.getOedema().trim());
        txtAdvised.setText(chkAntenatalVisits.getAdvised().trim());
        cboLie.setSelectedItem(chkAntenatalVisits.getLie().trim());
        cboPres.setSelectedItem(chkAntenatalVisits.getPresentation().trim());
        setVisitDate(Integer.parseInt(chkAntenatalVisits.getNextVisitDay()));
    }

    private boolean chkFieldsAntenatalVisit() {
        boolean ret = true;
        if (txtLMP.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter LMP");
            txtLMP.requestFocus();
            return false;
        }
        if (txtEdd.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter EDD");
            txtEdd.requestFocus();
            return false;
        }
        if (txtUsg.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter USG ED Length.");
            txtUsg.requestFocus();
            return false;
        }
        if (cboRiskFactor.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Risk Factor");
            cboRiskFactor.requestFocus();
            return false;
        }
        if (txtRemarks.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Remarks ");
            txtRemarks.requestFocus();
            return false;
        }
        if (txtSys.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter B.P (SYS)");
            txtSys.requestFocus();
            return false;
        }
        try {
            Integer.parseInt(txtSys.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, txtSys.getText().trim()
                    + " is not a valid value for B.P (SYS)");
            txtSys.requestFocus();
            return false;
        }
        if (txtDias.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter B.P (DIAS)");
            txtDias.requestFocus();
            return false;
        }
        try {
            Integer.parseInt(txtDias.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, txtDias.getText().trim()
                    + " is not a valid value for B.P (DIAS)");
            txtDias.requestFocus();
            return false;
        }
        if (txtWeight.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Weight");
            txtWeight.requestFocus();
            return false;
        }
        try {
            Integer.parseInt(txtWeight.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, txtWeight.getText().trim()
                    + " is not a valid value for Weight ");
            txtWeight.requestFocus();
            return false;
        }
        if (txtWeeksByDates.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Weeks By Dates");
            txtWeeksByDates.requestFocus();
            return false;
        }
        if (cboLie.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Lie");
            cboLie.requestFocus();
            return false;
        }
        if (cboPres.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Presentation");
            cboPres.requestFocus();
            return false;
        }
        if (txtFundalHeight.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Fundal Height");
            txtFundalHeight.requestFocus();
            return false;
        }
        if (txtFoetalHeart.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Foetal Heart");
            txtFoetalHeart.requestFocus();
            return false;
        }
        if (txtOedema.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Oedema");
            txtOedema.requestFocus();
            return false;
        }
        if (nextVisitDate.length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Next Visit Date");
            txtNextVisitDate.requestFocus();
            return false;
        }

        return ret;
    }

    private void disableAntenatalVisitFields() {
        txtLMP.setEditable(false);
        txtEdd.setEditable(false);
        txtUsg.setEditable(false);
        txtRemarks.setEditable(false);
        cboRiskFactor.setEnabled(false);
        txtSys.setEditable(false);
        txtDias.setEditable(false);
        txtWeight.setEditable(false);
        txtWeeksByDates.setEditable(false);
        txtFundalHeight.setEditable(false);
        txtFoetalHeart.setEditable(false);
        txtNextVisitDate.setEditable(false);
        txtAdvised.setEditable(false);
        txtOedema.setEditable(false);
        cboLie.setEnabled(false);
        cboPres.setEnabled(false);
    }

    private void setVisitDate(int day) {
        try {
            Date date = new Date();
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtNextVisitDate.setDate(date2);
            nextVisitDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // gynae
    private void setInsertDataGynae() {

        objSaveGynae.setPatientId(patientId);
        objSaveGynae.setReferenceId(referenceId);
        objSaveGynae.setLmp(txtLmp.getText().trim().replaceAll(",", " "));
        objSaveGynae.setEddDate(eddDate);
        objSaveGynae.setEdd(txtEdd.getText().trim().replaceAll(",", " "));
        objSaveGynae.setFemurLength(txtFemur.getText().trim().replaceAll(",", " "));
        objSaveGynae.setHeadCircumference(txtHeadCircumference.getText().trim().replaceAll(",", " "));
        objSaveGynae.setAc(txtAc.getText().trim().replaceAll(",", " "));
        objSaveGynae.setCrl(txtCrl.getText().trim().replaceAll(",", " "));
        objSaveGynae.setBiparietalDiameter(txtBiparietalDiameter.getText().trim().replaceAll(",", " "));
        objSaveGynae.setGestationSac(txtGestationSac.getText().trim().replaceAll(",", " "));
        objSaveGynae.setNuchalTranslucency(txtNuchalTranslucency.getText().trim().replaceAll(",", " "));
        objSaveGynae.setRemarks(txtConclusion.getText().trim().replaceAll(",", " "));
        objSaveGynae.setAmnioticFluidVolume(cboAmnioticFluidVolume.getSelectedItem().toString());
        objSaveGynae.setLiquor(cboLiquor.getSelectedItem().toString());
        objSaveGynae.setLie(cboLie.getSelectedItem().toString());
        objSaveGynae.setPresentation(cboPresentation.getSelectedItem().toString());
        objSaveGynae.setCervix(cboCervix.getSelectedItem().toString());
        objSaveGynae.setCord(cboCord.getSelectedItem().toString());
        objSaveGynae.setFca(cboFca.getSelectedItem().toString());
        objSaveGynae.setFetus(cboFetus.getSelectedItem().toString());
        objSaveGynae.setGrade(cboGrade.getSelectedItem().toString());
        objSaveGynae.setPlacenta(cboPlacenta.getSelectedItem().toString());

    }

    private void selectGayneeParameter(String patientId, String referenceId) {
        clearGynae();
        listGayneeParam = ctlGayneeParameter.selectGayneeParameter(patientId, referenceId);
        if (!listGayneeParam.isEmpty()) {
            for (int i = 0; i < listGayneeParam.size(); i++) {
                gayneeParameterObj = listGayneeParam.get(i);
                if (gayneeParameterObj.getIsFinal().equalsIgnoreCase("Y")) {
                    listFianlParameters.add(gayneeParameterObj);
                }
                if (gayneeParameterObj.getIsFinal().equalsIgnoreCase("N")) {
                    setGynaeDataInTextBox();
                }
            }
            tblGyaneeParameter.setModel(new GynaeParameterListTableModel(listFianlParameters));
            ListSelectionModel selectionModel = tblGyaneeParameter.getSelectionModel();
            tblGyaneeParameter.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setParameterListColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblGyaneeParameter);
        } else {
            System.out.println("Data is not Availabe of this Patient.");
        }
    }

    private void setParameterListColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblGyaneeParameter.getColumnCount(); i++) {
            column = tblGyaneeParameter.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(25);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(20);
            } else if (i == 3) {
                column.setPreferredWidth(20);
            } else if (i == 4) {
                column.setPreferredWidth(20);
            } else if (i == 5) {
                column.setPreferredWidth(15);
            } else if (i == 6) {
                column.setPreferredWidth(15);
            } else if (i == 7) {
                column.setPreferredWidth(15);
            } else if (i == 8) {
                column.setPreferredWidth(15);
            } else if (i == 9) {
                column.setPreferredWidth(15);
            } else if (i == 9) {
                column.setPreferredWidth(15);
            } else if (i == 10) {
                column.setPreferredWidth(15);
            } else if (i == 11) {
                column.setPreferredWidth(15);
            } else if (i == 12) {
                column.setPreferredWidth(15);
            } else if (i == 13) {
                column.setPreferredWidth(15);
            } else if (i == 14) {
                column.setPreferredWidth(15);
            } else if (i == 15) {
                column.setPreferredWidth(15);
            } else if (i == 16) {
                column.setPreferredWidth(15);
            } else if (i == 17) {
                column.setPreferredWidth(15);
            } else if (i == 18) {
                column.setPreferredWidth(15);
            } else if (i == 19) {
                column.setPreferredWidth(15);
            }
        }
    }

    private void setGynaeDataInTextBox() {

        if (gayneeParameterObj.getIsFinal().equalsIgnoreCase("Y")) {
            return;
        }
        txtLmp.setText(gayneeParameterObj.getLmp());
        txtAc.setText(gayneeParameterObj.getAc());
        txtEdd.setText(gayneeParameterObj.getEdd());
        txtFemur.setText(gayneeParameterObj.getFemurLength());
        txtNuchalTranslucency.setText(gayneeParameterObj.getNuchalTranslucency());
        cboAmnioticFluidVolume.setSelectedItem(gayneeParameterObj.getAmnioticFluidVolume());
        cboLie.setSelectedItem(gayneeParameterObj.getLie());
        cboPresentation.setSelectedItem(gayneeParameterObj.getPresentation());
        cboCervix.setSelectedItem(gayneeParameterObj.getCervix());
        cboCord.setSelectedItem(gayneeParameterObj.getCord());
        cboFca.setSelectedItem(gayneeParameterObj.getFca());
        cboFetus.setSelectedItem(gayneeParameterObj.getFetus());
        cboGrade.setSelectedItem(gayneeParameterObj.getGrade());
        cboPlacenta.setSelectedItem(gayneeParameterObj.getPlacenta());
        cboLiquor.setSelectedItem(gayneeParameterObj.getLiquor());
        txtHeadCircumference.setText(gayneeParameterObj.getHeadCircumference());
        txtCrl.setText(gayneeParameterObj.getCrl());
        txtBiparietalDiameter.setText(gayneeParameterObj.getBiparietalDiameter());
        txtGestationSac.setText(gayneeParameterObj.getGestationSac());
        txtConclusion.setText(gayneeParameterObj.getRemarks());
    }

    private void saveRecordGynae() {
        listGayneeParam = ctlGayneeParameter.selectGayneeParameter(patientId,
                referenceId);
        setInsertDataGynae();
        if (listGayneeParam.isEmpty()) {
            if (ctlGayneeParameter.insertGayneeParameters(objSaveGynae)) {
                JOptionPane.showMessageDialog(null, "Record save Sucesssfully");
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save! Kindly contact "
                        + "Administrator.");
            }
        }
        if (!listGayneeParam.isEmpty()) {
            if (ctlGayneeParameter.updateGayneeParameters(objSaveGynae)) {
                JOptionPane.showMessageDialog(null, "Record save Sucesssfully");
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save! Kindly contact "
                        + "Administrator.");
            }
        }
    }

    public void clearGynae() {

        txtFemur.setText("");
        txtCrl.setText("");
        txtLmp.setText("");
        txtEdd1.setText("");
        txtHeadCircumference.setText("");
        txtAc.setText("");
        txtBiparietalDiameter.setText("");
        txtGestationSac.setText("");
        txtNuchalTranslucency.setText("");
        txtConclusion.setText("");
        cboLiquor.setSelectedIndex(0);
        cboFetus.setSelectedIndex(0);
        cboFca.setSelectedIndex(0);
        cboAmnioticFluidVolume.setSelectedIndex(0);
        cboPlacenta.setSelectedIndex(0);
        cboCord.setSelectedIndex(0);
        cboGrade.setSelectedIndex(0);
        cboLie.setSelectedIndex(0);
        cboPresentation.setSelectedIndex(0);
        cboCervix.setSelectedIndex(0);
        listFianlParameters.clear();
        listGayneeParam.clear();
        tblGyaneeParameter.setModel(new GynaeParameterListTableModel(listGayneeParam));
    }

    private boolean chkFieldsGynae() {
        boolean ret = true;
        if (txtLmp.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter LMP");
            txtLmp.requestFocus();
            return false;
        }
        if (txtEdd.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter EDD");
            txtEdd.requestFocus();
            return false;
        }
        if (txtFemur.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Femur Length.");
            txtFemur.requestFocus();
            return false;
        }
//          if (cboFetus.getSelectedIndex() == 0 ) {
//            JOptionPane.showMessageDialog(null, "Kindly Select Fetus.");
//            cboFetus.requestFocus();
//            return false;
//        }
//          if (cboFca.getSelectedIndex() == 0 ) {
//            JOptionPane.showMessageDialog(null, "Kindly Select FCA.");
//            cboFca.requestFocus();
//            return false;
//        }
//         if (txtHeadCircumference.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Enter Head Circumference");
//            txtHeadCircumference.requestFocus();
//            return false;
//        }
//         if (txtAc.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Enter AC");
//            txtAc.requestFocus();
//            return false;
//        }
//         if (txtLiePresentation.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Enter Lie/Presentation");
//            txtLiePresentation.requestFocus();
//            return false;
//        }
//         if (txtAfi.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Enter AFI");
//            txtAfi.requestFocus();
//            return false;
//        }
        if (txtBiparietalDiameter.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Biparietal Diameter");
            txtBiparietalDiameter.requestFocus();
        }
        try {
            Float.parseFloat(txtBiparietalDiameter.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, txtBiparietalDiameter.getText().trim()
                    + " is not a valid value for Biparietal Diameter");
            txtBiparietalDiameter.requestFocus();
            return false;
        }
//         
//         if (txtLiquor.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Enter Liquor");
//            txtLiquor.requestFocus();
//            return false;
//        }
//          if (cboAmnioticFluidVolume.getSelectedIndex() == 0 ) {
//            JOptionPane.showMessageDialog(null, "Kindly Select Amniotic FluidVolume.");
//            cboAmnioticFluidVolume.requestFocus();
//            return false;
//        }
//          if (cboPlacenta.getSelectedIndex() == 0 ) {
//            JOptionPane.showMessageDialog(null, "Kindly Select Placenta.");
//            cboPlacenta.requestFocus();
//            return false;
//        }
//          
//         if (txtGestationSac.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Enter Gestation Sac");
//            txtGestationSac.requestFocus();
//            return false;
//        }

        if (txtNuchalTranslucency.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Nuchal Translucency");
            txtNuchalTranslucency.requestFocus();
        }
        try {
            Float.parseFloat(txtNuchalTranslucency.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, txtNuchalTranslucency.getText().trim()
                    + " is not a valid value for Nuchal Translucencys");
            txtNuchalTranslucency.requestFocus();
            return false;
        }
        if (cboCord.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Cord.");
            cboCord.requestFocus();
            return false;
        }
//        if (cboGrade.getSelectedIndex() == 0 ) {
//            JOptionPane.showMessageDialog(null, "Kindly Select Grade.");
//            cboGrade.requestFocus();
//            return false;
//        }
//        if (cboCervix.getSelectedIndex() == 0 ) {
//            JOptionPane.showMessageDialog(null, "Kindly Select Cervix.");
//            cboCervix.requestFocus();
//            return false;
//        }
        return ret;
    }

    private void copyParameter() {
        if (listFianlParameters.isEmpty()) {
            JOptionPane.showMessageDialog(null, "There is nothing to Copy.");
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Copy Parameters.");
        if (confirmation != 0) {
            return;
        }
        objSaveGynae = listFianlParameters.get(tblGyaneeParameter.getSelectedRow());
        objSaveGynae.setPatientId(patientId);
        objSaveGynae.setReferenceId(referenceId);
        objSaveGynae.setIsFinal("Y");
        objSaveGynae.setFianlBy(Constants.userId);
        objSaveGynae.setFianlDate("SYSDATE");
        objSaveGynae.setFianlTerminalId(Constants.terminalId);
        if (ctlGayneeParameter.insertGayneeParameters(objSaveGynae)) {
            JOptionPane.showMessageDialog(null, "Record Copy Sucesssfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Copy! Kindly contact "
                    + "Administrator.");
        }
        selectGayneeParameter(patientId, "");
    }

    private void setUltrasoundEddDate() {
        try {
            Date date = new Date();
            txtUltrasoundEdd.setDate(date);
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, 0);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtUltrasoundEdd.setDate(date2);
            eddDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setBodyData(int selectedRow) {

        gayneeParameterObj = listFianlParameters.get(tblGyaneeParameter.getSelectedRow());

        txtLmp.setText(gayneeParameterObj.getLmp());
        txtEdd.setText(gayneeParameterObj.getEdd());
        txtFemur.setText(gayneeParameterObj.getFemurLength());
        txtHeadCircumference.setText(gayneeParameterObj.getHeadCircumference());
        txtAc.setText(gayneeParameterObj.getAc());
        txtCrl.setText(gayneeParameterObj.getCrl());
        txtBiparietalDiameter.setText(gayneeParameterObj.getBiparietalDiameter());
        txtGestationSac.setText(gayneeParameterObj.getGestationSac());
        cboFetus.setSelectedItem(gayneeParameterObj.getFetus());
        cboFca.setSelectedItem(gayneeParameterObj.getFca());
        cboAmnioticFluidVolume.setSelectedItem(gayneeParameterObj.getAmnioticFluidVolume());
        cboPlacenta.setSelectedItem(gayneeParameterObj.getPlacenta());
        cboCord.setSelectedItem(gayneeParameterObj.getCord());
        cboGrade.setSelectedItem(gayneeParameterObj.getGrade());
        cboCervix.setSelectedItem(gayneeParameterObj.getCervix());
        cboLie.setSelectedItem(gayneeParameterObj.getLie());
        cboPresentation.setSelectedItem(gayneeParameterObj.getPresentation());
        cboLiquor.setSelectedItem(gayneeParameterObj.getLiquor());
        txtNuchalTranslucency.setText(gayneeParameterObj.getNuchalTranslucency());
        txtConclusion.setText(gayneeParameterObj.getRemarks());
    }

    private void setDemography(PatientHospitalVisit patVisit) {
        patientId = patVisit.getPatientId();
        referenceId = patVisit.getConsultancyId();
        txtPatientId.setText(patientId);
        txtAdmissionNumber.setText(patVisit.getAdmissionNumber());
        txtPatientName.setText(patVisit.getPatientName());
        txtAgeGender.setText(patVisit.getAge()
                + "/ " + patVisit.getGenderDescription());
        txtWard.setText(patVisit.getWardDescription());
        txtBed.setText(patVisit.getBedDescription());
        txtPrimaryPhy.setText(patVisit.getPrimaryPhysicianName());
        txtClient.setText(patVisit.getClientName());
    }

    private void setEnableFalse() {
        btnSaveGynae.setEnabled(false);
        btnFianlSignGynae.setEnabled(false);
        txtLmp.setEditable(false);
        txtEdd.setEditable(false);
        cboFetus.setEnabled(false);
        cboLie.setEnabled(false);
        cboPresentation.setEnabled(false);
        cboFca.setEnabled(false);
        cboLiquor.setEnabled(false);
        cboAmnioticFluidVolume.setEnabled(false);
        txtBiparietalDiameter.setEditable(false);
        txtFemur.setEditable(false);
        cboPlacenta.setEnabled(false);
        txtCrl.setEditable(false);
        txtGestationSac.setEditable(false);
        txtHeadCircumference.setEditable(false);
        txtAc.setEditable(false);
        txtNuchalTranslucency.setEditable(false);
        txtConclusion.setEditable(false);
        cboGrade.setEnabled(false);
        cboCervix.setEnabled(false);
        cboCord.setEnabled(false);
    }
    
    //
    
    private void selectBirthCertificate() {
        listPastObstetricHistory = ctlPastObstetricHistory.selectPatientSearch(patientId,
                referenceId);
        setPastObsHisDataInTableModel();
    }
    
    private void setPastObsHisInsertData() {
        // BY SIR
        PastObstetricHistoryBO.setBabyPatientId("001000254875");
        PastObstetricHistoryBO.setAdmissionNumber(referenceId);
        PastObstetricHistoryBO.setPatientId(patientId);
        
        
        PastObstetricHistoryBO.setBabyName(txtBabyName.getText().toUpperCase());
        PastObstetricHistoryBO.setPrimaryPhysicianId(primaryPhyId);
        PastObstetricHistoryBO.setDob(dob);
        PastObstetricHistoryBO.setDayOfBirth(txtAge.getText());
        if (cboGender.getSelectedIndex() == 1) {
            PastObstetricHistoryBO.setGenderId("1");
        }
        if (cboGender.getSelectedIndex() == 2) {
            PastObstetricHistoryBO.setGenderId("2");
        }
        PastObstetricHistoryBO.setPregnancyWeeks(txtPregnancyWeeks.getText());
        PastObstetricHistoryBO.setDelivery(txtDelivery.getText().toUpperCase());
        if (cboPlace.getSelectedIndex() == 1) {
            PastObstetricHistoryBO.setPlace("1");
        }
        if (cboPlace.getSelectedIndex() == 2) {
            PastObstetricHistoryBO.setPlace("2");
        }
        PastObstetricHistoryBO.setMethodIndication(txtMethodIndecation.getText().toUpperCase());
        PastObstetricHistoryBO.setLabour(txtLabour.getText().toUpperCase());
        PastObstetricHistoryBO.setComplications(txtComplications.getText().toUpperCase());
        PastObstetricHistoryBO.setBFVaccination(txtBFVaccination.getText().toUpperCase());
        PastObstetricHistoryBO.setBirthWeight(txtBirthWeight.getText());
        PastObstetricHistoryBO.setPresentStatus(txtPresentStatus.getText().toUpperCase());
        PastObstetricHistoryBO.setPresentAddress(txtPresentAddress.getText().toUpperCase());
       
    }


    private void setBirthCertificateColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblPastObstetricHistory.getColumnCount(); i++) {
            column = tblPastObstetricHistory.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(40);
            } else if (i == 2) {
                column.setPreferredWidth(40);
            } else if (i == 3) {
                column.setPreferredWidth(35);
            } else if (i == 4) {
                column.setPreferredWidth(35);
            }
        }
    }

    private void setPastObsHisDataInTableModel() {
        tblPastObstetricHistory.setModel(new PastObstetricHistoryTableModel(listPastObstetricHistory));
        ListSelectionModel selectionModel = tblPastObstetricHistory.getSelectionModel();
        tblPastObstetricHistory.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setBirthCertificateColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblPastObstetricHistory);
    }

    private void setBodyDataPastObsHis(int index) {
        // form data setting
        PastObstetricHistoryBO = new BOBirthCertificate();
        PastObstetricHistoryBO = listPastObstetricHistory.get(index);
        
        txtBabyName.setText(PastObstetricHistoryBO.getBabyName());
        txtAge.setText(PastObstetricHistoryBO.getAge());
       if (PastObstetricHistoryBO.getGenderId().equalsIgnoreCase("1")) {
            cboGender.setSelectedIndex(1);
        }
        if (PastObstetricHistoryBO.getGenderId().equalsIgnoreCase("2")) {
            cboGender.setSelectedIndex(2);
        }
        txtPregnancyWeeks.setText(PastObstetricHistoryBO.getPregnancyWeeks());
        txtDelivery.setText(PastObstetricHistoryBO.getDelivery());
         if (PastObstetricHistoryBO.getPlace().equalsIgnoreCase("1")) {
            cboPlace.setSelectedIndex(1);
        }
        if (PastObstetricHistoryBO.getPlace().equalsIgnoreCase("2")) {
            cboPlace.setSelectedIndex(2);
        }
        txtMethodIndecation.setText(PastObstetricHistoryBO.getMethodIndication());
        txtLabour.setText(PastObstetricHistoryBO.getLabour());
        txtComplications.setText(PastObstetricHistoryBO.getComplications());
        txtBFVaccination.setText(PastObstetricHistoryBO.getBFVaccination());
        txtBirthWeight.setText(PastObstetricHistoryBO.getBirthWeight());
        txtPresentStatus.setText(PastObstetricHistoryBO.getPresentStatus());
        txtPresentAddress.setText(PastObstetricHistoryBO.getPresentAddress());
        txtAge.setText(PastObstetricHistoryBO.getDayOfBirth());
        setDate(Integer.parseInt(PastObstetricHistoryBO.getDayOfBirth()));
    }
    private boolean chkFieldsPastObsHis() {
        boolean ret = true;
        if (txtBabyName.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Baby Name");
            txtBabyName.requestFocus();
            return false;
        }
        if (cboGender.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Gender");
            cboGender.requestFocus();
            return false;
        }
        if (txtPregnancyWeeks.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Pregnancy Weeks");
            txtPregnancyWeeks.requestFocus();
            return false;
        }

         if (txtDelivery.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Delivery");
            txtDelivery.requestFocus();
            return false;
        }
         if (cboPlace.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Place");
            cboPlace.requestFocus();
            return false;
        }
         if (txtMethodIndecation.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Method/Indecation ");
            txtMethodIndecation.requestFocus();
            return false;
        }
         if (txtLabour.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Labour");
            txtLabour.requestFocus();
            return false;
         }
        if (txtComplications.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Complications ");
            txtComplications.requestFocus();
        }
        
         
         if (txtBFVaccination.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter B/F Vaccination");
            txtBFVaccination.requestFocus();
            return false;
        }
         
        if (txtBirthWeight.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Birth Weight");
            txtBirthWeight.requestFocus();
        }
        try {
            Float.parseFloat(txtBirthWeight.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, txtBirthWeight.getText().trim()
                    + " is not a valid value for Birth Weight");
            txtBirthWeight.requestFocus();
            return false;
        }
        if (txtPresentStatus.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Present Status");
            txtPresentStatus.requestFocus();
            return false;
        }
        if (txtPresentAddress.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Present Address");
            txtPresentAddress.requestFocus();
            return false;
        }
        return ret;
    }
    
    private void clearPastObsHis() {
        
         setDate(0);
         txtBabyName.setText("");
         txtAge.setText("");
         cboGender.setSelectedIndex(0);
         txtPregnancyWeeks.setText("");
         txtDelivery.setText("");
         cboPlace.setSelectedIndex(0);
         txtMethodIndecation.setText("");
         txtComplications.setText("");
         txtLabour.setText("");
         txtBirthWeight.setText("");
         txtBFVaccination.setText("");
         txtPresentStatus.setText("");
         txtPresentAddress.setText("");
         btnRegisterPOH.setEnabled(true);
         btnEditPOH.setEnabled(false);
         txtBabyName.requestFocus();
    }

    private void setInTabForm() {
    
        txtA1.setText(antenatalPatientObj.getA().trim());
        txtBreast1.setText(antenatalPatientObj.getBreast().trim());
        txtThyroid1.setText(antenatalPatientObj.getThyroid().trim());
        txtCongentalAnamoly1.setText(antenatalPatientObj.getCongentalAnamoly().trim());
        txtContraception1.setText(antenatalPatientObj.getContraception().trim());
        txtDepartment1.setText(antenatalPatientObj.getDepartment().trim());
        txtDrugAllergy1.setText(antenatalPatientObj.getDrugAllergy().trim());
        txtEducation1.setText(antenatalPatientObj.getEducation().trim());
        txtFamilyHistory1.setText(antenatalPatientObj.getFamilyHistory().trim());
        txtG1.setText(antenatalPatientObj.getG().trim());
        txtGpePollar1.setText(antenatalPatientObj.getGprPollar().trim());
        txtHusbandName1.setText(antenatalPatientObj.getHusbandName().trim());
        txtMc1.setText(antenatalPatientObj.getMC().trim());
        txtMedSurgHis1.setText(antenatalPatientObj.getMedicalSurgicalHistory().trim());
        txtOccupation1.setText(antenatalPatientObj.getOccupation().trim());
        txtP1.setText(antenatalPatientObj.getP().trim());
        txtVaricoseVeins1.setText(antenatalPatientObj.getVaricoseVeins().trim());
        setDate(Integer.parseInt(antenatalPatientObj.getYearsMarriedDay()));
    }
}
