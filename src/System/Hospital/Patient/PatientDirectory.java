/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital.Patient;

import System.Hospital.Staff.Staff;
import java.util.ArrayList;

/**
 *
 * @author Subhash
 */
public class PatientDirectory {
    private ArrayList<Patient> PatientDirectory;

    public PatientDirectory() {
        this.PatientDirectory = new ArrayList <Patient>();
    }
    
    public ArrayList<Patient> getPatientDirectory() {
        return PatientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> PatientDirectory) {
        this.PatientDirectory = PatientDirectory;
    }
    
    
}
