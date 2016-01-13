package com.maggioni.ExceptionsAndAssertions;

public class CustomCheckedExceptionDemo1 extends Exception{

    public CustomCheckedExceptionDemo1() {
        super();
    }

    public CustomCheckedExceptionDemo1(String message) {
        super(message);
    }

    public CustomCheckedExceptionDemo1(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomCheckedExceptionDemo1(Throwable cause) {
        super(cause);
    }

    public CustomCheckedExceptionDemo1(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    

}
