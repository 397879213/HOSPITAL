package OT.Form;

import BO.Order.CPTQuestionaire;

import OT.BO.CardiacSurgery;
import OT.Controller.CardiacController;
import OT.TableModel.OtAccessTableModel;
import OT.TableModel.OtCabgProcTableModel;
import OT.TableModel.OtDateOfOperationTableModel;
import OT.TableModel.OtProcOptTableModel;
import OT.TableModel.OtClosureTableModel;
import OT.TableModel.OtPaceWireTableModel;
import OT.TableModel.OtQuestionaireTableModel;
import OT.TableModel.OTQuestionsTableModel;
import java.util.ArrayList;
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

public class CardiacSurgeryFormFarzal extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();
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
    CardiacController ctlOtCardiac = new CardiacController();
    List<CardiacSurgery> listOtOperation = new ArrayList();
    List<CardiacSurgery> listReasonForRedo = new ArrayList();
    List<CardiacSurgery> listAccessSelect = new ArrayList();
    List<CardiacSurgery> listAccess = new ArrayList();
    List<CardiacSurgery> listReasonForNotElective = new ArrayList();
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

    String[] cboStatus = {"", "8661", "8662", "8663", "8664"};
    String[] cboRedo = {"", "8665", "8666", "8667", "8668"};
    String[] cboAcs = {"", "8678", "8679", "8680", "8681", "8682"};
    String[] cboEle = {"", "8669", "8670", "8671", "8672", "8673", "8674", "8675", "8676", "8677"};
    String[] cabgProc = {"", "8708", "8709", "8710", "8711", "8712", "8713", "8714"};

    public CardiacSurgeryFormFarzal() {

        initComponents();
        this.setSize(Constants.xSize + 340, Constants.ySize - Constants.yExtension + 35);
        this.con = con;
        this.odi = odi; 
        selectPatientQuestionaire();
        selectOperationDetail(con, odi, typeDetailId, deftypeid);
        selectAccessDetail(con, odi, typeDetailId, deftypeid);
        selectCabgProcedure(con, odi);
        selectValSurgery();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnQuestionaire = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cboPriorityStatus = new javax.swing.JComboBox();
        cbofirstRedo = new javax.swing.JComboBox();
        txtReasonForRedo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblReasonForRedo = new javax.swing.JTable();
        btnAddDateOperation = new javax.swing.JButton();
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
        jPanel2 = new javax.swing.JPanel();
        cboAccess = new javax.swing.JComboBox();
        cboElective = new javax.swing.JComboBox();
        txtIfnotElective = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblAccess = new javax.swing.JTable();
        btnAddAccess = new javax.swing.JButton();
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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDV = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cboCabgProc = new javax.swing.JComboBox();
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
        jPanel6 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblOTPaceWire = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtClosure = new javax.swing.JTextField();
        txtPaceWire = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblOTClosure = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblAorticQuestionaire = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblAorticQestions = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        txtComments = new javax.swing.JTextField();
        btnSaveQuestionaire = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Search Studies");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1020, 710));
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

        javax.swing.GroupLayout pnlPLLayout = new javax.swing.GroupLayout(pnlPL);
        pnlPL.setLayout(pnlPLLayout);
        pnlPLLayout.setHorizontalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPLLayout.createSequentialGroup()
                .addGap(438, 438, 438)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuestionaire, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPLLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnQuestionaire))
                .addGap(5, 5, 5))
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date of Operation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        cboPriorityStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboPriorityStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select","Routine","Urgent","Emergency","Salvage"}));
        cboPriorityStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPriorityStatusActionPerformed(evt);
            }
        });

        cbofirstRedo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbofirstRedo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select","1st Operation","2nd Operation","3rd Operation","4th Operation"}));
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

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Reason for Redo :");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText(" Priority Status :");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("First/Redo Surg :");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboPriorityStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbofirstRedo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtReasonForRedo, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddDateOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboPriorityStatus)
                    .addComponent(cbofirstRedo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtReasonForRedo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(7, 7, 7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddDateOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
        jLabel8.setText("Status :");

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
        jLabel25.setText("Admission No :");

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
        jLabel26.setText("Ward :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSelectedPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSelectedPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPerformingPhysician, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAdmissionNo)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtWard, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAdmissionNo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSelectedPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtSelectedPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPerformingPhysician, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Access", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        cboAccess.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboAccess.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select", "Median  Sternotomy","Right Thoracotomy","Left Thoracotomy","Mini Thoracotomy","Mini sternotomy Others"}));
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

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Reason if Not Elective :");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setText("Access :");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setText("Elective/Not Elective :");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane12)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboElective, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIfnotElective, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboAccess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboElective, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIfnotElective, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        jLabel13.setText("Artery:");

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
        jLabel17.setText("Pl:");

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
        jLabel18.setText("Flow:");

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

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setText("Endart:");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setText("CABG.Proc :");

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
        jLabel28.setText("DV :");

        cboCabgProc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboCabgProc.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select","N.A","CABF(conventional)","OPCAB","CABG(on pump beating)","MIDCAB","MIDCAB (robotic)","Hybrid (Revascularization)"}));
        cboCabgProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCabgProcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboCabgProc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCronArt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConduit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboEndart, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFlow, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddCabg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane5)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddCabg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFlow)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCronArt)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtConduit)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboEndart)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboCabgProc)))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
        jLabel19.setText("Proc :");

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
        jLabel22.setText("Type:");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Size:");

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
        jLabel27.setText("Val.Sur :");

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
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValSur, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtImplant, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSrNo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnValSur, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
            .addComponent(jScrollPane6)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValSur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImplant)
                    .addComponent(txtType)
                    .addComponent(txtSize)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSrNo)
                        .addComponent(btnValSur, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Closure and Pacing Wire", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

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

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Closure :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setText("Pacing Wire :");

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClosure))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPaceWire, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(txtClosure, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaceWire, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thoracic Aortic Surgery Data:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblAorticQuestionaire.setBackground(java.awt.SystemColor.activeCaption);
        tblAorticQuestionaire.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblAorticQuestionaire.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "" },
            },
            new String [] {
                "ID", "DESCRIPTION"
            }
        ));
        tblAorticQuestionaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAorticQuestionaireMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAorticQuestionaireMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAorticQuestionaireMouseReleased(evt);
            }
        });
        tblAorticQuestionaire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAorticQuestionaireKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblAorticQuestionaire);

        tblAorticQestions.setBackground(java.awt.SystemColor.activeCaption);
        tblAorticQestions.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblAorticQestions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "" },
            },
            new String [] {
                "Questions","Select"
            }
        ));
        tblAorticQestions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAorticQestionsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAorticQestionsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAorticQestionsMouseReleased(evt);
            }
        });
        tblAorticQestions.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAorticQestionsKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tblAorticQestions);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 0, 0));
        jLabel29.setText("Comments :");

        txtComments.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtComments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtCommentsMouseReleased(evt);
            }
        });
        txtComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommentsActionPerformed(evt);
            }
        });

        btnSaveQuestionaire.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSaveQuestionaire.setText("Save");
        btnSaveQuestionaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveQuestionaireActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtComments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveQuestionaire, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(btnSaveQuestionaire, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        typeDetailId = Constants.lovID;
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
        txtPl.setText(curentSelectedOperationObj.getPi());
        txtFlow.setText(curentSelectedOperationObj.getFlow());
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
    }//GEN-LAST:event_tblOTPaceWireMouseReleased

    private void tblOTPaceWireKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOTPaceWireKeyReleased

    }//GEN-LAST:event_tblOTPaceWireKeyReleased

    private void tblAorticQuestionaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAorticQuestionaireMouseClicked

    }//GEN-LAST:event_tblAorticQuestionaireMouseClicked

    private void tblAorticQuestionaireMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAorticQuestionaireMousePressed

    }//GEN-LAST:event_tblAorticQuestionaireMousePressed

    private void tblAorticQuestionaireMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAorticQuestionaireMouseReleased

        if (tblAorticQuestionaire.getSelectedRow() < 0 || lstQues.isEmpty()) {
            return;
        }

        objQuesMaster = lstQues.get(tblAorticQuestionaire.getSelectedRow());
        objQuesMaster.setCompleteOrderNo(con);
        objQuesMaster.setOrderDetailId(odi);
        questionId = objQuesMaster.getQuestionaireTypeId();

        selectQuestions();

    }//GEN-LAST:event_tblAorticQuestionaireMouseReleased

    private void tblAorticQuestionaireKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAorticQuestionaireKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAorticQuestionaireKeyReleased

    private void tblAorticQestionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAorticQestionsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAorticQestionsMouseClicked

    private void tblAorticQestionsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAorticQestionsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAorticQestionsMousePressed

    private void tblAorticQestionsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAorticQestionsMouseReleased

        txtComments.setText(lstQuesDetail.get(tblAorticQestions.getSelectedRow()).getQuestionRemarks());

    }//GEN-LAST:event_tblAorticQestionsMouseReleased

    private void tblAorticQestionsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAorticQestionsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAorticQestionsKeyReleased

    private void tblReasonForRedoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReasonForRedoMouseClicked

        if (evt.getClickCount() % 2 == 0) {
            if (tblReasonForRedo.getSelectedRow() < 0 || listOtOperation.isEmpty()) {

                return;
            }
            currentId = curentSelectedOperationObj.getId();
            ctlOtCardiac.deleteOperationDetail(currentId);
            selectOperationDetail(con, odi, typeDetailId, title);
        }

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
        if (evt.getClickCount() % 2 == 0) {
            if (tblAccess.getSelectedRow() < 0 || listAccessSelect.isEmpty()) {

                return;
            }
            curentSelectedOperationObj = new CardiacSurgery();
            curentSelectedOperationObj = listAccessSelect.get(tblAccess.getSelectedRow());
            currentCabgId = curentSelectedOperationObj.getId();
            ctlOtCardiac.deleteOperationDetail(currentCabgId);
            selectAccessDetail(con, odi, typeDetailId, deftypeid);
        }
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

        String query = " SELECT ID ID, DESCRIPTION  FROM        \n"
                + Database.DCMS.definitionTypeDetail + " DT      \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otExplantImplant + "'"
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
        if (cboPriorityStatus.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Priority Status");
            return;
        }
        if (cbofirstRedo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select First Redo");
            return;
        }

        if (cbofirstRedo.getSelectedIndex() > 1) {
            if (typeDetailId.equalsIgnoreCase("") || typeDetailId == null) {
                JOptionPane.showMessageDialog(null, "Kinly Select Reason");
                return;
            }
        }

        List<CardiacSurgery> lis = new ArrayList<>();
        String cboindex = "";
        cboindex = cboStatus[cboPriorityStatus.getSelectedIndex()];
        CardiacSurgery obj1 = new CardiacSurgery();
        obj1.setTypeDetailId(cboindex);
        obj1.setCompleteOrderNo(con);
        obj1.setOrderDetailId(odi);
        obj1.setDefTypeId(DefinitionTypes.priorityStatus);
        obj1.setType("cbo");
        lis.add(obj1);

        cboindex = cboRedo[cbofirstRedo.getSelectedIndex()];
        CardiacSurgery obj2 = new CardiacSurgery();
        obj2.setCompleteOrderNo(con);
        obj2.setOrderDetailId(odi);
        obj2.setTypeDetailId(cboindex);
        obj2.setDefTypeId(DefinitionTypes.firstRedo);
        obj2.setType("cbo");
        lis.add(obj2);

        CardiacSurgery obj3 = new CardiacSurgery();
        obj3.setCompleteOrderNo(con);
        obj3.setOrderDetailId(odi);
        obj3.setTypeDetailId(typeDetailId);
        obj3.setDefTypeId(DefinitionTypes.reasonForRedo);
        obj3.setType("LOV");
        lis.add(obj3);

        if (ctlOtCardiac.insertOperDetail(lis)) {
            selectOperationDetail(con, odi, typeDetailId, typeDetailId);
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Add, Kindly Contact Administrator");
        }

    }//GEN-LAST:event_btnAddDateOperationActionPerformed

    private void btnAddAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccessActionPerformed
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
        List<CardiacSurgery> lis = new ArrayList<>();
        String cboindex = "";
        cboindex = cboAcs[cboAccess.getSelectedIndex()];
        CardiacSurgery obj1 = new CardiacSurgery();
        obj1.setTypeDetailId(cboindex);
        obj1.setCompleteOrderNo(con);
        obj1.setOrderDetailId(odi);
        obj1.setType("cbo");
        obj1.setDefTypeId(DefinitionTypes.otAccess);
        lis.add(obj1);

        cboindex = cboEle[cboElective.getSelectedIndex()];
        CardiacSurgery obj2 = new CardiacSurgery();
        obj2.setCompleteOrderNo(con);
        obj2.setOrderDetailId(odi);
        obj2.setTypeDetailId(cboindex);
        obj2.setType("cbo");
        obj2.setDefTypeId(DefinitionTypes.otValveSurg);
        lis.add(obj2);

        CardiacSurgery obj3 = new CardiacSurgery();
        obj3.setCompleteOrderNo(con);
        obj3.setOrderDetailId(odi);
        obj3.setTypeDetailId(IfnotElectiveId);
        obj3.setType("LOV");
        obj3.setDefTypeId(DefinitionTypes.otreasonIfnotElective);
        lis.add(obj3);

        if (ctlOtCardiac.insertOperDetail(lis)) {
            selectAccessDetail(con, odi, typeDetailId, deftypeid);
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Add, Kindly Contact Administrator");
        }
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

        System.out.println("cbo = " + cabgProc[cboCabgProc.getSelectedIndex()]
                + " - " + cboCabgProc.getSelectedItem());

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
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otValveSurg + "'"
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

        String query = " SELECT DT.ID ID, DT.DESCRIPTION DESCRIPTION FROM        \n"
                + Database.DCMS.definitionTypeDetail + " DT    \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otClosure + "'"
                + " AND DT.ID NOT IN (SELECT OCP.CLOSURE_ID FROM "
                + Database.DCMS.otClosurePacingWire + " OCP"
                + " WHERE OCP.CON = '" + con + "' AND OCP.ODI = '" + odi + "'"
                + " AND OCP.CLOSURE_ID IS NOT NULL) \n"
                + " ORDER BY ID";

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        objSave = new CardiacSurgery();
        objSave.setCompleteOrderNo(con);
        objSave.setOrderDetailId(odi);
        objSave.setClosureId(Constants.lovID);
        objSave.setPaceWireId("");
        objSave.setClosureDescription(Constants.lovDescription);
        objSave.setDefTypeId(DefinitionTypes.otClosure);

        if (ctlOtCardiac.insertClosurePaceWire(objSave)) {
            lstClosure.add(objSave);
            tblOTClosure.setModel(new OtClosureTableModel(lstClosure));
            this.tblLookAndFeel(tblOTClosure);
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Add. Kindy Contact Administrator.");
        }

    }//GEN-LAST:event_txtClosureActionPerformed

    private void tblLookAndFeel(JTable tbl) {
        ListSelectionModel selectionModel = tbl.getSelectionModel();
        tbl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsOperation();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tbl);
    }

    private void txtPaceWireMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPaceWireMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaceWireMouseReleased

    private void txtPaceWireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaceWireActionPerformed

        String query = " SELECT DT.ID ID, DT.DESCRIPTION DESCRIPTION FROM        \n"
                + Database.DCMS.definitionTypeDetail + " DT    \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.otPacingWire + "'"
                + " AND DT.ID NOT IN (SELECT OCP.PACING_WIRE_ID FROM "
                + Database.DCMS.otClosurePacingWire + " OCP"
                + " WHERE OCP.CON = '" + con + "' AND OCP.ODI = '" + odi + "'"
                + " AND OCP.PACING_WIRE_ID IS NOT NULL) \n"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        objSave = new CardiacSurgery();
        objSave.setCompleteOrderNo(con);
        objSave.setOrderDetailId(odi);
        objSave.setPaceWireId(Constants.lovID);
        objSave.setPaceWireDescription(Constants.lovDescription);
        objSave.setClosureId("");
        objSave.setDefTypeId(DefinitionTypes.otPacingWire);

        if (ctlOtCardiac.insertClosurePaceWire(objSave)) {
            lstpaceWire.add(objSave);
            tblOTPaceWire.setModel(new OtPaceWireTableModel(lstpaceWire));
            this.tblLookAndFeel(tblOTPaceWire);
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Add. Kindy Contact Administrator.");
        }

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
    }//GEN-LAST:event_tblOTClosureMouseReleased

    private void tblOTClosureKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOTClosureKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOTClosureKeyReleased

    private void txtCommentsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCommentsMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommentsMouseReleased

    private void txtCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommentsActionPerformed

    }//GEN-LAST:event_txtCommentsActionPerformed

    private void btnSaveQuestionaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveQuestionaireActionPerformed

        boolean ret = false;
        List<CPTQuestionaire> lstQuesUpdate = new ArrayList();

        for (int i = 0; i < tblAorticQestions.getRowCount(); i++) {
            ret = Boolean.parseBoolean(tblAorticQestions.getValueAt(i, 1).toString());
            if (ret) {
                objQues = lstQuesDetail.get(i);
                objQues.setQuestionResult("Y");
                lstQuesUpdate.add(objQues);
            }
        }

        if (lstQuesUpdate.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Question selected");
            return;
        }

        if (ctlOtCardiac.updateQuestionaire(lstQuesUpdate, objQuesMaster)) {
            JOptionPane.showMessageDialog(null, "Questionaire Updated Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable To Update Questionaire. "
                    + "Kindly Contact Administrator.");
        }

    }//GEN-LAST:event_btnSaveQuestionaireActionPerformed

    private void cboCabgProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCabgProcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCabgProcActionPerformed

    private void btnQuestionaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestionaireActionPerformed

        //LOV dc = new DisplayCardio();
        //dc.OpenDialog(this);

    }//GEN-LAST:event_btnQuestionaireActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAccess;
    private javax.swing.JButton btnAddCabg;
    private javax.swing.JButton btnAddDateOperation;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnQuestionaire;
    private javax.swing.JButton btnSaveQuestionaire;
    private javax.swing.JButton btnValSur;
    private javax.swing.JComboBox cboAccess;
    private javax.swing.JComboBox cboCabgProc;
    private javax.swing.JComboBox cboElective;
    private javax.swing.JComboBox cboEndart;
    private javax.swing.JComboBox cboPriorityStatus;
    private javax.swing.JComboBox cbofirstRedo;
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblAccess;
    private javax.swing.JTable tblAorticQestions;
    private javax.swing.JTable tblAorticQuestionaire;
    private javax.swing.JTable tblCabgProc;
    private javax.swing.JTable tblOTClosure;
    private javax.swing.JTable tblOTPaceWire;
    private javax.swing.JTable tblReasonForRedo;
    private javax.swing.JTable tblValSurg;
    private javax.swing.JTextField txtAdmissionNo;
    private javax.swing.JTextField txtClosure;
    private javax.swing.JTextField txtComments;
    private javax.swing.JTextField txtConduit;
    private javax.swing.JTextField txtCronArt;
    private javax.swing.JTextField txtDV;
    private javax.swing.JTextField txtExp;
    private javax.swing.JTextField txtFlow;
    private javax.swing.JTextField txtIfnotElective;
    private javax.swing.JTextField txtImplant;
    private javax.swing.JTextField txtPaceWire;
    private javax.swing.JTextField txtPerformingPhysician;
    private javax.swing.JTextField txtPl;
    private javax.swing.JTextField txtProc;
    private javax.swing.JTextField txtReasonForRedo;
    private javax.swing.JTextField txtSelectedPatientId;
    private javax.swing.JTextField txtSelectedPatientName;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtSrNo;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtValSur;
    private javax.swing.JTextField txtWard;
    // End of variables declaration//GEN-END:variables

    private void selectOperationDetail(String con, String odi, String typeDetailId,
            String deftypeid) {
//        listOtOperation = ctlOtCardiac.selectOTPendingAll(con, odi, typeDetailId, deftypeid);
//
//        if (listOtOperation.isEmpty()) {
//            tblReasonForRedo.setModel(new OtDateOfOperationTableModel(listOtOperation));
//        } else {
//            tblReasonForRedo.setModel(new OtDateOfOperationTableModel(listOtOperation));
//        }
//        ListSelectionModel selectionModel = tblReasonForRedo.getSelectionModel();
//        tblReasonForRedo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        setColumnsWidthsOperation();
//        selectionModel.setSelectionInterval(0, 0);
//        Constants.tablelook.setJTableEnvironment(tblReasonForRedo);
    }

    private void selectPatientQuestionaire() {

        lstQues = ctlOtCardiac.selectQuestionaireMaster(con, odi, Status.inOT);

        if (lstQues.isEmpty()) {
            List li = new ArrayList();
            CPTQuestionaire obj = new CPTQuestionaire();
            li.add(obj);
            tblAorticQuestionaire.setModel(new OtQuestionaireTableModel(li));
        } else {
            tblAorticQuestionaire.setModel(new OtQuestionaireTableModel(lstQues));
        }

        ListSelectionModel selectionModel = tblAorticQuestionaire.getSelectionModel();
        tblAorticQuestionaire.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsQuestionaire();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblAorticQuestionaire);

    }

    public void selectQuestions() {

        lstQuesDetail = ctlOtCardiac.selectQuestionaireDetail(con, odi, Status.inOT, questionId);

        if (lstQuesDetail.isEmpty()) {
            List li = new ArrayList();
            CPTQuestionaire obj = new CPTQuestionaire();
            li.add(obj);
            tblAorticQestions.setModel(new OTQuestionsTableModel(li));
        } else {
            tblAorticQestions.setModel(new OTQuestionsTableModel(lstQuesDetail));
        }

        ListSelectionModel selectionModel = tblAorticQestions.getSelectionModel();
        tblAorticQestions.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsQuestions();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblAorticQestions);

    }

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

    public void setColumnsWidthsQuestions() {

        TableColumn column = null;
        for (int i = 0; i < tblAorticQestions.getColumnCount(); i++) {
            column = tblAorticQestions.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(90);
            } else if (i == 1) {
                column.setPreferredWidth(10);
            }
        }
    }

    public void setColumnsWidthsQuestionaire() {

        TableColumn column = null;
        for (int i = 0; i < tblAorticQuestionaire.getColumnCount(); i++) {
            column = tblAorticQuestionaire.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(20);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void selectAccessDetail(String con, String odi, String typeDetailId,
            String deftypeid) {
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
    }

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
}
