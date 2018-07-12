package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_7;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static FunctionalProgrammingInJavaBook_Chapter_5.Common.List.list;
import static org.assertj.core.api.Assertions.*;

public class FoldRight {

    public static <A,B> B foldRight(List<A> list, B n, Function<A, Function<B,B>> f) {
        return list.isEmpty()
                ? n
                : f.apply(list.head()).apply(foldRight(list.tail(),n, f));
    }

    public static Integer sum(List<Integer> list) {
        return foldRight(list,0, x -> y -> x + y);
    }

    public static Double product(List<Double> list) {
        return foldRight(list,1.0,x -> y -> x * y);
    }

    @Test
    public void testSum() {
        List<Integer> list = list(3, 3, 2);
        Integer sum = sum(list);
        assertThat(sum).isEqualTo(8);
    }

    @Test
    public void testProduct() {
        List<Double> list = list(1.1, 4.6, 13.42);
        Double product = product(list);
        Double expected = 67.9052;
        assertThat(product).isEqualTo(expected);
    }

    @Test
    public void name() {
        List<Object> objectList = foldRight(list(3, 4, 6), list(), x -> y -> y.cons(x));
        System.out.println(objectList);
    }
}
