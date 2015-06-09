package com.maggioni.Whizlab.Pretest.Inheritance;

class Bird extends Animal {

    @Override
    public void print() {
        System.out.println("Bird");
    }
    
    public  int print(int i) {
        return ++i;
    }
    
    public  void print(String s) {
        System.out.println(" s = " + s);
    }

    void fly() {
        System.out.println("Bird fly");
    }
}

class Animal {

    public void print() {
        System.out.println("Animal");
    }
}

public class InheritanceDemo1 {

    public static void main(String[] args) {
        Animal b = new Bird();
        b.print();
        //b.fly(); // do not compile as Animal does not have fly() method
    }

}
