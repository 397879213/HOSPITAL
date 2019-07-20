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
import utilities.DefinitionTypes;
import utilities.DisplayLOV;

public class AntenatalCardForm extends javax.swing.JInternalFrame {

    private String pregnancyVisitId = "";
    private String patientId = "";
    private String referenceId = "";
    private String yearsMarriedDate = "";
    private String LMPDate = "";
    private String EDDDate = "";
    private String nextVisitDate = "";
    private String fromDate = "";
    private String toDate = "";
    private String USEDDDate = "";
    private String primaryPhyId = "";
    private String dob = "";
    private String birthDate = "";
    private String educationId = "10590";

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
    private PatientHospitalVisit visit = new PatientHospitalVisit();

    //Previous Pregnancy History
    BirthCertificateController ctlPastObstetricHistory = new BirthCertificateController();
    BOBirthCertificate PastObstetricHistoryBO = new BOBirthCertificate();
    List<BOBirthCertificate> listPastObstetricHistory = new ArrayList();
    List<BOBirthCertificate> listPastObstetricHistoryChk = new ArrayList();
    private String usgExpDate;

//    public AntenatalCardForm(PatientHospitalVisit visit) {
//        this.visit = visit;
//        formSetup();
//
//    }
    public AntenatalCardForm() {
        formSetup();
    }

    private void formSetup() {
        initComponents();
        this.setSize(Constants.xSize + 340, Constants.ySize - 50);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
        btnPregnancyInfoSave.setMnemonic(KeyEvent.VK_S);
        btnPregnancyInfoFinal.setMnemonic(KeyEvent.VK_F);
        btnRegisterPOH.setMnemonic(KeyEvent.VK_R);
        btnEditPOH.setMnemonic(KeyEvent.VK_U);
//        selectPregnancyVisitId();
//        setPatientDemography();
        setDate(0);
//        setYearsMarriedDate(0);
//        setVisitDate(0);
//        selectAntenatalPatient();
        selectGayneeParameter();
        previousPregnancies();
        searchAntenatalVisit("", patientId, "", "", "Y");
        setDataInTextBoxes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        txtClient = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        txtBloodGroup = new javax.swing.JTextField();
        jLabel146 = new javax.swing.JLabel();
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
        txtContraception = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtP = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        txtYearsMarried = new org.jdesktop.swingx.JXDatePicker();
        txtA = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        txtLMP = new javax.swing.JTextField();
        txtEdd = new javax.swing.JTextField();
        cboRiskFactor = new javax.swing.JComboBox<String>();
        jLabel144 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtDrugAllergy = new javax.swing.JTextArea();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRiskFactorRemarks = new javax.swing.JTextArea();
        tabPregnancyInfo = new javax.swing.JTabbedPane();
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
        cboLie = new javax.swing.JComboBox<String>();
        jLabel59 = new javax.swing.JLabel();
        txtNextVisitDate = new org.jdesktop.swingx.JXDatePicker();
        cboPres = new javax.swing.JComboBox<String>();
        jLabel47 = new javax.swing.JLabel();
        txtUsg = new org.jdesktop.swingx.JXDatePicker();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblAntenatalPatVisit = new javax.swing.JTable();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        txtSetFundalHeight = new javax.swing.JTextField();
        txtSetFoetalHeart = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        txtSetOedema = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtSetAdvised = new javax.swing.JTextArea();
        jLabel122 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        txtSetWeekByDate = new javax.swing.JTextField();
        txtSetPresentation = new javax.swing.JTextField();
        txtSetBPSys = new javax.swing.JTextField();
        txtSetWeight = new javax.swing.JTextField();
        txtSetLie = new javax.swing.JTextField();
        txtSetNextVisit = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtSetUsgEd = new javax.swing.JTextField();
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
        txtAc = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtGestationSac = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        cboCervix = new javax.swing.JComboBox<String>();
        cboPlacenta = new javax.swing.JComboBox<String>();
        jLabel39 = new javax.swing.JLabel();
        cboGrade = new javax.swing.JComboBox<String>();
        jLabel40 = new javax.swing.JLabel();
        cboCord = new javax.swing.JComboBox<String>();
        jLabel41 = new javax.swing.JLabel();
        cboAmnioticFluidVolume = new javax.swing.JComboBox<String>();
        jLabel42 = new javax.swing.JLabel();
        txtNuchalTranslucency = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtHeadCircumference = new javax.swing.JTextField();
        txtUltrasoundEdd = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConclusion = new javax.swing.JTextArea();
        cboFetus = new javax.swing.JComboBox<String>();
        cboFca = new javax.swing.JComboBox<String>();
        jLabel60 = new javax.swing.JLabel();
        txtBiparietalDiameter = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtCrl = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        cboLie1 = new javax.swing.JComboBox<String>();
        cboPresentation = new javax.swing.JComboBox<String>();
        cboLiquor = new javax.swing.JComboBox<String>();
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
        btnFetchRecord = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtUltraConclusion = new javax.swing.JTextArea();
        txtUltraLiquor = new javax.swing.JTextField();
        txtUltraPlacenta = new javax.swing.JTextField();
        txtUltraCrl = new javax.swing.JTextField();
        txtUltraAc = new javax.swing.JTextField();
        txtUltraGrade = new javax.swing.JTextField();
        txtUltraCord = new javax.swing.JTextField();
        txtUltraBiparietalDia = new javax.swing.JTextField();
        txtUltraGestationSac = new javax.swing.JTextField();
        txtUltraNuchalTrans = new javax.swing.JTextField();
        txtUltraFemurLength = new javax.swing.JTextField();
        txtUltraHeadCircumf = new javax.swing.JTextField();
        txtUltrasoundEddDate = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        txtUltraCervix = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        txtUltraAmnioticFV = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        pnlUserDetail1 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        cboGender = new javax.swing.JComboBox<String>();
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
        cboPlace = new javax.swing.JComboBox<String>();
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
        jPanel11 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        txtSetPregnancyWeek = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        txtSetDelivery = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        txtSetMethode = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        txtSetLabour = new javax.swing.JTextField();
        txtSetComplications = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        txtSetBirthWeight = new javax.swing.JTextField();
        txtSetVaccination = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        txtSetPresentStatus = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtSetPresentAddress = new javax.swing.JTextArea();
        jLabel78 = new javax.swing.JLabel();
        txtSetBabyName = new javax.swing.JTextField();
        txtSetDob = new org.jdesktop.swingx.JXDatePicker();
        txtSetAge = new javax.swing.JTextField();
        cboSetGender = new javax.swing.JComboBox<String>();
        jLabel82 = new javax.swing.JLabel();
        cboBirthPlace = new javax.swing.JComboBox<String>();
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
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        cboRiskFactor1 = new javax.swing.JComboBox<String>();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtRiskFactorRemarks1 = new javax.swing.JTextArea();
        txtLMP1 = new org.jdesktop.swingx.JXDatePicker();
        txtEDD1 = new org.jdesktop.swingx.JXDatePicker();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtFamilyHistory1 = new javax.swing.JTextArea();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtMedSurgHis1 = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnPregnancyInfoSave = new javax.swing.JButton();
        btnPregnancyInfoFinal = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtDrugAllergy1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Antenatal Visit");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1180, 710));
        setRequestFocusEnabled(false);

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
        jLabel10.setText("Admission # : ");

        txtAgeGender.setEditable(false);

        txtWard.setEditable(false);

        txtAdmissionNumber.setEditable(false);

        txtBed.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Physician Name : ");

        txtPrimaryPhy.setEditable(false);

        txtClient.setEditable(false);

        txtContactNo.setEditable(false);

        jLabel79.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(102, 0, 0));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel79.setText("Ward Name : ");

