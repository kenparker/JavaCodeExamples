package com.maggioni.Whizlab.Pretest.Inheritance;

class Fuel {

    int getInt1() {
        return 34;
    }
    
    int getRating() {
        return 41;
    }
}

class AlternateFuel extends Fuel {

    int getRating() {
        return 42;
    }
}

public class BioDiesel2 extends AlternateFuel {

    int getInt1() {return 356;}
    int getRating() {
        return 43;
    }
    public static void main(String[] args) {
        final BioDiesel2 bioDiesel2 = new BioDiesel2();
        bioDiesel2.go();
        System.out.println(bioDiesel2.getRating());
    }

    void go() {
        System.out.println(this.getInt1());
        System.out.println(super.getInt1());
        System.out.println(super.getRating());
        System.out.println(this.getRating());
    }
}
