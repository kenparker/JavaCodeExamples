package com.maggioni.Synchronize;

/**
 *
 * http://jeremymanson.blogspot.de/2007/08/atomicity-visibility-and-ordering.html
 */
class LoopMayNeverEnd {

    volatile boolean done = false;

    void work() {
        while (!done) {
            // do work 
        }
    }

    void stopWork() {
        done = true;
    }
}
