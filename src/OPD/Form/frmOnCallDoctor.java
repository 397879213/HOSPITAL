package OPD.Form;

import BO.OnCallDoctor;
import Controller.OnCallDoctorController;
import TableModel.NextDateTableModel;
import TableModel.SelectedDateTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;

public class frmOnCallDoctor extends javax.swing.JInternalFrame {
    private String searchDate;
    private String fromDate;
    private String toDate;
    
    OnCallDoctorController ctlOnCall = new OnCallDoctorController();
    DisplayLOV lov = new DisplayLOV();
    OnCallDoctor objSelectedDate = new OnCallDoctor();
    OnCallDoctor objNextDate = new OnCallDoctor();
    
    List<OnCallDoctor> listSelectedDateData = new ArrayList();
    List<OnCallDoctor> listNextDateData = new ArrayList();
    private String dutyType;
    private String userName;
    private String userId;

    public frmOnCallDoctor() {

        initComponents();
        this.setSize(Constants.xSize - 70, Constants.ySize - 10);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        pnlNotes1 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSelectedDateRoaster = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNextDateRoaster = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        txtSearchDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cboType = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        btnCopy = new javax.swing.JButton();
        txtFromDate = new org.jdesktop.swingx.JXDatePicker();
        txtToDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"On Call Doctors");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "On Call Doctors", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 51, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addGap(10, 10, 10))
        );

        pnlNotes1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlNotes1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "On Call Duty Roaster", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel15.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selected Date Roaster", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblSelectedDateRoaster.setBackground(java.awt.SystemColor.activeCaption);
        tblSelectedDateRoaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {null, null, null, null},
            new String [] {"Sr.", "Item Name", "Prescribed By", "Prescribed Date"}
        ));
        tblSelectedDateRoaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblSelectedDateRoasterMouseReleased(evt);
            }
        });
        tblSelectedDateRoaster.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblSelectedDateRoasterPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(tblSelectedDateRoaster);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Next Date Roaster", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        tblNextDateRoaster.setBackground(java.awt.SystemColor.activeCaption);
        tblNextDateRoaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {null, null, null, null},
            new String [] {"Sr.", "Item Name", "Prescribed By", "Prescribed Date"}
        ));
        tblNextDateRoaster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblNextDateRoasterMouseReleased(evt);
            }
        });
        tblNextDateRoaster.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblNextDateRoasterPropertyChange(evt);
            }
        });
        jScrollPane4.setViewportView(tblNextDateRoaster);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlNotes1Layout = new javax.swing.GroupLayout(pnlNotes1);
        pnlNotes1.setLayout(pnlNotes1Layout);
        pnlNotes1Layout.setHorizontalGroup(
            pnlNotes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotes1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlNotes1Layout.setVerticalGroup(
            pnlNotes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNotes1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlNotes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel17.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        txtSearchDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchDateActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Select Date : ");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Select Type : ");

        cboType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Medical Staff", "Administration", "Guards", "Others" }));
        cboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSearchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboType, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(cboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel5.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        btnCopy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCopy.setText("Copy");
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

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

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("From Date : ");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("To Date : ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCopy)
                    .addComponent(txtFromDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtToDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNotes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNotes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDateActionPerformed
        // TODO add your handling code here:
        if (txtSearchDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Date to search", 
                    "On call Doctors", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        SimpleDateFormat dateFormat
         = new SimpleDateFormat("dd-MMM-yy");
        searchDate = dateFormat.format(txtSearchDate.getDate());
        dutyType = "SELECT";
        selectOnCallDocData();
        selectNextDateData();
    }//GEN-LAST:event_txtSearchDateActionPerformed

    private void txtFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromDateActionPerformed
        // TODO add your handling code here:
         if (txtFromDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Select from Date first", 
                    "On call Doctors", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat
         = new SimpleDateFormat("dd-MMM-yyyy");
        fromDate = dateFormat.format(txtFromDate.getDate());
    }//GEN-LAST:event_txtFromDateActionPerformed

    private void txtToDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToDateActionPerformed
        // TODO add your handling code here:
        if (txtToDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Select to Date first", 
                    "On call Doctors", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat
         = new SimpleDateFormat("dd-MMM-yyyy");
        toDate = dateFormat.format(txtToDate.getDate());
    }//GEN-LAST:event_txtToDateActionPerformed

    private void tblSelectedDateRoasterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSelectedDateRoasterMouseReleased

        objSelectedDate = listSelectedDateData.get(tblSelectedDateRoaster.getSelectedRow());
        int clickCount = evt.getClickCount();
        if (clickCount == 2) {
            usersLov();
            if (tblSelectedDateRoaster.getSelectedColumn() == 2) {
                objSelectedDate.setUserId1(userId);
            }
            if (tblSelectedDateRoaster.getSelectedColumn() == 3) {
                objSelectedDate.setUserId2(userId);
            }
            if (ctlOnCall.updateUser(objSelectedDate)) {
                JOptionPane.showMessageDialog(null, "Updated Sucessfully");
                selectOnCallDocData();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to update! \n kindly "
                        + "Contact Administrator.");
            }
        }
    }//GEN-LAST:event_tblSelectedDateRoasterMouseReleased

    private void tblSelectedDateRoasterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblSelectedDateRoasterPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSelectedDateRoasterPropertyChange

    private void tblNextDateRoasterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNextDateRoasterMouseReleased
        // TODO add your handling code here:
        objNextDate = listNextDateData.get(tblNextDateRoaster.getSelectedRow());
        int clickCount = evt.getClickCount();
        if (clickCount == 2) {
            System.out.println("c count" + clickCount);
            usersLov();
            if (tblNextDateRoaster.getSelectedColumn() == 2) {
                System.out.println("phlee " + objNextDate.getUserId1());
                objNextDate.setUserId1(userId);
                System.out.println("Baad " + objNextDate.getUserId1());
            }
            if (tblNextDateRoaster.getSelectedColumn() == 3) {
                System.out.println("phlee " + objNextDate.getUserId2());
                objNextDate.setUserId2(userId);
                System.out.println("Baad " + objNextDate.getUserId2());
            }
            if (ctlOnCall.updateUser(objNextDate)) {
                JOptionPane.showMessageDialog(null, "Updated Sucessfully");
                selectNextDateData();
            } else {
                JOptionPane.showMessageDialog(null, "Unable to update! \n kindly "
                        + "Contact Administrator.");
            }
        }
    }//GEN-LAST:event_tblNextDateRoasterMouseReleased

    private void tblNextDateRoasterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblNextDateRoasterPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblNextDateRoasterPropertyChange

    private void cboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTypeActionPerformed
        // TODO add your handling code here:
        if(cboType.getSelectedIndex() == 0){
            dutyType = "SELECT";
        }
        if(cboType.getSelectedIndex() == 1){
            dutyType = "MEDICALSTAFF";
        }
        if(cboType.getSelectedIndex() == 2){
            dutyType = "ADMINISTRATITION";
        }
        if(cboType.getSelectedIndex() == 3){
            dutyType = "OTHERS";
        }
        selectOnCallDocData();
        selectNextDateData();
    }//GEN-LAST:event_cboTypeActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        // TODO add your handling code here:
        if (ctlOnCall.insertOnCallDutyRoaster(fromDate, toDate)) {
            JOptionPane.showMessageDialog(null, "Copied Sucessfully");
            selectNextDateData();
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Copy! \n kindly "
                    + "Contact Administrator.");
        }
    }//GEN-LAST:event_btnCopyActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        cboType.setSelectedIndex(0);
        listNextDateData.clear();
        listSelectedDateData.clear();
        tblNextDateRoaster.setModel(new NextDateTableModel(listNextDateData));
        tblSelectedDateRoaster.setModel(new SelectedDateTableModel(listSelectedDateData));
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox cboType;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlNotes1;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblNextDateRoaster;
    private javax.swing.JTable tblSelectedDateRoaster;
    private org.jdesktop.swingx.JXDatePicker txtFromDate;
    private org.jdesktop.swingx.JXDatePicker txtSearchDate;
    private org.jdesktop.swingx.JXDatePicker txtToDate;
    // End of variables declaration//GEN-END:variables

    private void selectOnCallDocData() {
    
        if(searchDate.length() != 0){
            listSelectedDateData = ctlOnCall.selectOnCallDoctor(searchDate, dutyType);
            tblSelectedDateRoaster.setModel(new SelectedDateTableModel(listSelectedDateData));
            Constants.tablelook.setJTableEnvironment(tblSelectedDateRoaster);
            setSelectedDateTableColWidth();
        }else{
            JOptionPane.showMessageDialog(null, "Kindly select Date to search",
                "Search on call Doctors", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void selectNextDateData() {
    
        objSelectedDate = listSelectedDateData.get(0);
        listNextDateData = ctlOnCall.selectOnCallDoctor(objSelectedDate.getNextDate(), dutyType);
        tblNextDateRoaster.setModel(new NextDateTableModel(listNextDateData));
        Constants.tablelook.setJTableEnvironment(tblNextDateRoaster);
        setNextDateTableColWidth();
    }

    private void setSelectedDateTableColWidth() {
        TableColumn column;
        for (int i = 0; i < tblSelectedDateRoaster.getColumnCount(); i++) {
            column = tblSelectedDateRoaster.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(150);
            } else if (i == 2) {
                column.setPreferredWidth(100);
            } else if (i == 3) {
                column.setPreferredWidth(100);
            }
        }
    }
    
    private void setNextDateTableColWidth() {
        TableColumn column;
        for (int i = 0; i < tblNextDateRoaster.getColumnCount(); i++) {
            column = tblNextDateRoaster.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(150);
            } else if (i == 2) {
                column.setPreferredWidth(100);
            } else if (i == 3) {
                column.setPreferredWidth(100);
            }
        }
    }

    private void usersLov() {
        String query = "  SELECT USER_NAME ID, NAME DESCRIPTION            \n"
                + " FROM   " + Database.DCMS.users + "      \n"
                + " ORDER BY ID                             \n";

        lov.LOVSelection(query, this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            return;
        } else {

            userName = Constants.lovDescription;
            userId = Constants.lovID;
        }
    }
}
