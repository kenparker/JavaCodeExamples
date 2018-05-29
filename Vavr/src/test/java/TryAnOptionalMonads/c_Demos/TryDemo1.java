package TryAnOptionalMonads.c_Demos;

import TryAnOptionalMonads.a_Entities.Address;
import TryAnOptionalMonads.a_Entities.City;
import TryAnOptionalMonads.a_Entities.Person;
import io.vavr.CheckedFunction2;
import io.vavr.Function1;
import io.vavr.Function2;
import io.vavr.control.Option;
import io.vavr.control.Try;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

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
                    throw new IllegalStateException(ADDRESS_AS_NO_CITY);
                }
            } else {
                throw new IllegalStateException(PERSON_HAS_NO_ADRESS);
            }
        } else {
            throw new IllegalStateException(NAME_NOT_FOUND_IN_MAP);
        }
    };


    Function2<MapTry<String, Person>, String, City> functionalIfThenElseThrowCode = (Function2<MapTry<String, Person>, String, City>) (mapTry, name) -> mapTry.find(name)
            .getOrElseThrow(throwable -> {
                throw new RuntimeException(throwable);
            })
            .getAdressTry()
            .getOrElseThrow(throwable -> {
                throw new RuntimeException(throwable);
            })
            .getCityTry()
            .getOrElseThrow(throwable -> {
                throw new RuntimeException(throwable);
            });

    MapTry<String, Person> mapTry = new MapTry();

    public static class MapTry<T, U> extends HashMap<T, U> {
        public Try<U> find(T t) {
            U value = super.get(t);
            if (value == null) {
                return Try.failure(new IllegalStateException(NAME_NOT_FOUND_IN_MAP));
            } else {
                return Try.success(value);
            }
        }
    }

    @Override
    @Before
    public void setUp() {
        super.setUp();
        mapTry.put(nameMarco, person1);
        mapTry.put(namePaolo, person2);
        mapTry.put(nameDaniela, person3);

    }

    @Test
    public void givenAPersonWithNoCity_thenIllegalStateException() {
        ThrowingCallable throwable = () -> imperativIfThenElseThrowCode.apply(personMap, nameMarco);
        assertThatCode(throwable)
                .isInstanceOf(IllegalStateException.class)
                .hasMessage(ADDRESS_AS_NO_CITY);
    }

    @Test
    public void givenAPersonWithNoAdress_thenIllegalStateException() {
        ThrowingCallable throwable = () -> imperativIfThenElseThrowCode.apply(personMap, namePaolo);
        assertThatCode(throwable)
                .isInstanceOf(IllegalStateException.class)
                .hasMessage(PERSON_HAS_NO_ADRESS);
    }

    @Test
    public void givenAPersonNameThatDoesNotExist_thenIllegalStateException() {
        ThrowingCallable throwable = () -> imperativIfThenElseThrowCode.apply(personMap, "Dummy");
        assertThatCode(throwable)
                .isInstanceOf(IllegalStateException.class)
                .hasMessage(NAME_NOT_FOUND_IN_MAP);
    }

    @Test
    public void givenAPersonOK_thenNOIllegalStateException() {
        ThrowingCallable throwable = () -> imperativIfThenElseThrowCode.apply(personMap, nameDaniela);
        assertThatCode(throwable)
                .doesNotThrowAnyException();
    }

    @Test
    public void givenANonExistingPerson_thenIsFailure() {
        boolean dummy = mapTry.find("Dummy")
                .isFailure();
        assertThat(dummy).isTrue();
    }

    @Test
    public void given_thenIsSuccess() {
        boolean dummy = mapTry.find(nameMarco)
                .isSuccess();
        assertThat(dummy).isTrue();
    }

    @Test
    public void givenAnEmptyAdress_thenIsFailure() {
        assertThat(mapTry.find(namePaolo)
                .flatMap(person -> person.getAdressTry())
                .isFailure()).isTrue();
    }

    @Test
    public void givenANonExistingPerson_thenThrow() {
        ThrowingCallable throwingCallable = () -> functionalIfThenElseThrowCode.apply(mapTry, "Dummy");
        assertThatCode(throwingCallable)
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining(NAME_NOT_FOUND_IN_MAP);
    }

    @Test
    public void givenAnEmptyAdress_thenThrow() {
        ThrowingCallable throwingCallable = () -> functionalIfThenElseThrowCode.apply(mapTry, namePaolo);
        assertThatCode(throwingCallable)
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining(PERSON_HAS_NO_ADRESS);
    }


    @Test
    public void givenAnEmptyCity_thenThrow() {
        ThrowingCallable throwingCallable = () -> functionalIfThenElseThrowCode.apply(mapTry, nameMarco);
        assertThatCode(throwingCallable)
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining(ADDRESS_AS_NO_CITY);
    }

    @Test
    public void name() {
        CheckedFunction2<MapTry<String, Person>, String, City> checkedFunction2 = (map,name) -> map.find(name)
                .flatMap(person -> person.getAdressTry())
                .flatMap(address -> address.getCityTry())
                .get();
        Function2<MapTry<String, Person>, String, City> dddd = (mapTry, name) -> mapTry.find(name)
                .flatMap(person -> person.getAdressTry())
                .flatMap(address -> address.getCityTry())
                .get();
        //City city = dddd.apply(mapTry, namePaolo);
        Function2<MapTry<String, Person>, String, Option<City>> lift = CheckedFunction2.lift(checkedFunction2);
        Option<City> apply = lift.apply(mapTry, "fff");
        System.out.println(apply);
    }
}
