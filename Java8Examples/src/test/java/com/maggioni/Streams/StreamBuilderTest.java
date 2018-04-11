package com.maggioni.Streams;

import com.maggioni.Lambdas.Employee;
import com.maggioni.Lambdas.PersonInterface;
import org.junit.Before;
import org.junit.Test;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StreamBuilderTest {
    protected Employee employeePaolo;
    protected Employee employeeMarco;

    protected Supplier<Employee> employeeSupplier;
    protected Supplier<Stream<Employee>> employeeStreamIterateSupplier;

    protected UnaryOperator<Employee> employeeUnaryOperator;

    @Before
    public void setUp() {
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
        employeeSupplier = () -> Employee.builder()
                .age(22)
                .gender(PersonInterface.Gender.FEMALE)
                .name("Ella")
                .build();
        employeeUnaryOperator = employee -> Employee.builder()
                .salary(employee.getSalary() + 1000)
                .age(employee.getAge().get() + 2)
                .gender(PersonInterface.Gender.FEMALE)
                .name("Ella " + employee.getAge().get())
                .build();
        employeeStreamIterateSupplier = () -> Stream.iterate(employeeMarco, employeeUnaryOperator).limit(20);
    }


    @Test
    public void testBuild() {
        Stream<Employee> stream = Stream.<Employee>builder()
                .add(employeePaolo)
                .add(employeeMarco)
                .build();
        assertEquals(2, stream.count());
    }

    @Test
    public void testGenerate() {
        Stream<Employee> limit = Stream.generate(employeeSupplier).limit(20);
        assertEquals(20, limit.count());
    }

    @Test
    public void testStreamIterate20Elements() {
        Stream<Employee> streamIterated = employeeStreamIterateSupplier.get();
        long countOfStreamElements = employeeStreamIterateSupplier.get().count();
        assertEquals(20,countOfStreamElements);
    }

    @Test
    public void testStreamIterateFirstAndFollowingElements() {

        Boolean isFirstMarco = employeeStreamIterateSupplier.get().findFirst().filter(employee ->
                                                                        employee.getName().filter(name -> name.equalsIgnoreCase("Marco"))
                                                                                            .isPresent())
                                                                      .isPresent();

        boolean isOthersElla = employeeStreamIterateSupplier.get()
                            .skip(1)
                            .allMatch(employee -> employee.getName()
                                                            .filter(name -> name.startsWith("Ella"))
                                                            .isPresent());

        assertTrue(isFirstMarco);
        assertTrue(isOthersElla);

    }


    /*
    https://stackoverflow.com/questions/36255007/is-there-any-way-to-reuse-a-stream-in-java-8
    https://www.mkyong.com/java8/java-stream-has-already-been-operated-upon-or-closed/
    https://gist.github.com/stavalfi/969539b245fd71f18ecd14f48eed2a5d
     */
}
