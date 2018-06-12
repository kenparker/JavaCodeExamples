package FunctionalProgrammingInJavaBook_Chapter_2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ConvertMethodOfSeveralArgumentsToCurriedFunction {

    static <A, B, C, D> String func(A a, B b, C c, D d) {
        return String.format("%s , %s , %s , %s", a, b, c, d);
    }

    static <A, B, C, D>  MyFunction<A,
                                            MyFunction<B,
                                                    MyFunction<C,
                                                                MyFunction<D, String>>>> funcCurried() {
                            return a -> b -> c -> d -> String.format("%s , %s , %s , %s", a, b, c, d);
    }

    @Test
    public void name() {
        MyFunction<Object, MyFunction<Object, MyFunction<Object, String>>> curriedA = funcCurried().apply(25);
        MyFunction<Object, MyFunction<Object, String>> curriedAuB = curriedA.apply("Hello");
        String result = curriedAuB.apply("F").apply(35);

        assertThat(result).isEqualTo("25 , Hello , F , 35");
    }
}
