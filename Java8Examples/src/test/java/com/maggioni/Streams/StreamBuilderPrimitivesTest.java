package com.maggioni.Streams;

import org.junit.Before;
import org.junit.Test;

import java.util.function.Supplier;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class StreamBuilderPrimitivesTest {

    Supplier<IntStream> intStreamSupplier;

    @Before
    public void setUp() throws Exception {
        intStreamSupplier = () -> IntStream.rangeClosed(10, 20);
    }

    @Test
    public void intStreamStatsTest() {
        IntStream intStream = IntStream.empty();
        intStream = intStreamSupplier.get();
        assertEquals(11,intStream.count());
        intStream = intStreamSupplier.get();
        assertEquals(10,intStream.min().getAsInt());
    }
}
