/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Hospital.Patient.VitalSigns;

/**
 *
 * @author Subhash
 */
public class VitalSigns {
    private String BloodType;
    private int HeartRate;
    private int BloodPressure;
    private int RespiratoryRate;
    private int Pulse;
    private int Temperature;
    private String AllergiesList;
    private String OG_Medications;
    private int BOSaturation;
    private int Height;
    private int Weight;
    private String Complains;
    private String Physician;
    private String DateTime;
    private int PatientID;

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }
    
    

    public int getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(int HeartRate) {
        this.HeartRate = HeartRate;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    
    public int getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(int BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public int getRespiratoryRate() {
        return RespiratoryRate;
    }

    public void setRespiratoryRate(int RespiratoryRate) {
        this.RespiratoryRate = RespiratoryRate;
    }

    public int getPulse() {
        return Pulse;
    }

    public void setPulse(int Pulse) {
        this.Pulse = Pulse;
    }

    public int getTemperature() {
        return Temperature;
    }

    public void setTemperature(int Temperature) {
        this.Temperature = Temperature;
    }

    public int getBOSaturation() {
        return BOSaturation;
    }

    public void setBOSaturation(int BOSaturation) {
        this.BOSaturation = BOSaturation;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public String getOG_Medications() {
        return OG_Medications;
    }

    public void setOG_Medications(String OG_Medications) {
        this.OG_Medications = OG_Medications;
    }

    public String getAllergiesList() {
        return AllergiesList;
    }

    public void setAllergiesList(String AllergiesList) {
        this.AllergiesList = AllergiesList;
    }

    public String getComplains() {
        return Complains;
    }

    public void setComplains(String Complains) {
        this.Complains = Complains;
    }

    public String getPhysician() {
        return Physician;
    }

    public void setPhysician(String Physician) {
        this.Physician = Physician;
    }
    
    
    
}
