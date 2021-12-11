/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Transportation;

import java.util.ArrayList;

/**
 *
 * @author Subhash
 */
public class TransportDirectory {
    private ArrayList<Transportation> TransportationDirectory;

    public TransportDirectory() {
        this.TransportationDirectory = new ArrayList <Transportation>();
    }

    
    public ArrayList<Transportation> getTransportationDirectory() {
        return TransportationDirectory;
    }

    public void setTransportationDirectory(ArrayList<Transportation> TransportationDirectory) {
        this.TransportationDirectory = TransportationDirectory;
    }
     public Transportation addTransportation() {
        Transportation r = new Transportation();
        TransportationDirectory.add(r);
        return r;
    }
      public void removeRegistry(Transportation r) {
        TransportationDirectory.remove(r);
    }

    public Transportation searchRegistry(String userName) {
        for (Transportation transportation : TransportationDirectory) {
            if (transportation.getUserName()==userName) {
                return transportation;
            }
        }
        return null;
    }
}
