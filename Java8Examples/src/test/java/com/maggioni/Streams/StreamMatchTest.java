package com.maggioni.Streams;

import com.maggioni.Streams.StreamBuilderTest;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StreamMatchTest extends StreamBuilderTest{

    @Test
    public void testAnyMatch() {
        boolean anyMatch = employeeStreamIterateSupplier.get()
                .anyMatch(employee -> employee.getSalary() > 7500);
        assertTrue(anyMatch);
    }

}
