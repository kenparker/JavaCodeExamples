package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_1;

import FunctionalProgrammingInJavaBook_Chapter_4.Listung_4_2.TailCall;

import java.math.BigInteger;

import static FunctionalProgrammingInJavaBook_Chapter_4.Listung_4_2.TailCall.ret;
import static FunctionalProgrammingInJavaBook_Chapter_4.Listung_4_2.TailCall.sus;

public class Fibonacci {
    private static BigInteger fib_(BigInteger acc1, BigInteger acc2, BigInteger x) {
        return x.equals(BigInteger.ZERO)
                ? BigInteger.ZERO
                : x.equals(BigInteger.ONE)
                    ? acc1.add(acc2)
                    : fib_(acc2, acc1.add(acc2), x.subtract(BigInteger.ONE));
    }

    private static TailCall<BigInteger> fibStackSafe_(BigInteger acc1, BigInteger acc2, BigInteger x) {
        return x.equals(BigInteger.ZERO)
                ? ret(BigInteger.ZERO)
                : x.equals(BigInteger.ONE)
                    ? ret(acc1.add(acc2))
                    : sus( () -> fibStackSafe_(acc2, acc1.add(acc2), x.subtract(BigInteger.ONE)));
    }

    public static BigInteger fib(Integer x) {
        return fib_(BigInteger.ONE, BigInteger.ZERO, BigInteger.valueOf(x));
    }

    public static BigInteger fibStackSafe(Integer x) {
        return fibStackSafe_(BigInteger.ONE, BigInteger.ZERO, BigInteger.valueOf(x)).eval();
    }
}
