package com.maggioni.CollectionsAndGenerics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class ArrayBinarySearchDemo1 {

    public static void main(String[] args) {
        String[] arr = {"aaaa","bbbbb","angelo","franco","123"};
        int binarySearch = Arrays.binarySearch(arr, "a");
        System.out.println(" "+binarySearch); // output -1
        
        System.out.println(""+Arrays.binarySearch(arr, "123")); // output is also -1
        
        Arrays.sort(arr);
        System.out.println("sorted array ");
        for (String arr1 : arr) {
            System.out.println(""+arr1);
        }
        System.out.println(""+Arrays.binarySearch(arr, "123")); // output is  0 the array is now sorted
        System.out.println(""+Arrays.binarySearch(arr, "a")); // output is  -2
        
        Plane[] planes1 = new Plane[5];
        planes1[0] = new Plane("Boing");
        planes1[1] = new Plane("Airbus");
        planes1[3] = new Plane("MIG");
        planes1[4] = new Plane("Concorde");
        planes1[2] = new Plane("something else");
        
        Arrays.sort(planes1);
        printArray(planes1);
        System.out.println(" "+Arrays.binarySearch(planes1, new Plane("Boing"))); // return 3
        
        Plane[] planes2 = new Plane[5];
        planes2 = planes1;
        Arrays.sort(planes2,Plane.co);
        printArray(planes2);
        System.out.println(" "+Arrays.binarySearch(planes1, new Plane("Boing"))); // return -6 because Natural Order
        System.out.println(" "+Arrays.binarySearch(planes1, new Plane("Boing"),Plane.co)); // return 1 because the Sorted Order is used
        
        
    }

    static void printArray(Plane[] array) {
        for (Plane array1 : array) {
            System.out.println(""+array1);
        }
    }
}


class Plane implements Comparable<Plane>{

    String name;

    public Plane(String name) {
        this.name = name;
    }
    
    // we could have Comparator<?> here
    static Comparator<Plane> co = new Comparator<Plane>() {

        @Override
        public int compare(Plane o1, Plane o2) {
            return o1.name.compareTo(o2.name);
        }
    };
    
    @Override
    public int compareTo(Plane o) {
        return o.name.compareTo(this.name); // reversed order
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Plane other = (Plane) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Plane{" + "name=" + name + '}';
    }
    
    
}
