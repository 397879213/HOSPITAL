package Form.Administration;

//import Controller.Administration.CtlVerifiedReorts;
import BO.Administration.BOVerifiedReports;
import Controller.Administration.CtlVerifiedReorts;
import TableModel.Administration.CptWiseReportsTableModel;
import TableModel.Administration.PatientAllCasesTableModel;
import TableModel.Administration.PatientReportedCasesTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;

public class frmVerifiedReports extends javax.swing.JInternalFrame {
    
    
    

    public frmVerifiedReports() {

        initComponents();
        this.setSize(Constants.xSize - 20, Constants.ySize - Constants.yExtension + 73);
        
        txtCptName.requestFocus();
        txtPatientId.setEditable(false);
        txtPatientName.setEditable(false);
        txtLabNo.setEditable(false);

    }

    //Objects decleration
    CtlVerifiedReorts ctlObj = new CtlVerifiedReorts();
    DisplayLOV lov = new DisplayLOV();
    BOVerifiedReports objBO = new BOVerifiedReports();
    
    //Variable Decleration.
    
    private String patId;
    private String labno;
    private String toDate;
    public  String cptName;
    private String cptId;
    private String fromDate ;
    
    private List<BOVerifiedReports> lstCptReports = new ArrayList();
    private List<BOVerifiedReports> lstPatVerifiedReports = new ArrayList();
    private List<BOVerifiedReports> lstPatAllReports = new ArrayList();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCptName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        cmpDept = new javax.swing.JComboBox();
        txtSearchFromDate = new org.jdesktop.swingx.JXDatePicker();
        txtSearchToDate = new org.jdesktop.swingx.JXDatePicker();
        btnSearch = new javax.swing.JButton();
        txtLabNo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblCptWiseReports = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtPatIdinfo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPatNameInfo = new javax.swing.JTextField();
        txtLabnoinfo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblReportedCases = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblInProgressReports = new javax.swing.JTable();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Verified Reports");
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
                .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Verified Reports", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPT WIise Specific Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPT Wise Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Patient Id :");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("CPT Name :");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtCptName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCptNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("From Date :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("To Date :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        cmpDept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pathology", "Radiology", "Cardiology", "Nilgid" }));

        txtSearchFromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchFromDateActionPerformed(evt);
            }
        });

        txtSearchToDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchToDateActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtSearchFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(txtSearchToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtCptName, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(cmpDept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtLabNo)))
                .addGap(5, 5, 5))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLabNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCptName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cmpDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(txtSearchFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSearchToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPT Wise Reports", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblCptWiseReports.setBackground(java.awt.SystemColor.activeCaption);
        tblCptWiseReports.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblCptWiseReports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Sr.","Member Id","Book Id","Book Name","Issued Date","Issued By"
            }
        ));
        tblCptWiseReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCptWiseReportsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCptWiseReportsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCptWiseReportsMouseReleased(evt);
            }
        });
        tblCptWiseReports.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblCptWiseReportsPropertyChange(evt);
            }
        });
        tblCptWiseReports.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblCptWiseReportsKeyPressed(evt);
            }
        });
        jScrollPane16.setViewportView(tblCptWiseReports);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane16)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Specified Report Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Patient Id :");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtPatIdinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatIdinfoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Patient Name :");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txtLabnoinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabnoinfoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Lab No :");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtPatIdinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)
                        .addGap(3, 3, 3)
                        .addComponent(txtLabnoinfo))
                    .addComponent(txtPatNameInfo))
                .addGap(5, 5, 5))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPatIdinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLabnoinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(txtPatNameInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Specified Patient Reported Cases", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 0, 0));

        tblReportedCases.setBackground(java.awt.SystemColor.activeCaption);
        tblReportedCases.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblReportedCases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Sr.","Member Id","Book Id","Book Name","Issued Date","Issued By"
            }
        ));
        tblReportedCases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReportedCasesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblReportedCasesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblReportedCasesMouseReleased(evt);
            }
        });
        tblReportedCases.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblReportedCasesPropertyChange(evt);
            }
        });
        tblReportedCases.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblReportedCasesKeyPressed(evt);
            }
        });
        jScrollPane15.setViewportView(tblReportedCases);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Specified Patient InProgress Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(102, 0, 0));

        tblInProgressReports.setBackground(java.awt.SystemColor.activeCaption);
        tblInProgressReports.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblInProgressReports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Sr.","Member Id","Book Id","Book Name","Issued Date","Issued By"
            }
        ));
        tblInProgressReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInProgressReportsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblInProgressReportsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblInProgressReportsMouseReleased(evt);
            }
        });
        tblInProgressReports.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblInProgressReportsPropertyChange(evt);
            }
        });
        tblInProgressReports.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblInProgressReportsKeyPressed(evt);
            }
        });
        jScrollPane17.setViewportView(tblInProgressReports);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane17))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblReportedCasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReportedCasesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblReportedCasesMouseClicked

    private void tblReportedCasesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReportedCasesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblReportedCasesMousePressed

    private void tblReportedCasesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReportedCasesMouseReleased
        int selectedRow = tblReportedCases.getSelectedRow();
        objBO = lstPatVerifiedReports.get(selectedRow);
        
        txtPatIdinfo.setText(objBO.getPatId().substring(3));
        txtPatNameInfo.setText(objBO.getPatName());
        txtLabnoinfo.setText(objBO.getLabNo());
    }//GEN-LAST:event_tblReportedCasesMouseReleased

    private void tblReportedCasesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblReportedCasesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblReportedCasesPropertyChange

    private void tblReportedCasesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblReportedCasesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblReportedCasesKeyPressed

    private void tblCptWiseReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCptWiseReportsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptWiseReportsMouseClicked

    private void tblCptWiseReportsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCptWiseReportsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptWiseReportsMousePressed

    private void tblCptWiseReportsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCptWiseReportsMouseReleased
        
        int selectedRow = tblCptWiseReports.getSelectedRow();
        objBO = lstCptReports.get(selectedRow);
        
        txtPatientId.setText(objBO.getPatId().substring(3));
        txtPatientName.setText(objBO.getPatName());
        txtLabNo.setText(objBO.getLabNo());
    }//GEN-LAST:event_tblCptWiseReportsMouseReleased

    private void tblCptWiseReportsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblCptWiseReportsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptWiseReportsPropertyChange

    private void tblCptWiseReportsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCptWiseReportsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptWiseReportsKeyPressed

    private void tblInProgressReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInProgressReportsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInProgressReportsMouseClicked

    private void tblInProgressReportsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInProgressReportsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInProgressReportsMousePressed

    private void tblInProgressReportsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInProgressReportsMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInProgressReportsMouseReleased

    private void tblInProgressReportsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblInProgressReportsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInProgressReportsPropertyChange

    private void tblInProgressReportsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblInProgressReportsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInProgressReportsKeyPressed

    private void txtSearchFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchFromDateActionPerformed

        if (txtSearchFromDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the From Date DD-MON-YY", 
                    "Verified Reports", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        SimpleDateFormat dateFormat
         = new SimpleDateFormat("dd-MMM-yy");
        fromDate = dateFormat.format(txtSearchFromDate.getDate());
       
    }//GEN-LAST:event_txtSearchFromDateActionPerformed

    private void txtSearchToDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchToDateActionPerformed
       
       

        if (txtSearchToDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the To Date DD-MON-YY", 
                    "Verified Reports", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
         
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        toDate = dateFormat.format(txtSearchToDate.getDate());
    }//GEN-LAST:event_txtSearchToDateActionPerformed

    private void txtPatIdinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatIdinfoActionPerformed
        labno = "";
        patId = txtPatIdinfo.getText().trim();
        
        
        patVerifiedReports();
        patAllReports();
    }//GEN-LAST:event_txtPatIdinfoActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        verifiedReports();
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtCptNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCptNameActionPerformed
       
        int ind = cmpDept.getSelectedIndex();
        String query = "  SELECT    CPT_ID ID, DESCRIPTION                  \n"
                + " FROM                                                    \n"
                + Database.DCMS.CPT + "                                     \n"
                + " WHERE UPPER(DESCRIPTION) LIKE UPPER('%"
                + txtCptName.getText().trim() + "%')                        \n";
        if(ind == 0)   {     
        query += " AND DEPARTMENT_ID   = '128'                     \n";}
        
        if(ind == 1)   {     
        query += " AND DEPARTMENT_ID   = '127'                     \n";}
         
        if(ind == 2)   {     
        query += " AND DEPARTMENT_ID   = '28'                     \n";}
        
        if(ind == 3)   {     
        query += " AND DEPARTMENT_ID   = '35'                     \n";}
        
        
        query += " ORDER BY DESCRIPTION                                    \n";

        lov.LOVSelection(query, this);

        cptName = Constants.lovDescription;
        cptId = Constants.lovID;
        
        txtCptName.setText(cptName);
    }//GEN-LAST:event_txtCptNameActionPerformed

    private void txtLabnoinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabnoinfoActionPerformed
       
        patId = "";     
        labno = txtLabnoinfo.getText().trim();
        
       patVerifiedReports();
       patAllReports();
        
        
    }//GEN-LAST:event_txtLabnoinfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cmpDept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblCptWiseReports;
    private javax.swing.JTable tblInProgressReports;
    private javax.swing.JTable tblReportedCases;
    private javax.swing.JTextField txtCptName;
    private javax.swing.JTextField txtLabNo;
    private javax.swing.JTextField txtLabnoinfo;
    private javax.swing.JTextField txtPatIdinfo;
    private javax.swing.JTextField txtPatNameInfo;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private org.jdesktop.swingx.JXDatePicker txtSearchFromDate;
    private org.jdesktop.swingx.JXDatePicker txtSearchToDate;
    // End of variables declaration//GEN-END:variables

    private void verifiedReports() {
    
        lstCptReports = ctlObj.selectCptWiseReports(cptId, fromDate, toDate);
        tblCptWiseReports.setModel(new CptWiseReportsTableModel(lstCptReports));
        Constants.tablelook.setJTableEnvironment(tblCptWiseReports);
        setTableColWidth();
    }

    private void setTableColWidth() {
        
        TableColumn column;
        for (int i = 0; i < tblCptWiseReports.getColumnCount(); i++) {
            column = tblCptWiseReports.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(80);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            } else if (i == 4) {
                column.setPreferredWidth(80);
            } else if (i == 5) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void patVerifiedReports() {
    
        lstPatVerifiedReports = ctlObj.searchVerifiedReports(patId, labno);
        tblReportedCases.setModel(new PatientReportedCasesTableModel(lstPatVerifiedReports));
        Constants.tablelook.setJTableEnvironment(tblReportedCases);
        
        setVerifiedTableColWidth();
    }

    private void patAllReports() {
    
        lstPatAllReports = ctlObj.searchAllReports(patId, labno);
        tblInProgressReports.setModel(new PatientAllCasesTableModel(lstPatAllReports));
        Constants.tablelook.setJTableEnvironment(tblInProgressReports);
        
        setAllRepotsTableColWidth();
    }

    private void setVerifiedTableColWidth() {
        
        TableColumn column;
        for (int i = 0; i < tblReportedCases.getColumnCount(); i++) {
            column = tblReportedCases.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(80);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            } else if (i == 4) {
                column.setPreferredWidth(80);
            } else if (i == 5) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void setAllRepotsTableColWidth() {
    
      TableColumn column;
        for (int i = 0; i < tblInProgressReports.getColumnCount(); i++) {
            column = tblInProgressReports.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(80);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            } else if (i == 4) {
                column.setPreferredWidth(80);
            } else if (i == 5) {
                column.setPreferredWidth(50);
            }
        }  
    }

}

