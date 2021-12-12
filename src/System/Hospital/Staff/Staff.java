/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital.Staff;

/**
 *
 * @author Subhash
 */
public class Staff {
    private int Staff_ID;
    private String Name;
    private long ConNumber;
    private String EmailID;
    private String Designation;
    private String Qualification;
    private String Specialization;
    private boolean Authorization;
    private String HospitalUsername;

    public int getStaff_ID() {
        return Staff_ID;
    }

    public void setStaff_ID(int Staff_ID) {
        this.Staff_ID = Staff_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public long getConNumber() {
        return ConNumber;
    }

    public String getHospitalUsername() {
        return HospitalUsername;
    }

    public void setHospitalUsername(String HospitalUsername) {
        this.HospitalUsername = HospitalUsername;
    }

    public void setConNumber(long ConNumber) {
        this.ConNumber = ConNumber;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String EmailID) {
        this.EmailID = EmailID;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public boolean isAuthorization() {
        return Authorization;
    }

    public void setAuthorization(boolean Authorization) {
        this.Authorization = Authorization;
    }
}
