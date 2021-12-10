/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL_Connection;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Subhash
 */
public class SQL_Connect {

    java.sql.Statement stat;
    public SQL_Connect() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            String dburl = "jdbc:postgresql://localhost:5432/AED_FinalProject";
            String username = "postgres";

            String password = "Jeevsan3018";
            Connection connection = DriverManager.getConnection(dburl, username, password);
            this.stat = connection.createStatement();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQL_Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public java.sql.Statement retStatement()
    {
        return stat;
    }
}
