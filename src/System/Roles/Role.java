/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Roles;

import System.EcoSystem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author deepi
 */
public abstract class Role {
    private String RoleName;

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }
        public enum RoleType{
        SystemAdmin("SystemAdmin"),
        IncidentUnitManager("IncidentManager"),
        EmergencyUnitAdmin("ERUAdmin"),
        VoluntaryUnitAdmin("VoluntaryTeamAdmin"),
        SceneManager("SceneManager"),
        PoliceHead("Police Head"),
        PoliceLieutenant("Police Lieutenant"),
        PoliceOfficer("Police Officer"),
        PoliceSeargent("Police Seargent"),
        FireSafetyHead("FireSafetyHead"),
        MedicalAgencyHead("MedicalAgencySupervisor"),
        NGOAdmin("NGOAdmin"),
        PersonalAdmin("PersonalAdmin"),
        ReportingAdmin("ReportingAdmin"),
        HospitalAdmin("HospitalAdmin"),
        CompanySupervisor("CompanySupervisor"),
        FireFighter("Fire Fighter"),
        DisasterHead("DisasterHead"),
        PharmaHead("Pharma Head"),
        VaccineUnitAdmin("VaccineUnitAdmin");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JSplitPane jSplitPane1,EcoSystem system);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
