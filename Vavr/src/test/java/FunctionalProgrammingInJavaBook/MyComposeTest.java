package FunctionalProgrammingInJavaBook;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MyComposeTest {


    @Test
    public void compose() {

        MyFunction<Integer, Integer> triple = new MyFunction<Integer, Integer>() {
            @Override
            public Integer apply(Integer arg) {
                return arg * 3;
            }
        };

        MyFunction<Integer, Integer> square = new MyFunction<Integer, Integer>() {
            @Override
            public Integer apply(Integer arg) {
                return arg * arg;
            }
        };

        Integer resultAnonymus = MyFunction.composeAnonymus(triple, square).apply(5);
        Integer resultLambdas = MyFunction.composeLambdas(triple, square).apply(5);

        assertThat(resultAnonymus)
                .isEqualTo(resultLambdas);
        assertThat(resultAnonymus)
                .isEqualTo(75);
    }
}