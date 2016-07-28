package com.maggioni.Concurrent.CopyOnWrite;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteIteratorDemo1 {

    CopyOnWriteArrayList l = new CopyOnWriteArrayList(Arrays.asList("a","b","zzz","ee"));
    public static void main(String[] args) {
        new CopyOnWriteIteratorDemo1().iteratorDemo();
    }

    /*
    /**
     * Returns an iterator over the elements in this list in proper sequence.
     *
     * <p>The returned iterator provides a snapshot of the state of the list
     * when the iterator was constructed. No synchronization is needed while
     * traversing the iterator. The iterator does <em>NOT</em> support the
     * {@code remove} method.
     *
     * @return an iterator over the elements in this list in proper sequence
     
    public Iterator<E> iterator() {
        return new COWIterator<E>(getArray(), 0);
    }
    */
    void iteratorDemo() {
        Iterator iterator = l.iterator();   // because of the new COWIterator<E>(getArray(), 0);
                                            // the array we are iterating is a copy of the original one
        
        /*
        /**
         * Not supported. Always throws UnsupportedOperationException.
         * @throws UnsupportedOperationException always; {@code remove}
         *         is not supported by this iterator.
        
        public void remove() {
            throw new UnsupportedOperationException();
        }
        */
        iterator.remove();    // this statement is throwing an UnsupportedOperationException()
        
    }
}
