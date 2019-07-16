package Form.Hospital;

import BO.Hospital.MedicineOrderEntry;
import BO.Hospital.PatientHospitalVisit;

import TableModel.Hospital.IpdMedPlanDetailTableModel;
import TableModel.Hospital.PatientOrderTableModel;

import TableModel.Hospital.PharmacyOrderTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
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
import utilities.Status;
import utilities.Stores;

public class IPDMedicinePlanOrders extends javax.swing.JInternalFrame {

    int currentOMRecord = 0;
    private String storeId = Stores.IPDPharmacy;
    public String transactionType = "";
    public String patientId = "";
    private String admissionNo = "1810599";
    private String ipdMedPlanMasterId = "";
    PatientHospitalVisit admission = new PatientHospitalVisit();
    //IPDVisitController ctlPatientAdmission = new IPDVisitController();

    public IPDMedicinePlanOrders() {
        Constants.completePatientId = "001001031254";
//        admission = ctlIpdMed.selectAdmissionInformation(Constants.completePatientId);
        init();
        displayPatientInformation();
        PatientActiveItems();
        PatientInactiveItems();
    }

    public IPDMedicinePlanOrders(PatientHospitalVisit ipd) {
        init();
        admission = ipd;
        displayPatientInformation();

    }

    public IPDMedicinePlanOrders(String patientId) {
        Constants.completePatientId = patientId;
        init();
    }

    public HashMap hashStore = new HashMap();
    public String[] stores;

