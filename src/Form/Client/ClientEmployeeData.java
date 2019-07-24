package Form.Client;

import BO.Patient;
import Controller.Client.AttachEmployeePicController;
import Controller.Client.EmployeeDataController;
import Controller.PatientController;
import Form.general.DCMS_MDI;
import TableModel.Client.TableModelClientWiseEmployee;
import TableModel.Client.TableModelEmployeeDocumentInfo;
import TableModel.Client.TableModelEmployeeInfo;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Clients;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.GUIUtils;
import utilities.Rights;
import utilities.TypeDetailId;

public class ClientEmployeeData extends javax.swing.JInternalFrame {

    private String docTypeId = "";
    private String approvalTypeId = "";

    public ClientEmployeeData() {

        initComponents();
        this.setSize(Constants.xSize - 30, 780);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel()
        ;
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblClientWiseEmployee = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        btnDeleteDocument = new javax.swing.JButton();
        btnAllowMedical = new javax.swing.JButton();
        btnDisAllowMedical = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtSearchClient = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtSearchEmpId = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        txtRank = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtDesignation = new javax.swing.JTextField();
        txtSearchPatientId = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel()
        ;
        jLabel21 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        txtCnic = new javax.swing.JTextField();
        txtRelation = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtDOB = new javax.swing.JTextField();
        txtMaritalStatus = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        cboActive = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        lblAttachedPicture = new javax.swing.JLabel();
        btnShowCam = new javax.swing.JButton();
        btnInactiveEmployee2 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        txtEmergencyContactNo = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        ChkNotCnic = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblEmpDocInfo = new javax.swing.JTable();
        txtEmployeeDocType = new javax.swing.JTextField();
        btnInactiveEmployee1 = new javax.swing.JButton();
        btnShowWebcam = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblPicture = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtApproval = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnExitAssign = new javax.swing.JButton();
        btnInactiveEmployee = new javax.swing.JButton();
        btnGenerateMrNo = new javax.swing.JButton();
        txtPatientIdDisplay = new javax.swing.JTextField();
        btnUpdateMrNo = new javax.swing.JButton();
        btnUpdateEmployee = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle(Constants.title+" Organization Employee Information");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1050, 750));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel10.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Employee Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        tblClientWiseEmployee.setBackground(java.awt.SystemColor.activeCaption);
        tblClientWiseEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null,null}
            },
            new String [] {"Name","Relation","CNIC"}));
    tblClientWiseEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblClientWiseEmployeeMouseClicked(evt);
        }
        public void mousePressed(java.awt.event.MouseEvent evt) {
            tblClientWiseEmployeeMousePressed(evt);
        }
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            tblClientWiseEmployeeMouseReleased(evt);
        }
    });
    tblClientWiseEmployee.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            tblClientWiseEmployeePropertyChange(evt);
        }
    });
    tblClientWiseEmployee.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            tblClientWiseEmployeeKeyPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            tblClientWiseEmployeeKeyReleased(evt);
        }
    });
    jScrollPane6.setViewportView(tblClientWiseEmployee);

    javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
    jPanel10.setLayout(jPanel10Layout);
    jPanel10Layout.setHorizontalGroup(
        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
    );
    jPanel10Layout.setVerticalGroup(
        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
    );

    jPanel13.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
    jPanel13.setForeground(new java.awt.Color(104, 0, 0));

    btnDeleteDocument.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    btnDeleteDocument.setText("Delete Document");
    btnDeleteDocument.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDeleteDocumentActionPerformed(evt);
        }
    });

    btnAllowMedical.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    btnAllowMedical.setText("Allow Medical");
    btnAllowMedical.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAllowMedicalActionPerformed(evt);
        }
    });

    btnDisAllowMedical.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    btnDisAllowMedical.setText("Disallowed ");
    btnDisAllowMedical.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDisAllowMedicalActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
    jPanel13.setLayout(jPanel13Layout);
    jPanel13Layout.setHorizontalGroup(
        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel13Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btnAllowMedical, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnDisAllowMedical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnDeleteDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel13Layout.setVerticalGroup(
        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnDeleteDocument)
                .addComponent(btnAllowMedical)
                .addComponent(btnDisAllowMedical)))
    );

    jPanel11.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Employee Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

    jLabel14.setBackground(new java.awt.Color(255, 255, 255));
    jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel14.setForeground(new java.awt.Color(102, 0, 0));
    jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel14.setText("Employee ID : ");

    txtSearchClient.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtSearchClient.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtSearchClientActionPerformed(evt);
        }
    });
    txtSearchClient.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtSearchClientKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtSearchClientKeyTyped(evt);
        }
    });

    btnSearch.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    btnSearch.setText("Search");
    btnSearch.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSearchActionPerformed(evt);
        }
    });

    jLabel20.setBackground(new java.awt.Color(255, 255, 255));
    jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel20.setForeground(new java.awt.Color(102, 0, 0));
    jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel20.setText(" Organization : ");

    txtSearchEmpId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtSearchEmpId.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtSearchEmpIdActionPerformed(evt);
        }
    });
    txtSearchEmpId.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtSearchEmpIdKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtSearchEmpIdKeyTyped(evt);
        }
    });

    jLabel22.setBackground(new java.awt.Color(255, 255, 255));
    jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel22.setForeground(new java.awt.Color(102, 0, 0));
    jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel22.setText("Designation : ");

    txtEmployeeName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtEmployeeName.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtEmployeeNameActionPerformed(evt);
        }
    });
    txtEmployeeName.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtEmployeeNameKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtEmployeeNameKeyTyped(evt);
        }
    });

    txtRank.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtRank.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtRankActionPerformed(evt);
        }
    });
    txtRank.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtRankKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtRankKeyTyped(evt);
        }
    });

    jLabel23.setBackground(new java.awt.Color(255, 255, 255));
    jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel23.setForeground(new java.awt.Color(102, 0, 0));
    jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel23.setText("Rank/Grade :");

    txtDesignation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtDesignation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtDesignationActionPerformed(evt);
        }
    });
    txtDesignation.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtDesignationKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtDesignationKeyTyped(evt);
        }
    });

    txtSearchPatientId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtSearchPatientId.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtSearchPatientIdActionPerformed(evt);
        }
    });
    txtSearchPatientId.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtSearchPatientIdKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtSearchPatientIdKeyTyped(evt);
        }
    });

    jLabel24.setBackground(new java.awt.Color(255, 255, 255));
    jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel24.setForeground(new java.awt.Color(102, 0, 0));
    jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel24.setText("Patient Id:");

    jLabel25.setBackground(new java.awt.Color(255, 255, 255));
    jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel25.setForeground(new java.awt.Color(102, 0, 0));
    jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel25.setText("Name : ");

    javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
    jPanel11.setLayout(jPanel11Layout);
    jPanel11Layout.setHorizontalGroup(
        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel11Layout.createSequentialGroup()
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
            .addGap(0, 0, 0)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addComponent(txtDesignation)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel23)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtRank))
                .addComponent(txtEmployeeName)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                    .addComponent(txtSearchEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtSearchPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addComponent(txtSearchClient, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel11Layout.setVerticalGroup(
        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel11Layout.createSequentialGroup()
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtSearchEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel24)
                .addComponent(txtSearchPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel20)
                .addComponent(txtSearchClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnSearch))
            .addGap(7, 7, 7)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel25))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel22)
                .addComponent(txtRank, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel23)
                .addComponent(txtDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16), new java.awt.Color(102, 0, 0))); // NOI18N

    jLabel21.setBackground(new java.awt.Color(255, 255, 255));
    jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel21.setForeground(new java.awt.Color(102, 0, 0));
    jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel21.setText("Patient Id :");

    txtPatientId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    txtPatientId.setForeground(new java.awt.Color(102, 0, 0));
    txtPatientId.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtPatientIdActionPerformed(evt);
        }
    });
    txtPatientId.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtPatientIdKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtPatientIdKeyTyped(evt);
        }
    });

    txtAge.setEditable(false);
    txtAge.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtAge.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtAgeActionPerformed(evt);
        }
    });
    txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtAgeKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtAgeKeyTyped(evt);
        }
    });

    txtPatientName.setEditable(false);
    txtPatientName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtPatientName.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtPatientNameActionPerformed(evt);
        }
    });
    txtPatientName.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtPatientNameKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtPatientNameKeyTyped(evt);
        }
    });

    jLabel30.setBackground(new java.awt.Color(255, 255, 255));
    jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel30.setForeground(new java.awt.Color(102, 0, 0));
    jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel30.setText("Age/Gender :");

    jLabel33.setBackground(new java.awt.Color(255, 255, 255));
    jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel33.setForeground(new java.awt.Color(102, 0, 0));
    jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel33.setText("Address :");

    jLabel34.setBackground(new java.awt.Color(255, 255, 255));
    jLabel34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel34.setForeground(new java.awt.Color(102, 0, 0));
    jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel34.setText("Contact No :");

    jLabel35.setBackground(new java.awt.Color(255, 255, 255));
    jLabel35.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel35.setForeground(new java.awt.Color(102, 0, 0));
    jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel35.setText("Relation :");

    jLabel36.setBackground(new java.awt.Color(255, 255, 255));
    jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel36.setForeground(new java.awt.Color(102, 0, 0));
    jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel36.setText("CNIC No :");

    txtContactNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtContactNo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtContactNoActionPerformed(evt);
        }
    });
    txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtContactNoKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtContactNoKeyTyped(evt);
        }
    });

    txtCnic.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtCnic.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtCnicActionPerformed(evt);
        }
    });
    txtCnic.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtCnicKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtCnicKeyTyped(evt);
        }
    });

    txtRelation.setEditable(false);
    txtRelation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtRelation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtRelationActionPerformed(evt);
        }
    });
    txtRelation.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtRelationKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtRelationKeyTyped(evt);
        }
    });

    jLabel38.setBackground(new java.awt.Color(255, 255, 255));
    jLabel38.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel38.setForeground(new java.awt.Color(102, 0, 0));
    jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel38.setText("DOB :");

    txtAddress.setColumns(20);
    txtAddress.setLineWrap(true);
    txtAddress.setRows(5);
    txtAddress.setWrapStyleWord(true);
    jScrollPane1.setViewportView(txtAddress);

    txtDOB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtDOB.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtDOBActionPerformed(evt);
        }
    });
    txtDOB.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtDOBKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtDOBKeyTyped(evt);
        }
    });

    txtMaritalStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtMaritalStatus.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtMaritalStatusActionPerformed(evt);
        }
    });
    txtMaritalStatus.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtMaritalStatusKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtMaritalStatusKeyTyped(evt);
        }
    });

    jLabel37.setBackground(new java.awt.Color(255, 255, 255));
    jLabel37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel37.setForeground(new java.awt.Color(102, 0, 0));
    jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel37.setText("Martial Status:");

    cboActive.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Y", "N" }));
    cboActive.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cboActiveActionPerformed(evt);
        }
    });

    jLabel40.setBackground(new java.awt.Color(255, 255, 255));
    jLabel40.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel40.setForeground(new java.awt.Color(102, 0, 0));
    jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel40.setText("Active :");

    jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Picture", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

    jPanel14.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

    lblAttachedPicture.setBackground(new java.awt.Color(255, 255, 255));
    lblAttachedPicture.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    lblAttachedPicture.setForeground(new java.awt.Color(102, 0, 0));
    lblAttachedPicture.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    lblAttachedPicture.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            lblAttachedPictureMouseClicked(evt);
        }
    });

    javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
    jPanel14.setLayout(jPanel14Layout);
    jPanel14Layout.setHorizontalGroup(
        jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(lblAttachedPicture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
    );
    jPanel14Layout.setVerticalGroup(
        jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(lblAttachedPicture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    btnShowCam.setText("Show");
    btnShowCam.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnShowCamActionPerformed(evt);
        }
    });

    btnInactiveEmployee2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
    btnInactiveEmployee2.setText("Attach");
    btnInactiveEmployee2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnInactiveEmployee2ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnShowCam, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnInactiveEmployee2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(btnShowCam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInactiveEmployee2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    jLabel39.setBackground(new java.awt.Color(255, 255, 255));
    jLabel39.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel39.setForeground(new java.awt.Color(102, 0, 0));
    jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel39.setText("Emerg.No :");

    txtEmergencyContactNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtEmergencyContactNo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtEmergencyContactNoActionPerformed(evt);
        }
    });
    txtEmergencyContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtEmergencyContactNoKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtEmergencyContactNoKeyTyped(evt);
        }
    });

    txtGender.setEditable(false);
    txtGender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtGender.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtGenderActionPerformed(evt);
        }
    });
    txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtGenderKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtGenderKeyTyped(evt);
        }
    });

    jLabel41.setBackground(new java.awt.Color(255, 255, 255));
    jLabel41.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel41.setForeground(new java.awt.Color(102, 0, 0));
    jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel41.setText("Cnic Confirm :");

    ChkNotCnic.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    ChkNotCnic.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    ChkNotCnic.setForeground(new java.awt.Color(102, 0, 0));
    ChkNotCnic.setText("Not have Cnic");
    ChkNotCnic.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            ChkNotCnicActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(4, 4, 4)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(txtPatientId)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(txtDOB)
                        .addComponent(txtContactNo)
                        .addComponent(txtMaritalStatus)
                        .addComponent(txtRelation)
                        .addComponent(txtCnic)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtGender))
                        .addComponent(txtEmergencyContactNo, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ChkNotCnic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(5, 5, 5)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboActive, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGap(5, 5, 5))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel21)
                .addComponent(txtPatientId)
                .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cboActive, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel40)
                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39)
                        .addComponent(txtEmergencyContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(7, 7, 7)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRelation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ChkNotCnic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5))
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Scan Docs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

    jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    tblEmpDocInfo.setBackground(java.awt.SystemColor.activeCaption);
    tblEmpDocInfo.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null,null}
        },
        new String [] {"Patient Id", "Name", "Document"}));
