package Form.OPD;

import BO.OPD.PatientHospitalVisit;
import Controller.OPD.GayneeParameterController;
import TableModel.OPD.GayneeParameterListTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.DisplayLOV;

public class frmGayneeParameters extends javax.swing.JInternalFrame {

    private String procedureId = "";
    private String patientId = "001001898573";
    private String referenceId = "1256";

    List<PatientHospitalVisit> listGayneeParam = new ArrayList();
    List<PatientHospitalVisit> listFianlParameters = new ArrayList();

    public frmGayneeParameters() {

        initComponents();
        this.setSize(Constants.xSize - 70, Constants.ySize + 100);

        btnExit.setMnemonic(KeyEvent.VK_X);
        btnClear.setMnemonic(KeyEvent.VK_C);
        btnSave.setMnemonic(KeyEvent.VK_S);
        btnFianlSign.setMnemonic(KeyEvent.VK_F);
        selectGayneeParameter();
    }
    DisplayLOV lov = new DisplayLOV();
    GayneeParameterController ctlGayneeParameter = new GayneeParameterController();
    PatientHospitalVisit objSave = new PatientHospitalVisit();
    PatientHospitalVisit gayneeParameterObj = new PatientHospitalVisit();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAgeGender = new javax.swing.JTextField();
        txtWard = new javax.swing.JTextField();
        txtAdmissionNumber = new javax.swing.JTextField();
        txtBed = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPrimaryPhy = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtClient = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtNoOfFoetus = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtFl = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtLiePresentation = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtPlacenta = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtFca = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtLiquor = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtCrlBpd = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtEdd = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtAnyAbnormality = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblGyaneeParameter = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnFianlSign = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Gaynee Parameters");
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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gaynee Parameters", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Patient Id : ");

        txtPatientId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPatientIdMouseClicked(evt);
            }
        });
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Admission No : ");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Patient Name : ");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Ward Name : ");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Age Gender : ");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Bed : ");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Primary Phy. : ");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Client name : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtAdmissionNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientName)
                            .addComponent(txtWard))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBed, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(txtAgeGender)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClient, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgeGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmissionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrimaryPhy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parameters Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("No of Foetus : ");

        txtNoOfFoetus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNoOfFoetusMouseClicked(evt);
            }
        });
        txtNoOfFoetus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfFoetusActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("F.L. : ");

        txtFl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFlMouseClicked(evt);
            }
        });
        txtFl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Lie Presentation : ");

        txtLiePresentation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLiePresentationMouseClicked(evt);
            }
        });
        txtLiePresentation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLiePresentationActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Placenta : ");

        txtPlacenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPlacentaMouseClicked(evt);
            }
        });
        txtPlacenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacentaActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("FCA : ");

        txtFca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFcaMouseClicked(evt);
            }
        });
        txtFca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFcaActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Liquor : ");

        txtLiquor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLiquorMouseClicked(evt);
            }
        });
        txtLiquor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLiquorActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("CRL/ B.P.D : ");

        txtCrlBpd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCrlBpdMouseClicked(evt);
            }
        });
        txtCrlBpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCrlBpdActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("E.D.D : ");

        txtEdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEddMouseClicked(evt);
            }
        });
        txtEdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEddActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Any Abnormality : ");

        txtAnyAbnormality.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAnyAbnormalityMouseClicked(evt);
            }
        });
        txtAnyAbnormality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnyAbnormalityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNoOfFoetus)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(txtLiePresentation)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFca)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCrlBpd)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFl)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPlacenta)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLiquor)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEdd)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAnyAbnormality))
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNoOfFoetus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLiePresentation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCrlBpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlacenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLiquor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnyAbnormality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel8.setBackground(new java.awt.Color(Constants.red, Constants.green, Constants.black));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parameters List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblGyaneeParameter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Sr.", "No. of Foetus","Lie Presentation", "FCA", "CRL/ B.P.D", "F.L",
                "Placenta", "Liquor", "EDD", "Abnormality"
            }
        ));
        tblGyaneeParameter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGyaneeParameterMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblGyaneeParameterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblGyaneeParameterMouseReleased(evt);
            }
        });
        tblGyaneeParameter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblGyaneeParameterKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(tblGyaneeParameter);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnFianlSign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFianlSign.setForeground(new java.awt.Color(0, 51, 153));
        btnFianlSign.setText("Final Sign");
        btnFianlSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFianlSignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnFianlSign, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnClear)
                    .addComponent(btnExit)
                    .addComponent(btnFianlSign))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPatientIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdMouseClicked

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtNoOfFoetusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNoOfFoetusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfFoetusMouseClicked

    private void txtNoOfFoetusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfFoetusActionPerformed
        // TODO add your handling code here:
        txtLiePresentation.requestFocus();
    }//GEN-LAST:event_txtNoOfFoetusActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(!chkFields()){
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Save the Patient Parameters.");
        if (confirmation != 0) {
            return;
        }
        objSave.setIsFinal("N");
        saveRecord();
        selectGayneeParameter();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnFianlSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFianlSignActionPerformed
        // TODO add your handling code here:
        if(!chkFields()){
            return;
        }
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "To Final the Patient Parameters.");
        if (confirmation != 0) {
            return;
        }
        objSave.setIsFinal("Y");
        saveRecord();
        selectGayneeParameter();
    }//GEN-LAST:event_btnFianlSignActionPerformed

    private void txtFlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFlMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlMouseClicked

    private void txtFlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlActionPerformed
        // TODO add your handling code here:
        txtPlacenta.requestFocus();
    }//GEN-LAST:event_txtFlActionPerformed

    private void txtLiePresentationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLiePresentationMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLiePresentationMouseClicked

    private void txtLiePresentationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLiePresentationActionPerformed
        // TODO add your handling code here:
        txtFca.requestFocus();
    }//GEN-LAST:event_txtLiePresentationActionPerformed

    private void txtPlacentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlacentaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacentaMouseClicked

    private void txtPlacentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacentaActionPerformed
        // TODO add your handling code here:
        txtLiquor.requestFocus();
    }//GEN-LAST:event_txtPlacentaActionPerformed

    private void txtFcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFcaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFcaMouseClicked

    private void txtFcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFcaActionPerformed
        // TODO add your handling code here:
        txtCrlBpd.requestFocus();
    }//GEN-LAST:event_txtFcaActionPerformed

    private void txtLiquorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLiquorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLiquorMouseClicked

    private void txtLiquorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLiquorActionPerformed
        // TODO add your handling code here:
        txtEdd.requestFocus();
    }//GEN-LAST:event_txtLiquorActionPerformed

    private void txtCrlBpdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCrlBpdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCrlBpdMouseClicked

    private void txtCrlBpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrlBpdActionPerformed
        // TODO add your handling code here:
        txtFl.requestFocus();
    }//GEN-LAST:event_txtCrlBpdActionPerformed

    private void txtEddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEddMouseClicked

    private void txtEddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEddActionPerformed
        // TODO add your handling code here:
        txtAnyAbnormality.requestFocus();
    }//GEN-LAST:event_txtEddActionPerformed

    private void txtAnyAbnormalityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAnyAbnormalityMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnyAbnormalityMouseClicked

    private void txtAnyAbnormalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnyAbnormalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnyAbnormalityActionPerformed

    private void tblGyaneeParameterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGyaneeParameterMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblGyaneeParameterMouseClicked

    private void tblGyaneeParameterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGyaneeParameterMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGyaneeParameterMousePressed

    private void tblGyaneeParameterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGyaneeParameterMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGyaneeParameterMouseReleased

    private void tblGyaneeParameterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblGyaneeParameterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGyaneeParameterKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFianlSign;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblGyaneeParameter;
    private javax.swing.JTextField txtAdmissionNumber;
    private javax.swing.JTextField txtAgeGender;
    private javax.swing.JTextField txtAnyAbnormality;
    private javax.swing.JTextField txtBed;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtCrlBpd;
    private javax.swing.JTextField txtEdd;
    private javax.swing.JTextField txtFca;
    private javax.swing.JTextField txtFl;
    private javax.swing.JTextField txtLiePresentation;
    private javax.swing.JTextField txtLiquor;
    private javax.swing.JTextField txtNoOfFoetus;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPlacenta;
    private javax.swing.JTextField txtPrimaryPhy;
    private javax.swing.JTextField txtWard;
    // End of variables declaration//GEN-END:variables

    private void setInsertData() {
        objSave.setPatientId(patientId);
        objSave.setReferenceId(referenceId);
        objSave.setNoOfFoetus(txtNoOfFoetus.getText().trim().replaceAll(",", " ")
                .replaceAll("'", "''"));
        objSave.setLiePresentation(txtLiePresentation.getText().trim().replaceAll(",", " ")
                .replaceAll("'", "''"));
        objSave.setFCA(txtFca.getText().trim().replaceAll(",", " ")
                .replaceAll("'", "''"));
        objSave.setCrlBpd(txtCrlBpd.getText().trim().replaceAll(",", " ")
                .replaceAll("'", "''"));
        objSave.setFL(txtFl.getText().trim().replaceAll(",", " ")
                .replaceAll("'", "''"));
        objSave.setPlacenta(txtPlacenta.getText().trim().replaceAll(",", " ")
                .replaceAll("'", "''"));
        objSave.setLiquor(txtLiquor.getText().trim().replaceAll(",", " ")
                .replaceAll("'", "''"));
        objSave.setEDD(txtEdd.getText().trim().replaceAll(",", " ")
                .replaceAll("'", "''"));
        objSave.setAnyAbnormality(txtAnyAbnormality.getText().trim().replaceAll(",", " ")
                .replaceAll("'", "''"));
    }

    private void selectGayneeParameter() {
        clear();
        listGayneeParam = ctlGayneeParameter.selectGayneeParameter(patientId, "");
        if (!listGayneeParam.isEmpty()) {
            for (int i = 0; i < listGayneeParam.size(); i++) {
                gayneeParameterObj = listGayneeParam.get(i);
                if (gayneeParameterObj.getIsFinal().equalsIgnoreCase("Y")) {
                    listFianlParameters.add(gayneeParameterObj);
                }
                if (gayneeParameterObj.getIsFinal().equalsIgnoreCase("N")) {
                    setDataInTextBox();
                }
            }
            tblGyaneeParameter.setModel(new GayneeParameterListTableModel(listFianlParameters));
            ListSelectionModel selectionModel = tblGyaneeParameter.getSelectionModel();
            tblGyaneeParameter.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            setParameterListColumnsWidths();
            selectionModel.setSelectionInterval(0, 0);
            Constants.tablelook.setJTableEnvironment(tblGyaneeParameter);
        } else {
            System.out.println("Data is not Availabe of this patient.");
        }
    }

    private void setParameterListColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblGyaneeParameter.getColumnCount(); i++) {
            column = tblGyaneeParameter.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(75);
            } else if (i == 2) {
                column.setPreferredWidth(65);
            } else if (i == 3) {
                column.setPreferredWidth(40);
            } else if (i == 4) {
                column.setPreferredWidth(60);
            } else if (i == 5) {
                column.setPreferredWidth(40);
            } else if (i == 6) {
                column.setPreferredWidth(50);
            } else if (i == 7) {
                column.setPreferredWidth(50);
            } else if (i == 8) {
                column.setPreferredWidth(50);
            } else if (i == 9) {
                column.setPreferredWidth(70);
            }
        }
    }

    private void setDataInTextBox() {

        if (gayneeParameterObj.getIsFinal().equalsIgnoreCase("Y")) {
            return;
        }
        txtNoOfFoetus.setText(gayneeParameterObj.getNoOfFoetus());
        txtLiePresentation.setText(gayneeParameterObj.getLiePresentation());
        txtFca.setText(gayneeParameterObj.getFCA());
        txtCrlBpd.setText(gayneeParameterObj.getCrlBpd());
        txtFl.setText(gayneeParameterObj.getFL());
        txtPlacenta.setText(gayneeParameterObj.getPlacenta());
        txtLiquor.setText(gayneeParameterObj.getLiquor());
        txtEdd.setText(gayneeParameterObj.getEDD());
        txtAnyAbnormality.setText(gayneeParameterObj.getAnyAbnormality());

    }

    private void saveRecord() {
        listGayneeParam = ctlGayneeParameter.selectGayneeParameter(patientId,
                referenceId);
        setInsertData();
        if (listGayneeParam.isEmpty()) {
            if (ctlGayneeParameter.insertGayneeParameters(objSave)) {
                JOptionPane.showMessageDialog(null, "Record save Sucesssfully");
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save! Kindly contact "
                        + "Administrator.");
            }
        }
        if (!listGayneeParam.isEmpty()) {
            if (ctlGayneeParameter.updateGayneeParameters(objSave)) {
                JOptionPane.showMessageDialog(null, "Record save Sucesssfully");
            } else {
                JOptionPane.showMessageDialog(null, "Unable to save! Kindly contact "
                        + "Administrator.");
            }
        }
    }

    public void clear() {
        txtNoOfFoetus.setText("");
        txtLiePresentation.setText("");
        txtFca.setText("");
        txtCrlBpd.setText("");
        txtFl.setText("");
        txtPlacenta.setText("");
        txtLiquor.setText("");
        txtEdd.setText("");
        txtAnyAbnormality.setText("");
        listFianlParameters.clear();
        listGayneeParam.clear();
        tblGyaneeParameter.setModel(new GayneeParameterListTableModel(listGayneeParam));
    }

    private boolean chkFields() {
        boolean ret = true;
        if (txtNoOfFoetus.getText().length() == 0 ) {
            JOptionPane.showMessageDialog(null, "Kindly enter No of Foetus");
            txtNoOfFoetus.requestFocus();
            return false;
        }
        if (txtLiePresentation.getText().length() == 0 ) {
            JOptionPane.showMessageDialog(null, "Kindly enter Lie Presentation");
            txtLiePresentation.requestFocus();
            return false;
        }
        if (txtFca.getText().length() == 0 ) {
            JOptionPane.showMessageDialog(null, "Kindly enter FCA.");
            txtFca.requestFocus();
            return false;
        }
        if (txtCrlBpd.getText().length() == 0 ) {
            JOptionPane.showMessageDialog(null, "Kindly enter CRL/ B.P.D");
            txtCrlBpd.requestFocus();
            return false;
        }
        if (txtFl.getText().length() == 0 ) {
            JOptionPane.showMessageDialog(null, "Kindly enter F.L");
            txtFl.requestFocus();
            return false;
        }
        if (txtPlacenta.getText().length() == 0 ) {
            JOptionPane.showMessageDialog(null, "Kindly enter Placenta.");
            txtPlacenta.requestFocus();
            return false;
        }
        if (txtLiquor.getText().length() == 0 ) {
            JOptionPane.showMessageDialog(null, "Kindly enter Liquor.");
            txtLiquor.requestFocus();
            return false;
        }
        if (txtEdd.getText().length() == 0 ) {
            JOptionPane.showMessageDialog(null, "Kindly enter EDD.");
            txtEdd.requestFocus();
            return false;
        }
        if (txtAnyAbnormality.getText().length() == 0 ) {
            JOptionPane.showMessageDialog(null, "Kindly enter Any Abnormality");
            txtAnyAbnormality.requestFocus();
            return false;
        }
        
        return ret;
    }
}
