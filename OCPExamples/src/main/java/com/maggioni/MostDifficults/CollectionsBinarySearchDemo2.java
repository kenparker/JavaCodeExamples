package com.maggioni.MostDifficults;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Brille implements Comparable<Brille> {
    private Integer code;
    private String name;

    static int laufNummer;
    static Brille getInstance() {
        return new Brille(++laufNummer, "default"+laufNummer);
    }
    
    public Brille(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brille{" + "code=" + code + ", name=" + name + '}';
    }

    /*
    A call to your compareTo method should return:
        a value < 0 if this object comes "before" the other object
        a value > 0 if this object comes "after" the other object
        or        0 if this object is considered "equal" to the other
    */
    @Override
    public int compareTo(Brille o) {
        return this.code.compareTo(o.code);
    }
    
    
}

public class CollectionsBinarySearchDemo2 {

    public static void main(String[] args) {
        
        List<Brille> b = new ArrayList<>();
        Brille b1 = Brille.getInstance();
        Brille b2 = Brille.getInstance();
        Brille b3 = Brille.getInstance();
        
        b.add(b3);
        b.add(b1);
        b.add(b2);
        
        System.out.println(" List not ordered: " + b);
        
        /*
        Note: if Brille is not extending Comparable the following Statement will not compile
         */
        System.out.println(" result of binarySearch :" + Collections.binarySearch(b, b3));
        
        Collections.sort(b);
        System.out.println(" List ordered: " + b);
        System.out.println(" result of binarySearch :" + Collections.binarySearch(b, b1));
        System.out.println(" result of binarySearch :" + Collections.binarySearch(b, b3));
    }

}
