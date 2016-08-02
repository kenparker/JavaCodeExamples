package com.maggioni.JDBC.Demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import static java.sql.ResultSet.TYPE_FORWARD_ONLY;
import static java.sql.ResultSet.TYPE_SCROLL_SENSITIVE;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo1 {
    
    Connection con;
    Statement st;
    public static void main(String[] args) {
        
    }
    
    private void getConnection() throws SQLException {
        con = DriverManager.getConnection("jdbc:....");
    }
    
    private void execStatement() throws SQLException {
        st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * ...");
        
        boolean next = rs.next();
    }
    
    private void createResultSet1() throws SQLException{
        con.createStatement(TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
    }

}
