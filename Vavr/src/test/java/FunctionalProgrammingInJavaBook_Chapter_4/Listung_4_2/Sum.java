package FunctionalProgrammingInJavaBook_Chapter_4.Listung_4_2;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_9.CollectionUtilities.*;

public class Sum {
    static Integer sum1(List<Integer> list){
        return list.isEmpty()
                ? 0
                : head(list) + sum1(tail(list));
    }

    static Integer sum2(List<Integer> list) {
        return sum_(list,0);
    }

    static Integer sum_(List<Integer> list, Integer acc) {
        return list.isEmpty()
                ? acc
                : sum_(tail(list), acc + head(list));
    }
}
