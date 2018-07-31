package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_11;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;

import java.util.ArrayList;
import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_11.CollectionUtilities.append;

public class Range {

    public static List<Integer> range(Integer start, Integer end) {
        List<Integer> result = new ArrayList<>();
        Integer temp = start;
        while (temp < end) {
            result = append(result, temp);
            temp = temp + 1;
        }
        return result;
    }

    public static List<Integer> rangeGeneric(Integer start, Integer end) {
        return unfold(start, x -> x + 1, x -> x < end);
    }

    public static <T> List<T> unfold(T seed, Function<T, T> f, Function<T, Boolean> p) {
        List<T> result = new ArrayList<>();
        T temp = seed;
        while (p.apply(temp)) {
            result = append(result, temp);
            temp = f.apply(temp);
        }
        return result;
    }
}
