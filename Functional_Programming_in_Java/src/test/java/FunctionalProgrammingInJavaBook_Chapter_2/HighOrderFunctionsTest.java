package FunctionalProgrammingInJavaBook_Chapter_2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class HighOrderFunctionsTest {

    MyFunction<MyFunction<Integer, Integer>,
                                    MyFunction<MyFunction<Integer, Integer>,
                                                            MyFunction<Integer, Integer>>> composeTwoFunctions =
                                                                                    x -> y -> z -> x.apply(y.apply(z));

    MyFunction<Integer,
                                    MyFunction<MyFunction<Integer, Integer>,
                                            MyFunction<Integer,Integer>>> composeConstantFunction =
                                                                                    x -> y -> z -> x + y.apply(z);

    MyFunction<Integer, Integer> triple = x -> x * 3;
    MyFunction<Integer, Integer> square = x -> x * x;

    @Test
    public void givenTwoFunction_whenCompose_thenResult() {
        MyFunction<MyFunction<Integer, Integer>, MyFunction<Integer, Integer>> apply1 = composeTwoFunctions.apply(square);
        MyFunction<Integer, Integer> result = apply1.apply(triple);
        assertThat(result.apply(3)).isEqualTo(81);
    }

    @Test
    public void givenAConstantAndAFunction_whenCompose_thenResult() {
        MyFunction<MyFunction<Integer, Integer>, MyFunction<Integer, Integer>> apply10 = composeConstantFunction.apply(10);
        MyFunction<Integer, Integer> applyTriple = apply10.apply(triple);
        Integer result = applyTriple.apply(3);
        assertThat(result).isEqualTo(19);
    }
}
