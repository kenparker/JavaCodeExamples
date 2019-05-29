import cyclops.data.Vector;
import cyclops.function.Monoid;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class VectorForEachMethodsTest {

    Vector<Integer> numbers = Vector.of(5, 2, 7, 10, 8);
    Function<Integer, Iterable<Integer>> resultVectorFromFunction = integer -> Vector.of(integer + 10);
    BiFunction<Integer, Integer, Integer> resultVectorFromBiFunction = (int1, int2) ->
    {
        System.out.println(int2 + " " + int1);
        return int2 - int1;
    };

    @Test
    public void given_Vector_then_ForEach_then_Result() {

        Consumer<Integer> consumer = integer -> System.out.println("number is : " +  integer);
        numbers.forEach(consumer);
    }
    @Test
    public void given_Vector_aFunction_and_aBiFunction_when_forEach2_then_VectorIsTransformedByFunctionAndBiFunction() {
        final Vector<Integer> result = numbers.forEach2(resultVectorFromFunction, resultVectorFromBiFunction);

        Vector<Integer> expected = Vector.fill(10,5);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void given_Vector_aFunction_aFilter_and_aBiFunction_when_forEach2_then_VectorIsTransformedByFunction_filtered_andThen_transformedByBiFunction() {
        BiFunction<Integer, Integer, Boolean> filter = (integer1, integer2) -> {
            Boolean res = integer1 + integer2  > 17;
            System.out.println(integer1 + " " + integer2 + " " + res);
        return res;};

        final Vector<Integer> result = numbers.forEach2(resultVectorFromFunction, filter, resultVectorFromBiFunction);

        Vector<Integer> expected = Vector.fill(10,4);
        assertThat(result).isEqualTo(expected);
    }
}
