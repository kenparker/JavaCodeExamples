package com.maggioni.InnerClasses.Package1;

public class OuterClass {

    private String x = "Hello";
    public String y = "Angelo";

    private void call() {
        InnerClass ic = new InnerClass();
        ic.xFromInner = "Ciao e Ciao";
        ic.yFromInner = ic.yFromInner + "???";
        ic.pri("parameter");
    }

    class InnerClass {

        private String xFromInner = "Ciao";
        protected String zFromInner = "z from inner";
        public String yFromInner = "come stai?";

        void pri(String s) {
            System.out.println("x = " + x + " y = " + y + " s = " + s);
            System.out.println(" " + xFromInner + " " + yFromInner);
        }

        public void priPublic(String d) {
            System.out.println("" + xFromInner + " " + yFromInner + " " + zFromInner+ " "+d);
        }
    }

    public class PublicInnerClass {
        String d = "d String";
        void dup() {
            System.out.println(""+d);
        }
    }

    public static void main(String[] args) {
        new OuterClass().call();

    }

}
