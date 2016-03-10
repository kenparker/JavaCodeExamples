package com.maggioni.CollectionsAndGenerics.MostDifficults;

import java.io.IOException;

public class MultiCatchTypeVariableDemo2 {

    public static void main(String[] args) {
        
        try {
            throw new Exception2();
        } 
        
        catch (IOException e) {       
            //e.info();     // do not compile
        }
    }

}

class Exception2 extends IOException {
    public String info() {
        return "I'm from exception1";
    }
}
