/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital.Staff;
import java.util.ArrayList;

/**
 *
 * @author Subhash
 */
public class StaffDirectory {
    private ArrayList<Staff> StaffDirectory;

    public StaffDirectory() {
        this.StaffDirectory = new ArrayList <Staff>();
    }
    
    public ArrayList<Staff> getStaffDirectory() {
        return StaffDirectory;
    }

    public void setStaffDirectory(ArrayList<Staff> StaffDirectory) {
        this.StaffDirectory = StaffDirectory;
    }
}
