package com.maggioni.ExampleApacheCommon;

import com.gargoylesoftware.base.testing.EqualsTester;
import junit.framework.TestCase;

public class Country2Test extends TestCase {

    public void testCountry() {
        Country a = new Country("india", 10000);
        Country b = new Country("india", 10000);
        Country c = new Country("indix", 20);
        Country d = new Country("india", 10000) {
            // something
        };

        // it should return wrong as equals and hascode are not implemented well
        new EqualsTester(a, b, c, d);
    }

}
