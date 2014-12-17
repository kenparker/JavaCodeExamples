package com.maggioni.String.Examples;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * http://java67.blogspot.sg/2012/10/best-way-to-convert-numbers-to-string-in-java-example.html
 */
public class NumberToStringConversion {

    public static void main(String[] args) {

        Set<String> cities = new HashSet<String>();
        cities.add("London");
        cities.add("Tokyo");
        cities.add("NewYork");

        String size = "" + cities.size();
        System.out.println(" The size of the array is: " + size);
        
        size = size.valueOf(cities.size());
        System.out.println(" The size of the array is "+ size);
        
    }

}