tblEmpDocInfo.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblEmpDocInfoMouseClicked(evt);
    }
    public void mousePressed(java.awt.event.MouseEvent evt) {
        tblEmpDocInfoMousePressed(evt);
    }
    public void mouseReleased(java.awt.event.MouseEvent evt) {
        tblEmpDocInfoMouseReleased(evt);
    }
    });
    tblEmpDocInfo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            tblEmpDocInfoPropertyChange(evt);
        }
    });
    tblEmpDocInfo.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            tblEmpDocInfoKeyPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            tblEmpDocInfoKeyReleased(evt);
        }
    });
    jScrollPane8.setViewportView(tblEmpDocInfo);

    txtEmployeeDocType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtEmployeeDocType.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtEmployeeDocTypeActionPerformed(evt);
        }
    });
    txtEmployeeDocType.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtEmployeeDocTypeKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtEmployeeDocTypeKeyTyped(evt);
        }
    });

    btnInactiveEmployee1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    btnInactiveEmployee1.setText("Attach Picture");
    btnInactiveEmployee1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnInactiveEmployee1ActionPerformed(evt);
        }
    });

    btnShowWebcam.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    btnShowWebcam.setText("Show Picture");
    btnShowWebcam.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnShowWebcamActionPerformed(evt);
        }
    });

    jLabel15.setBackground(new java.awt.Color(255, 255, 255));
    jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel15.setForeground(new java.awt.Color(102, 0, 0));
    jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel15.setText("Select : ");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        .addComponent(jScrollPane8)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(2, 2, 2)
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(4, 4, 4)
            .addComponent(txtEmployeeDocType, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnShowWebcam)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnInactiveEmployee1))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGap(3, 3, 3)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(btnShowWebcam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInactiveEmployee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(31, 31, 31))
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtEmployeeDocType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(93, 93, 93))
    );

    jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    lblPicture.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(lblPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(lblPicture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    jPanel7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(101, 0, 0))); // NOI18N

    jLabel16.setBackground(new java.awt.Color(255, 255, 255));
    jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel16.setForeground(new java.awt.Color(102, 0, 0));
    jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel16.setText("Approval Type : ");

    txtApproval.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtApproval.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtApprovalActionPerformed(evt);
        }
    });
    txtApproval.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtApprovalKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtApprovalKeyTyped(evt);
        }
    });

    txtRemarks.setColumns(20);
    txtRemarks.setLineWrap(true);
    txtRemarks.setRows(5);
    txtRemarks.setWrapStyleWord(true);
    jScrollPane2.setViewportView(txtRemarks);

    jLabel17.setBackground(new java.awt.Color(255, 255, 255));
    jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel17.setForeground(new java.awt.Color(102, 0, 0));
    jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel17.setText("Remarks : ");

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(4, 4, 4)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtApproval)
                .addComponent(jScrollPane2))
            .addGap(8, 8, 8))
    );
    jPanel7Layout.setVerticalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtApproval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(4, 4, 4))))
    );

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(4, 4, 4))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel12.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    jPanel12.setForeground(new java.awt.Color(255, 255, 255));

    btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    btnClear.setText("Clear");
    btnClear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnClearActionPerformed(evt);
        }
    });

    btnExitAssign.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    btnExitAssign.setForeground(new java.awt.Color(102, 0, 0));
    btnExitAssign.setText("Exit");
    btnExitAssign.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnExitAssignActionPerformed(evt);
        }
    });

    btnInactiveEmployee.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    btnInactiveEmployee.setText("In Active");
    btnInactiveEmployee.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnInactiveEmployeeActionPerformed(evt);
        }
    });

    btnGenerateMrNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    btnGenerateMrNo.setText("Generate MRNO.");
    btnGenerateMrNo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnGenerateMrNoActionPerformed(evt);
        }
    });

    txtPatientIdDisplay.setEditable(false);
    txtPatientIdDisplay.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    txtPatientIdDisplay.setForeground(new java.awt.Color(204, 0, 0));
    txtPatientIdDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txtPatientIdDisplay.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtPatientIdDisplayActionPerformed(evt);
        }
    });
    txtPatientIdDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txtPatientIdDisplayKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtPatientIdDisplayKeyTyped(evt);
        }
    });

    btnUpdateMrNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    btnUpdateMrNo.setText("Update MRNo.");
    btnUpdateMrNo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUpdateMrNoActionPerformed(evt);
        }
    });

    btnUpdateEmployee.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    btnUpdateEmployee.setText("Update Employee Info");
    btnUpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUpdateEmployeeActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
    jPanel12.setLayout(jPanel12Layout);
    jPanel12Layout.setHorizontalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel12Layout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addComponent(btnUpdateEmployee)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnGenerateMrNo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnUpdateMrNo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtPatientIdDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnInactiveEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnExitAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel12Layout.setVerticalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnExitAssign)
            .addComponent(btnClear)
            .addComponent(btnInactiveEmployee)
            .addComponent(btnGenerateMrNo)
            .addComponent(txtPatientIdDisplay)
            .addComponent(btnUpdateMrNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnUpdateEmployee))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(10, 10, 10))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblClientWiseEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientWiseEmployeeMouseClicked

        if (tblClientWiseEmployee.getSelectedRow() < 0 || listClientWiseEmp.isEmpty()) {
            return;
        }
        if (evt.getClickCount() % 2 == 0) {
            String patientId = tblClientWiseEmployee.getValueAt(tblClientWiseEmployee.getSelectedRow(),
                    3).toString();
//            if (patientId.length() > 4) {
//                System.out.println("patientId = " + patientId);
//                Constants.completePatientId = "001" + patientId;
//                OrderEntryForm fm = new OrderEntryForm();
//                fm.currentPatientId = Constants.completePatientId;
//                fm.searchPatient(Constants.completePatientId);
//                DCMS_MDI.desktopPane.add(fm);
//                Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
//                Dimension fmSize = fm.getSize();
//                fm.setLocation((desktopSize.width - fmSize.width) / 2,
//                        (desktopSize.height - fmSize.height) / 2);
//                fm.setVisible(true);
//                this.dispose();
//            }

        }

    }//GEN-LAST:event_tblClientWiseEmployeeMouseClicked

    private void tblClientWiseEmployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientWiseEmployeeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClientWiseEmployeeMousePressed

    private void tblClientWiseEmployeeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientWiseEmployeeMouseReleased

        clearFields();
        if (tblClientWiseEmployee.getSelectedRow() < 0 || listClientWiseEmp.isEmpty()) {
            return;
        }
        selectClientWiseEmp = listClientWiseEmp.get(tblClientWiseEmployee.getSelectedRow());
        selectEmployeeInfo = listEmpData.get(tblClientWiseEmployee.getSelectedRow());
        setEmployeeInformation();
        selectDocumentInfo(selectClientWiseEmp.getPatientId());
