package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_8;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_5.CollectionUtilities.head;
import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_5.CollectionUtilities.tail;

public class Fold {

    public static <T,U> U foldLeft(List<T> list, U identity, Function<U, Function<T, U>> f) {
        U result = identity;
        for (T i : list) {
            result = f.apply(result).apply(i);
        }
        return result;
    }

    public static <T, U> U foldRight(List<T> list, U identity, Function<T, Function<U,U>> f) {
        return list.isEmpty()
                ? identity
                : f.apply(head(list)).apply(foldRight(tail(list),identity,f));
    }
}
