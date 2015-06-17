package com.maggioni.PartI.Exceptions;

public class ArrayStoreExceptionDemo1 {

    public static void main(String[] args) {
        Object[] o = new String[3]; 
        o[0] = new Integer(12);     // ArrayStoreException thrown at runtime
    }

}
