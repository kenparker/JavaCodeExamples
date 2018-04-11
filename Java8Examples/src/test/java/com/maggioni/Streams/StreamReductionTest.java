package com.maggioni.Streams;

import com.maggioni.Lambdas.Employee;
import com.maggioni.Lambdas.Person;
import com.maggioni.Lambdas.PersonInterface;
import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StreamReductionTest extends StreamBuilderTest {


    @Test
    public void testListStream() {
        employeeStreamIterateSupplier.get()
                .forEach(System.out::println);
    }

    @Test
    public void testReduce() {
        Employee employee = employeeStreamIterateSupplier.get().reduce((a, b) -> Employee.builder()
                .age(22)
                .salary(11000)
                .name(a.getName().get() + b.getName().get())
                .build())
                .get();
        String expected = "MarcoElla 25Ella 27Ella 29Ella 31Ella 33Ella 35Ella 37Ella 39Ella 41Ella 43Ella 45Ella 47Ella 49Ella 51Ella 53Ella 55Ella 57Ella 59Ella 61";
        assertEquals(expected, employee.getName().get());
    }

    @Test
    public void testConvertingNameToList() {
        List<Optional<String>> optionalList = employeeStreamIterateSupplier.get()
                .map(employee -> employee.getName())
                .collect(Collectors.toList());
        System.out.println(optionalList);
    }

    @Test
    public void testConvertingAgeToList() {
        List<Optional<Integer>> collect = employeeStreamIterateSupplier.get()
                .map(employee -> employee.getAge())
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void testConvertingAgeToList2() {
        List<Optional<Integer>> collect = employeeStreamIterateSupplier.get()
                .map(Person::getAge)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void testConvertingToString() {
        String collect = employeeStreamIterateSupplier.get()
                .map(employee -> employee.getName().get())
                .collect(Collectors.joining(",", "{", "}"));
        System.out.println(collect);
    }

    @Test
    public void testConvertingToString2() {
        Stream<Optional<String>> optionalStream = employeeStreamIterateSupplier.get()
                .map(Person::getName);
        String collect = optionalStream.map(a -> a.get())
                .collect(Collectors.joining(",", "{", "}"));
        System.out.println(collect);
    }

    @Test
    public void testAveragingSalary() {
        Long count = employeeStreamIterateSupplier.get()
                .collect(Collectors.counting());
        IntSummaryStatistics sum = employeeStreamIterateSupplier.get()
                .collect(Collectors.summarizingInt(Employee::getSalary));
        Double average = employeeStreamIterateSupplier.get()
                .collect(Collectors.averagingInt(Employee::getSalary));
        System.out.println("count : " + count + " sum : " + sum + " average : " + average);
    }

    @Test
    public void testConvertingSalaryToSet() {
        Set<Integer> integerSet = employeeStreamIterateSupplier.get()
                .map(employee -> employee.getSalary())
                .collect(Collectors.toSet());
        System.out.println(integerSet);
    }

    @Test
    public void testConvertingStreamToSet() {
        Set<Employee> set = employeeStreamIterateSupplier.get()
                .collect(Collectors.toSet());
        set.forEach(System.out::println);
    }

    @Test
    public void testGroupingGender() {
        Map<Optional<PersonInterface.Gender>, List<Employee>> grouping = employeeStreamIterateSupplier.get()
                .collect(Collectors.groupingBy(Employee::getGender));
        assertEquals(2, grouping.size());
        assertEquals(19, grouping.get(Optional.of(PersonInterface.Gender.FEMALE)).size());
        assertEquals(1, grouping.get(Optional.of(PersonInterface.Gender.MALE)).size());
    }

    @Test
    public void testCollectingAndThen() {
        Set<Employee> collect = employeeStreamIterateSupplier.get()
                .collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
        collect.forEach(System.out::println);
    }

    @Test
    public void testCollecting() {
        Function<Set<Employee>, Set<Employee>> transformSet = set -> {
            Set<Employee> employeeSet = new HashSet<>();
            set.forEach(employee -> employeeSet.add(Employee.builder()
                    .salary(employee.getSalary())
                    .age(employee.getAge().get() + 100)
                    .name(employee.getName().get() + ".")
                    .gender(employee.getGender().get())
                    .build()));
            return employeeSet;
        };
        Set<Employee> setOfEmployees = employeeStreamIterateSupplier.get()
                .collect(Collectors.collectingAndThen(Collectors.toSet(), transformSet));
        setOfEmployees.forEach(System.out::println);
    }
}
