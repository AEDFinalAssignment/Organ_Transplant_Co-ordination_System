/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;


import SQL_Connection.SQL_Connect;
import System.Hospital.Hospital;
import System.Hospital.HospitalDirectory;
import System.Hospital.Patient.Patient;
import System.Hospital.Patient.PatientDirectory;
import System.Hospital.Patient.VitalSigns.VitalSigns;
import System.Hospital.Patient.VitalSigns.VitalSignsDirectory;
import System.Hospital.Staff.Staff;
import System.Hospital.Staff.StaffDirectory;
import System.Pharmacy.Pharmacy;
import System.Pharmacy.PharmacyDirectory;
import System.Registry.Registry;
import System.Registry.RegistryDirectory;
import System.Transportation.TransportDirectory;
import System.Transportation.Transportation;
import System.UNOs.UNO;
import java.beans.Statement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author subhash
 */
public class EcoSystem{

    private String UserId;
    private HospitalDirectory HospitalDirectory;
    private RegistryDirectory RegistryDirectory;
    private TransportDirectory TransportDirectory;
    private UNO UNO;
    private PharmacyDirectory PharmacyDirectory;
    
    public String removeBrackets(String sample)
    {
        sample = sample.replace("{", "");
        sample = sample.replace("}", "");
        return sample;
    }
    SQL_Connect sqlConnect;
    
    public EcoSystem() throws SQLException {
            this.sqlConnect = new SQL_Connect();
            this.HospitalDirectory = new HospitalDirectory(); 
            this.RegistryDirectory= new RegistryDirectory();
            this.TransportDirectory= new TransportDirectory();
            this.PharmacyDirectory= new PharmacyDirectory();
            
    }

    public HospitalDirectory getHospitalDirectory() {
        return HospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory HospitalDirectory) {
        this.HospitalDirectory = HospitalDirectory;
    }
    
    public Hospital addHospital(){
        Hospital hos = new Hospital();
        HospitalDirectory.getHospitalDirectory().add(hos);
        return hos;
    }

    public RegistryDirectory getRegistryDirectory() {
        return RegistryDirectory;
    }

    public void setRegistryDirectory(RegistryDirectory RegistryDirectory) {
        this.RegistryDirectory = RegistryDirectory;
    }
    
    public Registry addRegistry(){
        Registry res = new Registry();
        RegistryDirectory.getRegistryDirectory().add(res);
        return res;
    }

    public TransportDirectory getTransportDirectory() {
        return TransportDirectory;
    }

    public void setTransportDirectory(TransportDirectory TransportDirectory) {
        this.TransportDirectory = TransportDirectory;
    }
 public Transportation addTransportation(){
        Transportation trans = new Transportation();
        TransportDirectory.getTransportationDirectory().add(trans);
        return trans;
    }
    public UNO getUNO() {
        return UNO;
    }

    public void setUNO(UNO UNO) {
        this.UNO = UNO;
    }
     public UNO addUNO(){
        UNO uno = new UNO();
        return uno;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return PharmacyDirectory;
    }

    public void setPharmacyDirectory(PharmacyDirectory PharmacyDirectory) {
        this.PharmacyDirectory = PharmacyDirectory;
    }
     public Pharmacy addPharmacy(){
        Pharmacy phar = new Pharmacy();
        PharmacyDirectory.getPharmacyDirectory().add(phar);
        return phar;
     }
    
