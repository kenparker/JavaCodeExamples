package com.maggioni.Lambdas;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void name() {
        new Employee.Builder().salary(1525).name("Angelo").age(14).gender(PersonInterface.Gender.MALE).build();
        new Employee.Builder().name("Angelo").age(14).gender(PersonInterface.Gender.MALE).salary(100).build();
    }
}