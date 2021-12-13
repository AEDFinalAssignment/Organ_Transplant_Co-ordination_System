/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.TransplantPatientAssgnWorkArea;

import System.EcoSystem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author sanjeev
 */
public class Transplantdetails extends javax.swing.JPanel {

    /**
     * Creates new form Transplantdetails
     */
     private EcoSystem system;
    private JSplitPane jSplitPane1;
    JPanel managepatient;
    public Transplantdetails(JSplitPane jSplitPane1,EcoSystem system) {
        initComponents();
        this.jSplitPane1 = jSplitPane1;
        this.system = system;
        this.managepatient=managepatient;
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
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        transplantStatus = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Patient  ID:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 60, 64, 23));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 60, 112, 23));

        jLabel3.setText("Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 60, 41, 23));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 60, 390, 23));

        jLabel4.setText("Age:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 60, 31, 23));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 60, 66, 23));

        jLabel5.setText("Gender:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 60, -1, 23));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 60, 112, 23));

        jLabel2.setText("Specialisation");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 147, 125, 30));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 148, 346, 30));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 197, 346, 30));

        jLabel6.setText(" Organs Needed (Comma Separated) ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 196, 189, 30));

        jLabel7.setText("Primary Physician");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 245, 125, 30));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 246, 346, 30));

        btnadd.setText("Add ");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 414, 246, 32));

        jLabel8.setText("Current Status");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 294, 125, 30));

        transplantStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Waiting for Transplant ", "Transplant Assigned ", "In Post-op care ", " " }));
        add(transplantStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 294, 346, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pr1.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 163, 220, 190));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
         ManageTransplantpatients mtp = new ManageTransplantpatients(jSplitPane1,system,managepatient);
                jSplitPane1.setRightComponent(mtp);
    }//GEN-LAST:event_btnaddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JComboBox<String> transplantStatus;
    // End of variables declaration//GEN-END:variables
}
