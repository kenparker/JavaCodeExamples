package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9;

import org.junit.Test;


import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_9.MemoizationCorecursive.fiboCorecursive;
import static org.junit.Assert.*;

public class MemoizationCorecursiveTest {


    @Test
    public void name() {
        String fibo = fiboCorecursive(10);
        System.out.println(fibo);
    }
}