package com.maggioni.ExampleApacheCommon;

import org.junit.Test;
import com.gargoylesoftware.base.testing.EqualsTester;


public class Country2CommonTest {
  
    @Test
    public void testHashCode() {
        Country2Common a = new Country2Common("india",10);
        Country2Common b = new Country2Common("india",11);
        Country2Common c = new Country2Common("italy",12);
        Country2Common d = new Country2Common("india",13) {};
        
        new EqualsTester(a, b, c, d);
    }    
}
