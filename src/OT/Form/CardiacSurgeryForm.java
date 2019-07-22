package OT.Form;

import BO.Order.CPTQuestionaire;
import OT.BO.CardiacSurgery;
import OT.Controller.CardiacController;
import OT.TableModel.OTQuestionsTableModel;
import OT.TableModel.OtAccessTableModel;
import OT.TableModel.OtCabgProcTableModel;
import OT.TableModel.OtClosureTableModel;
import OT.TableModel.OtDateOfOperationTableModel;
import OT.TableModel.OtPaceWireTableModel;
import OT.TableModel.OtPacingWireTableModel;
import OT.TableModel.OtProcOptTableModel;
import OT.TableModel.OtQuestionaireTableModel;
import OT.TableModel.SurgeryInfoTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.Status;

public class CardiacSurgeryForm extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();
    String redoRemarksId = "";
    String typeDetailId = "";
    String IfnotElectiveId = "";
    String IfnotElectiveLov = "";
    String redoName = "";
    String cabgProcId = "";
    String valSurId = "";
    String procOptId = "";
    String expId = "";
    String impId = "";
    String typeId = "";
    String distalVesselId = "";
    String coronaryId = "";
    String conduitId = "";
    String endart = "";
    String con = "001001140002044";
    String odi = "1";
    String deftypeid = "";
    String currentId = "";
    String currentCabgId = "";
    String questionId = "";
    String surgeryDate = "";
    String actionId = "";
    String detailId = "";
    CardiacController ctlOtCardiac = new CardiacController();
    List<CardiacSurgery> listCabgProcedure = new ArrayList();
    List<CardiacSurgery> listPathology = new ArrayList();
    List<CardiacSurgery> listSiteofOperation = new ArrayList();
    List<CardiacSurgery> listAorticProcedure = new ArrayList();
    List<CardiacSurgery> listReasonForRedo = new ArrayList();
    List<CardiacSurgery> listAccessSelect = new ArrayList();
    List<CardiacSurgery> listAccess = new ArrayList();
    List<CardiacSurgery> listSurgeryInfo = new ArrayList();
    List<CardiacSurgery> listCabgSelect = new ArrayList();
    List<CardiacSurgery> listVal = new ArrayList();
    List<CardiacSurgery> lstClosure = new ArrayList();
    List<CardiacSurgery> lstpaceWire = new ArrayList();
    List<CPTQuestionaire> lstQues = new ArrayList();
    List<CPTQuestionaire> lstQuesDetail = new ArrayList();
    private CardiacSurgery objSave = new CardiacSurgery();
    private CPTQuestionaire objQues = new CPTQuestionaire();
    private CPTQuestionaire objQuesMaster = new CPTQuestionaire();
    private int curentSelectedOperationIndex = 0;
    CardiacSurgery curentSelectedOperationObj = new CardiacSurgery();

//    String[] cboStatus = {"", "8661", "8662", "8663", "8664"};
//    String[] cboRedo = {"", "8665", "8666", "8667", "8668"};
//    String[] cboAcs = {"", "8678", "8679", "8680", "8681", "8682"};
//    String[] cboEle = {"", "8669", "8670", "8671", "8672", "8673", "8674", "8675", "8676", "8677"};
    String[] cabgProc = {"", "8708", "8709", "8710", "8711", "8712", "8713", "8714"};

