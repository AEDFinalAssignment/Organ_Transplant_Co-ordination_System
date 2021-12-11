/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.SysAdminWorkArea;

import System.EcoSystem;
import System.Hospital.Hospital;
import System.Hospital.HospitalDirectory;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import System.Pharmacy.Pharmacy;
import System.Pharmacy.PharmacyDirectory;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanjeev
 */
public class ManagePharmacy extends javax.swing.JPanel {

    /**
     * Creates new form ManagePharmacy
     */
    Hospital hospital;
    HospitalDirectory hospitalDirectory;
    Pharmacy pharmacy;
    PharmacyDirectory pharmacyDirectory;
    EcoSystem system;
    
    public ManagePharmacy(JSplitPane jSplitPane1,EcoSystem system) {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        btnHospitaldelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnHospitalupdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPharmacy = new javax.swing.JTable();
        txtPharmacystate = new javax.swing.JTextField();
        btnHospitalview = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        txtPharmacyzipcode = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        txtPharmacycity = new javax.swing.JTextField();
        txtPharmacyname = new javax.swing.JTextField();
        btnHospitalsave = new javax.swing.JButton();
        txtHospitalsearch = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        txtPharmacypassword = new javax.swing.JTextField();
        txtPharmacylogin = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        zipcodeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPharmacyaddress = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        txtPharmacyEmail = new javax.swing.JTextField();

        btnHospitaldelete.setText("Delete");

        btnSearch.setText("Search");

        btnHospitalupdate.setText("Update");
        btnHospitalupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalupdateActionPerformed(evt);
            }https://github.com/AEDFinalAssignment/Organ_Transplant_Co-ordination_System/pull/10/conflict?name=src%252FUserinterface%252FSysAdminWorkArea%252FManagePharmacy.java&ancestor_oid=530da926f8b245cf29d8d975c1ba78ecc55016a3&base_oid=cc681e59431ea7a5dbb439264a76841b34d6d725&head_oid=85830b3447a73918a4b4480e8a7d0fff38c82d1e
        });


        tblPharmacy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name ", "Login Name ", "Password", "Email", "Address Line", "City", "State", "Zip Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        jScrollPane1.setViewportView(tblPharmacy);

        btnHospitalview.setText("View ");
        btnHospitalview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalviewActionPerformed(evt);
            }
        });

        nameLabel.setText("Name");

        loginLabel.setText("Login Name");

        stateLabel.setText("State");

        passwordLabel.setText("Password");

        btnHospitalsave.setText("SAVE");
        btnHospitalsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalsaveActionPerformed(evt);
            }
        });

        addressLabel.setText("Address Line ");

        txtPharmacylogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPharmacyloginActionPerformed(evt);
            }
        });
        txtPharmacylogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPharmacyloginKeyTyped(evt);
            }
        });

        cityLabel.setText("City");

        zipcodeLabel.setText("Zip Code");

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setText("MANAGE PHARMACY");

        emailLabel.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(nameLabel)
                            .addGap(67, 67, 67)
                            .addComponent(txtPharmacyname, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(loginLabel)
                                .addComponent(passwordLabel)
                                .addComponent(addressLabel)
                                .addComponent(cityLabel)
                                .addComponent(stateLabel)
                                .addComponent(zipcodeLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPharmacylogin)
                                    .addComponent(txtPharmacypassword)
                                    .addComponent(txtPharmacycity)
                                    .addComponent(txtPharmacystate)
                                    .addComponent(txtPharmacyzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtPharmacyaddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(emailLabel)
                        .addGap(68, 68, 68)
                        .addComponent(txtPharmacyEmail)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHospitalview)
                        .addGap(243, 243, 243)
                        .addComponent(btnHospitalupdate)
                        .addGap(234, 234, 234)
                        .addComponent(btnHospitaldelete)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtHospitalsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnSearch))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(btnHospitalsave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHospitalsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHospitalupdate)
                            .addComponent(btnHospitaldelete)
                            .addComponent(btnHospitalview)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(txtPharmacyname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginLabel)
                            .addComponent(txtPharmacylogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPharmacypassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel)
                            .addComponent(txtPharmacyEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressLabel)
                            .addComponent(txtPharmacyaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityLabel)
                            .addComponent(txtPharmacycity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stateLabel)
                            .addComponent(txtPharmacystate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zipcodeLabel)
                            .addComponent(txtPharmacyzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)

                        .addComponent(btnHospitalsave)))
                .addContainerGap(378, Short.MAX_VALUE))
        );

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

    private void txtPharmacyloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPharmacyloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPharmacyloginActionPerformed

    private void btnHospitalsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalsaveActionPerformed
        // TODO add your handling code here:
        
    //Color changes while the text field is empty  
       if (txtPharmacyname.getText().isEmpty()) {
            txtPharmacyname.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtPharmacyname.setForeground(Color.red);

        }
        if (txtPharmacylogin.getText().isEmpty()) {
            txtPharmacylogin.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtPharmacylogin.setForeground(Color.red);

        }
        if (txtPharmacypassword.getText().isEmpty()) {
            txtPharmacypassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtPharmacypassword.setForeground(Color.red);

        }
        if (txtPharmacyaddress.getText().isEmpty()) {
            txtPharmacyaddress.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtPharmacyaddress.setForeground(Color.red);

        }
        if (txtPharmacycity.getText().isEmpty()) {
            txtPharmacycity.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtPharmacycity.setForeground(Color.red);
        }
        
          if (txtPharmacystate.getText().isEmpty()) {
            txtPharmacystate.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtPharmacystate.setForeground(Color.red);
        }
     
          if (txtPharmacyzipcode.getText().isEmpty()) {
            txtPharmacyzipcode.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtPharmacyzipcode.setForeground(Color.red);
        }
          
         //Null Value Check
         
         if (txtPharmacyname.getText().isEmpty()
                || txtPharmacylogin.getText().isEmpty()
                || txtPharmacypassword.getText().isEmpty()
                || txtPharmacyaddress.getText().isEmpty()
                || txtPharmacycity == null
                || txtPharmacystate.getText().isEmpty()
                || txtPharmacyzipcode == null) {
            JOptionPane.showMessageDialog(null, "Enter all fields");
        } 
         
         else{
             
             // Initializing pharmacy object
              Pharmacy newpharmacy = pharmacyDirectory.addPharmacy();
              
              newpharmacy.setName(txtPharmacyname.getText());
              newpharmacy.setUserName(txtPharmacylogin.getText());
              newpharmacy.setPassword(txtPharmacypassword.getText());
              newpharmacy.setEmail(txtPharmacyEmail.getText());
              newpharmacy.setAddress(txtPharmacyaddress.getText());
              newpharmacy.setCity(txtPharmacycity.getText());
              newpharmacy.setState(txtPharmacystate.getText());
              newpharmacy.setZipCode(Integer.parseInt(txtPharmacyzipcode.getText()));
              
              
              // Add the details to table
              
                String name = txtPharmacyname.getText();
                String login = txtPharmacylogin.getText();
                String password = txtPharmacypassword.getText();
                String email = txtPharmacyEmail.getText();
                String address = txtPharmacyaddress.getText();
                String city = txtPharmacycity.getText();
                String state = txtPharmacystate.getText();
                String zipcode = txtPharmacyzipcode.getText();

                int selectedRowIndex = tblPharmacy.getSelectedRow();  


                DefaultTableModel model = (DefaultTableModel) tblPharmacy.getModel();
                model.setValueAt(name, selectedRowIndex, 0);
                model.setValueAt(login, selectedRowIndex, 1);
                model.setValueAt(password, selectedRowIndex, 2);
                model.setValueAt(email, selectedRowIndex, 3);
                model.setValueAt(address, selectedRowIndex, 4);
                model.setValueAt(city, selectedRowIndex, 5);
                model.setValueAt(state, selectedRowIndex, 6);
                model.setValueAt(zipcode, selectedRowIndex, 7);
              
         }
    }//GEN-LAST:event_btnHospitalsaveActionPerformed

    private void txtPharmacyloginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPharmacyloginKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPharmacyloginKeyTyped

    private void btnHospitalviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalviewActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblPharmacy.getSelectedRow();
        
        if(selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;            
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPharmacy.getModel();
        Pharmacy selectedEntry = (Pharmacy) model.getValueAt(selectedRowIndex, 0);       
        
         
        txtPharmacyname.setText(selectedEntry.getName());
        txtPharmacylogin.setText(selectedEntry.getUserName());
        txtPharmacypassword.setText(String.valueOf(selectedEntry.getPassword()));
        txtPharmacyEmail.setText(selectedEntry.getEmail());
        txtPharmacyaddress.setText(selectedEntry.getAddress());
        txtPharmacycity.setText(String.valueOf(selectedEntry.getCity()));
        txtPharmacystate.setText(String.valueOf(selectedEntry.getState()));
        txtPharmacyzipcode.setText(String.valueOf(selectedEntry.getZipCode()));
    }//GEN-LAST:event_btnHospitalviewActionPerformed

    private void btnHospitalupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHospitalupdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton btnHospitaldelete;
    private javax.swing.JButton btnHospitalsave;
    private javax.swing.JButton btnHospitalupdate;
    private javax.swing.JButton btnHospitalview;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTable tblPharmacy;
    private javax.swing.JTextField txtHospitalsearch;
    private javax.swing.JTextField txtPharmacyEmail;
    private javax.swing.JTextField txtPharmacyaddress;
    private javax.swing.JTextField txtPharmacycity;
    private javax.swing.JTextField txtPharmacylogin;
    private javax.swing.JTextField txtPharmacyname;
    private javax.swing.JTextField txtPharmacypassword;
    private javax.swing.JTextField txtPharmacystate;
    private javax.swing.JTextField txtPharmacyzipcode;
    private javax.swing.JLabel zipcodeLabel;
    // End of variables declaration//GEN-END:variables
}