    private void init() {

        DisplayLOV.orders = new Vector();

        patientId = Constants.completePatientId;

        if (clientId.isEmpty()) {
            clientId = "1";
        }
        if (admissionNo.isEmpty()) {
            admissionNo = "0";
        }
        initComponents();
//       List<String> list = ctlPatientAdmission.selectUserAttachedStores(hashStore, Constants.userId);
//        stores = new String[list.size() + 1];
//        stores[0] = "Select Store";
//
//        for (int i = 0; i < list.size(); i++) {
//            stores[i + 1] = list.get(i);
//           }

//        cboDispenseStore.setModel(new javax.swing.DefaultComboBoxModel(stores));
        //       cboDispenseStore.setSelectedIndex(0);
        txtItemDescription.requestFocus();
        txtClientName.setText(Constants.locationClientName);
        btnSaveOrder.setMnemonic(KeyEvent.VK_S);
        btnDeleteOrder.setMnemonic(KeyEvent.VK_D);
        btnClear.setMnemonic(KeyEvent.VK_C);
        displayPatientInformation();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPatientDetail = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderInformation = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtItemDescription = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtOrderTotalAmount = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtOrderTotalItem = new javax.swing.JTextField();
        txtDoseTime = new javax.swing.JTextField();
        txtDoseQty = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtQuantityPerDay = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIntakeType = new javax.swing.JTextField();
        txtStore = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
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
        jLabel3 = new javax.swing.JLabel();
        txtSearchOrderDate = new org.jdesktop.swingx.JXDatePicker();
        txtSearchOrderDate1 = new org.jdesktop.swingx.JXDatePicker();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInactiveMedicines = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtRemarks = new javax.swing.JTextField();
        btnResumeOrder = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblActiveMedicines = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        btnOrder = new javax.swing.JButton();
        btnStopPlan = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Pharmacy btnOrder");
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
                "Sr.", "Item Name", "Duration", "Quantity/Day", "Total Quantity", "Intake Type"
            }
        ));
        tblOrderInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderInformationMouseClicked(evt);
            }
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
        jLabel4.setText("Item : ");

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
        jLabel24.setText("Time : ");

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
                .addComponent(txtOrderTotalAmount)
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

        txtDoseTime.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDoseTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoseTimeActionPerformed(evt);
            }
        });

        txtDoseQty.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDoseQty.setToolTipText("Instructions");
        txtDoseQty.setPreferredSize(new java.awt.Dimension(6, 20));
        txtDoseQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoseQtyActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Qty/Day : ");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Remarks : ");

        txtQuantityPerDay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtQuantityPerDay.setPreferredSize(new java.awt.Dimension(6, 25));
        txtQuantityPerDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityPerDayActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Intake: ");

        txtIntakeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntakeTypeActionPerformed(evt);
            }
        });

        txtStore.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtStore.setPreferredSize(new java.awt.Dimension(6, 25));
        txtStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStoreActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Store:  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDoseTime, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantityPerDay, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIntakeType, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtDoseQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtItemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtItemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel12))
                        .addGap(472, 472, 472))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantityPerDay, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIntakeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(437, 437, 437))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStore, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel24)
                            .addComponent(txtDoseTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoseQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
        jLabel7.setText("Consultancy Id : ");

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
        jLabel17.setText("Client Name : ");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPatientDetailLayout.setVerticalGroup(
            pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientDetailLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
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
        pnlPatientDetail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IPD Medicine Orders", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlPatientDetail1.setForeground(java.awt.SystemColor.activeCaption);

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Previous Orders", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("From Date : ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("To Date :");

        txtSearchOrderDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchOrderDateActionPerformed(evt);
            }
        });

        txtSearchOrderDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchOrderDate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchOrderDate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchOrderDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtSearchOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inactive Medicines", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        tblInactiveMedicines.setBackground(java.awt.SystemColor.activeCaption);
        tblInactiveMedicines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Item Description", "Status","End By", "End Date"
            }
        ));
        tblInactiveMedicines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblInactiveMedicinesMouseReleased(evt);
            }
        });
        tblInactiveMedicines.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblInactiveMedicinesPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(tblInactiveMedicines);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Remarks :");

        txtRemarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemarksActionPerformed(evt);
            }
        });

        btnResumeOrder.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnResumeOrder.setText("Resume");
        btnResumeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumeOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRemarks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResumeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRemarks)
                        .addComponent(btnResumeOrder))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prescribed Medicines", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        tblActiveMedicines.setBackground(java.awt.SystemColor.activeCaption);
        tblActiveMedicines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {null, null, null, null},
            new String [] {"Sr.", "Item Name", "Prescribed By", "Prescribed Date"}
        ));
        tblActiveMedicines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblActiveMedicinesMouseReleased(evt);
            }
        });
        tblActiveMedicines.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblActiveMedicinesPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(tblActiveMedicines);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Duration :");

        txtDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurationActionPerformed(evt);
            }
        });

        btnOrder.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnStopPlan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnStopPlan.setForeground(new java.awt.Color(255, 0, 0));
        btnStopPlan.setText("Stop Plan");
        btnStopPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopPlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStopPlan, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDuration)
                    .addComponent(btnOrder)
                    .addComponent(btnStopPlan)))
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
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void tblOrderInformationPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblOrderInformationPropertyChange
    }//GEN-LAST:event_tblOrderInformationPropertyChange

    private void txtItemDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemDescriptionActionPerformed

        String query = "SELECT IT.ID, IT.DESCRIPTION FROM                    \n"
                + Database.DCMS.item + " IT WHERE IT.ACTIVE = 'Y'            \n";

        lov.LOVCaseSensitiveSelection(query, this);

        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            itemId = Constants.lovID;
            itemDescription = Constants.lovDescription;
            txtItemDescription.setText(itemDescription);
            txtIntakeType.requestFocus();
        }

    }//GEN-LAST:event_txtItemDescriptionActionPerformed

    private void tblOrderInformationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderInformationMouseReleased

    }//GEN-LAST:event_tblOrderInformationMouseReleased

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed

    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtPatientIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdKeyPressed


    private void btnDeleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteOrderActionPerformed
        // TODO add your handling code here:
        if (listOrderedItems.isEmpty() || tblOrderInformation.getSelectedRow() < 0) {
            return;
        }
        listOrderedItems.remove(tblOrderInformation.getSelectedRow());
        IpdMedicineQueue();


    }//GEN-LAST:event_btnDeleteOrderActionPerformed

    private void btnSaveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOrderActionPerformed

        if (listOrderedItems.isEmpty() || tblOrderInformation.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "No Item Selected For Order");
            return;
        }

