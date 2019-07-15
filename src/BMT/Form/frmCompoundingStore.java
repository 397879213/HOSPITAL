package BMT.Form;

import BMT.BO.CompoundingBO;
import BMT.Controller.CompoundingController;
import BMT.TableModel.AdditiveInfoTableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;
import utilities.Status;
import utilities.TypeDetailId;

public class frmCompoundingStore extends javax.swing.JInternalFrame {

    private String compoundId = "";
    private String storeWiseItemId = "";
    private String itemName = "";
    private String storeStock = "";
    private String unitQuantity = "";
    private String additiveId = "";
    private String salePrice = "";
    private int currentUnitStock = 0;
    private float unitCost = 0;
    private float totalAmount = 0;
    private String additiveDescription = "";

    List<CompoundingBO> listAdditive = new ArrayList();
    List<CompoundingBO> listCompoundCreate = new ArrayList();
    List<CompoundingBO> listLessAdditive = new ArrayList();

    CompoundingBO objCompounding = new CompoundingBO();
    CompoundingController ctlCompound = new CompoundingController();

    public frmCompoundingStore() {

        initComponents();
        this.setSize(Constants.xSize, Constants.ySize - 250);
        txtTotalAmount.setEditable(false);
    }

    DisplayLOV lov = new DisplayLOV();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        txtCompound = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAdditive = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVolumeNeed = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtServiceCharges = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblCompoundAdditive = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        txtItems = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUnitQuantity = new javax.swing.JTextField();
        cboItemType = new javax.swing.JComboBox<String>();
        btnUpdateItemInfo = new javax.swing.JButton();
        lblStock = new javax.swing.JLabel();
        lblStockInQuantity = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnUpdateItemInfo1 = new javax.swing.JButton();
        txtCrtdCompound = new javax.swing.JTextField();
        txtCompoundQuantity = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Define Compound", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Compound", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        txtCompound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompoundActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Compound Name : ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Select Additive : ");

        txtAdditive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdditiveActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Volume Need : ");

        txtVolumeNeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolumeNeedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtAdditive, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVolumeNeed, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCompound))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCompound, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdditive, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVolumeNeed, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Service Charges of Compound : ");

        txtServiceCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiceChargesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Total Amount : ");

        txtTotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAmountActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compound Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        tblCompoundAdditive.setBackground(java.awt.SystemColor.activeCaption);
        tblCompoundAdditive.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null,null}
            },
            new String [] {"Item","Quantity","Type"}));
    tblCompoundAdditive.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblCompoundAdditiveMouseClicked(evt);
        }
        public void mousePressed(java.awt.event.MouseEvent evt) {
            tblCompoundAdditiveMousePressed(evt);
        }
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            tblCompoundAdditiveMouseReleased(evt);
        }
    });
    tblCompoundAdditive.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            tblCompoundAdditivePropertyChange(evt);
        }
    });
    tblCompoundAdditive.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            tblCompoundAdditiveKeyPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            tblCompoundAdditiveKeyReleased(evt);
        }
    });
    jScrollPane7.setViewportView(tblCompoundAdditive);

    javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
    jPanel11.setLayout(jPanel11Layout);
    jPanel11Layout.setHorizontalGroup(
        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane7)
    );
    jPanel11Layout.setVerticalGroup(
        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    jButton1.setText("Save");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtServiceCharges)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton1)
            .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtServiceCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1))
            .addContainerGap())
    );

    jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Define Stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

    txtItems.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtItemsActionPerformed(evt);
        }
    });

    jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(102, 0, 0));
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel7.setText("Select Item : ");

    jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(102, 0, 0));
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel8.setText("Unit Volume/ Quantity : ");

    txtUnitQuantity.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtUnitQuantityActionPerformed(evt);
        }
    });

    cboItemType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"ml", "mg"}));
    cboItemType.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            cboItemTypeMouseReleased(evt);
        }
    });
    cboItemType.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cboItemTypeActionPerformed(evt);
        }
    });

    btnUpdateItemInfo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    btnUpdateItemInfo.setText("Update");
    btnUpdateItemInfo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUpdateItemInfoActionPerformed(evt);
        }
    });

    lblStock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    lblStock.setForeground(new java.awt.Color(102, 0, 0));
    lblStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblStock.setText(" ");
    lblStock.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    lblStockInQuantity.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    lblStockInQuantity.setForeground(new java.awt.Color(102, 0, 0));
    lblStockInQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblStockInQuantity.setText(" ");
    lblStockInQuantity.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
    jPanel12.setLayout(jPanel12Layout);
    jPanel12Layout.setHorizontalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel12Layout.createSequentialGroup()
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addComponent(txtUnitQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cboItemType, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblStockInQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(txtItems))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(lblStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdateItemInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanel12Layout.setVerticalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel12Layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtItems, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtUnitQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnUpdateItemInfo)
                .addComponent(lblStockInQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cboItemType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create Compound", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

    jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(102, 0, 0));
    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel9.setText("Select Compound : ");

    btnUpdateItemInfo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    btnUpdateItemInfo1.setText("Create");
    btnUpdateItemInfo1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUpdateItemInfo1ActionPerformed(evt);
        }
    });

    txtCrtdCompound.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtCrtdCompoundActionPerformed(evt);
        }
    });

    txtCompoundQuantity.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtCompoundQuantityActionPerformed(evt);
        }
    });

    jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(102, 0, 0));
    jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel11.setText("No. of Compound : ");

    javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
    jPanel13.setLayout(jPanel13Layout);
    jPanel13Layout.setHorizontalGroup(
        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel13Layout.createSequentialGroup()
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addComponent(txtCompoundQuantity)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnUpdateItemInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(txtCrtdCompound))
            .addGap(10, 10, 10))
    );
    jPanel13Layout.setVerticalGroup(
        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel13Layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtCrtdCompound, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnUpdateItemInfo1)
                .addComponent(txtCompoundQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(19, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCompoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompoundActionPerformed
        // TODO add your handling code here:
        String query = "SELECT ID, DESCRIPTION FROM                     \n"
                + Database.DCMS.item + "                                \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtCompound.getText().toUpperCase().trim() + "%'      \n"
                + " AND ITEM_TYPE_ID = '" + TypeDetailId.compound + "'  \n"
                + " AND ACTIVE = 'Y'";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            compoundId = "";
            return;
        } else {
            compoundId = Constants.lovID;
            txtCompound.setText(Constants.lovDescription);
        }
        txtAdditive.requestFocus();
    }//GEN-LAST:event_txtCompoundActionPerformed

    private void txtAdditiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdditiveActionPerformed
        // TODO add your handling code here:
        String query = "SELECT SWI.ITEM_ID||'@' || SWI.SALE_PRICE ID, "
                + "ITM.DESCRIPTION  DESCRIPTION FROM \n"
                + Database.DCMS.storeWiseItems + "  SWI,                    \n"
                + Database.DCMS.item + "  ITM                               \n"
                + " WHERE SWI.STORE_ID = " + Constants.storeId + "            \n"
                + " AND SWI.ITEM_ID = ITM.ID                                \n"
                + " AND UPPER(ITM.DESCRIPTION) LIKE '%"
                + txtAdditive.getText().toUpperCase().trim() + "%'             \n"
                + " AND SWI.ACTIVE = 'Y'                                        \n"
                + " ORDER BY ITM.DESCRIPTION                                \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            additiveId = "";
            return;
        } else {
            additiveDescription = Constants.lovDescription;
            txtAdditive.setText(additiveDescription);
        }
        // Tokenization for id and price
        StringTokenizer st = new StringTokenizer(Constants.lovID);
        additiveId = st.nextToken("@");
        salePrice = st.nextToken("@");
        System.err.println("itemId: " + itemName + " stock: " + salePrice);
        txtVolumeNeed.requestFocus();
    }//GEN-LAST:event_txtAdditiveActionPerformed

    private void txtVolumeNeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolumeNeedActionPerformed
        // TODO add your handling code here:

        // Calculating Cost & and Add into List
        unitCost = Float.parseFloat(salePrice) * Float.parseFloat(txtVolumeNeed.getText());
        totalAmount = totalAmount + unitCost;
        objCompounding.setUnitCost(String.valueOf(unitCost));
        txtTotalAmount.setText(String.valueOf(totalAmount));
        objCompounding.setTotalAmount(String.valueOf(totalAmount));

        // Adding Additive In List
        listAdditive.add(new CompoundingBO(compoundId, objCompounding.getStoreId(),
                additiveId, additiveDescription, objCompounding.getUnitCost(),
                txtVolumeNeed.getText().trim()));
        setAdditiveInTable();

        // clear and request focus on additive
        txtVolumeNeed.setText("");
        txtAdditive.setText("");
        txtAdditive.requestFocus();

    }//GEN-LAST:event_txtVolumeNeedActionPerformed

    private void txtServiceChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServiceChargesActionPerformed
        // TODO add your handling code here:
        totalAmount = totalAmount + Float.parseFloat(txtServiceCharges.getText().trim());
        txtTotalAmount.setText(String.valueOf(totalAmount));
        txtTotalAmount.requestFocus();
    }//GEN-LAST:event_txtServiceChargesActionPerformed

    private void txtTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAmountActionPerformed

    private void tblCompoundAdditiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCompoundAdditiveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCompoundAdditiveMouseClicked

    private void tblCompoundAdditiveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCompoundAdditiveMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCompoundAdditiveMousePressed

    private void tblCompoundAdditiveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCompoundAdditiveMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCompoundAdditiveMouseReleased

    private void tblCompoundAdditivePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblCompoundAdditivePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCompoundAdditivePropertyChange

    private void tblCompoundAdditiveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCompoundAdditiveKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCompoundAdditiveKeyPressed

    private void tblCompoundAdditiveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCompoundAdditiveKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCompoundAdditiveKeyReleased

    private void txtItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemsActionPerformed
        // TODO add your handling code here:
        String query = "SELECT SWI.ITEM_ID ID, "
                + "ITM.DESCRIPTION  ||'    "
                + "@ ' || SWI.QTY ||' @ ' || SWI.SALE_PRICE DESCRIPTION FROM \n"
                + Database.DCMS.storeWiseItems + "  SWI,                    \n"
                + Database.DCMS.item + "  ITM                               \n"
                + " WHERE SWI.STORE_ID = " + Constants.storeId + "          \n"
                + " AND SWI.ITEM_ID = ITM.ID                                \n"
                + " AND UPPER(ITM.DESCRIPTION) LIKE '%"
                + txtItems.getText().toUpperCase().trim() + "%'             \n"
                + " AND SWI.ACTIVE = 'Y'                                    \n"
                + " AND ITM.CATEGORY_ID = '" + Status.liquidSection + "'                            \n"
                + " ORDER BY ITM.DESCRIPTION                                \n";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            storeWiseItemId = "";
            return;
        } else {
            StringTokenizer st = new StringTokenizer(Constants.lovDescription);
            itemName = st.nextToken("@");
            storeStock = st.nextToken("@");
            salePrice = st.nextToken();
            storeWiseItemId = Constants.lovID;
            txtItems.setText(itemName.trim());
            lblStock.setText(storeStock.trim());
            txtUnitQuantity.requestFocus();
        }

        System.err.println(itemName + " SS" + storeStock.trim() + "sale price:" + salePrice.trim() + "DD");
    }//GEN-LAST:event_txtItemsActionPerformed

    private void txtUnitQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitQuantityActionPerformed
        // TODO add your handling code here:
        setStockInQuantity();
    }//GEN-LAST:event_txtUnitQuantityActionPerformed

    private void cboItemTypeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboItemTypeMouseReleased
        // TODO add your handling code here:
        //setStockInQuantity();
    }//GEN-LAST:event_cboItemTypeMouseReleased

    private void cboItemTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboItemTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboItemTypeActionPerformed

    private void btnUpdateItemInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemInfoActionPerformed
        // TODO add your handling code here:
        setStockInQuantity();
        setItemInfo();
        clearAndRequestFocus();
    }//GEN-LAST:event_btnUpdateItemInfoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //TODO add your handling code here:
        objCompounding.setCompoundId(compoundId);
        objCompounding.setStoreId(Constants.storeId);
        objCompounding.setServiceCharges(txtServiceCharges.getText().trim());
        objCompounding.setTotalAmount(txtTotalAmount.getText().trim());

        if (ctlCompound.InsertCompounding(objCompounding, listAdditive)) {
            JOptionPane.showMessageDialog(null, "DOne Inr");
        } else {
            JOptionPane.showMessageDialog(null, "Not Done!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUpdateItemInfo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemInfo1ActionPerformed
        // TODO add your handling code here:
        checkAndCreateCompound();
    }//GEN-LAST:event_btnUpdateItemInfo1ActionPerformed

    private void txtCrtdCompoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrtdCompoundActionPerformed
        // TODO add your handling code here:
        String query = "SELECT ID, DESCRIPTION FROM                     \n"
                + Database.DCMS.item + "                                \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtCrtdCompound.getText().toUpperCase().trim() + "%'      \n"
                + " AND ITEM_TYPE_ID = '" + TypeDetailId.compound + "'  \n"
                + " AND ACTIVE = 'Y'";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            compoundId = "";
            return;
        } else {
            compoundId = Constants.lovID;
            txtCrtdCompound.setText(Constants.lovDescription);
            txtCompoundQuantity.requestFocus();
        }
    }//GEN-LAST:event_txtCrtdCompoundActionPerformed

    private void txtCompoundQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompoundQuantityActionPerformed
        // TODO add your handling code here:
        checkAndCreateCompound();
    }//GEN-LAST:event_txtCompoundQuantityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateItemInfo;
    private javax.swing.JButton btnUpdateItemInfo1;
    private javax.swing.JComboBox<String> cboItemType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblStockInQuantity;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblCompoundAdditive;
    private javax.swing.JTextField txtAdditive;
    private javax.swing.JTextField txtCompound;
    private javax.swing.JTextField txtCompoundQuantity;
    private javax.swing.JTextField txtCrtdCompound;
    private javax.swing.JTextField txtItems;
    private javax.swing.JTextField txtServiceCharges;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtUnitQuantity;
    private javax.swing.JTextField txtVolumeNeed;
    // End of variables declaration//GEN-END:variables

    private void setStockInQuantity() {
        if (cboItemType.getSelectedItem() == "Select") {
            JOptionPane.showMessageDialog(null, "Select Type First!");
        } else {
            unitQuantity = txtUnitQuantity.getText().trim();
            currentUnitStock = Integer.parseInt(unitQuantity) * Integer.parseInt(storeStock.trim());
            lblStockInQuantity.setText(String.valueOf(currentUnitStock + " " + cboItemType.getSelectedItem()));
        }
    }

    private void setItemInfo() {
        objCompounding = new CompoundingBO();
        objCompounding.setItemId(storeWiseItemId);
        objCompounding.setStoreId(Constants.storeId);
        objCompounding.setUnitQuantityType(cboItemType.getSelectedItem().toString());
        objCompounding.setUnitQuantity(txtUnitQuantity.getText().trim());
        objCompounding.setQuantity(String.valueOf(currentUnitStock));
        //  calculation to find the per Unit cost
        float price = Float.parseFloat(salePrice.trim());
        unitCost = currentUnitStock / price;
        System.out.println("sP" + unitCost);
        objCompounding.setUnitCost(String.valueOf(unitCost));

        if (ctlCompound.updateItemQuantity(objCompounding)) {
            JOptionPane.showMessageDialog(null, "Updated Stock Successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "UnAble to save.\n Kindly contact Administrator!");
        }
    }

    private void setAdditiveColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblCompoundAdditive.getColumnCount(); i++) {
            column = tblCompoundAdditive.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(200);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            } else if (i == 3) {
                column.setPreferredWidth(10);
            }

        }
    }

    private void setAdditiveInTable() {
        tblCompoundAdditive.setModel(new AdditiveInfoTableModel(listAdditive));
        ListSelectionModel selectionModel = tblCompoundAdditive.getSelectionModel();
        tblCompoundAdditive.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setAdditiveColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblCompoundAdditive);
    }

    private void checkAndCreateCompound() {
        String checkCompound = "\n";
        int totalQuantity = 0;
        String stockUp = txtCompoundQuantity.getText().trim();
        listCompoundCreate = ctlCompound.selectDesignation(compoundId, Constants.storeId);

        for (int i = 0; i < listCompoundCreate.size(); i++) {
            CompoundingBO objBo = listCompoundCreate.get(i);

            totalQuantity = Integer.parseInt(stockUp) * Integer.parseInt(objBo.getVolumeUsed());
            System.out.println("\n Total Quantity required " + totalQuantity);
            if (Integer.parseInt(objBo.getQuantity()) < totalQuantity) {
                checkCompound += objBo.getAdditiveDescription() + " Current Stock: "
                        + objBo.getQuantity() + " Required: " + String.valueOf(totalQuantity) + "\n";
            } else {
                // stor , additive, quantity
                listLessAdditive.add(new CompoundingBO(compoundId, Constants.storeId,
                        objBo.getAdditiveId(), "", String.valueOf(totalQuantity), ""));
                checkCompound = "@";
            }
        }// end of loop

        if (checkCompound.equalsIgnoreCase("@")) {
            objCompounding = new CompoundingBO();
            objCompounding.setStoreId(Constants.storeId);
            objCompounding.setCompoundId(compoundId);
            objCompounding.setQuantity(stockUp);
            if (ctlCompound.updateCompoundStock(objCompounding, listLessAdditive)) {
                JOptionPane.showMessageDialog(null, stockUp + " Compound created successfully!"
                        + "\n" + txtCrtdCompound.getText());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Create Compound. \n"
                    + checkCompound
                    + "\n Kindly Update Stock!");
        }
    }

    private void clearAndRequestFocus() {
        txtItems.setText("");
        txtUnitQuantity.setText("");
        lblStock.setText("");
        lblStockInQuantity.setText("");
        cboItemType.setSelectedIndex(0);
        txtItems.requestFocus();
    }

}
