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

public class PatientAddendumNote extends javax.swing.JInternalFrame {

    private int currentSelectedPatient = 0;
    //text editor
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

    public PatientAddendumNote() {
        initComponents();
          selectPatientAddendumNotes();
//        this.setSize(Constants.xSize + 50, Constants.ySize + 20);
//        txtPatientId.setEditable(false);
//        txtPatientName.setEditable(false);
//        txReferringPhysicanDisplay.setEditable(false);
//        txtAdmissionDate.setEditable(false);
////      txtCPTTotalAmount.setEditable(false);
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
//
//        txtPreviousNotes.setEditable(false);
//        customerId = "";
//        SpellChecker.setUserDictionaryProvider(new FileUserDictionary());
//        try {
//            SpellChecker.registerDictionaries(Constants.dictionary.toURL(), null);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        SpellChecker.register(txtNotes);
//
//        //
//        txtNotes.putClientProperty(JEditorPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
//        txtNotes.setFont(new java.awt.Font("Arial", Font.PLAIN, 14));
//        searchAdmittedPatient(Status.admitted);
    }
   
      private void selectPatientAddendumNotes() {
        listPatientNotes = ctlInPatientDiagnosis.selectPatientAddendumNotes(currentNote);

        
         PatientNotes notes = new PatientNotes();
        if (!listPatientNotes.isEmpty()) {
            notes = listPatientNotes.get(0);
        }
        txtAddendum.setText(notes.getAddendum().trim());
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtPhysicianName = new javax.swing.JTextField();
        txtAdmissionId = new javax.swing.JTextField();
        txtWardName = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        tblPreviousNotes = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtAddendum = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btnUnverifyNote = new javax.swing.JButton();
        btnSaveAddendum = new javax.swing.JButton();
        btnFinalSignAddendum = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnAdmUnverify = new javax.swing.JButton();
        btnDeleteNote = new javax.swing.JButton();
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
        jLabel15 = new javax.swing.JLabel();
        txtPatientIdSearch = new javax.swing.JTextField();
        txtPatientDetails = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
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

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Primary Phy:");

        txtPhysicianName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPhysicianName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhysicianNameActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdmissionId, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(txtPatientId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWardName)
                            .addComponent(txtPatientName)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhysicianName)))
                .addGap(0, 0, 0))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addComponent(txtPatientId)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtWardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmissionId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPhysicianName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel17.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Previous Notes ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPreviousNotesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblPreviousNotesMouseEntered(evt);
            }
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
            .addComponent(jScrollPane26)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );

        jPanel22.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Notes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        txtNotes.setColumns(20);
        txtNotes.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtNotes.setLineWrap(true);
        txtNotes.setRows(5);
        txtNotes.setWrapStyleWord(true);
        txtNotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtNotesMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(txtNotes);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        );

        jPanel29.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Addendum Notes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        txtAddendum.setColumns(20);
        txtAddendum.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtAddendum.setLineWrap(true);
        txtAddendum.setRows(5);
        txtAddendum.setWrapStyleWord(true);
        jScrollPane12.setViewportView(txtAddendum);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12)
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnUnverifyNote.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUnverifyNote.setForeground(new java.awt.Color(0, 153, 0));
        btnUnverifyNote.setText("Unverify Note");
        btnUnverifyNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnverifyNoteActionPerformed(evt);
            }
        });

        btnSaveAddendum.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSaveAddendum.setText("Save Addendum");
        btnSaveAddendum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAddendumActionPerformed(evt);
            }
        });

        btnFinalSignAddendum.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnFinalSignAddendum.setForeground(new java.awt.Color(0, 153, 0));
        btnFinalSignAddendum.setText("Final Sign Addendum");
        btnFinalSignAddendum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalSignAddendumActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(102, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnAdmUnverify.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdmUnverify.setForeground(new java.awt.Color(0, 153, 0));
        btnAdmUnverify.setText("Admin Unverify");
        btnAdmUnverify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmUnverifyActionPerformed(evt);
            }
        });

        btnDeleteNote.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDeleteNote.setForeground(new java.awt.Color(0, 153, 0));
        btnDeleteNote.setText("Delete Note");
        btnDeleteNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNoteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdmUnverify, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnDeleteNote)
                .addGap(18, 18, 18)
                .addComponent(btnUnverifyNote, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnSaveAddendum)
                .addGap(18, 18, 18)
                .addComponent(btnFinalSignAddendum, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSaveAddendum)
                        .addComponent(btnFinalSignAddendum)
                        .addComponent(btnExit)
                        .addComponent(btnUnverifyNote))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdmUnverify)
                        .addComponent(btnDeleteNote))))
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

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Patient Id:");

        txtPatientIdSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatientIdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdSearchActionPerformed(evt);
            }
        });

        txtPatientDetails.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoteType)
                            .addComponent(txtNotesBy, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkAllNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(txtNotesFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNotesToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(txtPatientIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPatientDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(4, 4, 4))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtPatientDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed
    DisplayLOV lov = new DisplayLOV();
    private Vector orders = new Vector();


    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed


    private void txtPhysicianNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhysicianNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhysicianNameActionPerformed

    private void tblPreviousNotesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPreviousNotesMouseReleased
        
        if (listPatientNotes.isEmpty() || tblPreviousNotes.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Kidnly select Note First");
        }
        PatientNotes pat = new PatientNotes();
        pat = listPatientNotes.get(tblPreviousNotes.getSelectedRow());
        String replaceAll = pat.getNotes().replaceAll("''", "'");
        txtAddendum.setText(replaceAll);
       
       
    }//GEN-LAST:event_tblPreviousNotesMouseReleased

    private void tblPreviousNotesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblPreviousNotesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPreviousNotesPropertyChange


    private void txtWardNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWardNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWardNameActionPerformed

    private void btnUnverifyNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnverifyNoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUnverifyNoteActionPerformed

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

//        selectPatientNotes();
    }//GEN-LAST:event_btnSearchNotesActionPerformed

    private void chkAllNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAllNotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAllNotesActionPerformed

    private void txtAdmissionIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmissionIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmissionIdActionPerformed

    private void txtPatientIdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdSearchActionPerformed
      
        if (GUIUtils.completePatientId(txtPatientIdSearch.getText().trim())) {
            patientId = (Constants.completePatientId);
            Patient patCancel = ctlPatient.searchPatient(patientId);
            txtPatientId.setText(patCancel.getPatientId());
            txtPatientName.setText(patCancel.getFullName() + "-" + patCancel.getAge() + "-"
                    + patCancel.getGenderDescription());
            txtPatientIdSearch.setText(patCancel.getPatientId());
            txtPatientDetails.setText(patCancel.getFullName());
        }
        attendingPhysisanId = "";
        wardId = "";
      selectPatientNotes();
    }//GEN-LAST:event_txtPatientIdSearchActionPerformed

