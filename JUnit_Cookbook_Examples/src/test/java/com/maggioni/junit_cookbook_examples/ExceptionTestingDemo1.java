package com.maggioni.junit_cookbook_examples;

import java.util.ArrayList;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class ExceptionTestingDemo1 {

    @Test(expected = IndexOutOfBoundsException.class)
    public void exceptionHandlingWithAnnotation() {
        new ArrayList<Object>().get(0);
    }

    @Test
    public void exceptionHandlingWithTryAndCatch() {
        try {
            new ArrayList<Object>().get(0);
            fail("Expected and IndexOutOfBounds to be thrown");
        } catch (IndexOutOfBoundsException e) {
            assertThat(e.getMessage(), CoreMatchers.is("Index: 0, Size: 0"));
        }
    }

    @Rule
    public ExpectedException ex = ExpectedException.none();
    
    @Test
    public void exceptionHandlingWithRule() {
        ex.expect(IndexOutOfBoundsException.class);
        ex.expectMessage("Index: 0, Size: 0");
        new ArrayList<Object>().get(0);       
    }
}
