package com.maggioni.Function;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterFITest {

    @Test
    public void test1() {
        Integer expected = 123;
        ConverterFI<String, Integer> converter = f -> Integer.valueOf(f);
        Integer converted = converter.convert("123");
        assertEquals(expected, converted);
    }

    @Test
    public void test2() {
        ConverterFI<String, Boolean> converter = (String f) -> f.isEmpty();
        Boolean converted = converter.convert("5000");
        assertTrue(converted);
    }

}
