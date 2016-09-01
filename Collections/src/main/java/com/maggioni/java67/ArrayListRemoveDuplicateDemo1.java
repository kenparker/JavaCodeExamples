package com.maggioni.java67;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
http://www.java67.com/2015/03/how-to-remove-duplicates-from-arraylist.html
*/
public class ArrayListRemoveDuplicateDemo1 {

    public static void main(String[] args) {
        
        List<Integer> primes = new ArrayList<>();
        primes.add(1);
        primes.add(101);
        primes.add(7);
        // duplicates
        primes.add(10);
        primes.add(10);
        
        primes.add(3);
        
        System.out.println(" " +  primes); // [1, 101, 7, 10, 10, 3]
        
        // LinkedHasSet keep the order of the original List
        Set<Integer> primesWithoutDuplicates = new LinkedHashSet<>(primes);
        System.out.println(" " + primesWithoutDuplicates); // [1, 101, 7, 10, 3]
        
        primes.clear();
        
        primes.addAll(primesWithoutDuplicates);
        System.out.println(" " +  primes); // [1, 101, 7, 10, 3]
        
        
    }

}
