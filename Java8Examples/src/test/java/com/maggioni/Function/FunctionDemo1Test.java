package com.maggioni.Function;

import org.junit.Test;
import static org.junit.Assert.*;

public class FunctionDemo1Test {
    
    FunctionDemo1 demo1 = new FunctionDemo1();
    
    @Test
    public void test1() {
        assertEquals((Integer) 4, demo1.add1_1.apply(3));
        assertEquals((Integer) 5, demo1.add1_1.apply(4));
        assertEquals((Integer) 4, demo1.add1_2.apply(3));
        assertEquals((Integer) 5, demo1.add1_2.apply(4));
        assertEquals((Integer) 5, demo1.add1_3.apply(4));
    }

    @Test
    public void test2() {
        Integer veryComplicated = demo1.doSomeComplicatedStuff.apply(3);
        assertEquals((Integer) 12, veryComplicated);
    }

    @Test
    public void test3() {
        Integer veryComplicated = demo1.doSomeComplicatedStuff.apply(3);
        assertEquals((Integer) 12, veryComplicated);
    }

    @Test
    public void test4() {
        String apply = demo1.veryComplicatedFunction.apply(2);
        assertEquals(String.valueOf(8), apply);
    }
}
