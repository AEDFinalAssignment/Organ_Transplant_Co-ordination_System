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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
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
    JPanel Managepanel;
     private JSplitPane jSplitPane1;
    
    public ManagePharmacy(JSplitPane jSplitPane1,EcoSystem system, JPanel Managepanel) throws SQLException {
        initComponents();
      
        this.system = system;
        this.jSplitPane1=jSplitPane1;
        
        this.Managepanel=Managepanel;
        populateTable();
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
        txtPharmacylogin = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        zipcodeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPharmacyaddress = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        txtPharmacyEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhar = new javax.swing.JTable();
        txtPharmacypassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        btnHospitaldelete.setText("Delete");
        btnHospitaldelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitaldeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");

        btnHospitalupdate.setText("Update");
        btnHospitalupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalupdateActionPerformed(evt);
            }
        });

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

        tblPhar.setModel(new javax.swing.table.DefaultTableModel(
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
                "Name ", "Login Name ", "Password", "Address Line", "City", "State", "Zip Code", "Mail ID "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPhar);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(nameLabel)
                            .addGap(67, 67, 67)
                            .addComponent(txtPharmacyname, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(zipcodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPharmacylogin)
                                .addComponent(txtPharmacycity)
                                .addComponent(txtPharmacystate)
                                .addComponent(txtPharmacyzipcode, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addComponent(txtPharmacyaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addComponent(txtPharmacyEmail)
                                .addComponent(txtPharmacypassword)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHospitalview)
                        .addGap(243, 243, 243)
                        .addComponent(btnHospitalupdate)
                        .addGap(234, 234, 234)
                        .addComponent(btnHospitaldelete)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtHospitalsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnSearch)))
                        .addGap(149, 149, 149))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(btnHospitalsave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressLabel, cityLabel, loginLabel, nameLabel, passwordLabel, stateLabel, zipcodeLabel});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHospitalsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
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
                            .addComponent(passwordLabel)
                            .addComponent(txtPharmacypassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
          
         //Null Check
       
          if (txtPharmacyname.getText().isEmpty()
                || txtPharmacylogin.getText().isEmpty()
                || txtPharmacypassword.getText().isEmpty()
                || txtPharmacyEmail.getText().isEmpty()
                || txtPharmacyaddress.getText().isEmpty()
                || txtPharmacycity.getText().isEmpty()
                || txtPharmacystate.getText().isEmpty()
                || txtPharmacyzipcode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter all fields");
        } 
          
        //Data Validation
        int validation = 1;
        
        if(txtPharmacyname.getText().matches("-?(0|[1-9]\\d*)")){
             JOptionPane.showMessageDialog(null, "Enter Valid Name");    
              validation=0;
        }
        
        if(txtPharmacycity.getText().matches("-?(0|[1-9]\\d*)")){
               JOptionPane.showMessageDialog(null, "Enter valid city name");    
               validation=0;            
        }
        
         if(txtPharmacystate.getText().matches("-?(0|[1-9]\\d*)")){
               JOptionPane.showMessageDialog(null, "Enter valid state name");    
               validation=0;            
        }   
         
         if(txtPharmacyEmail.getText().contains("@")&& (txtPharmacyEmail.getText().contains(".com"))){
              JOptionPane.showMessageDialog(null, "Enter valid email id");    
               validation=0;  
         }
         
           if(txtPharmacyzipcode.getText().matches("^[a-zA-Z]*$ ")){
               JOptionPane.showMessageDialog(null, "Enter valid zipcode");    
               validation=0;            
        }   
         
           
         //Unique Check for username
         
       /*  if (hospitalDirectory.searchHospital(txtPharmacylogin.getText())!=null){
              JOptionPane.showMessageDialog(null, "Enter a unique Username");    
              validation=0; 
         }*/
         
         if(validation==1){
            
             // Initializing pharmacy object
              Pharmacy newpharmacy = system.addPharmacy();

              
              newpharmacy.setName(txtPharmacyname.getText());
              newpharmacy.setUserName(txtPharmacylogin.getText());
              newpharmacy.setPassword(txtPharmacypassword.getText());
              newpharmacy.setEmail(txtPharmacyEmail.getText());
              newpharmacy.setAddress(txtPharmacyaddress.getText());
              newpharmacy.setCity(txtPharmacycity.getText());
              newpharmacy.setState(txtPharmacystate.getText());
              newpharmacy.setZipCode(Integer.parseInt(txtPharmacyzipcode.getText()));

              try {
            system.savePharmacyDB(newpharmacy);
        } catch (SQLException ex) {
            Logger.getLogger(ManagePharmacy.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Pharmacy details saved sucessfully");
        try {
            populateTable();
        } catch (SQLException ex) {
            Logger.getLogger(ManagePharmacy.class.getName()).log(Level.SEVERE, null, ex);
        }
         txtPharmacyname.setText("");
         txtPharmacylogin.setText("");
         txtPharmacypassword.setText("");
         txtPharmacyaddress.setText("");
         txtPharmacycity.setText("");
         txtPharmacystate.setText("");
         txtPharmacyzipcode.setText("");
         txtPharmacyEmail.setText("");
              
              
              
         }
    }//GEN-LAST:event_btnHospitalsaveActionPerformed

    private void txtPharmacyloginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPharmacyloginKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPharmacyloginKeyTyped

    private void btnHospitalviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalviewActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblPhar.getSelectedRow();
        
        if(selectedRowIndex <0){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;            
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPhar.getModel();
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

         try {
            // TODO add your handling code here:
            int selectedRowIndex = tblPhar.getSelectedRow();
            
            if(selectedRowIndex<0)
            {
                JOptionPane.showMessageDialog(this, "Select a Pharmacy to update.");
                return;
            }
            
            DefaultTableModel modelphar = (DefaultTableModel) tblPhar.getModel();
            Pharmacy selectedPharmacy = (Pharmacy) modelphar.getValueAt(selectedRowIndex, 0);
            String PharmacyUsername = selectedPharmacy.getUserName();
            PharmacyDirectory pharDirectory = system.getDBPharmacyDirectory();
            
            for(Pharmacy phar: pharDirectory.getPharmacyDirectory())
            {   
                if(phar.getUserName().equals(PharmacyUsername))
                {
                    phar.setName(txtPharmacyname.getText());
                    phar.setUserName(txtPharmacylogin.getText());
                    phar.setPassword(txtPharmacypassword.getText());
                    phar.setAddress(txtPharmacyaddress.getText());
                    phar.setCity(txtPharmacycity.getText());
                    phar.setState(txtPharmacystate.getText());
                    phar.setZipCode(Integer.parseInt(txtPharmacyzipcode.getText()));
                    phar.setEmail(txtPharmacyEmail.getText());
                    
                    System.out.println(11111);
                    try {
                        system.updatePharmacyDB(phar);
                        System.out.println(22222);
                    } catch (SQLException ex) {
                        Logger.getLogger(ManagePharmacy.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "Pharmacy details updated sucessfully");
                    try {
                        populateTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ManagePharmacy.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    txtPharmacyname.setText("");
                    txtPharmacylogin.setText("");
                    txtPharmacypassword.setText("");
                    txtPharmacyaddress.setText("");
                    txtPharmacycity.setText("");
                    txtPharmacystate.setText("");
                    txtPharmacyzipcode.setText("");
                    txtPharmacyEmail.setText("");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagePharmacy.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       

    }//GEN-LAST:event_btnHospitalupdateActionPerformed

    private void btnHospitaldeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitaldeleteActionPerformed
        // TODO add your handling code here:
        
            int selectedRowIndex = tblPhar.getSelectedRow();
        
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a hospital to delete.");
            return;
        }
        
        DefaultTableModel modelhos = (DefaultTableModel) tblPhar.getModel();
        Pharmacy selectedPharmacy = (Pharmacy) modelhos.getValueAt(selectedRowIndex, 0);
        
        system.getPharmacyDirectory().getPharmacyDirectory().remove(selectedPharmacy);
        
        try {
            system.deletePharmacyDB(selectedPharmacy);
        } catch (SQLException ex) {
            Logger.getLogger(ManagePharmacy.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(this, "Pharmacy details deleted sucessfully");
        try {
            populateTable();
        } catch (SQLException ex) {
            Logger.getLogger(ManagePharmacy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHospitaldeleteActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:

        jSplitPane1.setRightComponent(Managepanel);
    }//GEN-LAST:event_jLabel2MouseClicked


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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTable tblPhar;
    private javax.swing.JTextField txtHospitalsearch;
    private javax.swing.JTextField txtPharmacyEmail;
    private javax.swing.JTextField txtPharmacyaddress;
    private javax.swing.JTextField txtPharmacycity;
    private javax.swing.JTextField txtPharmacylogin;
    private javax.swing.JTextField txtPharmacyname;
    private javax.swing.JPasswordField txtPharmacypassword;
    private javax.swing.JTextField txtPharmacystate;
    private javax.swing.JTextField txtPharmacyzipcode;
    private javax.swing.JLabel zipcodeLabel;
    // End of variables declaration//GEN-END:variables
 private void populateTable() throws SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       DefaultTableModel model = (DefaultTableModel)tblPhar.getModel();
       model.setRowCount(0);
         
       PharmacyDirectory pharDirectory = system.getDBPharmacyDirectory();
         for(Pharmacy h: pharDirectory.getPharmacyDirectory())
         {
             Object[] row = new Object[8];
             row[0]=h;
             row[1]=h.getUserName();
             row[2]=h.getPassword();
             row[3]=h.getAddress();
             row[4]=h.getCity();
             row[5]=h.getState();
             row[6]=h.getZipCode();
           
             row[7]=h.getEmail();
             
             model.addRow(row);
         }
    }

}
