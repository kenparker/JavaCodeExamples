package com.maggioni.PartI.Exceptions;

public class ExceptionDemo4 {

    public static void main(String[] args) {
        int arr[] = new int[-5];        // NegativeArraySizeException
        System.out.println(arr.length);
        Object[] ob = new String[]{"abc",null};
    }

}
