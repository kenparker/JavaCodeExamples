package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_3.Tuple;

import java.math.BigInteger;
import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9.CollectionUtilities.*;

public class MemoizationCorecursive {

    public static String fiboCorecursive(int number) {
        Tuple<BigInteger, BigInteger> seed = new Tuple<>(BigInteger.ZERO, BigInteger.ONE);
        Function<Tuple<BigInteger,BigInteger>,
                            Tuple<BigInteger,BigInteger>> f = x -> new Tuple<>(x._2,x._1.add(x._2));

        List<BigInteger> list = mapWithFoldLeft(iterate(seed, f, number + 1), x -> x._1);
        return MemoizationRecursive.makeString(list, ", ");
    }
}
