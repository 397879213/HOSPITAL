package Form.Hospital;

import BO.Hospital.PatientAdmission;
import BO.Hospital.PatientNotes;
import BO.MedicineOrderEntry;
import BO.OPDConsultancy;
import BO.OrderData;
import BO.Patient;
import Controller.BillingLedgerController;
import Controller.Hospital.InPatientBillController;
import Controller.Hospital.PatientNotesController;
import Controller.Hospital.PatientAdmissionController;
import Controller.InvoiceController;
import Controller.OPDController;
import Controller.OrderController;
import Controller.OrderMedicineController;
import Controller.PatientController;
import Controller.ReportingTemplateController;

import Form.general.DCMS_MDI;
import Form.general.UserAuthentication;
import Handler.OrderHandler;
import TableModel.Hospital.AdmissionHistoryPatientTableModel;
import TableModel.Hospital.AdmittedPatientTableModel;
import TableModel.Hospital.InPatientMedicationSearchModel;
import TableModel.Hospital.PatientNoteSearchModel;
import TableModel.Hospital.PatientNotesTableLookAndFeel;
import com.inet.jortho.FileUserDictionary;
import com.inet.jortho.SpellChecker;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.table.TableColumn;
import javax.swing.text.Document;
import javax.swing.text.StyledEditorKit;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import org.fife.ui.autocomplete.AutoCompletion;
import org.fife.ui.autocomplete.BasicCompletion;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.autocomplete.DefaultCompletionProvider;
import org.fife.ui.autocomplete.ShorthandCompletion;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.GUIUtils;
import utilities.JDocumentEditor;
import utilities.PrintJasperReport;
import utilities.Reports;
import utilities.Status;
import utilities.Stores;
import utilities.TypeDetailId;

public class InPatientDoctorServices extends javax.swing.JInternalFrame {

    private int currentSelectedPatient = 0;
//    text editor
    private Action boldAction = new StyledEditorKit.BoldAction();
    private Action italicAction = new StyledEditorKit.ItalicAction();
    private Action underlineAction = new StyledEditorKit.UnderlineAction();
    KeyStroke boldKey = KeyStroke.getKeyStroke("control B");
    KeyStroke italicKey = KeyStroke.getKeyStroke("control I");
    KeyStroke underlineKey = KeyStroke.getKeyStroke("control U");
    JDocumentEditor ed = new JDocumentEditor();
    private UndoManager undoManager;
    public static AutoCompletion ac = null;
    public static CompletionProvider provider = null;
    public String dischargeCertificate = "Discharge Certificate";
    public String deathCertificate = "Death Certificate";

