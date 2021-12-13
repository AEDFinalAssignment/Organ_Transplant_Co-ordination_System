/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.RegistryWorkArea;

import System.EcoSystem;
import System.Hospital.Patient.Patient;
import System.Registry.Registry;
import System.Registry.RegistryDirectory;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.time.Clock.system;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanjeev
 */
public class requestWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form requestWorkArea
     */
    EcoSystem system;
    private JSplitPane jSplitPane1;
    String Username;
    public requestWorkArea(JSplitPane jSplitPane1,EcoSystem system,String Username) throws SQLException {
        initComponents();
        this.jSplitPane1 = jSplitPane1;
        this.system = system;
        this.Username = Username;
        populateTable();
    }
    public String removeBrackets(String sample)
    {
        sample = sample.replace("{", "");
        sample = sample.replace("}", "");
        return sample;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("MANAGE REQUESTS:");

        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Health ID ", "Patient Name", "Is Donor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequests);

        jButton1.setText("ACCEPT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("DECLINE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(924, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(472, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblRequests.getSelectedRow();
        
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a Request to accept.");
            return;
        }
        
        DefaultTableModel modeldoc = (DefaultTableModel) tblRequests.getModel();
        String selectedHealthID = (String) modeldoc.getValueAt(selectedRowIndex, 0);
        
        try {
            system.updateRequestTable(selectedHealthID,"Request Accepted");
        } catch (SQLException ex) {
            Logger.getLogger(requestWorkArea.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            populateTable();
        } catch (SQLException ex) {
            Logger.getLogger(requestWorkArea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblRequests.getSelectedRow();
        
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a Request to accept.");
            return;
        }
        
        DefaultTableModel modeldoc = (DefaultTableModel) tblRequests.getModel();
        String selectedHealthID = (String) modeldoc.getValueAt(selectedRowIndex, 0);
        
        try {
            system.updateRequestTable(selectedHealthID,"Request Declined");
        } catch (SQLException ex) {
            Logger.getLogger(requestWorkArea.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            populateTable();
        } catch (SQLException ex) {
            Logger.getLogger(requestWorkArea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequests;
    // End of variables declaration//GEN-END:variables

    private void populateTable() throws SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      DefaultTableModel model = (DefaultTableModel) tblRequests.getModel();
        model.setRowCount(0);
       for(Registry r: system.getDBRegistryDirectory().getRegistryDirectory())
       {
       if(r.getUserName().equals(Username))
       {
       java.sql.ResultSet rs = system.regRequestData(r.getState());
       
       while(rs.next())
            {
             Object[] row = new Object[3];
             row[0]=removeBrackets(rs.getString(1));
             row[1]=removeBrackets(rs.getString(2));
             row[2]=removeBrackets(rs.getString(3));
             
             model.addRow(row);
            }
       }
       }
    }
}