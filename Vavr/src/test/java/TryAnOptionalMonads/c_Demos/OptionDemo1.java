package TryAnOptionalMonads.c_Demos;

import TryAnOptionalMonads.a_Entities.Address;
import TryAnOptionalMonads.a_Entities.City;
import TryAnOptionalMonads.a_Entities.Person;
import io.vavr.control.Option;
import org.junit.Before;
import org.junit.Test;

public class OptionDemo1 extends CommonItems {

    @Test
    public void givenAPersonMap_whenCheckNullObjectJava7_thenShouldCityMailand() {
        for (String name : personMap.keySet()) {
            Person person = personMap.get(name);
            if (person != null) {
                Address address = person.getAddress();
                if (address != null) {
                    City city = address.getCity();
                    if (city != null) {
                        assertCity.accept(city, cityMailand);
                    }
                }
            }
        }
    }

    @Test
    public void givenAPersonMap_whenCheckNullObjectWithOptionJava7Style_thenShouldCityMailand() {
        for (String name : personMapJava7.keySet()) {
            Option<Person> person = personMapJava7.get(name);
            if (person.isDefined()) {
                Option<Address> address = person.get().getAdressOption();
                if (address.isDefined()) {
                    Option<City> city = address.get().getCityOption();
                    if (city.isDefined()) {
                        assertCity.accept(city.get(), cityMailand);
                    }
                }
            }
        }
    }


    @Test
    public void givenAPersonMap_whenCheckNullObjectWithOptionJava8Style_thenShouldCityMailand() {
        for (String name : personMapJava8.keySet()) {
            personMapJava8.find(name)
                    .flatMap(Person::getAdressOption)
                    .flatMap(Address::getCityOption)
                    .forEach((city) -> assertCity.accept(city, cityMailand));
        }
    }
}

