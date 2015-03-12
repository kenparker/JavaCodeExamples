package com.maggioni.PartI.Chapter2.Examples;

public class Tarsier {

    static String s = "-";
            
    public static void main(String[] args) {
        go(1);          // static method call
        Tarsier t = new Tarsier();
        t.go();         // Instance method call
        t.go(1);        // Static method call
        Tarsier.go(11); // Static method call
    }
    
    void go() {s+="s";}
    {go();}
    static { go(1); }
    // static void go() {s+="s";} it does not compile because same name and signature as instance.go()
    
    static void go(int i) {}    // that's fine because is different (signature) from instance.go()
}
