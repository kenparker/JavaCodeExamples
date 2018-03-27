package com.maggioni.BuilderPatternInheritance.demo3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThaiPizzaTest {

    NyPizza nyPizza;
    ThaiPizza thaiPizza;

    @Test
    public void test1() {
        thaiPizza = new ThaiPizza.Builder()
                .setSomeFieldThai("dd")
                .setSomeFieldNyPizza("ss")
                .build();
    }

    @Test
    public void test2() {
        thaiPizza = new ThaiPizza.Builder()
                .setSomeFieldNyPizza("ss")
                .setSomeFieldThai("ddd")
                .build();
    }

    @Test
    public void test3() {
        nyPizza = new NyPizza.Builder()
                .setSomeFieldNyPizza("ff")
                .build();
    }
}