package com.maggioni.comparator.Example4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author magang
 */
public class FruitTest {

    @Test
    public void testEqual() {
        Fruit oneFruit = new Fruit("Ananas", null, 10);
        Fruit secondFruit = new Fruit("Ananas", null, 10);

        int compareTo = oneFruit.compareTo(secondFruit);
        assertTrue("expected to be equal", compareTo == 0);
    }
    
    
    @Test
    public void testGreaterThen() {
        Fruit oneFruit = new Fruit("Ananas", null, 10);
        Fruit secondFruit = new Fruit("Ananas", null, 1);

        int compareTo = oneFruit.compareTo(secondFruit);
        assertTrue("expected to be greater then", compareTo >= 1);
    }
    
    @Test
    public void testLessThen() {
        Fruit oneFruit = new Fruit("Ananas", null, 10);
        Fruit secondFruit = new Fruit("Ananas", null, 111);

        int compareTo = oneFruit.compareTo(secondFruit);
        assertTrue("expected to be less then", compareTo <= 1);
    }
}
