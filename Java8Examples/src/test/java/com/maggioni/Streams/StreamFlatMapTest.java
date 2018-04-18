package com.maggioni.Streams;

import com.maggioni.Lambdas.CorporationBuilderTest;
import com.maggioni.Lambdas.Department;
import com.maggioni.Lambdas.Employee;
import org.junit.Test;

import java.util.Set;
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
                    return department.getEmployees().stream();
                })
                .forEach(System.out::println);
    }

    @Test
    public void testStreamAndStreamOf() {
        Set<Department> departments = corporation.getDepartments();

        Stream<Employee> employeeStream = departments.stream()
                .flatMap(department -> department.getEmployees().stream());

        Stream<Set<Employee>> setStream = departments.stream()
                .flatMap(department -> Stream.of(department.getEmployees()));
        Stream<Set<Employee>> setStream1 = departments.stream()
                .map(department -> department.getEmployees());

    }

    @Test
    public void testFlatMapCorporation1() {
        corporation.getDepartments().stream()
                .flatMap(department -> {
                    System.out.println("department : " + department.getName());
                    return Stream.of(department.getEmployees());
                })
                .flatMap(employee -> {
                    return employee.stream();
                })
                .forEach(System.out::println);
    }

    @Test
    public void testFlatMapCorporation2() {
        corporation.getDepartments().stream()
                .flatMap(department -> {
                    System.out.println("department :  " + department.getName());
                    return department.getEmployees().stream()
                            .flatMap(employee -> Stream.of(employee));
                })
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

    @Test
    public void testMapAndFlatrMap() {
        Stream<Stream<Employee>> streamStream = corporation.getDepartments().stream()
                .map(department -> department.getEmployees().stream());

        Stream<Employee> employeeStream = corporation.getDepartments().stream()
                .flatMap(department -> department.getEmployees().stream());
    }
}
