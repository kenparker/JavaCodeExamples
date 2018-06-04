package Lifting;

import io.vavr.Function2;
import io.vavr.control.Option;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LiftingDemo2 {

    private Integer sum(Integer a, Integer b) {
        if (a < 0 || b < 0) throw new IllegalArgumentException("Only Positive numbers allowed");
        return a + b;
    }

    Function2<Integer, Integer, Integer> sumf = this::sum;


    @Test
    public void givenOneNegativeValue_thenResultIsNone() {
        Integer a = -2;
        Integer b = 1;

        Option<Integer> sumResult = Function2.lift(sumf).apply(a, b);
        assertThat(sumResult).isInstanceOf(Option.None.class);
    }
}
