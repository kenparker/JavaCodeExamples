package com.maggioni.InnerClasses.Package1;

public class OuterClass {

    private String x = "Hello";
    public String y = "Angelo";
    protected String p = "ppp";

    private void call() {
        InnerClass ic = new InnerClass();
        ic.xFromInner = "Ciao e Ciao";
        ic.yFromInner = ic.yFromInner + "???";
        ic.pri("parameter");
    }
    
    protected void proteMemb() {}

    protected class InnerClass {
        
        public InnerClass() {}

        private String xFromInner = "Ciao";
        protected String zFromInner = "z from inner";
        public String yFromInner = "come stai?";

        void pri(String s) {
            System.out.println("x = " + x + " y = " + y + " s = " + s);
            System.out.println(" " + xFromInner + " " + yFromInner);
            System.out.println(this);
            System.out.println(OuterClass.this);
            System.out.println(OuterClass.class);
            System.out.println(OuterClass.super.toString());
        }

        public void priPublic(String d) {
            System.out.println("" + xFromInner + " " + yFromInner + " " + zFromInner+ " "+d);
        }
    }

    public class PublicInnerClass {
        String d = "d String";
        protected String protVar = "protected";
        void dup() {
            System.out.println(""+d);
        }
        protected void protInnerClassMember() {}
        public void publicInnerClassMember() {}
        
    }

    public static void main(String[] args) {
        new OuterClass().call();

    }

}
