package Form.general;

import BO.Setup.OpdInformationBO;
import Controller.OpdInfoController;
import TableModel.OpdDataPatInfoTableModel;
import TableModel.OpdDataVisitDetailTableModel;
import TableModel.OpdDataVisitInfoTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;

public class OpdAndItemSearchform extends javax.swing.JInternalFrame {
    private String patientId = "001000012546";
    String ovn = "";

    public OpdAndItemSearchform() {

        initComponents();
        this.setSize(Constants.xSize + 80, Constants.ySize + 8);

    }
    
    OpdInfoController opdInfoCtl = new OpdInfoController();
    
    List<OpdInformationBO> listPatInfo = new ArrayList();
    List<OpdInformationBO> listVisitInfo = new ArrayList();
    List<OpdInformationBO> listVisitDetail = new ArrayList();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnlPatientDetail = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatienttInformation = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPlNo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDob = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        txtRelation = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVisitInfo = new javax.swing.JTable();
        pnlPatientDetail1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtClinicalInfo = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblItemDetails = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        btnMerge = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Old OPD Data Form");
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

        pnlPatientDetail.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlPatientDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opd Consultancy Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlPatientDetail.setForeground(java.awt.SystemColor.activeCaption);

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dependents", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        tblPatienttInformation.setBackground(java.awt.SystemColor.activeCaption);
        tblPatienttInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Item Name", "Duration", "Quantity/Day", "Total Quantity", "Intake Type"
            }
        ));
        tblPatienttInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatienttInformationMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPatienttInformationMouseReleased(evt);
            }
        });
        tblPatienttInformation.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblPatienttInformationPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatienttInformation);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("PL No :");

        txtPlNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPlNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlNoActionPerformed(evt);
            }
        });
        txtPlNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPlNoKeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("DOB :");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtDob.setEditable(false);
        txtDob.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDobActionPerformed(evt);
            }
        });
        txtDob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDobKeyPressed(evt);
            }
        });

        txtGender.setEditable(false);
        txtGender.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("   Factory Name :");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtClientName.setEditable(false);
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

        txtRelation.setEditable(false);
        txtRelation.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtRelation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRelationActionPerformed(evt);
            }
        });

        txtPatientId.setEditable(false);
        txtPatientId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClientName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtPlNo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPatientId))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGender, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRelation, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txtPatientName))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(txtDob)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRelation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dependent Visits", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        tblVisitInfo.setBackground(java.awt.SystemColor.activeCaption);
        tblVisitInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Item Name", "Duration", "Quantity/Day", "Total Quantity", "Intake Type"
            }
        ));
        tblVisitInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVisitInfoMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblVisitInfoMouseReleased(evt);
            }
        });
        tblVisitInfo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblVisitInfoPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(tblVisitInfo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlPatientDetailLayout = new javax.swing.GroupLayout(pnlPatientDetail);
        pnlPatientDetail.setLayout(pnlPatientDetailLayout);
        pnlPatientDetailLayout.setHorizontalGroup(
            pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientDetailLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        pnlPatientDetailLayout.setVerticalGroup(
            pnlPatientDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientDetailLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlPatientDetail1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlPatientDetail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opd And Item Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlPatientDetail1.setForeground(java.awt.SystemColor.activeCaption);

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clinical Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        txtClinicalInfo.setColumns(20);
        txtClinicalInfo.setRows(5);
        jScrollPane3.setViewportView(txtClinicalInfo);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        tblItemDetails.setBackground(java.awt.SystemColor.activeCaption);
        tblItemDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Item Name", "Duration", "Quantity/Day", "Total Quantity", "Intake Type"
            }
        ));
        tblItemDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemDetailsMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblItemDetailsMouseReleased(evt);
            }
        });
        tblItemDetails.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblItemDetailsPropertyChange(evt);
            }
        });
        jScrollPane4.setViewportView(tblItemDetails);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Merge Patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        btnMerge.setText("Merge");
        btnMerge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMergeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Select Patient :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMerge, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMerge)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnlPatientDetail1Layout = new javax.swing.GroupLayout(pnlPatientDetail1);
        pnlPatientDetail1.setLayout(pnlPatientDetail1Layout);
        pnlPatientDetail1Layout.setHorizontalGroup(
            pnlPatientDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientDetail1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlPatientDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        pnlPatientDetail1Layout.setVerticalGroup(
            pnlPatientDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientDetail1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pnlPatientDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnlPatientDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPatientDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPatientDetail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPatienttInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatienttInformationMouseClicked

    }//GEN-LAST:event_tblPatienttInformationMouseClicked

    private void tblPatienttInformationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatienttInformationMouseReleased

        OpdInformationBO patInfo = listPatInfo.get(tblPatienttInformation.getSelectedRow());
        listVisitInfo = opdInfoCtl.searchPatientVisits(patInfo.getPatientId());
        setDataInVisitTableModel();
        clearMedicineForSet();
        setDataInTextBoxes(tblPatienttInformation.getSelectedRow());
    }//GEN-LAST:event_tblPatienttInformationMouseReleased

    private void tblPatienttInformationPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblPatienttInformationPropertyChange

    }//GEN-LAST:event_tblPatienttInformationPropertyChange

    private void txtPlNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlNoActionPerformed

        listPatInfo = 
        opdInfoCtl.searchEmployeeData(txtPlNo.getText().trim());
        setDataInPatInfoTableModel();
        setDataInTextBoxes(0);
    }//GEN-LAST:event_txtPlNoActionPerformed

    private void txtPlNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlNoKeyPressed

    private void txtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDobActionPerformed

    private void txtDobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDobKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDobKeyPressed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtClientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNameActionPerformed

    private void txtClientNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClientNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNameKeyPressed

    private void tblVisitInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVisitInfoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblVisitInfoMouseClicked

    private void tblVisitInfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVisitInfoMouseReleased
        // TODO add your handling code here:
        OpdInformationBO patInfo = listVisitInfo.get(tblVisitInfo.getSelectedRow());
        txtClinicalInfo.setText(patInfo.getVisitNotes().trim());
        listVisitDetail = opdInfoCtl.searchVisitMedicine(patInfo.getVisitNo());
        setDataInVisitDetail();
    }//GEN-LAST:event_tblVisitInfoMouseReleased

    private void tblVisitInfoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblVisitInfoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblVisitInfoPropertyChange

    private void tblItemDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemDetailsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemDetailsMouseClicked

    private void tblItemDetailsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemDetailsMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemDetailsMouseReleased

    private void tblItemDetailsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblItemDetailsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItemDetailsPropertyChange

    private void txtRelationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRelationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRelationActionPerformed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void btnMergeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMergeActionPerformed
        // TODO add your handling code here:
        listVisitDetail.clear();
        if (!listVisitInfo.isEmpty()) {
            for (int i = 0; i < listVisitInfo.size(); i++) {
                OpdInformationBO noteInfo = listVisitInfo.get(i);
                ovn += "\n" + noteInfo.getPhysicianName().trim() + ":\n" 
                            + noteInfo.getVisitNotes().trim() + "\n";
                listVisitDetail = opdInfoCtl.searchVisitMedicine(noteInfo.getVisitNo());
                if (!listVisitDetail.isEmpty()) {
                    for (int j = 0; j < listVisitDetail.size(); j++) {
                        OpdInformationBO noteDetail = listVisitDetail.get(j);
                        ovn += noteDetail.getItemName().trim() + "\n" + 
                               noteDetail.getIntakeDeatail().trim() + "\n" +
                               noteDetail.getDuration()+ "\n";
                    }
                }
            }
        }else{
//            ovn += noteDetail.getIntakeDeatail() + "\n" + noteDetail.getDuration();
        }

        OpdInformationBO inrData =   new OpdInformationBO();
        inrData.setPatientId(patientId);
        System.out.println("Note " + ovn);
        inrData.setVisitNo(ovn);
        if (opdInfoCtl.insertPatientNotess(inrData)) {
            JOptionPane.showMessageDialog(null, "Merge Patient Visit(s) Successfully");

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Merge,Kindly Contact Administrator");
        }
    }//GEN-LAST:event_btnMergeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMerge;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JPanel pnlPatientDetail;
    private javax.swing.JPanel pnlPatientDetail1;
    private javax.swing.JTable tblItemDetails;
    private javax.swing.JTable tblPatienttInformation;
    private javax.swing.JTable tblVisitInfo;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextArea txtClinicalInfo;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPlNo;
    private javax.swing.JTextField txtRelation;
    // End of variables declaration//GEN-END:variables

    private void setPatInfoColumnsWidths() {
    
        TableColumn column = null;
        for (int i = 0; i < tblPatienttInformation.getColumnCount(); i++) {
            column = tblPatienttInformation.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(70);
            } else if (i == 2) {
                column.setPreferredWidth(200);
            } else if (i == 3) {
                column.setPreferredWidth(10);
            }

        }
    }

    private void setDataInPatInfoTableModel() {
    
        tblPatienttInformation.setModel(new OpdDataPatInfoTableModel(listPatInfo));
        ListSelectionModel selectionModel = tblPatienttInformation.getSelectionModel();
        tblPatienttInformation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setPatInfoColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblPatienttInformation);
    }

    private void setDataInVisitTableModel() {
    
        tblVisitInfo.setModel(new OpdDataVisitInfoTableModel(listVisitInfo));
        ListSelectionModel selectionModel = tblVisitInfo.getSelectionModel();
        tblVisitInfo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setVisitInfoColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblVisitInfo);
    }

    private void setVisitInfoColumnsWidths() {
    
        TableColumn column = null;
        for (int i = 0; i < tblVisitInfo.getColumnCount(); i++) {
            column = tblVisitInfo.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            } else if (i == 2) {
                column.setPreferredWidth(200);
            } else if (i == 3) {
                column.setPreferredWidth(60);
            }

        }
    }

    private void setDataInVisitDetail() {
    
        tblItemDetails.setModel(new OpdDataVisitDetailTableModel(listVisitDetail));
        ListSelectionModel selectionModel = tblItemDetails.getSelectionModel();
        tblItemDetails.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setVisitDetailColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblItemDetails);
    }

    private void setVisitDetailColumnsWidths() {
    
        TableColumn column = null;
        for (int i = 0; i < tblItemDetails.getColumnCount(); i++) {
            column = tblItemDetails.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            } else if (i == 3) {
                column.setPreferredWidth(10);
            }

        }
    }

    private void clearMedicineForSet() {
    
        listVisitDetail.clear();
        tblItemDetails.setModel(new OpdDataVisitDetailTableModel(listVisitDetail));
        txtClinicalInfo.setText("");
    }

    private void setDataInTextBoxes(int index) {
    
        OpdInformationBO patInfo = listPatInfo.get(index);
        txtClientName.setText(patInfo.getFactoryName());
        txtPlNo.setText(patInfo.getPlNumber());
        txtPatientName.setText(patInfo.getFullName());
        txtPatientId.setText(patInfo.getPatientId());
        txtDob.setText(patInfo.getDob());
        txtGender.setText(patInfo.getGender());
        txtRelation.setText(patInfo.getRelation());
    }

}
