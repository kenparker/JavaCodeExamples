package com.maggioni.Optional.Demo1.Pattern;

import java.util.Optional;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OptionalTest {

    @Test
    public void filter_result_is_empty_Test() {

        Optional<Integer> optional = Optional.of(20);

        Optional<Integer> filter = optional.filter(a -> a < 10);
        assertEquals(Optional.empty(), filter);

    }

    @Test
    public void filter_result_is_empty_with_Map_Test() {

        Optional<Integer> optional = Optional.of(20);

        Optional<Integer> map = optional.filter(a -> a < 10)
                .map(a -> a + 1);
        Optional<Optional<Integer>> optionalOfMap = Optional.of(map);
        assertEquals(Optional.of(Optional.empty()), optionalOfMap);

        Optional<Integer> orElse = optionalOfMap.orElse(optional);
        assertEquals(Optional.empty(), orElse);

    }

    @Test
    public void filter_result_is_empty_With_Map_and_OptionalOf_Test() {

        Optional<Integer> optional = Optional.of(20);

        Optional<Optional<Integer>> optionalOfMap = optional.filter(a -> a < 10)
                .map(a -> Optional.of(a + 1));
        assertEquals(Optional.empty(), optionalOfMap);

        Optional<Integer> orElse = optionalOfMap.orElse(optional);
        assertEquals(optional, orElse);

    }

    @Test
    public void filter_result_is_empty_with_OrElse_Test() {

        Optional<Integer> optional = Optional.of(20);

        Optional<Integer> filter = optional.filter(a -> a < 10);
        assertEquals(Optional.empty(), filter);

        Integer orElse = filter.orElse(20);
        assertEquals((Integer) 20, orElse);

    }

    @Test
    public void orElse_Optional_is_not_empty_Test() {

        Optional<Integer> optional = Optional.of(15);

        Integer orElse = optional.orElse(555);
        assertEquals((Integer) 15, orElse);
    }
    
    @Test
    public void result_is_not_empty_with_orElse_Test() {

        Optional<Integer> currentValue = Optional.of(20);

        Optional<Integer> result = currentValue.filter(a -> a < 30)
                                            .map(a -> a+1);

        Integer orElse = result.orElse(555);
        assertEquals((Integer) 21, orElse);
    }
}
