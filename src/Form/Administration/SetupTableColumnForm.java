package Form.Administration;

import BO.Administration.SetupTableColumnBO;
import Controller.Administration.SetupTableColumnController;
import TableModel.Administration.SetupPropertyTableModel;
import TableModel.Administration.SetupTableColumnTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;

public class SetupTableColumnForm extends javax.swing.JInternalFrame {

    private String propertyId = "";
    private String propertyDescription = "";
    private String propertyTypeId = "";
    private String setupId;

    public SetupTableColumnForm() {

        initComponents();
        this.setSize(Constants.xSize - 140, Constants.ySize - Constants.yExtension + 30);
        btnSave.setMnemonic(KeyEvent.VK_S);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);

//        searchSetupTableColumn();
    }
    SetupTableColumnBO objBO = new SetupTableColumnBO();
    List<SetupTableColumnBO> listSetupTableColumn = new ArrayList();
    List<SetupTableColumnBO> listProperty = new ArrayList();
    private DisplayLOV lov = new DisplayLOV();
    SetupTableColumnController ctlSetupTableColumn = new SetupTableColumnController();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblProperties = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearchProperty = new javax.swing.JTextField();
        cboProperty = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        lblProperty = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblProperty = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtPropertyName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        cboActive = new javax.swing.JComboBox<>();
        btnSaveProperty = new javax.swing.JButton();
        btnUpdateProperty = new javax.swing.JButton();
        cboPropType = new javax.swing.JComboBox<>();
        btnSearchProperty = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Setup Table Column");
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
                .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Setup Table Column", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Properties", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblProperties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Sr.No","Id", "Property", "Value"
            }
        ));
        tblProperties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPropertiesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPropertiesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPropertiesMouseReleased(evt);
            }
        });
        tblProperties.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPropertiesKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(tblProperties);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Property", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Property : ");

        txtSearchProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPropertyActionPerformed(evt);
            }
        });

        cboProperty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "CPT Property", "User Property", "Location Property", "Organization Property" }));
        cboProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPropertyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtSearchProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSearchProperty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboProperty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Property Remarks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        lblProperty.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblProperty.setForeground(new java.awt.Color(102, 0, 0));
        lblProperty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtRemarks.setColumns(20);
        txtRemarks.setLineWrap(true);
        txtRemarks.setRows(5);
        txtRemarks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRemarksMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(txtRemarks);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProperty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane10))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(lblProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Property", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblProperty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Sr.No","Id", "Property", "Value"
            }
        ));
        tblProperty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPropertyMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPropertyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPropertyMouseReleased(evt);
            }
        });
        tblProperty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPropertyKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblProperty);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name : ");

        txtPropertyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPropertyNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Description : ");

        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        cboActive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Y", "N"}));
        cboActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboActiveActionPerformed(evt);
            }
        });

        btnSaveProperty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSaveProperty.setText("Save");
        btnSaveProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePropertyActionPerformed(evt);
            }
        });

        btnUpdateProperty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateProperty.setText("Update");
        btnUpdateProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePropertyActionPerformed(evt);
            }
        });

        cboPropType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Organization", "Users" }));
        cboPropType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPropTypeActionPerformed(evt);
            }
        });

        btnSearchProperty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearchProperty.setText("Search");
        btnSearchProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPropertyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtDescription)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboActive, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtPropertyName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboPropType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnSearchProperty)
                .addGap(18, 18, 18)
                .addComponent(btnSaveProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPropertyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboPropType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveProperty)
                    .addComponent(btnUpdateProperty)
                    .addComponent(btnSearchProperty))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 436, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(51, 102, 0));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnExit)
                    .addComponent(btnClear))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPropertyActionPerformed
        // TODO add your handling code here:
        txtSearchProperty.setText("");
        propertyId = "";
        if (cboProperty.getSelectedIndex() == 1) {
            propertyTypeId = "718";
        }
        if (cboProperty.getSelectedIndex() == 2) {
            propertyTypeId = "1";
        }
        if (cboProperty.getSelectedIndex() == 3) {
            propertyTypeId = "717";
        }
        if (cboProperty.getSelectedIndex() == 4) {
            propertyTypeId = "2";
        }
        searchSetupTableColumn();
    }//GEN-LAST:event_cboPropertyActionPerformed

    private void tblPropertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPropertiesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPropertiesMouseClicked

    private void tblPropertiesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPropertiesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPropertiesMousePressed

    private void tblPropertiesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPropertiesMouseReleased
        // TODO add your handling code here:
        SetupTableColumnBO obj = listSetupTableColumn.get(tblProperties.getSelectedRow());
        propertyId = obj.getId();
        txtRemarks.setText(obj.getRemarks());
        lblProperty.setText(" " + obj.getProperty());
    }//GEN-LAST:event_tblPropertiesMouseReleased

    private void tblPropertiesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPropertiesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPropertiesKeyReleased

    private void txtSearchPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPropertyActionPerformed
        // TODO add your handling code here:
        String query = "SELECT ID, PROPERTY DESCRIPTION FROM "
                + Database.DCMS.setupTableColums
                + " WHERE UPPER(PROPERTY) LIKE '%"
                + txtSearchProperty.getText().toUpperCase() + "%' "
                + " AND SETUP_ID = " + propertyTypeId + ""
                + " AND ACTIVE = 'Y'";

        lov.LOVSelection(query, this);
        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtSearchProperty.setText("");
            return;
        } else {
            txtSearchProperty.setText(Constants.lovDescription.toUpperCase());
            propertyId = Constants.lovID;
            propertyDescription = Constants.lovDescription.toUpperCase();
            searchSetupTableColumn();
        }
    }//GEN-LAST:event_txtSearchPropertyActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        SetupTableColumnBO objUpdate = new SetupTableColumnBO();
        objUpdate.setId(propertyId);
        objUpdate.setSetupId(propertyTypeId);
        objUpdate.setRemarks(txtRemarks.getText().trim());
        if (ctlSetupTableColumn.updateSetupTableColumn(objUpdate)) {
            JOptionPane.showMessageDialog(null, "Record save successfully!");
            propertyId = "";
            searchSetupTableColumn();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save record.");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtRemarksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRemarksMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemarksMouseClicked

    private void tblPropertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPropertyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPropertyMouseClicked

    private void tblPropertyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPropertyMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPropertyMousePressed

    private void tblPropertyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPropertyMouseReleased
        // TODO add your handling code here:
        objBO = listProperty.get(tblProperty.getSelectedRow());
        txtPropertyName.setText(objBO.getProperty());
        cboActive.setSelectedItem(objBO.getActive());
    }//GEN-LAST:event_tblPropertyMouseReleased

    private void tblPropertyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPropertyKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPropertyKeyReleased

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void btnSavePropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePropertyActionPerformed
        // TODO add your handling code here:
        if (cboActive.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please Select Active Y/N.");
            cboActive.requestFocus();
            return;
        }
        if (cboPropType.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please Select Setup of Property.");
            cboPropType.requestFocus();
            return;
        }
        objBO.setSetupId(setupId);
        objBO.setActive(cboActive.getSelectedItem().toString());
        objBO.setProperty(txtPropertyName.getText().trim());
        objBO.setDescription(txtDescription.getText().trim());

        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going To "
                + "Add New property.");
        if (confirmation != 0) {
            return;
        }
        
        if (ctlSetupTableColumn.saveProperty(objBO, setupId)) {
            JOptionPane.showMessageDialog(null, "Property added successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to add property!");
        }
    }//GEN-LAST:event_btnSavePropertyActionPerformed

    private void cboPropTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPropTypeActionPerformed
        // TODO add your handling code here:
        if (cboPropType.getSelectedIndex() == 1) {
            setupId = "2";
        }
        if (cboPropType.getSelectedIndex() == 2) {
            setupId = "1";
        }
    }//GEN-LAST:event_cboPropTypeActionPerformed

    private void cboActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboActiveActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cboActiveActionPerformed

    private void txtPropertyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPropertyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPropertyNameActionPerformed

    private void btnUpdatePropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePropertyActionPerformed
        // TODO add your handling code here:
        objBO.setProperty(txtPropertyName.getText().trim());
        objBO.setActive(cboActive.getSelectedItem().toString());
        if (ctlSetupTableColumn.updatePropertyInfo(objBO)) {
            JOptionPane.showMessageDialog(null, "Property updated successfully");
            selectProperty();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to update property!");
        }
    }//GEN-LAST:event_btnUpdatePropertyActionPerformed

    private void btnSearchPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPropertyActionPerformed
        // TODO add your handling code here:
        selectProperty();
    }//GEN-LAST:event_btnSearchPropertyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveProperty;
    private javax.swing.JButton btnSearchProperty;
    private javax.swing.JButton btnUpdateProperty;
    private javax.swing.JComboBox<String> cboActive;
    private javax.swing.JComboBox<String> cboPropType;
    private javax.swing.JComboBox<String> cboProperty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JLabel lblProperty;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblProperties;
    private javax.swing.JTable tblProperty;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPropertyName;
    private javax.swing.JTextArea txtRemarks;
    private javax.swing.JTextField txtSearchProperty;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        listSetupTableColumn.clear();
        tblProperties.setModel(new SetupTableColumnTableModel(listSetupTableColumn));
        propertyId = "";
        propertyTypeId = "";
        txtRemarks.setText("");
        txtSearchProperty.setText("");
        lblProperty.setText("");
        cboProperty.setSelectedIndex(0);
    }

    private void searchSetupTableColumn() {
        listSetupTableColumn = ctlSetupTableColumn.selectSetupTableColumn(propertyId, propertyTypeId);
        tblProperties.setModel(new SetupTableColumnTableModel(listSetupTableColumn));
        ListSelectionModel selectionModel = tblProperties.getSelectionModel();
        tblProperties.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setParameterListColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblProperties);
        SetupTableColumnBO obj = listSetupTableColumn.get(0);
        txtRemarks.setText(obj.getRemarks());
        lblProperty.setText(" " + obj.getProperty());
        propertyId = obj.getId();
    }

    private void setParameterListColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblProperties.getColumnCount(); i++) {
            column = tblProperties.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(20);
            } else if (i == 2) {
                column.setPreferredWidth(230);
            } else if (i == 3) {
                column.setPreferredWidth(20);
            }
        }
    }

    private void selectProperty() {
        listProperty = ctlSetupTableColumn.selectSetupTableColumnProperty(setupId,
                txtPropertyName.getText().trim().toUpperCase());
        tblProperty.setModel(new SetupPropertyTableModel(listProperty));
        ListSelectionModel selectionModel = tblProperty.getSelectionModel();
        tblProperty.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setPropertyColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblProperty);
    }

    private void setPropertyColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblProperty.getColumnCount(); i++) {
            column = tblProperty.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(20);
            } else if (i == 2) {
                column.setPreferredWidth(230);
            } else if (i == 3) {
                column.setPreferredWidth(20);
            }
        }
    }
}
