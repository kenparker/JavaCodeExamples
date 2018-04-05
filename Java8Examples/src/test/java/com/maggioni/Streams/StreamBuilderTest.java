package com.maggioni.Streams;

import com.maggioni.Lambdas.Employee;
import com.maggioni.Lambdas.EmployeeTest;
import com.maggioni.Lambdas.PersonInterface;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StreamBuilderTest {
    private Employee employeePaolo;
    private Employee employeeMarco;

    private Supplier<Employee> employeeSupplier = () -> Employee.builder()
                                                        .age(22)
                                                        .gender(PersonInterface.Gender.FEMALE)
                                                        .name("Ella")
                                                        .build();

    private UnaryOperator<Employee> employeeUnaryOperator = employee -> Employee.builder()
                                                                        .age(employee.getAge().get() + 2)
                                                                        .gender(PersonInterface.Gender.FEMALE)
                                                                        .name("Ella " + employee.getAge().get())
                                                                        .build();

    @Before
    public void setUp() throws Exception {
        employeeMarco = Employee.builder()
                .salary(2500)
                .age(25)
                .gender(PersonInterface.Gender.MALE)
                .name("Marco")
                .build();
        employeePaolo = Employee.builder()
                .name("Paolo")
                .salary(25000)
                .gender(PersonInterface.Gender.MALE)
                .age(11)
                .build();
    }

    @Test
    public void testBuild() {
        Stream<Employee> stream = Stream.<Employee>builder()
                .add(employeePaolo)
                .add(employeeMarco)
                .build();
        assertEquals(2,stream.count());
    }

    @Test
    public void testGenerate() {
        Stream<Employee> limit = Stream.generate(employeeSupplier).limit(20);
        assertEquals(20,limit.count());
    }

    @Test
    public void testIterate() {
        Stream<Employee> streamIterated = Stream.iterate(employeeMarco, employeeUnaryOperator).limit(20);
         Boolean isMarco = streamIterated.findFirst().filter(employee ->
                employee.getName().filter(name -> name.equalsIgnoreCase("Marco"))
                        .isPresent())
                        .isPresent();
        assertTrue(isMarco);
        streamIterated.forEach(System.out::println);
    }

    /*
    https://stackoverflow.com/questions/36255007/is-there-any-way-to-reuse-a-stream-in-java-8
    https://www.mkyong.com/java8/java-stream-has-already-been-operated-upon-or-closed/
     */
}
