package com.maggioni.Lambdas;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    Manager manager;

    @Test
    public void testcreate() {
        manager = new Manager.Builder().age(25).build();
    }
}