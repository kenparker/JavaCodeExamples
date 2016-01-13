package com.maggioni.ExceptionsAndAssertions;

import java.io.IOException;

public class ExceptionBaseDemo4 {

    public void aMethod() throws IOException{}
    public void noRuntimeException() {}

}

class ExceptionDerived4 extends ExceptionBaseDemo4 {
    public void aMethod() {} // Compile
    public void roRuntimeException() throws RuntimeException {}
}
