package com.maggioni.HashCode;

/**
 * http://javarevisited.blogspot.sg/2011/02/how-to-write-equals-method-in-java.html
 * http://www.java2blog.com/2014/02/hashcode-and-equals-method-in-java.html
 * 
 * @author magang
 */
public class HashCodeDemo {

    public static void main(String[] args) {

        String a = "angelo";
        String b = "angelo";
        System.out.println(" hash code from :" + a.hashCode() + " is equal to hashcode of " + b.hashCode() + " " + (a.hashCode() == b.hashCode()));

        String c = new String("angelo");
        String d = new String("angelo");
        System.out.println(" hash code from :" + c.hashCode() + " is equal to hashcode of " + d.hashCode() + " " + (c.hashCode() == d.hashCode()));
        
        String e = new String();
        e = "angelo";   
        String f = new String();
        f = "angelo";
        
        System.out.println(" hash code from :" + e.hashCode() + " is equal to hashcode of " + f.hashCode() + " " + (e.hashCode() == f.hashCode()));
    }

}
