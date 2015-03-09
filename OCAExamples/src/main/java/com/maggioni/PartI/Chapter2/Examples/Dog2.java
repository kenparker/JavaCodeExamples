package com.maggioni.PartI.Chapter2.Examples;

class Animal5 {
    public void eat() throws Exception{
        
    }
}
public class Dog2 extends Animal5{

    public void eat() {
        System.out.println("I'm from Dog2");
    }
    public static void main(String[] args) {
        Animal5 a = new Dog2();
        Dog2 d = new Dog2();
        d.eat();
        try {
            a.eat(); // because a.eat() declare an Exception, there is the need
                    // to surround the code with a try-catch statement
                    // even if the eat() Method called is from Dog2
        } catch (Exception ex) {
        }
    }
    
}
