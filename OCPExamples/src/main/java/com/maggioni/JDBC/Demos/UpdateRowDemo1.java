package com.maggioni.JDBC.Demos;

import com.sun.jndi.toolkit.url.UrlUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.management.QueryExp;

public class UpdateRowDemo1 {

    Connection con;
    Statement st;
    public static void main(String[] args) {
        
    }

    private void getConnection() throws SQLException{
        
        String url = "jdbc:....";
        con = DriverManager.getConnection(url);
    }
    
    private void getResultSet() throws SQLException{
        
        Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        
        String query = "SELECT * ....";
        ResultSet rs = stm.executeQuery(query);
        
        while (rs.next()) {
            
            int aInt = rs.getInt(1);
            rs.updateInt(1, 151515);
            rs.updateRow();
            
        }
        
        
    }
}
