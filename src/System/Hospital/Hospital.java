/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital;

import System.Hospital.Staff.Staff;
import System.Hospital.Staff.StaffDirectory;
import System.Organization;

/**
 *
 * @author Subhash
 */
public class Hospital extends Organization {
    private int HospitalID;
    private String TransplantEquipped;
    private StaffDirectory StaffDirectory;

    public Hospital() {
        this.StaffDirectory = new StaffDirectory();
    }

    
    public int getHospitalID() {
        return HospitalID;
    }

    public void setHospitalID(int HospitalID) {
        this.HospitalID = HospitalID;
    }

    public StaffDirectory getStaffDirectory() {
        return StaffDirectory;
    }

    public void setStaffDirectory(StaffDirectory StaffDirectory) {
        this.StaffDirectory = StaffDirectory;
    }    

    public String getTransplantEquipped() {
        return TransplantEquipped;
    }

    public void setTransplantEquipped(String TransplantEquipped) {
        this.TransplantEquipped = TransplantEquipped;
    }

   
     public Staff addStaff(){
        Staff stf = new Staff();
        StaffDirectory.getStaffDirectory().add(stf);
        return stf;
    }
}
