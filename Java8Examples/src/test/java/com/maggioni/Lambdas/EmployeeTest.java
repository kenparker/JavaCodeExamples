package com.maggioni.Lambdas;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    Employee employee;
    @Test
    public void testCreate() {
        employee = new Employee.EmployeeBuilder().salary(1525).name("Angelo").age(14).gender(PersonInterface.Gender.MALE).build();
        employee = new Employee.EmployeeBuilder().name("Angelo").age(14).gender(PersonInterface.Gender.MALE).salary(100).build();
    }
}