/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maggioni.PartI.Chapter3.Exercise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maggioni
 */
public class ListDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("aaaa");
        Object get = list.get(0);
        
        List<String> listString = new ArrayList<>();
        listString.add("This is a string");
        String get1 = listString.get(0);
    }
    
}
