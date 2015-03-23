package com.maggioni.PartI.Chapter3.Exercise;

public class ParameterUebergabe2 {

    public static void main(String[] args) {
        int i = 10;
        System.out.println(paramChange(i)); // int variable is casted to double
        System.out.println(i);
    }
    
    private static double paramChange(double d) {
        d = d/4;
        return d;
    }
}
