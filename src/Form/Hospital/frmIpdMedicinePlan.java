
package Form.Hospital;

import BO.Hospital.IpdMedicinePlanBO;
import BO.OPD.PatientHospitalVisit;
import Controller.Hospital.IpdMedicinePlanController;
import TableModel.Hospital.IpdDiscontinuePlanTableModel;
import TableModel.Hospital.IpdMedicinePlanTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;

public class frmIpdMedicinePlan extends javax.swing.JInternalFrame {

    public frmIpdMedicinePlan() { // PatientHospitalVisit objVisit
        initComponents();
        this.setSize(Constants.xSize + 60, Constants.ySize - 120);
//        patientDemoGraphy(objVisit);
    }

    DisplayLOV lov = new DisplayLOV();
    IpdMedicinePlanController ctlIpdMedicinePlan = new IpdMedicinePlanController();

    String patientId = "001001212088";
    String admissionNo = "1747418";
    String itemId = "";

    List<String> listItem = new ArrayList();
    List<IpdMedicinePlanBO> listMedicineOrder = new ArrayList();
    List<IpdMedicinePlanBO> listDiscontinueMedicine = new ArrayList();
    IpdMedicinePlanBO objMedicineOrder = new IpdMedicinePlanBO();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblDiscontinueMedicine = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAgeGender = new javax.swing.JTextField();
        txtBed = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtWard = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPrimaryPhy = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        txtAdmissionNumber = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblMedicinePlan = new javax.swing.JTable();
        txtMedicineName = new javax.swing.JTextField();
        txtDose = new javax.swing.JTextField();
        txtInstruction = new javax.swing.JTextField();
        btnExit1 = new javax.swing.JButton();
        cboFormulary = new javax.swing.JComboBox<String>();
        cboSearchGeneric = new javax.swing.JComboBox<String>();
        jPanel4 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnDiscontinue = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

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

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ipd Medicine Plan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        jPanel8.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Discontinue Medicine", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblDiscontinueMedicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "MedicineName", "Dose","Dis.By", "Dis.Date"
            }
        ));
        tblDiscontinueMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiscontinueMedicineMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDiscontinueMedicineMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblDiscontinueMedicineMouseReleased(evt);
            }
        });
        tblDiscontinueMedicine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDiscontinueMedicineKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblDiscontinueMedicine);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(120, 0, 0))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Patient Id : ");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Patient Name : ");

        txtPatientName.setEditable(false);
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Age Gender : ");

        txtAgeGender.setEditable(false);

        txtBed.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Bed : ");

        txtWard.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Ward Name : ");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Admission No : ");

        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Primary Phy. : ");

        txtPrimaryPhy.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Client name : ");

        txtClient.setEditable(false);

        txtAdmissionNumber.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(txtAdmissionNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientName)
                            .addComponent(txtWard))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAgeGender, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(txtBed)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrimaryPhy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientName)
                    .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWard)
                    .addComponent(txtBed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmissionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plan Medicine", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(120, 0, 0))); // NOI18N

        tblMedicinePlan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "MedicineName","Dose", "Order BY", "Order Date"
            }
        ));
        tblMedicinePlan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicinePlanMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblMedicinePlanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblMedicinePlanMouseReleased(evt);
            }
        });
        tblMedicinePlan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblMedicinePlanKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(tblMedicinePlan);

        txtMedicineName.setText("Medicine Name");
        txtMedicineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicineNameActionPerformed(evt);
            }
        });

        txtDose.setText("Dose");

        txtInstruction.setText("Instruction");

        btnExit1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit1.setText("New");
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        cboFormulary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERAL", "FORMULARY" }));

        cboSearchGeneric.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BRAND", "GENERIC"}));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtMedicineName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboSearchGeneric, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboFormulary, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(4, 4, 4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedicineName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSearchGeneric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboFormulary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(153, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDiscontinue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDiscontinue.setText("Discontinue");
        btnDiscontinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscontinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDiscontinue)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(398, 398, 398))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnDiscontinue))
                .addGap(10, 10, 10))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(Constants.footerAllScreens);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblMedicinePlanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicinePlanMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblMedicinePlanMouseClicked

    private void tblMedicinePlanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicinePlanMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedicinePlanMousePressed

    private void tblMedicinePlanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicinePlanMouseReleased
        // TODO add your handling code here:

        if (tblMedicinePlan.getValueAt(tblMedicinePlan.getSelectedRow(), 4).equals(true)) {
            IpdMedicinePlanBO item = listMedicineOrder.get(tblMedicinePlan.getSelectedRow());
            listItem.add(item.getItemId());
        }
        if (tblMedicinePlan.getValueAt(tblMedicinePlan.getSelectedRow(), 4).equals(false)) {
            listItem.remove(tblMedicinePlan.getSelectedRow());
        }
    }//GEN-LAST:event_tblMedicinePlanMouseReleased

    private void tblMedicinePlanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblMedicinePlanKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMedicinePlanKeyReleased

    private void tblDiscontinueMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiscontinueMedicineMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDiscontinueMedicineMouseClicked

    private void tblDiscontinueMedicineMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiscontinueMedicineMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDiscontinueMedicineMousePressed

    private void tblDiscontinueMedicineMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiscontinueMedicineMouseReleased
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {

            IpdMedicinePlanBO discontinueMedicine = listDiscontinueMedicine.get(
                    tblDiscontinueMedicine.getSelectedRow());
            objMedicineOrder.setPatientId(patientId);
            objMedicineOrder.setAdmissionNO(admissionNo);
            objMedicineOrder.setItemId(discontinueMedicine.getItemId());
            objMedicineOrder.setDoseId(discontinueMedicine.getDoseId());
            objMedicineOrder.setInstruction(discontinueMedicine.getInstruction());
            objMedicineOrder.setActive("Y");
            if (ctlIpdMedicinePlan.insertIpdMedicinePlan(objMedicineOrder)) {
                JOptionPane.showMessageDialog(null, "Medicine Continue successfully!");
                selectMedicinePlan();
                selectDiscontinueMedicine();
            } else {
                JOptionPane.showMessageDialog(null, " Unable to continue Medicine."
                        + "\n Kindly Contact Administrator!");
            }
        }
    }//GEN-LAST:event_tblDiscontinueMedicineMouseReleased

    private void tblDiscontinueMedicineKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDiscontinueMedicineKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDiscontinueMedicineKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDiscontinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscontinueActionPerformed
        // TODO add your handling code here: 