//        if (ctlIpdMed.saveIpdMedMaster(listOrderedItems)) {
//            this.PatientActiveItems();
//            listOrderedItems.clear();
//            IpdMedicineQueue();
//        }
//         if (ctlIpdMed.saveIpdMedPlanDetail(listOrderedItems)) {
//            this.PatientActiveItems();
//            listOrderedItems.clear();
//            IpdMedicineQueue();
//        } else {
//            JOptionPane.showMessageDialog(null, "Unable to Save. kindly Contact administrator");
//        }

    }//GEN-LAST:event_btnSaveOrderActionPerformed

    private void txtConsultancyIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultancyIdActionPerformed

        txtItemDescription.requestFocusInWindow();
        txtItemDescription.setCaretPosition(0);

    }//GEN-LAST:event_txtConsultancyIdActionPerformed

    private void txtConsultancyIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultancyIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultancyIdKeyPressed

    private void btnSaveOrderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveOrderKeyReleased


    }//GEN-LAST:event_btnSaveOrderKeyReleased

    private void tblInactiveMedicinesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInactiveMedicinesMouseReleased

        if (listInactiveItems.isEmpty() || tblInactiveMedicines.getSelectedRow() < 0) {
            return;
        }

        btnResumeOrder.setEnabled(true);

        if (listInactiveItems.get(tblInactiveMedicines.getSelectedRow()).getIsGiven().equalsIgnoreCase("Y")) {
            btnResumeOrder.setEnabled(false);
        }

    }//GEN-LAST:event_tblInactiveMedicinesMouseReleased

    private void tblInactiveMedicinesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblInactiveMedicinesPropertyChange

    }//GEN-LAST:event_tblInactiveMedicinesPropertyChange

    private void txtRemarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemarksActionPerformed

    }//GEN-LAST:event_txtRemarksActionPerformed

    private void txtPrimaryConsultantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimaryConsultantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimaryConsultantActionPerformed

    private void txtPrimaryConsultantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimaryConsultantKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimaryConsultantKeyPressed

    private void txtOrderLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderLocationActionPerformed

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNameActionPerformed

    private void txtClientNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClientNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNameKeyPressed

    private void txtAdmissionNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmissionNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmissionNoActionPerformed

    private void txtAdmissionNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdmissionNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmissionNoKeyPressed

    private void txtDoseTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoseTimeActionPerformed

        lov.LOVDefinitionSelection(DefinitionTypes.doseTime, txtDoseTime.getText(), this);

        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            doseTimeId = Constants.lovID;
            txtDoseTime.setText(Constants.lovDescription);
            txtQuantityPerDay.requestFocus();
        }

    }//GEN-LAST:event_txtDoseTimeActionPerformed

    private void txtDoseQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoseQtyActionPerformed

        lov.LOVDefinitionSelection(DefinitionTypes.doseQuantity, txtDoseQty.getText(), this);

        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            doseQtyId = Constants.lovID;
            txtDoseQty.setText(Constants.lovDescription);
            txtQuantityPerDay.requestFocus();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoseQtyActionPerformed

    private void txtQuantityPerDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityPerDayActionPerformed

        quantityPerDay = 0;

        try {
            quantityPerDay = Integer.parseInt(txtQuantityPerDay.getText().trim());
        } catch (NumberFormatException ex) {
            quantityPerDay = 0;
            JOptionPane.showMessageDialog(null, "Kindly Enter Numeric Value");
            txtQuantityPerDay.setText("");
            txtQuantityPerDay.requestFocus();
            return;

        }

        if (itemId.equalsIgnoreCase("") || itemId == null) {
            JOptionPane.showMessageDialog(null, "Kindly Select Item !");
            return;
        }

        if (intakeTypeId.equalsIgnoreCase("") || intakeTypeId == null) {
            JOptionPane.showMessageDialog(null, "Kindly Select Intake Type !");
            return;
        }

        placeItemOrder();

        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityPerDayActionPerformed

    private void txtSearchOrderDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchOrderDateActionPerformed

    }//GEN-LAST:event_txtSearchOrderDateActionPerformed

    private void tblActiveMedicinesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActiveMedicinesMouseReleased

        if (tblActiveMedicines.getSelectedRow() < 0 || listActiveItems.isEmpty()) {
            return;
        }

        btnOrder.setEnabled(true);

        if (listActiveItems.get(tblActiveMedicines.getSelectedRow()).getOrderStatusId().equalsIgnoreCase(Status.ordered)) {
            btnOrder.setEnabled(false);
        }

    }//GEN-LAST:event_tblActiveMedicinesMouseReleased

    private void tblActiveMedicinesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblActiveMedicinesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblActiveMedicinesPropertyChange

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtOrderTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderTotalAmountActionPerformed

    private void btnClearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnClearKeyReleased

    }//GEN-LAST:event_btnClearKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

    }//GEN-LAST:event_btnClearActionPerformed

    private void tblOrderInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderInformationMouseClicked

        if (listOrderedItems.isEmpty() || tblOrderInformation.getSelectedRow() < 0) {
            return;
        }

        if (evt.getClickCount() % 2 == 0) {
            listOrderedItems.remove(tblOrderInformation.getSelectedRow());
            IpdMedicineQueue();
        }


    }//GEN-LAST:event_tblOrderInformationMouseClicked

    private void txtIntakeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntakeTypeActionPerformed

        lov.LOVDefinitionSelection(DefinitionTypes.inputFluidSource,
                txtIntakeType.getText(), this);

        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            intakeTypeId = Constants.lovID;
            intakeTypeDescription = Constants.lovDescription;
            txtIntakeType.setText(intakeTypeDescription);
            txtDoseTime.requestFocus();
        }

    }//GEN-LAST:event_txtIntakeTypeActionPerformed

    private void btnResumeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumeOrderActionPerformed

        if (listInactiveItems.isEmpty() || tblInactiveMedicines.getSelectedRow() < 0) {
            return;
        }

        ActiveMed = listInactiveItems.get(tblInactiveMedicines.getSelectedRow());

        int confirmation = JOptionPane.showConfirmDialog(null, "Your going to "
                + "RESUME MEDICINE PLAN FOR (" + txtPatientId.getText() + " - "
                + txtPatientName.getText().trim().toUpperCase() + ")");

        if (confirmation != 0) {
            return;
        }

        ActiveMed.setOrderStatusId(Status.ordered);
        ActiveMed.setIsActive("Y");

