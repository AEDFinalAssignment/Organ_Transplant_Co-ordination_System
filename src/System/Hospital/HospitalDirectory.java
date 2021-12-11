/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital;

import java.util.ArrayList;

/**
 *
 * @author Subhash
 */
public class HospitalDirectory {
    private ArrayList<Hospital> HospitalDirectory;

    public HospitalDirectory() {
        this.HospitalDirectory = new ArrayList <Hospital>();
    }

    
    public ArrayList<Hospital> getHospitalDirectory() {
        return HospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> HospitalDirectory) {
        this.HospitalDirectory = HospitalDirectory;
    }
}
