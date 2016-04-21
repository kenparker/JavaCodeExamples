package com.maggioni.MostMissed;

public class OverridingOverloadingBoxingUnboxingDemo1 {

    void proble(int... x) {System.out.println("In ...");}
    void proble(Integer x) {System.out.println("In Integer");}
    void proble(long x) {System.out.println("In long");}
    void proble(Long x) {System.out.println("In Long");}
    
    public static void main(String[] args) {
        OverridingOverloadingBoxingUnboxingDemo1 aa = new OverridingOverloadingBoxingUnboxingDemo1();
        
        Integer integer1 = 4; aa.proble(integer1); // print -> In Integer
        // probe(long) is preferred versus probe(Integer) or probe(int...)
        int int1 = 4; aa.proble(int1); // print -> In long
        int int2 = 4; aa.proble(int1,int2); // print -> In ...
        //Integer integer2 = 10; aa.probe(integer1,integer2); // do not compile
    }

}
