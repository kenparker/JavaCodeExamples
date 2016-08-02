package com.maggioni.JDBC.Demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StatementDemo1 {

    Connection con;
    Statement st;
    public static void main(String[] args) {
        
    }
    
    public void getStatement() {
        try {
            st = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(StatementDemo1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getConnection(){
        try {
            con = DriverManager.getConnection("jdbc...", "user", "password");
        } catch (SQLException ex) {
            Logger.getLogger(StatementDemo1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void execStatement() {
        try {
            int executeUpdate = st.executeUpdate("UPDATE ... ");
        } catch (SQLException ex) {
            Logger.getLogger(StatementDemo1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
