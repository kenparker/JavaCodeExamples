package com.maggioni.Streams;

import com.maggioni.Streams.StreamBuilderTest;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StreamProcessOrderTest extends StreamBuilderTest {


    @Test
    public void testListOfAllElements() {
        employeeStreamIterateSupplier.get()
                .forEach(System.out::println);
    }

    @Test
    public void testProcessOrderWithFilterAfter() {
        employeeStreamIterateSupplier.get()
                .map(employee -> {
                    System.out.println(" Map :  " +  employee.getName().get());
                    return employee;
                })
                .filter(employee -> {
                    System.out.println(" filter : " + employee.getName().get());
                    return employee.getName().filter(name -> name.startsWith("Ella")).isPresent();
                })
                .forEach(employee -> System.out.println(" forEach : " + employee.getName().get()));
    }

    @Test
    public void testProcessOrderWithFilterBefore() {
        employeeStreamIterateSupplier.get()
                .filter(employee -> {
                    System.out.println(" filter : " + employee.getName().get());
                    return employee.getName().filter(name -> name.startsWith("Ella")).isPresent();
                })
                .map(employee -> {
                    System.out.println(" Map :  " +  employee.getName().get());
                    return employee;
                })
                .forEach(employee -> System.out.println(" forEach : " + employee.getName().get()));
    }

    @Test
    public void testAnyMathProcessOrder() {
        boolean anyMatch = employeeStreamIterateSupplier.get()
                .map(employee -> {
                    System.out.println("Map : " + employee.getSalary());
                    return employee.getSalary();
                })
                .anyMatch(salary -> {
                    System.out.println("allMatch : " + salary);
                    return salary > 5000;
                });
        assertTrue(anyMatch);
    }

    @Test
    public void testAllMathProcessOrder() {
        boolean allMatch = employeeStreamIterateSupplier.get()
                .map(employee -> {
                    System.out.println("Map : " + employee.getSalary());
                    return employee.getSalary();
                })
                .allMatch(salary -> {
                    System.out.println("noneMatch : " + salary);
                    return salary > 5000;
                });
        assertFalse(allMatch);
    }

    @Test
    public void testNoneMathProcessOrder() {
        boolean noneMatch = employeeStreamIterateSupplier.get()
                .map(employee -> {
                    System.out.println("Map : " + employee.getSalary());
                    return employee.getSalary();
                })
                .noneMatch(salary -> {
                    System.out.println("anyMatch : " + salary);
                    return salary > 5000;
                });
        assertFalse(noneMatch);
    }
}
