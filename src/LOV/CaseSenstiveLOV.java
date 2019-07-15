package LOV;


import TableModel.LOVCaseSensitiveTableModel;
 
import java.util.Vector;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import utilities.*;

public class CaseSenstiveLOV extends javax.swing.JDialog {

    private TableRowSorter<LOVCaseSensitiveTableModel> sorter;
    LOVCaseSensitiveTableModel  model;
    public int search = 1;
    public CaseSenstiveLOV(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void setLov(Vector values) {

        Constants.lovID = "ID";
        Constants.lovDescription = "Description";
        model = new LOVCaseSensitiveTableModel(values);
     
        tableLOV.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        sorter = new TableRowSorter<LOVCaseSensitiveTableModel>(model);
        tableLOV.setModel(model);
        setTablesColumnsWidths();
        tableLOV.setRowSorter(sorter);
        txtPName.getDocument().addDocumentListener(
                new DocumentListener() {
                    public void changedUpdate(DocumentEvent e) {
                        newFilter();
                    }
                    public void insertUpdate(DocumentEvent e) {
                        newFilter();
                    }
                    public void removeUpdate(DocumentEvent e) {
                        newFilter();
                    }
                });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLOV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selection");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPName.setFont(new java.awt.Font("Tahoma", 0, 12));
        txtPName.setCaretColor(new java.awt.Color(255, 0, 51));
        txtPName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPName.setNextFocusableComponent(tableLOV);
        txtPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNameActionPerformed(evt);
            }
        });
        txtPName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPNameKeyReleased(evt);
            }
        });

        tableLOV.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        tableLOV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableLOV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLOVMouseClicked(evt);
            }
        });
        tableLOV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableLOVKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableLOVKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tableLOVKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tableLOV);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableLOVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLOVMouseClicked
        if (evt.getClickCount() == 2) {
            //JOptionPane.showMessageDialog(null,""+jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn()) );                
            Constants.lovID = (String) tableLOV.getValueAt(tableLOV.getSelectedRow(), 0); //for ID
            Constants.lovDescription = (String) tableLOV.getValueAt(tableLOV.getSelectedRow(), 1);// for Description
            this.dispose();
        }
    }//GEN-LAST:event_tableLOVMouseClicked

    private void tableLOVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableLOVKeyTyped
    }//GEN-LAST:event_tableLOVKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        this.dispose();
    }//GEN-LAST:event_formWindowDeactivated

    private void tableLOVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableLOVKeyPressed

        if (evt.getKeyCode() == 10) {
           Constants.lovID = (String) tableLOV.getValueAt(tableLOV.getSelectedRow(), 0); //for ID
            Constants.lovDescription = (String) tableLOV.getValueAt(tableLOV.getSelectedRow(), 1);// for Description
            this.dispose();
        }

    }//GEN-LAST:event_tableLOVKeyPressed

    private void txtPNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPNameKeyPressed
        if (evt.getKeyCode() == 10) {
            tableLOV.requestFocusInWindow();
            tableLOV.setColumnSelectionInterval(0, 0);
            tableLOV.setRowSelectionInterval(0, 0);
        }
    }//GEN-LAST:event_txtPNameKeyPressed

    private void txtPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPNameActionPerformed

    private void tableLOVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableLOVKeyReleased

           if(evt.getKeyChar()==evt.VK_ESCAPE){
            this.dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tableLOVKeyReleased

    private void txtPNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPNameKeyReleased

           if(evt.getKeyChar()==evt.VK_ESCAPE){
            this.dispose();
           }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPNameKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                CaseSenstiveLOV dialog = new CaseSenstiveLOV(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void newFilter() {
        RowFilter<LOVCaseSensitiveTableModel , Object> rf = null;
        //If current expression doesn't parse, don't update.
        try {
            rf = RowFilter.regexFilter("(?i)"+txtPName.getText(), search);//here colum name
        } catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        sorter.setRowFilter(rf);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLOV;
    private javax.swing.JTextField txtPName;
    // End of variables declaration//GEN-END:variables

    
     public void setTablesColumnsWidths() {
        TableColumn column = null;
        for (int i = 0; i < tableLOV.getColumnCount(); i++) {
            column = tableLOV.getColumnModel().getColumn(i);
            if (i == 1) {
                column.setPreferredWidth(300); //third column is bigger
            } else {
                column.setPreferredWidth(75);
            }
        }
     }
}