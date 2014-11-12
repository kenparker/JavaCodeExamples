package com.maggioni.junit_cookbook_examples;

import com.gargoylesoftware.base.testing.EqualsTester;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author maggioni
 */
public class Money2Test {

    public static Money a;
    public static Money b;
    public static Money c;
    public static Money d;

    @BeforeClass
    public static void testEquals() {

        a = new Money(100, 20);
        b = new Money(100, 20);
        c = new Money(10, 1);
        d = new Money(100, 0) {
            // Trivial subclass
        };;

    }

    @Test
    public void testAll() {

        new EqualsTester(a, b, c, d);
    }
}