//        if (selectClientWiseEmp.getInfoUpdated().equalsIgnoreCase("N")) {
//            disableFields();
//        } 
    }//GEN-LAST:event_tblClientWiseEmployeeMouseReleased

    private void tblClientWiseEmployeePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblClientWiseEmployeePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClientWiseEmployeePropertyChange

    private void tblClientWiseEmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClientWiseEmployeeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClientWiseEmployeeKeyPressed

    private void tblClientWiseEmployeeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClientWiseEmployeeKeyReleased

    }//GEN-LAST:event_tblClientWiseEmployeeKeyReleased

    private void btnUpdateMrNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMrNoActionPerformed

        if (tblClientWiseEmployee.getSelectedRow() < 0 || listClientWiseEmp.isEmpty()) {
            return;
        }
        if (!checkEmployeeData()) {
            return;
        }
//        if (txtSearchPatientName.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Kindly Select Patient Id to Update");
//            return;
//        }
        int i = JOptionPane.showConfirmDialog(null, "Yyou are going to attached "
                + Constants.completePatientId.substring(3) + "\n with patient Name "
                //    + txtSearchPatientName.getText() + "\n to Employee Id "
                + selectClientWiseEmp.getEmployeeId() + "\n Employee Name = "
                + selectClientWiseEmp.getFullName());

        if (i != 0) {
            return;
        }
        String attachClientId = clientId;
        if (selectClientWiseEmp.getActive().equalsIgnoreCase("N")) {
            attachClientId = Clients.DowHospital;

        }
        if (ctlEmployeeData.updatePatientId(Constants.completePatientId,
                selectClientWiseEmp, attachClientId)) {
            JOptionPane.showMessageDialog(null, "Employee's Information Updated Successfully!");
            selectClientWiseEmp.setPatientId(selectClientWiseEmp.getPatientId());
            tblClientWiseEmployee.setValueAt(Constants.completePatientId.substring(3),
                    tblClientWiseEmployee.getSelectedRow(), 3);
            tblClientWiseEmployee.setValueAt(txtDOB.getText().trim(),
                    tblClientWiseEmployee.getSelectedRow(), 2);
            relationInfo(currentEmployee.getEmployeeId(), clientId);

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Update... Please contact Administrator!");
        }
    }//GEN-LAST:event_btnUpdateMrNoActionPerformed

    private void btnUpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmployeeActionPerformed
        //Scenario 1
        //CheckBox Cnic Not avaialbale
        //if(check){PL_NO + empdetailid(ID) enter of cnic}
        //iscnicavailable(clientempdetail) = N
        //verification_req = 'N' & visit = 2
        //        block user
        //Print 1 slip on checkbox (Do you want to print or not) which shows that you donot have cnic kindly bring it on next visit otherwise you will not entertain 
        //In client table cnic_required column will add to show this client required cnic confirmation or not
        //Scenario 2
        //Cnic in hand but sync process entry is blank then cnic ki attachment mangega attach pe status V hoga.
        //Jb attachment delete ho to verification Y or N krna hai.....
        // TODO add your handling code here:

        if (ChkNotCnic.isSelected()) {
            updateEmpInfo();
        }
        if (!checkEmployeeData()) {
            return;
        }
        if (tblClientWiseEmployee.getSelectedRow() < 0 || listClientWiseEmp.isEmpty()) {
            clearFields();
            return;
        }
    }//GEN-LAST:event_btnUpdateEmployeeActionPerformed

    private void txtSearchClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchClientActionPerformed

        String query = "SELECT ID, DESCRIPTION FROM          \n"
                + Database.DCMS.client + "                   \n"
                + " WHERE UPPER(DESCRIPTION) LIKE '%"
                + txtSearchClient.getText().toUpperCase().trim() + "%'";

        lov.LOVSelection(query, this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            clientId = "";
            return;
        } else {
            clientId = Constants.lovID;
            txtSearchClient.setText(Constants.lovDescription);
            //selectEmployeeInfo("", "", clientId);
        }
        txtSearchEmpId.requestFocus();
    }//GEN-LAST:event_txtSearchClientActionPerformed

    private void txtSearchClientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchClientKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchClientKeyPressed

    private void txtSearchClientKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchClientKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchClientKeyTyped

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        clearFields();
        selectEmployeeInfo();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchEmpIdActionPerformed

        clearFields();
        selectEmployeeInfo();

        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchEmpIdActionPerformed

    private void txtSearchEmpIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchEmpIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchEmpIdKeyPressed

    private void txtSearchEmpIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchEmpIdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchEmpIdKeyTyped

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed

