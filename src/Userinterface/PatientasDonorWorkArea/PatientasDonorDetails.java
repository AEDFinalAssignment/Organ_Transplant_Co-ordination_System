/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.PatientasDonorWorkArea;

import System.EcoSystem;
import javax.swing.JSplitPane;

/**
 *
 * @author sanjeev
 */
public class PatientasDonorDetails extends javax.swing.JPanel {

    /**
     * Creates new form PatientasDonorDetails
     */
     private EcoSystem system;
    private JSplitPane jSplitPane1;
    public PatientasDonorDetails(JSplitPane jSplitPane1,EcoSystem system) {
        initComponents();
         this.jSplitPane1 = jSplitPane1;
        this.system = system;
        
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
        jLabel18 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Patient  ID:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 106, 64, 23));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 106, 112, 23));

        jLabel3.setText("Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 106, 41, 23));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 106, 390, 23));

        jLabel4.setText("Age:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 106, 31, 23));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 106, 66, 23));

        jLabel5.setText("Gender:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 106, -1, 23));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 106, 112, 23));

        jLabel18.setText("Primary Physician : ");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 161, 146, 28));
        add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 162, 226, 28));

        jLabel2.setText("List of Available Organs :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 234, 175, 36));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 236, 478, 33));

        jButton1.setText("Update UNOs");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 355, 307, 35));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("PATIENT DETAILS:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 47, 258, 28));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pr1.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 220, 210, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
