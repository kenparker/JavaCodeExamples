package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_5;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;

import java.util.List;

public class Fold {

    public static Integer fold(List<Integer> list, Integer identity, Function<Integer, Function<Integer, Integer>> f) {
        int result = identity;
        for (Integer i : list) {
            result = f.apply(result).apply(i);
        }
        return result;
    }
}
