package com.maggioni.ExceptionsAndAssertions;

public class ExceptionBaseDemo3 {

    public void aMethod() {}
    public void noRuntimeException() {}

}

class ExceptionDerived extends ExceptionBaseDemo3 {
    //public void aMethod() throws Exception{} // DO NOT compile
    public void roRuntimeException() throws RuntimeException {}
}
