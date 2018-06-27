package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9;

import org.junit.Test;

import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9.MemoizationRecursive.*;

public class MemoizationRecursiveTest {

    @Test
    public void name() {
        String fibo = fibo(10);
        System.out.println(fibo);
    }
}