/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;


import SQL_Connection.SQL_Connect;
import System.Hospital.Hospital;
import System.Hospital.HospitalDirectory;
import System.Hospital.Staff.Staff;
import System.Pharmacy.PharmacyDirectory;
import System.Registry.RegistryDirectory;
import System.Transportation.TransportDirectory;
import System.UNOs.UNO;
import java.beans.Statement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author monal
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

    public TransportDirectory getTransportDirectory() {
        return TransportDirectory;
    }

    public void setTransportDirectory(TransportDirectory TransportDirectory) {
        this.TransportDirectory = TransportDirectory;
    }

    public UNO getUNO() {
        return UNO;
    }

    public void setUNO(UNO UNO) {
        this.UNO = UNO;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return PharmacyDirectory;
    }

    public void setPharmacyDirectory(PharmacyDirectory PharmacyDirectory) {
        this.PharmacyDirectory = PharmacyDirectory;
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
                       "VALUES ('{"+ hos.getName() + "}',"+ String.valueOf(hos.isTransplantEquipped()) + ",'{"+ hos.getUserName() + "}','{"+ hos.getPassword() + "}','{"+ hos.getAddress() + "}','{" + hos.getState() + "}','{"+ hos.getCity() + "}'," + String.valueOf(hos.getZipCode()) + ",'{" + hos.getEmail() + "}'" +");";
        java.sql.Statement stat = sqlConnect.retStatement();
        stat.execute(query);
        
        String query1 = "INSERT INTO public.\"Useraccount\"(\"Username\",\"Password\",\"TypeID\")\n" + 
                         "VALUES ('{"+ hos.getUserName() + "}','{"+ hos.getPassword() +"}','{Hospital}');";
        stat.execute(query1);
    }
    public void updateHospitalDB(Hospital hos) throws SQLException {
        System.out.println(hos.getUserName()); 
        String query = "UPDATE public.\"Hospital\" SET \"Name\"='{" + hos.getName() + "}',\"TransplantEquipped\"=" + String.valueOf(hos.isTransplantEquipped()) + ",\"Username\"='{" + hos.getUserName() + "}',\"Password\"='{" + hos.getPassword() + "}',\"Address\"='{" + hos.getAddress() + "}',\"State\"='{" + hos.getState() + "}',\"City\"='{"+ hos.getCity() +"}',\"Zipcode\"="+ String.valueOf(hos.getZipCode()) +",\"EmailID\"='{"+hos.getEmail()+"}'\n" +
                       "WHERE \"Username\"='{"+ hos.getUserName() +"}';";
        System.out.println(query);
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
                hos.setTransplantEquipped(Boolean.parseBoolean(removeBrackets(rs.getString(2))));
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
}