//        if (ctlIpdMed.ResumeOrder(ActiveMed)) {
//            this.PatientActiveItems();
//            this.PatientInactiveItems();
//        } else {
//            JOptionPane.showMessageDialog(null, "Unable To Update Medicine Plan. Kindly Contact Admnistrator");
//        }

    }//GEN-LAST:event_btnResumeOrderActionPerformed

    private void txtSearchOrderDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchOrderDate1ActionPerformed

    }//GEN-LAST:event_txtSearchOrderDate1ActionPerformed

    private void txtDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurationActionPerformed

    }//GEN-LAST:event_txtDurationActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed

        if (tblActiveMedicines.getSelectedRow() < 0 || listActiveItems.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Item is Selected");
            return;
        }

        if (txtDuration.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Kindly Select Duration");
            return;
        }

        try {
            duration = Integer.parseInt(txtDuration.getText().trim());
        } catch (NumberFormatException ex) {
            duration = 0;
            JOptionPane.showMessageDialog(null, "Kindly Select Valid Duration");
            txtDuration.setText("");
            return;
        }

        ActiveMed = listActiveItems.get(tblActiveMedicines.getSelectedRow());
        totalQty = "" + (duration * Integer.parseInt(ActiveMed.getQuantity()));
        ActiveMed.setTotalQty(totalQty);
        ActiveMed.setDuration("" + duration);

//        if (ctlIpdMed.savOrder(ActiveMed)) {
//            duration = 0;
//            totalQty = "";
//            txtDuration.setText("");
//            PatientActiveItems();
//        } else {
//            JOptionPane.showMessageDialog(null, "Unable to Place Order. Kindly Contact Administrator");
//        }

    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnStopPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopPlanActionPerformed

        if (tblActiveMedicines.getSelectedRow() < 0 || listActiveItems.isEmpty()) {
            return;
        }

        ActiveMed = listActiveItems.get(tblActiveMedicines.getSelectedRow());
        ActiveMed.setOrderStatusId(Status.canceled);
        ActiveMed.setIsActive("N");

