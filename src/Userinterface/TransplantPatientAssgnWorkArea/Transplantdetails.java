/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.TransplantPatientAssgnWorkArea;

import System.EcoSystem;
import System.Hospital.Patient.Patient;
import System.Hospital.Patient.TransplantPatient;
import System.Hospital.Patient.VitalSigns.VitalSigns;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
    int id;
    String Username;
    public Transplantdetails(JSplitPane jSplitPane1,EcoSystem system,String Username,int id) throws SQLException {
        initComponents();
        this.jSplitPane1 = jSplitPane1;
        this.system = system;
        this.managepatient=managepatient;
        this.id = id;
        this.Username = Username;
        
        populateFeild(jSplitPane1,system,id);
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
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtOrgans = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPhysician = new javax.swing.JTextField();
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

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
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

        txtPhysician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhysicianActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPhysician, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                .addComponent(txtOrgans, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)))))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrgans, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhysician, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(486, Short.MAX_VALUE))
        );
        jLabel8.setText("Current Status");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 294, 125, 30));

        transplantStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Waiting for Transplant ", "Transplant Assigned ", "In Post-op care ", " " }));
        add(transplantStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 294, 346, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pr1.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 163, 220, 190));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPhysicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhysicianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhysicianActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(this, "Organs needed data updated");
   //      ManageTransplantpatients mtp = new ManageTransplantpatients(jSplitPane1,system,managepatient);
   //             jSplitPane1.setRightComponent(mtp);
               TransplantPatient transplantPatient = new TransplantPatient();
         try {
             for(Patient p: system.getDBPatientDirectory().getPatientDirectory())
             {
                 if(p.getPatientID()==id)
                 {
                     transplantPatient.setHealthID(p.getHealthID());
                     transplantPatient.setPatientID(p.getPatientID());
                     transplantPatient.setPhysician(txtPhysician.getText());
                     
                 }
             } } catch (SQLException ex) {
             Logger.getLogger(Transplantdetails.class.getName()).log(Level.SEVERE, null, ex);
         }
               transplantPatient.setName(txtName.getText());
               transplantPatient.setOrgansNeeded(txtOrgans.getText());
               transplantPatient.setStatus("Requested");
               transplantPatient.setHosUsername(Username);
         try {
             system.addTransplantDB(transplantPatient);
         } catch (SQLException ex) {
             Logger.getLogger(Transplantdetails.class.getName()).log(Level.SEVERE, null, ex);
         }
               
               txtID.setText("");
               txtName.setText("");
               txtAge.setText("");
               txtGender.setText("");
               txtPhysician.setText("");
               txtOrgans.setText("");
         
    }//GEN-LAST:event_btnaddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOrgans;
    private javax.swing.JTextField txtPhysician;

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

    private void populateFeild(JSplitPane jSplitPane1, EcoSystem system, int id) throws SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       for(Patient p: system.getDBPatientDirectory().getPatientDirectory())
       {
           if(p.getPatientID()==id)
           {
               txtID.setText(String.valueOf(id));
               txtName.setText(p.getName());
               txtAge.setText(String.valueOf(p.getAge()));
               txtGender.setText(p.getGender());
               for(VitalSigns vs: system.getDBVitalSignsDirectory().getVitalSignsDirectory())
               {
                if(vs.getPatientID()==id){
                  txtPhysician.setText(vs.getPhysician());
                }
               }
               
           }
       }
    }
}
