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

    public SQL_Connect() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            String dburl = "jdbc:postgresql://localhost:5432/AED_FinalProject";
            String username = "postgres";
            String password = "ece18670!";
            Connection connection = DriverManager.getConnection(dburl, username, password);
            java.sql.Statement stat;
            stat = connection.createStatement();
            String query = "SELECT * FROM public.\"Patient\"";
            java.sql.ResultSet rs = stat.executeQuery(query);
            
            
            while(rs.next())
            {
                System.out.println(rs.getString(1)+rs.getString(2));
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQL_Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
