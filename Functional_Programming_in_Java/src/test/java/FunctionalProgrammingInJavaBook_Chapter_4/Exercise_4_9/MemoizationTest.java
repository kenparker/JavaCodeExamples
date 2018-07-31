package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_3.Tuple;
import org.junit.Test;

import java.math.BigInteger;
import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9.CollectionUtilities.iterate;
import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9.CollectionUtilities.mapWithFoldLeft;
import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9.Memoization.fiboCorecursive;
import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9.Memoization.fiboRecursive;

public class MemoizationTest {

    @Test
    public void testRecursive() {
        String fibo = fiboRecursive(10);
        System.out.println(fibo);
    }

    @Test
    public void testCorecursive() {
        String fibo = fiboCorecursive(10);
        System.out.println(fibo);
    }

    @Test
    public void testIteration1() {
        BigInteger seed = BigInteger.valueOf(5);
        BigInteger inc = BigInteger.valueOf(1);
        Function<BigInteger,BigInteger> f = x -> x.add(inc);

        List<BigInteger> list = iterate(seed, f, 5);
        System.out.println(list);
    }

    @Test
    public void testIteration2() {
        Tuple<BigInteger,BigInteger> seed = new Tuple<>(BigInteger.ZERO,BigInteger.ONE);
        Function<Tuple<BigInteger,BigInteger>,
                Tuple<BigInteger,BigInteger>> f = x -> new Tuple<>(x._2,x._1.add(x._2));

        List<Tuple<BigInteger, BigInteger>> list = iterate(seed, f, 10);

        List<BigInteger> list1 = mapWithFoldLeft(list, x -> x._1);
        System.out.println(list1);
    }
}