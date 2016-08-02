package com.maggioni.JDBC.Demos;

import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetDemo2 {

    public static void main(String[] args) {
        
    }

    private void example() throws SQLException{
        RowSetFactory newFactory = RowSetProvider.newFactory();
        JdbcRowSet createJdbcRowSet = newFactory.createJdbcRowSet();
        
    }
}
