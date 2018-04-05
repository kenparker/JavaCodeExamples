package com.maggioni.Lambdas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EmployeeTest {

    Employee employee;
    @Test
    public void testCreate() {
        employee = new Employee.EmployeeBuilder().salary(1525).name("Angelo").age(14).gender(PersonInterface.Gender.MALE).build();
        employee = new Employee.EmployeeBuilder().name("Angelo").age(14).gender(PersonInterface.Gender.MALE).salary(100).build();

        employee = Employee.builder().salary(1525).name("ww").age(33).gender(PersonInterface.Gender.MALE).build();
        employee = Employee.builder().name("ww").age(33).salary(2222).gender(PersonInterface.Gender.MALE).build();

        employee = Employee.builder().salary(1525).name("ww").build();
    }

    @Test
    public void streamTest() {
        List<Employee> employeeList = new ArrayList<>();
        EmployeeFunctions.streamAges.apply(employeeList);
    }
}