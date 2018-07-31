package FunctionalProgrammingInJavaBook_Chapter_2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class MyFunctionOfFunctionsTest {

    static <T extends String> MyFunction<T, String> myTestFunction1() {
        return new MyFunction<T, String>() {
            @Override
            public String apply(T arg) {
                return arg.toString();
            }
        };
    }

    static MyFunction<Integer, MyFunction<Integer, String>> myTestFunction2() {
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
            MyFunction<String, String>> myTestFunction3() {
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
            MyFunction<String, String>> myTestFunction4() {
        return arg1 -> arg2 -> arg1 + arg2;
    }

    static MyFunction<MyFunction<Integer,Integer>,
                            MyFunction<MyFunction<Integer,Integer>,
                                            MyFunction<Integer,Integer>>> myCompose1() {
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
                                            MyFunction<Integer,Integer>>> myCompose2() {
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

    static <A, B, C> MyFunction<MyFunction<A, C>,
                            MyFunction<MyFunction<B, A>,
                                    MyFunction<B, C>>> myCompose3() {
        return new MyFunction<MyFunction<A, C>, MyFunction<MyFunction<B, A>, MyFunction<B, C>>>() {
            @Override
            public MyFunction<MyFunction<B, A>, MyFunction<B, C>> apply(MyFunction<A, C> arg1) {
                return new MyFunction<MyFunction<B, A>, MyFunction<B, C>>() {
                    @Override
                    public MyFunction<B, C> apply(MyFunction<B, A> arg2) {
                        return new MyFunction<B, C>() {
                            @Override
                            public C apply(B arg3) {
                                A a = arg2.apply(arg3);
                                C c = arg1.apply(a);
                                return c;
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
        String hello = myTestFunction1().apply("hello");
        assertThat(hello).isEqualToIgnoringCase("Hello");
    }

    @Test
    public void name() {
        Integer result = myCompose2().apply(a).apply(b).apply(3);
    }
}
