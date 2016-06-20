package com.maggioni.InnerClasses.Package1;

public class AnonymusDemo1 {

    public static void main(String[] args) {
        Animal a = new Horse() {
          void eat() {System.out.println("anonymus 1");}
          void buck() {System.out.println("anonymus 2");} // no problem
        };
        
        a.eat();
        //a.buck();  // do not compile
        
        Animal b = new Animal() {
            void eat() {System.out.println("anonymus 3");}
            void buck() {System.out.println("anonymus 4");} // no problem
        };
        
        b.eat();
        //b.buck();     // do not compile
    }

}

class Animal {
    void eat() {}
}
class Horse extends Animal {
    void buck() {}
}
