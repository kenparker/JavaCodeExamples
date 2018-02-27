package com.maggioni.StaticFactoryMethods.Client;

import com.maggioni.StaticFactoryMethods.RandonGeneratorsEntities.RandomGenerator;
import com.maggioni.StaticFactoryMethods.RandonGeneratorsEntities.RandomGenerators;

public class ClientDemo1 {

    public RandomGenerator<Integer> integerGenerator() {
        return RandomGenerators.getIntGenerator();
    }
}
