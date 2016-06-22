package com.maggioni.InnerClasses.Package1;

public class AnonymusDemo2 {

    public AnonymusDemo2() {
        System.out.println("AnonymusDemo1 ");
    }

    class Bar {

        public Bar() {
            System.out.println("bar ");
        }

        public void go() {
            System.out.println("hi");
        }
    }

    protected class ProtClass {
        String s = "hallloooo";
        ProtClass() {
            System.out.println("ProtClass");}        
    }

    public static void main(String[] args) {
        AnonymusDemo2 ad = new AnonymusDemo2();
        ad.makeBar();
        
        
    }

    void makeBar() {
        (new Bar() {
        }).go();
        
        ProtClass p = new ProtClass();
        System.out.println(" " +  p.s);
    }

}
