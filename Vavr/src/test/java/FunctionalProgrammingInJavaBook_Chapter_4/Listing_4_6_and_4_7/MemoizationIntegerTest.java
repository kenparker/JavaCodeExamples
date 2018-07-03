package FunctionalProgrammingInJavaBook_Chapter_4.Listing_4_6_and_4_7;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;

import FunctionalProgrammingInJavaBook_Chapter_3.Tuple;
import org.junit.Test;

public class MemoizationIntegerTest {

    private static Integer longCalculation(Integer x) {
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException ignored) {
        }

        return x * 3;
    }

    private static Function<Integer, Integer> f = MemoizationIntegerTest::longCalculation;
    private static Function<Integer, Integer> g = Memoizer.memoize(f);


    private static Function<Function<Integer, Integer>,
                        Function<Integer,
                                        Tuple<Long, Integer>>> calc = f -> integer -> {
        Long startTime = System.currentTimeMillis();

        Integer result = f.apply(integer);

        Long duration = System.currentTimeMillis() - startTime;
        return new Tuple<>(duration, result);
    };

    @Test
    public void test1() {
        Integer arg = 20;
        Tuple<Long, Integer> tuple = calc.apply(g).apply(arg);
        System.out.println(tuple._1 + " " + tuple._2);

        tuple = calc.apply(g).apply(arg);
        System.out.println(tuple._1 + " " + tuple._2);
        tuple = calc.apply(g).apply(25);
        System.out.println(tuple._1 + " " + tuple._2);
        tuple = calc.apply(g).apply(arg);
        System.out.println(tuple._1 + " " + tuple._2);
        /*
        1014 60
        0 60
        1014 75
        0 60
         */
    }
}
