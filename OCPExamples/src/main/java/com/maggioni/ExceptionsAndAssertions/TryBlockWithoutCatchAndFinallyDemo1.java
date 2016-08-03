package com.maggioni.ExceptionsAndAssertions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TryBlockWithoutCatchAndFinallyDemo1 {

    public static void main(String[] args){

        /*
        
        try {
            Reader r = new BufferedReader(new InputStreamReader(System.in));
        }
        */
        try {
            Reader r = new BufferedReader(new InputStreamReader(System.in));
            throw new IOException();
        } catch(IOException e){
            
        }
        
        /*
        
        try {
            Reader r = new BufferedReader(new InputStreamReader(System.in));
            throw new IOException();
        } finally {}
        */
    }

}