//        if (ctlIpdMed.updateMedPlanMaster(ActiveMed)) {
//            this.PatientActiveItems();
//            this.PatientInactiveItems();
//        } else {
//            JOptionPane.showMessageDialog(null, "Unable to Stop. Kindly Contact Administrator");
//        }

    }//GEN-LAST:event_btnStopPlanActionPerformed

    private void txtStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStoreActionPerformed
        String query
                = " SELECT ID, DESCRIPTION FROM "
                + Database.DCMS.store + "   \n"
                + " WHERE UPPER(DESCRIPTION) LIKE UPPER('%"+txtStore.getText().trim().toUpperCase()+"%') "
                + " AND ACTIVE = 'Y'"
                + " ORDER BY DESCRIPTION \n";
     lov.LOVSelection(query, this);
     if(!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")){
     storeId = Constants.lovID;
         System.out.println("asadd " + Constants.lovDescription);
     txtStore.setText(Constants.lovDescription);
     }
    }//GEN-LAST:event_txtStoreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteOrder;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnResumeOrder;
    private javax.swing.JButton btnSaveOrder;
    private javax.swing.JButton btnStopPlan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JTable tblActiveMedicines;
    private javax.swing.JTable tblInactiveMedicines;
    private javax.swing.JTable tblOrderInformation;
    private javax.swing.JTextField txtAdmissionNo;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtConsultancyId;
    private javax.swing.JTextField txtDoseQty;
    private javax.swing.JTextField txtDoseTime;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtIntakeType;
    private javax.swing.JTextField txtItemDescription;
    private javax.swing.JTextField txtOrderLocation;
    private javax.swing.JTextField txtOrderTotalAmount;
    private javax.swing.JTextField txtOrderTotalItem;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPrimaryConsultant;
    private javax.swing.JTextField txtQuantityPerDay;
    private javax.swing.JTextField txtRemarks;
    private org.jdesktop.swingx.JXDatePicker txtSearchOrderDate;
    private org.jdesktop.swingx.JXDatePicker txtSearchOrderDate1;
    private javax.swing.JTextField txtStore;
    // End of variables declaration//GEN-END:variables

    String itemId = "";
    String itemDescription = "";
    String genericId = "";
    String itemType = "";
    String orderStatus = "";
    List<MedicineOrderEntry> listOrderedItems = new ArrayList();
    List<MedicineOrderEntry> listActiveItems = new ArrayList();
    List<MedicineOrderEntry> listInactiveItems = new ArrayList();
    MedicineOrderEntry med = new MedicineOrderEntry();
    MedicineOrderEntry ActiveMed = new MedicineOrderEntry();
    DisplayLOV lov = new DisplayLOV();
