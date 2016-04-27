package com.maggioni.Serialize3;

import java.io.Serializable;

public class Base3 {
    String s1;
    String s2;
    {
        s2 = "in init block";
    }

    public Base3() {
         System.out.println("constructor from Base");
    }
    
}

class Child extends Base3 implements Serializable{
    String c = "aaaa";
    String c2;
    
    {
        c2 = "ffffff";
    }

    public Child() {
         System.out.println("constructor from Child");
    }
    
}

class ChildOfChild extends Child {
    String x = "hello from ChildOfChild";

    public ChildOfChild() {
        System.out.println("constructor from ChildOfChild");
    }
    
}
