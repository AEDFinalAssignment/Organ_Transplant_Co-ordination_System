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
public class PharmacyAdmin extends Role {
    public JPanel createWorkArea(JSplitPane jSplitPane1,EcoSystem system) {
        return new HospitalAdministrationArea(jSplitPane1,system); //To change body of generated methods, choose Tools | Templates.
    }
}
