package com.maggioni.methodreferences;

import java.util.function.Consumer;

public class ConsumerDemo1 {

    public static void main(String[] args) {
        Consumer<String> consumer1 = s-> System.out.println(s);
        consumer1.accept("Hello"); // prints Hello
        
        Consumer<String> consumer2 = System.out::println; // short then before
        consumer2.accept("Hello2");
    }

}
