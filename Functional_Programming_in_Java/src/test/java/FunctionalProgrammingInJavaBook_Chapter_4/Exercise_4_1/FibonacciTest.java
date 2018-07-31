package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_1;

import org.junit.Test;

import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_1.Fibonacci.fib;
import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_1.Fibonacci.fibStackSafe;

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