/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.SysAdminWorkArea;

import System.EcoSystem;
import System.Hospital.Hospital;
import System.Hospital.HospitalDirectory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanjeev
 */
public class ManageHospital extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospital
     */
    EcoSystem system;
    JSplitPane jSplitPane1;
    HospitalDirectory hospitalDirectory;
    public ManageHospital(JSplitPane jSplitPane1,EcoSystem system) {
        initComponents();
        this.system = system;
        this.jSplitPane1 = jSplitPane1;
        try {
            populateTable();
        } catch (SQLException ex) {
            Logger.getLogger(ManageHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtHospitalname1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtHospitallogin1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtHospitaladdress1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtHospitalcity1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtHospitalstate1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtHospitalzipcode1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        btnSave1 = new javax.swing.JButton();
        txtHospitalsearch1 = new javax.swing.JTextField();
        btnSearch1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHospital1 = new javax.swing.JTable();
        btnView1 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtHospitalmail = new javax.swing.JTextField();
        txtHospitalpassword1 = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel10.setText("MANAGE HOSPITAL");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 41, -1, -1));

        jLabel11.setText("Name");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 127, -1, -1));
        add(txtHospitalname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 220, -1));

        jLabel12.setText("Login Name");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 161, -1, -1));

        txtHospitallogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitallogin1ActionPerformed(evt);
            }
        });
        add(txtHospitallogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 220, -1));

        jLabel13.setText("Password");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 201, -1, -1));

        jLabel14.setText("Address Line ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 246, -1, -1));
        add(txtHospitaladdress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 220, -1));

        jLabel15.setText("City");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 288, -1, -1));
        add(txtHospitalcity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 220, -1));

        jLabel16.setText("State");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 327, -1, -1));
        add(txtHospitalstate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 220, -1));

        jLabel17.setText("Zip Code");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 368, -1, -1));
        add(txtHospitalzipcode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 220, -1));

        jLabel18.setText("Whether it is equipped for Transplant ");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setText("YES");
        add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        buttonGroup1.add(jCheckBox4);
        jCheckBox4.setSelected(true);
        jCheckBox4.setText("NO");
        add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        btnSave1.setText("SAVE");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 536, -1, -1));
        add(txtHospitalsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 125, 236, -1));

        btnSearch1.setText("Search");
        add(btnSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 124, -1, -1));

        tblHospital1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name ", "Login Name ", "Password", "Address Line", "City", "State", "Zip Code", "Equipped for transplant ", "Mail ID "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHospital1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 163, 791, 262));

        btnView1.setText("View ");
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });
        add(btnView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 502, -1, -1));

        btnUpdate1.setText("Update");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        add(btnUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(907, 502, -1, -1));

        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 502, -1, -1));

        jLabel19.setText("Mail ID ");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        txtHospitalmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalmailActionPerformed(evt);
            }
        });
        add(txtHospitalmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 220, -1));

        txtHospitalpassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalpassword1ActionPerformed(evt);
            }
        });
        add(txtHospitalpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 220, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtHospitallogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitallogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitallogin1ActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:
       Hospital hos = system.addHospital();
       hos.setName(txtHospitalname1.getText());
       hos.setUserName(txtHospitallogin1.getText());
       hos.setPassword(txtHospitalpassword1.getText());
       hos.setAddress(txtHospitaladdress1.getText());
       hos.setCity(txtHospitalcity1.getText());
       hos.setState(txtHospitalstate1.getText());
       hos.setZipCode(Integer.parseInt(txtHospitalzipcode1.getText()));
       hos.setEmail(txtHospitalmail.getText());
       hos.setTransplantEquipped("No");
    if(jCheckBox3.isSelected())
     hos.setTransplantEquipped("Yes");


      
       
       //Null Check
       
          if (txtHospitalname1.getText().isEmpty()
                || txtHospitallogin1.getText().isEmpty()
                || txtHospitalpassword1.getText().isEmpty()
                || txtHospitalmail.getText().isEmpty()
                || txtHospitaladdress1.getText().isEmpty()
                || txtHospitalcity1.getText().isEmpty()
                || txtHospitalstate1.getText().isEmpty()
                || txtHospitalzipcode1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter all fields");
        } 
          
        //Data Validation
        int validation = 1;
        
        if(txtHospitalname1.getText().matches("-?(0|[1-9]\\d*)")){
             JOptionPane.showMessageDialog(null, "Enter Valid Name");    
              validation=0;
        }
        
        if(txtHospitalcity1.getText().matches("-?(0|[1-9]\\d*)")){
               JOptionPane.showMessageDialog(null, "Enter valid city name");    
               validation=0;            
        }
        
         if(txtHospitalstate1.getText().matches("-?(0|[1-9]\\d*)")){
               JOptionPane.showMessageDialog(null, "Enter valid state name");    
               validation=0;            
        }   
         
//         if(txtHospitalmail.getText().contains("@")&& (txtHospitalmail.getText().contains(".com"))){
//              JOptionPane.showMessageDialog(null, "Enter valid email id");    
//               validation=0;  
//         }
//         
           if(txtHospitalzipcode1.getText().matches("^[a-zA-Z]*$ ")){
               JOptionPane.showMessageDialog(null, "Enter valid zipcode");    
               validation=0;            
        }   
         
           
         //Unique Check for username
         
         /*if (hospitalDirectory.searchHospital(txtHospitallogin1.getText())!=null){
              JOptionPane.showMessageDialog(null, "Enter a unique Username");    
              validation=0; 
         }*/
         
         if(validation==1){
             
             
             JOptionPane.showMessageDialog(this, "New Hospital details are added.");             
         }    
       
         
         
        try {
            system.saveHospitalDB(hos);
        } catch (SQLException ex) {
            Logger.getLogger(ManageHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
            populateTable();
        } catch (SQLException ex) {
            Logger.getLogger(ManageHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
       txtHospitalname1.setText("");
       txtHospitallogin1.setText("");
       txtHospitalpassword1.setText("");
       txtHospitaladdress1.setText("");
       txtHospitalcity1.setText("");
       txtHospitalstate1.setText("");
       txtHospitalzipcode1.setText("");
       txtHospitalmail.setText("");
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblHospital1.getSelectedRow();
        
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a hospital to view.");
            return;
        }
        
        DefaultTableModel modelhos = (DefaultTableModel) tblHospital1.getModel();
        Hospital selectedHospital = (Hospital) modelhos.getValueAt(selectedRowIndex, 0);
        String hospitalUsername = selectedHospital.getUserName();
        
        txtHospitalname1.setText(selectedHospital.getName());
        txtHospitallogin1.setText(selectedHospital.getUserName());
        txtHospitalpassword1.setText(selectedHospital.getPassword());
        txtHospitaladdress1.setText(selectedHospital.getAddress());
        txtHospitalcity1.setText(selectedHospital.getCity());
        txtHospitalstate1.setText(selectedHospital.getState());
        txtHospitalzipcode1.setText(String.valueOf(selectedHospital.getZipCode()));
        txtHospitalmail.setText(selectedHospital.getEmail());
        
    }//GEN-LAST:event_btnView1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        try {
            // TODO add your handling code here:
            int selectedRowIndex = tblHospital1.getSelectedRow();
            
            if(selectedRowIndex<0)
            {
                JOptionPane.showMessageDialog(this, "Select a hospital to update.");
                return;
            }
            
            
            
            DefaultTableModel modelhos = (DefaultTableModel) tblHospital1.getModel();
            Hospital selectedHospital = (Hospital) modelhos.getValueAt(selectedRowIndex, 0);
            String hospitalUsername = selectedHospital.getUserName();
            HospitalDirectory hosDirectory = system.getDBHospitalDirectory();
            
            for(Hospital hos: hosDirectory.getHospitalDirectory())
            {   
                if(hos.getUserName().equals(hospitalUsername))
                {
                    hos.setName(txtHospitalname1.getText());
                    hos.setUserName(txtHospitallogin1.getText());
                    hos.setPassword(txtHospitalpassword1.getText());
                    hos.setAddress(txtHospitaladdress1.getText());
                    hos.setCity(txtHospitalcity1.getText());
                    hos.setState(txtHospitalstate1.getText());
                    hos.setZipCode(Integer.parseInt(txtHospitalzipcode1.getText()));
                    hos.setEmail(txtHospitalmail.getText());
                    hos.setTransplantEquipped("No");
                    if(jCheckBox3.isSelected())
                    hos.setTransplantEquipped("Yes");
                    try {
                        system.updateHospitalDB(hos);
                    } catch (SQLException ex) {
                        Logger.getLogger(ManageHospital.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    //
                    
                       //Null Check
       
          

             JOptionPane.showMessageDialog(this,"Hospital details updated sucessfully");             
            
                  
                    
                    
                    try {
                        populateTable();
                    } catch (SQLException ex) {
                        Logger.getLogger(ManageHospital.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    txtHospitalname1.setText("");
                    txtHospitallogin1.setText("");
                    txtHospitalpassword1.setText("");
                    txtHospitaladdress1.setText("");
                    txtHospitalcity1.setText("");
                    txtHospitalstate1.setText("");
                    txtHospitalzipcode1.setText("");
                    txtHospitalmail.setText("");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblHospital1.getSelectedRow();
        
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a hospital to delete.");
            return;
        }
        
        DefaultTableModel modelhos = (DefaultTableModel) tblHospital1.getModel();
        Hospital selectedHospital = (Hospital) modelhos.getValueAt(selectedRowIndex, 0);
        
        system.getHospitalDirectory().getHospitalDirectory().remove(selectedHospital);
        
        try {
            system.deleteHospitalDB(selectedHospital);
        } catch (SQLException ex) {
            Logger.getLogger(ManageHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(this, "Hospital details deleted sucessfully");
        try {
            populateTable();
        } catch (SQLException ex) {
            Logger.getLogger(ManageHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void txtHospitalpassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalpassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalpassword1ActionPerformed

    private void txtHospitalmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnView1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblHospital1;
    private javax.swing.JTextField txtHospitaladdress1;
    private javax.swing.JTextField txtHospitalcity1;
    private javax.swing.JTextField txtHospitallogin1;
    private javax.swing.JTextField txtHospitalmail;
    private javax.swing.JTextField txtHospitalname1;
    private javax.swing.JPasswordField txtHospitalpassword1;
    private javax.swing.JTextField txtHospitalsearch1;
    private javax.swing.JTextField txtHospitalstate1;
    private javax.swing.JTextField txtHospitalzipcode1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() throws SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       DefaultTableModel model = (DefaultTableModel) tblHospital1.getModel();
       model.setRowCount(0);
         
       HospitalDirectory hosDirectory = system.getDBHospitalDirectory();
         for(Hospital h: hosDirectory.getHospitalDirectory())
         {
             Object[] row = new Object[9];
             row[0]=h;
             row[1]=h.getUserName();
             row[2]=h.getPassword();
             row[3]=h.getAddress();
             row[4]=h.getCity();
             row[5]=h.getState();
             row[6]=h.getZipCode();
             row[7]=h.getTransplantEquipped();
             row[8]=h.getEmail();
             
             model.addRow(row);
         }
    }
}
