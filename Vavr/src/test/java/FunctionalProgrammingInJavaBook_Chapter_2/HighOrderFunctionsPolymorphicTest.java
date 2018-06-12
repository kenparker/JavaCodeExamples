package FunctionalProgrammingInJavaBook_Chapter_2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class HighOrderFunctionsPolymorphicTest {

    static <T, V, U> MyFunction<MyFunction<U, V>,
            MyFunction<
                    MyFunction<T, U>,
                    MyFunction<T, V>>> composePolymorphic() {
        return x -> y -> z -> x.apply(y.apply(z));
    };

    static <T, U, V> MyFunction<MyFunction<U, V>,
            MyFunction<
                    MyFunction<T, U>,
                    MyFunction<T, V>>> composePolymorphic2() {
        return (MyFunction<U, V> x) ->
                (MyFunction<T, U> y) -> (T z) ->
                        x.apply(y.apply(z));
    };

    static <T, U, V> MyFunction<MyFunction<V, T>,
            MyFunction<
                    MyFunction<U, V>,
                    MyFunction<U, T>>> composePolymorphic3() {
        return x -> y -> z -> x.apply(y.apply(z));
    };

    static <T, U, V> MyFunction<MyFunction<U, V>,
            MyFunction<
                    MyFunction<V, T>,
                    MyFunction<U, T>>> higherAndThen() {
        return y -> x -> z -> x.apply(y.apply(z));
    };

    MyFunction<Integer, Integer> triple = x -> x * 3;
    MyFunction<Integer, Integer> square = x -> x * x;

    @Test
    public void given_when_then1() {
        MyFunction<MyFunction<Integer, Integer>, MyFunction<Integer, Integer>> applyTriple = HighOrderFunctionsPolymorphicTest.
                <Integer, Integer, Integer>composePolymorphic()
                .apply(triple);

        Integer result = applyTriple.apply(square).apply(5);

        Integer result3 = HighOrderFunctionsPolymorphicTest.
                <Integer, Integer, Integer>composePolymorphic3().apply(triple).apply(square).apply(5);

        assertThat(result).isEqualTo(75);
        assertThat(result).isEqualTo(result3);
    }

    @Test
    public void given_when_then() {
        Integer compareResult = HighOrderFunctionsPolymorphicTest.
                <Integer, Integer, Integer>composePolymorphic3().apply(triple).apply(square).apply(5);

        Integer highResult = HighOrderFunctionsPolymorphicTest.
                <Integer, Integer, Integer>higherAndThen().apply(square).apply(triple).apply(5);

        assertThat(compareResult).isEqualTo(highResult);

    }
}
