
import com.maggioni.Lambdas.Employee;
import com.maggioni.Lambdas.Person;
import com.maggioni.Lambdas.PersonInterface;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.Tuple3;
import io.vavr.Tuple4;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

import static org.junit.Assert.*;

public class TuplesDemo1 {

    Person personAngelo;
    Person personMarco;
    Employee employeeAngelo;
    Employee employeeNancy;

    @Before
    public void setUp() throws Exception {
        personAngelo = new Person.PersonBuilder().age(10).name("Angelo").gender(PersonInterface.Gender.MALE).build();
        personMarco = new Person.PersonBuilder().age(25).name("Marco").gender(PersonInterface.Gender.MALE).build();
        employeeAngelo = new Employee.EmployeeBuilder().salary(1525).name("Angelo").age(14).gender(PersonInterface.Gender.MALE).build();
        employeeNancy = new Employee.EmployeeBuilder().salary(5000).name("Nancy").age(50).gender(PersonInterface.Gender.FEMALE).build();
    }

    @Test
    public void tupleOfTwo() {
        Tuple2<String, Integer> tupleOfTwoElements = Tuple.of("Java", 23);
        System.out.println(tupleOfTwoElements._2);
        assertEquals(23,tupleOfTwoElements._2);
    }

    @Test
    public void tupleOfFour() {
        Tuple4<Person, Employee, Person, Employee> tupleOfFourElements = Tuple.of(personAngelo, employeeAngelo, personMarco, employeeNancy);
        assertEquals(personAngelo,tupleOfFourElements._1);
    }

    @Test
    public void tupleMapBifunction() {
        Tuple2<Employee,Employee> tupleMap = Tuple.of(employeeAngelo,employeeNancy);

        BiFunction<? super Employee, ? super Employee, Tuple2<Employee, Employee>> bifunction = ( e1, e2) -> Tuple.of(e2,e1);
        Tuple2<Employee, Employee> that2 = tupleMap.map(bifunction);
        assertEquals(employeeAngelo,that2._2);

        Tuple2<Employee, Employee> that1 = tupleMap.map(( e1, e2) -> Tuple.of(e2,e1));
        assertEquals(employeeNancy,that1._1);
    }

    @Test
    public void tupleMapFunction1() {
        Tuple3<Employee, Person, String> tuple3 = Tuple.of(employeeNancy, personAngelo, "The String is : ");

        Tuple3<Employee, Person, String> map = tuple3.map(employee -> employee, person -> person, s -> s.concat(employeeAngelo.getName().get()
                                                                                                        .concat(" e ")
                                                                                                        .concat(personMarco.getName().get())));
        System.out.println(map._3);
    }

    @Test
    public void tupleMapFunction2() {
        int expected = employeeAngelo.getSalary() + 2000;
        Tuple2<Employee, Person> tuple2Before = Tuple.of(employeeAngelo, personMarco);

        Function<Employee, Employee> fEmployee  = employee -> new Employee.EmployeeBuilder()
                                                                .name(employee.getName().get())
                                                                .salary(expected)
                                                                .age(employee.getAge().get())
                                                                .gender(employee.getGender().get())
                                                                .build();
        Function<Person, Person> fPerson = person -> new Person.PersonBuilder()
                                                            .name(person.getName().get())
                                                            .age(person.getAge().get())
                                                            .build();
        Tuple2<Employee, Person> tuple2After = tuple2Before.map(fEmployee, fPerson);

        assertEquals(expected,tuple2After._1.getSalary());

        assertSame(employeeAngelo,tuple2Before._1);
        assertSame(personMarco,tuple2Before._2);
        assertNotSame(employeeAngelo,tuple2After._1);
        assertNotSame(personMarco,tuple2After._2);
    }
}
