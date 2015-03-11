package com.maggioni.PartI.Chapter2.Examples.xcom;

public class Stuff {
    static int MY_CONSTANT = 5;
    static public int MY_CONSTANT2 = 10;
    static int doStuff(int x) {return (x++)*x;}         // default access
    static public int doStuff2(int x) {return (++x)*x;};// public access
}