//    public CardiacSurgeryForm(String con, String odi) {
//
//        initComponents();
//        this.setSize(Constants.xSize + 340, Constants.ySize - Constants.yExtension + 35);
//        this.con = con;
//        this.odi = odi;
//        selectPatientQuestionaire();
//        selectOperationDetail(con, odi, typeDetailId, deftypeid);
//        selectAccessDetail(con, odi, typeDetailId, deftypeid);
//        selectCabgProcedure(con, odi);
//        selectValSurgery();
//    }
    public CardiacSurgeryForm() {

        initComponents();
        this.setSize(Constants.xSize - 80, Constants.ySize + 40);
        this.con = con;
        this.odi = odi;
        selectPatientQuestionaire();
//        selectOperationDetail(con, odi, typeDetailId, deftypeid);
//        selectAccessDetail(con, odi, typeDetailId, deftypeid);
        selectCabgProcedure(con, odi);
        selectValSurgery();
        selectCabgSurgery();
        selectPathologyDetail();
        selectAorticProcedure();
        selectSiteOfOperation();
        selectAccessInformation();
        selectSurgeryInfo();
        selectClosure();
        selectPacingWire();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnQuestionaire = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSelectedPatientId = new javax.swing.JTextField();
        txtSelectedPatientName = new javax.swing.JTextField();
        txtPerformingPhysician = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtAdmissionNo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtWard = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrimaryPhysician = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cboPriorityStatus = new javax.swing.JComboBox();
        cbofirstRedo = new javax.swing.JComboBox();
        txtReasonForRedo = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblReasonForRedo = new javax.swing.JTable();
        btnAddDateOperation = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtOTPlanDate = new org.jdesktop.swingx.JXDatePicker();
        cboRoleofRobo = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        cboAccess = new javax.swing.JComboBox();
        cboElective = new javax.swing.JComboBox();
        txtIfnotElective = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblAccess = new javax.swing.JTable();
        btnAddAccess = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtCronArt = new javax.swing.JTextField();
        txtConduit = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCabgProc = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPl = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtFlow = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cboEndart = new javax.swing.JComboBox();
        btnAddCabg = new javax.swing.JButton();
        txtDV = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cboCabgProc = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        txtPl1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtFlow1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        txtClosure = new javax.swing.JTextField();
        txtPaceWire = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblOTPaceWire = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblOTClosure = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOtherProcedureInfo = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLALine = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtProc = new javax.swing.JTextField();
        txtImplant = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblValSurg = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtExp = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        txtSrNo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        btnValSur = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtValSur = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        txtSiteOfOperation = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblSiteOfOperation = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtOperationSIte = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAorticClampTime = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        chkShuntYes = new javax.swing.JCheckBox();
        chkShuntNo = new javax.swing.JCheckBox();
        jPanel18 = new javax.swing.JPanel();
        txtPathology = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblpathology = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtPathRemarks = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        txtAorticProcedure = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblAorticProcedure = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtAortic = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Search Studies");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(910, 830));
        setRequestFocusEnabled(false);

        pnlPL.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlPL.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnQuestionaire.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnQuestionaire.setText("Questionaire");
        btnQuestionaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestionaireActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPLLayout = new javax.swing.GroupLayout(pnlPL);
        pnlPL.setLayout(pnlPLLayout);
        pnlPLLayout.setHorizontalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPLLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuestionaire, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPLLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnQuestionaire)
                    .addComponent(btnSave))
                .addGap(5, 5, 5))
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("Patient ID :");

        txtSelectedPatientId.setEditable(false);
        txtSelectedPatientId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSelectedPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectedPatientIdActionPerformed(evt);
            }
        });

        txtSelectedPatientName.setEditable(false);
        txtSelectedPatientName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSelectedPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectedPatientNameActionPerformed(evt);
            }
        });

        txtPerformingPhysician.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Status : ");

        txtStatus.setEditable(false);
        txtStatus.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        txtAdmissionNo.setEditable(false);
        txtAdmissionNo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtAdmissionNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmissionNoActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Admission # :");

        txtWard.setEditable(false);
        txtWard.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtWard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWardActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Ward : ");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setText("Age/ Gen:");

        txtPrimaryPhysician.setEditable(false);
        txtPrimaryPhysician.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtPrimaryPhysician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimaryPhysicianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPerformingPhysician, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtSelectedPatientId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSelectedPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAdmissionNo)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtWard, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(txtPrimaryPhysician))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(txtSelectedPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(txtSelectedPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPerformingPhysician)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtStatus)
                    .addComponent(jLabel25)
                    .addComponent(txtAdmissionNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrimaryPhysician, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Surgery Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        cboPriorityStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboPriorityStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Priority","Routine","Urgent","Emergency","Salvage"}));
        cboPriorityStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPriorityStatusActionPerformed(evt);
            }
        });

        cbofirstRedo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbofirstRedo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"First / Redo","1st Operation","2nd Operation","3rd Operation","4th Operation"}));
        cbofirstRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbofirstRedoActionPerformed(evt);
            }
        });

        txtReasonForRedo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtReasonForRedo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtReasonForRedoMouseReleased(evt);
            }
        });
        txtReasonForRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReasonForRedoActionPerformed(evt);
            }
        });

        tblReasonForRedo.setBackground(java.awt.SystemColor.activeCaption);
        tblReasonForRedo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblReasonForRedo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "" },
            },
            new String [] {
                "ID","DESCRIPTION"
            }
        ));
        tblReasonForRedo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReasonForRedoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblReasonForRedoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblReasonForRedoMouseReleased(evt);
            }
        });
        tblReasonForRedo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblReasonForRedoKeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(tblReasonForRedo);

        btnAddDateOperation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddDateOperation.setText("Add");
        btnAddDateOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDateOperationActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Date : ");

        txtOTPlanDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOTPlanDateActionPerformed(evt);
            }
        });

        cboRoleofRobo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboRoleofRobo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Role of Robot","Harvesting of LIMA","CABG","Valve Repair","Valve Replacement", "NA"}));
        cboRoleofRobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRoleofRoboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbofirstRedo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtReasonForRedo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddDateOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOTPlanDate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPriorityStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboRoleofRobo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtOTPlanDate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboPriorityStatus)
                        .addComponent(cboRoleofRobo))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtReasonForRedo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddDateOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(76, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbofirstRedo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Access Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        cboAccess.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboAccess.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select Access", "Median  Sternotomy","Right Thoracotomy","Left Thoracotomy","Mini Thoracotomy","Mini sternotomy Others"}));
        cboAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAccessActionPerformed(evt);
            }
        });

        cboElective.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboElective.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Elective", "Not Elective"}));
        cboElective.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboElectiveActionPerformed(evt);
            }
        });

        txtIfnotElective.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtIfnotElective.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtIfnotElectiveMouseReleased(evt);
            }
        });
        txtIfnotElective.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIfnotElectiveActionPerformed(evt);
            }
        });

        tblAccess.setBackground(java.awt.SystemColor.activeCaption);
        tblAccess.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblAccess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "" },
            },
            new String [] {
                "ID","DESCRIPTION"
            }
        ));
        tblAccess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccessMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAccessMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAccessMouseReleased(evt);
            }
        });
        tblAccess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAccessKeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(tblAccess);

        btnAddAccess.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddAccess.setText("Add");
        btnAddAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAccessActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 0, 0));
        jLabel32.setText("Reason : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIfnotElective, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddAccess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cboAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboElective, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboAccess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboElective, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIfnotElective, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddAccess, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coronary Artery Bypass Graft", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtCronArt.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtCronArt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtCronArtMouseReleased(evt);
            }
        });
        txtCronArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCronArtActionPerformed(evt);
            }
        });

        txtConduit.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtConduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtConduitMouseReleased(evt);
            }
        });
        txtConduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConduitActionPerformed(evt);
            }
        });

        tblCabgProc.setBackground(java.awt.SystemColor.activeCaption);
        tblCabgProc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblCabgProc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "" },
            },
            new String [] {
                "Cabg Procedure","Cronary Artery","Conduit","Distal Vessel","Endart","Pl", "Flow"
            }
        ));
        tblCabgProc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCabgProcMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCabgProcMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCabgProcMouseReleased(evt);
            }
        });
        tblCabgProc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblCabgProcKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCabgProcKeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tblCabgProc);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setText(" Artery :");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setText("Conduit :");

        txtPl.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPlMouseReleased(evt);
            }
        });
        txtPl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setText(" Pl:");

        txtFlow.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtFlow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtFlowMouseReleased(evt);
            }
        });
        txtFlow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlowActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setText(" Flow:");

        cboEndart.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboEndart.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Y", "N"}));
        cboEndart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEndartActionPerformed(evt);
            }
        });

        btnAddCabg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddCabg.setText("Add");
        btnAddCabg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCabgActionPerformed(evt);
            }
        });

        txtDV.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtDVMouseReleased(evt);
            }
        });
        txtDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDVActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setText(" D.Vessel : ");

        cboCabgProc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboCabgProc.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select","N.A","CABF(conventional)","OPCAB","CABG(on pump beating)","MIDCAB","MIDCAB (robotic)","Hybrid (Revascularization)"}));
        cboCabgProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCabgProcActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 0, 0));
        jLabel30.setText(" Pl:");

        txtPl1.setEditable(false);
        txtPl1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPl1MouseReleased(evt);
            }
        });
        txtPl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPl1ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 0, 0));
        jLabel31.setText("Flow:");

        txtFlow1.setEditable(false);
        txtFlow1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtFlow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtFlow1MouseReleased(evt);
            }
        });
        txtFlow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlow1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPl1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFlow1))
                    .addComponent(jScrollPane5)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboCabgProc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cboEndart, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtPl, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFlow, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddCabg, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCronArt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConduit, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDV)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtConduit)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboCabgProc)
                        .addComponent(jLabel13)
                        .addComponent(txtCronArt)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtPl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboEndart))
                        .addComponent(btnAddCabg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtFlow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(txtPl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFlow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Closure and Pacing Wire", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtClosure.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtClosure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtClosureMouseReleased(evt);
            }
        });
        txtClosure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClosureActionPerformed(evt);
            }
        });

        txtPaceWire.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPaceWire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPaceWireMouseReleased(evt);
            }
        });
        txtPaceWire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaceWireActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Pacing Wire :  ");

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pacing Wire", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        tblOTPaceWire.setBackground(java.awt.SystemColor.activeCaption);
        tblOTPaceWire.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblOTPaceWire.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", ""},
            },
            new String [] {
                "ID","Description"
            }
        ));
        tblOTPaceWire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOTPaceWireMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblOTPaceWireMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblOTPaceWireMouseReleased(evt);
            }
        });
        tblOTPaceWire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblOTPaceWireKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(tblOTPaceWire);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Closure", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        tblOTClosure.setBackground(java.awt.SystemColor.activeCaption);
        tblOTClosure.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblOTClosure.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", ""},
            },
            new String [] {
                "ID","Description"
            }
        ));
        tblOTClosure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOTClosureMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblOTClosureMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblOTClosureMouseReleased(evt);
            }
        });
        tblOTClosure.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblOTClosureKeyReleased(evt);
            }
        });
        jScrollPane13.setViewportView(tblOTClosure);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Closure : ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClosure))
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPaceWire))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClosure, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(txtPaceWire, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Combined Not Cardiac Procedure Information ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtOtherProcedureInfo.setColumns(20);
        txtOtherProcedureInfo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtOtherProcedureInfo.setLineWrap(true);
        txtOtherProcedureInfo.setRows(5);
        txtOtherProcedureInfo.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtOtherProcedureInfo);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LA Line", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtLALine.setColumns(20);
        txtLALine.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtLALine.setLineWrap(true);
        txtLALine.setRows(5);
        txtLALine.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtLALine);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Surgery Information", jPanel9);

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valve Surgery", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtProc.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtProc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtProcMouseReleased(evt);
            }
        });
        txtProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcActionPerformed(evt);
            }
        });

        txtImplant.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtImplant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtImplantMouseReleased(evt);
            }
        });
        txtImplant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImplantActionPerformed(evt);
            }
        });

        txtType.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtTypeMouseReleased(evt);
            }
        });
        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });

        tblValSurg.setBackground(java.awt.SystemColor.activeCaption);
        tblValSurg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblValSurg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "" },
            },
            new String [] {
                "Val.Surgery","Procedure Opt","Explant","Implant", "Type", "Size", "Sr.No"
            }
        ));
        tblValSurg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblValSurgMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblValSurgMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblValSurgMouseReleased(evt);
            }
        });
        tblValSurg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblValSurgKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(tblValSurg);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Proc : ");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setText("Explant:");

        txtExp.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtExp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtExpMouseReleased(evt);
            }
        });
        txtExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setText("Implant:");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Type : ");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Size :  ");

        txtSize.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSizeMouseReleased(evt);
            }
        });
        txtSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizeActionPerformed(evt);
            }
        });

        txtSrNo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtSrNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSrNoMouseReleased(evt);
            }
        });
        txtSrNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSrNoActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setText("Sr.No:");

        btnValSur.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnValSur.setText("Add");
        btnValSur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValSurActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 0, 0));
        jLabel27.setText("Surgery : ");

        txtValSur.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtValSur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtValSurMouseReleased(evt);
            }
        });
        txtValSur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValSurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtValSur, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(txtType))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                    .addComponent(txtProc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtImplant, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(471, 471, 471)
                                .addComponent(txtSrNo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnValSur, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValSur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtImplant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSrNo)
                    .addComponent(jLabel24)
                    .addComponent(txtSize)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtType)
                    .addComponent(btnValSur, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thoracic Aortic Surgery Data:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel15.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Site of Operation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 13), new java.awt.Color(102, 0, 0))); // NOI18N

        txtSiteOfOperation.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtSiteOfOperation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSiteOfOperationMouseReleased(evt);
            }
        });
        txtSiteOfOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSiteOfOperationActionPerformed(evt);
            }
        });

        tblSiteOfOperation.setBackground(java.awt.SystemColor.activeCaption);
        tblSiteOfOperation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblSiteOfOperation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "" },
            },
            new String [] {
                "ID", "DESCRIPTION"
            }
        ));
        tblSiteOfOperation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSiteOfOperationMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSiteOfOperationMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblSiteOfOperationMouseReleased(evt);
            }
        });
        tblSiteOfOperation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblSiteOfOperationKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblSiteOfOperation);

        jPanel16.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remarks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtOperationSIte.setColumns(20);
        txtOperationSIte.setLineWrap(true);
        txtOperationSIte.setRows(5);
        jScrollPane3.setViewportView(txtOperationSIte);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        jButton1.setText("Add");

        jPanel17.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aortic Clamp TIme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtAorticClampTime.setColumns(20);
        txtAorticClampTime.setLineWrap(true);
        txtAorticClampTime.setRows(5);
        jScrollPane4.setViewportView(txtAorticClampTime);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Use of Shunt :  ");

        chkShuntYes.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkShuntYes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkShuntYes.setForeground(new java.awt.Color(102, 0, 0));
        chkShuntYes.setText("Yes");
        chkShuntYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShuntYesActionPerformed(evt);
            }
        });

        chkShuntNo.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkShuntNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkShuntNo.setForeground(new java.awt.Color(102, 0, 0));
        chkShuntNo.setText("No");
        chkShuntNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShuntNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtSiteOfOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(chkShuntYes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17)
                                .addComponent(chkShuntNo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(7, 7, 7))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSiteOfOperation)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(chkShuntYes)
                    .addComponent(chkShuntNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pathology", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 13), new java.awt.Color(102, 0, 0))); // NOI18N

        txtPathology.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPathology.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPathologyMouseReleased(evt);
            }
        });
        txtPathology.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPathologyActionPerformed(evt);
            }
        });

        tblpathology.setBackground(java.awt.SystemColor.activeCaption);
        tblpathology.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblpathology.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "" },
            },
            new String [] {
                "ID", "DESCRIPTION"
            }
        ));
        tblpathology.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpathologyMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblpathologyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblpathologyMouseReleased(evt);
            }
        });
        tblpathology.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblpathologyKeyReleased(evt);
            }
        });
        jScrollPane14.setViewportView(tblpathology);

        jPanel19.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remarks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtPathRemarks.setColumns(20);
        txtPathRemarks.setLineWrap(true);
        txtPathRemarks.setRows(5);
        jScrollPane7.setViewportView(txtPathRemarks);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(txtPathology, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPathology, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aortic Procedure", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 13), new java.awt.Color(102, 0, 0))); // NOI18N

        txtAorticProcedure.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtAorticProcedure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtAorticProcedureMouseReleased(evt);
            }
        });
        txtAorticProcedure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAorticProcedureActionPerformed(evt);
            }
        });

        tblAorticProcedure.setBackground(java.awt.SystemColor.activeCaption);
        tblAorticProcedure.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblAorticProcedure.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "" },
            },
            new String [] {
                "ID", "DESCRIPTION"
            }
        ));
        tblAorticProcedure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAorticProcedureMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAorticProcedureMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAorticProcedureMouseReleased(evt);
            }
        });
        tblAorticProcedure.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAorticProcedureKeyReleased(evt);
            }
        });
        jScrollPane15.setViewportView(tblAorticProcedure);

        jPanel21.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remarks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtAortic.setColumns(20);
        txtAortic.setLineWrap(true);
        txtAortic.setRows(5);
        jScrollPane16.setViewportView(txtAortic);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
        );

        jButton3.setText("Add");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(txtAorticProcedure, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAorticProcedure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Valve & Thoracic Surgery", jPanel10);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboPriorityStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPriorityStatusActionPerformed

    }//GEN-LAST:event_cboPriorityStatusActionPerformed

    private void cbofirstRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbofirstRedoActionPerformed
        if (cbofirstRedo.getSelectedIndex() <= 1) {
            txtReasonForRedo.setEditable(false);
        } else {
            txtReasonForRedo.setEditable(true);
        }
    }//GEN-LAST:event_cbofirstRedoActionPerformed

    private void txtReasonForRedoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReasonForRedoMouseReleased

    }//GEN-LAST:event_txtReasonForRedoMouseReleased

    private void txtReasonForRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReasonForRedoActionPerformed
        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
                + Database.DCMS.definitionTypeDetail + " DT      \n"
                + " WHERE DT.DESCRIPTION LIKE '%"
                + txtReasonForRedo.getText().toUpperCase().trim() + "%'"
                + " AND DT.DEF_TYPE_ID = '" + DefinitionTypes.reasonForRedo + "'"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        redoRemarksId = Constants.lovID;
        redoName = Constants.lovDescription;
        txtReasonForRedo.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtReasonForRedoActionPerformed

    private void txtSelectedPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectedPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectedPatientIdActionPerformed

    private void txtSelectedPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectedPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectedPatientNameActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void cboAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAccessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAccessActionPerformed

    private void cboElectiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboElectiveActionPerformed
        if (cboElective.getSelectedIndex() == 0) {
            txtIfnotElective.setEditable(false);
        } else {
            txtIfnotElective.setEditable(true);
        }
    }//GEN-LAST:event_cboElectiveActionPerformed

    private void txtIfnotElectiveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIfnotElectiveMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIfnotElectiveMouseReleased

    private void txtIfnotElectiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIfnotElectiveActionPerformed
        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
                + Database.DCMS.definitionTypeDetail + " DT      \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otreasonIfnotElective + "'"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        IfnotElectiveId = Constants.lovID;
        IfnotElectiveLov = Constants.lovDescription;
        txtIfnotElective.setText(Constants.lovDescription);
    }//GEN-LAST:event_txtIfnotElectiveActionPerformed

    private void txtCronArtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCronArtMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCronArtMouseReleased

    private void txtCronArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCronArtActionPerformed

        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
                + Database.DCMS.definitionTypeDetail + " DT      \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otCronaryArtery + "'"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        txtConduit.requestFocus();
        coronaryId = Constants.lovID;
        txtCronArt.setText(Constants.lovDescription);

    }//GEN-LAST:event_txtCronArtActionPerformed

    private void txtConduitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConduitMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConduitMouseReleased

    private void txtConduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConduitActionPerformed

        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
                + Database.DCMS.definitionTypeDetail + " DT      \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otConduit + "'"
                + " ORDER BY ID";

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        txtDV.requestFocus();
        conduitId = Constants.lovID;
        txtConduit.setText(Constants.lovDescription);

    }//GEN-LAST:event_txtConduitActionPerformed

    private void tblCabgProcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCabgProcMouseClicked
        if (evt.getClickCount() % 2 == 0) {
            if (tblCabgProc.getSelectedRow() < 0 || listCabgSelect.isEmpty()) {

                return;
            }
            currentId = curentSelectedOperationObj.getCabgId();
            ctlOtCardiac.deletecabgDetail(currentId);
            selectCabgProcedure(con, odi);
        }
    }//GEN-LAST:event_tblCabgProcMouseClicked

    private void tblCabgProcMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCabgProcMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCabgProcMousePressed

    private void tblCabgProcMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCabgProcMouseReleased
        if (tblCabgProc.getSelectedRow() < 0 || listCabgSelect.isEmpty()) {
            return;
        }

        curentSelectedOperationObj = new CardiacSurgery();
        curentSelectedOperationObj = listCabgSelect.get(tblCabgProc.getSelectedRow());
        // txtCabgProc.setText(curentSelectedOperationObj.getCabgProcDescription());
        txtCronArt.setText(curentSelectedOperationObj.getCronaryDescription());
        txtConduit.setText(curentSelectedOperationObj.getConduitDescription());
        txtDV.setText(curentSelectedOperationObj.getDistalVesselDescription());
        cboEndart.setAction(cboEndart.getAction());
        txtPl1.setText(curentSelectedOperationObj.getPi());
        txtFlow1.setText(curentSelectedOperationObj.getFlow());
    }//GEN-LAST:event_tblCabgProcMouseReleased

    private void tblCabgProcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCabgProcKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCabgProcKeyReleased

    private void txtProcMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProcMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProcMouseReleased

    private void txtProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcActionPerformed

        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
                + Database.DCMS.definitionTypeDetail + " DT      \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otProOpt + "'"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        procOptId = Constants.lovID;
        txtProc.setText(Constants.lovDescription);
        txtExp.requestFocus();

    }//GEN-LAST:event_txtProcActionPerformed

    private void txtImplantMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtImplantMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImplantMouseReleased

    private void txtImplantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImplantActionPerformed

        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
                + Database.DCMS.definitionTypeDetail + " DT      \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otExplantImplant + "'"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        impId = Constants.lovID;
        txtImplant.setText(Constants.lovDescription);
        txtType.requestFocus();

    }//GEN-LAST:event_txtImplantActionPerformed

    private void txtTypeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTypeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeMouseReleased

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed

        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
                + Database.DCMS.definitionTypeDetail + " DT      \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otValveSurg + "'"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        typeId = Constants.lovID;
        txtType.setText(Constants.lovDescription);
        txtSize.requestFocus();
    }//GEN-LAST:event_txtTypeActionPerformed

    private void tblValSurgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblValSurgMouseClicked
        if (evt.getClickCount() % 2 == 0) {
            if (tblValSurg.getSelectedRow() < 0 || listVal.isEmpty()) {

                return;
            }
            currentId = curentSelectedOperationObj.getId();
            ctlOtCardiac.deleteValveSurg(currentId);
            selectValSurgery();
        }
    }//GEN-LAST:event_tblValSurgMouseClicked

    private void tblValSurgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblValSurgMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblValSurgMousePressed

    private void tblValSurgMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblValSurgMouseReleased
        if (tblValSurg.getSelectedRow() < 0 || listVal.isEmpty()) {
            return;
        }

        curentSelectedOperationObj = new CardiacSurgery();
        curentSelectedOperationObj = listVal.get(tblValSurg.getSelectedRow());
        txtValSur.setText(curentSelectedOperationObj.getValSurDescription());
        txtProc.setText(curentSelectedOperationObj.getProcOptDescription());
        txtExp.setText(curentSelectedOperationObj.getExpDescription());
        txtImplant.setText(curentSelectedOperationObj.getImpDescription());
        txtType.setText(curentSelectedOperationObj.getTypeDescription());
        txtSize.setText(curentSelectedOperationObj.getValSize());
        txtSrNo.setText(curentSelectedOperationObj.getValSrNo());
    }//GEN-LAST:event_tblValSurgMouseReleased

    private void tblValSurgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblValSurgKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblValSurgKeyReleased

    private void tblOTPaceWireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOTPaceWireMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOTPaceWireMouseClicked

    private void tblOTPaceWireMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOTPaceWireMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOTPaceWireMousePressed

    private void tblOTPaceWireMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOTPaceWireMouseReleased
        // TODO add your handling code here:
        if (!lstpaceWire.isEmpty()) {
            CardiacSurgery objDlt = lstpaceWire.get(tblOTPaceWire.getSelectedRow());
            if (evt.getClickCount() == 2) {
                if (ctlOtCardiac.deleteOtDetail(objDlt.getId())) {
                    JOptionPane.showMessageDialog(null, "Record Deleted");
                    selectPacingWire();
                } else {
                    JOptionPane.showMessageDialog(null, "unable to Deleted");
                }
            }
        }
    }//GEN-LAST:event_tblOTPaceWireMouseReleased

    private void tblOTPaceWireKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOTPaceWireKeyReleased

    }//GEN-LAST:event_tblOTPaceWireKeyReleased

    private void tblSiteOfOperationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSiteOfOperationMouseClicked

    }//GEN-LAST:event_tblSiteOfOperationMouseClicked

    private void tblSiteOfOperationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSiteOfOperationMousePressed

    }//GEN-LAST:event_tblSiteOfOperationMousePressed

    private void tblSiteOfOperationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSiteOfOperationMouseReleased

        CardiacSurgery objDlt = listSiteofOperation.get(tblSiteOfOperation.getSelectedRow());
        txtOperationSIte.setText(objDlt.getRemarks().trim());
        if (evt.getClickCount() == 2) {
            if (ctlOtCardiac.deleteOtDetail(objDlt.getId())) {
                JOptionPane.showMessageDialog(null, "Record Deleted");
                selectSiteOfOperation();
            } else {
                JOptionPane.showMessageDialog(null, "unable to Deleted");
            }
        }
    }//GEN-LAST:event_tblSiteOfOperationMouseReleased

    private void tblSiteOfOperationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSiteOfOperationKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSiteOfOperationKeyReleased

    private void tblReasonForRedoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReasonForRedoMouseClicked

