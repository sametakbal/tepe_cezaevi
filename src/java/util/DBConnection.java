/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author akbal
 */
public class DBConnection {

    private final String url = "jdbc:postgresql://localhost/tepe_cezaevi_db";
    private final String user = "postgres";
    private final String password = "1234";
    
    private Connection connector=null;

      public Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        return conn;
      }

    public Connection getConnector() {
        if (this.connector == null) {
            this.connector = connect();
        }
        return this.connector;
    }

    public void setConnector(Connection connector) {
        this.connector = connector;
    }
      
      
}
