package Form.OPD;

import BO.OutsideInvestigation;
import BO.Patient;
import Controller.OPD.OutsideInvestigationController;
import TableModel.OutsideInvestigationsTableModel;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import utilities.DefinitionTypes;

public class PatientOutSideInvestigations extends javax.swing.JInternalFrame {

    String conodiid = "";
    String performDate = "";
    Webcam webcam = null;
    WebcamPanel panel;
    private String healthFacilityId = "";

    DisplayLOV lov = new DisplayLOV();

    private String patientId = "001000001957";
    private String con = "001001140002044";
    private String odi = "1";
    private String cptId = "";

    private List<OutsideInvestigation> listInvestigations = new ArrayList();
    private List<OutsideInvestigation> listPreviousInvestigations = new ArrayList();

    OutsideInvestigation selectedInvestigation = new OutsideInvestigation();
    OutsideInvestigationController ctlInvestigation = new OutsideInvestigationController();

    public PatientOutSideInvestigations() {

        initComponents();
        this.setSize(Constants.xSize + 100, Constants.ySize - Constants.yExtension + 20);
//        patientId = Constants.opd.getPatientId();
//        con = Constants.opd.getCON();
//        odi = Constants.opd.getODI();
//        setDemography();
        searchOutsideInvestigations();
        setDate(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtConsultantName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtConsultantDate = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnSaveReport = new javax.swing.JButton();
        btnShowWebcam = new javax.swing.JButton();
        btnAttachEmployeeDoc = new javax.swing.JButton();
        btnBrowseWebcam = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTestName = new javax.swing.JTextField();
        txtHealthFacility = new javax.swing.JTextField();
        btnAddInvestigation = new javax.swing.JButton();
        btnEditInvestigation = new javax.swing.JButton();
        btnDeleteInvestigation = new javax.swing.JButton();
        btnDeleteInvestigation1 = new javax.swing.JButton();
        txtPerformDate = new org.jdesktop.swingx.JXDatePicker();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtReport = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOutSideTest = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtPreviousTestName = new javax.swing.JTextField();
        btnFilterSearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblPicture = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtPreviousReport = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Search Studies");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1110, 760));

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
                .addComponent(lblPacsLink, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OutSide Investigations Orders", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(Constants.red,Constants.green,Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtPatientName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtPatientId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Physician Name:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Date:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPatientId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtConsultantName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultantDate))
                    .addComponent(txtPatientName))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtConsultantName)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtConsultantDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(Constants.red,Constants.green,Constants.black));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(102, 0, 0));
        btnExit.setText("Exit");
        btnExit.setMaximumSize(new java.awt.Dimension(57, 23));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSaveReport.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSaveReport.setText("Save Comments");
        btnSaveReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveReportActionPerformed(evt);
            }
        });

        btnShowWebcam.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnShowWebcam.setText("Show");
        btnShowWebcam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowWebcamActionPerformed(evt);
            }
        });

        btnAttachEmployeeDoc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAttachEmployeeDoc.setText("Attach");
        btnAttachEmployeeDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachEmployeeDocActionPerformed(evt);
            }
        });

        btnBrowseWebcam.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBrowseWebcam.setText("Browse");
        btnBrowseWebcam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseWebcamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSaveReport)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShowWebcam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAttachEmployeeDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBrowseWebcam)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnAttachEmployeeDoc)
                .addComponent(btnBrowseWebcam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnShowWebcam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnSaveReport))
        );

        jPanel10.setBackground(new java.awt.Color(Constants.red,Constants.green,Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diagnostic Order Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Health Facility:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Perform Date:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Test Name:");

        txtTestName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTestName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTestNameActionPerformed(evt);
            }
        });

        txtHealthFacility.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtHealthFacility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthFacilityActionPerformed(evt);
            }
        });

        btnAddInvestigation.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAddInvestigation.setText("Add");
        btnAddInvestigation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInvestigationActionPerformed(evt);
            }
        });

        btnEditInvestigation.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEditInvestigation.setText("Edit");
        btnEditInvestigation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInvestigationActionPerformed(evt);
            }
        });

        btnDeleteInvestigation.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeleteInvestigation.setText("Delete");
        btnDeleteInvestigation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteInvestigationActionPerformed(evt);
            }
        });

        btnDeleteInvestigation1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDeleteInvestigation1.setText("+");
        btnDeleteInvestigation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteInvestigation1ActionPerformed(evt);
            }
        });

        txtPerformDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerformDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTestName)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtPerformDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddInvestigation, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditInvestigation, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteInvestigation))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtHealthFacility)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteInvestigation1)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTestName)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHealthFacility)
                        .addComponent(btnDeleteInvestigation1))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPerformDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddInvestigation)
                        .addComponent(btnEditInvestigation)
                        .addComponent(btnDeleteInvestigation)))
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(Constants.red,Constants.green,Constants.black));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Report Remarks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtReport.setColumns(20);
        txtReport.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtReport.setLineWrap(true);
        txtReport.setRows(5);
        txtReport.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtReport);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red,Constants.green,Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Investigation Reports", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0)), "Current Investigation Reports", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblOutSideTest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID","Description", "Active"
            }
        ));
        tblOutSideTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOutSideTestMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblOutSideTestMouseReleased(evt);
            }
        });
        tblOutSideTest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblOutSideTestKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblOutSideTest);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Test Name:");

        txtPreviousTestName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreviousTestNameActionPerformed(evt);
            }
        });

        btnFilterSearch.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFilterSearch.setText("Search");
        btnFilterSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPreviousTestName, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFilterSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreviousTestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFilterSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(Constants.red,Constants.green,Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel5.setBackground(new java.awt.Color(Constants.red,Constants.green,Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OutSide Investigation Reports", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(Constants.red,Constants.green,Constants.black));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Report Remarks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtPreviousReport.setEditable(false);
        txtPreviousReport.setColumns(20);
        txtPreviousReport.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPreviousReport.setLineWrap(true);
        txtPreviousReport.setRows(5);
        txtPreviousReport.setWrapStyleWord(true);
        jScrollPane7.setViewportView(txtPreviousReport);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void tblOutSideTestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOutSideTestMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOutSideTestMouseClicked

    private void tblOutSideTestMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOutSideTestMouseReleased
        // TODO add your handling code here:
        if (listInvestigations.isEmpty() || tblOutSideTest.getSelectedRow() < 0) {
            return;
        }

        selectedInvestigation = listInvestigations.get(
                tblOutSideTest.getSelectedRow());
        cptId = selectedInvestigation.getCptId();
        healthFacilityId = selectedInvestigation.getHealthCareFacilityId();
        txtTestName.setText(selectedInvestigation.getTestName());
        txtHealthFacility.setText(selectedInvestigation.getHealthCareFacilityDescription());
        setDate(Integer.parseInt(selectedInvestigation.getReportDay()));
        txtPreviousReport.setText(selectedInvestigation.getReportRermarks());
        if (selectedInvestigation.getIsReportAttached().equalsIgnoreCase("Y")) {
            btnShowWebcam.setEnabled(false);
            btnBrowseWebcam.setEnabled(false);
            btnAttachEmployeeDoc.setEnabled(false);
        } else {
            btnShowWebcam.setEnabled(true);
            btnBrowseWebcam.setEnabled(true);
            btnAttachEmployeeDoc.setEnabled(true);
        }

        try {
            Image procImage = ctlInvestigation.selectReportImage(selectedInvestigation.getId());
            Image resizedImage
                    = procImage.getScaledInstance(lblPicture.getWidth(),
                            lblPicture.getHeight(), 0);
            ImageIcon icon = new ImageIcon(procImage);
            lblPicture.setIcon(icon);
        } catch (NullPointerException ex) {
            lblPicture.setIcon(null);
        }


    }//GEN-LAST:event_tblOutSideTestMouseReleased

    private void tblOutSideTestKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOutSideTestKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOutSideTestKeyReleased

    private void btnAddInvestigationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInvestigationActionPerformed
        // TODO add your handling code here:

        addInvestigation();
    }//GEN-LAST:event_btnAddInvestigationActionPerformed

    private void addInvestigation() {
        String mess = "";
        boolean check = true;
        if (txtTestName.getText().trim().isEmpty()) {
            cptId = "";
        }
        if (cptId.isEmpty()) {
            check = false;
            mess = "Please Select Test Name First";
            txtTestName.requestFocus();
        }

        if (txtHealthFacility.getText().trim().isEmpty()) {
            check = false;
            mess = "Please Write Health Facility First";
            txtHealthFacility.requestFocus();
        }

        if (performDate.length() == 0) {
            check = false;
            mess = "Please Select Perform Date.";
            txtPerformDate.requestFocus();
        }

        if (healthFacilityId.length() == 0) {
            check = false;
            mess = "Please Select Health Facility.";
            txtHealthFacility.requestFocus();
        }

        if (!check) {
            JOptionPane.showMessageDialog(null, mess);
            return;
        }

        OutsideInvestigation investigation = new OutsideInvestigation();
        investigation.setCompleteOrderNo(con);
        investigation.setOrderDetailId(odi);
        investigation.setPatientId(patientId);
        investigation.setCptId(cptId);
        investigation.setTestName(txtTestName.getText().toUpperCase());
        investigation.setHealthCareFacilityId(healthFacilityId);
        investigation.setReportDate(performDate);

        if (ctlInvestigation.insertOutsideInvestigation(investigation)) {
            //JOptionPane.showMessageDialog(null, "Successfully Saved!");
            searchOutsideInvestigations();
            clear();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Investigation\n"
                    + "Please Contact Administrator");
        }
    }

    private void clear() {
        txtTestName.setText("");
        txtHealthFacility.setText("");
//        txtPerformDate.setText("");
    }

    private void searchOutsideInvestigations() {

        listInvestigations = ctlInvestigation.selectOutsideInvestigation(
                con, odi, patientId, txtPreviousTestName.getText());

        if (listInvestigations.isEmpty()) {
            OutsideInvestigation cp = new OutsideInvestigation();
            List li = new ArrayList();
            li.add(cp);
            tblOutSideTest.setModel(new OutsideInvestigationsTableModel(li));
        } else {
            tblOutSideTest.setModel(new OutsideInvestigationsTableModel(listInvestigations));
        }
        ListSelectionModel selectionModel = tblOutSideTest.getSelectionModel();
        tblOutSideTest.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setInvestigationsColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblOutSideTest);

    }

    private void setInvestigationsColumnsWidths() {
        TableColumn column;
        for (int i = 0; i < tblOutSideTest.getColumnCount(); i++) {
            column = tblOutSideTest.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(250);
            } else if (i == 1) {
                column.setPreferredWidth(60);
            } else if (i == 2) {
                column.setPreferredWidth(100);
            } else {
                column.setPreferredWidth(60);
            }
        }
    }

    private void txtTestNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTestNameActionPerformed
        // TODO add your handling code here:

        String qeury = "SELECT CPT_ID ID , DESCRIPTION FROM "
                + Database.DCMS.CPT
                + " WHERE DESCRIPTION LIKE '%" + txtTestName.getText() + "%'";

        lov.LOVSelection(qeury, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        txtTestName.setText(Constants.lovDescription);
        cptId = Constants.lovID;
        txtHealthFacility.requestFocus();

    }//GEN-LAST:event_txtTestNameActionPerformed

    private void btnEditInvestigationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInvestigationActionPerformed
        // TODO add your handling code here:
        if (tblOutSideTest.getSelectedRow() < 0 || listInvestigations.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Select Current Investigation"
                    + "From Table First!");
            return;
        }

        OutsideInvestigation investigation = listInvestigations.get(
                tblOutSideTest.getSelectedRow());
        investigation.setCptId(cptId);
        investigation.setTestName(txtTestName.getText().toUpperCase());
        investigation.setHealthCareFacilityId(healthFacilityId);
        setDate(Integer.parseInt(investigation.getReportDay()));
        investigation.setReportDate(performDate);

        if (ctlInvestigation.updateOutsideInvestigation(investigation)) {
            //JOptionPane.showMessageDialog(null, "Successfully Updated!");
            searchOutsideInvestigations();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Investigation\n"
                    + "Please Contact Administrator");
        }

    }//GEN-LAST:event_btnEditInvestigationActionPerformed

    private void btnSaveReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveReportActionPerformed
        // TODO add your handling code here:
        if (tblOutSideTest.getSelectedRow() < 0 || listInvestigations.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Select Current Investigation"
                    + "From Table First!");
            return;
        }
        if (txtReport.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Write Remarks.");
            txtReport.requestFocus();
            return;
        }
        OutsideInvestigation ObjId = listInvestigations.get(tblOutSideTest.getSelectedRow());
        if (ctlInvestigation.updateReport(ObjId.getId(), txtReport.getText().trim())) {
            JOptionPane.showMessageDialog(null, "Saved Successfully!");
            selectedInvestigation.setReportRermarks(txtReport.getText());
            txtReport.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Save Report\n"
                    + "Please Contact Administrator");
        }

    }//GEN-LAST:event_btnSaveReportActionPerformed

    private void btnDeleteInvestigationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteInvestigationActionPerformed
        // TODO add your handling code here:
        if (tblOutSideTest.getSelectedRow() < 0 || listInvestigations.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Select Current Investigation"
                    + "From Table First!");
            return;
        }
        if (ctlInvestigation.deleteOutsideInvestigation(
                selectedInvestigation.getId())) {
            searchOutsideInvestigations();
            
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Delete Record\n"
                    + "Please Contact Administrator");
        }

    }//GEN-LAST:event_btnDeleteInvestigationActionPerformed

    private void txtHealthFacilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthFacilityActionPerformed
        // TODO add your handling code here:
        String query = " SELECT DT.ID ID, DT.DESCRIPTION DESCRIPTION FROM       \n"
                + Database.DCMS.definitionTypeDetail + " DT                     \n"
                + " WHERE DT.DEF_TYPE_ID = '" + DefinitionTypes.healthFacility + "'"
                + " AND upper(DT.DESCRIPTION) LIKE '%"
                + txtHealthFacility.getText().trim().toUpperCase() + "%'        \n"
                //                + " AND DT.ID NOT IN (SELECT HEALTHCARE_FACILITY_ID FROM        \n"
                //                + Database.DCMS.outsideInvestigations
                //                + " WHERE CON = '" + con + "' AND ODI = '" + odi + "')          \n"
                + " ORDER BY ID";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        healthFacilityId = Constants.lovID;
        txtHealthFacility.setText(Constants.lovDescription);
        txtPerformDate.requestFocus();
    }//GEN-LAST:event_txtHealthFacilityActionPerformed

    private void txtPreviousTestNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreviousTestNameActionPerformed
        // TODO add your handling code here:
        searchOutsideInvestigations();
