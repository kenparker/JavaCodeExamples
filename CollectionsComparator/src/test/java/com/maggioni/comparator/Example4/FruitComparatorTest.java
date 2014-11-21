package com.maggioni.comparator.Example4;

import org.junit.Test;
import static org.junit.Assert.*;
public class FruitComparatorTest {

    @Test
    public void testStaticComparatorToEqual() {
        
        Fruit oneFruit = new Fruit("Ananas", null, 10);
        Fruit secondFruit = new Fruit("Ananas", null, 10);
        
        int result = Fruit.FruitNameComparator.compare(oneFruit, secondFruit);
        assertTrue("expected to be equal", result == 0);
    }
}
