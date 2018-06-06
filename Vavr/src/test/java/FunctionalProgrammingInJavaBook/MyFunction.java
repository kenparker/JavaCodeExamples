package FunctionalProgrammingInJavaBook;


public interface MyFunction<T,U> {
    U apply(T arg);


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
}
