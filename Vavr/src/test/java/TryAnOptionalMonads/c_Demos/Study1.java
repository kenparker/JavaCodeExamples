package TryAnOptionalMonads.c_Demos;

import TryAnOptionalMonads.a_Entities.Address;
import TryAnOptionalMonads.a_Entities.Person;
import TryAnOptionalMonads.c_Demos.CommonItems;
import io.vavr.CheckedFunction1;
import io.vavr.CheckedFunction2;
import io.vavr.Function1;
import io.vavr.Function2;
import org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class Study1 extends CommonItems {


    CheckedFunction1<Person, Person> cfWithThrow = (person) -> getPersonWithThrow(person);
    CheckedFunction1<Person, Person> cfStandard = (person) -> getPerson(person);

    Function1<Person, Person> fWithThrow = (person) -> getPersonWithThrow(person);
    Function1<Person, Person> fStandard = (person) -> getPerson(person);

    private Person getPersonWithThrow(Person person) throws IllegalStateException {
        if (person.getAddress() == null) throw new IllegalStateException();
        return person;
    }

    private Person getPerson(Person person) {
        if (person.getAddress() != null)
            return person;
        else return null;
    }

    @Test
    public void test1() {
        try {
            cfStandard.apply(person1);
            cfWithThrow.apply(person1);
        } catch (Throwable throwable) {
            //
        }
    }

    @Test
    public void test2() {
        Person apply = fStandard.apply(person1);
        System.out.println(apply);
        apply = fStandard.apply(person2);
        System.out.println(apply);

        apply = fWithThrow.apply(person1);
        System.out.println(apply);
        /*
        apply = fWithThrow.apply(person2); // java.lang.IllegalStateException
        System.out.println(apply);
        */

        System.out.println(cfWithThrow.unchecked().apply(person2));
    }

    /*


     R apply(T1 var1, T2 var2) throws Throwable; (CheckedFunction2)
     R apply(T1 var1, T2 var2); (Function2)

    static <T1, T2, R> Function2<T1, T2, Option<R>> lift(CheckedFunction2<? super T1, ? super T2, ? extends R> partialFunction) {
        return (t1, t2) -> {
            return Try.of(() -> {
                return partialFunction.apply(t1, t2);
            }).toOption();
        };
    }

    static <T> Try<T> of(CheckedFunction0<? extends T> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");

        try {
            return new Try.Success(supplier.apply());
        } catch (Throwable var2) {
            return new Try.Failure(var2);
        }
    }

    default Function2<T1, T2, R> unchecked() {
        return (t1, t2) -> {
            try {
                return this.apply(t1, t2);
            } catch (Throwable var4) {
                return CheckedFunction2Module.sneakyThrow(var4);
            }
        };
    }
    */
}

