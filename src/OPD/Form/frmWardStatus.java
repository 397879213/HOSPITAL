package OPD.Form;

import OPD.BO.WardStatusBO;
import OPD.Controller.WardStatusController;
import OPD.TableModel.WardStatusTableModel;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.TableColumn;
import utilities.Constants;

public class frmWardStatus extends javax.swing.JInternalFrame {

    private String selectStatusDate = "";
    List<WardStatusBO> listWradStatus = new ArrayList();
    WardStatusController ctlWardStatus = new WardStatusController();

    public frmWardStatus() {

        initComponents();
        this.setSize(Constants.xSize + 180, Constants.ySize - 45);
        btnSearch.setMnemonic(KeyEvent.VK_S);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        txtSelectDate = new org.jdesktop.swingx.JXDatePicker();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        chkReportDisplay = new javax.swing.JCheckBox();
        chkFormDisplay = new javax.swing.JCheckBox();
        wardPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblWardDetail = new javax.swing.JTable();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Ward Status");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(880, 1080));
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

        jPanel14.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        txtSelectDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSelectDateMouseReleased(evt);
            }
        });
        txtSelectDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectDateActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("DAILY BED STATE OF POF HOSPITAL WAH CANTT ON");

        chkReportDisplay.setText("Disply Report");

        chkFormDisplay.setText("Disply Form");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkReportDisplay)
                .addGap(10, 10, 10)
                .addComponent(chkFormDisplay)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch)
                    .addComponent(txtSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkReportDisplay)
                    .addComponent(chkFormDisplay))
                .addGap(13, 13, 13))
        );

        wardPanel.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        wardPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IPD Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseReleased(evt);
            }
        });

        tblWardDetail.setBackground(java.awt.SystemColor.activeCaption);
        tblWardDetail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblWardDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null,null,null,null},
            },
            new String [] {
                "Ward", "Total Beds", "Previous Admitted",
                "New Admitted", "Total Discharge", "Transfer In", "Transfer Out"
            }
        ));
        tblWardDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWardDetailMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblWardDetailMouseReleased(evt);
            }
        });
        tblWardDetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblWardDetailKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblWardDetail);

        javax.swing.GroupLayout wardPanelLayout = new javax.swing.GroupLayout(wardPanel);
        wardPanel.setLayout(wardPanelLayout);
        wardPanelLayout.setHorizontalGroup(
            wardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        wardPanelLayout.setVerticalGroup(
            wardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSelectDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectDateActionPerformed

        if (txtSelectDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the Date to search",
                    "On call Doctors", JOptionPane.WARNING_MESSAGE);
            return;
        }

        SimpleDateFormat dateFormat
                = new SimpleDateFormat("dd-MMM-yy");
        selectStatusDate = dateFormat.format(txtSelectDate.getDate());
    }//GEN-LAST:event_txtSelectDateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        selectWardStatus();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblWardDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWardDetailMouseClicked

    }//GEN-LAST:event_tblWardDetailMouseClicked

    private void tblWardDetailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWardDetailMouseReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_tblWardDetailMouseReleased

    private void tblWardDetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblWardDetailKeyReleased

        //setPendingReportsStudyInformation();
    }//GEN-LAST:event_tblWardDetailKeyReleased

    private void jScrollPane2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseReleased
        // TODO add your handling code here:
        int reportIds[]={0,0,0,225, 245, 55, 54}; // initialize the array with report ids.
    }//GEN-LAST:event_jScrollPane2MouseReleased

    private void txtSelectDateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSelectDateMouseReleased
        // TODO add your handling code here:
        selectWardStatus();
    }//GEN-LAST:event_txtSelectDateMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox chkFormDisplay;
    private javax.swing.JCheckBox chkReportDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblWardDetail;
    private org.jdesktop.swingx.JXDatePicker txtSelectDate;
    private javax.swing.JPanel wardPanel;
    // End of variables declaration//GEN-END:variables

    private void selectWardStatus() {
        listWradStatus = ctlWardStatus.selectOnCallDoctor(selectStatusDate.toUpperCase());
        if (selectStatusDate.length() != 0) {
            tblWardDetail.setModel(new WardStatusTableModel(listWradStatus));
            Constants.tablelook.setJTableEnvironment(tblWardDetail);
            setWardStatusTableColWidth();
        } else {
            JOptionPane.showMessageDialog(null, "Kindly select Date to search",
                    "Search Ward Status", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void setWardStatusTableColWidth() {
        TableColumn column;
        for (int i = 0; i < tblWardDetail.getColumnCount(); i++) {
            column = tblWardDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(30);
            } else if (i == 1) {
                column.setPreferredWidth(200);
            } else if (i == 2) {
                column.setPreferredWidth(40);
            } else if (i == 3) {
                column.setPreferredWidth(40);
            } else if (i == 4) {
                column.setPreferredWidth(40);
            } else if (i == 5) {
                column.setPreferredWidth(40);
            } else if (i == 6) {
                column.setPreferredWidth(40);
            }  else if (i == 7) {
                column.setPreferredWidth(40);
            } else if (i == 8) {
                column.setPreferredWidth(50);
            } else if (i == 9) {
                column.setPreferredWidth(50);
            } else if (i == 10) {
                column.setPreferredWidth(50);
            } else if (i == 11) {
                column.setPreferredWidth(40);
            } else if (i == 12) {
                column.setPreferredWidth(40);
            } else if (i == 13) {
                column.setPreferredWidth(40);
            } else if (i == 14) {
                column.setPreferredWidth(40);
            } else if (i == 15) {
                column.setPreferredWidth(40);
            } else if (i == 16) {
                column.setPreferredWidth(40);
            } else if (i == 17) {
                column.setPreferredWidth(40);
            } else if (i == 18) {
                column.setPreferredWidth(40);
            } else if (i == 19) {
                column.setPreferredWidth(40);
            } else if (i == 20) {
                column.setPreferredWidth(40);
            } else if (i == 20) {
                column.setPreferredWidth(40);
            } else if (i == 21) {
                column.setPreferredWidth(50);
            } else if (i == 22) {
                column.setPreferredWidth(50);
            } else if (i == 23) {
                column.setPreferredWidth(50);
            } else if (i == 24) {
                column.setPreferredWidth(50);
            } else if (i == 25) {
                column.setPreferredWidth(200);
            }
        }
    }
}