//        if (evt.getClickCount() % 2 == 0) {
//            if (tblReasonForRedo.getSelectedRow() < 0 || listPathology.isEmpty()) {
//
//                return;
//            }
//            currentId = curentSelectedOperationObj.getId();
//            ctlOtCardiac.deleteOperationDetail(currentId);
//            selectOperationDetail(con, odi, typeDetailId, title);
//        }

    }//GEN-LAST:event_tblReasonForRedoMouseClicked

    private void tblReasonForRedoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReasonForRedoMousePressed

    }//GEN-LAST:event_tblReasonForRedoMousePressed

    private void tblReasonForRedoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReasonForRedoMouseReleased

    }//GEN-LAST:event_tblReasonForRedoMouseReleased

    private void tblReasonForRedoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblReasonForRedoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblReasonForRedoKeyReleased

    private void txtPlMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlMouseReleased

    private void txtPlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlActionPerformed
        txtFlow.requestFocus();
    }//GEN-LAST:event_txtPlActionPerformed

    private void txtFlowMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFlowMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlowMouseReleased

    private void txtFlowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlowActionPerformed

    private void tblAccessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccessMouseClicked

    }//GEN-LAST:event_tblAccessMouseClicked

    private void tblAccessMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccessMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAccessMousePressed

    private void tblAccessMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccessMouseReleased

    }//GEN-LAST:event_tblAccessMouseReleased

    private void tblAccessKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAccessKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAccessKeyReleased

    private void txtExpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExpMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpMouseReleased

    private void txtExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpActionPerformed

        String query = " SELECT ID ID, DESCRIPTION  FROM            \n"
                + Database.DCMS.definitionTypeDetail + " DT         \n"
                + " WHERE DT.DEF_TYPE_ID = '"
                + DefinitionTypes.otExplantImplant + "'"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        expId = Constants.lovID;
        txtExp.setText(Constants.lovDescription);
        txtImplant.requestFocus();

    }//GEN-LAST:event_txtExpActionPerformed

    private void txtSizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSizeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSizeMouseReleased

    private void txtSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSizeActionPerformed
        txtSrNo.requestFocus();
    }//GEN-LAST:event_txtSizeActionPerformed

    private void txtSrNoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSrNoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSrNoMouseReleased

    private void txtSrNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSrNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSrNoActionPerformed

    private void txtAdmissionNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmissionNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmissionNoActionPerformed

    private void txtWardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWardActionPerformed

    private void cboEndartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEndartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEndartActionPerformed

    private void btnAddDateOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDateOperationActionPerformed

        saveSurgeryInfo();
    }//GEN-LAST:event_btnAddDateOperationActionPerformed

    private void btnAddAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccessActionPerformed
        // TODO add your handling code here:
        saveAccessInformation();
    }//GEN-LAST:event_btnAddAccessActionPerformed

    private void btnValSurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValSurActionPerformed

        CardiacSurgery sur = new CardiacSurgery();
        sur.setCompleteOrderNo(con);
        sur.setOrderDetailId(odi);
        sur.setValSurId(valSurId);
        sur.setProcOptId(procOptId);
        sur.setExpId(expId);
        sur.setImpId(impId);
        sur.setTypeId(typeId);
        sur.setValSize(txtSize.getText());
        sur.setValSrNo(txtSrNo.getText());

        if (ctlOtCardiac.insertValSurgery(sur)) {
            selectValSurgery();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Add, Kindly Contact Administrator");
        }


    }//GEN-LAST:event_btnValSurActionPerformed

    private void btnAddCabgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCabgActionPerformed

        CardiacSurgery obj1 = new CardiacSurgery();
        obj1.setCompleteOrderNo(con);
        obj1.setOrderDetailId(odi);
        obj1.setCabgProcId(cabgProc[cboCabgProc.getSelectedIndex()]);
        obj1.setCronaryId(coronaryId);
        obj1.setConduitId(conduitId);
        obj1.setDistalVesselId(distalVesselId);
        obj1.setEndart(cboEndart.getSelectedItem().toString());
        obj1.setPi(txtPl.getText());
        obj1.setFlow(txtFlow.getText());

        if (ctlOtCardiac.insertCabgProcedure(obj1)) {
            //JOptionPane.showMessageDialog(null, "Saved Successfully");
            selectCabgProcedure(con, odi);
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Add, Kindly Contact Administrator");
        }

    }//GEN-LAST:event_btnAddCabgActionPerformed

    private void txtDVMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDVMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDVMouseReleased

    private void txtDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDVActionPerformed

        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
                + Database.DCMS.definitionTypeDetail + " DT      \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otDistalVessel + "'"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        cboEndart.requestFocus();
        distalVesselId = Constants.lovID;
        txtDV.setText(Constants.lovDescription);

    }//GEN-LAST:event_txtDVActionPerformed

    private void txtValSurMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtValSurMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValSurMouseReleased

    private void txtValSurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValSurActionPerformed

        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
                + Database.DCMS.definitionTypeDetail + " DT      \n"
                + " WHERE DT.DEF_TYPE_ID =" + DefinitionTypes.otValveSurg
                + " ORDER BY ID";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        valSurId = Constants.lovID;
        txtValSur.setText(Constants.lovDescription);
        txtProc.requestFocus();
    }//GEN-LAST:event_txtValSurActionPerformed

    private void txtClosureMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClosureMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClosureMouseReleased

    private void txtClosureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClosureActionPerformed
        // TODO add your handling code here:
        saveClosure();
    }//GEN-LAST:event_txtClosureActionPerformed

    private void txtPaceWireMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPaceWireMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaceWireMouseReleased

    private void txtPaceWireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaceWireActionPerformed
        // TODO add your handling code here:
        savePacingWire();
    }//GEN-LAST:event_txtPaceWireActionPerformed

    private void tblCabgProcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCabgProcKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCabgProcKeyPressed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void tblOTClosureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOTClosureMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOTClosureMouseClicked

    private void tblOTClosureMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOTClosureMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOTClosureMousePressed

    private void tblOTClosureMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOTClosureMouseReleased
        // TODO add your handling code here:
        if (!lstClosure.isEmpty()) {
            CardiacSurgery objDlt = lstClosure.get(tblOTClosure.getSelectedRow());
            if (evt.getClickCount() == 2) {
                if (ctlOtCardiac.deleteOtDetail(objDlt.getId())) {
                    JOptionPane.showMessageDialog(null, "Record Deleted");
                    selectClosure();
                } else {
                    JOptionPane.showMessageDialog(null, "unable to Deleted");
                }
            }
        }
    }//GEN-LAST:event_tblOTClosureMouseReleased

    private void tblOTClosureKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOTClosureKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOTClosureKeyReleased

    private void cboCabgProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCabgProcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCabgProcActionPerformed

    private void btnQuestionaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestionaireActionPerformed

        //LOV dc = new DisplayCardio();
        //dc.OpenDialog(this);

    }//GEN-LAST:event_btnQuestionaireActionPerformed

    private void txtOTPlanDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOTPlanDateActionPerformed

        if (txtOTPlanDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the From Date 22-DEC-1990",
                    "Enter The Date", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        String date = dateFormat.format(txtOTPlanDate.getDate());
        surgeryDate = date;
    }//GEN-LAST:event_txtOTPlanDateActionPerformed

    private void cboRoleofRoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboRoleofRoboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboRoleofRoboActionPerformed

    private void txtPl1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPl1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPl1MouseReleased

    private void txtPl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPl1ActionPerformed

    private void txtFlow1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFlow1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlow1MouseReleased

    private void txtFlow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlow1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlow1ActionPerformed

    private void txtPrimaryPhysicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimaryPhysicianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimaryPhysicianActionPerformed

    private void txtSiteOfOperationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSiteOfOperationMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSiteOfOperationMouseReleased

    private void txtSiteOfOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSiteOfOperationActionPerformed
        // TODO add your handling code here:
        cardiacSiteOfOperation();
    }//GEN-LAST:event_txtSiteOfOperationActionPerformed

    private void txtPathologyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPathologyMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPathologyMouseReleased

    private void txtPathologyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPathologyActionPerformed
        // TODO add your handling code here:
        cardiacPathology();
    }//GEN-LAST:event_txtPathologyActionPerformed

    private void tblpathologyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpathologyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblpathologyMouseClicked

    private void tblpathologyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpathologyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblpathologyMousePressed

    private void tblpathologyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpathologyMouseReleased
        // TODO add your handling code here:
        if (!listPathology.isEmpty()) {
            CardiacSurgery objDlt = listPathology.get(tblpathology.getSelectedRow());
            System.err.println(".remarks: " + objDlt.getRemarks().trim());
            txtPathRemarks.setText(objDlt.getRemarks().trim());
            if (evt.getClickCount() == 2) {
                if (ctlOtCardiac.deleteOtDetail(objDlt.getId())) {
                    JOptionPane.showMessageDialog(null, "Record Deleted");
                    selectPathologyDetail();
                } else {
                    JOptionPane.showMessageDialog(null, "unable to Deleted");
                }
            }
        }
    }//GEN-LAST:event_tblpathologyMouseReleased

    private void tblpathologyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblpathologyKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblpathologyKeyReleased

    private void txtAorticProcedureMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAorticProcedureMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAorticProcedureMouseReleased

    private void txtAorticProcedureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAorticProcedureActionPerformed
        // TODO add your handling code here:
        cardiacAorticProcedure();
    }//GEN-LAST:event_txtAorticProcedureActionPerformed

    private void tblAorticProcedureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAorticProcedureMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAorticProcedureMouseClicked

    private void tblAorticProcedureMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAorticProcedureMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAorticProcedureMousePressed

    private void tblAorticProcedureMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAorticProcedureMouseReleased
        // TODO add your handling code here:
        CardiacSurgery objDlt = listAorticProcedure.get(tblAorticProcedure.getSelectedRow());
        txtAortic.setText(objDlt.getRemarks().trim());
        if (evt.getClickCount() == 2) {
            if (ctlOtCardiac.deleteOtDetail(objDlt.getId())) {
                JOptionPane.showMessageDialog(null, "Record Deleted");
                selectAorticProcedure();
            } else {
                JOptionPane.showMessageDialog(null, "unable to Deleted");
            }
        }
    }//GEN-LAST:event_tblAorticProcedureMouseReleased

    private void tblAorticProcedureKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAorticProcedureKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAorticProcedureKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        objSave.setCompleteOrderNo(con);
        objSave.setOrderDetailId(odi);
        if (chkShuntNo.isSelected()) {
            objSave.setUseOfShunt("N");
        }
        if (chkShuntYes.isSelected()) {
            objSave.setUseOfShunt("Y");
        }
        objSave.setSurgeryDate(surgeryDate);
        objSave.setNonCardiacProc(txtOtherProcedureInfo.getText().trim());
        objSave.setLaLine(txtLALine.getText().trim());
        objSave.setThoracicAeroticRemarks(txtOperationSIte.getText().trim());
        objSave.setAorticClampTime(txtAorticClampTime.getText().trim());

        if (ctlOtCardiac.insertCabgsurgery(objSave)) {
            JOptionPane.showMessageDialog(null, "Save successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save.");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void chkShuntYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShuntYesActionPerformed
        // TODO add your handling code here:
        if (chkShuntNo.isSelected()) {
            chkShuntNo.setSelected(false);
        }
    }//GEN-LAST:event_chkShuntYesActionPerformed

    private void chkShuntNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShuntNoActionPerformed
        // TODO add your handling code here:
        if (chkShuntYes.isSelected()) {
            chkShuntYes.setSelected(false);
        }
    }//GEN-LAST:event_chkShuntNoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cardiacPathology();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAccess;
    private javax.swing.JButton btnAddCabg;
    private javax.swing.JButton btnAddDateOperation;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnQuestionaire;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnValSur;
    private javax.swing.JComboBox cboAccess;
    private javax.swing.JComboBox cboCabgProc;
    private javax.swing.JComboBox cboElective;
    private javax.swing.JComboBox cboEndart;
    private javax.swing.JComboBox cboPriorityStatus;
    private javax.swing.JComboBox cboRoleofRobo;
    private javax.swing.JComboBox cbofirstRedo;
    private javax.swing.JCheckBox chkShuntNo;
    private javax.swing.JCheckBox chkShuntYes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblAccess;
    private javax.swing.JTable tblAorticProcedure;
    private javax.swing.JTable tblCabgProc;
    private javax.swing.JTable tblOTClosure;
    private javax.swing.JTable tblOTPaceWire;
    private javax.swing.JTable tblReasonForRedo;
    private javax.swing.JTable tblSiteOfOperation;
    private javax.swing.JTable tblValSurg;
    private javax.swing.JTable tblpathology;
    private javax.swing.JTextField txtAdmissionNo;
    private javax.swing.JTextArea txtAortic;
    private javax.swing.JTextArea txtAorticClampTime;
    private javax.swing.JTextField txtAorticProcedure;
    private javax.swing.JTextField txtClosure;
    private javax.swing.JTextField txtConduit;
    private javax.swing.JTextField txtCronArt;
    private javax.swing.JTextField txtDV;
    private javax.swing.JTextField txtExp;
    private javax.swing.JTextField txtFlow;
    private javax.swing.JTextField txtFlow1;
    private javax.swing.JTextField txtIfnotElective;
    private javax.swing.JTextField txtImplant;
    private javax.swing.JTextArea txtLALine;
    private org.jdesktop.swingx.JXDatePicker txtOTPlanDate;
    private javax.swing.JTextArea txtOperationSIte;
    private javax.swing.JTextArea txtOtherProcedureInfo;
    private javax.swing.JTextField txtPaceWire;
    private javax.swing.JTextArea txtPathRemarks;
    private javax.swing.JTextField txtPathology;
    private javax.swing.JTextField txtPerformingPhysician;
    private javax.swing.JTextField txtPl;
    private javax.swing.JTextField txtPl1;
    private javax.swing.JTextField txtPrimaryPhysician;
    private javax.swing.JTextField txtProc;
    private javax.swing.JTextField txtReasonForRedo;
    private javax.swing.JTextField txtSelectedPatientId;
    private javax.swing.JTextField txtSelectedPatientName;
    private javax.swing.JTextField txtSiteOfOperation;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtSrNo;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtValSur;
    private javax.swing.JTextField txtWard;
    // End of variables declaration//GEN-END:variables

