package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_6;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_3__4_4.Range.*;
import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_6.CollectionUtilities.*;
import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_6.ComposeAll.*;
import static org.assertj.core.api.Assertions.*;

public class ComposeAllTest {

    Consumer<List<Function<Integer, Integer>>> listConsumer = list -> {
        Function<Integer, Integer> integerIntegerFunction = composeAll(list);
        Integer result = integerIntegerFunction.apply(0);
        assertThat(result).isEqualTo(10000);
    };
    private List<Function<Integer, Integer>> list;
    private Function<Integer, Integer> add = y -> y + 2;

    @Test
    public void testWithImperativeRange() {
        list = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            list.add(x -> x + 2);
        }
        listConsumer.accept(list);
    }

    @Test
    public void testWithFunctionalRange() {
        list = mapWithFoldLeft(rangeSafe(0, 5000), x -> add);
        listConsumer.accept(list);
    }

    @Test
    public void testWithMoreThan5000Functions() {
        list = mapWithFoldLeft(rangeSafe(0, 10), x -> add);
        Integer resultLeft = composeAllUnlimitedWithFoldLeft(list).apply(0);
        Integer resultRight = composeAllUnlimitedWithFoldRight(list).apply(0);
        assertThat(resultLeft).isEqualTo(resultRight);
    }

    @Test
    public void testWithDifferentFunctions() {
        Function<String, String> f1 = x -> "(a" + x + ")";
        Function<String, String> f2 = x -> "(b" + x + ")";
        Function<String, String> f3 = x -> "(c" + x + ")";

        String stringLeft = composeAllUnlimitedWithFoldLeft(list(f1, f2, f3)).apply("x");
        String stringRight = composeAllUnlimitedWithFoldRight(list(f1, f2, f3)).apply("x");

        System.out.println(stringLeft + " " + stringRight);
        assertThat(stringLeft).isNotEqualTo(stringRight);
    }
}