    public String AuthenticateUser(String Username, String Password) throws SQLException
    {

            this.UserId = "";
            String query = "SELECT * FROM public.\"Useraccount\"";

            java.sql.Statement stat = sqlConnect.retStatement();
            java.sql.ResultSet rs = stat.executeQuery(query);
            while(rs.next())
            {
                System.out.println(removeBrackets(rs.getString(1)));
                System.out.println(removeBrackets(rs.getString(2)));

                if(Username.equals(removeBrackets(rs.getString(1))) && Password.equals(removeBrackets(rs.getString(2))))
                {
                    this.UserId = removeBrackets(rs.getString(3));
                    return this.UserId;
                }
            }
            return this.UserId;
    }
    public void saveHospitalDB(Hospital hos) throws SQLException {
        String query = "INSERT INTO public.\"Hospital\"(\"Name\",\"TransplantEquipped\",\"Username\",\"Password\",\"Address\",\"State\",\"City\",\"Zipcode\",\"EmailID\")\n" +
                       "VALUES ('{"+ hos.getName() + "}','{"+ hos.getTransplantEquipped() + "}','{"+ hos.getUserName() + "}','{"+ hos.getPassword() + "}','{"+ hos.getAddress() + "}','{" + hos.getState() + "}','{"+ hos.getCity() + "}'," + String.valueOf(hos.getZipCode()) + ",'{" + hos.getEmail() + "}'" +");";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
        
        String query1 = "INSERT INTO public.\"Useraccount\"(\"Username\",\"Password\",\"TypeID\")\n" + 
                         "VALUES ('{"+ hos.getUserName() + "}','{"+ hos.getPassword() +"}','{Hospital}');";
        stat.execute(query1);
    }
    public void updateHospitalDB(Hospital hos) throws SQLException {
        System.out.println(hos.getUserName()); 
        String query = "UPDATE public.\"Hospital\" SET \"Name\"='{" + hos.getName() + "}',\"TransplantEquipped\"='{"+ hos.getTransplantEquipped() + "}',\"Username\"='{" + hos.getUserName() + "}',\"Password\"='{" + hos.getPassword() + "}',\"Address\"='{" + hos.getAddress() + "}',\"State\"='{" + hos.getState() + "}',\"City\"='{"+ hos.getCity() +"}',\"Zipcode\"="+ String.valueOf(hos.getZipCode()) +",\"EmailID\"='{"+hos.getEmail()+"}'\n" +
                       "WHERE \"Username\"='{"+ hos.getUserName() +"}';";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
        
        String query1 = "UPDATE public.\"Useraccount\" SET \"Username\"='{" + hos.getUserName() + "}',\"Password\"='{" + hos.getPassword() + "}',\"TypeID\"='{Hospital}'\n" +
                        "WHERE \"Username\"='{"+ hos.getUserName() +"}';";
        stat.execute(query1);
    } 
    
    public void deleteHospitalDB(Hospital hos) throws SQLException {
        String query = "DELETE FROM public.\"Hospital\" WHERE \"Username\"='{"+ hos.getUserName() + "}';";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
        
        String query1 = "DELETE FROM public.\"Useraccount\" WHERE \"Username\"='{"+ hos.getUserName() +"}';";
        stat.execute(query1);
    }

