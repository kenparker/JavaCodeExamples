package com.maggioni.stringvalidator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maggioni
 */
public class StringValidatorTest {

    /**
     * Test of isValid method, of class StringValidator.
     */
    @Test
    public void testIsValid() {
       
        String test = "";
        StringValidator instance = new StringValidator();
        boolean expResult = false;
        boolean result = instance.isValid(test);
        assertEquals(false, result);
    }
    
    @Test
    public void testAddDirtyWord() {
       
        String word = "dirty";
        StringValidator instance = new StringValidator();
        instance.addDirtyWord(word);

    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testDirtyWorkNotValidEmpty() {
       
        String word = "";
        StringValidator instance = new StringValidator();
        instance.addDirtyWord(word);

    }

    @Test (expected = IllegalArgumentException.class)
    public void testDirtyWorkNotValidBadWord() {
       
        String word = "BadWord";
        StringValidator instance = new StringValidator();
        instance.addDirtyWord(word);
        
        // here should fail
        instance.addDirtyWord(word);

    }
}
