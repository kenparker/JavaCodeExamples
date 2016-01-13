package com.maggioni.ExceptionsAndAssertions;

public class UseCustomCheckedExceptionDemo1 {

    public static void main(String[] args) throws CustomCheckedExceptionDemo1 {
        throw new CustomCheckedExceptionDemo1("Text");
    }

}
