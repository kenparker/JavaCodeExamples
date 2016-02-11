package com.maggioni.CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericDemo3 {

    public static void main(String[] args) {
        ff1(new ArrayList<String>());
        ff5(new ArrayList<String>());
        ff3Test(); 
        //List<? extends Macintosch> ff3g = ff3(new ArrayList<Apple>()); 
        //List<Apple> ff3e = ff3(new ArrayList<Apple>()); 
        ff4Test(); 
        //List<String> ff4c = ff4(new ArrayList<String>());  // do not compile
        ff2b(new ArrayList<String>());
        ff2b(new ArrayList<Object>());
        
        ff6Test();
    }



    public static <T> List<T> ff1(List<T> input){
        List<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0,t);
        }
        return output;
    }
    public static <T> List<T> ff1b(List<T> input, T e){
        List<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0,t);
        }
        
        input.add(e); // works
        
        return output;
    }
    public static <T> List<T> ff2(List<? extends T> input){
        List<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0,t);
        }
        return output;
    }
    public static <T> List<T> ff2b(List<? super T> input){
        List<T> output = new LinkedList<>();
        /*for (T t : input) {
        output.add(0,t);
        }*/
        Object get = input.get(0);
        return output;
    }
    
    private static void ff3Test() {
        List<? extends String> ff3a         = ff3(new ArrayList<String>());
        //List<String> ff3b                 = ff3(new ArrayList<String>());  // do not compile
        List<?> ff3c                        = ff3(new ArrayList<String>());
        List<? extends CharSequence> ff3c1  = ff3(new ArrayList<String>());
        List<? extends Apple> ff3d = ff3(new ArrayList<Apple>());
        List<? extends Fruit> ff3f = ff3(new ArrayList<Apple>());
    }
    public static <T> List<? extends T> ff3(List<T> input){
        List<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0,t);
        }
        return output;
    }
    
    private static void ff4Test() {
        List<?> ff4a                  = ff4(new ArrayList<String>());
        List<? super String> ff4b     = ff4(new ArrayList<String>());
        List<? super Macintosch> ff4c = ff4(new ArrayList<Macintosch>());
        List<? super Apple> ff4d      = ff4(new ArrayList<Apple>());
        List<? super Macintosch> ff4e = ff4(new ArrayList<Apple>());
        List<? super Macintosch> ff4f = ff4(new ArrayList<Fruit>());
        List<? super Macintosch> ff4g = ff4(new ArrayList<Object>());
        List<? super String> ff4b1    = ff4b1(new ArrayList<String>());
    }
    
    public static <T> List<? super T> ff4(List<T> input){
        List<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0,t);
        }
        return output;
    }
    public static <T> List<? super T> ff4b1(List<T> input){
        List output = new LinkedList<>();
        
        return output;
    }
    public static <T> List<?> ff5(List<T> input){
        List<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0,t);
        }
        return output;
    }
    private static void ff6Test() {
        List<? extends Apple> ff6a = ff6(new ArrayList<>());
        List<? extends Apple> ff6b = ff6(new ArrayList<Apple>());
        List<? extends Fruit> ff6c = ff6(new ArrayList<Apple>());
        List<? extends Object> ff6d = ff6(new ArrayList<Apple>());
        //List<? extends Macintosch> ff6e = ff6(new ArrayList<Apple>());
        //List<? extends Apple> ff6f = ff6(new ArrayList<Fruit>());
    }
    public static <T extends Apple> List<? extends Apple> ff6(List<Apple> input){
        List<T> output = new LinkedList<T>();
        for (Apple t : input) {
           // output.add(0,t);
        }
        return output;
    }
    public static List<? extends Apple> ff7(List<Apple> input){
        List<Apple> output = new LinkedList<>();
        for (Apple t : input) {
            output.add(0,t);
        }
        return output;
    }
    
}
