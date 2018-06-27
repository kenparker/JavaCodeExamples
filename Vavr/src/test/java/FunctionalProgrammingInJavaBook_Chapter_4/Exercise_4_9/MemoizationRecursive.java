package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9;

import FunctionalProgrammingInJavaBook_Chapter_4.Listung_4_2.TailCall;

import java.math.BigInteger;
import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9.CollectionUtilities.*;
import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9.CollectionUtilities.append;
import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9.CollectionUtilities.head;
import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9.CollectionUtilities.list;
import static FunctionalProgrammingInJavaBook_Chapter_4.Listung_4_2.TailCall.ret;
import static FunctionalProgrammingInJavaBook_Chapter_4.Listung_4_2.TailCall.sus;

public class MemoizationRecursive {

    public static String fibo(int number) {
        List<BigInteger> list = fibo_(list(BigInteger.ZERO), BigInteger.ONE, BigInteger.ZERO, BigInteger.valueOf(number)).eval();
        return makeString(list, ", ");
    }

    private static <T> TailCall<List<BigInteger>> fibo_(List<BigInteger> acc, BigInteger acc1, BigInteger acc2, BigInteger x) {
        return x.equals(BigInteger.ZERO)
                ? ret(acc)
                : x.equals(BigInteger.ONE)
                ? ret(append(acc, acc1.add(acc2)))
                : sus(() -> fibo_(append(acc, acc1.add(acc2)), acc2, acc1.add(acc2), x.subtract(BigInteger.ONE)));
    }

    public static <T> String makeString(List<T> list, String separator) {
        return list.isEmpty()
                ? ""
                : tail(list).isEmpty()
                ? head(list).toString()
                : head(list) + foldLeftSafe(tail(list), "", x -> y -> x + separator + y);
    }
}
