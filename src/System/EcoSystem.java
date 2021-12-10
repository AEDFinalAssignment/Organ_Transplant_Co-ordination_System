/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;


import SQL_Connection.SQL_Connect;
import System.Hospital.HospitalDirectory;
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
            
    }

    public HospitalDirectory getHospitalDirectory() {
        return HospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory HospitalDirectory) {
        this.HospitalDirectory = HospitalDirectory;
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
        System.out.println("444444444444");
            this.UserId = "";
            String query = "SELECT * FROM public.\"Useraccount\"";

            System.out.println("333333333333");
            java.sql.Statement stat = sqlConnect.retStatement();
            System.out.println("22222222222");
            java.sql.ResultSet rs = stat.executeQuery(query);
        System.out.println("1111111111");
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
    
}
