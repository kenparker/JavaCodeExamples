package com.maggioni.JavaClassDesign;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyClassImplementListDemo1 implements List<Bango>{

    @Override
    public int size() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean contains(Object o) {
        return true;
    }

    @Override
    public Iterator<Bango> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Bango e) {
        return true;
    }

    @Override
    public boolean remove(Object o) {
         return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Bango> c) {
         return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Bango> c) {
         return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
         return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
         return true;
    }

    @Override
    public void clear() {
        System.out.println("");
    }

    @Override
    public Bango get(int index) {
        return new Bango();
    }

    @Override
    public Bango set(int index, Bango element) {
         return element;
    }

    @Override
    public void add(int index, Bango element) {
        System.out.println("");
    }

    @Override
    public Bango remove(int index) {
         return new Bango();
    }

    @Override
    public int indexOf(Object o) {
         return 1;
    }

    @Override
    public int lastIndexOf(Object o) {
         return 1;
    }

    @Override
    public ListIterator<Bango> listIterator() {
         return null;
    }

    @Override
    public ListIterator<Bango> listIterator(int index) {
         return null;
    }

    @Override
    public List<Bango> subList(int fromIndex, int toIndex) {
         return new ArrayList<Bango>();
    }

    
    
}
