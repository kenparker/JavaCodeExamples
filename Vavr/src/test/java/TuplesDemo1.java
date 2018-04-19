
import com.maggioni.Lambdas.Employee;
import com.maggioni.Lambdas.Person;
import com.maggioni.Lambdas.PersonInterface;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.Tuple4;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
}
