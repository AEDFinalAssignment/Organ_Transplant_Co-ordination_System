/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital.Patient.VitalSigns;

import System.Hospital.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author Subhash
 */
public class VitalSignsDirectory {
        private ArrayList<VitalSigns> VitalSignsDirectory;

    public VitalSignsDirectory() {
        this.VitalSignsDirectory = new ArrayList <VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSignsDirectory() {
        return VitalSignsDirectory;
    }

    public void setVitalSignsDirectory(ArrayList<VitalSigns> VitalSignsDirectory) {
        this.VitalSignsDirectory = VitalSignsDirectory;
    }
    
    
}
