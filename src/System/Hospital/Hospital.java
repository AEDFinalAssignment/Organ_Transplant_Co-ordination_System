/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital;

import System.Organization;

/**
 *
 * @author Subhash
 */
public class Hospital extends Organization {
    private int HospitalID;
    private boolean TransplantEquipped;

    public int getHospitalID() {
        return HospitalID;
    }

    public void setHospitalID(int HospitalID) {
        this.HospitalID = HospitalID;
    }


    public boolean isTransplantEquipped() {
        return TransplantEquipped;
    }

    public void setTransplantEquipped(boolean TransplantEquipped) {
        this.TransplantEquipped = TransplantEquipped;
    }
}