        jLabel80.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(102, 0, 0));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel80.setText("Age  : ");

        jLabel81.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(102, 0, 0));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel81.setText("Bed : ");

        jLabel83.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(102, 0, 0));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel83.setText("Contact Number : ");

        jLabel85.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(102, 0, 0));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel85.setText("Blood Group : ");

        txtBloodGroup.setEditable(false);

        jLabel146.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(102, 0, 0));
        jLabel146.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel146.setText("Org.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmissionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPatientName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgeGender))
                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtContactNo)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel146, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBed, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(txtClient)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pregnncy Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

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
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Family History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtFamilyHistory.setEditable(false);
        txtFamilyHistory.setColumns(20);
        txtFamilyHistory.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFamilyHistory.setLineWrap(true);
        txtFamilyHistory.setRows(5);
        txtFamilyHistory.setWrapStyleWord(true);
        jScrollPane10.setViewportView(txtFamilyHistory);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medical/ Surgical History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtMedSurgHis.setEditable(false);
        txtMedSurgHis.setColumns(20);
        txtMedSurgHis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMedSurgHis.setLineWrap(true);
        txtMedSurgHis.setRows(5);
        txtMedSurgHis.setWrapStyleWord(true);
        jScrollPane11.setViewportView(txtMedSurgHis);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

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

        jLabel49.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 0, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("LMP :");

        jLabel108.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(102, 0, 0));
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel108.setText("EDD :");

        txtLMP.setEditable(false);
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

        txtEdd.setEditable(false);
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

        cboRiskFactor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Risk Factor", " 1 "," 2 ", " 3", " 4" }));
        cboRiskFactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRiskFactorActionPerformed(evt);
            }
        });

        jLabel144.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(102, 0, 0));
        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel144.setText("Contraception : ");

        jPanel27.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drug/ Allergy ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtDrugAllergy.setColumns(20);
        txtDrugAllergy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDrugAllergy.setLineWrap(true);
        txtDrugAllergy.setRows(5);
        txtDrugAllergy.setWrapStyleWord(true);
        jScrollPane5.setViewportView(txtDrugAllergy);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel28.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Risk Factor Remarks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtRiskFactorRemarks.setColumns(20);
        txtRiskFactorRemarks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRiskFactorRemarks.setLineWrap(true);
        txtRiskFactorRemarks.setRows(5);
        txtRiskFactorRemarks.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtRiskFactorRemarks);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel144, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txtYearsMarried, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEducation, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                            .addComponent(txtHusbandName)
                            .addComponent(txtOccupation)
                            .addComponent(txtDepartment)
                            .addComponent(txtCongentalAnamoly)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtVaricoseVeins, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtThyroid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(txtContraception))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBreast)
                                    .addComponent(txtGpePollar)
                                    .addComponent(txtMc)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(txtG, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtLMP, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtA))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEdd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboRiskFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(txtYearsMarried, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEducation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCongentalAnamoly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThyroid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBreast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGpePollar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraception, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVaricoseVeins)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboRiskFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        tabPregnancyInfo.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        tabPregnancyInfo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabPregnancyInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPregnancyInfoMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabPregnancyInfoMouseReleased(evt);
            }
        });

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

        jLabel47.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 0, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setText("USG Expected Date : ");

        txtUsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtOedema))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNextVisitDate, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFundalHeight)
                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(cboLie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtWeight)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(txtSys))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDias)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFoetalHeart, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboPres, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtWeeksByDates, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFundalHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFoetalHeart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNextVisitDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOedema, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Antenatal Visit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblAntenatalPatVisit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Sr.No","Consultancy Id", "Final Date", "Final By"
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

        jLabel102.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(102, 0, 0));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel102.setText("Lie : ");

        jLabel103.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(102, 0, 0));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel103.setText("Presentation : ");

        jLabel104.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(102, 0, 0));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel104.setText("Foetal Heart : ");

        jLabel105.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(102, 0, 0));
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel105.setText("Fundal Height :  ");

        txtSetFundalHeight.setEditable(false);
        txtSetFundalHeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSetFundalHeightMouseClicked(evt);
            }
        });
        txtSetFundalHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSetFundalHeightActionPerformed(evt);
            }
        });

        txtSetFoetalHeart.setEditable(false);
        txtSetFoetalHeart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSetFoetalHeartMouseClicked(evt);
            }
        });
        txtSetFoetalHeart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSetFoetalHeartActionPerformed(evt);
            }
        });

        jLabel106.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(102, 0, 0));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel106.setText("Oedema : ");

        txtSetOedema.setEditable(false);
        txtSetOedema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSetOedemaMouseClicked(evt);
            }
        });
        txtSetOedema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSetOedemaActionPerformed(evt);
            }
        });

        jLabel107.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(102, 0, 0));
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel107.setText("Next Visit : ");

        jPanel25.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Advised", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 10))); // NOI18N
        jPanel25.setForeground(new java.awt.Color(102, 0, 0));

        txtSetAdvised.setEditable(false);
        txtSetAdvised.setColumns(20);
        txtSetAdvised.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSetAdvised.setRows(5);
        jScrollPane6.setViewportView(txtSetAdvised);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        jLabel122.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(102, 0, 0));
        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel122.setText("B.P :  ");

        jLabel124.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(102, 0, 0));
        jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel124.setText("Weight : ");

        jLabel125.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(102, 0, 0));
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel125.setText("Weeks By Dates : ");

        txtSetWeekByDate.setEditable(false);

        txtSetPresentation.setEditable(false);

        txtSetBPSys.setEditable(false);

        txtSetWeight.setEditable(false);

        txtSetLie.setEditable(false);

        txtSetNextVisit.setEditable(false);

        jLabel48.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 0, 0));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("USG ED : ");

        txtSetUsgEd.setEditable(false);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel122, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSetFundalHeight, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSetOedema, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSetBPSys)
                    .addComponent(txtSetWeight)
                    .addComponent(txtSetLie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel125, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSetWeekByDate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSetPresentation)
                    .addComponent(txtSetFoetalHeart)
                    .addComponent(txtSetNextVisit, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(txtSetUsgEd))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSetBPSys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSetUsgEd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSetWeekByDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSetWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSetPresentation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSetLie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSetFoetalHeart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSetFundalHeight)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSetOedema, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSetNextVisit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel20.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Advised", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel20.setForeground(new java.awt.Color(102, 0, 0));

        txtAdvised.setColumns(20);
        txtAdvised.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAdvised.setLineWrap(true);
        txtAdvised.setRows(5);
        txtAdvised.setWrapStyleWord(true);
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
            .addComponent(jScrollPane4)
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
                .addContainerGap(165, Short.MAX_VALUE))
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
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        tabPregnancyInfo.addTab("Antenatal Visit", jPanel4);

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

        jLabel36.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel36.setText("Expected  Delivery Date : ");

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
        txtConclusion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtConclusion.setLineWrap(true);
        txtConclusion.setRows(5);
        txtConclusion.setToolTipText("Conclusion/ Remarks");
        txtConclusion.setWrapStyleWord(true);
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
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboPlacenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBiparietalDiameter)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtGestationSac, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboFetus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboLie1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cboCord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAc)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(cboLiquor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboPresentation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboFca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cboAmnioticFluidVolume, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFemur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCrl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHeadCircumference, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNuchalTranslucency, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboCervix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUltrasoundEdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Previous Scans", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblGyaneeParameter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Finl Date","Final By" , "Fetus", "FCA" , "Lie",
                "Presentation"
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
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSaveGynae.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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

        btnExitGynae.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExitGynae.setForeground(new java.awt.Color(103, 0, 0));
        btnExitGynae.setText("Exit");
        btnExitGynae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitGynaeActionPerformed(evt);
            }
        });

        btnFianlSignGynae.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFianlSignGynae.setForeground(new java.awt.Color(0, 51, 153));
        btnFianlSignGynae.setText("Final Sign");
        btnFianlSignGynae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFianlSignGynaeActionPerformed(evt);
            }
        });

        btnCopyGynae.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCopyGynae.setForeground(new java.awt.Color(51, 102, 0));
        btnCopyGynae.setText("Copy");
        btnCopyGynae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyGynaeActionPerformed(evt);
            }
        });

        btnFetchRecord.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFetchRecord.setText("Fetch Record");
        btnFetchRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFetchRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnClearGynae, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveGynae, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFianlSignGynae, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFetchRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopyGynae, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExitGynae, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(btnExitGynae)
                    .addComponent(btnFetchRecord))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel131.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(102, 0, 0));
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel131.setText("Liquor : ");

        jLabel133.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(102, 0, 0));
        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel133.setText(" Bip. diameter :");

        jLabel134.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(102, 0, 0));
        jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel134.setText(" Placenta : ");

        jLabel135.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(102, 0, 0));
        jLabel135.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel135.setText("CRL : ");

        jLabel136.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(102, 0, 0));
        jLabel136.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel136.setText(" Gestation Sac : ");

        jLabel137.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(102, 0, 0));
        jLabel137.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel137.setText(" Head Circumf : ");

        jLabel138.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(102, 0, 0));
        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel138.setText("AC : ");

        jLabel139.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(102, 0, 0));
        jLabel139.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel139.setText(" Nuc Translu : ");

        jLabel141.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(102, 0, 0));
        jLabel141.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel141.setText("CORD : ");

        jLabel142.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(102, 0, 0));
        jLabel142.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel142.setText(" Grade : ");

        jLabel143.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(102, 0, 0));
        jLabel143.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel143.setText(" Ultrasound Date : ");

        txtUltraConclusion.setEditable(false);
        txtUltraConclusion.setColumns(20);
        txtUltraConclusion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtUltraConclusion.setLineWrap(true);
        txtUltraConclusion.setRows(5);
        txtUltraConclusion.setWrapStyleWord(true);
        txtUltraConclusion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUltraConclusionMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(txtUltraConclusion);

        txtUltraLiquor.setEditable(false);

        txtUltraPlacenta.setEditable(false);

        txtUltraCrl.setEditable(false);

        txtUltraAc.setEditable(false);

        txtUltraGrade.setEditable(false);

        txtUltraCord.setEditable(false);

        txtUltraBiparietalDia.setEditable(false);

        txtUltraGestationSac.setEditable(false);

        txtUltraNuchalTrans.setEditable(false);

        txtUltraFemurLength.setEditable(false);

        txtUltraHeadCircumf.setEditable(false);
        txtUltraHeadCircumf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUltraHeadCircumfActionPerformed(evt);
            }
        });

        txtUltrasoundEddDate.setEditable(false);

        jLabel140.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(102, 0, 0));
        jLabel140.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel140.setText(" CERVIX : ");

        txtUltraCervix.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText(" Femur Length :");

        jLabel132.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(102, 0, 0));
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel132.setText(" Amnio Fluid Vol :");

        txtUltraAmnioticFV.setEditable(false);
        txtUltraAmnioticFV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUltraAmnioticFVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUltraPlacenta, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel135, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel140, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(jLabel141, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUltraCrl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(txtUltraLiquor)
                                    .addComponent(txtUltraAc)
                                    .addComponent(txtUltraCervix)
                                    .addComponent(txtUltraCord)))
                            .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUltraGrade)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel139, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(jLabel133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel137, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(jLabel136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel143, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUltraHeadCircumf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUltraFemurLength)
                            .addComponent(txtUltraAmnioticFV)
                            .addComponent(txtUltraNuchalTrans)
                            .addComponent(txtUltraGestationSac)
                            .addComponent(txtUltraBiparietalDia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUltrasoundEddDate)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUltraCrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel135, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(jLabel133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUltraBiparietalDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUltraLiquor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(jLabel136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUltraGestationSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUltraNuchalTrans, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUltraAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel138, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                                .addComponent(jLabel139, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtUltraAmnioticFV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUltraCervix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUltraCord)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUltraFemurLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtUltraHeadCircumf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUltraPlacenta)
                        .addComponent(jLabel137, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel142, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(txtUltraGrade)
                    .addComponent(jLabel143, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(txtUltrasoundEddDate, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        tabPregnancyInfo.addTab("Ultrasound", jPanel5);

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pnlUserDetail1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail1.setForeground(java.awt.SystemColor.activeCaption);

        jLabel64.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(102, 0, 0));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel64.setText("Gender : ");

        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Male","Female"}));
        cboGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGenderActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 0, 0));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel65.setText("DOB : ");

        jLabel66.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 0, 0));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel66.setText("Delivery : ");

        jLabel67.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(102, 0, 0));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel67.setText("Pregnancy Weeks : ");

        jLabel68.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(102, 0, 0));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel68.setText("Place : ");

        jLabel69.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(102, 0, 0));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel69.setText(" Present Address  : ");

        jLabel70.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
        txtPresentAddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPresentAddress.setRows(5);
        jScrollPane2.setViewportView(txtPresentAddress);

        txtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDobActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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

        jLabel72.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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

        jLabel73.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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

        jLabel74.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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

        jLabel75.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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

        jLabel76.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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

        jLabel77.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetail1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPresentStatus, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBabyName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlUserDetail1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(txtBFVaccination))
                            .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPregnancyWeeks)
                                .addComponent(txtDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(cboPlace, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtLabour, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDelivery)
                            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                                .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBirthWeight)
                            .addComponent(txtComplications)
                            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMethodIndecation)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlUserDetail1Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblPastObstetricHistory.setBackground(java.awt.SystemColor.activeCaption);
        tblPastObstetricHistory.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblPastObstetricHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Crtd Date","Crtd By","Name","Age","Gender"}
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
            .addGap(0, 451, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClearPOH, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegisterPOH, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditPOH, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );
        pnlUserDetail2Layout.setVerticalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditPOH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClearPOH)
                    .addComponent(btnRegisterPOH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit1)))
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel112.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(102, 0, 0));
        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel112.setText("Pregnancy Weeks : ");

        jLabel113.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(102, 0, 0));
        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel113.setText("Delivery : ");

        jLabel114.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(102, 0, 0));
        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel114.setText("Place : ");

        jLabel115.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(102, 0, 0));
        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel115.setText("Method/Indication : ");

        jLabel116.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(102, 0, 0));
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel116.setText("Labour : ");

        jLabel117.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(102, 0, 0));
        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel117.setText("Complications : ");

        jLabel118.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(102, 0, 0));
        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel118.setText("B/F Vaccination : ");

        jLabel119.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(102, 0, 0));
        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel119.setText("Birth Weight (pound): ");

        jLabel120.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(102, 0, 0));
        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel120.setText("Present Status : ");

        jLabel121.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(102, 0, 0));
        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel121.setText(" Present Address  : ");

        txtSetPresentAddress.setColumns(20);
        txtSetPresentAddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSetPresentAddress.setRows(5);
        jScrollPane7.setViewportView(txtSetPresentAddress);

        jLabel78.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(102, 0, 0));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel78.setText("Baby Name : ");

        txtSetBabyName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSetBabyName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSetBabyNameMouseReleased(evt);
            }
        });
        txtSetBabyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSetBabyNameActionPerformed(evt);
            }
        });

        txtSetDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSetDobActionPerformed(evt);
            }
        });

        txtSetAge.setEditable(false);
        txtSetAge.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSetAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSetAgeMouseReleased(evt);
            }
        });
        txtSetAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSetAgeActionPerformed(evt);
            }
        });

        cboSetGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Male","Female"}));
        cboSetGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSetGenderActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(102, 0, 0));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel82.setText("Date Of Birth : ");

        cboBirthPlace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "HOSPITAL", "HOME" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel120, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel117, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel119, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jLabel121, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSetPresentStatus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSetComplications, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(txtSetMethode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSetPregnancyWeek, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSetBirthWeight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSetLabour, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSetVaccination, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboBirthPlace, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSetDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSetBabyName)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtSetDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSetAge, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboSetGender, 0, 79, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSetBabyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSetDob, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSetAge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboSetGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSetDelivery)
                    .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSetPregnancyWeek)
                    .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSetMethode)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel114)
                        .addComponent(cboBirthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSetComplications)
                    .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSetLabour))
                .addGap(7, 7, 7)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSetBirthWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSetVaccination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSetPresentStatus)
                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(pnlUserDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(pnlUserDetail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlUserDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUserDetail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPregnancyInfo.addTab("Previous Pregnancy History", jPanel7);

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel22.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pregnncy Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

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

        jLabel109.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(102, 0, 0));
        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel109.setText("LMP :");

        jLabel110.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(102, 0, 0));
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel110.setText("EDD :");

        cboRiskFactor1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Risk Factor", " 1 "," 2 ", " 3", " 4" }));
        cboRiskFactor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRiskFactor1ActionPerformed(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Risk Factor Remarks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtRiskFactorRemarks1.setColumns(20);
        txtRiskFactorRemarks1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRiskFactorRemarks1.setLineWrap(true);
        txtRiskFactorRemarks1.setRows(5);
        txtRiskFactorRemarks1.setWrapStyleWord(true);
        jScrollPane16.setViewportView(txtRiskFactorRemarks1);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );

        txtLMP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLMP1ActionPerformed(evt);
            }
        });

        txtEDD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEDD1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel96, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel92, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel99, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel101, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHusbandName1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOccupation1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCongentalAnamoly1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDepartment1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtThyroid1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBreast1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtContraception1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(txtYearsMarried1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel87)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEducation1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                                        .addComponent(txtG1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtP1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                                    .addComponent(txtMc1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtVaricoseVeins1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                            .addComponent(txtGpePollar1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                            .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtA1))
                                    .addComponent(cboRiskFactor1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtLMP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEDD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHusbandName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYearsMarried1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEducation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOccupation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepartment1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCongentalAnamoly1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThyroid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBreast1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraception1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGpePollar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLMP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVaricoseVeins1)
                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEDD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMc1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboRiskFactor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel23.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Family History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtFamilyHistory1.setColumns(20);
        txtFamilyHistory1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFamilyHistory1.setLineWrap(true);
        txtFamilyHistory1.setRows(5);
        txtFamilyHistory1.setWrapStyleWord(true);
        jScrollPane12.setViewportView(txtFamilyHistory1);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );

        jPanel24.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medical/ Surgical History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtMedSurgHis1.setColumns(20);
        txtMedSurgHis1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMedSurgHis1.setLineWrap(true);
        txtMedSurgHis1.setRows(5);
        txtMedSurgHis1.setWrapStyleWord(true);
        jScrollPane13.setViewportView(txtMedSurgHis1);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING)
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

        btnPregnancyInfoSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPregnancyInfoSave.setForeground(new java.awt.Color(0, 102, 0));
        btnPregnancyInfoSave.setText("Save");
        btnPregnancyInfoSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPregnancyInfoSaveActionPerformed(evt);
            }
        });

        btnPregnancyInfoFinal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPregnancyInfoFinal.setForeground(new java.awt.Color(0, 153, 153));
        btnPregnancyInfoFinal.setText("Final");
        btnPregnancyInfoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPregnancyInfoFinalActionPerformed(evt);
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
                .addComponent(btnPregnancyInfoSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnPregnancyInfoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnPregnancyInfoSave)
                    .addComponent(btnPregnancyInfoFinal)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drug/ Allergies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtDrugAllergy1.setColumns(20);
        txtDrugAllergy1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDrugAllergy1.setLineWrap(true);
        txtDrugAllergy1.setRows(5);
        txtDrugAllergy1.setWrapStyleWord(true);
        jScrollPane14.setViewportView(txtDrugAllergy1);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPregnancyInfo.addTab("Current Pregnancy Information", jPanel13);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(tabPregnancyInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tabPregnancyInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnPregnancyInfoSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPregnancyInfoSaveActionPerformed
        // TODO add your handling code here:
        if (!chkFields()) {
            return;
        }
        setDataInObject();
        antenatalPatientObj.setIsFinal("N");
        antenatalPatientObj.setFinalBy("");
        antenatalPatientObj.setFinalDate("''");
        antenatalPatientObj.setFinalTerminalId("");
        saveAntenatalPatientInfo();
    }//GEN-LAST:event_btnPregnancyInfoSaveActionPerformed

    private void btnPregnancyInfoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPregnancyInfoFinalActionPerformed
        // TODO add your handling code here:
        if (!chkFields()) {
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Final Current Pregnancy Information");
        if (confirmation != 0) {
            return;
        }
        setDataInObject();
        antenatalPatientObj.setIsFinal("Y");
        antenatalPatientObj.setFinalBy(Constants.userId);
        antenatalPatientObj.setFinalDate(Constants.today);
        antenatalPatientObj.setFinalTerminalId(Constants.terminalId);
        saveAntenatalPatientInfo();
    }//GEN-LAST:event_btnPregnancyInfoFinalActionPerformed

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
//        disableAntenatalVisitFields();
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

    private void cboRiskFactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboRiskFactorActionPerformed
        // TODO add your handling code here:
        txtRiskFactorRemarks.requestFocus();
    }//GEN-LAST:event_cboRiskFactorActionPerformed

    private void btnSaveAntenatalVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAntenatalVisitActionPerformed
        // TODO add your handling code here:
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
        this.dispose();
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

    private void txtAcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAcMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcMouseClicked

    private void txtAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcActionPerformed
        // TODO add your handling code here:
        txtNuchalTranslucency.requestFocus();
    }//GEN-LAST:event_txtAcActionPerformed

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
                    "Gyne Ultrasound ", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        USEDDDate = dateFormat.format(txtUltrasoundEdd.getDate());
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

        gayneeParameterObj = listFianlParameters.get(tblGyaneeParameter.getSelectedRow());
        if (gayneeParameterObj.getIsFinal().equalsIgnoreCase("Y")) {
            btnFianlSignGynae.setEnabled(false);
            btnSaveGynae.setEnabled(false);
            setBodyData(tblGyaneeParameter.getSelectedRow());
        }
        if (gayneeParameterObj.getIsFinal().equalsIgnoreCase("N")) {
            btnFianlSignGynae.setEnabled(true);
            btnSaveGynae.setEnabled(true);
            setGynaeDataInTextBox();
        }
    }//GEN-LAST:event_tblGyaneeParameterMouseReleased

    private void tblGyaneeParameterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblGyaneeParameterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGyaneeParameterKeyReleased

    private void btnSaveGynaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveGynaeActionPerformed
        // TODO add your handling code here:
        objSaveGynae.setIsFinal("N");
        objSaveGynae.setFianlBy("");
        objSaveGynae.setFianlDate("''");
        objSaveGynae.setFianlTerminalId("");
        saveRecordGynae();
        selectGayneeParameter();
    }//GEN-LAST:event_btnSaveGynaeActionPerformed

    private void btnClearGynaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearGynaeActionPerformed
        // TODO add your handling code here:
        clearGynae();
        btnPregnancyInfoSave.setEnabled(true);
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
        selectGayneeParameter();
    }//GEN-LAST:event_btnFianlSignGynaeActionPerformed

    private void btnCopyGynaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyGynaeActionPerformed
        // TODO add your handling code here:
        copyParameter();
        selectGayneeParameter();
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

        listPastObstetricHistoryChk = ctlPastObstetricHistory.selectPatientSearch(patientId,
                referenceId);
        btnRegisterPOH.setEnabled(true);
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
        if (ctlPastObstetricHistory.insertBirthCertificate(PastObstetricHistoryBO, false)) {//no req patient Id
            JOptionPane.showMessageDialog(null, "Records save Successfully");
            previousPregnancies();
            clearPastObsHis();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save. \n"
                    + "Kindly contact Administrator.");
        }

    }//GEN-LAST:event_btnRegisterPOHActionPerformed

    private void btnEditPOHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPOHActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Update Info. \nDo you want to Update?");
        if (confirmation != 0) {
            return;
        }
        setPreviousPregnancyUpdateData();


    }//GEN-LAST:event_btnEditPOHActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnClearPOHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearPOHActionPerformed

        clearPastObsHis();
    }//GEN-LAST:event_btnClearPOHActionPerformed

    private void txtYearsMarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearsMarriedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearsMarriedActionPerformed

    private void txtHusbandName1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHusbandName1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHusbandName1MouseClicked

    private void txtHusbandName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHusbandName1ActionPerformed
        // TODO add your handling code here:
        txtEducation1.requestFocus();
    }//GEN-LAST:event_txtHusbandName1ActionPerformed

    private void txtDepartment1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDepartment1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartment1MouseClicked

    private void txtDepartment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartment1ActionPerformed
        // TODO add your handling code here:
        txtCongentalAnamoly1.requestFocus();
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
        lov.LOVDefinitionSelection(DefinitionTypes.educationLevel,
                txtEducation1.getText().trim(), this);
        educationId = Constants.lovID;
        txtEducation1.setText(Constants.lovDescription);
        txtOccupation1.requestFocus();
    }//GEN-LAST:event_txtEducation1ActionPerformed

    private void txtCongentalAnamoly1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCongentalAnamoly1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCongentalAnamoly1MouseClicked

    private void txtCongentalAnamoly1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCongentalAnamoly1ActionPerformed
        // TODO add your handling code here:
        txtThyroid1.requestFocus();
    }//GEN-LAST:event_txtCongentalAnamoly1ActionPerformed

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
        txtContraception1.requestFocus();
    }//GEN-LAST:event_txtBreast1ActionPerformed

    private void txtVaricoseVeins1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVaricoseVeins1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVaricoseVeins1MouseClicked

    private void txtVaricoseVeins1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVaricoseVeins1ActionPerformed
        // TODO add your handling code here:
        txtMc1.requestFocus();
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
        txtG1.requestFocus();
    }//GEN-LAST:event_txtMc1ActionPerformed

    private void txtContraception1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraception1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraception1MouseClicked

    private void txtContraception1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraception1ActionPerformed
        // TODO add your handling code here:
        txtGpePollar1.requestFocus();
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
        txtLMP1.requestFocus();
    }//GEN-LAST:event_txtA1ActionPerformed

    private void txtAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAMouseClicked

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAActionPerformed

    private void txtSetFundalHeightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSetFundalHeightMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetFundalHeightMouseClicked

    private void txtSetFundalHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSetFundalHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetFundalHeightActionPerformed

    private void txtSetFoetalHeartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSetFoetalHeartMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetFoetalHeartMouseClicked

    private void txtSetFoetalHeartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSetFoetalHeartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetFoetalHeartActionPerformed

    private void txtSetOedemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSetOedemaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetOedemaMouseClicked

    private void txtSetOedemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSetOedemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetOedemaActionPerformed

    private void cboRiskFactor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboRiskFactor1ActionPerformed
        // TODO add your handling code here:
        txtRiskFactorRemarks1.requestFocus();
    }//GEN-LAST:event_cboRiskFactor1ActionPerformed

    private void txtUltraConclusionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUltraConclusionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUltraConclusionMouseClicked

    private void txtUsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsgActionPerformed
        // TODO add your handling code here:
        if (txtUsg.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Ultrasound E.D.D DD-MON-YY",
                    "Gaynee Parameter", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        usgExpDate = dateFormat.format(txtUsg.getDate());
        txtAdvised.requestFocus();
    }//GEN-LAST:event_txtUsgActionPerformed

    private void txtUltraAmnioticFVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUltraAmnioticFVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUltraAmnioticFVActionPerformed

    private void txtUltraHeadCircumfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUltraHeadCircumfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUltraHeadCircumfActionPerformed

    private void txtLMP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLMP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLMP1ActionPerformed

    private void txtEDD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEDD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEDD1ActionPerformed

    private void tabPregnancyInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPregnancyInfoMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_tabPregnancyInfoMouseClicked

    private void tabPregnancyInfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPregnancyInfoMouseReleased

        if (tabPregnancyInfo.getSelectedIndex() == 0) {
            selectAntenatalPatient();
        } else if (tabPregnancyInfo.getSelectedIndex() == 1) {

        } else if (tabPregnancyInfo.getSelectedIndex() == 2) {

        } else if (tabPregnancyInfo.getSelectedIndex() == 3) {
            selectAntenatalPatient();
        }
    }//GEN-LAST:event_tabPregnancyInfoMouseReleased

    private void txtSetBabyNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSetBabyNameMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetBabyNameMouseReleased

    private void txtSetBabyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSetBabyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetBabyNameActionPerformed

    private void txtSetDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSetDobActionPerformed
        // TODO add your handling code here: birthDate
        if (txtSetDob.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the DOB DD-MON-YY",
                    "Birth Certificate", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat
                = new SimpleDateFormat("dd-MMM-yy");
        birthDate = dateFormat.format(txtSetDob.getDate());
        cboGender.requestFocus();
    }//GEN-LAST:event_txtSetDobActionPerformed

    private void txtSetAgeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSetAgeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetAgeMouseReleased

    private void txtSetAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSetAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSetAgeActionPerformed

    private void cboSetGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSetGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSetGenderActionPerformed

    private void btnFetchRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchRecordActionPerformed
        // TODO add your handling code here:
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Fetch Record.");
        if (confirmation != 0) {
            return;
        }
        objSaveGynae.setPatientId(patientId);
        objSaveGynae.setReferenceId(referenceId);
        objSaveGynae.setPregnancyVisitId(pregnancyVisitId);
        objSaveGynae.setIsFinal("N");
        objSaveGynae.setFianlBy("");
        if (ctlGayneeParameter.fetchRecord(objSaveGynae)) {
            JOptionPane.showMessageDialog(null, "Record Fetch Sucesssfully");
            selectGayneeParameter();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Fetch Record! Kindly "
                    + "contact Administrator.");
        }
    }//GEN-LAST:event_btnFetchRecordActionPerformed


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
    private javax.swing.JButton btnFetchRecord;
    private javax.swing.JButton btnFianlSign;
    private javax.swing.JButton btnFianlSignGynae;
    private javax.swing.JButton btnPregnancyInfoFinal;
    private javax.swing.JButton btnPregnancyInfoSave;
    private javax.swing.JButton btnRegisterPOH;
    private javax.swing.JButton btnSaveAntenatalVisit;
    private javax.swing.JButton btnSaveGynae;
    private javax.swing.JComboBox<String> cboAmnioticFluidVolume;
    private javax.swing.JComboBox<String> cboBirthPlace;
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
    private javax.swing.JComboBox<String> cboRiskFactor1;
    private javax.swing.JComboBox<String> cboSetGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
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
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
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
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel pnlUserDetail1;
    private javax.swing.JPanel pnlUserDetail2;
    private javax.swing.JTabbedPane tabPregnancyInfo;
    private javax.swing.JTable tblAntenatalPatVisit;
    private javax.swing.JTable tblGyaneeParameter;
    private javax.swing.JTable tblPastObstetricHistory;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtA1;
    private javax.swing.JTextField txtAc;
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
    private javax.swing.JTextArea txtDrugAllergy;
    private javax.swing.JTextArea txtDrugAllergy1;
    private org.jdesktop.swingx.JXDatePicker txtEDD1;
    private javax.swing.JTextField txtEdd;
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
    private org.jdesktop.swingx.JXDatePicker txtLMP1;
    private javax.swing.JTextField txtLabour;
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
    private javax.swing.JTextField txtPregnancyWeeks;
    private javax.swing.JTextArea txtPresentAddress;
    private javax.swing.JTextField txtPresentStatus;
    private javax.swing.JTextField txtPrimaryPhy;
    private javax.swing.JTextArea txtRiskFactorRemarks;
    private javax.swing.JTextArea txtRiskFactorRemarks1;
    private javax.swing.JTextArea txtSetAdvised;
    private javax.swing.JTextField txtSetAge;
    private javax.swing.JTextField txtSetBPSys;
    private javax.swing.JTextField txtSetBabyName;
    private javax.swing.JTextField txtSetBirthWeight;
    private javax.swing.JTextField txtSetComplications;
    private javax.swing.JTextField txtSetDelivery;
    private org.jdesktop.swingx.JXDatePicker txtSetDob;
    private javax.swing.JTextField txtSetFoetalHeart;
    private javax.swing.JTextField txtSetFundalHeight;
    private javax.swing.JTextField txtSetLabour;
    private javax.swing.JTextField txtSetLie;
    private javax.swing.JTextField txtSetMethode;
    private javax.swing.JTextField txtSetNextVisit;
    private javax.swing.JTextField txtSetOedema;
    private javax.swing.JTextField txtSetPregnancyWeek;
    private javax.swing.JTextArea txtSetPresentAddress;
    private javax.swing.JTextField txtSetPresentStatus;
    private javax.swing.JTextField txtSetPresentation;
    private javax.swing.JTextField txtSetUsgEd;
    private javax.swing.JTextField txtSetVaccination;
    private javax.swing.JTextField txtSetWeekByDate;
    private javax.swing.JTextField txtSetWeight;
    private javax.swing.JTextField txtSys;
    private javax.swing.JTextField txtThyroid;
    private javax.swing.JTextField txtThyroid1;
    private javax.swing.JTextField txtUltraAc;
    private javax.swing.JTextField txtUltraAmnioticFV;
    private javax.swing.JTextField txtUltraBiparietalDia;
    private javax.swing.JTextField txtUltraCervix;
    private javax.swing.JTextArea txtUltraConclusion;
    private javax.swing.JTextField txtUltraCord;
    private javax.swing.JTextField txtUltraCrl;
    private javax.swing.JTextField txtUltraFemurLength;
    private javax.swing.JTextField txtUltraGestationSac;
    private javax.swing.JTextField txtUltraGrade;
    private javax.swing.JTextField txtUltraHeadCircumf;
    private javax.swing.JTextField txtUltraLiquor;
    private javax.swing.JTextField txtUltraNuchalTrans;
    private javax.swing.JTextField txtUltraPlacenta;
    private org.jdesktop.swingx.JXDatePicker txtUltrasoundEdd;
    private javax.swing.JTextField txtUltrasoundEddDate;
    private org.jdesktop.swingx.JXDatePicker txtUsg;
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
            txtUltrasoundEdd.setDate(date2);
            USEDDDate = dateFormat.format(date2);
            dob = dateFormat.format(date2);
            txtDob.setDate(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setYearsMarriedDate(int day) {
        try {
            Date date = new Date();
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtYearsMarried1.setDate(date2);
            txtYearsMarried.setDate(date2);
            yearsMarriedDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void selectAntenatalPatient() {
        listAntenatalPatient = ctlantenatalPatient.selectAntenatalPatientInfo(
                patientId, "", pregnancyVisitId);
        if (!listAntenatalPatient.isEmpty()) {
            antenatalPatientObj = listAntenatalPatient.get(0);
            setDataInTextBox();
        } else {
            // clearPastObsHis();
        }
    }

    private void setDataInTextBox() {

        boolean finalStatus = true;
        if (antenatalPatientObj.getIsFinal().equalsIgnoreCase("Y")) {
            finalStatus = false;
        }
        btnPregnancyInfoFinal.setEnabled(finalStatus);
        btnPregnancyInfoSave.setEnabled(finalStatus);
        btnClear.setEnabled(finalStatus);
        btnPregnancyInfoFinal.setEnabled(finalStatus);
        btnPregnancyInfoSave.setEnabled(finalStatus);
        btnClear.setEnabled(finalStatus);
        txtA1.setEditable(finalStatus);
        txtBreast1.setEditable(finalStatus);
        txtCongentalAnamoly1.setEditable(finalStatus);
        txtContraception1.setEditable(finalStatus);
        txtThyroid1.setEditable(finalStatus);
        txtDepartment1.setEditable(finalStatus);
        txtDrugAllergy1.setEditable(finalStatus);
        txtEducation1.setEditable(finalStatus);
        txtFamilyHistory1.setEditable(finalStatus);
        txtG1.setEditable(finalStatus);
        txtGpePollar1.setEditable(finalStatus);
        txtHusbandName1.setEditable(finalStatus);
        txtMc1.setEditable(finalStatus);
        txtMedSurgHis1.setEditable(finalStatus);
        txtOccupation1.setEditable(finalStatus);
        txtP1.setEditable(finalStatus);
        txtVaricoseVeins1.setEditable(finalStatus);
        txtYearsMarried1.setEditable(finalStatus);
        txtLMP1.setEditable(finalStatus);
        txtEDD1.setEditable(finalStatus);
        txtRiskFactorRemarks1.setEditable(finalStatus);
        cboRiskFactor1.setEditable(finalStatus);
        if (!finalStatus) {
            educationId = antenatalPatientObj.getEducationId();
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
            txtLMP.setText(antenatalPatientObj.getLMP().trim());
            txtEdd.setText(antenatalPatientObj.getEDD().trim());
            cboRiskFactor.setSelectedItem(antenatalPatientObj.getRiskFactor());
            txtRiskFactorRemarks.setText(antenatalPatientObj.getRiskFactorRemarks().trim());
            setYearsMarriedDate(Integer.parseInt(antenatalPatientObj.getYearsMarriedDay()));
        }
        setInTabForm();
    }

    private void saveAntenatalPatientInfo() {

        if (listAntenatalPatient.isEmpty()) {
            if (ctlantenatalPatient.insertAntenatalPatientInfo(antenatalPatientObj)) {
                JOptionPane.showMessageDialog(null, "Record Save Successfully.");
                clear();
                selectAntenatalPatient();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Save. "
                        + "\nKindly contact Administrator.");
            }
        } else {
            if (ctlantenatalPatient.updateAntenatalPatientInfo(antenatalPatientObj)) {
                JOptionPane.showMessageDialog(null, "Record Save Successfully.");
                clear();
                selectAntenatalPatient();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Save. "
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
        antenatalPatientObj.setEducationId(educationId);
        antenatalPatientObj.setFamilyHistory(txtFamilyHistory1.getText().trim().replace(",", " "));

        antenatalPatientObj.setRiskFactor(cboRiskFactor1.getSelectedItem().toString());
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
        antenatalPatientObj.setLMP(LMPDate);
        antenatalPatientObj.setEDD(EDDDate);
        USEDDDate = "";
        antenatalPatientObj.setRiskFactorRemarks(txtRiskFactorRemarks1.getText().trim());
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

        btnPregnancyInfoFinal.setEnabled(true);
        btnPregnancyInfoSave.setEnabled(true);
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

        txtA1.setText("");
        txtBreast1.setText("");
        txtThyroid1.setText("");
        txtCongentalAnamoly1.setText("");
        txtContraception1.setText("");
        txtDepartment1.setText("");
        txtDrugAllergy1.setText("");
        txtEducation1.setText("");
        txtFamilyHistory1.setText("");
        txtG1.setText("");
        txtGpePollar1.setText("");
        txtHusbandName1.setText("");
        txtMc1.setText("");
        txtMedSurgHis1.setText("");
        txtOccupation1.setText("");
        txtP1.setText("");
        txtVaricoseVeins1.setText("");
        cboRiskFactor1.setSelectedItem("");
        txtRiskFactorRemarks1.setText("");

    }

    private boolean chkFields() {
        boolean ret = true;
        if (txtA1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter A.");
            txtA1.requestFocus();
            return false;
        }
        if (txtBreast1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Breast Value.");
            txtBreast1.requestFocus();
            return false;
        }
        if (txtCongentalAnamoly1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter Congental Anamoly.");
            txtCongentalAnamoly1.requestFocus();
            return false;
        }
        if (txtContraception1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Contraception.");
            txtContraception1.requestFocus();
            return false;
        }
//        if (txtDepartment1.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly enter Department.");
//            txtDepartment1.requestFocus();
//            return false;
//        }
        if (txtDrugAllergy1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly enter Drug Allergy.");
            txtDrugAllergy1.requestFocus();
            return false;
        }
//        if (txtEducation1.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly enter Education.");
//            txtEducation1.requestFocus();
//            return false;
//        }
//        if (txtFamilyHistory1.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly enter Family History.");
//            txtFamilyHistory1.requestFocus();
//            return false;
//        }
//        if (txtG1.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly enter G.");
//            txtG1.requestFocus();
//            return false;
//        }
//        if (txtP1.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly enter P");
//            txtP1.requestFocus();
//            return false;
//        }
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
//        if (txtOccupation1.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly enter Occupation.");
//            txtOccupation1.requestFocus();
//            return false;
//        }
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
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            if (txtYearsMarried1.getDate().getDate() == 0) {
                JOptionPane.showMessageDialog(null, "Kindly Enter the DD-MON-YY Format",
                        "Pregnancy Information", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if (txtLMP1.getDate().getDate() == 0) {
                JOptionPane.showMessageDialog(null, "Kindly Enter the DD-MON-YY Format",
                        "Pregnancy Information", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if (txtEDD1.getDate().getDate() == 0) {
                JOptionPane.showMessageDialog(null, "Kindly Enter the DD-MON-YY Format",
                        "Pregnancy Information", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            LMPDate = dateFormat.format(txtLMP1.getDate());
            EDDDate = dateFormat.format(txtEDD1.getDate());
            yearsMarriedDate = dateFormat.format(txtYearsMarried1.getDate());
        } catch (Exception ex) {
            return false;
        }
        return ret;
    }

    private void setPatientDemography() {
        patientId = visit.getPatientId();
        referenceId = visit.getConsultancyId();
        primaryPhyId = visit.getPrimaryPhysicianId();
        txtPatientId.setText(visit.getPatientId().substring(3));
        String plno = "";
        if (visit.getOtherInfo().trim().length() != 0) {
            plno = " (" + visit.getOtherInfo() + ")";
        }
        txtPatientId.setText(visit.getPatientId().substring(3).replaceFirst("^0+(?!$)", "")
                + plno);
        txtPatientName.setText(visit.getPatientName());
        txtAgeGender.setText(visit.getAge() + "/ " + visit.getGenderDescription());
        txtContactNo.setText(visit.getContactNo());
        txtAdmissionNumber.setText(visit.getAdmissionNumber());
        txtBed.setText(visit.getBedDescription());
        txtWard.setText(visit.getWardDescription());
        txtPrimaryPhy.setText(visit.getPrimaryPhysicianName());
        txtClient.setText(visit.getClientName());
        //txtAddress.setText(visit.getPatientResidenceArea());
        txtBloodGroup.setText(visit.getBloodGroup());
    }

    private void setAntenatalVisitColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblAntenatalPatVisit.getColumnCount(); i++) {
            column = tblAntenatalPatVisit.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(45);
            } else if (i == 2) {
                column.setPreferredWidth(90);
            } else if (i == 3) {
                column.setPreferredWidth(120);
            }
        }
    }

    private void setSaveRecord() {
        antenatalVisitsObj = new AntenatalVisitsBo();
        antenatalVisitsObj.setPregnancyVisitId(pregnancyVisitId);
        antenatalVisitsObj.setPatientId(patientId);
        antenatalVisitsObj.setReferenceId(referenceId);
        antenatalVisitsObj.setLmp(txtLMP.getText().trim());
        antenatalVisitsObj.setEdd(txtEdd.getText().trim());
        antenatalVisitsObj.setUsgEd(usgExpDate);
        antenatalVisitsObj.setRiskFactor(cboRiskFactor.getSelectedItem().toString());
        antenatalVisitsObj.setRemarks(txtRiskFactorRemarks.getText().trim());

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
                "", "", "", pregnancyVisitId);
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
                referenceId, patientId, fromDate, toDate, isFinal, pregnancyVisitId);
        if (listAntenatalVisit.isEmpty()) {
            return;
        }

        tblAntenatalPatVisit.setModel(new AntenatalVisitTableModel(listAntenatalVisit));
        ListSelectionModel selectionModel = tblAntenatalPatVisit.getSelectionModel();
        tblAntenatalPatVisit.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setAntenatalVisitColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblAntenatalPatVisit);
    }

    private void setDataInTextBoxes() {

        listAntenatalVisitNotFinal = ctlAntenatalVisit.searchAntenatalVisits(referenceId,
                patientId, "", "", "", pregnancyVisitId);
        if (listAntenatalVisitNotFinal.isEmpty()) {
            return;
        }

        AntenatalVisitsBo chkAntenatalVisits = listAntenatalVisitNotFinal.get(0);
        if (chkAntenatalVisits.getIsFinal().equalsIgnoreCase("Y")) {
            btnSaveAntenatalVisit.setEnabled(false);
            btnFianlSign.setEnabled(false);
        }
        if (chkAntenatalVisits.getIsFinal().equalsIgnoreCase("N")) {
            btnPregnancyInfoSave.setEnabled(true);
            btnFianlSign.setEnabled(true);
            txtSetUsgEd.setText(chkAntenatalVisits.getUsgEd().trim());
            txtSetOedema.setText(chkAntenatalVisits.getOedema().trim());
            txtSetBPSys.setText(chkAntenatalVisits.getBloodPressureSystolic().trim()
                    + "/ " + chkAntenatalVisits.getBloodPressureDiastolic().trim());
            txtSetFoetalHeart.setText(chkAntenatalVisits.getFoetalHeart().trim());
            txtSetFundalHeight.setText(chkAntenatalVisits.getFundalHeight().trim());
            txtSetWeight.setText(chkAntenatalVisits.getWeight().trim());
            txtSetWeekByDate.setText(chkAntenatalVisits.getWeeksByDates().trim());
            txtSetAdvised.setText(chkAntenatalVisits.getAdvised().trim());
            txtSetLie.setText(chkAntenatalVisits.getLie().trim());
            txtSetPresentation.setText(chkAntenatalVisits.getPresentation().trim());
            txtSetNextVisit.setText(chkAntenatalVisits.getNextVisitDate());
        }
    }

    private void setTableDataInTextBoxes(AntenatalVisitsBo chkAntenatalVisits) {
        btnPregnancyInfoSave.setEnabled(true);
        btnFianlSign.setEnabled(true);
        txtSetUsgEd.setText(chkAntenatalVisits.getUsgEd().trim());
        txtSetOedema.setText(chkAntenatalVisits.getOedema().trim());
        txtSetBPSys.setText(chkAntenatalVisits.getBloodPressureSystolic().trim()
                + "/ " + chkAntenatalVisits.getBloodPressureDiastolic().trim());
        txtSetFoetalHeart.setText(chkAntenatalVisits.getFoetalHeart().trim());
        txtSetFundalHeight.setText(chkAntenatalVisits.getFundalHeight().trim());
        txtSetWeight.setText(chkAntenatalVisits.getWeight().trim());
        txtSetWeekByDate.setText(chkAntenatalVisits.getWeeksByDates().trim());
        txtSetAdvised.setText(chkAntenatalVisits.getAdvised().trim());
        txtSetLie.setText(chkAntenatalVisits.getLie().trim());
        txtSetPresentation.setText(chkAntenatalVisits.getPresentation().trim());
        txtSetNextVisit.setText(chkAntenatalVisits.getNextVisitDate());
    }

    private boolean chkFieldsAntenatalVisit() {
        boolean ret = true;

        if (usgExpDate.length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter USG ED Length.");
            txtUsg.requestFocus();
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
        txtRiskFactorRemarks.setEditable(false);
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
            txtUsg.setDate(date2);
            nextVisitDate = dateFormat.format(date2);
            usgExpDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setInsertDataGynae() {

        objSaveGynae.setPregnancyVisitId(pregnancyVisitId);
        objSaveGynae.setPatientId(patientId);
        objSaveGynae.setReferenceId(referenceId);
        objSaveGynae.setEddDate(USEDDDate);
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

    private void selectGayneeParameter() {

        clearGynae();
        listFianlParameters = ctlGayneeParameter.selectGayneeParameter(
                patientId, "", pregnancyVisitId);
        tblGyaneeParameter.setModel(new GynaeParameterListTableModel(listFianlParameters));
        ListSelectionModel selectionModel = tblGyaneeParameter.getSelectionModel();
        tblGyaneeParameter.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setParameterListColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblGyaneeParameter);

        listGayneeParam = ctlGayneeParameter.selectGayneeParameter(patientId,
                referenceId, pregnancyVisitId);
        System.err.println("\ndsadasd" + listGayneeParam.size());
        if (listGayneeParam.isEmpty()) {
            btnFianlSignGynae.setEnabled(false);
            btnSaveGynae.setEnabled(false);
            setGynaeDataInTextBox();
        } else {
            btnFianlSignGynae.setEnabled(true);
            btnSaveGynae.setEnabled(true);
            setGynaeDataInTextBox();
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
        gayneeParameterObj = listGayneeParam.get(0);
        if (gayneeParameterObj.getIsFinal().equalsIgnoreCase("Y")) {
            return;
        }
        txtAc.setText(gayneeParameterObj.getAc());
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
                referenceId, pregnancyVisitId);
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
//        txtLmp.setText("");
//        txtEdd1.setText("");
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

        txtUltraAc.setText("");
        txtUltraAmnioticFV.setText("");
        txtUltraBiparietalDia.setText("");
        txtUltraCervix.setText("");
        txtUltraConclusion.setText("");
        txtUltraCord.setText("");
        txtUltraCrl.setText("");
        txtUltraFemurLength.setText("");
        txtUltraGestationSac.setText("");
        txtUltraGrade.setText("");
        txtUltraHeadCircumf.setText("");
        txtUltraLiquor.setText("");
        txtUltraNuchalTrans.setText("");
        txtUltraPlacenta.setText("");
        txtUltrasoundEddDate.setText("");
    }

    private boolean chkFieldsGynae() {
        boolean ret = true;
//        if (txtLmp.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Enter LMP");
//            txtLmp.requestFocus();
//            return false;
//        }
//        if (txtEdd1.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Enter EDD");
//            txtEdd1.requestFocus();
//            return false;
//        }
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
        selectGayneeParameter();
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
            USEDDDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setBodyData(int selectedRow) {

        gayneeParameterObj = listFianlParameters.get(tblGyaneeParameter.getSelectedRow());

        txtUltraFemurLength.setText(gayneeParameterObj.getFemurLength());
        txtUltraHeadCircumf.setText(gayneeParameterObj.getHeadCircumference());
        txtUltraAc.setText(gayneeParameterObj.getAc());
        txtUltraCrl.setText(gayneeParameterObj.getCrl());
        txtUltraBiparietalDia.setText(gayneeParameterObj.getBiparietalDiameter());
        txtUltraGestationSac.setText(gayneeParameterObj.getGestationSac());
        txtUltraAmnioticFV.setText(gayneeParameterObj.getAmnioticFluidVolume());
        txtUltraPlacenta.setText(gayneeParameterObj.getPlacenta());
        txtUltraCord.setText(gayneeParameterObj.getCord());
        txtUltraGrade.setText(gayneeParameterObj.getGrade());
        txtUltraCervix.setText(gayneeParameterObj.getCervix());
        txtUltraLiquor.setText(gayneeParameterObj.getLiquor());
        txtUltraNuchalTrans.setText(gayneeParameterObj.getNuchalTranslucency());
        txtUltraConclusion.setText(gayneeParameterObj.getRemarks());
        txtUltrasoundEddDate.setText(gayneeParameterObj.getEddDate());
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
        txtEdd.setEditable(false);
        cboFetus.setEnabled(false);
        cboLie1.setEnabled(false);
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
    private void previousPregnancies() {

        listPastObstetricHistoryChk = ctlPastObstetricHistory.selectPatientSearch(patientId,
                referenceId);
        if (listPastObstetricHistoryChk.isEmpty()) {
            btnRegisterPOH.setEnabled(true);
            btnEditPOH.setEnabled(true);
        } else {
            btnRegisterPOH.setEnabled(false);
            btnEditPOH.setEnabled(false);
        }

        listPastObstetricHistory = ctlPastObstetricHistory.selectPatientSearch(patientId,
                "");
        if (listPastObstetricHistory.isEmpty()) {
            System.err.println("No Past Obstetrical History found!");
        } else {
            BOBirthCertificate obj = listPastObstetricHistory.get(0);
            if (obj.getIsFinal().equalsIgnoreCase("Y")) {
                btnRegisterPOH.setEnabled(false);
                btnEditPOH.setEnabled(false);
            }
        }
        setPastObsHisDataInTableModel();
    }

    private void setPastObsHisInsertData() {
        // BY SIR
        PastObstetricHistoryBO.setBabyPatientId(patientId);
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
            PastObstetricHistoryBO.setPlace("HOSPITAL");
        }
        if (cboPlace.getSelectedIndex() == 2) {
            PastObstetricHistoryBO.setPlace("HOME");
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
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            } else if (i == 3) {
                column.setPreferredWidth(20);
            } else if (i == 4) {
                column.setPreferredWidth(20);
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

        txtSetBabyName.setText(PastObstetricHistoryBO.getBabyName());
        txtSetPregnancyWeek.setText(PastObstetricHistoryBO.getPregnancyWeeks());
        txtSetDelivery.setText(PastObstetricHistoryBO.getDelivery());
        System.err.println("\nPlacw" + PastObstetricHistoryBO.getPlace().toString());
        cboBirthPlace.setSelectedItem(PastObstetricHistoryBO.getPlace().toString());
        cboSetGender.setSelectedItem(PastObstetricHistoryBO.getGender().toString());
        txtSetMethode.setText(PastObstetricHistoryBO.getMethodIndication());
        txtSetLabour.setText(PastObstetricHistoryBO.getLabour());
        txtSetComplications.setText(PastObstetricHistoryBO.getComplications());
        txtSetVaccination.setText(PastObstetricHistoryBO.getBFVaccination());
        txtSetBirthWeight.setText(PastObstetricHistoryBO.getBirthWeight());
        txtSetPresentStatus.setText(PastObstetricHistoryBO.getPresentStatus());
        txtSetPresentAddress.setText(PastObstetricHistoryBO.getPresentAddress());
        txtSetAge.setText(PastObstetricHistoryBO.getAge());
        try {
            Date date = new Date();
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, Integer.parseInt(PastObstetricHistoryBO.getDayOfBirth()));
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtSetDob.setDate(date2);
            birthDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
        //btnRegisterPOH.setEnabled(true);
        //btnEditPOH.setEnabled(false);
        txtBabyName.requestFocus();

        txtSetBabyName.setText("");
        txtAge.setText("");
        cboSetGender.setSelectedIndex(0);
        txtSetPregnancyWeek.setText("");
        txtSetDelivery.setText("");
        cboBirthPlace.setSelectedIndex(0);
        txtSetMethode.setText("");
        txtSetComplications.setText("");
        txtSetLabour.setText("");
        txtSetBirthWeight.setText("");
        txtSetVaccination.setText("");
        txtSetPresentStatus.setText("");
        txtSetPresentAddress.setText("");

    }

    private void setInTabForm() {

        btnPregnancyInfoSave.setEnabled(true);
        btnPregnancyInfoFinal.setEnabled(true);
        if (antenatalPatientObj.getIsFinal().equalsIgnoreCase("Y")) {
            btnPregnancyInfoSave.setEnabled(false);
            btnPregnancyInfoFinal.setEnabled(false);
        }
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
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date lmpDate = dateFormat.parse(antenatalPatientObj.getLMP().trim());
            txtLMP1.setDate(lmpDate);
            Date eddDate = dateFormat.parse(antenatalPatientObj.getEDD().trim());
            txtEDD1.setDate(eddDate);
        } catch (Exception ex) {

        }
        cboRiskFactor1.setSelectedItem(antenatalPatientObj.getRiskFactor());
        txtRiskFactorRemarks1.setText(antenatalPatientObj.getRiskFactorRemarks().trim());
        setYearsMarriedDate(Integer.parseInt(antenatalPatientObj.getYearsMarriedDay()));

    }

    private void selectPregnancyVisitId() {
        pregnancyVisitId = ctlantenatalPatient.selectPregnancyVisitId(patientId);
    }

    private void setPreviousPregnancyUpdateData() {
        BOBirthCertificate updatePreviousPregnancy = new BOBirthCertificate();
//        PastObstetricHistoryBO.setPatientId(patientId);
        updatePreviousPregnancy.setId(PastObstetricHistoryBO.getId());
        if (cboSetGender.getSelectedIndex() == 1) {
            updatePreviousPregnancy.setGenderId("1");
        }
        if (cboSetGender.getSelectedIndex() == 2) {
            updatePreviousPregnancy.setGenderId("2");
        }
        if (cboBirthPlace.getSelectedIndex() == 1) {
            updatePreviousPregnancy.setPlace("HOSPITAL");
        }
        if (cboBirthPlace.getSelectedIndex() == 2) {
            updatePreviousPregnancy.setPlace("HOME");
        }
        updatePreviousPregnancy.setBabyName(txtSetBabyName.getText().trim());
        updatePreviousPregnancy.setDob(birthDate);
        updatePreviousPregnancy.setPregnancyWeeks(txtSetPregnancyWeek.getText().trim());
        updatePreviousPregnancy.setDelivery(txtDelivery.getText().trim().toUpperCase());
        updatePreviousPregnancy.setMethodIndication(txtSetMethode.getText().trim().toUpperCase());
        updatePreviousPregnancy.setLabour(txtSetLabour.getText().trim().toUpperCase().toUpperCase());
        updatePreviousPregnancy.setComplications(txtSetComplications.getText().trim().toUpperCase());
        updatePreviousPregnancy.setBFVaccination(txtSetVaccination.getText().trim().toUpperCase());
        updatePreviousPregnancy.setBirthWeight(txtSetBirthWeight.getText().trim());
        updatePreviousPregnancy.setPresentStatus(txtSetPresentStatus.getText().trim().toUpperCase());
        updatePreviousPregnancy.setPresentAddress(txtSetPresentAddress.getText().trim());

        if (ctlPastObstetricHistory.updateBirthCertificate(updatePreviousPregnancy)) {
            clearPastObsHis();
            previousPregnancies();
            setBodyDataPastObsHis(0);
            JOptionPane.showMessageDialog(null, "Records Updated Successfully");

        } else {
            JOptionPane.showMessageDialog(null, "Unable to save. \n"
                    + "Kindly contact Administrator.");
        }
    }
}
