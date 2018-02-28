package com.maggioni.StaticFactoryMethods.JoshuaBloch.Client;

import com.maggioni.StaticFactoryMethods.JoshuaBloch.RandonGeneratorsEntities.RandomGenerator;
import com.maggioni.StaticFactoryMethods.JoshuaBloch.RandonGeneratorsEntities.RandomGenerators;

public class ClientStaticFactoryDemo1 {

    public RandomGenerator<Integer> integerGenerator() {
        return RandomGenerators.getIntGenerator();
    }

    public RandomGenerator<String> stringGenerator() {
        return RandomGenerators.getStringGenerator();
    }
}
