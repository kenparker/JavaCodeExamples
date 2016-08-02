package com.maggioni.JDBC.Demos;


import com.sun.rowset.JdbcRowSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetDemo1 {

    public static void main(String[] args) {
        
    }

    private void createJdbcRowSetDefaultConstructor() throws SQLException{
        
        JdbcRowSet jrs = new JdbcRowSetImpl();
        String cmd = "SELECT * ....";
        String pwd = "secret";
        String user = "user";
        String url = "jdbc:...";
        jrs.setUrl(url);
        jrs.setCommand(cmd);
        jrs.setPassword(pwd);
        jrs.setUsername(user);
    }
    
    private void createJdbcRowSetResultSet() throws SQLException{
        
        Connection con = DriverManager.getConnection("....");
        Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stm.executeQuery("SELECT * ....");
        
        JdbcRowSet jrs = new JdbcRowSetImpl(rs);
    }
    
    private void createJdbcRowSetFactory() throws SQLException{
        
        RowSetFactory newFactory = RowSetProvider.newFactory();
        JdbcRowSet createJdbcRowSet = newFactory.createJdbcRowSet();
    }
}
