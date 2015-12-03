package com.maggioni.CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericDemo3 {

    public static void main(String[] args) {
        ff1(new ArrayList<String>());
        ff5(new ArrayList<String>());
        List<? extends String> ff3a = ff3(new ArrayList<String>());
        //List<String> ff3b = ff3(new ArrayList<String>());  // do not compile
        List<?> ff3c = ff3(new ArrayList<String>()); 
        List<?> ff4a = ff4(new ArrayList<String>()); 
        List<? super String> ff4b = ff4(new ArrayList<String>()); 
        List<? super String> ff4b1 = ff4b1(new ArrayList<String>()); 
        //List<String> ff4c = ff4(new ArrayList<String>());  // do not compile
        ff2b(new ArrayList<String>());
        ff2b(new ArrayList<Object>());
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
    public static <T> List<? extends T> ff3(List<T> input){
        List<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0,t);
        }
        return output;
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
    
}