//    private void selectOperationDetail(String con, String odi, String typeDetailId,
//            String actionId) {
//        listPathology = ctlOtCardiac.selectOTPendingAll(con, odi, typeDetailId, actionId);
//
//        if (listPathology.isEmpty()) {
//            tblReasonForRedo.setModel(new OtDateOfOperationTableModel(listPathology));
//        } else {
//            tblReasonForRedo.setModel(new OtDateOfOperationTableModel(listPathology));
//        }
//        ListSelectionModel selectionModel = tblReasonForRedo.getSelectionModel();
//        tblReasonForRedo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        setColumnsWidthsOperation();
//        selectionModel.setSelectionInterval(0, 0);
//        Constants.tablelook.setJTableEnvironment(tblReasonForRedo);
//    }
    private void selectPatientQuestionaire() {

        lstQues = ctlOtCardiac.selectQuestionaireMaster(con, odi, Status.inOT);

        if (lstQues.isEmpty()) {
            List li = new ArrayList();
            CPTQuestionaire obj = new CPTQuestionaire();
            li.add(obj);
            tblSiteOfOperation.setModel(new OtQuestionaireTableModel(li));
        } else {
            tblSiteOfOperation.setModel(new OtQuestionaireTableModel(lstQues));
        }

        ListSelectionModel selectionModel = tblSiteOfOperation.getSelectionModel();
        tblSiteOfOperation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsQuestionaire();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblSiteOfOperation);

    }

