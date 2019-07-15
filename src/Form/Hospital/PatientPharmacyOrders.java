package Form.Hospital;
 
import BO.Hospital.PatientAdmission;
import BO.MedicineOrderEntry;
import BO.OPDConsultancy;
import BO.OrderData;
import BO.Patient;
import Controller.BillingLedgerController;
import Controller.Hospital.PatientNotesController;
import Controller.Hospital.PatientAdmissionController; 
import Controller.InvoiceController;
import Controller.OPDController;
import Controller.OrderController;
import Controller.OrderMedicineController;
import Controller.PatientController;
import Handler.OrderHandler;
import TableModel.Hospital.PharmacyOrderDetailTableModel;
import TableModel.Hospital.PharmacyOrderMasterTableModel;  
 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.GUIUtils;
import utilities.Stores;

public class PatientPharmacyOrders extends javax.swing.JInternalFrame {

    int currentOMRecord = 0;
    private String storeId = Stores.IPDPharmacy;
    public String transactionType = "";
    //new added
    private String admissionNo = "";
    PatientAdmissionController ctlPatientAdmission = new PatientAdmissionController();
    PatientNotesController ctlInPatientDiagnosis = new PatientNotesController();
    OPDConsultancy opd = new OPDConsultancy();

    public PatientPharmacyOrders(OPDConsultancy opd) {

        this.opd = opd;
        Constants.completePatientId = opd.getPatientId();
        init();
        txtPatientId.setText(opd.getPatientId().substring(3));
        txtAdmissionNo.setText(opd.getAdmissionNumber());
        txtPrimaryConsultant.setText(opd.getConsultantName());
        txtClientName.setText(opd.getClientName());
        txtConsultancyId.setText(opd.getConsultancyId());
        cboDispenseStore.setEnabled(true);
    }

    public PatientPharmacyOrders() {
        init();
    }

    public PatientPharmacyOrders(String patientId) {
        Constants.completePatientId = patientId;
        init();
    }

    public HashMap hashStore = new HashMap();
    public String[] stores;

