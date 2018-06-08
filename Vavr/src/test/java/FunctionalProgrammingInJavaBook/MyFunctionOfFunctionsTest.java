package FunctionalProgrammingInJavaBook;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MyFunctionOfFunctionsTest {

    static <T extends String> MyFunction<T, String> hello() {
        return new MyFunction<T, String>() {
            @Override
            public String apply(T t) {
                return t.toString();
            }
        };
    }

    static MyFunction<Integer, MyFunction<Integer, String>> baby() {
        return new MyFunction<Integer, MyFunction<Integer, String>>() {
            @Override
            public MyFunction<Integer, String> apply(Integer arg1) {
                return new MyFunction<Integer, String>() {
                    @Override
                    public String apply(Integer arg2) {
                        return arg1.toString() + arg2;
                    }
                };
            }

            ;
        };
    }

    static MyFunction<MyFunction<Integer, String>,
            MyFunction<String, String>> idea() {
        return new MyFunction<MyFunction<Integer, String>, MyFunction<String, String>>() {
            @Override
            public MyFunction<String, String> apply(MyFunction<Integer, String> arg1) {
                return new MyFunction<String, String>() {
                    @Override
                    public String apply(String arg2) {
                        return arg1 + arg2;
                    }
                };
            }
        };
    }

    static MyFunction<MyFunction<Integer, String>,
            MyFunction<String, String>> mango() {
        return arg1 -> arg2 -> arg1 + arg2;
    }

    static MyFunction<MyFunction<Integer,Integer>,
                            MyFunction<MyFunction<Integer,Integer>,
                                            MyFunction<Integer,Integer>>> comisch() {
        return new MyFunction<MyFunction<Integer, Integer>, MyFunction<MyFunction<Integer, Integer>, MyFunction<Integer, Integer>>>() {
            @Override
            public MyFunction<MyFunction<Integer, Integer>, MyFunction<Integer, Integer>> apply(MyFunction<Integer, Integer> arg1) {
                return new MyFunction<MyFunction<Integer, Integer>, MyFunction<Integer, Integer>>() {
                    @Override
                    public MyFunction<Integer, Integer> apply(MyFunction<Integer, Integer> arg2) {
                        return new MyFunction<Integer, Integer>() {
                            @Override
                            public Integer apply(Integer arg3) {
                                return arg1.apply(5) + arg2.apply(6) + arg3;
                            }
                        };
                    }
                };
            }
        };
    }

    static MyFunction<MyFunction<Integer,String>,
                            MyFunction<MyFunction<Integer,Integer>,
                                            MyFunction<Integer,Integer>>> comischLa() {
        return new MyFunction<MyFunction<Integer, String>, MyFunction<MyFunction<Integer, Integer>, MyFunction<Integer, Integer>>>() {
            @Override
            public MyFunction<MyFunction<Integer, Integer>, MyFunction<Integer, Integer>> apply(MyFunction<Integer, String> arg1) {
                return new MyFunction<MyFunction<Integer, Integer>, MyFunction<Integer, Integer>>() {
                    @Override
                    public MyFunction<Integer, Integer> apply(MyFunction<Integer, Integer> arg2) {
                        return new MyFunction<Integer, Integer>() {
                            @Override
                            public Integer apply(Integer arg3) {
                                return  Integer.valueOf(arg1.apply(4)) + arg2.apply(5) + arg3;
                            }
                        };
                    }
                };
            }
        };
    }

    MyFunction<Integer, String> a = integer -> Integer.toString(integer);
    MyFunction<Integer, Integer> b = integer -> integer * 2;

    @Test
    public void given_when_then() {
        String hello = hello().apply("hello");
        assertThat(hello).isEqualToIgnoringCase("Hello");
    }

    @Test
    public void name() {
        Integer result = comischLa().apply(a).apply(b).apply(3);
    }
}
