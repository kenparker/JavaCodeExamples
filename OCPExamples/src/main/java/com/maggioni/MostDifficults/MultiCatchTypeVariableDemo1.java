package com.maggioni.MostDifficults;

import java.io.IOException;

public class MultiCatchTypeVariableDemo1 {

    public static void main(String[] args) {
        
        try {
            throw new Exception1();
        } 
        catch (Exception1 e) {
            e.info();
        }
        
    }

}

class Exception1 extends IOException {
    public String info() {
        return "I'm from exception1";
    }
}
