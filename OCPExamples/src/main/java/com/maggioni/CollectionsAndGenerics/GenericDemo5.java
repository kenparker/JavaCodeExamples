package com.maggioni.CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericDemo5 {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        List<Integer> listInteger = new ArrayList<>();
        list.add("string");
        Collection<String> result1 = ff1(list);
        //Collection<String> result11 = ff1(listInteger); // do not compile
        Collection<String> result2 = ff2(list);
        Collection<? extends CharSequence> result3 = ff3(list);
    }

    private static <E> Collection<E> ff1(List<E> list) {
        Collection<E> lw = new ArrayList<>();
        lw.add(list.get(0));
        return lw;
    }
    private static <E> Collection<E> ff2(Collection<E> list) {
        Collection<E> lw = new ArrayList<>();
        //lw.add(list.get(0));
        return lw;
    }
    private static <E> Collection<?> ff22(Collection<E> list) {
        Collection<E> lw = new ArrayList<>();
        //lw.add(list.get(0));
        return lw;
    }
    private static <E extends CharSequence> Collection<? extends CharSequence> ff3(Collection<E> list) {
        Collection<E> lw = new ArrayList<>();
        //lw.add(list.get(0));
        return lw;
    }
    private static <E extends CharSequence> List<E> ff4(Collection<E> list) {
        Collection<E> lw = new ArrayList<>();
        //lw.add(list.get(0));
        return (List<E>)lw; // without the casting it is not working, Collection<E> cannot be converted to List<E>
    }
    private static <E extends CharSequence> List<E> ff5(ArrayList<E> list) {
        Collection<E> lw = new ArrayList<>();
        //lw.add(list.get(0));
        return (List<E>) lw; // without the casting, it does not compile
    }
    private static <E extends CharSequence> List<E> ff6(ArrayList<E> list) {
        List<E> lw = new ArrayList<>();
        //lw.add(list.get(0));
        return lw;
    }
    private static <E extends CharSequence> List<E> ff7(ArrayList<E> list) {
        ArrayList<E> lw = new ArrayList<>();
        //lw.add(list.get(0));
        return lw;
    }

}
