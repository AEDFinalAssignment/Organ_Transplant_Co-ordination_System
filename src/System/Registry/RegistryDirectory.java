/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Registry;

import java.util.ArrayList;

/**
 *
 * @author Subhash
 */
public class RegistryDirectory {
    private ArrayList<Registry> RegistryDirectory;

    public RegistryDirectory() {
        this.RegistryDirectory = new ArrayList <Registry>();
    }

    
    public ArrayList<Registry> getRegistryDirectory() {
        return RegistryDirectory;
    }

    public void setRegistryDirectory(ArrayList<Registry> RegistryDirectory) {
        this.RegistryDirectory = RegistryDirectory;
    }
    
    
}
