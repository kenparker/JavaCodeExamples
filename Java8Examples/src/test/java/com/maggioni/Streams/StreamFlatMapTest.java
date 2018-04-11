package com.maggioni.Streams;

import com.maggioni.Lambdas.CorporationBuilderTest;
import com.maggioni.Lambdas.Department;
import com.maggioni.Lambdas.Employee;
import org.junit.Test;

import java.util.stream.Stream;

public class StreamFlatMapTest extends CorporationBuilderTest {

    @Test
    public void testCorporation() {
        corporation.getDepartments().forEach(System.out::println);
    }

    @Test
    public void testFlatMapForEach() {
        corporation.getDepartments().stream()
                .flatMap(department -> {
                    System.out.println("department : " + department.getName());
                    return department.getEmployees().stream();})
                .forEach(System.out::println);
    }

    @Test
    public void testFlatMap() {
        Stream<Employee> employeeStream = corporation.getDepartments().stream()
                .flatMap(department -> {
                    System.out.println("department : " + department.getName());
                    return department.getEmployees().stream();
                });
    }

    @Test
    public void testMapDepartment() {
        Stream<Department> departmentStream = corporation.getDepartments().stream()
                .map(department -> {
                    System.out.println("department : " + department.getName());
                    return department;
                });
    }

    @Test
    public void testFlatMapDepartment() {
        Stream<Department> departmentStream = corporation.getDepartments().stream()
                .flatMap(department -> {
                    System.out.println("department : " + department.getName());
                    return Stream.of(department);
                });
    }
}
