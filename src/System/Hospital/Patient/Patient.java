/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital.Patient;

import java.util.Date;

/**
 *
 * @author Subhash
 */
public class Patient {
    private int HealthID;
    private int PatientID;
    private String Name;
    private int Age;
    private String Gender;
    private String Address;
    private String City;
    private String State;
    private int Zipcode;
    private long ConNumber;
    private String EmailID;
    private long EmerConNumber;
    private String EmerConName;
    private Date EntryDate;
    private String HospitalUsername;

    public String getHospitalUsername() {
        return HospitalUsername;
    }

    public void setHospitalUsername(String HospitalUsername) {
        this.HospitalUsername = HospitalUsername;
    }
    
    

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

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public int getZipcode() {
        return Zipcode;
    }

    public void setZipcode(int Zipcode) {
        this.Zipcode = Zipcode;
    }

    public long getConNumber() {
        return ConNumber;
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

    public long getEmerConNumber() {
        return EmerConNumber;
    }

    public void setEmerConNumber(long EmerConNumber) {
        this.EmerConNumber = EmerConNumber;
    }

    public String getEmerConName() {
        return EmerConName;
    }

    public void setEmerConName(String EmerConName) {
        this.EmerConName = EmerConName;
    }

    public Date getEntryDate() {
        return EntryDate;
    }

    public void setEntryDate(Date EntryDate) {
        this.EntryDate = EntryDate;
    }
    
    
}
