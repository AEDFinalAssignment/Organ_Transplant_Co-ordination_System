/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.UNOsWorkArea;

import System.EcoSystem;
import System.Hospital.Patient.Patient;
import System.Hospital.Patient.TransplantPatient;
import System.Hospital.Patient.TransplantPatientDirectory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanjeev
 */
public class MatchingWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form MatchingWorkArea
     */
     private EcoSystem system;
    private JSplitPane jSplitPane1;
    Patient selectedPatient;
    String Organ;
    public MatchingWorkArea(JSplitPane jSplitPane1,EcoSystem system,Patient selectedPatient,String Organ) throws SQLException {
        initComponents();
        this.jSplitPane1 = jSplitPane1;
        this.system = system;
        this.selectedPatient = selectedPatient;
        this.Organ = Organ;
        populateTable(system,selectedPatient,Organ);
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
        tblMatch = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Possible Matches:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 79, 213, 26));

        tblMatch.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Health ID", "Patient ID", "Name", "Age", "Gender", "Hospital name", "Required Organ", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMatch);


        jButton1.setText("Process Transplant");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 123, 859, -1));

        jButton1.setText("Process Transplant");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 613, 198, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRowIndex = tblMatch.getSelectedRow();
        
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a Patient to match.");
            return;
        }
        try {
             // TODO add your handling code here:
             TransplantPatientDirectory TransplantPatientDirectory;
             TransplantPatientDirectory = system.getDBTransplantDirectory();
             TransplantPatient selectedTransplantPatient = (TransplantPatient) tblMatch.getValueAt(selectedRowIndex, 0);
             for(TransplantPatient t: TransplantPatientDirectory.getTranplantPatientDirectory())
             {
                 if(t.getHealthID()==selectedTransplantPatient.getHealthID())
                 {
                     t.setStatus("Transplant Assigned");
                     system.updateTransplantDB(t);
                 }
             }} catch (SQLException ex) {
             Logger.getLogger(MatchingWorkArea.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton1ActionPerformed

        private void populateTable(EcoSystem system, Patient selectedPatient,String Organ) throws SQLException {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    DefaultTableModel model = (DefaultTableModel) tblMatch.getModel();
        model.setRowCount(0);
        
        TransplantPatientDirectory TransplantPatientDirectory;
        TransplantPatientDirectory = system.getDBTransplantDirectory();   
        
        for(TransplantPatient t: TransplantPatientDirectory.getTranplantPatientDirectory())
        {
            if(t.getOrgansNeeded().equals(Organ))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMatch;
    // End of variables declaration//GEN-END:variables
}
