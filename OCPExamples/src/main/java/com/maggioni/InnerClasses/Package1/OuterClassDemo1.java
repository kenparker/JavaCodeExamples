package com.maggioni.InnerClasses.Package1;

public class OuterClassDemo1 {

    private String x = "Hello";
    public String y = "Angelo";
    protected String p = "ppp";

    private void call() {
        ProtectedInnerClass ic = new ProtectedInnerClass();
        ic.xFromInner = "Ciao e Ciao";
        ic.yFromInner = ic.yFromInner + "???";
        ic.pri("parameter");
    }

    @Override
    public String toString() {
    return "OuterClass{" + "x=" + x + ", y=" + y + ", p=" + p + '}';
    }
    
    
    protected void proteMemb() {}

    protected class ProtectedInnerClass {
        
        public ProtectedInnerClass() {}

        private String xFromInner = "x From Inner";
        protected String zFromInner = "z from Inner";
        public String yFromInner = "y From Inner";

        void pri(String s) {
            System.out.println("x = " + x + " y = " + y + " s = " + s);
            System.out.println("/xFromInner : " + xFromInner + " /yFromInner : " + yFromInner);
            System.out.println("this                        :"+this);
            System.out.println("OuterClass.this             :"+OuterClassDemo1.this);                // calls toString()
            System.out.println("OuterClass.class            :"+OuterClassDemo1.class);
            System.out.println("OuterClass.super.toString() :"+OuterClassDemo1.super.toString());
        }

        public void priPublic(String d) {
            System.out.println("/xFromInner : " + xFromInner + " /yFromInner :  " + yFromInner + " /zFromInner : " + zFromInner+ " "+d);
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
        new OuterClassDemo1().call();

    }

}
