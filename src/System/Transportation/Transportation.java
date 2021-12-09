/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Transportation;

import System.Organization;

/**
 *
 * @author Subhash
 */
public class Transportation extends Organization{
    private int TransportID;
    private String ModesOfTransportation;

    public int getTransportID() {
        return TransportID;
    }

    public void setTransportID(int TransportID) {
        this.TransportID = TransportID;
    }

    public String getModesOfTransportation() {
        return ModesOfTransportation;
    }

    public void setModesOfTransportation(String ModesOfTransportation) {
        this.ModesOfTransportation = ModesOfTransportation;
    }
}
