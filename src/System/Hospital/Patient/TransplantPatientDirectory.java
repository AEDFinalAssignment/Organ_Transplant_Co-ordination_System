/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital.Patient;

import java.util.ArrayList;

/**
 *
 * @author Subhash
 */
public class TransplantPatientDirectory {
    private ArrayList<TransplantPatient> TransplantPatientDirectory;

    public TransplantPatientDirectory() {
        this.TransplantPatientDirectory = new ArrayList <TransplantPatient>();
    }

    public ArrayList<TransplantPatient> getTranplantPatientDirectory() {
        return TransplantPatientDirectory;
    }

    public void setTranplantPatientDirectory(ArrayList<TransplantPatient> TranplantPatientDirectory) {
        this.TransplantPatientDirectory = TranplantPatientDirectory;
    }
    
}
