package com.maggioni.InnerClasses.Package1;

import java.util.Comparator;

public class InnerClassDemo8 {

    public static void main(String[] args) {
        String[] sa = {"nickel","button","key","lint"};
        /*
        Compilation Error: non static variable cannot be used in a static context
        Sorter s = new Sorter();
        */
    }
    class Sorter implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
        
    }

}
