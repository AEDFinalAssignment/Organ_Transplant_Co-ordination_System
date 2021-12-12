/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.HospitalAdminWorkArea;

import System.EcoSystem;
import System.Hospital.Hospital;
import System.Hospital.HospitalDirectory;
import System.Hospital.Patient.Patient;
import System.Hospital.Patient.PatientDirectory;
import System.Hospital.Staff.Staff;
import System.Hospital.Staff.StaffDirectory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSplitPane;

/**
 *
 * @author sanjeev
 */
public class CreatePatientdetails extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientdetails
     */
    private EcoSystem system;
    private JSplitPane jSplitPane1;
    String Username;
    int id;
    public CreatePatientdetails(JSplitPane jSplitPane1,EcoSystem system,String Username,int id) {
        initComponents();
         this.jSplitPane1 = jSplitPane1;
        this.system = system;
        this.Username = Username;
        this.id = id;
        
        populateFeild(system,Username,id);
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
        jLabel2 = new javax.swing.JLabel();
        txtHealthID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPatientname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPatientaddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPatientCno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPatientmailID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtECname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtECno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPatientcity = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPatientstate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPatientZipcode = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtPatientage = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPatientgender = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("MANAGE PATIENTS:");

        jLabel2.setText("Health ID ");

        jLabel3.setText("Patient ID ");

        jLabel4.setText("Name ");

        jLabel5.setText("Address");

        jLabel6.setText("Contact No. ");

        txtPatientCno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientCnoActionPerformed(evt);
            }
        });

        jLabel7.setText("mail ID ");

        jLabel8.setText("Emergency Contact Name ");

        jLabel9.setText("Emergency Contact No.  ");

        jLabel10.setText("City");

        txtPatientcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientcityActionPerformed(evt);
            }
        });

        jLabel11.setText("State ");

        txtPatientstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientstateActionPerformed(evt);
            }
        });

        jLabel12.setText("Zip Code");

        jLabel13.setText("Entry Date ");

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel14.setText("Age ");

        jLabel15.setText("Gender");

        jButton1.setText("Update");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPatientgender, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPatientage, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtECname, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPatientmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPatientCno, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSave)
                                        .addGap(64, 64, 64)
                                        .addComponent(jButton1))
                                    .addComponent(txtECno, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientname, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtHealthID, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPatientstate, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPatientcity, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(797, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHealthID)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatientID)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatientname)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatientage)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatientgender)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatientaddress)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatientcity)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatientstate)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatientZipcode)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatientCno)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatientmailID)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtECname)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtECno)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(jButton1))
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientCnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientCnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientCnoActionPerformed

    private void txtPatientcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientcityActionPerformed

    private void txtPatientstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientstateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientstateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            HospitalDirectory hosDirectory;
            hosDirectory = system.getDBHospitalDirectory();
            for(Hospital h: hosDirectory.getHospitalDirectory())
            {
                if(h.getUserName().equals(Username))
                {
                    Patient pat = new Patient();
                    pat = h.addPatient();
                    pat.setHealthID(Integer.parseInt(txtHealthID.getText()));
                    pat.setPatientID(Integer.parseInt(txtPatientID.getText()));
                    pat.setName(txtPatientname.getText());
                    pat.setAge(Integer.parseInt(txtPatientage.getText()));
                    pat.setGender(txtPatientgender.getText());
                    pat.setAddress(txtPatientaddress.getText());
                    pat.setCity(txtPatientcity.getText());
                    pat.setState(txtPatientstate.getText());
                    pat.setZipcode(Integer.parseInt(txtPatientZipcode.getText()));
                    pat.setConNumber(Long.parseLong(txtPatientCno.getText()));
                    pat.setEmailID(txtPatientmailID.getText());
                    pat.setEmerConName(txtECname.getText());
                    pat.setEmerConNumber(Long.parseLong(txtECno.getText()));
                    pat.setHospitalUsername(Username);
                    
                    try {
                        system.savePatientDB(pat);
                    } catch (SQLException ex) {
                        Logger.getLogger(ManageStaffdetails.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    txtHealthID.setText("");
                    txtPatientID.setText("");
                    txtPatientname.setText("");
                    txtPatientage.setText("");
                    txtPatientgender.setText("");
                    txtPatientaddress.setText("");
                    txtPatientcity.setText("");
                    txtPatientstate.setText("");
                    txtPatientZipcode.setText("");
                    txtPatientCno.setText("");
                    txtPatientmailID.setText("");
                    txtECname.setText("");
                    txtECno.setText("");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageStaffdetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtECname;
    private javax.swing.JTextField txtECno;
    private javax.swing.JTextField txtHealthID;
    private javax.swing.JTextField txtPatientCno;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPatientZipcode;
    private javax.swing.JTextField txtPatientaddress;
    private javax.swing.JTextField txtPatientage;
    private javax.swing.JTextField txtPatientcity;
    private javax.swing.JTextField txtPatientgender;
    private javax.swing.JTextField txtPatientmailID;
    private javax.swing.JTextField txtPatientname;
    private javax.swing.JTextField txtPatientstate;
    // End of variables declaration//GEN-END:variables

    private void populateFeild(EcoSystem system, String Username, int id) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(id!=-1)
      {
          try {
            // TODO add your handling code here:
            PatientDirectory patDirectory;
            patDirectory = system.getDBPatientDirectory();
            for(Patient p: patDirectory.getPatientDirectory())
            {
                if(p.getPatientID()==id)
                {
                    txtHealthID.setText(String.valueOf(p.getHealthID()));
                    txtPatientID.setText(String.valueOf(p.getPatientID()));
                    txtPatientname.setText(p.getName());
                    txtPatientage.setText(String.valueOf(p.getAge()));
                    txtPatientgender.setText(p.getGender());
                    txtPatientaddress.setText(p.getAddress());
                    txtPatientcity.setText(p.getCity());
                    txtPatientstate.setText(p.getState());
                    txtPatientZipcode.setText(String.valueOf(p.getZipcode()));
                    txtPatientCno.setText(String.valueOf(p.getConNumber()));
                    txtPatientmailID.setText(p.getEmailID());
                    txtECname.setText(p.getEmerConName());
                    txtECno.setText(String.valueOf(p.getEmerConNumber()));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageStaffdetails.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }
}
