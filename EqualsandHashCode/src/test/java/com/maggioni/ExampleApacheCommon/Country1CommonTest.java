package com.maggioni.ExampleApacheCommon;

import org.junit.Test;
import com.gargoylesoftware.base.testing.EqualsTester;


public class Country1CommonTest {
  
    @Test
    public void testHashCode() {
        Country1Common a = new Country1Common("india");
        Country1Common b = new Country1Common("india");
        Country1Common c = new Country1Common("italy");
        Country1Common d = new Country1Common("india") {};
        
        new EqualsTester(a, b, c, d);
    }    
}
