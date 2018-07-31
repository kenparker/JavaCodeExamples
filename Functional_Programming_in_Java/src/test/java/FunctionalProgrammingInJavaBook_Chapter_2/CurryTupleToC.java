package FunctionalProgrammingInJavaBook_Chapter_2;

import io.vavr.Tuple2;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CurryTupleToC {

    <A, B, C> MyFunction<A, MyFunction<B, C>> curry1(MyFunction<Tuple2<A, B>, C> f) {
        return a -> b -> f.apply(new Tuple2<>(a, b));
    }

    <A, B, C> MyFunction<A, MyFunction<B, C>> curry2(MyFunction<Tuple2<A, B>, C> f) {
        return new MyFunction<A, MyFunction<B, C>>() {
            @Override
            public MyFunction<B, C> apply(A a) {
                return new MyFunction<B, C>() {
                    @Override
                    public C apply(B b) {
                        return f.apply(new Tuple2<>(a, b));
                    }
                };
            }
        };
    }

    MyFunction<Tuple2<Integer, Double>, Double> f = x -> x._1 * (1 + x._2 / 100);

    @Test
    public void given_when_then() {
        MyFunction<Integer, MyFunction<Double, Double>> g = curry2(f);

        Integer a = 3; Double b = 2.1;
        assertThat(g.apply(a).apply(b)).isEqualTo(f.apply(new Tuple2<>(a, b)));

        a = 11; b = 23.1;
        assertThat(g.apply(a).apply(b)).isEqualTo(f.apply(new Tuple2<>(a, b)));
    }
}