    public InPatientDoctorServices() {
        initComponents();

        this.setSize(Constants.xSize + 340, Constants.ySize + 20);
        txtPatientId.setEditable(false);
        txtPatientName.setEditable(false);
        txReferringPhysicanDisplay.setEditable(false);
        txtAdmissionDate.setEditable(false);
//      txtCPTTotalAmount.setEditable(false);
//        txtPatientDetails.setEditable(false);
//        txtAdmissionId.setEditable(false);
//        btnSaveItemOrder.setMnemonic(KeyEvent.VK_A);
//        btnClearPharmacy.setMnemonic(KeyEvent.VK_C);
//        btnExit.setMnemonic(KeyEvent.VK_X);
//
//        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
//        Date date = new Date();
//
//        txtItemOrderFromDate.setText(dateFormat.format(date).toUpperCase());
//        txtItemOrderToDate.setText(dateFormat.format(date).toUpperCase());

        txtPreviousNotes.setEditable(false);
        customerId = "";
        SpellChecker.setUserDictionaryProvider(new FileUserDictionary());
        try {
            SpellChecker.registerDictionaries(Constants.dictionary.toURL(), null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        SpellChecker.register(txtNotes);

        
        txtNotes.putClientProperty(JEditorPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
        txtNotes.setFont(new java.awt.Font("Arial", Font.PLAIN, 14));
        searchAdmittedPatient(Status.admitted);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPatientDetail = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPatientIdSearch = new javax.swing.JTextField();
        txtPatientDetails = new javax.swing.JTextField();
        txtWardId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        ckbAllSearch = new javax.swing.JCheckBox();
        cboStatus = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        txtAttenDoctor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblAdmittedPatient = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txReferringPhysicanDisplay = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtAdmissionDate = new javax.swing.JTextField();
        txtAdmissionId = new javax.swing.JTextField();
        txtWardName = new javax.swing.JTextField();
        txtBedName = new javax.swing.JTextField();
        txtOrderStatus = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        btnSaveNotes = new javax.swing.JButton();
        btnSubmitNotes = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        chkNoteClinicalHistory = new javax.swing.JCheckBox();
        chkNoteFollowUp = new javax.swing.JCheckBox();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        tblPreviousNotes = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        txtNotesBy = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        txtNoteType = new javax.swing.JTextField();
        txtNotesFromDate = new org.jdesktop.swingx.JXDatePicker();
        txtNotesToDate = new org.jdesktop.swingx.JXDatePicker();
        btnSearchNotes = new javax.swing.JButton();
        chkAllNotes = new javax.swing.JCheckBox();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPreviousNotes = new javax.swing.JTextArea();
        jPanel21 = new javax.swing.JPanel();
        btnDiagnosticReports = new javax.swing.JButton();
        btnDischarge = new javax.swing.JButton();
        cboDiagnosisForms = new javax.swing.JComboBox();
        btnExit = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtDischargeReason = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDischargeRemarks = new javax.swing.JTextField();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Admisson Request");
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

        pnlPatientDetail.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlPatientDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Patients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlPatientDetail.setForeground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Patient Id:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ward:");

        txtPatientIdSearch.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPatientIdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdSearchActionPerformed(evt);
            }
        });

        txtPatientDetails.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientDetailsActionPerformed(evt);
            }
        });

        txtWardId.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtWardId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtWardIdMouseReleased(evt);
            }
        });
        txtWardId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWardIdActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSearchMouseReleased(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCreate_User(evt);
            }
        });

        ckbAllSearch.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        ckbAllSearch.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ckbAllSearch.setText("ALL");
        ckbAllSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbAllSearchActionPerformed(evt);
            }
        });

        cboStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Admitted", "Discharge Requests","Financially Discharged"}));
        cboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboStatusActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Prim. Physician:");

        txtAttenDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAttenDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPatientDetailLayout = new javax.swing.GroupLayout(pnlPatientDetail);
        pnlPatientDetail.setLayout(pnlPatientDetailLayout);
        pnlPatientDetailLayout.setHorizontalGroup(
            pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientDetailLayout.createSequentialGroup()
                .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPatientDetailLayout.createSequentialGroup()
                        .addComponent(txtAttenDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPatientDetailLayout.createSequentialGroup()
                            .addComponent(txtPatientIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPatientDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ckbAllSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPatientDetailLayout.createSequentialGroup()
                            .addComponent(txtWardId, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPatientDetailLayout.setVerticalGroup(
            pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientDetailLayout.createSequentialGroup()
                .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPatientDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbAllSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientIdSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboStatus)
                    .addComponent(txtWardId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAttenDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

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
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admitted Patients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblAdmittedPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Reffering.Phy","Status","Req.Date",
                "Prop.Date"
            }
        ));
        tblAdmittedPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdmittedPatientMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAdmittedPatientMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAdmittedPatientMouseReleased(evt);
            }
        });
        tblAdmittedPatient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAdmittedPatientKeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tblAdmittedPatient);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Patient Id:");

        txtPatientId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        txtPatientName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Admission No:");

        txReferringPhysicanDisplay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txReferringPhysicanDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txReferringPhysicanDisplayActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Date:");

        txtAdmissionDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAdmissionDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmissionDateActionPerformed(evt);
            }
        });

        txtAdmissionId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAdmissionId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmissionIdActionPerformed(evt);
            }
        });

        txtWardName.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtWardName.setForeground(new java.awt.Color(102, 0, 0));
        txtWardName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWardName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWardNameActionPerformed(evt);
            }
        });

        txtBedName.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtBedName.setForeground(new java.awt.Color(102, 0, 0));
        txtBedName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBedName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBedNameActionPerformed(evt);
            }
        });

        txtOrderStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtOrderStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAdmissionId, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(txtPatientId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtWardName, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(txtPatientName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtBedName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txReferringPhysicanDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAdmissionDate)
                    .addComponent(txtOrderStatus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txReferringPhysicanDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAdmissionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWardName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmissionId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBedName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel12.setForeground(new java.awt.Color(255, 255, 255));

        jPanel22.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Notes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        btnSaveNotes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSaveNotes.setText("Save");
        btnSaveNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveNotesActionPerformed(evt);
            }
        });

        btnSubmitNotes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSubmitNotes.setForeground(new java.awt.Color(0, 153, 0));
        btnSubmitNotes.setText("Submit");
        btnSubmitNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitNotesActionPerformed(evt);
            }
        });

        txtNotes.setColumns(20);
        txtNotes.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtNotes.setLineWrap(true);
        txtNotes.setRows(5);
        txtNotes.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtNotes);

        chkNoteClinicalHistory.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkNoteClinicalHistory.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkNoteClinicalHistory.setForeground(new java.awt.Color(102, 0, 0));
        chkNoteClinicalHistory.setText("History");
        chkNoteClinicalHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNoteClinicalHistoryActionPerformed(evt);
            }
        });

        chkNoteFollowUp.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkNoteFollowUp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkNoteFollowUp.setForeground(new java.awt.Color(102, 0, 0));
        chkNoteFollowUp.setSelected(true);
        chkNoteFollowUp.setText("FUP");
        chkNoteFollowUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNoteFollowUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addComponent(chkNoteClinicalHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(chkNoteFollowUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSaveNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmitNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane3)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveNotes)
                    .addComponent(btnSubmitNotes)
                    .addComponent(chkNoteClinicalHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNoteFollowUp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel17.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Previous Notes ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        tblPreviousNotes.setBackground(java.awt.SystemColor.activeCaption);
        tblPreviousNotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Quantity", "Unit Price"
            }
        ));
        tblPreviousNotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPreviousNotesMouseReleased(evt);
            }
        });
        tblPreviousNotes.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblPreviousNotesPropertyChange(evt);
            }
        });
        jScrollPane26.setViewportView(tblPreviousNotes);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Notes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel82.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(102, 0, 0));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel82.setText("From Date :");

        jLabel83.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(102, 0, 0));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel83.setText("To :");

        txtNotesBy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNotesBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotesByActionPerformed(evt);
            }
        });

        jLabel85.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(102, 0, 0));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel85.setText("Notes By :");

        jLabel94.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(102, 0, 0));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel94.setText("Note Type :");

        txtNoteType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNoteType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoteTypeActionPerformed(evt);
            }
        });

        txtNotesFromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotesFromDateActionPerformed(evt);
            }
        });

        txtNotesToDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotesToDateActionPerformed(evt);
            }
        });

        btnSearchNotes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSearchNotes.setText("Search");
        btnSearchNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNotesActionPerformed(evt);
            }
        });

        chkAllNotes.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        chkAllNotes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        chkAllNotes.setForeground(new java.awt.Color(102, 0, 0));
        chkAllNotes.setText("All");
        chkAllNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAllNotesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoteType, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(txtNotesBy, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkAllNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchNotes, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(txtNotesFromDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNotesToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNotesFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNotesToDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNotesBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85)
                    .addComponent(chkAllNotes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(txtNoteType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        jPanel23.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        txtPreviousNotes.setColumns(20);
        txtPreviousNotes.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtPreviousNotes.setLineWrap(true);
        txtPreviousNotes.setRows(5);
        txtPreviousNotes.setWrapStyleWord(true);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtPreviousNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 332, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtPreviousNotes, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel21.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel21.setForeground(new java.awt.Color(255, 255, 255));

        btnDiagnosticReports.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDiagnosticReports.setText("Diagnostic Reports");
        btnDiagnosticReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosticReportsActionPerformed(evt);
            }
        });
        btnDiagnosticReports.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnDiagnosticReportsKeyReleased(evt);
            }
        });

        btnDischarge.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDischarge.setText("Discharge Certificate");
        btnDischarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDischargeActionPerformed(evt);
            }
        });

        cboDiagnosisForms.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cboDiagnosisForms.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select","Vital Signs", "Fluid Record","Fluid Search","Manage Shortcuts","MDT Review"}));
        cboDiagnosisForms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDiagnosisFormsActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 0, 0));
        btnExit.setText("Exit");
        btnExit.setMaximumSize(new java.awt.Dimension(53, 30));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(btnDiagnosticReports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDischarge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboDiagnosisForms, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cboDiagnosisForms)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDischarge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDiagnosticReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Discharge Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Reason:");

        txtDischargeReason.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDischargeReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDischargeReasonActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Remarks:");

        txtDischargeRemarks.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDischargeReason)
                    .addComponent(txtDischargeRemarks))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDischargeReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDischargeRemarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlPatientDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPatientDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed
    DisplayLOV lov = new DisplayLOV();

    private void txtAttenDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAttenDoctorActionPerformed

        String query
                = "  SELECT USER_NAME ID, NAME DESCRIPTION FROM   \n"
                + Database.DCMS.users + "                         \n"
                + " WHERE UPPER(NAME) LIKE '%" + txtAttenDoctor.getText().toUpperCase().trim() + "%'\n"
                //+ " AND USERS.DESIGNATION_ID = '" + Designations.doctor + "'\n"
                + " AND ACTIVE = 'Y'";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        attendingPhysisanId = Constants.lovID;
        txtAttenDoctor.setText(Constants.lovDescription);
        wardId = "";
        patientId = "";
        searchAdmittedPatient(status);
    }//GEN-LAST:event_txtAttenDoctorActionPerformed

    private void tblAdmittedPatientMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdmittedPatientMouseReleased

   //     jTabOrderEntry.setSelectedIndex(0);
        if (tblAdmittedPatient.getSelectedRow() < 0 || listPatientAdmission.isEmpty()) {
            return;
        }
        currentSelectedPatient = tblAdmittedPatient.getSelectedRow();
        setAdmittedPatientData();
        searchMedication();
        clearPharmacy();
        txtPreviousNotes.setText("");
        currentNote = new PatientNotes();
        currentNote.setPatientId(patientId);
        currentNote.setNotesBy(Constants.userId);
        currentNote.setOrderLocationId(Constants.orderLocationId);
        listPatientNotesStatus = ctlInPatientDiagnosis.selectPatientNotesStatus(currentNote, "N");
        if (!listPatientNotesStatus.isEmpty()) {
            currentNote = listPatientNotesStatus.get(0);
            txtNotes.setText(currentNote.getNotes());
        } else {
            txtNotes.setText("");
        }

        selectPatientNotes();
    //    jTabOrderEntry.setSelectedIndex(0);

    }//GEN-LAST:event_tblAdmittedPatientMouseReleased
    private Vector orders = new Vector();


    private void tblAdmittedPatientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAdmittedPatientKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAdmittedPatientKeyReleased

    private void txtPatientIdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdSearchActionPerformed

        if (GUIUtils.completePatientId(txtPatientIdSearch.getText().trim())) {
            patientId = (Constants.completePatientId);
            Patient patCancel = ctlPatient.searchPatient(patientId);
            txtPatientId.setText(patCancel.getPatientId());
            txtPatientName.setText(patCancel.getFullName() + "-" + patCancel.getAge() + "-"
                    + patCancel.getGenderDescription());
            txtPatientIdSearch.setText(patCancel.getPatientId().substring(3));
            txtPatientDetails.setText(patCancel.getFullName());
        }
        attendingPhysisanId = "";
        wardId = "";
        searchAdmittedPatient(status);
    }//GEN-LAST:event_txtPatientIdSearchActionPerformed

    private void txtPatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientDetailsActionPerformed

    private void txtWardIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWardIdActionPerformed

        String query = " SELECT ID , DESCRIPTION    FROM                   \n"
                + Database.DCMS.ward + "                                   \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtWardId.getText().toUpperCase().trim() + "%'"
                + " AND ACTIVE = 'Y'";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        wardId = Constants.lovID;
        txtWardId.setText(Constants.lovDescription);

        patientId = "";
        attendingPhysisanId = "";
        searchAdmittedPatient(status);
    }//GEN-LAST:event_txtWardIdActionPerformed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txReferringPhysicanDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txReferringPhysicanDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txReferringPhysicanDisplayActionPerformed

    private void txtWardIdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWardIdMouseReleased


    }//GEN-LAST:event_txtWardIdMouseReleased

    private void btnSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchMouseReleased

    private void btnSearchCreate_User(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCreate_User

        if (txtPatientIdSearch.getText().isEmpty()) {
            patientId = "";
            txtPatientDetails.setText("");
        }
        searchAdmittedPatient(Status.admitted);
    }//GEN-LAST:event_btnSearchCreate_User


    private void txtAdmissionDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmissionDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmissionDateActionPerformed

    private void txtAdmissionIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmissionIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmissionIdActionPerformed

    private void tblAdmittedPatientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdmittedPatientMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAdmittedPatientMousePressed

    private void ckbAllSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbAllSearchActionPerformed

        if (ckbAllSearch.isSelected()) {
            patientId = "";
            wardId = "";
            attendingPhysisanId = "";
            searchAdmittedPatient(status);
        }
    }//GEN-LAST:event_ckbAllSearchActionPerformed

    private void tblAdmittedPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdmittedPatientMouseClicked

        if (tblAdmittedPatient.getSelectedRow() < 0 || listPatientAdmission.isEmpty()) {
            return;
        }
        if (evt.getClickCount() == 2) {
            PrintJasperReport print = new PrintJasperReport();
            BO.Reports report = print.getReportPath(Reports.Hospital.inpatientBill);
            if (report.getReportPath() == null || report.getReportPath().length() == 0) {
                return;
            }
            HashMap hm = new HashMap();
            hm.put("admissionNo", selectedPatient.getAdmissionNo());
            hm.put("patientId", selectedPatient.getPatientId());
            hm.put("user", Constants.userId);
            hm.put("reportTitle", "Admitted Patient Bill");
            hm.put("userLocationId", Constants.userLocationId);
            hm.put("SUBREPORT_DIR", report.getReportPath());
            print.printReport(report.getReportPath() + report.getReportName(),
                    Constants.outReportPath + "54.pdf", Constants.viewPrint, hm);
        }
    }//GEN-LAST:event_tblAdmittedPatientMouseClicked

    private void tblPreviousNotesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPreviousNotesMouseReleased

        if (listPatientNotes.isEmpty() || tblPreviousNotes.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Kidnly select Note First");
        }
        PatientNotes pat = new PatientNotes();
        pat = listPatientNotes.get(tblPreviousNotes.getSelectedRow());
        String replaceAll = pat.getNotes().replaceAll("''", "'");
        txtPreviousNotes.setText(replaceAll);
    }//GEN-LAST:event_tblPreviousNotesMouseReleased

    private void tblPreviousNotesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblPreviousNotesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPreviousNotesPropertyChange

    private void btnSubmitNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitNotesActionPerformed

        if (txtNotes.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Notes !");
            return;
        }

        if (!chkNoteFollowUp.isSelected()
                && !chkNoteClinicalHistory.isSelected()) {
            JOptionPane.showMessageDialog(null, "Kindly Select Note Type");
            return;
        }

        currentNote.setNoteTypeId(TypeDetailId.noteFUP);
        if (chkNoteClinicalHistory.isSelected()) {
            currentNote.setNoteTypeId(TypeDetailId.noteClinicalHistory);
        }
        currentNote.setPatientId(patientId);
        currentNote.setNotesBy(Constants.userId);
        currentNote.setOrderLocationId(Constants.orderLocationId);
        currentNote.setNotes(txtNotes.getText().trim().replaceAll("'", "''"));

        currentNote.setIsFinal("Y");
        currentNote.setCrtdBy(Constants.userId);

        if (txtNotes.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Notes !");
            return;
        }

        final UserAuthentication dialog = new UserAuthentication(new javax.swing.JFrame(),
                true, Constants.userId, Constants.userFullName, true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowClosing(java.awt.event.WindowEvent e) {
                dialog.dispose();
            }
        });
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);

        if (Constants.userAuthentcated) {
            currentNote.setNoteFinalBy(Constants.userAuthentcatedId);
            if (ctlInPatientDiagnosis.insertPatientNotes(currentNote)) {
                txtNotes.setText("");
                selectPatientNotes();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Save Note, Kindly Contact Administrator");
            }
        }
    }//GEN-LAST:event_btnSubmitNotesActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveNotesActionPerformed

        if (txtNotes.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Notes !");
            txtNotes.requestFocus();
            return;
        }
        if (!chkNoteFollowUp.isSelected()
                && !chkNoteClinicalHistory.isSelected()) {
            JOptionPane.showMessageDialog(null, "Kindly Select Note Type");
            return;
        }
        noteTypeId = TypeDetailId.noteFUP;

        if (chkNoteClinicalHistory.isSelected()) {
            noteTypeId = TypeDetailId.noteClinicalHistory;
        }

        currentNote.setPatientId(patientId);
        currentNote.setNotes(txtNotes.getText().replaceAll("'", "''"));
        currentNote.setOrderLocationId(Constants.orderLocationId);
        currentNote.setNoteTypeId(noteTypeId);
        currentNote.setNoteFinalBy(Constants.userId);
        currentNote.setIsFinal("N");
        currentNote.setCrtdBy(Constants.userId);
        if (ctlInPatientDiagnosis.insertPatientNotes(currentNote)) {
            txtNotes.setBackground(new Color(225, 225, 225));
            txtNotes.requestFocusInWindow();
        } else {
            JOptionPane.showMessageDialog(null, "Unable To Save Record ! Kindly Contact Administrator");
        }
    }//GEN-LAST:event_btnSaveNotesActionPerformed

    private void cboDiagnosisFormsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDiagnosisFormsActionPerformed

        if (tblAdmittedPatient.getSelectedRow() < 0 || listPatientAdmission.isEmpty()) {
            return;
        }

