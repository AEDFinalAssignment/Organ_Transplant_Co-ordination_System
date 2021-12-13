/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital.Patient;

/**
 *
 * @author Subhash
 */
public class TransplantPatient {
    private int HealthID;
    private int PatientID;
    private String Name;
    private String Physician;
    private String OrgansNeeded;
    private String Status;

    public int getHealthID() {
        return HealthID;
    }

    public void setHealthID(int HealthID) {
        this.HealthID = HealthID;
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhysician() {
        return Physician;
    }

    public void setPhysician(String Physician) {
        this.Physician = Physician;
    }

    public String getOrgansNeeded() {
        return OrgansNeeded;
    }

    public void setOrgansNeeded(String OrgansNeeded) {
        this.OrgansNeeded = OrgansNeeded;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
}
