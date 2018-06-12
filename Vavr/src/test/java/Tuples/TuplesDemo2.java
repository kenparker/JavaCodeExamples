package Tuples;

import com.maggioni.Lambdas.Employee;
import com.maggioni.Lambdas.Person;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

public class TuplesDemo2 extends TuplesDemo1 {

    Tuple2<Person, Employee> t2 = Tuple.of(personAngelo, employeeAngelo);

    @Test
    public void given_when_then() {

    }
}