    private void init() {

        DisplayLOV.orders = new Vector();
        patientId = Constants.completePatientId;
        admissionNo = ctlPatientAdmission.selectAdmissionNumber(patientId);
//        clientId = ctlInPatientDiagnosis.selectPatientClient(patientId);
        if (clientId.isEmpty()) {
            clientId = "1";
        }
        if (admissionNo.isEmpty()) {
            admissionNo = "0";
        }
        initComponents();
        List<String> list = ctlPatientAdmission.selectUserAttachedStores(hashStore, Constants.userId);
        stores = new String[list.size() + 1];
        stores[0] = "Select Store";

        for (int i = 0; i < list.size(); i++) {
            stores[i + 1] = list.get(i);
        }
        cboDispenseStore.setModel(new javax.swing.DefaultComboBoxModel(stores));

        txtItemDescription.requestFocus();
        txtClientName.setText(Constants.locationClientName);
       
     

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pnlPatientDetail = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderInformation = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtItemDescription = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtOrderTotalAmount = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtOrderTotalItem = new javax.swing.JTextField();
        cmboItemSearch = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        txtDoseTime = new javax.swing.JTextField();
        txtDoseQty = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtQuantityPerDay = new javax.swing.JTextField();
        cboDispenseStore = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        txtPatientName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtConsultancyId = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPrimaryConsultant = new javax.swing.JTextField();
        txtOrderLocation = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtAdmissionNo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnSaveOrder = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDeleteOrder = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        pnlPatientDetail1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearchOrderBy = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSearchOrderDate = new org.jdesktop.swingx.JXDatePicker();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatientOrderDetail = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtSearchRecentMedicine = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPatientRecentOrders = new javax.swing.JTable();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Pharmacy Order");
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
        pnlPatientDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pharmacy Orders", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlPatientDetail.setForeground(java.awt.SystemColor.activeCaption);

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        tblOrderInformation.setBackground(java.awt.SystemColor.activeCaption);
        tblOrderInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Quantity", "Unit Price"
            }
        ));
        tblOrderInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblOrderInformationMouseReleased(evt);
            }
        });
        tblOrderInformation.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblOrderInformationPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrderInformation);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Item:");

        txtItemDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtItemDescription.setPreferredSize(new java.awt.Dimension(6, 22));
        txtItemDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemDescriptionActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Instructions:");

        txtQuantity.setEditable(false);
        txtQuantity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Total Amount:");

        txtOrderTotalAmount.setEditable(false);
        txtOrderTotalAmount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtOrderTotalAmount.setForeground(new java.awt.Color(102, 0, 0));
        txtOrderTotalAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOrderTotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderTotalAmountActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Total Items:");

        txtOrderTotalItem.setEditable(false);
        txtOrderTotalItem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtOrderTotalItem.setForeground(new java.awt.Color(102, 0, 0));
        txtOrderTotalItem.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOrderTotalItem, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOrderTotalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOrderTotalItem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOrderTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );

        cmboItemSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item", "Generic" }));
        cmboItemSearch.setPreferredSize(new java.awt.Dimension(31, 25));
        cmboItemSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboItemSearchActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Quantity:");

        txtDoseTime.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDoseTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoseTimeActionPerformed(evt);
            }
        });

        txtDoseQty.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDoseQty.setToolTipText("Instructions");
        txtDoseQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoseQtyActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Qty/Day:");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Duration:");

        txtDuration.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurationActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Time:");

        txtQuantityPerDay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtQuantityPerDay.setPreferredSize(new java.awt.Dimension(6, 25));
        txtQuantityPerDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityPerDayActionPerformed(evt);
            }
        });

        cboDispenseStore.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IPD", "LTU", "OT"}));
        cboDispenseStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDispenseStoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtItemDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboDispenseStore, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmboItemSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtQuantityPerDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDoseTime, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDoseQty, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDuration)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(cboDispenseStore)
                    .addComponent(txtItemDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmboItemSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDoseQty, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(txtDoseTime, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtQuantityPerDay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDuration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Patient ID:");

        txtPatientId.setEditable(false);
        txtPatientId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });
        txtPatientId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatientIdKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Consultancy Id:");

        txtConsultancyId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtConsultancyId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultancyIdActionPerformed(evt);
            }
        });
        txtConsultancyId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConsultancyIdKeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Primary Consultant:");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtPrimaryConsultant.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPrimaryConsultant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimaryConsultantActionPerformed(evt);
            }
        });
        txtPrimaryConsultant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrimaryConsultantKeyPressed(evt);
            }
        });

        txtOrderLocation.setEditable(false);
        txtOrderLocation.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtOrderLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderLocationActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Client Name:");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtClientName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtClientName.setMinimumSize(new java.awt.Dimension(6, 25));
        txtClientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNameActionPerformed(evt);
            }
        });
        txtClientName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClientNameKeyPressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Admission No:");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtAdmissionNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtAdmissionNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmissionNoActionPerformed(evt);
            }
        });
        txtAdmissionNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAdmissionNoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtPrimaryConsultant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrderLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtConsultancyId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdmissionNo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPatientName))
                    .addComponent(txtClientName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(txtPatientName))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrimaryConsultant)
                    .addComponent(txtOrderLocation))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConsultancyId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmissionNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout pnlPatientDetailLayout = new javax.swing.GroupLayout(pnlPatientDetail);
        pnlPatientDetail.setLayout(pnlPatientDetailLayout);
        pnlPatientDetailLayout.setHorizontalGroup(
            pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientDetailLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        pnlPatientDetailLayout.setVerticalGroup(
            pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientDetailLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel12.setForeground(new java.awt.Color(255, 255, 255));

        btnSaveOrder.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSaveOrder.setText("Save");
        btnSaveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveOrderActionPerformed(evt);
            }
        });
        btnSaveOrder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnSaveOrderKeyReleased(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        btnClear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnClearKeyReleased(evt);
            }
        });

        btnDeleteOrder.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDeleteOrder.setText("Delete");
        btnDeleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteOrderActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnSaveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSaveOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDeleteOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear)
                        .addComponent(btnExit)))
                .addGap(0, 0, 0))
        );

        pnlPatientDetail1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlPatientDetail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Previous Pharmacy Orders", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlPatientDetail1.setForeground(java.awt.SystemColor.activeCaption);

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Previous Orders", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Order By:");

        txtSearchOrderBy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchOrderBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchOrderByActionPerformed(evt);
            }
        });
        txtSearchOrderBy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchOrderByKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Order Date:");

        txtSearchOrderDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchOrderDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchOrderDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSearchOrderBy, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearchOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        tblPatientOrderDetail.setBackground(java.awt.SystemColor.activeCaption);
        tblPatientOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CPT ID", "CPT DESCRIPTION", "MODALITY", "PRICE"
            }
        ));
        tblPatientOrderDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPatientOrderDetailMouseReleased(evt);
            }
        });
        tblPatientOrderDetail.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblPatientOrderDetailPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(tblPatientOrderDetail);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Medicine Description:");

        txtSearchRecentMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchRecentMedicineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchRecentMedicine)
                .addGap(5, 5, 5))
            .addComponent(jScrollPane2)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchRecentMedicine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Orders ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        tblPatientRecentOrders.setBackground(java.awt.SystemColor.activeCaption);
        tblPatientRecentOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {null, null, null, null},
            new String [] {"Sr.No", "Order No", "Order By", "Order Date"}
        ));
        tblPatientRecentOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPatientRecentOrdersMouseReleased(evt);
            }
        });
        tblPatientRecentOrders.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblPatientRecentOrdersPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(tblPatientRecentOrders);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlPatientDetail1Layout = new javax.swing.GroupLayout(pnlPatientDetail1);
        pnlPatientDetail1.setLayout(pnlPatientDetail1Layout);
        pnlPatientDetail1Layout.setHorizontalGroup(
            pnlPatientDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientDetail1Layout.createSequentialGroup()
                .addGroup(pnlPatientDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPatientDetail1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(pnlPatientDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        pnlPatientDetail1Layout.setVerticalGroup(
            pnlPatientDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientDetail1Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPatientDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlPatientDetail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPatientDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPatientDetail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>                        

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void tblOrderInformationPropertyChange(java.beans.PropertyChangeEvent evt) {                                                   
    }                                                  

    private void txtItemDescriptionActionPerformed(java.awt.event.ActionEvent evt) {                                                   

    
    }                                                  

    private void tblOrderInformationMouseReleased(java.awt.event.MouseEvent evt) {                                                  

        if (listCustomerOrder.isEmpty() || tblOrderInformation.getSelectedRow() < 0) {
            return;
        }
        selectedIndex = tblOrderInformation.getSelectedRow();
        selectedPharmacyOrder = (MedicineOrderEntry) listCustomerOrder.get(selectedIndex);
        itemId = selectedPharmacyOrder.getItemId();

    }                                                 

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {                                            
        placeItemOrder();
    }                                           

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {                                             

        if (GUIUtils.completePatientId(txtPatientId.getText().trim())) {
            patientId = Constants.completePatientId;
            searchPatient(patientId);
            txtItemDescription.requestFocusInWindow();
            txtItemDescription.setCaretPosition(0);
        }

    }                                            

    private void txtPatientIdKeyPressed(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    /**
     * Delete the Order from the @Table ,Order is removed only from the
     * tableModel,
     *
     * @param evt
     */
    private void btnDeleteOrderActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        if (listCustomerOrder.isEmpty() || tblOrderInformation.getSelectedRow() < 0) {
            return;
        }
        MedicineOrderEntry pharmacyOrder = (MedicineOrderEntry) listCustomerOrder.get(selectedIndex);
     

    }                                              

    private void btnSaveOrderActionPerformed(java.awt.event.ActionEvent evt) {                                             

        saveOrder();
    }                                            

    private void cmboItemSearchActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void txtConsultancyIdActionPerformed(java.awt.event.ActionEvent evt) {                                                 

        txtItemDescription.requestFocusInWindow();
        txtItemDescription.setCaretPosition(0);

    }                                                

    private void txtConsultancyIdKeyPressed(java.awt.event.KeyEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btnSaveOrderKeyReleased(java.awt.event.KeyEvent evt) {                                         

        saveOrder();

    }                                        

    private void tblPatientOrderDetailMouseReleased(java.awt.event.MouseEvent evt) {                                                    

        if (DisplayLOV.orders.isEmpty()
                || tblPatientOrderDetail.getSelectedRow() < 0) {
            return;
        }
        OrderData previousOrder = (OrderData) DisplayLOV.orders.get(previousSelectedOrder);

        previousSelectedOrder = tblPatientOrderDetail.getSelectedRow();
        OrderData data = (OrderData) DisplayLOV.orders.get(tblPatientOrderDetail.getSelectedRow());

        if (tblPatientOrderDetail.getSelectedColumn() != checkStatus) {
            return;
        }
        boolean check = (Boolean) tblPatientOrderDetail.getValueAt(tblPatientOrderDetail.getSelectedRow(),
                tblPatientOrderDetail.getSelectedColumn());

        if (check && !data.isStat()) {
            totalOrderAmount -= Integer.parseInt(data.getOriginalPrice());
            totalOrderAmount += Integer.parseInt(data.getStatCost());
            tblPatientOrderDetail.setValueAt("" + data.getStatCost(),
                    tblPatientOrderDetail.getSelectedRow(), (checkStatus - 1));
            data.setPrice(data.getStatCost());
            if (data.getPerformingContractId().equalsIgnoreCase(utilities.TypeDetailId.contractDirectAccess)) {
                data.setPerformingContractId(utilities.TypeDetailId.contractDirectAccessStat);
            }
            if (data.getPerformingContractId().equalsIgnoreCase(utilities.TypeDetailId.contractGeneral)) {
                data.setPerformingContractId(utilities.TypeDetailId.contractGeneralStat);
            }
        } else {
            totalOrderAmount += Integer.parseInt(data.getOriginalPrice());
            totalOrderAmount -= Integer.parseInt(data.getStatCost());
            tblPatientOrderDetail.setValueAt("" + data.getOriginalPrice(),
                    tblPatientOrderDetail.getSelectedRow(), (checkStatus - 1));
            data.setPrice(data.getOriginalPrice());
            if (data.getPerformingContractId().equalsIgnoreCase(utilities.TypeDetailId.contractDirectAccessStat)) {
                data.setPerformingContractId(utilities.TypeDetailId.contractDirectAccess);
            }
            if (data.getPerformingContractId().equalsIgnoreCase(utilities.TypeDetailId.contractGeneralStat)) {
                data.setPerformingContractId(utilities.TypeDetailId.contractGeneral);
            }
        }
        txtOrderTotalAmount.setText("" + totalOrderAmount);

        // TODO add your handling code here:
    }                                                   

    private void tblPatientOrderDetailPropertyChange(java.beans.PropertyChangeEvent evt) {                                                     

    }                                                    

    private void txtSearchRecentMedicineActionPerformed(java.awt.event.ActionEvent evt) {                                                        

        if (txtSearchRecentMedicine.getText().trim().length() != 0) {
///            listSearchOrderDetail = ctlMedicineOrder.selectOrderItem("", patientId,
   //                 txtSearchRecentMedicine.getText().trim().toUpperCase());
            searchPatientRecentOrderDetail(listSearchOrderDetail);
        }
    }                                                       

    private void txtSearchOrderByActionPerformed(java.awt.event.ActionEvent evt) {                                                 

        String query = " SELECT USR.USER_ID ID, USR.NAME DESCRIPTION    \n"
                + " FROM " + Database.DCMS.users + " USR                \n"
                + " WHERE USR.USER_NAME IN (SELECT ORDER_BY FROM "
                + Database.DCMS.orderMaster + " "
                + " WHERE PATIENT_ID = '" + patientId + "') \n";
        lov.LOVSelection(query, this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtSearchOrderBy.setText("");
        } else {
            txtSearchOrderBy.setText(Constants.lovDescription.toUpperCase());
            searchRecentOrdersByUser = Constants.lovID;

            if (txtSearchOrderDate == null) {
                searchRecentOrdersDate = "";
            }
           
            searchPatientRecentOrders(listSearchRecentOrder);
        }

    }                                                

    private void txtSearchOrderByKeyPressed(java.awt.event.KeyEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void txtPrimaryConsultantActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void txtPrimaryConsultantKeyPressed(java.awt.event.KeyEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void txtOrderLocationActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void txtClientNameKeyPressed(java.awt.event.KeyEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void txtAdmissionNoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void txtAdmissionNoKeyPressed(java.awt.event.KeyEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txtDoseTimeActionPerformed(java.awt.event.ActionEvent evt) {                                            

        Constants.lovDescription = "DESCRIPTION";
        Constants.lovID = "ID";
        lov.LOVDefinitionSelection(DefinitionTypes.doseTime, txtDoseTime.getText(), this);
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            txtDoseTime.setText(Constants.lovDescription);
        }
        txtDoseQty.requestFocus();
        // TODO add your handling code here:
    }                                           

    private void txtDoseQtyActionPerformed(java.awt.event.ActionEvent evt) {                                           

        lov.LOVDefinitionSelection(DefinitionTypes.doseQuantity, txtDoseQty.getText(), this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        } else {
            txtDoseQty.setText(Constants.lovDescription);
        }
        txtQuantityPerDay.requestFocus();
        // TODO add your handling code here:
    }                                          

    private void txtQuantityPerDayActionPerformed(java.awt.event.ActionEvent evt) {                                                  

        if (txtQuantityPerDay.getText().trim().length() == 0
                || txtQuantityPerDay.getText().trim().equalsIgnoreCase("0")) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Item quantity Correctly", "Pharamacy Order", JOptionPane.INFORMATION_MESSAGE);
            txtQuantityPerDay.requestFocus();
            return;
        }
        quantityPerDay = 0;

        try {
            quantityPerDay = Integer.parseInt(txtQuantityPerDay.getText().trim());
        } catch (NumberFormatException ex) {
            quantityPerDay = 0;
            JOptionPane.showMessageDialog(null, "Please Enter Number Value ", "Pharamacy Order", JOptionPane.INFORMATION_MESSAGE);
            txtQuantityPerDay.requestFocus();
            txtQuantityPerDay.setText("");
            return;

        }
        txtDuration.requestFocus();

        // TODO add your handling code here:
    }                                                 

    private void txtDurationActionPerformed(java.awt.event.ActionEvent evt) {                                            

        if (txtDuration.getText().trim().length() == 0
                || txtDuration.getText().trim().equalsIgnoreCase("0")) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Item quantity Correctly",
                    "Pharamacy Order", JOptionPane.INFORMATION_MESSAGE);
            txtDuration.requestFocus();
            return;
        }
        duration = 0;
        try {
            duration = Integer.parseInt(txtDuration.getText().trim());
        } catch (NumberFormatException ex) {
            duration = 0;
            JOptionPane.showMessageDialog(null, "Please Enter Number Value ",
                    "Pharamacy Order", JOptionPane.INFORMATION_MESSAGE);
            txtDuration.requestFocus();
            txtDuration.setText("");
            return;

        }
        if (quantityPerDay == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Quantity Per Day",
                    "Pharamacy Order", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        txtQuantity.setText("" + (quantityPerDay * duration));
        placeItemOrder();
    }                                           

    private void cboDispenseStoreActionPerformed(java.awt.event.ActionEvent evt) {                                                 

        storeId = hashStore.get(cboDispenseStore.getSelectedItem().toString()).toString();
        txtItemDescription.requestFocus();
    }                                                

    private void txtSearchOrderDateActionPerformed(java.awt.event.ActionEvent evt) {                                                   

        if (txtSearchOrderDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the From Date 22-DEC-1990",
                    "SEARCH ORDERS", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        searchRecentOrdersDate = dateFormat.format(txtSearchOrderDate.getDate());

        if (searchRecentOrdersByUser.isEmpty() || txtSearchOrderBy.getText().length() == 0) {
            searchRecentOrdersByUser = "";
        }
        
        searchPatientRecentOrders(listSearchRecentOrder);
    }                                                  

    private void tblPatientRecentOrdersMouseReleased(java.awt.event.MouseEvent evt) {                                                     

        if (listSearchRecentOrder.isEmpty() || tblPatientRecentOrders.getSelectedRow() < 0) {
            return;
        }

        currentRecentOrder = listSearchRecentOrder.get(tblPatientRecentOrders.getSelectedRow());
        txtSearchRecentMedicine.setText("");
//        listSearchOrderDetail = ctlMedicineOrder.selectOrderItem(currentRecentOrder.getCompleteOrderNo(),
      //          "", "");
        searchPatientRecentOrderDetail(listSearchOrderDetail);

    }                                                    

    private void tblPatientRecentOrdersPropertyChange(java.beans.PropertyChangeEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        

        this.dispose();
    }                                       

    private void txtOrderTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void btnClearKeyReleased(java.awt.event.KeyEvent evt) {                                     

        if (evt.getKeyChar() == 's') {
            if (evt.isAltDown()) {//Code if Alt+s pressed
                clearOrder();
            }
        }
    }                                    

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         

        listSearchRecentOrder.clear();
        tblPatientRecentOrders.setModel(new PharmacyOrderMasterTableModel(listSearchRecentOrder));
        setPatientRecentOrderDetails();
        listSearchOrderDetail.clear();
        tblPatientOrderDetail.setModel(new PharmacyOrderDetailTableModel(listSearchOrderDetail));
        setPatientRecentOrderDetails();
        searchRecentOrdersByUser = "";
        searchRecentOrdersDate = "";
        txtSearchOrderBy.setText("");
        txtSearchRecentMedicine.setText("");
    }                                        

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteOrder;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSaveOrder;
    private javax.swing.JComboBox cboDispenseStore;
    private javax.swing.JComboBox cmboItemSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlPatientDetail;
    private javax.swing.JPanel pnlPatientDetail1;
    private javax.swing.JTable tblOrderInformation;
    private javax.swing.JTable tblPatientOrderDetail;
    private javax.swing.JTable tblPatientRecentOrders;
    private javax.swing.JTextField txtAdmissionNo;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtConsultancyId;
    private javax.swing.JTextField txtDoseQty;
    private javax.swing.JTextField txtDoseTime;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtItemDescription;
    private javax.swing.JTextField txtOrderLocation;
    private javax.swing.JTextField txtOrderTotalAmount;
    private javax.swing.JTextField txtOrderTotalItem;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPrimaryConsultant;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtQuantityPerDay;
    private javax.swing.JTextField txtSearchOrderBy;
    private org.jdesktop.swingx.JXDatePicker txtSearchOrderDate;
    private javax.swing.JTextField txtSearchRecentMedicine;
    // End of variables declaration                   

    String customerId = "";
    String itemId = "";
    String itemDescription = "";
    String genericId = "";
    String itemType = "";
    String salePrice = "";
    String orderQuantity = "";
    String orderStatus = "";
    String orderDetailId = "";
    int selectedIndex = 0;
    public int totalAmount = 0;
    public int advancePayment = 0;
    int selectedDetailRow = 0;
    List listCustomerOrder = new ArrayList();
    List listOrderMaster = new ArrayList();
    DisplayLOV lov = new DisplayLOV();
    public String packageId = "";
    int quantityPerDay = 0;
    int duration = 0;
    String clientId = "";
    String orderLocationId = "";
    String referringDoctorId = "";
    String sampleStatusId = "";
    String prescriptionPath = "";
    public String currentPatientId = "";
    int totalOrderAmount = 0;
    int previousSelectedOrder = 0;
    ArrayList possible = new ArrayList();
    PatientController ctlPatient = new PatientController();
    public int totalOrderTest = 0;
    public int checkStatus = 4;
    public String performingContractId = utilities.TypeDetailId.contractGeneral;

    OPDController ctlOPD = new OPDController();

    MedicineOrderEntry selectedPharmacyOrder = new MedicineOrderEntry();
    String patientId = "";
    Patient patient = new Patient();
    InvoiceController ctlInvoice = new InvoiceController();
    OrderController ctlOrder = new OrderController();
    OrderData orderMaster = new OrderData();

    
    OrderMedicineController ctlMedicineOrder = new OrderMedicineController();
    BillingLedgerController ctlLedger = new BillingLedgerController();
    public OrderHandler hdlOrder = new OrderHandler();

    private void searchItems() {
        
    }

    public void setCPTMedOrderTableColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblOrderInformation.getColumnCount(); i++) {
            column = tblOrderInformation.getColumnModel().getColumn(i);
            if (i == 1) { // Patient id
                column.setPreferredWidth(300); //Description
            } else if (i == 0) {
                column.setPreferredWidth(60); //Quantity
            } else {
                column.setPreferredWidth(70); //Price
            }//
        }
    }//setTablesColumnsWidths

    private void searchPatient(String currentPatientId) {

        patient = ctlPatient.searchPatient(currentPatientId);
        if (patient.getFullName().length() > 0) {
            txtPatientId.setText(patient.getPatientId().substring(3));
            txtPatientName.setText(patient.getFullName() + " - "
                    + patient.getGenderDescription());
            patientId = patient.getPatientId();
        } else {
            txtPatientId.setText("");
            JOptionPane.showMessageDialog(null, "Patient has not been Registered");
        }
    }

    private void clearOrder() {

        txtItemDescription.setText("");
        txtQuantity.setText("");
        txtOrderTotalItem.setText("");
        txtOrderTotalAmount.setText("");
        customerId = "";
        listCustomerOrder.clear();

        listCustomerOrder.clear();
      
        cboDispenseStore.setEnabled(true);
        txtItemDescription.requestFocus();
        txtItemDescription.setCaretPosition(0);
    }

    public int currentODRecord = 0;
    

    public Vector vecOrderDetail = new Vector();
    DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
    Date date = new Date();

    public void saveOrder() {
        if (customerId.length() == 0) {
            return;
        }
        if (listCustomerOrder.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Add Medicine... \n",
                    "INDENT REQUEST", JOptionPane.INFORMATION_MESSAGE);
            txtItemDescription.requestFocus();
            return;
        }
        MedicineOrderEntry itemMaster = new MedicineOrderEntry();
        if (patientId.length() == 0) {
            patientId = "000000001";
        }
        GUIUtils.completePatientId(patientId);
        patientId = Constants.completePatientId;
        itemMaster.setPatientId(patientId);
        itemMaster.setCustomerId(customerId);
        itemMaster.setStoreId(storeId);
        itemMaster.setCustomerName(Constants.completePatientId + "Inpatient" + admissionNo);
        itemMaster.setAdmissionNumber(admissionNo);
        if (Constants.messageAlert) {
            JOptionPane.showMessageDialog(null, Constants.displayMessage);
        }
        
    }

    public void clearForm() {

        OrderData rowCPT = new OrderData();
        Vector single = new Vector();
        single.add(rowCPT);
      
        Vector<JComponent> vec = new Vector<JComponent>();
        vec.add(txtPatientId);
        vec.add(txtPatientName);
        vec.add(txtOrderTotalAmount);
        vec.add(txtSearchRecentMedicine);

        GUIUtils.setClear(vec);
        txtPatientId.setCaretPosition(0);
        txtPatientId.requestFocusInWindow();
    }

    public boolean verifyOrderData() {

        boolean ret = true;
        if (txtPatientName.getText().length() == 0 && ret) {
            txtPatientId.requestFocusInWindow();
            txtPatientId.setCaretPosition(0);
            ret = false;
        }
        if (this.clientId.length() == 0 && ret) {
            this.clientId = "001";
            //JOptionPane.showMessageDialog(null, "Kindly Select Location");
            //txtClient.requestFocusInWindow();
            //txtClient.setCaretPosition(0);
            //ret = false;
        }
        if (this.orderLocationId.length() == 0 && ret) {
            //JOptionPane.showMessageDialog(null, "Kindly Select Order Location");
            //txtOrderLocation.requestFocusInWindow();
            //txtOrderLocation.setCaretPosition(0);
            //ret = false;
            orderLocationId = Constants.userLocationId;
        }
        if (this.referringDoctorId.length() == 0 && ret) {
            referringDoctorId = "1";
            //JOptionPane.showMessageDialog(null, "Kindly Select Referring Doctor");
            //txtRefConsultant.requestFocusInWindow();
            //txtRefConsultant.setCaretPosition(0);
            //ret = false;
            ret = true;
        }
        if (DisplayLOV.orders.isEmpty() && ret) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Order for Patient");
            txtSearchRecentMedicine.requestFocusInWindow();
            txtSearchRecentMedicine.setCaretPosition(0);
            ret = false;
        }
        return ret;
    }

    Patient patCancel = new Patient();
    PatientAdmissionController ctlAdmission = new PatientAdmissionController();
    PatientAdmission patientAdmissionInfo = new PatientAdmission();

    private void displayPatientInformation() {
        
        patCancel = ctlPatient.searchPatient(patientId);
        patientAdmissionInfo = ctlAdmission.checkAdmissionRequestStatus(patientId);
        txtPatientId.setText(patCancel.getPatientId().substring(3));
        txtAdmissionNo.setText(admissionNo);
        txtPatientName.setText(patCancel.getFullName());
        txtPrimaryConsultant.setText(patientAdmissionInfo.getPrimaryPhysicianName().toUpperCase());
        txtClientName.setText(patCancel.getClientDescription());
        txtOrderLocation.setText(Constants.userLocationName);
        txtConsultancyId.setText("");
    }

    private void setTablesColumnsWidths() {

        TableColumn column = null;
        for (int i = 0; i < tblPatientOrderDetail.getColumnCount(); i++) {
            column = tblPatientOrderDetail.getColumnModel().getColumn(i);
            if (i == 1) {
                column.setPreferredWidth(250); //third column is bigger
            } else {
                column.setPreferredWidth(60);
            }
        }
    }

    private void placeItemOrder() {

        if (customerId.length() == 0) {
            return;
        }
        if (itemId.length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Item First");
            txtQuantity.requestFocus();
            return;
        }
        if (txtQuantity.getText().trim().length() == 0
                || txtQuantity.getText().trim().equalsIgnoreCase("0")) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Item quantity Correctly",
                    "Pharamacy Order", JOptionPane.INFORMATION_MESSAGE);
            txtQuantity.requestFocus();
            return;
        }
        int quantity = 0;
        try {
            quantity = Integer.parseInt(txtQuantity.getText().trim());
        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "Please Enter Number Quantity in Number ",
                    "Pharamacy Order", JOptionPane.INFORMATION_MESSAGE);
            txtQuantity.requestFocus();
            txtQuantity.setText("");
            return;
        }
        if (quantity < 0 || quantity > Integer.parseInt(
                selectedPharmacyOrder.getStockQuantity())) {
            JOptionPane.showMessageDialog(null, "Enter item qty is greater than stock quantity",
                    "Pharamacy Order", JOptionPane.WARNING_MESSAGE);
            txtDuration.requestFocus();
            txtDuration.setText("");
            return;
        }
        orderQuantity = txtQuantity.getText().trim();
        MedicineOrderEntry pharmacyOrder = new MedicineOrderEntry();
        pharmacyOrder.setItemId(itemId);
        pharmacyOrder.setItemDescription(itemDescription);
        pharmacyOrder.setGenericId(genericId);
        pharmacyOrder.setItemType(itemType);
        pharmacyOrder.setQuantity(orderQuantity);
        pharmacyOrder.setDuration("" + duration);
        pharmacyOrder.setCustomerId(customerId);
        pharmacyOrder.setStoreId(storeId);
        //need a check on consultancy Id
        pharmacyOrder.setConsultancyId(customerId);
        pharmacyOrder.setSalePrice(salePrice);
        pharmacyOrder.setDoseTimeDescription(txtDoseTime.getText());
        pharmacyOrder.setDoseQtyDescription(txtDoseQty.getText());
        pharmacyOrder.setItemOrderType(Constants.medicineOrderType);
 
    }

    //NEW CODE FOR ODER MASTER TABLE
    OrderData currentRecentOrder = new OrderData();
    List<OrderData> listSearchRecentOrder = new ArrayList<>();
    List<OrderData> listSearchOrderDetail = new ArrayList<>();
    private String searchRecentOrdersDate = "";
    private String searchRecentOrdersByUser = "";

    private void searchPatientRecentOrders(List<OrderData> listOrders) {

        if (listOrders.isEmpty()) {
            JOptionPane.showMessageDialog(null, "(" + patientId + ") has no Recent Orders.",
                    "RESULT NOT FOUND", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        tblPatientRecentOrders.setModel(new PharmacyOrderMasterTableModel(listOrders));
        ListSelectionModel selectionModel = tblPatientRecentOrders.getSelectionModel();
        tblPatientRecentOrders.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setPatientRecentOrders();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblPatientRecentOrders);
    }

    public void setPatientRecentOrders() {
        TableColumn column = null;
        for (int i = 0; i < tblPatientRecentOrders.getColumnCount(); i++) {
            column = tblPatientRecentOrders.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(15); //Description
            } else if (i == 1) {
                column.setPreferredWidth(60); //Quantity
            } else if (i == 2) {
                column.setPreferredWidth(120); //Price
            } else if (i == 3) {
                column.setPreferredWidth(80); //Price
            }
        }
    }

    private void searchPatientRecentOrderDetail(List<OrderData> listOrders) {

        if (listOrders.isEmpty()) {
            JOptionPane.showMessageDialog(null, "(" + patientId + ") has no Recent Orders.",
                    "RESULT NOT FOUND", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        tblPatientOrderDetail.setModel(new PharmacyOrderDetailTableModel(listOrders));
        ListSelectionModel selectionModel = tblPatientOrderDetail.getSelectionModel();
        tblPatientOrderDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        setPatientRecentOrderDetails();
        Constants.tablelook.setJTableEnvironment(tblPatientOrderDetail);
    }

    public void setPatientRecentOrderDetails() {
        TableColumn column = null;
        for (int i = 0; i < tblPatientOrderDetail.getColumnCount(); i++) {
            column = tblPatientOrderDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10); //Description
            } else if (i == 1) {
                column.setPreferredWidth(140); //Quantity
            } else if (i == 2) {
                column.setPreferredWidth(30); //Price
            } else if (i == 3) {
                column.setPreferredWidth(30); //Price
            } else if (i == 4) {
                column.setPreferredWidth(50); //Price
            } else if (i == 5) {
                column.setPreferredWidth(80); //Price
            }
        }
    }
}
