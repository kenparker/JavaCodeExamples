package com.maggioni.MostDifficults;

public class TopNestedandNestedClassesToughDemo1 {

    public class A {}
    public static class B {}
    
    public void useClasses() {
        new TopNestedandNestedClassesToughDemo1().new A();
        new TopNestedandNestedClassesToughDemo1.A();    // It is different from the previous line
                                                        // no instance of TopNetsted... is created
                                                        // It is the same as the line below
        new A();
        new TopNestedandNestedClassesToughDemo1.B();
        
    }

}
