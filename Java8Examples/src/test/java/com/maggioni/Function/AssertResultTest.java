package com.maggioni.Function;

import org.junit.Test;

public class AssertResultTest {

    private AssertResult assertResult = () -> System.out.println("Hallo");

    @Test
    public void givenAssertResultFunction_thenOutputIsHello() {
        assertResult.apply();
    }
}