//    private void searchAdmittedPatient(String status) {
//
//        if (txtAttenDoctor.getText().isEmpty()) {
//            attendingPhysisanId = "";
//        }
//        if (txtWardId.getText().isEmpty()) {
//            wardId = "";
//        }
//
//        listPatientAdmission = ctlInPatientBill.selectAdmittedPatient(status, patientId, attendingPhysisanId, wardId);
//        if (listPatientAdmission.isEmpty()) {
//            PatientAdmission cp = new PatientAdmission();
//            List li = new ArrayList();
//            li.add(cp);
//            tblPreviousNotes.setModel(new AdmittedPatientTableModel(li));
//            //code in following function            
//            clearPatientDetailFields();
//            searchPatientAdmissionHistory();
//        } else {
//            tblPreviousNotes.setModel(new AdmittedPatientTableModel(listPatientAdmission));
//        }
//        ListSelectionModel selectionModel = tblPreviousNotes.getSelectionModel();
//        tblPreviousNotes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        setPreviousNotesColumnsWidths();
//        selectionModel.setSelectionInterval(0, 0);
//        Constants.tablelook.setJTableEnvironment(tblPreviousNotes);
//        currentSelectedPatient = 0;
//        if (!listPatientAdmission.isEmpty()) {
//            setAdmittedPatientData();
//        }
//
//    }
    
     public void setPreviousNotesColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblPreviousNotes.getColumnCount(); i++) {
            column = tblPreviousNotes.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(20);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            } else if (i == 3) {
                column.setPreferredWidth(110);
            }
        }
    }
    
    private void txtPatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientDetailsActionPerformed

    private void btnSaveAddendumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAddendumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveAddendumActionPerformed

    private void btnFinalSignAddendumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalSignAddendumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinalSignAddendumActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAdmUnverifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmUnverifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdmUnverifyActionPerformed

    private void btnDeleteNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteNoteActionPerformed

    private void txtNotesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNotesMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNotesMouseReleased

    private void tblPreviousNotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPreviousNotesMouseClicked
     
        if (tblPreviousNotes.getSelectedRow() < 0 || listPatientNotes.isEmpty()) {
            return;
        }
        if (evt.getClickCount() == 1) {
            
            HashMap hm = new HashMap();
            hm.put("admissionNo", selectedPatient.getAdmissionNo());
            hm.put("patientId", selectedPatient.getPatientId());
            hm.put("user", Constants.userId);
            hm.put("reportTitle", "Admitted Patient Bill");
            hm.put("userLocationId", Constants.userLocationId);
          
        }
    }//GEN-LAST:event_tblPreviousNotesMouseClicked

    private void tblPreviousNotesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPreviousNotesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPreviousNotesMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmUnverify;
    private javax.swing.JButton btnDeleteNote;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFinalSignAddendum;
    private javax.swing.JButton btnSaveAddendum;
    private javax.swing.JButton btnSearchNotes;
    private javax.swing.JButton btnUnverifyNote;
    private javax.swing.JCheckBox chkAllNotes;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblPreviousNotes;
    private javax.swing.JTextArea txtAddendum;
    private javax.swing.JTextField txtAdmissionId;
    private javax.swing.JTextField txtNoteType;
    private javax.swing.JTextArea txtNotes;
    private javax.swing.JTextField txtNotesBy;
    private org.jdesktop.swingx.JXDatePicker txtNotesFromDate;
    private org.jdesktop.swingx.JXDatePicker txtNotesToDate;
    private javax.swing.JTextField txtPatientDetails;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientIdSearch;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPhysicianName;
    private javax.swing.JTextField txtWardName;
    // End of variables declaration//GEN-END:variables
 //new declaration
    String notesTypeId = "";
    String searchNotesTypeId = "";
    String notesById = "";
    String note = "";
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

    
    
    private void clearOrder() {

        customerId = "";
        patientId = "";
        txtPatientId.setText("");
        txtPatientName.setText("");
        MedicineOrderEntry pO = new MedicineOrderEntry();
        List list = new ArrayList();
        list.add(pO);

    }

    private void setPatientNotesData() {

//        selectedPatient = listPatientNotes.get(currentNote);
//        Patient patCancel = ctlPatient.searchPatient(selectedPatient.getPatientId().substring(3));
//        txtPatientId.setText(selectedPatient.getPatientId().substring(3));
//        txtPatientName.setText(selectedPatient.getFullName() + "-" + selectedPatient.getAge() + "-"
//                + selectedPatient.getGenderDescription());
//        txtPhysicianName.setText(selectedPatient.getAdmissionProposedDate());
//        txtAdmissionId.setText(selectedPatient.getAdmissionNo());
//        txtWardName.setText(selectedPatient.getWardDescription());
//        patientId = selectedPatient.getPatientId();
//        Constants.completePatientId = patientId;
//        clientId = selectedPatient.getClientId();
       
         
    }

    private void clearPatientDetailFields() {
        txtPatientId.setText("");
        txtPatientName.setText("");
        //txReferringPhysicanDisplay.setText("");
        txtPhysicianName.setText("");
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
            txtNotes.setText(listPatientNotes.get(0).getNotes().replaceAll("''", "'"));
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
        txtNotes.setText("");
        List<PatientNotes> pat = new ArrayList<>();
        PatientNotes note = new PatientNotes();
        pat.add(note);
        tblPreviousNotes.setModel(new PatientNoteSearchModel(pat));
    }

    private void selectPatientNotes(String patient) {
        
       listPatientNotesStatus = ctlInPatientDiagnosis.selectPatientNotesStatus(currentNote, "N");
        if (listPatientNotesStatus.isEmpty()) {
            PatientAdmission cp = new PatientAdmission();
            List li = new ArrayList();
            li.add(cp);
            tblPreviousNotes.setModel(new AdmittedPatientTableModel(li));
            //code in following function            
            clearPatientDetailFields();
        //    selectPatientNotesStatus();
        } else {
            tblPreviousNotes.setModel(new PatientNoteSearchModel(listPatientNotes));
        }
        ListSelectionModel selectionModel = tblPreviousNotes.getSelectionModel();
        tblPreviousNotes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setPateintNotesColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblPreviousNotes);
        currentSelectedPatient = 0;
        if (!listPatientNotes.isEmpty()) {
            setPatientNotesData();
        }

    }
    
    
    
    
    

}
