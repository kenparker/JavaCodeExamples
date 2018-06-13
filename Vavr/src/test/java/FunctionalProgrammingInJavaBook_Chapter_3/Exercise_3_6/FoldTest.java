package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_6;

import FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_5.CollectionUtilities;
import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import org.junit.Test;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_5.CollectionUtilities.*;
import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_6.Fold.*;
import static org.junit.Assert.*;

public class FoldTest {

    String identity = "0";

    private static String addSI(String s, Integer i) {
        return "(" + s + " + " + i + ")";
    }

    private static String addIS( Integer i, String s) {
        return "(" + i + " + " + s + ")";
    }
    private static String addSIs(String s, String i) {
        return "(" + s + " + " + i + ")";
    }

    @Test
    public void testLeftFoldListOfIntegers() {
        List<Integer> list = list(1, 2, 3, 4, 5);
        Function<String, Function<Integer, String>> f = x -> y -> addSI(x, y);
        String result = foldLeft(list, identity, f);
        String expected = "(((((0 + 1) + 2) + 3) + 4) + 5)";
        assertEquals(expected, result);
    }

    @Test
    public void testRightFoldListOfIntegers() {
        List<Integer> list = list(1, 2, 3, 4, 5);
        Function<Integer, Function<String, String>> f = x -> y -> addIS(x, y);
        String result = foldRight(list, identity, f);
        String expected = "(1 + (2 + (3 + (4 + (5 + 0)))))";
        assertEquals(expected, result);
    }

    @Test
    public void testLeftFolderListOfStrings() {
        List<String> list = list("Angelo", "Marco", "Peter");
        Function<String, Function<String, String>> f = x -> y -> addSIs(x, y);
        String result = foldLeft(list, identity, f);
        String expected = "(((0 + Angelo) + Marco) + Peter)";
        assertEquals(expected, result);

    }
}