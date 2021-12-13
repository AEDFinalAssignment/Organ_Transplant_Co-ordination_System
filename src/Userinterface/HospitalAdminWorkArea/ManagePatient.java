/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.HospitalAdminWorkArea;

import System.EcoSystem;
import Userinterface.TransplantPatientAssgnWorkArea.TransplantPatientAssgn;

import javax.swing.JPanel;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JSplitPane;

/**
 *
 * @author sanjeev
 */
public class ManagePatient extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatient
     */
     private EcoSystem system;
    private JSplitPane jSplitPane1;

    JPanel Hospitalmain;

    private String Username;
    int id;
    public ManagePatient(JSplitPane jSplitPane1,EcoSystem system,JPanel Hospitalmain,String Username,int id) {
        initComponents();
         this.jSplitPane1 = jSplitPane1;
        this.system = system;
        this.Username = Username;
        this.id = id;
        this.Hospitalmain = Hospitalmain;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        managepatient = new javax.swing.JPanel();
        btnexistingpatient = new javax.swing.JButton();
        btnCreatenewpatient = new javax.swing.JButton();
        btntransplantlist = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        managepatient.setBackground(new java.awt.Color(255, 255, 255));
        managepatient.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnexistingpatient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnexistingpatient.setText("Existing Patient Details");
        btnexistingpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexistingpatientActionPerformed(evt);
            }
        });
        managepatient.add(btnexistingpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 304, -1));

        btnCreatenewpatient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCreatenewpatient.setText("Create New Patient Details");
        btnCreatenewpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatenewpatientActionPerformed(evt);
            }
        });
        managepatient.add(btnCreatenewpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 312, -1));

        btntransplantlist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btntransplantlist.setText("Transplant List");
        btntransplantlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransplantlistActionPerformed(evt);
            }
        });
        managepatient.add(btntransplantlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 304, -1));

        jButton4.setText("Patient Available as DONOR ");
        managepatient.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        managepatient.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 28, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(managepatient, javax.swing.GroupLayout.DEFAULT_SIZE, 1450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(managepatient, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnexistingpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexistingpatientActionPerformed
         try {
             // TODO add your handling code here:
             
             UpdatePatientdetails usd = new UpdatePatientdetails(jSplitPane1,system,managepatient,Username,-1);
             jSplitPane1.setRightComponent(usd);
         } catch (SQLException ex) {
             Logger.getLogger(ManagePatient.class.getName()).log(Level.SEVERE, null, ex);
         }

    }//GEN-LAST:event_btnexistingpatientActionPerformed

    private void btnCreatenewpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatenewpatientActionPerformed
        // TODO add your handling code here:

        CreatePatientdetails cnp = new CreatePatientdetails (jSplitPane1,system,managepatient,Username,-1);
        jSplitPane1.setRightComponent(cnp);
    }//GEN-LAST:event_btnCreatenewpatientActionPerformed

    private void btntransplantlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransplantlistActionPerformed
        // TODO add your handling code here:
        TransplantPatientAssgn tpa;
         try {
             tpa = new TransplantPatientAssgn (jSplitPane1,system,managepatient,Username);
             jSplitPane1.setRightComponent(tpa);
         } catch (SQLException ex) {
             Logger.getLogger(ManagePatient.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_btntransplantlistActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:

        jSplitPane1.setRightComponent(Hospitalmain);
    }//GEN-LAST:event_jLabel11MouseClicked




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatenewpatient;
    private javax.swing.JButton btnexistingpatient;
    private javax.swing.JButton btntransplantlist;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel managepatient;
    // End of variables declaration//GEN-END:variables
}