//        searchPreviousOutsideInvestigations();
    }//GEN-LAST:event_txtPreviousTestNameActionPerformed

    private void btnFilterSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterSearchActionPerformed
        // TODO add your handling code here:
        searchOutsideInvestigations();
    }//GEN-LAST:event_btnFilterSearchActionPerformed

    private void btnDeleteInvestigation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteInvestigation1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteInvestigation1ActionPerformed

    private void btnShowWebcamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowWebcamActionPerformed
        try {
            webcam = Webcam.getDefault();
            webcam.setViewSize(WebcamResolution.VGA.getSize());
            webcam.open();

            WebcamPanel panel = new WebcamPanel(webcam);
            panel.setFPSDisplayed(true);
            panel.setSize(jPanel5.getSize());
            jPanel5.add(panel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnShowWebcamActionPerformed

    private void btnAttachEmployeeDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachEmployeeDocActionPerformed
        // TODO add your handling code here:

        if (webcam == null) {
            return;

        }
        BufferedImage image = webcam.getImage();
        String path = "";

        try {
            path = System.getProperty("java.io.tmpdir") + con + odi + ".jpg";
            ImageIO.write(image, "JPG", new File(path));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Unable to Capture Picture!\n"
                    + "Please Contact Administrator");
            return;
        }
        OutsideInvestigation investigation = listInvestigations.get(
                tblOutSideTest.getSelectedRow());
        if (ctlInvestigation.updateReportImage(path, Integer.parseInt(investigation.getId()))) {
            searchOutsideInvestigations();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save picture Kindly Contact Administrator");
            webcam.close();
            return;
        }
        webcam.close();

    }//GEN-LAST:event_btnAttachEmployeeDocActionPerformed

    private void btnBrowseWebcamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseWebcamActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("C:\\"));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Documents", "jpg");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        if (chooser.getSelectedFile() != null) {
            String path = chooser.getSelectedFile().getAbsolutePath();
            OutsideInvestigation investigation = listInvestigations.get(
                    tblOutSideTest.getSelectedRow());
            if (ctlInvestigation.updateReportImage(path, Integer.parseInt(investigation.getId()))) {
                searchOutsideInvestigations();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save picture Kindly Contact Administrator");
                webcam.close();
                return;
            }

        }
    }//GEN-LAST:event_btnBrowseWebcamActionPerformed

    private void txtPerformDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerformDateActionPerformed
        // TODO add your handling code here:
        if (txtPerformDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Ultrasound E.D.D DD-MON-YY",
                    "Gaynee Parameter", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        performDate = dateFormat.format(txtPerformDate.getDate());
    }//GEN-LAST:event_txtPerformDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddInvestigation;
    private javax.swing.JButton btnAttachEmployeeDoc;
    private javax.swing.JButton btnBrowseWebcam;
    private javax.swing.JButton btnDeleteInvestigation;
    private javax.swing.JButton btnDeleteInvestigation1;
    private javax.swing.JButton btnEditInvestigation;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFilterSearch;
    private javax.swing.JButton btnSaveReport;
    private javax.swing.JButton btnShowWebcam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblOutSideTest;
    private javax.swing.JTextField txtConsultantDate;
    private javax.swing.JTextField txtConsultantName;
    private javax.swing.JTextField txtHealthFacility;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private org.jdesktop.swingx.JXDatePicker txtPerformDate;
    private javax.swing.JTextArea txtPreviousReport;
    private javax.swing.JTextField txtPreviousTestName;
    private javax.swing.JTextArea txtReport;
    private javax.swing.JTextField txtTestName;
    // End of variables declaration//GEN-END:variables

    private void setDate(int day) {
        try {
            Date date = new Date();
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, day);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date2 = dateFormat.parse(dateFormat.format(c.getTime()));
            txtPerformDate.setDate(date2);
            performDate = dateFormat.format(date2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setDemography() {
        txtPatientId.setText(patientId);
        txtPatientName.setText(Constants.opd.getPatientName());
        txtConsultantName.setText(Constants.opd.getConsultantName());
        txtConsultantDate.setText(Constants.opd.getConsultancyDate());
        txtTestName.setBackground(new Color(204, 255, 204));
    }
}
