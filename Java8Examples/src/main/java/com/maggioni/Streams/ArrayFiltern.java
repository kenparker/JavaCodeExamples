package com.maggioni.Streams;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * http://www.javabeginners.de/Arrays_und_Verwandtes/Array_filtern.php
 */
public class ArrayFiltern {

    public static void main(String[] args) {
    Integer[] i = new Integer[100];
        for (int j = 0; j < i.length; j++) {
            i[j] = new Random().nextInt();
        }
        
        Arrays.stream(i).filter(n -> n%2==0).sorted().forEach(k -> System.out.println(k));
    }
    
}
