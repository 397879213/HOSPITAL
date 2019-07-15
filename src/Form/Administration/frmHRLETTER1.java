package Form.Administration;

//import BO.Administration.SupportEmail;
//import Controller.Administration.SupportEmailController;
import Form.Administration.*;
import BO.Hr.HrLetter;
import Controller.Hr.HrLetterController;
import TableModel.Hr.CloseLetterTableModel;
import TableModel.Hr.HrLetterTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import javax.swing.text.StyledEditorKit;
import javax.swing.undo.UndoManager;
import org.fife.ui.autocomplete.AutoCompletion;
import org.fife.ui.autocomplete.CompletionProvider;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.GUIUtils;
import utilities.JDocumentEditor;
import utilities.Status;

public class frmHRLETTER1 extends javax.swing.JInternalFrame {

      DisplayLOV lov = new DisplayLOV();
      HrLetterController CtlHr = new HrLetterController();
      HrLetter hrLetter = new HrLetter();
      List<HrLetter> listHr = new ArrayList<>();
      private String TypeId;
      private String leaveType;
      private String EmpId = "-8";
      private int currentSelectedRow = 0;

    public frmHRLETTER1() {

        initComponents();

//        this.setSize(Constants.xSize + 80, Constants.ySize - 35);
        //selectSupportEmail("", Status.save, "", "", "", "");
        btnExit.setMnemonic(KeyEvent.VK_X);
//        btnSave.setMnemonic(KeyEvent.VK_S);
        //btnSendRequest.setMnemonic(KeyEvent.VK_U);
        btnClear.setMnemonic(KeyEvent.VK_C);

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearchPatientId3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlSearchUser7 = new javax.swing.JPanel();
        pnlUserDetail = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmpDetails = new javax.swing.JTextField();
        txtDept = new javax.swing.JTextField();
        txtEmpId = new javax.swing.JTextField();
        pnlSearchUser4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblOpenLetter = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCloseLetter = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        createLeave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtLeaveTypes = new javax.swing.JTextField();
        pnlSearchUser9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpTemplates = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnFinal = new javax.swing.JButton();

        txtSearchPatientId3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchPatientId3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPatientId3ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Report Configuration");
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
                .addGap(174, 174, 174)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSearchUser7.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HR Templates", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser7.setForeground(java.awt.SystemColor.activeCaption);

        pnlUserDetail.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail.setForeground(java.awt.SystemColor.activeCaption);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Employee ID :");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Location :");

        txtLocation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Dept :");

