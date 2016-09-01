package com.maggioni.java67;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
http://www.java67.com/2012/12/how-to-create-and-initialize-list-arraylist-same-line.html
*/

public class InitializeAListInOneLineDemo1 {

    public static void main(String[] args) {
        
        List<String> coolList1 = new ArrayList<>();
        List<String> coolList2 = Arrays.asList("Java","is","cool");
        
        /*
        difference between the two Lists
        */
        System.out.printf("coolList2 instanceof List       : %s \n", (coolList2 instanceof List));      // true
        System.out.printf("coolList2 instanceof ArrayList  : %s \n", (coolList2 instanceof ArrayList)); // false
        System.out.printf("coolList1 instanceof List       : %s \n", (coolList1 instanceof List));      // true
        System.out.printf("coolList1 instanceof ArrayList  : %s \n", (coolList1 instanceof ArrayList)); // false
        
        coolList1.add("really");
        /*
        Exception in thread "main" java.lang.UnsupportedOperationException
        coolList2.add("really");
        */
        
        coolList2.set(2, "COOL");
        
        System.out.println(" " + coolList2); // [Java, is, COOL]
    }

}
