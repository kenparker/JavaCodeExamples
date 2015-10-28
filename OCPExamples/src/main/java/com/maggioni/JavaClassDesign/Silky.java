package com.maggioni.JavaClassDesign;

public class Silky {

    int x = 5;
    int y = 7;
    public static void main(String[] args) {
        new Silky().go();
    }
    void go() {
        if (x>y & (Boolean) (this instanceof Silky)) // the result of instanceof is a boolean
                                                    // but here the boolean is explicity casted to a Boolean
                                                    // and then back to boolean from the compiler
        {
            System.out.println("a");
        }
    }

}

class Smooth {}
