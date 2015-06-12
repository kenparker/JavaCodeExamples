package com.maggioni.PartI.Exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

class Fruit {

    public Fruit() throws Exception {
        throw new Exception();
    }

    public void eat() throws java.io.IOException {
    }
}

public class Mango extends Fruit {

    /*
    public Mango() {}               // It do not compile because the default construction need to handle the exception
    */
    public Mango() throws Exception {   // compiles
    }

    
    public void eat() {
        System.out.println("Eating Mango");
    }

    public static void main(String[] args) {
        Mango m1 = null;
        try {
            m1 = new Mango();
        } catch (Exception ex) {
            Logger.getLogger(Mango.class.getName()).log(Level.SEVERE, null, ex);
        }
        m1.eat();
    }
}