//    public void selectQuestions() {
//
//        lstQuesDetail = ctlOtCardiac.selectQuestionaireDetail(con, odi, Status.inOT, questionId);
//
//        if (lstQuesDetail.isEmpty()) {
//            List li = new ArrayList();
//            CPTQuestionaire obj = new CPTQuestionaire();
//            li.add(obj);
////            tblAorticQestions.setModel(new OTQuestionsTableModel(li));
//        } else {
////            tblAorticQestions.setModel(new OTQuestionsTableModel(lstQuesDetail));
//        }
//
//        ListSelectionModel selectionModel = tblAorticQestions.getSelectionModel();
//        tblAorticQestions.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        setColumnsWidthsQuestions();
//        selectionModel.setSelectionInterval(0, 0);
//        Constants.tablelook.setJTableEnvironment(tblAorticQestions);
//
//    }
    public void setColumnsWidthsOperation() {

        TableColumn column = null;
        for (int i = 0; i < tblReasonForRedo.getColumnCount(); i++) {
            column = tblReasonForRedo.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            } else if (i == 2) {
                column.setPreferredWidth(200);
            }
        }
    }

//    public void setColumnsWidthsQuestions() {
//
//        TableColumn column = null;
//        for (int i = 0; i < tblAorticQestions.getColumnCount(); i++) {
//            column = tblAorticQestions.getColumnModel().getColumn(i);
//            if (i == 0) {
//                column.setPreferredWidth(90);
//            } else if (i == 1) {
//                column.setPreferredWidth(10);
//            }
//        }
//    }
    public void setColumnsWidthsQuestionaire() {

        TableColumn column = null;
        for (int i = 0; i < tblSiteOfOperation.getColumnCount(); i++) {
            column = tblSiteOfOperation.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(20);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            }
        }
    }

