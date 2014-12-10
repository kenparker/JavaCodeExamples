package com.maggioni.ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * http://stackoverflow.com/questions/12772443/how-to-change-value-of-arraylist-element-in-java
 */
public class ListUpdateExample {

    public static void main(String[] args) {

        List<Foo> fooList = new ArrayList<Foo>();
        for (int i = 0; i < 9; i++) {
            fooList.add(new Foo(i, i));
        }

        // Standard iterator sufficient for altering elements
        Iterator<Foo> iterator = fooList.iterator();

        // change value of the first value in the list
        if (iterator.hasNext()) {
            Foo foo = iterator.next();
            foo.x = 99;
            foo.y = 42;
        }

        printList(fooList);

        // List iterator needed for replacing elements
        ListIterator<Foo> listIterator = fooList.listIterator();

        if (listIterator.hasNext()) {
            // Need to call next, before set.
            listIterator.next();
            // Replace item returned from next()
            listIterator.set(new Foo(99, 99));
        }

        printList(fooList);
    }

    private static void printList(List<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();
    }

    private static class Foo {

        int x;
        int y;

        Foo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("[%d, %d]", x, y);
        }
    }
}
