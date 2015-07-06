package com.maggioni.PartI.Whizlab.Pretest.Package1;

import java.time.ZoneId;

/*
key things about interfaces:
1. interface classes as the keyword 'interface'
2. interface classes as Public or Default Access

3. interface methods are always abstract, i.e. there are only methods signatures, no Body
4. interface methods are always public, even if they have not a 'public' keyword
5. interface methods are always abstract, even if they do not have the 'abstract' keyword
6. intercace static methods have a body
7. interface static methods are always 'public' access, even if the keyword is not there

on Inheritance and Composition:
http://www.w3resource.com/java-tutorial/inheritance-composition-relationship.php
Interfaces Tutorial:
https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html

Design with intercace
http://www.javaworld.com/article/2076841/core-java/designing-with-interfaces.html?page=2
*/
public interface InterfA {
    
    public int FIELDA = 1234;
    int FIELDB = 23;
    
    public void methodA();
    
    void methodB();
    
    static public ZoneId getZoneId(String zoneString) {
        return ZoneId.systemDefault();
    }
    
    static String methodD() {
        return "aaa";
    }
}
