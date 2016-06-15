package com.maggioni.Boxing;

public class OverridingOverloadingBoxingUnboxingDemo1 {

    void proble(int... x) {System.out.println("In ...");}
    void proble(Integer x) {System.out.println("In Integer");}
    void proble(long x) {System.out.println("In long");}
    void proble(Long x) {System.out.println("In Long");}
    
    void proble2(Integer i) {System.out.println("In Integer");}
    void proble3(Object x) {System.out.println("In Object");}
    void proble3(Number x) {System.out.println("In Number");}
    void proble4(Object x) {System.out.println("In Object");}
    
    public static void main(String[] args) {
        OverridingOverloadingBoxingUnboxingDemo1 aa = new OverridingOverloadingBoxingUnboxingDemo1();
        
        Integer integer1 = 4; aa.proble(integer1); // print -> In Integer
        
        //probe(long) is preferred versus probe(Integer) or probe(int...)
        // for an int variable we have following sequence int, long, Integer, Number, Object
        int int1 = 4; aa.proble(int1); // print -> In long
        aa.proble2(int1); // print -> In Integer 
        aa.proble3(int1); // print -> In Number 
        aa.proble4(int1); // print -> In Object 
        
        int int2 = 4; aa.proble(int1,int2); // print -> In ...
        //Integer integer2 = 10; aa.probe(integer1,integer2); // do not compile
        
        //double b = 12.3456; aa.proble(b); // do not compile
    }

}
