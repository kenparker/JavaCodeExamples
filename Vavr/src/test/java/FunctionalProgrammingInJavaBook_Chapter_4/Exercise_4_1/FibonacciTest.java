package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_1;

import org.junit.Test;

import java.math.BigInteger;

import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_1.Fibonacci.*;
import static org.assertj.core.api.Assertions.*;

public class FibonacciTest {

    Integer iter = 100;

    @Test
    public void testFib_Recursive() {

        System.out.println();
        for (int i = 0; i <= iter; i++) {
            System.out.printf(fib(i) + " ");
        }
    }

    @Test
    public void testFib_StackSafe() {
        System.out.println();
        for (int i = 0; i <= iter; i++) {
            System.out.printf(fibStackSafe(i) + " ");
        }
    }
}