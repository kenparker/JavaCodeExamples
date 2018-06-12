package FunctionalProgrammingInJavaBook_Chapter_2;


public interface MyFunction<T,U> {
    U apply(T arg);

    static <T> MyFunction<T, T> identity() {
        return t -> t;
    }

    static MyFunction<Integer, Integer> composeAnonymus(MyFunction<Integer, Integer> f1, MyFunction<Integer, Integer> f2) {
        return new MyFunction<Integer, Integer>() {
            @Override
            public Integer apply(Integer arg) {
                return f1.apply(f2.apply(arg));
            }
        };
    }

    static MyFunction<Integer, Integer> composeLambdas(MyFunction<Integer, Integer> f1, MyFunction<Integer, Integer> f2) {
        return  arg -> f1.apply(f2.apply(arg));
    }


    static <T, U, V> MyFunction<MyFunction<T, U>,
            MyFunction<MyFunction<V, T>,
                    MyFunction<V, U>>> higherCompose() {
        return f -> g -> x -> f.apply(g.apply(x));
    }

    static <T, U, V> MyFunction<MyFunction<T, U>,
            MyFunction<MyFunction<U, V>,
                    MyFunction<T, V>>> higherAndThen() {
        return f -> g -> x -> g.apply(f.apply(x));
    }
}
