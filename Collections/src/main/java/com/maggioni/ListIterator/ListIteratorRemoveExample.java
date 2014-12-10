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
public class ListIteratorRemoveExample {

    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();

        aList.add("1");
        aList.add("2");
        aList.add("3");
        aList.add("4");
        aList.add("5");

    // Get an object of ListIterator using listIterator() method
        ListIterator listIterator = aList.listIterator();
        listIterator.next();
        listIterator.next();

    // remove element returned by last next method
        listIterator.remove();
        for (String str : aList) {
            System.out.println(str);
        }
    }

}
