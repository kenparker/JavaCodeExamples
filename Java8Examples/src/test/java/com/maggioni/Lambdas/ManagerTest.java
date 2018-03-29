package com.maggioni.Lambdas;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    Manager manager;

    @Test
    public void testcreate() {
        manager = new Manager.ManagerBuilder().age(25).build();
        manager = new Manager.ManagerBuilder().age(25).salary(2222).build();
        manager = new Manager.ManagerBuilder().salary(15).build();
        manager = new Manager.ManagerBuilder().salary(15).name("dd").build();

        Manager.builder().age(25).build();
    }
}