//        if (GUIUtils.completePatientId(txtPatientId.getText().trim())) {
//            Patient patient = ctlPatient.searchPatient(Constants.completePatientId);
//            txtPatientId.setText(patient.getPatientId().substring(3));
//            txtSearchPatientName.setText(patient.getFullName());
//        }//
//        else {
//            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Patient ID");
//        }
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtPatientIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdKeyPressed

    private void txtPatientIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientIdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdKeyTyped

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed

        txtAge.requestFocus();
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed

        txtGender.requestFocus();
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtPatientNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameKeyPressed

    private void txtPatientNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameKeyTyped

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        txtCnic.requestFocus();
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void txtContactNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoKeyPressed

    private void txtContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoKeyTyped

    private void txtCnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnicActionPerformed

    }//GEN-LAST:event_txtCnicActionPerformed

    private void txtCnicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCnicKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnicKeyPressed

    private void txtCnicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCnicKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnicKeyTyped

    private void txtRelationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRelationActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtRelationActionPerformed

    private void txtRelationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRelationKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRelationKeyPressed

    private void txtRelationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRelationKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRelationKeyTyped

    private void lblAttachedPictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAttachedPictureMouseClicked
        // TODO add your handling code here:

//        if (evt.getClickCount() == 2) {
//            AttachDocument attachDoc = new AttachDocument();
//            attachDoc.setEmployeeId(currentEmployee.getId());
//            attachDoc.setClientId(clientId);
//            DialogAttachedDocument frmAttach = new DialogAttachedDocument(null, true, attachDoc);
//            frmAttach.setVisible(true);
//        }
    }//GEN-LAST:event_lblAttachedPictureMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitAssignActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnExitAssignActionPerformed

    private void btnInactiveEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactiveEmployeeActionPerformed
        // TODO add your handling code here:
        if (ctlEmployeeData.updateInactiveEmployee(currentEmployee.getPatientId(),
                currentEmployee.getEmployeeId(), currentEmployee.getClientId())) {
            JOptionPane.showMessageDialog(null, "Employee,s Information Updated Successfully!");

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Update... "
                    + "Please Contact Administrator");
        }
    }//GEN-LAST:event_btnInactiveEmployeeActionPerformed

    private void btnGenerateMrNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateMrNoActionPerformed
        // TODO add your handling code here: 
        if (tblClientWiseEmployee.getSelectedRow() < 0 || listClientWiseEmp.isEmpty()) {
            return;
        }

        if (!checkEmployeeData()) {
            return;
        }
        if (!checkLOVStatus(selectClientWiseEmp)) {
            return;
        }
        int i = JOptionPane.showConfirmDialog(null, " you are going to generate Patient Id"
                + "\n for Employee Id "
                + selectClientWiseEmp.getEmployeeId() + "\n Employee Name = "
                + selectClientWiseEmp.getFullName());

        if (i != 0) {
            return;
        }
        selectClientWiseEmp.setClientId(clientId);
        if (selectClientWiseEmp.getActive().equalsIgnoreCase("N")) {
            selectClientWiseEmp.setClientId(Clients.DowHospital);
        }
        if (ctlEmployeeData.insertPatient(selectClientWiseEmp, "G")) {
            JOptionPane.showMessageDialog(null, "Patient Id Generated Successfully");
            txtPatientId.setText(selectClientWiseEmp.getPatientId().substring(3));
            txtPatientIdDisplay.setText(selectClientWiseEmp.getPatientId().substring(3));
            tblClientWiseEmployee.setValueAt(selectClientWiseEmp.getPatientId().substring(3),
                    tblClientWiseEmployee.getSelectedRow(), 3);
            tblClientWiseEmployee.setValueAt(txtDOB.getText().trim(),
                    tblClientWiseEmployee.getSelectedRow(), 2);
            //relationInfo(currentEmployee.getEmployeeId(), clientId);
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Attach.. "
                    + "Please Contact Administrator");
        }


    }//GEN-LAST:event_btnGenerateMrNoActionPerformed

    private void txtPatientIdDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdDisplayActionPerformed

    private void txtPatientIdDisplayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientIdDisplayKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdDisplayKeyPressed

    private void txtPatientIdDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatientIdDisplayKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdDisplayKeyTyped

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtDOBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDOBKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBKeyPressed

    private void txtDOBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDOBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBKeyTyped

    private void txtMaritalStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaritalStatusActionPerformed

        if (tblClientWiseEmployee.getSelectedRow() < 0 || listClientWiseEmp.isEmpty()) {
            clearFields();
            return;

        }
        lov.LOVDefinitionSelection(utilities.DefinitionTypes.maritalStatus,
                txtMaritalStatus.getText().trim(), this);
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            txtMaritalStatus.setText(Constants.lovDescription);
            selectClientWiseEmp.setMaritalStatusId(Constants.lovID);
            selectClientWiseEmp.setMaritalStatusDescription(Constants.lovDescription);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaritalStatusActionPerformed

    private void txtMaritalStatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaritalStatusKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaritalStatusKeyPressed

    private void txtMaritalStatusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaritalStatusKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaritalStatusKeyTyped

    private void cboActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboActiveActionPerformed

    private void tblEmpDocInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpDocInfoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmpDocInfoMouseClicked

    private void tblEmpDocInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpDocInfoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmpDocInfoMousePressed

    private void tblEmpDocInfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpDocInfoMouseReleased

        Patient SelectForDocument = listDocData.get(tblEmpDocInfo.getSelectedRow());
        try {
            Image procImage = ctlEmployeeData.selectDocumentImage(selectClientWiseEmp.getPatientId(), SelectForDocument.getDocTypeId());
            //Image resizedImage
            //        = procImage.getScaledInstance(lblPicture.getWidth(),
            //                lblPicture.getHeight() - 0, 0);
            ImageIcon icon = new ImageIcon(procImage);
            lblPicture.setIcon(icon);
        } catch (NullPointerException ex) {
            lblPicture.setIcon(null);
        }

        selectEmployeeApproval();

    }//GEN-LAST:event_tblEmpDocInfoMouseReleased

    private void tblEmpDocInfoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblEmpDocInfoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmpDocInfoPropertyChange

    private void tblEmpDocInfoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEmpDocInfoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmpDocInfoKeyPressed

    private void tblEmpDocInfoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEmpDocInfoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmpDocInfoKeyReleased

    private void txtEmployeeDocTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeDocTypeActionPerformed
        // TODO add your handling code here:
        if (tblClientWiseEmployee.getSelectedRow() < 0 || listClientWiseEmp.isEmpty()) {
            clearFields();
            return;

        }

        String query = " SELECT ID , DESCRIPTION  FROM "
                + Database.DCMS.definitionTypeDetail
                + " WHERE DEF_TYPE_ID =  " + DefinitionTypes.clientEmployeeDocType + ""
                + " AND ACTIVE = 'Y' "
                + " AND ID NOT IN (SELECT DOC_TYPE_ID FROM "
                + Database.DCMS.clientEmployeeDocs
                + " WHERE EMP_DETAIL_ID = " + selectClientWiseEmp.getId() + " )";

        lov.LOVSelection(query, this);
        docTypeId = "";
        if (!Constants.lovID.equalsIgnoreCase("ID")) {
            txtEmployeeDocType.setText(Constants.lovDescription);
            docTypeId = Constants.lovID;
        }

    }//GEN-LAST:event_txtEmployeeDocTypeActionPerformed

    private void txtEmployeeDocTypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeDocTypeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeDocTypeKeyPressed

    private void txtEmployeeDocTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeDocTypeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeDocTypeKeyTyped

    private void btnInactiveEmployee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactiveEmployee1ActionPerformed
        // TODO add your handling code here:

        if (docTypeId.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly select document type to Attach");
            return;
        }

        if (webcam == null) {
            return;

        }
        BufferedImage image = webcam.getImage();
        String path = "";

        try {
            path = System.getProperty("java.io.tmpdir") + selectClientWiseEmp.getId() + ".png";
            ImageIO.write(image, "PNG", new File(path));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Unable to Capture Picture!\n"
                    + "Please Contact Administrator");
        }

        if (ctlAtttachDoc.insertEmployeeDoc(selectClientWiseEmp.getPatientId(),
                selectClientWiseEmp.getId(), docTypeId, path, txtAddress.getText())) {
            //JOptionPane.showMessageDialog(null, "Picture Captured Successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to save picture Kindly Contact Administrator");
            webcam.close();
            return;
        }

        webcam.close();
        if (docTypeId.equalsIgnoreCase(TypeDetailId.retiredMedicalCard)) {
            selectClientWiseEmp.setClientId(Clients.retiredEntitled);
            if (ctlEmployeeData.UpdateClientforRetiredMedical(selectClientWiseEmp)) {
            }
        }
    }//GEN-LAST:event_btnInactiveEmployee1ActionPerformed

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

    private void btnShowCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowCamActionPerformed
        try {
            webcam = Webcam.getDefault();
            webcam.setViewSize(WebcamResolution.VGA.getSize());
            webcam.open();

            WebcamPanel panel = new WebcamPanel(webcam);
            panel.setFPSDisplayed(true);
            panel.setSize(lblAttachedPicture.getSize());
            lblAttachedPicture.add(panel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnShowCamActionPerformed

    private void btnInactiveEmployee2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactiveEmployee2ActionPerformed
        //   TODO add your handling code here:
        //  webcam or document
//        final frmAttachEmployeePicture patOrder = new frmAttachEmployeePicture(selectClientWiseEmp);
//        Dimension desktopSize = DCMS_MDI.desktopPane.getSize();
//        Dimension fmSize = patOrder.getSize();
//        patOrder.setLocation((desktopSize.width - fmSize.width) / 2,
//                (desktopSize.height - fmSize.height) / 2);
//        this.getDesktopPane().add(patOrder);
//
//        patOrder.setVisible(true);
    }//GEN-LAST:event_btnInactiveEmployee2ActionPerformed

    private void txtEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNameActionPerformed

    private void txtEmployeeNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNameKeyPressed

    private void txtEmployeeNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNameKeyTyped

    private void txtRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRankActionPerformed

    private void txtRankKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRankKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRankKeyPressed

    private void txtRankKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRankKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRankKeyTyped

    private void btnDeleteDocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDocumentActionPerformed
        if (tblEmpDocInfo.getSelectedRow() < 0 || listDocData.isEmpty()) {
            clearFields();
            return;
        }

        Patient delete = new Patient();
        delete = listDocData.get(tblEmpDocInfo.getSelectedRow());
        String patId = delete.getPatientId();
        String docTypeId = delete.getDocTypeId();

        if (ctlEmployeeData.deleteDocument(patId, docTypeId)) {
            JOptionPane.showMessageDialog(null, "Selected Document Deleted Successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Delete, Please contact Administrator!");
        }
        txtEmployeeDocType.setText("");
        lblPicture.setText("");
        selectDocumentInfo(selectClientWiseEmp.getPatientId());

    }//GEN-LAST:event_btnDeleteDocumentActionPerformed

    private void txtDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesignationActionPerformed

    private void txtDesignationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDesignationKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesignationKeyPressed

    private void txtDesignationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDesignationKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesignationKeyTyped

    private void txtEmergencyContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmergencyContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmergencyContactNoActionPerformed

    private void txtEmergencyContactNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmergencyContactNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmergencyContactNoKeyPressed

    private void txtEmergencyContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmergencyContactNoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmergencyContactNoKeyTyped

    private void txtSearchPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPatientIdActionPerformed

        clearFields();
        selectEmployeeInfo();
    }//GEN-LAST:event_txtSearchPatientIdActionPerformed

    private void txtSearchPatientIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchPatientIdKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPatientIdKeyPressed

    private void txtSearchPatientIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchPatientIdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPatientIdKeyTyped

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtGenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderKeyPressed

    private void txtGenderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderKeyTyped

    private void btnAllowMedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllowMedicalActionPerformed
        if (!checkApprovalData()) {
            return;
        }
        int i = JOptionPane.showConfirmDialog(null, "You are going to Allow Medical to "
                + selectClientWiseEmp.getFullName() + " \nPatient id "
                + selectClientWiseEmp.getPatientId().substring(3));

        if (i != 0) {
            return;
        }

        currentEmployee = new Patient();
        currentEmployee.setClientId(Clients.specialCaseClient);
        currentEmployee.setPatientId(selectClientWiseEmp.getPatientId());
        currentEmployee.setApprovalTypeId(approvalTypeId);
        selectClientWiseEmp.setRemarks(txtRemarks.getText());

        if (ctlEmployeeData.medicineApproval(currentEmployee, selectClientWiseEmp)) {
            JOptionPane.showMessageDialog(null, "Medical Allow Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Allow Medical. \nKindly Contact Administrator.");
        }
    }//GEN-LAST:event_btnAllowMedicalActionPerformed

    private void btnDisAllowMedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisAllowMedicalActionPerformed

        if (tblClientWiseEmployee.getSelectedRow() < 0 || listClientWiseEmp.isEmpty()) {
            return;
        }

        if (!checkEmployeeData()) {
            return;
        }
