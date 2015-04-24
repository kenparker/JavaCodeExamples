
package com.maggioni.PartI.Chapter4;

import java.io.IOException;

class Parent {
    void msg(){System.out.println("parent");}
}
public class TestExceptionChild extends Parent{

    
    public static void main(String[] args) {
        Parent p = new TestExceptionChild();
        p.msg();
    }
    
    // 1) Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.
    @Override
    void msg()throws IOException { 
        System.out.println("testexceptionchild");
    }
}
