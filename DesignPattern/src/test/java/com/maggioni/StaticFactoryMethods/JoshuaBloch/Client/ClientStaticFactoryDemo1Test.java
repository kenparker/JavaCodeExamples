package com.maggioni.StaticFactoryMethods.JoshuaBloch.Client;

import com.maggioni.StaticFactoryMethods.JoshuaBloch.RandonGeneratorsEntities.RandomGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientStaticFactoryDemo1Test {

    ClientStaticFactoryDemo1 clientStaticFactoryDemo1 = new ClientStaticFactoryDemo1();

    @Test
    public void testIntegerGenerator() {
        RandomGenerator<Integer> integerRandomGenerator = clientStaticFactoryDemo1.integerGenerator();
        assertTrue(integerRandomGenerator.next().isPresent());
    }

    @Test
    public void testStringGenerator() {
        RandomGenerator<String> stringRandomGenerator = clientStaticFactoryDemo1.stringGenerator();
        assertTrue(stringRandomGenerator.next().isPresent());
    }

}