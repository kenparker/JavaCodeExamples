package TryAnOptionalMonads.c_Demos;

import TryAnOptionalMonads.a_Entities.Address;
import TryAnOptionalMonads.a_Entities.City;
import TryAnOptionalMonads.a_Entities.Person;
import io.vavr.CheckedFunction2;
import io.vavr.Function2;
import io.vavr.control.Option;
import io.vavr.control.Try;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.function.Consumer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.ThrowableAssert.*;


public class TryDemo1 extends CommonItems implements CommonConstants {

    Function2<HashMap<String, Person>, String, City> imperativIfThenElseThrowCode = (personMap, nameMarco) -> {
        Person person = personMap.get(nameMarco);
        if (person != null) {
            Address address = person.getAddress();
            if (address != null) {
                City city = address.getCity();
                if (city != null) {
                    return city;
                } else {
                    throw new IllegalStateException(ADDRESS_HAS_NO_CITY);
                }
            } else {
                throw new IllegalStateException(PERSON_HAS_NO_ADRESS);
            }
        } else {
            throw new IllegalStateException(NAME_NOT_FOUND_IN_MAP);
        }
    };

    Function2<Map<String, Person>, String, City> functionalIfThenElseThrowCode = (map, name) ->
            map.find(name)
                    .getOrElseThrow(throwable -> {
                        throw new IllegalStateException(throwable);
                    })
                    .getAdressTry()
                    .getOrElseThrow(throwable -> {
                        throw new IllegalStateException(throwable);
                    })
                    .getCityTry()
                    .getOrElseThrow(throwable -> {
                        throw new IllegalStateException(throwable);
                    });

    Map<String, Person> personMapFunctional = new Map();

    public static class Map<T, U> extends HashMap<T, U> {
        public Try<U> find(T t) {
            U value = super.get(t);
            if (value == null) {
                return Try.failure(new IllegalStateException(NAME_NOT_FOUND_IN_MAP));
            } else {
                return Try.success(value);
            }
        }
    }

    private ThrowingCallable throwable;

    @Override
    @Before
    public void setUp() {
        super.setUp();
        personMapFunctional.put(nameMarco, person1);
        personMapFunctional.put(namePaolo, person2);
        personMapFunctional.put(nameDaniela, person3);

    }

    Consumer<ThrowingCallable> assertErrorAddress_no_city = throwingCallable -> assertThatCode(throwingCallable)
            .isInstanceOf(IllegalStateException.class)
            .hasMessageContaining(ADDRESS_HAS_NO_CITY);

    Consumer<ThrowingCallable> assertErrorPerson_no_address = throwingCallable -> assertThatCode(throwingCallable)
            .isInstanceOf(IllegalStateException.class)
            .hasMessageContaining(PERSON_HAS_NO_ADRESS);

    Consumer<ThrowingCallable> assertErrorName_not_found = throwingCallable -> assertThatCode(throwingCallable)
            .isInstanceOf(IllegalStateException.class)
            .hasMessageContaining(NAME_NOT_FOUND_IN_MAP);

    @Test
    public void givenAPersonWithNoCity_thenIllegalStateException() {
        throwable = () -> imperativIfThenElseThrowCode.apply(personMap, nameMarco);
        assertErrorAddress_no_city.accept(throwable);

        throwable = () -> functionalIfThenElseThrowCode.apply(personMapFunctional, nameMarco);
        assertErrorAddress_no_city.accept(throwable);
    }

    @Test
    public void givenAPersonWithNoAddress_thenIllegalStateException() {
        throwable = () -> imperativIfThenElseThrowCode.apply(personMap, namePaolo);
        assertErrorPerson_no_address.accept(throwable);

        throwable = () -> functionalIfThenElseThrowCode.apply(personMapFunctional, namePaolo);
        assertErrorPerson_no_address.accept(throwable);
    }

    @Test
    public void givenAPersonNameThatDoesNotExist_thenIllegalStateException() {
        throwable = () -> imperativIfThenElseThrowCode.apply(personMap, "Dummy");
        assertErrorName_not_found.accept(throwable);

        throwable = () -> functionalIfThenElseThrowCode.apply(personMapFunctional, "Dummy");
        assertErrorName_not_found.accept(throwable);
    }

    @Test
    public void givenAPersonOK_thenNOIllegalStateException() {
        ThrowingCallable throwable = () -> imperativIfThenElseThrowCode.apply(personMap, nameDaniela);
        assertThatCode(throwable)
                .doesNotThrowAnyException();
    }

    @Test
    public void givenANonExistingPerson_thenIsFailure() {
        boolean dummy = personMapFunctional.find("Dummy")
                .isFailure();
        assertThat(dummy).isTrue();
    }

    @Test
    public void given_thenIsSuccess() {
        boolean dummy = personMapFunctional.find(nameMarco)
                .isSuccess();
        assertThat(dummy).isTrue();
    }

    @Test
    public void givenAnEmptyAddress_thenIsFailure() {
        assertThat(personMapFunctional.find(namePaolo)
                .flatMap(person -> person.getAdressTry())
                .isFailure()).isTrue();
    }

}
