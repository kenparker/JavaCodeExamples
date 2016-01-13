package com.maggioni.ExceptionsAndAssertions;

import java.io.IOException;
import java.sql.SQLException;

public class GenericVariableTypeToRethrowException2 {

    public static void mainDemo1(String[] args) throws IOException, SQLException{
        String source = "DBMS";
        try {
            if (source.equals("DBMS")) {
                throw new SQLException();
            } else {
                throw new IOException();
            }
        } catch (Exception e) {
            throw e;    // It compile
        }
                
    }

    public static void mainDemo2(String[] args) throws IOException, SQLException{
        String source = "DBMS";
        try {
            if (source.equals("DBMS")) {
                throw new SQLException();
            } else {
                throw new IOException();
            }
        } catch (Exception e) {
            //throw new Exception(); DO NOT compile
        }
                
    }
}
