package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_11;

import org.junit.Test;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_11.Range.*;
import static org.junit.Assert.*;

public class RangeTest {

    List<Integer> range;

    @Test
    public void testRange() {
        range = range(1, 20);
        System.out.println(range);
        range = rangeGeneric(1,20);
        System.out.println(range);
    }

    @Test
    public void testUnfold() {
        range = unfold(1, x -> x + 1, x -> x < 20);
        System.out.println(range);
    }
}