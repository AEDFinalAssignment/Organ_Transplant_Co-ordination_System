/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.TransplantPatientAssgnWorkArea;

import System.EcoSystem;
import System.Hospital.Patient.Patient;
import System.Hospital.Patient.PatientDirectory;
import System.Hospital.Patient.TransplantPatient;
import System.Hospital.Patient.TransplantPatientDirectory;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanjeev
 */
public class ManageTransplantpatients extends javax.swing.JPanel {

    /**
     * Creates new form ManageTransplantpatients
     */
     private EcoSystem system;
    private JSplitPane jSplitPane1;
    JPanel managepatient;
    String Username;
    
    public ManageTransplantpatients(JSplitPane jSplitPane1,EcoSystem system,JPanel managepatient,String Username) throws SQLException {
        initComponents();
        this.jSplitPane1 = jSplitPane1;
        this.system = system;
        this.managepatient=managepatient;
        this.Username = Username;
        
        populateTable(system,Username);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransplantpatients = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MANAGE  TRANSPLANT PATIENT DETAILS :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 131, 329, 30));

        tblTransplantpatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Health ID ", "Patient ID ", "Patient Name ", "Primary Physician ", "Organs Needed ", "Recent Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTransplantpatients);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 223, 1031, 251));

        jButton2.setText("Assign for Transplant ");

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 517, 172, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 33, 40, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:

        jSplitPane1.setRightComponent(managepatient);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTransplantpatients;
    // End of variables declaration//GEN-END:variables

    private void populateTable(EcoSystem system, String Username) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel model = (DefaultTableModel) tblTransplantpatients.getModel();
        model.setRowCount(0);
        
        TransplantPatientDirectory TransplantPatientDirectory;
        TransplantPatientDirectory = system.getDBTransplantDirectory();   
        
        for(TransplantPatient t: TransplantPatientDirectory.getTranplantPatientDirectory())
        {
            if(t.getHosUsername().equals(Username))
            {
            Object[] row = new Object[6];
             row[0]=t;
             row[1]=t.getPatientID();
             row[2]=t.getName();
             row[3]=t.getPhysician();
             row[4]=t.getOrgansNeeded();
             row[5]=t.getStatus();
             
             model.addRow(row);
            }
        }
    }
}
