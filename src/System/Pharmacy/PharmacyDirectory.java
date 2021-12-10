/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author Subhash
 */
public class PharmacyDirectory {
    private ArrayList<Pharmacy> PharmacyDirectory;

    public PharmacyDirectory() {
        this.PharmacyDirectory = new ArrayList <Pharmacy>();
    }

    
    public ArrayList<Pharmacy> getPharmacyDirectory() {
        return PharmacyDirectory;
    }

    public void setPharmacyDirectory(ArrayList<Pharmacy> PharmacyDirectory) {
        this.PharmacyDirectory = PharmacyDirectory;
    }
    
    
}
