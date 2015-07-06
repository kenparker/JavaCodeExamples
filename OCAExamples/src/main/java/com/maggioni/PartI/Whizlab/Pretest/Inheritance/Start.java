package com.maggioni.PartI.Whizlab.Pretest.Inheritance;

interface Breakable { public void breakSmoothly();}
class Car { public void accelerate() {} }
class FancyCar extends Car { public void breakSmoothly() {}}
class SuperFancyCar extends FancyCar implements Breakable {
    public void breakSmoothly() {}
    public void turn(){}
}
public class Start {

    public static void main(String[] args) {
        print(new FancyCar());
    }
    
    private static void  print(Car car) {
        /*
        ((Breakable) car).breakSmoothly();  // Compile but throws ClassCastException at runtime
        ((SuperFancyCar) car).turn();       // Compile but ClassCastException
        ((SuperFancyCar) car).breakSmoothly(); // ClassCastException
        */
        //((FancyCar) car).turn();          // do not compile
        ((FancyCar) car).breakSmoothly();   // runs ok
        car.accelerate();
        /*                                  // do not compile
        car.turn();
        car.breakSmoothly();
         */
        
    }

}
