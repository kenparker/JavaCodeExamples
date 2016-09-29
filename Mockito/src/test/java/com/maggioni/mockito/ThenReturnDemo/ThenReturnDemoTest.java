package com.maggioni.mockito.ThenReturnDemo;

import java.util.Iterator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

public class ThenReturnDemoTest {

    @Test
    public void test1() {
        Iterator i = Mockito.mock(Iterator.class);
        
        // return multiple values
        Mockito.when(i.next()).thenReturn("Java").thenReturn("and").thenReturn("Mockito");
        
        String result = i.next() + " " + i.next() + " " + i.next();
        Assert.assertEquals("check ", "Java and Mockito", result);
    }
    
    @Test
    public void test2() {
        Comparable c = Mockito.mock(Comparable.class);
    
        // returns values based on input
        Mockito.when(c.compareTo("Java")).thenReturn(100);
        Mockito.when(c.compareTo("Mockito")).thenReturn(200);
        Assert.assertEquals(200, c.compareTo("Mockito"));
    }
    
    @Test
    public void test3() {
        Comparable c = Mockito.mock(Comparable.class);
        
        Mockito.when(c.compareTo(Matchers.anyInt())).thenReturn(20);       
        Assert.assertEquals(20, c.compareTo(1555));
        Assert.assertEquals(20, c.compareTo(1));
    }
}
