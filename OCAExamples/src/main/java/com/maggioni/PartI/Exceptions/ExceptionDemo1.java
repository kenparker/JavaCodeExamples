package com.maggioni.PartI.Exceptions;

public class ExceptionDemo1 {

    public static void main(String[] args) {
        try {
            throw new IllegalStateException();
        } finally {
            throw new RuntimeException();
        }
    }

}
