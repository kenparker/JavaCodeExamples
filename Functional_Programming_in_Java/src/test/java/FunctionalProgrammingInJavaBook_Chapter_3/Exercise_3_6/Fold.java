package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_6;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;

import java.util.List;

public class Fold {

    public static <T,U> U foldLeft(List<T> list, U identity, Function<U, Function<T, U>> f) {
        U result = identity;
        for (T i : list) {
            result = f.apply(result).apply(i);
        }
        return result;
    }

    public static <T, U> U foldRight(List<T> list, U identity, Function<T, Function<U,U>> f) {
        U result = identity;
        for (int i = list.size(); i > 0; i--) {
            result = f.apply(list.get(i-1)).apply(result);
        }
        return result;
    }
}
