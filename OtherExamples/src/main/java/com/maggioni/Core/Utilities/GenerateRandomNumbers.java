package com.maggioni.Core.Utilities;

import java.util.Random;

/*
http://javabeginners.de/Arrays_und_Verwandtes/Array_filtern.php

Random Numbers between 0 and 99
*/
public class GenerateRandomNumbers {

    public static void main(String[] args) {
       
        Integer[] i = new Integer[100];
        for (int j = 0; j < i.length; j++) {
            i[j] = new Random().nextInt();
        }
    }

}
