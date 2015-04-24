package com.maggioni.PartI.Chapter4;

class Parent1 {

    void msg() {
        System.out.println("parent");
    }
    void msg1() throws ArithmeticException{
        System.out.println("parent 1");
    }
}

public class TestExceptionChild1 extends Parent1 {

    public static void main(String[] args) {
        Parent1 p = new TestExceptionChild1();
        p.msg();
    }

    //2) Rule: If the superclass method does not declare an exception, subclass overridden method 
    //         cannot declare the checked exception but can declare unchecked exception.
    @Override
    void msg() throws ArithmeticException {
        System.out.println("testexceptionchild");
    }
    
    //3) Rule: If the superclass method declares an exception, 
    //        subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
    // in the example below Exception is parent of ArithmethicException
    @Override
    void msg1() throws Exception {
        System.out.println("testexceptionchild");
    }
}
