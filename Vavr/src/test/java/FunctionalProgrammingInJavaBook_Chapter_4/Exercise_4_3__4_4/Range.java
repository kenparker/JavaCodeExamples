package FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_3__4_4;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_4.Listung_4_2.TailCall;

import java.util.ArrayList;
import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_4.Exercise_4_3__4_4.CollectionUtilities.*;
import static FunctionalProgrammingInJavaBook_Chapter_4.Listung_4_2.TailCall.*;


public class Range {

    public static List<Integer> rangeImperative(Integer start, Integer end) {
        List<Integer> result = new ArrayList<>();
        Integer temp = start;
        while (temp < end) {
            result = append(result, temp);
            temp = temp + 1;
        }
        return result;
    }

    public static List<Integer> rangeBase(Integer start, Integer end) {
        return end <= start
                ? list()
                : prepend(start,rangeBase(start+1,end));
    }

    private static List<Integer> rangeTail_(Integer start, Integer end, List<Integer> list) {
        return end <= start
                ? list
                : rangeTail_(start + 1, end, append(list,start));
    }

    private static TailCall<List<Integer>> rangeSafe_(Integer start, Integer end, List<Integer> list) {
        return end <= start
                ? ret(list)
                : sus(() -> rangeSafe_(start + 1, end, append(list,start)));
    }

    public static List<Integer> rangeSafe(Integer start, Integer end){
        return rangeSafe_(start,end,list()).eval();
    }

    public static List<Integer> rangeTail(Integer start, Integer end) {
        return rangeTail_(start,end,list());
    }


    public static List<Integer> rangeGeneric(Integer start, Integer end) {
        return unfoldImperative(start, x -> x + 1, x -> x < end);
    }

    public static <T> List<T> unfoldImperative(T seed, Function<T, T> f, Function<T, Boolean> p) {
        List<T> result = new ArrayList<>();
        T temp = seed;
        while (p.apply(temp)) {
            result = append(result, temp);
            temp = f.apply(temp);
        }
        return result;
    }
}
