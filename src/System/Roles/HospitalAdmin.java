/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Roles;

import System.EcoSystem;
import Userinterface.HospitalAdminWorkArea.HospitalAdministrationArea;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author deepi
 */
public class HospitalAdmin extends Role {
    public JPanel createWorkArea(JSplitPane jSplitPane1,EcoSystem system,String Username,JPanel Hospitalmain,JPanel Managepanel) {
        return new HospitalAdministrationArea(jSplitPane1,system,Username,Hospitalmain,Managepanel); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JPanel createWorkArea(JSplitPane jSplitPane1, EcoSystem system) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
