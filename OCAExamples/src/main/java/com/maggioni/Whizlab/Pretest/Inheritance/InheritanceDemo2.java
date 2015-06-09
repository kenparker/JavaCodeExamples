package com.maggioni.Whizlab.Pretest.Inheritance;

interface I {

}

abstract class Ab {

}

class Sub extends Ab implements I {

}

public class InheritanceDemo2 {

    public static void main(String[] args) {
        I i = new Sub();
        Ab ab = new Sub();
        Ab ab2 = new Ab() {
        };

        System.out.println("i instanceof I : " + (i instanceof I));
        System.out.println("ab instanceof I : " + (ab instanceof I));
        System.out.println("" +  (ab2 instanceof Sub));
    }

}
