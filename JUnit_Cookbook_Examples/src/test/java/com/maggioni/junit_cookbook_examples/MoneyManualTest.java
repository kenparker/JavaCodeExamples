package com.maggioni.junit_cookbook_examples;

import junit.framework.TestCase;

public class MoneyManualTest extends TestCase{

    private Money a;
    private Money b;
    
    protected void setUp() {
        a = new Money(100, 10);
        b = new Money(100,10);
    }
    
    public void testReflexive() {
        assertEquals(a, a);
    }
    
    public void testSymmetric() {
        assertEquals(a, b);
        assertEquals(b, a);
    }
}
