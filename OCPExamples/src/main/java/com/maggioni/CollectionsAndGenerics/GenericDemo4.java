package com.maggioni.CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.List;

class Apple {}
class Macintosch extends Apple {
    public static void main(String[] args) {
        List<Apple> a = new ArrayList<>();
        basket1(a);
    }
    
    public static void basket1(List<Apple> list) {
        list.add(new Apple());
    }
    public static void basket2(List<? super Apple> list) {
        list.add(new Apple());
    }
    public static void basket3(List<?> list) {
        list.size();
    }
}
public class GenericDemo4{

    public static void main(String[] args) {
        
    }

}
