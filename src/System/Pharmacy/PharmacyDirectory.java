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

    public ArrayList<Pharmacy> getPharmacyDirectory() {
        return PharmacyDirectory;
    }

    public void setPharmacyDirectory(ArrayList<Pharmacy> PharmacyDirectory) {
        this.PharmacyDirectory = PharmacyDirectory;
    }
    
     public Pharmacy addPharmacy() {
        Pharmacy p = new Pharmacy();
        PharmacyDirectory.add(p);
        return p;
    }

    public void removePerson(Pharmacy p) {
        PharmacyDirectory.remove(p);
    }

    public Pharmacy searchPharmacy(int id) {
        for (Pharmacy pharmacy : PharmacyDirectory) {
            if (pharmacy.getPharmacyID()== id) {
                return pharmacy;
            }
        }
        return null;
    }
    
    
}
