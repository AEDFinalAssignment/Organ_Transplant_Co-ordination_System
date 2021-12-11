/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.SysAdminWorkArea;

import javax.swing.JSplitPane;





/**
 *
 * @author sanjeev
 */
public class ManageJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageJpanel
     */
    JSplitPane jSplitPane1;
    
    public ManageJpanel(JSplitPane jSplitPane1) {
        initComponents();
        this.jSplitPane1 = jSplitPane1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrySys1 = new javax.swing.JButton();
        btnHospital = new javax.swing.JButton();
        btnUNOs = new javax.swing.JButton();
        btnTransportation = new javax.swing.JButton();
        btnPharmacy = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jpanel1.setBackground(new java.awt.Color(255, 255, 255));
        Jpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/u2.png"))); // NOI18N
        Jpanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 100, 326, 206));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hospital logo.png"))); // NOI18N
        Jpanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 104, -1, 213));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/tr1.png"))); // NOI18N
        Jpanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 237, 205));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/t2.png"))); // NOI18N
        Jpanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, 118));

        btnRegistrySys1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnRegistrySys1.setText("Manage Registry System");
        btnRegistrySys1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrySys1ActionPerformed(evt);
            }
        });
        Jpanel1.add(btnRegistrySys1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        btnHospital.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnHospital.setText("Manage Hospitals ");
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });
        Jpanel1.add(btnHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        btnUNOs.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnUNOs.setText("Manage UNOs");
        btnUNOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUNOsActionPerformed(evt);
            }
        });
        Jpanel1.add(btnUNOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 330, -1, -1));

        btnTransportation.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnTransportation.setText("Manage Transportation");
        btnTransportation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransportationActionPerformed(evt);
            }
        });
        Jpanel1.add(btnTransportation, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 670, -1, -1));

        btnPharmacy.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnPharmacy.setText("Manage Pharmacy");
        btnPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPharmacyActionPerformed(evt);
            }
        });
        Jpanel1.add(btnPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 660, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pr1.png"))); // NOI18N
        Jpanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 225, 144));

        add(Jpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 880));
    }// </editor-fold>//GEN-END:initComponents


    private void btnRegistrySys1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrySys1ActionPerformed
        // TODO add your handling code here:
                ManageRegistry mr = new ManageRegistry(jSplitPane1);
                jSplitPane1.setRightComponent(mr);
    }//GEN-LAST:event_btnRegistrySys1ActionPerformed

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed
        // TODO add your handling code here:
        ManageHospital mh = new ManageHospital(jSplitPane1);
        jSplitPane1.setRightComponent(mh);
    }//GEN-LAST:event_btnHospitalActionPerformed

    private void btnTransportationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransportationActionPerformed
        // TODO add your handling code here:
         ManageTransportation mt= new ManageTransportation(jSplitPane1);
        jSplitPane1.setRightComponent(mt);
    }//GEN-LAST:event_btnTransportationActionPerformed

    private void btnUNOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUNOsActionPerformed
        // TODO add your handling code here:
        ManageUNOs mu= new ManageUNOs(jSplitPane1);
        jSplitPane1.setRightComponent(mu);
    }//GEN-LAST:event_btnUNOsActionPerformed

    private void btnPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPharmacyActionPerformed
        // TODO add your handling code here:
          ManagePharmacy mp= new ManagePharmacy(jSplitPane1,system);
        jSplitPane1.setRightComponent(mp);
    }//GEN-LAST:event_btnPharmacyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel1;
    private javax.swing.JButton btnHospital;
    private javax.swing.JButton btnPharmacy;
    private javax.swing.JButton btnRegistrySys1;
    private javax.swing.JButton btnTransportation;
    private javax.swing.JButton btnUNOs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
