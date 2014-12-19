/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maggioni.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author maggioni
 */
public class ListIteratorAddElementExample {

    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("1");
        aList.add("2");
        aList.add("3");
        aList.add("4");
        aList.add("5");

        ListIterator<String> listIterator = aList.listIterator();
        listIterator.next();
        listIterator.add("Added Element");
        for (String str : aList) {
            System.out.println(str);
        }
    }

}
