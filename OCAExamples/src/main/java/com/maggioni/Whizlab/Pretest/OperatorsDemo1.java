package com.maggioni.Whizlab.Pretest;

public class OperatorsDemo1 {

    public static void main(String[] args) {
        int i = 10;
        int n = i++%5;
        System.out.println("n = " + n);     // n = 0
        System.out.println("i = "+i);       // i = 11
        
        i = 10;
        n = ++i%5;
        System.out.println("n = " + n);     // n = 1
        System.out.println("i = "+i);       // i = 11
        
        A a1 = new A();
        A a2 = new A();
        
        System.out.println("a1 == a2 " +  (a1 == a2));
        System.out.println("a1.equal(a2) " +  (a1.equals(a2)));     // the output is still false as standard equals does the same as ==
        
        String s1 = "Java";
        String s2 = "Java";
        
        System.out.println("s1 == s2 " + (s1 == s2));   // true as both var are pointing same object in the constant-pool
        System.out.println("" + (s1.equals(s2)));       // the output is true as java.lang.String equal method is overridden
        
        String s3 = new String("Java");
        String s4 = new String("Java");
        System.out.println("s3 == s4 " + (s3 == s4));   // false as two different objects
        System.out.println("" + (s3.equals(s4)));       // true as the content is the same
        
        // http://openbook.rheinwerk-verlag.de/javainsel/javainsel_02_004.html#dodtp55ed8bd0-c4f0-4a2d-95b8-421ed8290210
        int a = 2;
        a = ++a;
        System.out.println("a = " + a);     // a = 3
        
        a = 2;
        // pre
        a = a + 1;
        System.out.println("a = " + a);     // a = 3
        
        int b = 2;
        b = b++;
        System.out.println("b = " + b);     // b = 2;
        
        b = 2;
        int c = b;
        b = b + 1;
        b = c;
        System.out.println("b = " + b);
        
        // fieses example
        boolean A = false, B = false, C = true;
        
        http://openbook.rheinwerk-verlag.de/javainsel/javainsel_02_004.html#dodtpb218d93c-4f16-4a70-ac88-2cae6c5ba95e
        System.out.println("A && B "+ (A && B));        // false
        System.out.println("A & B "+ (A & B));         // false
        System.out.println("(A && B) || C "+ ((A && B) || C));   // true
        System.out.println("A && B || C "+ (A && B || C));     // true
        
        System.out.println("(A && B) | C "+ ((A && B) | C));    // true
        System.out.println( A && B);
        System.out.println( false | C);
        
        System.out.println("A && B | C "+ (A && B | C));      // true
        System.out.println(B | C);
        System.out.println(A | true);
        
        
        // Links- oder Rechtsassoziativität
        // fieses Beispiel
        float aa = -16777217F;
        float bb =  16777216F;
        float cc = 1F;
        System.out.println(aa+bb+cc);   // output 1.0 wegen überlauf
        System.out.println(aa+(bb+cc)); // output 0.0
    }
    
    
}

class A {
    int i = 100;
    int j;
}