//    private void selectAccessDetail(String con, String odi, String typeDetailId,
//            String deftypeid) {
//        listAccessSelect = ctlOtCardiac.selectOTPendingAll(con, odi, typeDetailId, deftypeid);
//
//        if (listAccessSelect.isEmpty()) {
//            tblAccess.setModel(new OtAccessTableModel(listAccessSelect));
//        } else {
//            tblAccess.setModel(new OtAccessTableModel(listAccessSelect));
//        }
//        ListSelectionModel selectionModel = tblAccess.getSelectionModel();
//        tblAccess.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        setColumnsWidthsAccess();
//        selectionModel.setSelectionInterval(0, 0);
//        Constants.tablelook.setJTableEnvironment(tblAccess);
//    }
    public void setColumnsWidthsAccess() {

        TableColumn column = null;
        for (int i = 0; i < tblAccess.getColumnCount(); i++) {
            column = tblAccess.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            } else if (i == 2) {
                column.setPreferredWidth(200);
            }
        }
    }

    //CABG SELECT
    private void selectCabgProcedure(String con, String odi) {
        listCabgSelect = ctlOtCardiac.selectCabgProcedure(con, odi);

        if (listCabgSelect.isEmpty()) {
            tblCabgProc.setModel(new OtCabgProcTableModel(listCabgSelect));
        } else {
            tblCabgProc.setModel(new OtCabgProcTableModel(listCabgSelect));

        }
        ListSelectionModel selectionModel = tblCabgProc.getSelectionModel();
        tblCabgProc.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsCabgProc();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblCabgProc);
    }

    public void setColumnsWidthsCabgProc() {

        TableColumn column = null;
        for (int i = 0; i < tblCabgProc.getColumnCount(); i++) {
            column = tblCabgProc.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            } else if (i == 2) {
                column.setPreferredWidth(200);
            }
        }
    }

    private void selectValSurgery() {
        listVal = ctlOtCardiac.selectValSurgery(con, odi);

        if (listVal.isEmpty()) {
            return;
        } else {
            tblValSurg.setModel(new OtProcOptTableModel(listVal));
        }
        ListSelectionModel selectionModel = tblValSurg.getSelectionModel();
        tblValSurg.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsCabgProc();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblValSurg);
    }

    private void selectCabgSurgery() {
        listCabgProcedure = ctlOtCardiac.selectCabgSurgery(con, odi);
        CardiacSurgery obj = listCabgProcedure.get(0);
        setDate(Integer.parseInt(obj.getSurgeryDay()));
        txtOtherProcedureInfo.setText(obj.getNonCardiacProc().trim());
        txtLALine.setText(obj.getLaLine());
        txtOperationSIte.setText(obj.getThoracicAeroticRemarks());
        txtAorticClampTime.setText(obj.getAorticClampTime());
        if (obj.getUseOfShunt().equalsIgnoreCase("N")) {
            chkShuntNo.setSelected(true);
        }
        if (obj.getUseOfShunt().equalsIgnoreCase("Y")) {
            chkShuntYes.setSelected(true);
        }
    }

    private void setDate(int day) {
        try {
            Date date = new Date();
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtOTPlanDate.setDate(date2);
            surgeryDate = dateFormat.format(date2);
            txtOTPlanDate.setDate(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void cardiacPathology() {
        String query = " SELECT ID ID, DESCRIPTION  FROM            \n"
                + Database.DCMS.definitionTypeDetail + " DT         \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.cardiacPathology + "'"
                + " AND DT.ID NOT IN (SELECT TYPE_DETAIL_ID FROM "
                + Database.DCMS.otSetupDetail
                + " WHERE CON = '" + con + "' AND ODI = '" + odi + "'"
                + " AND ACTION_ID = " + DefinitionTypes.cardiacPathology + ") \n"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        deftypeid = Constants.lovID;
        CardiacSurgery operate = new CardiacSurgery();
        operate.setOrderDetailId(odi);
        operate.setCompleteOrderNo(con);
        operate.setTypeDetailId(deftypeid);
        operate.setActionId(DefinitionTypes.cardiacPathology);
        operate.setRemarks(txtPathRemarks.getText().trim());

        if (ctlOtCardiac.insertInOTDetail(operate)) {
            selectPathologyDetail();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Add, Kindly Contact Administrator");
        }
        txtPathology.requestFocus();
    }

    private void setPathologyColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblpathology.getColumnCount(); i++) {
            column = tblpathology.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(15);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            }
        }
    }

    private void selectPathologyDetail() {
        listPathology = ctlOtCardiac.selectOtDetail(con, odi,
                DefinitionTypes.cardiacPathology);
        tblpathology.setModel(new OtDateOfOperationTableModel(listPathology));
        ListSelectionModel selectionModel = tblpathology.getSelectionModel();
        tblpathology.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setPathologyColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblpathology);
        if (!listPathology.isEmpty()) {
            CardiacSurgery setRemarks = listPathology.get(0);
            txtPathRemarks.setText(setRemarks.getRemarks().trim());
        }
    }

    private void cardiacSiteOfOperation() {
        String query = " SELECT ID ID, DESCRIPTION  FROM            \n"
                + Database.DCMS.definitionTypeDetail + " DT         \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.cardiacSiteOfOperation + "'"
                + " AND DT.ID NOT IN (SELECT TYPE_DETAIL_ID FROM "
                + Database.DCMS.otSetupDetail
                + " WHERE CON = '" + con + "' AND ODI = '" + odi + "'"
                + " AND ACTION_ID = " + DefinitionTypes.cardiacSiteOfOperation + ") \n"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        deftypeid = Constants.lovID;
        CardiacSurgery operate = new CardiacSurgery();
        operate.setOrderDetailId(odi);
        operate.setCompleteOrderNo(con);
        operate.setTypeDetailId(deftypeid);
        operate.setActionId(DefinitionTypes.cardiacSiteOfOperation);
        operate.setRemarks(txtOperationSIte.getText().trim());
        if (ctlOtCardiac.insertInOTDetail(operate)) {
            selectSiteOfOperation();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Add, Kindly Contact Administrator");
        }
        txtSiteOfOperation.requestFocus();
    }

    private void setCardiacSiteOfOperationColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblpathology.getColumnCount(); i++) {
            column = tblpathology.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(15);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            }
        }
    }

    private void selectSiteOfOperation() {
        listSiteofOperation = ctlOtCardiac.selectOtDetail(con, odi,
                DefinitionTypes.cardiacSiteOfOperation);
        tblSiteOfOperation.setModel(new OtDateOfOperationTableModel(listSiteofOperation));
        ListSelectionModel selectionModel = tblSiteOfOperation.getSelectionModel();
        tblSiteOfOperation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setCardiacSiteOfOperationColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblSiteOfOperation);
        if (!listSiteofOperation.isEmpty()) {
            CardiacSurgery setRemarks = listSiteofOperation.get(0);
            txtOperationSIte.setText(setRemarks.getRemarks().trim());
        }

    }

    private void cardiacAorticProcedure() {
        String query = " SELECT ID ID, DESCRIPTION  FROM            \n"
                + Database.DCMS.definitionTypeDetail + " DT         \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.cardiacAorticProcedure + "'"
                + " AND DT.ID NOT IN (SELECT TYPE_DETAIL_ID FROM "
                + Database.DCMS.otSetupDetail
                + " WHERE CON = '" + con + "' AND ODI = '" + odi + "'"
                + " AND ACTION_ID = " + DefinitionTypes.cardiacAorticProcedure + ") \n"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        deftypeid = Constants.lovID;
        CardiacSurgery operate = new CardiacSurgery();
        operate.setOrderDetailId(odi);
        operate.setCompleteOrderNo(con);
        operate.setTypeDetailId(deftypeid);
        operate.setActionId(DefinitionTypes.cardiacAorticProcedure);
        operate.setRemarks(txtOperationSIte.getText().trim());
        if (ctlOtCardiac.insertInOTDetail(operate)) {
            selectAorticProcedure();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Add, Kindly Contact Administrator");
        }
        txtAorticProcedure.requestFocus();
    }

    private void setcardiacAorticProcedureColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblAorticProcedure.getColumnCount(); i++) {
            column = tblAorticProcedure.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(15);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            }
        }
    }

    private void selectAorticProcedure() {
        listAorticProcedure = ctlOtCardiac.selectOtDetail(con, odi,
                DefinitionTypes.cardiacAorticProcedure);
        tblAorticProcedure.setModel(new OtDateOfOperationTableModel(listAorticProcedure));
        ListSelectionModel selectionModel = tblAorticProcedure.getSelectionModel();
        tblAorticProcedure.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setcardiacAorticProcedureColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblAorticProcedure);
        if (!listAorticProcedure.isEmpty()) {
            CardiacSurgery setRemarks = listAorticProcedure.get(0);
            txtAortic.setText(setRemarks.getRemarks().trim());
        }
    }

    private void selectSurgeryInfo() {
        listSurgeryInfo = ctlOtCardiac.selectSurgeryInfo(con, odi);
        tblReasonForRedo.setModel(new SurgeryInfoTableModel(listSurgeryInfo));
        ListSelectionModel selectionModel = tblReasonForRedo.getSelectionModel();
        tblReasonForRedo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setSurgeryInfoColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblReasonForRedo);
    }

    private void setSurgeryInfoColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblReasonForRedo.getColumnCount(); i++) {
            column = tblReasonForRedo.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(40);
            } else if (i == 2) {
                column.setPreferredWidth(40);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void saveSurgeryInfo() {
        if (cboPriorityStatus.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Priority Status");
            return;
        }
        if (cboRoleofRobo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select First Redo");
            return;
        }

        if (cbofirstRedo.getSelectedIndex() >= 1) {
            if (redoRemarksId.length() == 0) {
                JOptionPane.showMessageDialog(null, "Kinly Select Reason");
                return;
            }
        }
        objSave = new CardiacSurgery();
        objSave.setCompleteOrderNo(con);
        objSave.setOrderDetailId(odi);
        objSave.setPriority(cboPriorityStatus.getSelectedItem().toString());
        objSave.setRoleofRobot(cboRoleofRobo.getSelectedItem().toString());
        objSave.setFirstRedo(cbofirstRedo.getSelectedItem().toString());
        objSave.setSurgeryRemarksId(redoRemarksId);

        if (ctlOtCardiac.insertSurgeryInfo(objSave)) {
            selectSurgeryInfo();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Add, Kindly Contact Administrator");
        }
    }

    private void saveAccessInformation() {
        if (cboAccess.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Access");
            return;
        }

        if (cboElective.getSelectedIndex() > 0) {
            if (IfnotElectiveId.equalsIgnoreCase("") || IfnotElectiveId == null) {
                JOptionPane.showMessageDialog(null, "Kinly Select If Not Elective");
                return;
            }
        }

        objSave = new CardiacSurgery();
        objSave.setCompleteOrderNo(con);
        objSave.setOrderDetailId(odi);
        objSave.setAccess(cboAccess.getSelectedItem().toString());
        objSave.setIsElective(cboElective.getSelectedItem().toString());
        objSave.setElectiveRemarksId(IfnotElectiveId);

        if (ctlOtCardiac.insertAccessInfo(objSave)) {
            selectAccessInformation();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Add, Kindly Contact Administrator");
        }
    }

    private void selectAccessInformation() {
        listAccess = ctlOtCardiac.selectAccessInfo(con, odi);
        tblAccess.setModel(new OtAccessTableModel(listAccess));
        ListSelectionModel selectionModel = tblAccess.getSelectionModel();
        tblAccess.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setAccessInformationColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblAccess);
    }

    private void setAccessInformationColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblAccess.getColumnCount(); i++) {
            column = tblAccess.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(60);
            } else if (i == 3) {
                column.setPreferredWidth(120);
            }
        }
    }

    private void saveClosure() {
        String query = " SELECT DT.ID ID, DT.DESCRIPTION DESCRIPTION FROM        \n"
                + Database.DCMS.definitionTypeDetail + " DT    \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otClosure + "'"
                + " AND DT.ID NOT IN (SELECT TYPE_DETAIL_ID FROM "
                + Database.DCMS.otSetupDetail
                + " WHERE CON = '" + con + "' AND ODI = '" + odi + "'"
                + " AND ACTION_ID = " + DefinitionTypes.otClosure + ") \n"
                + " ORDER BY ID";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        CardiacSurgery operate = new CardiacSurgery();
        operate.setOrderDetailId(odi);
        operate.setCompleteOrderNo(con);
        operate.setTypeDetailId(Constants.lovID);
        operate.setActionId(DefinitionTypes.otClosure);
        operate.setRemarks(txtOperationSIte.getText().trim());

        if (ctlOtCardiac.insertInOTDetail(operate)) {
            selectClosure();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Add, Kindly Contact Administrator");
        }
    }

    private void selectClosure() {
        lstClosure = ctlOtCardiac.selectOtDetail(con, odi,
                DefinitionTypes.otClosure);
        tblOTClosure.setModel(new OtClosureTableModel(lstClosure));
        ListSelectionModel selectionModel = tblOTClosure.getSelectionModel();
        tblOTClosure.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setClosureColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblOTClosure);
    }

    private void setClosureColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblOTClosure.getColumnCount(); i++) {
            column = tblOTClosure.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void savePacingWire() {
        String query = " SELECT DT.ID ID, DT.DESCRIPTION DESCRIPTION FROM        \n"
                + Database.DCMS.definitionTypeDetail + " DT    \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otPacingWire + "'"
                + " AND DT.ID NOT IN (SELECT TYPE_DETAIL_ID FROM "
                + Database.DCMS.otSetupDetail
                + " WHERE CON = '" + con + "' AND ODI = '" + odi + "'"
                + " AND ACTION_ID = " + DefinitionTypes.otPacingWire + ") \n"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        CardiacSurgery operate = new CardiacSurgery();
        operate.setOrderDetailId(odi);
        operate.setCompleteOrderNo(con);
        operate.setTypeDetailId(Constants.lovID);
        operate.setActionId(DefinitionTypes.otPacingWire);
        operate.setRemarks(txtOperationSIte.getText().trim());

        if (ctlOtCardiac.insertInOTDetail(operate)) {
            selectPacingWire();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Add, Kindly Contact Administrator");
        }
    }

    private void selectPacingWire() {
        lstpaceWire = ctlOtCardiac.selectOtDetail(con, odi,
                DefinitionTypes.otPacingWire);
        tblOTPaceWire.setModel(new OtPacingWireTableModel(lstpaceWire));
        ListSelectionModel selectionModel = tblOTPaceWire.getSelectionModel();
        tblOTPaceWire.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setPacingWireColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblOTPaceWire);
    }

    private void setPacingWireColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblOTPaceWire.getColumnCount(); i++) {
            column = tblOTPaceWire.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            }
        }
    }
}
