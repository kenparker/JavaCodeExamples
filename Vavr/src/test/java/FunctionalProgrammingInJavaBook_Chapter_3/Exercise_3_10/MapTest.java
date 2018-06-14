package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_10;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import org.junit.Test;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_10.CollectionUtilities.*;
import static org.junit.Assert.*;

public class MapTest {


    List<Integer> list = list(10, 34, 2, 8, 1);

    @Test
    public void testMap() {

        List<Integer> integerListLeftFolding = mapWithFoldLeft(list, a -> a * 2);
        System.out.println(integerListLeftFolding);

        List<Integer> integerListRightFolding = mapWithFoldRight(list, a -> a * 2);
        System.out.println(integerListRightFolding);

        assertEquals(integerListLeftFolding, integerListRightFolding);
    }

    @Test
    public void testAdd9PercentAndFixPriceToListOfPrices() {
        Function<Double, Double> add9Percent = x -> x * 1.09;
        Function<Double, Double> addFix = x -> x + 3.50;

        List<Double> prices = list(12.04, 25.2);

        // inefficient
        List<Double> listWith9Percent = mapWithFoldRight(prices, add9Percent);
        System.out.println(listWith9Percent);
        List<Double> listWithFix1 = mapWithFoldRight(listWith9Percent, addFix);
        System.out.println(listWithFix1);

        // better
        List<Double> listWithFix3 = mapWithFoldRight(mapWithFoldLeft(prices, add9Percent), addFix);
        System.out.println(listWithFix3);

        // with Compose
        List<Double> listWithFix2 = mapWithFoldRight(prices, add9Percent.compose(addFix));
        System.out.println(listWithFix2);

        // more natural
        List<Double> listWithFix4 = mapWithFoldRight(prices, add9Percent.andThen(addFix));
        System.out.println(listWithFix4);

    }

    @Test
    public void testSingleStepsOfCalculation() {
        Function<Function<Integer, Integer>, Function<List<Integer>, Function<Integer, List<Integer>>>> function = f1 -> x -> y -> append(x, f1.apply(y));

        Function<Integer, Integer> sum = arg -> arg * 2;

        Function<List<Integer>, Function<Integer, List<Integer>>> f1 = function.apply(sum);

        // first
        Function<Integer, List<Integer>> f2 = f1.apply(list(14));
        List<Integer> integerList = f2.apply(10);

        // second
        f2 = f1.apply(integerList);
        integerList = f2.apply(25);

        System.out.println(integerList);

        List<Integer> integerListExpected = list(14, 20, 50);
        assertEquals(integerListExpected, integerList);
    }
}