//        for (int i = 0; i < listMedicineOrder.size(); i++) {
//            IpdMedicinePlanBO item = listMedicineOrder.get(tblMedicinePlan.getSelectedRow());
//            if (tblMedicinePlan.getValueAt(tblMedicinePlan.getSelectedRow(), 4).equals(true)) {
//                listItem.add(item.getItemId());
//            }
//        }
        objMedicineOrder.setPatientId(patientId);
        objMedicineOrder.setAdmissionNO(admissionNo);
        objMedicineOrder.setDiscontinueBy(Constants.userId);
        objMedicineOrder.setDiscontinueDate(Constants.today);
        objMedicineOrder.setDiscountinueTerminal(Constants.terminalId);
        if (ctlIpdMedicinePlan.updateDiscontinueMedicine(listItem, objMedicineOrder, "N")) {
            JOptionPane.showMessageDialog(null, "Medicine discontinue successfully!");
            selectMedicinePlan();
            selectDiscontinueMedicine();
        } else {
            JOptionPane.showMessageDialog(null, " Unable to discontinue Medicine."
                    + "\n Kindly Contact Administrator!");
        }

    }//GEN-LAST:event_btnDiscontinueActionPerformed

    private void txtMedicineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicineNameActionPerformed
        String query = "SELECT ID, "
                + "ITM.DESCRIPTION  DESCRIPTION FROM \n"
                + Database.DCMS.item + "  ITM                               \n"
                + " WHERE UPPER(ITM.DESCRIPTION) LIKE '%"
                + txtMedicineName.getText().toUpperCase().trim() + "%'             \n"
                + " AND ID NOT IN ( SELECT ITEM_ID FROM "
                + Database.DCMS.ipdMedicinePlan + " "
                + " WHERE PATIENT_ID = '" + patientId + "'"
                + "AND ADMISSION_NO = '" + admissionNo + "')\n"
                + " AND ACTIVE = 'Y'                                        \n"
                + " ORDER BY ITM.DESCRIPTION                                \n";

        System.out.println(query);

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            itemId = "";
            return;
        } else {
            itemId = Constants.lovID;
            txtMedicineName.setText(Constants.lovDescription);
        }
    }//GEN-LAST:event_txtMedicineNameActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        // TODO add your handling code here:
        ctlIpdMedicinePlan.selectIpdMedcinePlan(patientId, admissionNo, "Y");
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
        selectMedicinePlan();
        selectDiscontinueMedicine();
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiscontinue;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JComboBox<String> cboFormulary;
    private javax.swing.JComboBox<String> cboSearchGeneric;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tblDiscontinueMedicine;
    private javax.swing.JTable tblMedicinePlan;
    private javax.swing.JTextField txtAdmissionNumber;
    private javax.swing.JTextField txtAgeGender;
    private javax.swing.JTextField txtBed;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtDose;
    private javax.swing.JTextField txtInstruction;
    private javax.swing.JTextField txtMedicineName;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPrimaryPhy;
    private javax.swing.JTextField txtWard;
    // End of variables declaration//GEN-END:variables

    public void selectMedicinePlan() {
        listMedicineOrder = ctlIpdMedicinePlan.selectIpdMedcinePlan(patientId, admissionNo, "Y");
        tblMedicinePlan.setModel(new IpdMedicinePlanTableModel(listMedicineOrder));
        ListSelectionModel selectionModel = tblMedicinePlan.getSelectionModel();
        tblMedicinePlan.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setMedicinePlanColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblMedicinePlan);
    }

    public void selectDiscontinueMedicine() {
        listDiscontinueMedicine = ctlIpdMedicinePlan.selectIpdMedcinePlan(patientId, admissionNo, "N");
        tblDiscontinueMedicine.setModel(new IpdDiscontinuePlanTableModel(listDiscontinueMedicine));
        ListSelectionModel selectionModel = tblDiscontinueMedicine.getSelectionModel();
        tblDiscontinueMedicine.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setDiscontinueMedicineColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblDiscontinueMedicine);
    }

    public void patientDemoGraphy(PatientHospitalVisit objVisit) {
        this.patientId = objVisit.getPatientId();
        this.admissionNo = objVisit.getAdmissionNumber();
        txtPatientName.setText(objVisit.getPatientName());
        txtAgeGender.setText(objVisit.getAge() +"/" + objVisit.getGender());
        txtPrimaryPhy.setText(objVisit.getPrimaryPhysicianName());
        txtClient.setText(objVisit.getClientName());
        txtWard.setText(objVisit.getWardDescription());
        txtBed.setText(objVisit.getBedDescription());
        
        
    }

    private void setMedicinePlanColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblMedicinePlan.getColumnCount(); i++) {
            column = tblMedicinePlan.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(180);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            } else if (i == 3) {
                column.setPreferredWidth(120);
            }else if (i == 4) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void setDiscontinueMedicineColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblDiscontinueMedicine.getColumnCount(); i++) {
            column = tblDiscontinueMedicine.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(180);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            } else if (i == 3) {
                column.setPreferredWidth(120);
            }

        }
    }
}
