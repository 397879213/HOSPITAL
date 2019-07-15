package Form.general;

import BO.OfflineOrderData;
import Controller.Administration.NursingOrderDescriptionController;
import Controller.PatientController;
import TableModel.NursingInvDetailTableModel;
import TableModel.NursingInvMasterTableModel;
import TableModel.OfflineInvDetailTableModel;
import TableModel.OfflineInvMasterTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;

public class NursingOrderDescriptionForm extends javax.swing.JInternalFrame {

    private int currentSelectedPatient = 0;
    List<OfflineOrderData> lst = new ArrayList();
    NursingOrderDescriptionController Ctrlorder = new NursingOrderDescriptionController();
    String userName, fromDate, toDate;

    public NursingOrderDescriptionForm() {
        initComponents();
        //String admissionNo = "123";
        //String userName = txtUserName.getText().toString();

//        if(!userName.isEmpty())
//        {
//            selectOrderInfo(admissionNo,"",userName,"","");
//        }
//        
//        else{
//            
//        selectOrderInfo(admissionNo,"","","","");
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        txtFromDate = new org.jdesktop.swingx.JXDatePicker();
        txtToDate = new org.jdesktop.swingx.JXDatePicker();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        tblPatientInfo = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        tblCptInfo = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnDeleteNote = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle(Constants.title+"Admisson Request");
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
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(104, 0, 0))); // NOI18N

        jPanel19.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel82.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(102, 0, 0));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel82.setText("From Date :");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("User Name :");

        txtUserName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(102, 0, 0));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel83.setText("To Date :");

        txtFromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromDateActionPerformed(evt);
            }
        });

        txtToDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtToDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFromDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Order Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblPatientInfo.setBackground(java.awt.SystemColor.activeCaption);
        tblPatientInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "User Id", "Name", "Date"

            }
        ));
        tblPatientInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblPatientInfoMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblPatientInfoMouseReleased(evt);
            }
        });
        tblPatientInfo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblPatientInfoPropertyChange(evt);
            }
        });
        jScrollPane26.setViewportView(tblPatientInfo);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane26)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane26, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblCptInfo.setBackground(java.awt.SystemColor.activeCaption);
        tblCptInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Sr.", "Invoice No", "Cpt" ,"Price"
            }
        ));
        tblCptInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCptInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblCptInfoMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCptInfoMouseReleased(evt);
            }
        });
        tblCptInfo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblCptInfoPropertyChange(evt);
            }
        });
        jScrollPane27.setViewportView(tblCptInfo);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane27)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(102, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDeleteNote.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDeleteNote.setForeground(new java.awt.Color(0, 153, 0));
        btnDeleteNote.setText("Clear");
        btnDeleteNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNoteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(btnDeleteNote, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteNote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed
    DisplayLOV lov = new DisplayLOV();
    private Vector orders = new Vector();


    private void tblPatientInfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfoMouseReleased

        currentSelectedPatient = tblPatientInfo.getSelectedRow();

        if (tblPatientInfo.getSelectedRow() < 0 || listOrder.isEmpty()) {
            return;
        }

        OfflineOrderData patObj = new OfflineOrderData();
        patObj = listOrder.get(currentSelectedPatient);
        String InvoiceNo = patObj.getInvoiceNo();

        selectInvoiceDetail(InvoiceNo);
//        txtUserName.setText(patObj.getUserName());

    }//GEN-LAST:event_tblPatientInfoMouseReleased

    private void tblPatientInfoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblPatientInfoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfoPropertyChange

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDeleteNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNoteActionPerformed
        clearFields();
    }//GEN-LAST:event_btnDeleteNoteActionPerformed

    private void tblPatientInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfoMouseClicked

    private void tblPatientInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientInfoMouseEntered

    private void tblCptInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCptInfoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptInfoMouseClicked

    private void tblCptInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCptInfoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptInfoMouseEntered

    private void tblCptInfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCptInfoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptInfoMouseReleased

    private void tblCptInfoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblCptInfoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCptInfoPropertyChange

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed

        String query = " SELECT USER_ID ID,USER_NAME DESCRIPTION  FROM    \n"
                + Database.DCMS.users + "                                  \n"
                + " WHERE USER_NAME LIKE '%"
                + txtUserName.getText().toUpperCase().trim() + "%'"
                + " AND ACTIVE = 'Y'"
                + " ORDER BY ID";
        lov.LOVSelection(query, this);

        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }

        userId = Constants.lovID;
        userName = Constants.lovDescription;
        txtUserName.setText(Constants.lovDescription);

        getData();

    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromDateActionPerformed

        if (txtFromDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the From Date ",
                    "Search Indent Note Request", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        fromDate = dateFormat.format(txtFromDate.getDate());

        getData();


    }//GEN-LAST:event_txtFromDateActionPerformed

    private void txtToDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToDateActionPerformed

        if (txtToDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the From Date ",
                    "Search Indent Note Request", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        toDate = dateFormat.format(txtToDate.getDate());
        getData();
    }//GEN-LAST:event_txtToDateActionPerformed

    public void getData() {

        if (fromDate == null) {
            fromDate = "";
        }

        if (toDate == null) {
            toDate = "";
        }

        selectOrderInfo("123", "", userName, fromDate, toDate);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteNote;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JTable tblCptInfo;
    private javax.swing.JTable tblPatientInfo;
    private org.jdesktop.swingx.JXDatePicker txtFromDate;
    private org.jdesktop.swingx.JXDatePicker txtToDate;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
 //new declaration
    String userId = "";

    //   String status = "N";
    List<OfflineOrderData> listOrder = new ArrayList();
    List<OfflineOrderData> listInvoice = new ArrayList();
    NursingOrderDescriptionController ctlNursingOrder
            = new NursingOrderDescriptionController();

    private void selectOrderInfo(String admissionNo, String status,
            String userName, String fromDate, String toDate) {
        listOrder = ctlNursingOrder.selectInvoiceMaster(admissionNo,
                status, userName, fromDate, toDate);

        OfflineOrderData order = new OfflineOrderData();
        if (!listOrder.isEmpty()) {
            order = listOrder.get(0);
        }
//        txtUserName.setText(order.getUserName().trim());

        if (listOrder.isEmpty()) {

            tblPatientInfo.setModel(new NursingInvMasterTableModel(listOrder));
        } else {
            tblPatientInfo.setModel(new NursingInvMasterTableModel(listOrder));
        }
        ListSelectionModel selectionModel = tblPatientInfo.getSelectionModel();
        tblPatientInfo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsInvoiceMaster();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblPatientInfo);
    }

    public void setColumnsWidthsInvoiceMaster() {

        TableColumn column = null;
        for (int i = 0; i < tblPatientInfo.getColumnCount(); i++) {
            column = tblPatientInfo.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(80);
            } else if (i == 2) {
                column.setPreferredWidth(120);
            } else if (i == 3) {
                column.setPreferredWidth(110);
            } else if (i == 4) {
                column.setPreferredWidth(80);
            }
        }
    }

    private void selectInvoiceDetail(String InvoiceNo) {
        listInvoice = ctlNursingOrder.selectInvoiceDetail(InvoiceNo);

        OfflineOrderData currentPatient = new OfflineOrderData();
        if (!listInvoice.isEmpty()) {
            currentPatient = listInvoice.get(0);
        }

        if (listInvoice.isEmpty()) {

            tblCptInfo.setModel(new NursingInvDetailTableModel(listInvoice));
        } else {
            tblCptInfo.setModel(new NursingInvDetailTableModel(listInvoice));
        }
        ListSelectionModel selectionModel = tblCptInfo.getSelectionModel();
        tblCptInfo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsInvoiceDetail();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblCptInfo);
    }

    public void setColumnsWidthsInvoiceDetail() {

        TableColumn column = null;
        for (int i = 0; i < tblCptInfo.getColumnCount(); i++) {
            column = tblCptInfo.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(70);
            } else if (i == 2) {
                column.setPreferredWidth(170);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void clearFields() {
        txtUserName.setText("");
        tblPatientInfo.setModel(new NursingInvMasterTableModel(orders));
        tblCptInfo.setModel(new NursingInvDetailTableModel(orders));
    }

}
