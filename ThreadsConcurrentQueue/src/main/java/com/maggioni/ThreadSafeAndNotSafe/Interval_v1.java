package com.maggioni.ThreadSafeAndNotSafe;

/**
 * NOT Thread Safe
 */
public class Interval_v1
{
// INVARIANT: lower <= upper 

    private volatile int lower = 0;
    private volatile int upper = 0;

    public void setLower(int i)
    {
        if (i > upper) {
            throw new IllegalArgumentException(
                    "can't set lower to " + i + " > upper");
        }
        lower = i;
    }

    public int getLower()
    {
        return lower;
    }

    public boolean isInRange(int i)
    {
        return (i >= lower && i <= upper);
    }
}
