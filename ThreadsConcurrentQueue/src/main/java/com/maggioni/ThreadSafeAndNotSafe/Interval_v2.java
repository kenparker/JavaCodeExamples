package com.maggioni.ThreadSafeAndNotSafe;

import java.util.concurrent.atomic.AtomicReference;

/**
 * http://www.angelikalanger.com/Articles/EffectiveJava/48.JMM-CopyOnWriteArrayList/48.JMM-CopyOnWriteArrayList.html
 *
 * 
 *  Thread Safe
 * 
 * http://stackoverflow.com/questions/3162665/immutable-class
 */

public class Interval_v2
{

   
    private static class IntPair
    {

        private final int lower;
        private final int upper;

        public IntPair(int l, int u)
        {
            lower = l;
            upper = u;
        }
    }

    private final AtomicReference<IntPair> values
            = new AtomicReference<IntPair>(new IntPair(0, 0));

    public void setLower(int i)
    {
        while (true) {
            IntPair oldv = values.get();
            if (i > oldv.upper) {
                throw new IllegalArgumentException(
                        "Can't set lower to " + i + " > upper");
            }
            IntPair newv = new IntPair(i, oldv.upper);
            if (values.compareAndSet(oldv, newv)) {
                return;
            }
        }
    }

    public int getLower()
    {
        return values.get().lower;
    }

    public boolean isInRange(int i)
    {
        IntPair v = values.get();
        return (i >= v.lower && i <= v.upper);
    }
}