        txtEmpDetails.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEmpDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpDetailsActionPerformed(evt);
            }
        });

        txtDept.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeptActionPerformed(evt);
            }
        });

        txtEmpId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetailLayout = new javax.swing.GroupLayout(pnlUserDetail);
        pnlUserDetail.setLayout(pnlUserDetailLayout);
        pnlUserDetailLayout.setHorizontalGroup(
            pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlUserDetailLayout.createSequentialGroup()
                        .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDept, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                    .addGroup(pnlUserDetailLayout.createSequentialGroup()
                        .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmpDetails)))
                .addContainerGap())
        );
        pnlUserDetailLayout.setVerticalGroup(
            pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtDept, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlSearchUser4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Open Close Letter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser4.setForeground(java.awt.SystemColor.activeCaption);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Open Letter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 0, 0));

        tblOpenLetter.setBackground(java.awt.SystemColor.activeCaption);
        tblOpenLetter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Sr.","Patient Id","Name","Age","Gender","Contact No"
            }
        ));
        tblOpenLetter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOpenLetterMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblOpenLetterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblOpenLetterMouseReleased(evt);
            }
        });
        tblOpenLetter.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblOpenLetterPropertyChange(evt);
            }
        });
        tblOpenLetter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblOpenLetterKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(tblOpenLetter);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Close Letter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));

        tblCloseLetter.setBackground(java.awt.SystemColor.activeCaption);
        tblCloseLetter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null}},
            new String [] {
                "Sr.","Patient Id","Name","Age","Gender","Contact No"
            }
        ));
        tblCloseLetter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCloseLetterMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCloseLetterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCloseLetterMouseReleased(evt);
            }
        });
        tblCloseLetter.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblCloseLetterPropertyChange(evt);
            }
        });
        tblCloseLetter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblCloseLetterKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(tblCloseLetter);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 204, 204)));

        createLeave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        createLeave.setForeground(new java.awt.Color(51, 153, 0));
        createLeave.setText("Create");
        createLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLeaveActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Type:");

        txtLeaveTypes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtLeaveTypes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtLeaveTypesMouseReleased(evt);
            }
        });
        txtLeaveTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLeaveTypesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLeaveTypes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createLeave)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createLeave)
                    .addComponent(jLabel5)
                    .addComponent(txtLeaveTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout pnlSearchUser4Layout = new javax.swing.GroupLayout(pnlSearchUser4);
        pnlSearchUser4.setLayout(pnlSearchUser4Layout);
        pnlSearchUser4Layout.setHorizontalGroup(
            pnlSearchUser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchUser4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSearchUser4Layout.setVerticalGroup(
            pnlSearchUser4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchUser4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlSearchUser7Layout = new javax.swing.GroupLayout(pnlSearchUser7);
        pnlSearchUser7.setLayout(pnlSearchUser7Layout);
        pnlSearchUser7Layout.setHorizontalGroup(
            pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUser7Layout.createSequentialGroup()
                .addGroup(pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSearchUser4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUserDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSearchUser7Layout.setVerticalGroup(
            pnlSearchUser7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchUser7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlUserDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSearchUser4, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSearchUser9.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Letter ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser9.setForeground(java.awt.SystemColor.activeCaption);

        jScrollPane1.setViewportView(EmpTemplates);

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnFinal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnFinal.setText("Final");
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnSave)
                .addComponent(btnFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSearchUser9Layout = new javax.swing.GroupLayout(pnlSearchUser9);
        pnlSearchUser9.setLayout(pnlSearchUser9Layout);
        pnlSearchUser9Layout.setHorizontalGroup(
            pnlSearchUser9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchUser9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        pnlSearchUser9Layout.setVerticalGroup(
            pnlSearchUser9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUser9Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlSearchUser7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearchUser9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlSearchUser9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSearchUser7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void txtLeaveTypesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLeaveTypesMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLeaveTypesMouseReleased

    private void txtLeaveTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLeaveTypesActionPerformed
  
        lov.LOVDefinitionSelection(DefinitionTypes.leaveType, txtLeaveTypes.getText(), this);
        txtLeaveTypes.setText("");
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            
            txtLeaveTypes.setText(Constants.lovDescription.toUpperCase());
            hrLetter.setLeaveType(Constants.lovID);
            TypeId = Constants.lovDescription.toUpperCase();
        }


    }//GEN-LAST:event_txtLeaveTypesActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

     

    }//GEN-LAST:event_btnClearActionPerformed

    private void tblOpenLetterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOpenLetterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOpenLetterMouseClicked

    private void tblOpenLetterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOpenLetterMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOpenLetterMousePressed

    private void tblOpenLetterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOpenLetterMouseReleased
        
        if(tblOpenLetter.getSelectedRow() < 0){
            return;
        }else{
            EmpTemplates.requestFocusInWindow();
        }
    }//GEN-LAST:event_tblOpenLetterMouseReleased

    private void tblOpenLetterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblOpenLetterPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOpenLetterPropertyChange

    private void tblOpenLetterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOpenLetterKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblOpenLetterKeyPressed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtSearchPatientId3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPatientId3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPatientId3ActionPerformed

    private void txtEmpDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpDetailsActionPerformed

    private void txtDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeptActionPerformed

    private void tblCloseLetterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCloseLetterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCloseLetterMouseClicked

    private void tblCloseLetterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCloseLetterMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCloseLetterMousePressed

    private void tblCloseLetterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCloseLetterMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCloseLetterMouseReleased

    private void tblCloseLetterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblCloseLetterPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCloseLetterPropertyChange

    private void tblCloseLetterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCloseLetterKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCloseLetterKeyPressed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        hrLetter.setHrTemplates(EmpTemplates.getText().toString());
        hrLetter.setLetterStatus("7330");
        hrLetter.setLeaveType(Constants.lovID);
//        boolean update = CtlHr.UpdateTemplate(hrLetter);
//        
//        if(update){
//            JOptionPane.showMessageDialog(null,"Template Saved Successfully");
//        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
        
        hrLetter.setHrTemplates(EmpTemplates.getText().toString());
        hrLetter.setLetterStatus("7329");
        hrLetter.setLeaveType(Constants.lovID);
//        boolean update = CtlHr.UpdateTemplate(hrLetter);
        
      //  if(update){
            JOptionPane.showMessageDialog(null,"Final Template Saved");
    //        int currentSelectedRow = tblOpenLetter.getSelectedRow();
            
     //   }
    }//GEN-LAST:event_btnFinalActionPerformed

    private void txtEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIdActionPerformed

        if (txtEmpId.getText().length() == 0) {
            txtEmpId.requestFocusInWindow();
            txtEmpId.setCaretPosition(0);
            JOptionPane.showMessageDialog(null, "Enter correct PatientId", "Patient Discharge",
                    JOptionPane.WARNING_MESSAGE);
            return ;
            
        }
        setMaster();
    }//GEN-LAST:event_txtEmpIdActionPerformed
    
    
    
     private void setMaster() {
        
         hrLetter = CtlHr.SearchEmpById(EmpId);
        txtEmpId.setText(hrLetter.getEmpId());
        txtEmpDetails.setText(hrLetter.getFulName());
        txtLocation.setText(hrLetter.getLocation());
        txtDept.setText(hrLetter.getDepartment());
   if (listHr.isEmpty()) {
            
            HrLetter cap = new HrLetter();
            List list = new ArrayList();
            list.add(cap);
            tblOpenLetter.setModel(new HrLetterTableModel(list));
            return;
        } else {
            tblOpenLetter.setModel(new HrLetterTableModel(listHr));
        }

        ListSelectionModel selectionModel = tblOpenLetter.getSelectionModel();
        tblOpenLetter.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsComplainlist();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblOpenLetter);
    }
     
    public void setColumnsWidthsComplainlist() {
        TableColumn column = null;
        for (int i = 0; i < tblOpenLetter.getColumnCount(); i++) {
            column = tblOpenLetter.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(20);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            } else if (i == 3) {
                column.setPreferredWidth(90);
            } else if (i == 4) {
                column.setPreferredWidth(70);
            } else if (i == 5) {
                column.setPreferredWidth(80);
            }
        }
    }
    private void createLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLeaveActionPerformed
        
        if(txtLeaveTypes.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Kindly Select Leave Type First");
        }else{
            HrLetter hrObj = new HrLetter();
            hrObj.setEmpId(txtEmpId.getText().toString());
            hrObj.setLeaveType(Constants.lovID);
            
        //    CtlHr.insertLetter(hrObj);
            
            String[] empName = txtEmpDetails.getText().toString().split("\\s+");
            hrObj.setFulName(empName[0]+" "+empName[1]);
            hrObj.setLocation(txtLocation.getText().toString());
            hrObj.setDepartment(txtDept.getText().toString());
            hrObj.setLeaveType(Constants.lovDescription);
            listHr.add(hrObj);
            
            tblOpenLetter.setModel(new HrLetterTableModel(listHr));
            ListSelectionModel selectionModel = tblOpenLetter.getSelectionModel();
        }
       
    }//GEN-LAST:event_createLeaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane EmpTemplates;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFinal;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton createLeave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel pnlSearchUser4;
    private javax.swing.JPanel pnlSearchUser7;
    private javax.swing.JPanel pnlSearchUser9;
    private javax.swing.JPanel pnlUserDetail;
    private javax.swing.JTable tblCloseLetter;
    private javax.swing.JTable tblOpenLetter;
    private javax.swing.JTextField txtDept;
    private javax.swing.JTextField txtEmpDetails;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtLeaveTypes;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtSearchPatientId3;
    // End of variables declaration//GEN-END:variables

    //new declarations
    
    

    
}
