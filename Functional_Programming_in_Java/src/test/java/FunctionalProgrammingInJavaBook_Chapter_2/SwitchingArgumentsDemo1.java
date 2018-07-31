package FunctionalProgrammingInJavaBook_Chapter_2;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchingArgumentsDemo1 {

    static <T, U, V> MyFunction<T, MyFunction<U, V>> reverse(MyFunction<U, MyFunction<T, V>> f) {
        return t -> u -> f.apply(u).apply(t);
    }

    MyFunction<Double, MyFunction<Double, Double>> addTax = amount -> tax -> amount + amount / 100 * tax;

    MyFunction<Double, Double> add9percentTax;

    Double tax = 9.0;
    @Before
    public void setUp() throws Exception {
        add9percentTax = reverse(addTax).apply(tax);
    }

    @Test
    public void given_when_then() {
        Double price = 1200.2;
        Double expected = price + price / 100 * tax;
        Double result1 = add9percentTax.apply(price);
        Double result2 = addTax.apply(price).apply(tax);

        assertThat(result1).isEqualTo(expected);
        assertThat(result1).isEqualTo(result2);
    }
}