//        if (cboDiagnosisForms.getSelectedIndex() == 1) {
//            //vital signs
//
//            PatientVital patVital = new PatientVital(selectedPatient);
//            //value set krni hai
//            Constants.completePatientId = patientId;
//            this.getDesktopPane().add(patVital);
//            Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
//            Dimension fmSize = patVital.getSize();
//            patVital.setLocation((desktopSize.width - fmSize.width) / 2,
//                    (desktopSize.height - fmSize.height) / 2);
//            patVital.setVisible(true);
//        }
//        if (cboDiagnosisForms.getSelectedIndex() == 2) {
//            //FLUID RECORD
//            frmFluidBalanceRecord fluidRecord = new frmFluidBalanceRecord();
//            this.getDesktopPane().add(fluidRecord);
//            Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
//            Dimension fmSize = fluidRecord.getSize();
//            fluidRecord.setLocation((desktopSize.width - fmSize.width) / 2,
//                    (desktopSize.height - fmSize.height) / 2);
//            fluidRecord.setVisible(true);
//        }
//        if (cboDiagnosisForms.getSelectedIndex() == 3) {
//            //FLUID SEARCH
//            frmFluidBalanceSearch fluidSearch = new frmFluidBalanceSearch();
//            this.getDesktopPane().add(fluidSearch);
//            Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
//            Dimension fmSize = fluidSearch.getSize();
//            fluidSearch.setLocation((desktopSize.width - fmSize.width) / 2,
//                    (desktopSize.height - fmSize.height) / 2);
//            fluidSearch.setVisible(true);
//        }
//        if (cboDiagnosisForms.getSelectedIndex() == 4) {
//            //MANAGE SHORTCUT
//            frmDefineTemplate shortcut = new frmDefineTemplate();
//            this.getDesktopPane().add(shortcut);
//            Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
//            Dimension fmSize = shortcut.getSize();
//            shortcut.setLocation((desktopSize.width - fmSize.width) / 2,
//                    (desktopSize.height - fmSize.height) / 2);
//            shortcut.setVisible(true);
//        }
//
//        if (cboDiagnosisForms.getSelectedIndex() == 5) {
//            frmAppointment fm = new frmAppointment(TypeDetailId.MDTClinicType,
//                    Constants.completePatientId);
//            DCMS_MDI.desktopPane.add(fm);
//            Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
//            Dimension fmSize = fm.getSize();
//            fm.setLocation((desktopSize.width - fmSize.width) / 2,
//                    (desktopSize.height - fmSize.height) / 2);
//            fm.setVisible(true);
//        }

    }//GEN-LAST:event_cboDiagnosisFormsActionPerformed


    private void btnDischargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDischargeActionPerformed
