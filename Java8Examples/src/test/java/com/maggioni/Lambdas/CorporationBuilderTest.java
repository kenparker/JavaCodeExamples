package com.maggioni.Lambdas;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Set;

public class CorporationBuilderTest extends DepartmentBuilderTest{

    protected Corporation corporation;

    @Before
    public void setUp() throws Exception {
        createDepartmentJavaDev();
        createDepartmentScalaDev();
        corporation = new CorporationBuilder()
                .addDepartment(departmentJava)
                .addDepartment(departmentScala)
                .build();
    }

    @Test
    public void testCorporation() {
        Manager[] managers = corporation.getDepartments().stream()
                .filter(department -> department.getEmployees().stream()
                        .map(Employee::getAge)
                        .anyMatch(age -> age.filter(a -> a>60).isPresent()))
                .map(Department::getManager)
                .toArray(Manager[]::new);
        Arrays.stream(managers)
                .forEach(System.out::println);
    }



}