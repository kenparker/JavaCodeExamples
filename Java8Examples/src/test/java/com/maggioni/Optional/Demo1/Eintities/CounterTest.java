package com.maggioni.Optional.Demo1.Eintities;

import org.junit.Test;

public class CounterTest {

    private Counter counter;

    @Test(expected = NullPointerException.class)
    public void testConstructorWithOneNullValue() {
        counter = new Counter(null, Integer.MIN_VALUE);
    }
    
    @Test(expected = NullPointerException.class)
    public void testConstructorWithBothNullValues() {
        counter = new Counter(null, null);
    }

}
