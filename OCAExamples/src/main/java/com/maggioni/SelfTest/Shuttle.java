package com.maggioni.SelfTest;

/**
 *
 * @author magang
 */
class Rocket {

    private void blastOff() // because the visibility is only in the Rocket class, the methos is not overridden from Shuttle
    {
        System.out.println("bang");
    }

    public void pubMethod() {
        System.out.println("hi");
    }
    
    public static void staMethod() {
        System.out.println("Static method");
    }
}

public class Shuttle extends Rocket {

    public static void main(String[] args) {
        new Shuttle().go();
    }

    void go() {
        blastOff();
        // Rocket.blastOff(); // blastOff has a private access
        super.pubMethod(); // this works
        // Rocket.pubMethod(); // do not work as non-static methid and static context
        Rocket.staMethod(); // works static context and static method
    }

    private void blastOff() // blastOff is not overriding the blastOff method in Rocket
    {
        System.out.println("sh-Bang");
    }
}
