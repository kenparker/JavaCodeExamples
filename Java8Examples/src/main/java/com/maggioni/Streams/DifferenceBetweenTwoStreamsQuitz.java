package com.maggioni.Streams;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class DifferenceBetweenTwoStreamsQuitz {

    public static void main(String[] args) {
        Supplier<Stream<String>> streamSupplier1 = () -> Stream.empty();
        
        Supplier<Stream<String>> streamSupplier2 = () -> Stream.of("one", "two").filter(s -> s.startsWith("a"));
        System.out.println("Stream 1");
        streamSupplier1.get().forEach(System.out::println);
        System.out.println("Stream 1 count :" + streamSupplier1.get().count() );
        
        System.out.println("Stream 2");
        streamSupplier1.get().forEach(System.out::println);
        System.out.println("Stream 2 count :" + streamSupplier2.get().count() );
        System.out.println("equals? " + streamSupplier1.get().equals(streamSupplier1.get()));
        
        
        System.out.println("1 :" +  streamSupplier1.get().toArray());
        System.out.println("2 :" +  streamSupplier1.get().toArray());
    }
}
