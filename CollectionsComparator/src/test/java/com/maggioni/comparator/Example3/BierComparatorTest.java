package com.maggioni.comparator.Example3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author magang
 */
public class BierComparatorTest {
    
    public BierComparator bierComparator = new BierComparator();
    
    @Test
    public void testEqual() {
        Bier oneBier = new Bier("Becks", "Deutschland", 0.5F);
        Bier secondBier = new Bier("Becks", "Deutschland", 0.5F);
        int result = bierComparator.compare(oneBier, secondBier);
        assertTrue("expected to be equal ", result == 0);
    }
    
}
