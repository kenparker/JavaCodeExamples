package com.maggioni.junit_cookbook_examples;

import com.gargoylesoftware.base.testing.EqualsTester;
import junit.framework.TestCase;

/**
 *
 * @author magang
 */
public class MoneyTest extends TestCase{
    
    public void testEquals() {
    
        Money a = new Money(100, 0);
        Money b = new Money(100, 0);
        Money c = new Money(50, 0);
        Money d = new Money(100, 0) {
            // Trivial subclass
        };
        
        new EqualsTester(a, b,c,d);
        
    }
    
}
