package FunctionalProgrammingInJavaBook_Chapter_4.Listing_4_6_and_4_7;

import Entities.Cup;
import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_3.Tuple;
import io.vavr.collection.CharSeq;
import org.junit.Test;

public class MemoizationCupTest {

    private static <T, U> Tuple<T, U> createTuple(T p1, U p2) {
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException ignored) {
        }

        return new Tuple<>(p1, p2);
    }

    private static Function<Cup,
            Function<Cup, Tuple>> f = cup1 -> cup2 -> createTuple(cup1, cup2);
    private static Function<Cup,
            Function<Cup, Tuple>> g = Memoizer.memoize(cup1 -> Memoizer.memoize(f.apply(cup1)::apply));

    Cup cup1 = Cup.builder().field("Angelo").build();
    Cup cup2 = Cup.builder().field("Mario").build();
    Cup cup3 = Cup.builder().field("Barbara").build();

    @Test
    public void test1() {
        Tuple<Long, Tuple> tuple = calc.apply(g).apply(cup1).apply(cup2);
        System.out.println( tuple._1 + " " + tuple._2);

        tuple = calc.apply(g).apply(cup1).apply(cup2);
        System.out.println( tuple._1 + " " + tuple._2);

        tuple = calc.apply(g).apply(cup1).apply(cup3);
        System.out.println( tuple._1 + " " + tuple._2);
        tuple = calc.apply(g).apply(cup1).apply(cup3);
        System.out.println( tuple._1 + " " + tuple._2);
        tuple = calc.apply(g).apply(cup1).apply(cup2);
        System.out.println( tuple._1 + " " + tuple._2);

    }

    private static Function<Function<Cup,
                                        Function<Cup, Tuple>>,
                                                                Function<Cup,
                                                                            Function<Cup, Tuple<Long, Tuple>>>> calc = f -> cup1 -> cup2 -> {
        Long startTime = System.currentTimeMillis();

        Tuple tuple = f.apply(cup1).apply(cup2);

        Long duration = System.currentTimeMillis() - startTime;
        return new Tuple<>(duration, tuple);
    };
}
