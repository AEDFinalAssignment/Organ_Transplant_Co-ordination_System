/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.SysAdminWorkArea;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author sanjeev
 */
public class ManageHospital extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospital
     */
    public ManageHospital(JSplitPane jSplitPane1) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtHospitalname1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtHospitallogin1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtHospitalpassword1 = new javax.swing.JTextField();
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

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel10.setText("MANAGE HOSPITAL");

        jLabel11.setText("Name");

        jLabel12.setText("Login Name");

        txtHospitallogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitallogin1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Password");

        jLabel14.setText("Address Line ");

        jLabel15.setText("City");

        jLabel16.setText("State");

        jLabel17.setText("Zip Code");

        jLabel18.setText("Whether it is equipped for Transplant ");

        jCheckBox3.setText("YES");

        jCheckBox4.setSelected(true);
        jCheckBox4.setText("NO");

        btnSave1.setText("SAVE");

        btnSearch1.setText("Search");

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

        btnView1.setText("View ");

        btnUpdate1.setText("Update");

        btnDelete1.setText("Delete");

        jLabel19.setText("Mail ID ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(btnSave1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(67, 67, 67)
                                    .addComponent(txtHospitalname1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel17))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtHospitallogin1)
                                        .addComponent(txtHospitalpassword1)
                                        .addComponent(txtHospitaladdress1)
                                        .addComponent(txtHospitalcity1)
                                        .addComponent(txtHospitalstate1)
                                        .addComponent(txtHospitalzipcode1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(39, 39, 39)
                                    .addComponent(jCheckBox3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox4)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(67, 67, 67)
                                .addComponent(txtHospitalmail, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnView1)
                                .addGap(230, 230, 230)
                                .addComponent(btnUpdate1)
                                .addGap(228, 228, 228)
                                .addComponent(btnDelete1)
                                .addGap(72, 72, 72))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtHospitalsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(btnSearch1)))))
                    .addComponent(jLabel10))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel10)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtHospitalname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtHospitallogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtHospitalpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtHospitaladdress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtHospitalcity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtHospitalstate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtHospitalzipcode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtHospitalmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4))
                        .addGap(83, 83, 83)
                        .addComponent(btnSave1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHospitalsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate1)
                            .addComponent(btnView1)
                            .addComponent(btnDelete1))))
                .addContainerGap(326, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHospitallogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitallogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitallogin1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnView1;
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
    private javax.swing.JTextField txtHospitalpassword1;
    private javax.swing.JTextField txtHospitalsearch1;
    private javax.swing.JTextField txtHospitalstate1;
    private javax.swing.JTextField txtHospitalzipcode1;
    // End of variables declaration//GEN-END:variables
}
