package com.maggioni.Streams;

import com.maggioni.Lambdas.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamReductionTest extends StreamBuilderTest {


    @Test
    public void testReduce() {
        Employee employee = streamIterateSupplier.get().reduce((a, b) -> Employee.builder()
                .age(22)
                .salary(11000)
                .name(a.getName().get() + b.getName().get())
                .build())
                .get();
        String expected = "MarcoElla 25Ella 27Ella 29Ella 31Ella 33Ella 35Ella 37Ella 39Ella 41Ella 43Ella 45Ella 47Ella 49Ella 51Ella 53Ella 55Ella 57Ella 59Ella 61";
        Assert.assertEquals(expected,employee.getName().get());
    }

    @Test
    public void testConvertingNameToList() {
        List<Optional<String>> optionalList = streamIterateSupplier.get()
                .map(employee -> employee.getName())
                .collect(Collectors.toList());
        System.out.println(optionalList);
    }

    @Test
    public void testConvertingAgeToList() {
        List<Optional<Integer>> collect = streamIterateSupplier.get()
                .map(employee -> employee.getAge())
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void testConvertingToString() {
        String collect = streamIterateSupplier.get()
                .map(employee -> employee.getName().get())
                .collect(Collectors.joining(",","{","}"));
        System.out.println(collect);
    }

    @Test
    public void testConvertingSalaryToSet() {
        Set<Integer> integerSet = streamIterateSupplier.get()
                .map(employee -> employee.getSalary())
                .collect(Collectors.toSet());
        System.out.println(integerSet);
    }
}
