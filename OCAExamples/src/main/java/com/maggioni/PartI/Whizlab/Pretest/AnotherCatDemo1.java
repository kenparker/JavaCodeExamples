package com.maggioni.PartI.Whizlab.Pretest;

class Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    
    public void testInstanceMethod() {
        System.out.println("The instance Method in Animal");
    }
    
    public Object testReturnObject(Object s) {
        System.out.println("test method from Animal ");
        return s;
    }
}
public class AnotherCatDemo1 extends Animal{

    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    @Override
    public void testInstanceMethod() {
        System.out.println("The instance Method in Cat");
    }
    
    @Override
    public String testReturnObject(Object s) {
        System.out.println("test method from Cat");
        return "test";
    }
    public static void main(String[] args) {
        AnotherCatDemo1 cat = new AnotherCatDemo1();
        Animal animal = new Animal();
        Animal.testClassMethod();
        AnotherCatDemo1.testClassMethod();
        cat.testInstanceMethod();
        animal.testInstanceMethod();
        
        Animal newAnimal = cat;
        newAnimal.testInstanceMethod();
                
    }

}
