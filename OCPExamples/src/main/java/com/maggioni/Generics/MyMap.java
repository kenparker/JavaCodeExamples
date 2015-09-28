package com.maggioni.Generics;

public interface MyMap <K, V> {

    void pt(K key, V value);
    // <V> get(K key); do not compile
    V get(K key);   //that's fine

}
