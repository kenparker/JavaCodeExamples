package com.maggioni.MostDifficults;

public class InstanceOfCastingEasyDemo1 {

    public static void main(String[] args) {
        
        A o1 = new C();
        B o2 = (B) o1;
        B o3 = new B();
        System.out.println(o1.m1()); // 30
        System.out.println(o1.i); // 10
        System.out.println(o2.i);   // 20
        System.out.println(o2.m1());   // 30
        System.out.println(o3.m1());   // 20
    }

}
class A { int i = 10; int m1() {return i;}}
class B extends A {int i = 20; int m1() {return i;}}
class C extends B {int i = 30; int m1() {return i;}}