//
//        if (tblAdmittedPatient.getSelectedRow() < 0 || listPatientAdmission.isEmpty()) {
//            return;
//        }
//        if (btnDischarge.getText().equalsIgnoreCase(dischargeCertificate)) {
//            frmPatientDischarge fm = new frmPatientDischarge(selectedPatient, this);
//            DCMS_MDI.desktopPane.add(fm);
//            Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
//            Dimension fmSize = fm.getSize();
//            fm.setLocation((desktopSize.width - fmSize.width) / 2,
//                    (desktopSize.height - fmSize.height) / 2);
//            fm.setVisible(true);
//        } else if (btnDischarge.getText().equalsIgnoreCase(deathCertificate)) {
//            DeathCertificateForm fm = new DeathCertificateForm(selectedPatient, this);
//            DCMS_MDI.desktopPane.add(fm);
//            Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
//            Dimension fmSize = fm.getSize();
//            fm.setLocation((desktopSize.width - fmSize.width) / 2,
//                    (desktopSize.height - fmSize.height) / 2);
//            fm.setVisible(true);
//        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnDischargeActionPerformed

    private void txtWardNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWardNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWardNameActionPerformed

    private void txtBedNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBedNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBedNameActionPerformed

    private void btnDiagnosticReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosticReportsActionPerformed
        // TODO add your handling code here:

        if (tblAdmittedPatient.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Case For Approval");
            return;
        }
        PatientReportStatus fm = new PatientReportStatus(selectedPatient.getPatientId(),
                selectedPatient.getFullName(),
                selectedPatient.getAge() + " \\ " + selectedPatient.getGenderDescription());
        DCMS_MDI.desktopPane.add(fm);
        Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
        Dimension fmSize = fm.getSize();
        fm.setLocation((desktopSize.width - fmSize.width) / 2,
                (desktopSize.height - fmSize.height) / 2);
        fm.setVisible(true);


    }//GEN-LAST:event_btnDiagnosticReportsActionPerformed

    private void btnDiagnosticReportsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDiagnosticReportsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDiagnosticReportsKeyReleased

    private void txtDischargeReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDischargeReasonActionPerformed

        String query
                = "SELECT ID, DESCRIPTION FROM      "
                + Database.DCMS.definitionTypeDetail + " USR                \n"
                + " WHERE DEF_TYPE_ID = '" + DefinitionTypes.dischargeStatus + "'\n"
                + " AND ACTIVE = 'Y'\n"
                + " ORDER BY ID";
        lov.LOVCaseSensitiveSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            dischargeTypeId = "";
        } else {
            dischargeTypeId = Constants.lovID;
            txtDischargeReason.setText(Constants.lovDescription);
        }
        txtDischargeRemarks.requestFocus();

        // TODO add your handling code here:
    }//GEN-LAST:event_txtDischargeReasonActionPerformed

    private void txtOrderStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderStatusActionPerformed

    private void txtNotesByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotesByActionPerformed

        String query = "SELECT USR.USER_NAME    ID,          \n"
                + "  USR.NAME                   DESCRIPTION  \n"
                + " FROM                                     \n"
                + Database.DCMS.users + "        USR         \n"
                + " WHERE UPPER(USR.USER_NAME) LIKE '%" + txtNotesBy.getText() + "%'\n"
                + " AND USER_NAME IN (SELECT FINAL_BY FROM " + Database.DCMS.patientNotes + ""
                + " WHERE PATIENT_ID = '" + patientId + "' \n"
                + " AND IS_FINAL = 'Y')                  \n";

        lov.LOVCaseSensitiveSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            notesBy = "";
        } else {
            notesBy = Constants.lovID;
            txtNotesBy.setText(Constants.lovDescription.toUpperCase());
        }
    }//GEN-LAST:event_txtNotesByActionPerformed

    private void txtNoteTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoteTypeActionPerformed

        String query = "SELECT NTI.ID    ID,                 \n"
                + "NTI.DESCRIPTION || ' (' || NTI.ADDITIONAL_INFO || ')'  DESCRIPTION \n"
                + "FROM                                      \n"
                + Database.DCMS.definitionTypeDetail + " NTI \n"
                + "WHERE UPPER(NTI.DESCRIPTION) LIKE '%" + txtNoteType.getText() + "%' \n"
                + " AND NTI.DEF_TYPE_ID = " + DefinitionTypes.noteTypeId + "\n";

        lov.LOVCaseSensitiveSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            noteTypeId = "";
            txtNoteType.setText("");
        } else {
            noteTypeId = Constants.lovID;
            txtNoteType.setText(Constants.lovDescription.toUpperCase());
        }
    }//GEN-LAST:event_txtNoteTypeActionPerformed

    private void txtNotesFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotesFromDateActionPerformed

        if (txtNotesFromDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the From Date 22-DEC-1990",
                    "Search Indent Note Request", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        fromDate = dateFormat.format(txtNotesFromDate.getDate());
    }//GEN-LAST:event_txtNotesFromDateActionPerformed

    private void txtNotesToDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotesToDateActionPerformed

        if (txtNotesToDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the From Date 22-DEC-1990",
                    "Search Indent Note Request", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        toDate = dateFormat.format(txtNotesToDate.getDate());
    }//GEN-LAST:event_txtNotesToDateActionPerformed

    private void btnSearchNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNotesActionPerformed

        selectPatientNotes();
    }//GEN-LAST:event_btnSearchNotesActionPerformed

    private void chkAllNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAllNotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAllNotesActionPerformed

    private void chkNoteClinicalHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNoteClinicalHistoryActionPerformed
        // TODO add your handling code here:

        if (chkNoteClinicalHistory.isSelected()) {
            noteTypeId = TypeDetailId.noteClinicalHistory;
            chkNoteFollowUp.setSelected(false);

        }//
    }//GEN-LAST:event_chkNoteClinicalHistoryActionPerformed

    private void chkNoteFollowUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNoteFollowUpActionPerformed

        if (chkNoteFollowUp.isSelected()) {
            noteTypeId = TypeDetailId.noteFUP;
            chkNoteClinicalHistory.setSelected(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_chkNoteFollowUpActionPerformed

    private void cboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboStatusActionPerformed
         
        patientId = "";
        if (cboStatus.getSelectedIndex() == 0) {
             statusId = Status.admitted;
             searchAdmittedPatient(statusId); 
             
        } else if (cboStatus.getSelectedIndex() == 1) {
            statusId = Status.dischargeRequest;
            searchAdmittedPatient(statusId);
        }
        else if (cboStatus.getSelectedIndex() == 2){
            statusId = Status.financiallyDischarge;
            searchAdmittedPatient(statusId);
    }
        else{
            searchAdmittedPatient(Status.admitted);
        }
    }//GEN-LAST:event_cboStatusActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiagnosticReports;
    private javax.swing.JButton btnDischarge;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSaveNotes;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchNotes;
    private javax.swing.JButton btnSubmitNotes;
    private javax.swing.JComboBox cboDiagnosisForms;
    private javax.swing.JComboBox cboStatus;
    private javax.swing.JCheckBox chkAllNotes;
    private javax.swing.JCheckBox chkNoteClinicalHistory;
    private javax.swing.JCheckBox chkNoteFollowUp;
    private javax.swing.JCheckBox ckbAllSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel pnlPatientDetail;
    private javax.swing.JTable tblAdmittedPatient;
    private javax.swing.JTable tblPreviousNotes;
    private javax.swing.JTextField txReferringPhysicanDisplay;
    private javax.swing.JTextField txtAdmissionDate;
    private javax.swing.JTextField txtAdmissionId;
    private javax.swing.JTextField txtAttenDoctor;
    private javax.swing.JTextField txtBedName;
    private javax.swing.JTextField txtDischargeReason;
    private javax.swing.JTextField txtDischargeRemarks;
    private javax.swing.JTextField txtNoteType;
    private javax.swing.JTextArea txtNotes;
    private javax.swing.JTextField txtNotesBy;
    private org.jdesktop.swingx.JXDatePicker txtNotesFromDate;
    private org.jdesktop.swingx.JXDatePicker txtNotesToDate;
    private javax.swing.JTextField txtOrderStatus;
    private javax.swing.JTextField txtPatientDetails;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientIdSearch;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextArea txtPreviousNotes;
    private javax.swing.JTextField txtWardId;
    private javax.swing.JTextField txtWardName;
    // End of variables declaration//GEN-END:variables
 //new declaration
    String notesTypeId = "";
    String searchNotesTypeId = "";
    String notesById = "";
    List<PatientNotes> listPatientNotes = new ArrayList();
    List<PatientNotes> listPatientNotesStatus = new ArrayList();
    PatientNotesController ctlInPatientDiagnosis = new PatientNotesController();
    public ReportingTemplateController ctlTemplate = new ReportingTemplateController();
    PatientAdmissionController ctlAdmission = new PatientAdmissionController();
    private String dischargeTypeId = "";
//Decleration of Lists
    String patientId = "";

    String wardId = "";
    String searchTable = Database.DCMS.patientAdmission;
    String status = Status.admitted + "," + Status.dischargeRequest + ","
            + Status.hold + "," + Status.transferOutOfHsopital + "," + Status.financiallyDischarge
            + "," + Status.selfFinance;
    public String performingContractId = utilities.TypeDetailId.contractGeneral;
    String clientId = "";
    String statusId = "";
    String customerId = "";
    String attendingPhysisanId = "";
    String itemDescription = "";
    String genericId = "";
    String itemType = "";
    String salePrice = "";
    String orderQuantity = "";
    String orderStatus = "";
    String orderDetailId = "";
    String referringDoctorId = "";
    String sampleStatusId = "";
    String orderLocationId = "";
    String prescriptionPath = "";
    public String storeId = Stores.IPDPharmacy;// = TypeDetailId.storePharmacy;
    public String transactionType = "";
    private String itemId = "";
    String orderBy = "";
    List listPatientItemRefundDetails = new ArrayList();
    List listPatientCPTRefundDetails = new ArrayList();
    List listPatientAllRefunds = new ArrayList();
    List listPatientAllOrders = new ArrayList();
    InvoiceController ctlInvoice = new InvoiceController();
    List listPatientWiseItems = new ArrayList();
    List listPatientWiseCPTs = new ArrayList();

    int totalRefund;
    int grandPayable;
    int totalAmount;
    int totalPayable;
    int totalRecieved;

    int currentOMRecord = 0;
    //int currentSelectedRecord =0;
    int previousSelectedOrder = 0;
    public int checkStatus = 4;
    int totalOrderAmount = 0;
    int quantityPerDay = 0;
    int duration = 0;
    int selectedIndex = 0;

    InPatientBillController ctlInPatientBill = new InPatientBillController();
    PatientController ctlPatient = new PatientController();
//    ClientController ctlClient = new ClientController();
    OrderMedicineController ctlMedicineOrder = new OrderMedicineController();
    BillingLedgerController ctlLedger = new BillingLedgerController();
    OrderController ctlOrder = new OrderController();
    OPDController ctlOPD = new OPDController();
    public OrderHandler hdlOrder = new OrderHandler();

    public static Vector vecUsers = new Vector();
    List<PatientAdmission> listPatientAdmission = new ArrayList();
    List<PatientAdmission> listPatientAdmissionHistory = new ArrayList();
    List lstCustomerOrder = new ArrayList();
    List lstOrderMaster = new ArrayList();
    List lstPatientMedication = new ArrayList();
    public Vector vecOrderDetail = new Vector();

    OPDConsultancy opd = new OPDConsultancy();
    PatientAdmission selectedPatient = new PatientAdmission();
    MedicineOrderEntry selectedPharmacyOrder = new MedicineOrderEntry();

    private String fromDate = "";
    private String toDate = "";
    private String notesBy = "";
    private String noteTypeId = TypeDetailId.noteFUP;

    private void searchAdmittedPatient(String status) {

        if (txtAttenDoctor.getText().isEmpty()) {
            attendingPhysisanId = "";
        }
        if (txtWardId.getText().isEmpty()) {
            wardId = "";
        }

        listPatientAdmission = ctlInPatientBill.selectAdmittedPatient(status, patientId, attendingPhysisanId, wardId);
        if (listPatientAdmission.isEmpty()) {
            PatientAdmission cp = new PatientAdmission();
            List li = new ArrayList();
            li.add(cp);
            tblAdmittedPatient.setModel(new AdmittedPatientTableModel(li));
            //code in following function            
            clearPatientDetailFields();
            searchPatientAdmissionHistory();
        } else {
            tblAdmittedPatient.setModel(new AdmittedPatientTableModel(listPatientAdmission));
        }
        ListSelectionModel selectionModel = tblAdmittedPatient.getSelectionModel();
        tblAdmittedPatient.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    //    setAdmittedPatientsColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblAdmittedPatient);
        currentSelectedPatient = 0;
        if (!listPatientAdmission.isEmpty()) {
            setAdmittedPatientData();
        }

    }

    private void searchPatientAdmissionHistory() {

        listPatientAdmissionHistory = ctlInPatientBill.
                selectPatientAdmissionHistory(patientId);
        if (listPatientAdmissionHistory.isEmpty()) {
            PatientAdmission cp = new PatientAdmission();
            List li = new ArrayList();
            li.add(cp);
//            tblPatientPreviousAdmission.setModel(new AdmissionHistoryPatientTableModel(li));
//        } else {
//            tblPatientPreviousAdmission.setModel(new AdmissionHistoryPatientTableModel(listPatientAdmissionHistory));
//        }
//        ListSelectionModel selectionModel = tblPatientPreviousAdmission.getSelectionModel();
//        tblPatientPreviousAdmission.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   //       setCPTResultsColumnsWidths();
//        selectionModel.setSelectionInterval(0, 0);
//        Constants.tablelook.setJTableEnvironment(tblPatientPreviousAdmission);
//    }
//
//    public void setCPTResultsColumnsWidths() {
//        TableColumn column = null;
//        for (int i = 0; i < tblPatientPreviousAdmission.getColumnCount(); i++) {
//            column = tblPatientPreviousAdmission.getColumnModel().getColumn(i);
//            if (i == 0) {
//                column.setPreferredWidth(20);
//            } else if (i == 1) {
//                column.setPreferredWidth(200);
//            } else if (i == 2) {
//                column.setPreferredWidth(100);
//            } else {
//                column.setPreferredWidth(50);
//            }
//        }
//    }

//    public void setAdmittedPatientsColumnsWidths() {
//        TableColumn column = null;
//        for (int i = 0; i < tblAdmittedPatient.getColumnCount(); i++) {
//            column = tblAdmittedPatient.getColumnModel().getColumn(i);
//            if (i == 0) {
//                column.setPreferredWidth(20);
//            } else if (i == 1) {
//                column.setPreferredWidth(120);
//            } else if (i == 2) {
//                column.setPreferredWidth(120);
//            } else if (i == 3) {
//                column.setPreferredWidth(110);
//            }
        }
    }
        
    public void setLocation() {

        String query = "SELECT STR.STORE_ID ID , UPPER(S.DESCRIPTION) DESCRIPTION  \n"
                + "FROM                                            \n"
                + Database.DCMS.storeWiseUser + " STR,             \n"
                + Database.DCMS.store + " S                        \n"
                + " WHERE STR.USER_ID = '" + Constants.userId + "' \n"
                + " AND STR.STORE_ID = S.ID                        \n";

        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            //     txtConsultancyId.setText("");
            storeId = "";
        } else {
            //    txtConsultancyId.setText(Constants.lovDescription.toUpperCase());
            storeId = Constants.lovID;
//            txtItemDescription.requestFocus();
        }
    }

    public void clearForm() {

        OrderData rowCPT = new OrderData();
        Vector single = new Vector();
        single.add(rowCPT);

        Vector<JComponent> vec = new Vector<JComponent>();
        vec.add(txtPatientId);
        vec.add(txtPatientName);
//        vec.add(txtItemOrderTotalAmount);

        GUIUtils.setClear(vec);
        txtPatientId.setCaretPosition(0);
        txtPatientId.requestFocusInWindow();
    }

    public void saveItemOrder() {
        if (tblAdmittedPatient.getSelectedRow() < 0 || patientId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly select Patient");
            return;
        }

        if (lstCustomerOrder.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Add Medicine... \n", "Indent Request", JOptionPane.INFORMATION_MESSAGE);
   //         txtItemDescription.requestFocus();
            return;
        }
        MedicineOrderEntry itemMaster = new MedicineOrderEntry();
        itemMaster.setCustomerName("In Patient - " + "" + patientId + "-" + "" + selectedPatient.getAdmissionNo());
        //for order master patient id as it gets from constants
        patientId = selectedPatient.getPatientId();
        Constants.completePatientId = patientId;
        if (patientId.length() == 0) {
            patientId = "000000001";
        }
        GUIUtils.completePatientId(patientId);
        patientId = Constants.completePatientId;
        itemMaster.setPatientId(patientId);
        itemMaster.setCustomerId(customerId);
        itemMaster.setAdmissionNumber(selectedPatient.getAdmissionNo());
        itemMaster.setConsultancyId(selectedPatient.getAdmissionNo());
        if (ctlMedicineOrder.saveItemOrder(itemMaster, lstCustomerOrder)) {
            vecOrderDetail = new Vector();
            clearOrder();
//            lstOrderMaster = ctlMedicineOrder.searchCustomerOrder(
//                    itemMaster.getCompleteOrderNo(), "", Status.ordered);
            //  setOrderMasterTable();

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Order Kindly "
                    + "Contact Administrator ");
        }
    }

    private void clearOrder() {

        customerId = "";
        patientId = "";
        txtPatientId.setText("");
        txtPatientName.setText("");
   //     txtItemDescription.setText("");
        MedicineOrderEntry pO = new MedicineOrderEntry();
        List list = new ArrayList();
        list.add(pO);

    }

    private void setAdmittedPatientData() {

        selectedPatient = listPatientAdmission.get(currentSelectedPatient);
        //Patient patCancel = ctlPatient.searchPatient(selectedPatient.getPatientId().substring(3));
        txtPatientId.setText(selectedPatient.getPatientId().substring(3));
        txtPatientName.setText(selectedPatient.getFullName() + "-" + selectedPatient.getAge() + "-"
                + selectedPatient.getGenderDescription());
        txReferringPhysicanDisplay.setText(selectedPatient.getReferringPhysicianName());
        txtAdmissionDate.setText(selectedPatient.getAdmissionProposedDate());
        txtAdmissionId.setText(selectedPatient.getAdmissionNo());
        txtWardName.setText(selectedPatient.getWardDescription());
        txtBedName.setText(selectedPatient.getBedDescription());
        txtOrderStatus.setText(selectedPatient.getOrderStatusDescription());
        patientId = selectedPatient.getPatientId();
        Constants.completePatientId = patientId;
        clientId = selectedPatient.getClientId();
        enableDisableActions(true);
    //    btnDischargeRequest.setEnabled(false);
   //     btnMedicalDischarge.setEnabled(false);
        btnDischarge.setEnabled(false);
        if (selectedPatient.getOrderStatusId().equalsIgnoreCase(Status.financiallyDischarge)
                && selectedPatient.getDischargeCertificate().equalsIgnoreCase("Y")) {
    //        btnMedicalDischarge.setEnabled(true);
            enableDisableActions(false);
        }
        if (selectedPatient.getOrderStatusId().equalsIgnoreCase(Status.financiallyDischarge)
                && selectedPatient.getDischargeCertificate().equalsIgnoreCase("N")) {
     //       btnMedicalDischarge.setEnabled(false);
            btnDischarge.setEnabled(true);
            enableDisableActions(false);
            btnDischarge.setText(dischargeCertificate);
            if (selectedPatient.getDischargeTypeId().equalsIgnoreCase(TypeDetailId.patientDeath)) {
                btnDischarge.setText(deathCertificate);
            }
        }
        if (selectedPatient.getOrderStatusId().equalsIgnoreCase(Status.dischargeRequest)) {
            enableDisableActions(false);
        }
        if (selectedPatient.getOrderStatusId().equalsIgnoreCase(Status.admitted)) {
     //       btnDischargeRequest.setEnabled(true);
        }
        if (selectedPatient.getOrderStatusId().equalsIgnoreCase(Status.selfFinance)) {
            //JOptionPane.showMessageDialog(null, "Patient Status is not admitted, "
            //        + "Kindly Contact Blling Department");
      //      btnPharmacyOrder.setEnabled(false);
     //       btnNewServices.setEnabled(true);
        }
        searchPatientAdmissionHistory();
    }

    private void clearPatientDetailFields() {
        txtPatientId.setText("");
        txtPatientName.setText("");
        txReferringPhysicanDisplay.setText("");
        txtAdmissionDate.setText("");
        txtAdmissionId.setText("");

    }

    PatientNotesTableLookAndFeel tblLookAndFeel = new PatientNotesTableLookAndFeel();
    PatientNotes currentNote = new PatientNotes();

    private void selectPatientNotes() {

        currentNote.setPatientId(patientId);
        currentNote.setNoteTypeId(TypeDetailId.noteClinicalHistory);
        currentNote.setNotesBy(Constants.userId);
        currentNote.setIsFinal("N");

        List<PatientNotes> list = ctlInPatientDiagnosis.selectPatientNotes(currentNote);
        if (!list.isEmpty()) {
            currentNote = list.get(0);
            txtNotes.setText(currentNote.getNotes());
        }

        PatientNotes searchNotes = new PatientNotes();
        searchNotes.setPatientId(patientId);
        searchNotes.setIsFinal("Y");

        //SEARCH BY DATE
        if (!fromDate.isEmpty() && !toDate.isEmpty()) {
            searchNotes.setFromDate(fromDate.toUpperCase());
            searchNotes.setToDate(toDate.toUpperCase());
        }
        //SEARCH BY DATE AND NOTES BY
        if (!notesBy.isEmpty()) {
            searchNotes.setNotesBy(notesBy);
        }
        //SEARCH BY NOTES TYPE
        if (!noteTypeId.isEmpty()) {
            searchNotes.setNoteTypeId(noteTypeId);
        }

        listPatientNotes = ctlInPatientDiagnosis.selectPatientNotes(searchNotes);
        if (listPatientNotes.isEmpty()) {
            PatientNotes notes = new PatientNotes();
            List li = new ArrayList();
            li.add(notes);
            tblPreviousNotes.setModel(new PatientNoteSearchModel(li));
        } else {
            tblPreviousNotes.setModel(new PatientNoteSearchModel(listPatientNotes));
        }
        ListSelectionModel selectionModel = tblPreviousNotes.getSelectionModel();
        tblPreviousNotes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        tblLookAndFeel.setJTableEnvironment(tblPreviousNotes, listPatientNotes);
        setPateintNotesColumnsWidths();
        if (!listPatientNotes.isEmpty()) {
            txtPreviousNotes.setText(listPatientNotes.get(0).getNotes().replaceAll("''", "'"));
            fromDate = "";
            toDate = "";
            notesBy = "";
            noteTypeId = "";
        }
    }

    public void setPateintNotesColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblPreviousNotes.getColumnCount(); i++) {
            column = tblPreviousNotes.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(20);
            } else if (i == 1) {
                column.setPreferredWidth(150);
            } else if (i == 2) {
                column.setPreferredWidth(60);
            } else {
                column.setPreferredWidth(50);
            }
        }
    }

    //word shortcut
    private void setTextEditor(JEditorPane editor) {
        editor.getInputMap().put(boldKey, boldAction); //
        editor.getInputMap().put(italicKey, italicAction);
        editor.getInputMap().put(underlineKey, underlineAction);
    }

    private void setTextAreaUndoRedo(JEditorPane textArea) {

        undoManager = new UndoManager();
        Document doc = textArea.getDocument();
        doc.addUndoableEditListener(new UndoableEditListener() {
            //@Override

            public void undoableEditHappened(UndoableEditEvent e) {
                //System.out.println("Add edit");
                undoManager.addEdit(e.getEdit());
            }
        });
        InputMap im = textArea.getInputMap(JComponent.WHEN_FOCUSED);
        ActionMap am = textArea.getActionMap();
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_Z,
                Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()), "Undo");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_Y,
                Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()), "Redo");
        am.put("Undo", new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (undoManager.canUndo()) {
                        undoManager.undo();
                    }
                } catch (CannotUndoException exp) {
                    exp.printStackTrace();
                }
            }
        });
        am.put("Redo", new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (undoManager.canRedo()) {
                        undoManager.redo();
                    }
                } catch (CannotUndoException exp) {
                    exp.printStackTrace();
                }
            }
        });
    }

    private CompletionProvider setWordandShortcuts() {

        DefaultCompletionProvider provider = new DefaultCompletionProvider();
        String[] words = ctlTemplate.selectWords(Constants.userId);
        for (int i = 0; i < words.length; i++) {
            provider.addCompletion(new BasicCompletion(provider, words[i]));
        }
        Vector vec = ctlTemplate.selectShortcuts(Constants.userId);
        for (int i = 0; i < vec.size(); i++) {
            HashMap map = (HashMap) vec.get(i);
            provider.addCompletion(new ShorthandCompletion(provider,
                    map.get("SHORTCUT").toString(),
                    map.get("DESCRIPTION").toString(),
                    map.get("DESCRIPTION").toString()));
        }
        return provider;
    }

    private void clearNote() {
        txtNotes.setText("");
        txtNotesBy.setText("");
        txtPreviousNotes.setText("");
        List<PatientNotes> pat = new ArrayList<>();
        PatientNotes note = new PatientNotes();
        pat.add(note);
        tblPreviousNotes.setModel(new PatientNoteSearchModel(pat));
    }

    private void clearPharmacy() {
  //      txtItemDescription.setText("");
        
        MedicineOrderEntry med = new MedicineOrderEntry();
        List list = new ArrayList();
        list.add(med);

    }

    private void searchMedication() {

        String admissionNo = selectedPatient.getAdmissionNo();
//        if (!ckbItemCurrentAdmission.isSelected()) {
//            admissionNo = "";
//        }
//        lstPatientMedication = ctlInPatientDiagnosis.selectPatientMedications(patientId,
//                orderBy,
//     //           txtItemOrderFromDate.getText().trim(),
//     //           txtItemOrderToDate.getText().trim(),
//                admissionNo,
//                itemId);
        if (lstPatientMedication.isEmpty()) {
            MedicineOrderEntry cp = new MedicineOrderEntry();
            List li = new ArrayList();
            li.add(cp);
    //        tblPharmacyPreviousOrder.setModel(new InPatientMedicationSearchModel(li));
        } else {
     //       tblPharmacyPreviousOrder.setModel(new InPatientMedicationSearchModel(lstPatientMedication));
        }
   //     ListSelectionModel selectionModel = tblPharmacyPreviousOrder.getSelectionModel();
   //     tblPharmacyPreviousOrder.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     //   setPatientItemOrdeColumnsWidths();
    //    selectionModel.setSelectionInterval(0, 0);
   //     Constants.tablelook.setJTableEnvironment(tblPharmacyPreviousOrder);

    }

//    public void setPatientItemOrdeColumnsWidths() {
//        TableColumn column = null;
//        for (int i = 0; i < tblPharmacyPreviousOrder.getColumnCount(); i++) {
//            column = tblPharmacyPreviousOrder.getColumnModel().getColumn(i);
//            if (i == 0) {
//                column.setPreferredWidth(200);
//            } else if (i == 1) {
//                column.setPreferredWidth(50);
//            } else if (i == 2) {
//                column.setPreferredWidth(80);
//            } else if (i == 3) {
//                column.setPreferredWidth(20);
//            } else if (i == 4) {
//                column.setPreferredWidth(20);
//            } else {
//                column.setPreferredWidth(50);
//            }
  //      }
   // }

    private void enableDisableActions(boolean action) {
 //       btnNewServices.setEnabled(action);
  //      btnPharmacyOrder.setEnabled(action);
//
        //btnNewServices.setEnabled(true);
    }

}