//    IPDMedicinePlanController ctlIpdMed = new IPDMedicinePlanController();
    int quantityPerDay = 0;
    int duration = 0;
    String clientId = "131";
    String orderLocationId = "";
    String referringDoctorId = "";
    String doseQtyId = "";
    String doseTimeId = "";
    String totalQty = "";
    String intakeTypeId = "";
    String intakeTypeDescription = "";

    private void IpdMedicineQueue() {

        if (listOrderedItems.isEmpty()) {
            MedicineOrderEntry med = new MedicineOrderEntry();
            List list = new ArrayList();
            list.add(med);
            tblOrderInformation.setModel(new PharmacyOrderTableModel(list));
        } else {
            tblOrderInformation.setModel(new PharmacyOrderTableModel(listOrderedItems));
        }

        ListSelectionModel selectionModel = tblOrderInformation.getSelectionModel();
        tblOrderInformation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setOrderInformationColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblOrderInformation);

    }

    public void setOrderInformationColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblOrderInformation.getColumnCount(); i++) {
            column = tblOrderInformation.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(15);
            } else if (i == 3) {
                column.setPreferredWidth(15);
            } else if (i == 4) {
                column.setPreferredWidth(20);
            } else if (i == 5) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void PatientInactiveItems() {

//        listInactiveItems = ctlIpdMed.selectIPDMedMaster(patientId, admissionNo, "N");
//
//        if (listInactiveItems.isEmpty()) {
//            MedicineOrderEntry med = new MedicineOrderEntry();
//            List list = new ArrayList();
//            list.add(med);
//            tblInactiveMedicines.setModel(new IpdMedPlanDetailTableModel(list));
//        } else {
//            tblInactiveMedicines.setModel(new IpdMedPlanDetailTableModel(listInactiveItems));
//        }
//
//        ListSelectionModel selectionModel = tblInactiveMedicines.getSelectionModel();
//        tblInactiveMedicines.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        setInactiveMedicinesColumnsWidths();
//        selectionModel.setSelectionInterval(0, 0);
//        Constants.tablelook.setJTableEnvironment(tblInactiveMedicines);

    }

    public void setInactiveMedicinesColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblInactiveMedicines.getColumnCount(); i++) {
            column = tblInactiveMedicines.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(150);
            } else if (i == 2) {
                column.setPreferredWidth(60);
            } else if (i == 3) {
                column.setPreferredWidth(100);
            }
        }
    }

    private void PatientActiveItems() {

//        listActiveItems = ctlIpdMed.selectIPDMedMaster(patientId, admissionNo, "Y");
//
//        if (listActiveItems.isEmpty()) {
//            MedicineOrderEntry med = new MedicineOrderEntry();
//            List list = new ArrayList();
//            list.add(med);
//            tblActiveMedicines.setModel(new PatientOrderTableModel(list));
//        } else {
//            tblActiveMedicines.setModel(new PatientOrderTableModel(listActiveItems));
//        }
//
//        ListSelectionModel selectionModel = tblActiveMedicines.getSelectionModel();
//        tblActiveMedicines.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        setActiveItemsColumnsWidths();
//        selectionModel.setSelectionInterval(0, 0);
//        Constants.tablelook.setJTableEnvironment(tblActiveMedicines);

    }

    public void setActiveItemsColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblActiveMedicines.getColumnCount(); i++) {
            column = tblActiveMedicines.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(150);
            } else if (i == 2) {
                column.setPreferredWidth(80);
            } else if (i == 3) {
                column.setPreferredWidth(100);
            } else if (i == 4) {
                column.setPreferredWidth(100);
            }
        }
    }

    public void clearForm() {

        Vector<JComponent> vec = new Vector<JComponent>();
        vec.add(txtPatientId);
        vec.add(txtPatientName);
        vec.add(txtOrderTotalAmount);
        vec.add(txtRemarks);

        GUIUtils.setClear(vec);
        txtPatientId.setCaretPosition(0);
        txtPatientId.requestFocusInWindow();
    }

    private void displayPatientInformation() {

        txtPatientId.setText(patientId);
        txtAdmissionNo.setText(admissionNo);
        txtPatientName.setText(admission.getPatientName());
        txtClientName.setText(admission.getClientName());
        txtOrderLocation.setText(Constants.userLocationName);
        txtConsultancyId.setText("");
    }

    private void placeItemOrder() {

        MedicineOrderEntry mod = new MedicineOrderEntry();

        mod.setPatientId(patientId);
        mod.setAdmissionNumber(admissionNo);
        mod.setItemId(itemId);
        mod.setItemDescription(itemDescription);
        mod.setDuration("");
        mod.setDoseTimeId(doseTimeId);
        mod.setQuantity("" + quantityPerDay);
        mod.setDoseQtyId(doseQtyId);
        mod.setTotalQty("");
//        mod.setOrderStatusId(Status.prescribed);
        mod.setIntakeTypeId(intakeTypeId);
        mod.setIntakeTypeDescription(intakeTypeDescription);

        listOrderedItems.add(mod);

        txtItemDescription.setText("");
        txtDoseTime.setText("");
        txtDoseQty.setText("");
        //txtQuantity.setText("");
        txtQuantityPerDay.setText("");
        txtItemDescription.requestFocus();
        txtIntakeType.setText("");
        itemId = "";
        intakeTypeId = "";
        doseQtyId = "";
        doseTimeId = "";
        quantityPerDay = 0;
        totalQty = "";
        IpdMedicineQueue();
    }
}
