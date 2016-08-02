package com.maggioni.JDBC.Demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDemo1 {

    Connection con;

    public static void main(String[] args) {

    }

    public void getConnectionJDBC30() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("...", "User", "pwd");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConnectionDemo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void getConnectionJDBC40(){
        String url = "jdbc:mysql://localhost/Booklibrary";
        String username = "user";
        String password = "userpassword";
        
        try {
            con = DriverManager.getConnection(url, url, password);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDemo1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
