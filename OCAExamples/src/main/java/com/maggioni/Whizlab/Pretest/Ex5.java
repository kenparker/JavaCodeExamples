package com.maggioni.Whizlab.Pretest;

public class Ex5 {

    public static void main(String[] args) {
        int i;
        if (new Ex5().go()) i = 5;
        
        //System.out.println(""+i); // the statemend does not compile because i might not be initialized
    }

    boolean go() {
        return true;
    }
}
