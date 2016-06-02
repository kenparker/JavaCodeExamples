package com.maggioni.CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
the goal here is to test a compareTo Trick
*/
class Telefon implements Comparable<Object> {

    Integer telNumber;
    Integer telPrefix;

    public Telefon(Integer telNumber, Integer telPrefix) {
        this.telNumber = telNumber;
        this.telPrefix = telPrefix;
    }
    
    static Telefon getInstance() {
         Integer random1 = (int) (Math.random() * 10);
         Integer random2 = (int) (Math.random() * 10);
         Telefon t = new Telefon(random1, random2);
         return t;
    }
    
    @Override
    public int compareTo(Object o) {
        
         if (this.telPrefix != ((Telefon) o).telPrefix) {
             // this - other
             return  this.telPrefix - ((Telefon) o).telPrefix;
         }
         else {
             return this.telNumber - ((Telefon) o).telNumber;
         }
    }

    @Override
    public String toString() {
        return "Telefon{" + "telNumber=" + telNumber + ", telPrefix=" + telPrefix + '}';
    }
    
}

public class CompareToTrick1 {

    public static void main(String[] args) {
        
        List l = new ArrayList();
        Telefon t1 = Telefon.getInstance();
        Telefon t2 = Telefon.getInstance();
        Telefon t3 = Telefon.getInstance();
        l.add(t3);
        l.add(t3);
        l.add(t1);
        l.add(t2);
        
        System.out.println(" List : " + l);
        
        Collections.sort(l);
        System.out.println(" List sorted : " + l);
        
    }

}
