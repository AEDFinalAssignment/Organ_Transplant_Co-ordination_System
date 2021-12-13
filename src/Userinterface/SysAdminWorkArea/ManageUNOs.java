/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.SysAdminWorkArea;


import System.EcoSystem;

import System.UNOs.UNO;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JSplitPane;

/**
 *
 * @author sanjeev
 */
public class ManageUNOs extends javax.swing.JPanel {
    
    UNO uno;

    /**
     * Creates new form ManageUNOs
     */
    private EcoSystem system;
    private JSplitPane jSplitPane1;
    JPanel Managepanel;
    
    public ManageUNOs(JSplitPane jSplitPane1,EcoSystem system,UNO uno,JPanel Managepanel) {
        initComponents();
        this.jSplitPane1 = jSplitPane1;
        this.system = system;
         this.uno = uno;
         this.Managepanel=Managepanel;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUnologin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnHospitalsave = new javax.swing.JButton();
        txtUnoname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtUnomail = new javax.swing.JTextField();
        txtUnopassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUnologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnologinActionPerformed(evt);
            }
        });
        jPanel1.add(txtUnologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 202, 261, -1));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setText("MANAGE UNOs");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 72, -1, -1));

        jLabel3.setText("Login Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 202, -1, -1));

        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 235, 54, -1));

        btnHospitalsave.setText("SAVE");
        btnHospitalsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnHospitalsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 311, -1, -1));
        jPanel1.add(txtUnoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 170, 261, -1));

        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 173, 54, -1));

        jLabel19.setText("Mail ID ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 277, 54, -1));
        jPanel1.add(txtUnomail, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 274, 261, -1));
        jPanel1.add(txtUnopassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 232, 261, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/d8.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 880));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUnologinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnologinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnologinActionPerformed

    private void btnHospitalsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalsaveActionPerformed
        // TODO add your handling code here:
        
         if (txtUnoname.getText().isEmpty()) {
            txtUnoname.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtUnoname.setForeground(Color.red);

        }
        if (txtUnologin.getText().isEmpty()) {
            txtUnologin.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtUnologin.setForeground(Color.red);

        }
        if (txtUnopassword.getText().isEmpty()) {
            txtUnopassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtUnopassword.setForeground(Color.red);

        }
        if (txtUnomail.getText().isEmpty()) {
            txtUnomail.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtUnomail.setForeground(Color.red);

        }
        
          
        
          
         //Null Value Check
         
         if (txtUnoname.getText().isEmpty()
                || txtUnologin.getText().isEmpty()
                || txtUnopassword.getText().isEmpty()
                || txtUnomail.getText().isEmpty()
                ) {
            JOptionPane.showMessageDialog(null, "Enter all fields");
        } 
         
         // Intitializing UNO Object
         else {
             UNO uno =system.addUNO();
         uno.setUNO_Name(txtUnoname.getText());
         uno.setUNO_Username(txtUnologin.getText());
         uno.setUNO_Password(txtUnopassword.getText());
         uno.setUNO_email(txtUnomail.getText());
      
         
         
          try {
            system.saveUNODB(uno);
        } catch (SQLException ex) {
            Logger.getLogger(ManageHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "UNOs details saved sucessfully");
         }
       
         txtUnoname.setText("");
         txtUnologin.setText("");
         txtUnopassword.setText("");
         txtUnomail.setText("");
        
         
         
         
    }//GEN-LAST:event_btnHospitalsaveActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:

        jSplitPane1.setRightComponent(Managepanel);
    }//GEN-LAST:event_jLabel5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHospitalsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtUnologin;
    private javax.swing.JTextField txtUnomail;
    private javax.swing.JTextField txtUnoname;
    private javax.swing.JPasswordField txtUnopassword;
    // End of variables declaration//GEN-END:variables
}
