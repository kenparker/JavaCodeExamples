package com.maggioni.MostMissed.PracticeTestII;

class A {

    int i;

    A() {
    }
}
class B extends A{

    public B(short i) {
        System.out.println("short const");
    }
    public B(float i) {
        System.out.println("float const");
    }
    
    public void methodFloat(float f){
        System.out.println("float method");
    }
}
public class BoxingConstructorsAndMethodsDemo1 extends B{

    public BoxingConstructorsAndMethodsDemo1() {
        super(4);
    }

    
    public static void main(String[] args) {
        final BoxingConstructorsAndMethodsDemo1 b = new BoxingConstructorsAndMethodsDemo1();
        System.out.println(b.i);
        
        int z = 23;
        b.methodFloat(z);
        
    }

}