//        if (!checkLOVStatus(selectClientWiseEmp)) {
//            return;
//        }
        System.out.println("pat name" + selectClientWiseEmp.getFullName());

        int i = JOptionPane.showConfirmDialog(null, " You are going to block Medical Facility to "
                + selectClientWiseEmp.getFullName() + " \nPatient id "
                + selectClientWiseEmp.getPatientId().substring(3));

        if (i != 0) {
            return;
        }
        currentEmployee = new Patient();
        currentEmployee.setClientId(Clients.pofHospital);
        currentEmployee.setPatientId(selectClientWiseEmp.getPatientId());

//        if (selectClientWiseEmp.getActive().equalsIgnoreCase("N")) {
//            selectClientWiseEmp.setClientId(Clients.DowHospital);
//        }
        if (ctlEmployeeData.medicineApproval(currentEmployee, selectClientWiseEmp)) {
            JOptionPane.showMessageDialog(null, "Medical Facility Block Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Block Medical Facility."
                    + "\nKindly Contact Administrator.");
        }
    }//GEN-LAST:event_btnDisAllowMedicalActionPerformed

    private void txtApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApprovalActionPerformed

        lov.LOVDefinitionSelection(DefinitionTypes.medicalApprovalType, txtApproval.getText(), this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtApproval.setText("");

        } else {
            approvalTypeId = Constants.lovID;
            txtApproval.setText(Constants.lovDescription.toUpperCase());
        }
        selectClientWiseEmp.setApprovalTypeId(approvalTypeId);
        txtRemarks.requestFocus();
    }//GEN-LAST:event_txtApprovalActionPerformed

    private void txtApprovalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApprovalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApprovalKeyPressed

    private void txtApprovalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApprovalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApprovalKeyTyped

    private void ChkNotCnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkNotCnicActionPerformed
        if (ChkNotCnic.isSelected()) {

        }
    }//GEN-LAST:event_ChkNotCnicActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkNotCnic;
    private javax.swing.JButton btnAllowMedical;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteDocument;
    private javax.swing.JButton btnDisAllowMedical;
    private javax.swing.JButton btnExitAssign;
    private javax.swing.JButton btnGenerateMrNo;
    private javax.swing.JButton btnInactiveEmployee;
    private javax.swing.JButton btnInactiveEmployee1;
    private javax.swing.JButton btnInactiveEmployee2;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowCam;
    private javax.swing.JButton btnShowWebcam;
    private javax.swing.JButton btnUpdateEmployee;
    private javax.swing.JButton btnUpdateMrNo;
    private javax.swing.JComboBox cboActive;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblAttachedPicture;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JTable tblClientWiseEmployee;
    private javax.swing.JTable tblEmpDocInfo;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtApproval;
    private javax.swing.JTextField txtCnic;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDesignation;
    private javax.swing.JTextField txtEmergencyContactNo;
    private javax.swing.JTextField txtEmployeeDocType;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtMaritalStatus;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientIdDisplay;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtRank;
    private javax.swing.JTextField txtRelation;
    private javax.swing.JTextArea txtRemarks;
    private javax.swing.JTextField txtSearchClient;
    private javax.swing.JTextField txtSearchEmpId;
    private javax.swing.JTextField txtSearchPatientId;
    // End of variables declaration//GEN-END:variables

    List<Patient> listEmpData = new ArrayList<>();
    List<Patient> listDocData = new ArrayList<>();
    List<Patient> listApproval = new ArrayList<>();
    List<Patient> listClientWiseEmp = new ArrayList<>();
    EmployeeDataController ctlEmployeeData = new EmployeeDataController();
    String clientId = "";

    DisplayLOV lov = new DisplayLOV();
    Webcam webcam = null;
    WebcamPanel panel;

    PatientController ctlPatient = new PatientController();
    Patient currentEmployee = new Patient();
    Patient selectClientWiseEmp = new Patient();
    Patient selectDocumentInfo = new Patient();
    Patient selectEmployeeInfo = new Patient();

    private void selectEmployeeInfo() {
        String patId = "";

        if (txtSearchPatientId.getText().trim().length() != 0) {
            if (GUIUtils.completePatientId(txtSearchPatientId.getText().trim())) {
                patId = Constants.completePatientId;
                txtSearchPatientId.setText(patId.substring(3));
            }//
            else {
                JOptionPane.showMessageDialog(null, "Kindly Enter Correct Patient ID");
            }
        }

        listEmpData
                = ctlEmployeeData.selectEmployeeInfo(txtSearchEmpId.getText(), clientId, patId);
        if (listEmpData.isEmpty()) {

            List<Patient> list = new ArrayList();
            Patient usr = new Patient();
            list.add(usr);

            tblClientWiseEmployee.setModel(new TableModelEmployeeInfo(list));
        } else {

            tblClientWiseEmployee.setModel(new TableModelEmployeeInfo(listEmpData));
        }

        ListSelectionModel selectionModel = tblClientWiseEmployee.getSelectionModel();
        tblClientWiseEmployee.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setDeptAccountsColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblClientWiseEmployee);
        if (!listEmpData.isEmpty()) {
            currentEmployee = listEmpData.get(0);
            relationInfo(currentEmployee.getEmployeeId(), currentEmployee.getClientId());
            txtEmployeeName.setText(currentEmployee.getFullName());
            txtSearchClient.setText(currentEmployee.getClientDescription());
            txtSearchPatientId.setText(currentEmployee.getPatientId().substring(3));
            txtRank.setText(currentEmployee.getGrade());
            txtDesignation.setText(currentEmployee.getEmpDesignation());
        }
    }

    public void setDeptAccountsColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblClientWiseEmployee.getColumnCount(); i++) {
            column = tblClientWiseEmployee.getColumnModel().getColumn(i);
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

    private void selectDocumentInfo(String patId) {

        listDocData = ctlEmployeeData.selectEmpDocInfo(patId);  //selectClientWiseEmp.getPatientId()
        if (listDocData.isEmpty()) {
            tblEmpDocInfo.setModel(new TableModelEmployeeDocumentInfo(listDocData));
        } else {
            tblEmpDocInfo.setModel(new TableModelEmployeeDocumentInfo(listDocData));
        }
        tblEmpDocInfo.addRowSelectionInterval(0, 0);
        ListSelectionModel selectionModel = tblEmpDocInfo.getSelectionModel();
        tblEmpDocInfo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setDocumentsColumnsWidths();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblEmpDocInfo);
        if (!listDocData.isEmpty()) {
            return;
        }
    }

    public void setDocumentsColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tblEmpDocInfo.getColumnCount(); i++) {
            column = tblEmpDocInfo.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            }

        }
    }

    public void clear() {

        txtPatientId.setText("");
        txtPatientName.setText("");
        txtAge.setText("");
        txtDOB.setText("");
        txtGender.setText("");
        txtContactNo.setText("");
        txtCnic.setText("");
        txtMaritalStatus.setText("");
        txtRelation.setText("");
        txtAddress.setText("");
        txtDesignation.setText("");
        txtRank.setText("");
        txtEmployeeName.setText("");
        txtEmergencyContactNo.setText("");
        txtEmployeeDocType.setText("");
//        txtSearchPatientName.setText("");
        ImageIcon icon = new ImageIcon("\\src\\icons\\male_user.png");
        lblAttachedPicture.setIcon(icon);
        txtCnic.setText("");
        txtRelation.setText("");
        txtAddress.setText("");
        txtSearchClient.setText("");
        txtSearchEmpId.setText("");
        txtApproval.setText("");
        txtRemarks.setText("");
        txtRelation.setText("");
        listEmpData.clear();
        listClientWiseEmp.clear();
        tblClientWiseEmployee.setModel(new TableModelEmployeeInfo(listClientWiseEmp));

    }

    private void clearFields() {

        txtPatientId.setText("");
        //stxtSearchEmpId.setText("");
        txtSearchPatientId.setText("");
        txtPatientName.setText("");
        txtAge.setText("");
        txtDOB.setText("");
        txtGender.setText("");
        txtContactNo.setText("");
        txtCnic.setText("");
        txtMaritalStatus.setText("");
        txtEmployeeDocType.setText("");
        txtApproval.setText("");
        txtRemarks.setText("");
        txtRelation.setText("");
        txtAddress.setText("");
        lblPicture.setText("");
//        txtSearchPatientName.setText("");
        String fileName = System.getProperty("user.dir");
        ImageIcon icon = new ImageIcon(fileName + "\\src\\icons\\male_user.png");
        Image img = icon.getImage().getScaledInstance(lblAttachedPicture.getWidth(),
                lblAttachedPicture.getHeight(), 0);
        icon = new ImageIcon(img);
        lblAttachedPicture.setIcon(icon);

    }

    private void relationInfo(String empId, String clientId) {

        listClientWiseEmp = ctlEmployeeData.selectClientWiseEmpInfo(empId, clientId);
        if (listClientWiseEmp.isEmpty()) {
            List<Patient> list = new ArrayList();
            Patient usr = new Patient();
            list.add(usr);
            tblClientWiseEmployee.setModel(new TableModelClientWiseEmployee(list));
            clearFields();
            return;
        } else {
            tblClientWiseEmployee.setModel(new TableModelClientWiseEmployee(listClientWiseEmp));
        }
        tblClientWiseEmployee.addRowSelectionInterval(0, 0);
        ListSelectionModel selectionModel = tblClientWiseEmployee.getSelectionModel();
        tblClientWiseEmployee.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setClientWiseEmployee();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblClientWiseEmployee);
        selectClientWiseEmp = listClientWiseEmp.get(0);
        setEmployeeInformation();

    }

    public void setClientWiseEmployee() {
        TableColumn column = null;
        for (int i = 0; i < tblClientWiseEmployee.getColumnCount(); i++) {
            column = tblClientWiseEmployee.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(180);
            } else if (i == 1) {
                column.setPreferredWidth(140);
            } else if (i == 2) {
                column.setPreferredWidth(80);
            } else if (i == 3) {
                column.setPreferredWidth(120);
            }

        }
    }

    public boolean checkLOVStatus(Patient pat) {

        pat.setFirstName(txtPatientName.getText().toUpperCase());
        if (pat.getFirstName().trim().equalsIgnoreCase("")) {
            txtPatientName.setBackground(Color.red);
            return false;
        }
        if (txtAge.getText().trim().equalsIgnoreCase("")) {
            txtAge.setBackground(Color.red);
            return false;
        }
        pat.setAge(txtAge.getText());
        pat.setContactNo(txtContactNo.getText());
        if (pat.getContactNo().trim().equalsIgnoreCase("")) {
            txtContactNo.setBackground(Color.red);
            return false;
        }
        pat.setTypeId("210");
        pat.setBloodGroupId("52");
        pat.setClientId(clientId);
        pat.setCityId("001");
        pat.setCompanyId("87"); //SELF
        pat.setLocationId(Constants.locationId);
        pat.setReligionId("215");
        pat.setTitleId("303");//misses 
        if (pat.getGenderId().equalsIgnoreCase("1")) {
            pat.setTitleId("301");//mister
        }
        return true;
    }
    AttachEmployeePicController ctlAtttachDoc = new AttachEmployeePicController();

    private void setPicture() {
        try {
            Image image = ctlAtttachDoc.searchImage(currentEmployee.getId());
            Image resizedImage = image.getScaledInstance(lblAttachedPicture.getWidth(),
                    lblAttachedPicture.getHeight(), 0);
            ImageIcon icon = new ImageIcon(resizedImage);
            lblAttachedPicture.setIcon(icon);
        } catch (NullPointerException ex) {
            String fileName = System.getProperty("user.dir");
            ImageIcon icon = new ImageIcon(fileName + "\\src\\icons\\male_user.png");
            Image img = icon.getImage().getScaledInstance(lblAttachedPicture.getWidth(),
                    lblAttachedPicture.getHeight(), 0);
            icon = new ImageIcon(img);
            lblAttachedPicture.setIcon(icon);
        }
    }

    private void setEmployeeInformation() {
        txtAge.setText(selectClientWiseEmp.getAge().trim());
        txtPatientName.setText(selectClientWiseEmp.getFullName().trim());
        txtContactNo.setText(selectClientWiseEmp.getContactNo().trim());
        txtGender.setText(selectClientWiseEmp.getGenderDescription().trim());
        txtCnic.setText(selectClientWiseEmp.getCnic().trim());
        txtDOB.setText(selectClientWiseEmp.getDob().trim());
        txtMaritalStatus.setText(selectClientWiseEmp.getMaritalStatusDescription().trim());
        txtRelation.setText(selectClientWiseEmp.getRelation().trim());
        txtEmergencyContactNo.setText(selectEmployeeInfo.getEmergencyContactNo().trim());
        txtAddress.setText(selectClientWiseEmp.getAddress().trim());
        txtPatientIdDisplay.setText(selectClientWiseEmp.getPatientId().trim());
        cboActive.setSelectedItem(selectClientWiseEmp.getActive());
        btnGenerateMrNo.setEnabled(true);
        btnUpdateMrNo.setEnabled(true);
        txtPatientId.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.updateEmployeePatient) == null) {
            txtPatientId.setEnabled(false);
            btnUpdateMrNo.setEnabled(false);
        }
        cboActive.setEnabled(true);
        if (Constants.userRightsMap.get(Rights.ActiveClientEmployee) == null) {
            cboActive.setEnabled(false);
        }
        cboActive.setEnabled(true);
        if (selectClientWiseEmp.getPatientId().length() > 8) {
            btnGenerateMrNo.setEnabled(false);
            btnUpdateMrNo.setEnabled(false);
            txtPatientId.setEnabled(false);
            txtPatientId.setText(selectClientWiseEmp.getPatientId().trim().substring(3));
        } else {
            txtPatientId.setText("");
            cboActive.setEnabled(false);
        }
        if (selectClientWiseEmp.getActive().equalsIgnoreCase("N")) {
            cboActive.setEnabled(false);
        }
        clientId = selectClientWiseEmp.getClientId();
        // btnAttachPicture.setEnabled(true);
        if (selectClientWiseEmp.getPictureUploaded().equalsIgnoreCase("Y")) {
            //   btnAttachPicture.setEnabled(false);
            setPicture();
        }
    }

    private boolean checkEmployeeData() {

        if (txtContactNo.getText().trim().length() != 11) {
            txtContactNo.requestFocus();
            try {
                Integer.parseInt(txtContactNo.getText().substring(0, 1));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Kindly Enter Correct Mobile No");
                return false;
            }
        }
        if (txtDOB.getText().trim().length() == 0) { //DOB will confirm by Raheel
            txtDOB.requestFocus();
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct DOB");
            return false;
        }
        if (txtCnic.getText().trim().length() != 13) {
            txtCnic.requestFocus();
            JOptionPane.showMessageDialog(null, "Kindly Enter Correct Cnic No");
            return false;
        }
        selectClientWiseEmp.setCnic(txtCnic.getText());
        selectClientWiseEmp.setDob(txtDOB.getText());
        selectClientWiseEmp.setContactNo(txtContactNo.getText());
        selectClientWiseEmp.setEmergencyContactNo(txtEmergencyContactNo.getText());
        selectClientWiseEmp.setActive(cboActive.getSelectedItem().toString());
        selectClientWiseEmp.setAddress(txtAddress.getText());
        return true;
    }

    private boolean checkApprovalData() {

        if (txtApproval.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Approval Type Prior to Allow / DisAllow");
            txtApproval.requestFocus();
            return false;
        }
        if (txtRemarks.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Remarks Prior to Allow / DisAllow");
            txtRemarks.requestFocus();
            return false;
        }

        return true;
    }

    private void selectEmployeeApproval() {
        listApproval.clear();
        listApproval = ctlEmployeeData.searchClientApproval(selectClientWiseEmp.getPatientId());
        selectClientWiseEmp = listApproval.get(0);
        txtApproval.setText(selectClientWiseEmp.getApprovalDescription());
        txtRemarks.setText(selectClientWiseEmp.getRemarks());
    }

    private void updateEmpInfo() {
        if (ctlEmployeeData.updateEmployeeInfo(selectClientWiseEmp)) {
            ctlEmployeeData.UpdateEmergencyContactNo(selectClientWiseEmp);
            ctlEmployeeData.insertAuditLogInsert(selectClientWiseEmp);
            // ADD DECISION BOX
            JOptionPane.showMessageDialog(null, "Employee Information Updated Successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Update... Please contact Administrator!");
        }
    }

    private void disableFields() {
        txtPatientId.setEditable(false);
        txtPatientName.setEditable(false);
        txtAge.setEditable(false);
        txtGender.setEditable(false);
        txtDOB.setEditable(false);
        txtContactNo.setEditable(false);
        cboActive.setEditable(false);
        txtEmergencyContactNo.setEditable(false);
        txtAddress.setEditable(false);
        txtMaritalStatus.setEditable(false);
        txtCnic.setEditable(false);
        txtCnic.setEditable(false);
    }
}
