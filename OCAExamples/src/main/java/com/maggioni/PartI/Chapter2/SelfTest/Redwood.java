package com.maggioni.PartI.Chapter2.SelfTest;

public class Redwood extends Tree {

    public static void main(String[] args) {
        new Redwood().go();
    }

    void go() {
        go2(new Tree(), new Redwood());           // ClassCastException on line 16
        go2(new Redwood(), new Redwood());        // that's ok
        go2((Redwood) new Tree(), new Redwood()); // ClassCastException here
    }

    void go2(Tree t1, Redwood r1) {
        Redwood r2 = (Redwood) t1; // ClassCastException occour at runtime line 10 and 12
        Tree t2 = (Tree) r2;
    }

}

class Tree {
}
