package com.maggioni.MostMissed;

import java.util.ArrayList;
import java.util.List;

public class OverridingOverloadingBoxingUnboxingDemo4 {

    void proble(char... x) {System.out.println("In ...");}
    void proble(String x) {System.out.println("In String");}
    void proble(CharSequence x) {System.out.println("In Charsequence");}
    void proble(StringBuffer x) {System.out.println("In String Buffer");}
    
    void proble2(CharSequence x) {System.out.println("In Charsequence");}
    
    
    void proble3(List l) {System.out.println("In List");}
    void proble3(ArrayList l) {System.out.println("In ArrayList");}
    void proble4(List l) {System.out.println("In List");}
    
    public static void main(String[] args) {
        OverridingOverloadingBoxingUnboxingDemo4 aa = new OverridingOverloadingBoxingUnboxingDemo4();
        
        String s = "hello"; aa.proble(s); // In String
        char c = 'h'; aa.proble(c);       // In ...
        
        aa.proble2(s);                      // In Charsequence
        
        aa.proble3(null);                   // In Arraylist (und nicht Im List)
        List l1;                            
        //aa.proble3(l1);  // do not compile because l is not initialized
        List l2 = null;
        aa.proble3(l2);                     // In List
        l2 = new ArrayList();
        aa.proble3(l2);                     // In List
        ArrayList l3 = new ArrayList();
        aa.proble3(l3);                     // In ArrayList
        aa.proble4(l3);                     // In List
    }

}
