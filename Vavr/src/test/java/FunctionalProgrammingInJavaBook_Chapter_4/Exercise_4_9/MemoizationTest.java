package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9;

import org.junit.Test;

import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9.Memoization.*;

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
}