/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.UNOs;

/**
 *
 * @author Subhash
 */
public class UNO {
    private int UNO_ID;
    private String UNO_Name;
    private String UNO_Username;
    private String UNO_Password;

    public UNO() {
        
    }
    
    public int getUNO_ID() {
        return UNO_ID;
    }

    public void setUNO_ID(int UNO_ID) {
        this.UNO_ID = UNO_ID;
    }

    public String getUNO_Name() {
        return UNO_Name;
    }

    public void setUNO_Name(String UNO_Name) {
        this.UNO_Name = UNO_Name;
    }

    public String getUNO_Username() {
        return UNO_Username;
    }

    public void setUNO_Username(String UNO_Username) {
        this.UNO_Username = UNO_Username;
    }

    public String getUNO_Password() {
        return UNO_Password;
    }

    public void setUNO_Password(String UNO_Password) {
        this.UNO_Password = UNO_Password;
    }
}