    public HospitalDirectory getDBHospitalDirectory() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        HospitalDirectory hosDirectory = new HospitalDirectory();
        Hospital hos;
        String query = "SELECT * FROM public.\"Hospital\"";
        java.sql.Statement stat = sqlConnect.retStatement();
        java.sql.ResultSet rs = stat.executeQuery(query);
            while(rs.next())
            {
                hos = new Hospital();
                hosDirectory.getHospitalDirectory().add(hos);
                hos.setName(removeBrackets(rs.getString(1)));
                hos.setTransplantEquipped(removeBrackets(rs.getString(2)));
                hos.setUserName(removeBrackets(rs.getString(3)));
                hos.setPassword(removeBrackets(rs.getString(4)));
                hos.setAddress(removeBrackets(rs.getString(5)));
                hos.setState(removeBrackets(rs.getString(6)));
                hos.setCity(removeBrackets(rs.getString(7)));
                hos.setZipCode(Integer.parseInt(removeBrackets(rs.getString(8))));
                if(rs.getString(9)!=null)
                hos.setEmail(removeBrackets(rs.getString(9)));
            }
            return hosDirectory;
    }
    
    public void saveHosStaffDB(Staff stf) throws SQLException {
        String query = "INSERT INTO public.\"HospitalStaff\"(\"Staff_ID\",\"Name\",\"ConNumber\",\"EmailID\",\"Designation\",\"Qualification\",\"Specialization\",\"Authorised\",\"HospitalUsername\")\n" +
                       "VALUES ("+ String.valueOf(stf.getStaff_ID()) + " ,'{" + stf.getName() +"}'," + String.valueOf(stf.getConNumber()) + ",'{" + stf.getEmailID() +"}','{" + stf.getDesignation() +"}','{" + stf.getQualification() +"}','{" + stf.getSpecialization() +"}',"+ String.valueOf(stf.isAuthorization()) +",'{" + stf.getHospitalUsername() +"}');";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
    }
    
    public void updateHosStaffDB(Staff stf) throws SQLException {
        String query = "UPDATE public.\"HospitalStaff\" SET \"Staff_ID\"="+String.valueOf(stf.getStaff_ID())+",\"Name\"='{"+ stf.getName() +"}',\"ConNumber\"="+ String.valueOf(stf.getConNumber()) +",\"EmailID\"='{"+ stf.getEmailID() +"}',\"Designation\"='{"+ stf.getDesignation() +"}',\"Qualification\"='{"+ stf.getQualification() +"}',\"Specialization\"='{"+ stf.getSpecialization() +"}',\"Authorised\"="+ String.valueOf(stf.isAuthorization()) +",\"HospitalUsername\"='{"+ stf.getHospitalUsername() +"}'\n" +
                        "WHERE \"Staff_ID\"="+String.valueOf(stf.getStaff_ID())+";";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
    }
    
        public void deleteHosStaffDB(Staff stf) throws SQLException {
        String query = "DELETE FROM public.\"HospitalStaff\" WHERE \"Staff_ID\"="+ String.valueOf(stf.getStaff_ID()) + ";";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
    }
        
        public void requestRegistry(Patient pat) throws SQLException {
        String query = "INSERT INTO public.\"RequestIsDonar\"(\"Patient_HealthID\",\"Name\",\"DonarStatus\")\n" +
                       "VALUES ("+String.valueOf(pat.getHealthID())+",'{"+ pat.getName() +"}','{Requested}');";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
    }
        public String getDonarStatus(Patient pat) throws SQLException {
            String query = "SELECT * FROM public.\"RequestIsDonar\"";
        java.sql.Statement stat = sqlConnect.retStatement();
        java.sql.ResultSet rs = stat.executeQuery(query);
            while(rs.next())
            {
                if(Integer.parseInt(removeBrackets(rs.getString(1)))==pat.getHealthID())
                {
                    return removeBrackets(rs.getString(3));
                }
            }
            return "No Requests";
        }
        
   public void savePatientDB(Patient pat) throws SQLException {
        String query = "INSERT INTO public.\"Patient\"(\"HealthID\",\"PatientID\",\"Name\",\"Age\",\"Gender\",\n" +
                       "\"Address\",\"City\",\"State\",\"Zipcode\",\"ConNumber\",\"EmailID\",\"EmerConNumber\",\"EmerConName\",\"EntryDate\",\"HospitalUsername\")\n" +
                       "VALUES ("+String.valueOf(pat.getHealthID())+","+String.valueOf(pat.getPatientID())+",'{"+ pat.getName() +"}',"+String.valueOf(pat.getAge())+",'{"+ pat.getGender() +"}','{"+ pat.getAddress() +"}','{"+ pat.getCity() +"}','{"+ pat.getState() +"}',"+String.valueOf(pat.getZipcode())+","+String.valueOf(pat.getConNumber())+",'{"+ pat.getEmailID() +"}',"+String.valueOf(pat.getEmerConNumber())+",'{"+ pat.getEmerConName() +"}','{"+ String.valueOf(pat.getEntryDate()) +"}','{"+ pat.getHospitalUsername() +"}');";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
    }
    
    public void updatePatientDB(Patient pat) throws SQLException {
        String query = "UPDATE public.\"Patient\" SET \"HealthID\"="+String.valueOf(pat.getHealthID())+",\"PatientID\"="+String.valueOf(pat.getPatientID())+",\"Name\"='{"+pat.getName()+"}',\"Age\"="+String.valueOf(pat.getAge())+",\"Gender\"='{"+pat.getGender()+"}',\"Address\"='{"+pat.getAddress()+"}',\"City\"='{"+pat.getCity()+"}',\"State\"='{"+pat.getState()+"}',\"Zipcode\"="+String.valueOf(pat.getZipcode())+",\"ConNumber\"="+String.valueOf(pat.getConNumber())+",\"EmailID\"='{"+pat.getEmailID()+"}',\"EmerConNumber\"="+String.valueOf(pat.getEmerConNumber())+",\"EmerConName\"='{"+pat.getEmerConName()+"}',\"EntryDate\"='{"+pat.getEntryDate()+"}',\"HospitalUsername\"='{"+pat.getHospitalUsername()+"}'\n" +
                       "WHERE \"PatientID\"="+String.valueOf(pat.getPatientID())+";";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
    }
    
        public void deletePatientDB(Patient pat) throws SQLException {
        String query = "DELETE FROM public.\"Patient\" WHERE \"PatientID\"="+ String.valueOf(pat.getPatientID()) + ";";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
    } 
  
     public void saveVitalSignsDB(VitalSigns vs) throws SQLException {
        String query = "INSERT INTO public.\"VitalSigns\"(\"BloodType\",\"HeartRate\",\"BloodPressure\",\"RespiratoryRate\",\"Pulse\",\n" +
                       "\"Temperature\",\"AllergiesList\",\"OG_Medications\",\"BOSaturation\",\"Height\",\"Weight\",\"Complains\",\"Physician\",\"DateTime\",\"PatientID\")\n" +
                       "VALUES ('{"+vs.getBloodType()+"}', "+String.valueOf(vs.getHeartRate())+", "+String.valueOf(vs.getBloodPressure())+","+String.valueOf(vs.getRespiratoryRate())+", "+String.valueOf(vs.getPulse())+","+String.valueOf(vs.getTemperature())+
                        ",'{"+vs.getAllergiesList()+"}','{"+vs.getOG_Medications()+"}', "+String.valueOf(vs.getBOSaturation())+", "+String.valueOf(vs.getHeight())+", "+String.valueOf(vs.getWeight())+",'{"+vs.getComplains()+"}','{"+vs.getPhysician()+"}','{"+vs.getDateTime()+"}',"+ String.valueOf(vs.getPatientID()) +");";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
    }
     
        public void saveRegistryDB(Registry reg) throws SQLException {
        String query = "INSERT INTO public.\"Registry\"(\"Name\",\"Username\",\"Password\",\"Address\",\"City\",\"State\",\"Zipcode\",\"EmailID\")\n" +
                       "VALUES ('{"+ reg.getName() +"}','{"+ reg.getUserName() +"}','{"+ reg.getPassword() +"}','{"+ reg.getAddress() +"}','{"+ reg.getCity() +"}','{"+ reg.getState() +"}',"+ String.valueOf(reg.getZipCode()) +",'{"+ reg.getEmail() +"}');";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
         
        
        String query1 = "INSERT INTO public.\"Useraccount\"(\"Username\",\"Password\",\"TypeID\")\n" + 
                         "VALUES ('{"+ reg.getUserName() + "}','{"+ reg.getPassword() +"}','{Registry}');";
        stat.execute(query1);
    }
    public void updateRegistryDB(Registry reg) throws SQLException {
        System.out.println(reg.getUserName()); 
        String query = "Update public.\"Registry\" set \"Name\"='{"+reg.getName()+"}',\"Username\"='{"+reg.getUserName()+"}',\"Password\"='{"+reg.getPassword()+"}',\"Address\"='{"+reg.getAddress()+"}',\"City\"='{"+reg.getCity()+"}',\"State\"='{"+reg.getState()+"}',\"Zipcode\"="+String.valueOf(reg.getZipCode()) +",\"EmailID\"='{"+reg.getEmail()+"}'\n" +
                       "where \"Username\"='{"+reg.getUserName()+"}';";
        System.out.println(query);
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
       
        String query1 = "UPDATE public.\"Useraccount\" SET \"Username\"='{" + reg.getUserName() + "}',\"Password\"='{" + reg.getPassword() + "}',\"TypeID\"='{Registry}'\n" +
                        "WHERE \"Username\"='{"+ reg.getUserName() +"}';";
        stat.execute(query1);
        System.out.println(query1);
    } 
    
    public void deleteRegistryDB(Registry reg) throws SQLException {
        String query = "DELETE FROM public.\"Registry\" WHERE \"Username\"='{"+ reg.getUserName() + "}';";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
        
        String query1 = "DELETE FROM public.\"Useraccount\" WHERE \"Username\"='{"+ reg.getUserName() +"}';";
        stat.execute(query1);
    }

    public RegistryDirectory getDBRegistryDirectory() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        RegistryDirectory regDirectory = new RegistryDirectory();
        Registry reg;
        String query = "SELECT * FROM public.\"Registry\"";
        java.sql.Statement stat = sqlConnect.retStatement();
        java.sql.ResultSet rs = stat.executeQuery(query);
            while(rs.next())
            {
                reg = new Registry();
                regDirectory.getRegistryDirectory().add(reg);
                reg.setName(removeBrackets(rs.getString(1)));
                reg.setUserName(removeBrackets(rs.getString(2)));
                reg.setPassword(removeBrackets(rs.getString(3)));
                reg.setAddress(removeBrackets(rs.getString(4)));
                reg.setState(removeBrackets(rs.getString(6)));
                reg.setCity(removeBrackets(rs.getString(5)));
                reg.setZipCode(Integer.parseInt(removeBrackets(rs.getString(7))));
                if(rs.getString(8)!=null)
                reg.setEmail(removeBrackets(rs.getString(8)));
            }
            return regDirectory;
    }
         public void saveTransportationDB(Transportation trans) throws SQLException {
        String query = "INSERT INTO public.\"Transportation\"(\"Name\",\"Username\",\"Password\",\"Address\",\"City\",\"State\",\"Zipcode\",\"EmailID\",\"AvailableTransport\")\n"+
                       "VALUES ('{"+ trans.getName() +"}','{"+ trans.getUserName() +"}','{"+ trans.getPassword() +"}','{"+ trans.getAddress() +"}','{"+ trans.getCity() +"}','{"+ trans.getState() +"}',"+ String.valueOf(trans.getZipCode()) +",'{"+ trans.getEmail() +"}','{"+ trans.getModesOfTransportation() +"}');";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
         System.out.println("111111111");
        
        String query1 = "INSERT INTO public.\"Useraccount\"(\"Username\",\"Password\",\"TypeID\")\n" + 
                         "VALUES ('{"+ trans.getUserName() + "}','{"+ trans.getPassword() +"}','{Transportation}');";
        stat.execute(query1);
    }
    public void updateTransportationDB(Transportation trans) throws SQLException {
        System.out.println(trans.getUserName()); 
        String query = "Update public.\"Transportation\" set \"Name\"='{"+trans.getName()+"}',\"Username\"='{"+trans.getUserName()+"}',\"Password\"='{"+trans.getPassword()+"}',\"Address\"='{"+trans.getAddress()+"}',\"City\"='{"+trans.getCity()+"}',\"State\"='{"+trans.getState()+"}',\"Zipcode\"="+String.valueOf(trans.getZipCode()) +",\"EmailID\"='{"+trans.getEmail()+"}',\"AvailableTransport\"='{"+trans.getModesOfTransportation()+"}'\n" +
                       "where \"Username\"='{"+trans.getUserName()+"}';";
        System.out.println(query);
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
        
        String query1 = "UPDATE public.\"Useraccount\" SET \"Username\"='{" + trans.getUserName() + "}',\"Password\"='{" + trans.getPassword() + "}',\"TypeID\"='{Transportation}'\n" +
                        "WHERE \"Username\"='{"+ trans.getUserName() +"}';";
        stat.execute(query1);
    } 
    
    public void deleteTransportationDB(Transportation trans) throws SQLException {
        String query = "DELETE FROM public.\"Transportation\" WHERE \"Username\"='{"+ trans.getUserName() + "}';";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
        
        String query1 = "DELETE FROM public.\"Useraccount\" WHERE \"Username\"='{"+ trans.getUserName() +"}';";
        stat.execute(query1);
    }

    public TransportDirectory getDBTransportationDirectory() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        TransportDirectory transDirectory = new TransportDirectory();
        Transportation trans;
        String query = "SELECT * FROM public.\"Transportation\"";
        java.sql.Statement stat = sqlConnect.retStatement();
        java.sql.ResultSet rs = stat.executeQuery(query);
            while(rs.next())
            {
                trans = new Transportation();
                transDirectory.getTransportationDirectory().add(trans);
                trans.setName(removeBrackets(rs.getString(1)));
                trans.setUserName(removeBrackets(rs.getString(2)));
                trans.setPassword(removeBrackets(rs.getString(3)));
                trans.setAddress(removeBrackets(rs.getString(4)));
                trans.setState(removeBrackets(rs.getString(6)));
                trans.setCity(removeBrackets(rs.getString(5)));
                trans.setZipCode(Integer.parseInt(removeBrackets(rs.getString(7))));
                trans.setModesOfTransportation(removeBrackets(rs.getString(9)));
                if(rs.getString(9)!=null)
                trans.setEmail(removeBrackets(rs.getString(8)));
                
            }
            return transDirectory;
    }
    
       public void saveUNODB(UNO uno) throws SQLException {
        String query = "INSERT INTO public.\"UNOs\"(\"Name\",\"Username\",\"Password\",\"EmailID\")\n" +
                       "VALUES ('{"+ uno.getUNO_Name() + "}','{"+ uno.getUNO_Username() + "}','{"+ uno.getUNO_Password() + "}','{" + uno.getUNO_email() + "}'" +");";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
        
        String query1 = "INSERT INTO public.\"Useraccount\"(\"Username\",\"Password\",\"TypeID\")\n" + 
                         "VALUES ('{"+ uno.getUNO_Name() + "}','{"+ uno.getUNO_Password() +"}','{UNO}');";
        stat.execute(query1);
    }
       
       public void savePharmacyDB(Pharmacy phar) throws SQLException {
        String query = "INSERT INTO public.\"Pharmacy\"(\"Name\",\"Username\",\"Password\",\"Address\",\"State\",\"City\",\"Zipcode\",\"EmailID\")\n" +
                       "VALUES ('{"+ phar.getName() + "}','{"+ phar.getUserName() + "}','{"+ phar.getPassword() + "}','{"+ phar.getAddress() + "}','{" + phar.getState() + "}','{"+ phar.getCity() + "}'," + String.valueOf(phar.getZipCode()) + ",'{" + phar.getEmail() + "}'" +");";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
        
        String query1 = "INSERT INTO public.\"Useraccount\"(\"Username\",\"Password\",\"TypeID\")\n" + 
                         "VALUES ('{"+ phar.getUserName() + "}','{"+ phar.getPassword() +"}','{Pharmacy}');";
        stat.execute(query1);
    }
    public void updatePharmacyDB(Pharmacy phar) throws SQLException {
        System.out.println(phar.getUserName()); 
        String query = "UPDATE public.\"Pharmacy\" SET \"Name\"='{" + phar.getName() + "}',\"Username\"='{" + phar.getUserName() + "}',\"Password\"='{" + phar.getPassword() + "}',\"Address\"='{" + phar.getAddress() + "}',\"State\"='{" + phar.getState() + "}',\"City\"='{"+ phar.getCity() +"}',\"Zipcode\"="+ String.valueOf(phar.getZipCode()) +",\"EmailID\"='{"+phar.getEmail()+"}'\n" +
                       "WHERE \"Username\"='{"+ phar.getUserName() +"}';";
        System.out.println(query);
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
        
        String query1 = "UPDATE public.\"Useraccount\" SET \"Username\"='{" + phar.getUserName() + "}',\"Password\"='{" + phar.getPassword() + "}',\"TypeID\"='{Pharmacy}'\n" +
                        "WHERE \"Username\"='{"+ phar.getUserName() +"}';";
        stat.execute(query1);
    } 
    
    public void deletePharmacyDB(Pharmacy phar) throws SQLException {
        String query = "DELETE FROM public.\"Pharmacy\" WHERE \"Username\"='{"+ phar.getUserName() + "}';";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
        
        String query1 = "DELETE FROM public.\"Useraccount\" WHERE \"Username\"='{"+ phar.getUserName() +"}';";
        stat.execute(query1);
    }

    public PharmacyDirectory getDBPharmacyDirectory() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        PharmacyDirectory pharDirectory = new PharmacyDirectory();
        Pharmacy phar;
        String query = "SELECT * FROM public.\"Pharmacy\"";
        java.sql.Statement stat = sqlConnect.retStatement();
        java.sql.ResultSet rs = stat.executeQuery(query);
            while(rs.next())
            {
                phar = new Pharmacy();
                pharDirectory.getPharmacyDirectory().add(phar);
                phar.setName(removeBrackets(rs.getString(1)));
                
                phar.setUserName(removeBrackets(rs.getString(2)));
                phar.setPassword(removeBrackets(rs.getString(3)));
                phar.setAddress(removeBrackets(rs.getString(4)));
                phar.setState(removeBrackets(rs.getString(6)));
                phar.setCity(removeBrackets(rs.getString(5)));
                phar.setZipCode(Integer.parseInt(removeBrackets(rs.getString(7))));
                if(rs.getString(8)!=null)
                phar.setEmail(removeBrackets(rs.getString(8)));
            }
            return pharDirectory;
    }
        public StaffDirectory getDBStaffDirectory() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        StaffDirectory stfDirectory = new StaffDirectory();
        Staff stf;
        String query = "SELECT * FROM public.\"HospitalStaff\"";
        java.sql.Statement stat = sqlConnect.retStatement();
        java.sql.ResultSet rs = stat.executeQuery(query);
            while(rs.next())
            {
                stf = new Staff();
                stfDirectory.getStaffDirectory().add(stf);
                stf.setStaff_ID(Integer.parseInt(removeBrackets(rs.getString(1))));
                stf.setName(removeBrackets(rs.getString(2)));
                stf.setConNumber(Long.parseLong(removeBrackets(rs.getString(3))));
                stf.setEmailID(removeBrackets(rs.getString(4)));
                stf.setDesignation(removeBrackets(rs.getString(5)));
                stf.setQualification(removeBrackets(rs.getString(6)));
                stf.setSpecialization((removeBrackets(rs.getString(7))));
                stf.setAuthorization(Boolean.parseBoolean(removeBrackets(rs.getString(8))));
                stf.setHospitalUsername(removeBrackets(rs.getString(9)));
            }
            return stfDirectory;
    }
    public PatientDirectory getDBPatientDirectory() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        PatientDirectory patDirectory = new PatientDirectory();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
        Patient pat;
        String query = "SELECT * FROM public.\"Patient\"";
        java.sql.Statement stat = sqlConnect.retStatement();
        java.sql.ResultSet rs = stat.executeQuery(query);
            while(rs.next())
            {
                pat = new Patient();
                patDirectory.getPatientDirectory().add(pat);
                pat.setHealthID(Integer.parseInt(removeBrackets(rs.getString(1))));
                pat.setPatientID(Integer.parseInt(removeBrackets(rs.getString(2))));
                pat.setName(removeBrackets(rs.getString(3)));
                pat.setAge(Integer.parseInt(removeBrackets(rs.getString(4))));
                pat.setGender(removeBrackets(rs.getString(5)));
                pat.setAddress(removeBrackets(rs.getString(6)));
                pat.setCity(removeBrackets(rs.getString(7)));
                pat.setState(removeBrackets(rs.getString(8)));
                pat.setZipcode(Integer.parseInt(removeBrackets(rs.getString(9))));
                pat.setConNumber(Long.parseLong(removeBrackets(rs.getString(10))));
                pat.setEmailID(removeBrackets(rs.getString(11)));
                pat.setEmerConNumber(Long.parseLong(removeBrackets(rs.getString(12))));
                pat.setEmerConName(removeBrackets(rs.getString(13)));
                pat.setEntryDate(removeBrackets(rs.getString(13)));
                pat.setHospitalUsername(removeBrackets(rs.getString(15)));
            }
            return patDirectory;
    }
  public VitalSignsDirectory getDBVitalSignsDirectory() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        VitalSignsDirectory vsDirectory = new VitalSignsDirectory();
        VitalSigns vs;
        String query = "SELECT * FROM public.\"VitalSigns\"";
        java.sql.Statement stat = sqlConnect.retStatement();
        java.sql.ResultSet rs = stat.executeQuery(query);
            while(rs.next())
            {
                vs = new VitalSigns();
                vsDirectory.getVitalSignsDirectory().add(vs);
                vs.setDateTime(removeBrackets(rs.getString(12)));
                vs.setPhysician(removeBrackets(rs.getString(11)));
                vs.setComplains(removeBrackets(rs.getString(10)));
                vs.setBloodType(removeBrackets(rs.getString(1)));
                vs.setAllergiesList(removeBrackets(rs.getString(7)));
                if(rs.getString(15)!=null)
                vs.setPatientID(Integer.parseInt(removeBrackets(rs.getString(15))));
            }
            return vsDirectory;
    }
}
